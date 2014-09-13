package main;

import java.awt.*;
import java.util.LinkedList;

public class Character {
	public int positionX;
	public int positionY;

	int currentFrame;

	LinkedList<Image> walkRightAnimation;
	LinkedList<Image> walkLeftAnimation;
	Image idle;

	public Image currentImage;
	boolean walkingRight;
	boolean walkingLeft;
	boolean stay;

	public void initImages() {
		walkRightAnimation = new LinkedList<>();
		walkLeftAnimation = new LinkedList<>();

		for (int i = 1; i <= 3; i++) {
			walkRightAnimation.add(Utils.loadImage("res/walkRight" + i
					+ ".png"));
			walkLeftAnimation.add(Utils.loadImage("res/walkLeft" + i
					+ ".png"));
		}
		idle = Utils.loadImage("res/idle.png");
	}

	public void update() {
		if (stay == true) {
			currentImage = idle;
		}
	}

	public Character() {
		initImages();
		positionX = 0;
		positionX = 0;
		walkingLeft = walkingRight = false;
		stay = true;
		currentFrame = 0;
		currentImage = idle;
	}
}
