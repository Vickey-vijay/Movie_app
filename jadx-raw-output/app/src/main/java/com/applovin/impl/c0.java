package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.k f7103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.applovin.impl.sdk.o f7105c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7107e = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f7106d = com.applovin.impl.sdk.k.o();

    public Context a() {
        return this.f7106d;
    }

    public void a(boolean z10) {
        this.f7107e.set(z10);
    }

    public c0(String str, com.applovin.impl.sdk.k kVar) {
        this.f7104b = str;
        this.f7103a = kVar;
        this.f7105c = kVar.O();
    }
}
