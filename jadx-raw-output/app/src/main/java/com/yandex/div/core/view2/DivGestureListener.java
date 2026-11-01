package com.yandex.div.core.view2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import bk.a;
import mj.r;

/* JADX INFO: compiled from: DivGestureListener.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivGestureListener extends GestureDetector.SimpleOnGestureListener {
    private final boolean awaitLongClick;
    private a<r> onDoubleTapListener;
    private a<r> onSingleTapListener;

    public final a<r> getOnDoubleTapListener() {
        return this.onDoubleTapListener;
    }

    public final a<r> getOnSingleTapListener() {
        return this.onSingleTapListener;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        a<r> aVar = this.onDoubleTapListener;
        if (aVar == null) {
            return false;
        }
        aVar.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return (this.awaitLongClick || (this.onDoubleTapListener == null && this.onSingleTapListener == null)) ? false : true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        a<r> aVar;
        if (this.onDoubleTapListener == null || (aVar = this.onSingleTapListener) == null) {
            return false;
        }
        if (aVar == null) {
            return true;
        }
        aVar.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        a<r> aVar;
        if (this.onDoubleTapListener != null || (aVar = this.onSingleTapListener) == null) {
            return false;
        }
        if (aVar == null) {
            return true;
        }
        aVar.invoke();
        return true;
    }

    public final void setOnDoubleTapListener(a<r> aVar) {
        this.onDoubleTapListener = aVar;
    }

    public final void setOnSingleTapListener(a<r> aVar) {
        this.onSingleTapListener = aVar;
    }

    public DivGestureListener(boolean z10) {
        this.awaitLongClick = z10;
    }
}
