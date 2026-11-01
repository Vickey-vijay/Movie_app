package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3082od extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3107pd f24993a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3082od(C3107pd c3107pd, rj.c cVar) {
        super(2, cVar);
        this.f24993a = c3107pd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3082od(this.f24993a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3082od(this.f24993a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        InterfaceC3028m9 interfaceC3028m9L = this.f24993a.l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-NativeLoadedState", "Initialize - notifying publisher of load success");
        }
        C3107pd c3107pd = this.f24993a;
        Hc hc2 = c3107pd.f25074i;
        C2755be c2755be = c3107pd.f25071f;
        G g10 = c3107pd.f25754a.f25677b;
        hc2.a(c2755be, new AdMetaInfo(g10.f22696e, g10.f22703l));
        return mj.r.f64562a;
    }
}
