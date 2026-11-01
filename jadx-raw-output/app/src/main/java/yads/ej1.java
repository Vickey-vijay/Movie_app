package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public final class ej1 implements ij1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f77090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f77091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f77092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hj1 f77093d;

    public /* synthetic */ ej1(View view, float f10, Context context) {
        this(view, f10, context, new hj1());
    }

    public ej1(View view, float f10, Context context, hj1 hj1Var) {
        this.f77090a = view;
        this.f77091b = f10;
        this.f77092c = context;
        this.f77093d = hj1Var;
    }

    @Override // yads.ij1
    public final hj1 a(int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        Context context = this.f77092c;
        wl3 wl3Var = kl3.f79470a;
        int iRound = Math.round(context.getResources().getDisplayMetrics().widthPixels * this.f77091b);
        ViewGroup.LayoutParams layoutParams = this.f77090a.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        this.f77093d.f78252a = View.MeasureSpec.makeMeasureSpec((int) Math.max(Math.min(size, iRound), 0.0d), mode);
        hj1 hj1Var = this.f77093d;
        hj1Var.f78253b = i11;
        return hj1Var;
    }
}
