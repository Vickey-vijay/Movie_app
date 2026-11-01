package com.yk.e;

import com.mbridge.msdk.out.SDKInitStatusListener;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;

/* JADX INFO: renamed from: com.yk.e.iI丨LLL1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class iILLL1 implements SDKInitStatusListener {
    public final /* synthetic */ IComCallback IL1Iii;

    public iILLL1(IComCallback iComCallback) {
        this.IL1Iii = iComCallback;
    }

    @Override // com.mbridge.msdk.out.SDKInitStatusListener
    public final void onInitFail(String str) {
        AdLog.e("Mintegral SDK is initStatusInitFail, " + str);
        IComCallback iComCallback = this.IL1Iii;
        if (iComCallback != null) {
            iComCallback.onFailed(-1, str);
        }
    }

    @Override // com.mbridge.msdk.out.SDKInitStatusListener
    public final void onInitSuccess() {
        AdLog.i("Mintegral SDK is initialized");
        AbstractC4043il.I1I = true;
        IComCallback iComCallback = this.IL1Iii;
        if (iComCallback != null) {
            iComCallback.onSuccess();
        }
    }
}
