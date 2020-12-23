package com.oms.service;

import java.util.ArrayList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.oms.bean.BikeInfor;
import com.oms.db.IBikeInforDatabase;
import com.oms.db.JsonBikeInforDatabase;

@Path("/bikeinfor")
public class BikeInforService {

	private IBikeInforDatabase bikeInforDatabase;

	public BikeInforService() {
		bikeInforDatabase = JsonBikeInforDatabase.singleton();
	}

	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<BikeInfor> getBikeInfor(@QueryParam("idBike") String idBike, @QueryParam("typeBike") String typeBike,
			@QueryParam("costBike") String costBike, @QueryParam("positionBike") String positionBike) {
		BikeInfor bike = new BikeInfor(idBike, typeBike, costBike,positionBike);
		bike.setIdBike(idBike);
		bike.setTypeBike(typeBike);
		bike.setCostBike(costBike);
		bike.setPositionBike(positionBike);
		ArrayList<BikeInfor> res = bikeInforDatabase.searchBikeInfor(bike);
//		if (bikeInforDatabase.searchBikeById(bike).size() > 0)
//			res.add(bikeInforDatabase.searchBikeById(bike).get(0));
		return res;
	}

	@POST
	@Path("/{idBike}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public BikeInfor updateBike(@PathParam("idBike") String idBike, BikeInfor bike) {
		return bikeInforDatabase.updateBikeInfor(bike);
	}
}