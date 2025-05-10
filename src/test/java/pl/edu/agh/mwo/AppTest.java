package pl.edu.agh.mwo;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void checkAmountOfPitStops()
    {
        List<PitstopData> pitstopDataList = new ArrayList<>();
        pitstopDataList.add(new PitstopData(11, 12,"2014",1123, 21,2));
        pitstopDataList.add(new PitstopData(11, 12,"2014",1123, 22,2));
        pitstopDataList.add(new PitstopData(11, 12,"2014",1123, 23,2));

        Calculation calculation = new Calculation();
        calculation.countPitStops(pitstopDataList);

        Assert.assertEquals("Liczba pit stopów: 3. Czas trwania: 66.0 sekund.", calculation.countPitStops(pitstopDataList));
    }

    @Test
    public void checkTheLongestPitStopWithDriverNumber()
    {
        List<PitstopData> pitstopDataList = new ArrayList<>();
        pitstopDataList.add(new PitstopData(11, 12,"2014",1123, 21,2));
        pitstopDataList.add(new PitstopData(11, 12,"2014",1123, 22,2));
        pitstopDataList.add(new PitstopData(11, 12,"2014",1123, 23,2));

        Calculation calculation = new Calculation();
        calculation.getTheLongestPitStopWithDriverNumber(pitstopDataList);

        Assert.assertEquals("Czas trwania najdluzszego pitstopu: 23.0. Numer kierowcy 1123", calculation.getTheLongestPitStopWithDriverNumber(pitstopDataList));
    }
}
