package pl.edu.agh.mwo;

import java.time.LocalDateTime;

public class PitstopData {

    private final long sessionKey;
    private final long meetingKey;
    private final LocalDateTime date;
    private final int driverNumber;
    private final double pitDuration;
    private final int lapNumber;

    public PitstopData(long sessionKey, long meetingKey, LocalDateTime date, int driverNumber,
                       double pitDuration, int lapNumber) {
        this.sessionKey = sessionKey;
        this.meetingKey = meetingKey;
        this.date = date;
        this.driverNumber = driverNumber;
        this.pitDuration = pitDuration;
        this.lapNumber = lapNumber;
    }

    public long getSessionKey() {
        return sessionKey;
    }

    public long getMeetingKey() {
        return meetingKey;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getDriverNumber() {
        return driverNumber;
    }

    public double getPitDuration() {
        return pitDuration;
    }

    public int getLapNumber() {
        return lapNumber;
    }
}
