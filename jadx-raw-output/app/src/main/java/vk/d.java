package vk;

import bk.q;
import ck.i;
import mj.r;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d<Q> implements c<Q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f73181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q<Object, f<?>, Object, r> f73182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q<Object, Object, Object, Object> f73183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q<f<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.d, r>> f73184d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Object obj, q<Object, ? super f<?>, Object, r> qVar, q<Object, Object, Object, ? extends Object> qVar2, q<? super f<?>, Object, Object, ? extends q<? super Throwable, Object, ? super kotlin.coroutines.d, r>> qVar3) {
        this.f73181a = obj;
        this.f73182b = qVar;
        this.f73183c = qVar2;
        this.f73184d = qVar3;
    }

    @Override // vk.e
    public q<f<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.d, r>> a() {
        return this.f73184d;
    }

    @Override // vk.e
    public q<Object, Object, Object, Object> b() {
        return this.f73183c;
    }

    @Override // vk.e
    public q<Object, f<?>, Object, r> c() {
        return this.f73182b;
    }

    @Override // vk.e
    public Object d() {
        return this.f73181a;
    }

    public /* synthetic */ d(Object obj, q qVar, q qVar2, q qVar3, int i10, i iVar) {
        this(obj, qVar, qVar2, (i10 & 8) != 0 ? null : qVar3);
    }
}
