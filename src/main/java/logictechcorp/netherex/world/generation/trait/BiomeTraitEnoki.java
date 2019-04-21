/*
 * NetherEx
 * Copyright (c) 2016-2019 by LogicTechCorp
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package logictechcorp.netherex.world.generation.trait;

import logictechcorp.libraryex.world.generation.trait.impl.BiomeTrait;
import logictechcorp.libraryex.world.generation.trait.impl.BiomeTraitConfigurable;
import logictechcorp.netherex.block.BlockEnokiMushroomCap;
import logictechcorp.netherex.init.NetherExBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BiomeTraitEnoki extends BiomeTraitConfigurable
{
    public BiomeTraitEnoki(int generationAttempts, boolean randomizeGenerationAttempts, double generationProbability, int minimumGenerationHeight, int maximumGenerationHeight)
    {
        super(generationAttempts, randomizeGenerationAttempts, generationProbability, minimumGenerationHeight, maximumGenerationHeight);
    }

    private BiomeTraitEnoki(Builder builder)
    {
        super(builder);
    }

    @Override
    public boolean generate(World world, BlockPos pos, Random random)
    {
        if(world.isAirBlock(pos.down()) && NetherExBlocks.ENOKI_MUSHROOM_CAP.canSurvive(world, pos) && random.nextInt(8) == 7)
        {
            BlockEnokiMushroomCap.generatePlant(world, pos, random, 8);
            return true;
        }

        return false;
    }

    public static class Builder extends BiomeTrait.Builder
    {
        public Builder()
        {
            super();
        }

        @Override
        public BiomeTrait create()
        {
            return new BiomeTraitEnoki(this);
        }
    }

}