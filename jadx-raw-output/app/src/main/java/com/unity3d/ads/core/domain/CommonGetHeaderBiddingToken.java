package com.unity3d.ads.core.domain;

import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: CommonGetHeaderBiddingToken.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CommonGetHeaderBiddingToken implements GetHeaderBiddingToken {
    public static final Companion Companion = new Companion(null);
    public static final String HB_TOKEN_VERSION = "2";
    private final BuildHeaderBiddingToken buildHeaderBiddingToken;
    private final FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase;
    private final ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase;

    /* JADX INFO: compiled from: CommonGetHeaderBiddingToken.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonGetHeaderBiddingToken.kt */
    @d(c = "com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken", f = "CommonGetHeaderBiddingToken.kt", l = {15, 18}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGetHeaderBiddingToken.this.invoke(0, null, this);
        }
    }

    public CommonGetHeaderBiddingToken(BuildHeaderBiddingToken buildHeaderBiddingToken, FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase, ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase) {
        p.j(buildHeaderBiddingToken, "buildHeaderBiddingToken");
        p.j(fetchSignalsAndSendUseCase, "fetchSignalsAndSendUseCase");
        p.j(scarEligibleEffectiveUseCase, "scarEligibleEffectiveUseCase");
        this.buildHeaderBiddingToken = buildHeaderBiddingToken;
        this.fetchSignalsAndSendUseCase = fetchSignalsAndSendUseCase;
        this.scarEligibleEffectiveUseCase = scarEligibleEffectiveUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetHeaderBiddingToken
    public Object invoke(int i10, TokenConfiguration tokenConfiguration, c<? super String> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        CommonGetHeaderBiddingToken commonGetHeaderBiddingToken;
        TokenConfiguration tokenConfiguration2;
        List<AdFormatOuterClass.AdFormat> list;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken2;
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
        Object obj = anonymousClass1.result;
        Object objF = sj.a.f();
        int i12 = anonymousClass1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = anonymousClass1.I$0;
                list = (List) anonymousClass1.L$2;
                tokenConfiguration2 = (TokenConfiguration) anonymousClass1.L$1;
                commonGetHeaderBiddingToken = (CommonGetHeaderBiddingToken) anonymousClass1.L$0;
                kotlin.c.b(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                headerBiddingToken2 = (HeaderBiddingTokenOuterClass.HeaderBiddingToken) anonymousClass1.L$0;
                kotlin.c.b(obj);
            }
            headerBiddingToken = headerBiddingToken2;
            ByteString byteString = headerBiddingToken.toByteString();
            p.i(byteString, "rawToken.toByteString()");
            return "2:" + ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null);
        }
        kotlin.c.b(obj);
        List<AdFormatOuterClass.AdFormat> listInvoke = this.scarEligibleEffectiveUseCase.invoke(tokenConfiguration);
        BuildHeaderBiddingToken buildHeaderBiddingToken = this.buildHeaderBiddingToken;
        boolean z10 = !listInvoke.isEmpty();
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = tokenConfiguration;
        anonymousClass1.L$2 = listInvoke;
        anonymousClass1.I$0 = i10;
        anonymousClass1.label = 1;
        Object objInvoke = buildHeaderBiddingToken.invoke(i10, tokenConfiguration, z10, anonymousClass1);
        if (objInvoke == objF) {
            return objF;
        }
        commonGetHeaderBiddingToken = this;
        tokenConfiguration2 = tokenConfiguration;
        list = listInvoke;
        obj = objInvoke;
        headerBiddingToken = (HeaderBiddingTokenOuterClass.HeaderBiddingToken) obj;
        if (!list.isEmpty()) {
            FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase = commonGetHeaderBiddingToken.fetchSignalsAndSendUseCase;
            ByteString tokenId = headerBiddingToken.getTokenId();
            p.i(tokenId, "rawToken.tokenId");
            anonymousClass1.L$0 = headerBiddingToken;
            anonymousClass1.L$1 = null;
            anonymousClass1.L$2 = null;
            anonymousClass1.label = 2;
            if (fetchSignalsAndSendUseCase.invoke(i10, tokenId, tokenConfiguration2, anonymousClass1) == objF) {
                return objF;
            }
            headerBiddingToken2 = headerBiddingToken;
            headerBiddingToken = headerBiddingToken2;
        }
        ByteString byteString2 = headerBiddingToken.toByteString();
        p.i(byteString2, "rawToken.toByteString()");
        return "2:" + ProtobufExtensionsKt.toBase64$default(byteString2, false, 1, null);
    }
}
