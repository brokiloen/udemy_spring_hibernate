package org.github.brokiloen.udemyspring.s04.iocxml1;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 5km!";
    }
}
