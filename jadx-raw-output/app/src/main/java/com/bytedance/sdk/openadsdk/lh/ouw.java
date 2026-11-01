package com.bytedance.sdk.openadsdk.lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw extends com.bytedance.sdk.openadsdk.core.le.pno {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f13243lh;
    private Paint ouw;
    private float vt;
    private int yu;

    @Override // com.bytedance.sdk.openadsdk.core.le.pno, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final void setMinTextSize(float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        this.vt = f10;
    }

    private float ouw(float f10, String str) {
        this.ouw.setTextSize(f10);
        return this.ouw.measureText(str);
    }

    public ouw(Context context) {
        super(context);
        this.vt = osn.vt(getContext());
        this.ouw = new Paint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        String string = getText().toString();
        int width = getWidth();
        if (!this.f13243lh && width > 0) {
            float textSize = getTextSize();
            this.ouw.set(getPaint());
            int paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
            float fOuw = ouw(textSize, string);
            while (fOuw > paddingLeft) {
                textSize -= 1.0f;
                this.ouw.setTextSize(textSize);
                if (textSize <= this.vt) {
                    break;
                } else {
                    fOuw = ouw(textSize, string);
                }
            }
            setTextSize(0, textSize);
            this.f13243lh = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.pno, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.yu = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.yu);
        } else {
            layoutParams.height = this.yu;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.pno, android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i10 = this.yu;
        if (i10 != 0 && layoutParams != null) {
            layoutParams.height = i10;
        }
    }
}
