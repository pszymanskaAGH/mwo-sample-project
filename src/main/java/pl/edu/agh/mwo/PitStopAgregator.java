package pl.edu.agh.mwo;

import java.util.List;

public class PitStopAgregator {

    private final List<PitstopData> pitstopDataList;
    private final Calculation calculation;

    public PitStopAgregator(String json){
        pitstopDataList = MapperToPitstopData.mapperToPitstopData(json);
        calculation = new Calculation();
    }

    public List<PitstopData> getPitstopDataList() {
        return pitstopDataList;
    }

    public String countPitStops() {
        return calculation.countPitStops(pitstopDataList);
    }

    public String getTheLongestPitStopWithDriverNumber() {
        return calculation.getTheLongestPitStopWithDriverNumber(pitstopDataList);
    }


}
