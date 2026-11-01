package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class jv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f79198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f79199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f79200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f79201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f79202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f79203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f79204g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f79205h;

    public final boolean a() {
        return this.f79201d > 15 && this.f79205h == 0;
    }

    public final void a(long j10) {
        long j11 = this.f79201d;
        if (j11 == 0) {
            this.f79198a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f79198a;
            this.f79199b = j12;
            this.f79203f = j12;
            this.f79202e = 1L;
        } else {
            long j13 = j10 - this.f79200c;
            int i10 = (int) (j11 % 15);
            if (Math.abs(j13 - this.f79199b) <= 1000000) {
                this.f79202e++;
                this.f79203f += j13;
                boolean[] zArr = this.f79204g;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f79205h--;
                }
            } else {
                boolean[] zArr2 = this.f79204g;
                if (!zArr2[i10]) {
                    zArr2[i10] = true;
                    this.f79205h++;
                }
            }
        }
        this.f79201d++;
        this.f79200c = j10;
    }
}
