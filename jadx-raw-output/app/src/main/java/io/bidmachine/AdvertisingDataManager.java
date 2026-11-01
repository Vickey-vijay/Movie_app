package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import io.bidmachine.core.Logger;
import io.bidmachine.utils.SharedPreferenceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class AdvertisingDataManager {

    @NonNull
    private static final String GENERATED_ADVERTISING_ID = UUID.randomUUID().toString();

    @NonNull
    private static final List<b> PERSONAL_DATA_RETRIEVER_LIST;

    @NonNull
    private static final String SHARED_PREFERENCES_NAME = "ad_core_preferences";

    @NonNull
    private static final String UUID_ID = "uuid";

    @NonNull
    private static final String ZERO_ADVERTISING_ID = "00000000-0000-0000-0000-000000000000";

    @Nullable
    private static AdvertisingData advertisingData;

    @Nullable
    private static String storedAdvertisingId;

    @Nullable
    private static b successfulAdvertisingDataRetriever;

    public static class AdvertisingData {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @Nullable
        private final String f58491id;
        private final boolean limitAdTrackingEnabled;

        @Nullable
        public String getId() {
            return this.f58491id;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }

        public AdvertisingData(@Nullable String str, boolean z10) {
            this.f58491id = str;
            this.limitAdTrackingEnabled = z10;
        }
    }

    public static abstract class b {

        @NonNull
        private final AtomicBoolean isRetrieverAvailable = new AtomicBoolean(true);

        @Nullable
        public abstract AdvertisingData createAdvertisingData(@NonNull Context context) throws Throwable;

        private boolean isRetrieverAvailable() {
            return this.isRetrieverAvailable.get();
        }

        public void setIsRetrieverAvailable(boolean z10) {
            this.isRetrieverAvailable.set(z10);
        }

        @Nullable
        public AdvertisingData retrieve(@NonNull Context context) {
            if (!isRetrieverAvailable()) {
                return null;
            }
            try {
                return createAdvertisingData(context);
            } catch (NoClassDefFoundError e10) {
                setIsRetrieverAvailable(false);
                Logger.w(e10);
                return null;
            } catch (Throwable th2) {
                Logger.w(th2);
                return null;
            }
        }
    }

    public static class c extends b {
        private c() {
        }

        @Override // io.bidmachine.AdvertisingDataManager.b
        @Nullable
        public AdvertisingData createAdvertisingData(@NonNull Context context) throws Throwable {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                if (advertisingIdInfo != null) {
                    return new AdvertisingData(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
                }
                return null;
            } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException unused) {
                setIsRetrieverAvailable(false);
                return null;
            }
        }
    }

    public static class d extends b {
        private d() {
        }

        @Override // io.bidmachine.AdvertisingDataManager.b
        @Nullable
        public AdvertisingData createAdvertisingData(@NonNull Context context) throws Throwable {
            com.huawei.hms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.huawei.hms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                return new AdvertisingData(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
            }
            return null;
        }
    }

    @NonNull
    public static String getAdvertisingId(@NonNull Context context, boolean z10) {
        if (z10) {
            return ZERO_ADVERTISING_ID;
        }
        AdvertisingData advertisingData2 = advertisingData;
        String id2 = advertisingData2 != null ? advertisingData2.getId() : null;
        return (TextUtils.isEmpty(id2) || ZERO_ADVERTISING_ID.equals(id2)) ? obtainStoredAdvertisingId(context) : id2;
    }

    public static boolean isLimitAdTrackingEnabled() {
        AdvertisingData advertisingData2 = advertisingData;
        return advertisingData2 != null && advertisingData2.isLimitAdTrackingEnabled();
    }

    @NonNull
    private static String obtainStoredAdvertisingId(@NonNull Context context) {
        if (!TextUtils.isEmpty(storedAdvertisingId)) {
            return storedAdvertisingId;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        String strOptString = SharedPreferenceUtils.optString(sharedPreferences, "uuid", null);
        storedAdvertisingId = strOptString;
        if (!TextUtils.isEmpty(strOptString)) {
            return storedAdvertisingId;
        }
        storedAdvertisingId = GENERATED_ADVERTISING_ID;
        sharedPreferences.edit().putString("uuid", storedAdvertisingId).apply();
        return storedAdvertisingId;
    }

    @WorkerThread
    public static void updateInfo(@NonNull Context context) {
        b bVar = successfulAdvertisingDataRetriever;
        if (bVar != null) {
            AdvertisingData advertisingDataRetrieve = bVar.retrieve(context);
            if (advertisingDataRetrieve != null) {
                advertisingData = advertisingDataRetrieve;
                return;
            }
            return;
        }
        for (b bVar2 : PERSONAL_DATA_RETRIEVER_LIST) {
            AdvertisingData advertisingDataRetrieve2 = bVar2.retrieve(context);
            if (advertisingDataRetrieve2 != null) {
                successfulAdvertisingDataRetriever = bVar2;
                advertisingData = advertisingDataRetrieve2;
                return;
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        PERSONAL_DATA_RETRIEVER_LIST = arrayList;
        arrayList.add(new c());
        arrayList.add(new d());
    }
}
