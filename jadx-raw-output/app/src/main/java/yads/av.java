package yads;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class av {
    public static String a(yu yuVar) {
        if (yuVar instanceof uu) {
            String str = ((uu) yuVar).f83614a.f82640h;
            return str == null ? "unknown" : str;
        }
        if (yuVar instanceof vu) {
            return "default";
        }
        if (yuVar instanceof wu) {
            return "empty";
        }
        if (yuVar instanceof xu) {
            return "error";
        }
        throw new NoWhenBranchMatchedException();
    }
}
