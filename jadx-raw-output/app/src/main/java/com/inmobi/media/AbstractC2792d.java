package com.inmobi.media;

import com.inmobi.media.AbstractC2792d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.inmobi.media.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC2792d {
    public static void a(final bk.a aVar) {
        ck.p.j(aVar, "execute");
        mj.g gVar = E0.f22556a;
        bk.a aVar2 = new bk.a() { // from class: b7.n6
            @Override // bk.a
            public final Object invoke() {
                return AbstractC2792d.b(aVar);
            }
        };
        ck.p.j(aVar2, "execute");
        nk.l0 l0VarA = E0.f22561f;
        if (l0VarA == null) {
            ck.p.j("AdQualityComponent-aqBeacon", "name");
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9("AdQualityComponent-aqBeacon", false));
            ck.p.i(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
            l0VarA = kotlinx.coroutines.d.a(nk.l1.c(executorServiceNewSingleThreadExecutor).plus(nk.j2.b(null, 1, null)));
            E0.f22561f = l0VarA;
        }
        nk.j.d(l0VarA, null, null, new C0(aVar2, null), 3, null);
    }

    public static final mj.r b(bk.a aVar) {
        aVar.invoke();
        return mj.r.f64562a;
    }
}
