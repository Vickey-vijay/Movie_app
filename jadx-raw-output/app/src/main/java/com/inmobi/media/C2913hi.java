package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C2913hi;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: renamed from: com.inmobi.media.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2913hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC2785ci f24512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24513b;

    public final void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: b7.x7
            @Override // java.lang.Runnable
            public final void run() {
                C2913hi.a(this.f5250b);
            }
        }, this.f24513b);
    }

    public C2913hi(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, long j10) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.f24512a = gestureDetectorOnGestureListenerC2785ci;
        this.f24513b = j10;
    }

    public static final void a(C2913hi c2913hi) {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = c2913hi.f24512a;
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            gestureDetectorOnGestureListenerC2785ci.i();
        }
        c2913hi.f24512a = null;
    }
}
