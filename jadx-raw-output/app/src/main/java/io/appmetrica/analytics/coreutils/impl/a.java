package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends Lambda implements bk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f54681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f54682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f54683c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ComponentName componentName, int i10) {
        super(0);
        this.f54681a = context;
        this.f54682b = componentName;
        this.f54683c = i10;
    }

    @Override // bk.a
    public final Object invoke() {
        return this.f54681a.getPackageManager().getActivityInfo(this.f54682b, this.f54683c);
    }
}
