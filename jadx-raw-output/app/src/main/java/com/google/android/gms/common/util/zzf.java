package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzf {
    private static final Pattern zza = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String zza(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = zza.matcher(str);
            StringBuilder sb2 = null;
            int iEnd = 0;
            while (matcher.find()) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                int iStart = matcher.start();
                int i10 = iStart;
                while (i10 >= 0 && str.charAt(i10) == '\\') {
                    i10--;
                }
                if ((iStart - i10) % 2 != 0) {
                    int i11 = Integer.parseInt(matcher.group().substring(2), 16);
                    sb2.append((CharSequence) str, iEnd, matcher.start());
                    if (i11 == 92) {
                        sb2.append("\\\\");
                    } else {
                        sb2.append(Character.toChars(i11));
                    }
                    iEnd = matcher.end();
                }
            }
            if (sb2 != null) {
                if (iEnd < matcher.regionEnd()) {
                    sb2.append((CharSequence) str, iEnd, matcher.regionEnd());
                }
                return sb2.toString();
            }
            return str;
        }
        return str;
    }
}
