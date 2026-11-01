package com.ironsource;

import java.util.Map;
import kotlin.Result;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public final class Jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3768wb f26892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, C3688s.d> f26893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, C3688s.d> f26894c;

    public final void a(S7.a aVar) {
        ck.p.j(aVar, "rewardService");
        Map<String, C3688s.d> map = this.f26894c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, C3688s.d> entry : map.entrySet()) {
                String key = entry.getKey();
                Hd hdF = entry.getValue().f();
                if (hdF != null) {
                    b(aVar, key, hdF.b(), hdF.a());
                }
            }
        }
        Map<String, C3688s.d> map2 = this.f26893b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, C3688s.d> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            Hd hdA = entry2.getValue().a();
            if (hdA != null) {
                a(aVar, key2, hdA.b(), hdA.a());
            }
        }
    }

    public Jd(C3768wb c3768wb, Map<String, C3688s.d> map, Map<String, C3688s.d> map2) {
        ck.p.j(c3768wb, "tools");
        this.f26892a = c3768wb;
        this.f26893b = map;
        this.f26894c = map2;
    }

    private final void b(S7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objA = a(str2, num);
        if (Result.m3464isSuccessimpl(objA)) {
            ck.p.g(str2);
            ck.p.g(num);
            aVar.a(str, str2, num.intValue());
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objA);
        if (thM3461exceptionOrNullimpl != null) {
            this.f26892a.b(str, 3004, thM3461exceptionOrNullimpl.getMessage());
        }
    }

    private final void a(S7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objA = a(str2, num);
        if (Result.m3464isSuccessimpl(objA)) {
            ck.p.g(str2);
            ck.p.g(num);
            aVar.b(str, str2, num.intValue());
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objA);
        if (thM3461exceptionOrNullimpl != null) {
            this.f26892a.b(str, 3004, thM3461exceptionOrNullimpl.getMessage());
        }
    }

    private final Object a(String str, Integer num) {
        if (str != null && num != null) {
            Result.a aVar = Result.Companion;
            return Result.m3458constructorimpl(mj.r.f64562a);
        }
        Result.a aVar2 = Result.Companion;
        return Result.m3458constructorimpl(kotlin.c.a(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid")));
    }
}
