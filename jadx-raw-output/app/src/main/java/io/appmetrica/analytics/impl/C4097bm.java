package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4097bm extends N5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A3 f56428b;

    public C4097bm(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager(), C4418oa.k().f());
    }

    public C4097bm(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager, @NonNull A3 a10) {
        super(context, str, safePackageManager);
        this.f56428b = a10;
    }

    @NonNull
    public final C4123cm a() {
        return new C4123cm();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C4123cm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4123cm load(@NonNull M5 m10) {
        C4123cm c4123cm = (C4123cm) super.load(m10);
        C4226gm c4226gm = m10.f55547a;
        c4123cm.f56532d = c4226gm.f56836f;
        c4123cm.f56533e = c4226gm.f56837g;
        C4071am c4071am = (C4071am) m10.componentArguments;
        String str = c4071am.f56381a;
        if (str != null) {
            c4123cm.f56534f = str;
            c4123cm.f56535g = c4071am.f56382b;
        }
        Map<String, String> map = c4071am.f56383c;
        c4123cm.f56536h = map;
        c4123cm.f56537i = (C4510s3) this.f56428b.a(new C4510s3(map, T7.f55911c));
        C4071am c4071am2 = (C4071am) m10.componentArguments;
        c4123cm.f56539k = c4071am2.f56384d;
        c4123cm.f56538j = c4071am2.f56385e;
        C4226gm c4226gm2 = m10.f55547a;
        c4123cm.f56540l = c4226gm2.f56846p;
        c4123cm.f56541m = c4226gm2.f56848r;
        long j10 = c4226gm2.f56852v;
        if (c4123cm.f56542n == 0) {
            c4123cm.f56542n = j10;
        }
        return c4123cm;
    }
}
