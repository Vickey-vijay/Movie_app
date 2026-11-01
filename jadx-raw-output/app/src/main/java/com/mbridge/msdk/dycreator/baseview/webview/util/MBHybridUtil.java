package com.mbridge.msdk.dycreator.baseview.webview.util;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class MBHybridUtil {
    public static String convert2Unicode(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuilder sb2 = new StringBuilder(1000);
        sb2.setLength(0);
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            boolean z10 = true;
            if (cCharAt > 255) {
                sb2.append("\\u");
                String upperCase = Integer.toHexString(cCharAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    sb2.append("0");
                }
                sb2.append(upperCase);
                String upperCase2 = Integer.toHexString(cCharAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    sb2.append("0");
                }
                sb2.append(upperCase2);
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 >= 2) {
                        z10 = false;
                        break;
                    }
                    if (cArr[i11] == cCharAt) {
                        sb2.append("\\" + cCharAt);
                        break;
                    }
                    i11++;
                }
                if (!z10) {
                    sb2.append(cCharAt);
                }
            }
        }
        return new String(sb2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("MBHybridUtil", r7.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getQueryParameters(android.net.Uri r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r7.getEncodedQuery()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r3 = 0
        L11:
            r4 = 38
            int r4 = r1.indexOf(r4, r3)
            r5 = -1
            if (r4 != r5) goto L1e
            int r4 = r1.length()
        L1e:
            r6 = 61
            int r6 = r1.indexOf(r6, r3)
            if (r6 > r4) goto L28
            if (r6 != r5) goto L29
        L28:
            r6 = r4
        L29:
            java.lang.String r3 = r1.substring(r3, r6)
            java.lang.String r3 = android.net.Uri.decode(r3)
            r2.add(r3)
            int r3 = r4 + 1
            int r4 = r1.length()
            if (r3 < r4) goto L11
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5e
            r1.<init>()     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L5e
        L45:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = r7.getQueryParameter(r3)     // Catch: java.lang.Throwable -> L5e
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L45
        L59:
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L5e
            return r7
        L5e:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()
            java.lang.String r1 = "MBHybridUtil"
            com.mbridge.msdk.foundation.tools.q0.b(r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.webview.util.MBHybridUtil.getQueryParameters(android.net.Uri):java.lang.String");
    }

    public static Set<String> getQueryParameterNames(Uri uri) {
        if (uri == null) {
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        do {
            int iIndexOf = encodedQuery.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = encodedQuery.length();
            }
            int iIndexOf2 = encodedQuery.indexOf(61, i10);
            if (iIndexOf2 > iIndexOf || iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i10, iIndexOf2)));
            i10 = iIndexOf + 1;
        } while (i10 < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static String getImageMimeType(String str) {
        String strSubstring;
        int iLastIndexOf;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String path = Uri.parse(str).getPath();
        if (path == null || (iLastIndexOf = path.lastIndexOf(".")) == -1) {
            strSubstring = "";
        } else {
            strSubstring = path.substring(iLastIndexOf + 1);
        }
        strSubstring.hashCode();
        switch (strSubstring) {
            case "gif":
                return "image/gif";
            case "jpg":
            case "jpeg":
                return "image/jpeg";
            case "png":
                return "image/png";
            case "webp":
                return "image/webp";
            default:
                return "";
        }
    }
}
