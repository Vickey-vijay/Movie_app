package com.apm.insight.g;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.e;
import com.apm.insight.l.f;
import com.apm.insight.l.j;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.h;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: JavaCrash.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6450a;

    @Override // com.apm.insight.g.c
    public final void a(final long j10, final Thread thread, final Throwable th2, final String str, final String str2, final boolean z10) {
        final File file = new File(j.a(this.f6450a), str);
        a.a().a(file.getName());
        file.mkdirs();
        f.d(file);
        final boolean zC = m.c(th2);
        com.apm.insight.entity.a aVarA = com.apm.insight.runtime.a.f.a().a(CrashType.JAVA, new com.apm.insight.runtime.a.c.a() { // from class: com.apm.insight.g.d.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f6451a = 0;

            @Override // com.apm.insight.runtime.a.c.a
            public final com.apm.insight.entity.a b(int i10, com.apm.insight.entity.a aVar) {
                try {
                    f.a(new File(file, file.getName() + "." + i10), aVar.c());
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public final com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) {
                String name;
                String str3;
                this.f6451a = SystemClock.uptimeMillis();
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 == 5) {
                                        aVar.a("crash_uuid", (Object) str);
                                    }
                                } else if (!zC) {
                                    com.apm.insight.l.a.a(d.this.f6450a, aVar.c());
                                }
                            } else {
                                JSONObject jSONObjectB = m.b(Thread.currentThread().getName());
                                if (jSONObjectB != null) {
                                    aVar.a("all_thread_stacks", jSONObjectB);
                                }
                                aVar.a("logcat", (Object) h.a(e.f()));
                            }
                        } else {
                            if (zC) {
                                com.apm.insight.l.a.a(d.this.f6450a, aVar.c());
                            }
                            if (e.x()) {
                                JSONArray jSONArrayB = com.apm.insight.b.f.b().b();
                                long jUptimeMillis = SystemClock.uptimeMillis();
                                JSONObject jSONObjectA = com.apm.insight.b.f.b().a(jUptimeMillis).a();
                                JSONArray jSONArrayA = com.apm.insight.b.j.a(jUptimeMillis);
                                aVar.a("history_message", (Object) jSONArrayB);
                                aVar.a("current_message", jSONObjectA);
                                aVar.a("pending_messages", (Object) jSONArrayA);
                            }
                            aVar.a("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
                            aVar.a("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.a()));
                        }
                    } else {
                        Thread thread2 = thread;
                        if (thread2 != null) {
                            name = thread2.getName();
                        } else {
                            name = "";
                        }
                        aVar.a("crash_thread_name", (Object) name);
                        aVar.a(ScarConstants.TOKEN_ID_KEY, Integer.valueOf(Process.myTid()));
                        String str4 = "true";
                        if (Npth.hasCrashWhenJavaCrash()) {
                            str3 = "true";
                        } else {
                            str3 = com.ironsource.mediationsdk.metadata.a.f29886h;
                        }
                        aVar.a("crash_after_crash", str3);
                        if (!NativeImpl.e()) {
                            str4 = com.ironsource.mediationsdk.metadata.a.f29886h;
                        }
                        aVar.a("crash_after_native", str4);
                        a.a().a(thread, th2, false, aVar);
                    }
                } else {
                    aVar.a("data", (Object) m.a(th2));
                    aVar.a("isOOM", Boolean.valueOf(zC));
                    aVar.a("isJava", (Object) 1);
                    aVar.a("crash_time", Long.valueOf(j10));
                    aVar.a("launch_mode", Integer.valueOf(com.apm.insight.runtime.a.b.b()));
                    aVar.a("launch_time", Long.valueOf(com.apm.insight.runtime.a.b.c()));
                    String str5 = str2;
                    if (str5 != null) {
                        aVar.a("crash_md5", (Object) str5);
                        aVar.a("crash_md5", str2);
                        boolean z11 = z10;
                        if (z11) {
                            aVar.a("has_ignore", String.valueOf(z11));
                        }
                    }
                }
                return aVar;
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis() - j10;
        try {
            aVarA.a("crash_type", "normal");
            aVarA.b("crash_cost", String.valueOf(jCurrentTimeMillis));
            aVarA.a("crash_cost", String.valueOf(jCurrentTimeMillis / 1000));
        } catch (Throwable th3) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th3, "NPTH_CATCH");
        }
    }

    public d(Context context) {
        this.f6450a = context;
    }
}
