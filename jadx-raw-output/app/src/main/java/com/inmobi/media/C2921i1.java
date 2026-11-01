package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2921i1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2995l1 f24523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F2 f24525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f24527e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2921i1(AbstractC2995l1 abstractC2995l1, String str, F2 f10, String str2, String str3, rj.c cVar) {
        super(2, cVar);
        this.f24523a = abstractC2995l1;
        this.f24524b = str;
        this.f24525c = f10;
        this.f24526d = str2;
        this.f24527e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2921i1(this.f24523a, this.f24524b, this.f24525c, this.f24526d, this.f24527e, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C2921i1) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        try {
            com.inmobi.media.ads.network.common.model.Ad adB = this.f24523a.b(0);
            if (adB == null || !ck.p.e(adB.getImpressionId(), this.f24524b)) {
                C3053n9 c3053n9 = this.f24523a.f24717i;
                if (c3053n9 != null) {
                    ck.p.i("l1", "<get-TAG>(...)");
                    c3053n9.c("l1", "Returning blob as empty string");
                }
                ((GestureDetectorOnGestureListenerC2785ci) this.f24525c).c(this.f24526d, this.f24527e, "");
            } else {
                String webVast = adB.getWebVast();
                ((GestureDetectorOnGestureListenerC2785ci) this.f24525c).c(this.f24526d, this.f24527e, webVast);
                C3053n9 c3053n10 = this.f24523a.f24717i;
                if (c3053n10 != null) {
                    ck.p.i("l1", "<get-TAG>(...)");
                    c3053n10.c("l1", "Returning blob " + webVast);
                }
            }
        } catch (Exception e10) {
            C3053n9 c3053n11 = this.f24523a.f24717i;
            if (c3053n11 != null) {
                ck.p.i("l1", "<get-TAG>(...)");
                c3053n11.a("l1", "Exception while getBlob", e10);
            }
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
        return mj.r.f64562a;
    }
}
