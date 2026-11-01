package io.bidmachine.tracking;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import io.bidmachine.AdsType;
import io.bidmachine.ApiRequest;
import io.bidmachine.TrackEventType;
import io.bidmachine.core.Logger;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.analytics.events.SDKEvent;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.tracking.EventTrackerImpl;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ProtoUtils;
import io.bidmachine.utils.lazy.LazyValue;

/* JADX INFO: loaded from: classes9.dex */
public class EventTrackerImpl implements EventTracker {

    @Nullable
    private AdExtension.EventConfiguration defaultEventConfiguration;

    public EventTrackerImpl() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$trySendEvent$0(int i10) {
        return String.format("Sending event to server - %s", Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$trySendEvent$1(int i10, BMError bMError) {
        return String.format("Sending error event to server - %s, error - %s", Integer.valueOf(i10), bMError);
    }

    private static boolean trySendEvent(@Nullable AdExtension.EventConfiguration eventConfiguration, final int i10, long j10, long j11, @Nullable AdsType adsType, @Nullable String str, @Nullable Double d10, @Nullable Struct struct, @Nullable final BMError bMError) {
        if (eventConfiguration != null) {
            try {
                if (eventConfiguration.getActionsList().contains(Integer.valueOf(i10))) {
                    String url = eventConfiguration.getUrl();
                    if (TextUtils.isEmpty(url)) {
                        return false;
                    }
                    if (bMError == null) {
                        Logger.d((LazyValue<String>) new LazyValue() { // from class: ei.a
                            @Override // io.bidmachine.utils.lazy.LazyValue
                            public final Object get() {
                                return EventTrackerImpl.lambda$trySendEvent$0(i10);
                            }
                        });
                    } else {
                        Logger.d((LazyValue<String>) new LazyValue() { // from class: ei.b
                            @Override // io.bidmachine.utils.lazy.LazyValue
                            public final Object get() {
                                return EventTrackerImpl.lambda$trySendEvent$1(i10, bMError);
                            }
                        });
                    }
                    SDKEvent.Builder finishTime = SDKEvent.newBuilder().setAction(i10).setContext(eventConfiguration.getContext()).setStartTime(ProtoUtils.msToProtobufTimestamp(j10)).setFinishTime(ProtoUtils.msToProtobufTimestamp(j11));
                    if (adsType != null) {
                        finishTime.setAdType(StringValue.newBuilder().setValue(adsType.getName()).build());
                    }
                    if (!TextUtils.isEmpty(str)) {
                        finishTime.setNetwork(StringValue.newBuilder().setValue(str).build());
                    }
                    if (d10 != null) {
                        finishTime.setPrice(d10.doubleValue());
                    }
                    if (struct != null) {
                        finishTime.setCustomParams(struct);
                    }
                    if (bMError != null) {
                        Error.Builder error = Error.newBuilder().setError(toErrorData(bMError));
                        BMError errorExtension = bMError.getErrorExtension();
                        if (errorExtension != null) {
                            error.setReason(toErrorData(errorExtension));
                        }
                        finishTime.setError(error);
                    }
                    new ApiRequest.Builder().url(url).setMethod(NetworkRequest.Method.Post).setDataBinder(new ApiRequest.ApiEventDataBinder()).setRequestData(finishTime.build()).request();
                    return true;
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
        return false;
    }

    public EventTrackerImpl(@Nullable AdExtension.EventConfiguration eventConfiguration) {
        setDefaultEventConfiguration(eventConfiguration);
    }

    public void setDefaultEventConfiguration(@Nullable AdExtension.EventConfiguration eventConfiguration) {
        if (eventConfiguration != null && eventConfiguration.equals(AdExtension.EventConfiguration.getDefaultInstance())) {
            eventConfiguration = null;
        }
        this.defaultEventConfiguration = eventConfiguration;
    }

    @Override // io.bidmachine.tracking.EventTracker
    public void trackEvent(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo, @Nullable AdsType adsType, @Nullable BMError bMError, @Nullable EventData eventData) {
        long jCurrentTimeMillis;
        long finishTimeMs;
        String networkName;
        Double price;
        Struct customParams;
        if (bMError == null || bMError.isTrackError()) {
            if (trackEventInfo != null) {
                jCurrentTimeMillis = trackEventInfo.getStartTimeMs();
                finishTimeMs = trackEventInfo.getFinishTimeMs();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                finishTimeMs = jCurrentTimeMillis;
            }
            if (eventData != null) {
                networkName = eventData.getNetworkName();
                price = eventData.getPrice();
                customParams = eventData.getCustomParams();
            } else {
                networkName = null;
                price = null;
                customParams = null;
            }
            int actionValue = trackEventType.getActionValue();
            if (trySendEvent(trackingObject.getEventConfiguration(), actionValue, jCurrentTimeMillis, finishTimeMs, adsType, networkName, price, customParams, bMError)) {
                return;
            }
            trySendEvent(this.defaultEventConfiguration, actionValue, jCurrentTimeMillis, finishTimeMs, adsType, networkName, price, customParams, bMError);
        }
    }

    @NonNull
    private static Error.Data toErrorData(@NonNull BMError bMError) {
        return Error.Data.newBuilder().setCode(bMError.getCode()).setDescription(bMError.getMessage()).build();
    }
}
