package ljdp.minechem.client.render.item;

import ljdp.minechem.client.ModelPrinter;
import ljdp.minechem.common.utils.ConstantValue;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

public class ItemBlueprintPrinterRenderer extends ItemMinechemRenderer {

    private ModelPrinter model;

    public ItemBlueprintPrinterRenderer() {
        model = new ModelPrinter();
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        ResourceLocation texture = new ResourceLocation(ConstantValue.MOD_ID,ConstantValue.PRINTER_MODEL);
        GL11.glPushMatrix();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, FMLClientHandler.instance().getClient().renderEngine.func_110581_b(texture).func_110552_b());
        switch(type.ordinal()){
case 0: {
        	
        	
        }
        case 1: {
        	
        	GL11.glRotatef(2.0F, 0F, 0.0F, 0.0F);
        	GL11.glTranslatef(0F, -0.5F, 0.5F);
        }
        case 2: {
        	GL11.glTranslatef(0.0F, 0.5F, 0.0F);
        	GL11.glRotatef(-4.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(2.0F, 1.0F, 0.0F, 0.0F);
            GL11.glScalef(1F, 1F, 1F);
        	        }
        case 3: {
        	GL11.glTranslatef(0.0F, 1.0F, 0.0F);
            GL11.glRotatef(180f, 0f, 0f, 1f);
        }
        
        }
        model.render(0.0625F);
        GL11.glPopMatrix();
    }

}
