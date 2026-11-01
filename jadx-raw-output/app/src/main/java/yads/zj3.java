package yads;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zj3 implements yj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yj3 f85456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85458c;

    @Override // yads.yj3
    public final void a(View view, List list) {
        this.f85456a.a(view, list);
        this.f85457b = false;
        this.f85458c = false;
    }

    @Override // yads.yj3
    public final void b() {
        this.f85456a.b();
        k();
    }

    @Override // yads.yj3
    public final void c() {
        this.f85456a.c();
    }

    @Override // yads.yj3
    public final void d() {
        this.f85456a.d();
    }

    @Override // yads.yj3
    public final void f() {
        this.f85456a.f();
    }

    @Override // yads.yj3
    public final void g() {
        this.f85456a.g();
        k();
    }

    @Override // yads.yj3
    public final void h() {
        if (this.f85457b) {
            return;
        }
        this.f85457b = true;
        this.f85456a.h();
    }

    @Override // yads.yj3
    public final void i() {
        this.f85456a.i();
    }

    @Override // yads.yj3
    public final void j() {
        this.f85456a.j();
    }

    @Override // yads.yj3
    public final void k() {
        this.f85456a.k();
        this.f85457b = false;
        this.f85458c = false;
    }

    @Override // yads.yj3
    public final void l() {
        this.f85456a.l();
    }

    @Override // yads.yj3
    public final void m() {
        this.f85456a.m();
        h();
        n();
    }

    @Override // yads.yj3
    public final void n() {
        if (this.f85458c) {
            return;
        }
        this.f85458c = true;
        this.f85456a.n();
    }

    public zj3(uy uyVar) {
        this.f85456a = uyVar;
    }

    @Override // yads.yj3
    public final void a(jf3 jf3Var) {
        this.f85456a.a(jf3Var);
        k();
    }

    @Override // yads.yj3
    public final void a(xj3 xj3Var) {
        this.f85456a.a(xj3Var);
    }

    @Override // yads.yj3
    public final void a(float f10, long j10) {
        this.f85456a.a(f10, j10);
    }

    @Override // yads.yj3
    public final void a() {
        this.f85456a.a();
    }

    @Override // yads.yj3
    public final void a(float f10) {
        this.f85456a.a(f10);
    }
}
