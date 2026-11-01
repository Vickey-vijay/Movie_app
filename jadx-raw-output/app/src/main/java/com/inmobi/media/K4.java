package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.K4;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class K4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K4 f22996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mj.g f22997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static LinkedList f22998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static LinkedList f22999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static byte[] f23000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f23001f;

    public final void a(boolean z10) {
        Context context = Ji.f22951a;
        if (context != null) {
            ck.p.i("K4", "TAG");
            if (z10 != e()) {
                ck.p.i("K4", "TAG");
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Ea.a(Da.a(context, "c_data_store"), "isEnabled", z10);
                if (z10) {
                    return;
                }
                f();
            }
        }
    }

    public final void f() {
        synchronized (this) {
            ck.p.i("K4", "TAG");
            nk.i.b(null, new G4(null), 1, null);
            LinkedList linkedList = new LinkedList();
            f22998c = linkedList;
            Object objClone = linkedList.clone();
            ck.p.h(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            f22999d = (LinkedList) objClone;
            mj.r rVar = mj.r.f64562a;
        }
    }

    static {
        K4 k10 = new K4();
        f22996a = k10;
        f22997b = kotlin.b.a(new bk.a() { // from class: b7.h2
            @Override // bk.a
            public final Object invoke() {
                return K4.b();
            }
        });
        LinkedList linkedList = new LinkedList();
        f22998c = linkedList;
        Object objClone = linkedList.clone();
        ck.p.h(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        f22999d = (LinkedList) objClone;
        H4 h10 = new H4();
        E4 e10 = new E4();
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(SignalsConfig.class, "clazz");
        C2924i4 c2924i5 = Y3.f23815a;
        f23000e = X5.a(((SignalsConfig) c2924i5.a(SignalsConfig.class)).getAK());
        List<String> skipFields = c().getContextualData().getSkipFields();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(L4.f23049j);
        arrayList.removeAll(skipFields);
        f23001f = nj.b0.p0(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
        Context context = Ji.f22951a;
        if (context != null) {
            ck.p.i("K4", "TAG");
            ConcurrentHashMap concurrentHashMap = Ea.f22576b;
            Ea eaA = Da.a(context, "c_data_store");
            Context context2 = Ji.f22951a;
            int i10 = 1;
            if (context2 != null) {
                Ea eaA2 = Da.a(context2, "c_data_store");
                ck.p.j("akv", C3426d4.i.W);
                i10 = eaA2.f22577a.getInt("akv", 1);
            }
            ck.p.j(SignalsConfig.class, "clazz");
            if (((SignalsConfig) c2924i5.a(SignalsConfig.class)).getAKV() != i10) {
                ck.p.i("K4", "TAG");
                ck.p.j(SignalsConfig.class, "clazz");
                eaA.a("akv", ((SignalsConfig) c2924i5.a(SignalsConfig.class)).getAKV(), false);
                k10.f();
            }
        }
        Y3.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, e10);
        Y3.a("signals", h10);
    }

    public static final C4 b() {
        return new C4(AbstractC2904h9.b());
    }

    public static AdConfig c() {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        return (AdConfig) Y3.f23815a.a(AdConfig.class);
    }

    public static String d() {
        ck.p.i("K4", "TAG");
        if (f23001f.length() == 0) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) c().getContextualData().getExpiryTime()) * 1000);
        LinkedList linkedList = f22999d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (((W5) obj).f23726b >= jCurrentTimeMillis) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(lk.a0.k1(((W5) it.next()).f23725a).toString());
        }
        String string = jSONArray.toString();
        ck.p.i(string, "toString(...)");
        return string;
    }

    public static boolean e() {
        boolean z10;
        AdConfig.ContextualDataConfig contextualData;
        Context context = Ji.f22951a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f22576b;
            Ea eaA = Da.a(context, "c_data_store");
            ck.p.j("isEnabled", C3426d4.i.W);
            z10 = eaA.f22577a.getBoolean("isEnabled", true);
        } else {
            z10 = true;
        }
        if (!z10) {
            ck.p.i("K4", "TAG");
            return false;
        }
        AdConfig adConfigC = c();
        boolean z11 = ((adConfigC == null || (contextualData = adConfigC.getContextualData()) == null) ? 1 : contextualData.getMaxAdRecords()) > 0;
        ck.p.i("K4", "TAG");
        return z11;
    }

    public static final void a() throws InterruptedException {
        ck.p.i("K4", "TAG");
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) c().getContextualData().getExpiryTime()) * 1000);
        a(jCurrentTimeMillis, c().getContextualData().getMaxAdRecords());
        Object objClone = f22998c.clone();
        ck.p.h(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        f22999d = (LinkedList) objClone;
        nk.i.b(null, new J4(jCurrentTimeMillis, null), 1, null);
    }

    public static void a(long j10, int i10) {
        ck.p.i("K4", "TAG");
        for (int size = f22998c.size(); size > i10; size--) {
            f22998c.remove();
        }
        ck.p.i("K4", "TAG");
        Iterator it = f22998c.iterator();
        ck.p.i(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            ck.p.i(next, "next(...)");
            if (((W5) next).f23726b >= j10) {
                return;
            } else {
                it.remove();
            }
        }
    }
}
