package net.gecko95.oresmod.util;

import net.gecko95.oresmod.OresMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> DRILL_MINEABLE =
                createTag("drill_mineable");
        public static final TagKey<Block> CHAINSAW_MINEABLE =
                createTag("chainsaw_mineable");
        public static final TagKey<Block> MULTI_TOOL_MINEABLE =
                createTag("multi_tool_mineable");

        public static final TagKey<Block> STONEBARK_PLACEABLE =
                createTag("stonebark_placeable");
        public static final TagKey<Block> DEEPBARK_PLACEABLE =
                createTag("deepbark_placeable");
        public static final TagKey<Block> POTION_TANKS =
                createTag("potion_tanks");
        public static final TagKey<Block> MANDIBLE_MINEABLE =
                createTag("mandible_mineable");

        public static final TagKey<Block> ITE_BLOCKS =
                createTag("ite_blocks");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(OresMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TERRACOTTA_HELMETS =
                createTag("terracotta_helmets");
        public static final TagKey<Item> TERRACOTTA_CHESTPLATES =
                createTag("terracotta_chestplates");
        public static final TagKey<Item> TERRACOTTA_LEGGINGS =
                createTag("terracotta_leggings");
        public static final TagKey<Item> TERRACOTTA_BOOTS =
                createTag("terracotta_boots");
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(OresMod.MOD_ID, name));
        }
    }
}
