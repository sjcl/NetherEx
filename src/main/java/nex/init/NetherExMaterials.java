/*
 * NetherEx
 * Copyright (c) 2016-2018 by MineEx
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

package nex.init;

import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import nex.NetherEx;

public class NetherExMaterials
{
    public static final Item.ToolMaterial GOLDEN_WITHER_BONE = EnumHelper.addToolMaterial(NetherEx.MOD_ID + ":golden_wither_bone", 0, 512, 12.0F, 2.0F, 22).setRepairItem(new ItemStack(Items.GOLD_INGOT));

    public static final ItemArmor.ArmorMaterial WITHER_BONE = EnumHelper.addArmorMaterial(NetherEx.MOD_ID + ":wither_bone", NetherEx.MOD_ID + ":wither_bone", 8, new int[]{2, 3, 4, 2}, 16, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F).setRepairItem(new ItemStack(NetherExItems.WITHER_BONE));
    public static final ItemArmor.ArmorMaterial SALAMANDER_HIDE = EnumHelper.addArmorMaterial(NetherEx.MOD_ID + ":salamander_hide", NetherEx.MOD_ID + ":salamander_hide", 10, new int[]{2, 4, 5, 2}, 21, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.0F).setRepairItem(new ItemStack(NetherExItems.SALAMANDER_HIDE, 1, OreDictionary.WILDCARD_VALUE));
}
