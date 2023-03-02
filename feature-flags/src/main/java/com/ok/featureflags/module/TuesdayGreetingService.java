package com.ok.featureflags.module;

public class TuesdayGreetingService implements GreetingService {

    public static final String TUESDAY_GOOD_MORNING = "Tuesday good morning";
    public static final String TUESDAY_GOOD_AFTERNOON = "Tuesday good afternoon";

    @Override
    public String goodMorning() {
        return TUESDAY_GOOD_MORNING;
    }

    @Override
    public String goodAfternoon() {
        return TUESDAY_GOOD_AFTERNOON;
    }
}
