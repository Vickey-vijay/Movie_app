package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3293x0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdQualityResult f25679b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3293x0(AdQualityResult adQualityResult, rj.c cVar) {
        super(2, cVar);
        this.f25679b = adQualityResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3293x0(this.f25679b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3293x0(this.f25679b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25678a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            H0 h10 = (H0) E0.f22556a.getValue();
            String imageLocation = this.f25679b.getImageLocation();
            this.f25678a = 1;
            Object objA = h10.f22766a.a("ad_quality_db", "image_location=?", new String[]{imageLocation}, this);
            if (objA != sj.a.f()) {
                objA = mj.r.f64562a;
            }
            if (objA == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
