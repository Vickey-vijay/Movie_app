package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4298jh extends N5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y4 f57021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4272ih f57022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D3 f57023d;

    public C4298jh(@NonNull Y4 y10, @NonNull InterfaceC4272ih interfaceC4272ih) {
        this(y10, interfaceC4272ih, new D3());
    }

    public C4298jh(Y4 y10, InterfaceC4272ih interfaceC4272ih, D3 d10) {
        super(y10.getContext(), y10.b().c());
        this.f57021b = y10;
        this.f57022c = interfaceC4272ih;
        this.f57023d = d10;
    }

    @NonNull
    public final C4350lh a() {
        return new C4350lh(this.f57021b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C4350lh(this.f57021b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C4350lh load(@NonNull M5 m10) {
        C4350lh c4350lh = (C4350lh) super.load(m10);
        c4350lh.f57209m = ((C4221gh) m10.componentArguments).f56814a;
        c4350lh.f57214r = this.f57021b.f56218t.a();
        c4350lh.f57219w = this.f57021b.f56215q.a();
        C4221gh c4221gh = (C4221gh) m10.componentArguments;
        c4350lh.f57200d = c4221gh.f56815b;
        c4350lh.f57201e = c4221gh.f56816c;
        c4350lh.f57202f = c4221gh.f56817d;
        c4350lh.f57205i = c4221gh.f56818e;
        c4350lh.f57203g = c4221gh.f56819f;
        c4350lh.f57204h = c4221gh.f56820g;
        Boolean boolValueOf = Boolean.valueOf(c4221gh.f56821h);
        InterfaceC4272ih interfaceC4272ih = this.f57022c;
        c4350lh.f57206j = boolValueOf;
        c4350lh.f57207k = interfaceC4272ih;
        C4221gh c4221gh2 = (C4221gh) m10.componentArguments;
        c4350lh.f57218v = c4221gh2.f56823j;
        C4226gm c4226gm = m10.f55547a;
        C4362m4 c4362m4 = c4226gm.f56844n;
        c4350lh.f57210n = c4362m4.f57241a;
        C4671ye c4671ye = c4226gm.f56849s;
        if (c4671ye != null) {
            c4350lh.f57215s = c4671ye.f58021a;
            c4350lh.f57216t = c4671ye.f58022b;
        }
        c4350lh.f57211o = c4362m4.f57242b;
        c4350lh.f57213q = c4226gm.f56835e;
        c4350lh.f57212p = c4226gm.f56841k;
        D3 d10 = this.f57023d;
        Map<String, String> map = c4221gh2.f56822i;
        A3 a3F = C4418oa.I.f();
        d10.getClass();
        c4350lh.f57217u = D3.a(map, c4226gm, a3F);
        c4350lh.f57220x = this.f57021b.f56220v.f57543e.keySet();
        return c4350lh;
    }
}
