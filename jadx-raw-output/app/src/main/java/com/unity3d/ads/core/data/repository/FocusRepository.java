package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.LifecycleEvent;
import com.unity3d.services.core.log.DeviceLog;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import nk.h0;
import qk.c;
import qk.d;
import qk.e;
import qk.p;
import qk.q;

/* JADX INFO: compiled from: FocusRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FocusRepository {
    private final p<FocusState> focusState;

    public FocusRepository(AndroidGetLifecycleFlow androidGetLifecycleFlow, h0 h0Var) {
        p<FocusState> pVarB;
        ck.p.j(androidGetLifecycleFlow, "getLifecycleFlow");
        ck.p.j(h0Var, "defaultDispatcher");
        try {
            final c<LifecycleEvent> cVarInvoke = androidGetLifecycleFlow.invoke();
            final c<LifecycleEvent> cVar = new c<LifecycleEvent>() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                public static final class AnonymousClass2<T> implements d {
                    public final /* synthetic */ d $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @tj.d(c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2", f = "FocusRepository.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        public Object L$0;
                        public Object L$1;
                        public int label;
                        public /* synthetic */ Object result;

                        public AnonymousClass1(rj.c cVar) {
                            super(cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(d dVar) {
                        this.$this_unsafeFlow = dVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // qk.d
                    public final Object emit(Object obj, rj.c cVar) throws Throwable {
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
                            d dVar = this.$this_unsafeFlow;
                            LifecycleEvent lifecycleEvent = (LifecycleEvent) obj;
                            if ((lifecycleEvent instanceof LifecycleEvent.Paused) || (lifecycleEvent instanceof LifecycleEvent.Resumed)) {
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
                public Object collect(d<? super LifecycleEvent> dVar, rj.c cVar2) {
                    Object objCollect = cVarInvoke.collect(new AnonymousClass2(dVar), cVar2);
                    return objCollect == sj.a.f() ? objCollect : r.f64562a;
                }
            };
            pVarB = e.E(new c<FocusState>() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                public static final class AnonymousClass2<T> implements d {
                    public final /* synthetic */ d $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @tj.d(c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2", f = "FocusRepository.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        public Object L$0;
                        public int label;
                        public /* synthetic */ Object result;

                        public AnonymousClass1(rj.c cVar) {
                            super(cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(d dVar) {
                        this.$this_unsafeFlow = dVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // qk.d
                    public final Object emit(Object obj, rj.c cVar) throws Throwable {
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
                            d dVar = this.$this_unsafeFlow;
                            LifecycleEvent lifecycleEvent = (LifecycleEvent) obj;
                            FocusState focused = lifecycleEvent instanceof LifecycleEvent.Resumed ? new FocusState.Focused(lifecycleEvent.getActivity()) : new FocusState.Unfocused(lifecycleEvent.getActivity());
                            anonymousClass1.label = 1;
                            if (dVar.emit(focused, anonymousClass1) == objF) {
                                return objF;
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
                public Object collect(d<? super FocusState> dVar, rj.c cVar2) {
                    Object objCollect = cVar.collect(new AnonymousClass2(dVar), cVar2);
                    return objCollect == sj.a.f() ? objCollect : r.f64562a;
                }
            }, kotlinx.coroutines.d.a(h0Var), kotlinx.coroutines.flow.a.f63151a.a(), 1);
        } catch (Exception e10) {
            DeviceLog.error("Could not subscribe to lifecycle flow", e10);
            pVarB = q.b(0, 0, null, 7, null);
        }
        this.focusState = pVarB;
    }

    public final p<FocusState> getFocusState() {
        return this.focusState;
    }
}
