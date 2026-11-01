package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class Wd extends AbstractC3624o3<Xd> {
    @Override // com.ironsource.AbstractC3606n3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Xd a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, int i10, String str, C3605n2 c3605n2) {
        return new Xd(this, new C3583m0(IronSource.a.REWARDED_VIDEO, this.f30249o.o(), i10, this.f30241g, str, this.f30239e, this.f30240f, networkSettings, this.f30249o.n()), baseAdAdapter, c3605n2, this);
    }

    @Override // com.ironsource.AbstractC3606n3
    public String l() {
        return IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    @Override // com.ironsource.AbstractC3606n3
    public String o() {
        return IronSourceConstants.OPW_RV_MANAGER_NAME;
    }

    public Wd(List<NetworkSettings> list, Zd zd2, String str, boolean z10, C3649pa c3649pa, C3450ea c3450ea) {
        super(new Ud(str, list, zd2, z10), c3649pa, c3450ea);
    }

    @Override // com.ironsource.AbstractC3606n3
    public LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.AbstractC3606n3
    public L0 g() {
        return new C3418ce();
    }

    @Override // com.ironsource.AbstractC3606n3
    public boolean q() {
        return this.f30249o.h().a() == O0.a.MANUAL;
    }

    @Override // com.ironsource.AbstractC3606n3
    public boolean t() {
        return this.f30249o.h().a() == O0.a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    @Override // com.ironsource.AbstractC3606n3
    public void a(IronSourceError ironSourceError) {
        O0.a aVarA = this.f30249o.h().a();
        if (aVarA != O0.a.AUTOMATIC_LOAD_AFTER_CLOSE && aVarA != O0.a.AUTOMATIC_LOAD_WHILE_SHOW) {
            super.a(ironSourceError);
        } else {
            this.f30254t.a(false, (AdInfo) null);
        }
    }

    @Override // com.ironsource.AbstractC3606n3
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getRewardedVideoSettings();
    }
}
