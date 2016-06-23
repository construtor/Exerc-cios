package com.skid.main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Main extends JFrame{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	private LinhaBezier linha;
	
	public Main(){
		super("Exercícios");
		linha = new LinhaBezier();
		setSize(WIDTH,HEIGHT);
		setResizable(false);
		add(linha);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent ev){
				linha.stopApp();
				System.exit(1);
			}
		});
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Main app = new Main();
		app.linha.startApp();

	}

}
