package com.fyber.inneractive.sdk.ui;

import android.view.View;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveFullscreenAdActivity f18538a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/ui/a;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.g.f44970p, view);
        safedk_a_onClick_e3a461d0915ef321f0fff58038c48fd8(view);
    }

    public a(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f18538a = inneractiveFullscreenAdActivity;
    }

    public void safedk_a_onClick_e3a461d0915ef321f0fff58038c48fd8(View p10) {
        this.f18538a.dismissAd(true);
    }
}
