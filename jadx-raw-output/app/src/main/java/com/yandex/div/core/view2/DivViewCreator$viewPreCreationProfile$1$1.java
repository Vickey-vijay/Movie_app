package com.yandex.div.core.view2;

import bk.p;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: DivViewCreator.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "com.yandex.div.core.view2.DivViewCreator$viewPreCreationProfile$1$1", f = "DivViewCreator.kt", l = {54}, m = "invokeSuspend")
public final class DivViewCreator$viewPreCreationProfile$1$1 extends SuspendLambda implements p<l0, c<? super ViewPreCreationProfile>, Object> {
    public final /* synthetic */ String $it;
    public final /* synthetic */ ViewPreCreationProfileRepository $repository;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivViewCreator$viewPreCreationProfile$1$1(ViewPreCreationProfileRepository viewPreCreationProfileRepository, String str, c<? super DivViewCreator$viewPreCreationProfile$1$1> cVar) {
        super(2, cVar);
        this.$repository = viewPreCreationProfileRepository;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new DivViewCreator$viewPreCreationProfile$1$1(this.$repository, this.$it, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super ViewPreCreationProfile> cVar) {
        return ((DivViewCreator$viewPreCreationProfile$1$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
            ViewPreCreationProfileRepository viewPreCreationProfileRepository = this.$repository;
            String str = this.$it;
            this.label = 1;
            obj = viewPreCreationProfileRepository.get(str, this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
