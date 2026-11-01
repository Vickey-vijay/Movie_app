package com.inmobi.media;

import com.inmobi.media.AbstractC3050n6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3050n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mj.g f24876a = kotlin.b.a(new bk.a() { // from class: b7.p9
        @Override // bk.a
        public final Object invoke() {
            return AbstractC3050n6.a();
        }
    });

    public static final nk.l0 a() {
        ck.p.i("n6", "TAG");
        ck.p.j("n6", "name");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9("n6", false));
        ck.p.i(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return kotlinx.coroutines.d.a(nk.l1.c(executorServiceNewSingleThreadExecutor));
    }

    public static void a(C2824e6 c2824e6, String str, int i10, int i11, long j10, Ak ak2, C3000l6 c3000l6, boolean z10) throws InterruptedException {
        long j11;
        ck.p.i("n6", "TAG");
        if (Re.a() != null || !Ji.f22954d.get()) {
            ck.p.i("n6", "TAG");
            c3000l6.getClass();
            ck.p.j(c2824e6, "eventPayload");
            ck.p.i(c3000l6.f24743e, "TAG");
            nk.i.b(null, new C2901h6(c2824e6, false, c3000l6, null), 1, null);
            c3000l6.a(System.currentTimeMillis());
            if (c3000l6.f24742d != null) {
                ArrayList arrayList = c2824e6.f24296a;
                ck.p.j(arrayList, "eventIds");
                Integer num = AbstractC2761bk.f24081c;
                if (num != null && arrayList.contains(Integer.valueOf(num.intValue()))) {
                    AbstractC2761bk.f24081c = null;
                }
            }
            c3000l6.f24744f.set(false);
            return;
        }
        if (str != null) {
            String str2 = c2824e6.f24297b;
            int i12 = i10 - i11;
            ck.p.j(str, "url");
            ck.p.j(str2, "payload");
            ck.p.j(str, "url");
            ck.p.j(str, "url");
            HashMap mapL = kotlin.collections.a.l(mj.h.a("payload", str2));
            ck.p.j(mapL, "<this>");
            JSONObject jSONObjectB = W6.b();
            if (jSONObjectB != null) {
                String string = jSONObjectB.toString();
                ck.p.i(string, "toString(...)");
                mapL.put("consentObject", string);
            }
            Le le2 = new Le(str, i12 > 0 ? nj.l0.g(mj.h.a("X-im-retry-count", String.valueOf(i12))) : null, null, new Y6(mapL, 0), null, 52);
            if (!z10) {
                if (i11 != i10) {
                    j11 = j10;
                }
                nk.j.d((nk.l0) f24876a.getValue(), null, null, new C3025m6(j11, le2, i11, c2824e6, str, i10, j10, ak2, c3000l6, z10, null), 3, null);
            } else {
                long jPow = i11 != i10 ? ((long) Math.pow(2.0d, i12)) * j10 : 0L;
                j11 = jPow;
                nk.j.d((nk.l0) f24876a.getValue(), null, null, new C3025m6(j11, le2, i11, c2824e6, str, i10, j10, ak2, c3000l6, z10, null), 3, null);
            }
            j11 = jPow;
            nk.j.d((nk.l0) f24876a.getValue(), null, null, new C3025m6(j11, le2, i11, c2824e6, str, i10, j10, ak2, c3000l6, z10, null), 3, null);
        }
    }
}
