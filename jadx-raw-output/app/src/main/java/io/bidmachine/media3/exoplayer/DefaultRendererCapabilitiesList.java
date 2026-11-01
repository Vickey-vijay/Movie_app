package io.bidmachine.media3.exoplayer;

import android.content.Context;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.VideoSize;
import io.bidmachine.media3.common.text.CueGroup;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.DefaultRendererCapabilitiesList;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener;
import io.bidmachine.media3.exoplayer.audio.AudioSink;
import io.bidmachine.media3.exoplayer.metadata.MetadataOutput;
import io.bidmachine.media3.exoplayer.text.TextOutput;
import io.bidmachine.media3.exoplayer.video.VideoRendererEventListener;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class DefaultRendererCapabilitiesList implements RendererCapabilitiesList {
    private final Renderer[] renderers;

    public static final class Factory implements RendererCapabilitiesList.Factory {
        private final RenderersFactory renderersFactory;

        public class a implements VideoRendererEventListener {
            @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
            public /* bridge */ /* synthetic */ void onDroppedFrames(int i10, long j10) {
                super.onDroppedFrames(i10, j10);
            }

            @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame(Object obj, long j10) {
                super.onRenderedFirstFrame(obj, j10);
            }

            @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
            public /* bridge */ /* synthetic */ void onVideoCodecError(Exception exc) {
                super.onVideoCodecError(exc);
            }

            @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
            public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(String str, long j10, long j11) {
                super.onVideoDecoderInitialized(str, j10, j11);
            }

            @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
            public /* bridge */ /* synthetic */ void onVideoDecoderReleased(String str) {
                super.onVideoDecoderReleased(str);
            }

            @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
            public /* bridge */ /* synthetic */ void onVideoDisabled(DecoderCounters decoderCounters) {
                super.onVideoDisabled(decoderCounters);
            }

            @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
            public /* bridge */ /* synthetic */ void onVideoEnabled(DecoderCounters decoderCounters) {
                super.onVideoEnabled(decoderCounters);
            }

            @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
            public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(long j10, int i10) {
                super.onVideoFrameProcessingOffset(j10, i10);
            }

            @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
            public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
                super.onVideoInputFormatChanged(format, decoderReuseEvaluation);
            }

            @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
                super.onVideoSizeChanged(videoSize);
            }

            public a() {
            }
        }

        public class b implements AudioRendererEventListener {
            @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
            public /* bridge */ /* synthetic */ void onAudioCodecError(Exception exc) {
                super.onAudioCodecError(exc);
            }

            @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
            public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(String str, long j10, long j11) {
                super.onAudioDecoderInitialized(str, j10, j11);
            }

            @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
            public /* bridge */ /* synthetic */ void onAudioDecoderReleased(String str) {
                super.onAudioDecoderReleased(str);
            }

            @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
            public /* bridge */ /* synthetic */ void onAudioDisabled(DecoderCounters decoderCounters) {
                super.onAudioDisabled(decoderCounters);
            }

            @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
            public /* bridge */ /* synthetic */ void onAudioEnabled(DecoderCounters decoderCounters) {
                super.onAudioEnabled(decoderCounters);
            }

            @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
            public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
                super.onAudioInputFormatChanged(format, decoderReuseEvaluation);
            }

            @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
            public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(long j10) {
                super.onAudioPositionAdvancing(j10);
            }

            @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
            public /* bridge */ /* synthetic */ void onAudioSinkError(Exception exc) {
                super.onAudioSinkError(exc);
            }

            @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
            public /* bridge */ /* synthetic */ void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
                super.onAudioTrackInitialized(audioTrackConfig);
            }

            @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
            public /* bridge */ /* synthetic */ void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
                super.onAudioTrackReleased(audioTrackConfig);
            }

            @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
            public /* bridge */ /* synthetic */ void onAudioUnderrun(int i10, long j10, long j11) {
                super.onAudioUnderrun(i10, j10, j11);
            }

            @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
                super.onSkipSilenceEnabledChanged(z10);
            }

            public b() {
            }
        }

        public Factory(Context context) {
            this.renderersFactory = new DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$createRendererCapabilitiesList$0(CueGroup cueGroup) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$createRendererCapabilitiesList$1(Metadata metadata) {
        }

        @Override // io.bidmachine.media3.exoplayer.RendererCapabilitiesList.Factory
        public DefaultRendererCapabilitiesList createRendererCapabilitiesList() {
            return new DefaultRendererCapabilitiesList(this.renderersFactory.createRenderers(Util.createHandlerForCurrentOrMainLooper(), new a(), new b(), new TextOutput() { // from class: cg.b
                @Override // io.bidmachine.media3.exoplayer.text.TextOutput
                public final void onCues(CueGroup cueGroup) {
                    DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$0(cueGroup);
                }
            }, new MetadataOutput() { // from class: cg.c
                @Override // io.bidmachine.media3.exoplayer.metadata.MetadataOutput
                public final void onMetadata(Metadata metadata) {
                    DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$1(metadata);
                }
            }));
        }

        public Factory(RenderersFactory renderersFactory) {
            this.renderersFactory = renderersFactory;
        }
    }

    private DefaultRendererCapabilitiesList(Renderer[] rendererArr) {
        this.renderers = (Renderer[]) Arrays.copyOf(rendererArr, rendererArr.length);
        for (int i10 = 0; i10 < rendererArr.length; i10++) {
            this.renderers[i10].init(i10, PlayerId.UNSET, Clock.DEFAULT);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.RendererCapabilitiesList
    public RendererCapabilities[] getRendererCapabilities() {
        RendererCapabilities[] rendererCapabilitiesArr = new RendererCapabilities[this.renderers.length];
        int i10 = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i10 >= rendererArr.length) {
                return rendererCapabilitiesArr;
            }
            rendererCapabilitiesArr[i10] = rendererArr[i10].getCapabilities();
            i10++;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.RendererCapabilitiesList
    public void release() {
        for (Renderer renderer : this.renderers) {
            renderer.release();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.RendererCapabilitiesList
    public int size() {
        return this.renderers.length;
    }
}
