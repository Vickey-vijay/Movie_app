package com.mgs.carparking.shorttk;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;

/* JADX INFO: loaded from: classes9.dex */
public class FixedSeekBar extends AppCompatSeekBar {
    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        if (getProgressDrawable() != null && getThumb() != null) {
            int paddingLeft = getPaddingLeft() + ((int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * ((getProgress() * 1.0f) / getMax())));
            int iWidth = getThumb().getBounds().width() / 2;
            getThumb().setBounds(paddingLeft - iWidth, getThumb().getBounds().top, paddingLeft + iWidth, getThumb().getBounds().bottom);
        }
        super.onDraw(canvas);
    }

    public FixedSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setThumbOffset(0);
    }
}
