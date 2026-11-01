package io.bidmachine.util;

import ck.p;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: compiled from: DateUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0007J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0007¨\u0006\u001b"}, d2 = {"Lio/bidmachine/util/DateUtils;", "", "Ljava/util/Calendar;", "createCalendar", "", "days", "Ljava/util/Date;", "getDateDaysAgo", "getUtcOffsetMinutes", "", "dateMs", "whenDate", "", "isOlderThanDate", "date", "year", "isYearValid", "startDate", "endDate", "daysBetween", "getBeginOfDayMs", "toCalendar", "calendar", "Lmj/r;", "setupCalendarStartOfDay", "<init>", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public final class DateUtils {
    public static final DateUtils INSTANCE = new DateUtils();

    private DateUtils() {
    }

    public static final boolean isOlderThanDate(long dateMs, Date whenDate) {
        p.j(whenDate, "whenDate");
        return isOlderThanDate(new Date(dateMs), whenDate);
    }

    public static final boolean isYearValid(int year) {
        return 1900 <= year && year <= createCalendar().get(1);
    }

    public static final int daysBetween(Date startDate, Date endDate) {
        p.j(startDate, "startDate");
        p.j(endDate, "endDate");
        return DateUtilsKt.daysBetween(startDate, endDate);
    }

    public static final long getBeginOfDayMs(Date date) {
        p.j(date, "date");
        return DateUtilsKt.getBeginOfDayMs(date);
    }

    public static final Date getDateDaysAgo(int days) {
        Calendar calendar = DateUtilsKt.toCalendar(new Date());
        calendar.add(6, -days);
        Date time = calendar.getTime();
        p.i(time, "Date().toCalendar().appl…AR, -days)\n        }.time");
        return time;
    }

    public static final int getUtcOffsetMinutes() {
        return (int) TimeUnit.MILLISECONDS.toMinutes(TimeZone.getDefault().getOffset(System.currentTimeMillis()));
    }

    public static final boolean isOlderThanDate(Date date, Date whenDate) {
        p.j(date, "date");
        p.j(whenDate, "whenDate");
        return DateUtilsKt.isOlderThanDate(date, whenDate);
    }

    public static final void setupCalendarStartOfDay(Calendar calendar) {
        p.j(calendar, "calendar");
        DateUtilsKt.setupCalendarStartOfDay(calendar);
    }

    public static final Calendar toCalendar(Date date) {
        p.j(date, "date");
        return DateUtilsKt.toCalendar(date);
    }

    public static final Calendar createCalendar() {
        Calendar calendar = Calendar.getInstance();
        p.i(calendar, "getInstance()");
        return calendar;
    }
}
