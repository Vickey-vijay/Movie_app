package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.FormatHolder;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.SeekParameters;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class SilenceMediaSource extends BaseMediaSource {
    private static final int CHANNEL_COUNT = 2;
    private static final Format FORMAT;
    public static final String MEDIA_ID = "SilenceMediaSource";
    private static final MediaItem MEDIA_ITEM;
    private static final int PCM_ENCODING = 2;
    private static final int SAMPLE_RATE_HZ = 44100;
    private static final byte[] SILENCE_SAMPLE;
    private final long durationUs;

    @GuardedBy("this")
    private MediaItem mediaItem;

    public static final class Factory {
        private long durationUs;

        @Nullable
        private Object tag;

        public SilenceMediaSource createMediaSource() {
            Assertions.checkState(this.durationUs > 0);
            return new SilenceMediaSource(this.durationUs, SilenceMediaSource.MEDIA_ITEM.buildUpon().setTag(this.tag).build());
        }

        public Factory setDurationUs(@IntRange(from = 1) long j10) {
            this.durationUs = j10;
            return this;
        }

        public Factory setTag(@Nullable Object obj) {
            this.tag = obj;
            return this;
        }
    }

    public static final class b implements MediaPeriod {
        private static final TrackGroupArray TRACKS = new TrackGroupArray(new TrackGroup(SilenceMediaSource.FORMAT));
        private final long durationUs;
        private final ArrayList<SampleStream> sampleStreams = new ArrayList<>();

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(LoadingInfo loadingInfo) {
            return false;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
        public void discardBuffer(long j10, boolean z10) {
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
        public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
            return super.getStreamKeys(list);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return false;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
        public void maybeThrowPrepareError() {
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
        public long readDiscontinuity() {
            return -9223372036854775807L;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j10) {
        }

        private long constrainSeekPosition(long j10) {
            return Util.constrainValue(j10, 0L, this.durationUs);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return TRACKS;
        }

        public b(long j10) {
            this.durationUs = j10;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
            return constrainSeekPosition(j10);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j10) {
            callback.onPrepared(this);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
        public long seekToUs(long j10) {
            long jConstrainSeekPosition = constrainSeekPosition(j10);
            for (int i10 = 0; i10 < this.sampleStreams.size(); i10++) {
                ((c) this.sampleStreams.get(i10)).seekTo(jConstrainSeekPosition);
            }
            return jConstrainSeekPosition;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
            long jConstrainSeekPosition = constrainSeekPosition(j10);
            for (int i10 = 0; i10 < exoTrackSelectionArr.length; i10++) {
                SampleStream sampleStream = sampleStreamArr[i10];
                if (sampleStream != null && (exoTrackSelectionArr[i10] == null || !zArr[i10])) {
                    this.sampleStreams.remove(sampleStream);
                    sampleStreamArr[i10] = null;
                }
                if (sampleStreamArr[i10] == null && exoTrackSelectionArr[i10] != null) {
                    c cVar = new c(this.durationUs);
                    cVar.seekTo(jConstrainSeekPosition);
                    this.sampleStreams.add(cVar);
                    sampleStreamArr[i10] = cVar;
                    zArr2[i10] = true;
                }
            }
            return jConstrainSeekPosition;
        }
    }

    public static final class c implements SampleStream {
        private final long durationBytes;
        private long positionBytes;
        private boolean sentFormat;

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return true;
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (!this.sentFormat || (i10 & 2) != 0) {
                formatHolder.format = SilenceMediaSource.FORMAT;
                this.sentFormat = true;
                return -5;
            }
            long j10 = this.durationBytes;
            long j11 = this.positionBytes;
            long j12 = j10 - j11;
            if (j12 == 0) {
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            decoderInputBuffer.timeUs = SilenceMediaSource.getAudioPositionUs(j11);
            decoderInputBuffer.addFlag(1);
            int iMin = (int) Math.min(SilenceMediaSource.SILENCE_SAMPLE.length, j12);
            if ((i10 & 4) == 0) {
                decoderInputBuffer.ensureSpaceForWrite(iMin);
                decoderInputBuffer.data.put(SilenceMediaSource.SILENCE_SAMPLE, 0, iMin);
            }
            if ((i10 & 1) == 0) {
                this.positionBytes += (long) iMin;
            }
            return -4;
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public int skipData(long j10) {
            long j11 = this.positionBytes;
            seekTo(j10);
            return (int) ((this.positionBytes - j11) / ((long) SilenceMediaSource.SILENCE_SAMPLE.length));
        }

        public c(long j10) {
            this.durationBytes = SilenceMediaSource.getAudioByteCount(j10);
            seekTo(0L);
        }

        public void seekTo(long j10) {
            this.positionBytes = Util.constrainValue(SilenceMediaSource.getAudioByteCount(j10), 0L, this.durationBytes);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioPositionUs(long j10) {
        return ((j10 / ((long) Util.getPcmFrameSize(2, 2))) * 1000000) / 44100;
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @Nullable
    @UnstableApi
    public /* bridge */ /* synthetic */ Timeline getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @UnstableApi
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    static {
        Format formatBuild = new Format.Builder().setSampleMimeType("audio/raw").setChannelCount(2).setSampleRate(SAMPLE_RATE_HZ).setPcmEncoding(2).build();
        FORMAT = formatBuild;
        MEDIA_ITEM = new MediaItem.Builder().setMediaId("SilenceMediaSource").setUri(Uri.EMPTY).setMimeType(formatBuild.sampleMimeType).build();
        SILENCE_SAMPLE = new byte[Util.getPcmFrameSize(2, 2) * 1024];
    }

    public SilenceMediaSource(long j10) {
        this(j10, MEDIA_ITEM);
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        return new b(this.durationUs);
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        refreshSourceInfo(new SinglePeriodTimeline(this.durationUs, true, false, false, (Object) null, getMediaItem()));
    }

    private SilenceMediaSource(long j10, MediaItem mediaItem) {
        Assertions.checkArgument(j10 >= 0);
        this.durationUs = j10;
        this.mediaItem = mediaItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioByteCount(long j10) {
        return ((long) Util.getPcmFrameSize(2, 2)) * ((j10 * 44100) / 1000000);
    }
}
