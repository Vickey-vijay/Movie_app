package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.core.Logger;
import io.bidmachine.protobuf.AdCachePlacementControl;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: AdResponseManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class w0 {

    @VisibleForTesting
    public static final int DEF_BUSY_LIMIT = 2;

    @VisibleForTesting
    public static final int DEF_MAX_CACHE_SIZE = 8;
    private static final String TAG = "AdResponseManager";
    private static final Map<String, AdCachePlacementControl> adCachePlacementControlMap = new ConcurrentHashMap();
    private static volatile w0 instance;
    private final Object lock = new Object();
    private final List<u> adResponseList = new ArrayList();

    /* JADX INFO: compiled from: AdResponseManager.java */
    public class a implements Comparator<u> {
        public a() {
        }

        @Override // java.util.Comparator
        public int compare(u uVar, u uVar2) {
            return -Double.compare(uVar.getPrice(), uVar2.getPrice());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$receive$1(u uVar) {
        return String.format("receive - %s", uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$remove$2(u uVar) {
        return String.format("remove - %s", uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$store$0(u uVar) {
        return String.format("store - %s", uVar);
    }

    @VisibleForTesting
    public static void reset() {
        setAdCachePlacementControlMap(null);
    }

    @NonNull
    public static w0 get() {
        w0 w0Var = instance;
        if (w0Var == null) {
            synchronized (w0.class) {
                w0Var = instance;
                if (w0Var == null) {
                    w0Var = new w0();
                    instance = w0Var;
                }
            }
        }
        return w0Var;
    }

    public static void setAdCachePlacementControlMap(@Nullable Map<String, AdCachePlacementControl> map) {
        Map<String, AdCachePlacementControl> map2 = adCachePlacementControlMap;
        map2.clear();
        if (map != null) {
            map2.putAll(map);
        }
    }

    public boolean contains(@NonNull u uVar) {
        boolean zContains;
        synchronized (this.lock) {
            zContains = this.adResponseList.contains(uVar);
        }
        return zContains;
    }

    @NonNull
    public List<u> peek(@NonNull AdRequestParameters adRequestParameters) {
        synchronized (this.lock) {
            ArrayList arrayList = new ArrayList();
            for (u uVar : this.adResponseList) {
                if (uVar.getStatus() == AdResponseStatus.Idle && adRequestParameters.isParametersMatched(uVar.getAdRequestParameters())) {
                    arrayList.add(uVar);
                }
            }
            if (arrayList.isEmpty()) {
                return arrayList;
            }
            Collections.sort(arrayList, new a());
            return arrayList.subList(0, Math.min(getBusyLimitForAdsType(adRequestParameters), arrayList.size()));
        }
    }

    @Nullable
    public u receive(@NonNull AdRequestParameters adRequestParameters) {
        synchronized (this.lock) {
            int busyLimitForAdsType = getBusyLimitForAdsType(adRequestParameters);
            int i10 = 0;
            final u uVar = null;
            u uVar2 = null;
            for (u uVar3 : this.adResponseList) {
                if (!uVar3.wasShown() && adRequestParameters.isParametersMatched(uVar3.getAdRequestParameters())) {
                    AdResponseStatus status = uVar3.getStatus();
                    AdResponseStatus adResponseStatus = AdResponseStatus.Idle;
                    if (status == adResponseStatus) {
                        if (uVar == null || uVar3.getPrice() > uVar.getPrice()) {
                            uVar = uVar3;
                        }
                    } else if (uVar3.getStatus() == AdResponseStatus.Busy) {
                        i10++;
                        if (uVar2 == null) {
                            uVar2 = uVar3;
                        }
                        if (i10 >= busyLimitForAdsType) {
                            uVar2.expireAdRequests(null);
                            uVar2.clearAdRequestList();
                            uVar2.setStatus(adResponseStatus);
                            if (uVar == null || uVar2.getPrice() >= uVar.getPrice()) {
                                uVar = uVar2;
                            }
                        }
                    }
                }
            }
            if (uVar == null || !adRequestParameters.isPricePassedByPriceFloor(uVar.getPrice())) {
                return null;
            }
            uVar.setStatus(AdResponseStatus.Busy);
            Logger.d(TAG, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.v0
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return w0.lambda$receive$1(uVar);
                }
            });
            this.adResponseList.remove(uVar);
            this.adResponseList.add(uVar);
            return uVar;
        }
    }

    public void remove(@NonNull final u uVar) {
        Logger.d(TAG, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.t0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return w0.lambda$remove$2(uVar);
            }
        });
        synchronized (this.lock) {
            this.adResponseList.remove(uVar);
        }
    }

    @VisibleForTesting
    public int size() {
        return this.adResponseList.size();
    }

    private AdCachePlacementControl getAdCachePlacementControl(@NonNull AdRequestParameters adRequestParameters) {
        return adCachePlacementControlMap.get(adRequestParameters.getAdsType().getName());
    }

    @VisibleForTesting
    public int getBusyLimitForAdsType(@NonNull AdRequestParameters adRequestParameters) {
        int maxRetainCount;
        AdCachePlacementControl adCachePlacementControl = getAdCachePlacementControl(adRequestParameters);
        if (adCachePlacementControl != null) {
            maxRetainCount = adCachePlacementControl.getMaxRetainCount();
        } else {
            maxRetainCount = 0;
        }
        if (maxRetainCount <= 0) {
            return 2;
        }
        return maxRetainCount;
    }

    @VisibleForTesting
    public int getMaxCacheSizeForAdsType(@NonNull AdRequestParameters adRequestParameters) {
        int maxCacheSize;
        AdCachePlacementControl adCachePlacementControl = getAdCachePlacementControl(adRequestParameters);
        if (adCachePlacementControl != null) {
            maxCacheSize = adCachePlacementControl.getMaxCacheSize();
        } else {
            maxCacheSize = 0;
        }
        if (maxCacheSize <= 0) {
            return 8;
        }
        return maxCacheSize;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    public void store(@NonNull final u uVar) {
        if (!uVar.canCache()) {
            return;
        }
        Logger.d(TAG, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.u0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return w0.lambda$store$0(uVar);
            }
        });
        synchronized (this.lock) {
            AdRequestParameters adRequestParameters = uVar.getAdRequestParameters();
            u uVar2 = null;
            int i10 = 0;
            int i11 = 0;
            u uVar3 = null;
            for (u uVar4 : this.adResponseList) {
                if (adRequestParameters.isParametersMatched(uVar4.getAdRequestParameters())) {
                    i11++;
                    if (uVar4.getStatus() == AdResponseStatus.Idle) {
                        if (uVar3 == null || uVar3.getPrice() > uVar4.getPrice()) {
                            uVar3 = uVar4;
                        }
                    } else if (uVar4.getStatus() == AdResponseStatus.Busy) {
                        i10++;
                        if (uVar2 == null) {
                            uVar2 = uVar4;
                        }
                    }
                }
            }
            if (uVar.getStatus() == AdResponseStatus.Busy && uVar2 != null && i10 >= getBusyLimitForAdsType(adRequestParameters)) {
                uVar2.setStatus(AdResponseStatus.Idle);
                if (uVar3 != null && uVar3.getPrice() <= uVar2.getPrice()) {
                    uVar2 = uVar3;
                }
            } else {
                uVar2 = uVar3;
            }
            if (i11 >= getMaxCacheSizeForAdsType(adRequestParameters) && uVar2 != null) {
                if (uVar.getPrice() >= uVar2.getPrice()) {
                    uVar2.notifyExpired(true);
                    this.adResponseList.remove(uVar2);
                } else {
                    return;
                }
            }
            this.adResponseList.add(uVar);
        }
    }
}
