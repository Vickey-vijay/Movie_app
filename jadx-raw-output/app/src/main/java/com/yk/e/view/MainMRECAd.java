package com.yk.e.view;

import android.app.Activity;
import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.util.AdLog;
import hl.w;

/* JADX INFO: loaded from: classes11.dex */
public class MainMRECAd {
    public final w IL1Iii;

    public boolean isExpired() {
        w wVar = this.IL1Iii;
        if (wVar != null) {
            return wVar.D();
        }
        AdLog.ad("MREC广告实例为空，请先进行实例化！！！");
        return true;
    }

    public void loadAd() {
        w wVar = this.IL1Iii;
        if (wVar != null) {
            wVar.y();
        } else {
            AdLog.ad("MREC广告实例为空，请先进行实例化！！！");
        }
    }

    public void setExpressWH(int i10, int i11) {
        w wVar = this.IL1Iii;
        if (wVar == null) {
            AdLog.ad("MREC广告实例为空，请先进行实例化！！！");
        } else {
            wVar.G = i10;
            wVar.H = i11;
        }
    }

    public void setLoadTimeOut(int i10) {
        w wVar = this.IL1Iii;
        if (wVar != null) {
            wVar.f61557w = i10;
        } else {
            AdLog.ad("MREC广告实例为空，请先进行实例化！！！");
        }
    }

    public MainMRECAd(Activity activity, String str, MainMRECCallBack mainMRECCallBack) {
        this.IL1Iii = new w(activity, str, mainMRECCallBack);
    }
}
