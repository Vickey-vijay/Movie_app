package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4400nh extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4572uf f57354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yo f57355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f57356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeProvider f57357e;

    public C4400nh(@NonNull Y4 y10) {
        this(y10, y10.u(), C4418oa.k().t(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q10) {
        Y4 y10 = this.f55865a;
        if (this.f57355c.d()) {
            return false;
        }
        Q5 q5A = ((C4350lh) y10.f56209k.a()).f57201e ? Q5.a(q10, EnumC4112cb.EVENT_TYPE_APP_UPDATE) : Q5.a(q10, EnumC4112cb.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f57356d.getInstallerPackageName(y10.f56199a, y10.f56200b.f55816a), ""));
            C4572uf c4572uf = this.f57354b;
            c4572uf.f55796h.a(c4572uf.f55789a);
            jSONObject.put("preloadInfo", ((C4497rf) c4572uf.c()).b());
        } catch (Throwable unused) {
        }
        q5A.setValue(jSONObject.toString());
        C4342l9 c4342l9 = y10.f56212n;
        c4342l9.a(q5A, Sk.a(c4342l9.f57182c.b(q5A), q5A.f55781i));
        yo yoVar = this.f57355c;
        synchronized (yoVar) {
            zo zoVar = yoVar.f58037a;
            zoVar.a(zoVar.a().put("init_event_done", true));
        }
        this.f57355c.a(this.f57357e.currentTimeMillis());
        return false;
    }

    public C4400nh(Y4 y10, yo yoVar, C4572uf c4572uf, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(y10);
        this.f57355c = yoVar;
        this.f57354b = c4572uf;
        this.f57356d = safePackageManager;
        this.f57357e = systemTimeProvider;
    }
}
