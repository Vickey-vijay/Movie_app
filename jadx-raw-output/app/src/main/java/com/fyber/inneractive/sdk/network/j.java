package com.fyber.inneractive.sdk.network;

import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.io.FilterInputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HttpURLConnection f16034g;

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        try {
            HttpURLConnection httpURLConnection = this.f16034g;
            if (httpURLConnection != null) {
                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            }
        } catch (Throwable unused) {
        }
        super.a();
    }

    public j(HttpURLConnection httpURLConnection, int i10, FilterInputStream filterInputStream, Map map, String str) {
        this.f16034g = httpURLConnection;
        this.f16039a = i10;
        this.f16041c = filterInputStream;
        this.f16042d = map;
        this.f16043e = str;
    }
}
