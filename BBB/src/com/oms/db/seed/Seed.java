package com.oms.db.seed;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oms.bean.BikeInfor;

public class Seed {
	private ArrayList<BikeInfor> bikes;

	private static Seed singleton = new Seed();

	private Seed() {
		start();
	}

	public static Seed singleton() {
		return singleton;
	}

	private void start() {
		bikes = new ArrayList<BikeInfor>();
		bikes.addAll(generateDataFromFile(new File(getClass().getResource("./bikeinfors.json").getPath()).toString()));

	}

	private ArrayList<? extends BikeInfor> generateDataFromFile(String filePath) {
		ArrayList<? extends BikeInfor> res = new ArrayList<BikeInfor>();
		ObjectMapper mapper = new ObjectMapper();

		String json = FileReader.read(filePath);
		try {
			mapper.setDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
			res = mapper.readValue(json, new TypeReference<ArrayList<BikeInfor>>() {
			});
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Invalid JSON input data from " + filePath);
		}

		return res;
	}

	public ArrayList<BikeInfor> getBikeInfors() {
		return bikes;
	}

	public static void main(String[] args) {
		Seed seed = new Seed();
		seed.start();
	}
}
