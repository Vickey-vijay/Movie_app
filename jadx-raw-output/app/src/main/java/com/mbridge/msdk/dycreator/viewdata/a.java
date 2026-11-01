package com.mbridge.msdk.dycreator.viewdata;

import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: MBRewardData.java */
/* JADX INFO: loaded from: classes.dex */
public class a implements com.mbridge.msdk.dycreator.viewdata.base.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DyOption f34461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f34462b;

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public CampaignEx getBindData() {
        return this.f34462b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public DyOption getEffectData() {
        return this.f34461a;
    }

    public a(DyOption dyOption) {
        this.f34461a = dyOption;
        this.f34462b = dyOption.getCampaignEx();
    }
}
