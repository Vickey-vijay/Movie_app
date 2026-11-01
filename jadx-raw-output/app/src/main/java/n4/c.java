package n4;

import o4.h;

/* JADX INFO: compiled from: DashSegmentIndex.java */
/* JADX INFO: loaded from: classes6.dex */
public interface c {
    long getDurationUs(long j10, long j11);

    long getFirstSegmentNum();

    int getSegmentCount(long j10);

    long getSegmentNum(long j10, long j11);

    h getSegmentUrl(long j10);

    long getTimeUs(long j10);

    boolean isExplicit();
}
