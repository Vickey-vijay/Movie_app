package io.bidmachine;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.core.Logger;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.tracking.EventData;
import io.bidmachine.tracking.EventTracker;
import io.bidmachine.tracking.TrackEventInfo;
import io.bidmachine.tracking.TrackingObject;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: BidMachineEventTracker.java */
/* JADX INFO: loaded from: classes4.dex */
public class a2 implements EventTracker {

    /* JADX INFO: compiled from: BidMachineEventTracker.java */
    public class a implements NetworkRequest.Callback<String, BMError> {
        public final /* synthetic */ TrackEventInfo val$trackEventInfo;
        public final /* synthetic */ TrackEventType val$trackEventType;
        public final /* synthetic */ List val$trackingErrorUrls;

        @Override // io.bidmachine.core.NetworkRequest.Callback
        public void onSuccess(@Nullable String str) {
        }

        public a(List list, TrackEventInfo trackEventInfo, TrackEventType trackEventType) {
            this.val$trackingErrorUrls = list;
            this.val$trackEventInfo = trackEventInfo;
            this.val$trackEventType = trackEventType;
        }

        @Override // io.bidmachine.core.NetworkRequest.Callback
        public void onFail(@Nullable BMError bMError) {
            if (bMError == null) {
                bMError = BMError.internal("Failed to track URL");
            }
            a2.trackTrackingError(this.val$trackingErrorUrls, this.val$trackEventInfo, this.val$trackEventType.getActionValue(), bMError);
        }
    }

    /* JADX INFO: compiled from: BidMachineEventTracker.java */
    public class b implements NetworkRequest.Callback<String, BMError> {
        public final /* synthetic */ List val$trackErrorUrls;
        public final /* synthetic */ TrackEventInfo val$trackEventInfo;

        @Override // io.bidmachine.core.NetworkRequest.Callback
        public void onSuccess(@Nullable String str) {
        }

        public b(List list, TrackEventInfo trackEventInfo) {
            this.val$trackErrorUrls = list;
            this.val$trackEventInfo = trackEventInfo;
        }

