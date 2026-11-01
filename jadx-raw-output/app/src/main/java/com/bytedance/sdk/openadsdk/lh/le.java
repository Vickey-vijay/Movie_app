package com.bytedance.sdk.openadsdk.lh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class le extends ScrollView {
    private final tlj ouw;
    private final com.bytedance.sdk.openadsdk.core.le.fkw vt;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void ouw(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            list = null;
        } else {
            int i10 = -1;
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (list.get(i11).hasSecondOptions()) {
                    i10 = i11;
                }
            }
            if (i10 == -1 || i10 > list.size()) {
                i10 = 0;
            }
            FilterWord filterWord = list.get(i10);
            Iterator<FilterWord> it = list.iterator();
            while (it.hasNext()) {
                FilterWord next = it.next();
                if (!next.hasSecondOptions()) {
                    filterWord.addOption(next);
                    it.remove();
                }
            }
        }
        if (list == null) {
            return;
        }
        this.vt.removeAllViews();
        for (int i12 = 0; i12 < list.size(); i12++) {
            FilterWord filterWord2 = list.get(i12);
            if (filterWord2 != null) {
                this.vt.addView(new ra(getContext(), filterWord2, this.ouw));
            }
            if (i12 < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int iOuw = osn.ouw(getContext(), this.ouw.fkw() ? 16.0f : 8.0f);
                layoutParams.topMargin = iOuw;
                layoutParams.bottomMargin = iOuw;
                this.vt.addView(new cf(getContext()), layoutParams);
            }
        }
    }

    public le(Context context, tlj tljVar) {
        super(context);
        this.ouw = tljVar;
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        this.vt = fkwVar;
        fkwVar.setOrientation(1);
        addView(fkwVar, new FrameLayout.LayoutParams(-1, -2));
        int i10 = tljVar.zih;
        if (i10 == 0 && i10 == 0) {
            tljVar.ouw(osn.yu(getContext()), osn.le(getContext()));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }
}
