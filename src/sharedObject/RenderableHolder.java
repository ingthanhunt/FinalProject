package sharedObject;

import java.util.Comparator;
import java.util.List;

import entity.*;

import java.util.ArrayList;
import java.util.Collections;

import javafx.scene.image.Image;



public class RenderableHolder {
	
	private static final RenderableHolder instance = new RenderableHolder();
	private List<IRenderable> entities;
	private Comparator<IRenderable> comparator;
	public static Image basicBait;
	public static Image goodBait;
	public static Image superBait;
	public static Image boat;
	public static Image background;
	
	static {
		loadResource();
	}
	
	public RenderableHolder() {
		entities = new ArrayList<IRenderable>();
		comparator = (IRenderable o1, IRenderable o2) -> {
			if(o1.getZ() > o2.getZ())
				return 1;
			return -1;
		};
	}
	
	public static RenderableHolder getInstance() {
		return instance;
	}
	
	public static void loadResource() {
		basicBait = new Image(ClassLoader.getSystemResource("BasicBait.png").toString());
		goodBait = new Image(ClassLoader.getSystemResource("GoodBait.png").toString());
		superBait = new Image(ClassLoader.getSystemResource("SuperBait.png").toString());
		boat = new Image(ClassLoader.getSystemResource("Boat.png").toString());
		background = new Image(ClassLoader.getSystemResource("background.png").toString());
	}
	
	public void add(IRenderable entity) {
		System.out.println("add");
		entities.add(entity);
		Collections.sort(entities, comparator);
		for(IRenderable x: entities){
			if(x instanceof Fish) System.out.println("fish");
			if(x instanceof Bait) System.out.println("bait");
			if(x instanceof Boat) System.out.println("boat");
		}
	}
	
	public void update() {
		for (int i = entities.size() - 1; i >= 0; i--) {
			if (entities.get(i).isDestroyed())
				entities.remove(i);
		}
	}

	public List<IRenderable> getEntities() {
		return entities;
	}
}
