package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class Dd implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Tg f55138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H0 f55139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Md f55140c;

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(String str) {
        Tg tg2 = this.f55138a;
        H0 h10 = this.f55139b;
        String str2 = h10.f55284a;
        String str3 = h10.f55285b;
        Integer numValueOf = Integer.valueOf(h10.f55287d);
        H0 h11 = this.f55139b;
        Q3 q10 = new Q3(str2, str3, numValueOf, h11.f55288e, h11.f55286c);
        Md md2 = this.f55140c;
        EnumC4112cb enumC4112cb = md2.f55579b;
        G0 g10 = md2.f55578a;
        String str4 = g10.f55252c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(g10.f55255f.f55284a);
        Set set = AbstractC4641x9.f57918a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        N3 n10 = new N3("", "", enumC4112cb.f56509a, orCreatePublicLogger);
        if (str != null) {
            n10.f(str);
        }
        n10.f55785m = bundle;
        n10.f55775c = md2.f55578a.f55255f.f55289f;
        tg2.a(q10, n10, new C4462q4(new C4071am(), new C4437p4(), null));
    }

    public Dd(Tg tg2, H0 h10, Md md2) {
        this.f55138a = tg2;
        this.f55139b = h10;
        this.f55140c = md2;
    }
}
