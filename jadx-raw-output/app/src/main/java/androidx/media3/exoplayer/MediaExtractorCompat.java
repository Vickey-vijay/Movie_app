package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.mp4.Mp4Extractor;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@UnstableApi
public final class MediaExtractorCompat {
    public static final int SEEK_TO_CLOSEST_SYNC = 2;
    public static final int SEEK_TO_NEXT_SYNC = 1;
    public static final int SEEK_TO_PREVIOUS_SYNC = 0;
    private static final String TAG = "MediaExtractorCompat";
    private final Allocator allocator;

    @Nullable
    private DataSource currentDataSource;

    @Nullable
    private Extractor currentExtractor;

    @Nullable
    private ExtractorInput currentExtractorInput;
    private final DataSource.Factory dataSourceFactory;
    private final ExtractorsFactory extractorsFactory;
    private final FormatHolder formatHolder;
    private boolean hasBeenPrepared;
    private final DecoderInputBuffer noDataBuffer;
    private long offsetInCurrentFile;

    @Nullable
    private SeekPoint pendingSeek;
    private final PositionHolder positionHolder;
    private final DecoderInputBuffer sampleHolder;
    private final SparseArray<MediaExtractorSampleQueue> sampleQueues;

    @Nullable
    private SeekMap seekMap;
    private final Set<Integer> selectedTrackIndices;
    private final ArrayDeque<Integer> trackIndicesPerSampleInQueuedOrder;
    private final ArrayList<MediaExtractorTrack> tracks;
    private boolean tracksEnded;
    private int upstreamFormatsCount;

