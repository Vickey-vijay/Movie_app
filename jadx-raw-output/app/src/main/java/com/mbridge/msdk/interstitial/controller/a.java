package com.mbridge.msdk.interstitial.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.InterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: InterstitialController.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f35488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Map<String, Integer> f35489p = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Map<String, Integer> f35490q = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Map<String, d> f35491r = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f35493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBridgeIds f35497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f35498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f35499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterstitialListener f35500i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35492a = "InterstitialController";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35501j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f35502k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f35503l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f35504m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f35505n = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InterstitialController.java */
    public class HandlerC0338a extends Handler {
        public HandlerC0338a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                if (a.this.f35500i != null) {
                    a.this.f35500i.onInterstitialLoadSuccess(a.this.f35497f);
                    return;
                }
                return;
            }
            String str = "";
            if (i10 == 2) {
                if (a.this.f35500i != null) {
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof String)) {
                        str = (String) obj;
                    }
                    a.this.f35500i.onInterstitialLoadFail(a.this.f35497f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 3) {
                a aVar = a.this;
                aVar.f35501j = true;
                if (aVar.f35500i != null) {
                    a.this.f35500i.onInterstitialShowSuccess(a.this.f35497f);
                    return;
                }
                return;
            }
            if (i10 == 4) {
                if (a.this.f35500i != null) {
                    Object obj2 = message.obj;
                    if (obj2 != null && (obj2 instanceof String)) {
                        str = (String) obj2;
                    }
                    a.this.f35500i.onInterstitialShowFail(a.this.f35497f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 6) {
                if (a.this.f35500i != null) {
                    a.this.f35500i.onInterstitialAdClick(a.this.f35497f);
                }
            } else {
                if (i10 != 7) {
                    return;
                }
                a aVar2 = a.this;
                aVar2.f35501j = false;
                if (aVar2.f35500i != null) {
                    a.this.f35500i.onInterstitialClosed(a.this.f35497f);
                }
            }
        }
    }

    /* JADX INFO: compiled from: InterstitialController.java */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f35507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f35508b;

        public b(com.mbridge.msdk.interstitial.adapter.a aVar, c cVar) {
            this.f35507a = aVar;
            this.f35508b = cVar;
        }

        public void a(boolean z10, String str) {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f35507a;
                if (aVar != null) {
                    aVar.a((b) null);
                    this.f35507a = null;
                }
                if (this.f35508b != null) {
                    if (a.this.f35498g != null) {
                        a.this.f35498g.removeCallbacks(this.f35508b);
                    }
                    if (z10) {
                        if (a.this.f35500i != null) {
                            a.this.c(str);
                        }
                    } else if (a.this.f35500i != null) {
                        a.this.b(str);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void b(boolean z10, String str) {
            try {
                a.this.f35502k = str;
                try {
                    ArrayList arrayList = new ArrayList();
                    com.mbridge.msdk.interstitial.adapter.a aVar = this.f35507a;
                    if (aVar != null && aVar.d() != null) {
                        arrayList.add(this.f35507a.d());
                    }
                    a.this.f35503l = com.mbridge.msdk.foundation.same.c.b(arrayList);
                } catch (Exception e10) {
                    q0.b(a.this.f35492a, e10.getMessage());
                }
                if (this.f35508b != null) {
                    if (a.this.f35498g != null) {
                        a.this.f35498g.removeCallbacks(this.f35508b);
                    }
                    if (z10) {
                        a.this.b(false);
                    } else if (a.this.f35500i != null) {
                        a.this.h();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: InterstitialController.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f35510a;

        public c(com.mbridge.msdk.interstitial.adapter.a aVar) {
            this.f35510a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f35510a;
                if (aVar != null) {
                    if (aVar.f()) {
                        a.this.c("load timeout");
                    } else if (a.this.f35500i != null) {
                        a.this.b("load timeout");
                    }
                    this.f35510a.a((b) null);
                    this.f35510a = null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: InterstitialController.java */
    public class d {
        public void a(String str) {
            try {
                a.this.c(str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public d() {
        }

        public void b() {
            try {
                if (a.this.f35498g != null) {
                    a.this.f35498g.sendEmptyMessage(7);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void c() {
            try {
                a.this.i();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void a() {
            try {
                if (a.this.f35498g != null) {
                    a.this.f35498g.sendEmptyMessage(6);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, g.f44969o);
        p10.startActivity(p11);
    }

    private void e() {
        try {
            g();
            l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35494c);
            this.f35499h = lVarE;
            if (lVarE == null) {
                this.f35499h = l.h(this.f35494c);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Handler handler = this.f35498g;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Handler handler = this.f35498g;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    public void f() {
        try {
            if (this.f35493b == null) {
                b("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f35494c)) {
                b("unitid is null");
            } else {
                if (!this.f35505n) {
                    b("init error");
                    return;
                }
                e();
                d();
                a(false);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            b("can't show because unknow error");
        }
    }

    public void g() {
        try {
            new j().a(this.f35493b, (String) null, (String) null, this.f35494c);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void j() {
        try {
            if (this.f35493b == null) {
                c("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f35494c)) {
                c("unitid is null");
            } else if (!this.f35505n) {
                c("init error");
            } else {
                e();
                b(true);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            c("can't show because unknow error");
        }
    }

    public a() {
        try {
            c();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        try {
            this.f35498g = new HandlerC0338a(Looper.getMainLooper());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        try {
            l lVar = this.f35499h;
            if (lVar != null) {
                int iE = lVar.e();
                int iY = this.f35499h.y();
                if (iE <= 0) {
                    iE = 1;
                }
                if (iY <= 0) {
                    iY = 1;
                }
                int i10 = iY * iE;
                if (f35490q == null || TextUtils.isEmpty(this.f35494c)) {
                    return;
                }
                f35490q.put(this.f35494c, Integer.valueOf(i10));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String b() {
        if (this.f35501j) {
            return this.f35504m;
        }
        return this.f35502k;
    }

    public static void a(String str, int i10) {
        try {
            if (f35489p == null || TextUtils.isEmpty(str)) {
                return;
            }
            f35489p.put(str, Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        try {
            if (this.f35498g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 4;
                this.f35498g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) {
        try {
            CampaignEx campaignExD = new com.mbridge.msdk.interstitial.adapter.a(this.f35493b, this.f35494c, this.f35495d, this.f35496e, true).d();
            if (campaignExD != null) {
                a(campaignExD);
            } else if (z10) {
                a(true);
            } else {
                c("no ads available can show");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            if (this.f35500i != null) {
                c("can't show because unknow error");
            }
        }
    }

    public static int a(String str) {
        Map<String, Integer> map;
        Integer num;
        try {
            if (TextUtils.isEmpty(str) || (map = f35489p) == null || !map.containsKey(str) || (num = f35489p.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public void a(InterstitialListener interstitialListener) {
        this.f35500i = interstitialListener;
    }

    public boolean a(Context context, Map<String, Object> map) {
        try {
            this.f35505n = false;
            if (map != null && context != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID) && (map.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String)) {
                if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) && (map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) instanceof String)) {
                    this.f35496e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
                }
                this.f35494c = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                this.f35493b = context;
                if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                    this.f35495d = (String) map.get(MBridgeConstans.PLACEMENT_ID);
                }
                this.f35497f = new MBridgeIds(this.f35495d, this.f35494c);
                this.f35505n = true;
                return this.f35505n;
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f35505n = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            if (this.f35498g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 2;
                this.f35498g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String a() {
        return this.f35503l;
    }

    public void a(boolean z10) {
        try {
            com.mbridge.msdk.interstitial.adapter.a aVar = new com.mbridge.msdk.interstitial.adapter.a(this.f35493b, this.f35494c, this.f35495d, this.f35496e, z10);
            c cVar = new c(aVar);
            aVar.a(new b(aVar, cVar));
            Handler handler = this.f35498g;
            if (handler != null) {
                handler.postDelayed(cVar, 30000L);
            }
            aVar.j();
        } catch (Exception e10) {
            e10.printStackTrace();
            if (z10) {
                return;
            }
            b("can't show because unknow error");
        }
    }

    private void a(CampaignEx campaignEx) {
        d dVar = new d();
        if (f35491r != null && !TextUtils.isEmpty(this.f35494c)) {
            f35491r.put(this.f35494c, dVar);
        }
        Intent intent = new Intent(this.f35493b, (Class<?>) MBInterstitialActivity.class);
        intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(this.f35494c)) {
            intent.putExtra("unitId", this.f35494c);
        }
        if (campaignEx != null) {
            this.f35504m = campaignEx.getRequestId();
            intent.putExtra(MBInterstitialActivity.INTENT_CAMAPIGN, campaignEx);
        }
        Context context = this.f35493b;
        if (context != null) {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        }
    }
}
