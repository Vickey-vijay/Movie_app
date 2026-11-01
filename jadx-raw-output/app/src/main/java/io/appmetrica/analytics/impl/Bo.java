package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class Bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f55045b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xo f55046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xo f55047d;

    public final xo a() {
        return this.f55046c;
    }

    public final xo b() {
        return this.f55047d;
    }

    public Bo(Context context) {
        this.f55044a = context;
        C4111ca c4111ca = new C4111ca(context, "appmetrica_vital.dat");
        this.f55046c = new xo(C4418oa.k().y(), c4111ca);
        this.f55047d = new xo(new C4064af(C4418oa.k().B().e(context)), c4111ca);
    }
}
