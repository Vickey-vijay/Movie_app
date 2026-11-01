package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class S8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q8 f55855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R8 f55856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinaryDataHelper f55857c;

    public S8(Context context, R4 r10) {
        this(new R8(), new Q8(), C4418oa.k().B().a(context, r10));
    }

    public S8(R8 r10, Q8 q10, IBinaryDataHelper iBinaryDataHelper) {
        this.f55856b = r10;
        this.f55855a = q10;
        this.f55857c = iBinaryDataHelper;
    }
}
