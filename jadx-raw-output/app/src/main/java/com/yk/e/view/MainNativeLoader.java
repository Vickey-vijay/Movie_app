package com.yk.e.view;

import android.app.Activity;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.util.AdLog;
import hl.b0;

/* JADX INFO: loaded from: classes10.dex */
public class MainNativeLoader {
    public final b0 IL1Iii;

    public boolean isExpired() {
        b0 b0Var = this.IL1Iii;
        if (b0Var != null) {
            return b0Var.D();
        }
        AdLog.ad("原生广告实例为空，请先进行实例化！！！");
        return true;
    }

    public void loadAd() {
        b0 b0Var = this.IL1Iii;
        if (b0Var != null) {
            b0Var.y();
        } else {
            AdLog.ad("原生广告实例为空，请先进行实例化！！！");
        }
    }

    public void setExpressWH(int i10, int i11) {
        b0 b0Var = this.IL1Iii;
        if (b0Var == null) {
            AdLog.ad("原生广告实例为空，请先进行实例化！！！");
        } else {
            b0Var.G = i10;
            b0Var.H = i11;
        }
    }

    public void setLoadTimeOut(int i10) {
        b0 b0Var = this.IL1Iii;
        if (b0Var != null) {
            b0Var.f61557w = i10;
        } else {
            AdLog.ad("原生广告实例为空，请先进行实例化！！！");
        }
    }

    public MainNativeLoader(Activity activity, String str, MainNativeAdCallBack mainNativeAdCallBack) {
        this.IL1Iii = new b0(activity, str, mainNativeAdCallBack);
    }
}
