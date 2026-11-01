package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4353lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4327kk f57225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile A9 f57226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile A9 f57227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile A9 f57228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile A9 f57229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile A9 f57230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile A9 f57231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile ExecutorC4301jk f57232h;

    public C4353lk() {
        this(new C4327kk());
    }

    public C4353lk(C4327kk c4327kk) {
        new HashMap();
        this.f57225a = c4327kk;
    }

    public final IHandlerExecutor a() {
        if (this.f57231g == null) {
            synchronized (this) {
                if (this.f57231g == null) {
                    this.f57225a.getClass();
                    HandlerThreadC4138db handlerThreadC4138dbA = A9.a("IAA-SDE");
                    this.f57231g = new A9(handlerThreadC4138dbA, handlerThreadC4138dbA.getLooper(), new Handler(handlerThreadC4138dbA.getLooper()));
                }
            }
        }
        return this.f57231g;
    }

    public final IHandlerExecutor b() {
        if (this.f57228d == null) {
            synchronized (this) {
                if (this.f57228d == null) {
                    this.f57225a.getClass();
                    HandlerThreadC4138db handlerThreadC4138dbA = A9.a("IAA-SMH-1");
                    this.f57228d = new A9(handlerThreadC4138dbA, handlerThreadC4138dbA.getLooper(), new Handler(handlerThreadC4138dbA.getLooper()));
                }
            }
        }
        return this.f57228d;
    }

    public final IHandlerExecutor c() {
        if (this.f57229e == null) {
            synchronized (this) {
                if (this.f57229e == null) {
                    this.f57225a.getClass();
                    HandlerThreadC4138db handlerThreadC4138dbA = A9.a("IAA-SNTPE");
                    this.f57229e = new A9(handlerThreadC4138dbA, handlerThreadC4138dbA.getLooper(), new Handler(handlerThreadC4138dbA.getLooper()));
                }
            }
        }
        return this.f57229e;
    }

    public final IHandlerExecutor d() {
        if (this.f57227c == null) {
            synchronized (this) {
                if (this.f57227c == null) {
                    this.f57225a.getClass();
                    HandlerThreadC4138db handlerThreadC4138dbA = A9.a("IAA-STE");
                    this.f57227c = new A9(handlerThreadC4138dbA, handlerThreadC4138dbA.getLooper(), new Handler(handlerThreadC4138dbA.getLooper()));
                }
            }
        }
        return this.f57227c;
    }
}
