package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.y1;
import com.google.common.primitives.Ints;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UriUtil;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.DataSource;
import io.bidmachine.media3.datasource.DataSpec;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.SeekParameters;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import io.bidmachine.media3.exoplayer.source.BehindLiveWindowException;
import io.bidmachine.media3.exoplayer.source.chunk.BaseMediaChunkIterator;
import io.bidmachine.media3.exoplayer.source.chunk.Chunk;
import io.bidmachine.media3.exoplayer.source.chunk.DataChunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator;
import io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import io.bidmachine.media3.exoplayer.upstream.CmcdConfiguration;
import io.bidmachine.media3.exoplayer.upstream.CmcdData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class HlsChunkSource {
    public static final int CHUNK_PUBLICATION_STATE_PRELOAD = 0;
    public static final int CHUNK_PUBLICATION_STATE_PUBLISHED = 1;
    public static final int CHUNK_PUBLICATION_STATE_REMOVED = 2;
    private static final int KEY_CACHE_SIZE = 4;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private final DataSource encryptionDataSource;

    @Nullable
    private Uri expectedPlaylistUrl;
    private final HlsExtractorFactory extractorFactory;

    @Nullable
    private IOException fatalError;
    private boolean independentSegments;
    private boolean isPrimaryTimestampSource;
    private final DataSource mediaDataSource;

    @Nullable
    private final List<Format> muxedCaptionFormats;
    private final PlayerId playerId;
    private final Format[] playlistFormats;
    private final HlsPlaylistTracker playlistTracker;
    private final Uri[] playlistUrls;
    private boolean seenExpectedPlaylistError;
    private final long timestampAdjusterInitializationTimeoutMs;
    private final TimestampAdjusterProvider timestampAdjusterProvider;
    private final TrackGroup trackGroup;
    private ExoTrackSelection trackSelection;
    private long lastChunkRequestRealtimeMs = -9223372036854775807L;
    private final FullSegmentEncryptionKeyCache keyCache = new FullSegmentEncryptionKeyCache(4);
    private byte[] scratchSpace = Util.EMPTY_BYTE_ARRAY;
    private long liveEdgeInPeriodTimeUs = -9223372036854775807L;

    public static final class a extends DataChunk {
        private byte[] result;

        public a(DataSource dataSource, DataSpec dataSpec, Format format, int i10, @Nullable Object obj, byte[] bArr) {
            super(dataSource, dataSpec, 3, format, i10, obj, bArr);
        }

        @Nullable
        public byte[] getResult() {
            return this.result;
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.DataChunk
        public void consume(byte[] bArr, int i10) {
            this.result = Arrays.copyOf(bArr, i10);
        }
    }

    public static final class c extends BaseTrackSelection {
        private int selectedIndex;

        @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
        public /* bridge */ /* synthetic */ long getLatestBitrateEstimate() {
            return super.getLatestBitrateEstimate();
        }

        @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
        @Nullable
        public Object getSelectionData() {
            return null;
        }

        @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return 0;
        }

        @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
        public /* bridge */ /* synthetic */ void onDiscontinuity() {
            super.onDiscontinuity();
        }

        @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
        public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10) {
            super.onPlayWhenReadyChanged(z10);
        }

        @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
        public /* bridge */ /* synthetic */ void onRebuffer() {
            super.onRebuffer();
        }

        @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
        public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j10, Chunk chunk, List list) {
            return super.shouldCancelChunkLoad(j10, chunk, list);
        }

        @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return this.selectedIndex;
        }

        public c(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.selectedIndex = indexOf(trackGroup.getFormat(iArr[0]));
        }

        @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j10, long j11, long j12, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (!isTrackExcluded(this.selectedIndex, jElapsedRealtime)) {
                return;
            }
            for (int i10 = this.length - 1; i10 >= 0; i10--) {
                if (!isTrackExcluded(i10, jElapsedRealtime)) {
                    this.selectedIndex = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    private Pair<Long, Integer> getNextMediaSequenceAndPartIndex(@Nullable io.bidmachine.media3.exoplayer.hls.a aVar, boolean z10, HlsMediaPlaylist hlsMediaPlaylist, long j10, long j11) {
        int i10 = -1;
        if (aVar != null && !z10) {
            if (!aVar.isLoadCompleted()) {
                return new Pair<>(Long.valueOf(aVar.chunkIndex), Integer.valueOf(aVar.partIndex));
            }
            Long lValueOf = Long.valueOf(aVar.partIndex == -1 ? aVar.getNextChunkIndex() : aVar.chunkIndex);
            int i11 = aVar.partIndex;
            return new Pair<>(lValueOf, Integer.valueOf(i11 != -1 ? i11 + 1 : -1));
        }
        long j12 = hlsMediaPlaylist.durationUs + j10;
        if (aVar != null && !this.independentSegments) {
            j11 = aVar.startTimeUs;
        }
        if (!hlsMediaPlaylist.hasEndTag && j11 >= j12) {
            return new Pair<>(Long.valueOf(hlsMediaPlaylist.mediaSequence + ((long) hlsMediaPlaylist.segments.size())), -1);
        }
        long j13 = j11 - j10;
        int iBinarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) hlsMediaPlaylist.segments, Long.valueOf(j13), true, !this.playlistTracker.isLive() || aVar == null);
        long j14 = ((long) iBinarySearchFloor) + hlsMediaPlaylist.mediaSequence;
        if (iBinarySearchFloor >= 0) {
            HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(iBinarySearchFloor);
            List<HlsMediaPlaylist.Part> list = j13 < segment.relativeStartTimeUs + segment.durationUs ? segment.parts : hlsMediaPlaylist.trailingParts;
            for (int i12 = 0; i12 < list.size(); i12++) {
                HlsMediaPlaylist.Part part = list.get(i12);
                if (j13 < part.relativeStartTimeUs + part.durationUs) {
                    if (!part.isIndependent) {
                        break;
                    }
                    j14 += list == hlsMediaPlaylist.trailingParts ? 1L : 0L;
                    i10 = i12;
                    break;
                }
            }
        }
        return new Pair<>(Long.valueOf(j14), Integer.valueOf(i10));
    }

    @Nullable
    private Chunk maybeCreateEncryptionChunkFor(@Nullable Uri uri, int i10, boolean z10, @Nullable CmcdData.Factory factory) {
        if (uri == null) {
            return null;
        }
        byte[] bArrRemove = this.keyCache.remove(uri);
        if (bArrRemove != null) {
            this.keyCache.put(uri, bArrRemove);
            return null;
        }
        DataSpec dataSpecBuild = new DataSpec.Builder().setUri(uri).setFlags(1).build();
        if (factory != null) {
            if (z10) {
                factory.setObjectType("i");
            }
            dataSpecBuild = factory.createCmcdData().addToDataSpec(dataSpecBuild);
        }
        return new a(this.encryptionDataSource, dataSpecBuild, this.playlistFormats[i10], this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), this.scratchSpace);
    }

    public boolean onPlaylistError(Uri uri, long j10) {
        int iIndexOf;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.playlistUrls;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (iIndexOf = this.trackSelection.indexOf(i10)) == -1) {
            return true;
        }
        this.seenExpectedPlaylistError |= uri.equals(this.expectedPlaylistUrl);
        return j10 == -9223372036854775807L || (this.trackSelection.excludeTrack(iIndexOf, j10) && this.playlistTracker.excludeMediaPlaylist(uri, j10));
    }

    public static final class HlsChunkHolder {

        @Nullable
        public Chunk chunk;
        public boolean endOfStream;

        @Nullable
        public Uri playlistUrl;

        public void clear() {
            this.chunk = null;
            this.endOfStream = false;
            this.playlistUrl = null;
        }

        public HlsChunkHolder() {
            clear();
        }
    }

    @VisibleForTesting
    public static final class b extends BaseMediaChunkIterator {
        private final String playlistBaseUri;
        private final List<HlsMediaPlaylist.SegmentBase> segmentBases;
        private final long startOfPlaylistInPeriodUs;

        public b(String str, long j10, List<HlsMediaPlaylist.SegmentBase> list) {
            super(0L, list.size() - 1);
            this.playlistBaseUri = str;
            this.startOfPlaylistInPeriodUs = j10;
            this.segmentBases = list;
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.BaseMediaChunkIterator, io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            checkInBounds();
            HlsMediaPlaylist.SegmentBase segmentBase = this.segmentBases.get((int) getCurrentIndex());
            return this.startOfPlaylistInPeriodUs + segmentBase.relativeStartTimeUs + segmentBase.durationUs;
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.BaseMediaChunkIterator, io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.startOfPlaylistInPeriodUs + this.segmentBases.get((int) getCurrentIndex()).relativeStartTimeUs;
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.BaseMediaChunkIterator, io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            HlsMediaPlaylist.SegmentBase segmentBase = this.segmentBases.get((int) getCurrentIndex());
            return new DataSpec(UriUtil.resolveToUri(this.playlistBaseUri, segmentBase.url), segmentBase.byteRangeOffset, segmentBase.byteRangeLength);
        }
    }

    public static final class d {
        public final boolean isPreload;
        public final long mediaSequence;
        public final int partIndex;
        public final HlsMediaPlaylist.SegmentBase segmentBase;

        public d(HlsMediaPlaylist.SegmentBase segmentBase, long j10, int i10) {
            boolean z10;
            this.segmentBase = segmentBase;
            this.mediaSequence = j10;
            this.partIndex = i10;
            if ((segmentBase instanceof HlsMediaPlaylist.Part) && ((HlsMediaPlaylist.Part) segmentBase).isPreload) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.isPreload = z10;
        }
    }

    private void deactivatePlaylistForSelectedTrack() {
        this.playlistTracker.deactivatePlaylistForPlayback(this.playlistUrls[this.trackSelection.getSelectedIndexInTrackGroup()]);
    }

    @Nullable
    private static Uri getFullEncryptionKeyUri(HlsMediaPlaylist hlsMediaPlaylist, @Nullable HlsMediaPlaylist.SegmentBase segmentBase) {
        String str;
        if (segmentBase == null || (str = segmentBase.fullSegmentEncryptionKeyUri) == null) {
            return null;
        }
        return UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, str);
    }

    private boolean getIsMuxedAudioAndVideo() {
        Format format = this.trackGroup.getFormat(this.trackSelection.getSelectedIndex());
        return (MimeTypes.getAudioMediaMimeType(format.codecs) == null || MimeTypes.getVideoMediaMimeType(format.codecs) == null) ? false : true;
    }

    @Nullable
    private static d getNextSegmentHolder(HlsMediaPlaylist hlsMediaPlaylist, long j10, int i10) {
        int i11 = (int) (j10 - hlsMediaPlaylist.mediaSequence);
        if (i11 == hlsMediaPlaylist.segments.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < hlsMediaPlaylist.trailingParts.size()) {
                return new d(hlsMediaPlaylist.trailingParts.get(i10), j10, i10);
            }
            return null;
        }
        HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i11);
        if (i10 == -1) {
            return new d(segment, j10, -1);
        }
        if (i10 < segment.parts.size()) {
            return new d(segment.parts.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < hlsMediaPlaylist.segments.size()) {
            return new d(hlsMediaPlaylist.segments.get(i12), j10 + 1, -1);
        }
        if (hlsMediaPlaylist.trailingParts.isEmpty()) {
            return null;
        }
        return new d(hlsMediaPlaylist.trailingParts.get(0), j10 + 1, 0);
    }

    @VisibleForTesting
    public static List<HlsMediaPlaylist.SegmentBase> getSegmentBaseList(HlsMediaPlaylist hlsMediaPlaylist, long j10, int i10) {
        int i11 = (int) (j10 - hlsMediaPlaylist.mediaSequence);
        if (i11 < 0 || hlsMediaPlaylist.segments.size() < i11) {
            return ImmutableList.of();
        }
        ArrayList arrayList = new ArrayList();
        if (i11 < hlsMediaPlaylist.segments.size()) {
            if (i10 != -1) {
                HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i11);
                if (i10 == 0) {
                    arrayList.add(segment);
                } else if (i10 < segment.parts.size()) {
                    List<HlsMediaPlaylist.Part> list = segment.parts;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List<HlsMediaPlaylist.Segment> list2 = hlsMediaPlaylist.segments;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (hlsMediaPlaylist.partTargetDurationUs != -9223372036854775807L) {
            int i12 = i10 != -1 ? i10 : 0;
            if (i12 < hlsMediaPlaylist.trailingParts.size()) {
                List<HlsMediaPlaylist.Part> list3 = hlsMediaPlaylist.trailingParts;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private long resolveTimeToLiveEdgeUs(long j10) {
        long j11 = this.liveEdgeInPeriodTimeUs;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private void updateLiveEdgeTimeUs(HlsMediaPlaylist hlsMediaPlaylist) {
        this.liveEdgeInPeriodTimeUs = hlsMediaPlaylist.hasEndTag ? -9223372036854775807L : hlsMediaPlaylist.getEndTimeUs() - this.playlistTracker.getInitialStartTimeUs();
    }

    public MediaChunkIterator[] createMediaChunkIterators(@Nullable io.bidmachine.media3.exoplayer.hls.a aVar, long j10) {
        int i10;
        int iIndexOf = aVar == null ? -1 : this.trackGroup.indexOf(aVar.trackFormat);
        int length = this.trackSelection.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new MediaChunkIterator[length];
        boolean z10 = false;
        int i11 = 0;
        while (i11 < length) {
            int indexInTrackGroup = this.trackSelection.getIndexInTrackGroup(i11);
            Uri uri = this.playlistUrls[indexInTrackGroup];
            if (this.playlistTracker.isSnapshotValid(uri)) {
                HlsMediaPlaylist playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(uri, z10);
                Assertions.checkNotNull(playlistSnapshot);
                long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
                i10 = i11;
                Pair<Long, Integer> nextMediaSequenceAndPartIndex = getNextMediaSequenceAndPartIndex(aVar, indexInTrackGroup != iIndexOf ? true : z10, playlistSnapshot, initialStartTimeUs, j10);
                mediaChunkIteratorArr[i10] = new b(playlistSnapshot.baseUri, initialStartTimeUs, getSegmentBaseList(playlistSnapshot, ((Long) nextMediaSequenceAndPartIndex.first).longValue(), ((Integer) nextMediaSequenceAndPartIndex.second).intValue()));
            } else {
                mediaChunkIteratorArr[i11] = MediaChunkIterator.EMPTY;
                i10 = i11;
            }
            i11 = i10 + 1;
            z10 = false;
        }
        return mediaChunkIteratorArr;
    }

    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        int selectedIndex = this.trackSelection.getSelectedIndex();
        Uri[] uriArr = this.playlistUrls;
        HlsMediaPlaylist playlistSnapshot = (selectedIndex >= uriArr.length || selectedIndex == -1) ? null : this.playlistTracker.getPlaylistSnapshot(uriArr[this.trackSelection.getSelectedIndexInTrackGroup()], true);
        if (playlistSnapshot == null || playlistSnapshot.segments.isEmpty() || !playlistSnapshot.hasIndependentSegments) {
            return j10;
        }
        long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
        long j11 = j10 - initialStartTimeUs;
        int iBinarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) playlistSnapshot.segments, Long.valueOf(j11), true, true);
        long j12 = playlistSnapshot.segments.get(iBinarySearchFloor).relativeStartTimeUs;
        return seekParameters.resolveSeekPositionUs(j11, j12, iBinarySearchFloor != playlistSnapshot.segments.size() - 1 ? playlistSnapshot.segments.get(iBinarySearchFloor + 1).relativeStartTimeUs : j12) + initialStartTimeUs;
    }

    public int getChunkPublicationState(io.bidmachine.media3.exoplayer.hls.a aVar) {
        if (aVar.partIndex == -1) {
            return 1;
        }
        HlsMediaPlaylist hlsMediaPlaylist = (HlsMediaPlaylist) Assertions.checkNotNull(this.playlistTracker.getPlaylistSnapshot(this.playlistUrls[this.trackGroup.indexOf(aVar.trackFormat)], false));
        int i10 = (int) (aVar.chunkIndex - hlsMediaPlaylist.mediaSequence);
        if (i10 < 0) {
            return 1;
        }
        List<HlsMediaPlaylist.Part> list = i10 < hlsMediaPlaylist.segments.size() ? hlsMediaPlaylist.segments.get(i10).parts : hlsMediaPlaylist.trailingParts;
        if (aVar.partIndex >= list.size()) {
            return 2;
        }
        HlsMediaPlaylist.Part part = list.get(aVar.partIndex);
        if (part.isPreload) {
            return 0;
        }
        return Util.areEqual(Uri.parse(UriUtil.resolve(hlsMediaPlaylist.baseUri, part.url)), aVar.dataSpec.uri) ? 1 : 2;
    }

    public void getNextChunk(LoadingInfo loadingInfo, long j10, List<io.bidmachine.media3.exoplayer.hls.a> list, boolean z10, HlsChunkHolder hlsChunkHolder) {
        HlsMediaPlaylist hlsMediaPlaylist;
        int i10;
        long initialStartTimeUs;
        Uri uri;
        CmcdData.Factory objectType;
        io.bidmachine.media3.exoplayer.hls.a aVar = list.isEmpty() ? null : (io.bidmachine.media3.exoplayer.hls.a) y1.f(list);
        int iIndexOf = aVar == null ? -1 : this.trackGroup.indexOf(aVar.trackFormat);
        long j11 = loadingInfo.playbackPositionUs;
        long jMax = j10 - j11;
        long jResolveTimeToLiveEdgeUs = resolveTimeToLiveEdgeUs(j11);
        if (aVar != null && !this.independentSegments) {
            long durationUs = aVar.getDurationUs();
            jMax = Math.max(0L, jMax - durationUs);
            if (jResolveTimeToLiveEdgeUs != -9223372036854775807L) {
                jResolveTimeToLiveEdgeUs = Math.max(0L, jResolveTimeToLiveEdgeUs - durationUs);
            }
        }
        long j12 = jResolveTimeToLiveEdgeUs;
        long j13 = jMax;
        this.trackSelection.updateSelectedTrack(j11, j13, j12, list, createMediaChunkIterators(aVar, j10));
        int selectedIndexInTrackGroup = this.trackSelection.getSelectedIndexInTrackGroup();
        boolean z11 = iIndexOf != selectedIndexInTrackGroup;
        Uri uri2 = this.playlistUrls[selectedIndexInTrackGroup];
        if (!this.playlistTracker.isSnapshotValid(uri2)) {
            hlsChunkHolder.playlistUrl = uri2;
            this.seenExpectedPlaylistError &= uri2.equals(this.expectedPlaylistUrl);
            this.expectedPlaylistUrl = uri2;
            return;
        }
        HlsMediaPlaylist playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(uri2, true);
        Assertions.checkNotNull(playlistSnapshot);
        this.independentSegments = playlistSnapshot.hasIndependentSegments;
        updateLiveEdgeTimeUs(playlistSnapshot);
        long initialStartTimeUs2 = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
        int i11 = iIndexOf;
        Pair<Long, Integer> nextMediaSequenceAndPartIndex = getNextMediaSequenceAndPartIndex(aVar, z11, playlistSnapshot, initialStartTimeUs2, j10);
        long jLongValue = ((Long) nextMediaSequenceAndPartIndex.first).longValue();
        int iIntValue = ((Integer) nextMediaSequenceAndPartIndex.second).intValue();
        if (jLongValue >= playlistSnapshot.mediaSequence || aVar == null || !z11) {
            hlsMediaPlaylist = playlistSnapshot;
            i10 = selectedIndexInTrackGroup;
            initialStartTimeUs = initialStartTimeUs2;
            uri = uri2;
        } else {
            Uri uri3 = this.playlistUrls[i11];
            HlsMediaPlaylist playlistSnapshot2 = this.playlistTracker.getPlaylistSnapshot(uri3, true);
            Assertions.checkNotNull(playlistSnapshot2);
            initialStartTimeUs = playlistSnapshot2.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
            Pair<Long, Integer> nextMediaSequenceAndPartIndex2 = getNextMediaSequenceAndPartIndex(aVar, false, playlistSnapshot2, initialStartTimeUs, j10);
            jLongValue = ((Long) nextMediaSequenceAndPartIndex2.first).longValue();
            iIntValue = ((Integer) nextMediaSequenceAndPartIndex2.second).intValue();
            i10 = i11;
            uri = uri3;
            hlsMediaPlaylist = playlistSnapshot2;
        }
        if (i10 != i11 && i11 != -1) {
            this.playlistTracker.deactivatePlaylistForPlayback(this.playlistUrls[i11]);
        }
        if (jLongValue < hlsMediaPlaylist.mediaSequence) {
            this.fatalError = new BehindLiveWindowException();
            return;
        }
        d nextSegmentHolder = getNextSegmentHolder(hlsMediaPlaylist, jLongValue, iIntValue);
        if (nextSegmentHolder == null) {
            if (!hlsMediaPlaylist.hasEndTag) {
                hlsChunkHolder.playlistUrl = uri;
                this.seenExpectedPlaylistError &= uri.equals(this.expectedPlaylistUrl);
                this.expectedPlaylistUrl = uri;
                return;
            } else {
                if (z10 || hlsMediaPlaylist.segments.isEmpty()) {
                    hlsChunkHolder.endOfStream = true;
                    return;
                }
                nextSegmentHolder = new d((HlsMediaPlaylist.SegmentBase) y1.f(hlsMediaPlaylist.segments), (hlsMediaPlaylist.mediaSequence + ((long) hlsMediaPlaylist.segments.size())) - 1, -1);
            }
        }
        this.seenExpectedPlaylistError = false;
        this.expectedPlaylistUrl = null;
        if (this.cmcdConfiguration != null) {
            objectType = new CmcdData.Factory(this.cmcdConfiguration, this.trackSelection, Math.max(0L, j13), loadingInfo.playbackSpeed, "h", !hlsMediaPlaylist.hasEndTag, loadingInfo.rebufferedSince(this.lastChunkRequestRealtimeMs), list.isEmpty()).setObjectType(getIsMuxedAudioAndVideo() ? "av" : CmcdData.Factory.getObjectType(this.trackSelection));
            int i12 = nextSegmentHolder.partIndex;
            d nextSegmentHolder2 = getNextSegmentHolder(hlsMediaPlaylist, i12 == -1 ? nextSegmentHolder.mediaSequence + 1 : nextSegmentHolder.mediaSequence, i12 == -1 ? -1 : i12 + 1);
            if (nextSegmentHolder2 != null) {
                objectType.setNextObjectRequest(UriUtil.getRelativePath(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, nextSegmentHolder.segmentBase.url), UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, nextSegmentHolder2.segmentBase.url)));
                String string = nextSegmentHolder2.segmentBase.byteRangeOffset + "-";
                if (nextSegmentHolder2.segmentBase.byteRangeLength != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    HlsMediaPlaylist.SegmentBase segmentBase = nextSegmentHolder2.segmentBase;
                    sb2.append(segmentBase.byteRangeOffset + segmentBase.byteRangeLength);
                    string = sb2.toString();
                }
                objectType.setNextRangeRequest(string);
            }
        } else {
            objectType = null;
        }
        this.lastChunkRequestRealtimeMs = SystemClock.elapsedRealtime();
        Uri fullEncryptionKeyUri = getFullEncryptionKeyUri(hlsMediaPlaylist, nextSegmentHolder.segmentBase.initializationSegment);
        Chunk chunkMaybeCreateEncryptionChunkFor = maybeCreateEncryptionChunkFor(fullEncryptionKeyUri, i10, true, objectType);
        hlsChunkHolder.chunk = chunkMaybeCreateEncryptionChunkFor;
        if (chunkMaybeCreateEncryptionChunkFor != null) {
            return;
        }
        Uri fullEncryptionKeyUri2 = getFullEncryptionKeyUri(hlsMediaPlaylist, nextSegmentHolder.segmentBase);
        Chunk chunkMaybeCreateEncryptionChunkFor2 = maybeCreateEncryptionChunkFor(fullEncryptionKeyUri2, i10, false, objectType);
        hlsChunkHolder.chunk = chunkMaybeCreateEncryptionChunkFor2;
        if (chunkMaybeCreateEncryptionChunkFor2 != null) {
            return;
        }
        boolean zShouldSpliceIn = io.bidmachine.media3.exoplayer.hls.a.shouldSpliceIn(aVar, uri, hlsMediaPlaylist, nextSegmentHolder, initialStartTimeUs);
        if (zShouldSpliceIn && nextSegmentHolder.isPreload) {
            return;
        }
        hlsChunkHolder.chunk = io.bidmachine.media3.exoplayer.hls.a.createInstance(this.extractorFactory, this.mediaDataSource, this.playlistFormats[i10], initialStartTimeUs, hlsMediaPlaylist, nextSegmentHolder, uri, this.muxedCaptionFormats, this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), this.isPrimaryTimestampSource, this.timestampAdjusterProvider, this.timestampAdjusterInitializationTimeoutMs, aVar, this.keyCache.get(fullEncryptionKeyUri2), this.keyCache.get(fullEncryptionKeyUri), zShouldSpliceIn, this.playerId, objectType);
    }

    public int getPreferredQueueSize(long j10, List<? extends MediaChunk> list) {
        return (this.fatalError != null || this.trackSelection.length() < 2) ? list.size() : this.trackSelection.evaluateQueueSize(j10, list);
    }

    public TrackGroup getTrackGroup() {
        return this.trackGroup;
    }

    public ExoTrackSelection getTrackSelection() {
        return this.trackSelection;
    }

    public boolean hasIndependentSegments() {
        return this.independentSegments;
    }

    public boolean maybeExcludeTrack(Chunk chunk, long j10) {
        ExoTrackSelection exoTrackSelection = this.trackSelection;
        return exoTrackSelection.excludeTrack(exoTrackSelection.indexOf(this.trackGroup.indexOf(chunk.trackFormat)), j10);
    }

    public void maybeThrowError() throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.expectedPlaylistUrl;
        if (uri == null || !this.seenExpectedPlaylistError) {
            return;
        }
        this.playlistTracker.maybeThrowPlaylistRefreshError(uri);
    }

    public boolean obtainsChunksForPlaylist(Uri uri) {
        return Util.contains(this.playlistUrls, uri);
    }

    public void onChunkLoadCompleted(Chunk chunk) {
        if (chunk instanceof a) {
            a aVar = (a) chunk;
            this.scratchSpace = aVar.getDataHolder();
            this.keyCache.put(aVar.dataSpec.uri, (byte[]) Assertions.checkNotNull(aVar.getResult()));
        }
    }

    public void setIsPrimaryTimestampSource(boolean z10) {
        this.isPrimaryTimestampSource = z10;
    }

    public boolean shouldCancelLoad(long j10, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j10, chunk, list);
    }

    public HlsChunkSource(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, Format[] formatArr, HlsDataSourceFactory hlsDataSourceFactory, @Nullable TransferListener transferListener, TimestampAdjusterProvider timestampAdjusterProvider, long j10, @Nullable List<Format> list, PlayerId playerId, @Nullable CmcdConfiguration cmcdConfiguration) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.playlistUrls = uriArr;
        this.playlistFormats = formatArr;
        this.timestampAdjusterProvider = timestampAdjusterProvider;
        this.timestampAdjusterInitializationTimeoutMs = j10;
        this.muxedCaptionFormats = list;
        this.playerId = playerId;
        this.cmcdConfiguration = cmcdConfiguration;
        DataSource dataSourceCreateDataSource = hlsDataSourceFactory.createDataSource(1);
        this.mediaDataSource = dataSourceCreateDataSource;
        if (transferListener != null) {
            dataSourceCreateDataSource.addTransferListener(transferListener);
        }
        this.encryptionDataSource = hlsDataSourceFactory.createDataSource(3);
        this.trackGroup = new TrackGroup(formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((formatArr[i10].roleFlags & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.trackSelection = new c(this.trackGroup, Ints.n(arrayList));
    }

    public void reset() {
        deactivatePlaylistForSelectedTrack();
        this.fatalError = null;
    }

    public void setTrackSelection(ExoTrackSelection exoTrackSelection) {
        deactivatePlaylistForSelectedTrack();
        this.trackSelection = exoTrackSelection;
    }
}
