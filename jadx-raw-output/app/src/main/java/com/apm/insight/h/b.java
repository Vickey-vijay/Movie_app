package com.apm.insight.h;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.apm.insight.e;
import com.apm.insight.l.f;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.j;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.n;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: NpthSoData.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, String> f6464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f6465b;

    public static String a(String str) {
        return e.g().getFilesDir() + "/apminsight/selflib/lib" + str + ".so";
    }

    public static void b(final String str) {
        m.a().a(new Runnable() { // from class: com.apm.insight.h.b.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f6466a = false;

            @Override // java.lang.Runnable
            public final void run() {
                b.b();
                if (!b.c(str)) {
                    n.a("updateSo", str);
                    File file = new File(b.a(str));
                    file.getParentFile().mkdirs();
                    if (file.exists()) {
                        file.delete();
                    }
                    String str2 = "doUnpackLibrary: " + str;
                    if (e.i().isDebugMode()) {
                        Log.w("npth", str2);
                    }
                    String strA = null;
                    try {
                        strA = c.a(e.g(), str, file);
                    } catch (Throwable th2) {
                        n.a("updateSoError", str);
                        com.apm.insight.c.a();
                        j.a(th2, "NPTH_CATCH");
                    }
                    if (strA == null) {
                        b.f6464a.put(file.getName(), "2008-20250701130429");
                        try {
                            f.a(new File(e.g().getFilesDir() + "/apminsight/selflib/" + str + ".ver"), "2008-20250701130429", false);
                        } catch (Throwable unused) {
                        }
                        n.a("updateSoSuccess", str);
                        return;
                    }
                    if (!this.f6466a) {
                        this.f6466a = true;
                        n.a("updateSoPostRetry", str);
                        m.a().a(this, 3000L);
                        return;
                    }
                    n.a("updateSoFailed", str);
                }
            }
        });
    }

    public static String a() {
        return e.g().getFilesDir() + "/apminsight/selflib/";
    }

    public static /* synthetic */ void b() {
        if (f6464a == null) {
            f6464a = new HashMap<>();
            File file = new File(e.g().getFilesDir(), "/apminsight/selflib/");
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    if (str.endsWith(".ver")) {
                        try {
                            f6464a.put(str.substring(0, str.length() - 4), f.a(file.getAbsolutePath() + "/" + str, "\n"));
                        } catch (Throwable th2) {
                            com.apm.insight.c.a();
                            j.a(th2, "NPTH_CATCH");
                        }
                    } else if (!str.endsWith(".so")) {
                        f.a(new File(file, str));
                    }
                }
            }
        }
    }

    public static /* synthetic */ boolean c(String str) {
        return "2008-20250701130429".equals(f6464a.get(str)) && new File(a(str)).exists();
    }

    public final boolean d() {
        Map<String, String> map = this.f6465b;
        return (map == null || map.isEmpty() || TextUtils.isEmpty(this.f6465b.get("process_name")) || TextUtils.isEmpty(this.f6465b.get("crash_thread_name")) || TextUtils.isEmpty(this.f6465b.get("pid")) || TextUtils.isEmpty(this.f6465b.get(ScarConstants.TOKEN_ID_KEY)) || TextUtils.isEmpty(this.f6465b.get("start_time")) || TextUtils.isEmpty(this.f6465b.get("crash_time")) || TextUtils.isEmpty(this.f6465b.get("signal_line"))) ? false : true;
    }

    @Nullable
    public final String e() {
        return this.f6465b.get("signal_line");
    }

    public final Map<String, String> f() {
        return this.f6465b;
    }

    public b(File file) {
        String strA;
        File fileC = com.apm.insight.l.j.c(file);
        if (!fileC.exists() || fileC.length() == 0 || (strA = NativeImpl.a(fileC.getAbsolutePath())) == null) {
            return;
        }
        String[] strArrSplit = strA.split("\n");
        this.f6465b = new HashMap();
        for (String str : strArrSplit) {
            String[] strArrSplit2 = str.split("=");
            if (strArrSplit2.length == 2) {
                this.f6465b.put(strArrSplit2[0], strArrSplit2[1]);
            }
        }
    }
}
