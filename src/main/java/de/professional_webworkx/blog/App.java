package de.professional_webworkx.blog;

import javax.swing.SwingUtilities;

import de.professional_webworkx.blog.frame.MainFrame;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // start the app
    	SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				new MainFrame();
			}
		});
    }
}
