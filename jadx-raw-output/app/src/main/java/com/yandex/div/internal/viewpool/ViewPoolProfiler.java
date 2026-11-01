package com.yandex.div.internal.viewpool;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.AnyThread;
import java.util.Map;
import mj.r;

/* JADX INFO: compiled from: ViewPoolProfiler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPoolProfiler {
    private final Reporter reporter;
    private final ProfilingSession session = new ProfilingSession();
    private final FrameWatcher frameWatcher = new FrameWatcher();
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: ViewPoolProfiler.kt */
    public final class FrameWatcher implements Runnable {
        private boolean watching;

        public FrameWatcher() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPoolProfiler.this.onFrameReady$div_release();
            this.watching = false;
        }

        public final void watch(Handler handler) {
            if (this.watching) {
                return;
            }
            handler.post(this);
            this.watching = true;
        }
    }

    /* JADX INFO: compiled from: ViewPoolProfiler.kt */
    public interface Reporter {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final Reporter NO_OP = new Reporter() { // from class: com.yandex.div.internal.viewpool.ViewPoolProfiler$Reporter$Companion$NO_OP$1
            @Override // com.yandex.div.internal.viewpool.ViewPoolProfiler.Reporter
            public void reportEvent(String str, Map<String, ? extends Object> map) {
            }
        };

        /* JADX INFO: compiled from: ViewPoolProfiler.kt */
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        void reportEvent(String str, Map<String, ? extends Object> map);
    }

    public final void onFrameReady$div_release() {
        synchronized (this.session) {
            if (this.session.hasLongEvents()) {
                this.reporter.reportEvent("view pool profiling", this.session.flush());
            }
            this.session.clear();
            r rVar = r.f64562a;
        }
    }

    @AnyThread
    public final void onViewObtainedWithBlock$div_release(String str, long j10) {
        synchronized (this.session) {
            this.session.viewObtainedWithBlock(str, j10);
            this.frameWatcher.watch(this.handler);
            r rVar = r.f64562a;
        }
    }

    @AnyThread
    public final void onViewObtainedWithoutBlock$div_release(long j10) {
        synchronized (this.session) {
            this.session.viewObtainedWithoutBlock(j10);
            this.frameWatcher.watch(this.handler);
            r rVar = r.f64562a;
        }
    }

    @AnyThread
    public final void onViewRequested$div_release(long j10) {
        this.session.viewRequested(j10);
        this.frameWatcher.watch(this.handler);
    }

    public ViewPoolProfiler(Reporter reporter) {
        this.reporter = reporter;
    }
}
