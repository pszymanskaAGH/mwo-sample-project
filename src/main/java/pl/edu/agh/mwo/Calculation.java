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

        return "Liczba pit stopów: " + numberOfPitStops + ". Czas trwania: " + pitStopDuration + "sekund.";
    }
}
