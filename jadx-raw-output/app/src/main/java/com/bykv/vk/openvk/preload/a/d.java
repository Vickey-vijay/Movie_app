package com.bykv.vk.openvk.preload.a;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: Interceptor.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class d<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AtomicLong f10498d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f10499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IN f10500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OUT f10501c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f10502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f10503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f10504g;

    public abstract Object a(b<OUT> bVar, IN in2) throws Throwable;

    public void a(Object... objArr) {
    }

    public final long b() {
        return this.f10504g;
    }

    public final void c() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f10502e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f10503f, this);
    }

    public final void d() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f10502e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f10503f, this);
    }

    public final void a(b bVar, d dVar, IN in2, com.bykv.vk.openvk.preload.a.b.a aVar, Object[] objArr) {
        this.f10503f = new m(bVar);
        this.f10499a = dVar;
        this.f10500b = in2;
        this.f10502e = aVar;
        if (dVar != null) {
            this.f10504g = dVar.f10504g;
        } else {
            long andIncrement = f10498d.getAndIncrement();
            this.f10504g = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }

    public final void b(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f10502e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f10503f, this, th2);
    }

    public final void e() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f10502e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f10503f, this);
    }

    public final OUT f() {
        return this.f10501c;
    }

    public final void c(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f10502e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f10503f, this, th2);
    }

    public final void d(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f10502e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f10503f, this, th2);
    }
}
