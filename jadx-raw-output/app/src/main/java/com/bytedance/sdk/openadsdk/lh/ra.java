package com.bytedance.sdk.openadsdk.lh;

import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public final class ra extends LinearLayout {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final tlj f13244lh;
    private final FilterWord ouw;
    private pno vt;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public ra(Context context, FilterWord filterWord, tlj tljVar) {
        int i10;
        super(context);
        setOrientation(1);
        this.ouw = filterWord;
        this.f13244lh = tljVar;
        String name = filterWord.getName();
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = osn.ouw(getContext(), 12.0f);
        layoutParams.gravity = 17;
        pnoVar.setGravity(17);
        pnoVar.setText(name);
        pnoVar.setTextColor(Color.argb(85, 22, 24, 35));
        if (tljVar.fkw()) {
            i10 = 14;
        } else {
            i10 = 10;
        }
        pnoVar.setTextSize(i10);
        addView(pnoVar, layoutParams);
        this.vt = new pno(getContext(), tljVar);
        new LinearLayout.LayoutParams(-1, -2);
        this.vt.ouw(filterWord.getOptions());
        addView(this.vt);
    }
}
