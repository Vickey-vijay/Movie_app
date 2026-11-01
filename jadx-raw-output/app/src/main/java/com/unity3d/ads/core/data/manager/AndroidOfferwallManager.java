package com.unity3d.ads.core.data.manager;

import bk.p;
import bk.q;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.f;
import com.unity3d.ads.core.data.model.exception.LoadException;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.core.log.DeviceLog;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nj.n;
import nj.s;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidOfferwallManager.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidOfferwallManager implements OfferwallManager {
    private final OfferwallAdapterBridge offerwallBridge;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidOfferwallManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager", f = "AndroidOfferwallManager.kt", l = {28}, m = f.H)
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidOfferwallManager.this.loadAd(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidOfferwallManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<qk.d<? super OfferwallEventData>, c<? super r>, Object> {
        public final /* synthetic */ String $placementName;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$placementName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidOfferwallManager.this.new AnonymousClass2(this.$placementName, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(qk.d<? super OfferwallEventData> dVar, c<? super r> cVar) {
            return ((AnonymousClass2) create(dVar, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                AndroidOfferwallManager.this.offerwallBridge.loadAd(this.$placementName);
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidOfferwallManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<OfferwallEventData, c<? super Boolean>, Object> {
        public final /* synthetic */ String $placementName;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$placementName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$placementName, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(OfferwallEventData offerwallEventData, c<? super Boolean> cVar) {
            return ((AnonymousClass3) create(offerwallEventData, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                OfferwallEventData offerwallEventData = (OfferwallEventData) this.L$0;
                boolean z10 = false;
                if (s.n(OfferwallEvent.REQUEST_SUCCESS, OfferwallEvent.REQUEST_FAILED).contains(offerwallEventData.getOfferwallEvent()) && ck.p.e(offerwallEventData.getPlacementName(), this.$placementName)) {
                    z10 = true;
                }
                return tj.a.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidOfferwallManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    public static final class C38611 extends SuspendLambda implements p<qk.d<? super OfferwallEventData>, c<? super r>, Object> {
        public final /* synthetic */ String $placementName;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38611(String str, c<? super C38611> cVar) {
            super(2, cVar);
            this.$placementName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidOfferwallManager.this.new C38611(this.$placementName, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(qk.d<? super OfferwallEventData> dVar, c<? super r> cVar) {
            return ((C38611) create(dVar, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                AndroidOfferwallManager.this.offerwallBridge.showAd(this.$placementName);
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidOfferwallManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2", f = "AndroidOfferwallManager.kt", l = {44}, m = "invokeSuspend")
    public static final class C38622 extends SuspendLambda implements q<qk.d<? super OfferwallEventData>, OfferwallEventData, c<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public C38622(c<? super C38622> cVar) {
            super(3, cVar);
        }

        @Override // bk.q
        public final Object invoke(qk.d<? super OfferwallEventData> dVar, OfferwallEventData offerwallEventData, c<? super Boolean> cVar) {
            C38622 c38622 = new C38622(cVar);
            c38622.L$0 = dVar;
            c38622.L$1 = offerwallEventData;
            return c38622.invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            OfferwallEventData offerwallEventData;
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    offerwallEventData = (OfferwallEventData) this.L$0;
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                qk.d dVar = (qk.d) this.L$0;
                OfferwallEventData offerwallEventData2 = (OfferwallEventData) this.L$1;
                this.L$0 = offerwallEventData2;
                this.label = 1;
                if (dVar.emit(offerwallEventData2, this) == objF) {
                    return objF;
                }
                offerwallEventData = offerwallEventData2;
            }
            return tj.a.a(!n.D(new OfferwallEvent[]{OfferwallEvent.ON_CONTENT_DISMISS, OfferwallEvent.SHOW_FAILED}, offerwallEventData.getOfferwallEvent()));
        }
    }

    public AndroidOfferwallManager(OfferwallAdapterBridge offerwallAdapterBridge) {
        ck.p.j(offerwallAdapterBridge, "offerwallBridge");
        this.offerwallBridge = offerwallAdapterBridge;
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object getVersion(c<? super String> cVar) {
        return this.offerwallBridge.getVersion();
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isAdReady(String str, c<? super Boolean> cVar) {
        return tj.a.a(this.offerwallBridge.isAdReady(str));
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isConnected(c<? super Boolean> cVar) {
        return tj.a.a(this.offerwallBridge.isConnected());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object loadAd(String str, c<? super r> cVar) throws Throwable {
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
        Object objQ = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(objQ);
            DeviceLog.debug("Offerwall Manager - loadAd: " + str);
            qk.p pVarC = e.C(this.offerwallBridge.getOfferwallEventFlow(), new AnonymousClass2(str, null));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(str, null);
            anonymousClass1.label = 1;
            objQ = e.q(pVarC, anonymousClass3, anonymousClass1);
            if (objQ == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objQ);
        }
        OfferwallEventData offerwallEventData = (OfferwallEventData) (((OfferwallEventData) objQ).getOfferwallEvent() != OfferwallEvent.REQUEST_SUCCESS ? objQ : null);
        if (offerwallEventData == null) {
            return r.f64562a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error loading offerwall ad: ");
        Object errorMessage = offerwallEventData.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = offerwallEventData.getOfferwallEvent();
        }
        sb2.append(errorMessage);
        throw new LoadException(0, sb2.toString());
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public qk.c<OfferwallEventData> showAd(String str) {
        ck.p.j(str, "placementName");
        DeviceLog.debug("Offerwall Manager - showAd: " + str);
        return e.J(e.C(this.offerwallBridge.getOfferwallEventFlow(), new C38611(str, null)), new C38622(null));
    }
}
