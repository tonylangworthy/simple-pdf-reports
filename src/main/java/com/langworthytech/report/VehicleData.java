package com.langworthytech.report;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleData {

    private List<VehicleModel> getVehicleModelList() {
        BufferedReader reader = loadFile();
        return reader.lines().map(this::parseLine).map(this::mapToModel).toList();
    }

    private BufferedReader loadFile() {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("mock_data.csv");
        InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
        return new BufferedReader(streamReader);
    }

    private String[] parseLine(String line) {
        return line.split(",");
    }

    private VehicleModel mapToModel(String[] vehicleData) {
        return new VehicleModel(vehicleData[0], vehicleData[1], vehicleData[2], vehicleData[3], vehicleData[4],
                vehicleData[5]);
    }

    public List<VehicleModel> vehicleList() {
        List<VehicleModel> list = getVehicleModelList();
        return list;
    }



}
