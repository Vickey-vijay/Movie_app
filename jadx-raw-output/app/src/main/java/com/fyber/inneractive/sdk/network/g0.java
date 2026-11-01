package com.fyber.inneractive.sdk.network;

import com.unity3d.services.core.configuration.ExperimentsBase;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f16028c = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f16029a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p1 f16030b;

    public final h a() {
        String property;
        if (this.f16030b == null) {
            try {
                property = System.getProperty("fyber.marketplace.http_executor_stack_name");
            } catch (Throwable unused) {
                property = "hurl";
            }
            if (property != null && property.equals(ExperimentsBase.EXP_TAG_OK_HTTP)) {
                try {
                    Class.forName("okhttp3.OkHttpClient");
                    this.f16030b = new p1();
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        p1 p1Var = this.f16030b;
        return p1Var != null ? p1Var : this.f16029a;
    }
}
