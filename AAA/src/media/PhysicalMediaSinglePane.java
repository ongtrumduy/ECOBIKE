package media;

import javax.swing.JLabel;

import com.oms.bean.Media;
import com.oms.bean.PhysicalMedia;

@SuppressWarnings("serial")
public class PhysicalMediaSinglePane extends MediaSinglePane{
//	private JLabel labelBarcode;
//	private JLabel labelDescription;
//	private JLabel labelQuantity;
//	private JLabel labelWeight;
//	private JLabel labelDimension;
//	
//	public PhysicalMediaSinglePane() {
//		super();
//	}
//	
//	public PhysicalMediaSinglePane(Media media) {
//		this();
//		this.t = media;
//		
//		displayData();
//	}
//	
//	@Override
//	public void buildControls() {
//		super.buildControls();
//
//		int row = getLastRowIndex();
//		c.gridx = 0;
//		c.gridy = row;
//		labelBarcode = new JLabel();
//		add(labelBarcode, c);
//		
//		row = getLastRowIndex();
//		c.gridx = 0;
//		c.gridy = row;
//		labelDescription = new JLabel();
//		add(labelDescription, c);
//		
//		row = getLastRowIndex();
//		c.gridx = 0;
//		c.gridy = row;
//		labelQuantity = new JLabel();
//		add(labelQuantity, c);
//		
//		row = getLastRowIndex();
//		c.gridx = 0;
//		c.gridy = row;
//		labelWeight = new JLabel();
//		add(labelWeight, c);
//		
//		row = getLastRowIndex();
//		c.gridx = 0;
//		c.gridy = row;
//		labelDimension = new JLabel();
//		add(labelDimension, c);
//	}
//	
//	@Override
//	public void displayData() {
//		super.displayData();
//		
//		if (t instanceof PhysicalMedia) {
//			PhysicalMedia pMedia = (PhysicalMedia) t;
//			
//			labelBarcode.setText("DuyPH-Barcode: " + pMedia.getBarcode());
//			labelDescription.setText("DuyPH-Description: " + pMedia.getDescription());
//			labelQuantity.setText("DuyPH-Quantity: " + pMedia.getQuantity());
//			labelWeight.setText("DuyPH-Weight: " + pMedia.getWeight());
//			labelDimension.setText("DuyPH-Dimension: " + pMedia.getDimension());
//		}
//	}
}
