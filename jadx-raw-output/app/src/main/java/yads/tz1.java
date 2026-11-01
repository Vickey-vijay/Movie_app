package yads;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class tz1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oi f83255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3 f83256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l12 f83257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kn2 f83258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final if1 f83259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jx0 f83260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nk.l0 f83261g = z10.b(null);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jElapsedRealtime;
        Long l10 = this.f83258d.f79486a;
        if (l10 != null) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - l10.longValue();
        } else {
            jElapsedRealtime = 0;
        }
        if1 if1Var = this.f83259e;
        if (if1Var == null || jElapsedRealtime < if1Var.f78625e || !this.f83255a.f81052e) {
            return;
        }
        nk.j.d(this.f83261g, null, null, new sz1(this, view, null), 3, null);
    }

    public tz1(jx0 jx0Var, kn2 kn2Var, y3 y3Var, l12 l12Var, oi oiVar, if1 if1Var) {
        this.f83255a = oiVar;
        this.f83256b = y3Var;
        this.f83257c = l12Var;
        this.f83258d = kn2Var;
        this.f83259e = if1Var;
        this.f83260f = jx0Var;
    }
}
