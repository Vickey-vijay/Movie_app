package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.o0;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes6.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ClickRecognitionState f6871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f6872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PointF f6873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f6874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f6875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final OnClickListener f6876i;

    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f6876i.onClick(view, motionEvent);
        this.f6874g = true;
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.k kVar, x4 x4Var, Context context, OnClickListener onClickListener) {
        this.f6868a = ((Long) kVar.a(x4.f9892c0)).longValue();
        this.f6869b = ((Integer) kVar.a(x4.f9901d0)).intValue();
        this.f6870c = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(x4.f9937h0)).intValue());
        this.f6871d = ClickRecognitionState.values()[((Integer) kVar.a(x4Var)).intValue()];
        this.f6875h = context;
        this.f6876i = onClickListener;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f10 = pointF.x - pointF2.x;
        float f11 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f10 * f10) + (f11 * f11)));
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f6874g && this.f6871d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f6874g && this.f6871d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f6871d == ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f6872e;
                float fA = a(this.f6873f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f6874g) {
                    long j10 = this.f6868a;
                    if ((j10 < 0 || jElapsedRealtime < j10) && ((i10 = this.f6869b) < 0 || fA < i10)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f6871d == ClickRecognitionState.ACTION_DOWN) {
            if (a(motionEvent)) {
                a(view, motionEvent);
            }
        } else {
            this.f6872e = SystemClock.elapsedRealtime();
            this.f6873f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f6874g = false;
        }
        return true;
    }

    private float a(float f10) {
        return f10 / this.f6875h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f6870c <= 0) {
            return true;
        }
        Point pointB = o0.b(this.f6875h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i10 = this.f6870c;
        float f10 = i10;
        return rawX >= f10 && rawY >= f10 && rawX <= ((float) (pointB.x - i10)) && rawY <= ((float) (pointB.y - i10));
    }
}
