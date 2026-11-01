package com.fyber.inneractive.sdk.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile h0 f18194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f18195c = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f18196a = Collections.emptyMap();

    public static h0 a() {
        h0 h0Var = f18194b;
        if (h0Var == null) {
            synchronized (h0.class) {
                h0Var = f18194b;
                if (h0Var == null) {
                    Class cls = f0.f18184a;
                    h0 h0Var2 = null;
                    if (cls != null) {
                        try {
                            h0Var2 = (h0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    if (h0Var2 == null) {
                        h0Var2 = f18195c;
                    }
                    f18194b = h0Var2;
                    h0Var = h0Var2;
                }
            }
        }
        return h0Var;
    }

    public final x0 a(int i10, d2 d2Var) {
        return (x0) this.f18196a.get(new g0(i10, d2Var));
    }
}
