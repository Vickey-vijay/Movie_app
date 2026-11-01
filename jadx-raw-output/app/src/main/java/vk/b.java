package vk;

import bk.q;
import ck.i;
import mj.r;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f73177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q<Object, f<?>, Object, r> f73178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q<f<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.d, r>> f73179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q<Object, Object, Object, Object> f73180d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Object obj, q<Object, ? super f<?>, Object, r> qVar, q<? super f<?>, Object, Object, ? extends q<? super Throwable, Object, ? super kotlin.coroutines.d, r>> qVar2) {
        this.f73177a = obj;
        this.f73178b = qVar;
        this.f73179c = qVar2;
        this.f73180d = h.f73185a;
    }

    @Override // vk.e
    public q<f<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.d, r>> a() {
        return this.f73179c;
    }

    @Override // vk.e
    public q<Object, Object, Object, Object> b() {
        return this.f73180d;
    }

    @Override // vk.e
    public q<Object, f<?>, Object, r> c() {
        return this.f73178b;
    }

    @Override // vk.e
    public Object d() {
        return this.f73177a;
    }

    public /* synthetic */ b(Object obj, q qVar, q qVar2, int i10, i iVar) {
        this(obj, qVar, (i10 & 4) != 0 ? null : qVar2);
    }
}
