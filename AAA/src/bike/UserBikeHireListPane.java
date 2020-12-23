package bike;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import com.oms.bean.ReceiveBikeInfor;
import abstractdata.ADataListPane;
import abstractdata.ADataPageController;
import abstractdata.ADataSinglePane;

@SuppressWarnings("serial")
public class UserBikeHireListPane extends ADataListPane<ReceiveBikeInfor>{
	
	public UserBikeHireListPane(ADataPageController<ReceiveBikeInfor> controller) {
		this.controller = controller;
	}
	

	@Override
	public void decorateSinglePane(ADataSinglePane<ReceiveBikeInfor> singlePane) {
		
		JButton button = new JButton("Xác nhận Thuê xe");
		singlePane.addDataHandlingComponent(button);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				if (controller instanceof UserBikeHirePageController) {
//					controller.createBookEditDialog((Book)singlePane.getData());
//				}
			}
		});
	}
}
