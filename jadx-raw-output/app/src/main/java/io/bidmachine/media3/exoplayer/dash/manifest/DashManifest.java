package io.bidmachine.media3.exoplayer.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.offline.FilterableManifest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DashManifest implements FilterableManifest<DashManifest> {
    public final long availabilityStartTimeMs;
    public final long durationMs;
    public final boolean dynamic;

    @Nullable
    public final Uri location;
    public final long minBufferTimeMs;
    public final long minUpdatePeriodMs;
    private final List<Period> periods;

    @Nullable
    public final ProgramInformation programInformation;
    public final long publishTimeMs;

    @Nullable
    public final ServiceDescriptionElement serviceDescription;
    public final long suggestedPresentationDelayMs;
    public final long timeShiftBufferDepthMs;

    @Nullable
    public final UtcTimingElement utcTiming;

    public DashManifest(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, @Nullable ProgramInformation programInformation, @Nullable UtcTimingElement utcTimingElement, @Nullable ServiceDescriptionElement serviceDescriptionElement, @Nullable Uri uri, List<Period> list) {
        this.availabilityStartTimeMs = j10;
        this.durationMs = j11;
        this.minBufferTimeMs = j12;
        this.dynamic = z10;
        this.minUpdatePeriodMs = j13;
        this.timeShiftBufferDepthMs = j14;
        this.suggestedPresentationDelayMs = j15;
        this.publishTimeMs = j16;
        this.programInformation = programInformation;
        this.utcTiming = utcTimingElement;
        this.location = uri;
        this.serviceDescription = serviceDescriptionElement;
        this.periods = list == null ? Collections.emptyList() : list;
    }

    @Override // io.bidmachine.media3.exoplayer.offline.FilterableManifest
    public /* bridge */ /* synthetic */ DashManifest copy(List list) {
        return copy((List<StreamKey>) list);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.media3.exoplayer.offline.FilterableManifest
    public final DashManifest copy(List<StreamKey> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= getPeriodCount()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).periodIndex != i10) {
                long periodDurationMs = getPeriodDurationMs(i10);
                if (periodDurationMs != -9223372036854775807L) {
                    j10 += periodDurationMs;
                }
            } else {
                Period period = getPeriod(i10);
                arrayList.add(new Period(period.f59887id, period.startMs - j10, copyAdaptationSets(period.adaptationSets, linkedList), period.eventStreams));
            }
            i10++;
        }
        long j11 = this.durationMs;
        return new DashManifest(this.availabilityStartTimeMs, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.minBufferTimeMs, this.dynamic, this.minUpdatePeriodMs, this.timeShiftBufferDepthMs, this.suggestedPresentationDelayMs, this.publishTimeMs, this.programInformation, this.utcTiming, this.serviceDescription, this.location, arrayList);
    }

    public final Period getPeriod(int i10) {
        return this.periods.get(i10);
    }

    public final int getPeriodCount() {
        return this.periods.size();
    }

    public final long getPeriodDurationMs(int i10) {
        if (i10 != this.periods.size() - 1) {
            return this.periods.get(i10 + 1).startMs - this.periods.get(i10).startMs;
        }
        long j10 = this.durationMs;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - this.periods.get(i10).startMs;
    }

    private static ArrayList<AdaptationSet> copyAdaptationSets(List<AdaptationSet> list, LinkedList<StreamKey> linkedList) {
        StreamKey streamKeyPoll = linkedList.poll();
        int i10 = streamKeyPoll.periodIndex;
        ArrayList<AdaptationSet> arrayList = new ArrayList<>();
        do {
            int i11 = streamKeyPoll.groupIndex;
            AdaptationSet adaptationSet = list.get(i11);
            List<Representation> list2 = adaptationSet.representations;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(streamKeyPoll.streamIndex));
                streamKeyPoll = linkedList.poll();
                if (streamKeyPoll.periodIndex != i10) {
                    break;
                }
            } while (streamKeyPoll.groupIndex == i11);
            arrayList.add(new AdaptationSet(adaptationSet.f59885id, adaptationSet.type, arrayList2, adaptationSet.accessibilityDescriptors, adaptationSet.essentialProperties, adaptationSet.supplementalProperties));
        } while (streamKeyPoll.periodIndex == i10);
        linkedList.addFirst(streamKeyPoll);
        return arrayList;
    }

    public final long getPeriodDurationUs(int i10) {
        return Util.msToUs(getPeriodDurationMs(i10));
    }
}
