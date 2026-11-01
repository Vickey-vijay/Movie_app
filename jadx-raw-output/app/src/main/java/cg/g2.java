package cg;

import io.bidmachine.media3.common.AdPlaybackState;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline;
import io.bidmachine.media3.exoplayer.source.ForwardingTimeline;
import io.bidmachine.media3.exoplayer.source.ShuffleOrder;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PlaylistTimeline.java */
/* JADX INFO: loaded from: classes11.dex */
public final class g2 extends AbstractConcatenatedTimeline {
    private final HashMap<Object, Integer> childIndexByUid;
    private final int[] firstPeriodInChildIndices;
    private final int[] firstWindowInChildIndices;
    private final int periodCount;
    private final Timeline[] timelines;
    private final Object[] uids;
    private final int windowCount;

    /* JADX INFO: compiled from: PlaylistTimeline.java */
    public class a extends ForwardingTimeline {
        private final Timeline.Window window;

        public a(Timeline timeline) {
            super(timeline);
            this.window = new Timeline.Window();
        }

        @Override // io.bidmachine.media3.exoplayer.source.ForwardingTimeline, io.bidmachine.media3.common.Timeline
        public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            Timeline.Period period2 = super.getPeriod(i10, period, z10);
            if (super.getWindow(period2.windowIndex, this.window).isLive()) {
                period2.set(period.f59771id, period.uid, period.windowIndex, period.durationUs, period.positionInWindowUs, AdPlaybackState.NONE, true);
            } else {
                period2.isPlaceholder = true;
            }
            return period2;
        }
    }

    public g2(Collection<? extends r1> collection, ShuffleOrder shuffleOrder) {
        this(getTimelines(collection), getUids(collection), shuffleOrder);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private g2(Timeline[] timelineArr, Object[] objArr, ShuffleOrder shuffleOrder) {
        super(false, shuffleOrder);
        int i10 = 0;
        int length = timelineArr.length;
        this.timelines = timelineArr;
        this.firstPeriodInChildIndices = new int[length];
        this.firstWindowInChildIndices = new int[length];
        this.uids = objArr;
        this.childIndexByUid = new HashMap<>();
        int length2 = timelineArr.length;
        int windowCount = 0;
        int periodCount = 0;
        int i11 = 0;
        while (i10 < length2) {
            Timeline timeline = timelineArr[i10];
            this.timelines[i11] = timeline;
            this.firstWindowInChildIndices[i11] = windowCount;
            this.firstPeriodInChildIndices[i11] = periodCount;
            windowCount += timeline.getWindowCount();
            periodCount += this.timelines[i11].getPeriodCount();
            this.childIndexByUid.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.windowCount = windowCount;
        this.periodCount = periodCount;
    }

    public g2 copyWithPlaceholderTimeline(ShuffleOrder shuffleOrder) {
        Timeline[] timelineArr = new Timeline[this.timelines.length];
        int i10 = 0;
        while (true) {
            Timeline[] timelineArr2 = this.timelines;
            if (i10 >= timelineArr2.length) {
                return new g2(timelineArr, this.uids, shuffleOrder);
            }
            timelineArr[i10] = new a(timelineArr2[i10]);
            i10++;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
    public int getChildIndexByChildUid(Object obj) {
        Integer num = this.childIndexByUid.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
    public int getChildIndexByPeriodIndex(int i10) {
        return Util.binarySearchFloor(this.firstPeriodInChildIndices, i10 + 1, false, false);
    }

    @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
    public int getChildIndexByWindowIndex(int i10) {
        return Util.binarySearchFloor(this.firstWindowInChildIndices, i10 + 1, false, false);
    }

    public List<Timeline> getChildTimelines() {
        return Arrays.asList(this.timelines);
    }

    @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
    public Object getChildUidByChildIndex(int i10) {
        return this.uids[i10];
    }

    @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
    public int getFirstPeriodIndexByChildIndex(int i10) {
        return this.firstPeriodInChildIndices[i10];
    }

    @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
    public int getFirstWindowIndexByChildIndex(int i10) {
        return this.firstWindowInChildIndices[i10];
    }

    @Override // io.bidmachine.media3.common.Timeline
    public int getPeriodCount() {
        return this.periodCount;
    }

    @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
    public Timeline getTimelineByChildIndex(int i10) {
        return this.timelines[i10];
    }

    @Override // io.bidmachine.media3.common.Timeline
    public int getWindowCount() {
        return this.windowCount;
    }

    private static Timeline[] getTimelines(Collection<? extends r1> collection) {
        Timeline[] timelineArr = new Timeline[collection.size()];
        Iterator<? extends r1> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            timelineArr[i10] = it.next().getTimeline();
            i10++;
        }
        return timelineArr;
    }

    private static Object[] getUids(Collection<? extends r1> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends r1> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = it.next().getUid();
            i10++;
        }
        return objArr;
    }
}
