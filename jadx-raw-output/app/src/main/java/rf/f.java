package rf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.AdContentType;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachineTrackingObject;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import io.bidmachine.NetworkRegistry;
import io.bidmachine.ProtoExtConstants;
import io.bidmachine.TrackEventType;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.tracking.EventData;
import io.bidmachine.tracking.TrackEventInfo;
import io.bidmachine.tracking.TrackingObject;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: HeaderBiddingPlacementBuilder.java */
/* JADX INFO: loaded from: classes11.dex */
public class f<UnifiedAdRequestParamsType extends UnifiedAdRequestParams> {
    private static final long DEFAULT_HB_PREPARE_TIMEOUT_SEC = 10;

    /* JADX INFO: compiled from: HeaderBiddingPlacementBuilder.java */
    public static final class a<UnifiedAdRequestParamsType extends UnifiedAdRequestParams> implements Runnable, HeaderBiddingAdRequestParams, HeaderBiddingCollectParamsCallback {
        private static final Executor executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);

        @NonNull
        private final AdContentType adContentType;

        @NonNull
        private final UnifiedAdRequestParamsType adRequestParams;
        private HeaderBiddingPlacement.AdUnit adUnit;

        @NonNull
        private final HeaderBiddingAdapter adapter;

        @NonNull
        private final AdsType adsType;

        @NonNull
        private final ContextProvider contextProvider;

        @NonNull
        private final NetworkAdUnit networkAdUnit;
        private CountDownLatch syncLock;
        private boolean isFinished = false;

        @NonNull
        private final TrackingObject trackingObject = new BidMachineTrackingObject();

        private void finish() {
            this.isFinished = true;
            this.syncLock.countDown();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String lambda$cancel$2() {
            return String.format("%s (%s) - Header bidding collect fail: timeout", this.adsType, this.adContentType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String lambda$onCollectFail$1(BMError bMError) {
            return String.format("%s (%s) - Header bidding collect fail - %s", this.adsType, this.adContentType, bMError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String lambda$onCollectFinished$0() {
            return String.format("%s (%s) - Header bidding collect finished", this.adsType, this.adContentType);
        }

        public void cancel() {
            if (this.isFinished) {
                return;
            }
            Logger.d(this.adapter.getKey(), (LazyValue<String>) new LazyValue() { // from class: rf.d
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return this.f66758a.lambda$cancel$2();
                }
            });
            finish();
        }

        public void execute(@NonNull CountDownLatch countDownLatch) {
            this.trackingObject.eventStart(TrackEventType.HeaderBiddingNetworkPrepare, new TrackEventInfo().withParameter("HB_NETWORK", this.adapter.getKey()).withParameter("BM_AD_TYPE", this.adsType.getName()));
            this.syncLock = countDownLatch;
            executor.execute(this);
        }

        @Override // io.bidmachine.HeaderBiddingAdRequestParams
        @NonNull
        public AdContentType getAdContentType() {
            return this.adContentType;
        }

        public HeaderBiddingPlacement.AdUnit getAdUnit() {
            return this.adUnit;
        }

        @Override // io.bidmachine.HeaderBiddingAdRequestParams
        @NonNull
        public AdsType getAdsType() {
            return this.adsType;
        }

        public boolean isFinished() {
            return this.isFinished;
        }

        @Override // io.bidmachine.HeaderBiddingCollectParamsCallback
        public void onCollectFail(@NonNull final BMError bMError) {
            if (this.isFinished) {
                return;
            }
            Logger.d(this.adapter.getKey(), (LazyValue<String>) new LazyValue() { // from class: rf.e
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return this.f66759a.lambda$onCollectFail$1(bMError);
                }
            });
            finish();
            this.trackingObject.eventFinish(TrackEventType.HeaderBiddingNetworkPrepare, this.adsType, new EventData().setNetworkName(this.adapter.getKey()), bMError);
        }

        @Override // io.bidmachine.HeaderBiddingCollectParamsCallback
        public void onCollectFinished(@Nullable Map<String, String> map) {
            if (this.isFinished) {
                return;
            }
            this.adUnit = HeaderBiddingPlacement.AdUnit.newBuilder().setBidder(this.adapter.getKey()).setBidderSdkver(this.adapter.obtainNetworkSdkVersion()).putClientParams(ProtoExtConstants.AD_UNIT_ID, this.networkAdUnit.getId()).putAllClientParams(this.networkAdUnit.getMediationConfig()).putAllClientParams(map).build();
            Logger.d(this.adapter.getKey(), (LazyValue<String>) new LazyValue() { // from class: rf.c
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return this.f66757a.lambda$onCollectFinished$0();
                }
            });
            finish();
            this.trackingObject.eventFinish(TrackEventType.HeaderBiddingNetworkPrepare, this.adsType, new EventData().setNetworkName(this.adapter.getKey()), null);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.adapter.collectHeaderBiddingParams(this.contextProvider, this.adRequestParams, this.networkAdUnit, this, this);
            } catch (Throwable th2) {
                Logger.w(th2);
                onCollectFail(BMError.throwable("Exception collecting header bidding parameters", th2));
            }
        }

        public a(@NonNull ContextProvider contextProvider, @NonNull HeaderBiddingAdapter headerBiddingAdapter, @NonNull AdsType adsType, @NonNull AdContentType adContentType, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull NetworkAdUnit networkAdUnit) {
            this.contextProvider = contextProvider;
            this.adapter = headerBiddingAdapter;
            this.adsType = adsType;
            this.adContentType = adContentType;
            this.adRequestParams = unifiedadrequestparamstype;
            this.networkAdUnit = networkAdUnit;
        }
    }

