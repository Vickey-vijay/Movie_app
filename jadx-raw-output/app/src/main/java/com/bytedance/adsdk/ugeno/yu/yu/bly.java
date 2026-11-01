package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.yu.mwh;

/* JADX INFO: loaded from: classes10.dex */
public final class bly extends lh {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public mwh f11060cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private boolean f11061jg;
    private float mwh;
    private float ryl;

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        float rawX;
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        mwh mwhVar = this.f11060cf;
        if (mwhVar != null) {
            return mwhVar.ouw(this.vt, motionEvent, this.ouw, this);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ryl = motionEvent.getRawX();
            this.mwh = motionEvent.getRawY();
        } else if (action == 1) {
            if (this.f11061jg) {
                this.f11061jg = false;
                this.ryl = 0.0f;
                this.mwh = 0.0f;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (Math.abs(rawX - this.ryl) < 15.0f || Math.abs(rawY - this.mwh) >= 15.0f) {
                this.f11061jg = false;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            Log.d("GesThrough_UGTapEvent", "Tap event, direct handling");
            com.bytedance.adsdk.ugeno.yu.cf cfVar = this.ouw;
            if (cfVar != null) {
                cfVar.ouw(this.f11068le, this.f11069lh.vt);
                this.ryl = 0.0f;
                this.mwh = 0.0f;
            }
        } else if (action == 2) {
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.ryl) >= 15.0f || Math.abs(rawY2 - this.mwh) >= 15.0f) {
                this.f11061jg = true;
            }
        } else if (action == 3) {
            this.f11061jg = false;
            if (this.f11061jg) {
                this.f11061jg = false;
                this.ryl = 0.0f;
                this.mwh = 0.0f;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            rawX = motionEvent.getRawX();
            float rawY3 = motionEvent.getRawY();
            if (Math.abs(rawX - this.ryl) < 15.0f) {
            }
            this.f11061jg = false;
            Log.d("GesThrough_UGTapEvent", "Non-tap event");
            return false;
        }
        return true;
    }

    public bly(Context context) {
        super(context);
    }
}
