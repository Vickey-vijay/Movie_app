package com.applovin.impl;

import com.google.android.material.datepicker.UtcDates;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SimpleDateFormat f7684a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f7684a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
    }

    public static synchronized String a(long j10) {
        return f7684a.format(new Date(j10));
    }
}
