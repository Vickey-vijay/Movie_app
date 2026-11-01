package com.yk.e;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;

/* JADX INFO: loaded from: classes7.dex */
public final class ILil implements Runnable {
    public final /* synthetic */ PAGSdk.PAGInitCallback I1I;
    public final /* synthetic */ String IL1Iii;
    public final /* synthetic */ Context ILil;

    public ILil(Context context, PAGSdk.PAGInitCallback pAGInitCallback, String str) {
        this.IL1Iii = str;
        this.ILil = context;
        this.I1I = pAGInitCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PAGConfig.Builder builderAppId = new PAGConfig.Builder().appId(this.IL1Iii);
        Context context = this.ILil;
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).icon;
        } catch (PackageManager.NameNotFoundException e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        PAGSdk.init(this.ILil, builderAppId.appIcon(i10).debugLog(Constant.debugFlag).build(), new IL1Iii(this));
    }
}
