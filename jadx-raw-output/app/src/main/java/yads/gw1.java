package yads;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes10.dex */
public final class gw1 extends hb2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xv1 f77958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fo3 f77959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kw1 f77960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ij1 f77961o;

    public gw1(Context context, AttributeSet attributeSet) {
        this(context, new tn3(), attributeSet);
    }

    public final void a(String str, fw1 fw1Var) {
        if (this.f77959m instanceof eo3) {
            this.f77959m = new do3(fw1Var);
            kw1 kw1Var = this.f77960n;
            kw1Var.f79609e.getClass();
            boolean zFind = uv1.f83672a.matcher(str).find();
            kw1Var.f79610f.getClass();
            j11 yv1Var = zFind ? new yv1() : new go();
            gw1 gw1Var = kw1Var.f79605a;
            lh3 lh3Var = kw1Var.f79607c;
            xv1 xv1Var = kw1Var.f79606b;
            yv1Var.a(gw1Var, kw1Var, lh3Var, xv1Var, xv1Var, xv1Var).a(str);
        }
    }

    public /* synthetic */ gw1(Context context, tn3 tn3Var, int i10) {
        this(context, (i10 & 2) != 0 ? new tn3() : tn3Var, (AttributeSet) null);
    }

    @Override // yads.hb2
    public final void e() {
        this.f77960n.f79608d.a(kotlin.collections.a.j());
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        hj1 hj1VarA = this.f77961o.a(i10, i11);
        super.onMeasure(hj1VarA.f78252a, hj1VarA.f78253b);
    }

    public final void setAspectRatio(float f10) {
        this.f77961o = new ok2(f10);
    }

    public final void setClickListener(ev evVar) {
        this.f77960n.f79612h = evVar;
    }

    public final void setPreloadingState(fo3 fo3Var) {
        this.f77959m = fo3Var;
    }

    public gw1(Context context, tn3 tn3Var, AttributeSet attributeSet) {
        super(context, tn3Var, attributeSet, 56);
        xv1 xv1Var = new xv1();
        this.f77958l = xv1Var;
        this.f77959m = eo3.f77161a;
        this.f77960n = new kw1(this, xv1Var);
        this.f77961o = new cz2();
    }

    @Override // yads.hb2, yads.m11
    public final void a() {
        super.a();
        fo3 fo3Var = this.f77959m;
        do3 do3Var = fo3Var instanceof do3 ? (do3) fo3Var : null;
        if (do3Var != null) {
            fw1 fw1Var = do3Var.f76761a;
            if (fw1Var != null) {
                fw1Var.b();
            }
            this.f77959m = co3.f76377a;
        }
    }

    @Override // yads.hb2, yads.m11
    public final void a(int i10) {
        super.a(i10);
        fo3 fo3Var = this.f77959m;
        do3 do3Var = fo3Var instanceof do3 ? (do3) fo3Var : null;
        if (do3Var != null) {
            fw1 fw1Var = do3Var.f76761a;
            if (fw1Var != null) {
                fw1Var.a();
            }
            stopLoading();
            this.f77959m = eo3.f77161a;
        }
    }
}
