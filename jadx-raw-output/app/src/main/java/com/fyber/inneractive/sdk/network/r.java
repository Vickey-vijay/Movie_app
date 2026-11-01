package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f16076a;

    public r(s sVar) {
        this.f16076a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.p0
    public final void a(String str) {
        str.hashCode();
        switch (str) {
            case "sdkInitNetworkRequest":
                com.fyber.inneractive.sdk.metrics.d.f15849d.a(this.f16076a.f16057d).f();
                break;
            case "sdkGotServerResponse":
                com.fyber.inneractive.sdk.metrics.d.f15849d.a(this.f16076a.f16057d).g();
                break;
            case "sdkParsedResponse":
                com.fyber.inneractive.sdk.metrics.d.f15849d.a(this.f16076a.f16057d).d();
                break;
        }
    }
}
