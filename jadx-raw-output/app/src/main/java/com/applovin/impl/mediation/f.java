package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.i6;
import com.applovin.impl.k3;
import com.applovin.impl.k5;
import com.applovin.impl.l1;
import com.applovin.impl.r3;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.mediation.adapter.MaxAdapter;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f8316c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f8317d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8318e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final JSONArray f8319f = new JSONArray();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LinkedHashMap f8320g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f8321h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f8322i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f8323j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f8324k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f8325l;

    public void a(Activity activity) {
        if (this.f8316c.compareAndSet(false, true)) {
            String str = (String) this.f8314a.a(z4.G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<k3> listA = a(JsonUtils.getJSONArray(jSONObject, this.f8314a.s0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f8325l = listA;
                    for (k3 k3Var : listA) {
                        this.f8322i.put(k3Var.b(), k3Var);
                    }
                    long j10 = StringUtils.parseLong(this.f8314a.n0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    k5 k5Var = new k5(listA, activity, this.f8314a);
                    if (j10 > 0) {
                        this.f8314a.q0().a(k5Var, d6.b.MEDIATION, j10);
                    } else {
                        this.f8314a.q0().a(k5Var);
                    }
                } catch (JSONException e10) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8315b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e10);
                    }
                    l1.a((Throwable) e10);
                }
            }
        }
    }

    public JSONArray b() {
        JSONArray jSONArrayShallowCopy;
        synchronized (this.f8321h) {
            jSONArrayShallowCopy = JsonUtils.shallowCopy(this.f8319f);
        }
        return jSONArrayShallowCopy;
    }

    public boolean c() {
        return this.f8316c.get();
    }

    private void c(k3 k3Var) {
        String strB = k3Var.b();
        synchronized (this.f8318e) {
            if (this.f8317d.contains(strB)) {
                return;
            }
            this.f8317d.add(strB);
            this.f8314a.P().d(d2.f7198c0, f2.a(k3Var));
        }
    }

    public f(com.applovin.impl.sdk.k kVar) {
        this.f8314a = kVar;
        this.f8315b = kVar.O();
    }

    public boolean b(k3 k3Var) {
        boolean zContainsKey;
        synchronized (this.f8321h) {
            zContainsKey = this.f8320g.containsKey(k3Var.b());
        }
        return zContainsKey;
    }

    public s4 a(k3 k3Var, Activity activity) {
        k3 k3VarA = a(k3Var);
        if (k3VarA == null) {
            return s4.a("AdapterInitialization:" + k3Var.c(), MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        String strB = k3Var.b();
        synchronized (this.f8324k) {
            s4 s4Var = (s4) this.f8323j.get(strB);
            if (s4Var != null) {
                boolean z10 = true;
                boolean z11 = k3VarA.q() && s4Var.e();
                if (!((Boolean) this.f8314a.a(x4.U6)).booleanValue() || !s4Var.a()) {
                    z10 = false;
                }
                if (!z11 && !z10) {
                    return s4Var;
                }
            }
            final s4 s4Var2 = new s4("AdapterInitialization:" + k3Var.c());
            this.f8323j.put(strB, s4Var2);
            h hVarA = this.f8314a.T().a(k3VarA);
            if (hVarA == null) {
                s4Var2.a("Adapter implementation not found");
                return s4Var2;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f8315b.d("MediationAdapterInitializationManager", "Initializing adapter " + k3VarA);
            }
            c(k3VarA);
            hVarA.a(MaxAdapterParametersImpl.a(k3VarA), activity, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.v
                @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                public final void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
                    f.a(s4Var2, initializationStatus, str);
                }
            });
            i6.a(k3VarA.m(), s4Var2, "The adapter (" + k3Var.c() + ") timed out initializing", "MediationAdapterInitializationManager", this.f8314a);
            return s4Var2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(s4 s4Var, MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            if (initializationStatus == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
                s4Var.a(str);
                return;
            } else {
                s4Var.b(initializationStatus);
                return;
            }
        }
        l1.a("Adapters should never report a null or INITIALIZING status.", new Object[0]);
        s4Var.a("Adapter reported INITIALIZING");
    }

    private k3 a(k3 k3Var) {
        List<k3> list;
        if (((Boolean) this.f8314a.a(r3.f8961v8)).booleanValue()) {
            k3 k3Var2 = (k3) this.f8322i.get(k3Var.b());
            return k3Var2 != null ? k3Var2 : k3Var;
        }
        if (!this.f8314a.s0().c() || (list = this.f8325l) == null) {
            return k3Var;
        }
        for (k3 k3Var3 : list) {
            if (k3Var3.b().equals(k3Var.b())) {
                return k3Var3;
            }
        }
        return null;
    }

    public Integer a(String str) {
        Integer num;
        synchronized (this.f8321h) {
            num = (Integer) this.f8320g.get(str);
        }
        return num;
    }

    public Set a() {
        HashSet hashSet;
        synchronized (this.f8321h) {
            hashSet = new HashSet(this.f8320g.keySet());
        }
        return hashSet;
    }

    public void a(k3 k3Var, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z10;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f8321h) {
            z10 = !b(k3Var);
            if (z10) {
                this.f8320g.put(k3Var.b(), Integer.valueOf(initializationStatus.getCode()));
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putString(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, k3Var.b());
                JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                JsonUtils.putLong(jSONObject, "init_time_ms", j10);
                JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                this.f8319f.put(jSONObject);
            }
        }
        if (z10) {
            this.f8314a.a(k3Var);
            this.f8314a.X().processAdapterInitializationPostback(k3Var, j10, initializationStatus, str);
            this.f8314a.t().a(initializationStatus, k3Var.b());
        }
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(new k3(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, this.f8314a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f8321h) {
            this.f8320g.put(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f44047i, Integer.valueOf(initializationStatus.getCode()));
        }
        this.f8314a.t().a(initializationStatus, com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f44047i);
    }
}
