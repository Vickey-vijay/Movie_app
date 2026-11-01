package gl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainInitSdkCallback;
import com.yk.e.net.TaskThreadPool;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.object.ErrMsgParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.Base64Utils;
import com.yk.e.util.Constant;
import com.yk.e.util.LogUtil;
import com.yk.e.util.ScreenUtil;
import com.yk.e.util.StringUtil;
import com.yk.e.util.UsLocalSaveHelper;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class a1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f53439i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f53440j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static a1 f53441k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f53443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f53444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f53445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f53446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f53447f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f53449h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f53442a = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f53448g = "";

    public static a1 a() {
        synchronized (a1.class) {
            if (f53441k == null) {
                f53441k = new a1();
            }
        }
        return f53441k;
    }

    public static String b(JSONObject jSONObject) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> itKeys = jSONObject.keys();
        ArrayList arrayList = new ArrayList();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        Collections.sort(arrayList);
        Arrays.sort(arrayList.toArray());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String str = (String) arrayList.get(i10);
            try {
                if (!(jSONObject.get(str) instanceof JSONObject)) {
                    sb2.append(jSONObject.optString(str));
                }
            } catch (Exception e10) {
                LogUtil.printException(e10);
            }
        }
        return sb2.toString();
    }

    public static JSONArray c(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<Map<String, String>> it = Constant.historyMidList.iterator();
            while (it.hasNext()) {
                String str2 = it.next().get(str);
                if (!TextUtils.isEmpty(str2)) {
                    jSONArray.put(str2);
                }
            }
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("getHistoryMid error, msg = "), e10);
        }
        return jSONArray;
    }

    public static void e(Context context, String str, MainInitSdkCallback mainInitSdkCallback) {
        if (str.equals("1")) {
            AbstractC4043il.ILil(context, new o1(mainInitSdkCallback));
        } else {
            if (str.equals("2")) {
                AbstractC4043il.IL1Iii(context, new o1(mainInitSdkCallback));
                return;
            }
            AdLog.i("当前聚合广告类型mixTool = ".concat(str));
            AdLog.ad("3rdFsPartySdk init success");
            mainInitSdkCallback.onInitSuccess();
        }
    }

    public final void d(Context context, int i10, String str, String str2, int i11, String str3, s0 s0Var) {
        if (this.f53442a) {
            k(context, i10, str, str2, i11, str3, s0Var);
            return;
        }
        AdLog.ad("SDK 未初始化成功！！！ ");
        if (s0Var != null) {
            s0Var.b(AdSdkStateCode.INIT_FAILED, "SDK 未初始化成功！！！ ");
        }
    }

    public final void f(Context context, String str, String str2, String str3, String str4, String str5, o0 o0Var) {
        long jLongValue;
        JSONObject jSONObject = new JSONObject();
        try {
            String lowerCase = UsLocalSaveHelper.getInstance().getNetType().toLowerCase(Locale.getDefault());
            ErrMsgParams errMsgParams = UsLocalSaveHelper.getInstance().getErrMsgParamsMap().get(str);
            if (errMsgParams == null) {
                AdLog.e("reqCollectLog fail, errMsgParams is null");
                return;
            }
            jSONObject.put(InneractiveMediationDefs.REMOTE_KEY_APP_ID, f53439i);
            jSONObject.put("deviceID", this.f53445d);
            jSONObject.put("model", Build.BRAND + "/" + Build.MODEL);
            jSONObject.put("is_wifi", "wifi".equals(lowerCase) ? "1" : "0");
            jSONObject.put("system", "0");
            jSONObject.put("sdkVersion", Constant.sdkVersion);
            jSONObject.put("api_url", errMsgParams.getApiUrl());
            jSONObject.put("platform", str2);
            jSONObject.put("req_data", errMsgParams.getReqData());
            jSONObject.put("response_msg", errMsgParams.getRepData());
            jSONObject.put("sdk_error", Base64Utils.encode(str3.getBytes()));
            jSONObject.put("apiCostTime", UsLocalSaveHelper.getInstance().getAdApiCostTime(str));
            try {
                Long l10 = (Long) AbstractC4043il.f3372lLi1LL.get(str2);
                jLongValue = l10 != null ? l10.longValue() : 0L;
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
            }
            jSONObject.put("initCostTime", jLongValue);
            jSONObject.put("thirdCode", str4);
            jSONObject.put("myCode", str5);
            jSONObject.put("sign", StringUtil.encryptToMD5(this.f53445d + b(jSONObject) + f53440j));
            TaskThreadPool.connect(Constant.ReqCollectLog, jSONObject, new q0(context, o0Var));
        } catch (Exception e11) {
            String str6 = "reqCollectLog error, msg = " + e11.getMessage();
            AdLog.e(str6, e11);
            if (o0Var != null) {
                o0Var.onFailed(-1, str6);
            }
        }
    }

    public final boolean i(String str, Context context, boolean z10, MainInitSdkCallback mainInitSdkCallback) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("status");
            String strOptString = jSONObject.optString("info", "");
            if (iOptInt != 1001) {
                if (TextUtils.isEmpty(strOptString)) {
                    strOptString = "请求初始化接口失败, status = " + iOptInt;
                }
                AdLog.ad("reqInit failed, status = " + iOptInt + ", msg = " + strOptString);
                if (mainInitSdkCallback == null || !z10) {
                    return false;
                }
                mainInitSdkCallback.onInitFailed(iOptInt, strOptString);
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            b1.a(context).b(context, jSONObject2.optJSONArray("domain_list"));
            UsLocalSaveHelper.getInstance().setPreloadCachePeriod(jSONObject2.optInt("cache_time"));
            UsLocalSaveHelper.getInstance().setWriteLog(jSONObject2.optString("writeLog", "0"));
            UsLocalSaveHelper.getInstance().setCmp(jSONObject2.optString("cmp", "0"));
            String strOptString2 = jSONObject2.optString("mixTool", "");
            AdLog.ad("api init success");
            this.f53442a = true;
            UsLocalSaveHelper.getInstance().setDeviceID(this.f53445d);
            e(context, strOptString2, mainInitSdkCallback);
            return true;
        } catch (Exception e10) {
            String str2 = "api init parse error, msg = " + e10.getMessage();
            AdLog.ad(str2);
            AdLog.e(str2, e10);
            if (mainInitSdkCallback == null || !z10) {
                return false;
            }
            mainInitSdkCallback.onInitFailed(AdSdkStateCode.INIT_FAILED, "init fail, msg = " + e10.getMessage());
            return false;
        }
    }

    public final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InneractiveMediationDefs.REMOTE_KEY_APP_ID, f53439i);
            jSONObject.put("deviceID", this.f53445d);
            jSONObject.put("system", 0);
            jSONObject.put("appName", this.f53446e);
            jSONObject.put("appVersionName", this.f53447f);
            jSONObject.put("currentTime", System.currentTimeMillis());
            jSONObject.put("appPackage", this.f53443b);
            jSONObject.put("appSHA1", this.f53444c);
            jSONObject.put("sdkVersion", Constant.sdkVersion);
            jSONObject.put("debugFlag", Constant.debugFlag ? 1 : 0);
            jSONObject.put("phoneLang", TextUtils.isEmpty(this.f53448g) ? "en-us" : this.f53448g);
        } catch (Exception e10) {
            LogUtil.printException(e10);
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0134  */
    /* JADX WARN: Code duplicated, block: B:43:0x0137 A[Catch: Exception -> 0x016a, TryCatch #3 {Exception -> 0x016a, blocks: (B:30:0x00b0, B:35:0x00ee, B:40:0x0123, B:44:0x0139, B:43:0x0137, B:39:0x010e, B:34:0x00d9, B:36:0x00fc, B:31:0x00c7), top: B:59:0x00b0, inners: #1, #4 }] */
    public final void k(Context context, int i10, String str, String str2, int i11, String str3, s0 s0Var) {
        boolean z10;
        String str4;
        JSONObject jSONObjectOptJSONObject;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                JSONObject jSONObjectC = s1.a().c(context, i10, str2);
                                if (jSONObjectC != null && (jSONObjectOptJSONObject = jSONObjectC.optJSONObject("data")) != null) {
                                    int iOptInt = jSONObjectOptJSONObject.optInt("loadNumber", 1);
                                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("adList");
                                    Object objOptJSONArray = jSONObjectOptJSONObject.optJSONArray("bottomAdList");
                                    int iOptInt2 = jSONObjectOptJSONObject.optInt("biddingTime", 1);
                                    int iOptInt3 = jSONObjectOptJSONObject.optInt(com.ironsource.mediationsdk.d.f29596h, 1);
                                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                                        try {
                                            s0Var.a(Integer.valueOf(iOptInt), jSONArrayOptJSONArray, Integer.valueOf(iOptInt2), Integer.valueOf(iOptInt3), objOptJSONArray);
                                            AdLog.i("ac from cache");
                                            z10 = true;
                                        } catch (Exception e10) {
                                            e = e10;
                                            b.d.a(e, new StringBuilder("getApiCacheError, msg="), e);
                                            z10 = false;
                                        }
                                    }
                                    JSONObject jSONObjectJ = j();
                                    ErrMsgParams errMsgParams = new ErrMsgParams();
                                    UsLocalSaveHelper.getInstance().addErrMsgParams(str2, errMsgParams);
                                    jSONObjectJ.put("adPlcID", str2);
                                    jSONObjectJ.put("sw", ScreenUtil.getScreenWidth(context));
                                    jSONObjectJ.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, ScreenUtil.getScreenHeight(context));
                                    jSONObjectJ.put("orientation", i11);
                                    jSONObjectJ.put("historyMid", c(str2).toString());
                                    JSONArray jSONArray = new JSONArray();
                                    jSONArray = g.a(context, str.toLowerCase(Locale.getDefault()), Constant.fileAdShowCount, Constant.adShowCountMap);
                                    jSONObjectJ.put("show_limit", jSONArray.toString());
                                    JSONArray jSONArray2 = new JSONArray();
                                    jSONArray2 = g.a(context, str.toLowerCase(Locale.getDefault()), Constant.fileAdAreaTypeCount, Constant.adAreaNumMap);
                                    jSONObjectJ.put("adAreaType", jSONArray2.toString());
                                    if (TextUtils.isEmpty(this.f53448g)) {
                                        str4 = "en-us";
                                    } else {
                                        str4 = this.f53448g;
                                    }
                                    jSONObjectJ.put("phoneLang", str4);
                                    jSONObjectJ.put("sign", StringUtil.encryptToMD5(this.f53445d + b(jSONObjectJ) + f53440j));
                                    errMsgParams.setReqData(jSONObjectJ.toString());
                                    errMsgParams.setApiUrl(str3);
                                    TaskThreadPool.connect(str3, jSONObjectJ, new y(this, context, errMsgParams, z10, s0Var, str2, i10, str, i11, str3));
                                }
                            } catch (Exception e11) {
                                e = e11;
                                b.d.a(e, new StringBuilder("getApiCacheError, msg="), e);
                                z10 = false;
                                JSONObject jSONObjectJ2 = j();
                                ErrMsgParams errMsgParams2 = new ErrMsgParams();
                                UsLocalSaveHelper.getInstance().addErrMsgParams(str2, errMsgParams2);
                                jSONObjectJ2.put("adPlcID", str2);
                                jSONObjectJ2.put("sw", ScreenUtil.getScreenWidth(context));
                                jSONObjectJ2.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, ScreenUtil.getScreenHeight(context));
                                jSONObjectJ2.put("orientation", i11);
                                jSONObjectJ2.put("historyMid", c(str2).toString());
                                JSONArray jSONArray3 = new JSONArray();
                                jSONArray3 = g.a(context, str.toLowerCase(Locale.getDefault()), Constant.fileAdShowCount, Constant.adShowCountMap);
                                jSONObjectJ2.put("show_limit", jSONArray3.toString());
                                JSONArray jSONArray4 = new JSONArray();
                                jSONArray4 = g.a(context, str.toLowerCase(Locale.getDefault()), Constant.fileAdAreaTypeCount, Constant.adAreaNumMap);
                                jSONObjectJ2.put("adAreaType", jSONArray4.toString());
                                if (TextUtils.isEmpty(this.f53448g)) {
                                    str4 = "en-us";
                                } else {
                                    str4 = this.f53448g;
                                }
                                jSONObjectJ2.put("phoneLang", str4);
                                jSONObjectJ2.put("sign", StringUtil.encryptToMD5(this.f53445d + b(jSONObjectJ2) + f53440j));
                                errMsgParams2.setReqData(jSONObjectJ2.toString());
                                errMsgParams2.setApiUrl(str3);
                                TaskThreadPool.connect(str3, jSONObjectJ2, new y(this, context, errMsgParams2, z10, s0Var, str2, i10, str, i11, str3));
                            }
                        } catch (Exception e12) {
                            e = e12;
                        }
                        jSONArray3 = g.a(context, str.toLowerCase(Locale.getDefault()), Constant.fileAdShowCount, Constant.adShowCountMap);
                    } catch (Exception e13) {
                        AdLog.e("getAdShowCountData error, msg = " + e13.getMessage(), e13);
                    }
                    jSONArray4 = g.a(context, str.toLowerCase(Locale.getDefault()), Constant.fileAdAreaTypeCount, Constant.adAreaNumMap);
                } catch (Exception e14) {
                    AdLog.e("getAdAreaCountData error, msg = " + e14.getMessage(), e14);
                }
                jSONObjectJ2.put("orientation", i11);
                jSONObjectJ2.put("historyMid", c(str2).toString());
                JSONArray jSONArray5 = new JSONArray();
                jSONObjectJ2.put("show_limit", jSONArray5.toString());
                JSONArray jSONArray6 = new JSONArray();
                jSONObjectJ2.put("adAreaType", jSONArray6.toString());
                if (TextUtils.isEmpty(this.f53448g)) {
                    str4 = "en-us";
                } else {
                    str4 = this.f53448g;
                }
                jSONObjectJ2.put("phoneLang", str4);
                jSONObjectJ2.put("sign", StringUtil.encryptToMD5(this.f53445d + b(jSONObjectJ2) + f53440j));
                errMsgParams2.setReqData(jSONObjectJ2.toString());
                errMsgParams2.setApiUrl(str3);
            } catch (Exception e15) {
                e = e15;
                LogUtil.printException(e);
            }
            jSONObjectJ2.put("adPlcID", str2);
            jSONObjectJ2.put("sw", ScreenUtil.getScreenWidth(context));
            jSONObjectJ2.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, ScreenUtil.getScreenHeight(context));
        } catch (Exception e16) {
            e = e16;
        }
        z10 = false;
        JSONObject jSONObjectJ3 = j();
        ErrMsgParams errMsgParams3 = new ErrMsgParams();
        UsLocalSaveHelper.getInstance().addErrMsgParams(str2, errMsgParams3);
        TaskThreadPool.connect(str3, jSONObjectJ3, new y(this, context, errMsgParams3, z10, s0Var, str2, i10, str, i11, str3));
    }

    public static void g(a1 a1Var, Context context, String str, MainInitSdkCallback mainInitSdkCallback) {
        a1Var.getClass();
        AdLog.ad("reqInit");
        boolean zI = false;
        try {
            JSONObject jSONObjectC = s1.a().c(context, 9999, "1");
            if (jSONObjectC != null) {
                JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject("data");
                if (jSONObjectC.optInt("status") == 1001 && jSONObjectOptJSONObject != null && (zI = a1Var.i(jSONObjectC.toString(), context, false, mainInitSdkCallback))) {
                    AdLog.i("init ac from cache");
                }
            }
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("getApiCacheError, msg="), e10);
        }
        new Thread(new r1(new n(context, new d(a1Var, str, context, zI, mainInitSdkCallback)))).start();
    }

    public final void h(i.d dVar, s0 s0Var) {
        try {
            JSONObject jSONObjectJ = j();
            jSONObjectJ.put("adPlcID", dVar.f54020a);
            jSONObjectJ.put("adType", dVar.f54021b);
            jSONObjectJ.put(VastAttributes.AD_ID, dVar.f54022c);
            jSONObjectJ.put("sourceID", dVar.f54023d);
            jSONObjectJ.put("platform", dVar.f54024e);
            jSONObjectJ.put("type", dVar.f54025f);
            jSONObjectJ.put("userID", dVar.f54026g);
            jSONObjectJ.put("extraMsg", dVar.f54027h);
            jSONObjectJ.put("requestID", dVar.f54028i);
            jSONObjectJ.put("materialId", dVar.f54029j);
            jSONObjectJ.put("network", dVar.f54035p);
            jSONObjectJ.put("isBrush", dVar.f54030k);
            jSONObjectJ.put("fillCostTime", dVar.f54031l);
            jSONObjectJ.put("apiCostTime", dVar.f54032m);
            jSONObjectJ.put("sign", StringUtil.encryptToMD5(this.f53445d + b(jSONObjectJ) + f53440j));
            TaskThreadPool.connect(Constant.StatAdPath, jSONObjectJ, new z0(this, s0Var, dVar));
        } catch (Exception e10) {
            LogUtil.printException(e10);
        }
    }
}
