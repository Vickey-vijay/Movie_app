package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.B7;
import com.ironsource.C3426d4;
import com.ironsource.C3676r4;
import com.ironsource.C3742v2;
import com.ironsource.Lb;
import com.ironsource.Qc;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes2.dex */
public class h extends FrameLayout implements Qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f30937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f30938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B7 f30939c;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.addView(h.this);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.removeView(h.this);
            }
        }
    }

    public void a(v vVar) {
        this.f30938b = vVar;
        vVar.a(this);
        this.f30938b.E();
        this.f30937a = this.f30938b.p();
        a(getStatusBarPadding(), getNavigationBarPadding());
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44960f, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.ironsource.Qc
    public void onOrientationChanged(String str, int i10) {
    }

    private void b() {
        ((Activity) this.f30937a).runOnUiThread(new b());
    }

    private int getNavigationBarPadding() {
        Activity activity = (Activity) this.f30937a;
        try {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getDrawingRect(rect);
            Rect rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (this.f30939c.z(activity) == 1) {
                int i10 = rect.bottom - rect2.bottom;
                if (i10 > 0) {
                    return i10;
                }
                return 0;
            }
            int i11 = rect.right - rect2.right;
            if (i11 > 0) {
                return i11;
            }
            return 0;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return 0;
        }
    }

    @SuppressLint({"DiscouragedApi", "InternalInsetResource"})
    private int getStatusBarHeight() {
        int identifier;
        try {
            Context context = this.f30937a;
            if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                return this.f30937a.getResources().getDimensionPixelSize(identifier);
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
        }
        return 0;
    }

    private int getStatusBarPadding() {
        int statusBarHeight;
        if ((((Activity) this.f30937a).getWindow().getAttributes().flags & 1024) == 0 && (statusBarHeight = getStatusBarHeight()) > 0) {
            return statusBarHeight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getWindowDecorViewGroup() {
        Activity activity = (Activity) this.f30937a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    public h(Context context) {
        super(context);
        this.f30939c = Lb.U().i();
        this.f30937a = context;
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30938b.F();
        this.f30938b.b(true, C3426d4.i.Z);
    }

    @Override // com.ironsource.Qc
    public boolean onBackButtonPressed() {
        return C3742v2.a().a((Activity) this.f30937a);
    }

    @Override // com.ironsource.Qc
    public void onCloseRequested() {
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30938b.B();
        this.f30938b.b(false, C3426d4.i.Z);
        v vVar = this.f30938b;
        if (vVar != null) {
            vVar.a(v.EnumC0288v.Gone);
            this.f30938b.C();
            this.f30938b.D();
        }
        removeAllViews();
    }

    private void a() {
        ((Activity) this.f30937a).runOnUiThread(new a());
    }

    private void a(int i10, int i11) {
        try {
            Context context = this.f30937a;
            if (context != null) {
                int iZ = this.f30939c.z(context);
                if (iZ == 1) {
                    setPadding(0, i10, 0, i11);
                } else if (iZ == 2) {
                    setPadding(0, i10, i11, 0);
                }
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
        }
    }
}
