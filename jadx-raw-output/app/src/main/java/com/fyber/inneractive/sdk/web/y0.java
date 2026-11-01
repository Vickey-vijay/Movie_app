package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f18798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f18801d;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/y0;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(com.safedk.android.utils.g.f44970p, view, motionEvent);
        return safedk_y0_onTouch_52c42711d0fa7ec04118db9e2b13f35d(view, motionEvent);
    }

    public boolean safedk_y0_onTouch_52c42711d0fa7ec04118db9e2b13f35d(View p10, MotionEvent p11) {
        if (this.f18798a != null) {
            if (p11.getActionMasked() == 0) {
                ((i) this.f18798a).i();
                this.f18799b = p11.getX();
                this.f18800c = p11.getY();
            } else if (p11.getActionMasked() == 3) {
                ((i) this.f18798a).i();
                this.f18800c = -1.0f;
                this.f18799b = -1.0f;
            } else if (p11.getActionMasked() == 1) {
                float f10 = this.f18799b;
                if (f10 >= 0.0f && this.f18800c >= 0.0f) {
                    float fRound = Math.round(Math.abs(f10 - p11.getX()));
                    float fRound2 = Math.round(Math.abs(this.f18800c - p11.getY()));
                    float f11 = this.f18801d;
                    if (fRound < f11 && fRound2 < f11) {
                        i iVar = (i) this.f18798a;
                        iVar.getClass();
                        IAlog.a("IAWebViewController onClicked()", new Object[0]);
                        if (iVar.f18692l != null) {
                            IAlog.e("Native click detected in time. Processing pending click", new Object[0]);
                            iVar.f18692l.d();
                            d dVar = iVar.f18693m;
                            if (dVar != null) {
                                com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(dVar);
                            }
                            iVar.f18692l = null;
                            iVar.i();
                        } else {
                            if (iVar.f18694n != null) {
                                com.fyber.inneractive.sdk.util.r.f18607b.postDelayed(iVar.f18694n, IAConfigManager.O.f15026u.f15195b.a("click_timeout", 1000, 1000));
                            }
                            iVar.f18690j = true;
                        }
                    }
                    this.f18799b = -1.0f;
                    this.f18800c = -1.0f;
                }
            }
        }
        return false;
    }

    public y0(x0 x0Var, Context context) {
        this.f18798a = x0Var;
        this.f18801d = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
