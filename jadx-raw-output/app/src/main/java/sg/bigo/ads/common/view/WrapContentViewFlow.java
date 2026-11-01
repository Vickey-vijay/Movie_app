package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class WrapContentViewFlow extends ViewFlow {
    public WrapContentViewFlow(Context context) {
        this(context, null);
    }

    public WrapContentViewFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // sg.bigo.ads.common.view.ViewFlow, android.view.View
    public void onMeasure(int i10, int i11) {
        int defaultSize = View.getDefaultSize(Integer.MIN_VALUE, i10);
        int defaultSize2 = View.getDefaultSize(Integer.MIN_VALUE, i11);
        this.f70162j = Math.min(defaultSize / 10, this.f70161i);
        ((ViewFlow) this).f70153a = Math.min(Math.max(0, ((ViewFlow) this).f70153a), ((ViewFlow) this).f70154b - 1);
        int i12 = defaultSize - (this.f70156d * 2);
        int childCount = getChildCount();
        int iMax = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                if (childAt == this.f70157e || childAt == this.f70158f) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
                } else {
                    ViewFlow.b bVar = (ViewFlow.b) childAt.getLayoutParams();
                    if (bVar != null) {
                        int i14 = ((ViewGroup.LayoutParams) bVar).width;
                        childAt.measure(i14 != -2 ? i14 != -1 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : ViewGroup.getChildMeasureSpec(i10, this.f70156d * 2, i14), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
                        iMax = Math.max(iMax, childAt.getMeasuredHeight());
                    }
                }
            }
        }
        setMeasuredDimension(defaultSize, Math.min(iMax, defaultSize2));
    }
}
