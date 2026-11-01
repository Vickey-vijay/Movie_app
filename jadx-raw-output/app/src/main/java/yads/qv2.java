package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;
import yads.qv2;

/* JADX INFO: loaded from: classes2.dex */
public final class qv2 implements um {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final km f81984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t42 f81985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dn f81986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d22 f81987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zs2 f81988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m22 f81989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f81990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dw2 f81991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mm f81992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i02 f81993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kz f81994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f81995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v9 f81996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w02 f81997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f81998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public cn f81999p;

    public qv2(km kmVar, t42 t42Var, dn dnVar, d22 d22Var, zs2 zs2Var, m22 m22Var, Handler handler, dw2 dw2Var, mm mmVar, i02 i02Var, kz kzVar) {
        this.f81984a = kmVar;
        this.f81985b = t42Var;
        this.f81986c = dnVar;
        this.f81987d = d22Var;
        this.f81988e = zs2Var;
        this.f81989f = m22Var;
        this.f81990g = handler;
        this.f81991h = dw2Var;
        this.f81992i = mmVar;
        this.f81993j = i02Var;
        this.f81994k = kzVar;
        this.f81995l = new ViewTreeObserver.OnPreDrawListener() { // from class: cp.b9
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return qv2.a(this.f51249b);
            }
        };
    }

    public static final void a(km kmVar) {
        kmVar.d();
    }

    @Override // yads.um
    public final List b() {
        i02 i02Var = this.f81993j;
        w02 w02Var = this.f81997n;
        i02Var.getClass();
        return i02.b(w02Var);
    }

    public static final void b(qv2 qv2Var) {
        mk3.a(qv2Var.f81984a.C, false);
    }

    @Override // yads.um
    public final List a() {
        i02 i02Var = this.f81993j;
        w02 w02Var = this.f81997n;
        i02Var.getClass();
        return i02.a(w02Var);
    }

    @Override // yads.um
    public final String getAdInfo() {
        return this.f81993j.c(this.f81997n);
    }

    @Override // yads.um
    public final void a(Context context) {
        cn cnVar = this.f81999p;
        if (cnVar != null) {
            an anVar = cnVar.f76326a.f75907e;
            lm2 lm2Var = anVar.f75570c;
            jk.k kVar = an.f75567d[0];
            ViewGroup viewGroup = (ViewGroup) lm2Var.f79854a.get();
            if (viewGroup != null) {
                nk3.a(viewGroup);
            }
            zf0 zf0Var = anVar.f75569b;
            if (zf0Var != null) {
                zf0Var.c();
            }
        }
        this.f81985b.f82882b.a();
        this.f81996m = null;
        this.f81997n = null;
        this.f81998o = true;
    }

    public /* synthetic */ qv2(final km kmVar, lu2 lu2Var) {
        t42 t42Var = new t42(kmVar.g(), lu2Var, kmVar.e(), kmVar.f());
        dn dnVar = new dn(kmVar.e(), kmVar.h());
        d22 d22Var = new d22(kmVar.e());
        zs2 zs2Var = new zs2(kmVar.e(), kmVar.h());
        m22 m22Var = new m22(kmVar);
        Handler handler = new Handler(Looper.getMainLooper());
        Object obj = dw2.f76819j;
        this(kmVar, t42Var, dnVar, d22Var, zs2Var, m22Var, handler, cw2.a(), new mm(), new i02(), new kz() { // from class: cp.a9
            @Override // yads.kz
            public final void e() {
                qv2.a(kmVar);
            }
        });
    }

    @Override // yads.um
    public final void a(Context context, v9 v9Var) {
        this.f81984a.f85496b.a(v5.f83743c, null);
        nt2 nt2VarA = this.f81991h.a(context);
        if (nt2VarA != null && nt2VarA.C) {
            if (this.f81998o) {
                return;
            }
            a03 a03Var = this.f81984a.f85497c.f76562d.f75685a;
            nv0 nv0VarC = v9Var.c();
            this.f81996m = v9Var;
            if (a03Var != null && c03.a(context, v9Var, nv0VarC, this.f81992i, a03Var)) {
                this.f81985b.a(v9Var, new ov2(this), new nv2(this, context, v9Var));
                return;
            }
            l4 l4VarA = h9.a(a03Var != null ? a03Var.c(context) : 0, a03Var != null ? a03Var.a(context) : 0, nv0VarC.f80817c, nv0VarC.f80818d, kl3.d(context), kl3.b(context));
            lc1.a(l4VarA.f79699c, new Object[0]);
            this.f81984a.b(l4VarA);
            return;
        }
        this.f81984a.b(h9.f78101a);
    }

    public static final boolean a(final qv2 qv2Var) {
        qv2Var.f81990g.postDelayed(new Runnable() { // from class: cp.c9
            @Override // java.lang.Runnable
            public final void run() {
                qv2.b(this.f51264b);
            }
        }, 50L);
        return true;
    }
}
