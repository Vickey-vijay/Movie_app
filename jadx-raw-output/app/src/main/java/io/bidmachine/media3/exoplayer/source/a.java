package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.FormatHolder;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.SeekParameters;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import q5.i;

/* JADX INFO: compiled from: ExternallyLoadedMediaPeriod.java */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements MediaPeriod {
    private final ExternalLoader externalLoader;
    private final AtomicBoolean loadingFinished;
    private i<?> loadingFuture;
    private final AtomicReference<Throwable> loadingThrowable;
    private final byte[] sampleData;
    private final TrackGroupArray tracks;
    private final Uri uri;

    /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.source.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExternallyLoadedMediaPeriod.java */
    public class C0506a implements q5.d<Object> {
        public C0506a() {
        }

        @Override // q5.d
        public void onFailure(Throwable th2) {
            a.this.loadingThrowable.set(th2);
        }

        @Override // q5.d
        public void onSuccess(@Nullable Object obj) {
            a.this.loadingFinished.set(true);
        }
    }

    /* JADX INFO: compiled from: ExternallyLoadedMediaPeriod.java */
    public final class b implements SampleStream {
        private static final int STREAM_STATE_END_OF_STREAM = 2;
        private static final int STREAM_STATE_SEND_FORMAT = 0;
        private static final int STREAM_STATE_SEND_SAMPLE = 1;
        private int streamState = 0;

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public int skipData(long j10) {
            return 0;
        }

        public b() {
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return a.this.loadingFinished.get();
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws IOException {
            Throwable th2 = (Throwable) a.this.loadingThrowable.get();
            if (th2 != null) {
                throw new IOException(th2);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i10) {
            int i11 = this.streamState;
            if (i11 == 2) {
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                formatHolder.format = a.this.tracks.get(0).getFormat(0);
                this.streamState = 1;
                return -5;
            }
            if (!a.this.loadingFinished.get()) {
                return -3;
            }
            int length = a.this.sampleData.length;
            decoderInputBuffer.addFlag(1);
            decoderInputBuffer.timeUs = 0L;
            if ((i10 & 4) == 0) {
                decoderInputBuffer.ensureSpaceForWrite(length);
                decoderInputBuffer.data.put(a.this.sampleData, 0, length);
            }
            if ((i10 & 1) == 0) {
                this.streamState = 2;
            }
            return -4;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j10, boolean z10) {
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
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

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j10) {
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < exoTrackSelectionArr.length; i10++) {
            if (sampleStreamArr[i10] != null && (exoTrackSelectionArr[i10] == null || !zArr[i10])) {
                sampleStreamArr[i10] = null;
            }
            if (sampleStreamArr[i10] == null && exoTrackSelectionArr[i10] != null) {
                sampleStreamArr[i10] = new b();
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        return !this.loadingFinished.get();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.loadingFinished.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.loadingFinished.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.tracks;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return !this.loadingFinished.get();
    }

    public void releasePeriod() {
        i<?> iVar = this.loadingFuture;
        if (iVar != null) {
            iVar.cancel(false);
        }
    }

    public a(Uri uri, String str, ExternalLoader externalLoader) {
        this.uri = uri;
        Format formatBuild = new Format.Builder().setSampleMimeType(str).build();
        this.externalLoader = externalLoader;
        this.tracks = new TrackGroupArray(new TrackGroup(formatBuild));
        this.sampleData = uri.toString().getBytes(m5.c.f64119c);
        this.loadingFinished = new AtomicBoolean();
        this.loadingThrowable = new AtomicReference<>();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j10) {
        callback.onPrepared(this);
        i<?> iVarLoad = this.externalLoader.load(new ExternalLoader.LoadRequest(this.uri));
        this.loadingFuture = iVarLoad;
        q5.e.a(iVarLoad, new C0506a(), com.google.common.util.concurrent.c.a());
    }
}
