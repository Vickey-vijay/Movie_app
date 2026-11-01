package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: MBridgeTrackManager.java */
/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, m> f38149b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f38150a;

    /* JADX INFO: compiled from: MBridgeTrackManager.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                u.a().b();
                m.this.f38150a.p().b();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f38101a) {
                    Log.e("TrackManager", "flush error", e10);
                }
            }
        }
    }

    /* JADX INFO: compiled from: MBridgeTrackManager.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f38152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f38153b;

        public b(e eVar, JSONObject jSONObject) {
            this.f38152a = eVar;
            this.f38153b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m.this.f38150a.g().a(this.f38152a);
                JSONObject jSONObject = this.f38153b;
                if (jSONObject != null) {
                    jSONObject.put("session_id", m.this.d());
                    long[] jArrE = m.this.e();
                    this.f38153b.put("track_time", jArrE[0]);
                    this.f38153b.put("track_count", jArrE[1]);
                    this.f38152a.a(this.f38153b);
                }
                this.f38152a.b(m.this.f38150a.b().f38350f);
                m.this.f38150a.g().b(this.f38152a);
            } catch (Exception e10) {
                Log.d("TrackManager", "trackEvent error", e10);
            }
        }
    }

    public static m b(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f38149b;
        m mVar = concurrentHashMap.get(str);
        if (!y.b(mVar)) {
            return mVar;
        }
        m mVar2 = new m(str, context, xVar);
        concurrentHashMap.put(str, mVar2);
        return mVar2;
    }

    public JSONObject c() {
        return this.f38150a.o();
    }

    public String d() {
        return this.f38150a.s();
    }

    public void a(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f38149b;
        m mVar = concurrentHashMap.get(str);
        if (y.b(mVar)) {
            concurrentHashMap.put(str, new m(str, context, xVar));
        } else {
            mVar.f38150a.a(xVar);
        }
    }

    public void c(e eVar) {
        d(eVar);
    }

    public void d(e eVar) {
        if (this.f38150a.w()) {
            if (com.mbridge.msdk.tracker.a.f38101a) {
                Log.d("TrackManager", "SDK is shutdown, track event will not be processed");
                return;
            }
            return;
        }
        if (eVar != null && b(eVar)) {
            JSONObject jSONObjectI = eVar.i();
            if (jSONObjectI != null && !jSONObjectI.has("ts")) {
                try {
                    jSONObjectI.put("ts", System.currentTimeMillis());
                } catch (Exception e10) {
                    Log.e("TrackManager", "trackEvent error", e10);
                }
            }
            try {
                this.f38150a.h().a(new b(eVar, jSONObjectI));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f38101a) {
                    Log.e("TrackManager", "trackEvent error", e11);
                }
            }
        }
    }

    public long[] e() {
        return this.f38150a.g().a();
    }

    public String f() {
        return this.f38150a.v();
    }

    public boolean g() {
        return !this.f38150a.w();
    }

    private m(String str, Context context, x xVar) {
        k kVar = new k(str, this);
        this.f38150a = kVar;
        kVar.a(context);
        kVar.a(xVar);
    }

    public String h() {
        if (g()) {
            if (com.mbridge.msdk.tracker.a.f38101a) {
                Log.e("TrackManager", "MBridgeTrackManager is already running");
            }
            return d();
        }
        return this.f38150a.x();
    }

    public static m[] b() {
        ConcurrentHashMap<String, m> concurrentHashMap = f38149b;
        m[] mVarArr = new m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                mVarArr[i10] = it.next().getValue();
                i10++;
            }
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f38101a) {
                Log.e("TrackManager", "getAllTrackManager error", e10);
            }
        }
        return mVarArr;
    }

    public void a() {
        try {
            this.f38150a.h().a(new a());
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f38101a) {
                Log.e("TrackManager", "flush error", e10);
            }
        }
    }

    private boolean b(e eVar) {
        if (y.b(eVar) || TextUtils.isEmpty(eVar.g())) {
            return false;
        }
        return this.f38150a.a(eVar);
    }

    public void a(JSONObject jSONObject) {
        this.f38150a.a(jSONObject);
    }

    public boolean a(String str) {
        return a(new e(str));
    }

    public boolean a(e eVar) {
        try {
            return b(eVar);
        } catch (Exception unused) {
            return false;
        }
    }
}
