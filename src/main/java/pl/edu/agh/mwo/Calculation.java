package pl.edu.agh.mwo;

import java.util.List;

public class Calculation {

    public String countPitStops(List<PitstopData> pitstopDataList) {
        int numberOfPitStops = 0;
        double pitStopDuration = 0;

        for (PitstopData pitstopData : pitstopDataList) {
            numberOfPitStops++;
            pitStopDuration += pitstopData.getPitDuration();
        }

        return "Liczba pit stopów: " + numberOfPitStops + ". Czas trwania: " + pitStopDuration + " sekund.";
    }

    public String getTheLongestPitStopWithDriverNumber(List<PitstopData> pitstopDataList) {
        double pitStopDuration = 0;
        int driverNumber = 0;

        for (PitstopData pitstopData : pitstopDataList) {
            if (pitstopData.getPitDuration() > pitStopDuration) {
                pitStopDuration = pitstopData.getPitDuration();
                driverNumber = pitstopData.getDriverNumber();
            }
        }

        return "Czas trwania najdluzszego pitstopu: " + pitStopDuration + ". Numer kierowcy " + driverNumber;
    }

    public String getFirstPitStop(List<PitstopData> pitstopDataList) {
        return "Pierwszy pitStop: " + pitstopDataList.getFirst();
    }

    public String getLastPitStop(List<PitstopData> pitstopDataList) {
        return "Pierwszy pitStop: " + pitstopDataList.getLast();
    }
}
