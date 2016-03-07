package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {

	Animation bucky, movingUp, movingDown, movingLeft, movingRight;
	Image worldMap;
	boolean quit = false;
	
	int[] duration = {200,200};
	float buckyPosX = 0;
	float buckyPosY = 0;
	float shiftX = buckyPosX + 360;
	
	
	public Play(int play) {
		
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID() {
		return 1;
	}

	
}
