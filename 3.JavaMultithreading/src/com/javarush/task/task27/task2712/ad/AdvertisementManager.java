package com.javarush.task.task27.task2712.ad;

import com.javarush.task.task27.task2712.ConsoleHelper;

public class AdvertisementManager {
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();
    private int timeSeconds;
    private long amountPerOneDisplaying;

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public AdvertisementManager(long amountPerOneDisplaying) {
        this.amountPerOneDisplaying = amountPerOneDisplaying;
    }

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() {
        ConsoleHelper.writeMessage("calling processVideos method");
    }

}
