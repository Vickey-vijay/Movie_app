package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* JADX INFO: compiled from: RealInterceptorChain.java */
/* JADX INFO: loaded from: classes11.dex */
final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f10517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<h> f10519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f10520d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Object obj) throws Exception {
        d dVar = this.f10520d;
        if (dVar != null) {
            dVar.f10501c = obj;
            dVar.e();
        }
        if (this.f10518b >= this.f10519c.size()) {
            return obj;
        }
        h hVar = this.f10519c.get(this.f10518b);
        Class<? extends d> cls = hVar.f10511a;
        d dVar2 = (d) this.f10517a.a(cls);
        if (dVar2 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        com.bykv.vk.openvk.preload.a.b.a aVarA = hVar.a();
        i iVar = new i(this.f10519c, this.f10518b + 1, this.f10517a, dVar2);
        dVar2.a(iVar, this.f10520d, obj, aVarA, hVar.b());
        dVar2.c();
        try {
            Object objA = dVar2.a(iVar, obj);
            dVar2.d();
            return objA;
        } catch (a e10) {
            dVar2.c(e10.getCause());
            throw e10;
        } catch (Throwable th2) {
            dVar2.b(th2);
            throw new a(th2);
        }
    }

    /* JADX INFO: compiled from: RealInterceptorChain.java */
    public static final class a extends Exception {
        public a(Throwable th2) {
            super(th2);
        }
    }

    private d c(Class cls) {
        d dVar = this.f10520d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f10499a;
        }
        return dVar;
    }

    public i(List<h> list, int i10, e eVar, d dVar) {
        this.f10519c = list;
        this.f10518b = i10;
        this.f10517a = eVar;
        this.f10520d = dVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object b(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f10501c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f10500b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
