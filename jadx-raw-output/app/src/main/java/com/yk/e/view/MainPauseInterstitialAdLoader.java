package com.yk.e.view;

import android.app.Activity;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.util.AdLog;
import dp.u;
import hl.b;
import j.d;
import j.y1;

/* JADX INFO: loaded from: classes2.dex */
public class MainPauseInterstitialAdLoader {
    public final b IL1Iii;

    public void destroyView() {
        b bVar = this.IL1Iii;
        if (bVar == null) {
            AdLog.ad("暂停插屏广告实例为空，请先进行实例化！！！");
            return;
        }
        try {
            y1 y1Var = bVar.f61559y;
            if (y1Var != null) {
                u uVar = ((d) y1Var).f61464b;
                if (uVar != null) {
                    uVar.C();
                }
            } else {
                AdLog.ad("destroyView, adLoader is null");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public boolean isExpired() {
        b bVar = this.IL1Iii;
        if (bVar != null) {
            return bVar.D();
        }
        AdLog.ad("暂停插屏广告实例为空，请先进行实例化！！！");
        return true;
    }

    public void loadAd() {
        b bVar = this.IL1Iii;
        if (bVar != null) {
            bVar.y();
        } else {
            AdLog.ad("暂停插屏广告实例为空，请先进行实例化！！！");
        }
    }

    public void setExpressWH(int i10, int i11) {
        b bVar = this.IL1Iii;
        if (bVar == null) {
            AdLog.ad("暂停插屏广告实例为空，请先进行实例化！！！");
        } else {
            bVar.G = i10;
            bVar.H = i11;
        }
    }

    public void setLoadTimeOut(int i10) {
        b bVar = this.IL1Iii;
        if (bVar != null) {
            bVar.f61557w = i10;
        } else {
            AdLog.ad("暂停插屏广告实例为空，请先进行实例化！！！");
        }
    }

    public void setRelease(boolean z10) {
        b bVar = this.IL1Iii;
        if (bVar != null) {
            bVar.I = z10;
        } else {
            AdLog.ad("暂停插屏广告实例为空，请先进行实例化！！！");
        }
    }

    public void setVideoHasVoice(boolean z10) {
        b bVar = this.IL1Iii;
        if (bVar != null) {
            bVar.J = z10;
        } else {
            AdLog.ad("暂停插屏广告实例为空，请先进行实例化！！！");
        }
    }

    public MainPauseInterstitialAdLoader(Activity activity, String str, MainMaterialCallback mainMaterialCallback) {
        this.IL1Iii = new b(activity, str, mainMaterialCallback);
    }
}
