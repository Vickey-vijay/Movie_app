package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class hs2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f78346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f78347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pe f78348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hs2 f78349d;

    public final void a(int i10, long j10) {
        if (this.f78348c != null) {
            throw new IllegalStateException();
        }
        this.f78346a = j10;
        this.f78347b = j10 + ((long) i10);
    }

    public hs2(int i10, long j10) {
        a(i10, j10);
    }
}
