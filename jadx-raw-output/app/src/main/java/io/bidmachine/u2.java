package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.banner.BannerRequest;
import io.bidmachine.banner.BannerSize;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.interstitial.InterstitialRequest;
import io.bidmachine.measurer.OMSDKSettings;
import io.bidmachine.nativead.NativeRequest;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.ResponsePayload;
import io.bidmachine.protobuf.TokenConfiguration;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.protobuf.sdk.SDK;
import io.bidmachine.protobuf.sdk.User;
import io.bidmachine.rewarded.RewardedRequest;
import io.bidmachine.tracking.TrackingObject;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: BidTokenManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class u2 {
    private static final int DEFAULT_EXPIRATION_SEC = 300;

    @NonNull
    private static final String TAG = "BidTokenManager";

    @NonNull
    private static final TrackingObject TRACKING_OBJECT = new BidMachineTrackingObject();

    @NonNull
    private static final Map<AdsFormat, TokenConfiguration> TOKEN_CONFIGURATION_MAP = new ConcurrentHashMap();

    @NonNull
    private static final Map<String, BidToken> STORED_BID_TOKEN = new ConcurrentHashMap();

    /* JADX INFO: compiled from: BidTokenManager.java */
    public static class b implements ExpirationListener<BidToken> {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onExpired$0(BidToken bidToken) {
            return String.format("BidToken expired - %s", bidToken.getId());
        }

        @Override // io.bidmachine.ExpirationListener
        public void onExpired(@NonNull final BidToken bidToken) {
            Logger.d(u2.TAG, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.v2
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return u2.b.lambda$onExpired$0(bidToken);
                }
            });
            u2.removeBidToken(bidToken);
            bidToken.destroyAdRequest();
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    @Nullable
    public static <T extends AdRequest<?, ?, ?>> T findPreparedAdRequest(@Nullable ResponsePayload responsePayload) {
        if (responsePayload == null) {
            return null;
        }
        final String strFindTokenIdFromResponsePayload = findTokenIdFromResponsePayload(responsePayload);
        Logger.d(TAG, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.r2
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return u2.lambda$findPreparedAdRequest$3(strFindTokenIdFromResponsePayload);
            }
        });
        if (TextUtils.isEmpty(strFindTokenIdFromResponsePayload)) {
            return null;
        }
        BidToken bidTokenRemoveBidToken = removeBidToken(strFindTokenIdFromResponsePayload);
        if (bidTokenRemoveBidToken != null) {
            return (T) bidTokenRemoveBidToken.getAdRequest();
        }
        Logger.d(TAG, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.s2
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return u2.lambda$findPreparedAdRequest$4(strFindTokenIdFromResponsePayload);
            }
        });
        return null;
    }

    @Nullable
    private static String findTokenIdFromResponsePayload(@NonNull ResponsePayload responsePayload) {
        try {
            Value value = responsePayload.getResponseCache().getResponse().getExt().getFieldsMap().get("tokenHashValue");
            if (value == null) {
                return null;
            }
            return value.getStringValue();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$findPreparedAdRequest$3(String str) {
        return String.format("BidTokenId from bidPayload - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$findPreparedAdRequest$4(String str) {
        return String.format("BidToken is null by bidTokenId - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$processAdNetworks$2(BidToken bidToken) {
        return String.format("BidTokenId - %s", bidToken.getId());
    }

    @Nullable
    public static BidToken removeBidToken(@NonNull BidToken bidToken) {
        return removeBidToken(bidToken.getId());
    }

    private static void sendSuccessEvent(@Nullable AdsFormat adsFormat) {
        trackEvent(adsFormat, null);
    }

    /* JADX INFO: compiled from: BidTokenManager.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$io$bidmachine$AdsFormat;

        static {
            int[] iArr = new int[AdsFormat.values().length];
            $SwitchMap$io$bidmachine$AdsFormat = iArr;
            try {
                iArr[AdsFormat.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$AdsFormat[AdsFormat.Banner_320x50.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$AdsFormat[AdsFormat.Banner_300x250.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$bidmachine$AdsFormat[AdsFormat.Banner_728x90.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$bidmachine$AdsFormat[AdsFormat.Interstitial.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$bidmachine$AdsFormat[AdsFormat.InterstitialStatic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$bidmachine$AdsFormat[AdsFormat.InterstitialVideo.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$bidmachine$AdsFormat[AdsFormat.Rewarded.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$bidmachine$AdsFormat[AdsFormat.RewardedStatic.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$bidmachine$AdsFormat[AdsFormat.RewardedVideo.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$bidmachine$AdsFormat[AdsFormat.Native.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    @NonNull
    @VisibleForTesting
    public static Map<String, BidToken> getStoredBidToken() {
        return STORED_BID_TOKEN;
    }

    @Nullable
    public static TokenConfiguration getTokenConfiguration(@Nullable AdsFormat adsFormat) {
        if (adsFormat == null) {
            return null;
        }
        return TOKEN_CONFIGURATION_MAP.get(adsFormat);
    }

    @Nullable
    private static AdRequest<?, ?, ?> mapToAdRequest(@NonNull AdsFormat adsFormat) {
        switch (a.$SwitchMap$io$bidmachine$AdsFormat[adsFormat.ordinal()]) {
            case 1:
            case 2:
                return new BannerRequest.Builder().setSize(BannerSize.Size_320x50).build();
            case 3:
                return new BannerRequest.Builder().setSize(BannerSize.Size_300x250).build();
            case 4:
                return new BannerRequest.Builder().setSize(BannerSize.Size_728x90).build();
            case 5:
                return new InterstitialRequest.Builder().setAdContentType(AdContentType.All).build();
            case 6:
                return new InterstitialRequest.Builder().setAdContentType(AdContentType.Static).build();
            case 7:
                return new InterstitialRequest.Builder().setAdContentType(AdContentType.Video).build();
            case 8:
                return new RewardedRequest.Builder().setAdContentType(AdContentType.All).build();
            case 9:
                return new RewardedRequest.Builder().setAdContentType(AdContentType.Static).build();
            case 10:
                return new RewardedRequest.Builder().setAdContentType(AdContentType.Video).build();
            case 11:
                return new NativeRequest.Builder().setMediaAssetTypes(MediaAssetType.All).build();
            default:
                return null;
        }
    }

    private static void processAdNetworks(@NonNull Context context, @NonNull RequestTokenPayload.Builder builder, @Nullable AdsFormat adsFormat) {
        if (adsFormat == null) {
            return;
        }
        try {
            AdRequest<?, ?, ?> adRequestMapToAdRequest = mapToAdRequest(adsFormat);
            if (adRequestMapToAdRequest == null) {
                return;
            }
            NetworkRegistry.registerAndInitializeCoreNetworks(context);
            TokenConfiguration tokenConfigurationObtainTokenConfiguration = obtainTokenConfiguration(adsFormat);
            HeaderBiddingPlacement.Builder builderNewBuilder = HeaderBiddingPlacement.newBuilder();
            a aVar = null;
            for (Message.Builder builder2 : adRequestMapToAdRequest.collectPlacementFormats(context, tokenConfigurationObtainTokenConfiguration.getAdNetworksList(), null)) {
                if (builder2 instanceof Placement.DisplayPlacement.Builder) {
                    fillHeaderBiddingPlacementBuilder(builderNewBuilder, ((Placement.DisplayPlacement.Builder) builder2).getExtProtoList());
                } else if (builder2 instanceof Placement.VideoPlacement.Builder) {
                    fillHeaderBiddingPlacementBuilder(builderNewBuilder, ((Placement.VideoPlacement.Builder) builder2).getExtProtoList());
                }
            }
            if (builderNewBuilder.getAdUnitsList().isEmpty()) {
                return;
            }
            final BidToken bidToken = new BidToken(adRequestMapToAdRequest, tokenConfigurationObtainTokenConfiguration.getExpirationTime(), new b(aVar));
            storeBidToken(bidToken);
            builder.getPlacementBuilder().setHbPlacement(builderNewBuilder);
            builder.setTokenHashValue(bidToken.getId());
            Logger.d(TAG, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.t2
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return u2.lambda$processAdNetworks$2(bidToken);
                }
            });
        } catch (Throwable unused) {
            removeBidToken(builder.getTokenHashValue());
        }
    }

    @Nullable
    public static BidToken removeBidToken(@NonNull String str) {
        BidToken bidTokenRemove = STORED_BID_TOKEN.remove(str);
        if (bidTokenRemove != null) {
            bidTokenRemove.stopExpiration();
        }
        return bidTokenRemove;
    }

    public static void setupTokenConfigurations(@Nullable List<TokenConfiguration> list) {
        TOKEN_CONFIGURATION_MAP.clear();
        if (list != null) {
            for (TokenConfiguration tokenConfiguration : list) {
                AdsFormat adsFormatByRemoteName = AdsFormat.byRemoteName(tokenConfiguration.getType());
                if (adsFormatByRemoteName != null) {
                    TOKEN_CONFIGURATION_MAP.put(adsFormatByRemoteName, tokenConfiguration);
                }
            }
        }
    }

    public static void storeBidToken(@NonNull BidToken bidToken) {
        STORED_BID_TOKEN.put(bidToken.getId(), bidToken);
        bidToken.startExpiration();
    }

    private static void trackEvent(@Nullable AdsFormat adsFormat, @Nullable BMError bMError) {
        TRACKING_OBJECT.eventFinish(TrackEventType.GetBidToken, adsFormat != null ? adsFormat.getAdsType() : null, null, bMError);
    }

    @NonNull
    @WorkerThread
    public static String createBidToken(@NonNull Context context, @NonNull AdPlacementConfig adPlacementConfig) {
        AdsFormat adsFormat = adPlacementConfig.getAdsFormat();
        RequestTokenPayload requestTokenPayloadCreateRequestTokenPayload = createRequestTokenPayload(context, adPlacementConfig);
        if (requestTokenPayloadCreateRequestTokenPayload == null) {
            sendFailEvent(adsFormat, BMError.internal("Failed to create RequestTokenPayload"));
            return "";
        }
        try {
            String strEncodeToString = Base64.encodeToString(requestTokenPayloadCreateRequestTokenPayload.toByteArray(), 2);
            sendSuccessEvent(adsFormat);
            return strEncodeToString;
        } catch (Exception e10) {
            sendFailEvent(adsFormat, BMError.throwable("Failed to encode RequestTokenPayload", e10));
            removeBidToken(requestTokenPayloadCreateRequestTokenPayload.getTokenHashValue());
            return "";
        }
    }

    @Nullable
    private static RequestTokenPayload createRequestTokenPayload(@NonNull Context context, @NonNull AdPlacementConfig adPlacementConfig) {
        try {
            AdsFormat adsFormat = adPlacementConfig.getAdsFormat();
            j2 j2Var = j2.get();
            RequestTokenPayload.Builder builderNewBuilder = RequestTokenPayload.newBuilder();
            final io.bidmachine.protobuf.sdk.Placement.Builder placementBuilder = builderNewBuilder.getPlacementBuilder();
            placementBuilder.setAdType(adsFormat.getAdsType().getName());
            Utils.ifNotNull(adPlacementConfig.getPlacementId(), new Executable() { // from class: io.bidmachine.p2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    u2.lambda$createRequestTokenPayload$0(placementBuilder, (String) obj);
                }
            });
            Utils.ifNotNull(adPlacementConfig.getCustomParams(), new Executable() { // from class: io.bidmachine.q2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    u2.lambda$createRequestTokenPayload$1(placementBuilder, (CustomParams) obj);
                }
            });
            App.Builder builderNewBuilder2 = App.newBuilder();
            j2Var.getAppParams().build(context, builderNewBuilder2);
            builderNewBuilder.setAppData(builderNewBuilder2);
            User.Builder builderCreateUserBuilder = createUserBuilder(j2Var);
            if (builderCreateUserBuilder != null) {
                builderNewBuilder.setUserData(builderCreateUserBuilder);
            }
            SDK.Builder sdkver = SDK.newBuilder().setSdk(BidMachine.NAME).setSdkver("3.3.0");
            OMSDKSettings.fill(sdkver);
            builderNewBuilder.setPlacementData(sdkver);
            j2Var.getDeviceParams().build(context, builderNewBuilder, j2Var.getUserRestrictionParams());
            j2Var.getSessionParams().build(context, builderNewBuilder, adsFormat);
            processAdNetworks(context, builderNewBuilder, adsFormat);
            Struct.Builder builderNewBuilder3 = Struct.newBuilder();
            Struct privateStruct = ExtraParamsManager.get().getPrivateStruct(context);
            if (privateStruct != null) {
                builderNewBuilder3.putAllFields(privateStruct.getFieldsMap());
            }
            if (builderNewBuilder3.getFieldsCount() > 0) {
                builderNewBuilder.setExt(builderNewBuilder3.build());
            }
            return builderNewBuilder.build();
        } catch (Throwable th2) {
            Logger.w(th2);
            return null;
        }
    }

    @Nullable
    private static User.Builder createUserBuilder(@NonNull j2 j2Var) {
        try {
            w5 userRestrictionParams = j2Var.getUserRestrictionParams();
            User.Builder builderNewBuilder = User.newBuilder();
            userRestrictionParams.fill(builderNewBuilder);
            return builderNewBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void fillHeaderBiddingPlacementBuilder(@NonNull HeaderBiddingPlacement.Builder builder, @NonNull List<Any> list) {
        Iterator<Any> it = list.iterator();
        while (it.hasNext()) {
            try {
                builder.addAllAdUnits(((HeaderBiddingPlacement) it.next().unpack(HeaderBiddingPlacement.class)).getAdUnitsList());
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createRequestTokenPayload$0(io.bidmachine.protobuf.sdk.Placement.Builder builder, String str) {
        builder.setPlacementId(StringValue.of(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createRequestTokenPayload$1(io.bidmachine.protobuf.sdk.Placement.Builder builder, CustomParams customParams) {
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        customParams.fillStructBuilder(builderNewBuilder);
        if (builderNewBuilder.getFieldsCount() > 0) {
            builder.setCustomData(builderNewBuilder);
        }
    }

    @NonNull
    private static TokenConfiguration obtainTokenConfiguration(@NonNull AdsFormat adsFormat) {
        TokenConfiguration tokenConfiguration = getTokenConfiguration(adsFormat);
        if (tokenConfiguration == null) {
            tokenConfiguration = getTokenConfiguration(adsFormat.getParent());
        }
        if (tokenConfiguration == null) {
            return TokenConfiguration.newBuilder().setExpirationTime(300).build();
        }
        return tokenConfiguration;
    }

    private static void sendFailEvent(@Nullable AdsFormat adsFormat, @NonNull BMError bMError) {
        trackEvent(adsFormat, bMError);
    }
}
