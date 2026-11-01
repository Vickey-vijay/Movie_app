package com.bykv.vk.openvk.preload.geckox;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* JADX INFO: compiled from: GeckoClient.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.falconx.a.a f10533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue<String> f10534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f10535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f10536d;

    public static a a(b bVar) {
        List<String> listE = bVar.e();
        if (listE == null || listE.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        bVar.a();
        return new a(bVar);
    }

    private boolean b(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map != null && !map.isEmpty()) {
            List<String> listE = this.f10535c.e();
            for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                Iterator<String> it = listE.iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next(), entry.getKey())) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    return false;
                }
            }
        }
        return true;
    }

    public static /* synthetic */ void d(a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aVar.f10535c.e());
        try {
            String strA = new com.bykv.vk.openvk.preload.geckox.a.a(arrayList).a();
            if (aVar.f10535c.p() != null && aVar.f10535c.p().a()) {
                aVar.f10535c.p();
            } else if (aVar.f10534b.size() < 10) {
                aVar.f10534b.add(strA);
            }
        } catch (Throwable unused) {
        }
    }

    private a(b bVar) {
        new ArrayList();
        this.f10533a = new com.bykv.vk.openvk.preload.falconx.a.a();
        this.f10534b = new LinkedBlockingQueue();
        this.f10535c = bVar;
        File fileN = bVar.n();
        this.f10536d = fileN;
        fileN.mkdirs();
        com.bykv.vk.openvk.preload.geckox.statistic.b.a(this, this.f10535c);
    }

    private boolean a() {
        List<String> listD = this.f10535c.d();
        List<String> listE = this.f10535c.e();
        if (listD == null || listD.isEmpty() || listE == null || listE.isEmpty()) {
            return false;
        }
        for (String str : listE) {
            Iterator<String> it = listD.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next())) {
                    z10 = true;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final void a(Class<? extends d<?, ?>> cls, com.bykv.vk.openvk.preload.a.b.a aVar) {
        this.f10533a.a(cls, aVar);
    }

    public final void a(final Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        final String str = "default";
        if (!TextUtils.isEmpty("default")) {
            if (a()) {
                if (b(map)) {
                    final com.bykv.vk.openvk.preload.geckox.d.a aVar = null;
                    final Map map2 = null;
                    b.h().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.1
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v10, types: [org.json.JSONObject] */
                        /* JADX WARN: Type inference failed for: r0v26, types: [org.json.JSONObject] */
                        /* JADX WARN: Type inference failed for: r0v33 */
                        /* JADX WARN: Type inference failed for: r0v34 */
                        /* JADX WARN: Type inference failed for: r0v35 */
                        /* JADX WARN: Type inference failed for: r0v36 */
                        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
                        /* JADX WARN: Type inference failed for: r4v11, types: [com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor] */
                        /* JADX WARN: Type inference failed for: r4v12 */
                        /* JADX WARN: Type inference failed for: r4v13 */
                        /* JADX WARN: Type inference failed for: r4v3, types: [com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor] */
                        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
                        /* JADX WARN: Type inference failed for: r4v7, types: [com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor] */
                        /* JADX WARN: Type inference failed for: r4v8 */
                        /* JADX WARN: Type inference failed for: r5v13 */
                        /* JADX WARN: Type inference failed for: r5v14 */
                        /* JADX WARN: Type inference failed for: r5v9, types: [org.json.JSONObject] */
                        /* JADX WARN: Type inference failed for: r9v0, types: [com.bykv.vk.openvk.preload.geckox.a.a.b] */
                        /* JADX WARN: Type inference failed for: r9v1 */
                        /* JADX WARN: Type inference failed for: r9v10 */
                        /* JADX WARN: Type inference failed for: r9v12, types: [long] */
                        /* JADX WARN: Type inference failed for: r9v16 */
                        /* JADX WARN: Type inference failed for: r9v17 */
                        /* JADX WARN: Type inference failed for: r9v2 */
                        /* JADX WARN: Type inference failed for: r9v4, types: [long] */
                        /* JADX WARN: Type inference failed for: r9v5, types: [com.bykv.vk.openvk.preload.geckox.a.a.b] */
                        /* JADX WARN: Type inference failed for: r9v8 */
                        /* JADX WARN: Type inference failed for: r9v9 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.bykv.vk.openvk.preload.geckox.a.a.b bVarA;
                            ?? r10 = "download_duration";
                            GeckoLogger.d("gecko-debug-tag", "start check update...", str);
                            if (a.this.f10535c.b() != null) {
                                bVarA = a.this.f10535c.b().a();
                                bVarA.a(a.this.f10535c.b(), a.this.f10535c.n(), a.this.f10535c.e());
                            } else {
                                bVarA = null;
                            }
                            ?? ElapsedRealtime = bVarA;
                            try {
                                try {
                                    a.this.f10535c.a(new JSONObject());
                                    GeckoLogger.d("gecko-debug-tag", "update finished", com.bykv.vk.openvk.preload.geckox.g.a.a(aVar, a.this.f10536d, a.this.f10535c, a.this.f10533a, map2, map, str).a(str));
                                    if (ElapsedRealtime != 0) {
                                        ElapsedRealtime.a();
                                    }
                                    JSONObject jSONObjectF = a.this.f10535c.f();
                                    ?? jSONObject = jSONObjectF;
                                    if (jSONObjectF == null) {
                                        jSONObject = new JSONObject();
                                    }
                                    try {
                                        ElapsedRealtime = SystemClock.elapsedRealtime() - a.this.f10535c.s();
                                        jSONObject.put("download_duration", ElapsedRealtime);
                                    } catch (Throwable unused) {
                                    }
                                    ?? Q = a.this.f10535c.q();
                                    Q.upload("download_gecko_end", jSONObject);
                                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                    r10 = Q;
                                    ElapsedRealtime = ElapsedRealtime;
                                } catch (Throwable th2) {
                                    if (ElapsedRealtime != 0) {
                                        ElapsedRealtime.a();
                                    }
                                    JSONObject jSONObjectF2 = a.this.f10535c.f();
                                    ?? jSONObject2 = jSONObjectF2;
                                    if (jSONObjectF2 == null) {
                                        jSONObject2 = new JSONObject();
                                    }
                                    try {
                                        jSONObject2.put(r10, SystemClock.elapsedRealtime() - a.this.f10535c.s());
                                    } catch (Throwable unused2) {
                                    }
                                    a.this.f10535c.q().upload("download_gecko_end", jSONObject2);
                                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                    throw th2;
                                }
                            } catch (Exception e10) {
                                try {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("success", false);
                                    jSONObject3.put(NotificationCompat.CATEGORY_MESSAGE, e10.toString());
                                    jSONObject3.put("code", 2);
                                    a.this.f10535c.a(jSONObject3);
                                } catch (Throwable unused3) {
                                }
                                GeckoLogger.w("gecko-debug-tag", "Gecko update failed:", e10);
                                if (ElapsedRealtime != 0) {
                                    ElapsedRealtime.a();
                                }
                                JSONObject jSONObjectF3 = a.this.f10535c.f();
                                ?? jSONObject4 = jSONObjectF3;
                                if (jSONObjectF3 == null) {
                                    jSONObject4 = new JSONObject();
                                }
                                try {
                                    ElapsedRealtime = SystemClock.elapsedRealtime() - a.this.f10535c.s();
                                    jSONObject4.put("download_duration", ElapsedRealtime);
                                } catch (Throwable unused4) {
                                }
                                ?? Q2 = a.this.f10535c.q();
                                Q2.upload("download_gecko_end", jSONObject4);
                                GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                r10 = Q2;
                                ElapsedRealtime = ElapsedRealtime;
                            }
                            a.d(a.this);
                        }
                    });
                    return;
                }
                throw new IllegalArgumentException("target keys not in deployments keys");
            }
            throw new IllegalArgumentException("deployments keys not in local keys");
        }
        throw new IllegalArgumentException("groupType == null");
    }
}
