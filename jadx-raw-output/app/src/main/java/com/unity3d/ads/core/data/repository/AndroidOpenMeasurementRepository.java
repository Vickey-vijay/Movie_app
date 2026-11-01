package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import bk.p;
import com.google.protobuf.ByteString;
import com.iab.omid.library.unity3d.adsession.AdEvents;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.AdSessionConfiguration;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import com.iab.omid.library.unity3d.adsession.Partner;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.h;
import mj.r;
import nj.q0;
import nj.r0;
import nk.h0;
import nk.l0;
import qk.l;
import qk.v;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidOpenMeasurementRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AndroidOpenMeasurementRepository implements OpenMeasurementRepository {
    private final l<Boolean> _isOMActive;
    private final l<Map<String, AdSession>> activeSessions;
    private final l<Set<String>> finishedSessions;
    private final h0 mainDispatcher;
    private final OmidManager omidManager;
    private final Partner partner;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidOpenMeasurementRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super OMResult>, Object> {
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidOpenMeasurementRepository.this.new AnonymousClass2(this.$context, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super OMResult> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object failure;
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                if (AndroidOpenMeasurementRepository.this.isOMActive()) {
                    return new OMResult.Failure("om_already_active", null, 2, null);
                }
                try {
                    AndroidOpenMeasurementRepository.this.omidManager.activate(this.$context);
                    AndroidOpenMeasurementRepository androidOpenMeasurementRepository = AndroidOpenMeasurementRepository.this;
                    androidOpenMeasurementRepository.setOMActive(androidOpenMeasurementRepository.omidManager.isActive());
                    if (AndroidOpenMeasurementRepository.this.isOMActive()) {
                        failure = OMResult.Success.INSTANCE;
                    } else {
                        failure = new OMResult.Failure("om_activate_failure_time", null, 2, null);
                    }
                    return failure;
                } catch (Throwable th2) {
                    return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th2, 0, 1, null));
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidOpenMeasurementRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    public static final class C38712 extends SuspendLambda implements p<l0, c<? super OMResult>, Object> {
        public final /* synthetic */ ByteString $opportunityId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38712(ByteString byteString, c<? super C38712> cVar) {
            super(2, cVar);
            this.$opportunityId = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidOpenMeasurementRepository.this.new C38712(this.$opportunityId, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super OMResult> cVar) {
            return ((C38712) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                if (AndroidOpenMeasurementRepository.this.isOMActive()) {
                    AdSession session = AndroidOpenMeasurementRepository.this.getSession(this.$opportunityId);
                    if (session == null) {
                        return new OMResult.Failure("om_session_not_found", null, 2, null);
                    }
                    session.finish();
                    AndroidOpenMeasurementRepository.this.sessionFinished(this.$opportunityId);
                    return OMResult.Success.INSTANCE;
                }
                return new OMResult.Failure("om_not_active", null, 2, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidOpenMeasurementRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    public static final class C38722 extends SuspendLambda implements p<l0, c<? super OMResult>, Object> {
        public final /* synthetic */ ByteString $opportunityId;
        public final /* synthetic */ boolean $signalLoaded;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38722(ByteString byteString, boolean z10, c<? super C38722> cVar) {
            super(2, cVar);
            this.$opportunityId = byteString;
            this.$signalLoaded = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidOpenMeasurementRepository.this.new C38722(this.$opportunityId, this.$signalLoaded, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super OMResult> cVar) {
            return ((C38722) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                AdSession session = AndroidOpenMeasurementRepository.this.getSession(this.$opportunityId);
                if (session == null) {
                    return new OMResult.Failure("om_session_not_found", null, 2, null);
                }
                AdEvents adEventsCreateAdEvents = AndroidOpenMeasurementRepository.this.omidManager.createAdEvents(session);
                if (this.$signalLoaded) {
                    adEventsCreateAdEvents.loaded();
                }
                adEventsCreateAdEvents.impressionOccurred();
                return OMResult.Success.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidOpenMeasurementRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    public static final class C38732 extends SuspendLambda implements p<l0, c<? super OMResult>, Object> {
        public final /* synthetic */ ByteString $opportunityId;
        public final /* synthetic */ OmidOptions $options;
        public final /* synthetic */ WebView $webView;
        public int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2$WhenMappings */
        /* JADX INFO: compiled from: AndroidOpenMeasurementRepository.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CreativeType.values().length];
                try {
                    iArr[CreativeType.HTML_DISPLAY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CreativeType.VIDEO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38732(ByteString byteString, OmidOptions omidOptions, WebView webView, c<? super C38732> cVar) {
            super(2, cVar);
            this.$opportunityId = byteString;
            this.$options = omidOptions;
            this.$webView = webView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidOpenMeasurementRepository.this.new C38732(this.$opportunityId, this.$options, this.$webView, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super OMResult> cVar) {
            return ((C38732) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AdSessionContext adSessionContextCreateHtmlAdSessionContext;
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                try {
                    if (!AndroidOpenMeasurementRepository.this.isOMActive()) {
                        return new OMResult.Failure("om_not_active", null, 2, null);
                    }
                    if (((Map) AndroidOpenMeasurementRepository.this.activeSessions.getValue()).containsKey(this.$opportunityId.toStringUtf8())) {
                        return new OMResult.Failure("om_session_already_exists", null, 2, null);
                    }
                    CreativeType creativeType = this.$options.getCreativeType();
                    if (creativeType != null) {
                        OmidManager omidManager = AndroidOpenMeasurementRepository.this.omidManager;
                        ImpressionType impressionType = this.$options.getImpressionType();
                        if (impressionType == null) {
                            impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
                        }
                        ImpressionType impressionType2 = impressionType;
                        Owner impressionOwner = this.$options.getImpressionOwner();
                        if (impressionOwner == null) {
                            impressionOwner = Owner.JAVASCRIPT;
                        }
                        Owner owner = impressionOwner;
                        Owner videoEventsOwner = this.$options.getVideoEventsOwner();
                        if (videoEventsOwner == null) {
                            videoEventsOwner = Owner.JAVASCRIPT;
                        }
                        AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = omidManager.createAdSessionConfiguration(creativeType, impressionType2, owner, videoEventsOwner, this.$options.getIsolateVerificationScripts());
                        int i10 = WhenMappings.$EnumSwitchMapping$0[creativeType.ordinal()];
                        if (i10 != 1) {
                            if (i10 != 2) {
                                return new OMResult.Failure("om_creative_type_invalid", null, 2, null);
                            }
                            adSessionContextCreateHtmlAdSessionContext = AndroidOpenMeasurementRepository.this.omidManager.createJavaScriptAdSessionContext(AndroidOpenMeasurementRepository.this.partner, this.$webView, null, this.$options.getCustomReferenceData());
                        } else {
                            adSessionContextCreateHtmlAdSessionContext = AndroidOpenMeasurementRepository.this.omidManager.createHtmlAdSessionContext(AndroidOpenMeasurementRepository.this.partner, this.$webView, null, this.$options.getCustomReferenceData());
                        }
                        AdSession adSessionCreateAdSession = AndroidOpenMeasurementRepository.this.omidManager.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, adSessionContextCreateHtmlAdSessionContext);
                        adSessionCreateAdSession.registerAdView(this.$webView);
                        adSessionCreateAdSession.start();
                        AndroidOpenMeasurementRepository.this.addSession(this.$opportunityId, adSessionCreateAdSession);
                        return OMResult.Success.INSTANCE;
                    }
                    return new OMResult.Failure("om_creative_type_null", null, 2, null);
                } catch (Throwable th2) {
                    return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th2, 0, 1, null));
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public AndroidOpenMeasurementRepository(h0 h0Var, OmidManager omidManager) {
        ck.p.j(h0Var, "mainDispatcher");
        ck.p.j(omidManager, "omidManager");
        this.mainDispatcher = h0Var;
        this.omidManager = omidManager;
        this.partner = Partner.createPartner(UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "4.16.5");
        this.activeSessions = v.a(kotlin.collections.a.j());
        this.finishedSessions = v.a(q0.f());
        this._isOMActive = v.a(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSession(ByteString byteString, AdSession adSession) {
        Map<String, AdSession> value;
        l<Map<String, AdSession>> lVar = this.activeSessions;
        do {
            value = lVar.getValue();
        } while (!lVar.a(value, kotlin.collections.a.r(value, h.a(byteString.toStringUtf8(), adSession))));
    }

    private final OMData buildOmData() {
        return new OMData(this.omidManager.getVersion(), UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdSession getSession(ByteString byteString) {
        return this.activeSessions.getValue().get(byteString.toStringUtf8());
    }

    private final void removeSession(ByteString byteString) {
        Map<String, AdSession> value;
        String stringUtf8;
        l<Map<String, AdSession>> lVar = this.activeSessions;
        do {
            value = lVar.getValue();
            stringUtf8 = byteString.toStringUtf8();
            ck.p.i(stringUtf8, "opportunityId.toStringUtf8()");
        } while (!lVar.a(value, kotlin.collections.a.n(value, stringUtf8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sessionFinished(ByteString byteString) {
        Set<String> value;
        String stringUtf8;
        l<Set<String>> lVar = this.finishedSessions;
        do {
            value = lVar.getValue();
            stringUtf8 = byteString.toStringUtf8();
            ck.p.i(stringUtf8, "opportunityId.toStringUtf8()");
        } while (!lVar.a(value, r0.n(value, stringUtf8)));
        removeSession(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object activateOM(Context context, c<? super OMResult> cVar) {
        return nk.h.g(this.mainDispatcher, new AnonymousClass2(context, null), cVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object finishSession(ByteString byteString, c<? super OMResult> cVar) {
        return nk.h.g(this.mainDispatcher, new C38712(byteString, null), cVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean hasSessionFinished(ByteString byteString) {
        ck.p.j(byteString, "opportunityId");
        return this.finishedSessions.getValue().contains(byteString.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object impressionOccurred(ByteString byteString, boolean z10, c<? super OMResult> cVar) {
        return nk.h.g(this.mainDispatcher, new C38722(byteString, z10, null), cVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean isOMActive() {
        return this._isOMActive.getValue().booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public void setOMActive(boolean z10) {
        Boolean value;
        l<Boolean> lVar = this._isOMActive;
        do {
            value = lVar.getValue();
            value.booleanValue();
        } while (!lVar.a(value, Boolean.valueOf(z10)));
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, c<? super OMResult> cVar) {
        return nk.h.g(this.mainDispatcher, new C38732(byteString, omidOptions, webView, null), cVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public OMData getOmData() {
        return buildOmData();
    }
}
