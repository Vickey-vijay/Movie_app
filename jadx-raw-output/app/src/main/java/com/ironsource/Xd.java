package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;

/* JADX INFO: loaded from: classes4.dex */
public class Xd extends C3642p3<V0> implements RewardedVideoAdListener {
    public Xd(InterfaceC3652pd interfaceC3652pd, C3583m0 c3583m0, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C3605n2 c3605n2, V0 v10) {
        super(interfaceC3652pd, c3583m0, baseAdAdapter, new C3405c1(c3583m0.g(), c3583m0.g().getRewardedVideoSettings(), IronSource.a.REWARDED_VIDEO), c3605n2, v10);
    }
}
