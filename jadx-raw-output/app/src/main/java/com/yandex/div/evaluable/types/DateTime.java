package com.yandex.div.evaluable.types;

import bk.a;
import ck.i;
import ck.p;
import com.google.android.material.datepicker.UtcDates;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import lk.a0;
import mj.g;

/* JADX INFO: compiled from: DateTime.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DateTime implements Comparable<DateTime> {
    public static final Companion Companion = new Companion(null);
    private static final SimpleTimeZone utcTimezone = new SimpleTimeZone(0, UtcDates.UTC);
    private final g calendar$delegate;
    private final long timestampMillis;
    private final long timestampUtc;
    private final TimeZone timezone;
    private final int timezoneMinutes;

    /* JADX INFO: compiled from: DateTime.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final String formatDate$div_evaluable(Calendar calendar) {
            p.j(calendar, "c");
            return String.valueOf(calendar.get(1)) + '-' + a0.w0(String.valueOf(calendar.get(2) + 1), 2, '0') + '-' + a0.w0(String.valueOf(calendar.get(5)), 2, '0') + ' ' + a0.w0(String.valueOf(calendar.get(11)), 2, '0') + ':' + a0.w0(String.valueOf(calendar.get(12)), 2, '0') + ':' + a0.w0(String.valueOf(calendar.get(13)), 2, '0');
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateTime) && this.timestampUtc == ((DateTime) obj).timestampUtc;
    }

    public DateTime(long j10, TimeZone timeZone) {
        p.j(timeZone, "timezone");
        this.timestampMillis = j10;
        this.timezone = timeZone;
        this.calendar$delegate = b.b(LazyThreadSafetyMode.NONE, new a<Calendar>() { // from class: com.yandex.div.evaluable.types.DateTime$calendar$2
            {
                super(0);
            }

            @Override // bk.a
            public final Calendar invoke() {
                Calendar calendar = Calendar.getInstance(DateTime.utcTimezone);
                calendar.setTimeInMillis(this.this$0.getTimestampMillis$div_evaluable());
                return calendar;
            }
        });
        int rawOffset = timeZone.getRawOffset() / 60;
        this.timezoneMinutes = rawOffset;
        this.timestampUtc = j10 - ((long) (rawOffset * 60000));
    }

    private final Calendar getCalendar() {
        return (Calendar) this.calendar$delegate.getValue();
    }

    @Override // java.lang.Comparable
    public int compareTo(DateTime dateTime) {
        p.j(dateTime, "other");
        return p.m(this.timestampUtc, dateTime.timestampUtc);
    }

    public final long getTimestampMillis$div_evaluable() {
        return this.timestampMillis;
    }

    public final TimeZone getTimezone$div_evaluable() {
        return this.timezone;
    }

    public int hashCode() {
        return Long.hashCode(this.timestampUtc);
    }

    public String toString() {
        Companion companion = Companion;
        Calendar calendar = getCalendar();
        p.i(calendar, "calendar");
        return companion.formatDate$div_evaluable(calendar);
    }
}
