package j;

import Lil.I1I;
import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.Mf;
import com.ironsource.Z7;
import com.yk.e.callBack.MainAdCallBack;
import com.yk.e.callBack.MainRefreshCallback;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.util.AdLog;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ScreenUtil;
import com.yk.e.util.UsLocalSaveHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f61535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MainAdCallBack f61537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f61538d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MainRefreshCallback f61545k;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i.b f61560z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f61539e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f61540f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f61541g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f61542h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f61543i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f61544j = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f61546l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f61547m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f61548n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f61549o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f61550p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f61551q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f61552r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f61553s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f61554t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f61555u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f61556v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f61557w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f61558x = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public y1 f61559y = null;
    public i.b A = null;
    public final ArrayList B = new ArrayList();
    public int C = -2;
    public final k D = new k(this, Looper.getMainLooper());

    public final synchronized void B(i.a aVar) {
        Message message = new Message();
        message.obj = aVar;
        message.what = 1;
        this.D.sendMessage(message);
    }

    public abstract a.a a();

    public final synchronized void c(i.a aVar) {
        AdLog.i("BaseSliceLoader", "onBackstopTaskLoadSuccess");
        if (this.A == null) {
            this.A = h(aVar);
        }
        int i10 = this.C;
        if (i10 != -1) {
            this.C = i10 + 1;
        } else {
            m(h(aVar), "finish");
            AdLog.i("bid success callback from backstop");
        }
    }

    public abstract I1I f(int i10, Object... objArr);

    public final synchronized boolean s() {
        return this.f61551q > 0;
    }

    public abstract int t();

    public final synchronized void v(i.a aVar) {
        AdLog.i("BaseSliceLoader", "onBackstopTaskLoadFailed");
        int i10 = this.C;
        if (i10 != -1) {
            this.C = i10 + 1;
        } else {
            int i11 = aVar.f54011e;
            if (i11 == 0) {
                i11 = AdSdkStateCode.THIRD_LOGIC_ERROR;
            }
            b(i11, TextUtils.isEmpty(aVar.f54012f) ? "load bidding ad error!" : aVar.f54012f);
            AdLog.i("bid failed callback from backstop");
        }
    }

    public final synchronized void z(i.a aVar) {
        Message message = new Message();
        message.obj = aVar;
        message.what = 0;
        this.D.sendMessage(message);
    }

    public static void d(l0 l0Var, i.a aVar) {
        if (l0Var.f61550p == ((JSONArray) l0Var.f61542h.get(l0Var.f61548n)).length()) {
            synchronized (l0Var) {
                l0Var.f61551q++;
            }
            i.b bVarA = l0Var.f61546l ? l0Var.a().a(l0Var.f61536b) : null;
            AdLog.i("BaseSliceLoader", "is read cache list, state = " + l0Var.f61546l);
            i.b bVar = l0Var.f61560z;
            if (bVarA == null && bVar == null) {
                bVarA = null;
            } else if (bVarA == null || (bVar != null && bVarA.f54013b <= bVar.f54013b)) {
                bVarA = bVar;
            }
            if (bVarA == null && l0Var.C == 0) {
                l0Var.C = -1;
                AdLog.i("BaseSliceLoader", "wait backstop ad callback");
                return;
            }
            if (bVarA == null) {
                bVarA = l0Var.A;
                AdLog.i("BaseSliceLoader", "set backstopCacheData");
            } else {
                l0Var.A = null;
                AdLog.i("BaseSliceLoader", "destroy backstopCacheData");
            }
            if (bVarA != null) {
                l0Var.m(bVarA, "finish");
                return;
            }
            int i10 = aVar.f54011e;
            if (i10 == 0) {
                i10 = AdSdkStateCode.THIRD_LOGIC_ERROR;
            }
            l0Var.b(i10, TextUtils.isEmpty(aVar.f54012f) ? "load bidding ad error!" : aVar.f54012f);
        }
    }

    public static i.b h(i.a aVar) {
        i.b bVar = new i.b();
        bVar.f54013b = aVar.f54007a;
        bVar.f54014c = aVar.f54008b;
        bVar.f54015d = aVar.f54009c;
        bVar.f54016e = aVar.f54010d;
        return bVar;
    }

    public final void C(String str) {
        int i10 = AdSdkStateCode.MAIN_RENDER_FAILED;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("platform:" + this.f61541g + ", msg:" + IDUtil.getString(this.f61535a, "main_ad_render_fail"));
        sb2.append(", ");
        sb2.append(str);
        u(i10, sb2.toString());
    }

    public final boolean D() {
        y1 y1Var = this.f61559y;
        if (y1Var == null) {
            AdLog.d("BaseSliceLoader", "isExpired, adLoader is null!");
            return true;
        }
        boolean zIsExpired = y1Var.isExpired();
        AdLog.i("BaseSliceLoader", this.f61538d + " adPlcID = " + this.f61536b + ", adIsExpired = " + zIsExpired);
        return zIsExpired;
    }

    public final void e(String str) {
        if (this.f61544j) {
            return;
        }
        AdLog.ad(str);
    }

    public final View g(Activity activity, View view, int i10, int i11, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        try {
            i.e eVar = this.f61559y.thirdParams;
            if (!z10 && eVar != null && (i14 = eVar.f54039d) != 0) {
                i10 = i14;
            }
            if (!z10 && eVar != null && (i15 = eVar.f54040e) != 0) {
                i11 = i15;
            }
            if (i12 == 0) {
                i12 = (i10 * i13) / i11;
            } else if (i13 == 0) {
                i13 = (i11 * i12) / i10;
            } else {
                i12 = (int) (i10 * (i13 / i11));
            }
            int screenWidth = ScreenUtil.getScreenWidth(activity);
            if (i12 == 0 && i13 == 0) {
                i13 = (i11 * screenWidth) / i10;
                i12 = screenWidth;
            }
            if (i12 >= screenWidth) {
                i13 = (i11 * screenWidth) / i10;
            } else {
                screenWidth = i12;
            }
            int screenHeight = ScreenUtil.getScreenHeight(activity);
            if (i13 >= screenHeight) {
                screenWidth = (i10 * screenHeight) / i11;
                i13 = screenHeight;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = screenWidth;
                layoutParams.height = i13;
                view.setLayoutParams(layoutParams);
            } else {
                AdLog.w("resetNativeViewWH, contentParams is null");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        return view;
    }

    public final void k(int i10, JSONArray jSONArray) {
        if (this.f61554t == 0) {
            this.f61554t = System.currentTimeMillis();
            e("开始加载广告");
        }
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObjectOptJSONObject);
            this.f61543i.put(Integer.valueOf(this.f61547m), f(this.f61547m, Integer.valueOf(i10), jSONArray2));
            this.f61547m++;
        }
    }

    public final void l(int i10, JSONArray jSONArray, int i11, int i12, JSONArray jSONArray2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        try {
            if (jSONArray != null) {
                try {
                    if (jSONArray.length() == 0) {
                        str4 = ", ";
                        str5 = "main_ad_load_err";
                        str6 = "AdData slice failed，msg = ";
                        w("onAdFail, code = " + AdSdkStateCode.MAIN_RENDER_FAILED + ", msg = AdList is empty!");
                        int i13 = AdSdkStateCode.MAIN_RENDER_FAILED;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("platform:" + this.f61541g + ", msg:" + IDUtil.getString(this.f61535a, "main_ad_render_fail"));
                        sb2.append(", AdList is empty!");
                        u(i13, sb2.toString());
                    } else {
                        this.f61553s = System.currentTimeMillis();
                        e("FloorSize = " + jSONArray.length() + ", SliceSize = " + i12);
                        long j10 = this.f61552r;
                        str5 = "main_ad_load_err";
                        try {
                            str4 = ", ";
                            try {
                                str6 = "AdData slice failed，msg = ";
                                w("连接服务器耗时：" + (this.f61553s - j10) + "ms");
                                long j11 = this.f61552r;
                                UsLocalSaveHelper.getInstance().putAdApiCostTimeMap(this.f61536b, j11 != 0 ? this.f61553s - j11 : 0L);
                                jSONArray.length();
                                this.f61540f = i10;
                                this.f61539e = i12;
                                this.f61546l = gl.r0.f(jSONArray).length() > 0;
                                List<JSONArray> listSliceJsonArray = CoreUtils.sliceJsonArray(jSONArray, i12);
                                this.f61542h = listSliceJsonArray;
                                if (listSliceJsonArray.size() == 0) {
                                    w("onAdFail, code = " + AdSdkStateCode.MAIN_RENDER_FAILED + ", msg = SliceJsonArrays is empty!");
                                    int i14 = AdSdkStateCode.MAIN_RENDER_FAILED;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("platform:" + this.f61541g + ", msg:" + IDUtil.getString(this.f61535a, "main_ad_render_fail"));
                                    sb3.append(", SliceJsonArrays is empty!");
                                    u(i14, sb3.toString());
                                } else {
                                    k(i10, (JSONArray) this.f61542h.get(0));
                                }
                            } catch (Exception e10) {
                                e = e10;
                                AdLog.e(e.getMessage(), e);
                                str = "AdData slice failed，msg = ";
                                String str7 = str + e.getMessage();
                                int i15 = AdSdkStateCode.THIRD_LOGIC_ERROR;
                                StringBuilder sb4 = new StringBuilder();
                                str2 = str5;
                                sb4.append("platform:" + this.f61541g + ", msg:" + IDUtil.getString(this.f61535a, str2));
                                str3 = str4;
                                sb4.append(str3);
                                sb4.append(str7);
                                u(i15, sb4.toString());
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str4 = ", ";
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    str4 = ", ";
                    str5 = "main_ad_load_err";
                }
            } else {
                str4 = ", ";
                str5 = "main_ad_load_err";
                str6 = "AdData slice failed，msg = ";
                w("onAdFail, code = " + AdSdkStateCode.MAIN_RENDER_FAILED + ", msg = AdList is empty!");
                int i16 = AdSdkStateCode.MAIN_RENDER_FAILED;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("platform:" + this.f61541g + ", msg:" + IDUtil.getString(this.f61535a, "main_ad_render_fail"));
                sb5.append(", AdList is empty!");
                u(i16, sb5.toString());
            }
            str2 = str5;
            str3 = str4;
            str = str6;
        } catch (Exception e13) {
            e = e13;
        }
        try {
            int i17 = this.f61557w;
            if (i17 == 0) {
                i17 = i11;
            }
            AdLog.i("BaseSliceLoader", "bid, isUseClientBid = true, realBidTime = " + i17);
            if (i17 > 0) {
                i(i17);
            }
            r(jSONArray2);
        } catch (Exception e14) {
            AdLog.e(e14.getMessage(), e14);
            String str8 = str + e14.getMessage();
            int i18 = AdSdkStateCode.THIRD_LOGIC_ERROR;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("platform:" + this.f61541g + ", msg:" + IDUtil.getString(this.f61535a, str2));
            sb6.append(str3);
            sb6.append(str8);
            u(i18, sb6.toString());
        }
    }

    public final void m(i.b bVar, String str) {
        y1 y1Var = bVar.f54014c;
        this.f61559y = y1Var;
        bVar.f54015d.f61541g = y1Var.platform;
        o(y1Var, bVar);
        AdLog.i("BaseSliceLoader", "bid " + str + ", type = " + this.f61538d + ", win platform = " + this.f61541g + ", revenue = " + this.f61559y.getRevenue());
    }

    public final void p(Exception exc) {
        int i10 = AdSdkStateCode.MAIN_LOGIC_ERROR;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("platform:" + this.f61541g + ", msg:" + IDUtil.getString(this.f61535a, "main_ad_load_err"));
        sb2.append(", ");
        sb2.append(Log.getStackTraceString(exc));
        u(i10, sb2.toString());
    }

    public final void q(String str) {
        if (this.f61544j) {
            return;
        }
        AdLog.ad(this.f61538d + " platform = " + this.f61541g + " , " + str);
    }

    public final void r(JSONArray jSONArray) {
        AdLog.i("BaseSliceLoader", "createAdLoader4Backstop, size = " + jSONArray.length());
        this.C = -2;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObjectOptJSONObject);
            this.C = 0;
            f(0, 1, jSONArray2, Boolean.TRUE);
        }
    }

    public final void u(int i10, String str) {
        Activity activity = this.f61535a;
        String str2 = i10 + ", " + str;
        AdLog.w("errMsg " + str2);
        String str3 = this.f61536b;
        String str4 = this.f61541g;
        if (UsLocalSaveHelper.getInstance().isWriteLog()) {
            gl.a1.a().f(activity, str3, str4, str2, "0", "0", new gl.o0(str3, str4));
        } else {
            AdLog.d("do not report err log, adPlcID = " + str3);
        }
        MainAdCallBack mainAdCallBack = this.f61537c;
        if (mainAdCallBack != null) {
            mainAdCallBack.onAdFail(i10, str);
            return;
        }
        e("Ad callback is null, msg = " + str);
    }

    public final void w(String str) {
        if (this.f61544j) {
            return;
        }
        AdLog.ad(this.f61538d + Z7.f27998r + str);
    }

    public l0(Activity activity, String str, String str2, MainAdCallBack mainAdCallBack) {
        this.f61536b = "";
        this.f61538d = "";
        this.f61535a = activity;
        this.f61538d = str;
        this.f61536b = str2;
        this.f61537c = mainAdCallBack;
    }

    public static void n(l0 l0Var, i.a aVar) {
        l0Var.getClass();
        i.b bVarH = h(aVar);
        l0Var.B.add(bVarH);
        if (aVar.f54008b.isSupportAdCache()) {
            l0Var.a().c(l0Var.f61535a, l0Var.f61536b, bVarH);
            return;
        }
        if (!l0Var.s()) {
            i.b bVar = l0Var.f61560z;
            if (bVar == null || bVar.f54013b < aVar.f54007a) {
                l0Var.f61560z = bVarH;
            }
            AdLog.i("BaseSliceLoader", "no support adCache, platform = " + aVar.f54008b.platform + ", revenue = " + aVar.f54008b.getRevenue() + Z7.f27998r + aVar.f54008b);
        }
    }

    public static boolean x(l0 l0Var, i.a aVar) {
        if (l0Var.s()) {
            return false;
        }
        int i10 = aVar.f54011e;
        try {
            int i11 = l0Var.f61549o + 1;
            l0Var.f61549o = i11;
            if (i11 < l0Var.f61539e) {
                if (l0Var.f61548n != l0Var.f61542h.size() - 1) {
                    return false;
                }
                if (l0Var.f61549o != ((JSONArray) l0Var.f61542h.get(l0Var.f61548n)).length()) {
                    return false;
                }
            } else {
                l0Var.f61549o = 0;
            }
            if (l0Var.f61548n < l0Var.f61542h.size() - 1) {
                l0Var.f61548n++;
                AdLog.i("BaseSliceLoader", "onLoadNextSubSliceAd");
                l0Var.f61550p = 0;
                l0Var.k(l0Var.f61540f, (JSONArray) l0Var.f61542h.get(l0Var.f61548n));
                AdLog.i("BaseSliceLoader", "load sub ad 4 bid");
                return true;
            }
            AdLog.i("BaseSliceLoader", "onLoadSubAdFailed, onAllAdFailed");
            return false;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            l0Var.p(e10);
            return false;
        }
    }

    public final void A(int i10, String str) {
        u(i10, str);
    }

    public void b(int i10, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f61555u = jCurrentTimeMillis;
        w("加载sdk内容耗时：" + (jCurrentTimeMillis - this.f61554t) + "ms");
        w("onAdFail, code = " + i10 + ", msg = " + str);
    }

    public final void i(int i10) {
        try {
            AdLog.i("BaseSliceLoader", "setBidCountDown, time = " + i10);
            gl.a aVar = new gl.a(i10, new j2(this));
            aVar.f53435c.post(aVar.f53436d);
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("setBidCountDown, errMsg = "), e10);
        }
    }

    public final void j(int i10, String str) {
        this.f61553s = System.currentTimeMillis();
        e(this.f61538d + " sdk获取数据失败, msg = " + str);
        long j10 = this.f61552r;
        w("连接服务器耗时：" + (this.f61553s - j10) + "ms");
        UsLocalSaveHelper.getInstance().putAdApiCostTimeMap(this.f61536b, this.f61553s - this.f61552r);
        MainAdCallBack mainAdCallBack = this.f61537c;
        if (mainAdCallBack != null) {
            mainAdCallBack.onAdFail(i10, str);
        }
    }

    public void o(y1 y1Var, i.b bVar) {
        this.f61555u = System.currentTimeMillis();
        y1 y1Var2 = this.f61559y;
        if (y1Var2 != null) {
            this.f61541g = y1Var2.platform;
        }
        e("AdLoaderIndex = forAdCache");
        long j10 = this.f61554t;
        q("加载sdk内容耗时：" + (this.f61555u - j10) + "ms");
        q(Mf.f27060j);
        try {
            bVar.f54014c.onAdBidWin();
            if (this.B.size() > 0) {
                this.B.remove(bVar);
                Iterator it = this.B.iterator();
                while (it.hasNext()) {
                    ((i.b) it.next()).f54014c.onAdBidLose();
                }
                this.B.clear();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        if (!this.f61544j && y1Var.isSupportAdCache()) {
            a().d(bVar, this.f61536b);
            AdLog.i("BaseSliceLoader", "loadNextAd, adPlcID = " + this.f61536b);
            a.d.c().i(t(), this.f61536b);
        }
        if (this.f61560z != null) {
            this.f61560z = null;
        }
    }

    public void y() {
        this.f61552r = System.currentTimeMillis();
        e(this.f61538d + " 连接sdk获取数据");
        this.f61547m = 0;
        this.f61548n = 0;
        this.f61549o = 0;
        this.f61554t = 0L;
        this.f61550p = 0;
        this.f61551q = 0;
        this.f61556v = false;
    }
}