        @Override // io.bidmachine.core.NetworkRequest.Callback
        public void onFail(@Nullable BMError bMError) {
            if (bMError == null) {
                bMError = BMError.internal("Failed to track URL");
            }
            a2.trackTrackingError(this.val$trackErrorUrls, this.val$trackEventInfo, TrackEventType.Error.getActionValue(), bMError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$trackError$1(int i10, BMError bMError) {
        return String.format("Dispatching error event to server - (%s-%s) - %s", Integer.valueOf(i10), Integer.valueOf(bMError.getCode()), bMError.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$trackEvent$0(TrackEventType trackEventType) {
        return String.format("Dispatching event to server - %s", trackEventType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$trackTrackingError$2(BMError bMError) {
        return String.format("Dispatching tracking fail to server - %s", bMError);
    }

    @Nullable
    @VisibleForTesting
    public static String replaceMacros(@Nullable String str, @Nullable TrackEventInfo trackEventInfo, int i10, int i11, @Nullable EventData eventData) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strReplaceMacros = replaceMacros(replaceMacros(replaceMacros(str, Constants.URL_MACROS_BM_EVENT_CODE, Integer.valueOf(i10)), Constants.URL_MACROS_BM_ACTION_CODE, Integer.valueOf(i10)), Constants.URL_MACROS_BM_ERROR_REASON, Integer.valueOf(i11));
        if (eventData != null) {
            String networkName = eventData.getNetworkName();
            if (networkName != null) {
                strReplaceMacros = replaceMacros(strReplaceMacros, Constants.URL_MACROS_AUCTION_SEAT_ID, networkName);
            }
            Double price = eventData.getPrice();
            if (price != null) {
                strReplaceMacros = replaceMacros(strReplaceMacros, Constants.URL_MACROS_AUCTION_PRICE, price);
            }
        }
        return trackEventInfo != null ? replaceMacros(replaceMacros(replaceMacros(strReplaceMacros, Constants.URL_MACROS_BM_ACTION_START, Long.valueOf(trackEventInfo.getStartTimeMs())), Constants.URL_MACROS_BM_ACTION_FINISH, Long.valueOf(trackEventInfo.getFinishTimeMs())), trackEventInfo.getEventParameters()) : strReplaceMacros;
    }

    @Override // io.bidmachine.tracking.EventTracker
    public void trackEvent(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo, @Nullable AdsType adsType, @Nullable BMError bMError, @Nullable EventData eventData) {
        if (bMError != null) {
            trackError(collectTrackingUrls(trackingObject, TrackEventType.Error), collectTrackingUrls(trackingObject, TrackEventType.TrackingError), trackEventInfo, trackEventType.getActionValue(), bMError);
        } else {
            trackEvent(collectTrackingUrls(trackingObject, trackEventType), collectTrackingUrls(trackingObject, TrackEventType.TrackingError), trackEventInfo, trackEventType, eventData);
        }
    }

    private static void trackError(@Nullable List<String> list, @Nullable List<String> list2, @Nullable TrackEventInfo trackEventInfo, final int i10, @NonNull final BMError bMError) {
        if (list != null && bMError.isTrackError()) {
            Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.z1
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return a2.lambda$trackError$1(i10, bMError);
                }
            });
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                executeNotify(replaceMacros(it.next(), trackEventInfo, i10, bMError.getCode(), null), new b(list2, trackEventInfo));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void trackTrackingError(@Nullable List<String> list, @Nullable TrackEventInfo trackEventInfo, int i10, @NonNull final BMError bMError) {
        if (list != null && bMError.isTrackError()) {
            Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.y1
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return a2.lambda$trackTrackingError$2(bMError);
                }
            });
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                executeNotify(replaceMacros(it.next(), trackEventInfo, i10, bMError.getCode(), null), null);
            }
        }
    }

    @Nullable
    private static List<String> collectTrackingUrls(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType) {
        ArrayList arrayList;
        List<String> trackingUrls = j2.get().getTrackingUrls(trackEventType);
        if (trackingUrls != null) {
            arrayList = new ArrayList(trackingUrls);
        } else {
            arrayList = null;
        }
        List<String> trackingUrls2 = trackingObject.getTrackingUrls(trackEventType);
        if (trackingUrls2 != null) {
            if (arrayList == null) {
                return new ArrayList(trackingUrls2);
            }
            arrayList.addAll(trackingUrls2);
            return arrayList;
        }
        return arrayList;
    }

    private static void executeNotify(@Nullable String str, @Nullable NetworkRequest.Callback<String, BMError> callback) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new ApiRequest.Builder().url(str).setMethod(NetworkRequest.Method.Get).setDataBinder(new ApiRequest.ApiTrackerDataBinder()).setCallback(callback).request();
    }

    private static void trackEvent(@Nullable List<String> list, @Nullable List<String> list2, @Nullable TrackEventInfo trackEventInfo, @NonNull final TrackEventType trackEventType, @Nullable EventData eventData) {
        if (list == null) {
            return;
        }
        Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.x1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return a2.lambda$trackEvent$0(trackEventType);
            }
        });
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            executeNotify(replaceMacros(it.next(), trackEventInfo, trackEventType.getActionValue(), -1, eventData), new a(list2, trackEventInfo, trackEventType));
        }
    }

    @NonNull
    private static String replaceMacros(@NonNull String str, @Nullable Map<String, Object> map) {
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    str = replaceMacros(str, key, value);
                }
            }
        }
        return str;
    }

    @NonNull
    private static String replaceMacros(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        return str.replace("${" + str2 + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e, String.valueOf(obj)).replace("%24%7B" + str2 + "%7D", String.valueOf(obj));
    }
}
