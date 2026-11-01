package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f16205a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/player/controller/d0;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.g.f44970p, view);
        safedk_d0_onClick_551b6fca0ffcd85e1039d424c1c59acc(view);
    }

    public d0(f0 f0Var) {
        this.f16205a = f0Var;
    }

    public void safedk_d0_onClick_551b6fca0ffcd85e1039d424c1c59acc(View p10) {
        this.f16205a.f16220b.dismiss();
        v vVar = this.f16205a.f16219a;
        vVar.f16253b.d(vVar.f16252a);
    }
}
