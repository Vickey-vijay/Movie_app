package com.yk.e.util;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.safedk.android.utils.Logger;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class StringUtil {
    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    @TargetApi(11)
    public static void copyText(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, str));
    }

    public static String encryptToMD5(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
            for (byte b10 : bArrDigest) {
                int i10 = b10 & 255;
                if (i10 < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i10));
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UnsupportedEncodingException", e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new RuntimeException("NoSuchAlgorithmException", e11);
        }
    }

    public static String getFileNameFromUrl(String str, String str2) {
        String strSubstring;
        int iIndexOf = str.indexOf("." + str2);
        if (iIndexOf != -1) {
            String strSubstring2 = str.substring(0, iIndexOf);
            strSubstring = strSubstring2.substring(strSubstring2.lastIndexOf("/") + 1, iIndexOf);
            if (strSubstring.length() > 10) {
                strSubstring = strSubstring.substring(0, 10);
            }
        } else {
            strSubstring = "";
        }
        return strSubstring + "." + str2;
    }

    public static boolean gotoProtocol(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int dip2px(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int getRandom(int i10, int i11) {
        return (int) ((Math.random() * ((double) ((i11 - i10) + 1))) + ((double) i10));
    }

    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

    public static boolean isAppInstalled(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 8192);
            return true;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }

    public static void openApp(Context context, String str) {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, context.getPackageManager().getLaunchIntentForPackage(str));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public static int px2dip(Context context, float f10) {
        return (int) ((f10 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int[] stretchView(Context context, View view, int i10, int i11, int i12) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (i10 == 0) {
            int screenWidth = ScreenUtil.getScreenWidth(context);
            layoutParams.width = screenWidth;
            layoutParams.height = (screenWidth * i12) / i11;
            view.setLayoutParams(layoutParams);
        } else {
            int screenHeight = ScreenUtil.getScreenHeight(context);
            layoutParams.height = screenHeight;
            layoutParams.width = (screenHeight * i11) / i12;
        }
        view.setLayoutParams(layoutParams);
        return new int[]{layoutParams.width, layoutParams.height};
    }
}
