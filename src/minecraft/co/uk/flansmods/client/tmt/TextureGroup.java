package co.uk.flansmods.client.tmt;

import java.util.ArrayList;
import net.minecraft.src.*;

public class TextureGroup
{
	public TextureGroup()
	{
		poly = new ArrayList<TexturedQuad>();
		texture = "";
	}
	
	public void addPoly(TexturedQuad quad)
	{
		poly.add(quad);
	}

	public void loadTexture()
	{
		loadTexture(-1);
	}
	
	public void loadTexture(int defaultTexture)
	{
		if(!texture.equals(""))
		{
			RenderEngine renderengine = RenderManager.instance.renderEngine;
	        renderengine.bindTexture(renderengine.getTexture(texture));
		}
		else if(defaultTexture > -1)
		{
			RenderManager.instance.renderEngine.bindTexture(defaultTexture);
		}
	}
	
	public ArrayList<TexturedQuad> poly;
	public String texture;
}
