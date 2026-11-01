package com.mgs.carparking.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class BetterRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42273e;

    public BetterRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BetterRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42270b = -1;
        this.f42273e = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (actionMasked != 5) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                this.f42270b = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                this.f42271c = (int) (MotionEventCompat.getX(motionEvent, actionIndex) + 0.5f);
                this.f42272d = (int) (MotionEventCompat.getY(motionEvent, actionIndex) + 0.5f);
                return super.onInterceptTouchEvent(motionEvent);
            }
            int iFindPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.f42270b);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x10 = (int) (MotionEventCompat.getX(motionEvent, iFindPointerIndex) + 0.5f);
            int y10 = (int) (MotionEventCompat.getY(motionEvent, iFindPointerIndex) + 0.5f);
            if (getScrollState() != 1) {
                int i10 = x10 - this.f42271c;
                int i11 = y10 - this.f42272d;
                boolean zCanScrollHorizontally = getLayoutManager().canScrollHorizontally();
                boolean zCanScrollVertically = getLayoutManager().canScrollVertically();
                if (zCanScrollHorizontally && Math.abs(i10) > this.f42273e && (Math.abs(i10) >= Math.abs(i11) || zCanScrollVertically)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (zCanScrollVertically && Math.abs(i11) > this.f42273e && (Math.abs(i11) >= Math.abs(i10) || zCanScrollHorizontally)) {
                    z10 = true;
                }
                if (!z10 || !super.onInterceptTouchEvent(motionEvent)) {
                    return false;
                }
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.f42270b = MotionEventCompat.getPointerId(motionEvent, 0);
        this.f42271c = (int) (motionEvent.getX() + 0.5f);
        this.f42272d = (int) (motionEvent.getY() + 0.5f);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i10) {
        super.setScrollingTouchSlop(i10);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f42273e = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
                return;
            }
            return;
        }
        this.f42273e = viewConfiguration.getScaledTouchSlop();
    }
}
