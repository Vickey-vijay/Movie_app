package org.eclipse.jetty.io;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: ThreadLocalBuffers.java */
/* JADX INFO: loaded from: classes9.dex */
public class d extends org.eclipse.jetty.io.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ThreadLocal<b> f65595f;

    /* JADX INFO: compiled from: ThreadLocalBuffers.java */
    public class a extends ThreadLocal<b> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b initialValue() {
            return new b();
        }
    }

    /* JADX INFO: compiled from: ThreadLocalBuffers.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public mm.d f65597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public mm.d f65598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public mm.d f65599c;
    }

    @Override // org.eclipse.jetty.io.Buffers
    public mm.d b() {
        b bVar = this.f65595f.get();
        mm.d dVar = bVar.f65598b;
        if (dVar != null) {
            bVar.f65598b = null;
            return dVar;
        }
        mm.d dVar2 = bVar.f65599c;
        if (dVar2 == null || !g(dVar2)) {
            return j();
        }
        mm.d dVar3 = bVar.f65599c;
        bVar.f65599c = null;
        return dVar3;
    }

    @Override // org.eclipse.jetty.io.Buffers
    public mm.d c(int i10) {
        b bVar = this.f65595f.get();
        mm.d dVar = bVar.f65599c;
        if (dVar == null || dVar.e0() != i10) {
            return i(i10);
        }
        mm.d dVar2 = bVar.f65599c;
        bVar.f65599c = null;
        return dVar2;
    }

    @Override // org.eclipse.jetty.io.Buffers
    public mm.d getBuffer() {
        b bVar = this.f65595f.get();
        mm.d dVar = bVar.f65597a;
        if (dVar != null) {
            bVar.f65597a = null;
            return dVar;
        }
        mm.d dVar2 = bVar.f65599c;
        if (dVar2 == null || !f(dVar2)) {
            return h();
        }
        mm.d dVar3 = bVar.f65599c;
        bVar.f65599c = null;
        return dVar3;
    }

    public String toString() {
        return "{{" + e() + StringUtils.COMMA + d() + "}}";
    }

    public d(Buffers.Type type, int i10, Buffers.Type type2, int i11, Buffers.Type type3) {
        super(type, i10, type2, i11, type3);
        this.f65595f = new a();
    }

    @Override // org.eclipse.jetty.io.Buffers
    public void a(mm.d dVar) {
        dVar.clear();
        if (!dVar.h0() && !dVar.Y()) {
            b bVar = this.f65595f.get();
            if (bVar.f65598b == null && g(dVar)) {
                bVar.f65598b = dVar;
            } else if (bVar.f65597a == null && f(dVar)) {
                bVar.f65597a = dVar;
            } else {
                bVar.f65599c = dVar;
            }
        }
    }
}
