package com.yk.e.view;

import android.app.Activity;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.util.AdLog;
import hl.i;

/* JADX INFO: loaded from: classes9.dex */
public class MainBannerAd {
    public final i IL1Iii;

    public boolean isExpired() {
        i iVar = this.IL1Iii;
        if (iVar != null) {
            return iVar.D();
        }
        AdLog.ad("banner广告实例为空，请先进行实例化！！！");
        return true;
    }

    public void loadAd() {
        i iVar = this.IL1Iii;
        if (iVar != null) {
            iVar.y();
        } else {
            AdLog.ad("banner广告实例为空，请先进行实例化！！！");
        }
    }

    public void setExpressWH(int i10, int i11) {
        i iVar = this.IL1Iii;
        if (iVar == null) {
            AdLog.ad("banner广告实例为空，请先进行实例化！！！");
        } else {
            iVar.G = i10;
            iVar.H = i11;
        }
    }

    public void setLoadTimeOut(int i10) {
        i iVar = this.IL1Iii;
        if (iVar != null) {
            iVar.f61557w = i10;
        } else {
            AdLog.ad("banner广告实例为空，请先进行实例化！！！");
        }
    }

    public MainBannerAd(Activity activity, String str, MainBannerCallBack mainBannerCallBack) {
        this.IL1Iii = new i(activity, str, mainBannerCallBack);
    }
}
