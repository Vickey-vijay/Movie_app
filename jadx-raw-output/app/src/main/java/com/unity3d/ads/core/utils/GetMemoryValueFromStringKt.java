package com.unity3d.ads.core.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lk.w;

/* JADX INFO: compiled from: GetMemoryValueFromString.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetMemoryValueFromStringKt {
    public static final long getMemoryValueFromString(String str) {
        Long lT;
        if (str == null) {
            return -1L;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        String strGroup = null;
        while (matcher.find()) {
            strGroup = matcher.group(1);
        }
        if (strGroup == null || (lT = w.t(strGroup)) == null) {
            return -1L;
        }
        return lT.longValue();
    }
}
