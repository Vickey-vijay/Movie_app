package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Objects;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4519sc extends C4132d5 {
    public C4519sc(@NonNull Context context, @NonNull R4 r10, @NonNull C4437p4 c4437p4, @NonNull W4 w10, @NonNull C4226gm c4226gm, @NonNull InterfaceC4272ih interfaceC4272ih, @NonNull ICommonExecutor iCommonExecutor, int i10, @NonNull C4353lk c4353lk, @NonNull Gb gb2, @NonNull InterfaceC4541t9 interfaceC4541t9) {
        super(context, r10, c4437p4, w10, c4226gm, interfaceC4272ih, iCommonExecutor, i10, gb2, interfaceC4541t9);
    }

    @NonNull
    public final C4474qg a(@NonNull C4470qc c4470qc) {
        C4347le c4347le = new C4347le(c4470qc);
        Objects.requireNonNull(c4470qc);
        return new C4474qg(c4347le, new C4445pc(c4470qc), c4470qc);
    }

    @Override // io.appmetrica.analytics.impl.C4132d5
    @NonNull
    public final InterfaceC4491r9 a(@NonNull InterfaceC4616w9 interfaceC4616w9, @NonNull M6 m10, @NonNull Rg rg2, @NonNull C4437p4 c4437p4, @NonNull R4 r10, @NonNull Xe xe2) {
        return this.f56566l.a(interfaceC4616w9, m10, rg2, c4437p4, r10, xe2).a();
    }
}
