package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.Result;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3542jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3768wb f29281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, C3688s> f29282b;

    public final void a(N7.a aVar) {
        ck.p.j(aVar, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, C3688s> entry : this.f29282b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C3688s.d> entry2 : entry.getValue().c().entrySet()) {
                String key2 = entry2.getKey();
                C3688s.d value = entry2.getValue();
                b(aVar, key2, key, value);
                a(aVar, key2, key, value);
                c(aVar, key2, key, value);
            }
        }
    }

    public C3542jd(C3768wb c3768wb, Map<LevelPlay.AdFormat, C3688s> map) {
        ck.p.j(c3768wb, "tools");
        ck.p.j(map, "adFormatsConfigurations");
        this.f29281a = c3768wb;
        this.f29282b = map;
    }

    private final void b(N7.a aVar, String str, LevelPlay.AdFormat adFormat, C3688s.d dVar) throws JSONException {
        O3 o10 = O3.Delivery;
        R4 r4C = dVar.c();
        a(aVar.a(str, adFormat, o10, new F3(r4C != null ? Boolean.valueOf(r4C.a()) : null, null, null, 6, null)), str, adFormat, o10);
    }

    private final void c(N7.a aVar, String str, LevelPlay.AdFormat adFormat, C3688s.d dVar) throws JSONException {
        C3381ad c3381adE = dVar.e();
        if (c3381adE != null) {
            O3 o10 = O3.Pacing;
            a(aVar.a(str, adFormat, o10, new F3(c3381adE.a(), c3381adE.b(), N3.Second)), str, adFormat, o10);
        }
    }

    private final void a(N7.a aVar, String str, LevelPlay.AdFormat adFormat, C3688s.d dVar) throws JSONException {
        I3 i3B = dVar.b();
        if (i3B != null) {
            O3 o10 = O3.ShowCount;
            a(aVar.a(str, adFormat, o10, new F3(i3B.a(), i3B.b(), i3B.c())), str, adFormat, o10);
        }
    }

    private final void a(Object obj, String str, LevelPlay.AdFormat adFormat, O3 o10) throws JSONException {
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(obj);
        if (thM3461exceptionOrNullimpl != null) {
            this.f29281a.a(str, adFormat, new J3().a(o10), thM3461exceptionOrNullimpl.getMessage());
        }
    }
}
