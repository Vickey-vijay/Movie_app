package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiNetworkBridge;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutKt;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: renamed from: com.inmobi.media.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3297x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Interceptor[] f25684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OkHttpClient f25685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25686c;

    public static Pair a(Me me2) {
        RequestBody c3222u4;
        Request.Builder builderUrl = new Request.Builder().url(me2.c());
        Map mapA = me2.a();
        if (mapA != null) {
            for (Map.Entry entry : mapA.entrySet()) {
                builderUrl.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Ai aiB = me2.b();
        if (aiB != null) {
            builderUrl.tag(aiB);
        }
        if (me2 instanceof Je) {
            builderUrl.get();
        } else if (me2 instanceof Le) {
            try {
                AbstractC3236ui abstractC3236ui = ((Le) me2).f23085d;
                if (abstractC3236ui == null) {
                    c3222u4 = RequestBody.create((MediaType) null, new byte[0]);
                    ck.p.g(c3222u4);
                } else {
                    c3222u4 = new C3222u4(abstractC3236ui);
                }
                builderUrl.post(c3222u4);
            } catch (FileNotFoundException e10) {
                e10.getStackTrace();
                return new Pair(builderUrl.build(), new C2747b6(((Le) me2).f23082a, EnumC2721a6.f23957m));
            } catch (IOException e11) {
                e11.getStackTrace();
                return new Pair(builderUrl.build(), new C2747b6(((Le) me2).f23082a, EnumC2721a6.f23949e));
            } catch (Exception e12) {
                e12.getStackTrace();
                return new Pair(builderUrl.build(), new C2747b6(((Le) me2).f23082a, EnumC2721a6.f23948d));
            }
        } else {
            if (!(me2 instanceof Ke)) {
                throw new NoWhenBranchMatchedException();
            }
            builderUrl.head();
        }
        return new Pair(builderUrl.build(), null);
    }

    public C3297x4(Interceptor[] interceptorArr, Interceptor[] interceptorArr2, Dispatcher dispatcher, C3114pk c3114pk) {
        ck.p.j(dispatcher, "dispatcher");
        ck.p.j(c3114pk, "timeoutConfig");
        this.f25684a = interceptorArr2;
        this.f25686c = c3114pk.f25091c;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (interceptorArr != null) {
            for (Interceptor interceptor : interceptorArr) {
                builder.addInterceptor(interceptor);
            }
        }
        Interceptor[] interceptorArr3 = this.f25684a;
        if (interceptorArr3 != null) {
            for (Interceptor interceptor2 : interceptorArr3) {
                builder.addNetworkInterceptor(interceptor2);
            }
        }
        builder.addInterceptor(new C3361zi());
        builder.addNetworkInterceptor(new Xb());
        builder.protocols(nj.s.q(Protocol.HTTP_2, Protocol.HTTP_1_1));
        builder.retryOnConnectionFailure(false);
        builder.dispatcher(dispatcher);
        long j10 = c3114pk.f25089a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(j10, timeUnit);
        builder.readTimeout(c3114pk.f25090b, timeUnit);
        OkHttpClient okHttpClientBuild = builder.build();
        ck.p.i(okHttpClientBuild, "build(...)");
        this.f25685b = okHttpClientBuild;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x016b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0187  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:98:0x0133  */
    public final Object a(OkHttpClient okHttpClient, Request request, String str, ContinuationImpl continuationImpl) throws Throwable {
        C3247v4 c3247v4;
        String str2;
        String str3;
        ByteString byteString;
        Object c2747b6;
        MediaType mediaTypeContentType;
        BufferedSource bufferedSourceRetrofitExceptionCatchingRequestBody_source;
        if (continuationImpl instanceof C3247v4) {
            c3247v4 = (C3247v4) continuationImpl;
            int i10 = c3247v4.f25528d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3247v4.f25528d = i10 - Integer.MIN_VALUE;
            } else {
                c3247v4 = new C3247v4(this, continuationImpl);
            }
        } else {
            c3247v4 = new C3247v4(this, continuationImpl);
        }
        Object objC = c3247v4.f25526b;
        Object objF = sj.a.f();
        int i11 = c3247v4.f25528d;
        boolean z10 = true;
        Response response = null;
        string = null;
        String string = null;
        response = null;
        response = null;
        response = null;
        response = null;
        Response response2 = null;
        Response response3 = null;
        Response response4 = null;
        Response response5 = null;
        try {
            try {
                if (i11 == 0) {
                    kotlin.c.b(objC);
                    try {
                        long millis = TimeUnit.SECONDS.toMillis(this.f25686c);
                        C3272w4 c3272w4 = new C3272w4(okHttpClient, request, null);
                        str2 = str;
                        try {
                            c3247v4.f25525a = str2;
                            c3247v4.f25528d = 1;
                            objC = TimeoutKt.c(millis, c3272w4, c3247v4);
                            if (objC == objF) {
                                return objF;
                            }
                            str3 = str2;
                        } catch (MalformedURLException e10) {
                            e = e10;
                            str3 = str2;
                            ck.p.i(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C2747b6 c2747b7 = new C2747b6(str3, EnumC2721a6.f23960p);
                            if (response2 != null) {
                                response2.close();
                            }
                            return c2747b7;
                        } catch (SocketTimeoutException e11) {
                            e = e11;
                            str3 = str2;
                            ck.p.i(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C2747b6 c2747b8 = new C2747b6(str3, EnumC2721a6.f23961q);
                            if (response3 != null) {
                                response3.close();
                            }
                            return c2747b8;
                        } catch (IOException e12) {
                            e = e12;
                            str3 = str2;
                            ck.p.i(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C2747b6 c2747b9 = new C2747b6(str3, EnumC2721a6.f23949e);
                            if (response4 != null) {
                                response4.close();
                            }
                            return c2747b9;
                        } catch (Exception e13) {
                            e = e13;
                            str3 = str2;
                            ck.p.i(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C2747b6 c2747b10 = new C2747b6(str3, EnumC2721a6.f23948d);
                            if (response5 != null) {
                                response5.close();
                            }
                            return c2747b10;
                        }
                    } catch (MalformedURLException e14) {
                        e = e14;
                        str2 = str;
                    } catch (SocketTimeoutException e15) {
                        e = e15;
                        str2 = str;
                    } catch (IOException e16) {
                        e = e16;
                        str2 = str;
                    } catch (Exception e17) {
                        e = e17;
                        str2 = str;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = c3247v4.f25525a;
                    try {
                        kotlin.c.b(objC);
                    } catch (MalformedURLException e18) {
                        e = e18;
                        ck.p.i(Arrays.toString(e.getStackTrace()), "toString(...)");
                        C2747b6 c2747b11 = new C2747b6(str3, EnumC2721a6.f23960p);
                        if (response2 != null) {
                            response2.close();
                        }
                        return c2747b11;
                    } catch (SocketTimeoutException e19) {
                        e = e19;
                        ck.p.i(Arrays.toString(e.getStackTrace()), "toString(...)");
                        C2747b6 c2747b12 = new C2747b6(str3, EnumC2721a6.f23961q);
                        if (response3 != null) {
                            response3.close();
                        }
                        return c2747b12;
                    } catch (IOException e20) {
                        e = e20;
                        ck.p.i(Arrays.toString(e.getStackTrace()), "toString(...)");
                        C2747b6 c2747b13 = new C2747b6(str3, EnumC2721a6.f23949e);
                        if (response4 != null) {
                            response4.close();
                        }
                        return c2747b13;
                    } catch (Exception e21) {
                        e = e21;
                        ck.p.i(Arrays.toString(e.getStackTrace()), "toString(...)");
                        C2747b6 c2747b14 = new C2747b6(str3, EnumC2721a6.f23948d);
                        if (response5 != null) {
                            response5.close();
                        }
                        return c2747b14;
                    }
                }
                Response response6 = (Response) objC;
                try {
                    int iCode = response6.code();
                    ResponseBody responseBodyOkhttp3Response_body = InMobiNetworkBridge.okhttp3Response_body(response6);
                    if (responseBodyOkhttp3Response_body == null || (bufferedSourceRetrofitExceptionCatchingRequestBody_source = InMobiNetworkBridge.retrofitExceptionCatchingRequestBody_source(responseBodyOkhttp3Response_body)) == null || (byteString = bufferedSourceRetrofitExceptionCatchingRequestBody_source.readByteString()) == null) {
                        byteString = ByteString.EMPTY;
                    }
                    Map<String, List<String>> multimap = response6.headers().toMultimap();
                    ResponseBody responseBodyOkhttp3Response_body2 = InMobiNetworkBridge.okhttp3Response_body(response6);
                    long jContentLength = responseBodyOkhttp3Response_body2 != null ? responseBodyOkhttp3Response_body2.contentLength() : 0L;
                    ResponseBody responseBodyOkhttp3Response_body3 = InMobiNetworkBridge.okhttp3Response_body(response6);
                    if (responseBodyOkhttp3Response_body3 != null && (mediaTypeContentType = responseBodyOkhttp3Response_body3.contentType()) != null) {
                        string = mediaTypeContentType.toString();
                    }
                    long jReceivedResponseAtMillis = response6.receivedResponseAtMillis() - response6.sentRequestAtMillis();
                    long j10 = jReceivedResponseAtMillis < 0 ? 0L : jReceivedResponseAtMillis;
                    ck.p.g(multimap);
                    Ie ie2 = new Ie(j10, multimap, (int) jContentLength, string);
                    ck.p.j(response6, "<this>");
                    int iCode2 = response6.code();
                    if (400 > iCode2 || iCode2 >= 600) {
                        z10 = false;
                    }
                    if (!z10) {
                        c2747b6 = new Oe(str3, iCode, byteString, ie2);
                    } else {
                        EnumC2721a6.f23946b.getClass();
                        c2747b6 = new C2747b6(str3, Y5.a(iCode));
                    }
                    response6.close();
                    return c2747b6;
                } catch (MalformedURLException e22) {
                    e = e22;
                    response2 = response6;
                    ck.p.i(Arrays.toString(e.getStackTrace()), "toString(...)");
                    C2747b6 c2747b15 = new C2747b6(str3, EnumC2721a6.f23960p);
                    if (response2 != null) {
                        response2.close();
                    }
                    return c2747b15;
                } catch (SocketTimeoutException e23) {
                    e = e23;
                    response3 = response6;
                    ck.p.i(Arrays.toString(e.getStackTrace()), "toString(...)");
                    C2747b6 c2747b16 = new C2747b6(str3, EnumC2721a6.f23961q);
                    if (response3 != null) {
                        response3.close();
                    }
                    return c2747b16;
                } catch (IOException e24) {
                    e = e24;
                    response4 = response6;
                    ck.p.i(Arrays.toString(e.getStackTrace()), "toString(...)");
                    C2747b6 c2747b17 = new C2747b6(str3, EnumC2721a6.f23949e);
                    if (response4 != null) {
                        response4.close();
                    }
                    return c2747b17;
                } catch (CancellationException e25) {
                    e = e25;
                    ck.p.i(Arrays.toString(e.getStackTrace()), "toString(...)");
                    throw e;
                } catch (Exception e26) {
                    e = e26;
                    response5 = response6;
                    ck.p.i(Arrays.toString(e.getStackTrace()), "toString(...)");
                    C2747b6 c2747b18 = new C2747b6(str3, EnumC2721a6.f23948d);
                    if (response5 != null) {
                        response5.close();
                    }
                    return c2747b18;
                } catch (Throwable th2) {
                    th = th2;
                    response = response6;
                    if (response != null) {
                        response.close();
                    }
                    throw th;
                }
            } catch (CancellationException e27) {
                e = e27;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final Object a(Me me2, ContinuationImpl continuationImpl) {
        OkHttpClient okHttpClient = this.f25685b;
        Pair pairA = a(me2);
        Request request = (Request) pairA.component1();
        C2747b6 c2747b6 = (C2747b6) pairA.component2();
        return c2747b6 != null ? c2747b6 : a(okHttpClient, request, me2.c(), continuationImpl);
    }
}
