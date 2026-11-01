package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.material.badge.BadgeDrawable;
import com.ironsource.B7;
import com.ironsource.C3426d4;
import com.ironsource.C3490ge;
import com.ironsource.C3533j4;
import com.ironsource.C3676r4;
import com.ironsource.C3714t8;
import com.ironsource.C8;
import com.ironsource.Lb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class SDKUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f31217a = "SDKUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f31218b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f31219c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f31220d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f31221e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f31222f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f31223g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Map<String, String> f31224h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f31225i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f31226j = new AtomicInteger(1);

    public static int convertDpToPx(int i10) {
        return (int) TypedValue.applyDimension(0, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static byte[] encrypt(String str) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            try {
                messageDigest.reset();
                messageDigest.update(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                e = e10;
                C3676r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            } catch (NoSuchAlgorithmException e11) {
                e = e11;
                C3676r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        } catch (UnsupportedEncodingException e12) {
            e = e12;
            messageDigest = null;
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            messageDigest = null;
        }
        if (messageDigest != null) {
            return messageDigest.digest();
        }
        return null;
    }

    public static String fetchDemandSourceId(C3490ge c3490ge) {
        return fetchDemandSourceId(c3490ge.a());
    }

    public static int getActivityUIFlags(boolean z10) {
        return z10 ? 5894 : 1798;
    }

    public static String getSDKVersion() {
        return "9.2.0";
    }

    public static boolean isExternalStorageAvailable() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return false;
        }
    }

    public static String translateDeviceOrientation(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "none" : C3426d4.i.C;
        }
        return C3426d4.i.D;
    }

    public static String translateOrientation(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "none" : C3426d4.i.C;
        }
        return C3426d4.i.D;
    }

    public static String translateRequestedOrientation(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 11) {
                    if (i10 != 12) {
                        switch (i10) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return C3426d4.i.D;
        }
        return C3426d4.i.C;
    }

    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    private static int a() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f31226j;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C3676r4.d().a(e10);
            Logger.d(f31217a, "Failed decoding string " + e10.getMessage());
            return "";
        }
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%20");
        } catch (UnsupportedEncodingException e10) {
            C3676r4.d().a(e10);
            return "";
        }
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(strOptString) ? strOptString : jSONObject.optString("demandSourceName");
    }

    public static String getAdvertiserId() {
        return f31218b;
    }

    public static String getControllerConfig() {
        return f31223g;
    }

    public static String getControllerUrl() {
        if (TextUtils.isEmpty(f31221e)) {
            return !TextUtils.isEmpty(f31220d) ? f31220d : "";
        }
        return f31221e;
    }

    public static int getDebugMode() {
        return f31222f;
    }

    public static String getFileName(String str) {
        String[] strArrSplit = str.split(File.separator);
        try {
            return URLEncoder.encode(strArrSplit[strArrSplit.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f31224h;
    }

    public static String getLimitAdTracking() {
        return f31219c;
    }

    public static String getMD5(String str) {
        try {
            String string = new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes())).toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
            return string;
        } catch (NoSuchAlgorithmException e10) {
            C3676r4.d().a(e10);
            throw new RuntimeException(e10);
        }
    }

    public static C3714t8.e getProductType(String str) {
        C3714t8.e eVar = C3714t8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C3714t8.e eVar2 = C3714t8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        return null;
    }

    public static String getTesterParameters() {
        return f31225i;
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity) || (activity instanceof InlineStoreActivity);
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap map = new HashMap();
        if (mapArr == null) {
            return map;
        }
        for (Map<String, String> map2 : mapArr) {
            if (map2 != null) {
                map.putAll(map2);
            }
        }
        return map;
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f31223g = str;
        Lb.O().y().a(getControllerConfigAsJSONObject());
    }

    public static void setControllerUrl(String str) {
        f31220d = str;
    }

    public static void setCustomControllerUrl(String str) {
        f31221e = str;
    }

    public static void setDebugMode(int i10) {
        f31222f = i10;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f31224h = map;
    }

    public static void setTesterParameters(String str) {
        f31225i = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new a()).show();
    }

    public static boolean copyFileFromBundleToStorage(Context context, C8 c10) {
        int iSaveFile;
        byte[] bArrA = C3533j4.a(context, c10.getName());
        if (bArrA == null || bArrA.length == 0) {
            return false;
        }
        try {
            iSaveFile = IronSourceStorageUtils.saveFile(bArrA, c10.getPath());
        } catch (Exception e10) {
            IronLog.INTERNAL.error("exception: " + e10.getMessage());
            iSaveFile = 0;
        }
        if (iSaveFile == 0) {
            IronLog.INTERNAL.verbose("failed to read bytes for " + c10.getName());
            return false;
        }
        return true;
    }

    public static int dpToPx(long j10) {
        return (int) ((j10 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return IronSourceVideoBridge.jsonObjectInit(getControllerConfig());
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return IronSourceVideoBridge.jsonObjectInit();
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(C3426d4.d.f28463b);
    }

    public static JSONObject getOrientation(Context context) {
        B7 b7I = Lb.U().i();
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("orientation", translateOrientation(b7I.z(context)));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit;
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        B7 b7I = Lb.U().i();
        String strI = b7I.I(context);
        String strB = b7I.b(context);
        if (!TextUtils.isEmpty(strI)) {
            f31218b = strI;
        }
        if (!TextUtils.isEmpty(strB)) {
            f31219c = strB;
        }
    }

    public static int pxToDp(long j10) {
        return (int) ((j10 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static void updateControllerConfig(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(f31223g);
            jSONObjectJsonObjectInit.put(str, jSONObject);
            f31223g = jSONObjectJsonObjectInit.toString();
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            Logger.i(f31217a, "Unable to update controllerConfigs: " + e10.toString());
        }
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObjectJsonObjectInit.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e10) {
                    C3676r4.d().a(e10);
                    Logger.i(f31217a, "flatMapToJsonAsStringfailed " + e10.toString());
                }
                it.remove();
            }
        }
        return jSONObjectJsonObjectInit.toString();
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(C3426d4.a.f28409b);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObjectJsonObjectInit;
        }
    }

    public static JSONObject getNetworkFeatureConfiguration() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            JSONObject jSONObjectOptJSONObject = getNetworkConfiguration().optJSONObject("features");
            if (jSONObjectOptJSONObject != null) {
                return jSONObjectOptJSONObject;
            }
            return jSONObjectJsonObjectInit;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObjectJsonObjectInit;
        }
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return IronSourceVideoBridge.jsonObjectInit(str).getString(str2);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return null;
        }
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                jSONObjectJsonObjectInit.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObjectJsonObjectInit;
    }
}
