package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class C implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f26068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f26069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BaseAdAdapter<?, ?> f26070c;

    public C(W0 w10, B b10, BaseAdAdapter<?, ?> baseAdAdapter) {
        ck.p.j(w10, "adTools");
        ck.p.j(b10, "instanceData");
        this.f26068a = w10;
        this.f26069b = b10;
        this.f26070c = baseAdAdapter;
    }

    @Override // com.ironsource.D0
    public Map<String, Object> a(B0 b10) {
        String adapterVersion;
        ck.p.j(b10, "event");
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, ?> baseAdAdapter = this.f26070c;
            String networkSDKVersion = "";
            if (baseAdAdapter != null) {
                AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
                ck.p.g(networkAdapter);
                adapterVersion = networkAdapter.getAdapterVersion();
            } else {
                adapterVersion = "";
            }
            ck.p.i(adapterVersion, "if (adapter != null) ada…!!.adapterVersion else \"\"");
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterVersion);
            BaseAdAdapter<?, ?> baseAdAdapter2 = this.f26070c;
            if (baseAdAdapter2 != null) {
                AdapterBaseInterface networkAdapter2 = baseAdAdapter2.getNetworkAdapter();
                ck.p.g(networkAdapter2);
                networkSDKVersion = networkAdapter2.getNetworkSDKVersion();
            }
            ck.p.g(networkSDKVersion);
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, networkSDKVersion);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(C3621o0.a(this.f26068a, "could not get adapter version for event data " + this.f26069b.w(), (String) null, 2, (Object) null));
        }
        String strI = this.f26069b.j().i();
        ck.p.i(strI, "instanceData.adapterConfig.subProviderId");
        map.put("spId", strI);
        String strA = this.f26069b.j().a();
        ck.p.i(strA, "instanceData.adapterConfig.adSourceNameForEvents");
        map.put(IronSourceConstants.EVENTS_PROVIDER, strA);
        map.put("instanceType", Integer.valueOf(this.f26069b.s()));
        String strK = this.f26069b.n().k();
        W0 w10 = this.f26068a;
        ck.p.i(strK, C3605n2.f30213s);
        String strE = w10.e(strK);
        if (!TextUtils.isEmpty(strE)) {
            map.put("dynamicDemandSource", strE);
        }
        map.put("sessionDepth", Integer.valueOf(this.f26069b.v()));
        if (!TextUtils.isEmpty(this.f26069b.u().getCustomNetwork())) {
            String customNetwork = this.f26069b.u().getCustomNetwork();
            ck.p.i(customNetwork, "instanceData.providerSettings.customNetwork");
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, customNetwork);
        }
        return map;
    }
}
