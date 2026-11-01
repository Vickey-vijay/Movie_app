package yads;

import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class e72 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei3 f76954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextureView f76955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n52 f76956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i62 f76957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ij1 f76958e;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        hj1 hj1VarA = this.f76958e.a(i10, i11);
        super.onMeasure(hj1VarA.f78252a, hj1VarA.f78253b);
    }

    public final void setAspectRatio(float f10) {
        this.f76958e = new ok2(f10);
    }

    public final void setOnAttachStateChangeListener(i62 i62Var) {
        this.f76957d = i62Var;
    }

    public e72(Context context, ei3 ei3Var, TextureView textureView, n52 n52Var) {
        super(context);
        this.f76954a = ei3Var;
        this.f76955b = textureView;
        this.f76956c = n52Var;
        this.f76958e = new cz2();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i62 i62Var = this.f76957d;
        if (i62Var != null) {
            a62 a62Var = (a62) i62Var;
            a62Var.f75412a.a(a62Var.f75413b.f76955b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i62 i62Var = this.f76957d;
        if (i62Var != null) {
            a62 a62Var = (a62) i62Var;
            a62Var.f75413b.f76954a.f77088a.clearAnimation();
            a62Var.f75412a.a((TextureView) null);
        }
    }
}
