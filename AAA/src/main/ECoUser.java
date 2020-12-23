package main;

import java.awt.BorderLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class ECoUser extends JFrame {

	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 550;
	
	public ECoUser(ECoUserController controller) {
		JPanel rootPanel = new JPanel();
		setContentPane(rootPanel);
		BorderLayout layout = new BorderLayout();
		rootPanel.setLayout(layout);
		
		JTabbedPane tabbedPane = new JTabbedPane();
		rootPanel.add(tabbedPane, BorderLayout.CENTER);
		
		
		JPanel bookPage = controller.getBookPage();
		tabbedPane.addTab("THUÊ XE", null, bookPage, "THUÊ XE");
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hệ thống Thuê Xe EcoBike - Pham Huy Duy - 20173074");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setVisible(true);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ECoUser(new ECoUserController());
			}
		});
	}
}