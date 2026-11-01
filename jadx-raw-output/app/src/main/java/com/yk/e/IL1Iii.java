package com.yk.e;

import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes10.dex */
public final class IL1Iii implements PAGSdk.PAGInitCallback {
    public final /* synthetic */ ILil IL1Iii;

    public IL1Iii(ILil iLil) {
        this.IL1Iii = iLil;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i10, String str) {
        AdLog.e("pangle init fail: " + i10 + ", " + str);
        PAGSdk.PAGInitCallback pAGInitCallback = this.IL1Iii.I1I;
        if (pAGInitCallback != null) {
            pAGInitCallback.fail(i10, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        AdLog.i("pangle init success");
        PAGSdk.PAGInitCallback pAGInitCallback = this.IL1Iii.I1I;
        if (pAGInitCallback != null) {
            pAGInitCallback.success();
        }
    }
}
