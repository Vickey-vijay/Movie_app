package yads;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes10.dex */
public final class wn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn1 f84276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw1 f84277b;

    public /* synthetic */ wn1() {
        this(new mn1(), new lw1());
    }

    public final fv2 a(CustomizableMediaView customizableMediaView, oj1 oj1Var, x51 x51Var, o72 o72Var, ao1 ao1Var) throws xn3 {
        Context context = customizableMediaView.getContext();
        this.f84277b.getClass();
        gw1 gw1Var = (gw1) sw1.f82785c.a(context).f82788b.remove(oj1Var);
        if (gw1Var == null) {
            try {
                gw1Var = new gw1(context, (tn3) null, 6);
            } catch (Throwable unused) {
                throw new xn3();
            }
        }
        xv1 xv1Var = gw1Var.f77958l;
        xv1Var.f84706a.add(x51Var);
        xv1Var.f84707b.add(o72Var);
        xv1Var.f84708c.add(o72Var);
        this.f84276a.getClass();
        if (!pr0.a(customizableMediaView.getContext(), or0.f81132e)) {
            customizableMediaView.removeAllViews();
        }
        customizableMediaView.addView(gw1Var, new FrameLayout.LayoutParams(-1, -1));
        return new fv2(customizableMediaView, ao1Var, new ik3(new iw1(gw1Var)));
    }

    public wn1(mn1 mn1Var, lw1 lw1Var) {
        this.f84276a = mn1Var;
        this.f84277b = lw1Var;
    }
}
