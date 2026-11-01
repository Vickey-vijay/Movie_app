package com.inmobi.media;

import com.inmobi.media.AbstractC2817e;

/* JADX INFO: renamed from: com.inmobi.media.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC2817e {
    public static final boolean a() {
        return true;
    }

    public static void a(final M0 m10, final Eg eg2, Long l10, final bk.a aVar) {
        ck.p.j(m10, "process");
        ck.p.j(aVar, "shouldProcess");
        mj.g gVar = E0.f22556a;
        long jLongValue = l10 != null ? l10.longValue() : 0L;
        bk.a aVar2 = new bk.a() { // from class: b7.q6
            @Override // bk.a
            public final Object invoke() {
                return AbstractC2817e.a(aVar, m10, eg2);
            }
        };
        ck.p.j(aVar2, "execute");
        nk.l0 l0VarA = E0.f22560e;
        if (l0VarA == null) {
            l0VarA = kotlinx.coroutines.d.a(nk.w0.a().plus(nk.j2.b(null, 1, null)));
            E0.f22560e = l0VarA;
        }
        nk.j.d(l0VarA, null, null, new D0(jLongValue, aVar2, null), 3, null);
    }

    public static final mj.r a(bk.a aVar, M0 m10, Eg eg2) {
        try {
            if (((Boolean) aVar.invoke()).booleanValue()) {
                Object objA = m10.a();
                if (eg2 != null) {
                    eg2.a(objA);
                }
            } else if (eg2 != null) {
                eg2.onError(new Exception("Capture Aborted: Should Capture not satisfied"));
            }
        } catch (Exception e10) {
            if (eg2 != null) {
                eg2.onError(e10);
            }
        }
        return mj.r.f64562a;
    }
}
