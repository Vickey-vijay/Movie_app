package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.network.p0;
import com.squareup.picasso.Utils;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f14877a;

    public w(y yVar) {
        this.f14877a = yVar;
    }

    @Override // com.fyber.inneractive.sdk.network.p0
    public final void a(String str) {
        str.hashCode();
        switch (str) {
            case "sdkInitNetworkRequest":
                com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.f15849d;
                dVar.a(this.f14877a.f14882d).f();
                dVar.b(this.f14877a.f14882d).f15865c = System.currentTimeMillis();
                break;
            case "sdkGotServerResponse":
                com.fyber.inneractive.sdk.metrics.d.f15849d.a(this.f14877a.f14882d).h();
                break;
            case "sdkParsedResponse":
                com.fyber.inneractive.sdk.metrics.d.f15849d.a(this.f14877a.f14882d).d();
                break;
            case "sdkRequestEndedButWillBeRetried":
                com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f15849d.b(this.f14877a.f14882d);
                iVarB.f15863a.put(new com.fyber.inneractive.sdk.metrics.h(Utils.VERB_RETRYING), Long.valueOf(System.currentTimeMillis() - iVarB.f15865c));
                break;
        }
    }
}
