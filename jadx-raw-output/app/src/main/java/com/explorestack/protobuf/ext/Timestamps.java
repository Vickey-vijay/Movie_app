package com.explorestack.protobuf.ext;

import com.explorestack.protobuf.Duration;
import com.explorestack.protobuf.Timestamp;
import com.google.android.material.datepicker.UtcDates;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public final class Timestamps {
    public static final long MILLIS_PER_SECOND = 1000;
    public static final long NANOS_PER_MICROSECOND = 1000;
    public static final long NANOS_PER_MILLISECOND = 1000000;
    public static final long NANOS_PER_SECOND = 1000000000;
    public static final long TIMESTAMP_SECONDS_MAX = 253402300799L;
    public static final long TIMESTAMP_SECONDS_MIN = -62135596800L;
    private static final ThreadLocal<SimpleDateFormat> timestampFormat = new ThreadLocal<SimpleDateFormat>() { // from class: com.explorestack.protobuf.ext.Timestamps.1
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return Timestamps.createTimestampFormat();
        }
    };

    public static Timestamp checkValid(Timestamp timestamp) {
        long seconds = timestamp.getSeconds();
        int nanos = timestamp.getNanos();
        if (isValid(seconds, nanos)) {
            return timestamp;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(seconds), Integer.valueOf(nanos)));
    }

    private static String formatNanos(int i10) {
        long j10 = i10;
        if (j10 % 1000000 == 0) {
            return String.format(Locale.ENGLISH, "%1$03d", Long.valueOf(j10 / 1000000));
        }
        return j10 % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Long.valueOf(j10 / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(i10));
    }

    public static boolean isValid(long j10, int i10) {
        return j10 >= TIMESTAMP_SECONDS_MIN && j10 <= TIMESTAMP_SECONDS_MAX && i10 >= 0 && ((long) i10) < 1000000000;
    }

    private static Timestamp normalizedTimestamp(long j10, int i10) {
        long j11 = i10;
        if (j11 <= -1000000000 || j11 >= 1000000000) {
            j10 = checkedAdd(j10, j11 / 1000000000);
            i10 = (int) (j11 % 1000000000);
        }
        if (i10 < 0) {
            i10 = (int) (((long) i10) + 1000000000);
            j10 = checkedSubtract(j10, 1L);
        }
        return checkValid(Timestamp.newBuilder().setSeconds(j10).setNanos(i10).build());
    }

    private static int parseNanos(String str) throws ParseException {
        int iCharAt = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            iCharAt *= 10;
            if (i10 < str.length()) {
                if (str.charAt(i10) < '0' || str.charAt(i10) > '9') {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
                iCharAt += str.charAt(i10) - '0';
            }
        }
        return iCharAt;
    }

    private static void checkNoOverflow(boolean z10, String str, long j10, long j11) {
        if (z10) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j10 + ", " + j11 + ")");
    }

    private static int checkedAdd(long j10, long j11) {
        long j12 = j10 + j11;
        int i10 = (int) j12;
        checkNoOverflow(j12 == ((long) i10), "checkedAdd", j10, j11);
        return i10;
    }

    private static int checkedMultiply(long j10, long j11) {
        long j12 = j10 * j11;
        int i10 = (int) j12;
        checkNoOverflow(j12 == ((long) i10), "checkedMultiply", j10, j11);
        return i10;
    }

    private static int checkedSubtract(long j10, long j11) {
        long j12 = j10 - j11;
        int i10 = (int) j12;
        checkNoOverflow(j12 == ((long) i10), "checkedSubtract", j10, j11);
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SimpleDateFormat createTimestampFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(UtcDates.UTC));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }

    public static Timestamp fromMillis(long j10) {
        return normalizedTimestamp(j10 / 1000, (int) ((j10 % 1000) * 1000000));
    }

    private static long parseTimezoneOffset(String str) throws ParseException {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf != -1) {
            return ((Long.parseLong(str.substring(0, iIndexOf)) * 60) + Long.parseLong(str.substring(iIndexOf + 1))) * 60;
        }
        throw new ParseException("Invalid offset value: " + str, 0);
    }

    private Timestamps() {
    }

    public static Timestamp add(Timestamp timestamp, Duration duration) {
        checkValid(timestamp);
        return normalizedTimestamp(checkedAdd(timestamp.getSeconds(), duration.getSeconds()), checkedAdd(timestamp.getNanos(), duration.getNanos()));
    }

    public static long toMillis(Timestamp timestamp) {
        checkValid(timestamp);
        return checkedAdd(checkedMultiply(timestamp.getSeconds(), 1000L), ((long) timestamp.getNanos()) / 1000000);
    }

    public static String toString(Timestamp timestamp) {
        checkValid(timestamp);
        long seconds = timestamp.getSeconds();
        int nanos = timestamp.getNanos();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(timestampFormat.get().format(new Date(seconds * 1000)));
        if (nanos != 0) {
            sb2.append(".");
            sb2.append(formatNanos(nanos));
        }
        sb2.append("Z");
        return sb2.toString();
    }

    public static Timestamp checkValid(Timestamp.Builder builder) {
        return checkValid(builder.build());
    }
}
