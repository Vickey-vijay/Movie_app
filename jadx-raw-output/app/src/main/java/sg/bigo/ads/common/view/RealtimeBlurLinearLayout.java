package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.a.d;

/* JADX INFO: loaded from: classes8.dex */
public class RealtimeBlurLinearLayout extends LinearLayout implements sg.bigo.ads.common.view.a.c<RealtimeBlurLinearLayout> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<RealtimeBlurLinearLayout> f70132a;

    public RealtimeBlurLinearLayout(Context context) {
        this(context, null);
    }

    public RealtimeBlurLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RealtimeBlurLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d<RealtimeBlurLinearLayout> dVar = new d<>(this);
        this.f70132a = dVar;
        setBackground(dVar.f70233d);
    }

    @Override // android.view.View
    public Drawable getBackground() {
        Drawable background = super.getBackground();
        return background instanceof sg.bigo.ads.common.view.a.a ? ((sg.bigo.ads.common.view.a.a) background).f69741a : background;
    }

    @Nullable
    public sg.bigo.ads.common.view.a.b getBlurStyle() {
        return this.f70132a.f70233d.f70218b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d<RealtimeBlurLinearLayout> dVar = this.f70132a;
        View viewA = u.a(dVar.f70232c, dVar.f70231b);
        dVar.f70235f = viewA;
        if (viewA == null) {
            dVar.f70236g = false;
            return;
        }
        viewA.getViewTreeObserver().addOnPreDrawListener(dVar.f70237h);
        dVar.a();
        boolean z10 = dVar.f70235f.getRootView() != dVar.f70231b.getRootView();
        dVar.f70236g = z10;
        if (z10) {
            dVar.f70235f.postInvalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d<RealtimeBlurLinearLayout> dVar = this.f70132a;
        View view = dVar.f70235f;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(dVar.f70237h);
        }
        dVar.b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        d<RealtimeBlurLinearLayout> dVar = this.f70132a;
        sg.bigo.ads.common.view.a.a aVar = dVar.f70233d;
        if (drawable != aVar) {
            aVar.a(drawable);
            dVar.b();
        }
        super.setBackground(dVar.f70233d);
    }

    @Override // sg.bigo.ads.common.view.a.c
    public void setBlurStyle(@Nullable sg.bigo.ads.common.view.a.b bVar) {
        this.f70132a.setBlurStyle(bVar);
    }
}
