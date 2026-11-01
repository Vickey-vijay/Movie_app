package com.ironsource;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class F8 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f26511b;

    public interface a {
        void a(pg pgVar);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F8(Context context) {
        super(context);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f26510a = "ISNNativeAdContainer";
    }

    private final pg a() {
        return new pg(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    public final a getListener$mediationsdk_release() {
        return this.f26511b;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        ck.p.j(view, "changedView");
        Logger.i(this.f26510a, "onVisibilityChanged: " + i10);
        a aVar = this.f26511b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        Logger.i(this.f26510a, "onWindowVisibilityChanged: " + i10);
        a aVar = this.f26511b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public final void setListener$mediationsdk_release(a aVar) {
        this.f26511b = aVar;
    }
}