    public final class ExtractorOutputImpl implements ExtractorOutput {
        private ExtractorOutputImpl() {
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void endTracks() {
            MediaExtractorCompat.this.tracksEnded = true;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
            MediaExtractorCompat.this.seekMap = seekMap;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public TrackOutput track(int i10, int i11) {
            MediaExtractorSampleQueue mediaExtractorSampleQueue = (MediaExtractorSampleQueue) MediaExtractorCompat.this.sampleQueues.get(i10);
            if (mediaExtractorSampleQueue != null) {
                return mediaExtractorSampleQueue;
            }
            if (MediaExtractorCompat.this.tracksEnded) {
                return new DiscardingTrackOutput();
            }
            MediaExtractorCompat mediaExtractorCompat = MediaExtractorCompat.this;
            MediaExtractorSampleQueue mediaExtractorSampleQueue2 = mediaExtractorCompat.new MediaExtractorSampleQueue(mediaExtractorCompat.allocator, i10);
            MediaExtractorCompat.this.sampleQueues.put(i10, mediaExtractorSampleQueue2);
            return mediaExtractorSampleQueue2;
        }
    }

    public final class MediaExtractorSampleQueue extends SampleQueue {
        private int compatibilityTrackIndex;
        private int mainTrackIndex;
        public final int trackId;

        public String toString() {
            return String.format("trackId: %s, mainTrackIndex: %s, compatibilityTrackIndex: %s", Integer.valueOf(this.trackId), Integer.valueOf(this.mainTrackIndex), Integer.valueOf(this.compatibilityTrackIndex));
        }

        public MediaExtractorSampleQueue(Allocator allocator, int i10) {
            super(allocator, null, null);
            this.trackId = i10;
            this.mainTrackIndex = -1;
            this.compatibilityTrackIndex = -1;
        }

        public void setCompatibilityTrackIndex(int i10) {
            this.compatibilityTrackIndex = i10;
        }

        public void setMainTrackIndex(int i10) {
            this.mainTrackIndex = i10;
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue
        public Format getAdjustedUpstreamFormat(Format format) {
            if (getUpstreamFormat() == null) {
                MediaExtractorCompat.this.onSampleQueueFormatInitialized(this, format);
            }
            return super.getAdjustedUpstreamFormat(format);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j10, int i10, int i11, int i12, @Nullable TrackOutput.CryptoData cryptoData) {
            boolean z10;
            int i13 = i10 & (-536870913);
            if (this.compatibilityTrackIndex != -1) {
                MediaExtractorCompat.this.trackIndicesPerSampleInQueuedOrder.addLast(Integer.valueOf(this.compatibilityTrackIndex));
            }
            if (this.mainTrackIndex != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Assertions.checkState(z10);
            MediaExtractorCompat.this.trackIndicesPerSampleInQueuedOrder.addLast(Integer.valueOf(this.mainTrackIndex));
            super.sampleMetadata(j10, i13, i11, i12, cryptoData);
        }
    }

    public static final class MediaExtractorTrack {

        @Nullable
        public final String compatibilityTrackMimeType;
        public final boolean isCompatibilityTrack;
        public final MediaExtractorSampleQueue sampleQueue;

        public String toString() {
            return String.format("MediaExtractorSampleQueue: %s, isCompatibilityTrack: %s, compatibilityTrackMimeType: %s", this.sampleQueue, Boolean.valueOf(this.isCompatibilityTrack), this.compatibilityTrackMimeType);
        }

        private MediaExtractorTrack(MediaExtractorSampleQueue mediaExtractorSampleQueue, boolean z10, @Nullable String str) {
            this.sampleQueue = mediaExtractorSampleQueue;
            this.isCompatibilityTrack = z10;
            this.compatibilityTrackMimeType = str;
        }

        public void discardFrontSample() {
            this.sampleQueue.skip(1);
            this.sampleQueue.discardToRead();
        }

        public int getIdOfBackingTrack() {
            return this.sampleQueue.trackId;
        }

        public MediaFormat createDownstreamMediaFormat(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer) {
            formatHolder.clear();
            this.sampleQueue.read(formatHolder, decoderInputBuffer, 2, false);
            MediaFormat mediaFormatCreateMediaFormatFromFormat = MediaFormatUtil.createMediaFormatFromFormat((Format) Assertions.checkNotNull(formatHolder.format));
            formatHolder.clear();
            if (this.compatibilityTrackMimeType != null) {
                if (Util.SDK_INT >= 29) {
                    mediaFormatCreateMediaFormatFromFormat.removeKey("codecs-string");
                }
                mediaFormatCreateMediaFormatFromFormat.setString("mime", this.compatibilityTrackMimeType);
            }
            return mediaFormatCreateMediaFormatFromFormat;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SeekMode {
    }

    public MediaExtractorCompat(Context context) {
        this(new DefaultExtractorsFactory(), new DefaultDataSource.Factory(context));
    }

    public void release() {
        for (int i10 = 0; i10 < this.sampleQueues.size(); i10++) {
            this.sampleQueues.valueAt(i10).release();
        }
        this.sampleQueues.clear();
        Extractor extractor = this.currentExtractor;
        if (extractor != null) {
            extractor.release();
            this.currentExtractor = null;
        }
        this.currentExtractorInput = null;
        this.pendingSeek = null;
        DataSourceUtil.closeQuietly(this.currentDataSource);
        this.currentDataSource = null;
    }

    public MediaExtractorCompat(ExtractorsFactory extractorsFactory, DataSource.Factory factory) {
        this.extractorsFactory = extractorsFactory;
        this.dataSourceFactory = factory;
        this.positionHolder = new PositionHolder();
        this.allocator = new DefaultAllocator(true, 65536);
        this.tracks = new ArrayList<>();
        this.sampleQueues = new SparseArray<>();
        this.trackIndicesPerSampleInQueuedOrder = new ArrayDeque<>();
        this.formatHolder = new FormatHolder();
        this.sampleHolder = new DecoderInputBuffer(0);
        this.noDataBuffer = DecoderInputBuffer.newNoDataInstance();
        this.selectedTrackIndices = new HashSet();
    }

    private boolean advanceToSampleOrEndOfInput() {
        try {
            maybeResolvePendingSeek();
            boolean z10 = false;
            while (true) {
                if (this.trackIndicesPerSampleInQueuedOrder.isEmpty()) {
                    if (z10) {
                        return false;
                    }
                    try {
                        int i10 = ((Extractor) Assertions.checkNotNull(this.currentExtractor)).read((ExtractorInput) Assertions.checkNotNull(this.currentExtractorInput), this.positionHolder);
                        if (i10 == -1) {
                            z10 = true;
                        } else if (i10 == 1) {
                            this.currentExtractorInput = reopenCurrentDataSource(this.positionHolder.position);
                        }
                    } catch (Exception | OutOfMemoryError e10) {
                        Log.w(TAG, "Treating exception as the end of input.", e10);
                    }
                } else {
                    if (this.selectedTrackIndices.contains(this.trackIndicesPerSampleInQueuedOrder.peekFirst())) {
                        return true;
                    }
                    skipOneSample();
                }
            }
        } catch (IOException e11) {
            Log.w(TAG, "Treating exception as the end of input.", e11);
            return false;
        }
    }

    private static DataSpec buildDataSpec(Uri uri, long j10) {
        return new DataSpec.Builder().setUri(uri).setPosition(j10).setFlags(6).build();
    }

    private void maybeResolvePendingSeek() throws IOException {
        SeekPoint seekPoint = this.pendingSeek;
        if (seekPoint == null) {
            return;
        }
        SeekPoint seekPoint2 = (SeekPoint) Assertions.checkNotNull(seekPoint);
        ((Extractor) Assertions.checkNotNull(this.currentExtractor)).seek(seekPoint2.position, seekPoint2.timeUs);
        this.currentExtractorInput = reopenCurrentDataSource(seekPoint2.position);
        this.pendingSeek = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void onSampleQueueFormatInitialized(MediaExtractorSampleQueue mediaExtractorSampleQueue, Format format) {
        boolean z10 = true;
        this.upstreamFormatsCount++;
        mediaExtractorSampleQueue.setMainTrackIndex(this.tracks.size());
        Object[] objArr = 0;
        this.tracks.add(new MediaExtractorTrack(mediaExtractorSampleQueue, false, null));
        String alternativeCodecMimeType = MediaCodecUtil.getAlternativeCodecMimeType(format);
        if (alternativeCodecMimeType != null) {
            mediaExtractorSampleQueue.setCompatibilityTrackIndex(this.tracks.size());
            this.tracks.add(new MediaExtractorTrack(mediaExtractorSampleQueue, z10, alternativeCodecMimeType));
        }
    }

    private void peekNextSelectedTrackSample(DecoderInputBuffer decoderInputBuffer, boolean z10) {
        MediaExtractorTrack mediaExtractorTrack = this.tracks.get(((Integer) Assertions.checkNotNull(this.trackIndicesPerSampleInQueuedOrder.peekFirst())).intValue());
        MediaExtractorSampleQueue mediaExtractorSampleQueue = mediaExtractorTrack.sampleQueue;
        int i10 = (z10 ? 4 : 0) | 1;
        int i11 = mediaExtractorSampleQueue.read(this.formatHolder, decoderInputBuffer, i10, false);
        if (i11 == -5) {
            i11 = mediaExtractorSampleQueue.read(this.formatHolder, decoderInputBuffer, i10, false);
        }
        this.formatHolder.clear();
        if (i11 != -4) {
            throw new IllegalStateException(Util.formatInvariant("Sample read result: %s\nTrack sample: %s\nTrackIndicesPerSampleInQueuedOrder: %s\nTracks added: %s\n", Integer.valueOf(i11), mediaExtractorTrack, this.trackIndicesPerSampleInQueuedOrder, this.tracks));
        }
    }

    private ExtractorInput reopenCurrentDataSource(long j10) throws IOException {
        DataSource dataSource = (DataSource) Assertions.checkNotNull(this.currentDataSource);
        Uri uri = (Uri) Assertions.checkNotNull(dataSource.getUri());
        DataSourceUtil.closeQuietly(dataSource);
        long jOpen = dataSource.open(buildDataSpec(uri, this.offsetInCurrentFile + j10));
        if (jOpen != -1) {
            jOpen += j10;
        }
        return new DefaultExtractorInput(dataSource, j10, jOpen);
    }

    private Extractor selectExtractor(ExtractorInput extractorInput) throws IOException {
        Extractor extractor;
        Extractor[] extractorArrCreateExtractors = this.extractorsFactory.createExtractors();
        int length = extractorArrCreateExtractors.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                extractor = null;
                break;
            }
            extractor = extractorArrCreateExtractors[i10];
            try {
                if (extractor.sniff(extractorInput)) {
                    extractorInput.resetPeekPosition();
                    break;
                }
                extractorInput.resetPeekPosition();
                i10++;
            } catch (EOFException unused) {
            } catch (Throwable th2) {
                extractorInput.resetPeekPosition();
                throw th2;
            }
        }
        if (extractor != null) {
            return extractor;
        }
        throw new UnrecognizedInputFormatException("None of the available extractors (" + m5.f.g(", ").d(Lists.m(ImmutableList.copyOf(extractorArrCreateExtractors), new m5.e() { // from class: androidx.media3.exoplayer.q1
            @Override // m5.e
            public final Object apply(Object obj) {
                return MediaExtractorCompat.lambda$selectExtractor$0((Extractor) obj);
            }
        })) + ") could read the stream.", (Uri) Assertions.checkNotNull(((DataSource) Assertions.checkNotNull(this.currentDataSource)).getUri()), ImmutableList.of());
    }

    private void skipOneSample() {
        MediaExtractorTrack mediaExtractorTrack = this.tracks.get(this.trackIndicesPerSampleInQueuedOrder.removeFirst().intValue());
        if (mediaExtractorTrack.isCompatibilityTrack) {
            return;
        }
        mediaExtractorTrack.discardFrontSample();
    }

    @VisibleForTesting(otherwise = 5)
    public Allocator getAllocator() {
        return this.allocator;
    }

    public int getTrackCount() {
        return this.tracks.size();
    }

    public MediaFormat getTrackFormat(int i10) {
        return this.tracks.get(i10).createDownstreamMediaFormat(this.formatHolder, this.noDataBuffer);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    public void seekTo(long j10, int i10) {
        SeekMap.SeekPoints seekPoints;
        SeekPoint seekPoint;
        if (this.seekMap == null) {
            return;
        }
        if (this.selectedTrackIndices.size() == 1) {
            Extractor extractor = this.currentExtractor;
            if (extractor instanceof Mp4Extractor) {
                seekPoints = ((Mp4Extractor) extractor).getSeekPoints(j10, this.tracks.get(this.selectedTrackIndices.iterator().next().intValue()).getIdOfBackingTrack());
            } else {
                seekPoints = this.seekMap.getSeekPoints(j10);
            }
        } else {
            seekPoints = this.seekMap.getSeekPoints(j10);
        }
        if (i10 == 0) {
            seekPoint = seekPoints.first;
        } else if (i10 == 1) {
            seekPoint = seekPoints.second;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            seekPoint = Math.abs(j10 - seekPoints.second.timeUs) < Math.abs(j10 - seekPoints.first.timeUs) ? seekPoints.second : seekPoints.first;
        }
        this.trackIndicesPerSampleInQueuedOrder.clear();
        for (int i11 = 0; i11 < this.sampleQueues.size(); i11++) {
            this.sampleQueues.valueAt(i11).reset();
        }
        this.pendingSeek = seekPoint;
    }

    public void selectTrack(int i10) {
        this.selectedTrackIndices.add(Integer.valueOf(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDataSource(Uri uri, long j10) throws IOException {
        int i10;
        Assertions.checkState(!this.hasBeenPrepared);
        this.hasBeenPrepared = true;
        this.offsetInCurrentFile = j10;
        DataSpec dataSpecBuildDataSpec = buildDataSpec(uri, j10);
        DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
        this.currentDataSource = dataSourceCreateDataSource;
        ExtractorInput defaultExtractorInput = new DefaultExtractorInput(this.currentDataSource, 0L, dataSourceCreateDataSource.open(dataSpecBuildDataSpec));
        Extractor extractorSelectExtractor = selectExtractor(defaultExtractorInput);
        Throwable e10 = null;
        extractorSelectExtractor.init(new ExtractorOutputImpl());
        boolean z10 = true;
        while (z10) {
            try {
                i10 = extractorSelectExtractor.read(defaultExtractorInput, this.positionHolder);
            } catch (Exception | OutOfMemoryError e11) {
                e10 = e11;
                i10 = -1;
            }
            boolean z11 = !this.tracksEnded || this.upstreamFormatsCount < this.sampleQueues.size() || this.seekMap == null;
            if (e10 != null || (z11 && i10 == -1)) {
                release();
                throw ParserException.createForMalformedContainer(e10 != null ? "Exception encountered while parsing input media." : "Reached end of input before preparation completed.", e10);
            }
            if (i10 == 1) {
                defaultExtractorInput = reopenCurrentDataSource(this.positionHolder.position);
            }
            z10 = z11;
        }
        this.currentExtractorInput = defaultExtractorInput;
        this.currentExtractor = extractorSelectExtractor;
    }

    public void unselectTrack(int i10) {
        this.selectedTrackIndices.remove(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$selectExtractor$0(Extractor extractor) {
        return extractor.getUnderlyingImplementation().getClass().getSimpleName();
    }

    public boolean advance() {
        if (!advanceToSampleOrEndOfInput()) {
            return false;
        }
        skipOneSample();
        return advanceToSampleOrEndOfInput();
    }

    public int getSampleFlags() {
        int i10;
        if (!advanceToSampleOrEndOfInput()) {
            return -1;
        }
        peekNextSelectedTrackSample(this.noDataBuffer, true);
        if (this.noDataBuffer.isEncrypted()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        return i10 | 0 | (this.noDataBuffer.isKeyFrame() ? 1 : 0);
    }

    public long getSampleTime() {
        if (!advanceToSampleOrEndOfInput()) {
            return -1L;
        }
        peekNextSelectedTrackSample(this.noDataBuffer, true);
        return this.noDataBuffer.timeUs;
    }

    public int getSampleTrackIndex() {
        if (!advanceToSampleOrEndOfInput()) {
            return -1;
        }
        return this.trackIndicesPerSampleInQueuedOrder.peekFirst().intValue();
    }

    public int readSampleData(ByteBuffer byteBuffer, int i10) {
        if (!advanceToSampleOrEndOfInput()) {
            return -1;
        }
        byteBuffer.position(i10);
        byteBuffer.limit(byteBuffer.capacity());
        DecoderInputBuffer decoderInputBuffer = this.sampleHolder;
        decoderInputBuffer.data = byteBuffer;
        peekNextSelectedTrackSample(decoderInputBuffer, false);
        byteBuffer.flip();
        byteBuffer.position(i10);
        this.sampleHolder.data = null;
        return byteBuffer.remaining();
    }
}
