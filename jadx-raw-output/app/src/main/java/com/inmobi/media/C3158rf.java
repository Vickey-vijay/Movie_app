package com.inmobi.media;

import com.ironsource.C3426d4;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3158rf extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3183sf f25265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f25266b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3158rf(C3183sf c3183sf, String str, rj.c cVar) {
        super(2, cVar);
        this.f25265a = c3183sf;
        this.f25266b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3158rf(this.f25265a, this.f25266b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3158rf(this.f25265a, this.f25266b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        C3359zg c3359zg = this.f25265a.f25325a;
        String str = this.f25266b;
        c3359zg.getClass();
        ck.p.j("omid_js_string", C3426d4.i.W);
        ck.p.j(str, "value");
        Ea ea2 = c3359zg.f25848a;
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        ea2.a("omid_js_string", str, false);
        c3359zg.f25848a.a("last_ts", System.currentTimeMillis() / ((long) 1000), false);
        return mj.r.f64562a;
    }
}
