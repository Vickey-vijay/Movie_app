package com.unity3d.ads.adplayer;

import android.util.Base64;
import androidx.annotation.CallSuper;
import bk.p;
import com.google.protobuf.ByteString;
import com.ironsource.C3426d4;
import com.ironsource.C3605n2;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent;
import com.unity3d.ads.adplayer.model.OnAllowedPiiChangeEvent;
import com.unity3d.ads.adplayer.model.OnBroadcastEvent;
import com.unity3d.ads.adplayer.model.OnFocusChangeEvent;
import com.unity3d.ads.adplayer.model.OnGmaEvent;
import com.unity3d.ads.adplayer.model.OnMuteChangeEvent;
import com.unity3d.ads.adplayer.model.OnOfferwallEvent;
import com.unity3d.ads.adplayer.model.OnPrivacyFsmChangeEvent;
import com.unity3d.ads.adplayer.model.OnScarBannerEvent;
import com.unity3d.ads.adplayer.model.OnStorageEvent;
import com.unity3d.ads.adplayer.model.OnUserConsentChangeEvent;
import com.unity3d.ads.adplayer.model.OnVisibilityChangeEvent;
import com.unity3d.ads.adplayer.model.OnVolumeChangeEvent;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEventInfo;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mj.h;
import mj.r;
import nj.n;
import nk.h0;
import nk.j;
import nk.k0;
import nk.l0;
import nk.t1;
import org.json.JSONException;
import org.json.JSONObject;
import qk.e;
import qk.k;
import qk.l;
import qk.v;
import tj.d;

