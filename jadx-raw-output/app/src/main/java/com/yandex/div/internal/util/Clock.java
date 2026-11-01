package com.yandex.div.internal.util;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public class Clock {

    @NonNull
    private static Clock sDefault = new Clock();

    @NonNull
    public static Clock get() {
        return sDefault;
    }

    public long getCurrentTimeMs() {
        return System.currentTimeMillis();
    }
}
