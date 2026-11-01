package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class m33 implements nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq0 f80057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f80058b;

    @Override // yads.nq0
    public final long a() {
        return this.f80057a.a() - this.f80058b;
    }

    @Override // yads.nq0
    public final void b(int i10) {
        this.f80057a.b(i10);
    }

    @Override // yads.nq0
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f80057a.b(bArr, i10, i11, z10);
    }

    @Override // yads.nq0
    public final long c() {
        return this.f80057a.c() - this.f80058b;
    }

    @Override // yads.nq0
    public final long getLength() {
        return this.f80057a.getLength() - this.f80058b;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f80057a.read(bArr, i10, i11);
    }

    @Override // yads.nq0
    public final void readFully(byte[] bArr, int i10, int i11) {
        this.f80057a.readFully(bArr, i10, i11);
    }

    public m33(ld0 ld0Var, long j10) {
        boolean z10;
        this.f80057a = ld0Var;
        if (ld0Var.a() >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ni.a(z10);
        this.f80058b = j10;
    }

    @Override // yads.nq0
    public final void a(byte[] bArr, int i10, int i11) {
        this.f80057a.a(bArr, i10, i11);
    }

    @Override // yads.nq0
    public final void b() {
        this.f80057a.b();
    }

    @Override // yads.nq0
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f80057a.a(bArr, i10, i11, z10);
    }

    @Override // yads.nq0
    public final void a(int i10) {
        this.f80057a.a(i10);
    }
}
