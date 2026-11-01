package yads;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class f61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e61 f77309a = new e61(co2.E, co2.D, co2.F, co2.G);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e61 f77310b = new e61(co2.f76365p, co2.f76364o, co2.f76366q, co2.f76367r);

    public static e61 a(va vaVar) {
        int iOrdinal = vaVar.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return f77310b;
            }
            throw new NoWhenBranchMatchedException();
        }
        return f77309a;
    }
}
