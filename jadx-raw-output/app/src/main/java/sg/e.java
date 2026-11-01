package sg;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.extractor.text.CuesWithTiming;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MergingCuesResolver.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements a {
    private static final Ordering<CuesWithTiming> CUES_DISPLAY_PRIORITY_COMPARATOR = Ordering.natural().onResultOf(new m5.e() { // from class: sg.c
        @Override // m5.e
        public final Object apply(Object obj) {
            return e.lambda$static$0((CuesWithTiming) obj);
        }
    }).compound(Ordering.natural().reverse().onResultOf(new m5.e() { // from class: sg.d
        @Override // m5.e
        public final Object apply(Object obj) {
            return e.lambda$static$1((CuesWithTiming) obj);
        }
    }));
    private final List<CuesWithTiming> cuesWithTimingList = new ArrayList();

    @Override // sg.a
    public void discardCuesBeforeTimeUs(long j10) {
        int i10 = 0;
        while (i10 < this.cuesWithTimingList.size()) {
            long j11 = this.cuesWithTimingList.get(i10).startTimeUs;
            if (j10 > j11 && j10 > this.cuesWithTimingList.get(i10).endTimeUs) {
                this.cuesWithTimingList.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$static$0(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(cuesWithTiming.startTimeUs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$static$1(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(cuesWithTiming.durationUs);
    }

    @Override // sg.a
    public boolean addCues(CuesWithTiming cuesWithTiming, long j10) {
        Assertions.checkArgument(cuesWithTiming.startTimeUs != -9223372036854775807L);
        Assertions.checkArgument(cuesWithTiming.durationUs != -9223372036854775807L);
        boolean z10 = cuesWithTiming.startTimeUs <= j10 && j10 < cuesWithTiming.endTimeUs;
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                return z10;
            }
        }
        this.cuesWithTimingList.add(0, cuesWithTiming);
        return z10;
    }

    @Override // sg.a
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.a
    public ImmutableList<Cue> getCuesAtTimeUs(long j10) {
        if (!this.cuesWithTimingList.isEmpty()) {
            if (j10 >= this.cuesWithTimingList.get(0).startTimeUs) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.cuesWithTimingList.size(); i10++) {
                    CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i10);
                    if (j10 >= cuesWithTiming.startTimeUs && j10 < cuesWithTiming.endTimeUs) {
                        arrayList.add(cuesWithTiming);
                    }
                    if (j10 < cuesWithTiming.startTimeUs) {
                        break;
                    }
                }
                ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(CUES_DISPLAY_PRIORITY_COMPARATOR, arrayList);
                ImmutableList.a aVarBuilder = ImmutableList.builder();
                for (int i11 = 0; i11 < immutableListSortedCopyOf.size(); i11++) {
                    aVarBuilder.k(((CuesWithTiming) immutableListSortedCopyOf.get(i11)).cues);
                }
                return aVarBuilder.m();
            }
        }
        return ImmutableList.of();
    }

    @Override // sg.a
    public long getPreviousCueChangeTimeUs(long j10) {
        if (this.cuesWithTimingList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < this.cuesWithTimingList.get(0).startTimeUs) {
            return -9223372036854775807L;
        }
        long jMax = this.cuesWithTimingList.get(0).startTimeUs;
        for (int i10 = 0; i10 < this.cuesWithTimingList.size(); i10++) {
            long j11 = this.cuesWithTimingList.get(i10).startTimeUs;
            long j12 = this.cuesWithTimingList.get(i10).endTimeUs;
            if (j12 > j10) {
                if (j11 > j10) {
                    break;
                }
                jMax = Math.max(jMax, j11);
            } else {
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }

    @Override // sg.a
    public long getNextCueChangeTimeUs(long j10) {
        long jMin = -9223372036854775807L;
        for (int i10 = 0; i10 < this.cuesWithTimingList.size(); i10++) {
            long j11 = this.cuesWithTimingList.get(i10).startTimeUs;
            long j12 = this.cuesWithTimingList.get(i10).endTimeUs;
            if (j10 < j11) {
                if (jMin == -9223372036854775807L) {
                    jMin = j11;
                    break;
                }
                jMin = Math.min(jMin, j11);
                break;
            }
            if (j10 < j12) {
                if (jMin == -9223372036854775807L) {
                    jMin = j12;
                } else {
                    jMin = Math.min(jMin, j12);
                }
            }
        }
        if (jMin == -9223372036854775807L) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
