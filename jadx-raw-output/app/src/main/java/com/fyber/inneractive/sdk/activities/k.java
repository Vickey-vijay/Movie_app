package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f14861a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/k;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.g.f44970p, view);
        safedk_k_onClick_ba5f94c7940c4319420d8dfee82a8dac(view);
    }

    public k(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f14861a = inneractiveInternalBrowserActivity;
    }

    public void safedk_k_onClick_ba5f94c7940c4319420d8dfee82a8dac(View p10) {
        WebView webView = this.f14861a.f14840e;
        if (webView != null) {
            webView.reload();
            int i10 = IAlog.f18551a;
            IAlog.d("%s %s", "AD_INTERNAL_BROWSER_REFRESH", this.f14861a.f14840e.getUrl());
        }
    }
}
