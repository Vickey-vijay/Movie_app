package com.ironsource;

import android.webkit.JavascriptInterface;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: renamed from: com.ironsource.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3591m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3647p8 f29495a;

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/m8;->receiveMessageFromExternal(Ljava/lang/String;)V");
        CreativeInfoManager.onReceiveMessageFromExternal(com.safedk.android.utils.g.f44960f, this, str);
        safedk_m8_receiveMessageFromExternal_f6df2e67e8e3a157bd953b642618ebc9(str);
    }

    @JavascriptInterface
    public void safedk_m8_receiveMessageFromExternal_f6df2e67e8e3a157bd953b642618ebc9(String p10) {
        this.f29495a.handleMessageFromAd(p10);
    }

    public C3591m8(C3647p8 c3647p8) {
        this.f29495a = c3647p8;
    }
}
