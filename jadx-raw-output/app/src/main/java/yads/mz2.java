package yads;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class mz2 implements ic0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f80485b = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f80486a;

    @Override // yads.ic0
    public final long a() {
        Long l10 = this.f80486a.f83827s;
        return l10 != null ? l10.longValue() : f80485b;
    }

    public mz2(v9 v9Var) {
        this.f80486a = v9Var;
    }
}
