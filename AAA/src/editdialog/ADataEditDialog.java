package editdialog;

import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import abstractdata.IDataManageController;

@SuppressWarnings("serial")
public abstract class ADataEditDialog<T> extends JDialog {
	protected T t;
	protected GridBagLayout layout;
	protected GridBagConstraints c = new GridBagConstraints();

	public ADataEditDialog(T t, IDataManageController<T> controller) {
		super((Frame) null, "Nhập mã", true);

		this.t = t;

		setContentPane(new JPanel());
		layout = new GridBagLayout();
		getContentPane().setLayout(layout);

		this.buildControls();

		JButton saveButton = new JButton("XÁC NHẬN");
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				T newT = getNewData();
//				controller.update(newT);
//				ADataEditDialog.this.dispose();
				new CheckCardDialog();
			}
		});

		c.gridx = 1;
		c.gridy = getLastRowIndex();
		getContentPane().add(saveButton, c);

		this.pack();
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public ADataEditDialog(IDataManageController<T> controller) {
		
	}


	protected int getLastRowIndex() {
		layout.layoutContainer(getContentPane());
		int[][] dim = layout.getLayoutDimensions();
		int rows = dim[1].length;
		return rows;
	}

	public abstract void buildControls();
	
	public Map<String, String> getQueryParams() {
		Map<String, String> res = new HashMap<String, String>();
		return res;
	}

	public abstract T getNewData();
}
