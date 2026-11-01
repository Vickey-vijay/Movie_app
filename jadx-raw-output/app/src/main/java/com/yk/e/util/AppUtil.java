package com.yk.e.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class AppUtil {
    public static void installApk(Context context, String str) {
    }

    public static File getCacheDirectory(Context context) {
        String externalStorageState;
        File cacheDir;
        try {
            externalStorageState = Environment.getExternalStorageState();
            AdLog.i("getCacheDirectory", "externalStorageState = " + externalStorageState);
        } catch (NullPointerException unused) {
            externalStorageState = "";
        }
        if ("mounted".equals(externalStorageState)) {
            cacheDir = getExternalCacheDir(context);
            AdLog.i("getCacheDirectory", "ExternalCacheDir = " + cacheDir);
        } else {
            cacheDir = null;
        }
        if (cacheDir == null) {
            cacheDir = context.getCacheDir();
            AdLog.i("getCacheDirectory", "CacheDir = " + cacheDir);
        }
        if (cacheDir != null) {
            return cacheDir;
        }
        File file = new File("/data/data/" + context.getPackageName() + "/cache/");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("cache = ");
        sb2.append(file);
        AdLog.i("getCacheDirectory", sb2.toString());
        return file;
    }

    private static File getExternalCacheDir(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), C3426d4.f28386d), "data"), context.getPackageName()), "cache");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static List<String> getPkgListNew(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            for (PackageInfo packageInfo : context.getPackageManager().getInstalledPackages(5)) {
                if (!isSystemApp(packageInfo)) {
                    arrayList.add(packageInfo.packageName);
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return arrayList;
    }

    private static boolean isSystemApp(PackageInfo packageInfo) {
        int i10 = packageInfo.applicationInfo.flags;
        return ((i10 & 1) == 1) || ((i10 & 128) == 1);
    }

    public static String getAppName(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getPackageInfo(context.getPackageName(), 0).applicationInfo).toString();
        } catch (Exception e10) {
            AdLog.e("getAppName err, msg = " + e10.getMessage(), e10);
            return "";
        }
    }

    public static String getAppSHA1(Context context) {
        return getAppSHA1ByPackage(context, context.getPackageName());
    }

    public static String getAppSHA1ByPackage(Context context, String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                String upperCase = Integer.toHexString(b10 & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    sb2.append("0");
                }
                sb2.append(upperCase);
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            String string = sb2.toString();
            return string.substring(0, string.length() - 1);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e10) {
            AdLog.e("getAppSHA1ByPackage err, msg = " + e10.getMessage(), e10);
            return null;
        }
    }

    public static String getAppVersionName(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getPackageName(Context context, String str) {
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 1);
        if (packageArchiveInfo != null) {
            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
            AdLog.i("appInfo.packageName = " + applicationInfo.packageName);
            return applicationInfo.packageName;
        }
        return null;
    }
}
