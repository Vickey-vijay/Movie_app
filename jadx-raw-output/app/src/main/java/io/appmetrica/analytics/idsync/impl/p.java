package io.appmetrica.analytics.idsync.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.idsync.impl.p;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.util.List;
import java.util.Map;
import nj.b0;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f54906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f54907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f54908c = new SystemTimeProvider();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f54909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f54910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f54911f;

    public static final void a(y yVar, p pVar) {
        if (yVar.f54919b) {
            B b10 = pVar.f54907b;
            String str = yVar.f54918a;
            b10.f54856d.put(str, new z(str, pVar.f54908c.currentTimeMillis(), yVar.f54921d ? 2 : 4));
            b10.f54853a.putString(b10.f54855c, b10.f54854b.fromModel(b0.O0(b10.f54856d.values())));
            i iVar = pVar.f54911f;
            ModuleSelfReporter selfReporter = iVar.f54883a.getSelfReporter();
            iVar.f54884b.getClass();
            selfReporter.reportEvent("id_sync", j.a(yVar));
        }
    }

    public p(ServiceContext serviceContext, B b10) {
        this.f54906a = serviceContext;
        this.f54907b = b10;
        this.f54909d = new q(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), this);
        this.f54910e = new s(serviceContext);
        this.f54911f = new i(serviceContext);
    }

    public static final void a(p pVar, RequestConfig requestConfig) {
        t c4046a;
        s sVar = pVar.f54910e;
        Preconditions preconditions = requestConfig.getPreconditions();
        sVar.getClass();
        if (r.f54914a[preconditions.getNetworkType().ordinal()] == 1) {
            c4046a = new C4047b(sVar.f54915a);
        } else {
            c4046a = new C4046a();
        }
        if (c4046a.a()) {
            q qVar = pVar.f54909d;
            qVar.getClass();
            Request.Builder builder = new Request.Builder(requestConfig.getUrl());
            for (Map.Entry<String, List<String>> entry : requestConfig.getHeaders().entrySet()) {
                builder.addHeader(entry.getKey(), b0.p0(entry.getValue(), ", ", null, null, 0, null, null, 62, null));
            }
            Response responseExecute = new NetworkClient.Builder().withSslSocketFactory(qVar.f54912a.getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(102400).build().newCall(builder.build()).execute();
            qVar.f54913b.a(new y(requestConfig.getType(), responseExecute.isCompleted(), responseExecute.getUrl(), requestConfig.getValidResponseCodes().contains(Integer.valueOf(responseExecute.getCode())), responseExecute.getCode(), (responseExecute.getResponseData().length == 0) ^ true ? responseExecute.getResponseData() : responseExecute.getErrorData(), responseExecute.getHeaders()));
        }
    }

    public final void a(final y yVar) {
        this.f54906a.getExecutorProvider().getModuleExecutor().execute(new Runnable() { // from class: ze.b
            @Override // java.lang.Runnable
            public final void run() {
                p.a(yVar, this);
            }
        });
    }

    public final void a(final RequestConfig requestConfig) {
        long resendIntervalForValidResponse;
        if (TextUtils.isEmpty(requestConfig.getType()) || TextUtils.isEmpty(requestConfig.getUrl()) || !(!requestConfig.getValidResponseCodes().isEmpty())) {
            return;
        }
        z zVar = (z) this.f54907b.f54856d.get(requestConfig.getType());
        if (zVar != null) {
            long jCurrentTimeMillis = this.f54908c.currentTimeMillis();
            int iA = v.a(zVar.f54927c);
            if (iA != 1) {
                resendIntervalForValidResponse = iA != 3 ? 0L : requestConfig.getResendIntervalForInvalidResponse();
            } else {
                resendIntervalForValidResponse = requestConfig.getResendIntervalForValidResponse();
            }
            if (jCurrentTimeMillis - zVar.f54926b < resendIntervalForValidResponse) {
                return;
            }
        }
        this.f54906a.getExecutorProvider().getSupportIOExecutor().execute(new Runnable() { // from class: ze.a
            @Override // java.lang.Runnable
            public final void run() {
                p.a(this.f86401b, requestConfig);
            }
        });
    }
}
