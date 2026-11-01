package com.yk.e;

import com.facebook.ads.AudienceNetworkAds;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;

/* JADX INFO: renamed from: com.yk.e.I丨iL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class IiL implements AudienceNetworkAds.InitListener {
    public final /* synthetic */ IComCallback IL1Iii;

    public IiL(IComCallback iComCallback) {
        this.IL1Iii = iComCallback;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
        AdLog.i("Facebook init: " + initResult.getMessage());
        IComCallback iComCallback = this.IL1Iii;
        if (iComCallback != null) {
            iComCallback.onSuccess();
        }
    }
}
