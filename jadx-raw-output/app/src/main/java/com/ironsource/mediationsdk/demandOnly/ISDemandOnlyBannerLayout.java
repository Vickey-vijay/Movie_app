package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C3708t2;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes11.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f29635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ISBannerSize f29636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Activity f29638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C3708t2 f29640f;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f29641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FrameLayout.LayoutParams f29642b;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f29641a = view;
            this.f29642b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.f29641a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f29641a);
            }
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = ISDemandOnlyBannerLayout.this;
            View view = this.f29641a;
            iSDemandOnlyBannerLayout.f29635a = view;
            iSDemandOnlyBannerLayout.addView(view, 0, this.f29642b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f29639e = false;
        this.f29638d = activity;
        this.f29636b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f29640f = new C3708t2();
    }

    public void a() {
        this.f29639e = true;
        this.f29638d = null;
        this.f29636b = null;
        this.f29637c = null;
        this.f29635a = null;
        removeBannerListener();
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

    public Activity getActivity() {
        return this.f29638d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f29640f.a();
    }

    public View getBannerView() {
        return this.f29635a;
    }

    public C3708t2 getListener() {
        return this.f29640f;
    }

    public String getPlacementName() {
        return this.f29637c;
    }

    public ISBannerSize getSize() {
        return this.f29636b;
    }

    public boolean isDestroyed() {
        return this.f29639e;
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f29640f.b((Object) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f29640f.b(iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.f29637c = str;
    }

    private ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.f29639e = false;
    }

    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(view, layoutParams));
    }
}
