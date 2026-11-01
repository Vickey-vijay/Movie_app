package com.mbridge.msdk.out;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BannerAdWithCodeListener implements BannerAdListener {
    public abstract void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i10, String str);

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLoadFailed(MBridgeIds mBridgeIds, String str) {
        onLoadFailedWithCode(mBridgeIds, com.mbridge.msdk.util.a.a(2000, str), str);
    }
}
