package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ICrashTransformer;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4313k6 implements Ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4287j6 f57078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICrashTransformer f57079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N9 f57080c;

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(@Nullable Throwable th2, @NonNull V v10) {
        if (this.f57078a.a(th2)) {
            ICrashTransformer iCrashTransformer = this.f57079b;
            if (iCrashTransformer == null || th2 == null || (th2 = iCrashTransformer.process(th2)) != null) {
                Rn rnA = Un.a(th2, v10, null, (String) this.f57080c.f55618b.a(), (Boolean) this.f57080c.f55619c.a());
                C4216gc c4216gc = (C4216gc) ((Ch) this).f55110d;
                c4216gc.f56190a.a().a(c4216gc.f56807b).a(rnA);
            }
        }
    }

    @VisibleForTesting
    public final InterfaceC4287j6 b() {
        return this.f57078a;
    }

    public AbstractC4313k6(InterfaceC4287j6 interfaceC4287j6, ICrashTransformer iCrashTransformer, N9 n10) {
        this.f57078a = interfaceC4287j6;
        this.f57079b = iCrashTransformer;
        this.f57080c = n10;
    }

    @Nullable
    @VisibleForTesting
    public final ICrashTransformer a() {
        return this.f57079b;
    }
}
