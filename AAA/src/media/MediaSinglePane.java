package media;

import javax.swing.JLabel;

import com.oms.bean.Media;

import abstractdata.ADataSinglePane;

@SuppressWarnings("serial")
public class MediaSinglePane extends ADataSinglePane<Media>{
	private JLabel labelIdBike;
	private JLabel labelTypeBike;
	private JLabel labelCostBike;
	
	public MediaSinglePane() {
		super();
	}
		
	
	public MediaSinglePane(Media media) {
		this();
		this.t = media;
		
		displayData();
	}

	@Override
	public void buildControls() {
		super.buildControls();
		
		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelIdBike = new JLabel();
		add(labelIdBike, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelTypeBike = new JLabel();
		add(labelTypeBike, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelCostBike = new JLabel();
		add(labelCostBike, c);
	}
	
	
	@Override
	public void displayData() {
		labelIdBike.setText("ID Xe: " + t.getTitle());
		labelTypeBike.setText("Loại Xe: " + t.getCategory());
		labelCostBike.setText("Giá Cọc: " + t.getCost() + " đồng");
	}
}
