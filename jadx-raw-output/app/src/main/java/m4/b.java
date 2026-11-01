package m4;

/* JADX INFO: compiled from: BaseMediaChunkIterator.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f64037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f64038d;

    public void a() {
        this.f64038d = this.f64036b - 1;
    }

    public b(long j10, long j11) {
        this.f64036b = j10;
        this.f64037c = j11;
        a();
    }
}
