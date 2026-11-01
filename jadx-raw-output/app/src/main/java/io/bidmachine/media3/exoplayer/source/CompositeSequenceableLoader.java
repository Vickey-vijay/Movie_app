package io.bidmachine.media3.exoplayer.source;

import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class CompositeSequenceableLoader implements SequenceableLoader {
    private long lastAudioVideoBufferedPositionUs;
    private final ImmutableList<a> loadersWithTrackTypes;

    public static final class a implements SequenceableLoader {
        private final SequenceableLoader loader;
        private final ImmutableList<Integer> trackTypes;

        @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(LoadingInfo loadingInfo) {
            return this.loader.continueLoading(loadingInfo);
        }

        @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.loader.getBufferedPositionUs();
        }

        @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.loader.getNextLoadPositionUs();
        }

        public ImmutableList<Integer> getTrackTypes() {
            return this.trackTypes;
        }

        @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return this.loader.isLoading();
        }

        @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j10) {
            this.loader.reevaluateBuffer(j10);
        }

        public a(SequenceableLoader sequenceableLoader, List<Integer> list) {
            this.loader = sequenceableLoader;
            this.trackTypes = ImmutableList.copyOf((Collection) list);
        }
    }

    @Deprecated
    public CompositeSequenceableLoader(SequenceableLoader[] sequenceableLoaderArr) {
        this(ImmutableList.copyOf(sequenceableLoaderArr), Collections.nCopies(sequenceableLoaderArr.length, ImmutableList.of(-1)));
    }

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        boolean zContinueLoading;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            zContinueLoading = false;
            for (int i10 = 0; i10 < this.loadersWithTrackTypes.size(); i10++) {
                long nextLoadPositionUs2 = this.loadersWithTrackTypes.get(i10).getNextLoadPositionUs();
                boolean z11 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= loadingInfo.playbackPositionUs;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    zContinueLoading |= this.loadersWithTrackTypes.get(i10).continueLoading(loadingInfo);
                }
            }
            z10 |= zContinueLoading;
        } while (zContinueLoading);
        return z10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        for (int i10 = 0; i10 < this.loadersWithTrackTypes.size(); i10++) {
            if (this.loadersWithTrackTypes.get(i10).isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
        for (int i10 = 0; i10 < this.loadersWithTrackTypes.size(); i10++) {
            this.loadersWithTrackTypes.get(i10).reevaluateBuffer(j10);
        }
    }

    public CompositeSequenceableLoader(List<? extends SequenceableLoader> list, List<List<Integer>> list2) {
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        Assertions.checkArgument(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarBuilder.a(new a(list.get(i10), list2.get(i10)));
        }
        this.loadersWithTrackTypes = aVarBuilder.m();
        this.lastAudioVideoBufferedPositionUs = -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.loadersWithTrackTypes.size(); i10++) {
            a aVar = this.loadersWithTrackTypes.get(i10);
            long bufferedPositionUs = aVar.getBufferedPositionUs();
            if ((aVar.getTrackTypes().contains(1) || aVar.getTrackTypes().contains(2) || aVar.getTrackTypes().contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, bufferedPositionUs);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.lastAudioVideoBufferedPositionUs = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.lastAudioVideoBufferedPositionUs;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        return jMin2;
    }

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.loadersWithTrackTypes.size(); i10++) {
            long nextLoadPositionUs = this.loadersWithTrackTypes.get(i10).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
