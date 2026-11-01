package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.VisibleForTesting;
import com.google.common.util.concurrent.d;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.HandlerWrapper;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.source.DefaultMediaSourceFactory;
import io.bidmachine.media3.exoplayer.source.MediaPeriod;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.TrackGroupArray;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import io.bidmachine.media3.exoplayer.upstream.DefaultAllocator;
import io.bidmachine.media3.extractor.DefaultExtractorsFactory;
import q5.i;

/* JADX INFO: loaded from: classes4.dex */
@UnstableApi
public final class MetadataRetriever {

    public static final class b {
        private static final int MESSAGE_CHECK_FOR_FAILURE = 2;
        private static final int MESSAGE_CONTINUE_LOADING = 3;
        private static final int MESSAGE_PREPARE_SOURCE = 1;
        private static final int MESSAGE_RELEASE = 4;
        private final MediaSource.Factory mediaSourceFactory;
        private final HandlerWrapper mediaSourceHandler;
        private final HandlerThread mediaSourceThread;
        private final d<TrackGroupArray> trackGroupsFuture;

        public final class a implements Handler.Callback {
            private static final int ERROR_POLL_INTERVAL_MS = 100;
            private MediaPeriod mediaPeriod;
            private MediaSource mediaSource;
            private final C0502a mediaSourceCaller = new C0502a();

            /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.MetadataRetriever$b$a$a, reason: collision with other inner class name */
            public final class C0502a implements MediaSource.MediaSourceCaller {
                private boolean mediaPeriodCreated;
                private final C0503a mediaPeriodCallback = new C0503a();
                private final Allocator allocator = new DefaultAllocator(true, 65536);

                /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.MetadataRetriever$b$a$a$a, reason: collision with other inner class name */
                public final class C0503a implements MediaPeriod.Callback {
                    private C0503a() {
                    }

                    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod.Callback, io.bidmachine.media3.exoplayer.source.SequenceableLoader.Callback
                    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
                        b.this.mediaSourceHandler.obtainMessage(3).sendToTarget();
                    }

                    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod.Callback
                    public void onPrepared(MediaPeriod mediaPeriod) {
                        b.this.trackGroupsFuture.D(mediaPeriod.getTrackGroups());
                        b.this.mediaSourceHandler.obtainMessage(4).sendToTarget();
                    }
                }

                public C0502a() {
                }

                @Override // io.bidmachine.media3.exoplayer.source.MediaSource.MediaSourceCaller
                public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
                    if (this.mediaPeriodCreated) {
                        return;
                    }
                    this.mediaPeriodCreated = true;
                    a.this.mediaPeriod = mediaSource.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0)), this.allocator, 0L);
                    a.this.mediaPeriod.prepare(this.mediaPeriodCallback, 0L);
                }
            }

            public a() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i10 = message.what;
                if (i10 == 1) {
                    MediaSource mediaSourceCreateMediaSource = b.this.mediaSourceFactory.createMediaSource((MediaItem) message.obj);
                    this.mediaSource = mediaSourceCreateMediaSource;
                    mediaSourceCreateMediaSource.prepareSource(this.mediaSourceCaller, null, PlayerId.UNSET);
                    b.this.mediaSourceHandler.sendEmptyMessage(2);
                    return true;
                }
                if (i10 == 2) {
                    try {
                        MediaPeriod mediaPeriod = this.mediaPeriod;
                        if (mediaPeriod == null) {
                            ((MediaSource) Assertions.checkNotNull(this.mediaSource)).maybeThrowSourceInfoRefreshError();
                        } else {
                            mediaPeriod.maybeThrowPrepareError();
                        }
                        b.this.mediaSourceHandler.sendEmptyMessageDelayed(2, 100);
                    } catch (Exception e10) {
                        b.this.trackGroupsFuture.F(e10);
                        b.this.mediaSourceHandler.obtainMessage(4).sendToTarget();
                    }
                    return true;
                }
                if (i10 == 3) {
                    ((MediaPeriod) Assertions.checkNotNull(this.mediaPeriod)).continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(0L).build());
                    return true;
                }
                if (i10 != 4) {
                    return false;
                }
                if (this.mediaPeriod != null) {
                    ((MediaSource) Assertions.checkNotNull(this.mediaSource)).releasePeriod(this.mediaPeriod);
                }
                ((MediaSource) Assertions.checkNotNull(this.mediaSource)).releaseSource(this.mediaSourceCaller);
                b.this.mediaSourceHandler.removeCallbacksAndMessages(null);
                b.this.mediaSourceThread.quit();
                return true;
            }
        }

        public i<TrackGroupArray> retrieveMetadata(MediaItem mediaItem) {
            this.mediaSourceHandler.obtainMessage(1, mediaItem).sendToTarget();
            return this.trackGroupsFuture;
        }

        public b(MediaSource.Factory factory, Clock clock) {
            this.mediaSourceFactory = factory;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
            this.mediaSourceThread = handlerThread;
            handlerThread.start();
            this.mediaSourceHandler = clock.createHandler(handlerThread.getLooper(), new a());
            this.trackGroupsFuture = d.I();
        }
    }

    private MetadataRetriever() {
    }

    public static i<TrackGroupArray> retrieveMetadata(Context context, MediaItem mediaItem) {
        return retrieveMetadata(context, mediaItem, Clock.DEFAULT);
    }

    public static i<TrackGroupArray> retrieveMetadata(MediaSource.Factory factory, MediaItem mediaItem) {
        return retrieveMetadata(factory, mediaItem, Clock.DEFAULT);
    }

    @VisibleForTesting
    public static i<TrackGroupArray> retrieveMetadata(Context context, MediaItem mediaItem, Clock clock) {
        return retrieveMetadata(new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory().setMp4ExtractorFlags(6)), mediaItem, clock);
    }

    private static i<TrackGroupArray> retrieveMetadata(MediaSource.Factory factory, MediaItem mediaItem, Clock clock) {
        return new b(factory, clock).retrieveMetadata(mediaItem);
    }
}
