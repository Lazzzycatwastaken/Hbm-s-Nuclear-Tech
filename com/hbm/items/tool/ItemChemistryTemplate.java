package com.hbm.items.tool;

import java.util.List;

import com.hbm.handler.FluidTypeHandler.FluidType;
import com.hbm.inventory.FluidStack;
import com.hbm.inventory.MachineRecipes;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemChemistryTemplate extends Item {
	
	public enum EnumChemistryTemplate {
		
		TEST;
		
		public static EnumChemistryTemplate getEnum(int i) {
			return EnumChemistryTemplate.values()[i];
		}
		
		public String getName() {
			return this.toString();
		}
	}

    public ItemChemistryTemplate()
    {
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    @Override
	public String getUnlocalizedName(ItemStack stack)
    {
        int i = stack.getItemDamage();
        return super.getUnlocalizedName() + "." + EnumChemistryTemplate.getEnum(i).getName();
    }

    @Override
	@SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tabs, List list)
    {
        for (int i = 0; i < EnumChemistryTemplate.values().length; ++i)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }
    
    public static int getProcessTime(ItemStack stack) {
    	
    	if(!(stack.getItem() instanceof ItemChemistryTemplate))
    		return 100;
    	
        int i = stack.getItemDamage();
        EnumChemistryTemplate enum1 = EnumChemistryTemplate.getEnum(i);
        
        switch (enum1) {
        case TEST:
        	return 200;
        default:
        	return 100;
        }
    }
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool)
	{
    	
    	if(!(stack.getItem() instanceof ItemChemistryTemplate))
    		return;

    	List<ItemStack> stacks = MachineRecipes.getChemInputFromTempate(stack);
    	FluidStack[] inF = MachineRecipes.getFluidInputFromTempate(stack);
    	ItemStack[] out = MachineRecipes.getChemOutputFromTempate(stack);
    	FluidStack[] outF = MachineRecipes.getFluidOutputFromTempate(stack);

    	//try {
    		list.add("Outputs:");
    		for(int i = 0; i < 4; i++)
    			if(out[i] != null)
    				list.add(out[i].stackSize + "x " + out[i].getDisplayName());
    		
    		for(int i = 0; i < 2; i++)
    			if(outF[i] != null)
    				list.add(outF[i].fill + "mB " + I18n.format(outF[i].type.getUnlocalizedName()));
    		
    		list.add("Inputs:");
    		
    		for(int i = 0; i < stacks.size(); i++)
				list.add(stacks.get(i).stackSize + "x " + stacks.get(i).getDisplayName());
    		
    		for(int i = 0; i < 2; i++)
    			if(inF[i] != null)
    				list.add(inF[i].fill + "mB " + I18n.format(inF[i].type.getUnlocalizedName()));
    		
    		list.add("Production time:");
        	list.add(Math.floor((float)(getProcessTime(stack)) / 20 * 100) / 100 + " seconds");
    	//} catch(Exception e) {
    	//	list.add("###INVALID###");
    	//	list.add("0x334077-0x6A298F-0xDF3795-0x334077");
    	//}
	}

}
