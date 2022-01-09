package mcjty.lostcities.worldgen;

import mcjty.lostcities.config.LostCityProfile;
import mcjty.lostcities.worldgen.lost.cityassets.WorldStyle;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;

import java.util.Random;

public interface IDimensionInfo {
    void setWorld(WorldGenLevel world);

    long getSeed();

    WorldGenLevel getWorld();

    ResourceKey<Level> getType();

    LostCityProfile getProfile();

    LostCityProfile getOutsideProfile();

    WorldStyle getWorldStyle();

    Random getRandom();

    LostCityTerrainFeature getFeature();

    ChunkHeightmap getHeightmap(int chunkX, int chunkZ);

//    Biome[] getBiomes(int chunkX, int chunkZ);

    Biome getBiome(BlockPos pos);
}
