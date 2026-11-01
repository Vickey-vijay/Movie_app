package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.types.DateTime;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: compiled from: DateTimeFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFunctionsKt {
    public static final Calendar toCalendar(DateTime dateTime) {
        p.j(dateTime, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(dateTime.getTimezone$div_evaluable());
        calendar.setTimeInMillis(dateTime.getTimestampMillis$div_evaluable());
        p.i(calendar, "calendar");
        return calendar;
    }

    public static final Date toDate(DateTime dateTime) {
        p.j(dateTime, "<this>");
        return new Date(dateTime.getTimestampMillis$div_evaluable() - ((long) dateTime.getTimezone$div_evaluable().getRawOffset()));
    }
}
