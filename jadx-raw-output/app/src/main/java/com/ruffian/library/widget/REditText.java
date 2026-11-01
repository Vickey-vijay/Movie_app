package com.ruffian.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatEditText;
import wb.c;

/* JADX INFO: loaded from: classes10.dex */
public class REditText extends AppCompatEditText {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f43349b;

    public c getHelper() {
        return this.f43349b;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f43349b;
        if (cVar != null) {
            cVar.O(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z10) {
        c cVar = this.f43349b;
        if (cVar != null) {
            cVar.Z(z10);
        }
        super.setSelected(z10);
    }

    public REditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43349b = new c(context, this, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        c cVar = this.f43349b;
        if (cVar != null) {
            cVar.R(z10);
        }
    }
}
