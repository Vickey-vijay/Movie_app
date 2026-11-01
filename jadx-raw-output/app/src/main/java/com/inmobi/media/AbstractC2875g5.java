package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsService;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2875g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f24406a;

    public static final String a(Context context) {
        C3298x5.f25687a.getClass();
        if (!C3298x5.u()) {
            return null;
        }
        if (context == null || f24406a != null) {
            return f24406a;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ck.p.i(listQueryIntentActivities, "queryIntentActivities(...)");
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    String str2 = resolveInfo.activityInfo.packageName;
                    ck.p.i(str2, HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                    arrayList.add(str2);
                }
            }
            if (arrayList.isEmpty()) {
                f24406a = null;
            } else if (arrayList.size() == 1) {
                f24406a = (String) arrayList.get(0);
            } else if (!TextUtils.isEmpty(str) && !a(context, intent) && nj.b0.U(arrayList, str)) {
                f24406a = str;
            } else if (arrayList.contains("com.android.chrome")) {
                f24406a = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f24406a = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f24406a = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                f24406a = "com.google.android.apps.chrome";
            }
        } catch (Exception unused) {
        }
        return f24406a;
    }

    public static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            ck.p.i(listQueryIntentActivities, "queryIntentActivities(...)");
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            Log.e("g5", "Runtime exception while getting specialized handlers");
            return false;
        }
    }
}
