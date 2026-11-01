package im;

import java.io.IOException;

/* JADX INFO: compiled from: HttpEventListenerWrapper.java */
/* JADX INFO: loaded from: classes9.dex */
public class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f54257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f54258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f54259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f54260d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mm.d f54261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mm.d f54263g;

    @Override // im.g
    public void a(Throwable th2) {
        if (this.f54258b) {
            this.f54257a.a(th2);
        }
    }

    @Override // im.g
    public void b() {
        if (this.f54258b) {
            this.f54257a.b();
        }
    }

    @Override // im.g
    public void c() throws IOException {
        if (this.f54259c) {
            this.f54257a.c();
        }
    }

    @Override // im.g
    public void d(mm.d dVar, int i10, mm.d dVar2) throws IOException {
        if (this.f54259c) {
            this.f54257a.d(dVar, i10, dVar2);
            return;
        }
        this.f54261e = dVar;
        this.f54262f = i10;
        this.f54263g = dVar2;
    }

    @Override // im.g
    public void e(mm.d dVar, mm.d dVar2) throws IOException {
        if (this.f54259c) {
            this.f54257a.e(dVar, dVar2);
        }
    }

    @Override // im.g
    public void f(Throwable th2) {
        if (this.f54258b || this.f54259c) {
            this.f54257a.f(th2);
        }
    }

    @Override // im.g
    public void g(mm.d dVar) throws IOException {
        if (this.f54259c) {
            this.f54257a.g(dVar);
        }
    }

    @Override // im.g
    public void h() {
        if (this.f54258b || this.f54259c) {
            this.f54257a.h();
        }
    }

    @Override // im.g
    public void i() throws IOException {
        if (this.f54258b) {
            this.f54257a.i();
        }
    }

    @Override // im.g
    public void j() throws IOException {
        if (this.f54259c) {
            if (!this.f54260d) {
                this.f54257a.d(this.f54261e, this.f54262f, this.f54263g);
            }
            this.f54257a.j();
        }
    }

    public boolean k() {
        return this.f54259c;
    }

    public void l(boolean z10) {
        this.f54258b = z10;
    }

    public void m(boolean z10) {
        this.f54259c = z10;
    }

    @Override // im.g
    public void onRequestComplete() throws IOException {
        if (this.f54258b) {
            this.f54257a.onRequestComplete();
        }
    }

    public h(g gVar, boolean z10) {
        this.f54257a = gVar;
        this.f54258b = z10;
        this.f54259c = z10;
    }
}
