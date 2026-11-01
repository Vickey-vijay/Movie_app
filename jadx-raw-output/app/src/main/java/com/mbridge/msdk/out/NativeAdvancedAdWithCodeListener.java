package com.mbridge.msdk.out;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NativeAdvancedAdWithCodeListener implements NativeAdvancedAdListener {
    public abstract void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i10, String str);

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public void onLoadFailed(MBridgeIds mBridgeIds, String str) {
        onLoadFailedWithCode(mBridgeIds, com.mbridge.msdk.util.a.a(6000, str), str);
    }
}
