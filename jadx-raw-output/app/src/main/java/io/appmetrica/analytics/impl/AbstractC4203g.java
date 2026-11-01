package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4203g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f56785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rk f56786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Vk f56787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qk f56788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Sa f56789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SystemTimeProvider f56790f;

    @NonNull
    public final /* bridge */ Ek a(@NonNull Object obj) {
        return a((Fk) obj);
    }

    @NonNull
    public final Ek a(@NonNull Fk fk2) {
        if (this.f56787c.h()) {
            this.f56789e.reportEvent("create session with non-empty storage");
        }
        Y4 y10 = this.f56785a;
        Vk vk2 = this.f56787c;
        long jA = this.f56786b.a();
        Vk vk3 = this.f56787c;
        vk3.a(Vk.f56037f, Long.valueOf(jA));
        vk3.a(Vk.f56035d, Long.valueOf(fk2.f55242a));
        vk3.a(Vk.f56039h, Long.valueOf(fk2.f55242a));
        vk3.a(Vk.f56038g, 0L);
        vk3.a(Vk.f56040i, Boolean.TRUE);
        vk3.b();
        this.f56785a.f56203e.a(jA, this.f56788d.f55809a, TimeUnit.MILLISECONDS.toSeconds(fk2.f55243b));
        return new Ek(y10, vk2, a(), new SystemTimeProvider());
    }

    @Nullable
    public final Ek b() {
        if (this.f56787c.h()) {
            return new Ek(this.f56785a, this.f56787c, a(), this.f56790f);
        }
        return null;
    }

    public AbstractC4203g(@NonNull Y4 y10, @NonNull Rk rk2, @NonNull Vk vk2, @NonNull Qk qk2, @NonNull Sa sa2, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f56785a = y10;
        this.f56786b = rk2;
        this.f56787c = vk2;
        this.f56788d = qk2;
        this.f56789e = sa2;
        this.f56790f = systemTimeProvider;
    }

    public final Hk a() {
        Gk gk2 = new Gk(this.f56788d);
        gk2.f55279g = this.f56787c.i();
        gk2.f55278f = this.f56787c.f56043c.a(Vk.f56038g);
        gk2.f55276d = this.f56787c.f56043c.a(Vk.f56039h);
        gk2.f55275c = this.f56787c.f56043c.a(Vk.f56037f);
        gk2.f55280h = this.f56787c.f56043c.a(Vk.f56035d);
        gk2.f55273a = this.f56787c.f56043c.a(Vk.f56036e);
        return new Hk(gk2);
    }
}
