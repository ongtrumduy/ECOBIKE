package editdialog;

import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.oms.bean.ReceiveBikeInfor;

import abstractdata.IDataManageController;

@SuppressWarnings("serial")
public class MediaEditDialog extends ADataEditDialog<ReceiveBikeInfor> {

	private JTextField titleField;
	private JTextField categoryField;
	private JTextField costField;

	public MediaEditDialog(ReceiveBikeInfor media, IDataManageController<ReceiveBikeInfor> controller) {
		super(media, controller);
	}

	@Override
	public void buildControls() {
		int row = getLastRowIndex();
		JLabel titleLabel = new JLabel("NHẬP MÃ THẺ NGÂN HÀNG   ");
		c.gridx = 0;
		c.gridy = row;
		getContentPane().add(titleLabel, c);
		titleField = new JTextField(15);
//		titleField.setText(t.getTitle());
		c.gridx = 1;
		c.gridy = row;
		getContentPane().add(titleField, c);

	}
	
	public Map<String, String> getQueryParams() {
		Map<String, String> res = super.getQueryParams();
		
		if (!titleField.getText().trim().equals("")) {
			res.put("title", titleField.getText().trim());
		}
		return res;
	}

	@Override
	public ReceiveBikeInfor getNewData() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Media getNewData() {
//		t.setTitle(titleField.getText());
//		t.setCategory(categoryField.getText());
//		t.setCost(Float.parseFloat(costField.getText()));

//		return t;
//	}
}
