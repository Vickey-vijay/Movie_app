package com.mbridge.msdk.tracker;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.C3426d4;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: ReportMonitor.java */
/* JADX INFO: loaded from: classes8.dex */
public class u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile u f38333g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f38334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x f38335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f38336c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38337d = 30000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f38338e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f38339f = new a(Looper.getMainLooper());

    /* JADX INFO: compiled from: ReportMonitor.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                try {
                    u.this.b();
                    u.this.f38339f.removeMessages(1);
                    u.this.d();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public synchronized void c() {
        if (this.f38336c) {
            return;
        }
        this.f38336c = true;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f38339f.sendEmptyMessageDelayed(1, this.f38337d);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(Context context, x xVar, int i10, JSONObject jSONObject) {
        this.f38335b = xVar;
        this.f38337d = i10;
        m mVarB = m.b("monitor", context, xVar);
        this.f38334a = mVarB;
        if (mVarB != null) {
            mVarB.a(jSONObject);
            this.f38334a.h();
        }
        c();
    }

    private u() {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[Catch: Exception -> 0x00af, TRY_LEAVE, TryCatch #0 {Exception -> 0x00af, blocks: (B:5:0x0008, B:7:0x000d, B:9:0x001b, B:12:0x002e, B:15:0x003a, B:18:0x0058, B:23:0x00a8, B:20:0x0070), top: B:28:0x0008, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x0058, please report this as an issue */
    public void b() {
        m[] mVarArrB = m.b();
        if (mVarArrB.length == 0) {
            return;
        }
        try {
            for (m mVar : mVarArrB) {
                String strF = mVar.f();
                if (!"monitor".equals(strF)) {
                    String strD = mVar.d();
                    long[] jArrE = mVar.e();
                    long j10 = jArrE[1];
                    if (j10 != 0) {
                        long j11 = jArrE[0];
                        if (this.f38338e.containsKey(strF)) {
                            if (!(j11 + "").equals(this.f38338e.get(strF))) {
                                this.f38338e.put(strF, j11 + "");
                                if (this.f38334a != null) {
                                    try {
                                        e eVar = new e("event_lib_monitor");
                                        eVar.a(1);
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put(C3426d4.i.W, "m_report_rate");
                                        jSONObject.put("task_name", strF);
                                        jSONObject.put("task_count", j10);
                                        jSONObject.put("task_session_id", strD);
                                        jSONObject.put("task_ts", j11);
                                        eVar.a(jSONObject);
                                        this.f38334a.d(eVar);
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                }
                            }
                        } else {
                            this.f38338e.put(strF, j11 + "");
                            if (this.f38334a != null) {
                                e eVar2 = new e("event_lib_monitor");
                                eVar2.a(1);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put(C3426d4.i.W, "m_report_rate");
                                jSONObject2.put("task_name", strF);
                                jSONObject2.put("task_count", j10);
                                jSONObject2.put("task_session_id", strD);
                                jSONObject2.put("task_ts", j11);
                                eVar2.a(jSONObject2);
                                this.f38334a.d(eVar2);
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static u a() {
        if (f38333g == null) {
            synchronized (u.class) {
                if (f38333g == null) {
                    f38333g = new u();
                }
            }
        }
        return f38333g;
    }
}
