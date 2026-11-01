package io.bidmachine.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import io.bidmachine.media3.common.ColorInfo;
import io.bidmachine.media3.common.DebugViewProvider;
import io.bidmachine.media3.common.Effect;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.FrameInfo;
import io.bidmachine.media3.common.PreviewingVideoGraph;
import io.bidmachine.media3.common.SurfaceInfo;
import io.bidmachine.media3.common.VideoFrameProcessingException;
import io.bidmachine.media3.common.VideoFrameProcessor;
import io.bidmachine.media3.common.VideoGraph;
import io.bidmachine.media3.common.VideoSize;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.HandlerWrapper;
import io.bidmachine.media3.common.util.Size;
import io.bidmachine.media3.common.util.TimestampIterator;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.video.CompositingVideoSinkProvider;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import m5.p;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UnstableApi
public final class CompositingVideoSinkProvider implements VideoSinkProvider, VideoGraph.Listener {
    private static final Executor NO_OP_EXECUTOR = new Executor() { // from class: wg.c
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            CompositingVideoSinkProvider.lambda$static$0(runnable);
        }
    };
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 2;
    private long bufferTimestampAdjustmentUs;
    private final Clock clock;
    private final Context context;

    @Nullable
    private Pair<Surface, Size> currentSurfaceAndSize;
    private HandlerWrapper handler;
    private final CopyOnWriteArraySet<Listener> listeners;
    private Format outputFormat;
    private int pendingFlushCount;
    private final PreviewingVideoGraph.Factory previewingVideoGraphFactory;
    private int state;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final io.bidmachine.media3.exoplayer.video.a videoFrameRenderControl;
    private PreviewingVideoGraph videoGraph;
    private final f videoSinkImpl;

    public static final class Builder {
        private boolean built;
        private Clock clock = Clock.DEFAULT;
        private final Context context;
        private PreviewingVideoGraph.Factory previewingVideoGraphFactory;
        private VideoFrameProcessor.Factory videoFrameProcessorFactory;
        private final VideoFrameReleaseControl videoFrameReleaseControl;

        public CompositingVideoSinkProvider build() {
            Assertions.checkState(!this.built);
            if (this.previewingVideoGraphFactory == null) {
                if (this.videoFrameProcessorFactory == null) {
                    this.videoFrameProcessorFactory = new c();
                }
                this.previewingVideoGraphFactory = new d(this.videoFrameProcessorFactory);
            }
            CompositingVideoSinkProvider compositingVideoSinkProvider = new CompositingVideoSinkProvider(this);
            this.built = true;
            return compositingVideoSinkProvider;
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public Builder setPreviewingVideoGraphFactory(PreviewingVideoGraph.Factory factory) {
            this.previewingVideoGraphFactory = factory;
            return this;
        }

        public Builder setVideoFrameProcessorFactory(VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
            return this;
        }

        public Builder(Context context, VideoFrameReleaseControl videoFrameReleaseControl) {
            this.context = context.getApplicationContext();
            this.videoFrameReleaseControl = videoFrameReleaseControl;
        }
    }

    public interface Listener {
        void onError(CompositingVideoSinkProvider compositingVideoSinkProvider, VideoFrameProcessingException videoFrameProcessingException);

        void onFirstFrameRendered(CompositingVideoSinkProvider compositingVideoSinkProvider);

        void onFrameDropped(CompositingVideoSinkProvider compositingVideoSinkProvider);

        void onVideoSizeChanged(CompositingVideoSinkProvider compositingVideoSinkProvider, VideoSize videoSize);
    }

    public final class b implements io.bidmachine.media3.exoplayer.video.a.InterfaceC0508a {
        private b() {
        }

        @Override // io.bidmachine.media3.exoplayer.video.a.InterfaceC0508a
        public void dropFrame() {
            Iterator it = CompositingVideoSinkProvider.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onFrameDropped(CompositingVideoSinkProvider.this);
            }
            ((PreviewingVideoGraph) Assertions.checkStateNotNull(CompositingVideoSinkProvider.this.videoGraph)).renderOutputFrame(-2L);
        }

        @Override // io.bidmachine.media3.exoplayer.video.a.InterfaceC0508a
        public void onVideoSizeChanged(VideoSize videoSize) {
            CompositingVideoSinkProvider.this.outputFormat = new Format.Builder().setWidth(videoSize.width).setHeight(videoSize.height).setSampleMimeType("video/raw").build();
            Iterator it = CompositingVideoSinkProvider.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onVideoSizeChanged(CompositingVideoSinkProvider.this, videoSize);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.video.a.InterfaceC0508a
        public void renderFrame(long j10, long j11, long j12, boolean z10) {
            if (z10 && CompositingVideoSinkProvider.this.currentSurfaceAndSize != null) {
                Iterator it = CompositingVideoSinkProvider.this.listeners.iterator();
                while (it.hasNext()) {
                    ((Listener) it.next()).onFirstFrameRendered(CompositingVideoSinkProvider.this);
                }
            }
            if (CompositingVideoSinkProvider.this.videoFrameMetadataListener != null) {
                CompositingVideoSinkProvider.this.videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j11, CompositingVideoSinkProvider.this.clock.nanoTime(), CompositingVideoSinkProvider.this.outputFormat == null ? new Format.Builder().build() : CompositingVideoSinkProvider.this.outputFormat, null);
            }
            ((PreviewingVideoGraph) Assertions.checkStateNotNull(CompositingVideoSinkProvider.this.videoGraph)).renderOutputFrame(j10);
        }
    }

    public static final class c implements VideoFrameProcessor.Factory {
        private static final p<VideoFrameProcessor.Factory> VIDEO_FRAME_PROCESSOR_FACTORY_SUPPLIER = Suppliers.a(new p() { // from class: wg.d
            @Override // m5.p
            public final Object get() {
                return CompositingVideoSinkProvider.c.lambda$static$0();
            }
        });

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ VideoFrameProcessor.Factory lambda$static$0() {
            try {
                Class<?> cls = Class.forName("io.bidmachine.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (VideoFrameProcessor.Factory) Assertions.checkNotNull(cls.getMethod(BillingClientBuilderBridgeCommon.buildMethodName, new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]));
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // io.bidmachine.media3.common.VideoFrameProcessor.Factory
        public VideoFrameProcessor create(Context context, DebugViewProvider debugViewProvider, ColorInfo colorInfo, boolean z10, Executor executor, VideoFrameProcessor.Listener listener) throws VideoFrameProcessingException {
            return VIDEO_FRAME_PROCESSOR_FACTORY_SUPPLIER.get().create(context, debugViewProvider, colorInfo, z10, executor, listener);
        }
    }

    public static final class d implements PreviewingVideoGraph.Factory {
        private final VideoFrameProcessor.Factory videoFrameProcessorFactory;

        @Override // io.bidmachine.media3.common.PreviewingVideoGraph.Factory
        public PreviewingVideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, List<Effect> list, long j10) throws VideoFrameProcessingException {
            try {
                Constructor<?> constructor = Class.forName("io.bidmachine.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class);
                Object[] objArr = new Object[1];
                try {
                    objArr[0] = this.videoFrameProcessorFactory;
                    return ((PreviewingVideoGraph.Factory) constructor.newInstance(objArr)).create(context, colorInfo, debugViewProvider, listener, executor, list, j10);
                } catch (Exception e10) {
                    e = e10;
                    throw VideoFrameProcessingException.from(e);
                }
            } catch (Exception e11) {
                e = e11;
            }
        }

        public d(VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
        }
    }

    public static final class e {
        private static Method buildScaleAndRotateTransformationMethod;
        private static Constructor<?> scaleAndRotateTransformationBuilderConstructor;
        private static Method setRotationMethod;

        private e() {
        }

        private static void prepare() throws NoSuchMethodException, ClassNotFoundException {
            if (scaleAndRotateTransformationBuilderConstructor == null || setRotationMethod == null || buildScaleAndRotateTransformationMethod == null) {
                Class<?> cls = Class.forName("io.bidmachine.media3.effect.ScaleAndRotateTransformation$Builder");
                scaleAndRotateTransformationBuilderConstructor = cls.getConstructor(new Class[0]);
                setRotationMethod = cls.getMethod("setRotationDegrees", Float.TYPE);
                buildScaleAndRotateTransformationMethod = cls.getMethod(BillingClientBuilderBridgeCommon.buildMethodName, new Class[0]);
            }
        }

        public static Effect createRotationEffect(float f10) {
            try {
                prepare();
                Object objNewInstance = scaleAndRotateTransformationBuilderConstructor.newInstance(new Object[0]);
                setRotationMethod.invoke(objNewInstance, Float.valueOf(f10));
                return (Effect) Assertions.checkNotNull(buildScaleAndRotateTransformationMethod.invoke(objNewInstance, new Object[0]));
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public final class f implements VideoSink, Listener {
        private final Context context;
        private boolean hasRegisteredFirstInputStream;
        private long inputBufferTimestampAdjustmentUs;

        @Nullable
        private Format inputFormat;
        private long inputStreamOffsetUs;
        private int inputType;
        private long pendingInputStreamBufferPresentationTimeUs;
        private boolean pendingInputStreamOffsetChange;

        @Nullable
        private Effect rotationEffect;
        private VideoFrameProcessor videoFrameProcessor;
        private final int videoFrameProcessorMaxPendingFrameCount;
        private final ArrayList<Effect> videoEffects = new ArrayList<>();
        private long finalBufferPresentationTimeUs = -9223372036854775807L;
        private long lastBufferPresentationTimeUs = -9223372036854775807L;
        private VideoSink.Listener listener = VideoSink.Listener.NO_OP;
        private Executor listenerExecutor = CompositingVideoSinkProvider.NO_OP_EXECUTOR;

        public f(Context context) {
            this.context = context;
            this.videoFrameProcessorMaxPendingFrameCount = Util.getMaxPendingFramesCountForMediaCodecDecoders(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$3(VideoSink.Listener listener, VideoFrameProcessingException videoFrameProcessingException) {
            listener.onError(this, new VideoSink.VideoSinkException(videoFrameProcessingException, (Format) Assertions.checkStateNotNull(this.inputFormat)));
        }

        private void maybeRegisterInputStream() {
            if (this.inputFormat == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Effect effect = this.rotationEffect;
            if (effect != null) {
                arrayList.add(effect);
            }
            arrayList.addAll(this.videoEffects);
            Format format = (Format) Assertions.checkNotNull(this.inputFormat);
            ((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).registerInputStream(this.inputType, arrayList, new FrameInfo.Builder(CompositingVideoSinkProvider.getAdjustedInputColorInfo(format.colorInfo), format.width, format.height).setPixelWidthHeightRatio(format.pixelWidthHeightRatio).build());
            this.finalBufferPresentationTimeUs = -9223372036854775807L;
        }

        private boolean maybeRegisterPendingInputStream() {
            long j10 = this.pendingInputStreamBufferPresentationTimeUs;
            if (j10 == -9223372036854775807L) {
                return true;
            }
            if (!CompositingVideoSinkProvider.this.hasReleasedFrame(j10)) {
                return false;
            }
            maybeRegisterInputStream();
            this.pendingInputStreamBufferPresentationTimeUs = -9223372036854775807L;
            return true;
        }

        private void maybeSetStreamOffsetChange(long j10) {
            if (this.pendingInputStreamOffsetChange) {
                CompositingVideoSinkProvider.this.onStreamOffsetChange(this.inputBufferTimestampAdjustmentUs, j10, this.inputStreamOffsetUs);
                this.pendingInputStreamOffsetChange = false;
            }
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void clearOutputSurfaceInfo() {
            CompositingVideoSinkProvider.this.clearOutputSurfaceInfo();
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void enableMayRenderStartOfStream() {
            CompositingVideoSinkProvider.this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public boolean isFrameDropAllowedOnInput() {
            return Util.isFrameDropAllowedOnSurfaceInput(this.context);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public boolean isInitialized() {
            return this.videoFrameProcessor != null;
        }

        @Override // io.bidmachine.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
        public void onError(CompositingVideoSinkProvider compositingVideoSinkProvider, final VideoFrameProcessingException videoFrameProcessingException) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: wg.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74091b.lambda$onError$3(listener, videoFrameProcessingException);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
        public void onFirstFrameRendered(CompositingVideoSinkProvider compositingVideoSinkProvider) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: wg.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74089b.lambda$onFirstFrameRendered$0(listener);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
        public void onFrameDropped(CompositingVideoSinkProvider compositingVideoSinkProvider) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: wg.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74084b.lambda$onFrameDropped$1(listener);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void onRendererDisabled() {
            CompositingVideoSinkProvider.this.videoFrameReleaseControl.onDisabled();
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void onRendererEnabled(boolean z10) {
            CompositingVideoSinkProvider.this.videoFrameReleaseControl.onEnabled(z10);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void onRendererStarted() {
            CompositingVideoSinkProvider.this.videoFrameReleaseControl.onStarted();
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void onRendererStopped() {
            CompositingVideoSinkProvider.this.videoFrameReleaseControl.onStopped();
        }

        @Override // io.bidmachine.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
        public void onVideoSizeChanged(CompositingVideoSinkProvider compositingVideoSinkProvider, final VideoSize videoSize) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: wg.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74086b.lambda$onVideoSizeChanged$2(listener, videoSize);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void release() {
            CompositingVideoSinkProvider.this.release();
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void render(long j10, long j11) throws VideoSink.VideoSinkException {
            try {
                CompositingVideoSinkProvider.this.render(j10, j11);
            } catch (ExoPlaybackException e10) {
                Format formatBuild = this.inputFormat;
                if (formatBuild == null) {
                    formatBuild = new Format.Builder().build();
                }
                throw new VideoSink.VideoSinkException(e10, formatBuild);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void setListener(VideoSink.Listener listener, Executor executor) {
            this.listener = listener;
            this.listenerExecutor = executor;
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void setOutputSurfaceInfo(Surface surface, Size size) {
            CompositingVideoSinkProvider.this.setOutputSurfaceInfo(surface, size);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void setPendingVideoEffects(List<Effect> list) {
            this.videoEffects.clear();
            this.videoEffects.addAll(list);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void setPlaybackSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f10) {
            CompositingVideoSinkProvider.this.setPlaybackSpeed(f10);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void setStreamOffsetAndAdjustmentUs(long j10, long j11) {
            this.pendingInputStreamOffsetChange |= (this.inputStreamOffsetUs == j10 && this.inputBufferTimestampAdjustmentUs == j11) ? false : true;
            this.inputStreamOffsetUs = j10;
            this.inputBufferTimestampAdjustmentUs = j11;
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void setVideoEffects(List<Effect> list) {
            if (this.videoEffects.equals(list)) {
                return;
            }
            setPendingVideoEffects(list);
            maybeRegisterInputStream();
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
            CompositingVideoSinkProvider.this.setVideoFrameMetadataListener(videoFrameMetadataListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFirstFrameRendered$0(VideoSink.Listener listener) {
            listener.onFirstFrameRendered(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFrameDropped$1(VideoSink.Listener listener) {
            listener.onFrameDropped((VideoSink) Assertions.checkStateNotNull(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoSizeChanged$2(VideoSink.Listener listener, VideoSize videoSize) {
            listener.onVideoSizeChanged(this, videoSize);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void flush(boolean z10) {
            if (isInitialized()) {
                this.videoFrameProcessor.flush();
            }
            this.hasRegisteredFirstInputStream = false;
            this.finalBufferPresentationTimeUs = -9223372036854775807L;
            this.lastBufferPresentationTimeUs = -9223372036854775807L;
            CompositingVideoSinkProvider.this.flush();
            if (z10) {
                CompositingVideoSinkProvider.this.videoFrameReleaseControl.reset();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public Surface getInputSurface() {
            Assertions.checkState(isInitialized());
            return ((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).getInputSurface();
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void initialize(Format format) throws VideoSink.VideoSinkException {
            Assertions.checkState(!isInitialized());
            this.videoFrameProcessor = CompositingVideoSinkProvider.this.initialize(format);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public boolean isEnded() {
            if (isInitialized()) {
                long j10 = this.finalBufferPresentationTimeUs;
                if (j10 != -9223372036854775807L && CompositingVideoSinkProvider.this.hasReleasedFrame(j10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public boolean isReady() {
            if (isInitialized() && CompositingVideoSinkProvider.this.isReady()) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public boolean queueBitmap(Bitmap bitmap, TimestampIterator timestampIterator) {
            Assertions.checkState(isInitialized());
            boolean z10 = false;
            if (!maybeRegisterPendingInputStream() || !((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).queueInputBitmap(bitmap, timestampIterator)) {
                return false;
            }
            TimestampIterator timestampIteratorCopyOf = timestampIterator.copyOf();
            long next = timestampIteratorCopyOf.next();
            long lastTimestampUs = timestampIteratorCopyOf.getLastTimestampUs() - this.inputBufferTimestampAdjustmentUs;
            if (lastTimestampUs != -9223372036854775807L) {
                z10 = true;
            }
            Assertions.checkState(z10);
            maybeSetStreamOffsetChange(next);
            this.lastBufferPresentationTimeUs = lastTimestampUs;
            this.finalBufferPresentationTimeUs = lastTimestampUs;
            return true;
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public long registerInputFrame(long j10, boolean z10) {
            boolean z11;
            Assertions.checkState(isInitialized());
            if (this.videoFrameProcessorMaxPendingFrameCount != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            Assertions.checkState(z11);
            long j11 = this.pendingInputStreamBufferPresentationTimeUs;
            if (j11 != -9223372036854775807L) {
                if (!CompositingVideoSinkProvider.this.hasReleasedFrame(j11)) {
                    return -9223372036854775807L;
                }
                maybeRegisterInputStream();
                this.pendingInputStreamBufferPresentationTimeUs = -9223372036854775807L;
            }
            if (((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).getPendingInputFrameCount() >= this.videoFrameProcessorMaxPendingFrameCount || !((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).registerInputFrame()) {
                return -9223372036854775807L;
            }
            long j12 = j10 - this.inputBufferTimestampAdjustmentUs;
            maybeSetStreamOffsetChange(j12);
            this.lastBufferPresentationTimeUs = j12;
            if (z10) {
                this.finalBufferPresentationTimeUs = j12;
            }
            return j10 * 1000;
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void registerInputStream(int i10, Format format) {
            int i11;
            Format format2;
            Assertions.checkState(isInitialized());
            boolean z10 = true;
            if (i10 != 1 && i10 != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i10);
            }
            CompositingVideoSinkProvider.this.videoFrameReleaseControl.setFrameRate(format.frameRate);
            if (i10 == 1 && Util.SDK_INT < 21 && (i11 = format.rotationDegrees) != -1 && i11 != 0) {
                if (this.rotationEffect == null || (format2 = this.inputFormat) == null || format2.rotationDegrees != i11) {
                    this.rotationEffect = e.createRotationEffect(i11);
                }
            } else {
                this.rotationEffect = null;
            }
            this.inputType = i10;
            this.inputFormat = format;
            if (!this.hasRegisteredFirstInputStream) {
                maybeRegisterInputStream();
                this.hasRegisteredFirstInputStream = true;
                this.pendingInputStreamBufferPresentationTimeUs = -9223372036854775807L;
            } else {
                if (this.lastBufferPresentationTimeUs == -9223372036854775807L) {
                    z10 = false;
                }
                Assertions.checkState(z10);
                this.pendingInputStreamBufferPresentationTimeUs = this.lastBufferPresentationTimeUs;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Runnable runnable) {
    }

    private CompositingVideoSinkProvider(Builder builder) {
        Context context = builder.context;
        this.context = context;
        f fVar = new f(context);
        this.videoSinkImpl = fVar;
        Clock clock = builder.clock;
        this.clock = clock;
        VideoFrameReleaseControl videoFrameReleaseControl = builder.videoFrameReleaseControl;
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        videoFrameReleaseControl.setClock(clock);
        this.videoFrameRenderControl = new io.bidmachine.media3.exoplayer.video.a(new b(), videoFrameReleaseControl);
        this.previewingVideoGraphFactory = (PreviewingVideoGraph.Factory) Assertions.checkStateNotNull(builder.previewingVideoGraphFactory);
        this.listeners = new CopyOnWriteArraySet<>();
        this.state = 0;
        addListener(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flushInternal() {
        int i10 = this.pendingFlushCount - 1;
        this.pendingFlushCount = i10;
        if (i10 > 0) {
            return;
        }
        if (i10 < 0) {
            throw new IllegalStateException(String.valueOf(this.pendingFlushCount));
        }
        this.videoFrameRenderControl.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ColorInfo getAdjustedInputColorInfo(@Nullable ColorInfo colorInfo) {
        return (colorInfo == null || !colorInfo.isDataSpaceValid()) ? ColorInfo.SDR_BT709_LIMITED : colorInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasReleasedFrame(long j10) {
        return this.pendingFlushCount == 0 && this.videoFrameRenderControl.hasReleasedFrame(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VideoFrameProcessor initialize(Format format) throws VideoSink.VideoSinkException {
        Assertions.checkState(this.state == 0);
        ColorInfo adjustedInputColorInfo = getAdjustedInputColorInfo(format.colorInfo);
        if (adjustedInputColorInfo.colorTransfer == 7 && Util.SDK_INT < 34) {
            adjustedInputColorInfo = adjustedInputColorInfo.buildUpon().setColorTransfer(6).build();
        }
        ColorInfo colorInfo = adjustedInputColorInfo;
        final HandlerWrapper handlerWrapperCreateHandler = this.clock.createHandler((Looper) Assertions.checkStateNotNull(Looper.myLooper()), null);
        this.handler = handlerWrapperCreateHandler;
        try {
            PreviewingVideoGraph.Factory factory = this.previewingVideoGraphFactory;
            Context context = this.context;
            DebugViewProvider debugViewProvider = DebugViewProvider.NONE;
            Objects.requireNonNull(handlerWrapperCreateHandler);
            this.videoGraph = factory.create(context, colorInfo, debugViewProvider, this, new Executor() { // from class: wg.a
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handlerWrapperCreateHandler.post(runnable);
                }
            }, ImmutableList.of(), 0L);
            Pair<Surface, Size> pair = this.currentSurfaceAndSize;
            if (pair != null) {
                Surface surface = (Surface) pair.first;
                Size size = (Size) pair.second;
                maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
            }
            this.videoGraph.registerInput(0);
            this.state = 1;
            return this.videoGraph.getProcessor(0);
        } catch (VideoFrameProcessingException e10) {
            throw new VideoSink.VideoSinkException(e10, format);
        }
    }

    private boolean isInitialized() {
        return this.state == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReady() {
        return this.pendingFlushCount == 0 && this.videoFrameRenderControl.isReady();
    }

    private void maybeSetOutputSurfaceInfo(@Nullable Surface surface, int i10, int i11) {
        if (this.videoGraph != null) {
            this.videoGraph.setOutputSurfaceInfo(surface != null ? new SurfaceInfo(surface, i10, i11) : null);
            this.videoFrameReleaseControl.setOutputSurface(surface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStreamOffsetChange(long j10, long j11, long j12) {
        this.bufferTimestampAdjustmentUs = j10;
        this.videoFrameRenderControl.onStreamOffsetChange(j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        this.videoFrameRenderControl.setPlaybackSpeed(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSinkProvider
    public void clearOutputSurfaceInfo() {
        Size size = Size.UNKNOWN;
        maybeSetOutputSurfaceInfo(null, size.getWidth(), size.getHeight());
        this.currentSurfaceAndSize = null;
    }

    @Nullable
    public Surface getOutputSurface() {
        Pair<Surface, Size> pair = this.currentSurfaceAndSize;
        if (pair != null) {
            return (Surface) pair.first;
        }
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSinkProvider
    public VideoSink getSink() {
        return this.videoSinkImpl;
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSinkProvider
    public VideoFrameReleaseControl getVideoFrameReleaseControl() {
        return this.videoFrameReleaseControl;
    }

    @Override // io.bidmachine.media3.common.VideoGraph.Listener
    public void onEnded(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // io.bidmachine.media3.common.VideoGraph.Listener
    public void onError(VideoFrameProcessingException videoFrameProcessingException) {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(this, videoFrameProcessingException);
        }
    }

    @Override // io.bidmachine.media3.common.VideoGraph.Listener
    public void onOutputFrameAvailableForRendering(long j10) {
        if (this.pendingFlushCount > 0) {
            return;
        }
        this.videoFrameRenderControl.onOutputFrameAvailableForRendering(j10 - this.bufferTimestampAdjustmentUs);
    }

    @Override // io.bidmachine.media3.common.VideoGraph.Listener
    public void onOutputSizeChanged(int i10, int i11) {
        this.videoFrameRenderControl.onOutputSizeChanged(i10, i11);
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSinkProvider
    public void release() {
        if (this.state == 2) {
            return;
        }
        HandlerWrapper handlerWrapper = this.handler;
        if (handlerWrapper != null) {
            handlerWrapper.removeCallbacksAndMessages(null);
        }
        PreviewingVideoGraph previewingVideoGraph = this.videoGraph;
        if (previewingVideoGraph != null) {
            previewingVideoGraph.release();
        }
        this.currentSurfaceAndSize = null;
        this.state = 2;
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public void render(long j10, long j11) throws ExoPlaybackException {
        if (this.pendingFlushCount == 0) {
            this.videoFrameRenderControl.render(j10, j11);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSinkProvider
    public void setOutputSurfaceInfo(Surface surface, Size size) {
        Pair<Surface, Size> pair = this.currentSurfaceAndSize;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((Size) this.currentSurfaceAndSize.second).equals(size)) {
            return;
        }
        this.currentSurfaceAndSize = Pair.create(surface, size);
        maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flush() {
        if (!isInitialized()) {
            return;
        }
        this.pendingFlushCount++;
        this.videoFrameRenderControl.flush();
        ((HandlerWrapper) Assertions.checkStateNotNull(this.handler)).post(new Runnable() { // from class: wg.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f74083b.flushInternal();
            }
        });
    }
}
