package media;

import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JTextField;

import abstractdata.ADataSearchPane;

@SuppressWarnings("serial")
public class MediaSearchPane extends ADataSearchPane {
	private JTextField idBikeField;
//	private JTextField categoryField;

	public MediaSearchPane() {
		super();
	}
	
	@Override
	public void buildControls() {
		JLabel idBikeLabel = new JLabel("NHẬP ID CỦA XE   ");
		idBikeField = new JTextField(15);
		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		add(idBikeLabel, c);
		c.gridx = 1;
		c.gridy = row;
		add(idBikeField, c);
		
//		
//		JLabel categoryLabel = new JLabel("DuyPH-Category");
//		categoryField = new JTextField(15);
//		row = getLastRowIndex();
//		c.gridx = 0;
//		c.gridy = row;
//		add(categoryLabel, c);
//		c.gridx = 1;
//		c.gridy = row;
//		add(categoryField, c);
	}

	@Override
	public Map<String, String> getQueryParams() {
		Map<String, String> res = super.getQueryParams();
		
		if (!idBikeField.getText().trim().equals("")) {
			res.put("title", idBikeField.getText().trim());
		}
//		if (!categoryField.getText().trim().equals("")) {
//			res.put("category", categoryField.getText().trim());
//		}
		
		return res;
	}
}