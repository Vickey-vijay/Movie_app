package com.inmobi.media;

import com.inmobi.media.C3328ya;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3328ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f25779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25780b;

    public final void a(final String str, bk.p pVar) {
        ck.p.j(str, "id");
        ck.p.j(pVar, "block");
        final kotlinx.coroutines.g gVarD = nk.j.d(this.f25779a, null, null, new C3303xa(pVar, null), 3, null);
        Map map = this.f25780b;
        ck.p.i(map, "jobMap");
        Object objSynchronizedList = map.get(str);
        if (objSynchronizedList == null) {
            objSynchronizedList = Collections.synchronizedList(new ArrayList());
            map.put(str, objSynchronizedList);
        }
        ((List) objSynchronizedList).add(gVarD);
        gVarD.F(new bk.l() { // from class: b7.oc
            @Override // bk.l
            public final Object invoke(Object obj) {
                return C3328ya.a(this.f5110b, str, gVarD, (Throwable) obj);
            }
        });
    }

    public C3328ya(nk.l0 l0Var) {
        ck.p.j(l0Var, "coroutineScope");
        this.f25779a = l0Var;
        this.f25780b = Collections.synchronizedMap(new LinkedHashMap());
    }

    public static final mj.r a(C3328ya c3328ya, String str, kotlinx.coroutines.g gVar, Throwable th2) {
        List list = (List) c3328ya.f25780b.get(str);
        if (list != null) {
            list.remove(gVar);
        }
        return mj.r.f64562a;
    }
}
