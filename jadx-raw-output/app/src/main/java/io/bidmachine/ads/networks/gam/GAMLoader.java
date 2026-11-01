package io.bidmachine.ads.networks.gam;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.GAMUnitData;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.ads.networks.gam.versions.VersionWrapper;
import io.bidmachine.core.Logger;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes7.dex */
public class GAMLoader {
    public static final int DEFAULT_BOTTOM_BORDER_LOADED_AD = 2;
    private static final int DEFAULT_REST_AD_LOAD_MS = 500;

    @NonNull
    private final Context applicationContext;
    private final long expirationTimeMs;

    @NonNull
    private final String networkName;

    @Nullable
    private final String requestAgent;

    @NonNull
    private final Tag tag;

    @NonNull
    private final VersionWrapper versionWrapper;

    @NonNull
    private final Map<AdsFormat, GAMTypeConfig> gamTypeConfigMap = new HashMap();

    @NonNull
    private final b gamTaskLoader = new b();

    @NonNull
    @VisibleForTesting
    public final List<InternalGAMAd> gamAdList = new ArrayList();

    @NonNull
    @VisibleForTesting
    public final Map<NetworkAdUnit, InternalGAMAd> reservedGamAdMap = new WeakHashMap();

    @NonNull
    private final Object gamAdListLock = new Object();

    @NonNull
    private final Object reservedGamAdMapLock = new Object();

    public static class b {
        private static final int CORE_POOL_SIZE;
        private static final int CPU_COUNT;

        @NonNull
        private final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(CORE_POOL_SIZE);

        @NonNull
        private final Map<AdsFormat, Map<String, Future<?>>> submittedFutureMap = new EnumMap(AdsFormat.class);

        @NonNull
        private final Object submittedFutureMapLocker = new Object();

        /* JADX INFO: Access modifiers changed from: private */
        public void loadTask(@NonNull final AdsFormat adsFormat, @NonNull final c cVar) {
            try {
                synchronized (this.submittedFutureMapLocker) {
                    Map<String, Future<?>> map = this.submittedFutureMap.get(adsFormat);
                    if (map == null || map.isEmpty()) {
                        Future<?> futureSubmit = this.executorService.submit(new Runnable() { // from class: ef.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f52576b.lambda$loadTask$0(cVar, adsFormat);
                            }
                        });
                        if (map == null) {
                            map = new HashMap<>();
                            this.submittedFutureMap.put(adsFormat, map);
                        }
                        map.put(cVar.f58512id, futureSubmit);
                    }
                }
            } catch (Throwable unused) {
            }
        }

        private void removeTask(@NonNull AdsFormat adsFormat, @NonNull String str) {
            synchronized (this.submittedFutureMapLocker) {
                Map<String, Future<?>> map = this.submittedFutureMap.get(adsFormat);
                if (map != null) {
                    map.remove(str);
                }
            }
        }

        static {
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            CPU_COUNT = iAvailableProcessors;
            CORE_POOL_SIZE = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadTask$0(c cVar, AdsFormat adsFormat) {
            cVar.run();
            removeTask(adsFormat, cVar.f58512id);
        }
    }

    public static class c implements Runnable {

        @NonNull
        private final GAMLoader gamLoader;

        @NonNull
        private final GAMTypeConfig gamTypeConfig;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NonNull
        private final String f58512id;
        private final int restAdLoadMs;

        public static class a implements InternalLoadListener {

            @NonNull
            private final CountDownLatch countDownLatch;

            private a(@NonNull CountDownLatch countDownLatch) {
                this.countDownLatch = countDownLatch;
            }

            @Override // io.bidmachine.ads.networks.gam.InternalLoadListener
            public void onAdLoadFailed(@NonNull InternalGAMAd internalGAMAd, @NonNull BMError bMError) {
                this.countDownLatch.countDown();
            }

            @Override // io.bidmachine.ads.networks.gam.InternalLoadListener
            public void onAdLoaded(@NonNull InternalGAMAd internalGAMAd) {
                this.countDownLatch.countDown();
            }
        }

        private c(@NonNull GAMLoader gAMLoader, @NonNull GAMTypeConfig gAMTypeConfig, int i10) {
            this.f58512id = UUID.randomUUID().toString();
            this.gamLoader = gAMLoader;
            this.gamTypeConfig = gAMTypeConfig;
            this.restAdLoadMs = i10;
        }

