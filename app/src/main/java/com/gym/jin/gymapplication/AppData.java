package com.gym.jin.gymapplication;

/**
 * Created by Jin on 3/29/2018.
 */

public interface AppData {
    public static final String SQUAT_REPEAT_TIME_LABEL = "Repeat Time:";
    public static final int SQUAT_REPEAT_TIME_LABEL_POSITION = 0;

    public static final int SQUAT_REPEAT_TIME_DEFAULT = 5;
    public static final int SQUAT_REPEAT_TIME_POSITION = 1;


    public static final String SQUAT_COUNT_LABEL = "Count:";
    public static final int SQUAT_COUNT_LABEL_POSITION = 2;

    public static final int SQUAT_COUNT_DEFAULT = 10;
    public static final int SQUAT_COUNT_POSITION = 3;

    public static final String SQUAT_WEIGHT_LABEL = "Weight:";
    public static final int SQUAT_WEIGHT_LABEL_POSITION = 4;

    public static final int SQUAT_WEIGHT_DEFAULT = 150;
    public static final int SQUAT_WEIGHT_POSITION = 5;

    public static final String SQUAT_INTERVAL_TIME_LABEL = "interval Time:";
    public static final int SQUAT_INTERVAL_TIME_LABEL_POSITION = 6;

    public static final int SQUAT_INTERVAL_TIME_DEFAULT = 30;
    public static final int SQUAT_INTERVAL_TIME_POSITION = 7;

    public static final String SQUAT_SPEED_LABEL = "Speed:";
    public static final int SQUAT_SPEED_LABEL_POSITION = 8;

    public static final int SQUAT_SPEED_DEFAULT = 5;
    public static final int SQUAT_SPEED_POSITION = 9;


    public static final String[] SQUAT_PARAMS = { SQUAT_REPEAT_TIME_LABEL,new Integer(SQUAT_REPEAT_TIME_DEFAULT).toString(),
            SQUAT_COUNT_LABEL,new Integer(SQUAT_COUNT_DEFAULT).toString(),
            SQUAT_WEIGHT_LABEL,new Integer(SQUAT_WEIGHT_DEFAULT).toString(),
            SQUAT_INTERVAL_TIME_LABEL, new Integer(SQUAT_INTERVAL_TIME_DEFAULT).toString(),
            SQUAT_SPEED_LABEL , new Integer(SQUAT_SPEED_DEFAULT).toString()};
}
