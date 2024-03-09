package cscd210classes;

public class Clock {

    private int hour;
    private int minute;
    private int second;

    // Default constructor (no arguments) - sets time to 00:00:00
    public Clock() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    // Constructor with arguments for hour, minute, and second
    public Clock(int hour, int minute, int second) {
        // Validate and set values (implementation provided below)
        setHour(hour);
        setMinutes(minute);
        setSecond(second);
    }

    // Set hour value (with validation)
    public void setHour(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour cannot be negative");
        }
        // Handle hour overflow (implementation provided below)
        this.hour = hour % 24; // Ensures hour stays within 0-23
    }

    // Set minute value (with validation)
    public void setMinutes(int minute) {
        if (minute < 0) {
            throw new IllegalArgumentException("Minute cannot be negative");
        }
        // Ensure minutes stay within 0-59 range
        this.minute = minute % 60;

        // Increment hour if minutes rolled over from 59 to 0
        if (this.minute == 0 && minute > 0) {
            this.hour = (this.hour + 1) % 24;
        }
    }

    // Set second value (with validation) - you can add similar logic as above
    public void setSecond(int second) {
        if (second < 0) {
            throw new IllegalArgumentException("Second cannot be negative");
        }
        // Implement logic to handle second overflow (e.g., set to 0 if > 59)
        this.second = second;
    }

    // Get current hour value
    public int getHour() {
        return hour;
    }

    // Get current minute value
    public int getMinutes() {
        return minute;
    }

    // Get current second value
    public int getSeconds() {
        return second;
    }

    // Override toString() method for displaying time in HH:MM:SS format
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}