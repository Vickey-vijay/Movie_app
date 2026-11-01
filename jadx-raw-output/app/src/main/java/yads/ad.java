package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ad implements ij1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f75475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lg0 f75476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final og0 f75477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f75478d;

    public /* synthetic */ ad(Context context, boolean z10, int i10) {
        this(context, (i10 & 2) != 0 ? false : z10, new lg0(), new og0());
    }

    @Override // yads.ij1
    public final hj1 a(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode != 0) {
            Context context = this.f75478d;
            wl3 wl3Var = kl3.f79470a;
            int iMin = context.getResources().getDisplayMetrics().widthPixels;
            og0 og0Var = this.f75477c;
            Context context2 = this.f75478d;
            og0Var.getClass();
            int iA = og0.a(context2, 420.0f);
            int i12 = this.f75478d.getResources().getConfiguration().orientation;
            if (this.f75476b.a(this.f75478d) != kg0.f79407b || i12 != 1) {
                iMin = (int) Math.min(iMin, iA);
            }
            i10 = View.MeasureSpec.makeMeasureSpec((int) Math.min(iMin, size), 1073741824);
        }
        if (mode2 != 0) {
            boolean z10 = this.f75475a;
            int iC = kl3.c(this.f75478d);
            og0 og0Var2 = this.f75477c;
            Context context3 = this.f75478d;
            og0Var2.getClass();
            int iA2 = og0.a(context3, 350.0f);
            if (!z10) {
                iC = (int) Math.min(iC, iA2);
            }
            i11 = View.MeasureSpec.makeMeasureSpec((int) Math.min(iC, size2), 1073741824);
        }
        hj1 hj1Var = new hj1();
        hj1Var.f78253b = i11;
        hj1Var.f78252a = i10;
        return hj1Var;
    }

    public ad(Context context, boolean z10, lg0 lg0Var, og0 og0Var) {
        this.f75475a = z10;
        this.f75476b = lg0Var;
        this.f75477c = og0Var;
        this.f75478d = context.getApplicationContext();
    }
}
