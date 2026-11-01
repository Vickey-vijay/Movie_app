package com.mbridge.msdk.mbsignalcommon.windvane;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: WindVaneUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f36144a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f36145b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f36146c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f36147d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f36148e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Map<String, String> f36149f = new HashMap();

    public static String a(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            boolean z10 = true;
            if (cCharAt > 255) {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(cCharAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(cCharAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase2);
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 >= 2) {
                        z10 = false;
                        break;
                    }
                    if (cArr[i11] == cCharAt) {
                        stringBuffer.append("\\" + cCharAt);
                        break;
                    }
                    i11++;
                }
                if (!z10) {
                    stringBuffer.append(cCharAt);
                }
            }
        }
        return new String(stringBuffer);
    }

    public static boolean f(String str) {
        for (String str2 : f36144a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    static {
        for (d dVar : d.values()) {
            f36149f.put(dVar.g(), dVar.d());
        }
    }

    public static String b(String str) {
        String str2 = f36149f.get(d(str));
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static Pattern c(String str) {
        if ("wv_hybrid:".equals(str)) {
            return f36148e;
        }
        if ("mraid:".equals(str)) {
            return f36146c;
        }
        if ("ssp:".equals(str)) {
            return f36147d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return f36148e;
        }
        return null;
    }

    public static String d(String str) {
        String path;
        int iLastIndexOf;
        if (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (iLastIndexOf = path.lastIndexOf(".")) == -1) {
            return "";
        }
        return path.substring(iLastIndexOf + 1);
    }

    public static boolean e(String str) {
        return b(str).startsWith("image");
    }
}
