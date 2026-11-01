package com.unity3d.ads.core.data.repository;

import android.app.Activity;
import bk.p;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.LifecycleEvent;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import jk.m;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import mj.r;
import nk.h0;
import qk.e;
import qk.l;
import qk.u;
import qk.v;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: OrientationRepository.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OrientationRepository {
    private final l<Integer> _resumedActivityOrientation;
    private final h0 defaultDispatcher;
    private final AndroidGetLifecycleFlow getLifecycleFlow;
    private final l<Boolean> isRunning;
    private final u<Integer> resumedActivityOrientation;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4, reason: invalid class name */
    /* JADX INFO: compiled from: OrientationRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4", f = "OrientationRepository.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends SuspendLambda implements p<WeakReference<Activity>, c<? super r>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass4(c<? super AnonymousClass4> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass4 anonymousClass4 = OrientationRepository.this.new AnonymousClass4(cVar);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(WeakReference<Activity> weakReference, c<? super r> cVar) {
            return ((AnonymousClass4) create(weakReference, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int requestedOrientation;
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                WeakReference weakReference = (WeakReference) this.L$0;
                l lVar = OrientationRepository.this._resumedActivityOrientation;
                Activity activity = (Activity) weakReference.get();
                if (activity != null) {
                    requestedOrientation = activity.getRequestedOrientation();
                } else {
                    requestedOrientation = -1;
                }
                lVar.setValue(tj.a.d(requestedOrientation));
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public OrientationRepository(AndroidGetLifecycleFlow androidGetLifecycleFlow, h0 h0Var) {
        ck.p.j(androidGetLifecycleFlow, "getLifecycleFlow");
        ck.p.j(h0Var, "defaultDispatcher");
        this.getLifecycleFlow = androidGetLifecycleFlow;
        this.defaultDispatcher = h0Var;
        this.isRunning = v.a(Boolean.FALSE);
        l<Integer> lVarA = v.a(-1);
        this._resumedActivityOrientation = lVarA;
        this.resumedActivityOrientation = lVarA;
    }

    public final u<Integer> getResumedActivityOrientation() {
        return this.resumedActivityOrientation;
    }

    public final void invoke() {
        Boolean value;
        Boolean bool;
        l<Boolean> lVar = this.isRunning;
        do {
            value = lVar.getValue();
            bool = value;
            bool.booleanValue();
        } while (!lVar.a(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        final qk.c<LifecycleEvent> cVarInvoke = this.getLifecycleFlow.invoke();
        final qk.c<Object> cVar = new qk.c<Object>() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2", f = "OrientationRepository.kt", l = {224}, m = "emit")
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
                        if (obj instanceof LifecycleEvent.Resumed) {
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
            public Object collect(qk.d<? super Object> dVar, c cVar2) {
                Object objCollect = cVarInvoke.collect(new AnonymousClass2(dVar), cVar2);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        };
        final AnonymousClass3 anonymousClass3 = new PropertyReference1Impl() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository.invoke.3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, jk.m
            public Object get(Object obj) {
                return ((LifecycleEvent) obj).getActivity();
            }
        };
        e.x(e.A(new qk.c<WeakReference<Activity>>() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;
                public final /* synthetic */ m receiver$inlined;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2", f = "OrientationRepository.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public Object L$0;
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

                public AnonymousClass2(qk.d dVar, m mVar) {
                    this.$this_unsafeFlow = dVar;
                    this.receiver$inlined = mVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
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
                        Object obj3 = this.receiver$inlined.get((LifecycleEvent) obj);
                        anonymousClass1.label = 1;
                        if (dVar.emit(obj3, anonymousClass1) == objF) {
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
            public Object collect(qk.d<? super WeakReference<Activity>> dVar, c cVar2) {
                Object objCollect = cVar.collect(new AnonymousClass2(dVar, anonymousClass3), cVar2);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        }, new AnonymousClass4(null)), kotlinx.coroutines.d.a(this.defaultDispatcher));
    }
}
