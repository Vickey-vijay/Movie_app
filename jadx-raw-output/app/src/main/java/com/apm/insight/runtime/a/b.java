package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ActivityDataManager.java */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f6652a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f6653b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f6654c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6655d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f6656e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f6657f = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile b f6658z;
    private int B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Application f6659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f6660h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f6666n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f6667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f6668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f6669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f6670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f6671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f6672t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f6673u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f6674v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f6675w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f6661i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Long> f6662j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<String> f6663k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Long> f6664l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private LinkedList<a> f6665m = new LinkedList<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f6676x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f6677y = -1;
    private int A = 50;

    /* JADX INFO: compiled from: ActivityDataManager.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f6679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f6680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f6681c;

        public final String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f6681c)) + " : " + this.f6679a + ' ' + this.f6680b;
        }

        public a(String str, String str2, long j10) {
            this.f6680b = str2;
            this.f6681c = j10;
            this.f6679a = str;
        }
    }

    public static /* synthetic */ int g(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int l(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int n(b bVar) {
        bVar.B = 0;
        return 0;
    }

    public static /* synthetic */ boolean k() {
        f6652a = false;
        return false;
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f6661i;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f6661i.size(); i10++) {
                try {
                    jSONArray.put(a(this.f6661i.get(i10), this.f6662j.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f6663k;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f6663k.size(); i10++) {
                try {
                    jSONArray.put(a(this.f6663k.get(i10), this.f6664l.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        if (com.apm.insight.e.w()) {
            try {
                jSONObject.put("last_create_activity", a(this.f6666n, this.f6667o));
                jSONObject.put("last_start_activity", a(this.f6668p, this.f6669q));
                jSONObject.put("last_resume_activity", a(this.f6670r, this.f6671s));
                jSONObject.put("last_pause_activity", a(this.f6672t, this.f6673u));
                jSONObject.put("last_stop_activity", a(this.f6674v, this.f6675w));
                jSONObject.put("alive_activities", n());
                jSONObject.put("finish_activities", o());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    @NonNull
    public final String h() {
        return String.valueOf(this.f6670r);
    }

    public final JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f6665m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((a) it.next()).toString());
        }
        return jSONArray;
    }

    private b(@NonNull Application application) {
        this.f6660h = application;
        this.f6659g = application;
        if (application != null) {
            try {
                this.f6659g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        b.this.f6666n = activity.getClass().getName();
                        b.this.f6667o = System.currentTimeMillis();
                        boolean unused = b.f6653b = bundle != null;
                        boolean unused2 = b.f6654c = true;
                        b.this.f6661i.add(b.this.f6666n);
                        b.this.f6662j.add(Long.valueOf(b.this.f6667o));
                        b bVar = b.this;
                        b.a(bVar, bVar.f6666n, b.this.f6667o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        b.this.f6672t = activity.getClass().getName();
                        b.this.f6673u = System.currentTimeMillis();
                        b.l(b.this);
                        if (b.this.B == 0) {
                            b.this.f6676x = false;
                            boolean unused = b.f6654c = false;
                            b.this.f6677y = SystemClock.uptimeMillis();
                        } else if (b.this.B < 0) {
                            b.n(b.this);
                            b.this.f6676x = false;
                            boolean unused2 = b.f6654c = false;
                            b.this.f6677y = SystemClock.uptimeMillis();
                        }
                        b bVar = b.this;
                        b.a(bVar, bVar.f6672t, b.this.f6673u, C3426d4.i.f28567t0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        b.this.f6670r = activity.getClass().getName();
                        b.this.f6671s = System.currentTimeMillis();
                        b.g(b.this);
                        if (!b.this.f6676x) {
                            if (b.f6652a) {
                                b.k();
                                int unused = b.f6655d = 1;
                                long unused2 = b.f6657f = b.this.f6671s;
                            }
                            if (!b.this.f6670r.equals(b.this.f6672t)) {
                                return;
                            }
                            if (b.f6654c && !b.f6653b) {
                                int unused3 = b.f6655d = 4;
                                long unused4 = b.f6657f = b.this.f6671s;
                                return;
                            } else if (!b.f6654c) {
                                int unused5 = b.f6655d = 3;
                                long unused6 = b.f6657f = b.this.f6671s;
                                return;
                            }
                        }
                        b.this.f6676x = true;
                        b bVar = b.this;
                        b.a(bVar, bVar.f6670r, b.this.f6671s, C3426d4.i.f28569u0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        b.this.f6668p = activity.getClass().getName();
                        b.this.f6669q = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f6668p, b.this.f6669q, "onStart");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        b.this.f6674v = activity.getClass().getName();
                        b.this.f6675w = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f6674v, b.this.f6675w, "onStop");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int iIndexOf = b.this.f6661i.indexOf(name);
                        if (iIndexOf >= 0 && iIndexOf < b.this.f6661i.size()) {
                            b.this.f6661i.remove(iIndexOf);
                            b.this.f6662j.remove(iIndexOf);
                        }
                        b.this.f6663k.add(name);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        b.this.f6664l.add(Long.valueOf(jCurrentTimeMillis));
                        b.a(b.this, name, jCurrentTimeMillis, "onDestroy");
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean f() {
        return this.f6676x;
    }

    public static long c() {
        return f6657f;
    }

    public static b d() {
        if (f6658z == null) {
            synchronized (b.class) {
                if (f6658z == null) {
                    f6658z = new b(com.apm.insight.e.h());
                }
            }
        }
        return f6658z;
    }

    public final long e() {
        return SystemClock.uptimeMillis() - this.f6677y;
    }

    public static int b() {
        int i10 = f6655d;
        if (i10 == 1) {
            return f6656e ? 2 : 1;
        }
        return i10;
    }

    public static void a() {
        f6656e = true;
    }

    private static JSONObject a(String str, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static /* synthetic */ void a(b bVar, String str, long j10, String str2) {
        if (com.apm.insight.e.w()) {
            a aVar = null;
            try {
                if (bVar.f6665m.size() >= bVar.A && (aVar = bVar.f6665m.poll()) != null) {
                    bVar.f6665m.add(aVar);
                }
                if (aVar == null) {
                    aVar = new a(str, str2, j10);
                    bVar.f6665m.add(aVar);
                }
                aVar.f6680b = str2;
                aVar.f6679a = str;
                aVar.f6681c = j10;
            } catch (Throwable unused) {
            }
        }
    }
}
