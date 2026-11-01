package io.bidmachine.utils.time;

import androidx.annotation.NonNull;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class DateUtils {
    private static final long DAY_IN_MS = TimeUnit.DAYS.toMillis(1);

    @NonNull
    public static Calendar beginOfDay(@NonNull Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    @NonNull
    public static Calendar calendarFromDate(@NonNull Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static int daysBetween(@NonNull Date date, @NonNull Date date2) {
        return (int) (Math.abs(beginOfDay(calendarFromDate(date2)).getTimeInMillis() - beginOfDay(calendarFromDate(date)).getTimeInMillis()) / DAY_IN_MS);
    }
}
