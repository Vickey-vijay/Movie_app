package com.fyber.inneractive.sdk.player.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f18087a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/player/ui/r;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(com.safedk.android.utils.g.f44970p, view, motionEvent);
        return safedk_r_onTouch_4b21bea1d0af37bd04a97bd86608af6c(view, motionEvent);
    }

    public r(GestureDetector gestureDetector) {
        this.f18087a = gestureDetector;
    }

    public boolean safedk_r_onTouch_4b21bea1d0af37bd04a97bd86608af6c(View p10, MotionEvent p11) {
        return this.f18087a.onTouchEvent(p11);
    }
}
