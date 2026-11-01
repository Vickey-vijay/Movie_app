package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class dj1 implements ij1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f76687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f76688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f76689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hj1 f76690d;

    public /* synthetic */ dj1(View view, float f10, Context context) {
        this(view, f10, context, new hj1());
    }

    public dj1(View view, float f10, Context context, hj1 hj1Var) {
        this.f76687a = view;
        this.f76688b = f10;
        this.f76689c = context;
        this.f76690d = hj1Var;
    }

    @Override // yads.ij1
    public final hj1 a(int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int iRound = Math.round(kl3.c(this.f76689c) * this.f76688b);
        ViewGroup.LayoutParams layoutParams = this.f76687a.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        }
        int iMax = (int) Math.max(Math.min(size, iRound), 0.0d);
        hj1 hj1Var = this.f76690d;
        hj1Var.f78252a = i10;
        hj1Var.f78253b = View.MeasureSpec.makeMeasureSpec(iMax, mode);
        return this.f76690d;
    }
}
