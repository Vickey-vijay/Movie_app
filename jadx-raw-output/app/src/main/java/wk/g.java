package wk;

import sk.d0;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f74143a = new d0("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f74144b = new d0("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z10) {
        return new f(z10);
    }

    public static /* synthetic */ a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
