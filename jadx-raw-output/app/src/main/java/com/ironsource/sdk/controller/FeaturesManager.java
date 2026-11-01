package com.ironsource.sdk.controller;

import com.ironsource.C3411c7;
import com.ironsource.C3426d4;
import com.ironsource.C3676r4;
import com.ironsource.InterfaceC3680r8;
import com.ironsource.Lb;
import com.ironsource.P3;
import com.ironsource.Q3;
import com.ironsource.Ve;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class FeaturesManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile FeaturesManager f30759d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30760e = "debugMode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, ?> f30761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f30762b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC3680r8 f30763c = Lb.U().t();

    public class a extends ArrayList<String> {
        public a() {
            add(C3426d4.d.f28467f);
            add(C3426d4.d.f28466e);
            add(C3426d4.d.f28468g);
            add(C3426d4.d.f28469h);
            add(C3426d4.d.f28470i);
            add(C3426d4.d.f28471j);
            add(C3426d4.d.f28472k);
            add(C3426d4.d.f28473l);
            add(C3426d4.d.f28474m);
        }
    }

    public static FeaturesManager getInstance() {
        if (f30759d == null) {
            synchronized (FeaturesManager.class) {
                if (f30759d == null) {
                    f30759d = new FeaturesManager();
                }
            }
        }
        return f30759d;
    }

    public ArrayList<String> a() {
        return new ArrayList<>(this.f30762b);
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f30761a.containsKey("debugMode")) {
                num = (Integer) this.f30761a.get("debugMode");
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public C3411c7 getFeatureFlagHealthCheck() {
        JSONObject jSONObjectA = this.f30763c.a(C3426d4.a.f28425r);
        return jSONObjectA instanceof JSONObject ? new C3411c7(jSONObjectA) : new C3411c7(null);
    }

    public boolean getStopUseOnResumeAndPause() {
        return Boolean.TRUE.equals(this.f30763c.c(C3426d4.a.f28428u));
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f30761a = map;
    }

    private FeaturesManager() {
        if (f30759d == null) {
            this.f30761a = new HashMap();
            return;
        }
        throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        if (networkConfiguration.has(C3426d4.a.f28411d)) {
            return networkConfiguration.optJSONObject(C3426d4.a.f28411d);
        }
        return IronSourceVideoBridge.jsonObjectInit();
    }

    public P3 getFeatureFlagCatchUrlError() {
        return new P3(SDKUtils.getNetworkConfiguration().optJSONObject(P3.a.f27324c));
    }

    public Q3 getFeatureFlagClickCheck() {
        return new Q3(SDKUtils.getNetworkConfiguration());
    }

    public boolean getFeatureFlagLoadControllerAndPlayerFromBundle() {
        return SDKUtils.getNetworkFeatureConfiguration().optBoolean(C3426d4.a.f28430w, false);
    }

    public int getInitRecoverTrials() {
        JSONObject jSONObjectOptJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject(C3426d4.a.f28413f);
        if (jSONObjectOptJSONObject == null) {
            return 0;
        }
        return jSONObjectOptJSONObject.optInt(C3426d4.a.f28412e, 0);
    }

    public Ve getSessionHistoryConfig() {
        JSONObject jSONObjectJsonObjectInit;
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        if (networkConfiguration.has(C3426d4.a.f28426s)) {
            jSONObjectJsonObjectInit = networkConfiguration.optJSONObject(C3426d4.a.f28426s);
        } else {
            jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        }
        return new Ve(jSONObjectJsonObjectInit);
    }
}
