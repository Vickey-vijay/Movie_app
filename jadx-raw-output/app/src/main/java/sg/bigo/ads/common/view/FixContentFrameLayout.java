package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.p;

/* JADX INFO: loaded from: classes4.dex */
public class FixContentFrameLayout extends RoundedFrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f70069a;

    public static class a extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f70071b;

        public a() {
            super(-1, -1);
        }
    }

    public FixContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public FixContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FixContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setFixContent(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof a) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        p pVar;
        if (!this.f70069a) {
            super.onMeasure(i10, i11);
            return;
        }
        int defaultSize = View.getDefaultSize(Integer.MIN_VALUE, i10);
        int defaultSize2 = View.getDefaultSize(Integer.MIN_VALUE, i11);
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                if (aVar.f70070a <= 0 || aVar.f70071b <= 0) {
                    pVar = new p(defaultSize, defaultSize2);
                } else {
                    aVar.setMargins(0, 0, 0, 0);
                    pVar = p.a(aVar.f70070a, aVar.f70071b, defaultSize, defaultSize2);
                }
                iMax = Math.max(iMax, pVar.f69806b);
                iMax2 = Math.max(iMax2, pVar.f69807c);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, pVar.f69806b), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, pVar.f69807c), 1073741824));
            }
        }
        setMeasuredDimension(iMax, iMax2);
    }

    public void setFixContent(boolean z10) {
        if (z10) {
            setPadding(0, 0, 0, 0);
        }
        if (z10 != this.f70069a) {
            this.f70069a = z10;
            requestLayout();
        }
    }
}
