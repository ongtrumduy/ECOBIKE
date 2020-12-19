package media;

import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class BookSearchPane extends PhysicalMediaSearchPane {
//	private JTextField publisherField;
//	private JTextField languageField;
//
//	public BookSearchPane() {
//		super();
//	}
//
//	@Override
//	public void buildControls() {
//		super.buildControls();
//
//		JLabel publisherLabel = new JLabel("DuyPH-Publisher");
//		JLabel languageLabel = new JLabel("DuyPH-Language");
//		publisherField = new JTextField(15);
//		languageField = new JTextField(15);
//		int rowPulisher = getLastRowIndex();
//		c.gridx = 0;
//		c.gridy = rowPulisher;
//		add(publisherLabel, c);
//		c.gridx = 1;
//		c.gridy = rowPulisher;
//		add(publisherField, c);
//
//		int rowLanguage = getLastRowIndex();
//		c.gridx = 0;
//		c.gridy = rowLanguage;
//		add(languageLabel, c);
//		c.gridx = 1;
//		c.gridy = rowLanguage;
//		add(languageField, c);
//	}
//
//	@Override
//	public Map<String, String> getQueryParams() {
//		Map<String, String> res = super.getQueryParams();
//
//		if (!publisherField.getText().trim().equals("")) {
//			res.put("publisher", publisherField.getText().trim());
//		}
//		
//		if (!languageField.getText().trim().equals("")) {
//			res.put("language", languageField.getText().trim());
//		}
//
//		return res;
//	}
}
