package com.gym.jin.gymapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jin on 3/25/2018.
 */

public class SquatParams implements Parcelable {
    private int repeat;
    private int count;
    private int weight;
    private int intervalTime;
    private int speed;

    public SquatParams() {
        this.repeat = AppData.SQUAT_REPEAT_TIME_DEFAULT;
        this.count = AppData.SQUAT_COUNT_DEFAULT;
        this.weight = AppData.SQUAT_WEIGHT_DEFAULT;
        this.intervalTime = AppData.SQUAT_INTERVAL_TIME_DEFAULT;
        this.speed = AppData.SQUAT_SPEED_DEFAULT;
    }

    public SquatParams(int repeat, int count, int weight, int intervalTime, int speed) {
        this.repeat = repeat;
        this.count = count;
        this.weight = weight;
        this.intervalTime = intervalTime;
        this.speed = speed;
    }

    public static final Parcelable.Creator<SquatParams> CREATOR = new Parcelable.Creator<SquatParams>() {
        public SquatParams createFromParcel(Parcel in) {
            return new SquatParams(in);
        }

        public SquatParams[] newArray(int size) {
            return new SquatParams[size];
        }
    };

    private SquatParams(Parcel in) {
        repeat = in.readInt();
        count = in.readInt();
        weight = in.readInt();
        intervalTime =in.readInt();
        speed = in.readInt();
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(repeat);
        out.writeInt(count);
        out.writeInt(weight);
        out.writeInt(intervalTime);
        out.writeInt(speed);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(int intervalTime) {
        this.intervalTime = intervalTime;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }
}
