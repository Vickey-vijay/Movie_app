package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.j;
import com.unity3d.services.core.fid.Constants;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: SDKController.java */
/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile d f34599l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f34601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FastKV f34602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f34603d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f34605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f34606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f34607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f34608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.preload.a f34609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f34610k;

    /* JADX INFO: compiled from: SDKController.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f34611a;

        public a(Context context) {
            this.f34611a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.h(this.f34611a);
        }
    }

    /* JADX INFO: compiled from: SDKController.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.prepare();
            d.this.g();
            d.this.d();
            Looper.loop();
        }
    }

    /* JADX INFO: compiled from: SDKController.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.a(dVar.f34604e);
            new h(d.this.f34607h).a();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SDKController.java */
    public class C0323d implements com.mbridge.msdk.foundation.controller.a.e {
        public C0323d() {
        }
    }

    /* JADX INFO: compiled from: SDKController.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f34616a;

        public e(String str) {
            this.f34616a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(350L);
            } catch (InterruptedException e10) {
                q0.b("SDKController", e10.getMessage());
            }
            new j().b(d.this.f34607h, this.f34616a, d.this.f34605f);
        }
    }

    public boolean e() {
        return true;
    }

    public void f() {
    }

    private void c() {
        com.mbridge.msdk.foundation.controller.c.n().b(this.f34607h);
        com.mbridge.msdk.foundation.controller.c.n().e(this.f34604e);
        com.mbridge.msdk.foundation.controller.c.n().f(this.f34605f);
        com.mbridge.msdk.foundation.controller.c.n().d(this.f34610k);
        com.mbridge.msdk.foundation.controller.c.n().b(this.f34606g);
        com.mbridge.msdk.foundation.controller.c.n().c(new C0323d());
        try {
            com.mbridge.msdk.foundation.same.net.utils.d.h().j();
        } catch (Throwable th2) {
            q0.b("SDKController", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        List<com.mbridge.msdk.foundation.entity.a> listG;
        Object objNewInstance;
        Object objNewInstance2;
        try {
            g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null || (listG = gVarD.g()) == null || listG.size() <= 0) {
                return;
            }
            for (com.mbridge.msdk.foundation.entity.a aVar : listG) {
                if (aVar.a() == 287) {
                    if (this.f34607h != null && (objNewInstance = MBInterstitialVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                        MBInterstitialVideoHandler.class.getMethod("loadFormSelfFilling", new Class[0]).invoke(objNewInstance, new Object[0]);
                    }
                } else if (aVar.a() == 94 && (objNewInstance2 = MBRewardVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                    MBRewardVideoHandler.class.getMethod("loadFormSelfFilling", new Class[0]).invoke(objNewInstance2, new Object[0]);
                }
            }
        } catch (Throwable th2) {
            q0.b("SDKController", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            com.mbridge.msdk.timer.b.class.getDeclaredMethod("start", new Class[0]).invoke(com.mbridge.msdk.timer.b.class.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]), new Object[0]);
        } catch (Throwable th2) {
            q0.b("SDKController", th2.getMessage(), th2);
        }
    }

    public void b() {
        a(this.f34607h.getApplicationContext());
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new b());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            com.mbridge.msdk.foundation.same.report.j.b();
        } catch (Exception unused) {
            q0.b("SDKController", "get app setting failed");
        }
        this.f34603d = true;
    }

    private d() {
    }

    public static d a() {
        if (f34599l == null) {
            synchronized (d.class) {
                if (f34599l == null) {
                    f34599l = new d();
                }
            }
        }
        return f34599l;
    }

    public void b(String str) {
        if (this.f34609j == null) {
            this.f34609j = new com.mbridge.msdk.preload.a();
        }
        try {
            Map<String, Object> map = this.f34601b;
            if (map == null || map.size() <= 0 || !this.f34601b.containsKey(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)) {
                return;
            }
            int iIntValue = ((Integer) this.f34601b.get(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)).intValue();
            if (iIntValue == 0) {
                this.f34609j.a(this.f34601b, this.f34600a);
                return;
            }
            if (1 == iIntValue) {
                this.f34609j.a(this.f34601b);
            } else if (2 == iIntValue) {
                this.f34609j.b(this.f34601b);
            } else {
                q0.b("SDKController", "unknow layout type in preload");
            }
        } catch (Exception e10) {
            q0.b("SDKController", e10.getMessage());
        }
    }

    public void a(Map map, Context context) {
        Object obj;
        if (context != null) {
            if (!TextUtils.isEmpty(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE)) {
                com.mbridge.msdk.foundation.controller.c.n().c(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE);
            } else if (map.containsKey(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME) && (obj = map.get(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME)) != null) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    com.mbridge.msdk.foundation.controller.c.n().c(str);
                }
            }
            if (map != null) {
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPID)) {
                    this.f34604e = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPID);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPKEY)) {
                    this.f34605f = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPKEY);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_WX_APPID)) {
                    this.f34610k = (String) map.get(MBridgeConstans.ID_MBRIDGE_WX_APPID);
                }
                if (map.containsKey(MBridgeConstans.PACKAGE_NAME_MANIFEST)) {
                    this.f34606g = (String) map.get(MBridgeConstans.PACKAGE_NAME_MANIFEST);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH)) {
                    this.f34608i = (String) map.get(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH);
                }
            }
            this.f34607h = context.getApplicationContext();
            c();
            if (this.f34603d) {
                return;
            }
            b();
            m0.l(context);
            long jY0 = com.mbridge.msdk.setting.h.b().b(this.f34604e).y0();
            if (jY0 != 1300) {
                new Handler(Looper.getMainLooper()).postDelayed(new a(context), jY0);
            }
        }
    }

    private void a(Context context) {
        String string;
        try {
            if (e() && this.f34602c == null) {
                try {
                    this.f34602c = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), k0.a("H+tU+FeXHM==")).build();
                } catch (Exception unused) {
                    this.f34602c = null;
                }
            }
            FastKV fastKV = this.f34602c;
            String string2 = "";
            if (fastKV != null) {
                String string3 = fastKV.getString(k0.a("H+tU+bfPhM=="), "");
                String string4 = this.f34602c.getString(k0.a("H+tU+Fz8"), "");
                if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f34897g)) {
                    com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b");
                    com.mbridge.msdk.foundation.same.a.f34897g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c");
                }
                if (TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f34897g)) {
                        return;
                    }
                    this.f34602c.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    this.f34602c.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f34897g);
                    return;
                }
                com.mbridge.msdk.foundation.same.a.V = string3;
                com.mbridge.msdk.foundation.same.a.f34897g = string4;
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b", com.mbridge.msdk.foundation.same.a.V);
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f34897g);
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
            if (sharedPreferences != null) {
                string2 = sharedPreferences.getString(k0.a("H+tU+bfPhM=="), "");
                string = sharedPreferences.getString(k0.a("H+tU+Fz8"), "");
            } else {
                string = "";
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f34897g)) {
                com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b");
                com.mbridge.msdk.foundation.same.a.f34897g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c");
            }
            if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string)) {
                if ((TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f34897g)) || sharedPreferences == null) {
                    return;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                editorEdit.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f34897g);
                editorEdit.apply();
                return;
            }
            com.mbridge.msdk.foundation.same.a.V = string2;
            com.mbridge.msdk.foundation.same.a.f34897g = string;
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b", com.mbridge.msdk.foundation.same.a.V);
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f34897g);
        } catch (Throwable th2) {
            q0.b("SDKController", th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (com.mbridge.msdk.setting.h.b() == null) {
            return;
        }
        com.mbridge.msdk.setting.h hVarB = com.mbridge.msdk.setting.h.b();
        if (hVarB != null) {
            g gVarD = hVarB.d(str);
            if (gVarD != null) {
                MBridgeConstans.OMID_JS_SERVICE_URL = gVarD.U();
                MBridgeConstans.OMID_JS_H5_URL = gVarD.T();
                if (!TextUtils.isEmpty(gVarD.u())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f35038i = gVarD.u();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().e();
                }
                if (!TextUtils.isEmpty(gVarD.v())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f35042m = gVarD.v();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f();
                }
            } else {
                MBridgeConstans.OMID_JS_SERVICE_URL = com.mbridge.msdk.setting.net.b.f36922b;
                MBridgeConstans.OMID_JS_H5_URL = com.mbridge.msdk.setting.net.b.f36921a;
            }
        }
        if (com.mbridge.msdk.setting.h.b().f(str) && com.mbridge.msdk.setting.h.b().a(str, 1, (String) null)) {
            if (com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("is_first_init", 0) == 0) {
                try {
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("is_first_init", 1);
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.g.d())) {
                        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(str));
                    } else {
                        new j().b(this.f34607h, str, this.f34605f);
                    }
                    return;
                } catch (Throwable unused) {
                    new j().b(this.f34607h, str, this.f34605f);
                    return;
                }
            }
            new j().b(this.f34607h, str, this.f34605f);
        }
    }

    public void a(Map<String, Object> map, int i10) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() != MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            q0.b("SDKController", "preloaad failed,sdk do not inited");
            return;
        }
        this.f34601b = map;
        this.f34600a = i10;
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        if (map != null) {
            b(strB);
        }
    }
}
