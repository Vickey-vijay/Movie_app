package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.GuardedBy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdpk implements GestureDetector.OnGestureListener {

    @GuardedBy("this")
    private final zzdoc zza;
    private final zzdpc zzb;

    public zzdpk(zzdoc zzdocVar, zzdpc zzdpcVar) {
        this.zza = zzdocVar;
        this.zzb = zzdpcVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int y10;
        zzdoc zzdocVar = this.zza;
        if (zzdocVar != null) {
            int i10 = -1;
            if (Math.abs(f10) > Math.abs(f11)) {
                if (f10 > 0.0f) {
                    y10 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f10) * 1000.0f);
                    i10 = 1;
                } else if (f10 < 0.0f) {
                    y10 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f10) * 1000.0f);
                    i10 = 2;
                } else {
                    y10 = 0;
                }
            } else if (f11 > 0.0f) {
                y10 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f11) * 1000.0f);
                i10 = 8;
            } else if (f11 < 0.0f) {
                y10 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f11) * 1000.0f);
                i10 = 4;
            } else {
                y10 = 0;
            }
            if (i10 == zzdocVar.zzG()) {
                zzdocVar.zzE(this.zzb.zzr(), y10);
                return false;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
