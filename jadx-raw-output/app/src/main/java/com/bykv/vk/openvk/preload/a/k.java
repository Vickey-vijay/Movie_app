package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: RetryInterceptor.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class k<IN, OUT> extends d<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IN f10522d;

    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in2) throws Throwable {
        this.f10522d = in2;
        try {
            return bVar.a(a());
        } catch (i.a e10) {
            return a((b) bVar, e10.getCause());
        } catch (Throwable th2) {
            return a((b) bVar, th2);
        }
    }

    public abstract boolean a(Throwable th2);

    public final IN g() {
        return this.f10522d;
    }

    private Object a(b<OUT> bVar, Throwable th2) throws Throwable {
        while (a(th2)) {
            try {
                return bVar.a(a());
            } catch (i.a e10) {
                th2 = e10.getCause();
            }
        }
        throw th2;
    }

    public OUT a() {
        return this.f10522d;
    }
}
