package view;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class RunPaint extends JFrame {
	private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel; 

	public RunPaint() {
	controlPanel = new Paint();
	 headerLabel = new JLabel("",JLabel.CENTER );
     statusLabel = new JLabel("",JLabel.CENTER);        
     statusLabel.setSize(350,100);
		add(headerLabel);
		add(controlPanel);
		add(statusLabel);
		setTitle("My Paint");
		setSize(400, 400);
		setLayout(new GridLayout(3, 1));
		//Create the menu bar.
//		menuBar = new JMenuBar();

		//Build the first menu.
		final JMenuBar menuBar = new JMenuBar();

	      //create menus
	      JMenu fileMenu = new JMenu("File");
	      JMenu editMenu = new JMenu("Edit"); 
	      final JMenu aboutMenu = new JMenu("About");
	      final JMenu linkMenu = new JMenu("Links");
	      
	    //create menu items
	      JMenuItem newMenuItem = new JMenuItem("New");
	      newMenuItem.setMnemonic(KeyEvent.VK_N);
	      newMenuItem.setActionCommand("New");

	      JMenuItem openMenuItem = new JMenuItem("Open");
	      openMenuItem.setActionCommand("Open");

	      JMenuItem saveMenuItem = new JMenuItem("Save");
	      saveMenuItem.setActionCommand("Save");

	      JMenuItem exitMenuItem = new JMenuItem("Exit");
	      exitMenuItem.setActionCommand("Exit");

	      JMenuItem cutMenuItem = new JMenuItem("Cut");
	      cutMenuItem.setActionCommand("Cut");

	      JMenuItem copyMenuItem = new JMenuItem("Copy");
	      copyMenuItem.setActionCommand("Copy");

	      JMenuItem pasteMenuItem = new JMenuItem("Paste");
	      pasteMenuItem.setActionCommand("Paste");
	      
	      
	      MenuItemListener menuItemListener = new MenuItemListener();
	      
	      newMenuItem.addActionListener(menuItemListener);
	      openMenuItem.addActionListener(menuItemListener);
	      saveMenuItem.addActionListener(menuItemListener);
	      exitMenuItem.addActionListener(menuItemListener);
	      cutMenuItem.addActionListener(menuItemListener);
	      copyMenuItem.addActionListener(menuItemListener);
	      pasteMenuItem.addActionListener(menuItemListener);
	      
	      
	      fileMenu.add(newMenuItem);
	      fileMenu.add(openMenuItem);
	      fileMenu.add(saveMenuItem);
	      fileMenu.addSeparator();
	      fileMenu.addSeparator();
	      fileMenu.addSeparator();
	      fileMenu.add(exitMenuItem);     
	      
	      
	      editMenu.add(cutMenuItem);
	      editMenu.add(copyMenuItem);
	      editMenu.add(pasteMenuItem);

	      //add menu to menubar
	      menuBar.add(fileMenu);
	      menuBar.add(editMenu);
	      menuBar.add(aboutMenu);       
	      menuBar.add(linkMenu);

	      setJMenuBar(menuBar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
public static void main(String[] args) {
	new RunPaint();
}
}
