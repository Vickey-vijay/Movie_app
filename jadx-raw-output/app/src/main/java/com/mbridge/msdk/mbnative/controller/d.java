package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.RoomMasterTable;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.k;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.PreloadListener;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.tracker.network.g;
import com.unity3d.services.core.fid.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: NativePreloadController.java */
/* JADX INFO: loaded from: classes8.dex */
public class d extends com.mbridge.msdk.mbnative.controller.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f35914r = "d";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static Map<String, Map<Long, Object>> f35915s = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Map<String, Boolean> f35916t = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static Map<String, k> f35917u = new HashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static Map<String, Integer> f35918v = new HashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Map<String, Integer> f35919w = new HashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static d f35920x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f35921y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f35922z = -2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f35923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.click.a f35924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l f35925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35926e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f35930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Integer> f35931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<Integer> f35932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Integer> f35933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f35935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f35937p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Queue<Integer> f35927f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Queue<Long> f35928g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35929h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f35938q = new com.mbridge.msdk.foundation.same.task.b(com.mbridge.msdk.foundation.controller.c.n().d());

    /* JADX INFO: compiled from: NativePreloadController.java */
    public class a extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: NativePreloadController.java */
    public class b extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f35941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f35942e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f35943f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f35944g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f35947j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private com.mbridge.msdk.preload.listenter.a f35949l;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<String> f35945h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f35946i = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f35948k = true;

        /* JADX INFO: compiled from: NativePreloadController.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignUnit f35951a;

            public a(CampaignUnit campaignUnit) {
                this.f35951a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b.this.f35947j != null) {
                    b bVar = b.this;
                    d.this.f35902a.removeCallbacks(bVar.f35947j);
                }
                if (com.mbridge.msdk.util.b.a()) {
                    d.this.a(this.f35951a);
                }
                if (d.f35915s.containsKey("0_" + b.this.unitId)) {
                    d.f35915s.remove("0_" + b.this.unitId);
                }
                if (b.this.f35944g > 0) {
                    if (this.f35951a.ads.size() > b.this.f35944g) {
                        b bVar2 = b.this;
                        bVar2.f35941d = bVar2.f35944g;
                    } else {
                        b.this.f35941d = this.f35951a.ads.size();
                    }
                } else if (b.this.f35944g == -1) {
                    b.this.f35941d = 0;
                } else if (b.this.f35944g == -3) {
                    b.this.f35941d = this.f35951a.ads.size();
                } else if (b.this.f35944g == -2) {
                    if (this.f35951a.getTemplate() == 3) {
                        if (b.this.f35943f != 0) {
                            b bVar3 = b.this;
                            bVar3.f35941d = bVar3.f35943f;
                        }
                    } else if (b.this.f35942e != 0) {
                        b bVar4 = b.this;
                        bVar4.f35941d = bVar4.f35942e;
                    }
                    if (b.this.f35941d <= 0) {
                        b.this.f35941d = ((Integer) d.f35918v.get(b.this.unitId)).intValue();
                    }
                }
                if (this.f35951a.ads.size() < b.this.f35941d) {
                    b.this.f35941d = this.f35951a.ads.size();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("adtp", 42);
                if (TextUtils.isEmpty(b.this.b())) {
                    eVar.a(CampaignEx.JSON_KEY_HB, 0);
                } else {
                    eVar.a(CampaignEx.JSON_KEY_HB, 1);
                }
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, b.this.b(), eVar, this.f35951a.getAds().get(0), b.this.unitId);
                for (int i10 = 0; i10 < this.f35951a.ads.size(); i10++) {
                    CampaignEx campaignEx = this.f35951a.ads.get(i10);
                    campaignEx.setLocalRequestId(cVarA.t());
                    campaignEx.setCampaignUnitId(b.this.unitId);
                    boolean zC = v0.c(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx.getPackageName());
                    d.this.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
                    if (arrayList.size() < b.this.f35941d && campaignEx.getOfferType() != 99) {
                        if (v0.c(campaignEx)) {
                            campaignEx.setRtinsType(zC ? 1 : 2);
                        }
                        if (com.mbridge.msdk.foundation.same.c.b(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx)) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList2.add(campaignEx);
                            }
                        } else {
                            v0.a(b.this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f34914x);
                        }
                        b.this.a(campaignEx, null, null);
                    }
                    d dVar = d.this;
                    dVar.a(dVar.f35934m, campaignEx);
                }
                b bVar5 = b.this;
                d.this.a(arrayList2, bVar5.unitId);
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(this.f35951a.getAds().get(0) != null ? this.f35951a.getAds().get(0).getType() : 1);
                if (bVarA != null) {
                    bVarA.a(b.this.unitId, arrayList);
                }
                d.a(b.this.f35940c, b.this.unitId);
                if (Looper.myLooper() != null && z10) {
                    Looper.loop();
                }
                if (this.f35951a.getAds().get(0) != null) {
                    com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35951a.getAds().get(0).getMaitve(), this.f35951a.getAds().get(0).getMaitve_src());
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativePreloadController.java */
        public class C0349b extends com.mbridge.msdk.foundation.same.c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignEx f35953a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f35954b;

            public C0349b(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.f35953a = campaignEx;
                this.f35954b = context;
            }

            @Override // com.mbridge.msdk.foundation.same.c.a
            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.f35953a, this.f35954b, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        /* JADX INFO: compiled from: NativePreloadController.java */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f35956a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f35957b;

            public c(String str, int i10) {
                this.f35956a = str;
                this.f35957b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!b.this.f35946i) {
                    if (b.this.f35947j != null) {
                        b bVar = b.this;
                        d.this.f35902a.removeCallbacks(bVar.f35947j);
                    }
                    if (b.this.a() == 1 || b.this.f35948k) {
                        b bVar2 = b.this;
                        d dVar = d.this;
                        String str = this.f35956a;
                        int iA = bVar2.a();
                        b bVar3 = b.this;
                        dVar.a(str, iA, bVar3.unitId, bVar3.placementId, bVar3.f35949l);
                    }
                } else if (b.this.f35948k) {
                    b bVar4 = b.this;
                    d dVar2 = d.this;
                    String str2 = this.f35956a;
                    int iA2 = bVar4.a();
                    b bVar5 = b.this;
                    dVar2.a(str2, iA2, bVar5.unitId, bVar5.placementId, bVar5.f35949l);
                }
                if (this.f35957b == -1) {
                    d.b(b.this.f35940c, b.this.unitId);
                }
                if (Looper.myLooper() == null || !z10) {
                    return;
                }
                Looper.loop();
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativePreloadController.java */
        public class RunnableC0350d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f35959a;

            public RunnableC0350d(List list) {
                this.f35959a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!b.this.f35946i && b.this.f35947j != null) {
                    b bVar = b.this;
                    d.this.f35902a.removeCallbacks(bVar.f35947j);
                }
                List list = this.f35959a;
                if (list != null && list.size() > 0) {
                    Iterator it = this.f35959a.iterator();
                    while (it.hasNext()) {
                        for (CampaignEx campaignEx : ((Frame) it.next()).getCampaigns()) {
                            d dVar = d.this;
                            dVar.a(dVar.f35934m, campaignEx);
                        }
                    }
                    HashMap map = new HashMap();
                    map.put(Long.valueOf(System.currentTimeMillis()), this.f35959a);
                    if (d.f35915s.containsKey("1_" + b.this.unitId)) {
                        d.f35915s.remove("1_" + b.this.unitId);
                    }
                    d.f35915s.put("1_" + b.this.unitId, map);
                }
                if (Looper.myLooper() == null || !z10) {
                    return;
                }
                Looper.loop();
            }
        }

        public b(int i10) {
            this.f35940c = i10;
        }

        public void b(List<String> list) {
            this.f35945h = list;
        }

        public void c(int i10) {
            this.f35942e = i10;
        }

        public void d(int i10) {
            this.f35941d = i10;
        }

        public void e(int i10) {
            this.f35943f = i10;
        }

        public void b(int i10) {
            this.f35944g = i10;
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f35949l = aVar;
        }

        public void b(boolean z10) {
            this.f35948k = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.task.d
        public void a(boolean z10) {
            this.f35946i = z10;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<g> list, CampaignUnit campaignUnit) {
            d.this.f35935n = true;
            d.this.a(true, this.f35949l, (String) null);
            d.this.a(new Thread(new a(campaignUnit)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                com.mbridge.msdk.foundation.same.c.a(campaignEx, contextD, cVar, new C0349b(campaignEx, contextD, aVar));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i10, String str) {
            d.this.a(new Thread(new c(str, i10)));
        }

        public void a(Runnable runnable) {
            this.f35947j = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            d.this.a(new Thread(new RunnableC0350d(list)));
        }
    }

    /* JADX INFO: compiled from: NativePreloadController.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f35961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.task.d f35962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35963c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f35964d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f35965e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.mbridge.msdk.preload.listenter.a f35966f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f35967g = false;

        public void a(boolean z10) {
            this.f35967g = z10;
        }

        public c(int i10, com.mbridge.msdk.foundation.same.task.d dVar, int i11, String str, String str2) {
            this.f35961a = i10;
            this.f35962b = dVar;
            this.f35963c = i11;
            this.f35964d = str;
            this.f35965e = str2;
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f35966f = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35962b.a(true);
            int i10 = this.f35961a;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                d.this.a("REQUEST_TIMEOUT", this.f35963c, this.f35964d, this.f35965e, this.f35966f);
            } else {
                d.this.f35935n = true;
                if (this.f35967g || this.f35963c == 1) {
                    d.this.a("REQUEST_TIMEOUT", this.f35963c, this.f35964d, this.f35965e, this.f35966f);
                }
            }
        }

        public void a(String str) {
            this.f35964d = str;
        }
    }

    public static void b(int i10, String str) {
        if (f35917u.containsKey(str)) {
            k kVar = f35917u.get(str);
            if (i10 == 1) {
                kVar.a(0);
            } else if (i10 == 2) {
                kVar.b(0);
            }
            f35917u.put(str, kVar);
        }
    }

    public static Map<String, Integer> c() {
        return f35918v;
    }

    public static Map<String, Integer> d() {
        return f35919w;
    }

    public static Map<String, k> e() {
        return f35917u;
    }

    public static Map<String, Map<Long, Object>> f() {
        return f35915s;
    }

    public static Map<String, Boolean> g() {
        return f35916t;
    }

    public d() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f35902a = new a();
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01f1  */
    public void a(Map<String, Object> map, int i10) {
        String str;
        com.mbridge.msdk.preload.listenter.a aVar;
        String str2;
        List<Campaign> listA;
        Object obj;
        try {
            this.f35930i = map;
            this.f35935n = false;
            if (map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                String str3 = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                if (f35915s.containsKey(((i10 + 1) % 2) + "_" + str3)) {
                    if (!f35915s.containsKey(i10 + "_" + str3)) {
                        return;
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                if (map.containsKey(MBridgeConstans.PREIMAGE)) {
                    this.f35934m = ((Boolean) map.get(MBridgeConstans.PREIMAGE)).booleanValue();
                }
                com.mbridge.msdk.click.a aVar2 = this.f35924c;
                if (aVar2 == null) {
                    this.f35924c = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), str3);
                } else {
                    aVar2.a(str3);
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)) {
                    this.f35929h = ((Integer) map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)).intValue();
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
                    this.f35926e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
                }
                if (f35916t.containsKey(str3) && f35916t.get(str3).booleanValue()) {
                    Map<String, Map<Long, Object>> mapF = f();
                    Map<Long, Object> map2 = mapF.get(i10 + "_" + str3);
                    com.mbridge.msdk.setting.g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                    if (map2 != null && map2.size() > 0) {
                        Long next = map2.keySet().iterator().next();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (gVarD == null) {
                            gVarD = h.b().a();
                        }
                        if (jCurrentTimeMillis - next.longValue() >= gVarD.a0() * 1000) {
                            mapF.remove(str3);
                        } else if (i10 == 1) {
                            return;
                        }
                    }
                }
                f35916t.put(str3, Boolean.TRUE);
                this.f35937p = 1;
                try {
                    if (map.containsKey("ad_num")) {
                        int iIntValue = ((Integer) map.get("ad_num")).intValue();
                        this.f35937p = iIntValue;
                        if (iIntValue < 1) {
                            this.f35937p = 1;
                        }
                        if (this.f35937p > 10) {
                            this.f35937p = 10;
                        }
                    }
                } catch (Exception unused) {
                    q0.b(f35914r, "ADNUM MUST BE INTEGER");
                }
                f35918v.put(str3, Integer.valueOf(this.f35937p));
                com.mbridge.msdk.preload.listenter.a aVar3 = (!map.containsKey(MBridgeConstans.PRELOAD_RESULT_LISTENER) || (obj = map.get(MBridgeConstans.PRELOAD_RESULT_LISTENER)) == null) ? null : new com.mbridge.msdk.preload.listenter.a((PreloadListener) obj);
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                String strC = com.mbridge.msdk.foundation.controller.c.n().c();
                if (map.containsKey("app_id") && map.containsKey(MBridgeConstans.APP_KEY) && map.containsKey(MBridgeConstans.KEY_WORD)) {
                    strB = (String) map.get("app_id");
                    strC = (String) map.get(MBridgeConstans.APP_KEY);
                }
                a(strB, strC, str3);
                l lVarE = h.b().e(strB, str3);
                this.f35925d = lVarE;
                if (lVarE == null) {
                    this.f35925d = l.i(str3);
                }
                if (!map.containsKey(MBridgeConstans.PLACEMENT_ID) || map.get(MBridgeConstans.PLACEMENT_ID) == null) {
                    str = "";
                } else {
                    str = (String) map.get(MBridgeConstans.PLACEMENT_ID);
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                }
                String str4 = str;
                this.f35931j = this.f35925d.b();
                this.f35932k = this.f35925d.c();
                this.f35933l = this.f35925d.c();
                List<Integer> list = this.f35931j;
                if (list == null || list.size() <= 0) {
                    com.mbridge.msdk.preload.listenter.a aVar4 = aVar3;
                    if (aVar4 != null) {
                        aVar4.onPreloadFaild("do not have sorceList");
                        return;
                    }
                    return;
                }
                this.f35927f = new LinkedList();
                Iterator<Integer> it = this.f35931j.iterator();
                while (it.hasNext()) {
                    this.f35927f.add(it.next());
                }
                List<Integer> list2 = this.f35933l;
                if (list2 != null && list2.size() > 0) {
                    this.f35928g = new LinkedList();
                    Iterator<Integer> it2 = this.f35933l.iterator();
                    while (it2.hasNext()) {
                        this.f35928g.add(Long.valueOf(it2.next().intValue() * 1000));
                    }
                }
                if (this.f35931j.contains(1) && i10 == 0) {
                    try {
                        com.mbridge.msdk.preload.listenter.a aVar5 = aVar3;
                        str2 = str3;
                        try {
                            a(1, this.f35932k.get(this.f35931j.indexOf(1)).intValue() * 1000, i10, this.f35925d, str3, str4, false, aVar5);
                            com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(1);
                            if (bVarA == null || (listA = bVarA.a(str2, 0)) == null || listA.size() <= 0) {
                                aVar = aVar5;
                            } else {
                                aVar = aVar5;
                                try {
                                    a(true, aVar, (String) null);
                                } catch (Exception unused2) {
                                }
                            }
                        } catch (Exception unused3) {
                        }
                    } catch (Exception unused4) {
                        aVar = aVar3;
                        str2 = str3;
                    }
                } else {
                    aVar = aVar3;
                    str2 = str3;
                }
                a(i10, this.f35925d, str2, str4, aVar);
                l lVar = this.f35925d;
                d().put(str2, Integer.valueOf(lVar != null ? lVar.y() * this.f35937p : 1));
                try {
                    int i11 = MBMediaView.f36227p0;
                    e.a(com.mbridge.msdk.foundation.controller.c.n().d(), str2);
                    o0.a();
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).d();
                    int iA = a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : null);
                    if (iA <= 0) {
                        iA = this.f35937p;
                    }
                    List<Campaign> listA2 = a(str2, iA);
                    if (listA2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i12 = 0; i12 < listA2.size(); i12++) {
                            CampaignEx campaignEx = (CampaignEx) listA2.get(i12);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList.add(campaignEx);
                            }
                        }
                        if (arrayList.size() > 0) {
                            Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, com.mbridge.msdk.foundation.controller.c.n().d(), str2, new CopyOnWriteArrayList(arrayList), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, str2);
                        }
                    }
                } catch (Throwable unused5) {
                    q0.b(f35914r, "init cam cache failed");
                }
            }
        } catch (Exception e10) {
            q0.b(f35914r, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e10) {
            q0.b(f35914r, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
        return 0;
    }

    public List<Campaign> a(String str, int i10) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        l lVarE = h.b().e("", str);
        this.f35925d = lVarE;
        if (lVarE == null) {
            this.f35925d = l.i(str);
        }
        List<Integer> listB = this.f35925d.b();
        this.f35931j = listB;
        if (listB == null || listB.size() <= 0 || !this.f35931j.contains(1) || (bVarA = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return bVarA.a(str, i10);
    }

    public void a(int i10, l lVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar) {
        Queue<Integer> queue = this.f35927f;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        try {
            int iIntValue = this.f35927f.poll().intValue();
            long jLongValue = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f35928g;
            if (queue2 != null && queue2.size() > 0) {
                jLongValue = this.f35928g.poll().longValue();
            }
            q0.c(f35914r, "preload start queue adsource = " + iIntValue);
            a(iIntValue, jLongValue, str, str2, this.f35930i, i10, lVar, aVar);
        } catch (Throwable unused) {
            q0.b(f35914r, "queue poll exception");
        }
    }

    public void a(int i10, long j10, String str, String str2, Map<String, Object> map, int i11, l lVar, com.mbridge.msdk.preload.listenter.a aVar) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        if (i10 != 1 && (bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10)) != null) {
            List<Campaign> listA = bVarA.a(str, this.f35937p);
            if (listA != null && listA.size() > 0) {
                a(true, aVar, (String) null);
                return;
            }
        }
        if (i10 == 1) {
            a(i10, j10, i11, lVar, str, str2, true, aVar);
        } else if (i10 != 2) {
            a(i10, j10, i11, lVar, str, str2, aVar, false);
        } else {
            a(2, j10, i11, lVar, str, str2, aVar, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02b0 A[Catch: Exception -> 0x0496, TryCatch #3 {Exception -> 0x0496, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00ec, B:30:0x00f3, B:32:0x00f9, B:33:0x00fe, B:35:0x0125, B:36:0x012a, B:43:0x0143, B:46:0x014b, B:48:0x0153, B:50:0x0159, B:52:0x015e, B:54:0x0162, B:58:0x0176, B:60:0x017e, B:62:0x0184, B:66:0x018f, B:67:0x01a1, B:69:0x01a5, B:70:0x01bb, B:72:0x01c3, B:74:0x01d2, B:75:0x01e8, B:78:0x01f9, B:80:0x01ff, B:84:0x020c, B:86:0x0213, B:88:0x0219, B:114:0x0264, B:115:0x0271, B:123:0x0287, B:125:0x02b0, B:126:0x02b7, B:128:0x02bf, B:130:0x02d1, B:131:0x02da, B:133:0x02e5, B:139:0x02f5, B:143:0x0305, B:148:0x0313, B:152:0x033f, B:154:0x037a, B:155:0x037f, B:157:0x0387, B:159:0x0391, B:160:0x03b2, B:162:0x03bc, B:164:0x03c6, B:165:0x03e7, B:169:0x041e, B:171:0x044c, B:175:0x047e, B:174:0x0465, B:168:0x041b, B:151:0x032b, B:140:0x02fa, B:141:0x02ff, B:94:0x0222, B:96:0x0228, B:108:0x024d, B:117:0x0278, B:176:0x0484), top: B:187:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:128:0x02bf A[Catch: Exception -> 0x0496, TryCatch #3 {Exception -> 0x0496, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00ec, B:30:0x00f3, B:32:0x00f9, B:33:0x00fe, B:35:0x0125, B:36:0x012a, B:43:0x0143, B:46:0x014b, B:48:0x0153, B:50:0x0159, B:52:0x015e, B:54:0x0162, B:58:0x0176, B:60:0x017e, B:62:0x0184, B:66:0x018f, B:67:0x01a1, B:69:0x01a5, B:70:0x01bb, B:72:0x01c3, B:74:0x01d2, B:75:0x01e8, B:78:0x01f9, B:80:0x01ff, B:84:0x020c, B:86:0x0213, B:88:0x0219, B:114:0x0264, B:115:0x0271, B:123:0x0287, B:125:0x02b0, B:126:0x02b7, B:128:0x02bf, B:130:0x02d1, B:131:0x02da, B:133:0x02e5, B:139:0x02f5, B:143:0x0305, B:148:0x0313, B:152:0x033f, B:154:0x037a, B:155:0x037f, B:157:0x0387, B:159:0x0391, B:160:0x03b2, B:162:0x03bc, B:164:0x03c6, B:165:0x03e7, B:169:0x041e, B:171:0x044c, B:175:0x047e, B:174:0x0465, B:168:0x041b, B:151:0x032b, B:140:0x02fa, B:141:0x02ff, B:94:0x0222, B:96:0x0228, B:108:0x024d, B:117:0x0278, B:176:0x0484), top: B:187:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:130:0x02d1 A[Catch: Exception -> 0x0496, TryCatch #3 {Exception -> 0x0496, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00ec, B:30:0x00f3, B:32:0x00f9, B:33:0x00fe, B:35:0x0125, B:36:0x012a, B:43:0x0143, B:46:0x014b, B:48:0x0153, B:50:0x0159, B:52:0x015e, B:54:0x0162, B:58:0x0176, B:60:0x017e, B:62:0x0184, B:66:0x018f, B:67:0x01a1, B:69:0x01a5, B:70:0x01bb, B:72:0x01c3, B:74:0x01d2, B:75:0x01e8, B:78:0x01f9, B:80:0x01ff, B:84:0x020c, B:86:0x0213, B:88:0x0219, B:114:0x0264, B:115:0x0271, B:123:0x0287, B:125:0x02b0, B:126:0x02b7, B:128:0x02bf, B:130:0x02d1, B:131:0x02da, B:133:0x02e5, B:139:0x02f5, B:143:0x0305, B:148:0x0313, B:152:0x033f, B:154:0x037a, B:155:0x037f, B:157:0x0387, B:159:0x0391, B:160:0x03b2, B:162:0x03bc, B:164:0x03c6, B:165:0x03e7, B:169:0x041e, B:171:0x044c, B:175:0x047e, B:174:0x0465, B:168:0x041b, B:151:0x032b, B:140:0x02fa, B:141:0x02ff, B:94:0x0222, B:96:0x0228, B:108:0x024d, B:117:0x0278, B:176:0x0484), top: B:187:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02e5 A[Catch: Exception -> 0x0496, TryCatch #3 {Exception -> 0x0496, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00ec, B:30:0x00f3, B:32:0x00f9, B:33:0x00fe, B:35:0x0125, B:36:0x012a, B:43:0x0143, B:46:0x014b, B:48:0x0153, B:50:0x0159, B:52:0x015e, B:54:0x0162, B:58:0x0176, B:60:0x017e, B:62:0x0184, B:66:0x018f, B:67:0x01a1, B:69:0x01a5, B:70:0x01bb, B:72:0x01c3, B:74:0x01d2, B:75:0x01e8, B:78:0x01f9, B:80:0x01ff, B:84:0x020c, B:86:0x0213, B:88:0x0219, B:114:0x0264, B:115:0x0271, B:123:0x0287, B:125:0x02b0, B:126:0x02b7, B:128:0x02bf, B:130:0x02d1, B:131:0x02da, B:133:0x02e5, B:139:0x02f5, B:143:0x0305, B:148:0x0313, B:152:0x033f, B:154:0x037a, B:155:0x037f, B:157:0x0387, B:159:0x0391, B:160:0x03b2, B:162:0x03bc, B:164:0x03c6, B:165:0x03e7, B:169:0x041e, B:171:0x044c, B:175:0x047e, B:174:0x0465, B:168:0x041b, B:151:0x032b, B:140:0x02fa, B:141:0x02ff, B:94:0x0222, B:96:0x0228, B:108:0x024d, B:117:0x0278, B:176:0x0484), top: B:187:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0304  */
    /* JADX WARN: Code duplicated, block: B:146:0x0310  */
    /* JADX WARN: Code duplicated, block: B:148:0x0313 A[Catch: Exception -> 0x0496, TRY_ENTER, TryCatch #3 {Exception -> 0x0496, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00ec, B:30:0x00f3, B:32:0x00f9, B:33:0x00fe, B:35:0x0125, B:36:0x012a, B:43:0x0143, B:46:0x014b, B:48:0x0153, B:50:0x0159, B:52:0x015e, B:54:0x0162, B:58:0x0176, B:60:0x017e, B:62:0x0184, B:66:0x018f, B:67:0x01a1, B:69:0x01a5, B:70:0x01bb, B:72:0x01c3, B:74:0x01d2, B:75:0x01e8, B:78:0x01f9, B:80:0x01ff, B:84:0x020c, B:86:0x0213, B:88:0x0219, B:114:0x0264, B:115:0x0271, B:123:0x0287, B:125:0x02b0, B:126:0x02b7, B:128:0x02bf, B:130:0x02d1, B:131:0x02da, B:133:0x02e5, B:139:0x02f5, B:143:0x0305, B:148:0x0313, B:152:0x033f, B:154:0x037a, B:155:0x037f, B:157:0x0387, B:159:0x0391, B:160:0x03b2, B:162:0x03bc, B:164:0x03c6, B:165:0x03e7, B:169:0x041e, B:171:0x044c, B:175:0x047e, B:174:0x0465, B:168:0x041b, B:151:0x032b, B:140:0x02fa, B:141:0x02ff, B:94:0x0222, B:96:0x0228, B:108:0x024d, B:117:0x0278, B:176:0x0484), top: B:187:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0328  */
    /* JADX WARN: Code duplicated, block: B:151:0x032b A[Catch: Exception -> 0x0496, TryCatch #3 {Exception -> 0x0496, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00ec, B:30:0x00f3, B:32:0x00f9, B:33:0x00fe, B:35:0x0125, B:36:0x012a, B:43:0x0143, B:46:0x014b, B:48:0x0153, B:50:0x0159, B:52:0x015e, B:54:0x0162, B:58:0x0176, B:60:0x017e, B:62:0x0184, B:66:0x018f, B:67:0x01a1, B:69:0x01a5, B:70:0x01bb, B:72:0x01c3, B:74:0x01d2, B:75:0x01e8, B:78:0x01f9, B:80:0x01ff, B:84:0x020c, B:86:0x0213, B:88:0x0219, B:114:0x0264, B:115:0x0271, B:123:0x0287, B:125:0x02b0, B:126:0x02b7, B:128:0x02bf, B:130:0x02d1, B:131:0x02da, B:133:0x02e5, B:139:0x02f5, B:143:0x0305, B:148:0x0313, B:152:0x033f, B:154:0x037a, B:155:0x037f, B:157:0x0387, B:159:0x0391, B:160:0x03b2, B:162:0x03bc, B:164:0x03c6, B:165:0x03e7, B:169:0x041e, B:171:0x044c, B:175:0x047e, B:174:0x0465, B:168:0x041b, B:151:0x032b, B:140:0x02fa, B:141:0x02ff, B:94:0x0222, B:96:0x0228, B:108:0x024d, B:117:0x0278, B:176:0x0484), top: B:187:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:154:0x037a A[Catch: Exception -> 0x0496, TryCatch #3 {Exception -> 0x0496, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00ec, B:30:0x00f3, B:32:0x00f9, B:33:0x00fe, B:35:0x0125, B:36:0x012a, B:43:0x0143, B:46:0x014b, B:48:0x0153, B:50:0x0159, B:52:0x015e, B:54:0x0162, B:58:0x0176, B:60:0x017e, B:62:0x0184, B:66:0x018f, B:67:0x01a1, B:69:0x01a5, B:70:0x01bb, B:72:0x01c3, B:74:0x01d2, B:75:0x01e8, B:78:0x01f9, B:80:0x01ff, B:84:0x020c, B:86:0x0213, B:88:0x0219, B:114:0x0264, B:115:0x0271, B:123:0x0287, B:125:0x02b0, B:126:0x02b7, B:128:0x02bf, B:130:0x02d1, B:131:0x02da, B:133:0x02e5, B:139:0x02f5, B:143:0x0305, B:148:0x0313, B:152:0x033f, B:154:0x037a, B:155:0x037f, B:157:0x0387, B:159:0x0391, B:160:0x03b2, B:162:0x03bc, B:164:0x03c6, B:165:0x03e7, B:169:0x041e, B:171:0x044c, B:175:0x047e, B:174:0x0465, B:168:0x041b, B:151:0x032b, B:140:0x02fa, B:141:0x02ff, B:94:0x0222, B:96:0x0228, B:108:0x024d, B:117:0x0278, B:176:0x0484), top: B:187:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0387 A[Catch: Exception -> 0x0496, TryCatch #3 {Exception -> 0x0496, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00ec, B:30:0x00f3, B:32:0x00f9, B:33:0x00fe, B:35:0x0125, B:36:0x012a, B:43:0x0143, B:46:0x014b, B:48:0x0153, B:50:0x0159, B:52:0x015e, B:54:0x0162, B:58:0x0176, B:60:0x017e, B:62:0x0184, B:66:0x018f, B:67:0x01a1, B:69:0x01a5, B:70:0x01bb, B:72:0x01c3, B:74:0x01d2, B:75:0x01e8, B:78:0x01f9, B:80:0x01ff, B:84:0x020c, B:86:0x0213, B:88:0x0219, B:114:0x0264, B:115:0x0271, B:123:0x0287, B:125:0x02b0, B:126:0x02b7, B:128:0x02bf, B:130:0x02d1, B:131:0x02da, B:133:0x02e5, B:139:0x02f5, B:143:0x0305, B:148:0x0313, B:152:0x033f, B:154:0x037a, B:155:0x037f, B:157:0x0387, B:159:0x0391, B:160:0x03b2, B:162:0x03bc, B:164:0x03c6, B:165:0x03e7, B:169:0x041e, B:171:0x044c, B:175:0x047e, B:174:0x0465, B:168:0x041b, B:151:0x032b, B:140:0x02fa, B:141:0x02ff, B:94:0x0222, B:96:0x0228, B:108:0x024d, B:117:0x0278, B:176:0x0484), top: B:187:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:162:0x03bc A[Catch: Exception -> 0x0496, TryCatch #3 {Exception -> 0x0496, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00ec, B:30:0x00f3, B:32:0x00f9, B:33:0x00fe, B:35:0x0125, B:36:0x012a, B:43:0x0143, B:46:0x014b, B:48:0x0153, B:50:0x0159, B:52:0x015e, B:54:0x0162, B:58:0x0176, B:60:0x017e, B:62:0x0184, B:66:0x018f, B:67:0x01a1, B:69:0x01a5, B:70:0x01bb, B:72:0x01c3, B:74:0x01d2, B:75:0x01e8, B:78:0x01f9, B:80:0x01ff, B:84:0x020c, B:86:0x0213, B:88:0x0219, B:114:0x0264, B:115:0x0271, B:123:0x0287, B:125:0x02b0, B:126:0x02b7, B:128:0x02bf, B:130:0x02d1, B:131:0x02da, B:133:0x02e5, B:139:0x02f5, B:143:0x0305, B:148:0x0313, B:152:0x033f, B:154:0x037a, B:155:0x037f, B:157:0x0387, B:159:0x0391, B:160:0x03b2, B:162:0x03bc, B:164:0x03c6, B:165:0x03e7, B:169:0x041e, B:171:0x044c, B:175:0x047e, B:174:0x0465, B:168:0x041b, B:151:0x032b, B:140:0x02fa, B:141:0x02ff, B:94:0x0222, B:96:0x0228, B:108:0x024d, B:117:0x0278, B:176:0x0484), top: B:187:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0419 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x041b A[Catch: Exception -> 0x0496, TryCatch #3 {Exception -> 0x0496, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00ec, B:30:0x00f3, B:32:0x00f9, B:33:0x00fe, B:35:0x0125, B:36:0x012a, B:43:0x0143, B:46:0x014b, B:48:0x0153, B:50:0x0159, B:52:0x015e, B:54:0x0162, B:58:0x0176, B:60:0x017e, B:62:0x0184, B:66:0x018f, B:67:0x01a1, B:69:0x01a5, B:70:0x01bb, B:72:0x01c3, B:74:0x01d2, B:75:0x01e8, B:78:0x01f9, B:80:0x01ff, B:84:0x020c, B:86:0x0213, B:88:0x0219, B:114:0x0264, B:115:0x0271, B:123:0x0287, B:125:0x02b0, B:126:0x02b7, B:128:0x02bf, B:130:0x02d1, B:131:0x02da, B:133:0x02e5, B:139:0x02f5, B:143:0x0305, B:148:0x0313, B:152:0x033f, B:154:0x037a, B:155:0x037f, B:157:0x0387, B:159:0x0391, B:160:0x03b2, B:162:0x03bc, B:164:0x03c6, B:165:0x03e7, B:169:0x041e, B:171:0x044c, B:175:0x047e, B:174:0x0465, B:168:0x041b, B:151:0x032b, B:140:0x02fa, B:141:0x02ff, B:94:0x0222, B:96:0x0228, B:108:0x024d, B:117:0x0278, B:176:0x0484), top: B:187:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:171:0x044c A[Catch: Exception -> 0x0496, TryCatch #3 {Exception -> 0x0496, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00ec, B:30:0x00f3, B:32:0x00f9, B:33:0x00fe, B:35:0x0125, B:36:0x012a, B:43:0x0143, B:46:0x014b, B:48:0x0153, B:50:0x0159, B:52:0x015e, B:54:0x0162, B:58:0x0176, B:60:0x017e, B:62:0x0184, B:66:0x018f, B:67:0x01a1, B:69:0x01a5, B:70:0x01bb, B:72:0x01c3, B:74:0x01d2, B:75:0x01e8, B:78:0x01f9, B:80:0x01ff, B:84:0x020c, B:86:0x0213, B:88:0x0219, B:114:0x0264, B:115:0x0271, B:123:0x0287, B:125:0x02b0, B:126:0x02b7, B:128:0x02bf, B:130:0x02d1, B:131:0x02da, B:133:0x02e5, B:139:0x02f5, B:143:0x0305, B:148:0x0313, B:152:0x033f, B:154:0x037a, B:155:0x037f, B:157:0x0387, B:159:0x0391, B:160:0x03b2, B:162:0x03bc, B:164:0x03c6, B:165:0x03e7, B:169:0x041e, B:171:0x044c, B:175:0x047e, B:174:0x0465, B:168:0x041b, B:151:0x032b, B:140:0x02fa, B:141:0x02ff, B:94:0x0222, B:96:0x0228, B:108:0x024d, B:117:0x0278, B:176:0x0484), top: B:187:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0460  */
    /* JADX WARN: Code duplicated, block: B:174:0x0465 A[Catch: Exception -> 0x0496, TryCatch #3 {Exception -> 0x0496, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00ec, B:30:0x00f3, B:32:0x00f9, B:33:0x00fe, B:35:0x0125, B:36:0x012a, B:43:0x0143, B:46:0x014b, B:48:0x0153, B:50:0x0159, B:52:0x015e, B:54:0x0162, B:58:0x0176, B:60:0x017e, B:62:0x0184, B:66:0x018f, B:67:0x01a1, B:69:0x01a5, B:70:0x01bb, B:72:0x01c3, B:74:0x01d2, B:75:0x01e8, B:78:0x01f9, B:80:0x01ff, B:84:0x020c, B:86:0x0213, B:88:0x0219, B:114:0x0264, B:115:0x0271, B:123:0x0287, B:125:0x02b0, B:126:0x02b7, B:128:0x02bf, B:130:0x02d1, B:131:0x02da, B:133:0x02e5, B:139:0x02f5, B:143:0x0305, B:148:0x0313, B:152:0x033f, B:154:0x037a, B:155:0x037f, B:157:0x0387, B:159:0x0391, B:160:0x03b2, B:162:0x03bc, B:164:0x03c6, B:165:0x03e7, B:169:0x041e, B:171:0x044c, B:175:0x047e, B:174:0x0465, B:168:0x041b, B:151:0x032b, B:140:0x02fa, B:141:0x02ff, B:94:0x0222, B:96:0x0228, B:108:0x024d, B:117:0x0278, B:176:0x0484), top: B:187:0x001c }] */
    /* JADX WARN: Instruction removed from duplicated block: B:148:0x0313, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:151:0x032b, please report this as an issue */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.mbridge.msdk.mbnative.controller.b
    public void a(int i10, long j10, int i11, l lVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar, boolean z10) {
        int i12;
        int i13;
        int iOptInt;
        int iA;
        int i14;
        String strA;
        b bVar;
        long j11;
        k kVar;
        JSONArray jSONArrayB;
        String str3;
        int iOptInt2;
        String string;
        List<Campaign> listA;
        List<Campaign> listA2;
        try {
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).d();
            int iF = this.f35925d.f();
            int iE = this.f35925d.e();
            com.mbridge.msdk.mbnative.service.net.a aVar2 = new com.mbridge.msdk.mbnative.service.net.a(com.mbridge.msdk.foundation.controller.c.n().d());
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            String strC = com.mbridge.msdk.foundation.controller.c.n().c();
            Map<String, Object> map = this.f35930i;
            if (map != null && map.containsKey("app_id") && this.f35930i.containsKey(MBridgeConstans.APP_KEY) && this.f35930i.containsKey(MBridgeConstans.KEY_WORD) && this.f35930i.get(MBridgeConstans.KEY_WORD) != null) {
                if (this.f35930i.get("app_id") instanceof String) {
                    strB = (String) this.f35930i.get("app_id");
                }
                if (this.f35930i.get(MBridgeConstans.APP_KEY) instanceof String) {
                    strC = (String) this.f35930i.get(MBridgeConstans.APP_KEY);
                }
                String str4 = this.f35930i.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.f35930i.get(MBridgeConstans.KEY_WORD) : null;
                if (!TextUtils.isEmpty(str4)) {
                    eVar.a("smart", k0.b(str4));
                }
            }
            String str5 = strB;
            String str6 = strC;
            eVar.a("app_id", str5);
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            eVar.a("req_type", "1");
            if (!TextUtils.isEmpty(this.f35926e)) {
                eVar.a("category", this.f35926e);
            }
            if (!TextUtils.isEmpty(str2)) {
                eVar.a(MBridgeConstans.PLACEMENT_ID, str2);
            }
            eVar.a("sign", SameMD5.getMD5(str5 + str6));
            eVar.a("only_impression", "1");
            String strD = v0.d(str);
            if (!TextUtils.isEmpty(strD)) {
                eVar.a("j", strD);
            }
            int iIntValue = f35918v.get(str).intValue();
            if (iF != f35921y && iF != 0 && iIntValue != 0) {
                if (i11 == 0) {
                    com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10);
                    if (z10) {
                        if (bVarA != null && (listA2 = bVarA.a(str, iIntValue)) != null && listA2.size() > 0) {
                            a(true, aVar, (String) null);
                            return;
                        } else {
                            if (this.f35935n) {
                                a("", i11, str, str2, aVar);
                                return;
                            }
                            return;
                        }
                    }
                    if (i10 != 1 && bVarA != null && (listA = bVarA.a(str, iIntValue)) != null && listA.size() > 0) {
                        a(true, aVar, (String) null);
                        return;
                    }
                }
                if (iIntValue != 0) {
                    eVar.a("ad_num", iIntValue + "");
                }
                if (this.f35929h != 0) {
                    eVar.a("frame_num", this.f35929h + "");
                }
                if (this.f35930i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    String str7 = (String) this.f35930i.get(MBridgeConstans.NATIVE_INFO);
                    if (TextUtils.isEmpty(str7)) {
                        i12 = iIntValue;
                    } else {
                        q0.b(f35914r, "nativeinfo" + str7);
                        try {
                            JSONArray jSONArray = new JSONArray(str7);
                            if (jSONArray.length() > 0) {
                                str3 = str7;
                                int i15 = 0;
                                iOptInt = 0;
                                iOptInt2 = 0;
                                while (i15 < jSONArray.length()) {
                                    try {
                                        JSONObject jSONObject = (JSONObject) jSONArray.opt(i15);
                                        int i16 = iOptInt;
                                        i12 = iIntValue;
                                        try {
                                            int iOptInt3 = jSONObject.optInt("id", 0);
                                            if (2 == iOptInt3) {
                                                iOptInt = jSONObject.optInt("ad_num");
                                                if (iF > 0) {
                                                    try {
                                                        jSONObject.put("ad_num", iF);
                                                    } catch (JSONException e10) {
                                                        e = e10;
                                                        q0.b(f35914r, com.mbridge.msdk.mbnative.common.a.a(e));
                                                        i13 = iOptInt2;
                                                        string = str3;
                                                        eVar.a(MBridgeConstans.NATIVE_INFO, string);
                                                        iF = i12;
                                                        eVar.a("ad_num", iF + "");
                                                        eVar.a("ping_mode", "1");
                                                        if (h.b().d(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                                                            h.b().a();
                                                        }
                                                        if (!NativeController.b(this.f35930i)) {
                                                            jSONArrayB = v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                                                            if (jSONArrayB.length() > 0) {
                                                                eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f35063h, v0.a(jSONArrayB));
                                                            }
                                                        }
                                                        a(eVar, i10);
                                                        if (f35917u.containsKey(str)) {
                                                            iA = 0;
                                                        } else {
                                                            iA = 0;
                                                        }
                                                        if (this.f35930i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                                                            i14 = 1;
                                                            if (i10 == 1) {
                                                                eVar.a("tnum", this.f35936o + "");
                                                            }
                                                            eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, iA + "");
                                                            eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                                                            eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                                                            strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                                                            if (!TextUtils.isEmpty(strA)) {
                                                                eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f35062g, strA);
                                                            }
                                                            if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                                                                eVar.a("video_width", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                                                            }
                                                            if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                                                                eVar.a("video_height", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                                                            }
                                                            eVar.a("video_version", "2.0");
                                                            bVar = new b(i10);
                                                            bVar.setUnitId(str);
                                                            bVar.setPlacementId(str2);
                                                            bVar.setAdType(42);
                                                            bVar.d(i12);
                                                            bVar.c(iOptInt);
                                                            bVar.e(i13);
                                                            bVar.b(iE);
                                                            bVar.a(aVar);
                                                            if (i10 == 1) {
                                                                bVar.b(true);
                                                            } else {
                                                                bVar.b(true);
                                                            }
                                                            bVar.b(NativeController.a(this.f35930i));
                                                            c cVar = new c(1, bVar, i11, str, str2);
                                                            bVar.a(cVar);
                                                            bVar.a(i11);
                                                            cVar.a(aVar);
                                                            cVar.a(z10);
                                                            cVar.a(str);
                                                            if (i11 == 0) {
                                                                j11 = j10;
                                                                aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                                                            } else {
                                                                j11 = j10;
                                                                if (i11 == 1) {
                                                                    aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f35027b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                                                                }
                                                            }
                                                            this.f35902a.postDelayed(cVar, j11);
                                                            return;
                                                        }
                                                        i14 = 1;
                                                        if (i10 == i14) {
                                                            eVar.a("tnum", this.f35937p + "");
                                                        }
                                                        eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, iA + "");
                                                        eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                                                        eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                                                        strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                                                        if (!TextUtils.isEmpty(strA)) {
                                                            eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f35062g, strA);
                                                        }
                                                        if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                                                            eVar.a("video_width", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                                                        }
                                                        if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                                                            eVar.a("video_height", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                                                        }
                                                        eVar.a("video_version", "2.0");
                                                        bVar = new b(i10);
                                                        bVar.setUnitId(str);
                                                        bVar.setPlacementId(str2);
                                                        bVar.setAdType(42);
                                                        bVar.d(i12);
                                                        bVar.c(iOptInt);
                                                        bVar.e(i13);
                                                        bVar.b(iE);
                                                        bVar.a(aVar);
                                                        if (i10 == 1) {
                                                            bVar.b(true);
                                                        } else {
                                                            bVar.b(true);
                                                        }
                                                        bVar.b(NativeController.a(this.f35930i));
                                                        c cVar2 = new c(1, bVar, i11, str, str2);
                                                        bVar.a(cVar2);
                                                        bVar.a(i11);
                                                        cVar2.a(aVar);
                                                        cVar2.a(z10);
                                                        cVar2.a(str);
                                                        if (i11 == 0) {
                                                            j11 = j10;
                                                            aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                                                        } else {
                                                            j11 = j10;
                                                            if (i11 == 1) {
                                                                aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f35027b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                                                            }
                                                        }
                                                        this.f35902a.postDelayed(cVar2, j11);
                                                        return;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                if (3 == iOptInt3) {
                                                    iOptInt2 = jSONObject.optInt("ad_num");
                                                    if (iF > 0) {
                                                        jSONObject.put("ad_num", iF);
                                                    }
                                                }
                                                iOptInt = i16;
                                            }
                                            i15++;
                                            iIntValue = i12;
                                        } catch (JSONException e11) {
                                            e = e11;
                                            iOptInt = i16;
                                        }
                                    } catch (JSONException e12) {
                                        e = e12;
                                        i12 = iIntValue;
                                    }
                                }
                                i12 = iIntValue;
                                i13 = iOptInt2;
                            } else {
                                i12 = iIntValue;
                                str3 = str7;
                                i13 = 0;
                                iOptInt = 0;
                            }
                            try {
                                this.f35936o = Math.max(iOptInt, i13);
                                string = jSONArray.toString();
                            } catch (JSONException e13) {
                                e = e13;
                                iOptInt2 = i13;
                                q0.b(f35914r, com.mbridge.msdk.mbnative.common.a.a(e));
                                i13 = iOptInt2;
                                string = str3;
                            }
                        } catch (JSONException e14) {
                            e = e14;
                            i12 = iIntValue;
                            str3 = str7;
                            iOptInt = 0;
                            iOptInt2 = 0;
                        }
                        eVar.a(MBridgeConstans.NATIVE_INFO, string);
                    }
                    iF = i12;
                    eVar.a("ad_num", iF + "");
                    eVar.a("ping_mode", "1");
                    if (h.b().d(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                        h.b().a();
                    }
                    if (!NativeController.b(this.f35930i)) {
                        jSONArrayB = v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                        if (jSONArrayB.length() > 0) {
                            eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f35063h, v0.a(jSONArrayB));
                        }
                    }
                    a(eVar, i10);
                    if (f35917u.containsKey(str) || (kVar = f35917u.get(str)) == null) {
                        iA = 0;
                    } else if (i10 == 1 || i10 != 2) {
                        iA = kVar.a();
                    } else {
                        iA = kVar.b();
                    }
                    if (this.f35930i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i14 = 1;
                        if (i10 == 1) {
                            eVar.a("tnum", this.f35936o + "");
                        }
                        eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, iA + "");
                        eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                        eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                        strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                        if (!TextUtils.isEmpty(strA)) {
                            eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f35062g, strA);
                        }
                        if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                            eVar.a("video_width", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                        }
                        if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                            eVar.a("video_height", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                        }
                        eVar.a("video_version", "2.0");
                        bVar = new b(i10);
                        bVar.setUnitId(str);
                        bVar.setPlacementId(str2);
                        bVar.setAdType(42);
                        bVar.d(i12);
                        bVar.c(iOptInt);
                        bVar.e(i13);
                        bVar.b(iE);
                        bVar.a(aVar);
                        if (i10 == 1 || z10) {
                            bVar.b(true);
                        }
                        bVar.b(NativeController.a(this.f35930i));
                        c cVar3 = new c(1, bVar, i11, str, str2);
                        bVar.a(cVar3);
                        bVar.a(i11);
                        cVar3.a(aVar);
                        cVar3.a(z10);
                        cVar3.a(str);
                        if (i11 == 0) {
                            j11 = j10;
                            aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                        } else {
                            j11 = j10;
                            if (i11 == 1) {
                                aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f35027b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                            }
                        }
                        this.f35902a.postDelayed(cVar3, j11);
                        return;
                    }
                    i14 = 1;
                    if (i10 == i14) {
                        eVar.a("tnum", this.f35937p + "");
                    }
                    eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, iA + "");
                    eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                    eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                    strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                    if (!TextUtils.isEmpty(strA)) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f35062g, strA);
                    }
                    if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        eVar.a("video_width", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        eVar.a("video_height", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    eVar.a("video_version", "2.0");
                    bVar = new b(i10);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.d(i12);
                    bVar.c(iOptInt);
                    bVar.e(i13);
                    bVar.b(iE);
                    bVar.a(aVar);
                    if (i10 == 1) {
                        bVar.b(true);
                    } else {
                        bVar.b(true);
                    }
                    bVar.b(NativeController.a(this.f35930i));
                    c cVar4 = new c(1, bVar, i11, str, str2);
                    bVar.a(cVar4);
                    bVar.a(i11);
                    cVar4.a(aVar);
                    cVar4.a(z10);
                    cVar4.a(str);
                    if (i11 == 0) {
                        j11 = j10;
                        aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                    } else {
                        j11 = j10;
                        if (i11 == 1) {
                            aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f35027b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                        }
                    }
                    this.f35902a.postDelayed(cVar4, j11);
                    return;
                }
                i12 = iIntValue;
                if (iF != f35922z && iF != 0) {
                    i13 = 0;
                    iOptInt = 0;
                }
                eVar.a("ad_num", iF + "");
                eVar.a("ping_mode", "1");
                if (h.b().d(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                    h.b().a();
                }
                if (!NativeController.b(this.f35930i)) {
                    jSONArrayB = v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                    if (jSONArrayB.length() > 0) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f35063h, v0.a(jSONArrayB));
                    }
                }
                a(eVar, i10);
                if (f35917u.containsKey(str)) {
                    iA = 0;
                } else {
                    iA = 0;
                }
                if (this.f35930i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    i14 = 1;
                    if (i10 == 1) {
                        eVar.a("tnum", this.f35936o + "");
                    }
                    eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, iA + "");
                    eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                    eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                    strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                    if (!TextUtils.isEmpty(strA)) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f35062g, strA);
                    }
                    if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        eVar.a("video_width", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        eVar.a("video_height", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    eVar.a("video_version", "2.0");
                    bVar = new b(i10);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.d(i12);
                    bVar.c(iOptInt);
                    bVar.e(i13);
                    bVar.b(iE);
                    bVar.a(aVar);
                    if (i10 == 1) {
                        bVar.b(true);
                    } else {
                        bVar.b(true);
                    }
                    bVar.b(NativeController.a(this.f35930i));
                    c cVar5 = new c(1, bVar, i11, str, str2);
                    bVar.a(cVar5);
                    bVar.a(i11);
                    cVar5.a(aVar);
                    cVar5.a(z10);
                    cVar5.a(str);
                    if (i11 == 0) {
                        j11 = j10;
                        aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                    } else {
                        j11 = j10;
                        if (i11 == 1) {
                            aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f35027b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                        }
                    }
                    this.f35902a.postDelayed(cVar5, j11);
                    return;
                }
                i14 = 1;
                if (i10 == i14) {
                    eVar.a("tnum", this.f35937p + "");
                }
                eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, iA + "");
                eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                if (!TextUtils.isEmpty(strA)) {
                    eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f35062g, strA);
                }
                if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                    eVar.a("video_width", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                }
                if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                    eVar.a("video_height", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                }
                eVar.a("video_version", "2.0");
                bVar = new b(i10);
                bVar.setUnitId(str);
                bVar.setPlacementId(str2);
                bVar.setAdType(42);
                bVar.d(i12);
                bVar.c(iOptInt);
                bVar.e(i13);
                bVar.b(iE);
                bVar.a(aVar);
                if (i10 == 1) {
                    bVar.b(true);
                } else {
                    bVar.b(true);
                }
                bVar.b(NativeController.a(this.f35930i));
                c cVar6 = new c(1, bVar, i11, str, str2);
                bVar.a(cVar6);
                bVar.a(i11);
                cVar6.a(aVar);
                cVar6.a(z10);
                cVar6.a(str);
                if (i11 == 0) {
                    j11 = j10;
                    aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                } else {
                    j11 = j10;
                    if (i11 == 1) {
                        aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f35027b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                    }
                }
                this.f35902a.postDelayed(cVar6, j11);
                return;
                i13 = 0;
                iOptInt = 0;
                iF = i12;
                eVar.a("ad_num", iF + "");
                eVar.a("ping_mode", "1");
                if (h.b().d(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                    h.b().a();
                }
                if (!NativeController.b(this.f35930i)) {
                    jSONArrayB = v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                    if (jSONArrayB.length() > 0) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f35063h, v0.a(jSONArrayB));
                    }
                }
                a(eVar, i10);
                if (f35917u.containsKey(str)) {
                    iA = 0;
                } else {
                    iA = 0;
                }
                if (this.f35930i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    i14 = 1;
                    if (i10 == 1) {
                        eVar.a("tnum", this.f35936o + "");
                    }
                    eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, iA + "");
                    eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                    eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                    strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                    if (!TextUtils.isEmpty(strA)) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f35062g, strA);
                    }
                    if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        eVar.a("video_width", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        eVar.a("video_height", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    eVar.a("video_version", "2.0");
                    bVar = new b(i10);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.d(i12);
                    bVar.c(iOptInt);
                    bVar.e(i13);
                    bVar.b(iE);
                    bVar.a(aVar);
                    if (i10 == 1) {
                        bVar.b(true);
                    } else {
                        bVar.b(true);
                    }
                    bVar.b(NativeController.a(this.f35930i));
                    c cVar7 = new c(1, bVar, i11, str, str2);
                    bVar.a(cVar7);
                    bVar.a(i11);
                    cVar7.a(aVar);
                    cVar7.a(z10);
                    cVar7.a(str);
                    if (i11 == 0) {
                        j11 = j10;
                        aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                    } else {
                        j11 = j10;
                        if (i11 == 1) {
                            aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f35027b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                        }
                    }
                    this.f35902a.postDelayed(cVar7, j11);
                    return;
                }
                i14 = 1;
                if (i10 == i14) {
                    eVar.a("tnum", this.f35937p + "");
                }
                eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, iA + "");
                eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                if (!TextUtils.isEmpty(strA)) {
                    eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f35062g, strA);
                }
                if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                    eVar.a("video_width", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                }
                if (this.f35930i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                    eVar.a("video_height", ((Integer) this.f35930i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                }
                eVar.a("video_version", "2.0");
                bVar = new b(i10);
                bVar.setUnitId(str);
                bVar.setPlacementId(str2);
                bVar.setAdType(42);
                bVar.d(i12);
                bVar.c(iOptInt);
                bVar.e(i13);
                bVar.b(iE);
                bVar.a(aVar);
                if (i10 == 1) {
                    bVar.b(true);
                } else {
                    bVar.b(true);
                }
                bVar.b(NativeController.a(this.f35930i));
                c cVar8 = new c(1, bVar, i11, str, str2);
                bVar.a(cVar8);
                bVar.a(i11);
                cVar8.a(aVar);
                cVar8.a(z10);
                cVar8.a(str);
                if (i11 == 0) {
                    j11 = j10;
                    aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                } else {
                    j11 = j10;
                    if (i11 == 1) {
                        aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f35027b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                    }
                }
                this.f35902a.postDelayed(cVar8, j11);
                return;
            }
            a("The request was refused", i11, str, str2, aVar);
        } catch (Exception e15) {
            String str8 = f35914r;
            q0.b(str8, com.mbridge.msdk.mbnative.common.a.a(e15));
            q0.b(str8, e15.getMessage());
        }
    }

    public static void a(int i10, String str) {
        k kVar;
        if (f35917u.containsKey(str)) {
            kVar = f35917u.get(str);
        } else {
            kVar = new k();
        }
        int iIntValue = f35918v.get(str).intValue();
        int iIntValue2 = d().containsKey(str) ? d().get(str).intValue() : 1;
        if (i10 == 1) {
            int iA = iIntValue + kVar.a();
            kVar.a(iA <= iIntValue2 ? iA : 0);
        } else if (i10 == 2) {
            int iB = iIntValue + kVar.b();
            kVar.b(iB <= iIntValue2 ? iB : 0);
        }
        f35917u.put(str, kVar);
    }

    public void a(String str, int i10, String str2, String str3, com.mbridge.msdk.preload.listenter.a aVar) {
        Log.e(f35914r, str);
        try {
            Queue<Integer> queue = this.f35927f;
            if ((queue != null && queue.size() <= 0) || this.f35927f == null) {
                a(false, aVar, str);
            } else {
                a(i10, this.f35925d, str2, str3, aVar);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, String str2, String str3) {
        if (this.f35923b == null) {
            this.f35923b = new j();
        }
        this.f35923b.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, str3);
    }

    public void a(boolean z10, com.mbridge.msdk.preload.listenter.a aVar, String str) {
        if (z10) {
            if (aVar == null || aVar.a()) {
                return;
            }
            aVar.a(true);
            aVar.onPreloadSucceed();
            return;
        }
        if (aVar == null || aVar.a()) {
            return;
        }
        aVar.a(true);
        aVar.onPreloadFaild(str);
    }

    public void a(boolean z10, Campaign campaign) {
        if (campaign == null) {
            return;
        }
        if (z10 && campaign.getIconDrawable() == null) {
            campaign.loadIconUrlAsyncWithBlock(null);
        }
        if (z10 && campaign.getBigDrawable() == null) {
            campaign.loadImageUrlAsyncWithBlock(null);
        }
    }

    public void a(Thread thread) {
        if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD) {
            thread.run();
        } else {
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<CampaignEx> list, String str) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i10 = MBMediaView.f36227p0;
                        Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
                        if (objInvoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, com.mbridge.msdk.foundation.controller.c.n().d(), str, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, str);
                        }
                    } catch (Exception unused) {
                        q0.b(f35914r, "please import the videocommon aar");
                    }
                }
            } catch (Exception e10) {
                q0.b(f35914r, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }
}
