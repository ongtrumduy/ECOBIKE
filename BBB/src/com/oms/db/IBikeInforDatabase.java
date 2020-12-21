package com.oms.db;

import java.util.ArrayList;

import com.oms.bean.BikeInfor;

public interface IBikeInforDatabase {
	public ArrayList<BikeInfor> searchBikeInfor(BikeInfor bike);

	public BikeInfor updateBikeInfor(BikeInfor bike);

	public BikeInfor addBikeInfor(BikeInfor bike);

//	public ArrayList<BikeInfor> searchBikeInfor(BikeInfor bike);
}
