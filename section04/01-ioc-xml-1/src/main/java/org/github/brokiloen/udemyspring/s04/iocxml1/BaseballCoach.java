package org.github.brokiloen.udemyspring.s04.iocxml1;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}
