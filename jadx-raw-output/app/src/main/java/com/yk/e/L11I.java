package com.yk.e;

import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import sg.bigo.ads.BigoAdSdk;

/* JADX INFO: renamed from: com.yk.e.L丨1丨1丨I, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class L11I implements BigoAdSdk.InitListener {
    public final /* synthetic */ IComCallback IL1Iii;

    public L11I(IComCallback iComCallback) {
        this.IL1Iii = iComCallback;
    }

    @Override // sg.bigo.ads.BigoAdSdk.InitListener
    public final void onInitialized() {
        AdLog.i("Bigo initialized");
        AbstractC4043il.f3370IL = true;
        IComCallback iComCallback = this.IL1Iii;
        if (iComCallback != null) {
            iComCallback.onSuccess();
        }
    }
}
