package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4463q5 implements IExecutionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4280j f57548b = C4418oa.k().b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumSet f57549c = EnumSet.of(NetworkType.OFFLINE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57550d = "connection based";

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C4280j c4280j = this.f57548b;
        Context context = this.f57547a;
        c4280j.getClass();
        De de2 = He.f55301a;
        return !this.f57549c.contains((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Ge()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f57550d;
    }

    public C4463q5(Context context) {
        this.f57547a = context;
    }
}
