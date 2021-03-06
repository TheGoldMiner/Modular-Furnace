package modularfurnace.blocks;

import modularfurnace.ModularFurnace;
import modularfurnace.client.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockLavaCore extends Block
{
    public BlockLavaCore(int par1, Material par2Material) {
        super(par1, par2Material);
		
		setUnlocalizedName("blockLavaCore");
		setHardness(5f);
		setCreativeTab(ModularFurnace.tabModularFurnace);
		setLightValue(1F);
		
	}
	
	   @Override
	    public void registerIcons(IconRegister iconRegister)
	    {
	        blockIcon = iconRegister.registerIcon("lava_flow");
	    }
	   
		@Override
		public boolean renderAsNormalBlock()
		{
			return false;
		}

		@Override
		public boolean isOpaqueCube()
		{
			return false;
		}
		@Override
		public int getRenderType()
		{
			return ClientProxy.dummyRenderType;
		}

		@Override
		public boolean canRenderInPass(int pass)
		{
			//Set the static var in the client proxy
			ClientProxy.renderPass = pass;
			//the block can render in both passes, so return true always
			return true;
		}
		@Override
		public int getRenderBlockPass()
		{
			return 1;
		}
}