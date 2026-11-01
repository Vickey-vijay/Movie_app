package androidx.activity;

import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import mj.r;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FullyDrawnReporter {
    private final Executor executor;
    private final Object lock;

    @GuardedBy("lock")
    private final List<bk.a<r>> onReportCallbacks;
    private final bk.a<r> reportFullyDrawn;

    @GuardedBy("lock")
    private boolean reportPosted;
    private final Runnable reportRunnable;

    @GuardedBy("lock")
    private boolean reportedFullyDrawn;

    @GuardedBy("lock")
    private int reporterCount;

    public FullyDrawnReporter(Executor executor, bk.a<r> aVar) {
        ck.p.j(executor, "executor");
        ck.p.j(aVar, "reportFullyDrawn");
        this.executor = executor;
        this.reportFullyDrawn = aVar;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new Runnable() { // from class: androidx.activity.p
            @Override // java.lang.Runnable
            public final void run() {
                FullyDrawnReporter.reportRunnable$lambda$2(this.f3721b);
            }
        };
    }

    private final void postWhenReportersAreDone() {
        if (this.reportPosted || this.reporterCount != 0) {
            return;
        }
        this.reportPosted = true;
        this.executor.execute(this.reportRunnable);
    }

    public final void addOnReportDrawnListener(bk.a<r> aVar) {
        boolean z10;
        ck.p.j(aVar, "callback");
        synchronized (this.lock) {
            if (this.reportedFullyDrawn) {
                z10 = true;
            } else {
                this.onReportCallbacks.add(aVar);
                z10 = false;
            }
        }
        if (z10) {
            aVar.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn) {
                this.reporterCount++;
            }
            r rVar = r.f64562a;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            this.reportedFullyDrawn = true;
            Iterator<T> it = this.onReportCallbacks.iterator();
            while (it.hasNext()) {
                ((bk.a) it.next()).invoke();
            }
            this.onReportCallbacks.clear();
            r rVar = r.f64562a;
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.reportedFullyDrawn;
        }
        return z10;
    }

    public final void removeOnReportDrawnListener(bk.a<r> aVar) {
        ck.p.j(aVar, "callback");
        synchronized (this.lock) {
            this.onReportCallbacks.remove(aVar);
            r rVar = r.f64562a;
        }
    }

    public final void removeReporter() {
        int i10;
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn && (i10 = this.reporterCount) > 0) {
                this.reporterCount = i10 - 1;
                postWhenReportersAreDone();
            }
            r rVar = r.f64562a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRunnable$lambda$2(FullyDrawnReporter fullyDrawnReporter) {
        ck.p.j(fullyDrawnReporter, "this$0");
        synchronized (fullyDrawnReporter.lock) {
            fullyDrawnReporter.reportPosted = false;
            if (fullyDrawnReporter.reporterCount == 0 && !fullyDrawnReporter.reportedFullyDrawn) {
                fullyDrawnReporter.reportFullyDrawn.invoke();
                fullyDrawnReporter.fullyDrawnReported();
            }
            r rVar = r.f64562a;
        }
    }
}
