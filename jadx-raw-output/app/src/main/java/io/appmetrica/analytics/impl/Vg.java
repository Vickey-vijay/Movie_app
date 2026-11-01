package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.C4318kb;
import io.appmetrica.analytics.impl.Vg;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class Vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4096bl f56029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4419ob f56030c = new C4419ob();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4462q4 f56031d = new C4462q4(new C4071am(), new C4437p4(), null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Consumer f56032e;

    public static final void a(EnumC4112cb enumC4112cb, InterfaceC4158e6 interfaceC4158e6, Vg vg2, C4318kb c4318kb) {
        String str = c4318kb.f57101h;
        Q3 q10 = new Q3(str, c4318kb.f57098e, c4318kb.f57099f, c4318kb.f57100g, c4318kb.f57102i);
        String str2 = c4318kb.f57095b;
        byte[] bArr = c4318kb.f57094a;
        int i10 = c4318kb.f57096c;
        HashMap map = c4318kb.f57097d;
        String str3 = c4318kb.f57103j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = AbstractC4641x9.f57918a;
        N3 n10 = new N3(bArr, str2, enumC4112cb.f56509a, orCreatePublicLogger);
        n10.f55601q = map;
        n10.f55779g = i10;
        n10.f55775c = str3;
        ((Tg) interfaceC4158e6).a(q10, n10, vg2.f56031d);
    }

    public Vg(Context context, final InterfaceC4158e6 interfaceC4158e6, final EnumC4112cb enumC4112cb, InterfaceC4096bl interfaceC4096bl) {
        this.f56028a = context;
        this.f56029b = interfaceC4096bl;
        this.f56032e = new Consumer() { // from class: af.u
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Vg.a(enumC4112cb, interfaceC4158e6, this, (C4318kb) obj);
            }
        };
    }
}
