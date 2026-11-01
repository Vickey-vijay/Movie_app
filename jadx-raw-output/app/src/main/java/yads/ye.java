package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s63 f84910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ym1 f84912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f84913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s63 f84914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f84915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ym1 f84916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f84917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f84918j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ye.class != obj.getClass()) {
            return false;
        }
        ye yeVar = (ye) obj;
        return this.f84909a == yeVar.f84909a && this.f84911c == yeVar.f84911c && this.f84913e == yeVar.f84913e && this.f84915g == yeVar.f84915g && this.f84917i == yeVar.f84917i && this.f84918j == yeVar.f84918j && l92.a(this.f84910b, yeVar.f84910b) && l92.a(this.f84912d, yeVar.f84912d) && l92.a(this.f84914f, yeVar.f84914f) && l92.a(this.f84916h, yeVar.f84916h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f84909a), this.f84910b, Integer.valueOf(this.f84911c), this.f84912d, Long.valueOf(this.f84913e), this.f84914f, Integer.valueOf(this.f84915g), this.f84916h, Long.valueOf(this.f84917i), Long.valueOf(this.f84918j)});
    }

    public ye(long j10, s63 s63Var, int i10, ym1 ym1Var, long j11, s63 s63Var2, int i11, ym1 ym1Var2, long j12, long j13) {
        this.f84909a = j10;
        this.f84910b = s63Var;
        this.f84911c = i10;
        this.f84912d = ym1Var;
        this.f84913e = j11;
        this.f84914f = s63Var2;
        this.f84915g = i11;
        this.f84916h = ym1Var2;
        this.f84917i = j12;
        this.f84918j = j13;
    }
}
