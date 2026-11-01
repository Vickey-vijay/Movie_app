package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2970k1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2995l1 f24641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2970k1(AbstractC2995l1 abstractC2995l1, String str, String str2, rj.c cVar) {
        super(2, cVar);
        this.f24641a = abstractC2995l1;
        this.f24642b = str;
        this.f24643c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2970k1(this.f24641a, this.f24642b, this.f24643c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C2970k1) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        com.inmobi.media.ads.network.common.model.Ad adB = this.f24641a.b(0);
        if (adB != null && ck.p.e(adB.getImpressionId(), this.f24642b)) {
            this.f24641a.a(adB, this.f24643c);
            C3053n9 c3053n9 = this.f24641a.f24717i;
            if (c3053n9 != null) {
                ck.p.i("l1", "<get-TAG>(...)");
                c3053n9.c("l1", "Updated blob " + this.f24643c);
            }
        } else {
            C3053n9 c3053n10 = this.f24641a.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "<get-TAG>(...)");
                c3053n10.b("l1", "Impression ID is null for saveBlob");
            }
        }
        return mj.r.f64562a;
    }
}
