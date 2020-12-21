package com.oms.db;

import java.util.ArrayList;

import com.oms.bean.BikeInfor;
import com.oms.db.seed.Seed;

public class JsonBikeInforDatabase implements IBikeInforDatabase {
	private static IBikeInforDatabase singleton = new JsonBikeInforDatabase();

	private ArrayList<BikeInfor> bikes = Seed.singleton().getBikeInfors();

	private JsonBikeInforDatabase() {
	}

	public static IBikeInforDatabase singleton() {
		return singleton;
	}

	@Override
	public ArrayList<BikeInfor> searchBikeInfor(BikeInfor bike) {
		ArrayList<BikeInfor> res = new ArrayList<BikeInfor>();
		for (BikeInfor b : bikes) {
			if (b.match(bike)) {
				res.add(b);
			}
		}
		return res;
	}

	@Override
	public BikeInfor addBikeInfor(BikeInfor bike) {
		for (BikeInfor m : bikes) {
			if (m.equals(bike)) {
				return null;
			}
		}

		bikes.add(bike);
		return bike;
	}

	@Override
	public BikeInfor updateBikeInfor(BikeInfor bike) {
		for (BikeInfor m : bikes) {
			if (m.equals(bike)) {
				bikes.remove(m);
				bikes.add(bike);
				return bike;
			}
		}
		return null;
	}

//	@Override
//	public ArrayList<Order> searchOrder(Order order) {
//		ArrayList<Order> res = new ArrayList<Order>();
//		for (Order o: orders) {
//			if (o.search(order)) {
//				res.add(o);
//			}
//		}
//		return res;
//	}

}