        private boolean loadGAMAdSync(@NonNull InternalGAMAd internalGAMAd) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                internalGAMAd.load(this.gamLoader.applicationContext, new a(countDownLatch));
                countDownLatch.await();
            } catch (Throwable unused) {
                countDownLatch.countDown();
            }
            if (internalGAMAd.isLoaded()) {
                this.gamLoader.storeGAMAd(internalGAMAd);
                return true;
            }
            this.gamLoader.destroyGAMAd(internalGAMAd);
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Iterator it = new ArrayList(this.gamTypeConfig.getGAMUnitDataList()).iterator();
                while (it.hasNext()) {
                    InternalGAMAd internalGAMAdCreateAd = this.gamLoader.versionWrapper.createAd(this.gamLoader, this.gamTypeConfig.getAdsFormat(), (GAMUnitData) it.next());
                    if (internalGAMAdCreateAd != null) {
                        if (loadGAMAdSync(internalGAMAdCreateAd)) {
                            return;
                        } else {
                            Thread.sleep(this.restAdLoadMs);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$removeFromCaches$4(InternalGAMAd internalGAMAd) {
        return String.format("removeFromCaches (%s)", internalGAMAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$reserveGAMAd$0(NetworkAdUnit networkAdUnit, InternalGAMAd internalGAMAd) {
        return String.format("reserveGAMAd (networkAdUnitId - %s, %s)", networkAdUnit.getId(), internalGAMAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$unReserveGAMAd$1(NetworkAdUnit networkAdUnit) {
        return String.format("unReserveGAMAd (networkAdUnitId - %s)", networkAdUnit.getId());
    }

    public void load() {
        for (AdsFormat adsFormat : AdsFormat.values()) {
            load(adsFormat);
        }
    }

    public void unReserveGAMAd(@NonNull final NetworkAdUnit networkAdUnit) {
        synchronized (this.reservedGamAdMapLock) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: ef.e
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return GAMLoader.lambda$unReserveGAMAd$1(networkAdUnit);
                }
            });
            this.reservedGamAdMap.remove(networkAdUnit);
        }
    }

    private int loadedGAMAdCount(@NonNull GAMTypeConfig gAMTypeConfig) {
        int i10;
        synchronized (this.gamAdListLock) {
            i10 = 0;
            Iterator<InternalGAMAd> it = this.gamAdList.iterator();
            while (it.hasNext()) {
                if (it.next().getAdsFormat() == gAMTypeConfig.getAdsFormat()) {
                    i10++;
                }
            }
        }
        return i10;
    }

    private void removeFromCaches(@NonNull final InternalGAMAd internalGAMAd) {
        synchronized (this.gamAdListLock) {
            if (this.gamAdList.remove(internalGAMAd)) {
                Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: ef.f
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return GAMLoader.lambda$removeFromCaches$4(internalGAMAd);
                    }
                });
            }
            unReserveGAMAd(internalGAMAd);
        }
    }

