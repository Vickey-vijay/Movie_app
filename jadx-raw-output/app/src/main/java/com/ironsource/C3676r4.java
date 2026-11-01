package com.ironsource;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3676r4 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f30595k = "1.0.6";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f30596l = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B7 f30597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f30601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ContextProvider f30602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f30603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f30604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f30605i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f30606j;

    /* JADX INFO: renamed from: com.ironsource.r4$a */
    public class a implements InterfaceC3385b {
        @Override // com.ironsource.InterfaceC3385b
        public void b() {
        }

        public a() {
        }

        @Override // com.ironsource.InterfaceC3385b
        public void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb2 = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb2.append("*** Thread Name ");
                    sb2.append(thread.getName());
                    sb2.append(" Thread ID ");
                    sb2.append(thread.getId());
                    sb2.append(Z7.f27998r);
                    sb2.append("(");
                    sb2.append(thread.getState().toString());
                    sb2.append(")");
                    sb2.append(" ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb2.append(stackTraceElement.toString());
                        sb2.append(Z7.f27998r);
                        sb2.append(thread.getState().toString());
                        sb2.append("\n");
                    }
                }
            }
            C3676r4.f30596l = sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r4$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f30608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30609b;

        public b(Context context, String str) {
            this.f30608a = context;
            this.f30609b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strI = C3676r4.this.f30597a.I(this.f30608a);
                if (!TextUtils.isEmpty(strI)) {
                    C3676r4.this.f30599c = strI;
                }
                String strB = C3676r4.this.f30597a.b(this.f30608a);
                if (!TextUtils.isEmpty(strB)) {
                    C3676r4.this.f30601e = strB;
                }
                SharedPreferences.Editor editorEdit = this.f30608a.getSharedPreferences(Z7.f27987g, 0).edit();
                editorEdit.putString(Z7.f27988h, C3676r4.this.f30599c);
                editorEdit.putString(Z7.f28004x, this.f30609b);
                editorEdit.apply();
            } catch (Exception e10) {
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r4$c */
    public class c extends RunnableC3693s4 {
        public c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    private C3676r4() {
        this.f30606j = false;
        this.f30597a = Lb.U().i();
        this.f30602f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f30603g = defaultUncaughtExceptionHandler;
        this.f30605i = Z7.f27998r;
        this.f30604h = Z7.f27997q;
        Thread.setDefaultUncaughtExceptionHandler(new C3643p4(defaultUncaughtExceptionHandler));
    }

    public static List<P5> c() {
        return null;
    }

    public static C3676r4 d() {
        return d.f30612a;
    }

    public void a(HashSet<String> hashSet, String str, String str2, boolean z10, String str3, int i10, boolean z11) {
        Context applicationContext = this.f30602f.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.f30605i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f30604h = str;
            }
            this.f30600d = str3;
            if (z10) {
                new C3367a(i10).a(z11).b(true).a(new a()).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.f30606j = true;
        IronLog.INTERNAL.verbose("initialized");
    }

    public String b() {
        return f30595k;
    }

    /* JADX INFO: renamed from: com.ironsource.r4$d */
    @SuppressLint({"StaticFieldLeak"})
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static volatile C3676r4 f30612a = new C3676r4();

        private d() {
        }
    }

    public String e() {
        return this.f30605i;
    }

    public void a(Throwable th2) {
        IronLog.INTERNAL.verbose("isInitialized=" + this.f30606j);
        if (!this.f30606j || th2 == null) {
            return;
        }
        new P5(new C3660q4(th2).b(), "" + System.currentTimeMillis(), Z7.f27990j).a();
    }

    private void a(Context context, HashSet<String> hashSet) {
        String strA = a(a());
        if (strA.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(Z7.f27987g, 0);
        String string = sharedPreferences.getString(Z7.f27988h, this.f30599c);
        String string2 = sharedPreferences.getString(Z7.f28004x, this.f30600d);
        List<P5> listB = I4.b();
        IronLog.INTERNAL.verbose("reportList size " + listB.size());
        for (P5 p10 : listB) {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            String strB = p10.b();
            String strE = p10.e();
            String strD = p10.d();
            String packageName = context.getPackageName();
            JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit();
            try {
                ActivityManager.MemoryInfo memoryInfoN = this.f30597a.n(context);
                if (memoryInfoN != null) {
                    jSONObjectJsonObjectInit2.put(Z7.O, this.f30597a.c(memoryInfoN));
                    jSONObjectJsonObjectInit2.put("lowM", this.f30597a.b(memoryInfoN));
                    jSONObjectJsonObjectInit2.put("mThreshold", this.f30597a.a(memoryInfoN));
                }
                String strT = this.f30597a.t();
                if (strT != null) {
                    jSONObjectJsonObjectInit2.put("osArch", strT);
                }
                jSONObjectJsonObjectInit2.put(Z7.f27992l, strB);
                jSONObjectJsonObjectInit2.put(Z7.f27993m, strE);
                jSONObjectJsonObjectInit2.put(Z7.f27994n, strD);
                jSONObjectJsonObjectInit2.put(Z7.f28006z, f30595k);
                jSONObjectJsonObjectInit2.put("SDKVersion", "9.2.0");
                jSONObjectJsonObjectInit2.put("deviceLanguage", this.f30597a.c(context));
                jSONObjectJsonObjectInit2.put("appVersion", C1.b(context, packageName));
                jSONObjectJsonObjectInit2.put("deviceOSVersion", this.f30597a.i());
                jSONObjectJsonObjectInit2.put("network", strA);
                jSONObjectJsonObjectInit2.put("deviceApiLevel", this.f30597a.e());
                jSONObjectJsonObjectInit2.put("deviceModel", this.f30597a.l());
                jSONObjectJsonObjectInit2.put(Z7.N, this.f30597a.q(context));
                jSONObjectJsonObjectInit2.put("deviceOS", this.f30597a.f());
                jSONObjectJsonObjectInit2.put(Z7.L, string);
                jSONObjectJsonObjectInit2.put("deviceOEM", this.f30597a.q());
                jSONObjectJsonObjectInit2.put(Z7.f27996p, System.getProperties());
                jSONObjectJsonObjectInit2.put("bundleId", packageName);
                jSONObjectJsonObjectInit2.put(Z7.f28004x, string2);
                if (!TextUtils.isEmpty(this.f30601e)) {
                    jSONObjectJsonObjectInit2.put("isLimitAdTrackingEnabled", Boolean.parseBoolean(this.f30601e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObjectJsonObjectInit = jSONObjectJsonObjectInit2;
                } else {
                    for (String str : hashSet) {
                        try {
                            if (jSONObjectJsonObjectInit2.has(str)) {
                                jSONObjectJsonObjectInit.put(str, jSONObjectJsonObjectInit2.opt(str));
                            }
                        } catch (Exception e10) {
                            IronLog.INTERNAL.error(e10.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObjectJsonObjectInit.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new c(jSONObjectJsonObjectInit)).start();
            }
        }
        I4.a();
    }

    public Context a() {
        return this.f30602f.getApplicationContext();
    }

    private String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return "wifi";
            }
            return networkCapabilities.hasTransport(0) ? "cellular" : "none";
        } catch (Exception e10) {
            IronLog.INTERNAL.error(e10.toString());
            return "none";
        }
    }
}
