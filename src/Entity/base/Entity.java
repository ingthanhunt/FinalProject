package entity.base;

import logic.Direction;

public abstract class Entity {
	
	private int x;
	
	private Direction direction;
	
	public Entity() {
		direction = Direction.NONE;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public boolean move(Direction dir) {
		int targetx = x;
		
		direction = dir; //Update move position

		switch(dir) {
		case LEFT:
			targetx -= 1;
			break;
		case RIGHT:
			targetx += 1;
			break;
		default:
			break;
		}
		
		/* check is it possible to move
		 * if(GameController.getCurrentMap().isMovePossible(targetx, targety,this)) {
			GameController.getCurrentMap().removeEntity(x,y);
			GameController.getCurrentMap().addEntity(this, targetx, targety);
			return true;
		}else {
			return false;
		}
		*/
		return true;
	}
}
