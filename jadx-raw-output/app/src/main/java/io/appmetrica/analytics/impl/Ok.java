package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jk f55703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Nk f55704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IBinaryDataHelper f55705d;

    public final Map a() {
        try {
            byte[] bArr = this.f55705d.get(this.f55702a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f55703b.toModel(this.f55704c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Jk jk2 = this.f55703b;
        this.f55704c.getClass();
        return jk2.toModel(new Lk());
    }

    public Ok(Context context, R4 r10) {
        r10.a();
        this.f55702a = "session_extras";
        this.f55703b = new Jk();
        this.f55704c = new Nk();
        this.f55705d = C4418oa.k().B().a(context, r10);
    }
}
