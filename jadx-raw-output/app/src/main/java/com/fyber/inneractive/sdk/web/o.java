package com.fyber.inneractive.sdk.web;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f18738a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/o;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.g.f44970p, view);
        safedk_o_onClick_c06d7a4dcd7b0368031f607e07fcfe21(view);
    }

    public o(i0 i0Var) {
        this.f18738a = i0Var;
    }

    public void safedk_o_onClick_c06d7a4dcd7b0368031f607e07fcfe21(View p10) {
        this.f18738a.o();
    }
}
