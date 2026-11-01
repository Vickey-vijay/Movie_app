package com.fyber.inneractive.sdk.network;

import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Response f16065g;

    public o1(l lVar, Response response) {
        this.f16065g = response;
        this.f16042d = lVar.f16042d;
        this.f16041c = lVar.f16041c;
        this.f16043e = lVar.f16043e;
        this.f16039a = lVar.f16039a;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        super.a();
        Response response = this.f16065g;
        if (response != null) {
            response.close();
        }
    }
}
