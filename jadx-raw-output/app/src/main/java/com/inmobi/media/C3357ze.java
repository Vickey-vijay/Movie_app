package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3357ze extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ae f25843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdSessionConfiguration f25844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdSessionContext f25845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3357ze(Ae ae2, AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, rj.c cVar) {
        super(2, cVar);
        this.f25843a = ae2;
        this.f25844b = adSessionConfiguration;
        this.f25845c = adSessionContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3357ze(this.f25843a, this.f25844b, this.f25845c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3357ze) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        Ae ae2 = this.f25843a;
        AdSessionConfiguration adSessionConfiguration = this.f25844b;
        ck.p.g(adSessionConfiguration);
        AdSessionContext adSessionContext = this.f25845c;
        int i10 = Ae.f22365i;
        ae2.a(adSessionConfiguration, adSessionContext);
        this.f25843a.b();
        this.f25843a.c();
        return mj.r.f64562a;
    }
}
