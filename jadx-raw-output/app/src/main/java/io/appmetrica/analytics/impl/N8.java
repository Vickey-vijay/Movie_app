package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class N8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S8 f55615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P8 f55616c;

    public final void a() {
        P8 p10;
        S8 s10 = this.f55615b;
        s10.getClass();
        try {
            byte[] bArr = s10.f55857c.get("event_hashes");
            if (bArr == null || bArr.length == 0) {
                Q8 q10 = s10.f55855a;
                s10.f55856b.getClass();
                C4591v9 c4591v9 = new C4591v9();
                q10.getClass();
                p10 = new P8(c4591v9.f57814a, c4591v9.f57815b, c4591v9.f57816c, CollectionUtils.hashSetFromIntArray(c4591v9.f57817d));
            } else {
                Q8 q11 = s10.f55855a;
                C4591v9 state = s10.f55856b.toState(bArr);
                q11.getClass();
                p10 = new P8(state.f57814a, state.f57815b, state.f57816c, CollectionUtils.hashSetFromIntArray(state.f57817d));
            }
        } catch (Throwable unused) {
            Q8 q12 = s10.f55855a;
            s10.f55856b.getClass();
            C4591v9 c4591v10 = new C4591v9();
            q12.getClass();
            p10 = new P8(c4591v10.f57814a, c4591v10.f57815b, c4591v10.f57816c, CollectionUtils.hashSetFromIntArray(c4591v10.f57817d));
        }
        this.f55616c = p10;
        int i10 = p10.f55728c;
        int i11 = this.f55614a;
        if (i10 != i11) {
            p10.f55728c = i11;
            p10.f55729d = 0;
            S8 s11 = this.f55615b;
            IBinaryDataHelper iBinaryDataHelper = s11.f55857c;
            R8 r10 = s11.f55856b;
            s11.f55855a.getClass();
            iBinaryDataHelper.insert("event_hashes", r10.toByteArray(Q8.a(p10)));
        }
    }

    public N8(S8 s10, int i10) {
        this.f55614a = i10;
        this.f55615b = s10;
    }
}
