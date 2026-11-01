package com.yk.e;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.yk.e.callBack.MainInitSdkCallback;
import com.yk.e.callBack.MainPreloadAdCallback;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.pl.OktAndroidMediaPlayerFactory;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.LocalSaveUtil;
import com.yk.e.util.UsLocalSaveHelper;
import com.yk.e.util.XLogHandler;
import gl.a1;
import gl.b1;
import gl.l;
import gl.r0;
import gl.s;
import gl.s0;
import gl.u1;
import gl.x1;
import i.d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import m7.r;
import org.json.JSONObject;
import zo.e;
import zo.f;

/* JADX INFO: loaded from: classes3.dex */
public class MainSDK {
    public static MainSDK wxSDK;
    public a1 IL1Iii;
    public String appID = "";
    public String appKey = "";

    public void statAd(d dVar) {
        this.IL1Iii.h(dVar, null);
    }

    public static MainSDK getInstance() {
        synchronized (MainSDK.class) {
            if (wxSDK == null) {
                MainSDK mainSDK = new MainSDK();
                wxSDK = mainSDK;
                mainSDK.IL1Iii = a1.a();
            }
        }
        return wxSDK;
    }

    public void initAdCache(Activity activity) {
        a.d dVarC = a.d.c();
        dVarC.getClass();
        try {
            if (activity == null) {
                AdLog.i("AdCacheRefreshUtils", "initAdCache, activity is null");
                AdLog.ad("initAdCache, activity is null");
            } else {
                dVarC.f3402b = new WeakReference(activity);
                String strD = r0.d(activity);
                JSONObject jSONObjectG = a.d.g(activity, strD);
                if (jSONObjectG != null) {
                    AdLog.i("AdCacheRefreshUtils", "read preset config file from local");
                    dVarC.l(strD, jSONObjectG);
                    if ("admob".equals(dVarC.f3404d)) {
                        AdLog.i("AdCacheRefreshUtils", "fsPlatform = " + dVarC.f3404d);
                        AbstractC4043il.IL1Iii(activity.getApplicationContext(), null);
                    }
                } else {
                    AdLog.i("AdCacheRefreshUtils", "local preset config file is doesn't exist");
                }
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public void initSdk(Context context, MainInitSdkCallback mainInitSdkCallback) {
        if (context.getPackageName().equals(CoreUtils.getCurProcessName(context))) {
            XLogHandler.getInstance().init(context, "okt_sdk", Constant.PATH_LOG);
            r.g((Application) context);
            f.d(e.a().k(OktAndroidMediaPlayerFactory.create()).j());
            com.yk.e.util.IL1Iii.IL1Iii().IL1Iii(context);
            l lVarA = l.a();
            lVarA.getClass();
            AdLog.i("BdUtils", C3426d4.a.f28413f);
            lVarA.f53531a.put("max_mediation_debug", "1111");
            lVarA.f53531a.put("max_user_geography", "1111");
            if (!new File(l.b(context)).exists()) {
                HashMap map = lVarA.f53531a;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        sb2.append((String) ((Map.Entry) it.next()).getKey());
                        sb2.append("\n");
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    x1.a(sb2.toString(), l.b(context), Constant.fileBdConfig);
                    AdLog.i("BdUtils", "createDbFile");
                } catch (Exception e10) {
                    AdLog.e(e10.getMessage(), e10);
                }
            } else if (lVarA.f53532b == null) {
                try {
                    lVarA.f53532b = l.d(new File(l.b(context), Constant.fileBdConfig).toString());
                    AdLog.i("BdUtils", "readDbConfig");
                } catch (Exception e11) {
                    AdLog.e(e11.getMessage(), e11);
                }
            }
            this.appID = r0.d(context);
            this.appKey = r0.e(context, "OKT_SDK_APP_KEY");
            if (TextUtils.isEmpty(this.appID)) {
                throw new RuntimeException("appid must not be empty !!");
            }
            if (TextUtils.isEmpty(this.appKey)) {
                throw new RuntimeException("appKey must not be empty !!");
            }
            a1 a1Var = this.IL1Iii;
            if (a1Var.f53442a) {
                AdLog.ad("okt sdk is initialized");
                if (mainInitSdkCallback != null) {
                    mainInitSdkCallback.onInitSuccess();
                    return;
                }
                return;
            }
            a1Var.f53449h = context;
            try {
                Constant.sdkVersion = r0.e(context, "OKT_SDK_VERSION").replaceAll("[a-zA-Z]", "");
                Constant.commonApi = r0.e(context, "OKT_SDK_API");
                Constant.apiVersion = r0.e(context, "OKT_SDK_API_VERSION");
                Constant.setAddress();
                String string = LocalSaveUtil.getString(context, b1.a(context).f53459f, "");
                if (!TextUtils.isEmpty(string) && !string.equals(Constant.commonApi)) {
                    Constant.commonApi = string;
                    Constant.setAddress();
                }
                u1.d(context, new s(a1Var, context, mainInitSdkCallback));
            } catch (Exception e12) {
                AdLog.e(e12.getMessage(), e12);
                if (mainInitSdkCallback != null) {
                    mainInitSdkCallback.onInitFailed(AdSdkStateCode.INIT_FAILED, "init fail, msg = " + e12.getMessage());
                }
            }
        }
    }

    public void reqBannerAd(Context context, int i10, String str, String str2, s0 s0Var) {
        a1 a1Var = this.IL1Iii;
        a1Var.getClass();
        a1Var.d(context, i10, str, str2, 1, Constant.ReqBannerAdPath, s0Var);
    }

    public void reqFloatViewAd(Context context, int i10, String str, String str2, s0 s0Var) {
        a1 a1Var = this.IL1Iii;
        a1Var.getClass();
        a1Var.d(context, i10, str, str2, 1, Constant.ReqFloatViewAdPath, s0Var);
    }

    public void reqInternalAd(Context context, int i10, String str, String str2, s0 s0Var) {
        a1 a1Var = this.IL1Iii;
        a1Var.getClass();
        a1Var.d(context, i10, str, str2, 1, Constant.ReqInternalAdPath, s0Var);
    }

    public void reqInterstitialAd(Context context, int i10, String str, String str2, s0 s0Var) {
        a1 a1Var = this.IL1Iii;
        a1Var.getClass();
        a1Var.d(context, i10, str, str2, 1, Constant.ReqInterstitialAdPath, s0Var);
    }

    public void reqMrec(Context context, int i10, String str, String str2, s0 s0Var) {
        a1 a1Var = this.IL1Iii;
        a1Var.getClass();
        a1Var.d(context, i10, str, str2, 1, Constant.ReqMRECPath, s0Var);
    }

    public void reqNaturalAd(Context context, int i10, String str, String str2, s0 s0Var) {
        a1 a1Var = this.IL1Iii;
        a1Var.getClass();
        a1Var.d(context, i10, str, str2, 1, Constant.ReqNaturalAdPath, s0Var);
    }

    public void reqPauseInterstitialAd(Context context, int i10, String str, String str2, s0 s0Var) {
        a1 a1Var = this.IL1Iii;
        a1Var.getClass();
        a1Var.d(context, i10, str, str2, 1, Constant.ReqPauseIntersAdPath, s0Var);
    }

    public void reqRewardVideoAd(Context context, int i10, String str, String str2, int i11, s0 s0Var) {
        a1 a1Var = this.IL1Iii;
        a1Var.getClass();
        a1Var.d(context, i10, str, str2, i11, Constant.ReqRewardAdPath, s0Var);
    }

    public void reqSplashAd(Context context, int i10, String str, String str2, int i11, s0 s0Var) {
        a1 a1Var = this.IL1Iii;
        a1Var.getClass();
        a1Var.d(context, i10, str, str2, i11, Constant.ReqSplashAdPath, s0Var);
    }

    public void reqThirdBanner(Context context, int i10, String str, String str2, s0 s0Var) {
        a1 a1Var = this.IL1Iii;
        a1Var.getClass();
        a1Var.d(context, i10, str, str2, 1, Constant.ReqThirdBannerPath, s0Var);
    }

    public void reqWorldNativeAd(Context context, int i10, String str, String str2, s0 s0Var) {
        a1 a1Var = this.IL1Iii;
        a1Var.getClass();
        a1Var.d(context, i10, str, str2, 1, Constant.ReqInFeedAdPath, s0Var);
    }

    public void setDebugFlag(boolean z10) {
        Constant.debugFlag = z10;
    }

    public String getDeviceID() {
        return UsLocalSaveHelper.getInstance().getDeviceID();
    }

    public void preloadBannerAd(MainPreloadAdCallback mainPreloadAdCallback) {
        a.d.c().h(18, mainPreloadAdCallback);
        AdLog.i("AdCacheRefreshUtils", "preloadBannerAd");
    }

    public void preloadInterstitialAd(MainPreloadAdCallback mainPreloadAdCallback) {
        a.d.c().h(16, mainPreloadAdCallback);
        AdLog.i("AdCacheRefreshUtils", "preloadInterstitialAd");
    }

    public void preloadNativeAd(MainPreloadAdCallback mainPreloadAdCallback) {
        a.d.c().h(11, mainPreloadAdCallback);
        AdLog.i("AdCacheRefreshUtils", "preloadNativeAd");
    }

    public void preloadRewardAd(MainPreloadAdCallback mainPreloadAdCallback) {
        a.d.c().h(14, mainPreloadAdCallback);
        AdLog.i("AdCacheRefreshUtils", "preloadRewardAd");
    }

    public void statAd(d dVar, s0 s0Var) {
        this.IL1Iii.h(dVar, s0Var);
    }
}
