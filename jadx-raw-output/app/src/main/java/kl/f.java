package kl;

/* JADX INFO: compiled from: Duration.java */
/* JADX INFO: loaded from: classes11.dex */
public class f implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f62918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f62919c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f62920d;

    public void a(float f10) {
        if (this.f62919c != f10) {
            this.f62919c = f10;
            this.f62920d = (long) (this.f62918b * f10);
        }
    }

    public void b(long j10) {
        this.f62918b = j10;
        this.f62920d = (long) (j10 * this.f62919c);
    }

    public f(long j10) {
        this.f62918b = j10;
        this.f62920d = j10;
    }
}
