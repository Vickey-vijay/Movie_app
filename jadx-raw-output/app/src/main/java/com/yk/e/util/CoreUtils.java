package com.yk.e.util;

import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.safedk.android.utils.Logger;
import com.yk.e.object.MainParams;
import com.yk.e.object.PreCacheParams;
import io.bidmachine.unified.UnifiedMediationParams;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CoreUtils {
    public static void addCacheImgAdsID(Context context, MainParams mainParams) {
        if (mainParams == null) {
            AdLog.i("addCacheImgAdsID, mainParams is null");
            return;
        }
        addCacheImgAdsID(context, mainParams.adID + "_" + mainParams.materialId);
    }

    public static void addCacheVideoAdsID(Context context, MainParams mainParams) {
        if (mainParams == null) {
            AdLog.i("addCacheVideoAdsID, mainParams is null");
            return;
        }
        addCacheVideoAdsID(context, mainParams.adID + "_" + mainParams.materialId);
    }

    public static byte[] getBytesFromAssets(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().getAssets().open(str));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = bufferedInputStream.read(bArr);
                if (i10 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Exception unused) {
            AdLog.e("getBytesFromAssets error!!!!!! file is not exist");
            return null;
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public static synchronized void addCacheResourceAdsID(Context context, String str) {
        try {
            UsLocalSaveHelper.getInstance().getCacheImgList().add(str);
            List<String> cacheImgList = UsLocalSaveHelper.getInstance().getCacheImgList();
            LinkedHashSet linkedHashSet = new LinkedHashSet(cacheImgList);
            cacheImgList.clear();
            cacheImgList.addAll(linkedHashSet);
            saveCacheResourceId2SP(context, cacheImgList);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public static byte[] createChecksum(String str) throws Exception {
        int i10;
        FileInputStream fileInputStream = new FileInputStream(str);
        byte[] bArr = new byte[1024];
        MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        do {
            i10 = fileInputStream.read(bArr);
            if (i10 > 0) {
                messageDigest.update(bArr, 0, i10);
            }
        } while (i10 != -1);
        fileInputStream.close();
        return messageDigest.digest();
    }

    public static synchronized JSONArray getCacheFileAdsidJSArray(Context context) {
        JSONArray jSONArray;
        jSONArray = new JSONArray();
        try {
            ArrayList arrayList = new ArrayList(UsLocalSaveHelper.getInstance().getCacheImgList());
            int iMin = Math.min(arrayList.size(), 100);
            for (int i10 = 0; i10 < iMin; i10++) {
                jSONArray.put(arrayList.remove(arrayList.size() - 1));
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        return jSONArray;
    }

    public static List<String> getCacheResourceId4SP(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            String string = getCacheResourceIdSp(context).getString(Constant.SP_TAG_CACHE_IDS, "");
            if (!TextUtils.isEmpty(string)) {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add((String) jSONArray.get(i10));
                }
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        return arrayList;
    }

    private static SharedPreferences getCacheResourceIdSp(Context context) {
        return context.getSharedPreferences(Constant.fileAdCacheID, 0);
    }

    public static String getCurProcessName(Context context) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == Process.myPid() && (str = runningAppProcessInfo.processName) != null) {
                return str;
            }
        }
        return null;
    }

    public static String getFilenameFromURL(String str) {
        try {
            String path = new URL(str).getPath();
            String strSubstring = path.substring(path.lastIndexOf(47) + 1);
            int iLastIndexOf = strSubstring.lastIndexOf(46);
            return iLastIndexOf != -1 ? strSubstring.substring(0, iLastIndexOf) : strSubstring;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            return "media_" + System.currentTimeMillis();
        }
    }

    public static String getUrlFileName(String str) {
        try {
            return str.substring(str.lastIndexOf("/") + 1);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            return "";
        }
    }

    public static boolean isMainThread() {
        return new Handler(Looper.getMainLooper()).getLooper() == Looper.myLooper();
    }

    public static boolean isServiceRunning(Context context, Class<?> cls) {
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (cls.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static void openBrowser(Context context, String str) {
        AdLog.d("打开外部浏览器, url = " + str);
        Intent intent = new Intent();
        try {
            Uri uri = Uri.parse(str);
            intent.setAction("android.intent.action.VIEW");
            intent.setData(uri);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        } catch (ActivityNotFoundException unused) {
            AdLog.e("openBrowser error, msg= Activity was not found for intent, " + intent.toString());
        } catch (Exception e10) {
            AdLog.e("openBrowser error, msg=" + e10.getMessage());
        }
    }

    public static List<PreCacheParams> parsePreloadCacheList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        PreCacheParams preCacheParams = new PreCacheParams();
                        preCacheParams.setAdsID(jSONObject.optString("AdsID"));
                        preCacheParams.setFeeTypeID(jSONObject.optString("FeeTypeID"));
                        preCacheParams.setHeight(jSONObject.optString("height"));
                        preCacheParams.setWidth(jSONObject.optString("width"));
                        preCacheParams.setImgUrl(jSONObject.optString("imgUrl"));
                        preCacheParams.setVideoUrl(jSONObject.optString(UnifiedMediationParams.KEY_VIDEO_URL));
                        preCacheParams.setM3u8Url(jSONObject.optString("m3u8Url"));
                        preCacheParams.setFileAlias(jSONObject.optString("fileAlias"));
                        arrayList.add(preCacheParams);
                    }
                }
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
            }
        }
        return arrayList;
    }

    private static synchronized void saveCacheResourceId2SP(Context context, List<String> list) {
        try {
            SharedPreferences cacheResourceIdSp = getCacheResourceIdSp(context);
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            SharedPreferences.Editor editorEdit = cacheResourceIdSp.edit();
            editorEdit.putString(Constant.SP_TAG_CACHE_IDS, jSONArray.toString());
            editorEdit.apply();
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public static List<JSONArray> sliceJsonArray(JSONArray jSONArray, int i10) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < jSONArray.length()) {
            try {
                JSONArray jSONArray2 = new JSONArray();
                int iMin = Math.min(i10, jSONArray.length() - i11);
                for (int i12 = 0; i12 < iMin; i12++) {
                    jSONArray2.put(i12, jSONArray.opt(i11 + i12));
                }
                arrayList.add(jSONArray2);
                i11 += i10;
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
            }
        }
        return arrayList;
    }

    public boolean isProcessRunning(Context context, String str) {
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses().iterator();
        while (it.hasNext()) {
            if (it.next().processName.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void addCacheImgAdsID(Context context, String str) {
        addCacheResourceAdsID(context, str);
    }

    public static void addCacheVideoAdsID(Context context, String str) {
        addCacheResourceAdsID(context, str);
    }

    public static String getMD5Checksum(String str) throws Exception {
        String str2 = "";
        for (byte b10 : createChecksum(str)) {
            str2 = str2 + Integer.toString((b10 & 255) + 256, 16).substring(1);
        }
        return str2;
    }

    public static void initCacheAdsID(Context context) {
        UsLocalSaveHelper.getInstance().setCacheImgList(getCacheResourceId4SP(context));
    }
}
