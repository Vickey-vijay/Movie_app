package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3723u0 implements L3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3768wb f31345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, C3688s> f31346b;

    @Override // com.ironsource.L3
    public void a(InterfaceC3713t7.a aVar) {
        ck.p.j(aVar, "cappingService");
        Iterator<Map.Entry<LevelPlay.AdFormat, C3688s>> it = this.f31346b.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C3688s.d> entry : it.next().getValue().a().entrySet()) {
                String key = entry.getKey();
                C3688s.d value = entry.getValue();
                a(aVar, key, value);
                b(aVar, key, value);
            }
        }
    }

    public C3723u0(C3768wb c3768wb, Map<LevelPlay.AdFormat, C3688s> map) {
        ck.p.j(c3768wb, "tools");
        ck.p.j(map, "adFormatsConfigurations");
        this.f31345a = c3768wb;
        this.f31346b = map;
    }

    private final void b(InterfaceC3713t7.a aVar, String str, C3688s.d dVar) throws JSONException {
        C3381ad c3381adE = dVar.e();
        if (c3381adE != null) {
            O3 o10 = O3.Pacing;
            a(aVar.a(str, o10, new F3(c3381adE.a(), c3381adE.b(), c3381adE.c())), str, o10);
        }
    }

    private final void a(InterfaceC3713t7.a aVar, String str, C3688s.d dVar) throws JSONException {
        I3 i3B = dVar.b();
        if (i3B != null) {
            O3 o10 = O3.ShowCount;
            a(aVar.a(str, o10, new F3(i3B.a(), i3B.b(), i3B.c())), str, o10);
        }
    }

    private final void a(Object obj, String str, O3 o10) throws JSONException {
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(obj);
        if (thM3461exceptionOrNullimpl != null) {
            this.f31345a.a(str, new J3().a(o10), thM3461exceptionOrNullimpl.getMessage());
        }
    }
}
