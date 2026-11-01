package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class jk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f79083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f79084d;

    public final int a() {
        return this.f79083c.length / 3;
    }

    public jk2(int i10, float[] fArr, float[] fArr2, int i11) {
        boolean z10;
        this.f79081a = i10;
        if (((long) fArr.length) * 2 == ((long) fArr2.length) * 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        ni.a(z10);
        this.f79083c = fArr;
        this.f79084d = fArr2;
        this.f79082b = i11;
    }
}
