package com.yk.e.view;

import android.app.Activity;
import com.yk.e.callBack.MainThirdBannerCallBack;
import com.yk.e.util.AdLog;
import hl.z;

/* JADX INFO: loaded from: classes2.dex */
public class MainThirdBannerAd {
    public final z IL1Iii;

    public boolean isExpired() {
        z zVar = this.IL1Iii;
        if (zVar != null) {
            return zVar.D();
        }
        AdLog.ad("thirdBanner广告实例为空，请先进行实例化！！！");
        return true;
    }

    public void loadAd() {
        z zVar = this.IL1Iii;
        if (zVar != null) {
            zVar.y();
        } else {
            AdLog.ad("thirdBanner广告实例为空，请先进行实例化！！！");
        }
    }

    public void setExpressWH(int i10, int i11) {
        z zVar = this.IL1Iii;
        if (zVar == null) {
            AdLog.ad("thirdBanner广告实例为空，请先进行实例化！！！");
        } else {
            zVar.G = i10;
            zVar.H = i11;
        }
    }

    public void setLoadTimeOut(int i10) {
        z zVar = this.IL1Iii;
        if (zVar != null) {
            zVar.f61557w = i10;
        } else {
            AdLog.ad("thirdBanner广告实例为空，请先进行实例化！！！");
        }
    }

    public MainThirdBannerAd(Activity activity, String str, MainThirdBannerCallBack mainThirdBannerCallBack) {
        this.IL1Iii = new z(activity, str, mainThirdBannerCallBack);
    }
}
