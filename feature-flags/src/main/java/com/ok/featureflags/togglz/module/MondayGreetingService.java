package com.ok.featureflags.togglz.module;

public class MondayGreetingService implements GreetingService {

    public static final String MONDAY_GOOD_MORNING = "Monday good morning";
    public static final String MONDAY_GOOD_AFTERNOON = "Monday good afternoon";

    @Override
    public String goodMorning() {
        return MONDAY_GOOD_MORNING;
    }

    @Override
    public String goodAfternoon() {
        return MONDAY_GOOD_AFTERNOON;
    }
}
