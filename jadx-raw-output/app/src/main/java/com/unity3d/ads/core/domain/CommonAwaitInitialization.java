package com.unity3d.ads.core.domain;

import bk.p;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import mj.r;
import nk.l0;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: CommonAwaitInitialization.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CommonAwaitInitialization implements AwaitInitialization {
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: CommonAwaitInitialization.kt */
    @d(c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2", f = "CommonAwaitInitialization.kt", l = {15}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super InitializationState>, Object> {
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return CommonAwaitInitialization.this.new AnonymousClass2(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super InitializationState> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                final qk.c<InitializationState> observeInitializationState = CommonAwaitInitialization.this.sessionRepository.getObserveInitializationState();
                qk.c<InitializationState> cVar = new qk.c<InitializationState>() { // from class: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements qk.d {
                        public final /* synthetic */ qk.d $this_unsafeFlow;

                        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @d(c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2", f = "CommonAwaitInitialization.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            public Object L$0;
                            public Object L$1;
                            public int label;
                            public /* synthetic */ Object result;

                            public AnonymousClass1(c cVar) {
                                super(cVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(qk.d dVar) {
                            this.$this_unsafeFlow = dVar;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // qk.d
                        public final Object emit(Object obj, c cVar) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i10 = anonymousClass1.label;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(cVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object objF = sj.a.f();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                kotlin.c.b(obj2);
                                qk.d dVar = this.$this_unsafeFlow;
                                InitializationState initializationState = (InitializationState) obj;
                                if (initializationState == InitializationState.INITIALIZED || initializationState == InitializationState.FAILED) {
                                    anonymousClass1.label = 1;
                                    if (dVar.emit(obj, anonymousClass1) == objF) {
                                        return objF;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.c.b(obj2);
                            }
                            return r.f64562a;
                        }
                    }

                    @Override // qk.c
                    public Object collect(qk.d<? super InitializationState> dVar, c cVar2) {
                        Object objCollect = observeInitializationState.collect(new AnonymousClass2(dVar), cVar2);
                        return objCollect == sj.a.f() ? objCollect : r.f64562a;
                    }
                };
                this.label = 1;
                obj = e.r(cVar, this);
                if (obj == objF) {
                    return objF;
                }
            }
            return obj;
        }
    }

    public CommonAwaitInitialization(SessionRepository sessionRepository) {
        ck.p.j(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.AwaitInitialization
    public Object invoke(long j10, c<? super InitializationState> cVar) {
        return TimeoutKt.d(j10, new AnonymousClass2(null), cVar);
    }
}
