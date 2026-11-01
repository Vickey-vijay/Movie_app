package com.mgs.carparking.widgets.rv;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class SV_RV_inner extends RecyclerView {
    public SV_RV_inner(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() == 2) {
            Log.d("SV_RV", "dispatchTouchEvent: 内层在滑动++");
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
