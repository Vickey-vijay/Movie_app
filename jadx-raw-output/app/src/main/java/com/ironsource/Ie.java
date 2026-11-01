package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class Ie implements N8 {
    @Override // com.ironsource.N8
    public void a(Context context, String str, int i10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, C3426d4.i.W);
        IronSourceUtils.b(context, str, i10);
    }

    @Override // com.ironsource.N8
    public int b(Context context, String str, int i10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, C3426d4.i.W);
        return IronSourceUtils.a(context, str, i10);
    }

    @Override // com.ironsource.N8
    public void a(Context context, String str, long j10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, C3426d4.i.W);
        IronSourceUtils.b(context, str, j10);
    }

    @Override // com.ironsource.N8
    public long b(Context context, String str, long j10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, C3426d4.i.W);
        return IronSourceUtils.a(context, str, j10);
    }
}
