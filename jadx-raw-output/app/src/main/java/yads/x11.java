package yads;

import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class x11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f84412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f84413b;

    static {
        mk.b.a aVar = mk.b.f64563c;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long jS = mk.d.s(10, durationUnit);
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        f84412a = mk.b.H(jS, durationUnit2);
        f84413b = mk.b.H(mk.d.s(30, durationUnit), durationUnit2);
        mk.b.H(mk.d.s(3, durationUnit), durationUnit2);
    }
}
