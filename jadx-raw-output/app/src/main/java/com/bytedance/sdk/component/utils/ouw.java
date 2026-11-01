package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.ouw$ouw, reason: collision with other inner class name */
    public static class C0098ouw {
        public static final Random ouw = ouw.ouw();
    }

    private static JSONObject lh(String str) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            try {
                String strOuw = ouw(str);
                if (TextUtils.isEmpty(strOuw)) {
                    jSONObject.put("message", str);
                    jSONObject.put("cypher", 0);
                } else {
                    jSONObject.put("message", strOuw);
                    jSONObject.put("cypher", 3);
                }
            } catch (Throwable th2) {
                ko.vt(th2.getMessage());
            }
        } catch (Throwable unused) {
            jSONObject.put("message", str);
            jSONObject.put("cypher", 0);
        }
        return jSONObject;
    }

    public static JSONObject ouw(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : lh(jSONObject.toString());
    }

    public static String vt(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String strYu = yu(str.substring(1, 33));
        String strSubstring = str.substring(33, 49);
        return (strSubstring == null || strYu == null) ? str : com.bytedance.sdk.component.yu.ouw.vt(str.substring(49), strSubstring, strYu);
    }

    private static String yu(String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return str.substring(16, 32) + str.substring(0, 16);
    }

    public static String ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strVt = vt();
        String strYu = yu(strVt);
        String strLh = lh();
        String strOuw = null;
        if (strYu != null && strLh != null) {
            strOuw = com.bytedance.sdk.component.yu.ouw.ouw(str, strLh, strYu);
        }
        return 3 + strVt + strLh + strOuw;
    }

    private static String vt() {
        String strOuw = ouw(16);
        if (strOuw == null || strOuw.length() != 32) {
            return null;
        }
        return strOuw;
    }

    private static String lh() {
        String strOuw = ouw(8);
        if (strOuw == null || strOuw.length() != 16) {
            return null;
        }
        return strOuw;
    }

    private static String ouw(int i10) {
        try {
            byte[] bArr = new byte[i10];
            C0098ouw.ouw.nextBytes(bArr);
            return fkw.ouw(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Random ouw() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }
}
