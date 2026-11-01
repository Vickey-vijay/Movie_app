package yads;

import android.content.Context;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class g7 implements py0, e03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f77649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2 f77650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kz f77651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c7 f77652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExtendedNativeAdView f77653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s2 f77654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sj2 f77655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lw f77656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final uq2 f77657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f77658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f77659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f77660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f77661m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f77662n;

    public g7(Context context, w02 w02Var, z00 z00Var, ir2 ir2Var, ArrayList arrayList, gi0 gi0Var, ViewGroup viewGroup, t2 t2Var, kz kzVar, ye1 ye1Var, c7 c7Var, ExtendedNativeAdView extendedNativeAdView, s2 s2Var, sj2 sj2Var, lw lwVar, uq2 uq2Var) {
        this.f77649a = viewGroup;
        this.f77650b = t2Var;
        this.f77651c = kzVar;
        this.f77652d = c7Var;
        this.f77653e = extendedNativeAdView;
        this.f77654f = s2Var;
        this.f77655g = sj2Var;
        this.f77656h = lwVar;
        this.f77657i = uq2Var;
        List listA = c7Var.a();
        this.f77659k = listA;
        Iterator it = listA.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((j7) it.next()).a();
        }
        this.f77660l = jA;
        this.f77658j = ye1Var.a(context, this.f77653e, w02Var, z00Var, new f7(this), ir2Var, this.f77655g, new i7(this), arrayList, gi0Var, this.f77652d, this.f77656h);
    }

    public final void a() {
        this.f77649a.setContentDescription("pageIndex: " + this.f77661m);
    }

    public final void b() {
        j7 j7Var = (j7) nj.b0.i0(this.f77659k, this.f77661m - 1);
        long j10 = j7Var != null ? j7Var.f78926a : 0L;
        this.f77655g.f82669a += j10;
        lw lwVar = this.f77656h;
        lwVar.f79948a += lwVar.f79949b;
        lwVar.f79949b = 0L;
        if (this.f77661m < this.f77658j.size()) {
            int i10 = this.f77661m;
            this.f77661m = i10 + 1;
            if (!((xe1) this.f77658j.get(i10)).a()) {
                d();
            } else {
                a();
                this.f77657i.a(this.f77653e, this.f77660l, this.f77655g.f82669a);
            }
        }
    }

    @Override // yads.py0
    public final void c() {
        ViewGroup viewGroup = this.f77649a;
        ExtendedNativeAdView extendedNativeAdView = this.f77653e;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        viewGroup.removeAllViews();
        viewGroup.addView(extendedNativeAdView, layoutParams);
        s2 s2Var = this.f77654f;
        ExtendedNativeAdView extendedNativeAdView2 = this.f77653e;
        s2Var.getClass();
        try {
            if (s2Var.f82496a instanceof v22) {
                r12 r12VarA = s2Var.f82500e.a(extendedNativeAdView2, s2Var.f82499d);
                v22 v22Var = (v22) s2Var.f82496a;
                v22Var.getClass();
                v22Var.a(r12VarA.f82072c, v22Var.Q, new z12(r12VarA));
                ((v22) s2Var.f82496a).b(s2Var.f82498c);
            }
            this.f77661m = 1;
            this.f77662n = false;
            xe1 xe1Var = (xe1) nj.b0.h0(this.f77658j);
            if (xe1Var != null && xe1Var.a()) {
                a();
                this.f77657i.a(this.f77653e, this.f77660l, this.f77655g.f82669a);
            } else if (this.f77661m >= this.f77658j.size()) {
                this.f77651c.e();
            } else {
                b();
            }
        } catch (j02 unused) {
            s2Var.f82497b.e();
        }
    }

    public final void d() {
        if (this.f77661m >= this.f77658j.size()) {
            this.f77651c.e();
        } else {
            b();
        }
    }

    @Override // yads.py0
    public final void invalidate() {
        Iterator it = this.f77658j.iterator();
        while (it.hasNext()) {
            ((xe1) it.next()).b();
        }
        w02 w02Var = this.f77654f.f82496a;
        if (w02Var instanceof v22) {
            ((v22) w02Var).b((z00) null);
        }
    }
}
