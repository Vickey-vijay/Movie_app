package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f43962a = "(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f43963b = "(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f43964c = "ParserBase";

    public static String a(String str, boolean z10) {
        String strK;
        if (z10) {
            try {
                strK = k.k(str);
            } catch (Throwable th2) {
                Logger.d(f43964c, "CDATA info decode failed: " + str);
                strK = str;
            }
        } else {
            strK = str;
        }
        List<String> listA = a(com.safedk.android.utils.f.w(), strK, 1, false);
        return (listA.size() > 0 ? listA.get(0) : str).trim();
    }

    public static List<String> a(Pattern pattern, String str, int i10, boolean z10) {
        String strGroup;
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            if (i10 >= 0) {
                strGroup = matcher.group(i10);
            } else {
                strGroup = matcher.group();
            }
            if (strGroup != null) {
                if (z10) {
                    arrayList.add(k.k(strGroup.trim()));
                } else {
                    arrayList.add(strGroup.trim());
                }
            }
        }
        return arrayList;
    }

    public static List<String> a(Pattern pattern, String str, int i10, int i11, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(i10);
            String strGroup2 = matcher.group(i11);
            if (strGroup != null) {
                if (z10) {
                    arrayList.add(k.k(strGroup.trim()));
                } else {
                    arrayList.add(strGroup.trim());
                }
            }
            if (strGroup2 != null) {
                if (z10) {
                    arrayList.add(k.k(strGroup2.trim()));
                } else {
                    arrayList.add(strGroup2.trim());
                }
            }
        }
        return arrayList;
    }
}
