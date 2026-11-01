package com.inmobi.media;

import android.view.MotionEvent;

/* JADX INFO: renamed from: com.inmobi.media.vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3263vk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC2785ci f25587a;

    public C3263vk(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "mListener");
        this.f25587a = gestureDetectorOnGestureListenerC2785ci;
    }

    public final void a(MotionEvent motionEvent) {
        ck.p.j(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f25587a.a(motionEvent.getX(), motionEvent.getY());
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f25587a.b(motionEvent.getX(), motionEvent.getY());
        }
    }
}
