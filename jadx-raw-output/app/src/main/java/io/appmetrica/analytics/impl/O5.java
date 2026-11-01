package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: loaded from: classes4.dex */
public class O5 extends BaseRequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f55669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f55670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4226gm f55671c;

    @NonNull
    public final String a() {
        return this.f55669a;
    }

    public final String b() {
        return this.f55670b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f55669a + "', mAppSystem='" + this.f55670b + "', startupState=" + this.f55671c + '}';
    }
}
