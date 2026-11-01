package io.bidmachine;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class BidMachine {
    public static final String NAME = "BidMachine";
    private static final String TAG = "BidMachine";
    public static final String VERSION = "3.3.0";

    @NonNull
    @WorkerThread
    @Deprecated
    public static String getBidToken(@NonNull Context context, @NonNull AdsFormat adsFormat) {
        return getBidToken(context, new AdPlacementConfig.Builder(adsFormat).build());
    }

    public static void initialize(@NonNull Context context, @NonNull String str) {
        initialize(context, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getBidToken$8(String str) {
        return String.format("getBidToken - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$initialize$0(String str) {
        return String.format("initialize - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setConsentConfig$3(boolean z10, String str) {
        return String.format("setConsentConfig - %s, %s", Boolean.valueOf(z10), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setCoppa$5(Boolean bool) {
        return String.format("setCoppa - %s", bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setEndpoint$1(String str) {
        return String.format("setEndpoint - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setGPP$7(String str, List list) {
        return String.format("setGPP - %s, [%s]", str, Utils.join(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setSubjectToGDPR$4(Boolean bool) {
        return String.format("setSubjectToGDPR - %s", bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setTestMode$2(boolean z10) {
        return String.format("setTestMode - %s", Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setUSPrivacyString$6(String str) {
        return String.format("setUSPrivacyString - %s", str);
    }

    public static void registerNetworks(@NonNull NetworkConfig... networkConfigArr) {
        Logger.d("BidMachine", "registerNetworks with NetworkConfig array");
        NetworkRegistry.registerNetworks(networkConfigArr);
    }

    @NonNull
    @WorkerThread
    public static String getBidToken(@NonNull Context context, @NonNull AdPlacementConfig adPlacementConfig) {
        final String strCreateBidToken = u2.createBidToken(context.getApplicationContext(), adPlacementConfig);
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.m1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return BidMachine.lambda$getBidToken$8(strCreateBidToken);
            }
        });
        return strCreateBidToken;
    }

    public static void initialize(@NonNull Context context, @NonNull final String str, @Nullable InitializationCallback initializationCallback) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.l1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return BidMachine.lambda$initialize$0(str);
            }
        });
        j2.get().initialize(context, str, initializationCallback);
    }

    public static void registerAdRequestListener(@NonNull AdRequest.AdRequestListener<?> adRequestListener) {
        Logger.d("BidMachine", "registerAdRequestListener");
        j2.get().registerAdRequestListener(adRequestListener);
    }

    public static void setConsentConfig(final boolean z10, @Nullable final String str) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.h1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return BidMachine.lambda$setConsentConfig$3(z10, str);
            }
        });
        j2.get().getUserRestrictionParams().setConsentConfig(z10, str);
    }

    public static void setCoppa(@Nullable final Boolean bool) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.g1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return BidMachine.lambda$setCoppa$5(bool);
            }
        });
        j2.get().getUserRestrictionParams().setCoppa(bool);
    }

    public static void setEndpoint(@NonNull final String str) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.j1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return BidMachine.lambda$setEndpoint$1(str);
            }
        });
        UrlProvider.setEndpoint(str);
    }

    public static void setGPP(@Nullable final String str, @Nullable final List<Integer> list) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.f1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return BidMachine.lambda$setGPP$7(str, list);
            }
        });
        j2.get().getUserRestrictionParams().setGPP(str, list);
    }

    public static void setPublisher(@Nullable Publisher publisher) {
        Logger.d("BidMachine", "setPublisher");
        j2.get().setPublisher(publisher);
    }

    public static void setSubjectToGDPR(@Nullable final Boolean bool) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.k1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return BidMachine.lambda$setSubjectToGDPR$4(bool);
            }
        });
        j2.get().getUserRestrictionParams().setSubjectToGDPR(bool);
    }

    public static void setTargetingParams(@Nullable TargetingParams targetingParams) {
        Logger.d("BidMachine", "setTargetingParams");
        j2.get().setTargetingParams(targetingParams);
    }

    public static void setUSPrivacyString(@Nullable final String str) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.d1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return BidMachine.lambda$setUSPrivacyString$6(str);
            }
        });
        j2.get().getUserRestrictionParams().setUSPrivacyString(str);
    }

    public static void unregisterAdRequestListener(@NonNull AdRequest.AdRequestListener<?> adRequestListener) {
        Logger.d("BidMachine", "unregisterAdRequestListener");
        j2.get().unregisterAdRequestListener(adRequestListener);
    }

    @Nullable
    public static Object getExtrasParam(@NonNull Context context, @NonNull String str) {
        return ExtraParamsManager.get().getPublic(context, str);
    }

    public static boolean isInitialized() {
        return j2.get().isInitialized();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getBidToken$9(BidTokenCallback bidTokenCallback, Context context, AdPlacementConfig adPlacementConfig) {
        bidTokenCallback.onCollected(getBidToken(context, adPlacementConfig));
    }

    @WorkerThread
    public static void registerNetworks(@NonNull Context context, @NonNull String str) {
        Logger.d("BidMachine", "registerNetworks with JSON string");
        NetworkRegistry.registerNetworks(context, str);
    }

    public static void setLoggingEnabled(boolean z10) {
        if (Debugger.isLoggingLock()) {
            Logger.d("BidMachine", "setLoggingEnabled skipped");
            return;
        }
        if (z10) {
            Logger.setLoggingEnabled(true);
            Logger.d("BidMachine", "setLoggingEnabled - true");
        } else {
            Logger.d("BidMachine", "setLoggingEnabled - false");
            Logger.setLoggingEnabled(false);
        }
        NetworkRegistry.setLoggingEnabled(z10);
    }

    public static void setTestMode(final boolean z10) {
        if (Debugger.isTestModeLock()) {
            Logger.d("BidMachine", "setTestMode skipped");
        } else {
            Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.i1
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return BidMachine.lambda$setTestMode$2(z10);
                }
            });
            j2.get().setTestMode(z10);
        }
    }

    @AnyThread
    @Deprecated
    public static void getBidToken(@NonNull Context context, @NonNull AdsFormat adsFormat, @NonNull BidTokenCallback bidTokenCallback) {
        getBidToken(context, new AdPlacementConfig.Builder(adsFormat).build(), bidTokenCallback);
    }

    @AnyThread
    public static void getBidToken(@NonNull Context context, @NonNull final AdPlacementConfig adPlacementConfig, @NonNull final BidTokenCallback bidTokenCallback) {
        final Context applicationContext = context.getApplicationContext();
        BidTokenTaskManager.execute(new Runnable() { // from class: io.bidmachine.e1
            @Override // java.lang.Runnable
            public final void run() {
                BidMachine.lambda$getBidToken$9(bidTokenCallback, applicationContext, adPlacementConfig);
            }
        });
    }

    public static void registerNetworks(@NonNull Context context, @NonNull String str, @Nullable NetworkRegistryCallback networkRegistryCallback) {
        Logger.d("BidMachine", "registerNetworks with JSON string");
        NetworkRegistry.registerNetworks(context, str, networkRegistryCallback);
    }
}
