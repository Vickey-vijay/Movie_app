package io.bidmachine.media3.exoplayer.upstream;

import android.os.Handler;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.upstream.BandwidthMeter;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public interface BandwidthMeter {

    public interface EventListener {

        public static final class EventDispatcher {
            private final CopyOnWriteArrayList<a> listeners = new CopyOnWriteArrayList<>();

            public static final class a {
                private final Handler handler;
                private final EventListener listener;
                private boolean released;

                public void release() {
                    this.released = true;
                }

                public a(Handler handler, EventListener eventListener) {
                    this.handler = handler;
                    this.listener = eventListener;
                }
            }

            public void bandwidthSample(final int i10, final long j10, final long j11) {
                for (final a aVar : this.listeners) {
                    if (!aVar.released) {
                        aVar.handler.post(new Runnable() { // from class: ug.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                BandwidthMeter.EventListener.EventDispatcher.lambda$bandwidthSample$0(aVar, i10, j10, j11);
                            }
                        });
                    }
                }
            }

            public void removeListener(EventListener eventListener) {
                for (a aVar : this.listeners) {
                    if (aVar.listener == eventListener) {
                        aVar.release();
                        this.listeners.remove(aVar);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$bandwidthSample$0(a aVar, int i10, long j10, long j11) {
                aVar.listener.onBandwidthSample(i10, j10, j11);
            }

            public void addListener(Handler handler, EventListener eventListener) {
                Assertions.checkNotNull(handler);
                Assertions.checkNotNull(eventListener);
                removeListener(eventListener);
                this.listeners.add(new a(handler, eventListener));
            }
        }

        void onBandwidthSample(int i10, long j10, long j11);
    }

    void addEventListener(Handler handler, EventListener eventListener);

    long getBitrateEstimate();

    default long getTimeToFirstByteEstimateUs() {
        return -9223372036854775807L;
    }

    @Nullable
    TransferListener getTransferListener();

    void removeEventListener(EventListener eventListener);
}
