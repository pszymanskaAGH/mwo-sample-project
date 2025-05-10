package pl.edu.agh.mwo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PitstopData {

    @JsonProperty("session_key")
    private long sessionKey;
    @JsonProperty("meeting_key")
    private long meetingKey;
    private String date;
    @JsonProperty("driver_number")
    private int driverNumber;
    @JsonProperty("pit_duration")
    private double pitDuration;
    @JsonProperty("lap_number")
    private int lapNumber;

    public PitstopData() {
    }

    public PitstopData(long sessionKey, long meetingKey, String date, int driverNumber,
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

    public String getDate() {
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

    @Override
    public String toString() {
        return "PitstopData{" +
                "\nsessionKey=" + sessionKey +
                ",\nmeetingKey=" + meetingKey +
                ",\ndate='" + date + '\'' +
                ",\ndriverNumber=" + driverNumber +
                ",\npitDuration=" + pitDuration +
                ",\nlapNumber=" + lapNumber + "\n" +
                '}' + "\n";
    }
}
