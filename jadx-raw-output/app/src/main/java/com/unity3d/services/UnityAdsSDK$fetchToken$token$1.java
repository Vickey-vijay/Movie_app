package com.unity3d.services;

import bk.p;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.g;
import mj.r;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: UnityAdsSDK.kt */
/* JADX INFO: loaded from: classes4.dex */
@d(c = "com.unity3d.services.UnityAdsSDK$fetchToken$token$1", f = "UnityAdsSDK.kt", l = {193}, m = "invokeSuspend")
public final class UnityAdsSDK$fetchToken$token$1 extends SuspendLambda implements p<l0, c<? super String>, Object> {
    public final /* synthetic */ g<GetHeaderBiddingToken> $getHeaderBiddingToken$delegate;
    public final /* synthetic */ g<TokenNumberProvider> $tokenNumberProvider$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK$fetchToken$token$1(g<? extends GetHeaderBiddingToken> gVar, g<? extends TokenNumberProvider> gVar2, c<? super UnityAdsSDK$fetchToken$token$1> cVar) {
        super(2, cVar);
        this.$getHeaderBiddingToken$delegate = gVar;
        this.$tokenNumberProvider$delegate = gVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new UnityAdsSDK$fetchToken$token$1(this.$getHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super String> cVar) {
        return ((UnityAdsSDK$fetchToken$token$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            GetHeaderBiddingToken getHeaderBiddingTokenFetchToken$lambda$11 = UnityAdsSDK.fetchToken$lambda$11(this.$getHeaderBiddingToken$delegate);
            int iInvoke = UnityAdsSDK.fetchToken$lambda$10(this.$tokenNumberProvider$delegate).invoke();
            this.label = 1;
            obj = GetHeaderBiddingToken.DefaultImpls.invoke$default(getHeaderBiddingTokenFetchToken$lambda$11, iInvoke, null, this, 2, null);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
