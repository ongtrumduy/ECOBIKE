package editdialog;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CheckCardDialog extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CheckCardDialog dialog = new CheckCardDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CheckCardDialog() {
		setTitle("Th\u00F4ng tin Th\u1EBB");
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("M\u00C3 S\u1ED0 TH\u1EBA NG\u00C2N H\u00C0NG");
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				new MediaEditDialog();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(175, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(170))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(51)
					.addComponent(lblNewLabel)
					.addContainerGap(337, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(27)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(59))
		);
		getContentPane().setLayout(groupLayout);
	}
}
