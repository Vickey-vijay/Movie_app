package com.mbridge.msdk.out;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeAdWithCodeListener implements NativeListener.NativeAdListener {
    public abstract void onAdLoadErrorWithCode(int i10, String str);

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        onAdLoadErrorWithCode(com.mbridge.msdk.util.a.a(1000, str), str);
    }
}
