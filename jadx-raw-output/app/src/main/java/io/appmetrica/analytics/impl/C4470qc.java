package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4470qc extends Y4 implements Na, Ma {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C4374mg f57561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C4474qg f57562x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final F6 f57563y;

    public C4470qc(@NonNull Context context, @NonNull C4226gm c4226gm, @NonNull R4 r10, @NonNull C4437p4 c4437p4, @NonNull C4374mg c4374mg, @NonNull F6 f10, @NonNull W4 w10) {
        this(context, r10, c4437p4, new C4307k0(), new TimePassedChecker(), new C4519sc(context, r10, c4437p4, w10, c4226gm, new C4345lc(f10), C4418oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C4418oa.k().w(), C4418oa.k().l(), new C4190fc()), c4374mg, f10);
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Fa
    public final synchronized void a(@NonNull C4437p4 c4437p4) {
        super.a(c4437p4);
        this.f57563y.a(c4437p4.f57483i);
    }

    @Override // io.appmetrica.analytics.impl.Y4
    public final void C() {
        this.f57561w.a(this.f57562x);
    }

    public final boolean D() {
        boolean zOptBoolean;
        yo yoVar = this.f56218t;
        synchronized (yoVar) {
            zOptBoolean = yoVar.f58037a.a().optBoolean("referrer_handled", false);
        }
        return zOptBoolean;
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Fa
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final void a() {
        yo yoVar = this.f56218t;
        synchronized (yoVar) {
            zo zoVar = yoVar.f58037a;
            zoVar.a(zoVar.a().put("referrer_handled", true));
        }
    }

    public C4470qc(Context context, R4 r10, C4437p4 c4437p4, C4307k0 c4307k0, TimePassedChecker timePassedChecker, C4519sc c4519sc, C4374mg c4374mg, F6 f10) {
        super(context, r10, c4307k0, timePassedChecker, c4519sc, c4437p4);
        this.f57561w = c4374mg;
        Y8 y8K = k();
        y8K.a(EnumC4112cb.EVENT_TYPE_REGULAR, new Ig(y8K.b()));
        this.f57562x = c4519sc.a(this);
        this.f57563y = f10;
        C4418oa.k().x().onMainReporterCreated(new C4627wk(this, c4437p4));
    }
}
