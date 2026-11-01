package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3668qc implements InterfaceC3651pc {
    @Override // com.ironsource.InterfaceC3651pc
    public void a(Mc mc2) {
        ck.p.j(mc2, "onNetworkSDKInitListener");
        IronSourceNetwork.addInitListener(mc2);
    }

    @Override // com.ironsource.InterfaceC3651pc
    public void a(Context context, String str, String str2, Map<String, String> map) {
        ck.p.j(context, "applicationContext");
        ck.p.j(str, C3426d4.j.f28592g);
        ck.p.j(str2, "userId");
        ck.p.j(map, "initParams");
        IronSourceNetwork.initSDK(context, str, str2, map);
    }

    @Override // com.ironsource.InterfaceC3651pc
    public void b(String str) {
        ck.p.j(str, "controllerUrl");
        SDKUtils.setControllerUrl(str);
    }

    @Override // com.ironsource.InterfaceC3651pc
    public void a(String str) {
        ck.p.j(str, "controllerConfig");
        SDKUtils.setControllerConfig(str);
    }

    @Override // com.ironsource.InterfaceC3651pc
    public void a(int i10) {
        SDKUtils.setDebugMode(i10);
    }
}
