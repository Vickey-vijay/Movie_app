package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: loaded from: classes5.dex */
public final class S3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R3 f55846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile A9 f55847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile A9 f55848c;

    public S3() {
        this(new R3());
    }

    public S3(R3 r10) {
        this.f55846a = r10;
    }

    public final IHandlerExecutor a() {
        if (this.f55847b == null) {
            synchronized (this) {
                if (this.f55847b == null) {
                    this.f55846a.getClass();
                    HandlerThreadC4138db handlerThreadC4138dbA = A9.a("IAA-CDE");
                    this.f55847b = new A9(handlerThreadC4138dbA, handlerThreadC4138dbA.getLooper(), new Handler(handlerThreadC4138dbA.getLooper()));
                }
            }
        }
        return this.f55847b;
    }

    public final ICommonExecutor b() {
        if (this.f55848c == null) {
            synchronized (this) {
                if (this.f55848c == null) {
                    this.f55846a.getClass();
                    HandlerThreadC4138db handlerThreadC4138dbA = A9.a("IAA-CRS");
                    this.f55848c = new A9(handlerThreadC4138dbA, handlerThreadC4138dbA.getLooper(), new Handler(handlerThreadC4138dbA.getLooper()));
                }
            }
        }
        return this.f55848c;
    }
}
