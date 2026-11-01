package lm;

import org.eclipse.jetty.io.Buffers;

/* JADX INFO: compiled from: HttpBuffersImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class e extends ym.a implements d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f63741k = 16384;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f63742l = 6144;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f63743m = 32768;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f63744n = 6144;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f63745o = 1024;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Buffers.Type f63746p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Buffers.Type f63747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Buffers.Type f63748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Buffers.Type f63749s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Buffers f63750t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Buffers f63751u;

    @Override // ym.a
    public void e0() throws Exception {
        this.f63750t = null;
        this.f63751u = null;
    }

    @Override // lm.d
    public Buffers N() {
        return this.f63750t;
    }

    @Override // lm.d
    public Buffers W() {
        return this.f63751u;
    }

    @Override // ym.a
    public void d0() throws Exception {
        Buffers.Type type = this.f63747q;
        int i10 = this.f63742l;
        Buffers.Type type2 = this.f63746p;
        this.f63750t = org.eclipse.jetty.io.b.a(type, i10, type2, this.f63741k, type2, m0());
        Buffers.Type type3 = this.f63749s;
        int i11 = this.f63744n;
        Buffers.Type type4 = this.f63748r;
        this.f63751u = org.eclipse.jetty.io.b.a(type3, i11, type4, this.f63743m, type4, m0());
        super.d0();
    }

    public int m0() {
        return this.f63745o;
    }

    public void n0(Buffers.Type type) {
        this.f63746p = type;
    }

    public void o0(Buffers.Type type) {
        this.f63747q = type;
    }

    public void p0(Buffers.Type type) {
        this.f63748r = type;
    }

    public void q0(Buffers.Type type) {
        this.f63749s = type;
    }

    public String toString() {
        return this.f63750t + "/" + this.f63751u;
    }

    public e() {
        Buffers.Type type = Buffers.Type.BYTE_ARRAY;
        this.f63746p = type;
        this.f63747q = type;
        this.f63748r = type;
        this.f63749s = type;
    }
}
