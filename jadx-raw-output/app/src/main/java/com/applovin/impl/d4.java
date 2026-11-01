package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public class d4 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f7255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f7256c = new AtomicReference();

    private OkHttpClient a() {
        Object objBuild = this.f7256c.get();
        if (objBuild == null) {
            synchronized (this.f7256c) {
                objBuild = this.f7256c.get();
                if (objBuild == null) {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    long jIntValue = ((Integer) this.f7254a.a(x4.T2)).intValue();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    objBuild = builder.connectTimeout(jIntValue, timeUnit).readTimeout(((Integer) this.f7254a.a(x4.U2)).intValue(), timeUnit).followRedirects(true).followSslRedirects(true).build();
                    if (objBuild == null) {
                        objBuild = this.f7256c;
                    }
                    this.f7256c.set(objBuild);
                }
            }
        }
        if (objBuild == this.f7256c) {
            objBuild = null;
        }
        return (OkHttpClient) objBuild;
    }

    public d4(com.applovin.impl.sdk.k kVar) {
        this.f7254a = kVar;
        this.f7255b = kVar.O();
    }

    @Override // com.applovin.impl.g2
    public InputStream a(String str, Map map) throws IOException {
        Response responseExecute = a().newCall(new Request.Builder().url(str).get().build()).execute();
        int iCode = responseExecute.code();
        this.f7254a.D().a("loadResource", str, iCode, responseExecute.message());
        if (r0.a(iCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7255b.a("OkHttpLoader", "Opened stream to resource " + str);
        }
        ResponseBody responseBodyBody = responseExecute.body();
        if (responseBodyBody == null) {
            return null;
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "OkHttpLoader", mapHashMap);
        CollectionUtils.putStringIfValid("details", responseExecute.protocol().name(), mapHashMap);
        this.f7254a.g().d(d2.Q, mapHashMap);
        return responseBodyBody.byteStream();
    }
}
