package com.unity3d.ads.core.domain;

import android.content.Context;
import bk.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: LegacyLoadUseCase.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1", f = "LegacyLoadUseCase.kt", l = {130, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 138}, m = "invokeSuspend")
public final class LegacyLoadUseCase$invoke$loadResult$1 extends SuspendLambda implements p<l0, c<? super LoadResult>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AdRequestOuterClass.BannerSize $gatewayBannerSize;
    public final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    public final /* synthetic */ String $opportunityId;
    public final /* synthetic */ String $placement;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ LegacyLoadUseCase this$0;

    /* JADX INFO: compiled from: LegacyLoadUseCase.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitializationState.values().length];
            try {
                iArr[InitializationState.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationState.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitializationState.INITIALIZING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyLoadUseCase$invoke$loadResult$1(String str, String str2, LegacyLoadUseCase legacyLoadUseCase, Context context, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, c<? super LegacyLoadUseCase$invoke$loadResult$1> cVar) {
        super(2, cVar);
        this.$placement = str;
        this.$opportunityId = str2;
        this.this$0 = legacyLoadUseCase;
        this.$context = context;
        this.$gatewayBannerSize = bannerSize;
        this.$loadOptions = unityAdsLoadOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new LegacyLoadUseCase$invoke$loadResult$1(this.$placement, this.$opportunityId, this.this$0, this.$context, this.$gatewayBannerSize, this.$loadOptions, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super LoadResult> cVar) {
        return ((LegacyLoadUseCase$invoke$loadResult$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0122  */
    /* JADX WARN: Code duplicated, block: B:41:0x013a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0157 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00f9, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objInvoke;
        Object objInvoke$default;
        ByteString byteString;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup;
        InitializationState initializationState;
        int i10;
        Object objInvoke2;
        Object objF = sj.a.f();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            if (this.$placement == null) {
                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, "[UnityAds] Placement ID cannot be null", null, "placement_null", null, false, 52, null);
            }
            UUID uuidFromString = UUID.fromString(this.$opportunityId);
            ck.p.i(uuidFromString, "fromString(opportunityId)");
            ByteString byteString2 = ProtobufExtensionsKt.toByteString(uuidFromString);
            this.this$0.opportunity = byteString2;
            if (this.this$0.adRepository.hasOpportunityId(byteString2)) {
                new LoadResult.Failure(UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, LoadResult.MSG_OPPORTUNITY_ID_USED, null, "opportunity_id_used", null, false, 52, null);
            }
            LegacyLoadUseCase legacyLoadUseCase = this.this$0;
            HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup2 = legacyLoadUseCase.getHeaderBiddingAdMarkup(legacyLoadUseCase.adMarkup);
            if (headerBiddingAdMarkup2 == null) {
                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, LoadResult.MSG_AD_MARKUP_PARSING, null, "invalid_admarkup", null, false, 52, null);
            }
            int i12 = WhenMappings.$EnumSwitchMapping$0[GetInitializationState.DefaultImpls.invoke$default(this.this$0.getInitializationState, false, 1, null).ordinal()];
            if (i12 == 1) {
                Load load = this.this$0.load;
                Context context = this.$context;
                String str = this.$placement;
                AdRequestOuterClass.BannerSize bannerSize = this.$gatewayBannerSize;
                UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                this.label = 1;
                objInvoke = load.invoke(context, str, byteString2, headerBiddingAdMarkup2, bannerSize, unityAdsLoadOptions, this);
                if (objInvoke == objF) {
                    return objF;
                }
                return (LoadResult) objInvoke;
            }
            if (i12 == 2 || i12 == 3) {
                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, LoadResult.MSG_NOT_INITIALIZED, null, "not_initialized", null, false, 52, null);
            }
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            AwaitInitialization awaitInitialization = this.this$0.awaitInitialization;
            this.L$0 = byteString2;
            this.L$1 = headerBiddingAdMarkup2;
            this.label = 2;
            objInvoke$default = AwaitInitialization.DefaultImpls.invoke$default(awaitInitialization, 0L, this, 1, null);
            if (objInvoke$default == objF) {
                return objF;
            }
            byteString = byteString2;
            headerBiddingAdMarkup = headerBiddingAdMarkup2;
            initializationState = (InitializationState) objInvoke$default;
            if (initializationState == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$0[initializationState.ordinal()];
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, LoadResult.MSG_NOT_INITIALIZED, null, "not_initialized", null, false, 52, null);
                }
                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.TIMEOUT, LoadResult.MSG_TIMEOUT + this.$placement, null, "timeout_initialization", null, false, 52, null);
            }
            Load load2 = this.this$0.load;
            Context context2 = this.$context;
            String str2 = this.$placement;
            AdRequestOuterClass.BannerSize bannerSize2 = this.$gatewayBannerSize;
            UnityAdsLoadOptions unityAdsLoadOptions2 = this.$loadOptions;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            objInvoke2 = load2.invoke(context2, str2, byteString, headerBiddingAdMarkup, bannerSize2, unityAdsLoadOptions2, this);
            if (objInvoke2 == objF) {
                return objF;
            }
        } else {
            if (i11 == 1) {
                kotlin.c.b(obj);
                objInvoke = obj;
                return (LoadResult) objInvoke;
            }
            if (i11 == 2) {
                HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup3 = (HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup) this.L$1;
                ByteString byteString3 = (ByteString) this.L$0;
                kotlin.c.b(obj);
                headerBiddingAdMarkup = headerBiddingAdMarkup3;
                byteString = byteString3;
                objInvoke$default = obj;
                initializationState = (InitializationState) objInvoke$default;
                if (initializationState == null) {
                    i10 = -1;
                } else {
                    i10 = WhenMappings.$EnumSwitchMapping$0[initializationState.ordinal()];
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, LoadResult.MSG_NOT_INITIALIZED, null, "not_initialized", null, false, 52, null);
                    }
                    return new LoadResult.Failure(UnityAds.UnityAdsLoadError.TIMEOUT, LoadResult.MSG_TIMEOUT + this.$placement, null, "timeout_initialization", null, false, 52, null);
                }
                Load load3 = this.this$0.load;
                Context context3 = this.$context;
                String str3 = this.$placement;
                AdRequestOuterClass.BannerSize bannerSize3 = this.$gatewayBannerSize;
                UnityAdsLoadOptions unityAdsLoadOptions3 = this.$loadOptions;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                objInvoke2 = load3.invoke(context3, str3, byteString, headerBiddingAdMarkup, bannerSize3, unityAdsLoadOptions3, this);
                if (objInvoke2 == objF) {
                    return objF;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                objInvoke2 = obj;
            }
        }
        return (LoadResult) objInvoke2;
    }
}
