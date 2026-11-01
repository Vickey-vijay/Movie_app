package com.bytedance.sdk.component.adexpress.dynamic.lh.ouw;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class fkw implements View.OnTouchListener {
    private int fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f11393lh;
    private float ouw;
    private float vt;
    private com.bytedance.sdk.component.adexpress.dynamic.lh.pno yu;

    public fkw(com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar, int i10) {
        this.yu = pnoVar;
        this.fkw = i10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float y10 = motionEvent.getY();
                    this.vt = y10;
                    if (Math.abs(y10 - this.ouw) > 10.0f) {
                        this.f11393lh = true;
                    }
                }
            } else {
                if (!this.f11393lh) {
                    return false;
                }
                int iVt = com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), Math.abs(this.vt - this.ouw));
                if (this.vt - this.ouw < 0.0f && iVt > this.fkw && (pnoVar = this.yu) != null) {
                    pnoVar.ouw();
                    this.ouw = 0.0f;
                    this.vt = 0.0f;
                    this.f11393lh = false;
                }
            }
        } else {
            this.ouw = motionEvent.getY();
        }
        return true;
    }
}
