package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes9.dex */
public final class jqy extends GestureDetector {
    public final ouw ouw;
    public final com.bytedance.sdk.openadsdk.core.lh.le vt;

    public static class ouw extends GestureDetector.SimpleOnGestureListener {
        public boolean ouw = false;

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            this.ouw = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public jqy(Context context) {
        this(context, new ouw());
    }

    private jqy(Context context, ouw ouwVar) {
        super(context, ouwVar);
        this.ouw = ouwVar;
        this.vt = new com.bytedance.sdk.openadsdk.core.lh.le();
        setIsLongpressEnabled(false);
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        com.bytedance.sdk.openadsdk.core.lh.le leVar = this.vt;
        leVar.pno = motionEvent.getDeviceId();
        int i11 = 0;
        leVar.f12708ra = motionEvent.getToolType(0);
        leVar.bly = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i12 = 1;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                leVar.f12707lh = motionEvent.getRawX();
                leVar.yu = motionEvent.getRawY();
                leVar.f12706le = System.currentTimeMillis();
                if (Math.abs(leVar.f12707lh - leVar.f12710vm) >= com.bytedance.sdk.openadsdk.core.lh.le.tlj || Math.abs(leVar.yu - leVar.f12709th) >= com.bytedance.sdk.openadsdk.core.lh.le.tlj) {
                    leVar.f12705cf = false;
                }
                i10 = 3;
            } else if (actionMasked != 2) {
                i11 = actionMasked != 3 ? -1 : 4;
            } else {
                com.bytedance.sdk.openadsdk.core.lh.le.f12703ko += Math.abs(motionEvent.getX() - com.bytedance.sdk.openadsdk.core.lh.le.mwh);
                com.bytedance.sdk.openadsdk.core.lh.le.f12704rn += Math.abs(motionEvent.getY() - com.bytedance.sdk.openadsdk.core.lh.le.f12702jg);
                com.bytedance.sdk.openadsdk.core.lh.le.mwh = motionEvent.getX();
                com.bytedance.sdk.openadsdk.core.lh.le.f12702jg = motionEvent.getY();
                if (System.currentTimeMillis() - com.bytedance.sdk.openadsdk.core.lh.le.zih <= 200 || (com.bytedance.sdk.openadsdk.core.lh.le.f12703ko <= com.bytedance.sdk.openadsdk.core.lh.le.tlj && com.bytedance.sdk.openadsdk.core.lh.le.f12704rn <= com.bytedance.sdk.openadsdk.core.lh.le.tlj)) {
                    i12 = 2;
                }
                leVar.f12707lh = motionEvent.getRawX();
                leVar.yu = motionEvent.getRawY();
                if (Math.abs(leVar.f12707lh - leVar.f12710vm) >= com.bytedance.sdk.openadsdk.core.lh.le.tlj || Math.abs(leVar.yu - leVar.f12709th) >= com.bytedance.sdk.openadsdk.core.lh.le.tlj) {
                    leVar.f12705cf = false;
                }
                i10 = i12;
            }
            leVar.ryl.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.lh.lh.ouw(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
            return super.onTouchEvent(motionEvent);
        }
        leVar.f12710vm = (int) motionEvent.getRawX();
        leVar.f12709th = (int) motionEvent.getRawY();
        leVar.ouw = motionEvent.getRawX();
        leVar.vt = motionEvent.getRawY();
        leVar.fkw = System.currentTimeMillis();
        leVar.f12708ra = motionEvent.getToolType(0);
        leVar.pno = motionEvent.getDeviceId();
        leVar.bly = motionEvent.getSource();
        com.bytedance.sdk.openadsdk.core.lh.le.zih = System.currentTimeMillis();
        leVar.f12705cf = true;
        i10 = i11;
        leVar.ryl.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.lh.lh.ouw(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        return super.onTouchEvent(motionEvent);
    }
}
