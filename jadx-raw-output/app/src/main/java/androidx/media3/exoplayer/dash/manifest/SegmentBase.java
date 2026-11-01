package androidx.media3.exoplayer.dash.manifest;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import o5.a;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public abstract class SegmentBase {

    @Nullable
    public final RangedUri initialization;
    public final long presentationTimeOffset;
    public final long timescale;

    public static abstract class MultiSegmentBase extends SegmentBase {

        @VisibleForTesting
        public final long availabilityTimeOffsetUs;
        public final long duration;
        private final long periodStartUnixTimeUs;

        @Nullable
        public final List<SegmentTimelineElement> segmentTimeline;
        public final long startNumber;
        private final long timeShiftBufferDepthUs;

        public MultiSegmentBase(@Nullable RangedUri rangedUri, long j10, long j11, long j12, long j13, @Nullable List<SegmentTimelineElement> list, long j14, long j15, long j16) {
            super(rangedUri, j10, j11);
            this.startNumber = j12;
            this.duration = j13;
            this.segmentTimeline = list;
            this.availabilityTimeOffsetUs = j14;
            this.timeShiftBufferDepthUs = j15;
            this.periodStartUnixTimeUs = j16;
        }

        public abstract long getSegmentCount(long j10);

        public abstract RangedUri getSegmentUrl(Representation representation, long j10);

        public long getFirstSegmentNum() {
            return this.startNumber;
        }

        public long getNextSegmentAvailableTimeUs(long j10, long j11) {
            if (this.segmentTimeline != null) {
                return -9223372036854775807L;
            }
            long firstAvailableSegmentNum = getFirstAvailableSegmentNum(j10, j11) + getAvailableSegmentCount(j10, j11);
            return (getSegmentTimeUs(firstAvailableSegmentNum) + getSegmentDurationUs(firstAvailableSegmentNum, j10)) - this.availabilityTimeOffsetUs;
        }

        public final long getSegmentDurationUs(long j10, long j11) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            if (list != null) {
                return (list.get((int) (j10 - this.startNumber)).duration * 1000000) / this.timescale;
            }
            long segmentCount = getSegmentCount(j11);
            return (segmentCount == -1 || j10 != (getFirstSegmentNum() + segmentCount) - 1) ? (this.duration * 1000000) / this.timescale : j11 - getSegmentTimeUs(j10);
        }

        public final long getSegmentTimeUs(long j10) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            return Util.scaleLargeTimestamp(list != null ? list.get((int) (j10 - this.startNumber)).startTime - this.presentationTimeOffset : (j10 - this.startNumber) * this.duration, 1000000L, this.timescale);
        }

        public boolean isExplicit() {
            return this.segmentTimeline != null;
        }

        public long getAvailableSegmentCount(long j10, long j11) {
            long segmentCount = getSegmentCount(j10);
            if (segmentCount != -1) {
                return segmentCount;
            }
            return (int) (getSegmentNum((j11 - this.periodStartUnixTimeUs) + this.availabilityTimeOffsetUs, j10) - getFirstAvailableSegmentNum(j10, j11));
        }

        public long getFirstAvailableSegmentNum(long j10, long j11) {
            if (getSegmentCount(j10) == -1) {
                long j12 = this.timeShiftBufferDepthUs;
                if (j12 != -9223372036854775807L) {
                    return Math.max(getFirstSegmentNum(), getSegmentNum((j11 - this.periodStartUnixTimeUs) - j12, j10));
                }
            }
            return getFirstSegmentNum();
        }

        public long getSegmentNum(long j10, long j11) {
            long firstSegmentNum = getFirstSegmentNum();
            long segmentCount = getSegmentCount(j11);
            if (segmentCount == 0) {
                return firstSegmentNum;
            }
            if (this.segmentTimeline == null) {
                long j12 = this.startNumber + (j10 / ((this.duration * 1000000) / this.timescale));
                if (j12 >= firstSegmentNum) {
                    if (segmentCount == -1) {
                        return j12;
                    }
                    return Math.min(j12, (firstSegmentNum + segmentCount) - 1);
                }
                return firstSegmentNum;
            }
            long j13 = (segmentCount + firstSegmentNum) - 1;
            long j14 = firstSegmentNum;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                long segmentTimeUs = getSegmentTimeUs(j15);
                if (segmentTimeUs < j10) {
                    j14 = j15 + 1;
                } else if (segmentTimeUs > j10) {
                    j13 = j15 - 1;
                } else {
                    return j15;
                }
            }
            if (j14 == firstSegmentNum) {
                return j14;
            }
            return j13;
        }
    }

    public static final class SegmentList extends MultiSegmentBase {

        @Nullable
        public final List<RangedUri> mediaSegments;

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public boolean isExplicit() {
            return true;
        }

        public SegmentList(RangedUri rangedUri, long j10, long j11, long j12, long j13, @Nullable List<SegmentTimelineElement> list, long j14, @Nullable List<RangedUri> list2, long j15, long j16) {
            super(rangedUri, j10, j11, j12, j13, list, j14, j15, j16);
            this.mediaSegments = list2;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j10) {
            return this.mediaSegments.size();
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j10) {
            return this.mediaSegments.get((int) (j10 - this.startNumber));
        }
    }

    public static final class SegmentTemplate extends MultiSegmentBase {
        public final long endNumber;

        @Nullable
        public final UrlTemplate initializationTemplate;

        @Nullable
        public final UrlTemplate mediaTemplate;

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j10) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            long j11 = list != null ? list.get((int) (j10 - this.startNumber)).startTime : (j10 - this.startNumber) * this.duration;
            UrlTemplate urlTemplate = this.mediaTemplate;
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.f3939id, j10, format.bitrate, j11), 0L, -1L);
        }

        public SegmentTemplate(RangedUri rangedUri, long j10, long j11, long j12, long j13, long j14, @Nullable List<SegmentTimelineElement> list, long j15, @Nullable UrlTemplate urlTemplate, @Nullable UrlTemplate urlTemplate2, long j16, long j17) {
            super(rangedUri, j10, j11, j12, j14, list, j15, j16, j17);
            this.initializationTemplate = urlTemplate;
            this.mediaTemplate = urlTemplate2;
            this.endNumber = j13;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase
        @Nullable
        public RangedUri getInitialization(Representation representation) {
            UrlTemplate urlTemplate = this.initializationTemplate;
            if (urlTemplate == null) {
                return super.getInitialization(representation);
            }
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.f3939id, 0L, format.bitrate, 0L), 0L, -1L);
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j10) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            if (list != null) {
                return list.size();
            }
            long j11 = this.endNumber;
            if (j11 != -1) {
                return (j11 - this.startNumber) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.timescale)), BigInteger.valueOf(this.duration).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }
    }

    public static final class SegmentTimelineElement {
        public final long duration;
        public final long startTime;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SegmentTimelineElement.class != obj.getClass()) {
                return false;
            }
            SegmentTimelineElement segmentTimelineElement = (SegmentTimelineElement) obj;
            return this.startTime == segmentTimelineElement.startTime && this.duration == segmentTimelineElement.duration;
        }

        public int hashCode() {
            return (((int) this.startTime) * 31) + ((int) this.duration);
        }

        public SegmentTimelineElement(long j10, long j11) {
            this.startTime = j10;
            this.duration = j11;
        }
    }

    public static class SingleSegmentBase extends SegmentBase {
        public final long indexLength;
        public final long indexStart;

        public SingleSegmentBase(@Nullable RangedUri rangedUri, long j10, long j11, long j12, long j13) {
            super(rangedUri, j10, j11);
            this.indexStart = j12;
            this.indexLength = j13;
        }

        @Nullable
        public RangedUri getIndex() {
            long j10 = this.indexLength;
            if (j10 <= 0) {
                return null;
            }
            return new RangedUri(null, this.indexStart, j10);
        }

        public SingleSegmentBase() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }

    @Nullable
    public RangedUri getInitialization(Representation representation) {
        return this.initialization;
    }

    public long getPresentationTimeOffsetUs() {
        return Util.scaleLargeTimestamp(this.presentationTimeOffset, 1000000L, this.timescale);
    }

    public SegmentBase(@Nullable RangedUri rangedUri, long j10, long j11) {
        this.initialization = rangedUri;
        this.timescale = j10;
        this.presentationTimeOffset = j11;
    }
}
