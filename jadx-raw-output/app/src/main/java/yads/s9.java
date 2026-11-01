package yads;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class s9 {
    public static String a(String str, String str2) {
        ck.w wVar = ck.w.f6066a;
        String str3 = String.format(Locale.US, str, Arrays.copyOf(new Object[]{str2}, 1));
        ck.p.i(str3, "format(...)");
        return str3;
    }
}
