package com.ruffian.library.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;
import wb.c;

/* JADX INFO: loaded from: classes3.dex */
public class RTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f43367b;

    public c getHelper() {
        return this.f43367b;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f43367b;
        if (cVar != null) {
            cVar.O(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z10) {
        c cVar = this.f43367b;
        if (cVar != null) {
            cVar.Z(z10);
        }
        super.setSelected(z10);
    }

    public RTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43367b = new c(context, this, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c cVar = this.f43367b;
        if (cVar != null) {
            cVar.F();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        c cVar = this.f43367b;
        if (cVar != null) {
            cVar.R(z10);
        }
    }
}
