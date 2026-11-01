package io.bidmachine.util;

import com.ironsource.C3426d4;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import nj.b0;
import nj.w;

/* JADX INFO: compiled from: Stopwatch.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\r\u001a\u00020\u0002J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lio/bidmachine/util/Stopwatch;", "", "", "getStartTimeMs", "Lmj/r;", "start", "track", "", "getTrackCount", C3426d4.i.L, "getTimeMs", "getTimeMsOrNull", "(I)Ljava/lang/Long;", "getLastTimeMs", "getLastTimeMsOrNull", "()Ljava/lang/Long;", "", "timeMsList", "Ljava/util/List;", "Ljava/util/concurrent/atomic/AtomicLong;", "startTimeMs", "Ljava/util/concurrent/atomic/AtomicLong;", "<init>", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public final class Stopwatch {
    private final List<Long> timeMsList = new CopyOnWriteArrayList();
    private final AtomicLong startTimeMs = new AtomicLong(System.currentTimeMillis());

    public final Long getLastTimeMsOrNull() {
        return (Long) b0.s0(this.timeMsList);
    }

    public final long getStartTimeMs() {
        return this.startTimeMs.get();
    }

    public final long getTimeMs(int position) {
        Long l10 = (Long) b0.i0(this.timeMsList, position);
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final Long getTimeMsOrNull(int position) {
        return (Long) b0.i0(this.timeMsList, position);
    }

    public final int getTrackCount() {
        return this.timeMsList.size();
    }

    public final void start() {
        this.startTimeMs.set(System.currentTimeMillis());
        this.timeMsList.clear();
    }

    public final void track() {
        this.timeMsList.add(Long.valueOf(System.currentTimeMillis() - getStartTimeMs()));
        w.A(this.timeMsList);
    }

    public final long getLastTimeMs() {
        Long lastTimeMsOrNull = getLastTimeMsOrNull();
        if (lastTimeMsOrNull != null) {
            return lastTimeMsOrNull.longValue();
        }
        return 0L;
    }
}
