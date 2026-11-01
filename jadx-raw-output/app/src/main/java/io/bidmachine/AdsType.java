package io.bidmachine;

import android.graphics.Point;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.NativeDataAssetType;
import com.explorestack.protobuf.adcom.NativeImageAssetType;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.SizeUnit;
import com.explorestack.protobuf.adcom.VideoCreativeType;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.Constants;
import io.bidmachine.ContextProvider;
import io.bidmachine.MediaAssetType;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfig;
import io.bidmachine.ads.networks.nast.NastAdapter;
import io.bidmachine.banner.BannerSize;
import io.bidmachine.core.Logger;
import io.bidmachine.displays.DisplayPlacementBuilder;
import io.bidmachine.displays.PlacementBuilder;
import io.bidmachine.displays.VideoPlacementBuilder;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import rf.k;

/* JADX INFO: loaded from: classes.dex */
public enum AdsType {
    Banner("banner", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new DisplayPlacementBuilder<UnifiedBannerAdRequestParams>(false) { // from class: io.bidmachine.AdsType.a
        @Override // io.bidmachine.displays.DisplayPlacementBuilder, rf.g
        public Point getSize(@NonNull ContextProvider contextProvider, @NonNull UnifiedBannerAdRequestParams unifiedBannerAdRequestParams) {
            BannerSize bannerSize = unifiedBannerAdRequestParams.getAdRequestParameters().getBannerSize();
            return new Point(bannerSize.width, bannerSize.height);
        }
    }}),
    Interstitial("interstitial", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new DisplayPlacementBuilder(true), new VideoPlacementBuilder(true)}),
    Rewarded("rewarded", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new DisplayPlacementBuilder(true), new VideoPlacementBuilder(false)}),
    Native("native", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new PlacementBuilder<UnifiedNativeAdRequestParams>() { // from class: io.bidmachine.displays.NativePlacementBuilder
        public static final int AD_LABEL_ASSET_ID = 101;
        public static final int CTA_ASSET_ID = 8;
        public static final int DESC_ASSET_ID = 127;
        public static final int ICON_ASSET_ID = 124;
        public static final int IMAGE_ASSET_ID = 128;
        public static final int PRIVACY_SHEET_ASSET_ID = 102;
        public static final int RATING_ASSET_ID = 7;
        public static final int TITLE_ASSET_ID = 123;
        public static final int VIDEO_ASSET_ID = 4;
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder adLabelAsset;
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder ctaAsset;
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder descAsset;
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder privacySheetAsset;
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder ratingAsset;
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder titleAsset;

        @Override // io.bidmachine.displays.PlacementBuilder
        @NonNull
        public /* bridge */ /* synthetic */ Message.Builder createPlacement(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParams unifiedAdRequestParams, @NonNull AdsType adsType, @NonNull Collection collection, @NonNull List list, @Nullable AdPlacementConfig adPlacementConfig, int i10) throws Exception {
            return createPlacement(contextProvider, (UnifiedNativeAdRequestParams) unifiedAdRequestParams, adsType, (Collection<NetworkConfig>) collection, (List<NetworkAdUnit>) list, adPlacementConfig, i10);
        }

        {
            AdContentType adContentType = AdContentType.All;
        }

        @NonNull
        public Message.Builder createPlacement(@NonNull ContextProvider contextProvider, @NonNull UnifiedNativeAdRequestParams unifiedNativeAdRequestParams, @NonNull AdsType adsType, @NonNull Collection<NetworkConfig> collection, @NonNull List<NetworkAdUnit> list, @Nullable AdPlacementConfig adPlacementConfig, int i10) throws Exception {
            Placement.DisplayPlacement.Builder builderAddAllMime = Placement.DisplayPlacement.newBuilder().setInstl(false).setUnit(SizeUnit.SIZE_UNIT_DIPS).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES));
            Placement.DisplayPlacement.NativeFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.newBuilder();
            builderNewBuilder.addAsset(titleAsset);
            builderNewBuilder.addAsset(descAsset);
            builderNewBuilder.addAsset(ctaAsset);
            builderNewBuilder.addAsset(ratingAsset);
            builderNewBuilder.addAsset(createIconAsset(unifiedNativeAdRequestParams));
            builderNewBuilder.addAsset(createImageAsset(unifiedNativeAdRequestParams));
            builderNewBuilder.addAsset(createVideoAsset(unifiedNativeAdRequestParams));
            builderNewBuilder.addAsset(adLabelAsset);
            builderNewBuilder.addAsset(privacySheetAsset);
            builderAddAllMime.setNativefmt(builderNewBuilder);
            HeaderBiddingPlacement.Builder builderCreateHeaderBiddingPlacement = createHeaderBiddingPlacement(contextProvider, unifiedNativeAdRequestParams, adsType, collection, list, i10);
            if (adPlacementConfig == null && builderCreateHeaderBiddingPlacement != null) {
                builderAddAllMime.addExtProto(Any.pack(builderCreateHeaderBiddingPlacement.build()));
            } else if (adPlacementConfig != null) {
                builderAddAllMime.addExtProto(Any.pack(createSdkPlacement(adPlacementConfig, builderCreateHeaderBiddingPlacement)));
            }
            return builderAddAllMime;
        }

        static {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            titleAsset = builderNewBuilder;
            builderNewBuilder.setId(123);
            builderNewBuilder.setReq(true);
            builderNewBuilder.setTitle(Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.newBuilder().setLen(104).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder2 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            descAsset = builderNewBuilder2;
            builderNewBuilder2.setId(127);
            builderNewBuilder2.setReq(true);
            builderNewBuilder2.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_DESC).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder3 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            ctaAsset = builderNewBuilder3;
            builderNewBuilder3.setId(8);
            builderNewBuilder3.setReq(true);
            builderNewBuilder3.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_CTA_TEXT).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder4 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            ratingAsset = builderNewBuilder4;
            builderNewBuilder4.setId(7);
            builderNewBuilder4.setReq(false);
            builderNewBuilder4.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_RATING).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder5 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            adLabelAsset = builderNewBuilder5;
            builderNewBuilder5.setId(101);
            builderNewBuilder5.setReq(false);
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder6 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            privacySheetAsset = builderNewBuilder6;
            builderNewBuilder6.setId(102);
            builderNewBuilder6.setReq(false);
        }

        @NonNull
        @VisibleForTesting
        public static Placement.DisplayPlacement.NativeFormat.AssetFormat createIconAsset(@NonNull UnifiedNativeAdRequestParams unifiedNativeAdRequestParams) {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            builderNewBuilder.setId(124);
            builderNewBuilder.setReq(unifiedNativeAdRequestParams.getAdRequestParameters().containsAssetType(MediaAssetType.Icon));
            builderNewBuilder.setImg(Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.newBuilder().setType(NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_ICON_IMAGE).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).build());
            return builderNewBuilder.build();
        }

        @NonNull
        @VisibleForTesting
        public static Placement.DisplayPlacement.NativeFormat.AssetFormat createImageAsset(@NonNull UnifiedNativeAdRequestParams unifiedNativeAdRequestParams) {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            builderNewBuilder.setId(128);
            builderNewBuilder.setReq(unifiedNativeAdRequestParams.getAdRequestParameters().containsAssetType(MediaAssetType.Image));
            builderNewBuilder.setImg(Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.newBuilder().setType(NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_MAIN_IMAGE).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).build());
            return builderNewBuilder.build();
        }

        @NonNull
        @VisibleForTesting
        public static Placement.DisplayPlacement.NativeFormat.AssetFormat createVideoAsset(@NonNull UnifiedNativeAdRequestParams unifiedNativeAdRequestParams) {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            builderNewBuilder.setId(4);
            builderNewBuilder.setReq(unifiedNativeAdRequestParams.getAdRequestParameters().containsAssetType(MediaAssetType.Video));
            builderNewBuilder.setVideo(Placement.VideoPlacement.newBuilder().setSkip(false).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES)).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setLinearValue(1).build());
            return builderNewBuilder.build();
        }

        @Override // io.bidmachine.displays.PlacementBuilder
        @Nullable
        public AdObjectParams createAdObjectParams(@NonNull Ad ad2) {
            AdObjectParams adObjectParamsCreateHeaderBiddingAdObjectParams = createHeaderBiddingAdObjectParams(ad2);
            if (adObjectParamsCreateHeaderBiddingAdObjectParams == null && ad2.hasDisplay() && ad2.getDisplay().hasNative()) {
                return new k(ad2);
            }
            return adObjectParamsCreateHeaderBiddingAdObjectParams;
        }
    }});


    @NonNull
    private final ApiRequest.ApiAuctionDataBinder binder;

    @NonNull
    private final String name;

    @NonNull
    private final PlacementBuilder[] placementBuilders;

    @NonNull
    private final Executor placementCreateExecutor = Executors.newFixedThreadPool(Math.max(8, Runtime.getRuntime().availableProcessors() * 4));

    public class b implements Runnable {
        public final /* synthetic */ AdPlacementConfig val$adPlacementConfig;
        public final /* synthetic */ UnifiedAdRequestParams val$adRequestParams;
        public final /* synthetic */ ContextProvider val$contextProvider;
        public final /* synthetic */ List val$networkAdUnits;
        public final /* synthetic */ Collection val$networkConfigList;
        public final /* synthetic */ int val$networksLoadingTimeOutSec;
        public final /* synthetic */ PlacementBuilder val$placementBuilder;
        public final /* synthetic */ List val$placementList;
        public final /* synthetic */ CountDownLatch val$syncLock;

        public b(PlacementBuilder placementBuilder, ContextProvider contextProvider, UnifiedAdRequestParams unifiedAdRequestParams, Collection collection, List list, AdPlacementConfig adPlacementConfig, int i10, List list2, CountDownLatch countDownLatch) {
            this.val$placementBuilder = placementBuilder;
            this.val$contextProvider = contextProvider;
            this.val$adRequestParams = unifiedAdRequestParams;
            this.val$networkConfigList = collection;
            this.val$networkAdUnits = list;
            this.val$adPlacementConfig = adPlacementConfig;
            this.val$networksLoadingTimeOutSec = i10;
            this.val$placementList = list2;
            this.val$syncLock = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Message.Builder builderCreatePlacement = this.val$placementBuilder.createPlacement(this.val$contextProvider, this.val$adRequestParams, AdsType.this, this.val$networkConfigList, this.val$networkAdUnits, this.val$adPlacementConfig, this.val$networksLoadingTimeOutSec);
                synchronized (this.val$placementList) {
                    this.val$placementList.add(builderCreatePlacement);
                }
                this.val$syncLock.countDown();
            } catch (Exception e10) {
                Logger.w(e10);
                this.val$syncLock.countDown();
            }
        }
    }

    public void collectPlacements(@NonNull ContextProvider contextProvider, @NonNull AdRequest adRequest, @NonNull UnifiedAdRequestParams unifiedAdRequestParams, @NonNull Collection<NetworkConfig> collection, @NonNull List<Message.Builder> list, @NonNull List<NetworkAdUnit> list2, @Nullable AdPlacementConfig adPlacementConfig, int i10) {
        AdsType adsType = this;
        CountDownLatch countDownLatch = new CountDownLatch(adsType.placementBuilders.length);
        PlacementBuilder[] placementBuilderArr = adsType.placementBuilders;
        int length = placementBuilderArr.length;
        int i11 = 0;
        while (i11 < length) {
            PlacementBuilder placementBuilder = placementBuilderArr[i11];
            if (adRequest.isPlacementBuilderMatch(placementBuilder)) {
                adsType.placementCreateExecutor.execute(new b(placementBuilder, contextProvider, unifiedAdRequestParams, collection, list2, adPlacementConfig, i10, list, countDownLatch));
            } else {
                countDownLatch.countDown();
            }
            i11++;
            adsType = this;
            placementBuilderArr = placementBuilderArr;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            Logger.w(e10);
        }
    }

    @Nullable
    public AdObjectParams createAdObjectParams(@NonNull Ad ad2) {
        for (PlacementBuilder placementBuilder : this.placementBuilders) {
            AdObjectParams adObjectParamsCreateAdObjectParams = placementBuilder.createAdObjectParams(ad2);
            if (adObjectParamsCreateAdObjectParams != null) {
                return adObjectParamsCreateAdObjectParams;
            }
        }
        return null;
    }

    @NonNull
    public ApiRequest.ApiAuctionDataBinder getBinder() {
        return this.binder;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public boolean isFullscreen() {
        return this == Interstitial || this == Rewarded;
    }

    @Nullable
    public HeaderBiddingAd obtainHeaderBiddingAd(@NonNull Ad ad2) {
        for (PlacementBuilder placementBuilder : this.placementBuilders) {
            HeaderBiddingAd headerBiddingAdObtainHeaderBiddingAd = placementBuilder.obtainHeaderBiddingAd(ad2);
            if (headerBiddingAdObtainHeaderBiddingAd != null) {
                return headerBiddingAdObtainHeaderBiddingAd;
            }
        }
        return null;
    }

    AdsType(@NonNull String str, ApiRequest.ApiAuctionDataBinder apiAuctionDataBinder, PlacementBuilder[] placementBuilderArr) {
        this.name = str;
        this.binder = apiAuctionDataBinder;
        this.placementBuilders = placementBuilderArr;
    }

    @Nullable
    public NetworkAdapter findNetworkAdapter(@NonNull Ad ad2) {
        NetworkAdapter adapter;
        HeaderBiddingAd headerBiddingAdObtainHeaderBiddingAd = obtainHeaderBiddingAd(ad2);
        if (headerBiddingAdObtainHeaderBiddingAd != null) {
            adapter = NetworkRegistry.getAdapter(headerBiddingAdObtainHeaderBiddingAd.getBidder());
        } else {
            adapter = null;
        }
        if (adapter == null) {
            if (this == Native) {
                return NetworkRegistry.getAdapter(NastAdapter.KEY);
            }
            if (ad2.hasDisplay()) {
                return NetworkRegistry.getAdapter("mraid");
            }
            if (ad2.hasVideo()) {
                return NetworkRegistry.getAdapter("vast");
            }
            return adapter;
        }
        return adapter;
    }
}
