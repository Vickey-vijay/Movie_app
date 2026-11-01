package j;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.MaxAd;
import com.yk.e.callBack.MainAdCallBack;
import com.yk.e.object.AdInfo;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.object.MainParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.IDUtil;
import com.yk.e.util.LogUtil;
import com.yk.e.util.UsLocalSaveHelper;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f61581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f61582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f61583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f61584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f61585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f61586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f61587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f61588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MainParams f61589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i.e f61590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public JSONObject f61591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f61592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f61593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f61594o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f61595p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f61596q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Activity f61597r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f61600u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MainAdCallBack f61602w;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f61598s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f61599t = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f61601v = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f61603x = 90000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public double f61604y = 0.0d;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f61605z = "";
    public final z0 A = new z0(this, Looper.getMainLooper());

    public boolean t() {
        return false;
    }

    public void z() {
    }

    public static String d(Object obj) {
        String str = "";
        if (obj == null) {
            return "";
        }
        try {
            if (obj instanceof MaxAd) {
                str = ((MaxAd) obj).getNetworkName() + ", " + ((MaxAd) obj).getNetworkPlacement();
            }
            return obj instanceof AdInfo ? ((AdInfo) obj).getNetworkName() : str;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            return "";
        }
    }

    public final void A() {
        AdLog.d("BaseMainAd", "onLoadDataFinish");
        this.A.sendEmptyMessage(0);
    }

    public final void a(String str) {
        j(AdSdkStateCode.MAIN_RENDER_FAILED, e("main_ad_render_fail") + ", " + str);
    }

    public boolean b() {
        return this instanceof f.z;
    }

    public final String c() {
        return TextUtils.isEmpty(this.f61605z) ? this.f61587h : this.f61605z;
    }

    public final String e(String str) {
        return "platform:" + this.f61587h + ", msg:" + IDUtil.getString(this.f61597r, str);
    }

    public final void f(double d10) {
        AdLog.i("BaseMainAd", "setRevenue " + this.f61588i + ", platform = " + this.f61587h + ", revenue = " + d10);
        this.f61604y = d10;
    }

    public final void g(int i10) {
        this.f61584e = new Date().getTime();
        AdLog.subAd(this.f61588i + " platform = " + this.f61587h + ", " + (i10 == 1 ? "成功" : "失败") + "：加载sdk内容耗时 = " + this.f61593n + "ms");
    }

    public final void h(int i10, AdInfo adInfo, boolean z10, long j10, long j11, y0 y0Var) {
        if (this.f61594o.contains(Integer.valueOf(i10))) {
            return;
        }
        this.f61594o.add(Integer.valueOf(i10));
        i.d dVar = new i.d();
        dVar.f54020a = this.f61585f;
        dVar.f54024e = this.f61587h;
        dVar.f54023d = this.f61582c;
        dVar.f54021b = this.f61586g;
        dVar.f54022c = this.f61581b;
        dVar.f54025f = i10;
        dVar.f54026g = this.f61595p;
        dVar.f54027h = this.f61596q;
        dVar.f54028i = this.f61592m;
        dVar.f54029j = this.f61589j.materialId;
        dVar.f54034o = adInfo.getRevenue();
        dVar.f54033n = adInfo.getRevenuePrecision();
        dVar.f54035p = adInfo.getNetworkName();
        dVar.f54030k = z10 ? 1 : 0;
        dVar.f54031l = j10;
        dVar.f54032m = j11;
        gl.a1.a().h(dVar, new m(y0Var));
    }

    public final void i(int i10, y0 y0Var) {
        h(i10, new AdInfo(), false, 0L, 0L, y0Var);
    }

    public final void j(int i10, String str) {
        MainAdCallBack mainAdCallBack = this.f61602w;
        if (mainAdCallBack == null) {
            AdLog.e("onAdLoadFailed baseAdCallBack is null");
        } else {
            mainAdCallBack.onAdFail(i10, str);
        }
    }

    public final void l(long j10) {
        if (j10 <= 0) {
            return;
        }
        this.f61603x = j10 * 1000;
    }

    public final void m(Activity activity, int i10) {
        if (gl.c.f53460b == null) {
            gl.c.f53460b = new gl.c();
        }
        gl.c.f53460b.a(activity, i10, this.f61589j, this.f61585f, false);
    }

    public final void n(Exception exc) {
        j(AdSdkStateCode.MAIN_LOGIC_ERROR, e("main_ad_load_err") + ", " + Log.getStackTraceString(exc));
    }

    public final void o(Runnable runnable) {
        Activity activity = this.f61597r;
        int i10 = this.f61586g;
        MainParams mainParams = this.f61589j;
        String str = this.f61585f;
        try {
            AdLog.d("强制点击广告 state " + mainParams.forceClick);
            if (mainParams.forceClick == 0) {
                return;
            }
            new Handler().postDelayed(new gl.g1(i10, activity, mainParams, str, runnable), ((long) mainParams.fcDelayTime) * 1000);
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("forceAdClick error, msg = "), e10);
        }
    }

    public final void p(JSONObject jSONObject, int i10, String str, String str2, String str3) {
        this.f61589j = new MainParams();
        this.f61586g = i10;
        this.f61588i = str;
        this.f61585f = str2;
        this.f61592m = str3;
        this.f61594o = new ArrayList();
        try {
            this.f61591l = jSONObject;
            this.f61587h = jSONObject.optString("platform");
            this.f61581b = this.f61591l.optString(VastAttributes.AD_ID);
            this.f61582c = this.f61591l.optString("sourceID");
            String strOptString = this.f61591l.optString("offline_adv");
            if (Constant.platform.equals(this.f61587h) || !TextUtils.isEmpty(strOptString)) {
                MainParams mainParams = this.f61589j;
                mainParams.platform = this.f61587h;
                mainParams.adID = this.f61581b;
                mainParams.sourceID = this.f61582c;
                mainParams.logoUrl = this.f61591l.optString("logoUrl");
                this.f61589j.title = this.f61591l.optString("title");
                this.f61589j.name = this.f61591l.optString("name");
                this.f61589j.summary = this.f61591l.optString("summary");
                this.f61589j.type = this.f61591l.optInt("type");
                this.f61589j.clickUrl = this.f61591l.optString("clickUrl");
                this.f61589j.webUrl = this.f61591l.optString("webUrl");
                this.f61589j.packageName = this.f61591l.optString("package");
                this.f61589j.imgUrl = this.f61591l.optString("imgUrl");
                this.f61589j.videoUrl = this.f61591l.optString(UnifiedMediationParams.KEY_VIDEO_URL);
                this.f61589j.countDownTime = this.f61591l.optInt("countDownTime");
                this.f61589j.skipTime = this.f61591l.optInt("skipTime");
                this.f61589j.adAreaType = this.f61591l.optInt("adAreaType");
                this.f61589j.materialId = this.f61591l.optString("materialId");
                this.f61589j.videoWidth = this.f61591l.optInt("videoWidth");
                this.f61589j.videoHeight = this.f61591l.optInt("videoHeight");
                this.f61589j.adTitle = this.f61591l.optString("adTitle");
                this.f61589j.adDes = this.f61591l.optString("adDes");
                this.f61589j.adContent = this.f61591l.optString("adContent");
                MainParams mainParams2 = this.f61589j;
                JSONArray jSONArrayOptJSONArray = this.f61591l.optJSONArray("adTags");
                ArrayList arrayList = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                        String strOptString2 = jSONArrayOptJSONArray.optString(i11);
                        if (!TextUtils.isEmpty(strOptString2)) {
                            arrayList.add(strOptString2);
                        }
                    }
                }
                mainParams2.adTags = arrayList;
                this.f61589j.forceClick = this.f61591l.optInt("forceClick");
                this.f61589j.fcDelayTime = this.f61591l.optInt("fcDelayTime");
                this.f61589j.m3u8Url = this.f61591l.optString("m3u8Url");
                this.f61589j.playable = this.f61591l.optString("playable");
                this.f61589j.playableUrl = this.f61591l.optString("playable_url");
                this.f61589j.webPrice = this.f61591l.optString("webPrice", "0");
            } else {
                i.e eVar = new i.e();
                this.f61590k = eVar;
                eVar.f54036a = this.f61591l.optString("thirdAppID");
                this.f61590k.f54037b = this.f61591l.optString("thirdAppKey");
                this.f61590k.f54038c = this.f61591l.optString("thirdPosID");
                this.f61590k.f54039d = this.f61591l.optInt("gWidth", 0);
                this.f61590k.f54040e = this.f61591l.optInt("gHeight", 0);
                this.f61590k.f54041f = this.f61591l.optString("thirdUnitID", "");
                this.f61590k.f54042g = this.f61591l.optString("webPrice", "0");
                this.f61590k.f54043h = this.f61591l.optString("autoFlush", "0");
            }
            AdLog.subAd(this.f61588i + " platform = " + this.f61587h + " , 开始加载广告");
            this.f61583d = new Date().getTime();
            k(9, this.f61598s);
        } catch (Exception e10) {
            LogUtil.printException(e10);
        }
        Activity activity = this.f61597r;
        if (TextUtils.isEmpty(this.f61589j.webUrl)) {
            AdLog.d("BaseMainAd", "checkClickUrl 备用地址为空 不进行检测！");
            MainParams mainParams3 = this.f61589j;
            mainParams3.isUserWebUrl = false;
            mainParams3.realClickUlr = mainParams3.clickUrl;
            AdLog.d("BaseMainAd", "onCheckUrlFinish");
            this.A.sendEmptyMessage(0);
        } else {
            String str4 = this.f61589j.clickUrl;
            AdLog.d("isGpDetailsPage url = " + str4);
            String strTrim = str4.trim();
            if (!((strTrim.startsWith("https://play.google.com/store/apps/details?") || strTrim.startsWith("http://play.google.com/store/apps/details?")) ? Boolean.TRUE : Boolean.FALSE).booleanValue()) {
                AdLog.d("BaseMainAd", "checkClickUrl 地址非谷歌商店详情页 不进行检测！");
                MainParams mainParams4 = this.f61589j;
                mainParams4.isUserWebUrl = false;
                mainParams4.realClickUlr = mainParams4.clickUrl;
                AdLog.d("BaseMainAd", "onCheckUrlFinish");
                this.A.sendEmptyMessage(0);
            } else if (Constant.clickUrlHashMap.containsKey(this.f61589j.clickUrl)) {
                AdLog.d("BaseMainAd", "checkClickUrl 本地缓存中存在数据，无需再次检测！");
                boolean zEquals = Boolean.TRUE.equals(Constant.clickUrlHashMap.get(this.f61589j.clickUrl));
                MainParams mainParams5 = this.f61589j;
                mainParams5.realClickUlr = zEquals ? mainParams5.clickUrl : mainParams5.webUrl;
                mainParams5.isUserWebUrl = zEquals;
                AdLog.d("BaseMainAd", "onCheckUrlFinish");
                this.A.sendEmptyMessage(0);
            } else {
                new Thread(new gl.k1(activity, this.f61589j.clickUrl, new gl.a0(System.currentTimeMillis(), new r(this)))).start();
            }
        }
        i.e eVar2 = this.f61590k;
        if (eVar2 != null) {
            f(gl.r0.a(eVar2.f54042g));
        }
    }

    public final void q(Exception exc) {
        j(AdSdkStateCode.THIRD_LOGIC_ERROR, e("main_ad_load_err") + ", " + Log.getStackTraceString(exc));
    }

    public final void r(Object obj) {
        try {
            AdLog.i("FsAdInfo, platform = " + this.f61587h + ", adPlcID = " + this.f61585f + ", AdNetWork = " + d(obj));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public final void s(String str) {
        AdLog.subAd(this.f61588i + " platform = " + this.f61587h + " , " + str);
    }

    public final void u() {
        AdLog.i("BaseMainAd", "adBidWin, " + this.f61588i + ", platform = " + this.f61587h + ", revenue = " + this.f61604y);
    }

    public void v(String str) {
        j(AdSdkStateCode.THIRD_RENDER_FAILED, e("main_ad_render_fail") + ", " + str);
    }

    public final void w() {
        AdLog.i("BaseMainAd", "adBidLose, " + this.f61588i + ", platform = " + this.f61587h + ", revenue = " + this.f61604y);
    }

    public final void x(String str) {
        j(AdSdkStateCode.THIRD_LOGIC_ERROR, e("main_ad_load_err") + ", " + str);
    }

    public final void y() {
        AdLog.d("setAdCostTime");
        if (this.f61584e == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f61584e = jCurrentTimeMillis;
            this.f61593n = jCurrentTimeMillis - this.f61583d;
        }
    }

    public final void k(int i10, boolean z10) {
        long adApiCostTime = UsLocalSaveHelper.getInstance().getAdApiCostTime(this.f61585f);
        h(i10, new AdInfo(), z10, this.f61593n, adApiCostTime, null);
    }
}
