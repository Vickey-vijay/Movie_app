package com.bytedance.adsdk.ugeno.core.vt;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class ouw {
    public String ouw = "GesThrough_";
    public List<MotionEvent> vt = new ArrayList();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public Set<String> f10843lh = Collections.synchronizedSet(new HashSet());

    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, MotionEvent motionEvent) {
        if (lhVar == null || motionEvent == null || this.vt == null) {
            return;
        }
        ouw(lhVar.fkw, lhVar.ksc(), motionEvent);
    }

    private void ouw(View view, String str, MotionEvent motionEvent) {
        if (view == null || motionEvent == null || this.vt == null) {
            return;
        }
        this.ouw = "GesThrough_".concat(String.valueOf(str));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (motionEvent.getAction() == 0) {
            this.vt.clear();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(i10, i11);
        this.vt.add(motionEventObtain);
    }

    public final boolean ouw(MotionEvent motionEvent) {
        if (motionEvent == null || this.f10843lh == null) {
            return false;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        return this.f10843lh.contains(motionEvent.getDownTime() + "_" + pointerId);
    }

    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        T t10;
        if (this.vt.isEmpty() || this.f10843lh == null || lhVar == null || (t10 = lhVar.fkw) == 0 || t10.getRootView() == null) {
            return;
        }
        T t11 = lhVar.fkw;
        if (this.vt.isEmpty() || this.f10843lh == null || t11 == 0 || t11.getRootView() == null) {
            return;
        }
        final View rootView = t11.getRootView();
        Log.d(this.ouw, "Re-dispatch motionEvents.size(): " + this.vt.size());
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.vt.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                for (MotionEvent motionEvent : ouw.this.vt) {
                    if (motionEvent != null) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        ouw.this.f10843lh.add(motionEvent.getDownTime() + "_" + pointerId);
                        rootView.dispatchTouchEvent(motionEvent);
                        motionEvent.recycle();
                    }
                }
                ouw.this.vt.clear();
            }
        }, 300L);
    }
}
