package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseMBSDKContext.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f34555q = com.mbridge.msdk.foundation.controller.c.class.getSimpleName();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static HashMap<String, String> f34556r = new HashMap<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static com.mbridge.msdk.config.component.status.b f34557s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f34560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f34562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f34563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34564g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f34567j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f34568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f34569l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakReference<Context> f34571n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private JSONObject f34572o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f34558a = new s();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f34565h = new JSONObject();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34566i = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f34570m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f34573p = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseMBSDKContext.java */
    public class RunnableC0320a implements Runnable {
        public RunnableC0320a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.e.a(a.this.f34560c).a();
        }
    }

    /* JADX INFO: compiled from: BaseMBSDKContext.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.d.c();
        }
    }

    /* JADX INFO: compiled from: BaseMBSDKContext.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f34559b = (String) y0.a(aVar.f34560c, "sp_appId", "");
            } catch (Throwable th2) {
                q0.b(a.f34555q, th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: BaseMBSDKContext.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f34567j = (String) y0.a(aVar.f34560c, "sp_appKey", "");
            } catch (Throwable th2) {
                q0.b(a.f34555q, th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: BaseMBSDKContext.java */
    public interface e {
    }

    public abstract void a(e eVar);

    public void b(int i10) {
        this.f34569l = i10;
    }

    public void c(int i10) {
        this.f34573p = i10;
    }

    public Context d() {
        return this.f34560c;
    }

    public s e() {
        return this.f34558a;
    }

    public Context f() {
        WeakReference<Context> weakReference = this.f34571n;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public WeakReference<Activity> a() {
        return this.f34562e;
    }

    public void b(e eVar) {
        try {
            m0.C(this.f34560c);
            a(eVar);
            h.a(this.f34560c, this.f34559b);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                try {
                    try {
                        m0.d(this.f34560c.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled ? 1 : 2);
                    } catch (Throwable th2) {
                        q0.b(f34555q, th2.getMessage());
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    m0.d(0);
                }
            }
            try {
                g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD == null) {
                    gVarD = h.b().a();
                }
                s sVarE = com.mbridge.msdk.foundation.controller.c.n().e();
                if (sVarE != null && sVarE.b() && gVarD != null && gVarD.E() == 1) {
                    com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0320a());
                }
                if (sVarE == null || !sVarE.a()) {
                    return;
                }
                com.mbridge.msdk.foundation.same.threadpool.a.c().post(new b());
            } catch (Throwable th3) {
                q0.b(f34555q, th3.getMessage());
            }
        } catch (Exception e10) {
            q0.b(f34555q, e10.getMessage());
        }
    }

    public void c(e eVar) {
        if (this.f34566i) {
            return;
        }
        m();
        try {
            JSONObject jSONObject = new JSONObject();
            this.f34572o = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e10) {
            q0.b(f34555q, e10.getMessage());
        }
        b(eVar);
    }

    public void d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f34568k = str;
            Context context = this.f34560c;
            if (context != null) {
                y0.b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void e(String str) {
        Context context;
        try {
            this.f34559b = str;
            if (TextUtils.isEmpty(str) || (context = this.f34560c) == null) {
                return;
            }
            y0.b(context, "sp_appId", str);
        } catch (Exception e10) {
            q0.b(f34555q, e10.getMessage());
        }
    }

    public void f(String str) {
        Context context;
        try {
            this.f34567j = str;
            if (TextUtils.isEmpty(str) || (context = this.f34560c) == null) {
                return;
            }
            y0.b(context, "sp_appKey", str);
        } catch (Exception e10) {
            q0.b(f34555q, e10.getMessage());
        }
    }

    public int g() {
        return this.f34564g;
    }

    public String h() {
        return !TextUtils.isEmpty(this.f34568k) ? this.f34568k : "";
    }

    public String i() {
        try {
            if (!TextUtils.isEmpty(this.f34561d)) {
                return this.f34561d;
            }
            Context context = this.f34560c;
            if (context == null) {
                return null;
            }
            String packageName = context.getPackageName();
            this.f34561d = packageName;
            return packageName;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String j() {
        if (!TextUtils.isEmpty(this.f34568k)) {
            return this.f34568k;
        }
        Context context = this.f34560c;
        if (context != null) {
            return (String) y0.a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    public JSONObject k() {
        return this.f34572o;
    }

    public int l() {
        return this.f34573p;
    }

    private void m() {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object objA = y0.a(this.f34560c, MBridgeConstans.SP_GA_ID, "");
                Object objA2 = y0.a(this.f34560c, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (objA instanceof String) {
                    String str = (String) objA;
                    if (!TextUtils.isEmpty(str)) {
                        com.mbridge.msdk.foundation.tools.g.a(str);
                    } else {
                        com.mbridge.msdk.foundation.tools.g.d();
                    }
                    if (objA2 instanceof Integer) {
                        com.mbridge.msdk.foundation.tools.g.a(((Integer) objA2).intValue());
                    }
                }
            }
        } catch (Exception e10) {
            q0.b(f34555q, e10.getMessage());
        }
    }

    public void a(WeakReference<Activity> weakReference) {
        this.f34562e = weakReference;
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f34571n = new WeakReference<>(context);
        }
    }

    public void a(int i10) {
        this.f34564g = i10;
    }

    public BitmapDrawable a(String str, int i10) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        String str2;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f34570m) == null || !concurrentHashMap.containsKey(str) || !s0.a().a("w_m_r_l", true)) {
            return null;
        }
        String str3 = this.f34570m.get(str);
        BitmapDrawable bitmapDrawableN = v0.n(str3);
        int i11 = TextUtils.isEmpty(str3) ? 2 : 1;
        if (TextUtils.isEmpty(str3)) {
            str2 = "get watermark failed";
        } else {
            str2 = bitmapDrawableN != null ? "" : "str to bitmap failed";
        }
        j.a(str, i10, i11, str2, bitmapDrawableN == null ? 2 : 1, str3);
        return bitmapDrawableN;
    }

    public String c() {
        try {
            if (!TextUtils.isEmpty(this.f34567j)) {
                return this.f34567j;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new d());
            return "";
        } catch (Throwable th2) {
            q0.b(f34555q, th2.getMessage());
            return "";
        }
    }

    public void a(JSONObject jSONObject) {
        this.f34572o = jSONObject;
    }

    public void a(String str) {
        try {
            if (this.f34570m != null && !TextUtils.isEmpty(str) && this.f34570m.containsKey(str)) {
                this.f34570m.remove(str);
            }
        } catch (Exception e10) {
            q0.b(f34555q, e10.getMessage());
        }
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f34561d = str;
    }

    public void a(String str, JSONObject jSONObject) {
        if (s0.a().a("w_m_r_l", true)) {
            try {
                if (this.f34565h == null) {
                    this.f34565h = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        this.f34565h.put(next, jSONObject.get(next));
                    }
                }
                if (this.f34565h.has("watermark")) {
                    if (this.f34570m == null) {
                        this.f34570m = new ConcurrentHashMap<>();
                    }
                    this.f34570m.put(str, this.f34565h.getString("watermark"));
                }
            } catch (Exception e10) {
                q0.b(f34555q, e10.getMessage());
            }
        }
    }

    public String b() {
        try {
            if (!TextUtils.isEmpty(this.f34559b)) {
                return this.f34559b;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            return "";
        } catch (Exception e10) {
            q0.b(f34555q, e10.getMessage());
            return "";
        }
    }

    public void b(String str) {
        Context context;
        try {
            this.f34563f = str;
            if (TextUtils.isEmpty(str) || (context = this.f34560c) == null) {
                return;
            }
            y0.b(context, "applicationIds", str);
        } catch (Exception e10) {
            q0.b(f34555q, e10.getMessage());
        }
    }

    public void b(Context context) {
        this.f34560c = context;
    }
}
