package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class h2 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f7615b;

    @Override // com.applovin.impl.g2
    public InputStream a(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(((Integer) this.f7614a.a(x4.T2)).intValue());
        httpURLConnection.setReadTimeout(((Integer) this.f7614a.a(x4.U2)).intValue());
        httpURLConnection.setDefaultUseCaches(true);
        httpURLConnection.setUseCaches(true);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        int iHttpUrlConnectionGetResponseCode = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
        this.f7614a.D().a("loadResource", str, iHttpUrlConnectionGetResponseCode, httpURLConnection.getResponseMessage());
        if (r0.a(iHttpUrlConnectionGetResponseCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7615b.a("HttpUrlConnectionLoader", "Opened stream to resource " + str);
        }
        InputStream inputStreamUrlConnectionGetInputStream = AppLovinNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "HttpUrlConnectionLoader", mapHashMap);
        this.f7614a.g().d(d2.Q, mapHashMap);
        return inputStreamUrlConnectionGetInputStream;
    }

    public h2(com.applovin.impl.sdk.k kVar) {
        this.f7614a = kVar;
        this.f7615b = kVar.O();
    }
}
