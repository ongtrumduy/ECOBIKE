package bike;

import javax.swing.JLabel;

import com.oms.bean.Media;

import abstractdata.ADataSinglePane;

@SuppressWarnings("serial")
public class BikeHireSinglePane extends ADataSinglePane<Media>{
	private JLabel labelIdBike;
	private JLabel labelTypeBike;
	private JLabel labelCostBike;
	private JLabel labelPositionBike;
	
	public BikeHireSinglePane() {
		super();
	}
		
	
	public BikeHireSinglePane(Media media) {
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
		
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelCostBike = new JLabel();
		add(labelPositionBike, c);
	}
	
	
	@Override
	public void displayData() {
		labelIdBike.setText("ID Xe: " + t.getIdBike());
		labelTypeBike.setText("Loại Xe: " + t.getTypeBike());
		labelCostBike.setText("Giá Cọc: " + t.getCostBike() + " đồng");
		labelPositionBike.setText("Vị trí Bãi Xe: " + t.getPositionBike() + " đồng");

	}
}
