package com.unity3d.ads.core.domain.scar;

import bk.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import mk.j;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: AndroidFetchSignalsAndSendUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AndroidFetchSignalsAndSendUseCase implements FetchSignalsAndSendUseCase {
    private final HandleGetTokenRequest handleGetTokenRequest;
    private final ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase;
    private final ScarManager scarManager;
    private final l0 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFetchSignalsAndSendUseCase.kt */
    @d(c = "com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2", f = "AndroidFetchSignalsAndSendUseCase.kt", l = {34, 54}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ TokenConfiguration $tokenConfiguration;
        public final /* synthetic */ ByteString $tokenId;
        public final /* synthetic */ int $tokenNumber;
        public long J$0;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TokenConfiguration tokenConfiguration, int i10, ByteString byteString, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$tokenConfiguration = tokenConfiguration;
            this.$tokenNumber = i10;
            this.$tokenId = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = AndroidFetchSignalsAndSendUseCase.this.new AnonymousClass2(this.$tokenConfiguration, this.$tokenNumber, this.$tokenId, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX WARN: Code duplicated, block: B:45:0x0115  */
        /* JADX WARN: Code duplicated, block: B:46:0x0118  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            long j10;
            List<AdFormatOuterClass.AdFormat> list;
            Object signals;
            Object objM3458constructorimpl;
            Object objInvoke;
            long j11;
            String str;
            Object objF = a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    j10 = this.J$0;
                    list = (List) this.L$0;
                    try {
                        kotlin.c.b(obj);
                        signals = obj;
                    } catch (Throwable th2) {
                        th = th2;
                        Result.a aVar = Result.Companion;
                        objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th));
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = this.J$0;
                    List<AdFormatOuterClass.AdFormat> list2 = (List) this.L$0;
                    kotlin.c.b(obj);
                    list = list2;
                    objInvoke = obj;
                }
                if (((UniversalResponseOuterClass.UniversalResponse) objInvoke).hasError()) {
                    str = "native_scar_signals_upload_failure_time";
                } else {
                    str = "native_scar_signals_upload_success_time";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, str, tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j11))), AndroidFetchSignalsAndSendUseCase.this.getTags(list), null, null, tj.a.d(this.$tokenNumber), 24, null);
                return r.f64562a;
            }
            kotlin.c.b(obj);
            long jB = j.f64572a.b();
            List<AdFormatOuterClass.AdFormat> listInvoke = AndroidFetchSignalsAndSendUseCase.this.scarEligibleEffectiveUseCase.invoke(this.$tokenConfiguration);
            if (listInvoke.isEmpty()) {
                return r.f64562a;
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, "native_scar_signals_collection_started", null, null, null, null, tj.a.d(this.$tokenNumber), 30, null);
            AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase = AndroidFetchSignalsAndSendUseCase.this;
            try {
                Result.a aVar2 = Result.Companion;
                ScarManager scarManager = androidFetchSignalsAndSendUseCase.scarManager;
                this.L$0 = listInvoke;
                this.J$0 = jB;
                this.label = 1;
                signals = scarManager.getSignals(listInvoke, this);
                if (signals == objF) {
                    return objF;
                }
                j10 = jB;
                list = listInvoke;
            } catch (Throwable th3) {
                th = th3;
                j10 = jB;
                list = listInvoke;
                Result.a aVar3 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th));
            }
            objM3458constructorimpl = Result.m3458constructorimpl((BiddingSignals) signals);
            if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                objM3458constructorimpl = null;
            }
            BiddingSignals biddingSignals = (BiddingSignals) objM3458constructorimpl;
            SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, biddingSignals != null ? "native_scar_signals_collection_success_time" : "native_scar_signals_collection_failure_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), AndroidFetchSignalsAndSendUseCase.this.getTags(list), null, null, tj.a.d(this.$tokenNumber), 24, null);
            if (biddingSignals == null) {
                return r.f64562a;
            }
            long jB2 = j.f64572a.b();
            SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, "native_scar_signals_upload_started", null, null, null, null, tj.a.d(this.$tokenNumber), 30, null);
            HandleGetTokenRequest handleGetTokenRequest = AndroidFetchSignalsAndSendUseCase.this.handleGetTokenRequest;
            ByteString byteString = this.$tokenId;
            this.L$0 = list;
            this.J$0 = jB2;
            this.label = 2;
            objInvoke = handleGetTokenRequest.invoke(byteString, biddingSignals, this);
            if (objInvoke == objF) {
                return objF;
            }
            j11 = jB2;
            if (((UniversalResponseOuterClass.UniversalResponse) objInvoke).hasError()) {
                str = "native_scar_signals_upload_failure_time";
            } else {
                str = "native_scar_signals_upload_success_time";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, str, tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j11))), AndroidFetchSignalsAndSendUseCase.this.getTags(list), null, null, tj.a.d(this.$tokenNumber), 24, null);
            return r.f64562a;
        }
    }

    public AndroidFetchSignalsAndSendUseCase(l0 l0Var, ScarManager scarManager, HandleGetTokenRequest handleGetTokenRequest, SendDiagnosticEvent sendDiagnosticEvent, ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase) {
        ck.p.j(l0Var, "scope");
        ck.p.j(scarManager, "scarManager");
        ck.p.j(handleGetTokenRequest, "handleGetTokenRequest");
        ck.p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        ck.p.j(scarEligibleEffectiveUseCase, "scarEligibleEffectiveUseCase");
        this.scope = l0Var;
        this.scarManager = scarManager;
        this.handleGetTokenRequest = handleGetTokenRequest;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.scarEligibleEffectiveUseCase = scarEligibleEffectiveUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(List<? extends AdFormatOuterClass.AdFormat> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER)) {
            linkedHashMap.put("banner", "true");
        }
        if (list.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED)) {
            linkedHashMap.put("rewarded", "true");
        }
        if (list.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL)) {
            linkedHashMap.put("interstitial", "true");
        }
        return linkedHashMap;
    }

    @Override // com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase
    public Object invoke(int i10, ByteString byteString, TokenConfiguration tokenConfiguration, c<? super r> cVar) {
        nk.j.d(this.scope, null, null, new AnonymousClass2(tokenConfiguration, i10, byteString, null), 3, null);
        return r.f64562a;
    }
}
