package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class kz1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f79625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d12 f79626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xz1 f79627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hz1 f79628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z30 f79629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mz1 f79630g;

    public kz1(mz1 mz1Var, v9 v9Var, d12 d12Var, xz1 xz1Var, hz1 hz1Var, aq2 aq2Var) {
        this.f79630g = mz1Var;
        this.f79625b = v9Var;
        this.f79626c = d12Var;
        this.f79627d = xz1Var;
        this.f79628e = hz1Var;
        this.f79629f = new a40(mz1Var.f80482e, mz1Var.f80478a, aq2Var.b(v9Var, mz1Var.f80479b)).a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            d12 d12Var = this.f79626c;
            if (d12Var == null) {
                this.f79628e.a(h9.f78103c);
            } else if (d12Var.f76509a.isEmpty()) {
                this.f79628e.a(h9.f78108h);
            } else {
                d12 d12Var2 = this.f79626c;
                v9 v9Var = this.f79625b;
                mz1 mz1Var = this.f79630g;
                ry1 ry1Var = new ry1(v9Var, mz1Var.f80479b, d12Var2);
                hz1 hz1Var = this.f79628e;
                w5 w5Var = mz1Var.f80480c;
                jz1 jz1Var = new jz1(this, hz1Var, w5Var);
                w5Var.a(v5.f83754n, null);
                mz1 mz1Var2 = this.f79630g;
                q42 q42Var = mz1Var2.f80484g;
                Context context = mz1Var2.f80482e;
                d4 d4Var = mz1Var2.f80479b;
                z30 z30Var = this.f79629f;
                hz1 hz1Var2 = this.f79628e;
                q42Var.getClass();
                nk.j.d(q42Var.f81704a, new r42(hz1Var2), null, new p42(context, hz1Var2, jz1Var, q42Var, d4Var, ry1Var, z30Var, null), 2, null);
            }
        } catch (Exception unused) {
            boolean z10 = ad1.f75480a;
            this.f79628e.a(h9.f78103c);
        }
    }
}
