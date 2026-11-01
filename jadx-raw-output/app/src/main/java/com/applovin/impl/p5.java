package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p5 extends i5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static JSONObject f8731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f8732k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map f8733l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a3 f8734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f8735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f8736i;

    public interface b {
        void a(JSONArray jSONArray);
    }

    public static class c implements c5.a, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f8737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f8738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8739c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f8740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Collection f8741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f8742f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f8743g;

        @Override // com.applovin.impl.c5.a
        public void a(c5 c5Var) {
            boolean z10;
            synchronized (this.f8738b) {
                this.f8741e.add(c5Var);
                int i10 = this.f8739c - 1;
                this.f8739c = i10;
                z10 = i10 < 1;
            }
            if (z10 && this.f8740d.compareAndSet(false, true)) {
                if (n7.i() && ((Boolean) this.f8742f.a(x4.P)).booleanValue()) {
                    this.f8742f.q0().a((i5) new r6(this.f8742f, "handleSignalCollectionCompleted", new Runnable() { // from class: com.applovin.impl.kd
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7828b.a();
                        }
                    }), d6.b.MEDIATION);
                } else {
                    a();
                }
            }
        }

        private c(int i10, b bVar, com.applovin.impl.sdk.k kVar) {
            this.f8739c = i10;
            this.f8737a = bVar;
            this.f8742f = kVar;
            this.f8743g = kVar.O();
            this.f8738b = new Object();
            this.f8741e = new ArrayList(i10);
            this.f8740d = new AtomicBoolean();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8740d.compareAndSet(false, true)) {
                a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            ArrayList<c5> arrayList;
            synchronized (this.f8738b) {
                arrayList = new ArrayList(this.f8741e);
            }
            JSONArray jSONArray = new JSONArray();
            for (c5 c5Var : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    d5 d5VarF = c5Var.f();
                    jSONObject.put("name", d5VarF.c());
                    jSONObject.put(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, d5VarF.b());
                    jSONObject.put("adapter_version", c5Var.a());
                    jSONObject.put("sdk_version", c5Var.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError maxErrorC = c5Var.c();
                    if (maxErrorC != null) {
                        jSONObject2.put("error_message", maxErrorC.getMessage());
                    } else {
                        jSONObject2.put("signal", c5Var.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", c5Var.b());
                    jSONObject2.put("is_cached", c5Var.g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8743g.a("TaskCollectSignals", "Collected signal from " + d5VarF);
                    }
                } catch (JSONException e10) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8743g.a("TaskCollectSignals", "Failed to create signal data", e10);
                    }
                    this.f8742f.D().a("TaskCollectSignals", "createSignalsData", e10);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f8737a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        c cVar = new c(jSONArray.length(), this.f8736i, this.f7705a);
        this.f7705a.q0().a(new r6(this.f7705a, "timeoutCollectSignal", cVar), d6.b.TIMEOUT, ((Long) this.f7705a.a(r3.f8962w7)).longValue());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(new d5(this.f8734g, jSONArray.getJSONObject(i10), jSONObject, this.f7705a), cVar);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        Set set = (Set) f8733l.get(this.f8734g.b());
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.f8734g.b(), (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        a(jSONArray2, jSONObject);
    }

    public p5(a3 a3Var, Context context, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskCollectSignals", kVar);
        this.f8734g = a3Var;
        this.f8735h = context;
        this.f8736i = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (f8732k) {
                jSONArray = JsonUtils.getJSONArray(f8731j, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f8733l.size() > 0) {
                    b(jSONArray, f8731j);
                    return;
                } else {
                    a(jSONArray, f8731j);
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.k(this.f7706b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f7705a.a(z4.F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f8733l.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e10) {
            a("Failed to wait for signals", e10);
            this.f7705a.D().a("TaskCollectSignals", "waitForSignals", e10);
        } catch (JSONException e11) {
            a("Failed to parse signals JSON", e11);
            this.f7705a.D().a("TaskCollectSignals", "parseSignalsJSON", e11);
        } catch (Throwable th2) {
            a("Failed to collect signals", th2);
            this.f7705a.D().a("TaskCollectSignals", "collectSignals", th2);
        }
    }

    private void a(final d5 d5Var, final c5.a aVar) {
        if (d5Var.r()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.jd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7775b.b(d5Var, aVar);
                }
            });
        } else {
            this.f7705a.X().collectSignal(d5Var, this.f8735h, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d5 d5Var, c5.a aVar) {
        this.f7705a.X().collectSignal(d5Var, this.f8735h, aVar);
    }

    private void a(String str, Throwable th2) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "No signals collected: " + str, th2);
        }
        b bVar = this.f8736i;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f8732k) {
            f8731j = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f8733l.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e10) {
            com.applovin.impl.sdk.o.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e10);
            kVar.D().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e10);
        }
    }
}
