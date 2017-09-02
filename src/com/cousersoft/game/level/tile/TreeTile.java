package com.cousersoft.game.level.tile;

import com.cousersoft.game.graphics.Screen;
import com.cousersoft.game.graphics.Sprite;

public class TreeTile extends Tile{
	
	public TreeTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x * 16, y * 16, this);
	}

}
