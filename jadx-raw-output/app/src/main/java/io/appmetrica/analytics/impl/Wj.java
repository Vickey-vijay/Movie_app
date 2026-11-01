package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: loaded from: classes7.dex */
public final class Wj extends Y4 {
    public Wj(@NonNull Context context, @NonNull C4226gm c4226gm, @NonNull R4 r10, @NonNull C4437p4 c4437p4, @NonNull InterfaceC4272ih interfaceC4272ih, @NonNull W4 w10, @NonNull Q4 q10) {
        this(context, r10, new C4307k0(), new TimePassedChecker(), new C4132d5(context, r10, c4437p4, w10, c4226gm, interfaceC4272ih, C4418oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C4418oa.k().l(), q10), c4437p4);
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Fa
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public Wj(Context context, R4 r10, C4307k0 c4307k0, TimePassedChecker timePassedChecker, C4132d5 c4132d5, C4437p4 c4437p4) {
        super(context, r10, c4307k0, timePassedChecker, c4132d5, c4437p4);
    }
}
