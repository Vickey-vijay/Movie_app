package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends Lambda implements bk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f54699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f54700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f54701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Intent intent, int i10) {
        super(0);
        this.f54699a = context;
        this.f54700b = intent;
        this.f54701c = i10;
    }

    @Override // bk.a
    public final Object invoke() {
        return this.f54699a.getPackageManager().resolveActivity(this.f54700b, this.f54701c);
    }
}
