package com.fyber.inneractive.sdk.player.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.g1;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f18083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f18084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f18086d;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    public q(s sVar, View view, int[] iArr, int i10) {
        this.f18086d = sVar;
        this.f18083a = view;
        this.f18084b = iArr;
        this.f18085c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        onSingleTapConfirmed(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f18083a.getRootView().getLocationOnScreen(this.f18084b);
            float rawX = motionEvent.getRawX() - this.f18084b[0];
            float rawY = motionEvent.getRawY() - this.f18084b[1];
            g1 g1Var = this.f18086d.f18067a;
            g1Var.f18579a = rawX;
            g1Var.f18580b = rawY;
        }
        s sVar = this.f18086d;
        n nVar = sVar.f18073g;
        if (nVar != null) {
            ((z) nVar).a(this.f18085c, sVar.f18067a);
        }
        return true;
    }
}
