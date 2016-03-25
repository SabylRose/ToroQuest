package net.torocraft.fishing.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Worms extends Item {
	
	public static String NAME = "worms";

	public Worms() {
		this(64, CreativeTabs.tabMisc, NAME);
	}
	
	public Worms(int maxStackSize, CreativeTabs tab, String name) {
		setMaxStackSize(maxStackSize);
		setCreativeTab(tab);
		setUnlocalizedName(name);
	}
	
	@Override
	public int getItemEnchantability() {
		return 10;
	}
	
	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
		return true;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn,
			World worldIn, EntityPlayer playerIn, EnumHand hand) {
		System.out.println(itemStackIn.getUnlocalizedName());
		if (itemStackIn.getUnlocalizedName().equals("")) {
			
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
	}
}