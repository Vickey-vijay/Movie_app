package io.bidmachine.media3.exoplayer.source;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.drm.DrmSessionManagerProvider;
import io.bidmachine.media3.exoplayer.upstream.CmcdConfiguration;
import io.bidmachine.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import io.bidmachine.media3.extractor.text.SubtitleParser;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
@Deprecated
public interface MediaSourceFactory extends MediaSource.Factory {

    @UnstableApi
    public static final MediaSourceFactory UNSUPPORTED = new a();

    public class a implements MediaSourceFactory {
        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        @UnstableApi
        @Deprecated
        public /* bridge */ /* synthetic */ MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z10) {
            return super.experimentalParseSubtitlesDuringExtraction(z10);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        @UnstableApi
        public /* bridge */ /* synthetic */ MediaSource.Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            return super.setCmcdConfigurationFactory(factory);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public MediaSourceFactory setDrmSessionManagerProvider(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public MediaSourceFactory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        @UnstableApi
        public /* bridge */ /* synthetic */ MediaSource.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return super.setSubtitleParserFactory(factory);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public MediaSource createMediaSource(MediaItem mediaItem) {
            throw new UnsupportedOperationException();
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    /* synthetic */ MediaSource createMediaSource(MediaItem mediaItem);

    @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    @Deprecated
    /* bridge */ /* synthetic */ default MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z10) {
        return super.experimentalParseSubtitlesDuringExtraction(z10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    /* synthetic */ int[] getSupportedTypes();

    @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    /* bridge */ /* synthetic */ default MediaSource.Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
        return super.setCmcdConfigurationFactory(factory);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    /* synthetic */ MediaSource.Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider);

    @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    /* synthetic */ MediaSource.Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy);

    @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    /* bridge */ /* synthetic */ default MediaSource.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return super.setSubtitleParserFactory(factory);
    }
}
