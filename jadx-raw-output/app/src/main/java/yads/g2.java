package yads;

import android.content.Context;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

/* JADX INFO: loaded from: classes11.dex */
public final class g2 implements h2, kz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f77592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f77593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w02 f77594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9 f77595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f2 f77596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d4 f77597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nt2 f77598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zx0 f77599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ey0 f77600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final py0 f77601k;

    public g2(Context context, RelativeLayout relativeLayout, Window window, w02 w02Var, v9 v9Var, q2 q2Var, b2 b2Var, d4 d4Var, lu2 lu2Var, int i10, nt2 nt2Var, zx0 zx0Var, ey0 ey0Var) {
        this.f77591a = context;
        this.f77592b = relativeLayout;
        this.f77593c = window;
        this.f77594d = w02Var;
        this.f77595e = v9Var;
        this.f77596f = q2Var;
        this.f77597g = d4Var;
        this.f77598h = nt2Var;
        this.f77599i = zx0Var;
        this.f77600j = ey0Var;
        this.f77601k = new uy0(context, v9Var, relativeLayout, this, b2Var, i10, q2Var, d4Var, lu2Var).a(context, w02Var, this);
    }

    @Override // yads.h2
    public final void a() {
        ((q2) this.f77596f).a(2, null);
    }

    @Override // yads.h2
    public final void b() {
        ((q2) this.f77596f).a(3, null);
    }

    @Override // yads.h2
    public final void c() {
        if (this.f77597g.f76559a != e00.f76864i) {
            this.f77592b.setBackground(u9.f83398a);
        }
        this.f77601k.c();
        ((q2) this.f77596f).a(0, null);
        ((q2) this.f77596f).a(5, null);
        boolean z10 = ad1.f75480a;
    }

    @Override // yads.h2
    public final boolean d() {
        zx0 zx0Var = this.f77599i;
        zx0Var.getClass();
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(zx0Var.f85640a);
        return nt2VarA != null && nt2VarA.f80791s;
    }

    @Override // yads.kz
    public final void e() {
        ((q2) this.f77596f).f81684a.finish();
    }

    @Override // yads.h2
    public final void f() {
        nt2 nt2Var;
        ((q2) this.f77596f).a(this.f77591a.getResources().getConfiguration().orientation == 1 ? 7 : 6);
        this.f77593c.requestFeature(1);
        this.f77593c.addFlags(1024);
        this.f77593c.addFlags(16777216);
        if (this.f77595e.F || ((nt2Var = this.f77598h) != null && nt2Var.E0)) {
            ey0 ey0Var = this.f77600j;
            Window window = this.f77593c;
            ey0Var.getClass();
            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsetsCompat.Type.navigationBars());
        }
        this.f77600j.a(this.f77593c, this.f77592b);
    }

    @Override // yads.h2
    public final void g() {
        this.f77601k.invalidate();
    }

    @Override // yads.h2
    public final void onAdClosed() {
        this.f77594d.destroy();
        ((q2) this.f77596f).a(4, null);
    }
}
