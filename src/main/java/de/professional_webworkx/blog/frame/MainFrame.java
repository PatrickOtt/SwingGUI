package de.professional_webworkx.blog.frame;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class MainFrame extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4364887116143344704L;

	private JMenuItem exitAppItem;

	public MainFrame() {
		this.setTitle("JMenuItem Demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(initializeMenuBar());
		
		this.setSize(new Dimension(1024, 768));
		this.setVisible(true);
	}

	private JMenuBar initializeMenuBar() {
		// create a new JMenuBar object
		JMenuBar bar 	= new JMenuBar();
		
		// create a new JMenu 
		JMenu fileMenu = new JMenu("File");
		// add the fileMenu object to out bar
		bar.add(fileMenu);

		// create the JMenuItem
		exitAppItem		= new JMenuItem("Exit Application");
		// we add the ActionListener and handle it in the below written actionPerformed Method
		exitAppItem.addActionListener(this);
		
		// add the Accelerator Key
		// we want to exit our app with holding down CTRL + X
		exitAppItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		
		// add the JMenuItem to out JMenu fileMenu
		fileMenu.add(exitAppItem);
		
		// return the JMenuBar
		return bar;
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(exitAppItem)) {
			int retVal = JOptionPane.showConfirmDialog(getParent(), "Exit this realy nice application?");
			if(retVal == JOptionPane.YES_OPTION) {
				// the User clicked on yes - exit
				System.exit(0);
			}
		}
		
	}
}
