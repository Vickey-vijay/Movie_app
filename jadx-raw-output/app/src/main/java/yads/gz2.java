package yads;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class gz2 implements u2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f77987b = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f77988a;

    @Override // yads.u2
    public final long a() {
        Long l10 = this.f77988a.f83827s;
        return l10 != null ? l10.longValue() : f77987b;
    }

    public gz2(v9 v9Var) {
        this.f77988a = v9Var;
    }

    @Override // yads.u2
    public final long a(long j10) {
        Long l10 = this.f77988a.f83827s;
        return l10 != null ? Math.min(j10, l10.longValue()) : j10;
    }
}
