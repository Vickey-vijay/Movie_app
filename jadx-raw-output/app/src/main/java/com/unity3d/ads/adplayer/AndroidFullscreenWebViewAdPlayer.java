package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.Intent;
import bk.p;
import ck.i;
import ck.l;
import com.explorestack.protobuf.openrtb.LossReason;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.h;
import mj.e;
import mj.g;
import mj.r;
import nk.j;
import nk.l0;
import nk.s0;
import nk.t1;
import nk.u;
import nk.w;
import org.json.JSONObject;
import qk.k;
import qk.q;
import tj.d;

/* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {
    public static final Companion Companion = new Companion(null);
    private static final k<DisplayMessage> displayMessages = q.b(0, 0, null, 7, null);
    private final g adObject$delegate;
    private final AdRepository adRepository;
    private final Context context;
    private final DeviceInfoRepository deviceInfoRepository;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final OrientationRepository orientationRepository;
    private final ScarManager scarManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final AtomicBoolean wasDestroyed;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {192, 197, 201, 203}, m = "destroy")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(rj.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidFullscreenWebViewAdPlayer.this.destroy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {144, 147, 151}, m = "invokeSuspend")
    public static final class AnonymousClass10 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ u<r> $listenerStarted;
        public final /* synthetic */ qk.p<GmaEventData> $scarEvents;
        public final /* synthetic */ ShowOptions $showOptions;
        public int label;
        public final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$4, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
        public /* synthetic */ class AnonymousClass4 implements qk.d, l {
            public final /* synthetic */ WebViewAdPlayer $tmp0;

            public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
                this.$tmp0 = webViewAdPlayer;
            }

            public final Object emit(GMAEvent gMAEvent, rj.c<? super r> cVar) throws Throwable {
                Object objSendGmaEvent = this.$tmp0.sendGmaEvent(gMAEvent, cVar);
                return objSendGmaEvent == sj.a.f() ? objSendGmaEvent : r.f64562a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof qk.d) && (obj instanceof l)) {
                    return ck.p.e(getFunctionDelegate(), ((l) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // ck.l
            public final e<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(2, this.$tmp0, WebViewAdPlayer.class, "sendGmaEvent", "sendGmaEvent(Lcom/unity3d/scar/adapter/common/GMAEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // qk.d
            public /* bridge */ /* synthetic */ Object emit(Object obj, rj.c cVar) {
                return emit((GMAEvent) obj, (rj.c<? super r>) cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(u<r> uVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, qk.p<GmaEventData> pVar, ShowOptions showOptions, rj.c<? super AnonymousClass10> cVar) {
            super(2, cVar);
            this.$listenerStarted = uVar;
            this.this$0 = androidFullscreenWebViewAdPlayer;
            this.$scarEvents = pVar;
            this.$showOptions = showOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return new AnonymousClass10(this.$listenerStarted, this.this$0, this.$scarEvents, this.$showOptions, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((AnonymousClass10) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
        @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {146}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<qk.d<? super ScarEvent>, rj.c<? super r>, Object> {
            public final /* synthetic */ ShowOptions $showOptions;
            public int label;
            public final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, rj.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = androidFullscreenWebViewAdPlayer;
                this.$showOptions = showOptions;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c<r> create(Object obj, rj.c<?> cVar) {
                return new AnonymousClass1(this.this$0, this.$showOptions, cVar);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo1invoke(qk.d<? super ScarEvent> dVar, rj.c<? super r> cVar) {
                return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(r.f64562a);
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
                    k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                    this.label = 1;
                    if (displayMessages.emit(displayReady, this) == objF) {
                        return objF;
                    }
                }
                return r.f64562a;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
        @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements p<ScarEvent, rj.c<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public AnonymousClass2(rj.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c<r> create(Object obj, rj.c<?> cVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo1invoke(ScarEvent scarEvent, rj.c<? super Boolean> cVar) {
                return ((AnonymousClass2) create(scarEvent, cVar)).invokeSuspend(r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.label == 0) {
                    kotlin.c.b(obj);
                    return tj.a.a(ck.p.e((ScarEvent) this.L$0, ScarEvent.Show.INSTANCE));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            qk.c<GMAEvent> cVar;
            AnonymousClass4 anonymousClass4;
            Object objF = sj.a.f();
            int i10 = this.label;
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
                        final qk.p<GmaEventData> pVar = this.$scarEvents;
                        cVar = new qk.c<GMAEvent>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1

                            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                            /* JADX INFO: compiled from: Emitters.kt */
                            public static final class AnonymousClass2<T> implements qk.d {
                                public final /* synthetic */ qk.d $this_unsafeFlow;

                                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                                /* JADX INFO: compiled from: Emitters.kt */
                                @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {225}, m = "emit")
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

                                public AnonymousClass2(qk.d dVar) {
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
                                        qk.d dVar = this.$this_unsafeFlow;
                                        GMAEvent gmaEvent = ((GmaEventData) obj).getGmaEvent();
                                        if (gmaEvent != null) {
                                            anonymousClass1.label = 1;
                                            if (dVar.emit(gmaEvent, anonymousClass1) == objF) {
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
                            public Object collect(qk.d<? super GMAEvent> dVar, rj.c cVar2) {
                                Object objCollect = pVar.collect(new AnonymousClass2(dVar), cVar2);
                                return objCollect == sj.a.f() ? objCollect : r.f64562a;
                            }
                        };
                        anonymousClass4 = new AnonymousClass4(this.this$0.webViewAdPlayer);
                        this.label = 3;
                        if (cVar.collect(anonymousClass4, this) == objF) {
                            return objF;
                        }
                    }
                } else {
                    kotlin.c.b(obj);
                }
                return r.f64562a;
            }
            kotlin.c.b(obj);
            u<r> uVar = this.$listenerStarted;
            this.label = 1;
            if (uVar.y(this) == objF) {
                return objF;
            }
            qk.c cVarB = qk.e.B(this.this$0.getOnScarEvent(), new AnonymousClass1(this.this$0, this.$showOptions, null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            this.label = 2;
            if (qk.e.q(cVarB, anonymousClass2, this) == objF) {
                return objF;
            }
            final qk.c pVar2 = this.$scarEvents;
            cVar = new qk.c<GMAEvent>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                public static final class AnonymousClass2<T> implements qk.d {
                    public final /* synthetic */ qk.d $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {225}, m = "emit")
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

                    public AnonymousClass2(qk.d dVar) {
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
                            qk.d dVar = this.$this_unsafeFlow;
                            GMAEvent gmaEvent = ((GmaEventData) obj).getGmaEvent();
                            if (gmaEvent != null) {
                                anonymousClass1.label = 1;
                                if (dVar.emit(gmaEvent, anonymousClass1) == objF) {
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
                public Object collect(qk.d<? super GMAEvent> dVar, rj.c cVar2) {
                    Object objCollect = pVar2.collect(new AnonymousClass2(dVar), cVar2);
                    return objCollect == sj.a.f() ? objCollect : r.f64562a;
                }
            };
            anonymousClass4 = new AnonymousClass4(this.this$0.webViewAdPlayer);
            this.label = 3;
            if (cVar.collect(anonymousClass4, this) == objF) {
                return objF;
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {158, 161, 166}, m = "invokeSuspend")
    public static final class AnonymousClass11 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ u<r> $listenerStarted;
        public final /* synthetic */ ShowOptions $showOptions;
        public int label;
        public final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$4, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
        public /* synthetic */ class AnonymousClass4 implements qk.d, l {
            public final /* synthetic */ WebViewAdPlayer $tmp0;

            public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
                this.$tmp0 = webViewAdPlayer;
            }

            public final Object emit(OfferwallEvent offerwallEvent, rj.c<? super r> cVar) throws Throwable {
                Object objSendOfferwallEvent = this.$tmp0.sendOfferwallEvent(offerwallEvent, cVar);
                return objSendOfferwallEvent == sj.a.f() ? objSendOfferwallEvent : r.f64562a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof qk.d) && (obj instanceof l)) {
                    return ck.p.e(getFunctionDelegate(), ((l) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // ck.l
            public final e<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(2, this.$tmp0, WebViewAdPlayer.class, "sendOfferwallEvent", "sendOfferwallEvent(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // qk.d
            public /* bridge */ /* synthetic */ Object emit(Object obj, rj.c cVar) {
                return emit((OfferwallEvent) obj, (rj.c<? super r>) cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(u<r> uVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, rj.c<? super AnonymousClass11> cVar) {
            super(2, cVar);
            this.$listenerStarted = uVar;
            this.this$0 = androidFullscreenWebViewAdPlayer;
            this.$showOptions = showOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return new AnonymousClass11(this.$listenerStarted, this.this$0, this.$showOptions, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((AnonymousClass11) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$1, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
        @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {160}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<qk.d<? super OfferwallShowEvent>, rj.c<? super r>, Object> {
            public final /* synthetic */ ShowOptions $showOptions;
            public int label;
            public final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, rj.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = androidFullscreenWebViewAdPlayer;
                this.$showOptions = showOptions;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c<r> create(Object obj, rj.c<?> cVar) {
                return new AnonymousClass1(this.this$0, this.$showOptions, cVar);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo1invoke(qk.d<? super OfferwallShowEvent> dVar, rj.c<? super r> cVar) {
                return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(r.f64562a);
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
                    k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                    this.label = 1;
                    if (displayMessages.emit(displayReady, this) == objF) {
                        return objF;
                    }
                }
                return r.f64562a;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$2, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
        @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements p<OfferwallShowEvent, rj.c<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public AnonymousClass2(rj.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c<r> create(Object obj, rj.c<?> cVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo1invoke(OfferwallShowEvent offerwallShowEvent, rj.c<? super Boolean> cVar) {
                return ((AnonymousClass2) create(offerwallShowEvent, cVar)).invokeSuspend(r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.label == 0) {
                    kotlin.c.b(obj);
                    return tj.a.a(ck.p.e((OfferwallShowEvent) this.L$0, OfferwallShowEvent.Show.INSTANCE));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0066  */
        /* JADX WARN: Code duplicated, block: B:23:0x0095 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String offerwallPlacementName;
            qk.c<OfferwallEvent> cVar;
            AnonymousClass4 anonymousClass4;
            Object objF = sj.a.f();
            int i10 = this.label;
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
                        OfferwallManager offerwallManager = this.this$0.offerwallManager;
                        offerwallPlacementName = ((AndroidShowOptions) this.$showOptions).getOfferwallPlacementName();
                        if (offerwallPlacementName == null) {
                            offerwallPlacementName = "";
                        }
                        final qk.p pVarE = qk.e.E(offerwallManager.showAd(offerwallPlacementName), this.this$0.getScope(), kotlinx.coroutines.flow.a.f63151a.a(), 5);
                        cVar = new qk.c<OfferwallEvent>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$invokeSuspend$$inlined$mapNotNull$1

                            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                            /* JADX INFO: compiled from: Emitters.kt */
                            public static final class AnonymousClass2<T> implements qk.d {
                                public final /* synthetic */ qk.d $this_unsafeFlow;

                                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                                /* JADX INFO: compiled from: Emitters.kt */
                                @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$invokeSuspend$$inlined$mapNotNull$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {225}, m = "emit")
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

                                public AnonymousClass2(qk.d dVar) {
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
                                        qk.d dVar = this.$this_unsafeFlow;
                                        OfferwallEvent offerwallEvent = ((OfferwallEventData) obj).getOfferwallEvent();
                                        if (offerwallEvent != null) {
                                            anonymousClass1.label = 1;
                                            if (dVar.emit(offerwallEvent, anonymousClass1) == objF) {
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
                            public Object collect(qk.d<? super OfferwallEvent> dVar, rj.c cVar2) {
                                Object objCollect = pVarE.collect(new AnonymousClass2(dVar), cVar2);
                                return objCollect == sj.a.f() ? objCollect : r.f64562a;
                            }
                        };
                        anonymousClass4 = new AnonymousClass4(this.this$0.webViewAdPlayer);
                        this.label = 3;
                        if (cVar.collect(anonymousClass4, this) == objF) {
                            return objF;
                        }
                    }
                } else {
                    kotlin.c.b(obj);
                }
                return r.f64562a;
            }
            kotlin.c.b(obj);
            u<r> uVar = this.$listenerStarted;
            this.label = 1;
            if (uVar.y(this) == objF) {
                return objF;
            }
            qk.c cVarB = qk.e.B(this.this$0.getOnOfferwallEvent(), new AnonymousClass1(this.this$0, this.$showOptions, null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            this.label = 2;
            if (qk.e.q(cVarB, anonymousClass2, this) == objF) {
                return objF;
            }
            OfferwallManager offerwallManager2 = this.this$0.offerwallManager;
            offerwallPlacementName = ((AndroidShowOptions) this.$showOptions).getOfferwallPlacementName();
            if (offerwallPlacementName == null) {
                offerwallPlacementName = "";
            }
            final qk.c pVarE2 = qk.e.E(offerwallManager2.showAd(offerwallPlacementName), this.this$0.getScope(), kotlinx.coroutines.flow.a.f63151a.a(), 5);
            cVar = new qk.c<OfferwallEvent>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$invokeSuspend$$inlined$mapNotNull$1

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                public static final class AnonymousClass2<T> implements qk.d {
                    public final /* synthetic */ qk.d $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$invokeSuspend$$inlined$mapNotNull$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {225}, m = "emit")
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

                    public AnonymousClass2(qk.d dVar) {
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
                            qk.d dVar = this.$this_unsafeFlow;
                            OfferwallEvent offerwallEvent = ((OfferwallEventData) obj).getOfferwallEvent();
                            if (offerwallEvent != null) {
                                anonymousClass1.label = 1;
                                if (dVar.emit(offerwallEvent, anonymousClass1) == objF) {
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
                public Object collect(qk.d<? super OfferwallEvent> dVar, rj.c cVar2) {
                    Object objCollect = pVarE2.collect(new AnonymousClass2(dVar), cVar2);
                    return objCollect == sj.a.f() ? objCollect : r.f64562a;
                }
            };
            anonymousClass4 = new AnonymousClass4(this.this$0.webViewAdPlayer);
            this.label = 3;
            if (cVar.collect(anonymousClass4, this) == objF) {
                return objF;
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$3, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    public /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements p<DisplayMessage, rj.c<? super r>, Object> {
        public AnonymousClass3(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", 12);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(DisplayMessage displayMessage, rj.c<? super r> cVar) {
            return AndroidFullscreenWebViewAdPlayer.show$displayEventsRouter((AndroidFullscreenWebViewAdPlayer) this.receiver, displayMessage, cVar);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$4, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    public /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements p<VolumeSettingsChange, rj.c<? super r>, Object> {
        public AnonymousClass4(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleVolumeSettingsChange", "handleVolumeSettingsChange(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(VolumeSettingsChange volumeSettingsChange, rj.c<? super r> cVar) {
            return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleVolumeSettingsChange(volumeSettingsChange, cVar);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    public /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements p<SessionChange, rj.c<? super r>, Object> {
        public AnonymousClass7(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(SessionChange sessionChange, rj.c<? super r> cVar) {
            return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleSessionChange(sessionChange, cVar);
        }
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public qk.c<LoadEvent> getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public qk.c<OfferwallShowEvent> getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public qk.c<ScarEvent> getOnScarEvent() {
        return this.webViewAdPlayer.getOnScarEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public qk.c<ShowEvent> getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public l0 getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, rj.c<? super r> cVar) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, rj.c<? super r> cVar) {
        return this.webViewAdPlayer.onBroadcastEvent(str, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, rj.c<? super r> cVar) {
        return this.webViewAdPlayer.requestShow(map, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(rj.c<? super r> cVar) {
        return this.webViewAdPlayer.sendActivityDestroyed(cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z10, rj.c<? super r> cVar) {
        return this.webViewAdPlayer.sendFocusChange(z10, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendGmaEvent(GMAEvent gMAEvent, rj.c<? super r> cVar) {
        return this.webViewAdPlayer.sendGmaEvent(gMAEvent, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z10, rj.c<? super r> cVar) {
        return this.webViewAdPlayer.sendMuteChange(z10, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, rj.c<? super r> cVar) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, rj.c<? super r> cVar) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, rj.c<? super r> cVar) {
        return this.webViewAdPlayer.sendScarBannerEvent(bannerEvent, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, rj.c<? super r> cVar) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z10, rj.c<? super r> cVar) {
        return this.webViewAdPlayer.sendVisibilityChange(z10, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d10, rj.c<? super r> cVar) {
        return this.webViewAdPlayer.sendVolumeChange(d10, cVar);
    }

    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final k<DisplayMessage> getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {209, 210, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 212, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE}, m = "invokeSuspend")
    public static final class C38241 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ DisplayMessage $displayMessage;
        public int label;
        public final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38241(DisplayMessage displayMessage, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, rj.c<? super C38241> cVar) {
            super(2, cVar);
            this.$displayMessage = displayMessage;
            this.this$0 = androidFullscreenWebViewAdPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return new C38241(this.$displayMessage, this.this$0, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((C38241) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            switch (this.label) {
                case 0:
                    kotlin.c.b(obj);
                    DisplayMessage displayMessage = this.$displayMessage;
                    if (displayMessage instanceof DisplayMessage.DisplayReady) {
                        WebViewAdPlayer webViewAdPlayer = this.this$0.webViewAdPlayer;
                        Map<String, Object> showOptions = ((DisplayMessage.DisplayReady) this.$displayMessage).getShowOptions();
                        this.label = 1;
                        if (webViewAdPlayer.requestShow(showOptions, this) == objF) {
                            return objF;
                        }
                    } else if (displayMessage instanceof DisplayMessage.WebViewInstanceRequest) {
                        k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                        DisplayMessage.WebViewInstanceResponse webViewInstanceResponse = new DisplayMessage.WebViewInstanceResponse(this.$displayMessage.getOpportunityId(), this.this$0.getWebViewContainer().getWebView());
                        this.label = 2;
                        if (displayMessages.emit(webViewInstanceResponse, this) == objF) {
                            return objF;
                        }
                    } else if (displayMessage instanceof DisplayMessage.VisibilityChanged) {
                        WebViewAdPlayer webViewAdPlayer2 = this.this$0.webViewAdPlayer;
                        boolean zIsVisible = ((DisplayMessage.VisibilityChanged) this.$displayMessage).isVisible();
                        this.label = 3;
                        if (webViewAdPlayer2.sendVisibilityChange(zIsVisible, this) == objF) {
                            return objF;
                        }
                    } else if (displayMessage instanceof DisplayMessage.FocusChanged) {
                        WebViewAdPlayer webViewAdPlayer3 = this.this$0.webViewAdPlayer;
                        boolean zIsFocused = ((DisplayMessage.FocusChanged) this.$displayMessage).isFocused();
                        this.label = 4;
                        if (webViewAdPlayer3.sendFocusChange(zIsFocused, this) == objF) {
                            return objF;
                        }
                    } else if (displayMessage instanceof DisplayMessage.DisplayDestroyed) {
                        WebViewAdPlayer webViewAdPlayer4 = this.this$0.webViewAdPlayer;
                        this.label = 5;
                        if (webViewAdPlayer4.sendActivityDestroyed(this) == objF) {
                            return objF;
                        }
                    } else if (displayMessage instanceof DisplayMessage.DisplayError) {
                        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
                        this.label = 6;
                        if (androidFullscreenWebViewAdPlayer.destroy(this) == objF) {
                            return objF;
                        }
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    kotlin.c.b(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class C38251 extends SuspendLambda implements p<qk.d<? super DisplayMessage>, rj.c<? super r>, Object> {
        public final /* synthetic */ u<r> $listenerStarted;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38251(u<r> uVar, rj.c<? super C38251> cVar) {
            super(2, cVar);
            this.$listenerStarted = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return new C38251(this.$listenerStarted, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(qk.d<? super DisplayMessage> dVar, rj.c<? super r> cVar) {
            return ((C38251) create(dVar, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                u<r> uVar = this.$listenerStarted;
                r rVar = r.f64562a;
                uVar.i(rVar);
                return rVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {101}, m = "invokeSuspend")
    public static final class AnonymousClass6 extends SuspendLambda implements p<ShowEvent, rj.c<? super r>, Object> {
        public int label;

        public AnonymousClass6(rj.c<? super AnonymousClass6> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return AndroidFullscreenWebViewAdPlayer.this.new AnonymousClass6(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(ShowEvent showEvent, rj.c<? super r> cVar) {
            return ((AnonymousClass6) create(showEvent, cVar)).invokeSuspend(r.f64562a);
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
                AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = AndroidFullscreenWebViewAdPlayer.this;
                this.label = 1;
                if (androidFullscreenWebViewAdPlayer.destroy(this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {129}, m = "invokeSuspend")
    public static final class AnonymousClass9 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ Intent $intent;
        public final /* synthetic */ u<r> $listenerStarted;
        public int label;
        public final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(u<r> uVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Intent intent, rj.c<? super AnonymousClass9> cVar) {
            super(2, cVar);
            this.$listenerStarted = uVar;
            this.this$0 = androidFullscreenWebViewAdPlayer;
            this.$intent = intent;
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p11, "com.unity3d.ads");
            p10.startActivity(p11);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return new AnonymousClass9(this.$listenerStarted, this.this$0, this.$intent, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((AnonymousClass9) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                u<r> uVar = this.$listenerStarted;
                this.label = 1;
                if (uVar.y(this) == objF) {
                    return objF;
                }
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.this$0.context, this.$intent);
            return r.f64562a;
        }
    }

    private final AdObject getAdObject() {
        return (AdObject) this.adObject$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSessionChange(SessionChange sessionChange, rj.c<? super r> cVar) throws Throwable {
        if (sessionChange instanceof SessionChange.UserConsentChange) {
            WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            ck.p.i(byteArray, "change.value.toByteArray()");
            Object objSendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, cVar);
            return objSendUserConsentChange == sj.a.f() ? objSendUserConsentChange : r.f64562a;
        }
        if (!(sessionChange instanceof SessionChange.PrivacyFsmChange)) {
            return r.f64562a;
        }
        WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
        byte[] byteArray2 = ((SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
        ck.p.i(byteArray2, "change.value.toByteArray()");
        Object objSendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, cVar);
        return objSendPrivacyFsmChange == sj.a.f() ? objSendPrivacyFsmChange : r.f64562a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, rj.c<? super r> cVar) throws Throwable {
        if (volumeSettingsChange instanceof VolumeSettingsChange.MuteChange) {
            Object objSendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), cVar);
            return objSendMuteChange == sj.a.f() ? objSendMuteChange : r.f64562a;
        }
        if (!(volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange)) {
            return r.f64562a;
        }
        Object objSendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), cVar);
        return objSendVolumeChange == sj.a.f() ? objSendVolumeChange : r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object destroy(rj.c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer;
        AndroidWebViewContainer webViewContainer;
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
        Object obj = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                androidFullscreenWebViewAdPlayer = (AndroidFullscreenWebViewAdPlayer) anonymousClass1.L$0;
                kotlin.c.b(obj);
            } else if (i11 == 2) {
                androidFullscreenWebViewAdPlayer = (AndroidFullscreenWebViewAdPlayer) anonymousClass1.L$0;
                kotlin.c.b(obj);
                webViewContainer = androidFullscreenWebViewAdPlayer.getWebViewContainer();
                anonymousClass1.L$0 = androidFullscreenWebViewAdPlayer;
                anonymousClass1.label = 3;
                if (webViewContainer.destroy(anonymousClass1) == objF) {
                    return objF;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 4;
                if (AdPlayer.DefaultImpls.destroy(androidFullscreenWebViewAdPlayer, anonymousClass1) == objF) {
                    return objF;
                }
            } else if (i11 == 3) {
                androidFullscreenWebViewAdPlayer = (AndroidFullscreenWebViewAdPlayer) anonymousClass1.L$0;
                kotlin.c.b(obj);
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 4;
                if (AdPlayer.DefaultImpls.destroy(androidFullscreenWebViewAdPlayer, anonymousClass1) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
        kotlin.c.b(obj);
        if (this.wasDestroyed.getAndSet(true)) {
            return r.f64562a;
        }
        this.webViewAdPlayer.dispatchShowCompleted();
        k<DisplayMessage> kVar = displayMessages;
        DisplayMessage.DisplayFinishRequest displayFinishRequest = new DisplayMessage.DisplayFinishRequest(this.opportunityId);
        anonymousClass1.L$0 = this;
        anonymousClass1.label = 1;
        if (kVar.emit(displayFinishRequest, anonymousClass1) == objF) {
            return objF;
        }
        androidFullscreenWebViewAdPlayer = this;
        if (androidFullscreenWebViewAdPlayer.openMeasurementRepository.hasSessionFinished(ByteStringsKt.toByteStringUtf8(androidFullscreenWebViewAdPlayer.opportunityId))) {
            anonymousClass1.L$0 = androidFullscreenWebViewAdPlayer;
            anonymousClass1.label = 2;
            if (s0.a(1000L, anonymousClass1) == objF) {
                return objF;
            }
        }
        webViewContainer = androidFullscreenWebViewAdPlayer.getWebViewContainer();
        anonymousClass1.L$0 = androidFullscreenWebViewAdPlayer;
        anonymousClass1.label = 3;
        if (webViewContainer.destroy(anonymousClass1) == objF) {
            return objF;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 4;
        if (AdPlayer.DefaultImpls.destroy(androidFullscreenWebViewAdPlayer, anonymousClass1) == objF) {
            return objF;
        }
        return r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        ck.p.j(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        boolean zIsScarAd = androidShowOptions.isScarAd();
        boolean zIsOfferwallAd = androidShowOptions.isOfferwallAd();
        u uVarC = w.c(null, 1, null);
        final qk.p pVarC = qk.e.C(displayMessages, new C38251(uVarC, null));
        qk.e.x(qk.e.A(new qk.c<DisplayMessage>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;
                public final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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

                public AnonymousClass2(qk.d dVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                    this.$this_unsafeFlow = dVar;
                    this.this$0 = androidFullscreenWebViewAdPlayer;
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
                        qk.d dVar = this.$this_unsafeFlow;
                        if (ck.p.e(((DisplayMessage) obj).getOpportunityId(), this.this$0.opportunityId)) {
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
            public Object collect(qk.d<? super DisplayMessage> dVar, rj.c cVar) {
                Object objCollect = pVarC.collect(new AnonymousClass2(dVar, this), cVar);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        }, new AnonymousClass3(this)), getScope());
        qk.e.x(qk.e.A(this.deviceInfoRepository.getVolumeSettingsChange(), new AnonymousClass4(this)), getScope());
        final qk.c<ShowEvent> onShowEvent = this.webViewAdPlayer.getOnShowEvent();
        qk.e.x(qk.e.A(new qk.c<ShowEvent>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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

                public AnonymousClass2(qk.d dVar) {
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
                        qk.d dVar = this.$this_unsafeFlow;
                        ShowEvent showEvent = (ShowEvent) obj;
                        if ((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) {
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
            public Object collect(qk.d<? super ShowEvent> dVar, rj.c cVar) {
                Object objCollect = onShowEvent.collect(new AnonymousClass2(dVar), cVar);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        }, new AnonymousClass6(null)), getScope());
        qk.e.x(qk.e.A(this.sessionRepository.getOnChange(), new AnonymousClass7(this)), getScope());
        t1.j(getScope().getCoroutineContext()).F(new bk.l<Throwable, r>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.8
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                invoke2(th2);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8$1, reason: invalid class name */
            /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
            @d(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {111}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
                public int label;
                public final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, rj.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.this$0 = androidFullscreenWebViewAdPlayer;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final rj.c<r> create(Object obj, rj.c<?> cVar) {
                    return new AnonymousClass1(this.this$0, cVar);
                }

                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
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
                        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
                        this.label = 1;
                        if (androidFullscreenWebViewAdPlayer.destroy(this) == objF) {
                            return objF;
                        }
                    }
                    return r.f64562a;
                }
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                if (th2 != null) {
                    j.d(kotlinx.coroutines.d.a(AndroidFullscreenWebViewAdPlayer.this.getScope().getCoroutineContext().plus(h.f63171b)), null, null, new AnonymousClass1(AndroidFullscreenWebViewAdPlayer.this, null), 3, null);
                }
            }
        });
        if (zIsScarAd || zIsOfferwallAd) {
            if (!zIsScarAd) {
                j.d(getScope(), null, null, new AnonymousClass11(uVarC, this, showOptions, null), 3, null);
                return;
            }
            ScarManager scarManager = this.scarManager;
            String placementId = androidShowOptions.getPlacementId();
            if (placementId == null) {
                placementId = "";
            }
            String scarQueryId = androidShowOptions.getScarQueryId();
            j.d(getScope(), null, null, new AnonymousClass10(uVarC, this, qk.e.E(scarManager.show(placementId, scarQueryId != null ? scarQueryId : ""), getScope(), kotlinx.coroutines.flow.a.f63151a.a(), 10), showOptions, null), 3, null);
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen", null, null, null, getAdObject(), null, 46, null);
        Intent intent = new Intent(this.context, (Class<?>) FullScreenWebViewDisplay.class);
        intent.putExtra("opportunityId", this.opportunityId);
        Map<String, Object> unityAdsShowOptions = androidShowOptions.getUnityAdsShowOptions();
        if (unityAdsShowOptions != null) {
            intent.putExtra("showOptions", new JSONObject(unityAdsShowOptions).toString());
        }
        intent.addFlags(268500992);
        intent.putExtra("orientation", this.orientationRepository.getResumedActivityOrientation().getValue().intValue());
        j.d(getScope(), null, null, new AnonymousClass9(uVarC, this, intent, null), 3, null);
    }

    public AndroidFullscreenWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String str, AndroidWebViewContainer androidWebViewContainer, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, OfferwallManager offerwallManager, SendDiagnosticEvent sendDiagnosticEvent, AdRepository adRepository, OrientationRepository orientationRepository, Context context) {
        ck.p.j(webViewAdPlayer, "webViewAdPlayer");
        ck.p.j(str, "opportunityId");
        ck.p.j(androidWebViewContainer, "webViewContainer");
        ck.p.j(deviceInfoRepository, "deviceInfoRepository");
        ck.p.j(sessionRepository, "sessionRepository");
        ck.p.j(openMeasurementRepository, "openMeasurementRepository");
        ck.p.j(scarManager, "scarManager");
        ck.p.j(offerwallManager, "offerwallManager");
        ck.p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        ck.p.j(adRepository, "adRepository");
        ck.p.j(orientationRepository, "orientationRepository");
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = str;
        this.webViewContainer = androidWebViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.adRepository = adRepository;
        this.orientationRepository = orientationRepository;
        this.context = context;
        this.adObject$delegate = kotlin.b.a(new bk.a<AdObject>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$adObject$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final AdObject invoke() {
                Object objM3458constructorimpl;
                AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
                try {
                    Result.a aVar = Result.Companion;
                    AdRepository adRepository2 = androidFullscreenWebViewAdPlayer.adRepository;
                    UUID uuidFromString = UUID.fromString(androidFullscreenWebViewAdPlayer.opportunityId);
                    ck.p.i(uuidFromString, "fromString(opportunityId)");
                    objM3458constructorimpl = Result.m3458constructorimpl(adRepository2.getAd(ProtobufExtensionsKt.toByteString(uuidFromString)));
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
                }
                if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                    objM3458constructorimpl = null;
                }
                return (AdObject) objM3458constructorimpl;
            }
        });
        this.wasDestroyed = new AtomicBoolean(false);
    }

    private final kotlinx.coroutines.g displayEventsRouter(DisplayMessage displayMessage) {
        return j.d(getScope(), null, null, new C38241(displayMessage, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, rj.c cVar) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return r.f64562a;
    }
}
