package sg;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.y1;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.extractor.text.CuesWithTiming;
import java.util.ArrayList;

/* JADX INFO: compiled from: ReplacingCuesResolver.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements a {
    private final ArrayList<CuesWithTiming> cuesWithTimingList = new ArrayList<>();

    private int getIndexOfCuesStartingAfter(long j10) {
        for (int i10 = 0; i10 < this.cuesWithTimingList.size(); i10++) {
            if (j10 < this.cuesWithTimingList.get(i10).startTimeUs) {
                return i10;
            }
        }
        return this.cuesWithTimingList.size();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // sg.a
    public boolean addCues(CuesWithTiming cuesWithTiming, long j10) {
        boolean z10;
        Assertions.checkArgument(cuesWithTiming.startTimeUs != -9223372036854775807L);
        if (cuesWithTiming.startTimeUs <= j10) {
            long j11 = cuesWithTiming.endTimeUs;
            if (j11 == -9223372036854775807L || j10 < j11) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                return z10;
            }
            if (this.cuesWithTimingList.get(size).startTimeUs <= j10) {
                z10 = false;
            }
        }
        this.cuesWithTimingList.add(0, cuesWithTiming);
        return z10;
    }

    @Override // sg.a
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    @Override // sg.a
    public long getNextCueChangeTimeUs(long j10) {
        if (this.cuesWithTimingList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < this.cuesWithTimingList.get(0).startTimeUs) {
            return this.cuesWithTimingList.get(0).startTimeUs;
        }
        for (int i10 = 1; i10 < this.cuesWithTimingList.size(); i10++) {
            CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i10);
            if (j10 < cuesWithTiming.startTimeUs) {
                long j11 = this.cuesWithTimingList.get(i10 - 1).endTimeUs;
                return (j11 == -9223372036854775807L || j11 <= j10 || j11 >= cuesWithTiming.startTimeUs) ? cuesWithTiming.startTimeUs : j11;
            }
        }
        long j12 = ((CuesWithTiming) y1.f(this.cuesWithTimingList)).endTimeUs;
        if (j12 == -9223372036854775807L || j10 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    @Override // sg.a
    public long getPreviousCueChangeTimeUs(long j10) {
        if (this.cuesWithTimingList.isEmpty() || j10 < this.cuesWithTimingList.get(0).startTimeUs) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < this.cuesWithTimingList.size(); i10++) {
            long j11 = this.cuesWithTimingList.get(i10).startTimeUs;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i10 - 1);
                long j12 = cuesWithTiming.endTimeUs;
                return (j12 == -9223372036854775807L || j12 > j10) ? cuesWithTiming.startTimeUs : j12;
            }
        }
        CuesWithTiming cuesWithTiming2 = (CuesWithTiming) y1.f(this.cuesWithTimingList);
        long j13 = cuesWithTiming2.endTimeUs;
        return (j13 == -9223372036854775807L || j10 < j13) ? cuesWithTiming2.startTimeUs : j13;
    }

    @Override // sg.a
    public void discardCuesBeforeTimeUs(long j10) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j10);
        if (indexOfCuesStartingAfter > 0) {
            this.cuesWithTimingList.subList(0, indexOfCuesStartingAfter).clear();
        }
    }

    @Override // sg.a
    public ImmutableList<Cue> getCuesAtTimeUs(long j10) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j10);
        if (indexOfCuesStartingAfter == 0) {
            return ImmutableList.of();
        }
        CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(indexOfCuesStartingAfter - 1);
        long j11 = cuesWithTiming.endTimeUs;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return ImmutableList.of();
        }
        return cuesWithTiming.cues;
    }
}
