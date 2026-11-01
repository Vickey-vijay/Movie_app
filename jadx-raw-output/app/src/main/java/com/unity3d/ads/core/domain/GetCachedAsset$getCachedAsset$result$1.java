package com.unity3d.ads.core.domain;

import bk.p;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: GetCachedAsset.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "com.unity3d.ads.core.domain.GetCachedAsset$getCachedAsset$result$1", f = "GetCachedAsset.kt", l = {55}, m = "invokeSuspend")
public final class GetCachedAsset$getCachedAsset$result$1 extends SuspendLambda implements p<l0, c<? super CacheResult>, Object> {
    public final /* synthetic */ String $fileName;
    public int label;
    public final /* synthetic */ GetCachedAsset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCachedAsset$getCachedAsset$result$1(GetCachedAsset getCachedAsset, String str, c<? super GetCachedAsset$getCachedAsset$result$1> cVar) {
        super(2, cVar);
        this.this$0 = getCachedAsset;
        this.$fileName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new GetCachedAsset$getCachedAsset$result$1(this.this$0, this.$fileName, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super CacheResult> cVar) {
        return ((GetCachedAsset$getCachedAsset$result$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            CacheRepository cacheRepository = this.this$0.cacheRepository;
            String str = this.$fileName;
            this.label = 1;
            obj = cacheRepository.retrieveFile(str, this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
