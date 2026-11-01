package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class C9 extends AbstractC3568l3<E9, AdapterAdInteractionListener> {
    public C9(List<NetworkSettings> list, H9 h10, String str, C3649pa c3649pa, C3450ea c3450ea) {
        super(new D9(str, list, h10), c3649pa, c3450ea);
    }

    @Override // com.ironsource.AbstractC3606n3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public E9 a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, int i10, String str, C3605n2 c3605n2) {
        return new E9(this, new C3583m0(IronSource.a.INTERSTITIAL, this.f30249o.o(), i10, this.f30241g, str, this.f30239e, this.f30240f, networkSettings, this.f30249o.n()), baseAdAdapter, c3605n2, this);
    }

    @Override // com.ironsource.AbstractC3606n3
    public String l() {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    @Override // com.ironsource.AbstractC3606n3
    public String o() {
        return IronSourceConstants.OPW_IS_MANAGER_NAME;
    }

    public C9(L7 l10, K7 k10, List<NetworkSettings> list, H9 h10, String str, C3649pa c3649pa, C3450ea c3450ea) {
        super(l10, k10, new D9(str, list, h10), c3649pa, c3450ea);
    }

    @Override // com.ironsource.AbstractC3606n3
    public L0 g() {
        return new L9();
    }

    @Override // com.ironsource.AbstractC3606n3
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getInterstitialSettings();
    }
}
