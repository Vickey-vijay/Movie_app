package com.unity3d.ads.core.domain;

import bk.p;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.h;
import mj.r;
import mk.b;
import nk.l0;
import nk.s0;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: CleanUpWhenOpportunityExpires.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1", f = "CleanUpWhenOpportunityExpires.kt", l = {33, 34, 39}, m = "invokeSuspend")
public final class CleanUpWhenOpportunityExpires$invoke$job$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ AdObject $adObject;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CleanUpWhenOpportunityExpires$invoke$job$1(AdObject adObject, c<? super CleanUpWhenOpportunityExpires$invoke$job$1> cVar) {
        super(2, cVar);
        this.$adObject = adObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new CleanUpWhenOpportunityExpires$invoke$job$1(this.$adObject, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
        return ((CleanUpWhenOpportunityExpires$invoke$job$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: CleanUpWhenOpportunityExpires.kt */
    @d(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1", f = "CleanUpWhenOpportunityExpires.kt", l = {41}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ AdObject $adObject;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$adObject = adObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$adObject, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                this.$adObject.getState().setValue(AdObjectState.EXPIRED);
                AdPlayer adPlayer = this.$adObject.getAdPlayer();
                this.label = 1;
                if (adPlayer.destroy(this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        b value;
        long jM;
        h hVar;
        AnonymousClass1 anonymousClass1;
        Object objF = sj.a.f();
        int i10 = this.label;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                    if (this.$adObject.getState().getValue() == AdObjectState.SHOWING) {
                        z10 = false;
                    }
                    if (z10) {
                        hVar = h.f63171b;
                        anonymousClass1 = new AnonymousClass1(this.$adObject, null);
                        this.label = 3;
                        if (nk.h.g(hVar, anonymousClass1, this) == objF) {
                            return objF;
                        }
                    }
                }
            } else {
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
        kotlin.c.b(obj);
        value = this.$adObject.getTtl().getValue();
        if (value == null) {
            qk.c cVarP = e.p(this.$adObject.getTtl());
            this.label = 1;
            obj = e.r(cVarP, this);
            if (obj == objF) {
                return objF;
            }
        }
        jM = value.M();
        this.label = 2;
        if (s0.b(jM, this) == objF) {
            return objF;
        }
        if (this.$adObject.getState().getValue() == AdObjectState.SHOWING) {
            z10 = false;
        }
        if (z10) {
            hVar = h.f63171b;
            anonymousClass1 = new AnonymousClass1(this.$adObject, null);
            this.label = 3;
            if (nk.h.g(hVar, anonymousClass1, this) == objF) {
                return objF;
            }
        }
        return r.f64562a;
        value = (b) obj;
        jM = value.M();
        this.label = 2;
        if (s0.b(jM, this) == objF) {
            return objF;
        }
        if (this.$adObject.getState().getValue() == AdObjectState.SHOWING) {
            z10 = false;
        }
        if (z10) {
            hVar = h.f63171b;
            anonymousClass1 = new AnonymousClass1(this.$adObject, null);
            this.label = 3;
            if (nk.h.g(hVar, anonymousClass1, this) == objF) {
                return objF;
            }
        }
        return r.f64562a;
    }
}
