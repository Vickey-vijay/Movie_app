package yads;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class tl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f83084a = kotlin.collections.a.m(mj.h.a(pb3.f81339c, "No ad view"), mj.h.a(pb3.f81340d, "No valid ads in ad unit"), mj.h.a(pb3.f81341e, "Ad is not visible for percent"), mj.h.a(pb3.f81342f, "Required asset %s is not visible in ad view"), mj.h.a(pb3.f81343g, "Ad view is null"), mj.h.a(pb3.f81344h, "Ad view is hidden"), mj.h.a(pb3.f81345i, "Visible area of an ad view is too small"));

    public static String a(tb3 tb3Var) {
        if (!(tb3Var instanceof qb3)) {
            return "Unknown error, that shouldn't happen";
        }
        qb3 qb3Var = (qb3) tb3Var;
        String str = qb3Var.f81799b;
        String str2 = (String) f83084a.get(qb3Var.f81798a);
        if (str2 == null) {
            return "Visibility error";
        }
        ck.w wVar = ck.w.f6066a;
        String str3 = String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
        ck.p.i(str3, "format(...)");
        return str3;
    }
}
