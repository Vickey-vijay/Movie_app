package io.bidmachine.media3.extractor.text;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.collect.y1;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.text.CuesWithTiming;
import io.bidmachine.media3.extractor.text.CuesWithTimingSubtitle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import m5.e;

/* JADX INFO: loaded from: classes3.dex */
@UnstableApi
public final class CuesWithTimingSubtitle implements Subtitle {
    private static final Ordering<CuesWithTiming> CUES_BY_START_TIME_ASCENDING = Ordering.natural().onResultOf(new e() { // from class: kh.b
        @Override // m5.e
        public final Object apply(Object obj) {
            return CuesWithTimingSubtitle.lambda$static$0((CuesWithTiming) obj);
        }
    });
    private static final String TAG = "CuesWithTimingSubtitle";
    private final ImmutableList<ImmutableList<Cue>> eventCues;
    private final long[] eventTimesUs;

    private static long normalizeUnsetStartTimeToZero(long j10) {
        if (j10 == -9223372036854775807L) {
            return 0L;
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Comparable lambda$static$0(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(normalizeUnsetStartTimeToZero(cuesWithTiming.startTimeUs));
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public ImmutableList<Cue> getCues(long j10) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.eventTimesUs, j10, true, false);
        return iBinarySearchFloor == -1 ? ImmutableList.of() : this.eventCues.get(iBinarySearchFloor);
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public long getEventTime(int i10) {
        Assertions.checkArgument(i10 < this.eventCues.size());
        return this.eventTimesUs[i10];
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.eventCues.size();
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j10) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j10, false, false);
        if (iBinarySearchCeil < this.eventCues.size()) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    public CuesWithTimingSubtitle(List<CuesWithTiming> list) {
        if (list.size() == 1) {
            CuesWithTiming cuesWithTiming = (CuesWithTiming) y1.i(list);
            long jNormalizeUnsetStartTimeToZero = normalizeUnsetStartTimeToZero(cuesWithTiming.startTimeUs);
            if (cuesWithTiming.durationUs == -9223372036854775807L) {
                this.eventCues = ImmutableList.of(cuesWithTiming.cues);
                this.eventTimesUs = new long[]{jNormalizeUnsetStartTimeToZero};
                return;
            } else {
                this.eventCues = ImmutableList.of((ImmutableList) cuesWithTiming.cues, ImmutableList.of());
                this.eventTimesUs = new long[]{jNormalizeUnsetStartTimeToZero, jNormalizeUnsetStartTimeToZero + cuesWithTiming.durationUs};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.eventTimesUs = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(CUES_BY_START_TIME_ASCENDING, list);
        int i10 = 0;
        for (int i11 = 0; i11 < immutableListSortedCopyOf.size(); i11++) {
            CuesWithTiming cuesWithTiming2 = (CuesWithTiming) immutableListSortedCopyOf.get(i11);
            long jNormalizeUnsetStartTimeToZero2 = normalizeUnsetStartTimeToZero(cuesWithTiming2.startTimeUs);
            long j10 = cuesWithTiming2.durationUs + jNormalizeUnsetStartTimeToZero2;
            if (i10 != 0) {
                int i12 = i10 - 1;
                long j11 = this.eventTimesUs[i12];
                if (j11 >= jNormalizeUnsetStartTimeToZero2) {
                    if (j11 == jNormalizeUnsetStartTimeToZero2 && ((ImmutableList) arrayList.get(i12)).isEmpty()) {
                        arrayList.set(i12, cuesWithTiming2.cues);
                    } else {
                        Log.w(TAG, "Truncating unsupported overlapping cues.");
                        this.eventTimesUs[i12] = jNormalizeUnsetStartTimeToZero2;
                        arrayList.set(i12, cuesWithTiming2.cues);
                    }
                } else {
                    this.eventTimesUs[i10] = jNormalizeUnsetStartTimeToZero2;
                    arrayList.add(cuesWithTiming2.cues);
                    i10++;
                }
            } else {
                this.eventTimesUs[i10] = jNormalizeUnsetStartTimeToZero2;
                arrayList.add(cuesWithTiming2.cues);
                i10++;
            }
            if (cuesWithTiming2.durationUs != -9223372036854775807L) {
                this.eventTimesUs[i10] = j10;
                arrayList.add(ImmutableList.of());
                i10++;
            }
        }
        this.eventCues = ImmutableList.copyOf((Collection) arrayList);
    }
}
