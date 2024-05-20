package net.gecko95.oresmod.world.biome.surface;

import com.google.common.collect.ImmutableList;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

import static net.minecraft.world.gen.surfacebuilder.MaterialRules.STONE_DEPTH_FLOOR;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule COBBLESTONE = makeStateRule(Blocks.COBBLESTONE);
    private static final MaterialRules.MaterialRule WHITE_SAND = makeStateRule(ModBlocks.WHITE_SAND);
    private static final MaterialRules.MaterialRule WHITE_SANDSTONE = makeStateRule(ModBlocks.WHITE_SANDSTONE);
    private static final MaterialRules.MaterialRule BLACK_SAND = makeStateRule(ModBlocks.BLACK_SAND);
    private static final MaterialRules.MaterialRule BLACK_SANDSTONE = makeStateRule(ModBlocks.BLACK_SANDSTONE);
    private static final MaterialRules.MaterialRule DEEPSLATE = makeStateRule(Blocks.DEEPSLATE);
    private static final MaterialRules.MaterialRule BEDROCK = makeStateRule(Blocks.BEDROCK);
    public static MaterialRules.MaterialRule createModSurfaceRule() {
        return ModMaterialRules.makeRules(true, false, true);
    }
    public static MaterialRules.MaterialRule makeRules(boolean surface, boolean bedrockRoof, boolean bedrockFloor) {
        MaterialRules.MaterialRule whitesand = MaterialRules.sequence(MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, WHITE_SANDSTONE), WHITE_SAND);
        MaterialRules.MaterialRule blacksand = MaterialRules.sequence(MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, BLACK_SANDSTONE), BLACK_SAND);
        MaterialRules.MaterialCondition whitedunes = MaterialRules.biome(ModBiomes.WHITE_DUNES_BIOME);
        MaterialRules.MaterialCondition blacksandbeach = MaterialRules.biome(ModBiomes.BLACK_SAND_BEACH);
        MaterialRules.MaterialRule biomeFloor = MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.QUARRY_BIOME),
                MaterialRules.condition(ModMaterialRules.surfaceNoiseThreshold(2.0), COBBLESTONE)),
                MaterialRules.condition(blacksandbeach, blacksand),
                MaterialRules.condition(whitedunes, whitesand));
        MaterialRules.MaterialRule deepslateConnector = MaterialRules.sequence(MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR,
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH, biomeFloor),
                        MaterialRules.condition(whitedunes, MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6, WHITE_SANDSTONE)))),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH, biomeFloor),
                MaterialRules.condition(blacksandbeach, MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6, BLACK_SANDSTONE)));

        ImmutableList.Builder builder = ImmutableList.builder();
        if (bedrockRoof) {
            builder.add(MaterialRules.condition(MaterialRules.not(MaterialRules.verticalGradient("bedrock_roof", YOffset.belowTop(5), YOffset.getTop())), BEDROCK));
        }
        if (bedrockFloor) {
            builder.add(MaterialRules.condition(MaterialRules.verticalGradient("bedrock_floor", YOffset.getBottom(), YOffset.aboveBottom(5)), BEDROCK));
        }
        MaterialRules.MaterialRule deepslate = MaterialRules.condition(MaterialRules.surface(), deepslateConnector);
        builder.add(surface ? deepslate : deepslateConnector);
        builder.add(MaterialRules.condition(MaterialRules.verticalGradient("deepslate", YOffset.fixed(0), YOffset.fixed(8)), DEEPSLATE));
        return MaterialRules.sequence((MaterialRules.MaterialRule[])builder.build().toArray(MaterialRules.MaterialRule[]::new));

    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
    private static MaterialRules.MaterialCondition surfaceNoiseThreshold(double min) {
        return MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, min / 8.25, Double.MAX_VALUE);
    }
}
