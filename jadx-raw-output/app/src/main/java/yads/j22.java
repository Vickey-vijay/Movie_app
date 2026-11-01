package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class j22 {
    public static Float a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            ck.w wVar = ck.w.f6066a;
            ck.p.i(String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            boolean z10 = ad1.f75480a;
            return null;
        }
    }
}
