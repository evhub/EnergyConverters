package net.xalcon.energyconverters.common.blocks;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.xalcon.energyconverters.common.tiles.TileEntityConsumerFe;

public class BlockConsumerFe extends BlockBase implements ITileEntityProvider
{
	public final static String INTERNAL_NAME = "energy_consumer_fe";

	public BlockConsumerFe()
	{
		super(Material.IRON, INTERNAL_NAME);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityConsumerFe();
	}
}
