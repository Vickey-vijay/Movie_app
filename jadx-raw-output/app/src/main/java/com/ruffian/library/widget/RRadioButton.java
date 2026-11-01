package com.ruffian.library.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatRadioButton;
import wb.b;

/* JADX INFO: loaded from: classes6.dex */
public class RRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f43365b;

    public b getHelper() {
        return this.f43365b;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar = this.f43365b;
        if (bVar != null) {
            bVar.O(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        b bVar = this.f43365b;
        if (bVar != null) {
            bVar.P(z10);
        }
        super.setChecked(z10);
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z10) {
        b bVar = this.f43365b;
        if (bVar != null) {
            bVar.Z(z10);
        }
        super.setSelected(z10);
    }

    public RRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43365b = new b(context, this, attributeSet);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b bVar = this.f43365b;
        if (bVar != null) {
            bVar.F();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        b bVar = this.f43365b;
        if (bVar != null) {
            bVar.R(z10);
        }
    }
}