    private void sortDescByScore(@NonNull List<GAMUnitData> list) {
        Collections.sort(list, new Comparator() { // from class: ef.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return GAMLoader.lambda$sortDescByScore$2((GAMUnitData) obj, (GAMUnitData) obj2);
            }
        });
    }

    @VisibleForTesting
    public void clear() {
        this.gamTypeConfigMap.clear();
        this.gamAdList.clear();
        this.reservedGamAdMap.clear();
    }

    @Nullable
    @VisibleForTesting
    public InternalGAMAd findMostExpensiveIdleGAMAd(@NonNull String str) {
        synchronized (this.gamAdListLock) {
            for (InternalGAMAd internalGAMAd : this.gamAdList) {
                if (internalGAMAd.getAdUnitId().equals(str) && !isReserved(internalGAMAd)) {
                    return internalGAMAd;
                }
            }
            return null;
        }
    }

    public long getExpirationTimeMs() {
        return this.expirationTimeMs;
    }

    @NonNull
    public String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    public String getRequestAgent() {
        return this.requestAgent;
    }

    @Nullable
    public InternalGAMAd getReservedGAMAd(@NonNull NetworkAdUnit networkAdUnit) {
        InternalGAMAd internalGAMAd;
        synchronized (this.reservedGamAdMapLock) {
            internalGAMAd = this.reservedGamAdMap.get(networkAdUnit);
        }
        return internalGAMAd;
    }

    @NonNull
    public VersionWrapper getVersionWrapper() {
        return this.versionWrapper;
    }

    @VisibleForTesting
    public boolean isReserved(@NonNull InternalGAMAd internalGAMAd) {
        boolean zContainsValue;
        synchronized (this.reservedGamAdMapLock) {
            zContainsValue = this.reservedGamAdMap.containsValue(internalGAMAd);
        }
        return zContainsValue;
    }

    public void onGAMAdDestroy(@NonNull InternalGAMAd internalGAMAd, boolean z10) {
        if (!z10) {
            unReserveGAMAd(internalGAMAd);
        } else {
            internalGAMAd.release();
            removeFromCaches(internalGAMAd);
        }
    }

    public void reserveGAMAd(@NonNull final NetworkAdUnit networkAdUnit, @NonNull final InternalGAMAd internalGAMAd) {
        synchronized (this.reservedGamAdMapLock) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: ef.i
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return GAMLoader.lambda$reserveGAMAd$0(networkAdUnit, internalGAMAd);
                }
            });
            this.reservedGamAdMap.put(networkAdUnit, internalGAMAd);
        }
    }

    @Nullable
    public GAMUnitData reserveMostExpensiveGAMAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull String str) {
        synchronized (this.gamAdListLock) {
            InternalGAMAd internalGAMAdFindMostExpensiveIdleGAMAd = findMostExpensiveIdleGAMAd(str);
            if (internalGAMAdFindMostExpensiveIdleGAMAd == null) {
                return null;
            }
            reserveGAMAd(networkAdUnit, internalGAMAdFindMostExpensiveIdleGAMAd);
            return internalGAMAdFindMostExpensiveIdleGAMAd.getGamUnitData();
        }
    }

    @VisibleForTesting
    public void storeGAMAd(@NonNull InternalGAMAd internalGAMAd) {
        synchronized (this.gamAdListLock) {
            if (this.gamAdList.contains(internalGAMAd)) {
                return;
            }
            this.gamAdList.add(internalGAMAd);
            Collections.sort(this.gamAdList, new Comparator() { // from class: ef.h
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return GAMLoader.lambda$storeGAMAd$3((InternalGAMAd) obj, (InternalGAMAd) obj2);
                }
            });
        }
    }

    public GAMLoader(@NonNull Context context, @NonNull VersionWrapper versionWrapper, @NonNull String str, @NonNull Map<AdsFormat, GAMTypeConfig> map, @Nullable String str2, long j10) {
        this.tag = new Tag(str + "Loader");
        this.applicationContext = context;
        this.versionWrapper = versionWrapper;
        this.networkName = str;
        this.requestAgent = str2;
        this.expirationTimeMs = j10;
        for (AdsFormat adsFormat : AdsFormat.values()) {
            GAMTypeConfig gAMTypeConfig = map.get(adsFormat);
            if (gAMTypeConfig != null && !gAMTypeConfig.getGAMUnitDataList().isEmpty()) {
                sortDescByScore(gAMTypeConfig.getGAMUnitDataList());
                this.gamTypeConfigMap.put(gAMTypeConfig.getAdsFormat(), gAMTypeConfig);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyGAMAd(@NonNull InternalGAMAd internalGAMAd) {
        try {
            internalGAMAd.destroy();
        } catch (Throwable unused) {
        }
        removeFromCaches(internalGAMAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortDescByScore$2(GAMUnitData gAMUnitData, GAMUnitData gAMUnitData2) {
        return -Float.compare(gAMUnitData.getScore(), gAMUnitData2.getScore());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$storeGAMAd$3(InternalGAMAd internalGAMAd, InternalGAMAd internalGAMAd2) {
        return -Float.compare(internalGAMAd.getScope(), internalGAMAd2.getScope());
    }

    public boolean load(@NonNull AdsFormat adsFormat) {
        GAMTypeConfig gAMTypeConfig = this.gamTypeConfigMap.get(adsFormat);
        if (gAMTypeConfig == null || loadedGAMAdCount(gAMTypeConfig) >= gAMTypeConfig.getCacheSize()) {
            return false;
        }
        this.gamTaskLoader.loadTask(adsFormat, new c(gAMTypeConfig, 500));
        return true;
    }

    public void onGAMAdShown(@NonNull InternalGAMAd internalGAMAd) {
        removeFromCaches(internalGAMAd);
    }

    @VisibleForTesting
    public void unReserveGAMAd(@NonNull InternalGAMAd internalGAMAd) {
        synchronized (this.reservedGamAdMapLock) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<NetworkAdUnit, InternalGAMAd> entry : this.reservedGamAdMap.entrySet()) {
                if (entry.getValue().equals(internalGAMAd)) {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                unReserveGAMAd((NetworkAdUnit) it.next());
            }
        }
    }
}
