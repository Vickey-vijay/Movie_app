package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.activities.FyberReportAdActivity;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierFactory;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierRemote;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements IFyberAdIdentifier.ClickListener, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InneractiveAdRequest f15445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f15446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IFyberAdIdentifier f15447d;

    @Override // com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.ClickListener
    public final void a() {
        Long demandId;
        String demandSource;
        com.fyber.inneractive.sdk.response.e eVar = this.f15446c;
        String str = null;
        if (eVar != null) {
            ImpressionData impressionData = eVar.f18451t;
            String advertiserDomain = impressionData != null ? impressionData.getAdvertiserDomain() : null;
            ImpressionData impressionData2 = this.f15446c.f18451t;
            demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
            ImpressionData impressionData3 = this.f15446c.f18451t;
            str = advertiserDomain;
            demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
        } else {
            demandId = null;
            demandSource = null;
        }
        FyberReportAdActivity.start(this.f15444a, this, str, demandSource, demandId);
    }

    public g(Context context, boolean z10, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        IFyberAdIdentifier fyberAdIdentifierLocal;
        this.f15444a = context;
        this.f15445b = inneractiveAdRequest;
        this.f15446c = eVar;
        new FyberAdIdentifierFactory();
        if (z10) {
            fyberAdIdentifierLocal = new FyberAdIdentifierRemote(rVar);
        } else {
            fyberAdIdentifierLocal = new FyberAdIdentifierLocal(rVar);
        }
        this.f15447d = fyberAdIdentifierLocal;
        fyberAdIdentifierLocal.f18526a = this;
    }
}
