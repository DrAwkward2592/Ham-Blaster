package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{
	
	public Menu(int state){
		
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString("Are you ready for blast some ham?", 50, 50);
		g.drawRect(50, 100, 60, 120);
		g.drawOval(200, 130, 130, 80);
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
		
	}

	@Override
	public int getID() {
		return 0;
	}

}
