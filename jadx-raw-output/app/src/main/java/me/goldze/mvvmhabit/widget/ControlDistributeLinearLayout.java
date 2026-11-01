package me.goldze.mvvmhabit.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import me.goldze.mvvmhabit.R$styleable;

/* JADX INFO: loaded from: classes3.dex */
public class ControlDistributeLinearLayout extends LinearLayout {
    private boolean isDistributeEvent;

    public ControlDistributeLinearLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.isDistributeEvent = false;
        this.isDistributeEvent = getContext().obtainStyledAttributes(attributeSet, R$styleable.ControlDistributeLinearLayout).getBoolean(R$styleable.ControlDistributeLinearLayout_distribute_event, false);
    }

    public boolean isDistributeEvent() {
        return this.isDistributeEvent;
    }

    public void setDistributeEvent(boolean z10) {
        this.isDistributeEvent = z10;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isDistributeEvent();
    }

    public ControlDistributeLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ControlDistributeLinearLayout(Context context) {
        this(context, null);
    }
}
