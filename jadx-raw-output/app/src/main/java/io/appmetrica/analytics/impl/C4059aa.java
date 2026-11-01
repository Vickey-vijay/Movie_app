package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4059aa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4059aa f56344c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f56346b = new HashMap();

    public static final C4059aa a(Context context) {
        if (f56344c == null) {
            synchronized (ck.s.b(C4059aa.class)) {
                if (f56344c == null) {
                    f56344c = new C4059aa(context);
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        C4059aa c4059aa = f56344c;
        if (c4059aa != null) {
            return c4059aa;
        }
        ck.p.B("INSTANCE");
        return null;
    }

    public final synchronized C4666y9 b(String str) {
        Object c4666y9;
        HashMap map = this.f56346b;
        c4666y9 = map.get(str);
        if (c4666y9 == null) {
            c4666y9 = new C4666y9(this.f56345a, str);
            map.put(str, c4666y9);
        }
        return (C4666y9) c4666y9;
    }

    public C4059aa(Context context) {
        this.f56345a = context;
    }

    public final synchronized void a(String str) {
        this.f56346b.remove(str);
    }
}
