package uk;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import nk.h0;
import nk.j1;
import sk.e0;
import sk.g0;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends j1 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f72892c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h0 f72893d = h0.limitedParallelism$default(j.f72910b, g0.e("kotlinx.coroutines.io.parallelism", ik.k.d(64, e0.a()), 0, 0, 12, null), null, 2, null);

    @Override // nk.j1
    public Executor n() {
        return this;
    }

    @Override // nk.h0
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // nk.h0
    public void dispatch(kotlin.coroutines.d dVar, Runnable runnable) {
        f72893d.dispatch(dVar, runnable);
    }

    @Override // nk.h0
    public void dispatchYield(kotlin.coroutines.d dVar, Runnable runnable) {
        f72893d.dispatchYield(dVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dispatch(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // nk.h0
    public h0 limitedParallelism(int i10, String str) {
        return j.f72910b.limitedParallelism(i10, str);
    }
}
