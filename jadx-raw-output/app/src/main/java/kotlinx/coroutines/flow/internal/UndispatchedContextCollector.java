package kotlinx.coroutines.flow.internal;

import bk.p;
import mj.r;
import qk.d;
import rj.c;
import sj.a;
import sk.k0;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class UndispatchedContextCollector<T> implements d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.coroutines.d f63167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f63168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<T, c<? super r>, Object> f63169d;

    @Override // qk.d
    public Object emit(T t10, c<? super r> cVar) {
        Object objB = rk.d.b(this.f63167b, t10, this.f63168c, this.f63169d, cVar);
        return objB == a.f() ? objB : r.f64562a;
    }

    public UndispatchedContextCollector(d<? super T> dVar, kotlin.coroutines.d dVar2) {
        this.f63167b = dVar2;
        this.f63168c = k0.g(dVar2);
        this.f63169d = new UndispatchedContextCollector$emitRef$1(dVar, null);
    }
}
