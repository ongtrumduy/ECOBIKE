package main;

import javax.swing.JPanel;

import bike.UserBikeHireController;

public class ECoUserController {
	
	public JPanel getBookPage() {
		UserBikeHireController controller = new UserBikeHireController();
		return controller.getDataPagePane();
	}
}
