package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class Eh extends Y4 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f55183w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final F6 f55184x;

    public Eh(@NonNull Context context, @NonNull R4 r10, @NonNull C4437p4 c4437p4, @NonNull F6 f10, @NonNull C4226gm c4226gm, @NonNull W4 w10, @NonNull InterfaceC4541t9 interfaceC4541t9) {
        this(context, r10, new C4307k0(), new TimePassedChecker(), new C4132d5(context, r10, c4437p4, w10, c4226gm, new C4699zh(f10), C4418oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C4418oa.k().l(), interfaceC4541t9), f10, c4437p4);
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Fa
    public final synchronized void a(@NonNull C4437p4 c4437p4) {
        super.a(c4437p4);
        this.f55184x.a(this.f55183w, c4437p4.f57483i);
    }

    public Eh(Context context, R4 r10, C4307k0 c4307k0, TimePassedChecker timePassedChecker, C4132d5 c4132d5, F6 f10, C4437p4 c4437p4) {
        super(context, r10, c4307k0, timePassedChecker, c4132d5, c4437p4);
        this.f55183w = r10.b();
        this.f55184x = f10;
    }
}
