package com.skid.main;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LinhaBezier extends Canvas implements Runnable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ExecutorService es;
	private boolean running;
	
	
	public LinhaBezier(){
		es = Executors.newFixedThreadPool(1);
	}

	@Override
	public void run() {
		while(running){
			System.out.println("OK!>>>>");
			render();
		}
		
	}
	
	protected void startApp(){
		setRunning(true);
		es.execute(this);
	}
	
	protected void stopApp(){
		setRunning(false);
		es.shutdown();
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
	
	private void render(){
		BufferStrategy bs = getBufferStrategy();
		if (bs==null){
			createBufferStrategy(2);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		////////////////////////////////////
		
		
		////////////////////////////////////
		g.dispose();
		bs.show();
	}

}
