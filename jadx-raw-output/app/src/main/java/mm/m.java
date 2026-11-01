package mm;

/* JADX INFO: compiled from: View.java */
/* JADX INFO: loaded from: classes5.dex */
public class m extends mm.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f64614n;

    /* JADX INFO: compiled from: View.java */
    public static class a extends m implements d.a {
        @Override // mm.m, mm.a
        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof d) && ((d) obj).j0(this)) || super.equals(obj);
        }
    }

    public m(d dVar, int i10, int i11, int i12, int i13) {
        super(2, !dVar.Y());
        this.f64614n = dVar.buffer();
        W(i12);
        i0(i11);
        U(i10);
        this.f64583b = i13;
    }

    @Override // mm.a, mm.d
    public void b0() {
    }

    @Override // mm.a, mm.d
    public void clear() {
        U(-1);
        i0(0);
        W(this.f64614n.getIndex());
        i0(this.f64614n.getIndex());
    }

    @Override // mm.a, mm.d
    public boolean h0() {
        return true;
    }

    public void update(d dVar) {
        this.f64583b = 2;
        this.f64614n = dVar.buffer();
        i0(0);
        W(dVar.T());
        i0(dVar.getIndex());
        U(dVar.f0());
        this.f64583b = dVar.isReadOnly() ? 1 : 2;
    }

    @Override // mm.d
    public void I(int i10, byte b10) {
        this.f64614n.I(i10, b10);
    }

    @Override // mm.d
    public int J(int i10, byte[] bArr, int i11, int i12) {
        return this.f64614n.J(i10, bArr, i11, i12);
    }

    @Override // mm.a, mm.d
    public int M(int i10, byte[] bArr, int i11, int i12) {
        return this.f64614n.M(i10, bArr, i11, i12);
    }

    @Override // mm.a, mm.d
    public d N(int i10, int i11) {
        return this.f64614n.N(i10, i11);
    }

    @Override // mm.d
    public byte Q(int i10) {
        return this.f64614n.Q(i10);
    }

    @Override // mm.d
    public byte[] V() {
        return this.f64614n.V();
    }

    @Override // mm.a, mm.d
    public d buffer() {
        return this.f64614n.buffer();
    }

    @Override // mm.d
    public int e0() {
        return this.f64614n.e0();
    }

    @Override // mm.a
    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof d) && obj.equals(this)) || super.equals(obj);
    }

    @Override // mm.a, mm.d
    public int g0(int i10, d dVar) {
        return this.f64614n.g0(i10, dVar);
    }

    @Override // mm.a, mm.d
    public boolean isReadOnly() {
        return this.f64614n.isReadOnly();
    }

    @Override // mm.a
    public String toString() {
        return this.f64614n == null ? "INVALID" : super.toString();
    }

    public m(d dVar) {
        super(2, !dVar.Y());
        this.f64614n = dVar.buffer();
        W(dVar.T());
        i0(dVar.getIndex());
        U(dVar.f0());
        this.f64583b = dVar.isReadOnly() ? 1 : 2;
    }

    public void update(int i10, int i11) {
        int i12 = this.f64583b;
        this.f64583b = 2;
        i0(0);
        W(i11);
        i0(i10);
        U(-1);
        this.f64583b = i12;
    }

    public m() {
        super(2, true);
    }
}
