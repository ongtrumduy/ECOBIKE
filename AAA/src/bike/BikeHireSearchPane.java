package bike;

import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JTextField;

import abstractdata.ADataSearchPane;

@SuppressWarnings("serial")
public class BikeHireSearchPane extends ADataSearchPane {
	private JTextField idBikeField;

	public BikeHireSearchPane() {
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

	}

	@Override
	public Map<String, String> getQueryParams() {
		Map<String, String> res = super.getQueryParams();

		if (!idBikeField.getText().trim().equals("")) {
			res.put("title", idBikeField.getText().trim());
		}

		return res;
	}
}
