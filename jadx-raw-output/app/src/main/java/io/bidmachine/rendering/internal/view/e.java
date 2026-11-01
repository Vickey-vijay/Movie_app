package io.bidmachine.rendering.internal.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.model.ElementLayoutParams;
import io.bidmachine.rendering.model.SideBindParams;
import io.bidmachine.rendering.model.SideType;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class e extends RelativeLayout {

    public static class a extends RelativeLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f60625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f60626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f60627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f60628d;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f60627c = 1.0f;
            this.f60628d = 1.0f;
            this.f60625a = i10;
            this.f60626b = i11;
        }

        private boolean a(SideBindParams sideBindParams, SideBindParams sideBindParams2, int i10, int i11) {
            if (i11 <= 0 || sideBindParams == null || sideBindParams2 == null) {
                return false;
            }
            addRule(i10);
            return true;
        }

        private void b(SideBindParams sideBindParams, SideBindParams sideBindParams2, List list) {
            a(sideBindParams, SideType.Top, 6, 3, 10, list);
            a(sideBindParams2, SideType.Bottom, 8, 2, 12, list);
        }

        private void a(SideBindParams sideBindParams, SideBindParams sideBindParams2, List list) {
            a(sideBindParams, SideType.Left, 5, 1, 9, list);
            a(sideBindParams2, SideType.Right, 7, 0, 11, list);
        }

        public void b(float f10) {
            this.f60627c = f10;
        }

        private void a(SideBindParams sideBindParams, SideType sideType, int i10, int i11, int i12, List list) {
            if (sideBindParams == null) {
                return;
            }
            View viewA = a(list, sideBindParams.getTargetName());
            if (viewA == null) {
                addRule(i12);
                return;
            }
            if (sideBindParams.getTargetSideType() != sideType) {
                i10 = i11;
            }
            addRule(i10, viewA.getId());
        }

        private View a(List list, String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                io.bidmachine.rendering.internal.c cVar = (io.bidmachine.rendering.internal.c) it.next();
                if (cVar.h().getName().equals(str)) {
                    return cVar.k();
                }
            }
            return null;
        }

        public void a(float f10) {
            this.f60628d = f10;
        }

        public void a(Context context, ElementLayoutParams elementLayoutParams, List list) {
            b(elementLayoutParams.getWidthPercent());
            a(elementLayoutParams.getHeightPercent());
            setMargins(elementLayoutParams.getMarginLeftPx(context), elementLayoutParams.getMarginTopPx(context), -elementLayoutParams.getMarginRightPx(context), -elementLayoutParams.getMarginBottomPx(context));
            SideBindParams topSideBindParams = elementLayoutParams.getTopSideBindParams();
            SideBindParams bottomSideBindParams = elementLayoutParams.getBottomSideBindParams();
            if (!a(topSideBindParams, bottomSideBindParams, 15, elementLayoutParams.getWidthPx(context))) {
                b(topSideBindParams, bottomSideBindParams, list);
            }
            SideBindParams leftSideBindParams = elementLayoutParams.getLeftSideBindParams();
            SideBindParams rightSideBindParams = elementLayoutParams.getRightSideBindParams();
            if (a(leftSideBindParams, rightSideBindParams, 14, elementLayoutParams.getHeightPx(context))) {
                return;
            }
            a(leftSideBindParams, rightSideBindParams, list);
        }
    }

    public e(Context context) {
        super(context);
    }

    public void a(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof a) {
                a(size, size2, childAt, (a) layoutParams);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        a(i10, i11);
        super.onMeasure(i10, i11);
    }

    private void a(int i10, int i11, View view, a aVar) {
        Integer numA;
        Integer numA2;
        float f10 = aVar.f60627c;
        if (f10 > 0.0f && f10 < 1.0f && (numA2 = a(aVar.f60625a, i10, view.getMeasuredWidth(), f10)) != null) {
            ((RelativeLayout.LayoutParams) aVar).width = numA2.intValue();
        }
        float f11 = aVar.f60628d;
        if (f11 <= 0.0f || f11 >= 1.0f || (numA = a(aVar.f60626b, i11, view.getMeasuredHeight(), f11)) == null) {
            return;
        }
        ((RelativeLayout.LayoutParams) aVar).height = numA.intValue();
    }

    public Integer a(int i10, int i11, int i12, float f10) {
        if (i10 <= 0) {
            if (i10 == -1) {
                i10 = i11;
            } else {
                if (i10 != -2 || i12 == 0) {
                    return null;
                }
                i10 = i12;
            }
        }
        if (i10 == 0) {
            return null;
        }
        return Integer.valueOf(Math.round(i10 * f10));
    }
}
