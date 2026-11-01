package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class tf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f83012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83013d;

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f83010a - this.f83011b > 1) {
                return true;
            }
        } else if (this.f83012c - this.f83013d > 1) {
            return true;
        }
        return false;
    }

    public tf1(int i10, int i11, int i12, int i13) {
        this.f83010a = i10;
        this.f83011b = i11;
        this.f83012c = i12;
        this.f83013d = i13;
    }
}
