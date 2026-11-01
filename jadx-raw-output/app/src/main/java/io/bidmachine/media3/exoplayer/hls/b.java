package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.Label;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.SeekParameters;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener;
import io.bidmachine.media3.exoplayer.drm.DrmSessionManager;
import io.bidmachine.media3.exoplayer.hls.HlsSampleStreamWrapper;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import io.bidmachine.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import io.bidmachine.media3.exoplayer.source.MediaPeriod;
import io.bidmachine.media3.exoplayer.source.MediaSourceEventListener;
import io.bidmachine.media3.exoplayer.source.SampleStream;
import io.bidmachine.media3.exoplayer.source.SequenceableLoader;
import io.bidmachine.media3.exoplayer.source.TrackGroupArray;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import io.bidmachine.media3.exoplayer.upstream.CmcdConfiguration;
import io.bidmachine.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import m5.e;

/* JADX INFO: compiled from: HlsMediaPeriod.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements MediaPeriod, HlsPlaylistTracker.PlaylistEventListener {
    private final Allocator allocator;
    private final boolean allowChunklessPreparation;
    private int audioVideoSampleStreamWrapperCount;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final HlsDataSourceFactory dataSourceFactory;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    private final HlsExtractorFactory extractorFactory;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;

    @Nullable
    private MediaPeriod.Callback mediaPeriodCallback;

    @Nullable
    private final TransferListener mediaTransferListener;
    private final int metadataType;
    private int pendingPrepareCount;
    private final PlayerId playerId;
    private final HlsPlaylistTracker playlistTracker;
    private final long timestampAdjusterInitializationTimeoutMs;
    private TrackGroupArray trackGroups;
    private final boolean useSessionKeys;
    private final HlsSampleStreamWrapper.Callback sampleStreamWrapperCallback = new C0505b();
    private final IdentityHashMap<SampleStream, Integer> streamWrapperIndices = new IdentityHashMap<>();
    private final TimestampAdjusterProvider timestampAdjusterProvider = new TimestampAdjusterProvider();
    private HlsSampleStreamWrapper[] sampleStreamWrappers = new HlsSampleStreamWrapper[0];
    private HlsSampleStreamWrapper[] enabledSampleStreamWrappers = new HlsSampleStreamWrapper[0];
    private int[][] manifestUrlIndicesPerWrapper = new int[0][];

    /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.hls.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HlsMediaPeriod.java */
    public class C0505b implements HlsSampleStreamWrapper.Callback {
        private C0505b() {
        }

        @Override // io.bidmachine.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback, io.bidmachine.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
            b.this.mediaPeriodCallback.onContinueLoadingRequested(b.this);
        }

        @Override // io.bidmachine.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback
        public void onPlaylistRefreshRequired(Uri uri) {
            b.this.playlistTracker.refreshPlaylist(uri);
        }

        @Override // io.bidmachine.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback
        public void onPrepared() {
            if (b.access$106(b.this) > 0) {
                return;
            }
            int i10 = 0;
            for (HlsSampleStreamWrapper hlsSampleStreamWrapper : b.this.sampleStreamWrappers) {
                i10 += hlsSampleStreamWrapper.getTrackGroups().length;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i10];
            int i11 = 0;
            for (HlsSampleStreamWrapper hlsSampleStreamWrapper2 : b.this.sampleStreamWrappers) {
                int i12 = hlsSampleStreamWrapper2.getTrackGroups().length;
                int i13 = 0;
                while (i13 < i12) {
                    trackGroupArr[i11] = hlsSampleStreamWrapper2.getTrackGroups().get(i13);
                    i13++;
                    i11++;
                }
            }
            b.this.trackGroups = new TrackGroupArray(trackGroupArr);
            b.this.mediaPeriodCallback.onPrepared(b.this);
        }
    }

    public b(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, HlsDataSourceFactory hlsDataSourceFactory, @Nullable TransferListener transferListener, @Nullable CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, boolean z10, int i10, boolean z11, PlayerId playerId, long j10) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.dataSourceFactory = hlsDataSourceFactory;
        this.mediaTransferListener = transferListener;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.eventDispatcher = eventDispatcher2;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.allowChunklessPreparation = z10;
        this.metadataType = i10;
        this.useSessionKeys = z11;
        this.playerId = playerId;
        this.timestampAdjusterInitializationTimeoutMs = j10;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    public static /* synthetic */ int access$106(b bVar) {
        int i10 = bVar.pendingPrepareCount - 1;
        bVar.pendingPrepareCount = i10;
        return i10;
    }

    private void buildAndPrepareAudioSampleStreamWrappers(long j10, List<HlsMultivariantPlaylist.Rendition> list, List<HlsSampleStreamWrapper> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10).name;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (Util.areEqual(str, list.get(i11).name)) {
                        HlsMultivariantPlaylist.Rendition rendition = list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(rendition.url);
                        arrayList2.add(rendition.format);
                        z10 &= Util.getCodecCountOfType(rendition.format.codecs, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(str2, 1, (Uri[]) arrayList.toArray((Uri[]) Util.castNonNullTypeArray(new Uri[0])), (Format[]) arrayList2.toArray(new Format[0]), null, Collections.emptyList(), map, j10);
                list3.add(Ints.n(arrayList3));
                list2.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
                if (this.allowChunklessPreparation && z10) {
                    hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(new TrackGroup[]{new TrackGroup(str2, (Format[]) arrayList2.toArray(new Format[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void buildAndPrepareMainSampleStreamWrapper(HlsMultivariantPlaylist hlsMultivariantPlaylist, long j10, List<HlsSampleStreamWrapper> list, List<int[]> list2, Map<String, DrmInitData> map) {
        int i10;
        boolean z10;
        boolean z11;
        int size = hlsMultivariantPlaylist.variants.size();
        int[] iArr = new int[size];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < hlsMultivariantPlaylist.variants.size(); i13++) {
            Format format = hlsMultivariantPlaylist.variants.get(i13).format;
            if (format.height > 0 || Util.getCodecsOfType(format.codecs, 2) != null) {
                iArr[i13] = 2;
                i11++;
            } else if (Util.getCodecsOfType(format.codecs, 1) != null) {
                iArr[i13] = 1;
                i12++;
            } else {
                iArr[i13] = -1;
            }
        }
        if (i11 > 0) {
            i10 = i11;
            z11 = false;
            z10 = true;
        } else if (i12 < size) {
            i10 = size - i12;
            z10 = false;
            z11 = true;
        } else {
            i10 = size;
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[i10];
        Format[] formatArr = new Format[i10];
        int[] iArr2 = new int[i10];
        int i14 = 0;
        for (int i15 = 0; i15 < hlsMultivariantPlaylist.variants.size(); i15++) {
            if ((!z10 || iArr[i15] == 2) && (!z11 || iArr[i15] != 1)) {
                HlsMultivariantPlaylist.Variant variant = hlsMultivariantPlaylist.variants.get(i15);
                uriArr[i14] = variant.url;
                formatArr[i14] = variant.format;
                iArr2[i14] = i15;
                i14++;
            }
        }
        String str = formatArr[0].codecs;
        int codecCountOfType = Util.getCodecCountOfType(str, 2);
        int codecCountOfType2 = Util.getCodecCountOfType(str, 1);
        boolean z12 = (codecCountOfType2 == 1 || (codecCountOfType2 == 0 && hlsMultivariantPlaylist.audios.isEmpty())) && codecCountOfType <= 1 && codecCountOfType2 + codecCountOfType > 0;
        HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(C3426d4.i.Z, (z10 || codecCountOfType2 <= 0) ? 0 : 1, uriArr, formatArr, hlsMultivariantPlaylist.muxedAudioFormat, hlsMultivariantPlaylist.muxedCaptionFormats, map, j10);
        list.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
        list2.add(iArr2);
        if (this.allowChunklessPreparation && z12) {
            ArrayList arrayList = new ArrayList();
            if (codecCountOfType > 0) {
                Format[] formatArr2 = new Format[i10];
                for (int i16 = 0; i16 < i10; i16++) {
                    formatArr2[i16] = deriveVideoFormat(formatArr[i16]);
                }
                arrayList.add(new TrackGroup(C3426d4.i.Z, formatArr2));
                if (codecCountOfType2 > 0 && (hlsMultivariantPlaylist.muxedAudioFormat != null || hlsMultivariantPlaylist.audios.isEmpty())) {
                    arrayList.add(new TrackGroup(C3426d4.i.Z + ":audio", deriveAudioFormat(formatArr[0], hlsMultivariantPlaylist.muxedAudioFormat, false)));
                }
                List<Format> list3 = hlsMultivariantPlaylist.muxedCaptionFormats;
                if (list3 != null) {
                    for (int i17 = 0; i17 < list3.size(); i17++) {
                        arrayList.add(new TrackGroup(C3426d4.i.Z + ":cc:" + i17, this.extractorFactory.getOutputTextFormat(list3.get(i17))));
                    }
                }
            } else {
                Format[] formatArr3 = new Format[i10];
                for (int i18 = 0; i18 < i10; i18++) {
                    formatArr3[i18] = deriveAudioFormat(formatArr[i18], hlsMultivariantPlaylist.muxedAudioFormat, true);
                }
                arrayList.add(new TrackGroup(C3426d4.i.Z, formatArr3));
            }
            TrackGroup trackGroup = new TrackGroup(C3426d4.i.Z + ":id3", new Format.Builder().setId("ID3").setSampleMimeType("application/id3").build());
            arrayList.add(trackGroup);
            hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo((TrackGroup[]) arrayList.toArray(new TrackGroup[0]), 0, arrayList.indexOf(trackGroup));
        }
    }

    private void buildAndPrepareSampleStreamWrappers(long j10) {
        HlsMultivariantPlaylist hlsMultivariantPlaylist = (HlsMultivariantPlaylist) Assertions.checkNotNull(this.playlistTracker.getMultivariantPlaylist());
        Map<String, DrmInitData> mapDeriveOverridingDrmInitData = this.useSessionKeys ? deriveOverridingDrmInitData(hlsMultivariantPlaylist.sessionKeyDrmInitData) : Collections.emptyMap();
        boolean z10 = !hlsMultivariantPlaylist.variants.isEmpty();
        List<HlsMultivariantPlaylist.Rendition> list = hlsMultivariantPlaylist.audios;
        List<HlsMultivariantPlaylist.Rendition> list2 = hlsMultivariantPlaylist.subtitles;
        this.pendingPrepareCount = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z10) {
            buildAndPrepareMainSampleStreamWrapper(hlsMultivariantPlaylist, j10, arrayList, arrayList2, mapDeriveOverridingDrmInitData);
        }
        buildAndPrepareAudioSampleStreamWrappers(j10, list, arrayList, arrayList2, mapDeriveOverridingDrmInitData);
        this.audioVideoSampleStreamWrapperCount = arrayList.size();
        int i10 = 0;
        while (i10 < list2.size()) {
            HlsMultivariantPlaylist.Rendition rendition = list2.get(i10);
            String str = "subtitle:" + i10 + StringUtils.PROCESS_POSTFIX_DELIMITER + rendition.name;
            Format format = rendition.format;
            ArrayList arrayList3 = arrayList2;
            int i11 = i10;
            HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(str, 3, new Uri[]{rendition.url}, new Format[]{format}, null, Collections.emptyList(), mapDeriveOverridingDrmInitData, j10);
            arrayList3.add(new int[]{i11});
            arrayList.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
            hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(new TrackGroup[]{new TrackGroup(str, this.extractorFactory.getOutputTextFormat(format))}, 0, new int[0]);
            i10 = i11 + 1;
            arrayList2 = arrayList3;
        }
        this.sampleStreamWrappers = (HlsSampleStreamWrapper[]) arrayList.toArray(new HlsSampleStreamWrapper[0]);
        this.manifestUrlIndicesPerWrapper = (int[][]) arrayList2.toArray(new int[0][]);
        this.pendingPrepareCount = this.sampleStreamWrappers.length;
        for (int i12 = 0; i12 < this.audioVideoSampleStreamWrapperCount; i12++) {
            this.sampleStreamWrappers[i12].setIsPrimaryTimestampSource(true);
        }
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.continuePreparing();
        }
        this.enabledSampleStreamWrappers = this.sampleStreamWrappers;
    }

    private HlsSampleStreamWrapper buildSampleStreamWrapper(String str, int i10, Uri[] uriArr, Format[] formatArr, @Nullable Format format, @Nullable List<Format> list, Map<String, DrmInitData> map, long j10) {
        return new HlsSampleStreamWrapper(str, i10, this.sampleStreamWrapperCallback, new HlsChunkSource(this.extractorFactory, this.playlistTracker, uriArr, formatArr, this.dataSourceFactory, this.mediaTransferListener, this.timestampAdjusterProvider, this.timestampAdjusterInitializationTimeoutMs, list, this.playerId, this.cmcdConfiguration), map, this.allocator, j10, format, this.drmSessionManager, this.drmEventDispatcher, this.loadErrorHandlingPolicy, this.eventDispatcher, this.metadataType);
    }

    private static Map<String, DrmInitData> deriveOverridingDrmInitData(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            DrmInitData drmInitDataMerge = list.get(i10);
            String str = drmInitDataMerge.schemeType;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) arrayList.get(i11);
                if (TextUtils.equals(drmInitData.schemeType, str)) {
                    drmInitDataMerge = drmInitDataMerge.merge(drmInitData);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            map.put(str, drmInitDataMerge);
        }
        return map;
    }

    private static Format deriveVideoFormat(Format format) {
        String codecsOfType = Util.getCodecsOfType(format.codecs, 2);
        return new Format.Builder().setId(format.f59767id).setLabel(format.label).setLabels(format.labels).setContainerMimeType(format.containerMimeType).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType)).setCodecs(codecsOfType).setMetadata(format.metadata).setAverageBitrate(format.averageBitrate).setPeakBitrate(format.peakBitrate).setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate).setSelectionFlags(format.selectionFlags).setRoleFlags(format.roleFlags).build();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        if (this.trackGroups != null) {
            return this.compositeSequenceableLoader.continueLoading(loadingInfo);
        }
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.continuePreparing();
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j10, boolean z10) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            hlsSampleStreamWrapper.discardBuffer(j10, z10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            if (hlsSampleStreamWrapper.isVideoSampleStream()) {
                return hlsSampleStreamWrapper.getAdjustedSeekPositionUs(j10, seekParameters);
            }
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        int[] iArr;
        TrackGroupArray trackGroups;
        int primaryTrackGroupIndex;
        b bVar = this;
        HlsMultivariantPlaylist hlsMultivariantPlaylist = (HlsMultivariantPlaylist) Assertions.checkNotNull(bVar.playlistTracker.getMultivariantPlaylist());
        boolean z10 = !hlsMultivariantPlaylist.variants.isEmpty();
        int length = bVar.sampleStreamWrappers.length - hlsMultivariantPlaylist.subtitles.size();
        int i10 = 0;
        if (z10) {
            HlsSampleStreamWrapper hlsSampleStreamWrapper = bVar.sampleStreamWrappers[0];
            iArr = bVar.manifestUrlIndicesPerWrapper[0];
            trackGroups = hlsSampleStreamWrapper.getTrackGroups();
            primaryTrackGroupIndex = hlsSampleStreamWrapper.getPrimaryTrackGroupIndex();
        } else {
            iArr = new int[0];
            trackGroups = TrackGroupArray.EMPTY;
            primaryTrackGroupIndex = 0;
        }
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        for (ExoTrackSelection exoTrackSelection : list) {
            TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
            int iIndexOf = trackGroups.indexOf(trackGroup);
            if (iIndexOf == -1) {
                ?? r15 = z10;
                while (true) {
                    HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = bVar.sampleStreamWrappers;
                    if (r15 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    if (hlsSampleStreamWrapperArr[r15].getTrackGroups().indexOf(trackGroup) != -1) {
                        int i11 = r15 < length ? 1 : 2;
                        int[] iArr2 = bVar.manifestUrlIndicesPerWrapper[r15];
                        for (int i12 = 0; i12 < exoTrackSelection.length(); i12++) {
                            arrayList.add(new StreamKey(i11, iArr2[exoTrackSelection.getIndexInTrackGroup(i12)]));
                        }
                        break;
                    }
                    bVar = this;
                    r15++;
                }
            } else if (iIndexOf == primaryTrackGroupIndex) {
                for (int i13 = i10; i13 < exoTrackSelection.length(); i13++) {
                    arrayList.add(new StreamKey(i10, iArr[exoTrackSelection.getIndexInTrackGroup(i13)]));
                }
                z12 = true;
            } else {
                z11 = true;
            }
            bVar = this;
            i10 = 0;
        }
        if (z11 && !z12) {
            int i14 = iArr[0];
            int i15 = hlsMultivariantPlaylist.variants.get(i14).format.bitrate;
            for (int i16 = 1; i16 < iArr.length; i16++) {
                int i17 = hlsMultivariantPlaylist.variants.get(iArr[i16]).format.bitrate;
                if (i17 < i15) {
                    i14 = iArr[i16];
                    i15 = i17;
                }
            }
            arrayList.add(new StreamKey(0, i14));
        }
        return arrayList;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return (TrackGroupArray) Assertions.checkNotNull(this.trackGroups);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.maybeThrowPrepareError();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public void onPlaylistChanged() {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.onPlaylistUpdated();
        }
        this.mediaPeriodCallback.onContinueLoadingRequested(this);
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public boolean onPlaylistError(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z10) {
        boolean zOnPlaylistError = true;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            zOnPlaylistError &= hlsSampleStreamWrapper.onPlaylistError(uri, loadErrorInfo, z10);
        }
        this.mediaPeriodCallback.onContinueLoadingRequested(this);
        return zOnPlaylistError;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j10) {
        this.mediaPeriodCallback = callback;
        this.playlistTracker.addListener(this);
        buildAndPrepareSampleStreamWrappers(j10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
        this.compositeSequenceableLoader.reevaluateBuffer(j10);
    }

    public void release() {
        this.playlistTracker.removeListener(this);
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.release();
        }
        this.mediaPeriodCallback = null;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j10) {
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.enabledSampleStreamWrappers;
        if (hlsSampleStreamWrapperArr.length > 0) {
            boolean zSeekToUs = hlsSampleStreamWrapperArr[0].seekToUs(j10, false);
            int i10 = 1;
            while (true) {
                HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = this.enabledSampleStreamWrappers;
                if (i10 >= hlsSampleStreamWrapperArr2.length) {
                    break;
                }
                hlsSampleStreamWrapperArr2[i10].seekToUs(j10, zSeekToUs);
                i10++;
            }
            if (zSeekToUs) {
                this.timestampAdjusterProvider.reset();
            }
        }
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
        SampleStream[] sampleStreamArr2 = sampleStreamArr;
        int[] iArr = new int[exoTrackSelectionArr.length];
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        for (int i10 = 0; i10 < exoTrackSelectionArr.length; i10++) {
            SampleStream sampleStream = sampleStreamArr2[i10];
            iArr[i10] = sampleStream == null ? -1 : this.streamWrapperIndices.get(sampleStream).intValue();
            iArr2[i10] = -1;
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i10];
            if (exoTrackSelection != null) {
                TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                int i11 = 0;
                while (true) {
                    HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.sampleStreamWrappers;
                    if (i11 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    if (hlsSampleStreamWrapperArr[i11].getTrackGroups().indexOf(trackGroup) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.streamWrapperIndices.clear();
        int length = exoTrackSelectionArr.length;
        SampleStream[] sampleStreamArr3 = new SampleStream[length];
        SampleStream[] sampleStreamArr4 = new SampleStream[exoTrackSelectionArr.length];
        ExoTrackSelection[] exoTrackSelectionArr2 = new ExoTrackSelection[exoTrackSelectionArr.length];
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = new HlsSampleStreamWrapper[this.sampleStreamWrappers.length];
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i13 < this.sampleStreamWrappers.length) {
            for (int i14 = 0; i14 < exoTrackSelectionArr.length; i14++) {
                ExoTrackSelection exoTrackSelection2 = null;
                sampleStreamArr4[i14] = iArr[i14] == i13 ? sampleStreamArr2[i14] : null;
                if (iArr2[i14] == i13) {
                    exoTrackSelection2 = exoTrackSelectionArr[i14];
                }
                exoTrackSelectionArr2[i14] = exoTrackSelection2;
            }
            HlsSampleStreamWrapper hlsSampleStreamWrapper = this.sampleStreamWrappers[i13];
            int i15 = i12;
            int i16 = length;
            int i17 = i13;
            ExoTrackSelection[] exoTrackSelectionArr3 = exoTrackSelectionArr2;
            HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr3 = hlsSampleStreamWrapperArr2;
            boolean zSelectTracks = hlsSampleStreamWrapper.selectTracks(exoTrackSelectionArr2, zArr, sampleStreamArr4, zArr2, j10, z10);
            int i18 = 0;
            boolean z11 = false;
            while (true) {
                if (i18 >= exoTrackSelectionArr.length) {
                    break;
                }
                SampleStream sampleStream2 = sampleStreamArr4[i18];
                if (iArr2[i18] == i17) {
                    Assertions.checkNotNull(sampleStream2);
                    sampleStreamArr3[i18] = sampleStream2;
                    this.streamWrapperIndices.put(sampleStream2, Integer.valueOf(i17));
                    z11 = true;
                } else if (iArr[i18] == i17) {
                    Assertions.checkState(sampleStream2 == null);
                }
                i18++;
            }
            if (z11) {
                hlsSampleStreamWrapperArr3[i15] = hlsSampleStreamWrapper;
                i12 = i15 + 1;
                if (i15 == 0) {
                    hlsSampleStreamWrapper.setIsPrimaryTimestampSource(true);
                    if (zSelectTracks) {
                        this.timestampAdjusterProvider.reset();
                        z10 = true;
                    } else {
                        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr4 = this.enabledSampleStreamWrappers;
                        if (hlsSampleStreamWrapperArr4.length == 0 || hlsSampleStreamWrapper != hlsSampleStreamWrapperArr4[0]) {
                            this.timestampAdjusterProvider.reset();
                            z10 = true;
                        }
                    }
                } else {
                    hlsSampleStreamWrapper.setIsPrimaryTimestampSource(i17 < this.audioVideoSampleStreamWrapperCount);
                }
            } else {
                i12 = i15;
            }
            i13 = i17 + 1;
            sampleStreamArr2 = sampleStreamArr;
            hlsSampleStreamWrapperArr2 = hlsSampleStreamWrapperArr3;
            length = i16;
            exoTrackSelectionArr2 = exoTrackSelectionArr3;
        }
        System.arraycopy(sampleStreamArr3, 0, sampleStreamArr2, 0, length);
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr5 = (HlsSampleStreamWrapper[]) Util.nullSafeArrayCopy(hlsSampleStreamWrapperArr2, i12);
        this.enabledSampleStreamWrappers = hlsSampleStreamWrapperArr5;
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(hlsSampleStreamWrapperArr5);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.create(immutableListCopyOf, Lists.m(immutableListCopyOf, new e() { // from class: ig.b
            @Override // m5.e
            public final Object apply(Object obj) {
                return io.bidmachine.media3.exoplayer.hls.b.lambda$selectTracks$0((HlsSampleStreamWrapper) obj);
            }
        }));
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    private static Format deriveAudioFormat(Format format, @Nullable Format format2, boolean z10) {
        Metadata metadata;
        String str;
        int i10;
        int i11;
        int i12;
        String str2;
        List<Label> list;
        int i13;
        int i14;
        ImmutableList immutableListOf = ImmutableList.of();
        String str3 = null;
        int i15 = -1;
        if (format2 != null) {
            str2 = format2.codecs;
            Metadata metadata2 = format2.metadata;
            i12 = format2.channelCount;
            int i16 = format2.selectionFlags;
            int i17 = format2.roleFlags;
            String str4 = format2.language;
            String str5 = format2.label;
            list = format2.labels;
            i13 = i16;
            metadata = metadata2;
            str3 = str5;
            i11 = i17;
            str = str4;
        } else {
            String codecsOfType = Util.getCodecsOfType(format.codecs, 1);
            metadata = format.metadata;
            if (z10) {
                i12 = format.channelCount;
                int i18 = format.selectionFlags;
                int i19 = format.roleFlags;
                str = format.language;
                String str6 = format.label;
                i13 = i18;
                str2 = codecsOfType;
                list = format.labels;
                i11 = i19;
                str3 = str6;
            } else {
                str = null;
                i10 = 0;
                i11 = 0;
                i12 = -1;
                str2 = codecsOfType;
                list = immutableListOf;
            }
            String mediaMimeType = MimeTypes.getMediaMimeType(str2);
            if (z10) {
                i14 = format.averageBitrate;
            } else {
                i14 = -1;
            }
            if (z10) {
                i15 = format.peakBitrate;
            }
            return new Format.Builder().setId(format.f59767id).setLabel(str3).setLabels(list).setContainerMimeType(format.containerMimeType).setSampleMimeType(mediaMimeType).setCodecs(str2).setMetadata(metadata).setAverageBitrate(i14).setPeakBitrate(i15).setChannelCount(i12).setSelectionFlags(i10).setRoleFlags(i11).setLanguage(str).build();
        }
        i10 = i13;
        String mediaMimeType2 = MimeTypes.getMediaMimeType(str2);
        if (z10) {
            i14 = format.averageBitrate;
        } else {
            i14 = -1;
        }
        if (z10) {
            i15 = format.peakBitrate;
        }
        return new Format.Builder().setId(format.f59767id).setLabel(str3).setLabels(list).setContainerMimeType(format.containerMimeType).setSampleMimeType(mediaMimeType2).setCodecs(str2).setMetadata(metadata).setAverageBitrate(i14).setPeakBitrate(i15).setChannelCount(i12).setSelectionFlags(i10).setRoleFlags(i11).setLanguage(str).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectTracks$0(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        return hlsSampleStreamWrapper.getTrackGroups().getTrackTypes();
    }
}
