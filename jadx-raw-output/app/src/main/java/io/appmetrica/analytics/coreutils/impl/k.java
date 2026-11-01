package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.internal.Lambda;
import mj.r;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends Lambda implements bk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f54707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f54708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f54709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f54710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, ComponentName componentName, int i10, int i11) {
        super(0);
        this.f54707a = context;
        this.f54708b = componentName;
        this.f54709c = i10;
        this.f54710d = i11;
    }

    @Override // bk.a
    public final Object invoke() {
        this.f54707a.getPackageManager().setComponentEnabledSetting(this.f54708b, this.f54709c, this.f54710d);
        return r.f64562a;
    }
}
