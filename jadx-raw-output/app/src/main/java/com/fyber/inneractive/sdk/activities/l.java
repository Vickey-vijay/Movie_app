package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f14862a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/l;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.g.f44970p, view);
        safedk_l_onClick_d7c7888abfb6187679676e7d36a80bd0(view);
    }

    public l(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f14862a = inneractiveInternalBrowserActivity;
    }

    public void safedk_l_onClick_d7c7888abfb6187679676e7d36a80bd0(View p10) {
        this.f14862a.finish();
    }
}
