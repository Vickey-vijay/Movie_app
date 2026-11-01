package a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.yk.e.callBack.MainPreloadAdCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.CoreUtils;
import gl.r0;
import gl.s1;
import gl.v0;
import hl.b0;
import hl.g0;
import hl.q;
import hl.w;
import hl.z;
import j.l0;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile d f3400e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f3402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3404d;

    public static l0 e(Activity activity, int i10, String str) {
        l0 b0Var;
        if (i10 == 11) {
            b0Var = new b0(activity, str, null);
        } else if (i10 == 14) {
            b0Var = new g0(activity, str, null);
        } else if (i10 == 16) {
            b0Var = new q(activity, str, null);
        } else if (i10 == 18) {
            b0Var = new hl.i(activity, str, null);
        } else if (i10 == 30) {
            b0Var = new z(activity, str, null);
        } else {
            if (i10 != 31) {
                return null;
            }
            b0Var = new w(activity, str, null);
        }
        return b0Var;
    }

    public final synchronized void i(int i10, String str) {
        JSONArray jSONArrayF;
        try {
            WeakReference weakReference = this.f3402b;
            if (weakReference != null && weakReference.get() != null) {
                if (!((Activity) this.f3402b.get()).isFinishing() && !((Activity) this.f3402b.get()).isDestroyed()) {
                    try {
                        jSONArrayF = f(str, s1.a().c((Context) this.f3402b.get(), i10, str));
                        if (jSONArrayF == null) {
                            jSONArrayF = null;
                        }
                    } catch (Exception e10) {
                        AdLog.e(e10.getMessage(), e10);
                    }
                    JSONArray jSONArray = jSONArrayF;
                    if (jSONArray != null && jSONArray.length() > 0) {
                        a aVarB = b(i10);
                        if (aVarB == null) {
                            AdLog.i("AdCacheRefreshUtils", "loadNextAd, adCache is null");
                            return;
                        }
                        if (aVarB.g(str) >= 1) {
                            AdLog.i("AdCacheRefreshUtils", "loadNextAd, adType = " + ((String) this.f3401a.get(Integer.valueOf(i10))) + ", adPlcID = adPlcID has ad cache size = " + aVarB.g(str));
                            return;
                        }
                        l0 l0VarE = e((Activity) this.f3402b.get(), i10, str);
                        if (l0VarE == null) {
                            AdLog.i("AdCacheRefreshUtils", "loadNextAd, sliceLoader is null");
                            return;
                        }
                        AdLog.i("AdCacheRefreshUtils", "loadNextAd, adType = " + ((String) this.f3401a.get(Integer.valueOf(i10))) + ", adPlcID = " + str);
                        l0VarE.f61544j = true;
                        l0VarE.l(1, jSONArray, 1, 1, new JSONArray());
                        return;
                    }
                    AdLog.i("AdCacheRefreshUtils", "loadNextAd, adJsonArray is empty");
                    return;
                }
                AdLog.i("AdCacheRefreshUtils", "loadNextAd, activityWR is finish");
                return;
            }
            AdLog.i("AdCacheRefreshUtils", "loadNextAd, activityWR is null");
        } catch (Exception e11) {
            AdLog.e(e11.getMessage(), e11);
        }
    }

    public static a b(int i10) {
        if (i10 == 11) {
            return f.i();
        }
        if (i10 == 16) {
            return k.i();
        }
        if (i10 == 18) {
            return e.i();
        }
        if (i10 == 13) {
            return c.i();
        }
        if (i10 == 14) {
            return l.i();
        }
        if (i10 == 30) {
            return g.i();
        }
        if (i10 != 31) {
            return null;
        }
        return i.i();
    }

    public static d c() {
        if (f3400e == null) {
            synchronized (d.class) {
                if (f3400e == null) {
                    f3400e = new d();
                }
            }
        }
        return f3400e;
    }

    public static JSONArray f(String str, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("adList");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            AdLog.i("AdCacheRefreshUtils", "getAdApiInfo, " + str + ", adList is empty");
            return null;
        }
        JSONArray jSONArrayF = r0.f(jSONArrayOptJSONArray);
        if (jSONArrayF.length() > 0) {
            return jSONArrayF;
        }
        AdLog.i("AdCacheRefreshUtils", "getAdApiInfo, " + str + ", adList does not contain fusion data");
        return null;
    }

    public static JSONObject g(Context context, String str) {
        try {
            byte[] bytesFromAssets = CoreUtils.getBytesFromAssets(context, "okt_sdk_preset_" + str);
            if (bytesFromAssets != null) {
                String str2 = new String(bytesFromAssets, StandardCharsets.UTF_8);
                s1.a().getClass();
                String strB = s1.b(str2);
                if (TextUtils.isEmpty(strB)) {
                    return null;
                }
                return new JSONObject(strB);
            }
        } catch (Exception unused) {
            AdLog.e("AdCacheRefreshUtils, read preset failed");
        }
        return null;
    }

    public final void h(int i10, MainPreloadAdCallback mainPreloadAdCallback) {
        WeakReference weakReference = this.f3402b;
        if (weakReference == null || weakReference.get() == null) {
            AdLog.i("AdCacheRefreshUtils", "preloadAd, activityWR is null");
            AdLog.ad("preloadAd, activityWR is null");
            if (mainPreloadAdCallback != null) {
                mainPreloadAdCallback.onFailed();
                return;
            }
            return;
        }
        if (((Activity) this.f3402b.get()).isFinishing() || ((Activity) this.f3402b.get()).isDestroyed()) {
            AdLog.i("AdCacheRefreshUtils", "preloadAd, activityWR is finish");
            AdLog.ad("preloadAd, activityWR is finish");
            if (mainPreloadAdCallback != null) {
                mainPreloadAdCallback.onFailed();
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f3402b.get();
        try {
            i.c cVarD = d(activity, i10);
            if (cVarD == null) {
                AdLog.i("AdCacheRefreshUtils", "preloadAd fail, ad data is empty!");
                if (mainPreloadAdCallback != null) {
                    mainPreloadAdCallback.onFailed();
                }
            } else {
                JSONArray jSONArray = cVarD.f54019c;
                String str = cVarD.f54018b;
                if (jSONArray == null || jSONArray.length() <= 0) {
                    AdLog.i("AdCacheRefreshUtils", "preloadAd fail, ad data is empty.");
                    if (mainPreloadAdCallback != null) {
                        mainPreloadAdCallback.onFailed();
                    }
                } else if (!"admob".equals(jSONArray.getJSONObject(0).optString("platform", "")) || i10 == 18 || i10 == 11) {
                    j(activity, i10, str, jSONArray, new b(this, mainPreloadAdCallback, i10, str));
                } else {
                    AdLog.i("AdCacheRefreshUtils", "preloadAd fail, admob sdk not start preload through dev");
                    if (mainPreloadAdCallback != null) {
                        mainPreloadAdCallback.onFailed();
                    }
                }
            }
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("preloadBannerAd error, msg = "), e10);
            if (mainPreloadAdCallback != null) {
                mainPreloadAdCallback.onFailed();
            }
        }
    }

    public final String k(Context context, int i10) {
        try {
            i.c cVarD = d(context, i10);
            if (cVarD == null) {
                AdLog.i("AdCacheRefreshUtils", "getPreloadAdID fail, ad data is empty!");
                return "";
            }
            JSONArray jSONArray = cVarD.f54019c;
            if (jSONArray != null && jSONArray.length() > 0) {
                return jSONArray.getJSONObject(0).optString("thirdPosID", "");
            }
            AdLog.i("AdCacheRefreshUtils", "getPreloadAdID fail, ad data is empty.");
            return "";
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            return "";
        }
    }

    public final void l(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            AdLog.i("AdCacheRefreshUtils", "parseApiData");
            if (jSONObjectOptJSONObject != null) {
                if (!str.equals(jSONObjectOptJSONObject.optString(InneractiveMediationDefs.REMOTE_KEY_APP_ID, ""))) {
                    AdLog.i("AdCacheRefreshUtils", "parseApiData error, msg = appID is mismatch!!!");
                    return;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("adList");
                if (jSONObjectOptJSONObject2 != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(next);
                        ArrayList arrayList = new ArrayList();
                        if (jSONArrayOptJSONArray != null) {
                            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                                Iterator<String> itKeys2 = jSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(next2);
                                    i.c cVar = new i.c();
                                    cVar.f54017a = Integer.parseInt(next);
                                    cVar.f54018b = next2;
                                    cVar.f54019c = jSONArrayOptJSONArray2;
                                    arrayList.add(cVar);
                                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                                        this.f3404d = jSONArrayOptJSONArray2.getJSONObject(0).optString("platform", "");
                                    }
                                }
                                this.f3403c.put(next, arrayList);
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public d() {
        HashMap map = new HashMap();
        this.f3401a = map;
        this.f3403c = new HashMap();
        this.f3404d = "";
        map.put(13, "开屏");
        map.put(14, "激励");
        map.put(11, "信息流");
        map.put(16, "插屏");
        map.put(18, "banner");
        map.put(27, "浮屏");
        map.put(28, "暂停插屏");
        map.put(29, "文案信息流");
        map.put(30, "thirdBanner");
        map.put(31, BrandSafetyUtils.f43552o);
    }

    public static int a(a aVar, String str) {
        int size;
        int iG = aVar.g(str);
        v0 v0VarA = v0.a();
        synchronized (v0VarA) {
            try {
                size = v0VarA.f53600a.size();
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
                size = 0;
            }
        }
        if (iG < 1) {
            return size;
        }
        return iG;
    }

    public final i.c d(Context context, int i10) {
        i.c cVar;
        s1 s1VarA = s1.a();
        s1VarA.getClass();
        cVar = null;
        try {
            synchronized (s1VarA.f53592a) {
                cVar = new i.c();
                s1.a().getClass();
                Map<String, ?> all = context.getSharedPreferences(String.format(Constant.fileApiCache, Integer.valueOf(i10)), 0).getAll();
                if (!all.isEmpty()) {
                    Iterator<String> it = all.keySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String next = it.next();
                            String strB = s1.b((String) all.get(next));
                            if (strB.length() > 0) {
                                JSONObject jSONObjectOptJSONObject = new JSONObject(strB).optJSONObject("data");
                                if (jSONObjectOptJSONObject != null) {
                                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("adList");
                                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                                        JSONArray jSONArrayF = r0.f(jSONArrayOptJSONArray);
                                        AdLog.i("ac head, key=" + i10);
                                        if (jSONArrayF.length() > 0) {
                                            cVar.f54018b = next;
                                            cVar.f54019c = jSONArrayF;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cVar = null;
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        if (cVar != null && cVar.f54019c != null) {
            AdLog.i("AdCacheRefreshUtils", "getAdApiCacheInfo4Preload from sp");
            return cVar;
        }
        AdLog.i("AdCacheRefreshUtils", "getAdApiCacheInfo4Preload from local");
        List<i.c> list = (List) this.f3403c.get(String.valueOf(i10));
        if (list != null && list.size() > 0) {
            for (i.c cVar2 : list) {
                if (r0.f(cVar2.f54019c).length() > 0) {
                    break;
                }
            }
        }
        return cVar2;
    }

    public final void j(Activity activity, int i10, String str, JSONArray jSONArray, b bVar) {
        int iA;
        if (activity.isFinishing()) {
            AdLog.i("AdCacheRefreshUtils", "refreshAdCache, activity is finishing");
            bVar.onFinish();
            return;
        }
        a aVarB = b(i10);
        if (aVarB == null) {
            AdLog.i("AdCacheRefreshUtils", "refreshAdCache, adCache is null, adType = " + i10);
            bVar.onFinish();
            return;
        }
        if (aVarB.g(str) >= 1) {
            AdLog.i("AdCacheRefreshUtils", "refreshAdCache, adType = " + ((String) this.f3401a.get(Integer.valueOf(i10))) + ", adPlcID = adPlcID has ad cache size = " + aVarB.g(str));
            bVar.onFinish();
            return;
        }
        if (i10 == 14 && (iA = a(aVarB, str)) >= 1) {
            AdLog.i("AdCacheRefreshUtils", "refreshAdCache, adType = " + ((String) this.f3401a.get(Integer.valueOf(i10))) + ", adPlcID = adPlcID has ad cache size = " + iA);
            bVar.onFinish();
            return;
        }
        l0 l0VarE = e(activity, i10, str);
        if (l0VarE != null) {
            AdLog.i("AdCacheRefreshUtils", "refreshAdCache, adType = " + ((String) this.f3401a.get(Integer.valueOf(i10))) + ", adPlcID = " + str);
            l0VarE.f61544j = true;
            l0VarE.f61545k = bVar;
            l0VarE.l(1, jSONArray, 1, 1, new JSONArray());
        }
    }
}
