package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4131d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4082b7 f56551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4543tb f56552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4568ub f56553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4061ac f56554d;

    public final synchronized Ia a(Context context) {
        C4568ub c4568ub;
        c4568ub = this.f56553c;
        if (c4568ub == null) {
            c4568ub = new C4568ub(c(context));
            this.f56553c = c4568ub;
        }
        return c4568ub;
    }

    public final synchronized Ia b(Context context) {
        return c(context);
    }

    public final Ia c(Context context) {
        C4061ac c4061ac;
        C4543tb c4543tb = this.f56552b;
        if (c4543tb == null) {
            synchronized (this) {
                c4061ac = this.f56554d;
                if (c4061ac == null) {
                    C4082b7 c4082b7 = this.f56551a;
                    String strA = new C4056a7(c4082b7.f56415a, c4082b7.f56416b, true).a(context, new O3());
                    N6 n10 = AbstractC4637x5.f57915c;
                    n10.getClass();
                    HashMap map = new HashMap();
                    map.put("preferences", InterfaceC4562u5.f57754a);
                    C4278in c4278in = n10.f55611c;
                    X6 x10 = n10.f55609a;
                    T6 t10 = x10.f56137c;
                    U6 u10 = x10.f56138d;
                    C4468qa c4468qa = new C4468qa(false);
                    c4468qa.a(112, new P3());
                    C4356ln c4356ln = new C4356ln("service database", map);
                    c4278in.getClass();
                    c4061ac = new C4061ac(context, strA, new Z9(strA), new C4304jn(t10, u10, c4468qa, c4356ln));
                    this.f56554d = c4061ac;
                }
            }
            c4543tb = new C4543tb(c4061ac);
            this.f56552b = c4543tb;
        }
        return c4543tb;
    }

    public C4131d4(File file) {
        this.f56551a = new C4082b7(file);
    }
}
