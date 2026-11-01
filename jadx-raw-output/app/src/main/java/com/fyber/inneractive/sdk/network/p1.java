package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 extends i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f16067a = new OkHttpClient().newBuilder().build();

    @Override // com.fyber.inneractive.sdk.network.h
    public final l a(t0 t0Var, String str, String str2) throws Exception {
        IAlog.a("%s okhttp network stack is in use", "OkHttpExecutorImpl");
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(t0Var.r());
            Pair pairA = a(t0Var.r(), t0Var, arrayList, str, str2);
            Object obj = pairA.second;
            String strMessage = obj != null ? ((Response) obj).message() : "";
            FilterInputStream filterInputStreamA = a((Response) pairA.second);
            Object obj2 = pairA.second;
            int iCode = obj2 == null ? -1 : ((Response) obj2).code();
            HashMap mapB = b((Response) pairA.second);
            Response response = (Response) pairA.second;
            o1 o1Var = new o1(i.a(filterInputStreamA, iCode, strMessage, mapB, response != null ? response.headers().get("Last-Modified") : null), (Response) pairA.second);
            Iterator it = ((List) pairA.first).iterator();
            while (it.hasNext()) {
                o1Var.f16044f.add((String) it.next());
            }
            return o1Var;
        } catch (b e10) {
            IAlog.b("%s cannot connect exception: %s", "OkHttpExecutorImpl", e10.getMessage());
            throw e10;
        } catch (Exception e11) {
            IAlog.b("%s exception: %s", "OkHttpExecutorImpl", e11.getMessage());
            throw e11;
        }
    }

    public static HashMap b(Response response) {
        HashMap map = new HashMap();
        if (response != null) {
            Headers headers = response.headers();
            for (int i10 = 0; i10 < headers.size(); i10++) {
                String strName = headers.name(i10);
                map.put(strName, Collections.singletonList(headers.get(strName)));
            }
        }
        return map;
    }

    public final Pair a(String str, t0 t0Var, ArrayList arrayList, String str2, String str3) throws Exception {
        String strHeader;
        l1 l1VarP = t0Var.p();
        Request.Builder builder = new Request.Builder();
        a(builder, "Accept-Encoding", "gzip");
        a(builder, "User-Agent", str2);
        a(builder, "If-Modified-Since", str3);
        Map mapL = t0Var.l();
        if (mapL != null) {
            for (String str4 : mapL.keySet()) {
                a(builder, str4, (String) mapL.get(str4));
            }
        }
        builder.url(str);
        if (t0Var.m() == m0.POST || t0Var.m() == m0.PUT) {
            byte[] bArrF = t0Var.f();
            if (bArrF != null) {
                builder.post(RequestBody.create(bArrF, MediaType.parse(t0Var.n())));
            } else {
                throw new Exception("Could not create ok http request. post payload is null");
            }
        }
        Request requestBuild = builder.build();
        boolean z10 = !(t0Var instanceof h1);
        OkHttpClient.Builder builderFollowSslRedirects = this.f16067a.newBuilder().followRedirects(z10).followSslRedirects(z10);
        long j10 = l1VarP.f16052a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient okHttpClientBuild = builderFollowSslRedirects.connectTimeout(j10, timeUnit).readTimeout(l1VarP.f16053b, timeUnit).build();
        t0Var.c(System.currentTimeMillis());
        IAlog.a("OkHttpExecutorImpl: start connection timestamp: %s", t0Var.f16091g);
        try {
            try {
                Response responseOkhttp3CallExecute = DTExchangeNetworkBridge.okhttp3CallExecute(okHttpClientBuild.newCall(requestBuild));
                if (!(!(t0Var instanceof h1)) && (((responseOkhttp3CallExecute.code() > 300 && responseOkhttp3CallExecute.code() < 304) || responseOkhttp3CallExecute.code() == 307 || responseOkhttp3CallExecute.code() == 308) && (strHeader = responseOkhttp3CallExecute.header("Location", "")) != null)) {
                    if (!strHeader.startsWith("http") && !strHeader.contains("://") && arrayList.size() > 0) {
                        Uri uri = Uri.parse((String) arrayList.get(arrayList.size() - 1));
                        strHeader = String.format(strHeader.startsWith("/") ? "%s://%s%s" : "%s://%s/%s", uri.getScheme(), uri.getHost(), strHeader);
                    }
                    arrayList.add(strHeader);
                    if (arrayList.size() <= 5) {
                        Pair pairA = a(strHeader, t0Var, arrayList, str2, str3);
                        t0Var.a(System.currentTimeMillis());
                        IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.f16091g);
                        return pairA;
                    }
                    throw new b("Url chain too big for us");
                }
                Pair pair = new Pair(arrayList, responseOkhttp3CallExecute);
                t0Var.a(System.currentTimeMillis());
                IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.f16091g);
                return pair;
            } catch (Exception e10) {
                throw new b(e10);
            }
        } catch (Throwable th2) {
            t0Var.a(System.currentTimeMillis());
            IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.f16091g);
            throw th2;
        }
    }

    public static FilterInputStream a(Response response) {
        if (response == null) {
            return null;
        }
        try {
            if (DTExchangeNetworkBridge.okhttp3Response_body(response) == null) {
                return null;
            }
            return i.a(DTExchangeNetworkBridge.okhttp3Response_body(response).byteStream(), TextUtils.equals("gzip", response.headers().get("content-encoding")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Request.Builder builder, String str, String str2) {
        IAlog.d("%s %s : %s", "REQUEST_HEADER", str, str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.addHeader(str, str2);
    }
}
