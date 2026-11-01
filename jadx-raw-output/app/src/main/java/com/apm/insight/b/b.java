package com.apm.insight.b;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.l;
import com.apm.insight.runtime.n;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ANRManager.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile boolean f6240z = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f6241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f6242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f6243c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f6247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f6248h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private JSONArray f6253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private JSONObject f6254n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JSONArray f6257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private JSONArray f6258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private JSONObject f6259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f6260t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile boolean f6262v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f6244d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f6245e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6246f = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f6249i = "unknown";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f6250j = "unknown";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f6251k = "unknown";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f6252l = "npth_inner_default";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f6255o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f6256p = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f6261u = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f6263w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f6264x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Runnable f6265y = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            try {
                b.this.g();
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
        }
    };
    private int A = 0;
    private List<Pattern> B = null;
    private Pattern C = null;
    private File D = null;

    private static String a(float f10) {
        if (f10 <= 0.0f) {
            return "0%";
        }
        if (f10 <= 0.1f) {
            return "0% - 10%";
        }
        if (f10 <= 0.3f) {
            return "10% - 30%";
        }
        if (f10 <= 0.6f) {
            return "30% - 60%";
        }
        return f10 <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    public final void b() {
        if (this.f6243c) {
            this.f6243c = false;
            c cVar = this.f6241a;
            if (cVar != null) {
                cVar.b();
            }
            this.f6241a = null;
        }
    }

    public final void c() {
        c cVar = this.f6241a;
        if (cVar != null) {
            cVar.a();
        }
    }

    private File i() {
        if (this.D == null) {
            this.D = new File(this.f6242b.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.b().replaceAll(StringUtils.PROCESS_POSTFIX_DELIMITER, "_"));
        }
        return this.D;
    }

    public final void a() {
        if (this.f6243c) {
            return;
        }
        this.f6241a = new c(this);
        this.f6244d = com.apm.insight.e.j();
        this.f6243c = true;
    }

    public final void d() {
        synchronized (this.f6261u) {
        }
        this.f6265y.run();
    }

    public final boolean g() {
        String str;
        String str2;
        JSONArray jSONArrayB;
        JSONArray jSONArrayA;
        JSONObject jSONObject;
        boolean z10;
        JSONObject jSONObjectA;
        boolean z11;
        String str3;
        String str4;
        JSONArray jSONArray;
        final long j10;
        JSONObject jSONObjectA2;
        JSONObject jSONObject2;
        String str5;
        JSONObject jSONObject3;
        boolean zB = com.apm.insight.runtime.i.a().b();
        long jUptimeMillis = SystemClock.uptimeMillis();
        a(jUptimeMillis);
        String strA = d.a(this.f6242b);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str6 = "normal";
        TextUtils.isEmpty(strA);
        if (TextUtils.isEmpty(strA)) {
            str = "unknown";
            str2 = "unknown";
            jSONArrayB = null;
            jSONArrayA = null;
            jSONObject = null;
            z10 = false;
            jSONObjectA = null;
            z11 = false;
            str3 = "normal";
            str4 = "unknown";
            jSONArray = null;
            j10 = jCurrentTimeMillis;
            jSONObjectA2 = null;
        } else {
            synchronized (this.f6261u) {
            }
            if (this.f6247g == null || System.currentTimeMillis() - this.f6244d > 20000) {
                if (this.f6262v) {
                    this.f6262v = false;
                    str6 = "trace_after";
                }
                b(jUptimeMillis);
            } else {
                str6 = "trace_last";
            }
            JSONObject jSONObject4 = this.f6247g;
            String str7 = this.f6249i;
            String str8 = this.f6250j;
            String str9 = this.f6251k;
            JSONArray jSONArray2 = this.f6253m;
            JSONArray jSONArray3 = this.f6258r;
            JSONArray jSONArray4 = this.f6257q;
            JSONObject jSONObject5 = this.f6259s;
            JSONObject jSONObject6 = this.f6248h;
            z11 = this.f6260t;
            long j11 = this.f6256p;
            this.f6247g = null;
            this.f6253m = null;
            this.f6257q = null;
            this.f6248h = null;
            this.f6258r = null;
            this.f6249i = "unknown";
            this.f6250j = "unknown";
            this.f6251k = "unknown";
            this.f6255o = 0;
            jSONArrayA = jSONArray4;
            str2 = str9;
            str4 = str7;
            jSONArray = jSONArray2;
            jSONObjectA = jSONObject6;
            jSONObject = jSONObject5;
            jSONArrayB = jSONArray3;
            str = str8;
            str3 = str6;
            j10 = j11;
            jSONObjectA2 = jSONObject4;
            z10 = true;
        }
        if (TextUtils.isEmpty(strA)) {
            if (this.f6247g == null || System.currentTimeMillis() - this.f6244d <= 20000) {
                if (this.f6247g == null || System.currentTimeMillis() - this.f6244d <= 2000 || !NativeImpl.h()) {
                    return false;
                }
                com.apm.insight.l.f.a(i());
                return false;
            }
            this.f6247g = null;
            this.f6253m = null;
            this.f6257q = null;
            this.f6248h = null;
            this.f6258r = null;
            this.f6249i = "unknown";
            this.f6250j = "unknown";
            this.f6251k = "unknown";
            this.f6255o = 0;
            this.f6245e = null;
            return false;
        }
        if (jSONObjectA2 == null) {
            if (jSONArrayA == null) {
                try {
                    jSONArrayB = f.b().b();
                    jSONArrayA = j.a(jUptimeMillis);
                    jSONObject3 = jSONObjectA2;
                    try {
                        jSONObjectA = f.b().a(jUptimeMillis).a();
                        JSONObject jSONObject7 = new JSONObject();
                        try {
                            com.apm.insight.l.a.a(this.f6242b, jSONObject7);
                            jSONObject = jSONObject7;
                        } catch (Throwable unused) {
                            jSONObject = jSONObject7;
                            jSONObjectA2 = jSONObject3;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    jSONObject3 = jSONObjectA2;
                }
            } else {
                jSONObject3 = jSONObjectA2;
            }
            jSONObjectA2 = d.a();
        }
        JSONObject jSONObject8 = jSONObjectA;
        if (jSONObjectA2 != null && jSONObjectA2.length() > 0) {
            try {
                jSONObjectA2.put("pid", Process.myPid());
                jSONObjectA2.put("package", this.f6242b.getPackageName());
                jSONObjectA2.put("is_remote_process", 0);
                jSONObjectA2.put("is_new_stack", 10);
                com.apm.insight.entity.a aVar = new com.apm.insight.entity.a(new JSONObject());
                String str10 = str2;
                aVar.a("data", (Object) jSONObjectA2.toString());
                JSONObject jSONObject9 = jSONObjectA2;
                aVar.a("is_anr", (Object) 1);
                aVar.a("anrType", (Object) str3);
                if (com.apm.insight.e.x()) {
                    aVar.a("history_message", (Object) jSONArrayB);
                    aVar.a("current_message", jSONObject8);
                    aVar.a("pending_messages", (Object) jSONArrayA);
                }
                aVar.a("anr_time", Long.valueOf(System.currentTimeMillis()));
                aVar.a("crash_time", Long.valueOf(j10));
                com.apm.insight.c.a.b();
                aVar.c(jSONObject);
                aVar.a("anr_info", (Object) strA);
                if (jSONArray != null) {
                    aVar.a("dump_trace", (Object) jSONArray);
                }
                JSONObject jSONObject10 = this.f6254n;
                aVar.a("all_thread_stacks", (jSONObject10 == null || jSONObject10.length() == 0) ? m.b((String) null) : this.f6254n);
                com.apm.insight.runtime.a.f fVarA = com.apm.insight.runtime.a.f.a();
                CrashType crashType = CrashType.ANR;
                com.apm.insight.entity.a aVarA = fVarA.a(crashType, aVar);
                aVarA.a("is_background", Boolean.valueOf(z11));
                aVarA.a("logcat", (Object) com.apm.insight.runtime.h.a(com.apm.insight.e.f()));
                aVarA.a("has_dump", (Object) "true");
                aVarA.a("crash_uuid", (Object) com.apm.insight.e.a(j10, crashType, false, false));
                JSONObject jSONObjectOptJSONObject = aVarA.c().optJSONObject("filters");
                com.apm.insight.entity.d.b(aVarA.c());
                if (jSONObjectOptJSONObject == null) {
                    try {
                        jSONObject2 = new JSONObject();
                        try {
                            aVarA.a("filters", jSONObject2);
                        } catch (Throwable unused4) {
                            jSONObjectOptJSONObject = jSONObject2;
                            jSONObject2 = jSONObjectOptJSONObject;
                        }
                    } catch (Throwable unused5) {
                        jSONObject2 = jSONObjectOptJSONObject;
                    }
                } else {
                    jSONObject2 = jSONObjectOptJSONObject;
                }
                jSONObject2.put("anrType", str3);
                jSONObject2.put("max_utm_thread", str4);
                jSONObject2.put("max_stm_thread", str);
                jSONObject2.put("max_utm_stm_thread", str10);
                jSONObject2.put("max_utm_thread_version", this.f6252l);
                long j12 = j10 - com.apm.insight.e.j();
                if (j12 < 30000) {
                    str5 = "0 - 30s";
                } else if (j12 < 60000) {
                    str5 = "30s - 1min";
                } else if (j12 < UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
                    str5 = "1min - 2min";
                } else if (j12 < 300000) {
                    str5 = "2min - 5min";
                } else if (j12 < 600000) {
                    str5 = "5min - 10min";
                } else if (j12 < 1800000) {
                    str5 = "10min - 30min";
                } else {
                    str5 = j12 < 3600000 ? "30min - 1h" : "1h - ";
                }
                jSONObject2.put("crash_length", str5);
                jSONObject2.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
                jSONObject2.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.b()));
                jSONObject2.put("sdk_version", "2008-20250701130429");
                jSONObject2.put("has_logcat", String.valueOf(aVarA.a()));
                jSONObject2.put("memory_leak", String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
                jSONObject2.put("fd_leak", String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
                jSONObject2.put("threads_leak", String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
                jSONObject2.put("is_64_devices", String.valueOf(Header.a()));
                jSONObject2.put("is_64_runtime", String.valueOf(NativeImpl.f()));
                jSONObject2.put("is_x86_devices", String.valueOf(Header.b()));
                jSONObject2.put("has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
                jSONObject2.put("is_root", com.apm.insight.nativecrash.a.k() ? "true" : com.ironsource.mediationsdk.metadata.a.f29886h);
                jSONObject2.put("anr_normal_trace", String.valueOf(!this.f6262v));
                jSONObject2.put("anr_no_run", String.valueOf(zB));
                jSONObject2.put("crash_after_crash", Npth.hasCrash() ? "true" : com.ironsource.mediationsdk.metadata.a.f29886h);
                jSONObject2.put("from_file", String.valueOf(d.b()));
                jSONObject2.put("has_dump", "true");
                jSONObject2.put("from_kill", com.ironsource.mediationsdk.metadata.a.f29886h);
                jSONObject2.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
                int i10 = this.f6255o;
                if (i10 > 0) {
                    jSONObject2.put("may_have_stack_overflow", String.valueOf(i10));
                }
                try {
                    a(strA, jSONObject2);
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                }
                com.apm.insight.a.a.a();
                CrashType crashType2 = CrashType.LAUNCH;
                com.apm.insight.e.e();
                try {
                    if (com.apm.insight.a.e().length() > 1024) {
                        aVarA.a("has_system_traces", "true");
                    }
                } catch (Throwable unused6) {
                }
                try {
                    JSONArray jSONArrayA2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                    jSONObject2.put("leak_threads_count", String.valueOf(jSONArrayA2.length()));
                    if (jSONArrayA2.length() > 0) {
                        com.apm.insight.l.f.a(com.apm.insight.l.j.g(com.apm.insight.e.f()), jSONArrayA2);
                    }
                } catch (Throwable unused7) {
                }
                String strOptString = jSONObject9.optString("mainStackFromTrace");
                JSONArray jSONArrayA3 = com.apm.insight.entity.b.a(strOptString);
                com.apm.insight.entity.b.a(aVarA.c(), jSONArrayA3, new com.apm.insight.entity.b.a() { // from class: com.apm.insight.b.b.2
                    @Override // com.apm.insight.entity.b.a
                    public final void a(JSONObject jSONObject11) {
                        com.apm.insight.k.d.a().a(jSONObject11, j10, b.this.f6246f);
                    }
                });
                b(strOptString, jSONArrayA3);
            } catch (Throwable th3) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th3, "NPTH_CATCH");
            }
        }
        return z10;
    }

    public b(Context context) {
        this.f6242b = context;
    }

    private JSONObject c(@NonNull JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.f6255o++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
                sb2.append(jSONArrayB.getString(i10));
                sb2.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb2.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private static boolean h() {
        boolean z10 = !com.apm.insight.l.a.a();
        if (z10 && com.apm.insight.runtime.a.b.d().e() <= 2000) {
            return false;
        }
        return z10;
    }

    public final void e() {
        if (NativeImpl.h()) {
            try {
                com.apm.insight.l.f.a(i(), String.valueOf(this.A + 1), false);
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
        }
        this.f6263w = SystemClock.uptimeMillis();
        this.f6262v = true;
    }

    public final void f() {
        File fileI = i();
        try {
            int iIntValue = Integer.decode(com.apm.insight.l.f.a(fileI.getAbsolutePath(), "\n")).intValue();
            this.A = iIntValue;
            if (iIntValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.f.a(fileI);
        }
    }

    private boolean a(long j10) {
        if (this.f6262v) {
            this.f6262v = false;
            b(j10);
        }
        return false;
    }

    private void b(long j10) {
        if (this.f6264x != this.f6263w) {
            try {
                this.f6256p = System.currentTimeMillis();
                if (com.apm.insight.e.x()) {
                    this.f6258r = f.b().b();
                    this.f6257q = j.a(j10);
                    this.f6248h = f.b().a(j10).a();
                }
                JSONObject jSONObject = new JSONObject();
                this.f6259s = jSONObject;
                com.apm.insight.l.a.a(this.f6242b, jSONObject);
                this.f6260t = h();
                this.f6246f = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.f6244d = this.f6256p;
                String strB = com.apm.insight.l.j.b();
                File file = new File(new File(com.apm.insight.l.j.f(this.f6242b), strB), "trace_" + com.apm.insight.l.a.b().replace(':', '_') + ".txt");
                file.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                n.a("anr_trace", strB);
                NativeImpl.i(file.getAbsolutePath());
                try {
                    JSONArray jSONArrayA = com.apm.insight.l.f.a(file.getAbsolutePath());
                    this.f6253m = jSONArrayA;
                    a(jSONArrayA);
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                }
                if (this.f6247g == null) {
                    this.f6247g = d.a();
                }
            } catch (Throwable th3) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th3, "NPTH_CATCH");
            }
            com.apm.insight.a.d();
        } else {
            try {
                this.f6244d = this.f6256p;
                String strB2 = com.apm.insight.l.j.b();
                File file2 = new File(new File(com.apm.insight.l.j.f(this.f6242b), strB2), "trace" + com.apm.insight.l.a.b().replace(':', '_') + ".txt");
                file2.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                n.a("anr_trace", strB2);
                NativeImpl.i(file2.getAbsolutePath());
                try {
                    JSONArray jSONArrayA2 = com.apm.insight.l.f.a(file2.getAbsolutePath());
                    this.f6253m = jSONArrayA2;
                    a(jSONArrayA2);
                } catch (IOException unused3) {
                } catch (Throwable th4) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th4, "NPTH_CATCH");
                }
                if (this.f6247g == null) {
                    this.f6247g = d.a();
                }
            } catch (Throwable th5) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th5, "NPTH_CATCH");
            }
        }
        long j11 = this.f6263w;
        this.f6264x = j11;
        this.f6263w = -1L;
        if (j11 == -1) {
            this.f6264x = (-1) - 1;
        }
    }

    private void a(JSONArray jSONArray) {
        int[] iArrB;
        int[] iArrB2;
        if (jSONArray == null) {
            return;
        }
        this.f6247g = null;
        this.f6254n = null;
        this.f6255o = 0;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        this.f6249i = "unknown";
        this.f6250j = "unknown";
        this.f6251k = "unknown";
        int[] iArr = {0, 0, 0};
        JSONArray jSONArray5 = jSONArray4;
        String strTrim = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            if (TextUtils.isEmpty(strOptString)) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(strTrim)) {
                    if (this.f6247g == null && C3426d4.i.Z.equals(strTrim)) {
                        this.f6247g = c(jSONArray5);
                    } else {
                        jSONArray2.put(a(strTrim, jSONArray5));
                    }
                    try {
                        if (!C3426d4.i.Z.equals(strTrim)) {
                            strTrim = strTrim.substring(0, strTrim.indexOf(40)).trim();
                        }
                    } catch (Throwable unused) {
                    }
                    String str = strTrim;
                    if (!a(str)) {
                        try {
                            iArrB2 = b(jSONArray5);
                        } catch (IllegalArgumentException e10) {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(e10, "NPTH_CATCH");
                            iArrB2 = null;
                        } catch (Throwable unused2) {
                            iArrB2 = null;
                        }
                        if (iArrB2 != null) {
                            int i11 = iArrB2[0];
                            if (i11 > iArr[0]) {
                                iArr[0] = i11;
                                this.f6249i = str;
                            }
                            int i12 = iArrB2[1];
                            if (i12 > iArr[1]) {
                                iArr[1] = i12;
                                this.f6250j = str;
                            }
                            int i13 = iArrB2[2];
                            if (i13 > iArr[2]) {
                                iArr[2] = i13;
                                this.f6251k = str;
                            }
                        }
                    }
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                strTrim = null;
            } else if (!z10) {
                if (strOptString.startsWith("DALVIK THREADS") || strOptString.startsWith("suspend") || strOptString.startsWith("\"")) {
                    z10 = true;
                }
                jSONArray3.put(strOptString);
            } else if (z10) {
                if (strOptString.contains(" prio=")) {
                    if (jSONArray5.length() > 0 && !TextUtils.isEmpty(strTrim)) {
                        if (this.f6247g == null && C3426d4.i.Z.equals(strTrim)) {
                            this.f6247g = c(jSONArray5);
                        } else {
                            jSONArray2.put(a(strTrim, jSONArray5));
                        }
                        try {
                            if (!C3426d4.i.Z.equals(strTrim)) {
                                strTrim = strTrim.substring(0, strTrim.indexOf(40)).trim();
                            }
                        } catch (Throwable unused3) {
                        }
                        String str2 = strTrim;
                        if (!a(str2)) {
                            try {
                                iArrB = b(jSONArray5);
                            } catch (IllegalArgumentException e11) {
                                com.apm.insight.c.a();
                                com.apm.insight.runtime.j.a(e11, "NPTH_CATCH");
                                iArrB = null;
                            } catch (Throwable unused4) {
                                iArrB = null;
                            }
                            if (iArrB != null) {
                                int i14 = iArrB[0];
                                if (i14 > iArr[0]) {
                                    iArr[0] = i14;
                                    this.f6249i = str2;
                                }
                                int i15 = iArrB[1];
                                if (i15 > iArr[1]) {
                                    iArr[1] = i15;
                                    this.f6250j = str2;
                                }
                                int i16 = iArrB[2];
                                if (i16 > iArr[2]) {
                                    iArr[2] = i16;
                                    this.f6251k = str2;
                                }
                            }
                        }
                    }
                    String strSubstring = strOptString.substring(1, strOptString.indexOf(34, 1));
                    strTrim = C3426d4.i.Z.equals(strSubstring) ? strSubstring : strSubstring + "  (" + strOptString.substring(strOptString.indexOf(34, 2) + 1) + " )";
                    if (jSONArray5.length() > 0) {
                        jSONArray5 = new JSONArray();
                    }
                    jSONArray5.put(strOptString);
                } else if (TextUtils.isEmpty(strTrim)) {
                    jSONArray3.put(strOptString);
                } else {
                    jSONArray5.put(strOptString);
                }
            }
        }
        if (jSONArray2.length() > 0) {
            this.f6253m = jSONArray3;
            try {
                JSONObject jSONObject = new JSONObject();
                this.f6254n = jSONObject;
                jSONObject.put("thread_all_count", jSONArray2.length());
                this.f6254n.put("thread_stacks", jSONArray2);
            } catch (JSONException e12) {
                e12.printStackTrace();
            }
        }
    }

    @Nullable
    private int[] b(@NonNull JSONArray jSONArray) throws IllegalArgumentException {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            int iIndexOf = (strOptString == null || strOptString.isEmpty()) ? -1 : strOptString.indexOf("utm=");
            if (iIndexOf > 0) {
                if (this.C == null) {
                    this.C = Pattern.compile("[^0-9]+");
                }
                String[] strArrSplit = this.C.split(strOptString.substring(iIndexOf));
                if (strArrSplit == null || strArrSplit.length < 2) {
                    return null;
                }
                try {
                    int iIntValue = Integer.decode(strArrSplit[1]).intValue();
                    int iIntValue2 = Integer.decode(strArrSplit[2]).intValue();
                    return new int[]{iIntValue, iIntValue2, iIntValue + iIntValue2};
                } catch (Throwable unused) {
                    throw new IllegalArgumentException("Err stack line: ".concat(strOptString));
                }
            }
        }
        return null;
    }

    private static String b(float f10) {
        return a(f10 / 100.0f);
    }

    private static void b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : l.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
        }
    }

    private boolean a(String str) {
        if (this.B == null) {
            JSONArray jSONArrayB = com.apm.insight.runtime.a.b();
            if (jSONArrayB != null) {
                this.B = new LinkedList();
                this.f6252l = jSONArrayB.optString(0);
                for (int i10 = 1; i10 < jSONArrayB.length(); i10++) {
                    try {
                        this.B.add(Pattern.compile(jSONArrayB.optString(i10)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.B == null) {
                LinkedList linkedList = new LinkedList();
                this.B = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.B.add(Pattern.compile("^default_npth_thread$"));
                this.B.add(Pattern.compile("^RenderThread$"));
                this.B.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.B.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.f6255o++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", jSONArrayB);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0204  */
    /* JADX WARN: Code duplicated, block: B:103:0x020b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0210  */
    /* JADX WARN: Code duplicated, block: B:107:0x0213  */
    /* JADX WARN: Code duplicated, block: B:109:0x0216  */
    /* JADX WARN: Code duplicated, block: B:111:0x0219  */
    /* JADX WARN: Code duplicated, block: B:114:0x0220  */
    /* JADX WARN: Code duplicated, block: B:115:0x0225  */
    /* JADX WARN: Code duplicated, block: B:116:0x022a  */
    /* JADX WARN: Code duplicated, block: B:117:0x022f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0235  */
    /* JADX WARN: Code duplicated, block: B:120:0x0246  */
    /* JADX WARN: Code duplicated, block: B:123:0x0253  */
    /* JADX WARN: Code duplicated, block: B:124:0x0255 A[PHI: r20 r28 r29
  0x0255: PHI (r20v2 char) = (r20v1 char), (r20v14 char) binds: [B:122:0x0251, B:116:0x022a] A[DONT_GENERATE, DONT_INLINE]
  0x0255: PHI (r28v18 java.util.HashMap) = (r28v17 java.util.HashMap), (r28v24 java.util.HashMap) binds: [B:122:0x0251, B:116:0x022a] A[DONT_GENERATE, DONT_INLINE]
  0x0255: PHI (r29v2 char) = (r7v14 char), (r29v8 char) binds: [B:122:0x0251, B:116:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x025f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0263 A[PHI: r20 r28 r29
  0x0263: PHI (r20v3 char) = (r20v2 char), (r20v15 char) binds: [B:125:0x025d, B:115:0x0225] A[DONT_GENERATE, DONT_INLINE]
  0x0263: PHI (r28v19 java.util.HashMap) = (r28v18 java.util.HashMap), (r28v24 java.util.HashMap) binds: [B:125:0x025d, B:115:0x0225] A[DONT_GENERATE, DONT_INLINE]
  0x0263: PHI (r29v3 char) = (r29v2 char), (r29v9 char) binds: [B:125:0x025d, B:115:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x026d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0271 A[PHI: r20 r28 r29
  0x0271: PHI (r20v4 char) = (r20v3 char), (r20v16 char) binds: [B:128:0x026b, B:114:0x0220] A[DONT_GENERATE, DONT_INLINE]
  0x0271: PHI (r28v20 java.util.HashMap) = (r28v19 java.util.HashMap), (r28v24 java.util.HashMap) binds: [B:128:0x026b, B:114:0x0220] A[DONT_GENERATE, DONT_INLINE]
  0x0271: PHI (r29v4 char) = (r29v3 char), (r29v10 char) binds: [B:128:0x026b, B:114:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x0279  */
    /* JADX WARN: Code duplicated, block: B:133:0x027d A[PHI: r28 r29
  0x027d: PHI (r28v23 java.util.HashMap) = (r28v20 java.util.HashMap), (r28v24 java.util.HashMap) binds: [B:131:0x0277, B:112:0x021c] A[DONT_GENERATE, DONT_INLINE]
  0x027d: PHI (r29v6 char) = (r29v4 char), (r29v11 char) binds: [B:131:0x0277, B:112:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:135:0x0285  */
    /* JADX WARN: Code duplicated, block: B:136:0x0289 A[PHI: r28 r29
  0x0289: PHI (r28v21 java.util.HashMap) = (r28v23 java.util.HashMap), (r28v24 java.util.HashMap) binds: [B:134:0x0283, B:112:0x021c] A[DONT_GENERATE, DONT_INLINE]
  0x0289: PHI (r29v5 char) = (r29v6 char), (r29v11 char) binds: [B:134:0x0283, B:112:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x028e  */
    /* JADX WARN: Code duplicated, block: B:141:0x02af  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:148:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:152:0x02e4 A[LOOP:2: B:99:0x0201->B:152:0x02e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:182:0x038d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0392 A[PHI: r3 r15 r16 r22 r23 r25 r26 r27 r28
  0x0392: PHI (r3v8 java.lang.String) = (r3v7 java.lang.String), (r3v4 java.lang.String) binds: [B:181:0x038b, B:157:0x02fd] A[DONT_GENERATE, DONT_INLINE]
  0x0392: PHI (r15v11 java.lang.String) = (r15v10 java.lang.String), (r15v1 java.lang.String) binds: [B:181:0x038b, B:157:0x02fd] A[DONT_GENERATE, DONT_INLINE]
  0x0392: PHI (r16v12 java.lang.String) = (r16v10 java.lang.String), (r16v1 java.lang.String) binds: [B:181:0x038b, B:157:0x02fd] A[DONT_GENERATE, DONT_INLINE]
  0x0392: PHI (r22v7 java.lang.String) = (r22v6 java.lang.String), (r22v9 java.lang.String) binds: [B:181:0x038b, B:157:0x02fd] A[DONT_GENERATE, DONT_INLINE]
  0x0392: PHI (r23v4 char) = (r23v3 char), (r23v6 char) binds: [B:181:0x038b, B:157:0x02fd] A[DONT_GENERATE, DONT_INLINE]
  0x0392: PHI (r25v9 java.util.HashMap) = (r25v8 java.util.HashMap), (r25v11 java.util.HashMap) binds: [B:181:0x038b, B:157:0x02fd] A[DONT_GENERATE, DONT_INLINE]
  0x0392: PHI (r26v9 java.util.HashMap) = (r26v8 java.util.HashMap), (r26v11 java.util.HashMap) binds: [B:181:0x038b, B:157:0x02fd] A[DONT_GENERATE, DONT_INLINE]
  0x0392: PHI (r27v9 java.util.HashMap) = (r27v8 java.util.HashMap), (r27v11 java.util.HashMap) binds: [B:181:0x038b, B:157:0x02fd] A[DONT_GENERATE, DONT_INLINE]
  0x0392: PHI (r28v9 java.util.HashMap) = (r28v8 java.util.HashMap), (r28v11 java.util.HashMap) binds: [B:181:0x038b, B:157:0x02fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x039e  */
    /* JADX WARN: Code duplicated, block: B:187:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b4 A[LOOP:4: B:188:0x03b1->B:190:0x03b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x03c5 A[EDGE_INSN: B:153:0x02ec->B:192:0x03c5 BREAK  A[LOOP:2: B:99:0x0201->B:152:0x02e4], EDGE_INSN: B:238:0x03c5->B:192:0x03c5 BREAK  A[LOOP:2: B:99:0x0201->B:152:0x02e4], PHI: r15 r16 r22 r23 r25 r26 r27 r28
  0x03c5: PHI (r15v12 java.lang.String) = (r15v11 java.lang.String), (r15v1 java.lang.String), (r15v1 java.lang.String), (r15v1 java.lang.String) binds: [B:184:0x039c, B:156:0x02f7, B:153:0x02ec, B:238:0x03c5] A[DONT_GENERATE, DONT_INLINE]
  0x03c5: PHI (r16v13 java.lang.String) = (r16v12 java.lang.String), (r16v1 java.lang.String), (r16v1 java.lang.String), (r16v1 java.lang.String) binds: [B:184:0x039c, B:156:0x02f7, B:153:0x02ec, B:238:0x03c5] A[DONT_GENERATE, DONT_INLINE]
  0x03c5: PHI (r22v8 java.lang.String) = (r22v7 java.lang.String), (r22v10 java.lang.String), (r22v10 java.lang.String), (r22v10 java.lang.String) binds: [B:184:0x039c, B:156:0x02f7, B:153:0x02ec, B:238:0x03c5] A[DONT_GENERATE, DONT_INLINE]
  0x03c5: PHI (r23v5 char) = (r23v4 char), (r23v7 char), (r23v7 char), (r23v7 char) binds: [B:184:0x039c, B:156:0x02f7, B:153:0x02ec, B:238:0x03c5] A[DONT_GENERATE, DONT_INLINE]
  0x03c5: PHI (r25v10 java.util.HashMap) = (r25v9 java.util.HashMap), (r25v13 java.util.HashMap), (r25v19 java.util.HashMap), (r25v19 java.util.HashMap) binds: [B:184:0x039c, B:156:0x02f7, B:153:0x02ec, B:238:0x03c5] A[DONT_GENERATE, DONT_INLINE]
  0x03c5: PHI (r26v10 java.util.HashMap) = (r26v9 java.util.HashMap), (r26v12 java.util.HashMap), (r26v16 java.util.HashMap), (r26v16 java.util.HashMap) binds: [B:184:0x039c, B:156:0x02f7, B:153:0x02ec, B:238:0x03c5] A[DONT_GENERATE, DONT_INLINE]
  0x03c5: PHI (r27v10 java.util.HashMap) = (r27v9 java.util.HashMap), (r27v12 java.util.HashMap), (r27v15 java.util.HashMap), (r27v15 java.util.HashMap) binds: [B:184:0x039c, B:156:0x02f7, B:153:0x02ec, B:238:0x03c5] A[DONT_GENERATE, DONT_INLINE]
  0x03c5: PHI (r28v10 java.util.HashMap) = (r28v9 java.util.HashMap), (r6v1 java.util.HashMap), (r28v15 java.util.HashMap), (r28v22 java.util.HashMap) binds: [B:184:0x039c, B:156:0x02f7, B:153:0x02ec, B:238:0x03c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:199:0x03fe A[PHI: r6 r15 r16 r22 r23 r25 r26 r27 r28
  0x03fe: PHI (r6v8 char) = (r6v5 char), (r6v13 char), (r6v25 char), (r6v57 char) binds: [B:197:0x03f0, B:194:0x03ce, B:192:0x03c5, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x03fe: PHI (r15v7 java.lang.String) = (r15v1 java.lang.String), (r15v1 java.lang.String), (r15v12 java.lang.String), (r15v1 java.lang.String) binds: [B:197:0x03f0, B:194:0x03ce, B:192:0x03c5, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x03fe: PHI (r16v6 java.lang.String) = (r16v1 java.lang.String), (r16v1 java.lang.String), (r16v13 java.lang.String), (r16v1 java.lang.String) binds: [B:197:0x03f0, B:194:0x03ce, B:192:0x03c5, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x03fe: PHI (r22v5 java.lang.String) = (r22v2 java.lang.String), (r22v6 java.lang.String), (r22v8 java.lang.String), (r22v11 java.lang.String) binds: [B:197:0x03f0, B:194:0x03ce, B:192:0x03c5, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x03fe: PHI (r23v2 char) = (r23v1 char), (r23v3 char), (r23v5 char), (r23v8 char) binds: [B:197:0x03f0, B:194:0x03ce, B:192:0x03c5, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x03fe: PHI (r25v7 java.util.HashMap) = (r25v4 java.util.HashMap), (r25v8 java.util.HashMap), (r25v10 java.util.HashMap), (r25v23 java.util.HashMap) binds: [B:197:0x03f0, B:194:0x03ce, B:192:0x03c5, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x03fe: PHI (r26v7 java.util.HashMap) = (r26v4 java.util.HashMap), (r26v8 java.util.HashMap), (r26v10 java.util.HashMap), (r26v20 java.util.HashMap) binds: [B:197:0x03f0, B:194:0x03ce, B:192:0x03c5, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x03fe: PHI (r27v7 java.util.HashMap) = (r27v4 java.util.HashMap), (r27v8 java.util.HashMap), (r27v10 java.util.HashMap), (r27v21 java.util.HashMap) binds: [B:197:0x03f0, B:194:0x03ce, B:192:0x03c5, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x03fe: PHI (r28v7 java.util.HashMap) = (r28v4 java.util.HashMap), (r28v8 java.util.HashMap), (r28v10 java.util.HashMap), (r28v27 java.util.HashMap) binds: [B:197:0x03f0, B:194:0x03ce, B:192:0x03c5, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:208:0x045b  */
    /* JADX WARN: Code duplicated, block: B:209:0x045f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0476  */
    /* JADX WARN: Code duplicated, block: B:213:0x047a  */
    /* JADX WARN: Code duplicated, block: B:216:0x0491  */
    /* JADX WARN: Code duplicated, block: B:218:0x0495  */
    /* JADX WARN: Code duplicated, block: B:234:0x0432 A[EDGE_INSN: B:234:0x0432->B:206:0x0432 BREAK  A[LOOP:0: B:3:0x0039->B:204:0x0415], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0415 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x03c5 A[EDGE_INSN: B:238:0x03c5->B:192:0x03c5 BREAK  A[LOOP:2: B:99:0x0201->B:152:0x02e4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x02ec A[SYNTHETIC] */
    private void a(String str, JSONObject jSONObject) throws JSONException {
        HashMap map;
        HashMap map2;
        String str2;
        char c10;
        char c11;
        char c12;
        boolean z10;
        String str3;
        String strTrim;
        String[] strArrSplit;
        int i10;
        String string;
        HashMap map3;
        int i11;
        char c13;
        String str4;
        char c14;
        float fFloatValue;
        SystemClock.uptimeMillis();
        String[] strArrSplit2 = str.split("\n");
        float[] fArr = {-1.0f, -1.0f, -1.0f};
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        int length = strArrSplit2.length;
        String str5 = "unknown";
        String strTrim2 = "unknown";
        String str6 = strTrim2;
        int i12 = 0;
        char c15 = 0;
        boolean z11 = false;
        while (true) {
            if (i12 >= length) {
                map5 = map5;
                map = map6;
                map2 = map7;
                map8 = map8;
                break;
            }
            String strTrim3 = strArrSplit2[i12];
            if (!TextUtils.isEmpty(strTrim3)) {
                if (c15 == 0) {
                    map5 = map5;
                    map = map6;
                    map2 = map7;
                    map8 = map8;
                    str2 = str5;
                    c11 = c15;
                    c10 = 3;
                    String strTrim4 = strTrim3.trim();
                    if (strTrim4.startsWith("tag:")) {
                        strTrim2 = strTrim4.replace("tag:", "").trim();
                        c12 = 4;
                        c15 = 1;
                    } else {
                        c15 = c11;
                        c12 = 4;
                    }
                } else if (c15 == 1) {
                    map5 = map5;
                    map = map6;
                    map2 = map7;
                    map8 = map8;
                    str2 = str5;
                    c11 = c15;
                    strTrim3 = strTrim3.trim();
                    String lowerCase = strTrim3.toLowerCase();
                    if (lowerCase.startsWith("shortmsg")) {
                        strTrim3.substring(strTrim3.indexOf(58));
                        z10 = false;
                    } else {
                        if (lowerCase.startsWith("reason:")) {
                            strTrim3.substring(strTrim3.indexOf(58));
                            z10 = true;
                        } else {
                            c10 = 3;
                            if (lowerCase.contains("appfreeze")) {
                                c15 = '\n';
                                str6 = "AppFreeze";
                            } else {
                                c15 = c11;
                            }
                        }
                        c12 = 4;
                    }
                    if (lowerCase.contains("input dispatch")) {
                        str3 = "Input dispatching timed out";
                    } else if (lowerCase.contains("broadcast of intent")) {
                        str3 = "Broadcast of Intent";
                    } else {
                        if (lowerCase.contains("executing service")) {
                            if ("null".equalsIgnoreCase(strTrim2)) {
                                strTrim2 = strTrim3.substring(strTrim3.indexOf("service ") + 8).trim();
                            }
                            str6 = "executing service";
                        } else if (lowerCase.contains("service.startforeground")) {
                            str3 = "not call Service.startForeground";
                        } else {
                            str6 = str2;
                        }
                        if (z10) {
                            c12 = 4;
                            c10 = 3;
                            c15 = 2;
                        } else {
                            strTrim = strTrim3.trim();
                            if (strTrim.startsWith("Load:")) {
                                strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                                c10 = 3;
                                if (3 == strArrSplit.length) {
                                    for (i10 = 0; i10 < strArrSplit.length; i10++) {
                                        fArr[i10] = Float.valueOf(strArrSplit[i10]).floatValue();
                                    }
                                }
                                c15 = 3;
                            } else {
                                c10 = 3;
                                c15 = c11;
                            }
                            c12 = 4;
                        }
                    }
                    str6 = str3;
                    if (z10) {
                        c12 = 4;
                        c10 = 3;
                        c15 = 2;
                    } else {
                        strTrim = strTrim3.trim();
                        if (strTrim.startsWith("Load:")) {
                            strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                            c10 = 3;
                            if (3 == strArrSplit.length) {
                                while (i10 < strArrSplit.length) {
                                    fArr[i10] = Float.valueOf(strArrSplit[i10]).floatValue();
                                }
                            }
                            c15 = 3;
                        } else {
                            c10 = 3;
                            c15 = c11;
                        }
                        c12 = 4;
                    }
                } else if (c15 == 2) {
                    map5 = map5;
                    map = map6;
                    map2 = map7;
                    map8 = map8;
                    str2 = str5;
                    c11 = c15;
                    strTrim = strTrim3.trim();
                    if (strTrim.startsWith("Load:")) {
                        strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                        c10 = 3;
                        if (3 == strArrSplit.length) {
                            while (i10 < strArrSplit.length) {
                                fArr[i10] = Float.valueOf(strArrSplit[i10]).floatValue();
                            }
                        }
                        c15 = 3;
                    } else {
                        c10 = 3;
                        c15 = c11;
                    }
                    c12 = 4;
                } else if (c15 != 3) {
                    map5 = map5;
                    map = map6;
                    map2 = map7;
                    map8 = map8;
                    c10 = 3;
                    str2 = str5;
                    c11 = c15;
                    c15 = c11;
                    c12 = 4;
                } else {
                    String[] strArrSplit3 = strTrim3.split("\\s");
                    str2 = str5;
                    c11 = c15;
                    if (strArrSplit3.length >= 2) {
                        if ("CPU".equalsIgnoreCase(strArrSplit3[0]) && "usage".equalsIgnoreCase(strArrSplit3[1])) {
                            if (strTrim3.contains("ago")) {
                                z11 = true;
                            }
                            if (map4.isEmpty() && map5.isEmpty() && map6.isEmpty() && map8.isEmpty() && map7.isEmpty()) {
                                map5 = map5;
                                map = map6;
                                map2 = map7;
                                map8 = map8;
                                c15 = c11;
                                c12 = 4;
                                c10 = 3;
                            }
                        } else if (map4.isEmpty() || map5.isEmpty() || map6.isEmpty() || map8.isEmpty() || map7.isEmpty()) {
                            if (map4.isEmpty() && strArrSplit3[1].equalsIgnoreCase("TOTAL:")) {
                                string = "";
                                map3 = map4;
                                map = map6;
                            } else if (strTrim3.contains(this.f6242b.getPackageName())) {
                                string = "";
                                int i13 = 0;
                                while (i13 < strArrSplit3.length) {
                                    String str7 = string;
                                    if (strArrSplit3[i13].contains(this.f6242b.getPackageName())) {
                                        StringBuilder sb2 = new StringBuilder();
                                        String str8 = strArrSplit3[i13];
                                        sb2.append(str8.substring(str8.indexOf(47) + 1, strArrSplit3[i13].length() - 1));
                                        sb2.append('_');
                                        string = sb2.toString();
                                    } else {
                                        string = str7;
                                    }
                                    i13++;
                                    this = this;
                                    map6 = map6;
                                }
                                map = map6;
                                map3 = map;
                            } else {
                                map = map6;
                                if (map5.isEmpty() && strTrim3.contains("system_server:")) {
                                    string = "";
                                    map3 = map5;
                                } else if (map8.isEmpty() && strTrim3.contains("kswapd")) {
                                    string = "";
                                    map3 = map8;
                                } else if (map7.isEmpty() && strTrim3.contains("dex2oat")) {
                                    string = "";
                                    map3 = map7;
                                } else {
                                    string = "";
                                    map3 = null;
                                }
                            }
                            if (map3 != null) {
                                int i14 = 0;
                                while (!strArrSplit3[i14].contains("%") && (i14 = i14 + 1) < strArrSplit3.length) {
                                }
                                try {
                                    float fFloatValue2 = Float.valueOf(strArrSplit3[i14].replace("%", "")).floatValue();
                                    map2 = map7;
                                    try {
                                        String str9 = string + C3426d4.i.f28550l;
                                        if (map3 != map4) {
                                            fFloatValue2 /= com.apm.insight.l.d.d();
                                        }
                                        try {
                                            map3.put(str9, Float.valueOf(fFloatValue2));
                                            while (true) {
                                                if (i11 < strArrSplit3.length) {
                                                    map5 = map5;
                                                    break;
                                                }
                                                str4 = "kernel";
                                                if (c13 != 0) {
                                                    map5 = map5;
                                                    c14 = 5;
                                                    if ("user".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        str4 = "user";
                                                        c13 = 1;
                                                    }
                                                    if (str4 != null) {
                                                        fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                        String str10 = string + str4;
                                                        if (map3 == map4) {
                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                        }
                                                        map3.put(str10, Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArrSplit3 = strArrSplit3;
                                                    }
                                                    if (c13 < 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11 += 3;
                                                        strArrSplit3 = strArrSplit3;
                                                        map5 = map5;
                                                    }
                                                } else {
                                                    map5 = map5;
                                                    if (c13 != 1) {
                                                        c14 = 5;
                                                    } else if (c13 != 2) {
                                                        c13 = c13;
                                                        c14 = 5;
                                                        if ("iowait".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            str4 = "iowait";
                                                            c13 = 3;
                                                        } else if ("irq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            str4 = "irq";
                                                            c13 = 4;
                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            str4 = "softirq";
                                                            c13 = c14;
                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            c13 = 6;
                                                            str4 = "softirq";
                                                        }
                                                        if (str4 != null) {
                                                            fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                            String str11 = string + str4;
                                                            if (map3 == map4) {
                                                                fFloatValue /= com.apm.insight.l.d.d();
                                                            }
                                                            map3.put(str11, Float.valueOf(fFloatValue));
                                                        } else {
                                                            strArrSplit3 = strArrSplit3;
                                                        }
                                                        if (c13 < 6) {
                                                            break;
                                                            break;
                                                        } else {
                                                            i11 += 3;
                                                            strArrSplit3 = strArrSplit3;
                                                            map5 = map5;
                                                        }
                                                    } else if (c13 != 3) {
                                                        c13 = c13;
                                                        c14 = 5;
                                                        if ("irq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            str4 = "irq";
                                                            c13 = 4;
                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            str4 = "softirq";
                                                            c13 = c14;
                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            c13 = 6;
                                                            str4 = "softirq";
                                                        }
                                                        if (str4 != null) {
                                                            fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                            String str12 = string + str4;
                                                            if (map3 == map4) {
                                                                fFloatValue /= com.apm.insight.l.d.d();
                                                            }
                                                            map3.put(str12, Float.valueOf(fFloatValue));
                                                        } else {
                                                            strArrSplit3 = strArrSplit3;
                                                        }
                                                        if (c13 < 6) {
                                                            break;
                                                            break;
                                                        } else {
                                                            i11 += 3;
                                                            strArrSplit3 = strArrSplit3;
                                                            map5 = map5;
                                                        }
                                                    } else if (c13 != 4) {
                                                        c13 = c13;
                                                        c14 = 5;
                                                        if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            str4 = "softirq";
                                                            c13 = c14;
                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            c13 = 6;
                                                            str4 = "softirq";
                                                        }
                                                        if (str4 != null) {
                                                            fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                            String str13 = string + str4;
                                                            if (map3 == map4) {
                                                                fFloatValue /= com.apm.insight.l.d.d();
                                                            }
                                                            map3.put(str13, Float.valueOf(fFloatValue));
                                                        } else {
                                                            strArrSplit3 = strArrSplit3;
                                                        }
                                                        if (c13 < 6) {
                                                            break;
                                                            break;
                                                        } else {
                                                            i11 += 3;
                                                            strArrSplit3 = strArrSplit3;
                                                            map5 = map5;
                                                        }
                                                    } else {
                                                        c13 = c13;
                                                        if (c13 != 5) {
                                                            if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                                c13 = 6;
                                                                str4 = "softirq";
                                                            }
                                                        }
                                                        if (str4 != null) {
                                                            try {
                                                                fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                                String str14 = string + str4;
                                                                if (map3 == map4) {
                                                                    fFloatValue /= com.apm.insight.l.d.d();
                                                                }
                                                                try {
                                                                    map3.put(str14, Float.valueOf(fFloatValue));
                                                                } catch (Throwable unused) {
                                                                    map3.put(string + str4, Float.valueOf(-1.0f));
                                                                }
                                                            } catch (Throwable unused2) {
                                                                strArrSplit3 = strArrSplit3;
                                                            }
                                                        } else {
                                                            strArrSplit3 = strArrSplit3;
                                                        }
                                                        if (c13 < 6) {
                                                            break;
                                                        }
                                                        i11 += 3;
                                                        strArrSplit3 = strArrSplit3;
                                                        map5 = map5;
                                                    }
                                                    c13 = c13;
                                                    str4 = null;
                                                    if (str4 != null) {
                                                        fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                        String str15 = string + str4;
                                                        if (map3 == map4) {
                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                        }
                                                        map3.put(str15, Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArrSplit3 = strArrSplit3;
                                                    }
                                                    if (c13 < 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11 += 3;
                                                        strArrSplit3 = strArrSplit3;
                                                        map5 = map5;
                                                    }
                                                }
                                                if ("kernel".equalsIgnoreCase(strArrSplit3[i11])) {
                                                    c13 = 2;
                                                } else if ("iowait".equalsIgnoreCase(strArrSplit3[i11])) {
                                                    str4 = "iowait";
                                                    c13 = 3;
                                                } else if ("irq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                    str4 = "irq";
                                                    c13 = 4;
                                                } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                    str4 = "softirq";
                                                    c13 = c14;
                                                } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                    c13 = 6;
                                                    str4 = "softirq";
                                                } else {
                                                    c13 = c13;
                                                    str4 = null;
                                                }
                                                if (str4 != null) {
                                                    fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                    String str16 = string + str4;
                                                    if (map3 == map4) {
                                                        fFloatValue /= com.apm.insight.l.d.d();
                                                    }
                                                    map3.put(str16, Float.valueOf(fFloatValue));
                                                } else {
                                                    strArrSplit3 = strArrSplit3;
                                                }
                                                if (c13 < 6) {
                                                    break;
                                                    break;
                                                } else {
                                                    i11 += 3;
                                                    strArrSplit3 = strArrSplit3;
                                                    map5 = map5;
                                                }
                                            }
                                        } catch (Throwable unused3) {
                                            map3.put(string + C3426d4.i.f28550l, Float.valueOf(-1.0f));
                                        }
                                    } catch (Throwable unused4) {
                                        map8 = map8;
                                        map3.put(string + C3426d4.i.f28550l, Float.valueOf(-1.0f));
                                        i11 = i14 + 3;
                                        c13 = 0;
                                        while (true) {
                                            if (i11 < strArrSplit3.length) {
                                                map5 = map5;
                                                break;
                                            }
                                            str4 = "kernel";
                                            if (c13 != 0) {
                                                map5 = map5;
                                                c14 = 5;
                                                if ("user".equalsIgnoreCase(strArrSplit3[i11])) {
                                                    str4 = "user";
                                                    c13 = 1;
                                                }
                                                if (str4 != null) {
                                                    fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                    String str17 = string + str4;
                                                    if (map3 == map4) {
                                                        fFloatValue /= com.apm.insight.l.d.d();
                                                    }
                                                    map3.put(str17, Float.valueOf(fFloatValue));
                                                } else {
                                                    strArrSplit3 = strArrSplit3;
                                                }
                                                if (c13 < 6) {
                                                    break;
                                                    break;
                                                } else {
                                                    i11 += 3;
                                                    strArrSplit3 = strArrSplit3;
                                                    map5 = map5;
                                                }
                                            } else {
                                                map5 = map5;
                                                if (c13 != 1) {
                                                    c14 = 5;
                                                } else if (c13 != 2) {
                                                    c13 = c13;
                                                    c14 = 5;
                                                    if ("iowait".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        str4 = "iowait";
                                                        c13 = 3;
                                                    } else if ("irq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        str4 = "irq";
                                                        c13 = 4;
                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        str4 = "softirq";
                                                        c13 = c14;
                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        c13 = 6;
                                                        str4 = "softirq";
                                                    }
                                                    if (str4 != null) {
                                                        fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                        String str18 = string + str4;
                                                        if (map3 == map4) {
                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                        }
                                                        map3.put(str18, Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArrSplit3 = strArrSplit3;
                                                    }
                                                    if (c13 < 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11 += 3;
                                                        strArrSplit3 = strArrSplit3;
                                                        map5 = map5;
                                                    }
                                                } else if (c13 != 3) {
                                                    c13 = c13;
                                                    c14 = 5;
                                                    if ("irq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        str4 = "irq";
                                                        c13 = 4;
                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        str4 = "softirq";
                                                        c13 = c14;
                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        c13 = 6;
                                                        str4 = "softirq";
                                                    }
                                                    if (str4 != null) {
                                                        fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                        String str19 = string + str4;
                                                        if (map3 == map4) {
                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                        }
                                                        map3.put(str19, Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArrSplit3 = strArrSplit3;
                                                    }
                                                    if (c13 < 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11 += 3;
                                                        strArrSplit3 = strArrSplit3;
                                                        map5 = map5;
                                                    }
                                                } else if (c13 != 4) {
                                                    c13 = c13;
                                                    c14 = 5;
                                                    if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        str4 = "softirq";
                                                        c13 = c14;
                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        c13 = 6;
                                                        str4 = "softirq";
                                                    }
                                                    if (str4 != null) {
                                                        fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                        String str110 = string + str4;
                                                        if (map3 == map4) {
                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                        }
                                                        map3.put(str110, Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArrSplit3 = strArrSplit3;
                                                    }
                                                    if (c13 < 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11 += 3;
                                                        strArrSplit3 = strArrSplit3;
                                                        map5 = map5;
                                                    }
                                                } else {
                                                    c13 = c13;
                                                    if (c13 != 5) {
                                                        if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            c13 = 6;
                                                            str4 = "softirq";
                                                        }
                                                    }
                                                    if (str4 != null) {
                                                        fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                        String str111 = string + str4;
                                                        if (map3 == map4) {
                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                        }
                                                        map3.put(str111, Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArrSplit3 = strArrSplit3;
                                                    }
                                                    if (c13 < 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11 += 3;
                                                        strArrSplit3 = strArrSplit3;
                                                        map5 = map5;
                                                    }
                                                }
                                                c13 = c13;
                                                str4 = null;
                                                if (str4 != null) {
                                                    fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                    String str112 = string + str4;
                                                    if (map3 == map4) {
                                                        fFloatValue /= com.apm.insight.l.d.d();
                                                    }
                                                    map3.put(str112, Float.valueOf(fFloatValue));
                                                } else {
                                                    strArrSplit3 = strArrSplit3;
                                                }
                                                if (c13 < 6) {
                                                    break;
                                                    break;
                                                } else {
                                                    i11 += 3;
                                                    strArrSplit3 = strArrSplit3;
                                                    map5 = map5;
                                                }
                                            }
                                            if ("kernel".equalsIgnoreCase(strArrSplit3[i11])) {
                                                c13 = 2;
                                            } else if ("iowait".equalsIgnoreCase(strArrSplit3[i11])) {
                                                str4 = "iowait";
                                                c13 = 3;
                                            } else if ("irq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                str4 = "irq";
                                                c13 = 4;
                                            } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                str4 = "softirq";
                                                c13 = c14;
                                            } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                c13 = 6;
                                                str4 = "softirq";
                                            } else {
                                                c13 = c13;
                                                str4 = null;
                                            }
                                            if (str4 != null) {
                                                fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                String str113 = string + str4;
                                                if (map3 == map4) {
                                                    fFloatValue /= com.apm.insight.l.d.d();
                                                }
                                                map3.put(str113, Float.valueOf(fFloatValue));
                                            } else {
                                                strArrSplit3 = strArrSplit3;
                                            }
                                            if (c13 < 6) {
                                                break;
                                                break;
                                            } else {
                                                i11 += 3;
                                                strArrSplit3 = strArrSplit3;
                                                map5 = map5;
                                            }
                                        }
                                        c10 = 3;
                                        c15 = c11;
                                        c12 = 4;
                                        if (c15 < c12) {
                                            break;
                                            jSONObject.put("anr_tag", strTrim2);
                                            jSONObject.put("anr_has_ago", String.valueOf(z11));
                                            jSONObject.put("anr_reason", str6);
                                            a(map, jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                                            a(map4, jSONObject, C3426d4.i.f28550l);
                                            if (map5.isEmpty()) {
                                                jSONObject.put("npth_anr_systemserver_total", "not found");
                                            } else {
                                                jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map5).floatValue()));
                                            }
                                            if (map8.isEmpty()) {
                                                jSONObject.put("npth_anr_kswapd_total", "not found");
                                            } else {
                                                jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map8).floatValue()));
                                            }
                                            if (map2.isEmpty()) {
                                                jSONObject.put("npth_anr_dex2oat_total", "not found");
                                            } else {
                                                jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map2).floatValue()));
                                            }
                                        }
                                        i12++;
                                        strArrSplit2 = strArrSplit2;
                                        length = length;
                                        str5 = str2;
                                        map6 = map;
                                        map7 = map2;
                                        map8 = map8;
                                        map5 = map5;
                                    }
                                } catch (Throwable unused5) {
                                    map2 = map7;
                                }
                                i11 = i14 + 3;
                                c13 = 0;
                            }
                            c10 = 3;
                            c15 = c11;
                            c12 = 4;
                        }
                        map5 = map5;
                        map = map6;
                        map2 = map7;
                        map8 = map8;
                        c12 = 4;
                        c10 = 3;
                        c15 = 4;
                    } else {
                        map = map6;
                    }
                    map2 = map7;
                    map8 = map8;
                    c10 = 3;
                    c15 = c11;
                    c12 = 4;
                }
                if (c15 < c12) {
                    break;
                }
            } else {
                map5 = map5;
                map = map6;
                map2 = map7;
                map8 = map8;
                str2 = str5;
                c10 = 3;
            }
            i12++;
            strArrSplit2 = strArrSplit2;
            length = length;
            str5 = str2;
            map6 = map;
            map7 = map2;
            map8 = map8;
            map5 = map5;
        }
        jSONObject.put("anr_tag", strTrim2);
        jSONObject.put("anr_has_ago", String.valueOf(z11));
        jSONObject.put("anr_reason", str6);
        a(map, jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        a(map4, jSONObject, C3426d4.i.f28550l);
        if (map5.isEmpty()) {
            jSONObject.put("npth_anr_systemserver_total", "not found");
        } else {
            jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map5).floatValue()));
        }
        if (map8.isEmpty()) {
            jSONObject.put("npth_anr_kswapd_total", "not found");
        } else {
            jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map8).floatValue()));
        }
        if (map2.isEmpty()) {
            jSONObject.put("npth_anr_dex2oat_total", "not found");
        } else {
            jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map2).floatValue()));
        }
    }

    private static void a(HashMap<String, Float> map, JSONObject jSONObject, String str) throws JSONException {
        String strConcat = "npth_anr_".concat(String.valueOf(str));
        if (map.isEmpty()) {
            jSONObject.put(strConcat + "_total", "not found");
            return;
        }
        float fFloatValue = 0.0f;
        float fFloatValue2 = 0.0f;
        float fFloatValue3 = 0.0f;
        float fFloatValue4 = 0.0f;
        float fFloatValue5 = 0.0f;
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("user")) {
                fFloatValue += entry.getValue().floatValue();
            } else if (key.endsWith("kernel")) {
                fFloatValue2 += entry.getValue().floatValue();
            } else if (key.endsWith("iowait")) {
                fFloatValue3 += entry.getValue().floatValue();
            } else if (key.endsWith("irq")) {
                fFloatValue4 += entry.getValue().floatValue();
            } else if (key.endsWith("softirq")) {
                fFloatValue5 += entry.getValue().floatValue();
            }
        }
        float f10 = fFloatValue + fFloatValue2 + fFloatValue3 + fFloatValue4 + fFloatValue5;
        jSONObject.put(strConcat + "_total", b(f10));
        jSONObject.put(strConcat + "_kernel_user_ratio", a(fFloatValue2, f10));
        jSONObject.put(strConcat + "_iowait_user_ratio", a(fFloatValue3, f10));
    }

    private static String a(float f10, float f11) {
        if (f11 > 0.0f) {
            return a(f10 / f11);
        }
        return f10 > 0.0f ? "100%" : "0%";
    }
}
