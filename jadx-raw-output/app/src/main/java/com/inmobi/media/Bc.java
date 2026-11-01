package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class Bc extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Cc f22412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdSessionConfiguration f22413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdSessionContext f22414c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bc(Cc cc2, AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, rj.c cVar) {
        super(2, cVar);
        this.f22412a = cc2;
        this.f22413b = adSessionConfiguration;
        this.f22414c = adSessionContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Bc(this.f22412a, this.f22413b, this.f22414c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((Bc) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        Cc cc2 = this.f22412a;
        AdSessionConfiguration adSessionConfiguration = this.f22413b;
        ck.p.g(adSessionConfiguration);
        AdSessionContext adSessionContext = this.f22414c;
        int i10 = Cc.f22463h;
        cc2.a(adSessionConfiguration, adSessionContext);
        this.f22412a.b();
        this.f22412a.c();
        return mj.r.f64562a;
    }
}
