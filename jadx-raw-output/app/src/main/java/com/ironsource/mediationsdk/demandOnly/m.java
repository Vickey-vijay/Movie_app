package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.C3405c1;
import com.ironsource.C3414ca;
import com.ironsource.C3676r4;
import com.ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractAdapter f29748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3405c1 f29749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f29750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f29751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f29752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f29753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public JSONObject f29755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<String> f29756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f29758k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f29759l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final IronSource.a f29760m;

    public enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public boolean a(a aVar, a aVar2) {
        synchronized (this.f29758k) {
            if (this.f29751d != aVar) {
                return false;
            }
            b(aVar2);
            return true;
        }
    }

    public void b(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.f29749b.f() + ": current state=" + this.f29751d + ", new state=" + aVar);
        synchronized (this.f29758k) {
            this.f29751d = aVar;
        }
    }

    public C3405c1 f() {
        return this.f29749b;
    }

    public String g() {
        return this.f29754g;
    }

    public String h() {
        return this.f29749b.f();
    }

    public int i() {
        return this.f29749b.d();
    }

    public Map<String, Object> j() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f29748a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f29748a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f29749b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f29749b.a());
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            map.put("instanceType", Integer.valueOf(this.f29749b.d()));
            if (!TextUtils.isEmpty(this.f29754g)) {
                map.put("auctionId", this.f29754g);
            }
            JSONObject jSONObject = this.f29755h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.f29755h);
            }
            if (!TextUtils.isEmpty(this.f29757j)) {
                map.put("dynamicDemandSource", this.f29757j);
            }
            if (o()) {
                map.put("isOneFlow", 1);
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + h() + ")", e10);
        }
        return map;
    }

    String k() {
        a aVar = this.f29751d;
        return aVar == null ? "null" : aVar.toString();
    }

    public String l() {
        return this.f29749b.i();
    }

    public List<String> m() {
        return this.f29756i;
    }

    public boolean n() {
        return this.f29749b.j();
    }

    public boolean o() {
        return this.f29750c.optBoolean("isOneFlow", false);
    }

    public void p() {
        synchronized (this.f29759l) {
            Timer timer = this.f29752e;
            if (timer != null) {
                timer.cancel();
                this.f29752e = null;
            }
        }
    }

    public m(C3405c1 c3405c1, AbstractAdapter abstractAdapter) {
        this.f29749b = c3405c1;
        this.f29760m = c3405c1.b();
        this.f29748a = abstractAdapter;
        JSONObject jSONObjectC = c3405c1.c();
        this.f29750c = jSONObjectC;
        try {
            jSONObjectC.put(IronSourceLoadParameters.Constants.DEMAND_ONLY, true);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
        }
        this.f29751d = a.NOT_LOADED;
        this.f29752e = null;
        this.f29754g = "";
        this.f29755h = null;
        this.f29756i = new ArrayList();
    }

    public a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.f29758k) {
            aVar2 = this.f29751d;
            if (Arrays.asList(aVarArr).contains(this.f29751d)) {
                b(aVar);
            }
        }
        return aVar2;
    }

    public void b(String str) {
        this.f29757j = com.ironsource.mediationsdk.d.b().c(str);
    }

    public boolean a(a aVar) {
        boolean z10;
        synchronized (this.f29758k) {
            z10 = this.f29751d == aVar;
        }
        return z10;
    }

    public void a(boolean z10) {
        try {
            this.f29750c.put("isOneFlow", z10);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.verbose("Can't set isOneFlow = " + z10 + ". Error: " + e10.getMessage());
        }
    }

    public void a(TimerTask timerTask) {
        synchronized (this.f29759l) {
            p();
            Timer timer = new Timer();
            this.f29752e = timer;
            timer.schedule(timerTask, this.f29753f);
        }
    }

    public void a(String str) {
        this.f29754g = str;
    }

    public void a(JSONObject jSONObject) {
        this.f29755h = jSONObject;
    }

    public void a(List<String> list, String str, int i10, String str2, String str3) {
        Iterator it = ((List) C3414ca.a((ArrayList) list, new ArrayList())).iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.d.b().a(str3, str, com.ironsource.mediationsdk.d.b().a((String) it.next(), str, i10, str2, "", "", "", ""));
        }
    }
}
