package com.mbridge.msdk.newinterstitial.out;

import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.util.a;

/* JADX INFO: loaded from: classes6.dex */
public abstract class NewInterstitialWithCodeListener implements NewInterstitialListener {
    public abstract void onResourceLoadFailWithCode(MBridgeIds mBridgeIds, int i10, String str);

    public abstract void onShowFailWithCode(MBridgeIds mBridgeIds, int i10, String str);

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onResourceLoadFail(MBridgeIds mBridgeIds, String str) {
        onResourceLoadFailWithCode(mBridgeIds, a.a(3000, str), str);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        onShowFailWithCode(mBridgeIds, a.b(3000, str), str);
    }
}
