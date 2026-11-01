package androidx.media3.exoplayer.dash.offline;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.dash.BaseUrlExclusionList;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import androidx.media3.exoplayer.dash.DashUtil;
import androidx.media3.exoplayer.dash.DashWrappingSegmentIndex;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.offline.DownloadException;
import androidx.media3.exoplayer.offline.SegmentDownloader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.ChunkIndex;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public final class DashDownloader extends SegmentDownloader<DashManifest> {
    private final BaseUrlExclusionList baseUrlExclusionList;

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new a());
    }

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, new DashManifestParser(), factory, executor, 20000L);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7 A[SYNTHETIC] */
    private void addSegmentsForAdaptationSet(DataSource dataSource, AdaptationSet adaptationSet, long j10, long j11, boolean z10, ArrayList<SegmentDownloader.Segment> arrayList) throws InterruptedException, IOException {
        for (int i10 = 0; i10 < adaptationSet.representations.size(); i10++) {
            Representation representation = adaptationSet.representations.get(i10);
            try {
                try {
                    DashSegmentIndex segmentIndex = getSegmentIndex(dataSource, adaptationSet.type, representation, z10);
                    if (segmentIndex != null) {
                        long segmentCount = segmentIndex.getSegmentCount(j11);
                        if (segmentCount == -1) {
                            throw new DownloadException("Unbounded segment index");
                        }
                        String str = ((BaseUrl) Util.castNonNull(this.baseUrlExclusionList.selectBaseUrl(representation.baseUrls))).url;
                        RangedUri initializationUri = representation.getInitializationUri();
                        if (initializationUri != null) {
                            arrayList.add(createSegment(representation, str, j10, initializationUri));
                        }
                        RangedUri indexUri = representation.getIndexUri();
                        if (indexUri != null) {
                            arrayList.add(createSegment(representation, str, j10, indexUri));
                        }
                        long firstSegmentNum = segmentIndex.getFirstSegmentNum();
                        long j12 = (firstSegmentNum + segmentCount) - 1;
                        for (long j13 = firstSegmentNum; j13 <= j12; j13++) {
                            arrayList.add(createSegment(representation, str, j10 + segmentIndex.getTimeUs(j13), segmentIndex.getSegmentUrl(j13)));
                        }
                    } else {
                        try {
                            throw new DownloadException("Missing segment index");
                        } catch (IOException e10) {
                            e = e10;
                            if (z10) {
                                throw e;
                            }
                        }
                    }
                } catch (IOException e11) {
                    e = e11;
                    if (z10) {
                        throw e;
                    }
                }
            } catch (IOException e12) {
                e = e12;
            }
        }
    }

    @Override // androidx.media3.exoplayer.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, DashManifest dashManifest, boolean z10) throws InterruptedException, IOException {
        ArrayList<SegmentDownloader.Segment> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < dashManifest.getPeriodCount(); i10++) {
            Period period = dashManifest.getPeriod(i10);
            long jMsToUs = Util.msToUs(period.startMs);
            long periodDurationUs = dashManifest.getPeriodDurationUs(i10);
            int i11 = 0;
            for (List<AdaptationSet> list = period.adaptationSets; i11 < list.size(); list = list) {
                addSegmentsForAdaptationSet(dataSource, list.get(i11), jMsToUs, periodDurationUs, z10, arrayList);
                i11++;
            }
        }
        return arrayList;
    }

    @Deprecated
    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, parser, factory, executor, 20000L);
    }

    private SegmentDownloader.Segment createSegment(Representation representation, String str, long j10, RangedUri rangedUri) {
        return new SegmentDownloader.Segment(j10, DashUtil.buildDataSpec(representation, str, rangedUri, 0, ImmutableMap.of()));
    }

    @Nullable
    private DashSegmentIndex getSegmentIndex(final DataSource dataSource, final int i10, final Representation representation, boolean z10) throws InterruptedException, IOException {
        DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        ChunkIndex chunkIndex = (ChunkIndex) execute(new RunnableFutureTask<ChunkIndex, IOException>() { // from class: androidx.media3.exoplayer.dash.offline.DashDownloader.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.common.util.RunnableFutureTask
            public ChunkIndex doWork() throws IOException {
                return DashUtil.loadChunkIndex(dataSource, i10, representation);
            }
        }, z10);
        if (chunkIndex == null) {
            return null;
        }
        return new DashWrappingSegmentIndex(chunkIndex, representation.presentationTimeOffsetUs);
    }

    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor, long j10) {
        super(mediaItem, parser, factory, executor, j10);
        this.baseUrlExclusionList = new BaseUrlExclusionList();
    }
}
