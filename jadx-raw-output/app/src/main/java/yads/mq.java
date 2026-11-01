package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes10.dex */
public final class mq extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final og0 f80318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij1 f80319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f80321d;

    public final void a(Context context) {
        this.f80318a.getClass();
        int iA = og0.a(context, 1.0f);
        this.f80321d.setStyle(Paint.Style.STROKE);
        this.f80321d.setStrokeWidth(iA);
        this.f80321d.setColor(SupportMenu.CATEGORY_MASK);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        hj1 hj1VarA = this.f80319b.a(i10, i11);
        super.onMeasure(hj1VarA.f78252a, hj1VarA.f78253b);
    }

    public final void setColor(int i10) {
        if (this.f80321d.getColor() != i10) {
            this.f80321d.setColor(i10);
            requestLayout();
        }
    }

    public mq(Context context, og0 og0Var, ij1 ij1Var) {
        super(context);
        this.f80318a = og0Var;
        this.f80319b = ij1Var;
        og0Var.getClass();
        this.f80320c = og0.a(context, 0.5f);
        this.f80321d = new Paint();
        a(context);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f80320c;
        canvas.drawRect(f10, f10, getWidth() - this.f80320c, getHeight() - this.f80320c, this.f80321d);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object parent = getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            setLeft(0);
            setTop(0);
            setRight(measuredWidth);
            setBottom(measuredHeight);
            super.onLayout(z10, 0, 0, measuredWidth, measuredHeight);
            return;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
