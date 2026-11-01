package com.mgs.carparking.widgets.rv;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class ScrollRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f42881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f42882c;

    public ScrollRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrollRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float fAbs = Math.abs(motionEvent.getX() - this.f42881b);
                    float fAbs2 = Math.abs(motionEvent.getY() - this.f42882c);
                    if ((fAbs > 0.0f || fAbs2 > 0.0f) && fAbs > fAbs2) {
                        requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                    return zOnInterceptTouchEvent;
                }
                return zOnInterceptTouchEvent;
            }
            return false;
        }
        this.f42881b = motionEvent.getX();
        this.f42882c = motionEvent.getY();
        return zOnInterceptTouchEvent;
    }
}
