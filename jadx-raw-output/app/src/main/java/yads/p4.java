package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public abstract class p4 {
    public static final void a(String str, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            String str2 = String.format("Found following errors for %s ad type: %s", Arrays.copyOf(new Object[]{str, nj.b0.p0(arrayList, "\n - ", "\n - ", null, 0, null, null, 60, null)}, 2));
            ck.p.i(str2, "format(...)");
            lc1.a(str2, new Object[0]);
        }
    }

    public static final void a(String str) {
        String str2 = String.format("Ad type %s was integrated successfully", Arrays.copyOf(new Object[]{str}, 1));
        ck.p.i(str2, "format(...)");
        lc1.b(str2, new Object[0]);
    }
}