    @Nullable
    public HeaderBiddingAd obtainHeaderBiddingAd(@NonNull Ad ad2) {
        HeaderBiddingAd headerBiddingAdObtainHeaderBiddingAd = null;
        if (ad2.hasDisplay()) {
            Ad.Display display = ad2.getDisplay();
            headerBiddingAdObtainHeaderBiddingAd = display.hasBanner() ? obtainHeaderBiddingAd(display.getBanner().getExtProtoList()) : null;
            if (headerBiddingAdObtainHeaderBiddingAd == null && display.hasNative()) {
                headerBiddingAdObtainHeaderBiddingAd = obtainHeaderBiddingAd(display.getNative().getExtProtoList());
            }
        }
        return (headerBiddingAdObtainHeaderBiddingAd == null && ad2.hasVideo()) ? obtainHeaderBiddingAd(ad2.getVideo().getExtProtoList()) : headerBiddingAdObtainHeaderBiddingAd;
    }

    @Nullable
    public HeaderBiddingPlacement.Builder createPlacement(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull AdsType adsType, @NonNull AdContentType adContentType, @NonNull Collection<NetworkConfig> collection, @NonNull List<NetworkAdUnit> list, int i10) {
        ArrayList<a> arrayList = new ArrayList();
        Iterator<NetworkConfig> it = collection.iterator();
        while (it.hasNext()) {
            NetworkConfig next = it.next();
            NetworkAdapter adapter = NetworkRegistry.getAdapter(next.getNetworkKey());
            if ((adapter instanceof HeaderBiddingAdapter) && adapter.isInitialized(contextProvider)) {
                for (NetworkAdUnit networkAdUnit : next.createNetworkAdUnitList(adsType, unifiedadrequestparamstype, adContentType, adapter)) {
                    list.add(networkAdUnit);
                    arrayList.add(new a(contextProvider, (HeaderBiddingAdapter) adapter, adsType, adContentType, unifiedadrequestparamstype, networkAdUnit));
                    it = it;
                }
            }
            it = it;
        }
        if (!arrayList.isEmpty()) {
            BidMachineTrackingObject bidMachineTrackingObject = new BidMachineTrackingObject();
            bidMachineTrackingObject.eventStart(TrackEventType.HeaderBiddingNetworksPrepare);
            try {
                CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((a) it2.next()).execute(countDownLatch);
                }
                try {
                    countDownLatch.await(i10 > 0 ? i10 : 10L, TimeUnit.SECONDS);
                } catch (InterruptedException e10) {
                    Logger.w(e10);
                }
                ArrayList arrayList2 = null;
                for (a aVar : arrayList) {
                    HeaderBiddingPlacement.AdUnit adUnit = aVar.getAdUnit();
                    if (adUnit != null) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(adUnit);
                    } else if (!aVar.isFinished()) {
                        aVar.cancel();
                    }
                }
                if (!Utils.isEmpty(arrayList2)) {
                    HeaderBiddingPlacement.Builder builderNewBuilder = HeaderBiddingPlacement.newBuilder();
                    builderNewBuilder.addAllAdUnits(arrayList2);
                    bidMachineTrackingObject.eventFinish(TrackEventType.HeaderBiddingNetworksPrepare, adsType, (EventData) null, (BMError) null);
                    return builderNewBuilder;
                }
                bidMachineTrackingObject.eventFinish(TrackEventType.HeaderBiddingNetworksPrepare, adsType, (EventData) null, (BMError) null);
            } catch (Throwable th2) {
                bidMachineTrackingObject.eventFinish(TrackEventType.HeaderBiddingNetworksPrepare, adsType, (EventData) null, (BMError) null);
                throw th2;
            }
        }
        return null;
    }

    @Nullable
    public AdObjectParams createAdObjectParams(@NonNull Ad ad2) {
        HeaderBiddingAd headerBiddingAdObtainHeaderBiddingAd = obtainHeaderBiddingAd(ad2);
        if (headerBiddingAdObtainHeaderBiddingAd != null) {
            return new b(ad2, headerBiddingAdObtainHeaderBiddingAd);
        }
        return null;
    }

    @Nullable
    private HeaderBiddingAd obtainHeaderBiddingAd(@NonNull List<Any> list) {
        for (Any any : list) {
            if (any.is(HeaderBiddingAd.class)) {
                try {
                    return (HeaderBiddingAd) any.unpack(HeaderBiddingAd.class);
                } catch (InvalidProtocolBufferException e10) {
                    Logger.w(e10);
                }
            }
        }
        return null;
    }
}
