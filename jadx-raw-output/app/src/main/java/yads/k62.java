package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class k62 implements af3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l62 f79315a;

    @Override // yads.af3
    public final void a(je3 je3Var, float f10) {
    }

    @Override // yads.af3
    public final void a(je3 je3Var, jf3 jf3Var) {
        this.f79315a.f79711a.e();
        ef3 ef3Var = this.f79315a.f79715e;
        if (ef3Var != null) {
            ef3Var.a();
        }
    }

    @Override // yads.af3
    public final void d(je3 je3Var) {
    }

    @Override // yads.af3
    public final void f(je3 je3Var) {
    }

    @Override // yads.af3
    public final void g(je3 je3Var) {
    }

    @Override // yads.af3
    public final void k(je3 je3Var) {
    }

    public k62(l62 l62Var) {
        this.f79315a = l62Var;
    }

    @Override // yads.af3
    public final void b(je3 je3Var) {
        bf3 bf3Var = this.f79315a.f79713c;
        bf3Var.getClass();
        co2 co2Var = co2.f76352c;
        fo2 fo2VarA = bf3Var.f75811a.a();
        Map map = fo2VarA.f77471a;
        bf3Var.f75812b.a(new eo2("video_ad_start", kotlin.collections.a.B(map), fo2VarA.f77472b));
        ef3 ef3Var = this.f79315a.f79715e;
        if (ef3Var != null) {
            ef3Var.c();
        }
    }

    @Override // yads.af3
    public final void c(je3 je3Var) {
        bf3 bf3Var = this.f79315a.f79713c;
        bf3Var.getClass();
        co2 co2Var = co2.f76352c;
        fo2 fo2VarA = bf3Var.f75811a.a();
        Map map = fo2VarA.f77471a;
        bf3Var.f75812b.a(new eo2("video_ad_complete", kotlin.collections.a.B(map), fo2VarA.f77472b));
        ef3 ef3Var = this.f79315a.f79715e;
        if (ef3Var != null) {
            ef3Var.b();
        }
    }

    @Override // yads.af3
    public final void h(je3 je3Var) {
        ef3 ef3Var = this.f79315a.f79715e;
        if (ef3Var != null) {
            ef3Var.b();
        }
    }

    @Override // yads.af3
    public final void i(je3 je3Var) {
        this.f79315a.f79712b.h();
    }

    @Override // yads.af3
    public final void j(je3 je3Var) {
        this.f79315a.f79714d.f75466a.c();
    }

    @Override // yads.af3
    public final void a(je3 je3Var) {
        this.f79315a.f79712b.d();
    }
}
