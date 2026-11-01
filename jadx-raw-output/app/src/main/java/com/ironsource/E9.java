package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;

/* JADX INFO: loaded from: classes7.dex */
public class E9 extends AbstractC3586m3<J0> implements InterstitialAdListener {
    public E9(InterfaceC3652pd interfaceC3652pd, C3583m0 c3583m0, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, C3605n2 c3605n2, J0 j10) {
        super(interfaceC3652pd, c3583m0, baseAdAdapter, new C3405c1(c3583m0.g(), c3583m0.g().getInterstitialSettings(), IronSource.a.INTERSTITIAL), c3605n2, j10);
    }
}
