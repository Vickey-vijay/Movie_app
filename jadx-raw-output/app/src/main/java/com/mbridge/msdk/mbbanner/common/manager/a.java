package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: BannerLoadManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f35625g = "a";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile a f35626h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f35627a = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f35628b = new com.mbridge.msdk.mbbanner.common.util.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.mbbanner.common.data.b> f35629c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f35630d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Handler> f35631e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Integer> f35632f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerLoadManager.java */
    public class C0339a implements com.mbridge.msdk.mbbanner.common.listener.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f35633a;

        public C0339a(com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f35633a = aVar;
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.d
        public void a(String str) {
            synchronized (a.b()) {
                this.f35633a.a("");
                a.this.f35630d.put(str, Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: compiled from: BannerLoadManager.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MBridgeIds f35636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f35637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f35638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f35639e;

        public b(String str, MBridgeIds mBridgeIds, com.mbridge.msdk.mbbanner.common.listener.b bVar, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f35635a = str;
            this.f35636b = mBridgeIds;
            this.f35637c = bVar;
            this.f35638d = str2;
            this.f35639e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Boolean bool;
            if (a.this.f35630d == null || !a.this.f35630d.containsKey(this.f35635a) || (bool = (Boolean) a.this.f35630d.get(this.f35635a)) == null || !bool.booleanValue()) {
                if (a.this.f35632f.containsKey(this.f35635a)) {
                    Integer num = (Integer) a.this.f35632f.get(this.f35635a);
                    int iIntValue = num != null ? num.intValue() : 0;
                    if (iIntValue == 2 || iIntValue == 4) {
                        q0.b(a.f35625g, "doUnitRotation: autoRotationStatus=" + iIntValue + " && unitId=" + this.f35635a);
                        if (a.this.f35628b != null) {
                            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880026);
                            bVar.a(this.f35636b);
                            a.this.f35628b.a(this.f35637c, bVar);
                            return;
                        }
                        return;
                    }
                }
                a.this.b(this.f35638d, this.f35635a, this.f35639e, this.f35637c);
            }
        }
    }

    public static a b() {
        if (f35626h == null) {
            synchronized (a.class) {
                if (f35626h == null) {
                    f35626h = new a();
                }
            }
        }
        return f35626h;
    }

    public void c() {
        Map<String, com.mbridge.msdk.mbbanner.common.data.b> map = this.f35629c;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f35630d;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f35631e;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f35631e.clear();
        }
        Map<String, Integer> map4 = this.f35632f;
        if (map4 != null) {
            map4.clear();
        }
    }

    private a() {
    }

    private com.mbridge.msdk.mbbanner.common.data.b a(String str) {
        if (this.f35629c.containsKey(str)) {
            return this.f35629c.get(str);
        }
        l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), str);
        if (lVarE == null) {
            lVarE = l.i(str);
        }
        com.mbridge.msdk.mbbanner.common.data.b bVar = new com.mbridge.msdk.mbbanner.common.data.b(str, "", 0, lVarE.y());
        this.f35629c.put(str, bVar);
        return bVar;
    }

    public void b(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Boolean bool;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        String strB = aVar.b();
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(str2, strB);
        cVarA.h(!TextUtils.isEmpty(aVar.a()) ? "1" : "0");
        cVarA.g(aVar.a());
        cVarA.f(aVar.f() ? "1" : "2");
        cVarA.b(aVar.f() ? 1 : 2);
        cVarA.c(aVar.d());
        com.mbridge.msdk.mbbanner.common.report.a.a("2000123", cVarA, (e) null);
        if (this.f35627a == null) {
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880025);
            bVar2.a(mBridgeIds);
            bVar2.b(strB);
            this.f35628b.a(bVar, bVar2);
            return;
        }
        if (bVar == null) {
            com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880001);
            bVar3.a(mBridgeIds);
            bVar3.b(strB);
            this.f35628b.a(bVar, bVar3);
            return;
        }
        Map<String, Boolean> map = this.f35630d;
        if (map != null && map.containsKey(str2) && (bool = this.f35630d.get(str2)) != null && bool.booleanValue()) {
            com.mbridge.msdk.foundation.error.b bVar4 = new com.mbridge.msdk.foundation.error.b(880016, "Current unit is loading!");
            bVar4.a(mBridgeIds);
            bVar4.b(strB);
            this.f35628b.a(bVar, bVar4);
            return;
        }
        this.f35630d.put(str2, Boolean.TRUE);
        com.mbridge.msdk.mbbanner.common.data.b bVarA = a(str2);
        bVarA.a(strB);
        new com.mbridge.msdk.mbbanner.common.manager.b(this.f35627a, bVarA, bVar, this.f35628b).a(str, str2, aVar, new C0339a(aVar));
        com.mbridge.msdk.mbbanner.common.report.a.a("2000125", cVarA, (e) null);
    }

    public void a(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Handler handler;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        if (aVar != null && aVar.d() > 0) {
            if (TextUtils.isEmpty(aVar.b())) {
                aVar.b(com.mbridge.msdk.mbbanner.common.report.a.b(""));
            }
            if (this.f35631e.containsKey(str2)) {
                handler = this.f35631e.get(str2);
            } else {
                handler = new Handler();
                this.f35631e.put(str2, handler);
            }
            Handler handler2 = handler;
            b bVar2 = new b(str2, mBridgeIds, bVar, str, aVar);
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                handler2.postDelayed(bVar2, aVar.d());
                return;
            }
            return;
        }
        q0.b(f35625g, "doUnitRotation: Illegal banner request parameters! && unitId=" + str2);
    }

    public void a(int i10, String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Integer num;
        int iIntValue = (!this.f35632f.containsKey(str2) || (num = this.f35632f.get(str2)) == null) ? 0 : num.intValue();
        if (i10 == 1) {
            if (this.f35631e.containsKey(str2) && (handler = this.f35631e.get(str2)) != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f35632f.put(str2, Integer.valueOf(i10));
            return;
        }
        if (i10 == 2) {
            if (iIntValue == 1) {
                if (this.f35631e.containsKey(str2) && (handler2 = this.f35631e.get(str2)) != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                this.f35632f.put(str2, Integer.valueOf(i10));
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (iIntValue == 2 || iIntValue == 4) {
                this.f35632f.put(str2, 1);
                a(str, str2, aVar, bVar);
                return;
            }
            return;
        }
        if (i10 != 4) {
            return;
        }
        if (iIntValue == 0) {
            this.f35632f.put(str2, 0);
            return;
        }
        if (this.f35631e.containsKey(str2) && (handler3 = this.f35631e.get(str2)) != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        this.f35632f.put(str2, Integer.valueOf(i10));
    }

    public void b(String str) {
        if (this.f35631e.containsKey(str)) {
            Handler handler = this.f35631e.get(str);
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f35631e.remove(str);
        }
    }
}
