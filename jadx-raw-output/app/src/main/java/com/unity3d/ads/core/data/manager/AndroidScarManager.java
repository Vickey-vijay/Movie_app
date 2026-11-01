package com.unity3d.ads.core.data.manager;

import android.content.Context;
import bk.p;
import bk.q;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.f;
import com.unity3d.ads.core.data.model.exception.LoadException;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdFormatOuterClass;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import lk.x;
import mj.r;
import nj.n;
import nj.s;
import nk.l;
import nk.l0;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidScarManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidScarManager implements ScarManager {
    private final GMAScarAdapterBridge gmaBridge;
    private final CommonScarEventReceiver scarEventReceiver;
    private final ScarTimeHackFixer scarTimeHackFixer;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2", f = "AndroidScarManager.kt", l = {42}, m = "invokeSuspend")
    public static final class C38632 extends SuspendLambda implements p<l0, c<? super String>, Object> {
        public int label;

        public C38632(c<? super C38632> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidScarManager.this.new C38632(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super String> cVar) {
            return ((C38632) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidScarManager.kt */
        @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<qk.d<? super String>, c<? super r>, Object> {
            public int label;
            public final /* synthetic */ AndroidScarManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidScarManager androidScarManager, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = androidScarManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<r> create(Object obj, c<?> cVar) {
                return new AnonymousClass1(this.this$0, cVar);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo1invoke(qk.d<? super String> dVar, c<? super r> cVar) {
                return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.label == 0) {
                    kotlin.c.b(obj);
                    this.this$0.gmaBridge.getVersion();
                    return r.f64562a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
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
                qk.p pVarC = e.C(AndroidScarManager.this.scarEventReceiver.getVersionFlow(), new AnonymousClass1(AndroidScarManager.this, null));
                this.label = 1;
                obj = e.r(pVarC, this);
                if (obj == objF) {
                    return objF;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager", f = "AndroidScarManager.kt", l = {93}, m = f.H)
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
            return AndroidScarManager.this.loadAd(null, null, null, null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2", f = "AndroidScarManager.kt", l = {134}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super BiddingSignals>, Object> {
        public final /* synthetic */ List<AdFormatOuterClass.AdFormat> $adFormat;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ AndroidScarManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends AdFormatOuterClass.AdFormat> list, AndroidScarManager androidScarManager, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$adFormat = list;
            this.this$0 = androidScarManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(this.$adFormat, this.this$0, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super BiddingSignals> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ArrayList arrayList;
            boolean z10;
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
                List<AdFormatOuterClass.AdFormat> list = this.$adFormat;
                AndroidScarManager androidScarManager = this.this$0;
                this.L$0 = list;
                this.L$1 = androidScarManager;
                this.label = 1;
                final kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(this), 1);
                cVar.J();
                boolean z11 = false;
                if (list != null) {
                    arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        UnityAdFormat unityAdFormat = AdFormatExtensions.toUnityAdFormat((AdFormatOuterClass.AdFormat) it.next());
                        if (unityAdFormat != UnityAdFormat.UNSPECIFIED) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            unityAdFormat = null;
                        }
                        if (unityAdFormat != null) {
                            arrayList.add(unityAdFormat);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    z11 = true;
                }
                if (z11) {
                    cVar.resumeWith(Result.m3458constructorimpl(null));
                } else {
                    androidScarManager.gmaBridge.getSCARBiddingSignals(arrayList, new BiddingSignalsHandler(true, new IBiddingSignalsListener() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2$1$1
                        @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                        public void onSignalsFailure(String str) {
                            l<BiddingSignals> lVar = cVar;
                            Result.a aVar = Result.Companion;
                            lVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(new Exception(str))));
                        }

                        @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                        public void onSignalsReady(BiddingSignals biddingSignals) {
                            cVar.resumeWith(Result.m3458constructorimpl(biddingSignals));
                        }
                    }));
                }
                obj = cVar.B();
                if (obj == sj.a.f()) {
                    tj.f.c(this);
                }
                if (obj == objF) {
                    return objF;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class C38642 extends SuspendLambda implements p<qk.d<? super GmaEventData>, c<? super r>, Object> {
        public final /* synthetic */ String $adString;
        public final /* synthetic */ String $adUnitId;
        public final /* synthetic */ boolean $canSkip;
        public final /* synthetic */ String $placementId;
        public final /* synthetic */ String $queryId;
        public final /* synthetic */ int $videoLength;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38642(boolean z10, String str, String str2, String str3, String str4, int i10, c<? super C38642> cVar) {
            super(2, cVar);
            this.$canSkip = z10;
            this.$placementId = str;
            this.$queryId = str2;
            this.$adString = str3;
            this.$adUnitId = str4;
            this.$videoLength = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidScarManager.this.new C38642(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, this.$videoLength, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(qk.d<? super GmaEventData> dVar, c<? super r> cVar) {
            return ((C38642) create(dVar, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                AndroidScarManager.this.gmaBridge.load(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, AndroidScarManager.this.scarTimeHackFixer.invoke(this.$videoLength));
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<GmaEventData, c<? super Boolean>, Object> {
        public final /* synthetic */ String $placementId;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$placementId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$placementId, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(GmaEventData gmaEventData, c<? super Boolean> cVar) {
            return ((AnonymousClass3) create(gmaEventData, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                GmaEventData gmaEventData = (GmaEventData) this.L$0;
                boolean z10 = false;
                if ((s.n(GMAEvent.AD_LOADED, GMAEvent.LOAD_ERROR).contains(gmaEventData.getGmaEvent()) && ck.p.e(gmaEventData.getPlacementId(), this.$placementId)) || s.n(GMAEvent.METHOD_ERROR, GMAEvent.SCAR_NOT_PRESENT, GMAEvent.INTERNAL_LOAD_ERROR).contains(gmaEventData.getGmaEvent())) {
                    z10 = true;
                }
                return tj.a.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class C38651 extends SuspendLambda implements p<qk.d<? super GmaEventData>, c<? super r>, Object> {
        public final /* synthetic */ UnityBannerSize $bannerSize;
        public final /* synthetic */ BannerView $bannerView;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $opportunityId;
        public final /* synthetic */ qc.c $scarAdMetadata;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38651(Context context, BannerView bannerView, String str, qc.c cVar, UnityBannerSize unityBannerSize, c<? super C38651> cVar2) {
            super(2, cVar2);
            this.$context = context;
            this.$bannerView = bannerView;
            this.$opportunityId = str;
            this.$scarAdMetadata = cVar;
            this.$bannerSize = unityBannerSize;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidScarManager.this.new C38651(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(qk.d<? super GmaEventData> dVar, c<? super r> cVar) {
            return ((C38651) create(dVar, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                AndroidScarManager.this.gmaBridge.loadBanner(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize);
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class C38661 extends SuspendLambda implements p<qk.d<? super GmaEventData>, c<? super r>, Object> {
        public final /* synthetic */ String $placementId;
        public final /* synthetic */ String $queryId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38661(String str, String str2, c<? super C38661> cVar) {
            super(2, cVar);
            this.$placementId = str;
            this.$queryId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidScarManager.this.new C38661(this.$placementId, this.$queryId, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(qk.d<? super GmaEventData> dVar, c<? super r> cVar) {
            return ((C38661) create(dVar, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                AndroidScarManager.this.gmaBridge.show(this.$placementId, this.$queryId);
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$2", f = "AndroidScarManager.kt", l = {127}, m = "invokeSuspend")
    public static final class C38672 extends SuspendLambda implements q<qk.d<? super GmaEventData>, GmaEventData, c<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public C38672(c<? super C38672> cVar) {
            super(3, cVar);
        }

        @Override // bk.q
        public final Object invoke(qk.d<? super GmaEventData> dVar, GmaEventData gmaEventData, c<? super Boolean> cVar) {
            C38672 c38672 = new C38672(cVar);
            c38672.L$0 = dVar;
            c38672.L$1 = gmaEventData;
            return c38672.invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            GmaEventData gmaEventData;
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    gmaEventData = (GmaEventData) this.L$0;
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                qk.d dVar = (qk.d) this.L$0;
                GmaEventData gmaEventData2 = (GmaEventData) this.L$1;
                this.L$0 = gmaEventData2;
                this.label = 1;
                if (dVar.emit(gmaEventData2, this) == objF) {
                    return objF;
                }
                gmaEventData = gmaEventData2;
            }
            return tj.a.a(!n.D(new GMAEvent[]{GMAEvent.AD_CLOSED, GMAEvent.NO_AD_ERROR, GMAEvent.INTERSTITIAL_SHOW_ERROR, GMAEvent.REWARDED_SHOW_ERROR}, gmaEventData.getGmaEvent()));
        }
    }

    public AndroidScarManager(CommonScarEventReceiver commonScarEventReceiver, GMAScarAdapterBridge gMAScarAdapterBridge, ScarTimeHackFixer scarTimeHackFixer) {
        ck.p.j(commonScarEventReceiver, "scarEventReceiver");
        ck.p.j(gMAScarAdapterBridge, "gmaBridge");
        ck.p.j(scarTimeHackFixer, "scarTimeHackFixer");
        this.scarEventReceiver = commonScarEventReceiver;
        this.gmaBridge = gMAScarAdapterBridge;
        this.scarTimeHackFixer = scarTimeHackFixer;
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object getSignals(List<? extends AdFormatOuterClass.AdFormat> list, c<? super BiddingSignals> cVar) {
        return TimeoutKt.d(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, new AnonymousClass2(list, this, null), cVar);
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object getVersion(c<? super String> cVar) {
        return TimeoutKt.d(5000L, new C38632(null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object loadAd(String str, String str2, String str3, String str4, String str5, int i10, c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objQ = anonymousClass2.result;
        Object objF = sj.a.f();
        int i12 = anonymousClass2.label;
        if (i12 == 0) {
            kotlin.c.b(objQ);
            qk.p pVarC = e.C(this.scarEventReceiver.getGmaEventFlow(), new C38642(x.E(str, UnityAdFormat.INTERSTITIAL.toString(), true), str2, str5, str3, str4, i10, null));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(str2, null);
            anonymousClass2.label = 1;
            objQ = e.q(pVarC, anonymousClass3, anonymousClass2);
            if (objQ == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objQ);
        }
        GmaEventData gmaEventData = (GmaEventData) (((GmaEventData) objQ).getGmaEvent() != GMAEvent.AD_LOADED ? objQ : null);
        if (gmaEventData == null) {
            return r.f64562a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error loading SCAR ad: ");
        Object errorMessage = gmaEventData.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = gmaEventData.getGmaEvent();
        }
        sb2.append(errorMessage);
        throw new LoadException(0, sb2.toString());
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public qk.c<GmaEventData> loadBannerAd(Context context, BannerView bannerView, qc.c cVar, UnityBannerSize unityBannerSize, final String str) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(bannerView, "bannerView");
        ck.p.j(cVar, "scarAdMetadata");
        ck.p.j(unityBannerSize, "bannerSize");
        ck.p.j(str, "opportunityId");
        final qk.c cVarB = e.B(this.scarEventReceiver.getGmaEventFlow(), new C38651(context, bannerView, str, cVar, unityBannerSize, null));
        return new qk.c<GmaEventData>() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ String $opportunityId$inlined;
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2", f = "AndroidScarManager.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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

                public AnonymousClass2(qk.d dVar, String str) {
                    this.$this_unsafeFlow = dVar;
                    this.$opportunityId$inlined = str;
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
                        GmaEventData gmaEventData = (GmaEventData) obj;
                        if (gmaEventData.getGmaEvent() == GMAEvent.BANNER && ck.p.e(gmaEventData.getOpportunityId(), this.$opportunityId$inlined)) {
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
            public Object collect(qk.d<? super GmaEventData> dVar, c cVar2) {
                Object objCollect = cVarB.collect(new AnonymousClass2(dVar, str), cVar2);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        };
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public qk.c<GmaEventData> show(String str, String str2) {
        ck.p.j(str, "placementId");
        ck.p.j(str2, HandleInvocationsFromAdViewer.KEY_QUERY_ID);
        return e.J(e.C(this.scarEventReceiver.getGmaEventFlow(), new C38661(str, str2, null)), new C38672(null));
    }
}
