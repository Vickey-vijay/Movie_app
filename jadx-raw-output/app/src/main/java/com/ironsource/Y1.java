package com.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final class Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y1 f27889a = new Y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f27890b = "trials_fail";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f27891c = "parsing";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f27892d = "other";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f27893e = "disabled";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f27894f = "-1";

    public final String a(boolean z10) {
        if (!z10) {
            return f27894f;
        }
        return "fallback_" + System.currentTimeMillis();
    }

    public static /* synthetic */ String a(Y1 y10, boolean z10, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return y10.a(z10, num);
    }

    private Y1() {
    }

    public final String a(boolean z10, Integer num) {
        if (!z10) {
            return f27893e;
        }
        if ((num != null && num.intValue() == 1003) || ((num != null && num.intValue() == 1008) || (num != null && num.intValue() == 1002))) {
            return f27891c;
        }
        return ((num != null && num.intValue() == 1006) || (num != null && num.intValue() == 1001)) ? f27890b : "other";
    }
}
