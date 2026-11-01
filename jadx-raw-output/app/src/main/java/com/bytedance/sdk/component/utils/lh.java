package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.mbridge.msdk.foundation.tools.SameMD5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class lh {
    private static HashMap<String, ArrayList<String>> ouw = new HashMap<>();

    private static ArrayList<String> ouw(Context context, String str) {
        String packageName;
        if (context == null || (packageName = context.getPackageName()) == null) {
            return null;
        }
        if (ouw.get(str) != null) {
            return ouw.get(str);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            for (Signature signature : vt(context, packageName)) {
                String strOuw = "error!";
                if (SameMD5.TAG.equals(str)) {
                    strOuw = ouw(signature, SameMD5.TAG);
                } else if ("SHA1".equals(str)) {
                    strOuw = ouw(signature, "SHA1");
                } else if ("SHA256".equals(str)) {
                    strOuw = ouw(signature, "SHA256");
                }
                arrayList.add(strOuw);
            }
        } catch (Exception e10) {
            ko.yu(e10.toString());
        }
        ouw.put(str, arrayList);
        return arrayList;
    }

    private static Signature[] vt(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception e10) {
            ko.yu(e10.toString());
            return null;
        }
    }

    public static String ouw(Context context) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<String> arrayListOuw = ouw(context, "SHA1");
        if (arrayListOuw != null && arrayListOuw.size() != 0) {
            for (int i10 = 0; i10 < arrayListOuw.size(); i10++) {
                sb2.append(arrayListOuw.get(i10));
                if (i10 < arrayListOuw.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    private static String ouw(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "error!";
            }
            byte[] bArrDigest = messageDigest.digest(byteArray);
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3).toUpperCase());
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            return sb2.substring(0, sb2.length() - 1).toString();
        } catch (Exception e10) {
            ko.yu(e10.toString());
            return "error!";
        }
    }
}
