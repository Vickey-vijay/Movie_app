package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4438p5 implements InterfaceC4171ej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseRequestConfig f57490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseRequestConfig.RequestConfigLoader f57491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public M5 f57492c;

    public final synchronized void a(@NonNull M5 m10) {
        this.f57492c = m10;
    }

    @NonNull
    @VisibleForTesting(otherwise = 4)
    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.f57492c.componentArguments;
    }

    @NonNull
    public final synchronized C4226gm c() {
        return this.f57492c.f55547a;
    }

    public final void d() {
        synchronized (this) {
            this.f57490a = null;
        }
    }

    public final synchronized void e() {
        this.f57490a = null;
    }

    public synchronized void a(@NonNull Object obj) {
        if (!((ArgumentsMerger) this.f57492c.componentArguments).compareWithOtherArguments(obj)) {
            a(new M5(c(), C4418oa.I.v(), C4418oa.I.s(), (ArgumentsMerger) ((ArgumentsMerger) this.f57492c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public AbstractC4438p5(@NonNull BaseRequestConfig.RequestConfigLoader<Object, M5> requestConfigLoader, @NonNull C4226gm c4226gm, @NonNull ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f57491b = requestConfigLoader;
        C4418oa.k().v().a(this);
        a(new M5(c4226gm, C4418oa.k().v(), C4418oa.k().s(), argumentsMerger));
    }

    public final synchronized void a(@NonNull C4226gm c4226gm) {
        a(new M5(c4226gm, C4418oa.I.v(), C4418oa.I.s(), b()));
        e();
    }

    @NonNull
    public final synchronized BaseRequestConfig a() {
        if (this.f57490a == null) {
            this.f57490a = this.f57491b.load(this.f57492c);
        }
        return this.f57490a;
    }
}
