package chuangyuan.ycj.videolibrary.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes9.dex */
public class ExoDefaultTimeBar extends DefaultTimeBar {
    public boolean L;

    @Override // com.google.android.exoplayer2.ui.DefaultTimeBar, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.ui.DefaultTimeBar, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.google.android.exoplayer2.ui.DefaultTimeBar, com.google.android.exoplayer2.ui.a
    public boolean a() {
        return this.L;
    }

    public void setOpenSeek(boolean z10) {
        this.L = z10;
    }

    public ExoDefaultTimeBar(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = true;
        new DefaultTimeBar(context, attributeSet);
    }
}
