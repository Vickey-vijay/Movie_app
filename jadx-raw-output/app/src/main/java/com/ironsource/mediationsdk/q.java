package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.ironsource.C3725u2;
import com.ironsource.Ga;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes10.dex */
public class q extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ISBannerSize f29924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f29927d;

    public interface a {
        void onWindowFocusChanged(boolean z10);
    }

    public q(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f29926c = false;
        this.f29924a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public void a() {
        this.f29926c = true;
        this.f29924a = null;
        this.f29925b = null;
        this.f29927d = null;
        C3725u2.a().a((Ga) null);
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

    public boolean b() {
        return this.f29926c;
    }

    public q c() {
        q qVar = new q(getContext(), this.f29924a);
        qVar.f29925b = this.f29925b;
        return qVar;
    }

    public ISBannerSize getSize() {
        return this.f29924a;
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.f29924a = iSBannerSize;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        a aVar = this.f29927d;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z10);
        }
    }

    public q(Context context, ISBannerSize iSBannerSize) {
        super(context);
        this.f29926c = false;
        this.f29924a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public q(Context context) {
        super(context);
        this.f29926c = false;
    }
}
