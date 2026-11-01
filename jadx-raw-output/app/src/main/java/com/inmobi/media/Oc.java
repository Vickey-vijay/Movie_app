package com.inmobi.media;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Oc {
    public static final String a(String str, Mc mc2, Map map) {
        ck.p.j(str, "<this>");
        ck.p.j(mc2, "nativeBeaconModel");
        ck.p.j(map, "extraMacros");
        String strN = lk.x.N(lk.x.N(lk.x.N(str, "$TS", String.valueOf(System.currentTimeMillis()), false, 4, null), "$LTS", String.valueOf(mc2.f23155a.f24108g), false, 4, null), "$STS", String.valueOf(mc2.f23155a.f24105d), false, 4, null);
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb2 = new StringBuilder();
        int iNextInt = 0;
        while (iNextInt == 0) {
            iNextInt = (secureRandom.nextInt() & Integer.MAX_VALUE) % 10;
        }
        sb2.append(iNextInt);
        for (int i10 = 1; i10 < 8; i10++) {
            sb2.append((secureRandom.nextInt() & Integer.MAX_VALUE) % 10);
        }
        String string = sb2.toString();
        ck.p.i(string, "toString(...)");
        String strN2 = lk.x.N(strN, "[CACHEBUSTING]", string, false, 4, null);
        String str2 = mc2.f23156b;
        if (str2 != null) {
            strN2 = lk.x.N(strN2, "[UNIVERSALADID]", str2, false, 4, null);
        }
        String strN3 = strN2;
        String str3 = mc2.f23157c;
        if (str3 != null) {
            strN3 = lk.x.N(strN3, "[ADSERVINGID]", str3, false, 4, null);
        }
        String strN4 = strN3;
        String str4 = mc2.f23158d;
        if (str4 != null) {
            strN4 = lk.x.N(strN4, "[ASSETURI]", str4, false, 4, null);
        }
        int i11 = mc2.f23159e;
        ck.w wVar = ck.w.f6066a;
        Locale locale = Locale.US;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j10 = i11;
        String str5 = String.format(locale, "%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(j10))), Long.valueOf(timeUnit.toSeconds(j10) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j10))), Long.valueOf(j10 - (timeUnit.toSeconds(j10) * ((long) 1000)))}, 4));
        ck.p.i(str5, "format(...)");
        String strN5 = lk.x.N(strN4, "[CONTENTPLAYHEAD]", str5, false, 4, null);
        String strN6 = strN5;
        for (Map.Entry entry : map.entrySet()) {
            strN6 = lk.x.N(strN6, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return strN6;
    }
}
