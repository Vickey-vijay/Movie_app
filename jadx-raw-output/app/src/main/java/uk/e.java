package uk;

import java.util.concurrent.Executor;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import nk.j1;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes10.dex */
public class e extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f72897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f72898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f72899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CoroutineScheduler f72900g = p();

    @Override // nk.h0
    public void dispatch(kotlin.coroutines.d dVar, Runnable runnable) {
        CoroutineScheduler.m(this.f72900g, runnable, false, false, 6, null);
    }

    @Override // nk.h0
    public void dispatchYield(kotlin.coroutines.d dVar, Runnable runnable) {
        CoroutineScheduler.m(this.f72900g, runnable, false, true, 2, null);
    }

    @Override // nk.j1
    public Executor n() {
        return this.f72900g;
    }

    public final CoroutineScheduler p() {
        return new CoroutineScheduler(this.f72896c, this.f72897d, this.f72898e, this.f72899f);
    }

    public final void q(Runnable runnable, boolean z10, boolean z11) {
        this.f72900g.l(runnable, z10, z11);
    }

    public e(int i10, int i11, long j10, String str) {
        this.f72896c = i10;
        this.f72897d = i11;
        this.f72898e = j10;
        this.f72899f = str;
    }
}
