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
	float shiftX = buckyPosX + 320;
	float shiftY = buckyPosY + 160;
	
	
	public Play(int play) {
		
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		worldMap = new Image ("res/world.png");
		Image[] walkUp = {new Image("res/buckysBack.png"), new Image("res/buckysBack.png")};
		Image[] walkDown = {new Image("res/buckysFront.png"), new Image("res/buckysFront.png")};
		Image[] walkLeft = {new Image("res/buckysLeft.png"), new Image("res/buckysLeft.png")};
		Image[] walkRight = {new Image("res/buckysRight.png"), new Image("res/buckysRight.png")};
		
		movingUp = new Animation(walkUp, duration,false);
		movingDown = new Animation(walkDown, duration,false);
		movingLeft = new Animation(walkLeft, duration,false);
		movingRight = new Animation(walkRight, duration,false);
		bucky = movingDown;
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		worldMap.draw(buckyPosX,buckyPosY);
		bucky.draw(shiftX, shiftY);
		g.drawString("Bucky's X:" + buckyPosX + "\nBucky's Y:" + buckyPosY, 400, 200);
		
		if(quit==true){
			g.drawString("Resume (R)", 250, 100);
			g.drawString("Main Menu (M)", 250, 150);
			g.drawString("Quit Game (Q)", 250, 200);
			if(quit==false){
				g.clear();
			}
		}
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		Input input = gc.getInput();
		//up
		if(input.isKeyDown(Input.KEY_UP)){
			bucky= movingUp;
			buckyPosY = buckyPosY + delta * .1f;
			if(buckyPosY>162){
				buckyPosY = buckyPosY - delta * .1f;
			}
		}
		//down
		if(input.isKeyDown(Input.KEY_DOWN)){
			bucky= movingDown;
			buckyPosY = buckyPosY - delta * .1f;
			if(buckyPosY<-600){
				buckyPosY = buckyPosY + delta * .1f;
			}
		}
		//left
		if(input.isKeyDown(Input.KEY_LEFT)){
			bucky= movingLeft;
			buckyPosX = buckyPosX + delta * .1f;
			if(buckyPosX>324){
				buckyPosY = buckyPosY - delta * .1f;
			}
		}
		//right
		if(input.isKeyDown(Input.KEY_RIGHT)){
			bucky= movingRight;
			buckyPosX = buckyPosX - delta * .1f;
			if(buckyPosX<-840){
				buckyPosY = buckyPosY + delta * .1f;
			}
		}
		
		//escape
		if(input.isKeyDown(Input.KEY_ESCAPE)){
			quit = true;
		}
		
		//when menu is up
		if(quit==true){
			if(input.isKeyDown(Input.KEY_R)){
					quit = false;
			}
			if(input.isKeyDown(Input.KEY_M)){
				sbg.enterState(0);
			}
			if(input.isKeyDown(Input.KEY_Q)){
				System.exit(0);
			}
		}
	}

	@Override
	public int getID() {
		return 1;
	}

	
}
