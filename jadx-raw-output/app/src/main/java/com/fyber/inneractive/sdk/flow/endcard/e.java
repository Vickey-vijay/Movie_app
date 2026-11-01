package com.fyber.inneractive.sdk.flow.endcard;

import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.g1;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.ui.n f15365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f15366c = new int[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f15367d = new g1();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/flow/endcard/e;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(com.safedk.android.utils.g.f44970p, view, motionEvent);
        return safedk_e_onTouch_09b2f5dae9685246cf1ab3a81f789e70(view, motionEvent);
    }

    public e(int i10, com.fyber.inneractive.sdk.player.ui.n nVar) {
        this.f15364a = i10;
        this.f15365b = nVar;
    }

    public boolean safedk_e_onTouch_09b2f5dae9685246cf1ab3a81f789e70(View p10, MotionEvent p11) {
        if (p11.getActionMasked() != 0) {
            return false;
        }
        p10.getRootView().getLocationOnScreen(this.f15366c);
        float rawX = p11.getRawX() - this.f15366c[0];
        float rawY = p11.getRawY() - this.f15366c[1];
        g1 g1Var = this.f15367d;
        g1Var.f18579a = rawX;
        g1Var.f18580b = rawY;
        ((z) this.f15365b).a(this.f15364a, g1Var);
        return true;
    }
}
