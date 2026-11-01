package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.ironsource.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3414ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3414ca f28338a = new C3414ca();

    public static final <T> T a(T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    public static final boolean a(Object obj) {
        return a(obj, null, false, 6, null);
    }

    public static final boolean a(Object obj, String str) {
        ck.p.j(str, "errorMessage");
        return a(obj, str, false, 4, null);
    }

    private C3414ca() {
    }

    public static /* synthetic */ boolean a(Object obj, String str, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = "reference is null";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return a(obj, str, z10);
    }

    public static final boolean a(Object obj, String str, boolean z10) {
        ck.p.j(str, "errorMessage");
        if (obj != null) {
            return true;
        }
        if (z10) {
            throw new NullPointerException(str);
        }
        if (!z10) {
            IronLog.API.error(str);
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
