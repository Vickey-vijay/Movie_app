package yads;

/* JADX INFO: loaded from: classes2.dex */
public class uw2 implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f83678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tw2 f83679b;

    public uw2() {
        this(-9223372036854775807L, 0L);
    }

    @Override // yads.vw2
    public final boolean b() {
        return false;
    }

    public uw2(long j10, long j11) {
        this.f83678a = j10;
        this.f83679b = new tw2(j11 == 0 ? xw2.f84726c : new xw2(0L, j11));
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        return this.f83679b;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f83678a;
    }
}
