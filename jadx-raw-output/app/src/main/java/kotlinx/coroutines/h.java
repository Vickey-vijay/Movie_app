package kotlinx.coroutines;

import bk.l;
import java.util.concurrent.CancellationException;
import kk.i;
import mj.r;
import nk.a2;
import nk.t;
import nk.y0;

/* JADX INFO: compiled from: NonCancellable.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class h extends kotlin.coroutines.a implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f63171b = new h();

    @Override // kotlinx.coroutines.g
    public void a(CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.g
    public boolean d() {
        return false;
    }

    @Override // kotlinx.coroutines.g
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.g
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.g
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    public h() {
        super(g.E8);
    }

    @Override // kotlinx.coroutines.g
    public CancellationException B() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.g
    public y0 F(l<? super Throwable, r> lVar) {
        return a2.f64759b;
    }

    @Override // kotlinx.coroutines.g
    public nk.r I(t tVar) {
        return a2.f64759b;
    }

    @Override // kotlinx.coroutines.g
    public y0 N(boolean z10, boolean z11, l<? super Throwable, r> lVar) {
        return a2.f64759b;
    }

    @Override // kotlinx.coroutines.g
    public Object o(rj.c<? super r> cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.g
    public vk.a v() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.g
    public i<g> k() {
        return kk.r.i();
    }
}
