package com.bytedance.sdk.component.bly;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.sdk.component.utils.ko;

/* JADX INFO: loaded from: classes10.dex */
public abstract class lh implements View.OnTouchListener {
    private ViewConfiguration ouw;
    private int vt = -1;

    public abstract void ouw(View.OnTouchListener onTouchListener);

    public final boolean ouw(float f10, float f11, float f12, float f13, Context context) {
        if (this.ouw == null) {
            this.ouw = ViewConfiguration.get(context);
        }
        if (this.vt == -1) {
            this.vt = this.ouw.getScaledTouchSlop();
        }
        ko.ouw("arbitrage_click", "mTouchSlop is: ", Integer.valueOf(this.vt));
        if (Math.abs(f10 - f12) > this.vt || Math.abs(f11 - f13) > this.vt) {
            ko.ouw("arbitrage_click", "notClick", "upX: ", Float.valueOf(f10), " ,downX: ", Float.valueOf(f12), " ,upY: ", Float.valueOf(f11), "downY: ", Float.valueOf(f13));
            return false;
        }
        ko.ouw("arbitrage_click", "isClick", "upX: ", Float.valueOf(f10), " ,downX: ", Float.valueOf(f12), " ,upY: ", Float.valueOf(f11), "downY: ", Float.valueOf(f13));
        return true;
    }
}
