package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.core.Logger;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.core.Utils;
import io.bidmachine.displays.PlacementBuilder;
import io.bidmachine.measurer.OMSDKSettings;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.RequestBuilder;
import io.bidmachine.models.RequestParams;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.protobuf.ResponsePayload;
import io.bidmachine.tracking.EventData;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AdRequest<SelfType extends AdRequest, AdRequestParametersType extends AdRequestParameters, UnifiedAdRequestParamsType extends UnifiedAdRequestParams> {

    @Nullable
    @VisibleForTesting
    public List<AdRequestListener<SelfType>> adRequestListeners;

    @NonNull
    private final AdRequestParametersType adRequestParameters;

    @Nullable
    public u adResponse;

    @NonNull
    private final s0 adResponseLoader;

    @NonNull
    @VisibleForTesting
    public final Queue<String> auctionUrlQueue;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f58490id;

    @Nullable
    @VisibleForTesting
    public List<f<SelfType>> internalAdRequestListeners;
    private final AtomicBoolean isApiRequestCanceled;
    private final AtomicBoolean isApiRequestCompleted;
    private final AtomicBoolean isDestroyed;
    private final AtomicBoolean isLoading;
    private final AtomicBoolean isRequestExpired;

    @Nullable
    private NetworkAdUnitManager networkAdUnitManager;
    private final Tag tag = new Tag("AdRequest");
    private final Runnable timeOutRunnable;

    @NonNull
    private final BidMachineTrackingObject trackingObject;

    @Nullable
    private UnifiedAdRequestParamsType unifiedAdRequestParams;

    public static abstract class AdRequestBuilderImpl<SelfType extends RequestBuilder, ReturnType extends AdRequest<ReturnType, AdRequestParametersType, ?>, AdRequestParametersType extends AdRequestParameters> implements RequestBuilder<SelfType, ReturnType> {

        @Nullable
        @VisibleForTesting
        public ResponsePayload bidPayload;

        @Nullable
        @VisibleForTesting
        public CustomParams customParams;

        @Nullable
        @VisibleForTesting
        public AdRequestListener<ReturnType> listener;

        @Nullable
        @VisibleForTesting
        public List<NetworkConfig> networkConfigList;

        @Nullable
        @VisibleForTesting
        public String placementId;

        @Nullable
        @VisibleForTesting
        public PriceFloorParams priceFloorParams;

        @Nullable
        @VisibleForTesting
        public SessionAdParams sessionAdParams;

        @Nullable
        @VisibleForTesting
        public TargetingParams targetingParams;

        @Nullable
        @VisibleForTesting
        public Integer timeOutMs;

        @NonNull
        public abstract ReturnType build(@NonNull AdRequestParametersType adrequestparameterstype);

        @NonNull
        public abstract AdRequestParametersType createAdRequestParameters();

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setNetworks(@Nullable List<NetworkConfig> list) {
            fillNetworkConfigs(list);
            return this;
        }

        private void fillAdRequestParameters(@NonNull AdRequestParametersType adrequestparameterstype) {
            adrequestparameterstype.setAdPlacementConfig(new AdPlacementConfig.Builder(adrequestparameterstype.getAdsFormat()).withPlacementId(this.placementId).withCustomParams(this.customParams).build());
            adrequestparameterstype.setPriceFloorParams(this.priceFloorParams);
            adrequestparameterstype.setTargetingParams(this.targetingParams);
            adrequestparameterstype.setSessionAdParams(this.sessionAdParams);
            adrequestparameterstype.setNetworkConfigList(this.networkConfigList);
            adrequestparameterstype.setTimeOutMs(this.timeOutMs);
            adrequestparameterstype.setBidPayload(this.bidPayload);
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public ReturnType build() {
            ReturnType returntype = (ReturnType) u2.findPreparedAdRequest(this.bidPayload);
            if (returntype == null) {
                returntype = (ReturnType) build(createAdRequestParameters());
            }
            fillAdRequestParameters(returntype.getAdRequestParameters());
            returntype.addListener(this.listener);
            return returntype;
        }

        @VisibleForTesting
        public void fillNetworkConfigs(@Nullable List<NetworkConfig> list) {
            if (list == null) {
                this.networkConfigList = new ArrayList();
            } else {
                this.networkConfigList = list;
            }
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setBidPayload(@Nullable String str) {
            if (str == null) {
                this.bidPayload = null;
                return this;
            }
            try {
                this.bidPayload = ResponsePayload.parseFrom(Base64.decode(str, 0));
            } catch (Throwable th2) {
                Logger.w(th2);
            }
            if (this.bidPayload == null) {
                this.bidPayload = ResponsePayload.getDefaultInstance();
            }
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setCustomParams(@Nullable CustomParams customParams) {
            this.customParams = customParams;
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setListener(@Nullable AdRequestListener<ReturnType> adRequestListener) {
            this.listener = adRequestListener;
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setLoadingTimeOut(@Nullable Integer num) {
            this.timeOutMs = num;
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setNetworks(@Nullable String str) {
            ArrayList arrayList = null;
            if (!TextUtils.isEmpty(str)) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        JSONArray jSONArray = new JSONArray(str);
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            NetworkConfig networkConfigCreate = t4.create(j2.get().getAppContext(), jSONArray.getJSONObject(i10));
                            if (networkConfigCreate != null) {
                                arrayList2.add(networkConfigCreate);
                            }
                        }
                        arrayList = arrayList2;
                    } catch (Exception e10) {
                        e = e10;
                        arrayList = arrayList2;
                        Logger.w(e);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
            fillNetworkConfigs(arrayList);
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setPlacementId(@Nullable String str) {
            this.placementId = str;
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setPriceFloorParams(@Nullable PriceFloorParams priceFloorParams) {
            this.priceFloorParams = priceFloorParams;
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setSessionAdParams(@Nullable SessionAdParams sessionAdParams) {
            this.sessionAdParams = sessionAdParams;
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setTargetingParams(@Nullable TargetingParams targetingParams) {
            this.targetingParams = targetingParams;
            return this;
        }
    }

    public interface AdRequestListener<AdRequestType extends AdRequest> {
        void onRequestExpired(@NonNull AdRequestType adrequesttype);

        void onRequestFailed(@NonNull AdRequestType adrequesttype, @NonNull BMError bMError);

        void onRequestSuccess(@NonNull AdRequestType adrequesttype, @NonNull AuctionResult auctionResult);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u uVarReceive = w0.get().receive(AdRequest.this.adRequestParameters);
            if (uVarReceive != null) {
                AdRequest.this.processApiRequestSuccess(uVarReceive);
            } else {
                AdRequest.this.processApiRequestFail(BMError.TimeoutError, false);
                AdRequest.this.cancel();
            }
        }
    }

    public class b extends BidMachineTrackingObject {
        @Override // io.bidmachine.BidMachineTrackingObject, io.bidmachine.tracking.SessionTrackingObject, io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
        public /* bridge */ /* synthetic */ void eventStart(@NonNull TrackEventType trackEventType) {
            super.eventStart(trackEventType);
        }

        public b(Object obj) {
            super(obj);
        }

        @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
        @Nullable
        public AdExtension.EventConfiguration getEventConfiguration() {
            u adResponse = AdRequest.this.getAdResponse();
            return adResponse != null ? adResponse.getEventConfiguration() : super.getEventConfiguration();
        }

        @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
        @Nullable
        public List<String> getTrackingUrls(@NonNull TrackEventType trackEventType) {
            u adResponse = AdRequest.this.getAdResponse();
            return adResponse != null ? adResponse.getTrackUrlListByEvent(trackEventType) : super.getTrackingUrls(trackEventType);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Context val$applicationContext;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$0() {
            return "Request start";
        }

        public c(Context context) {
            this.val$applicationContext = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AdRequest.this.cancel();
                AdRequest.this.unsubscribeTimeOut();
                AdRequest<?, ?, ?> adRequest = AdRequest.this;
                u uVar = adRequest.adResponse;
                if (uVar != null) {
                    uVar.detachAdRequest(adRequest);
                    AdRequest.this.adResponse = null;
                }
                AdRequest.this.isApiRequestCanceled.set(false);
                AdRequest.this.isApiRequestCompleted.set(false);
                AdRequest.this.subscribeTimeOut();
                AdRequest.this.log(new LazyValue() { // from class: io.bidmachine.k
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return AdRequest.c.lambda$run$0();
                    }
                });
                AdRequest.this.trackingObject.eventStart(TrackEventType.AuctionRequest);
                ResponsePayload bidPayload = AdRequest.this.adRequestParameters.getBidPayload();
                if (bidPayload != null) {
                    AdRequest.this.processBidPayload(bidPayload);
                } else {
                    AdRequest.this.processRequestObject(this.val$applicationContext);
                }
            } catch (Throwable th2) {
                Logger.w(th2);
                AdRequest.this.processRequestFail(BMError.throwable("Exception loading ad request", th2));
            }
        }
    }

    public class d implements c5.a<u> {
        public d() {
        }

        @Override // io.bidmachine.c5.a
        public void onFail(@NonNull BMError bMError) {
            AdRequest.this.processApiRequestFail(bMError);
        }

        @Override // io.bidmachine.c5.a
        public void onSuccess(@NonNull u uVar) {
            AdRequest.this.processApiRequestSuccess(uVar);
        }
    }

    public class e implements s0.a {
        public final /* synthetic */ ApiRequest.Builder val$requestBuilder;
        public final /* synthetic */ String val$url;

        public e(String str, ApiRequest.Builder builder) {
            this.val$url = str;
            this.val$requestBuilder = builder;
        }

        @Override // io.bidmachine.s0.a
        public void onCancel() {
            AdRequest.this.processApiRequestCancel();
        }

        @Override // io.bidmachine.s0.a
        public void onFail(@Nullable BMError bMError) {
            AdRequest.this.processApiRequestLoadedFail(this.val$requestBuilder, bMError);
        }

        @Override // io.bidmachine.s0.a
        public void onSuccess(@NonNull u uVar) {
            AdRequest.this.setAuctionUrl(this.val$url);
            AdRequest.this.processApiRequestSuccess(uVar);
        }
    }

    public interface f<AdRequestType extends AdRequest> {
        void onRequestDestroyed(@NonNull AdRequestType adrequesttype);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$collectNetworkConfig$0(NetworkConfig networkConfig, String str) {
        return String.format("%s was removed from AdRequest: %s", networkConfig.getNetworkKey(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$destroy$3() {
        return "destroy";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$log$7(LazyValue lazyValue) {
        return String.format("%s - %s", this.adRequestParameters.getAdsType(), lazyValue.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$logError$8(LazyValue lazyValue) {
        return String.format("%s - %s", this.adRequestParameters.getAdsType(), lazyValue.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$notifyMediationLoss$2(String str, Double d10) {
        return String.format("notifyMediationLoss (winnerNetworkName - %s, winnerNetworkPrice - %s)", str, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$notifyMediationWin$1() {
        return "notifyMediationWin";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$processApiRequestSuccess$5(u uVar) {
        return String.format("Request success - %s", uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$processExpired$4() {
        return "Request expired";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$processRequestFail$6(BMError bMError) {
        return String.format("Request fail - %s", bMError);
    }

    @NonNull
    public abstract UnifiedAdRequestParamsType createUnifiedAdRequestParams(@NonNull AdRequestParametersType adrequestparameterstype, @NonNull TargetingParams targetingParams, @NonNull DataRestrictions dataRestrictions);

    public boolean isPlacementBuilderMatch(@NonNull PlacementBuilder placementBuilder) {
        return true;
    }

    public void notifyMediationLoss() {
        notifyMediationLoss(null, null);
    }

    public void onBeforeSetDisplayPlacementBuilder(@NonNull Placement.DisplayPlacement.Builder builder) {
    }

    public void onBeforeSetVideoPlacementBuilder(@NonNull Placement.VideoPlacement.Builder builder) {
    }

    public void onBuildPlacement(@NonNull Placement.Builder builder) {
    }

    @VisibleForTesting
    public void processApiRequestFail(@Nullable BMError bMError) {
        processApiRequestFail(bMError, true);
    }

    @VisibleForTesting
    public void processRequestFail(@NonNull BMError bMError) {
        processRequestFail(bMError, true);
    }

    public BMError verifyRequest() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void log(@NonNull final LazyValue<String> lazyValue) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.g
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f59123a.lambda$log$7(lazyValue);
            }
        });
    }

    private void logError(@NonNull final LazyValue<String> lazyValue) {
        Logger.e(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.e
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f59104a.lambda$logError$8(lazyValue);
            }
        });
    }

    @NonNull
    private NetworkAdUnitManager obtainNetworkAdUnitManager() {
        if (this.networkAdUnitManager == null) {
            this.networkAdUnitManager = new NetworkAdUnitManager();
        }
        return this.networkAdUnitManager;
    }

    private void setLoading(boolean z10) {
        this.isLoading.set(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unsubscribeTimeOut() {
        Utils.cancelBackgroundThreadTask(this.timeOutRunnable);
    }

    public void addInternalListener(@Nullable f<SelfType> fVar) {
        if (fVar != null) {
            if (this.internalAdRequestListeners == null) {
                this.internalAdRequestListeners = new CopyOnWriteArrayList();
            }
            this.internalAdRequestListeners.add(fVar);
        }
    }

    public void addListener(@Nullable AdRequestListener<SelfType> adRequestListener) {
        if (adRequestListener != null) {
            if (this.adRequestListeners == null) {
                this.adRequestListeners = new CopyOnWriteArrayList();
            }
            this.adRequestListeners.add(adRequestListener);
        }
    }

    @Nullable
    @VisibleForTesting
    public Object build(@NonNull Context context) {
        try {
            String sellerId = j2.get().getSellerId();
            if (TextUtils.isEmpty(sellerId)) {
                return BMError.notFound("SellerId");
            }
            j2 j2Var = j2.get();
            SessionManager sessionManager = SessionManager.get();
            AdvertisingDataManager.updateInfo(context);
            TargetingParams targetingParams = (TargetingParams) RequestParams.resolveParams(this.adRequestParameters.getTargetingParams(), j2Var.getTargetingParams());
            w5 userRestrictionParams = j2Var.getUserRestrictionParams();
            SessionAdParams sessionAdParams = (SessionAdParams) RequestParams.resolveParams(this.adRequestParameters.getSessionAdParams(), sessionManager.getSessionAdParams(getAdsType()).setSessionDuration(Integer.valueOf(sessionManager.getSessionDuration())));
            PriceFloorParams priceFloorParams = this.adRequestParameters.getPriceFloorParams();
            Map<String, Double> priceFloors = (priceFloorParams == null || priceFloorParams.getPriceFloors().isEmpty()) ? j2Var.getPriceFloorParams().getPriceFloors() : priceFloorParams.getPriceFloors();
            if (priceFloors.isEmpty()) {
                return BMError.notFound("PriceFloors");
            }
            Request.Builder builderNewBuilder = Request.newBuilder();
            Request.Item.Builder builderNewBuilder2 = Request.Item.newBuilder();
            builderNewBuilder2.setId(UUID.randomUUID().toString());
            builderNewBuilder2.setQty(1);
            for (Map.Entry<String, Double> entry : priceFloors.entrySet()) {
                Request.Item.Deal.Builder builderNewBuilder3 = Request.Item.Deal.newBuilder();
                builderNewBuilder3.setId(entry.getKey());
                builderNewBuilder3.setFlr(entry.getValue().doubleValue());
                builderNewBuilder3.setFlrcur("USD");
                builderNewBuilder2.addDeal(builderNewBuilder3);
            }
            builderNewBuilder.setContext(Any.pack(RequestDataRetriever.collectContext(context, j2Var, userRestrictionParams, targetingParams, sessionAdParams, null, getAdsType())));
            builderNewBuilder.setTest(j2Var.isTestMode());
            builderNewBuilder.addCur("USD");
            builderNewBuilder.setAt(2);
            builderNewBuilder.setTmax(10000);
            Placement.Builder builderNewBuilder4 = Placement.newBuilder();
            builderNewBuilder4.setSsai(0);
            builderNewBuilder4.setSdk(BidMachine.NAME);
            builderNewBuilder4.setSdkver("3.3.0");
            builderNewBuilder4.setSecure(!Utils.canUseCleartextTraffic());
            for (Message.Builder builder : collectPlacementFormats(context, null, this.adRequestParameters.getAdPlacementConfig())) {
                if (builder instanceof Placement.DisplayPlacement.Builder) {
                    Placement.DisplayPlacement.Builder builder2 = (Placement.DisplayPlacement.Builder) builder;
                    onBeforeSetDisplayPlacementBuilder(builder2);
                    builderNewBuilder4.setDisplay(builder2);
                } else {
                    if (!(builder instanceof Placement.VideoPlacement.Builder)) {
                        throw new IllegalArgumentException("Unsupported display type: " + builder);
                    }
                    Placement.VideoPlacement.Builder builder3 = (Placement.VideoPlacement.Builder) builder;
                    onBeforeSetVideoPlacementBuilder(builder3);
                    builderNewBuilder4.setVideo(builder3);
                }
            }
            Struct.Builder builderNewBuilder5 = Struct.newBuilder();
            OMSDKSettings.fillExtension(builderNewBuilder5);
            ListValue.Builder builderNewBuilder6 = ListValue.newBuilder();
            Iterator<u> it = w0.get().peek(this.adRequestParameters).iterator();
            while (it.hasNext()) {
                builderNewBuilder6.addValues(it.next().createBidCacheExtensionValue());
            }
            if (builderNewBuilder6.getValuesCount() > 0) {
                builderNewBuilder5.putFields("bid_cache", Value.newBuilder().setListValue(builderNewBuilder6).build());
            }
            if (builderNewBuilder5.getFieldsCount() > 0) {
                builderNewBuilder4.setExt(builderNewBuilder5);
            }
            onBuildPlacement(builderNewBuilder4);
            builderNewBuilder2.setSpec(Any.pack(builderNewBuilder4.build()));
            builderNewBuilder.addItem(builderNewBuilder2.build());
            Struct.Builder builderNewBuilder7 = Struct.newBuilder();
            Struct privateStruct = ExtraParamsManager.get().getPrivateStruct(context);
            if (privateStruct != null) {
                builderNewBuilder7.putAllFields(privateStruct.getFieldsMap());
            }
            if (builderNewBuilder7.getFieldsCount() > 0) {
                builderNewBuilder.setExt(builderNewBuilder7.build());
            }
            RequestExtension.Builder builderNewBuilder8 = RequestExtension.newBuilder();
            builderNewBuilder8.setSellerId(sellerId);
            String ifv = j2Var.getIFV();
            if (!TextUtils.isEmpty(ifv)) {
                builderNewBuilder8.setIfv(ifv);
            }
            builderNewBuilder8.setBmIfv(j2Var.obtainBMIFV(context));
            builderNewBuilder8.setSessionId(sessionManager.getSessionId());
            builderNewBuilder.addExtProto(Any.pack(builderNewBuilder8.build()));
            return builderNewBuilder.build();
        } catch (Throwable th2) {
            Logger.w(th2);
            return BMError.throwable("Exception creating ad request", th2);
        }
    }

    public void cancel() {
        this.adResponseLoader.cancel();
    }

    @NonNull
    @VisibleForTesting
    public List<NetworkConfig> collectNetworkConfig(@NonNull Context context, @NonNull AdsType adsType, @Nullable List<String> list) {
        HashMap map = new HashMap();
        List<NetworkConfig> networkConfigList = this.adRequestParameters.getNetworkConfigList();
        if (networkConfigList == null) {
            Utils.putAll(map, NetworkRegistry.copyOrNullInitializedNetworkConfigs(adsType));
        } else {
            map.putAll(NetworkRegistry.createInitNetworkConfigMap());
            for (final NetworkConfig networkConfig : networkConfigList) {
                final String strCheckAndPutNetwork = NetworkRegistry.checkAndPutNetwork(context, adsType, networkConfig, map);
                if (strCheckAndPutNetwork != null) {
                    logError(new LazyValue() { // from class: io.bidmachine.b
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            return AdRequest.lambda$collectNetworkConfig$0(networkConfig, strCheckAndPutNetwork);
                        }
                    });
                }
            }
        }
        if (list != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (!list.contains((String) ((Map.Entry) it.next()).getKey())) {
                    it.remove();
                }
            }
        }
        Utils.putAll(map, NetworkRegistry.copyOrNullInitializedCoreNetworkConfigs(adsType));
        return new ArrayList(map.values());
    }

    @NonNull
    public List<Message.Builder> collectPlacementFormats(@NonNull Context context, @Nullable List<String> list, @Nullable AdPlacementConfig adPlacementConfig) throws IllegalStateException {
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        AdsType adsType = getAdsType();
        adsType.collectPlacements(new SimpleContextProvider(context), this, obtainUnifiedRequestParams(), collectNetworkConfig(context, adsType, list), arrayList, copyOnWriteArrayList, adPlacementConfig, j2.get().getNetworksLoadingTimeOutSec());
        this.networkAdUnitManager = new NetworkAdUnitManager(copyOnWriteArrayList);
        return arrayList;
    }

    public void destroy() {
        if (this.isDestroyed.compareAndSet(false, true)) {
            log(new LazyValue() { // from class: io.bidmachine.c
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return AdRequest.lambda$destroy$3();
                }
            });
            this.trackingObject.eventFinish(TrackEventType.AuctionRequestDestroy, getAdsType(), this.adResponse, (BMError) null);
            cancel();
            unsubscribeTimeOut();
            this.trackingObject.clear();
            BidMachineFetcher.release(this);
            notifyRequestDestroyed();
            this.unifiedAdRequestParams = null;
            u uVar = this.adResponse;
            if (uVar != null) {
                uVar.detachAdRequest(this);
                this.adResponse = null;
            }
        }
    }

    @NonNull
    public AdRequestParametersType getAdRequestParameters() {
        return this.adRequestParameters;
    }

    @Nullable
    public u getAdResponse() {
        return this.adResponse;
    }

    @NonNull
    public final AdsType getAdsType() {
        return this.adRequestParameters.getAdsType();
    }

    @Nullable
    public AuctionResult getAuctionResult() {
        u uVar = this.adResponse;
        if (uVar != null) {
            return uVar.getAuctionResult();
        }
        return null;
    }

    public boolean isAdResponseExpired() {
        u uVar = this.adResponse;
        return uVar != null && uVar.isExpired();
    }

    public boolean isCanceled() {
        return this.isApiRequestCanceled.get();
    }

    public boolean isCompleted() {
        return this.isApiRequestCompleted.get();
    }

    public boolean isDestroyed() {
        return this.isDestroyed.get();
    }

    public boolean isLoading() {
        return this.isLoading.get();
    }

    public void notifyMediationLoss(@Nullable final String str, @Nullable final Double d10) {
        BMError bMError;
        if (isCompleted()) {
            log(new LazyValue() { // from class: io.bidmachine.h
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return AdRequest.lambda$notifyMediationLoss$2(str, d10);
                }
            });
            if (isDestroyed()) {
                bMError = BMError.RequestDestroyed;
            } else {
                bMError = isExpired() ? BMError.RequestExpired : null;
            }
            this.trackingObject.eventFinish(TrackEventType.MediationLoss, getAdsType(), new EventData().setNetworkName(str).setPrice(d10), bMError);
        }
    }

    public void notifyRequestDestroyed() {
        List<f<SelfType>> list = this.internalAdRequestListeners;
        if (list != null) {
            Iterator<f<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestDestroyed(this);
            }
        }
    }

    @NonNull
    public final UnifiedAdRequestParamsType obtainUnifiedRequestParams() {
        if (this.unifiedAdRequestParams == null) {
            j2 j2Var = j2.get();
            this.unifiedAdRequestParams = (UnifiedAdRequestParamsType) createUnifiedAdRequestParams(this.adRequestParameters, (TargetingParams) RequestParams.resolveParams(this.adRequestParameters.getTargetingParams(), j2Var.getTargetingParams()), j2Var.getUserRestrictionParams());
        }
        return this.unifiedAdRequestParams;
    }

    @VisibleForTesting
    public String pollUrl() {
        if (this.auctionUrlQueue.isEmpty()) {
            this.auctionUrlQueue.addAll(UrlProvider.getAuctionUrlQueue());
        }
        return this.auctionUrlQueue.poll();
    }

    @VisibleForTesting
    public void prepareUrls() {
        this.auctionUrlQueue.clear();
        this.auctionUrlQueue.addAll(UrlProvider.getAuctionUrlQueue());
    }

    @VisibleForTesting
    public void processApiRequestFail(@Nullable BMError bMError, boolean z10) {
        if (canProcessApiRequestResult()) {
            setLoading(false);
            this.isApiRequestCompleted.set(true);
            if (bMError == null) {
                bMError = BMError.BMServerNoFill;
            }
            processRequestFail(bMError, z10);
        }
    }

    public void processExpired() {
        log(new LazyValue() { // from class: io.bidmachine.i
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return AdRequest.lambda$processExpired$4();
            }
        });
        this.isRequestExpired.set(true);
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            Iterator<AdRequestListener<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestExpired(this);
            }
        }
        Iterator<AdRequestListener<?>> it2 = j2.get().getAdRequestListeners().iterator();
        while (it2.hasNext()) {
            it2.next().onRequestExpired(this);
        }
        this.trackingObject.eventFinish(TrackEventType.AuctionRequestExpired, getAdsType(), this.adResponse, (BMError) null);
    }

    @VisibleForTesting
    public void processRequestFail(@NonNull final BMError bMError, boolean z10) {
        log(new LazyValue() { // from class: io.bidmachine.j
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return AdRequest.lambda$processRequestFail$6(bMError);
            }
        });
        unsubscribeTimeOut();
        if (z10) {
            clearNetworkAdUnits();
        }
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            Iterator<AdRequestListener<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestFailed(this, bMError);
            }
        }
        Iterator<AdRequestListener<?>> it2 = j2.get().getAdRequestListeners().iterator();
        while (it2.hasNext()) {
            it2.next().onRequestFailed(this, bMError);
        }
        this.trackingObject.eventFinish(TrackEventType.AuctionRequest, getAdsType(), (EventData) null, bMError);
    }

    public void removeInternalListener(@Nullable f<SelfType> fVar) {
        List<f<SelfType>> list = this.internalAdRequestListeners;
        if (list == null || fVar == null) {
            return;
        }
        list.remove(fVar);
    }

    public void removeListener(@Nullable AdRequestListener<SelfType> adRequestListener) {
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list == null || adRequestListener == null) {
            return;
        }
        list.remove(adRequestListener);
    }

    @VisibleForTesting
    public void retrieveBody(@NonNull String str) {
        processRequestBuilder(new ApiRequest.Builder().setMethod(NetworkRequest.Method.Get).setDataBinder(new ApiRequest.ApiResponseAuctionDataBinder()), str);
    }

    public void setAuctionUrl(@NonNull String str) {
        this.auctionUrlQueue.clear();
        this.auctionUrlQueue.add(str);
    }

    @NonNull
    public String toString() {
        return this.tag.toString();
    }

    public AdRequest(@NonNull AdRequestParametersType adrequestparameterstype) {
        String string = UUID.randomUUID().toString();
        this.f58490id = string;
        this.isLoading = new AtomicBoolean(false);
        this.isApiRequestCanceled = new AtomicBoolean(false);
        this.isApiRequestCompleted = new AtomicBoolean(false);
        this.isRequestExpired = new AtomicBoolean(false);
        this.isDestroyed = new AtomicBoolean(false);
        this.timeOutRunnable = new a();
        this.trackingObject = new b(string);
        this.adRequestParameters = adrequestparameterstype;
        this.adResponseLoader = new s0(string);
        this.auctionUrlQueue = new LinkedList();
    }

    private boolean canProcessApiRequestResult() {
        if (!isCompleted() && !isCanceled() && !isDestroyed()) {
            return true;
        }
        return false;
    }

    private boolean canSendApiRequest() {
        return !isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processApiRequestCancel() {
        if (!canProcessApiRequestResult()) {
            return;
        }
        setLoading(false);
        this.isApiRequestCanceled.set(true);
        unsubscribeTimeOut();
        this.trackingObject.eventFinish(TrackEventType.AuctionRequestCancel, getAdsType(), (EventData) null, (BMError) null);
        this.trackingObject.clearEvent(TrackEventType.AuctionRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processRequestObject(@NonNull Context context) {
        BMError bMErrorInternal;
        prepareUrls();
        Object objBuild = build(context);
        if (objBuild instanceof Request) {
            processRequestBuilder(new ApiRequest.Builder().setRequestData((Request) objBuild).setDataBinder(getAdsType().getBinder()), pollUrl());
            return;
        }
        if (objBuild instanceof BMError) {
            bMErrorInternal = (BMError) objBuild;
        } else {
            bMErrorInternal = BMError.internal("Failed to create ad request");
        }
        processRequestFail(bMErrorInternal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void subscribeTimeOut() {
        int iObtainTimeOutMs = obtainTimeOutMs();
        if (iObtainTimeOutMs > 0) {
            Utils.onBackgroundThread(this.timeOutRunnable, iObtainTimeOutMs);
        }
    }

    public void clearNetworkAdUnits() {
        obtainNetworkAdUnitManager().notifyNetworkClearAuction();
    }

    @VisibleForTesting
    public boolean isBidPayloadValid(@NonNull ResponsePayload responsePayload) {
        Placement requestItemSpec = responsePayload.getRequestItemSpec();
        try {
            if (requestItemSpec != Placement.getDefaultInstance() && !this.adRequestParameters.isPlacementObjectValid(requestItemSpec)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            Logger.w(th2);
            return false;
        }
    }

    public boolean isExpired() {
        if (!isAdResponseExpired() && !this.isRequestExpired.get()) {
            return false;
        }
        return true;
    }

    public void notifyMediationWin() {
        BMError bMError;
        if (!isCompleted()) {
            return;
        }
        log(new LazyValue() { // from class: io.bidmachine.d
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return AdRequest.lambda$notifyMediationWin$1();
            }
        });
        if (isDestroyed()) {
            bMError = BMError.RequestDestroyed;
        } else if (isExpired()) {
            bMError = BMError.RequestExpired;
        } else {
            bMError = null;
        }
        this.trackingObject.eventFinish(TrackEventType.MediationWin, getAdsType(), this.adResponse, bMError);
    }

    @VisibleForTesting
    public int obtainTimeOutMs() {
        Integer timeOutMs;
        int requestTimeOutMs = j2.get().getRequestTimeOutMs();
        if (requestTimeOutMs <= 0 && (timeOutMs = this.adRequestParameters.getTimeOutMs()) != null && timeOutMs.intValue() > 0) {
            return timeOutMs.intValue();
        }
        return requestTimeOutMs;
    }

    @VisibleForTesting
    public void processApiRequestLoadedFail(@NonNull ApiRequest.Builder<Request, Response> builder, @Nullable BMError bMError) {
        String strPoll;
        if (!canProcessApiRequestResult()) {
            return;
        }
        if (bMError != BMError.BMServerNoFill && (strPoll = this.auctionUrlQueue.poll()) != null) {
            processRequestBuilder(builder, strPoll);
        } else {
            processApiRequestFail(bMError);
        }
    }

    @VisibleForTesting
    public void processApiRequestSuccess(@NonNull final u uVar) {
        if (!canProcessApiRequestResult()) {
            uVar.detachAdRequest(this);
            return;
        }
        setLoading(false);
        this.isApiRequestCompleted.set(true);
        unsubscribeTimeOut();
        log(new LazyValue() { // from class: io.bidmachine.f
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return AdRequest.lambda$processApiRequestSuccess$5(uVar);
            }
        });
        this.adResponse = uVar;
        uVar.attachAdRequest(this);
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            Iterator<AdRequestListener<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestSuccess(this, uVar.getAuctionResult());
            }
        }
        Iterator<AdRequestListener<?>> it2 = j2.get().getAdRequestListeners().iterator();
        while (it2.hasNext()) {
            it2.next().onRequestSuccess(this, uVar.getAuctionResult());
        }
        this.trackingObject.eventFinish(TrackEventType.AuctionRequest, getAdsType(), uVar, (BMError) null);
    }

    public void processBidPayload(@NonNull ResponsePayload responsePayload) {
        if (responsePayload == ResponsePayload.getDefaultInstance()) {
            processRequestFail(BMError.incorrectContent("BidPayload has invalid content"));
            return;
        }
        if (!isBidPayloadValid(responsePayload)) {
            processRequestFail(BMError.incorrectContent("BidPayload does not match with AdRequest"));
            return;
        }
        Openrtb responseCache = responsePayload.getResponseCache();
        if (responseCache != null && responseCache != Openrtb.getDefaultInstance()) {
            c5.toAdResponse(this.adRequestParameters, obtainNetworkAdUnitManager(), responseCache.getResponse(), new d());
            return;
        }
        String responseCacheUrl = responsePayload.getResponseCacheUrl();
        if (!TextUtils.isEmpty(responseCacheUrl) && Utils.isHttpUrl(responseCacheUrl)) {
            retrieveBody(responseCacheUrl);
        } else {
            processRequestFail(BMError.incorrectContent("BidPayload does not contain Response or URL"));
        }
    }

    @VisibleForTesting
    public void processRequestBuilder(@NonNull ApiRequest.Builder<Request, Response> builder, @NonNull String str) {
        if (!canSendApiRequest()) {
            return;
        }
        builder.url(str);
        this.adResponseLoader.load(this.adRequestParameters, obtainNetworkAdUnitManager(), builder, new e(str, builder));
    }

    public void request(@NonNull Context context) {
        if (!j2.get().isInitialized()) {
            processRequestFail(BMError.internal("BidMachine not initialized"));
            return;
        }
        if (isDestroyed()) {
            processRequestFail(BMError.RequestDestroyed);
            return;
        }
        BMError bMErrorVerifyRequest = verifyRequest();
        if (bMErrorVerifyRequest != null) {
            processRequestFail(bMErrorVerifyRequest);
        } else {
            if (isLoading()) {
                return;
            }
            setLoading(true);
            l.get().execute(new c(context.getApplicationContext()));
        }
    }
}
