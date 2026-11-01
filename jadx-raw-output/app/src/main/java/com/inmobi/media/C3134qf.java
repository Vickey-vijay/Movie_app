package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3426d4;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3134qf extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3183sf f25182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdConfig.OmidConfig f25183b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3134qf(C3183sf c3183sf, AdConfig.OmidConfig omidConfig, rj.c cVar) {
        super(2, cVar);
        this.f25182a = c3183sf;
        this.f25183b = omidConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3134qf(this.f25182a, this.f25183b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3134qf(this.f25182a, this.f25183b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z10;
        sj.a.f();
        kotlin.c.b(obj);
        Ea ea2 = this.f25182a.f25325a.f25848a;
        ea2.getClass();
        ck.p.j("last_ts", C3426d4.i.W);
        if ((System.currentTimeMillis() / ((long) 1000)) - ea2.f22577a.getLong("last_ts", 0L) > this.f25183b.getExpiry()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return tj.a.a(z10);
    }
}
