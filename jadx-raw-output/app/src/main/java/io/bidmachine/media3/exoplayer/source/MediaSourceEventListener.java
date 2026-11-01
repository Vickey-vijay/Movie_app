package io.bidmachine.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
@UnstableApi
public interface MediaSourceEventListener {

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<a> listenerAndHandlers;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void downstreamFormatChanged(int i10, @Nullable Format format, int i11, @Nullable Object obj, long j10) {
            downstreamFormatChanged(new MediaLoadData(1, i10, format, i11, obj, Util.usToMs(j10), -9223372036854775807L));
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i10) {
            loadCanceled(loadEventInfo, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i10) {
            loadCompleted(loadEventInfo, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadError(LoadEventInfo loadEventInfo, int i10, IOException iOException, boolean z10) {
            loadError(loadEventInfo, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i10) {
            loadStarted(loadEventInfo, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void upstreamDiscarded(int i10, long j10, long j11) {
            upstreamDiscarded(new MediaLoadData(1, i10, null, 3, null, Util.usToMs(j10), Util.usToMs(j11)));
        }

        @CheckResult
        public EventDispatcher withParameters(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.listenerAndHandlers, i10, mediaPeriodId);
        }

        public static final class a {
            public Handler handler;
            public MediaSourceEventListener listener;

            public a(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler;
                this.listener = mediaSourceEventListener;
            }
        }

        private EventDispatcher(CopyOnWriteArrayList<a> copyOnWriteArrayList, int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i10;
            this.mediaPeriodId = mediaPeriodId;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$downstreamFormatChanged$5(MediaSourceEventListener mediaSourceEventListener, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onDownstreamFormatChanged(this.windowIndex, this.mediaPeriodId, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCanceled$2(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCanceled(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCompleted$1(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCompleted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadError$3(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
            mediaSourceEventListener.onLoadError(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadStarted$0(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadStarted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$upstreamDiscarded$4(MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onUpstreamDiscarded(this.windowIndex, mediaPeriodId, mediaLoadData);
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11) {
            loadCanceled(loadEventInfo, new MediaLoadData(i10, i11, format, i12, obj, Util.usToMs(j10), Util.usToMs(j11)));
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11) {
            loadCompleted(loadEventInfo, new MediaLoadData(i10, i11, format, i12, obj, Util.usToMs(j10), Util.usToMs(j11)));
        }

        public void loadError(LoadEventInfo loadEventInfo, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, IOException iOException, boolean z10) {
            loadError(loadEventInfo, new MediaLoadData(i10, i11, format, i12, obj, Util.usToMs(j10), Util.usToMs(j11)), iOException, z10);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11) {
            loadStarted(loadEventInfo, new MediaLoadData(i10, i11, format, i12, obj, Util.usToMs(j10), Util.usToMs(j11)));
        }

        public void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
            for (a aVar : this.listenerAndHandlers) {
                if (aVar.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(aVar);
                }
            }
        }

        @CheckResult
        @Deprecated
        public EventDispatcher withParameters(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j10) {
            return new EventDispatcher(this.listenerAndHandlers, i10, mediaPeriodId);
        }

        public void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(mediaSourceEventListener);
            this.listenerAndHandlers.add(new a(handler, mediaSourceEventListener));
        }

        public void downstreamFormatChanged(final MediaLoadData mediaLoadData) {
            for (a aVar : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = aVar.listener;
                Util.postOrRun(aVar.handler, new Runnable() { // from class: og.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f65372b.lambda$downstreamFormatChanged$5(mediaSourceEventListener, mediaLoadData);
                    }
                });
            }
        }

        public void upstreamDiscarded(final MediaLoadData mediaLoadData) {
            final MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) Assertions.checkNotNull(this.mediaPeriodId);
            for (a aVar : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = aVar.listener;
                Util.postOrRun(aVar.handler, new Runnable() { // from class: og.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f65368b.lambda$upstreamDiscarded$4(mediaSourceEventListener, mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        public void loadCanceled(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (a aVar : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = aVar.listener;
                Util.postOrRun(aVar.handler, new Runnable() { // from class: og.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f65360b.lambda$loadCanceled$2(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadCompleted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (a aVar : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = aVar.listener;
                Util.postOrRun(aVar.handler, new Runnable() { // from class: og.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f65364b.lambda$loadCompleted$1(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadError(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z10) {
            for (a aVar : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = aVar.listener;
                Util.postOrRun(aVar.handler, new Runnable() { // from class: og.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f65375b.lambda$loadError$3(mediaSourceEventListener, loadEventInfo, mediaLoadData, iOException, z10);
                    }
                });
            }
        }

        public void loadStarted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (a aVar : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = aVar.listener;
                Util.postOrRun(aVar.handler, new Runnable() { // from class: og.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f65381b.lambda$loadStarted$0(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }
    }

    default void onDownstreamFormatChanged(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    default void onLoadCanceled(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadCompleted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
    }

    default void onLoadStarted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onUpstreamDiscarded(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }
}
