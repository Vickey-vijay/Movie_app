package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4258i2 extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yo f56936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Yj f56937c;

    public C4258i2(@NonNull Y4 y10) {
        this(y10, y10.u(), Yj.c());
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q10) {
        Y4 y10 = this.f55865a;
        if (!this.f56936b.c() && !this.f56936b.d()) {
            if (((C4350lh) y10.f56209k.a()).f57201e) {
                this.f56937c.b();
            }
            N8 n10 = this.f55865a.f56210l;
            if (n10.f55616c == null) {
                n10.a();
            }
            P8 p10 = n10.f55616c;
            p10.getClass();
            p10.f55727b = new HashSet();
            p10.f55729d = 0;
            P8 p11 = n10.f55616c;
            p11.f55726a = true;
            S8 s10 = n10.f55615b;
            IBinaryDataHelper iBinaryDataHelper = s10.f55857c;
            R8 r10 = s10.f55856b;
            s10.f55855a.getClass();
            iBinaryDataHelper.insert("event_hashes", r10.toByteArray(Q8.a(p11)));
        }
        return false;
    }

    public C4258i2(Y4 y10, yo yoVar, Yj yj2) {
        super(y10);
        this.f56936b = yoVar;
        this.f56937c = yj2;
    }
}