/* JADX INFO: compiled from: WebViewAdPlayer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WebViewAdPlayer implements AdPlayer {
    private final WebViewBridge bridge;
    private final DeviceInfoRepository deviceInfoRepository;
    private final h0 dispatcher;
    private final l<Boolean> isCompletedManually;
    private final qk.c<String> onBroadcastEvents;
    private final qk.c<LoadEvent> onLoadEvent;
    private final qk.c<OfferwallShowEvent.Show> onOfferwallEvent;
    private final qk.c<ScarEvent.Show> onScarEvent;
    private final qk.c<ShowEvent> onShowEvent;
    private final l0 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final bk.l<StorageEventInfo, r> storageEventCallback;
    private final WebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$2, reason: invalid class name */
    /* JADX INFO: compiled from: WebViewAdPlayer.kt */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements p<String, rj.c<? super r>, Object> {
        public AnonymousClass2(Object obj) {
            super(2, obj, k.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(String str, rj.c<? super r> cVar) {
            return ((k) this.receiver).emit(str, cVar);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$3, reason: invalid class name */
    /* JADX INFO: compiled from: WebViewAdPlayer.kt */
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements p<String, rj.c<? super r>, Object> {
        public AnonymousClass3(Object obj) {
            super(2, obj, WebViewAdPlayer.class, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(String str, rj.c<? super r> cVar) {
            return ((WebViewAdPlayer) this.receiver).onBroadcastEvent(str, cVar);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: WebViewAdPlayer.kt */
    @d(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", l = {201, 202, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "requestShow")
    public static final class C38441 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C38441(rj.c<? super C38441> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewAdPlayer.this.requestShow(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: WebViewAdPlayer.kt */
    @d(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", l = {229, 243}, m = "sendEvent")
    public static final class C38461 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C38461(rj.c<? super C38461> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewAdPlayer.this.sendEvent(null, this);
        }
    }

    public WebViewAdPlayer(WebViewBridge webViewBridge, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, h0 h0Var, SendDiagnosticEvent sendDiagnosticEvent, WebViewContainer webViewContainer, l0 l0Var) {
        ck.p.j(webViewBridge, "bridge");
        ck.p.j(deviceInfoRepository, "deviceInfoRepository");
        ck.p.j(sessionRepository, "sessionRepository");
        ck.p.j(h0Var, "dispatcher");
        ck.p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        ck.p.j(webViewContainer, "webViewContainer");
        ck.p.j(l0Var, "adPlayerScope");
        this.bridge = webViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.dispatcher = h0Var;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.webViewContainer = webViewContainer;
        l<Boolean> lVarA = v.a(Boolean.FALSE);
        this.isCompletedManually = lVarA;
        bk.l<StorageEventInfo, r> lVar = new bk.l<StorageEventInfo, r>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(StorageEventInfo storageEventInfo) {
                invoke2(storageEventInfo);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: WebViewAdPlayer.kt */
            @d(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1", f = "WebViewAdPlayer.kt", l = {90}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
                public final /* synthetic */ StorageEventInfo $it;
                public int label;
                public final /* synthetic */ WebViewAdPlayer this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(WebViewAdPlayer webViewAdPlayer, StorageEventInfo storageEventInfo, rj.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.this$0 = webViewAdPlayer;
                    this.$it = storageEventInfo;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final rj.c<r> create(Object obj, rj.c<?> cVar) {
                    return new AnonymousClass1(this.this$0, this.$it, cVar);
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
                        WebViewBridge webViewBridge = this.this$0.bridge;
                        OnStorageEvent onStorageEvent = new OnStorageEvent(this.$it.getEventType(), this.$it.getStorageType(), this.$it.getValue());
                        this.label = 1;
                        if (webViewBridge.sendEvent(onStorageEvent, this) == objF) {
                            return objF;
                        }
                    }
                    return r.f64562a;
                }
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(StorageEventInfo storageEventInfo) {
                ck.p.j(storageEventInfo, "it");
                j.d(this.this$0.getScope(), null, null, new AnonymousClass1(this.this$0, storageEventInfo, null), 3, null);
            }
        };
        this.storageEventCallback = lVar;
        this.scope = kotlinx.coroutines.d.h(kotlinx.coroutines.d.h(l0Var, h0Var), new k0("WebViewAdPlayer"));
        final qk.p<Invocation> onInvocation = webViewBridge.getOnInvocation();
        final qk.c<Invocation> cVar = new qk.c<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        if (n.D(new String[]{ExposedFunctionLocation.SHOW_SCAR_AD}, ((Invocation) obj).getLocation())) {
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
            public Object collect(qk.d<? super Invocation> dVar, rj.c cVar2) {
                Object objCollect = onInvocation.collect(new AnonymousClass2(dVar), cVar2);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        };
        this.onScarEvent = new qk.c<ScarEvent.Show>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2", f = "WebViewAdPlayer.kt", l = {224, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                    qk.d dVar;
                    Invocation invocation;
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
                    if (i11 != 0) {
                        if (i11 == 1) {
                            invocation = (Invocation) anonymousClass1.L$1;
                            dVar = (qk.d) anonymousClass1.L$0;
                            kotlin.c.b(obj2);
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.c.b(obj2);
                        }
                        return r.f64562a;
                    }
                    kotlin.c.b(obj2);
                    dVar = this.$this_unsafeFlow;
                    invocation = (Invocation) obj;
                    anonymousClass1.L$0 = dVar;
                    anonymousClass1.L$1 = invocation;
                    anonymousClass1.label = 1;
                    if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == objF) {
                        return objF;
                    }
                    if (!ck.p.e(invocation.getLocation(), ExposedFunctionLocation.SHOW_SCAR_AD)) {
                        throw new IllegalStateException(("Unexpected location: " + invocation.getLocation()).toString());
                    }
                    ScarEvent.Show show = ScarEvent.Show.INSTANCE;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (dVar.emit(show, anonymousClass1) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
            }

            @Override // qk.c
            public Object collect(qk.d<? super ScarEvent.Show> dVar, rj.c cVar2) {
                Object objCollect = cVar.collect(new AnonymousClass2(dVar), cVar2);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        };
        final qk.p<Invocation> onInvocation2 = webViewBridge.getOnInvocation();
        final qk.c<Invocation> cVar2 = new qk.c<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        if (n.D(new String[]{ExposedFunctionLocation.SHOW_OFFERWALL_AD}, ((Invocation) obj).getLocation())) {
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
            public Object collect(qk.d<? super Invocation> dVar, rj.c cVar3) {
                Object objCollect = onInvocation2.collect(new AnonymousClass2(dVar), cVar3);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        };
        this.onOfferwallEvent = new qk.c<OfferwallShowEvent.Show>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2", f = "WebViewAdPlayer.kt", l = {224, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                    qk.d dVar;
                    Invocation invocation;
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
                    if (i11 != 0) {
                        if (i11 == 1) {
                            invocation = (Invocation) anonymousClass1.L$1;
                            dVar = (qk.d) anonymousClass1.L$0;
                            kotlin.c.b(obj2);
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.c.b(obj2);
                        }
                        return r.f64562a;
                    }
                    kotlin.c.b(obj2);
                    dVar = this.$this_unsafeFlow;
                    invocation = (Invocation) obj;
                    anonymousClass1.L$0 = dVar;
                    anonymousClass1.L$1 = invocation;
                    anonymousClass1.label = 1;
                    if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == objF) {
                        return objF;
                    }
                    if (!ck.p.e(invocation.getLocation(), ExposedFunctionLocation.SHOW_OFFERWALL_AD)) {
                        throw new IllegalStateException(("Unexpected location: " + invocation.getLocation()).toString());
                    }
                    OfferwallShowEvent.Show show = OfferwallShowEvent.Show.INSTANCE;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (dVar.emit(show, anonymousClass1) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
            }

            @Override // qk.c
            public Object collect(qk.d<? super OfferwallShowEvent.Show> dVar, rj.c cVar3) {
                Object objCollect = cVar2.collect(new AnonymousClass2(dVar), cVar3);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        };
        final qk.p<Invocation> onInvocation3 = webViewBridge.getOnInvocation();
        final qk.c<Invocation> cVar3 = new qk.c<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        if (n.D(WebViewAdPlayerKt.SHOW_EVENTS, ((Invocation) obj).getLocation())) {
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
            public Object collect(qk.d<? super Invocation> dVar, rj.c cVar4) {
                Object objCollect = onInvocation3.collect(new AnonymousClass2(dVar), cVar4);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        };
        this.onShowEvent = e.u(new qk.c<ShowEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2", f = "WebViewAdPlayer.kt", l = {244, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:51:0x00fd A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // qk.d
                public final Object emit(Object obj, rj.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    qk.d dVar;
                    ShowEvent completed;
                    ShowEvent showEvent;
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
                    if (i11 != 0) {
                        if (i11 == 1) {
                            showEvent = (ShowEvent) anonymousClass1.L$1;
                            dVar = (qk.d) anonymousClass1.L$0;
                            kotlin.c.b(obj2);
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.c.b(obj2);
                        }
                        return r.f64562a;
                    }
                    kotlin.c.b(obj2);
                    dVar = this.$this_unsafeFlow;
                    Invocation invocation = (Invocation) obj;
                    String location = invocation.getLocation();
                    switch (location) {
                        case "com.unity3d.services.ads.api.AdViewer.cancelShowTimeout":
                            completed = ShowEvent.CancelTimeout.INSTANCE;
                            anonymousClass1.L$0 = dVar;
                            anonymousClass1.L$1 = completed;
                            anonymousClass1.label = 1;
                            if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == objF) {
                                return objF;
                            }
                            showEvent = completed;
                            break;
                        case "com.unity3d.services.ads.api.AdViewer.completed":
                            Object objK = n.K(invocation.getParameters());
                            String str = objK instanceof String ? (String) objK : null;
                            completed = new ShowEvent.Completed(ck.p.e(str, "COMPLETED") ? ShowStatus.COMPLETED : ck.p.e(str, "SKIPPED") ? ShowStatus.SKIPPED : ShowStatus.ERROR, null, null, 6, null);
                            anonymousClass1.L$0 = dVar;
                            anonymousClass1.L$1 = completed;
                            anonymousClass1.label = 1;
                            if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == objF) {
                                return objF;
                            }
                            showEvent = completed;
                            break;
                        case "com.unity3d.services.ads.api.AdViewer.leftApplication":
                            completed = ShowEvent.LeftApplication.INSTANCE;
                            anonymousClass1.L$0 = dVar;
                            anonymousClass1.L$1 = completed;
                            anonymousClass1.label = 1;
                            if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == objF) {
                                return objF;
                            }
                            showEvent = completed;
                            break;
                        case "com.unity3d.services.ads.api.AdViewer.clicked":
                            completed = ShowEvent.Clicked.INSTANCE;
                            anonymousClass1.L$0 = dVar;
                            anonymousClass1.L$1 = completed;
                            anonymousClass1.label = 1;
                            if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == objF) {
                                return objF;
                            }
                            showEvent = completed;
                            break;
                        case "com.unity3d.services.ads.api.AdViewer.started":
                            completed = ShowEvent.Started.INSTANCE;
                            anonymousClass1.L$0 = dVar;
                            anonymousClass1.L$1 = completed;
                            anonymousClass1.label = 1;
                            if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == objF) {
                                return objF;
                            }
                            showEvent = completed;
                            break;
                        case "com.unity3d.services.ads.api.AdViewer.failed":
                            Object objK2 = n.K(invocation.getParameters());
                            ck.p.h(objK2, "null cannot be cast to non-null type org.json.JSONObject");
                            JSONObject jSONObject = (JSONObject) objK2;
                            int iOptInt = jSONObject.optInt("code");
                            String strOptString = jSONObject.optString("message");
                            ck.p.i(strOptString, "errorMessage");
                            completed = new ShowEvent.Error(strOptString, iOptInt, "adviewer");
                            anonymousClass1.L$0 = dVar;
                            anonymousClass1.L$1 = completed;
                            anonymousClass1.label = 1;
                            if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == objF) {
                                return objF;
                            }
                            showEvent = completed;
                            break;
                        default:
                            if (location.equals(ExposedFunctionLocation.CANCEL_SHOW_TIMEOUT)) {
                                completed = ShowEvent.CancelTimeout.INSTANCE;
                                anonymousClass1.L$0 = dVar;
                                anonymousClass1.L$1 = completed;
                                anonymousClass1.label = 1;
                                if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == objF) {
                                    return objF;
                                }
                                showEvent = completed;
                                break;
                            }
                            throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (dVar.emit(showEvent, anonymousClass1) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
            }

            @Override // qk.c
            public Object collect(qk.d<? super ShowEvent> dVar, rj.c cVar4) {
                Object objCollect = cVar3.collect(new AnonymousClass2(dVar), cVar4);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        }, lVarA, new WebViewAdPlayer$onShowEvent$3(null));
        final qk.p<Invocation> onInvocation4 = webViewBridge.getOnInvocation();
        final qk.c<Invocation> cVar4 = new qk.c<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        if (n.D(WebViewAdPlayerKt.LOAD_EVENTS, ((Invocation) obj).getLocation())) {
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
            public Object collect(qk.d<? super Invocation> dVar, rj.c cVar5) {
                Object objCollect = onInvocation4.collect(new AnonymousClass2(dVar), cVar5);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        };
        this.onLoadEvent = e.H(e.E(new qk.c<LoadEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2", f = "WebViewAdPlayer.kt", l = {224, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                    qk.d dVar;
                    Invocation invocation;
                    LoadEvent error;
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
                    if (i11 != 0) {
                        if (i11 == 1) {
                            invocation = (Invocation) anonymousClass1.L$1;
                            dVar = (qk.d) anonymousClass1.L$0;
                            kotlin.c.b(obj2);
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.c.b(obj2);
                        }
                        return r.f64562a;
                    }
                    kotlin.c.b(obj2);
                    dVar = this.$this_unsafeFlow;
                    invocation = (Invocation) obj;
                    anonymousClass1.L$0 = dVar;
                    anonymousClass1.L$1 = invocation;
                    anonymousClass1.label = 1;
                    if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == objF) {
                        return objF;
                    }
                    if (ck.p.e(invocation.getLocation(), ExposedFunctionLocation.LOAD_ERROR)) {
                        Object objK = n.K(invocation.getParameters());
                        ck.p.h(objK, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject = (JSONObject) objK;
                        int iOptInt = jSONObject.optInt("code");
                        String strOptString = jSONObject.optString("message");
                        ck.p.i(strOptString, "errorMessage");
                        error = new LoadEvent.Error(strOptString, iOptInt);
                    } else {
                        error = LoadEvent.Completed.INSTANCE;
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (dVar.emit(error, anonymousClass1) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
            }

            @Override // qk.c
            public Object collect(qk.d<? super LoadEvent> dVar, rj.c cVar5) {
                Object objCollect = cVar4.collect(new AnonymousClass2(dVar), cVar5);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        }, getScope(), kotlinx.coroutines.flow.a.f63151a.a(), 1), 1);
        final qk.p<Invocation> onInvocation5 = webViewBridge.getOnInvocation();
        final qk.c<Invocation> cVar5 = new qk.c<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        if (ck.p.e(((Invocation) obj).getLocation(), ExposedFunctionLocation.BROADCAST_EVENT)) {
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
            public Object collect(qk.d<? super Invocation> dVar, rj.c cVar6) {
                Object objCollect = onInvocation5.collect(new AnonymousClass2(dVar), cVar6);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        };
        qk.c<String> cVar6 = new qk.c<String>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2", f = "WebViewAdPlayer.kt", l = {224, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                    qk.d dVar;
                    Invocation invocation;
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
                    if (i11 != 0) {
                        if (i11 == 1) {
                            invocation = (Invocation) anonymousClass1.L$1;
                            dVar = (qk.d) anonymousClass1.L$0;
                            kotlin.c.b(obj2);
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.c.b(obj2);
                        }
                        return r.f64562a;
                    }
                    kotlin.c.b(obj2);
                    dVar = this.$this_unsafeFlow;
                    invocation = (Invocation) obj;
                    anonymousClass1.L$0 = dVar;
                    anonymousClass1.L$1 = invocation;
                    anonymousClass1.label = 1;
                    if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == objF) {
                        return objF;
                    }
                    String string = n.K(invocation.getParameters()).toString();
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (dVar.emit(string, anonymousClass1) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
            }

            @Override // qk.c
            public Object collect(qk.d<? super String> dVar, rj.c cVar7) {
                Object objCollect = cVar5.collect(new AnonymousClass2(dVar), cVar7);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        };
        this.onBroadcastEvents = cVar6;
        Storage.Companion.addStorageEventCallback(lVar);
        t1.j(l0Var.getCoroutineContext()).F(new bk.l<Throwable, r>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                invoke2(th2);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                Storage.Companion.removeStorageEventCallback(WebViewAdPlayer.this.storageEventCallback);
            }
        });
        AdPlayer.Companion companion = AdPlayer.Companion;
        e.x(e.A(cVar6, new AnonymousClass2(companion.getBroadcastEventChannel())), getScope());
        e.x(e.A(companion.getBroadcastEventChannel(), new AnonymousClass3(this)), getScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object sendEvent(bk.a<? extends WebViewEvent> aVar, rj.c<? super r> cVar) throws Throwable {
        C38461 c38461;
        bk.a<? extends WebViewEvent> aVar2;
        WebViewAdPlayer webViewAdPlayer;
        if (cVar instanceof C38461) {
            c38461 = (C38461) cVar;
            int i10 = c38461.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c38461.label = i10 - Integer.MIN_VALUE;
            } else {
                c38461 = new C38461(cVar);
            }
        } else {
            c38461 = new C38461(cVar);
        }
        Object objF = c38461.result;
        Object objF2 = sj.a.f();
        int i11 = c38461.label;
        if (i11 != 0) {
            if (i11 == 1) {
                aVar2 = (bk.a) c38461.L$1;
                webViewAdPlayer = (WebViewAdPlayer) c38461.L$0;
                kotlin.c.b(objF);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objF);
            }
            return r.f64562a;
        }
        kotlin.c.b(objF);
        qk.c<LoadEvent> onLoadEvent = getOnLoadEvent();
        c38461.L$0 = this;
        aVar2 = aVar;
        c38461.L$1 = aVar2;
        c38461.label = 1;
        objF = e.F(onLoadEvent, c38461);
        if (objF == objF2) {
            return objF2;
        }
        webViewAdPlayer = this;
        LoadEvent loadEvent = (LoadEvent) objF;
        if (loadEvent instanceof LoadEvent.Error) {
            LoadEvent.Error error = (LoadEvent.Error) loadEvent;
            SendDiagnosticEvent.DefaultImpls.invoke$default(webViewAdPlayer.sendDiagnosticEvent, "bridge_send_event_failed", null, kotlin.collections.a.m(h.a("reason", "adviewer"), h.a("reason_debug", error.getMessage()), h.a("reason_code", String.valueOf(error.getErrorCode()))), null, null, null, 58, null);
            return r.f64562a;
        }
        WebViewEvent webViewEventInvoke = aVar2.invoke();
        WebViewBridge webViewBridge = webViewAdPlayer.bridge;
        c38461.L$0 = null;
        c38461.L$1 = null;
        c38461.label = 2;
        if (webViewBridge.sendEvent(webViewEventInvoke, c38461) == objF2) {
            return objF2;
        }
        return r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.isCompletedManually.setValue(Boolean.TRUE);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public qk.c<LoadEvent> getOnLoadEvent() {
        return this.onLoadEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public qk.c<OfferwallShowEvent.Show> getOnOfferwallEvent() {
        return this.onOfferwallEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public qk.c<ScarEvent.Show> getOnScarEvent() {
        return this.onScarEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public qk.c<ShowEvent> getOnShowEvent() {
        return this.onShowEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public l0 getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(final byte[] bArr, rj.c<? super r> cVar) throws Throwable {
        Object objSendEvent = sendEvent(new bk.a<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.onAllowedPiiChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final WebViewEvent invoke() {
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                ck.p.i(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
                return new OnAllowedPiiChangeEvent(strEncodeToString);
            }
        }, cVar);
        return objSendEvent == sj.a.f() ? objSendEvent : r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(final String str, rj.c<? super r> cVar) throws Throwable {
        Object objSendEvent = sendEvent(new bk.a<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.onBroadcastEvent.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final WebViewEvent invoke() throws JSONException {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("eventType");
                String strOptString = jSONObject.optString("data");
                ck.p.i(string, "eventType");
                return new OnBroadcastEvent(string, strOptString);
            }
        }, cVar);
        return objSendEvent == sj.a.f() ? objSendEvent : r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0129  */
    /* JADX WARN: Code duplicated, block: B:35:0x013c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0162  */
    /* JADX WARN: Code duplicated, block: B:43:0x018b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, rj.c<? super r> cVar) throws Throwable {
        C38441 c38441;
        JSONObject jSONObject;
        WebViewAdPlayer webViewAdPlayer;
        Map<String, ? extends Object> map2;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String str;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        Map<String, ? extends Object> map3;
        WebViewAdPlayer webViewAdPlayer2;
        String str2;
        JSONObject jSONObject6;
        WebViewBridge webViewBridge;
        Object[] objArr;
        LinkedHashMap linkedHashMap;
        if (cVar instanceof C38441) {
            c38441 = (C38441) cVar;
            int i10 = c38441.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c38441.label = i10 - Integer.MIN_VALUE;
            } else {
                c38441 = new C38441(cVar);
            }
        } else {
            c38441 = new C38441(cVar);
        }
        Object privacyFsm = c38441.result;
        Object objF = sj.a.f();
        int i11 = c38441.label;
        if (i11 != 0) {
            if (i11 == 1) {
                jSONObject2 = (JSONObject) c38441.L$5;
                String str3 = (String) c38441.L$4;
                JSONObject jSONObject7 = (JSONObject) c38441.L$3;
                jSONObject3 = (JSONObject) c38441.L$2;
                map2 = (Map) c38441.L$1;
                webViewAdPlayer = (WebViewAdPlayer) c38441.L$0;
                kotlin.c.b(privacyFsm);
                str = str3;
                jSONObject = jSONObject7;
            } else if (i11 == 2) {
                jSONObject6 = (JSONObject) c38441.L$5;
                str2 = (String) c38441.L$4;
                jSONObject4 = (JSONObject) c38441.L$3;
                jSONObject5 = (JSONObject) c38441.L$2;
                map3 = (Map) c38441.L$1;
                webViewAdPlayer2 = (WebViewAdPlayer) c38441.L$0;
                kotlin.c.b(privacyFsm);
                jSONObject6.put(str2, ProtobufExtensionsKt.toBase64$default((ByteString) privacyFsm, false, 1, null));
                ByteString byteString = webViewAdPlayer2.deviceInfoRepository.getAllowedPii().getValue().toByteString();
                ck.p.i(byteString, "deviceInfoRepository.all…dPii.value.toByteString()");
                jSONObject4.put("allowedPii", ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null));
                if (map3 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, ? extends Object> entry : map3.entrySet()) {
                        if (!ck.p.e(entry.getKey(), "objectId")) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        jSONObject4.put("showOptions", new JSONObject(linkedHashMap));
                    }
                }
                webViewBridge = webViewAdPlayer2.bridge;
                objArr = new Object[]{jSONObject5};
                c38441.L$0 = null;
                c38441.L$1 = null;
                c38441.L$2 = null;
                c38441.L$3 = null;
                c38441.L$4 = null;
                c38441.L$5 = null;
                c38441.label = 3;
                if (webViewBridge.request(C3426d4.i.K, C3605n2.f30216v, objArr, c38441) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(privacyFsm);
            }
            return r.f64562a;
        }
        kotlin.c.b(privacyFsm);
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.deviceInfoRepository.getDynamicDeviceInfo();
        jSONObject = new JSONObject();
        jSONObject.put("orientation", this.deviceInfoRepository.getOrientation());
        jSONObject.put("connectionType", this.deviceInfoRepository.getConnectionTypeStr());
        jSONObject.put("isMuted", this.deviceInfoRepository.getRingerMode() != 2);
        jSONObject.put("volume", dynamicDeviceInfo.getAndroid().getVolume());
        SessionRepository sessionRepository = this.sessionRepository;
        c38441.L$0 = this;
        c38441.L$1 = map;
        c38441.L$2 = jSONObject;
        c38441.L$3 = jSONObject;
        c38441.L$4 = "privacy";
        c38441.L$5 = jSONObject;
        c38441.label = 1;
        Object privacy = sessionRepository.getPrivacy(c38441);
        if (privacy == objF) {
            return objF;
        }
        webViewAdPlayer = this;
        map2 = map;
        jSONObject2 = jSONObject;
        jSONObject3 = jSONObject2;
        str = "privacy";
        privacyFsm = privacy;
        jSONObject2.put(str, ProtobufExtensionsKt.toBase64$default((ByteString) privacyFsm, false, 1, null));
        SessionRepository sessionRepository2 = webViewAdPlayer.sessionRepository;
        c38441.L$0 = webViewAdPlayer;
        c38441.L$1 = map2;
        c38441.L$2 = jSONObject3;
        c38441.L$3 = jSONObject;
        c38441.L$4 = "privacyFsm";
        c38441.L$5 = jSONObject;
        c38441.label = 2;
        privacyFsm = sessionRepository2.getPrivacyFsm(c38441);
        if (privacyFsm == objF) {
            return objF;
        }
        jSONObject4 = jSONObject;
        jSONObject5 = jSONObject3;
        map3 = map2;
        webViewAdPlayer2 = webViewAdPlayer;
        str2 = "privacyFsm";
        jSONObject6 = jSONObject4;
        jSONObject6.put(str2, ProtobufExtensionsKt.toBase64$default((ByteString) privacyFsm, false, 1, null));
        ByteString byteString2 = webViewAdPlayer2.deviceInfoRepository.getAllowedPii().getValue().toByteString();
        ck.p.i(byteString2, "deviceInfoRepository.all…dPii.value.toByteString()");
        jSONObject4.put("allowedPii", ProtobufExtensionsKt.toBase64$default(byteString2, false, 1, null));
        if (map3 != null) {
            linkedHashMap = new LinkedHashMap();
            while (r15.hasNext()) {
                if (!ck.p.e(entry.getKey(), "objectId")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (!linkedHashMap.isEmpty()) {
                jSONObject4.put("showOptions", new JSONObject(linkedHashMap));
            }
        }
        webViewBridge = webViewAdPlayer2.bridge;
        objArr = new Object[]{jSONObject5};
        c38441.L$0 = null;
        c38441.L$1 = null;
        c38441.L$2 = null;
        c38441.L$3 = null;
        c38441.L$4 = null;
        c38441.L$5 = null;
        c38441.label = 3;
        if (webViewBridge.request(C3426d4.i.K, C3605n2.f30216v, objArr, c38441) == objF) {
            return objF;
        }
        return r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(rj.c<? super r> cVar) throws Throwable {
        Object objSendEvent = sendEvent(new bk.a<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendActivityDestroyed.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final WebViewEvent invoke() {
                return new OnActivityDestroyedEvent();
            }
        }, cVar);
        return objSendEvent == sj.a.f() ? objSendEvent : r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(final boolean z10, rj.c<? super r> cVar) throws Throwable {
        Object objSendEvent = sendEvent(new bk.a<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendFocusChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final WebViewEvent invoke() {
                return new OnFocusChangeEvent(z10);
            }
        }, cVar);
        return objSendEvent == sj.a.f() ? objSendEvent : r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendGmaEvent(final GMAEvent gMAEvent, rj.c<? super r> cVar) throws Throwable {
        Object objSendEvent = sendEvent(new bk.a<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendGmaEvent.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final WebViewEvent invoke() {
                return new OnGmaEvent(gMAEvent);
            }
        }, cVar);
        return objSendEvent == sj.a.f() ? objSendEvent : r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(final boolean z10, rj.c<? super r> cVar) throws Throwable {
        Object objSendEvent = sendEvent(new bk.a<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendMuteChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final WebViewEvent invoke() {
                return new OnMuteChangeEvent(z10);
            }
        }, cVar);
        return objSendEvent == sj.a.f() ? objSendEvent : r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(final OfferwallEvent offerwallEvent, rj.c<? super r> cVar) throws Throwable {
        Object objSendEvent = sendEvent(new bk.a<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendOfferwallEvent.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final WebViewEvent invoke() {
                return new OnOfferwallEvent(offerwallEvent);
            }
        }, cVar);
        return objSendEvent == sj.a.f() ? objSendEvent : r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(final byte[] bArr, rj.c<? super r> cVar) throws Throwable {
        Object objSendEvent = sendEvent(new bk.a<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendPrivacyFsmChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final WebViewEvent invoke() {
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                ck.p.i(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
                return new OnPrivacyFsmChangeEvent(strEncodeToString);
            }
        }, cVar);
        return objSendEvent == sj.a.f() ? objSendEvent : r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendScarBannerEvent(final BannerBridge.BannerEvent bannerEvent, rj.c<? super r> cVar) throws Throwable {
        Object objSendEvent = sendEvent(new bk.a<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendScarBannerEvent.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final WebViewEvent invoke() {
                return new OnScarBannerEvent(bannerEvent);
            }
        }, cVar);
        return objSendEvent == sj.a.f() ? objSendEvent : r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(final byte[] bArr, rj.c<? super r> cVar) throws Throwable {
        Object objSendEvent = sendEvent(new bk.a<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendUserConsentChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final WebViewEvent invoke() {
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                ck.p.i(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
                return new OnUserConsentChangeEvent(strEncodeToString);
            }
        }, cVar);
        return objSendEvent == sj.a.f() ? objSendEvent : r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(final boolean z10, rj.c<? super r> cVar) throws Throwable {
        Object objSendEvent = sendEvent(new bk.a<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendVisibilityChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final WebViewEvent invoke() {
                return new OnVisibilityChangeEvent(z10);
            }
        }, cVar);
        return objSendEvent == sj.a.f() ? objSendEvent : r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(final double d10, rj.c<? super r> cVar) throws Throwable {
        Object objSendEvent = sendEvent(new bk.a<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendVolumeChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final WebViewEvent invoke() {
                return new OnVolumeChangeEvent(d10);
            }
        }, cVar);
        return objSendEvent == sj.a.f() ? objSendEvent : r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @CallSuper
    public Object destroy(rj.c<? super r> cVar) {
        return AdPlayer.DefaultImpls.destroy(this, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        AdPlayer.DefaultImpls.show(this, showOptions);
    }
}
