package com.unity3d.ads.core.domain;

import bk.p;
import bk.q;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidShowOptions;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import org.json.JSONObject;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidShow.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AndroidShow implements Show {
    private final AdRepository adRepository;
    private final GameServerIdReader gameServerIdReader;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidShow.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", l = {57}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<qk.d<? super ShowEvent>, c<? super r>, Object> {
        public final /* synthetic */ AdObject $adObject;
        public final /* synthetic */ UnityAdsShowOptions $showOptions;
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, AndroidShow androidShow, UnityAdsShowOptions unityAdsShowOptions, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, this.this$0, this.$showOptions, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(qk.d<? super ShowEvent> dVar, c<? super r> cVar) {
            return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidShow.kt */
        @d(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$2", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements p<qk.d<? super ShowEvent>, c<? super r>, Object> {
            public final /* synthetic */ AdObject $ad;
            public final /* synthetic */ AdObject $adObject;
            public final /* synthetic */ UnityAdsShowOptions $showOptions;
            public int label;
            public final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AdObject adObject, AndroidShow androidShow, AdObject adObject2, UnityAdsShowOptions unityAdsShowOptions, c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.$ad = adObject;
                this.this$0 = androidShow;
                this.$adObject = adObject2;
                this.$showOptions = unityAdsShowOptions;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<r> create(Object obj, c<?> cVar) {
                return new AnonymousClass2(this.$ad, this.this$0, this.$adObject, this.$showOptions, cVar);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo1invoke(qk.d<? super ShowEvent> dVar, c<? super r> cVar) {
                return ((AnonymousClass2) create(dVar, cVar)).invokeSuspend(r.f64562a);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002e  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                JSONObject data;
                sj.a.f();
                if (this.label == 0) {
                    kotlin.c.b(obj);
                    AdObject adObject = this.$ad;
                    GameServerIdReader gameServerIdReader = this.this$0.gameServerIdReader;
                    Object obj2 = gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey());
                    Map<String, Object> builtInMap = null;
                    if (obj2 != null) {
                        ck.p.i(obj2, "get(key)");
                        if (!(obj2 instanceof String)) {
                            obj2 = null;
                        }
                        if (obj2 == null) {
                            obj2 = null;
                        }
                    } else {
                        obj2 = null;
                    }
                    Object obj3 = gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey());
                    if (obj3 != null) {
                        ck.p.i(obj3, "get(key)");
                        gameServerIdReader.getJsonStorage().delete(gameServerIdReader.getKey());
                    }
                    adObject.setPlayerServerId((String) obj2);
                    this.$adObject.getState().setValue(AdObjectState.SHOWING);
                    AdPlayer adPlayer = this.$ad.getAdPlayer();
                    UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
                    if (unityAdsShowOptions != null && (data = unityAdsShowOptions.getData()) != null) {
                        builtInMap = JSONObjectExtensionsKt.toBuiltInMap(data);
                    }
                    adPlayer.show(new AndroidShowOptions(builtInMap, this.$ad.getPlacementId(), this.$ad.isScarAd(), this.$ad.getScarQueryId(), this.$ad.getScarAdString(), this.$ad.getScarAdUnitId(), this.$ad.isOfferwallAd(), this.$ad.getOfferwallPlacementName()));
                    return r.f64562a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidShow.kt */
        @d(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$3", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass3 extends SuspendLambda implements q<qk.d<? super ShowEvent>, Throwable, c<? super r>, Object> {
            public final /* synthetic */ AdObject $adObject;
            public final /* synthetic */ ByteString $opportunityId;
            public int label;
            public final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(AdObject adObject, AndroidShow androidShow, ByteString byteString, c<? super AnonymousClass3> cVar) {
                super(3, cVar);
                this.$adObject = adObject;
                this.this$0 = androidShow;
                this.$opportunityId = byteString;
            }

            @Override // bk.q
            public final Object invoke(qk.d<? super ShowEvent> dVar, Throwable th2, c<? super r> cVar) {
                return new AnonymousClass3(this.$adObject, this.this$0, this.$opportunityId, cVar).invokeSuspend(r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.label == 0) {
                    kotlin.c.b(obj);
                    this.$adObject.getState().setValue(AdObjectState.COMPLETED);
                    this.this$0.adRepository.removeAd(this.$opportunityId);
                    return r.f64562a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidShow.kt */
        @d(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", l = {54}, m = "invokeSuspend")
        public static final class AnonymousClass4 extends SuspendLambda implements q<qk.d<? super ShowEvent>, ShowEvent, c<? super Boolean>, Object> {
            private /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public int label;

            public AnonymousClass4(c<? super AnonymousClass4> cVar) {
                super(3, cVar);
            }

            @Override // bk.q
            public final Object invoke(qk.d<? super ShowEvent> dVar, ShowEvent showEvent, c<? super Boolean> cVar) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(cVar);
                anonymousClass4.L$0 = dVar;
                anonymousClass4.L$1 = showEvent;
                return anonymousClass4.invokeSuspend(r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                ShowEvent showEvent;
                Object objF = sj.a.f();
                int i10 = this.label;
                boolean z10 = true;
                if (i10 != 0) {
                    if (i10 == 1) {
                        showEvent = (ShowEvent) this.L$0;
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                    qk.d dVar = (qk.d) this.L$0;
                    ShowEvent showEvent2 = (ShowEvent) this.L$1;
                    this.L$0 = showEvent2;
                    this.label = 1;
                    if (dVar.emit(showEvent2, this) == objF) {
                        return objF;
                    }
                    showEvent = showEvent2;
                }
                if ((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) {
                    z10 = false;
                }
                return tj.a.a(z10);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                final qk.d dVar = (qk.d) this.L$0;
                if (!(!this.$adObject.getOpportunityId().isEmpty())) {
                    throw new IllegalArgumentException("No opportunityId".toString());
                }
                ByteString opportunityId = this.$adObject.getOpportunityId();
                AdObject ad2 = this.this$0.adRepository.getAd(opportunityId);
                if (ad2 == null) {
                    throw new IllegalStateException("No ad associated with opportunityId");
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_started_ad_viewer", null, null, null, this.$adObject, null, 46, null);
                AdPlayer adPlayer = ad2.getAdPlayer();
                if (adPlayer == null) {
                    throw new IllegalStateException("No adPlayer associated with ad");
                }
                qk.c cVarJ = e.J(e.z(e.B(adPlayer.getOnShowEvent(), new AnonymousClass2(ad2, this.this$0, this.$adObject, this.$showOptions, null)), new AnonymousClass3(this.$adObject, this.this$0, opportunityId, null)), new AnonymousClass4(null));
                qk.d dVar2 = new qk.d() { // from class: com.unity3d.ads.core.domain.AndroidShow.invoke.1.5
                    @Override // qk.d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                        return emit((ShowEvent) obj2, (c<? super r>) cVar);
                    }

                    public final Object emit(ShowEvent showEvent, c<? super r> cVar) {
                        Object objEmit = dVar.emit(showEvent, cVar);
                        return objEmit == sj.a.f() ? objEmit : r.f64562a;
                    }
                };
                this.label = 1;
                if (cVarJ.collect(dVar2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    public AndroidShow(AdRepository adRepository, GameServerIdReader gameServerIdReader, SendDiagnosticEvent sendDiagnosticEvent) {
        ck.p.j(adRepository, "adRepository");
        ck.p.j(gameServerIdReader, "gameServerIdReader");
        ck.p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.Show
    public qk.c<ShowEvent> invoke(AdObject adObject, UnityAdsShowOptions unityAdsShowOptions) {
        ck.p.j(adObject, "adObject");
        return e.t(new AnonymousClass1(adObject, this, unityAdsShowOptions, null));
    }

    @Override // com.unity3d.ads.core.domain.Show
    public Object terminate(AdObject adObject, c<? super r> cVar) {
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer != null) {
            Object objDestroy = adPlayer.destroy(cVar);
            if (objDestroy == sj.a.f()) {
                return objDestroy;
            }
            return r.f64562a;
        }
        return r.f64562a;
    }
}
