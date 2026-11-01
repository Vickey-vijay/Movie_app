package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3390b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f28214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B7 f28215b = Lb.f26968s.d().i();

    public final Boolean a() {
        return this.f28214a;
    }

    public final void a(boolean z10) {
        this.f28214a = Boolean.valueOf(z10);
    }

    public final B7 b() {
        return this.f28215b;
    }

    public final void a(ConcurrentHashMap<String, AbstractAdapter> concurrentHashMap, ConcurrentHashMap<String, AdapterBaseWrapper> concurrentHashMap2) {
        mj.r rVar;
        ck.p.j(concurrentHashMap, "adapters");
        ck.p.j(concurrentHashMap2, "networkAdapters");
        for (AbstractAdapter abstractAdapter : concurrentHashMap.values()) {
            ck.p.i(abstractAdapter, Q6.G1);
            a(abstractAdapter, (NetworkSettings) null);
        }
        for (AdapterBaseWrapper adapterBaseWrapper : concurrentHashMap2.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (adapterBaseInterface != null) {
                a(adapterBaseInterface, adapterBaseWrapper.getSettings());
                rVar = mj.r.f64562a;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                IronLog.INTERNAL.error("adapter is null");
            }
        }
    }

    public final void a(AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        ck.p.j(adapterBaseInterface, Q6.G1);
        try {
            Boolean boolA = a(networkSettings);
            if (boolA == null || !(adapterBaseInterface instanceof AdapterConsentInterface)) {
                return;
            }
            ((AdapterConsentInterface) adapterBaseInterface).setConsent(boolA.booleanValue());
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            String providerName = networkSettings != null ? networkSettings.getProviderName() : null;
            String str = "error while setting consent of " + providerName + ": " + th2.getLocalizedMessage();
            a(str);
            IronLog.INTERNAL.error(str);
        }
    }

    public final void a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings) {
        ck.p.j(abstractAdapter, Q6.G1);
        try {
            Boolean boolA = a(networkSettings);
            if (boolA != null) {
                abstractAdapter.setNewConsent(boolA.booleanValue());
            }
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            String str = "error while setting consent of " + abstractAdapter.getProviderName() + ": " + th2.getLocalizedMessage();
            a(str);
            IronLog.INTERNAL.error(str);
        }
    }

    private final Boolean a(NetworkSettings networkSettings) {
        if (networkSettings != null && !networkSettings.isCustomNetwork()) {
            if (networkSettings.getApplicationSettings().has(C3408c4.f28315a)) {
                return Boolean.valueOf(networkSettings.getApplicationSettings().optBoolean(C3408c4.f28315a));
            }
            return this.f28214a;
        }
        return this.f28214a;
    }

    private final void a(String str) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            if (!TextUtils.isEmpty(str)) {
                jSONObjectJsonObjectInit.put("reason", str);
            }
            J9.i().a(new C5(D5.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jSONObjectJsonObjectInit));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public final void a(int i10) {
        JSONObject jSONObjectB = IronSourceUtils.b(false);
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, i10 + ";" + this.f28215b.F(ContextProvider.getInstance().getApplicationContext()));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(mj.d.b(e10));
        }
        Lb.f26968s.d().q().a(new C5(D5.CONSENT_TCF_CODE, jSONObjectB));
    }

    public final void a(int i10, ConcurrentHashMap<String, NetworkSettings> concurrentHashMap) {
        JSONObject applicationSettings;
        ck.p.j(concurrentHashMap, "providerSettings");
        String strF = this.f28215b.F(ContextProvider.getInstance().getApplicationContext());
        IronLog ironLog = IronLog.API;
        ironLog.general("TCF Additional Consent: " + strF);
        ironLog.general("CMP ID: " + i10);
        ironLog.general("Network Consent Reporting:");
        ironLog.general("----------------------------");
        Collection<NetworkSettings> collectionValues = concurrentHashMap.values();
        ck.p.i(collectionValues, "providerSettings.values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (networkSettings.getProviderDefaultInstance() != null && !ck.p.e(networkSettings.getProviderDefaultInstance(), IronSourceConstants.SUPERSONIC_CONFIG_NAME) && (applicationSettings = networkSettings.getApplicationSettings()) != null && applicationSettings.has(C3408c4.f28315a)) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<NetworkSettings> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((NetworkSettings) obj2).getProviderDefaultInstance())) {
                arrayList2.add(obj2);
            }
        }
        for (NetworkSettings networkSettings2 : arrayList2) {
            IronLog ironLog2 = IronLog.API;
            String providerDefaultInstance = networkSettings2.getProviderDefaultInstance();
            JSONObject applicationSettings2 = networkSettings2.getApplicationSettings();
            ironLog2.general(providerDefaultInstance + ": " + (applicationSettings2 != null ? Boolean.valueOf(applicationSettings2.optBoolean(C3408c4.f28315a)) : null));
        }
    }
}
