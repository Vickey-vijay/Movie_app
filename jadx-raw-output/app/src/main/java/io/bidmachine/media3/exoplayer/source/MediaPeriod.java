package io.bidmachine.media3.exoplayer.source;

import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.SeekParameters;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public interface MediaPeriod extends SequenceableLoader {

    public interface Callback extends SequenceableLoader.Callback<MediaPeriod> {
        @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader.Callback
        /* synthetic */ void onContinueLoadingRequested(SequenceableLoader sequenceableLoader);

        void onPrepared(MediaPeriod mediaPeriod);
    }

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    boolean continueLoading(LoadingInfo loadingInfo);

    void discardBuffer(long j10, boolean z10);

    long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters);

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    long getBufferedPositionUs();

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    long getNextLoadPositionUs();

    TrackGroupArray getTrackGroups();

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    boolean isLoading();

    void maybeThrowPrepareError() throws IOException;

    void prepare(Callback callback, long j10);

    long readDiscontinuity();

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    void reevaluateBuffer(long j10);

    long seekToUs(long j10);

    long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10);

    default List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return Collections.emptyList();
    }
}
