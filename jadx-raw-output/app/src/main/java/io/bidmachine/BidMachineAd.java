package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.IAd;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.models.AdObject;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BidMachineAd<SelfType extends IAd, AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectType extends AdObject<AdObjectParamsType, UnifiedAdRequestParamsType, ?>, AdObjectParamsType extends AdObjectParams, UnifiedAdRequestParamsType extends UnifiedAdRequestParams, AdListenerType extends AdListener<SelfType>> implements IAd<SelfType, AdRequestType> {

    @Nullable
    @VisibleForTesting
    public AdRequestType adRequest;

    @NonNull
    private final AdsType adsType;

    @NonNull
    private final ContextProvider contextProvider;

    @Nullable
    private AdListenerType listener;
    private final Tag tag = new Tag("BidMachineAd");

    @NonNull
    private State currentState = State.Idle;
    private final AdRequest.AdRequestListener<AdRequestType> adRequestListener = new b();
    private final AdRequest.f<AdRequestType> internalAdRequestListener = new c();

    @VisibleForTesting
    public final AdProcessCallback adProcessCallback = new d();

    @NonNull
    @VisibleForTesting
    public final BidMachineTrackingObject trackingObject = new a();

    @NonNull
    public final AtomicBoolean isFinishTracked = new AtomicBoolean(false);

    @NonNull
    public final AtomicBoolean isCloseTracked = new AtomicBoolean(false);

    public enum State {
        Idle,
        Requesting,
        Loading,
        Success,
        Failed,
        Destroyed,
        Expired
    }

    public class a extends BidMachineTrackingObject {
        @Override // io.bidmachine.BidMachineTrackingObject, io.bidmachine.tracking.SessionTrackingObject, io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
        public /* bridge */ /* synthetic */ void eventStart(@NonNull TrackEventType trackEventType) {
            super.eventStart(trackEventType);
        }

        public a() {
        }

        @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
        @Nullable
        public AdExtension.EventConfiguration getEventConfiguration() {
            u adResponse = BidMachineAd.this.getAdResponse();
            return adResponse != null ? adResponse.getEventConfiguration() : super.getEventConfiguration();
        }

        @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
        @Nullable
        public List<String> getTrackingUrls(@NonNull TrackEventType trackEventType) {
            u adResponse = BidMachineAd.this.getAdResponse();
            if (adResponse != null) {
                return adResponse.getTrackUrls(trackEventType);
            }
            return null;
        }
    }

    public class b implements AdRequest.AdRequestListener<AdRequestType> {
        public b() {
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        public void onRequestExpired(@NonNull AdRequestType adrequesttype) {
            BidMachineAd bidMachineAd = BidMachineAd.this;
            if (adrequesttype == bidMachineAd.adRequest) {
                bidMachineAd.adProcessCallback.processExpired();
            }
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        public void onRequestFailed(@NonNull AdRequestType adrequesttype, @NonNull BMError bMError) {
            BidMachineAd bidMachineAd = BidMachineAd.this;
            if (adrequesttype == bidMachineAd.adRequest) {
                bidMachineAd.processRequestFail(bMError);
            }
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        public void onRequestSuccess(@NonNull AdRequestType adrequesttype, @NonNull AuctionResult auctionResult) {
            BidMachineAd bidMachineAd = BidMachineAd.this;
            if (adrequesttype == bidMachineAd.adRequest) {
                bidMachineAd.processRequestSuccess(adrequesttype);
            }
        }
    }

    public class c implements AdRequest.f<AdRequestType> {
        public c() {
        }

        @Override // io.bidmachine.AdRequest.f
        public void onRequestDestroyed(@NonNull AdRequestType adrequesttype) {
            BidMachineAd bidMachineAd = BidMachineAd.this;
            if (adrequesttype == bidMachineAd.adRequest) {
                bidMachineAd.destroy();
            }
        }
    }

    public class d extends q5 {

        @Nullable
        private AdCridThreadHandler adCridThreadHandler;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BidMachineAd.this.listener != null) {
                    BidMachineAd.this.log("notify AdLoaded");
                    BidMachineAd.this.listener.onAdLoaded(BidMachineAd.this);
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BidMachineAd.this.listener != null) {
                    BidMachineAd.this.log("notify AdImpression");
                    BidMachineAd.this.listener.onAdImpression(BidMachineAd.this);
                }
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BidMachineAd.this.listener != null) {
                    BidMachineAd.this.log("notify AdClicked");
                    BidMachineAd.this.listener.onAdClicked(BidMachineAd.this);
                }
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.BidMachineAd$d$d, reason: collision with other inner class name */
        public class RunnableC0491d implements Runnable {
            public RunnableC0491d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BidMachineAd.this.listener instanceof AdRewardedListener) {
                    BidMachineAd.this.log("notify AdRewarded");
                    ((AdRewardedListener) BidMachineAd.this.listener).onAdRewarded(BidMachineAd.this);
                }
            }
        }

        public class e implements Runnable {
            public e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BidMachineAd.this.listener != null) {
                    BidMachineAd.this.log("notify AdExpired");
                    BidMachineAd.this.listener.onAdExpired(BidMachineAd.this);
                }
            }
        }

        public d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$processClosed$3() {
            if (BidMachineAd.this.listener instanceof AdFullScreenListener) {
                BidMachineAd.this.log("notify AdClosed");
                AdFullScreenListener adFullScreenListener = (AdFullScreenListener) BidMachineAd.this.listener;
                BidMachineAd bidMachineAd = BidMachineAd.this;
                adFullScreenListener.onAdClosed(bidMachineAd, bidMachineAd.isFinishTracked.get());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$processLoadFail$1(BMError bMError) {
            if (BidMachineAd.this.listener != null) {
                BidMachineAd.this.log("notify AdLoadFailed");
                BidMachineAd.this.listener.onAdLoadFailed(BidMachineAd.this, bMError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$processLoadSuccess$0(u uVar) {
            Utils.ifNotNull(this.adCridThreadHandler, new s1());
            if (uVar.isCridMonitoringEnabled) {
                this.adCridThreadHandler = new AdCridThreadHandler(uVar.getAuctionResult().getCreativeId());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$processShowFail$2(BMError bMError) {
            if (BidMachineAd.this.listener != null) {
                BidMachineAd.this.log("notify AdShowFailed");
                BidMachineAd.this.listener.onAdShowFailed(BidMachineAd.this, bMError);
            }
        }

        @Override // io.bidmachine.q5, io.bidmachine.AdProcessCallback
        public void processClicked() {
            if (BidMachineAd.this.currentState.ordinal() > State.Success.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processClicked");
            Utils.onUiThread(new c());
        }

        @Override // io.bidmachine.q5, io.bidmachine.AdProcessCallback
        public void processClosed() {
            if (BidMachineAd.this.currentState.ordinal() <= State.Success.ordinal() && BidMachineAd.this.isCloseTracked.compareAndSet(false, true)) {
                BidMachineAd.this.log("processClosed (" + BidMachineAd.this.isFinishTracked.get() + ")");
                Utils.onUiThread(new Runnable() { // from class: io.bidmachine.t1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60964b.lambda$processClosed$3();
                    }
                });
            }
        }

        @Override // io.bidmachine.q5, io.bidmachine.AdProcessCallback
        public void processDestroy() {
            BidMachineAd.this.log("destroy requested");
            BidMachineAd.this.currentState = State.Destroyed;
            u adResponse = BidMachineAd.this.getAdResponse();
            if (adResponse != null) {
                adResponse.removeCallback(this);
            }
            BidMachineAd.this.destroyAdRequest();
            Utils.ifNotNull(this.adCridThreadHandler, new s1());
            this.adCridThreadHandler = null;
        }

        @Override // io.bidmachine.q5, io.bidmachine.AdProcessCallback
        public void processExpired() {
            if (BidMachineAd.this.currentState.ordinal() > State.Success.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processExpired");
            BidMachineAd.this.currentState = State.Expired;
            Utils.onUiThread(new e());
            Utils.ifNotNull(this.adCridThreadHandler, new s1());
            this.adCridThreadHandler = null;
        }

        @Override // io.bidmachine.q5, io.bidmachine.AdProcessCallback
        public void processFillAd() {
            if (BidMachineAd.this.currentState.ordinal() > State.Success.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processFillAd");
        }

        @Override // io.bidmachine.q5, io.bidmachine.AdProcessCallback
        public void processFinished() {
            if (BidMachineAd.this.currentState.ordinal() <= State.Success.ordinal() && BidMachineAd.this.isFinishTracked.compareAndSet(false, true)) {
                BidMachineAd.this.log("processFinished");
                Utils.onUiThread(new RunnableC0491d());
            }
        }

        @Override // io.bidmachine.q5, io.bidmachine.AdProcessCallback
        public void processLoadFail(@NonNull final BMError bMError) {
            BidMachineAd.this.log("processLoadFail - " + bMError);
            BidMachineAd.this.currentState = State.Failed;
            Utils.onUiThread(new Runnable() { // from class: io.bidmachine.u1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f60970b.lambda$processLoadFail$1(bMError);
                }
            });
        }

        @Override // io.bidmachine.q5, io.bidmachine.AdProcessCallback
        public void processLoadSuccess() {
            if (BidMachineAd.this.currentState.ordinal() > State.Loading.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processLoadSuccess");
            BidMachineAd.this.currentState = State.Success;
            Utils.onUiThread(new a());
            Utils.ifNotNull(BidMachineAd.this.getAdResponse(), new Executable() { // from class: io.bidmachine.r1
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    this.f59977a.lambda$processLoadSuccess$0((u) obj);
                }
            });
        }

        @Override // io.bidmachine.q5, io.bidmachine.AdProcessCallback
        public void processShowFail(@NonNull final BMError bMError) {
            BidMachineAd.this.log("processShowFail - " + bMError);
            Utils.onUiThread(new Runnable() { // from class: io.bidmachine.v1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f60981b.lambda$processShowFail$2(bMError);
                }
            });
        }

        @Override // io.bidmachine.q5, io.bidmachine.AdProcessCallback
        public void processShown() {
            if (BidMachineAd.this.currentState.ordinal() > State.Success.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processShown");
            Utils.onUiThread(new b());
        }

        @Override // io.bidmachine.q5, io.bidmachine.AdProcessCallback
        public void processVisibilityTrackerImpression() {
            if (BidMachineAd.this.currentState.ordinal() > State.Success.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processImpression");
        }
    }

    public abstract AdObjectType createAdObject(@NonNull ContextProvider contextProvider, @NonNull AdRequestType adrequesttype, @NonNull NetworkAdapter networkAdapter, @NonNull AdObjectParams adObjectParams, @NonNull AdProcessCallback adProcessCallback);

    private void attachRequest(@Nullable AdRequestType adrequesttype) {
        if (adrequesttype != null) {
            adrequesttype.addListener(this.adRequestListener);
            adrequesttype.addInternalListener(this.internalAdRequestListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyAdRequest() {
        AdRequestType adrequesttype = this.adRequest;
        this.adRequest = null;
        if (adrequesttype != null) {
            detachRequest(adrequesttype);
            adrequesttype.destroy();
        }
    }

    private void detachRequest(@Nullable AdRequestType adrequesttype) {
        if (adrequesttype != null) {
            adrequesttype.removeListener(this.adRequestListener);
            adrequesttype.removeInternalListener(this.internalAdRequestListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$log$0(String str) {
        StringBuilder sb2 = new StringBuilder(this.adsType.name());
        AuctionResult auctionResult = getAuctionResult();
        if (auctionResult != null) {
            sb2.append(" (");
            sb2.append(auctionResult.getNetworkKey());
            sb2.append(")");
        }
        return String.format("%s - %s", sb2, str);
    }

    private void processRequest(@NonNull AdRequestType adrequesttype) {
        log("process request start");
        if (getAuctionResult() != null) {
            processRequestSuccess(adrequesttype);
        } else {
            this.currentState = State.Requesting;
            adrequesttype.request(getContext());
        }
    }

    private void trackEvent(@NonNull TrackEventType trackEventType, @Nullable BMError bMError) {
        this.trackingObject.eventFinish(trackEventType, getAdsType(), getAdResponse(), bMError);
    }

    @Override // io.bidmachine.IAd
    public void destroy() {
        this.adProcessCallback.processDestroy();
        this.trackingObject.clear();
    }

    @Nullable
    public final u getAdResponse() {
        AdRequestType adrequesttype = this.adRequest;
        if (adrequesttype != null) {
            return adrequesttype.getAdResponse();
        }
        return null;
    }

    @NonNull
    AdsType getAdsType() {
        return this.adsType;
    }

    @Override // io.bidmachine.IAd
    @Nullable
    public AuctionResult getAuctionResult() {
        AdRequestType adrequesttype = this.adRequest;
        if (adrequesttype != null) {
            return adrequesttype.getAuctionResult();
        }
        return null;
    }

    @NonNull
    Context getContext() {
        return this.contextProvider.getApplicationContext();
    }

    @NonNull
    public ContextProvider getContextProvider() {
        return this.contextProvider;
    }

    @Override // io.bidmachine.IAd
    public boolean isDestroyed() {
        return this.currentState == State.Destroyed;
    }

    @Override // io.bidmachine.IAd
    public boolean isExpired() {
        return this.currentState == State.Expired;
    }

    @Override // io.bidmachine.IAd
    public boolean isLoading() {
        State state = this.currentState;
        return state == State.Requesting || state == State.Loading;
    }

    @Override // io.bidmachine.IAd
    public SelfType load(AdRequestType adrequesttype) {
        log("load requested");
        this.trackingObject.eventStart(TrackEventType.Load);
        if (!j2.get().isInitialized()) {
            processRequestFail(BMError.internal("BidMachine not initialized"));
            return this;
        }
        if (this.currentState != State.Idle) {
            log("request process abort because it's already processing");
            return this;
        }
        if (adrequesttype == null) {
            processRequestFail(BMError.notFound("AdRequest"));
            return this;
        }
        detachRequest(this.adRequest);
        this.adRequest = adrequesttype;
        attachRequest(adrequesttype);
        processRequest(adrequesttype);
        return this;
    }

    public final void log(@NonNull final String str) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.q1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f59971a.lambda$log$0(str);
            }
        });
    }

    public void processPrepareShow() {
        trackEvent(TrackEventType.ImpressionOpportunity, null);
    }

    @VisibleForTesting
    public void processRequestFail(@NonNull BMError bMError) {
        if (this.currentState.ordinal() > State.Loading.ordinal()) {
            return;
        }
        trackEvent(TrackEventType.Load, bMError);
        this.adProcessCallback.processLoadFail(bMError);
    }

    @VisibleForTesting
    public void processRequestSuccess(@NonNull AdRequestType adrequesttype) {
        int iOrdinal = this.currentState.ordinal();
        State state = State.Loading;
        if (iOrdinal > state.ordinal()) {
            return;
        }
        this.currentState = state;
        u adResponse = adrequesttype.getAdResponse();
        if (adResponse == null) {
            processRequestFail(BMError.incorrectContent("AdResponse is null"));
        } else {
            log("start loading");
            adResponse.loadAdObject(this.contextProvider, adrequesttype, this, this.adProcessCallback);
        }
    }

    public void processShowFail(@NonNull BMError bMError) {
        trackEvent(TrackEventType.Show, bMError);
        this.adProcessCallback.processShowFail(bMError);
    }

    public SelfType setListener(@Nullable AdListenerType adlistenertype) {
        this.listener = adlistenertype;
        return this;
    }

    @NonNull
    public String toString() {
        return this.tag + ", state - " + this.currentState + ", auctionResult - " + getAuctionResult();
    }

    public BidMachineAd(@NonNull Context context, @NonNull AdsType adsType) {
        this.contextProvider = new SimpleContextProvider(context);
        this.adsType = adsType;
    }

    private boolean isNetworkAvailableDuringShow() {
        if (!l2.isShowWithoutInternet() && !Utils.isNetworkAvailable(getContext())) {
            return false;
        }
        return true;
    }

    @Override // io.bidmachine.IAd
    public boolean canShow() {
        if (isLoaded() && isCanShowAd() && isNetworkAvailableDuringShow()) {
            return true;
        }
        return false;
    }

    @Nullable
    public final AdObjectType getLoadedAdObject() {
        u adResponse = getAdResponse();
        if (adResponse == null) {
            return null;
        }
        try {
            return (AdObjectType) adResponse.getAdObject();
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean isCanShowAd() {
        u adResponse = getAdResponse();
        if (adResponse != null && !adResponse.wasShown()) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.IAd
    public boolean isLoaded() {
        if (getLoadedAdObject() != null && this.currentState == State.Success) {
            return true;
        }
        return false;
    }

    @Nullable
    public AdObjectType prepareShow(boolean z10) {
        processPrepareShow();
        if (!isNetworkAvailableDuringShow()) {
            processShowFail(BMError.NoConnection);
            return null;
        }
        if (isDestroyed()) {
            processShowFail(BMError.Destroyed);
            return null;
        }
        if (isExpired()) {
            processShowFail(BMError.Expired);
            return null;
        }
        if (!isLoaded()) {
            processShowFail(BMError.internal("Ad not loaded"));
            return null;
        }
        if (z10 && !isCanShowAd()) {
            processShowFail(BMError.ResponseDuplicated);
            return null;
        }
        return (AdObjectType) getLoadedAdObject();
    }
}
