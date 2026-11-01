package kotlin.time;

import java.util.concurrent.TimeUnit;
import uj.a;

/* JADX INFO: compiled from: DurationUnitJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
public enum DurationUnit {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f63012c = kotlin.enums.a.a(d());
    private final TimeUnit timeUnit;

    public static a<DurationUnit> getEntries() {
        return f63012c;
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }

    DurationUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }
}
