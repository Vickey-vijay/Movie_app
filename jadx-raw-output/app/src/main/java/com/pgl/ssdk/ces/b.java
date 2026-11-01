package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.Q6;
import com.pgl.ssdk.a5;
import com.pgl.ssdk.aa;
import com.pgl.ssdk.ab;
import com.pgl.ssdk.ac;
import com.pgl.ssdk.ad;
import com.pgl.ssdk.ae;
import com.pgl.ssdk.af;
import com.pgl.ssdk.ag;
import com.pgl.ssdk.ah;
import com.pgl.ssdk.ai;
import com.pgl.ssdk.aj;
import com.pgl.ssdk.ak;
import com.pgl.ssdk.al;
import com.pgl.ssdk.am;
import com.pgl.ssdk.an;
import com.pgl.ssdk.ao;
import com.pgl.ssdk.ar;
import com.pgl.ssdk.aw;
import com.pgl.ssdk.ax;
import com.pgl.ssdk.ay;
import com.pgl.ssdk.az;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.f;
import com.pgl.ssdk.u;
import com.pgl.ssdk.v;
import com.pgl.ssdk.w;
import com.pgl.ssdk.x;
import com.pgl.ssdk.y;
import com.pgl.ssdk.z;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f43261a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f43262b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, Object> f43263c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f43264d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static aw.a f43265e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f43267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f43268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f43269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f43270j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f43274n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43266f = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f43271k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f43272l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f43273m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f43275o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f43276p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f43277q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f43278r = true;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.c();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.pgl.ssdk.ces.b$b, reason: collision with other inner class name */
    public class RunnableC0432b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f43280a;

        public RunnableC0432b(String str) {
            this.f43280a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!TextUtils.isEmpty(this.f43280a) && this.f43280a.equals("AdShow")) {
                ab.b(b.this.f43267g);
            }
            al.a(b.this.f43267g).a();
            aa.b(b.this.f43267g);
        }
    }

    public static b a(Context context, String str, int i10, int i11, String str2) {
        if (f43261a == null) {
            synchronized (b.class) {
                if (f43261a == null) {
                    if (context == null) {
                        context = ab.a().getApplicationContext();
                    }
                    if (context == null) {
                        f43264d = 4;
                        return null;
                    }
                    a(i10);
                    aw.a aVarB = aw.b(context, "nms");
                    if (aVarB != null) {
                        f43264d = aVarB.f43258a;
                        f43265e = aVarB;
                        return null;
                    }
                    b bVar = new b(context, str);
                    f43261a = bVar;
                    bVar.f43269i = i11;
                    f43261a.f43270j = str2;
                    f43261a.b(context);
                    f43261a.e(a(context));
                    z.a(context);
                    f43264d = 0;
                }
            }
        }
        return f43261a;
    }

    public static String b() {
        if (e() != null) {
            return e().f43271k;
        }
        return null;
    }

    public static String c() {
        b bVarE = e();
        if (bVarE == null || !bVarE.f43273m || TextUtils.isEmpty(bVarE.f43272l)) {
            return null;
        }
        return bVarE.f43272l;
    }

    public static int d() {
        return f43264d;
    }

    public static b e() {
        return f43261a;
    }

    public void h() {
        this.f43275o = true;
        a5.a(this.f43267g, this.f43268h);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (az.a(ax.a(this.f43267g, "pgl_init_report", 0L), jCurrentTimeMillis)) {
            int i10 = f43261a.f43277q;
            if ((i10 > 0 && i10 < 100 && Math.random() * 100.0d < i10) || i10 == 100) {
                a("Start", (Map<String, Object>) null);
            }
        } else {
            a("Start", (Map<String, Object>) null);
            ax.b(this.f43267g, "pgl_init_report", jCurrentTimeMillis);
        }
        a("Start");
        if (this.f43278r) {
            ar.a(new a(), 20000L);
        }
    }

    private void b(Context context) {
        if (context == null || f43262b) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, "1");
            com.pgl.ssdk.ces.a.meta(102, null, this.f43268h);
            com.pgl.ssdk.ces.a.meta(114, null, Integer.valueOf(this.f43269i));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ab.h(context));
            com.pgl.ssdk.ces.a.meta(105, null, sb2.toString());
            com.pgl.ssdk.ces.a.meta(152, null, ab.i(context));
            com.pgl.ssdk.ces.a.meta(153, null, ab.d(context));
            com.pgl.ssdk.ces.a.meta(106, null, ab.f(context));
            com.pgl.ssdk.ces.a.meta(107, null, ab.e(context));
            com.pgl.ssdk.ces.a.meta(108, null, ab.c(context));
            com.pgl.ssdk.ces.a.meta(109, null, ab.d());
            com.pgl.ssdk.ces.a.meta(110, null, ab.c());
            com.pgl.ssdk.ces.a.meta(115, null, this.f43270j);
            f43262b = true;
        } catch (Throwable unused) {
        }
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f43274n = str;
        com.pgl.ssdk.ces.a.meta(104, null, str);
    }

    public static aw.a f() {
        return f43265e;
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f43272l)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.f43272l = str;
            a5.b();
        }
    }

    private b(Context context, String str) {
        this.f43267g = context;
        this.f43268h = str;
    }

    public String g() {
        return a5.a();
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f43271k)) {
            this.f43271k = str;
            com.pgl.ssdk.ces.a.meta(103, null, str);
            a5.b();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void b(String str) {
        int iIntValue;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                byte b10 = -1;
                switch (next.hashCode()) {
                    case -417749689:
                        if (next.equals("touch_trace_enabled")) {
                            b10 = 4;
                        }
                        break;
                    case -257777372:
                        if (next.equals("init_prob")) {
                            b10 = 5;
                        }
                        break;
                    case -93508180:
                        if (next.equals("autoctl_detect_enable")) {
                            b10 = 0;
                        }
                        break;
                    case 449342513:
                        if (next.equals("craw_ratio")) {
                            b10 = 3;
                        }
                        break;
                    case 944591168:
                        if (next.equals("report_ratio")) {
                            b10 = 1;
                        }
                        break;
                    case 1286849298:
                        if (next.equals("app_switch")) {
                            b10 = 2;
                        }
                        break;
                }
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 != 4) {
                                    if (b10 == 5 && (obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue()) >= 0 && iIntValue <= 100) {
                                        this.f43277q = iIntValue;
                                    }
                                } else if (obj instanceof Boolean) {
                                    y.f43338g = ((Boolean) obj).booleanValue();
                                }
                            } else if ((obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                                f.f43301b = ((Integer) obj).intValue();
                            }
                        } else if (obj instanceof Boolean) {
                            this.f43278r = ((Boolean) obj).booleanValue();
                        }
                    } else if ((obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                        this.f43276p = ((Integer) obj).intValue();
                    }
                } else if (obj instanceof Boolean) {
                    ak.f43209b = ((Boolean) obj).booleanValue();
                }
            }
        } catch (JSONException unused) {
        }
    }

    private static String a(Context context) {
        String strA = ax.a(context, com.safedk.android.analytics.brandsafety.creatives.discoveries.f.f44140e);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String string = UUID.randomUUID().toString();
        ax.b(context, com.safedk.android.analytics.brandsafety.creatives.discoveries.f.f44140e, string);
        return string;
    }

    public static void a(int i10) {
        an.a(i10);
    }

    public static String a() {
        if (e() != null) {
            return e().f43268h;
        }
        return null;
    }

    public void a(String str, String str2, String str3, String str4) {
        c(str2);
        d(str4);
        try {
            h();
        } catch (Throwable unused) {
        }
    }

    public Map<String, String> a(String str, byte[] bArr) {
        HashMap map = new HashMap();
        Object[] objArr = new Object[2];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        if (bArr == null) {
            bArr = new byte[0];
        }
        objArr[1] = bArr;
        String str2 = (String) com.pgl.ssdk.ces.a.meta(224, this.f43267g, objArr);
        if (!TextUtils.isEmpty(str2)) {
            map.put("X-Armors", str2);
        }
        return map;
    }

    public void a(String str, Map<String, Object> map) {
        try {
            ar.a(new ao(this.f43267g, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, new Object[]{str, map}), "Start".equals(str) ? 10000L : 0L);
        } catch (Throwable unused) {
        }
    }

    public Object a(int i10, Object obj) {
        Object objB;
        if (i10 == 123) {
            objB = af.a(this.f43267g);
        } else if (i10 == 121) {
            objB = ad.a();
        } else if (i10 == 122) {
            objB = ad.b();
        } else if (i10 == 126) {
            objB = ad.b(this.f43267g);
        } else if (i10 == 128) {
            objB = ad.c(this.f43267g);
        } else if (i10 == 120) {
            objB = ac.c();
        } else if (i10 == 124) {
            objB = ag.c(this.f43267g);
        } else if (i10 == 130) {
            objB = ag.a(this.f43267g);
        } else if (i10 == 145) {
            objB = ah.c(this.f43267g);
        } else if (i10 == 125) {
            objB = ag.b(this.f43267g);
        } else if (i10 == 129) {
            objB = ae.f(this.f43267g);
        } else if (i10 == 141) {
            objB = ae.e(this.f43267g);
        } else if (i10 == 134) {
            objB = ak.a(this.f43267g).b();
        } else if (i10 == 140) {
            objB = al.a(this.f43267g).e();
        } else if (i10 == 144) {
            objB = al.a(this.f43267g).d();
        } else if (i10 == 133) {
            objB = a(obj);
        } else {
            if (i10 == 135) {
                return v.e();
            }
            if (i10 == 201) {
                objB = ad.a(this.f43267g);
            } else if (i10 == 202) {
                objB = ad.c();
            } else {
                if (i10 == 236) {
                    return ay.a((String) obj);
                }
                if (i10 == 142) {
                    objB = ab.g(this.f43267g);
                } else if (i10 == 143) {
                    objB = ah.a(this.f43267g);
                } else {
                    if (i10 == 146) {
                        try {
                            return v.b();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            return null;
                        }
                    }
                    if (i10 == 147) {
                        objB = Boolean.valueOf(ab.j(this.f43267g));
                    } else if (i10 == 148) {
                        objB = u.b(this.f43267g);
                    } else if (i10 == 149) {
                        objB = w.a(this.f43267g);
                    } else if (i10 == 150) {
                        objB = Integer.valueOf(x.a());
                    } else if (i10 == 151) {
                        objB = w.c();
                    } else if (i10 == 161) {
                        objB = Boolean.valueOf(v.f());
                    } else if (i10 == 163) {
                        objB = aj.a();
                    } else if (i10 == 169) {
                        objB = Boolean.valueOf(aa.a(this.f43267g));
                    } else if (i10 == 170) {
                        objB = Integer.valueOf(y.b((String) obj));
                    } else if (i10 == 203) {
                        objB = ab.b();
                    } else if (i10 == 205) {
                        objB = Integer.valueOf(ab.k(this.f43267g));
                    } else if (i10 == 204) {
                        objB = Integer.valueOf(ae.a(this.f43267g));
                    } else {
                        if (i10 != 206) {
                            return null;
                        }
                        objB = ah.b(this.f43267g);
                    }
                }
            }
        }
        return objB;
    }

    public void a(MotionEvent motionEvent) {
        y.a(motionEvent, this.f43267g);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            if (!map.isEmpty()) {
                try {
                    for (String str : map.keySet()) {
                        Object obj = map.get(str);
                        if (obj != null) {
                            byte b10 = -1;
                            switch (str.hashCode()) {
                                case -2021683300:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST)) {
                                        b10 = 2;
                                    }
                                    break;
                                case -1195280656:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR)) {
                                        b10 = 5;
                                    }
                                    break;
                                case 156851746:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                                        b10 = 3;
                                    }
                                    break;
                                case 398905722:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ)) {
                                        b10 = 0;
                                    }
                                    break;
                                case 485444716:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC)) {
                                        b10 = 4;
                                    }
                                    break;
                                case 500804551:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_IPV6)) {
                                        b10 = 1;
                                    }
                                    break;
                            }
                            if (b10 != 0) {
                                if (b10 != 1) {
                                    if (b10 != 2) {
                                        if (b10 != 3) {
                                            if (b10 != 4) {
                                                if (b10 == 5 && (obj instanceof String)) {
                                                    b((String) obj);
                                                }
                                            } else if (obj instanceof String) {
                                                an.b((String) obj);
                                            }
                                        } else if (obj instanceof Set) {
                                            Set set = (Set) obj;
                                            com.pgl.ssdk.ces.a.meta(165, null, Boolean.valueOf(set.contains("boot")));
                                            com.pgl.ssdk.ces.a.meta(166, null, Boolean.valueOf(set.contains("mnc")));
                                            com.pgl.ssdk.ces.a.meta(167, null, Boolean.valueOf(set.contains("mcc")));
                                            com.pgl.ssdk.ces.a.meta(168, null, Boolean.valueOf(set.contains(Q6.V0)));
                                            this.f43273m = set.contains(Q6.V0);
                                        }
                                    } else if (obj instanceof String) {
                                        an.a((String) obj);
                                    }
                                } else if (obj instanceof String) {
                                    String str2 = (String) obj;
                                    if (!TextUtils.isEmpty(str2)) {
                                        am.a(str2);
                                    }
                                }
                            } else if (obj instanceof String) {
                                String strA = ai.a((String) obj);
                                if (!TextUtils.isEmpty(strA)) {
                                    com.pgl.ssdk.ces.a.meta(159, null, strA);
                                }
                            }
                        }
                    }
                    if (f43263c == null) {
                        f43263c = new HashMap();
                    }
                    f43263c.putAll(map);
                } catch (Throwable unused) {
                }
            }
        }
    }

    private String a(Object obj) {
        Map<String, Object> map;
        if (!(obj instanceof String) || !"Start".equals((String) obj) || (map = f43263c) == null || map.isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        try {
            return new JSONObject(f43263c).toString();
        } catch (Exception unused) {
            return JsonUtils.EMPTY_JSON;
        }
    }

    public void a(String str) {
        ar.b(new RunnableC0432b(str));
    }
}
