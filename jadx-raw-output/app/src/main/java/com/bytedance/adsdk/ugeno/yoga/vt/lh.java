package com.bytedance.adsdk.ugeno.yoga.vt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.ouw.pno;
import com.bytedance.adsdk.ugeno.ouw.ra;
import com.bytedance.adsdk.ugeno.yoga.bly;
import com.bytedance.adsdk.ugeno.yoga.cf;
import com.bytedance.adsdk.ugeno.yoga.fkw;
import com.bytedance.adsdk.ugeno.yoga.le;
import com.bytedance.adsdk.ugeno.yoga.mwh;
import com.bytedance.adsdk.ugeno.yoga.ryl;
import com.bytedance.adsdk.ugeno.yoga.tlj;
import com.bytedance.adsdk.ugeno.yu;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class lh extends ViewGroup implements ra, com.bytedance.adsdk.ugeno.vt.vt {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final tlj f11033lh;
    public yu ouw;
    private final Map<View, tlj> vt;
    private pno yu;

    public static class ouw extends ViewGroup.LayoutParams {
        public float bly;

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        public float f11034cf;
        public float fkw;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        public float f11035jg;

        /* JADX INFO: renamed from: ko, reason: collision with root package name */
        private float f11036ko;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public float f11037le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f11038lh;
        public float mwh;
        public SparseArray<Float> ouw;
        public float pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public float f11039ra;

        /* JADX INFO: renamed from: rn, reason: collision with root package name */
        private float f11040rn;
        public float ryl;

        /* JADX INFO: renamed from: th, reason: collision with root package name */
        private float f11041th;
        public float tlj;

        /* JADX INFO: renamed from: vm, reason: collision with root package name */
        private float f11042vm;
        public SparseArray<String> vt;
        public float yu;
        private float zih;

        public ouw(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof ouw) {
                ouw ouwVar = (ouw) layoutParams;
                this.ouw = ouwVar.ouw.clone();
                this.vt = ouwVar.vt.clone();
                return;
            }
            this.ouw = new SparseArray<>();
            this.vt = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.ouw.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.ouw.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public final void fkw(float f10) {
            this.f11041th = f10;
            this.ouw.put(11, Float.valueOf(f10));
        }

        public final void lh(float f10) {
            this.zih = f10;
            this.ouw.put(14, Float.valueOf(f10));
        }

        public final void ouw(float f10) {
            this.f11036ko = f10;
            this.ouw.put(6, Float.valueOf(f10));
        }

        public final void vt(float f10) {
            this.f11040rn = f10;
            this.ouw.put(7, Float.valueOf(f10));
        }

        public final void yu(float f10) {
            this.f11042vm = f10;
            this.ouw.put(10, Float.valueOf(f10));
        }

        public ouw(int i10, int i11) {
            super(i10, i11);
            this.ouw = new SparseArray<>();
            this.vt = new SparseArray<>();
            if (i10 == -2 || i10 == -1 || i10 >= 0) {
                this.ouw.put(15, Float.valueOf(i10));
            }
            if (i11 == -2 || i11 == -1 || i11 >= 0) {
                this.ouw.put(16, Float.valueOf(i11));
            }
        }
    }

    public lh(Context context) {
        this(context, null);
    }

    public final tlj ouw(View view) {
        return this.vt.get(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        ouw(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        ouw(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            ouw(getChildAt(i12), false);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            ouw(getChildAt(i12), true);
        }
        super.removeViewsInLayout(i10, i11);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.vt
    public final void vt(int i10) {
        tlj tljVar = this.f11033lh;
        if (tljVar != null) {
            vt(tljVar, i10);
            requestLayout();
        }
    }

    private lh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.yu = new pno(this);
        cf cfVar = new cf();
        this.f11033lh = cfVar;
        this.vt = new HashMap();
        cfVar.ouw(this);
        cfVar.ouw((com.bytedance.adsdk.ugeno.yoga.ra) new vt());
        ouw((ouw) generateDefaultLayoutParams(), cfVar, this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        tlj cfVar;
        this.f11033lh.ouw((com.bytedance.adsdk.ugeno.yoga.ra) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.vt.vt) {
            throw null;
        }
        super.addView(view, i10, layoutParams);
        if (this.vt.containsKey(view)) {
            return;
        }
        if (view instanceof lh) {
            cfVar = ((lh) view).getYogaNode();
        } else {
            cfVar = this.vt.containsKey(view) ? this.vt.get(view) : new cf();
            cfVar.ouw(view);
            cfVar.ouw((com.bytedance.adsdk.ugeno.yoga.ra) new vt());
        }
        ouw((ouw) view.getLayoutParams(), cfVar, view);
        this.vt.put(view, cfVar);
        if (view.getVisibility() == 8) {
            view.setTag(151060224, Integer.valueOf(this.f11033lh.ouw()));
        } else {
            tlj tljVar = this.f11033lh;
            tljVar.ouw(cfVar, tljVar.ouw());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ouw;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ouw(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ouw(layoutParams);
    }

    public final float getBorderRadius() {
        return this.yu.ouw;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getRipple() {
        return this.yu.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getRubIn() {
        return this.yu.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getShine() {
        return this.yu.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getStretch() {
        return this.yu.getStretch();
    }

    public final tlj getYogaNode() {
        return this.f11033lh;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.yu();
        }
        if (!(getParent() instanceof lh)) {
            ouw(View.MeasureSpec.makeMeasureSpec(i12 - i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i13 - i11, 1073741824));
        }
        ouw(this.f11033lh, 0.0f, 0.0f);
        yu yuVar2 = this.ouw;
        if (yuVar2 != null) {
            yuVar2.fkw();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.vt
    public final void ouw(int i10) {
        tlj tljVar = this.f11033lh;
        if (tljVar != null) {
            ouw(tljVar, i10);
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.yu.ouw(i10);
    }

    public final void setBorderRadius(float f10) {
        this.yu.ouw(f10);
    }

    public final void setRipple(float f10) {
        pno pnoVar = this.yu;
        if (pnoVar != null) {
            pnoVar.vt(f10);
        }
    }

    public final void setRubIn(float f10) {
        pno pnoVar = this.yu;
        if (pnoVar != null) {
            pnoVar.fkw(f10);
        }
    }

    public final void setShine(float f10) {
        pno pnoVar = this.yu;
        if (pnoVar != null) {
            pnoVar.lh(f10);
        }
    }

    public final void setStretch(float f10) {
        pno pnoVar = this.yu;
        if (pnoVar != null) {
            pnoVar.yu(f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.vt
    public final void lh(View view, int i10) {
        int iOuw;
        view.setVisibility(i10);
        try {
            tlj tljVar = this.vt.get(view);
            Object tag = view.getTag(151060224);
            if (i10 == 0) {
                if (tag != null && this.f11033lh.ouw(tljVar) == -1) {
                    int iIntValue = ((Integer) tag).intValue();
                    if (iIntValue < this.f11033lh.ouw()) {
                        this.f11033lh.ouw(this.vt.get(view), iIntValue);
                    } else {
                        this.f11033lh.ouw(this.vt.get(view), this.f11033lh.ouw());
                    }
                    ouw(this.f11033lh);
                    return;
                }
                return;
            }
            if (i10 == 8 && (iOuw = this.f11033lh.ouw(tljVar)) != -1) {
                this.f11033lh.vt(iOuw);
                view.setTag(151060224, Integer.valueOf(iOuw));
                ouw(this.f11033lh);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ouw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!(getParent() instanceof lh)) {
            ouw(i10, i11);
        }
        yu yuVar = this.ouw;
        if (yuVar != null) {
            int[] iArrOuw = yuVar.ouw(i10, i11);
            setMeasuredDimension(iArrOuw[0], iArrOuw[1]);
        } else {
            setMeasuredDimension(Math.round(this.f11033lh.cf()), Math.round(this.f11033lh.ryl()));
        }
        yu yuVar2 = this.ouw;
        if (yuVar2 != null) {
            yuVar2.lh();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(i10, i11);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ouw(getChildAt(i10), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ouw(getChildAt(i10), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        ouw(getChildAt(i10), false);
        super.removeViewAt(i10);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.vt
    public final void vt(View view, int i10) {
        tlj tljVarOuw;
        if (view == null || (tljVarOuw = ouw(view)) == null) {
            return;
        }
        vt(tljVarOuw, i10);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.vt.vt
    public final void ouw(View view, int i10) {
        tlj tljVarOuw;
        if (view == null || (tljVarOuw = ouw(view)) == null) {
            return;
        }
        ouw(tljVarOuw, i10);
        view.requestLayout();
    }

    private static void vt(tlj tljVar, int i10) {
        if (i10 == -1) {
            tljVar.ra();
        } else if (i10 == -2) {
            tljVar.pno();
        } else {
            tljVar.fkw(i10);
        }
    }

    private static void ouw(tlj tljVar, int i10) {
        if (i10 == -1) {
            tljVar.fkw();
        } else if (i10 == -2) {
            tljVar.le();
        } else {
            tljVar.yu(i10);
        }
    }

    public static class vt implements com.bytedance.adsdk.ugeno.yoga.ra {
        @Override // com.bytedance.adsdk.ugeno.yoga.ra
        public final long ouw(tlj tljVar, float f10, com.bytedance.adsdk.ugeno.yoga.pno pnoVar, float f11, com.bytedance.adsdk.ugeno.yoga.pno pnoVar2) {
            View view = (View) tljVar.mwh();
            if (view == null || (view instanceof lh)) {
                return bly.ouw(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f10, ouw(pnoVar)), View.MeasureSpec.makeMeasureSpec((int) f11, ouw(pnoVar2)));
            return bly.ouw(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private static int ouw(com.bytedance.adsdk.ugeno.yoga.pno pnoVar) {
            if (pnoVar == com.bytedance.adsdk.ugeno.yoga.pno.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return pnoVar == com.bytedance.adsdk.ugeno.yoga.pno.EXACTLY ? 1073741824 : 0;
        }
    }

    private static void ouw(tlj tljVar) {
        while (tljVar.vt() != null) {
            tljVar = tljVar.vt();
        }
        tljVar.lh();
    }

    private void ouw(View view, boolean z10) {
        try {
            tlj tljVar = this.vt.get(view);
            if (tljVar == null) {
                return;
            }
            tlj tljVarVt = tljVar.vt();
            for (int i10 = 0; i10 < tljVarVt.ouw(); i10++) {
                if (tljVarVt.ouw(i10).equals(tljVar)) {
                    tljVarVt.vt(i10);
                    break;
                }
            }
            tljVar.ouw((Object) null);
            this.vt.remove(view);
            if (z10) {
                this.f11033lh.lh();
            }
        } catch (Throwable unused) {
        }
    }

    private void ouw(tlj tljVar, float f10, float f11) {
        View view = (View) tljVar.mwh();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(tljVar.bly() + f10);
            int iRound2 = Math.round(tljVar.tlj() + f11);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(tljVar.cf()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(tljVar.ryl()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iOuw = tljVar.ouw();
        for (int i10 = 0; i10 < iOuw; i10++) {
            if (equals(view)) {
                ouw(tljVar.ouw(i10), f10, f11);
            } else if (!(view instanceof lh)) {
                ouw(tljVar.ouw(i10), tljVar.bly() + f10, tljVar.tlj() + f11);
            }
        }
    }

    private void ouw(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == 1073741824) {
            this.f11033lh.fkw(size2);
        }
        if (mode == 1073741824) {
            this.f11033lh.yu(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.f11033lh.bly(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.f11033lh.pno(size);
        }
        this.f11033lh.lh();
    }

    public static void ouw(ouw ouwVar, tlj tljVar, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            tljVar.ouw(com.bytedance.adsdk.ugeno.yoga.lh.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            if (background.getPadding(rect)) {
                tljVar.vt(com.bytedance.adsdk.ugeno.yoga.yu.LEFT, rect.left);
                tljVar.vt(com.bytedance.adsdk.ugeno.yoga.yu.TOP, rect.top);
                tljVar.vt(com.bytedance.adsdk.ugeno.yoga.yu.RIGHT, rect.right);
                tljVar.vt(com.bytedance.adsdk.ugeno.yoga.yu.BOTTOM, rect.bottom);
            }
        }
        for (int i10 = 0; i10 < ouwVar.ouw.size(); i10++) {
            int iKeyAt = ouwVar.ouw.keyAt(i10);
            float fFloatValue = ouwVar.ouw.valueAt(i10).floatValue();
            if (iKeyAt == 4) {
                tljVar.lh(com.bytedance.adsdk.ugeno.yoga.ouw.ouw(Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                tljVar.ouw(com.bytedance.adsdk.ugeno.yoga.ouw.ouw(Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                tljVar.vt(com.bytedance.adsdk.ugeno.yoga.ouw.ouw(Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                tljVar.tlj(fFloatValue);
            } else if (iKeyAt == 8) {
                if (fFloatValue < 0.0f) {
                    tljVar.yu();
                } else {
                    tljVar.lh(fFloatValue);
                }
            } else if (iKeyAt == 1) {
                tljVar.ouw(fkw.ouw(Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                tljVar.ouw(fFloatValue);
            } else if (iKeyAt == 7) {
                tljVar.vt(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    tljVar.ra();
                } else if (fFloatValue == -2.0f) {
                    tljVar.pno();
                } else {
                    tljVar.fkw(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                tljVar.ouw(com.bytedance.adsdk.ugeno.yoga.yu.LEFT, fFloatValue);
            } else if (iKeyAt == 3) {
                tljVar.ouw(le.ouw(Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                tljVar.ouw(com.bytedance.adsdk.ugeno.yoga.yu.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                tljVar.ouw(com.bytedance.adsdk.ugeno.yoga.yu.RIGHT, fFloatValue);
            } else if (iKeyAt == 19) {
                tljVar.ouw(com.bytedance.adsdk.ugeno.yoga.yu.BOTTOM, fFloatValue);
            } else if (iKeyAt == 28) {
                tljVar.ra(fFloatValue);
            } else if (iKeyAt == 27) {
                tljVar.le(fFloatValue);
            } else if (iKeyAt == 22) {
                tljVar.vt(com.bytedance.adsdk.ugeno.yoga.yu.LEFT, fFloatValue);
            } else if (iKeyAt == 21) {
                tljVar.vt(com.bytedance.adsdk.ugeno.yoga.yu.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                tljVar.vt(com.bytedance.adsdk.ugeno.yoga.yu.RIGHT, fFloatValue);
            } else if (iKeyAt == 23) {
                tljVar.vt(com.bytedance.adsdk.ugeno.yoga.yu.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                tljVar.lh(com.bytedance.adsdk.ugeno.yoga.yu.LEFT, fFloatValue);
            } else if (iKeyAt == 10) {
                tljVar.lh(com.bytedance.adsdk.ugeno.yoga.yu.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                tljVar.lh(com.bytedance.adsdk.ugeno.yoga.yu.RIGHT, fFloatValue);
            } else if (iKeyAt == 12) {
                tljVar.lh(com.bytedance.adsdk.ugeno.yoga.yu.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                tljVar.ouw(ryl.ouw(Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    tljVar.fkw();
                } else if (fFloatValue == -2.0f) {
                    tljVar.le();
                } else {
                    tljVar.yu(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                tljVar.ouw(mwh.ouw(Math.round(fFloatValue)));
            }
        }
    }
}
