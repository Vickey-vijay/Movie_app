package com.yk.e.view;

import android.app.Activity;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.WorldNativeImgParams;
import com.yk.e.object.WorldNativeLyParams;
import com.yk.e.object.WorldNativeTagParams;
import com.yk.e.object.WorldNativeTvParams;
import com.yk.e.util.AdLog;
import hl.h;

/* JADX INFO: loaded from: classes9.dex */
public class MainWdNativeAdLoader {
    public final h IL1Iii;

    public boolean isExpired() {
        h hVar = this.IL1Iii;
        if (hVar != null) {
            return hVar.D();
        }
        AdLog.ad("文案信息流广告实例为空，请先进行实例化！！！");
        return true;
    }

    public void loadAd() {
        h hVar = this.IL1Iii;
        if (hVar != null) {
            hVar.y();
        } else {
            AdLog.ad("文案信息流广告实例为空，请先进行实例化！！！");
        }
    }

    public void setCenterLyParams(WorldNativeLyParams worldNativeLyParams) {
        h hVar = this.IL1Iii;
        if (hVar != null) {
            hVar.N = worldNativeLyParams;
        } else {
            AdLog.ad("文案信息流广告实例为空，请先进行实例化！！！");
        }
    }

    public void setContentLyParams(WorldNativeLyParams worldNativeLyParams) {
        h hVar = this.IL1Iii;
        if (hVar != null) {
            hVar.M = worldNativeLyParams;
        } else {
            AdLog.ad("文案信息流广告实例为空，请先进行实例化！！！");
        }
    }

    public void setDetailsParams(WorldNativeTvParams worldNativeTvParams) {
        h hVar = this.IL1Iii;
        if (hVar != null) {
            hVar.K = worldNativeTvParams;
        } else {
            AdLog.ad("文案信息流广告实例为空，请先进行实例化！！！");
        }
    }

    public void setExpressWH(int i10, int i11) {
        h hVar = this.IL1Iii;
        if (hVar == null) {
            AdLog.ad("文案信息流广告实例为空，请先进行实例化！！！");
        } else {
            hVar.G = i10;
            hVar.H = i11;
        }
    }

    public void setIconImageParams(WorldNativeImgParams worldNativeImgParams) {
        h hVar = this.IL1Iii;
        if (hVar != null) {
            hVar.L = worldNativeImgParams;
        } else {
            AdLog.ad("文案信息流广告实例为空，请先进行实例化！！！");
        }
    }

    public void setLoadTimeOut(int i10) {
        h hVar = this.IL1Iii;
        if (hVar != null) {
            hVar.f61557w = i10;
        } else {
            AdLog.ad("文案信息流广告实例为空，请先进行实例化！！！");
        }
    }

    public void setTagLyParams(WorldNativeLyParams worldNativeLyParams) {
        h hVar = this.IL1Iii;
        if (hVar != null) {
            hVar.O = worldNativeLyParams;
        } else {
            AdLog.ad("文案信息流广告实例为空，请先进行实例化！！！");
        }
    }

    public void setTagTvParams(WorldNativeTagParams worldNativeTagParams) {
        h hVar = this.IL1Iii;
        if (hVar != null) {
            hVar.P = worldNativeTagParams;
        } else {
            AdLog.ad("文案信息流广告实例为空，请先进行实例化！！！");
        }
    }

    public void setTitle2Params(WorldNativeTvParams worldNativeTvParams) {
        h hVar = this.IL1Iii;
        if (hVar != null) {
            hVar.J = worldNativeTvParams;
        } else {
            AdLog.ad("文案信息流广告实例为空，请先进行实例化！！！");
        }
    }

    public void setTitleParams(WorldNativeTvParams worldNativeTvParams) {
        h hVar = this.IL1Iii;
        if (hVar != null) {
            hVar.I = worldNativeTvParams;
        } else {
            AdLog.ad("文案信息流广告实例为空，请先进行实例化！！！");
        }
    }

    public MainWdNativeAdLoader(Activity activity, String str, MainWdNativeAdCallback mainWdNativeAdCallback) {
        this.IL1Iii = new h(activity, str, mainWdNativeAdCallback);
    }
}
