package p001if;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.StringValue;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdData;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadData;
import io.bidmachine.core.Logger;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: GAMAdManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class g {

    @NonNull
    @VisibleForTesting
    public final List<InternalAd> internalAdList = new ArrayList();

    @NonNull
    private final Object internalAdListLock = new Object();

    @NonNull
    @VisibleForTesting
    public final Map<NetworkAdUnit, InternalAd> reservedInternalAdMap = new WeakHashMap();

    @NonNull
    private final Object reservedInternalAdMapLock = new Object();

    @NonNull
    private final Tag tag;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$removeAdFromCaches$2(InternalAd internalAd) {
        return String.format("Remove ad from caches (%s, size - %s)", internalAd, Integer.valueOf(getLoadedAdCount(internalAd.getAdsFormat())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$reserveAd$3(NetworkAdUnit networkAdUnit, InternalAd internalAd) {
        return String.format("Reserve ad (networkAdUnitId - %s, %s, %s / %s)", networkAdUnit.getId(), internalAd, Integer.valueOf(getReservedAdCount(internalAd.getAdsFormat())), Integer.valueOf(getLoadedAdCount(internalAd.getAdsFormat())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$storeAd$0(InternalAd internalAd) {
        return String.format("Store ad (%s, size - %s)", internalAd, Integer.valueOf(getLoadedAdCount(internalAd.getAdsFormat())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$storeOrSwapCheapestIdleAd$1(InternalAd internalAd) {
        return String.format("Remove cheapest ad (%s)", internalAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$unReserveAd$4(NetworkAdUnit networkAdUnit, InternalAd internalAd) {
        return String.format("UnReserve ad (networkAdUnitId - %s, %s, %s / %s)", networkAdUnit.getId(), internalAd, Integer.valueOf(getReservedAdCount(internalAd.getAdsFormat())), Integer.valueOf(getLoadedAdCount(internalAd.getAdsFormat())));
    }

    public void unReserveAd(@NonNull InternalAd internalAd) {
        synchronized (this.reservedInternalAdMapLock) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<NetworkAdUnit, InternalAd> entry : this.reservedInternalAdMap.entrySet()) {
                if (entry.getValue().equals(internalAd)) {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                unReserveAd((NetworkAdUnit) it.next());
            }
        }
    }

    @Nullable
    public InternalAd findCheapestIdleAd(@NonNull AdsFormat adsFormat) {
        synchronized (this.internalAdListLock) {
            for (int size = this.internalAdList.size() - 1; size >= 0; size--) {
                InternalAd internalAd = this.internalAdList.get(size);
                if (internalAd.getAdsFormat() == adsFormat && !isAdReserved(internalAd)) {
                    return internalAd;
                }
            }
            return null;
        }
    }

    @Nullable
    public InternalAd findMostExpensiveIdleAd(@NonNull AdsFormat adsFormat) {
        synchronized (this.internalAdListLock) {
            for (InternalAd internalAd : this.internalAdList) {
                if (internalAd.getAdsFormat() == adsFormat && !isAdReserved(internalAd)) {
                    return internalAd;
                }
            }
            return null;
        }
    }

    @Nullable
    public List<Waterfall.Result.CachedAdUnit> getCachedAdUnitList(@NonNull AdsFormat adsFormat) {
        synchronized (this.internalAdListLock) {
            if (this.internalAdList.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (InternalAd internalAd : this.internalAdList) {
                if (internalAd.getAdsFormat() == adsFormat) {
                    Waterfall.Configuration.AdUnit adUnit = internalAd.getAdUnit();
                    Waterfall.Result.CachedAdUnit.Builder frozen = Waterfall.Result.CachedAdUnit.newBuilder().setPrice(adUnit.getPrice()).setFrozen(isAdReserved(internalAd));
                    if (adUnit.getAdUnitId() != null) {
                        frozen.setAdUnitId(adUnit.getAdUnitId());
                    }
                    StringValue serverParams = adUnit.getServerParams();
                    if (serverParams != null) {
                        frozen.setServerParams(serverParams);
                    }
                    InternalAdLoadData internalAdLoadData = internalAd.getInternalAdLoadData();
                    if (internalAdLoadData != null) {
                        Waterfall.Result.EstimatedPrice price = internalAdLoadData.getPrice();
                        if (price != null) {
                            frozen.setEstimatedPrice(price);
                        }
                        String adResponse = internalAdLoadData.getAdResponse();
                        if (!TextUtils.isEmpty(adResponse)) {
                            frozen.setAdResponse(StringValue.newBuilder().setValue(adResponse).build());
                        }
                    }
                    arrayList.add(frozen.build());
                }
            }
            return arrayList;
        }
    }

    public int getLoadedAdCount(@NonNull AdsFormat adsFormat) {
        int i10;
        synchronized (this.internalAdListLock) {
            i10 = 0;
            Iterator<InternalAd> it = this.internalAdList.iterator();
            while (it.hasNext()) {
                if (it.next().getAdsFormat() == adsFormat) {
                    i10++;
                }
            }
        }
        return i10;
    }

    @Nullable
    public InternalAd getReservedAd(@NonNull NetworkAdUnit networkAdUnit) {
        InternalAd internalAd;
        synchronized (this.reservedInternalAdMapLock) {
            internalAd = this.reservedInternalAdMap.get(networkAdUnit);
        }
        return internalAd;
    }

    public int getReservedAdCount(@NonNull AdsFormat adsFormat) {
        int i10;
        synchronized (this.reservedInternalAdMapLock) {
            i10 = 0;
            Iterator<InternalAd> it = this.reservedInternalAdMap.values().iterator();
            while (it.hasNext()) {
                if (it.next().getAdsFormat() == adsFormat) {
                    i10++;
                }
            }
        }
        return i10;
    }

    public boolean isAdReserved(@NonNull InternalAd internalAd) {
        boolean zContainsValue;
        synchronized (this.reservedInternalAdMapLock) {
            zContainsValue = this.reservedInternalAdMap.containsValue(internalAd);
        }
        return zContainsValue;
    }

    public boolean removeAdFromCaches(@NonNull final InternalAd internalAd) {
        boolean zRemove;
        synchronized (this.internalAdListLock) {
            zRemove = this.internalAdList.remove(internalAd);
            if (zRemove) {
                Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.a
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return this.f54123a.lambda$removeAdFromCaches$2(internalAd);
                    }
                });
            }
            unReserveAd(internalAd);
        }
        return zRemove;
    }

    public void reserveAd(@NonNull final NetworkAdUnit networkAdUnit, @NonNull final InternalAd internalAd) {
        synchronized (this.reservedInternalAdMapLock) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.d
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return this.f54131a.lambda$reserveAd$3(networkAdUnit, internalAd);
                }
            });
            this.reservedInternalAdMap.put(networkAdUnit, internalAd);
        }
    }

    @Nullable
    public InternalAdData reserveMostExpensiveAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull AdsFormat adsFormat) {
        synchronized (this.internalAdListLock) {
            InternalAd internalAdFindMostExpensiveIdleAd = findMostExpensiveIdleAd(adsFormat);
            if (internalAdFindMostExpensiveIdleAd == null) {
                return null;
            }
            reserveAd(networkAdUnit, internalAdFindMostExpensiveIdleAd);
            return internalAdFindMostExpensiveIdleAd;
        }
    }

    @VisibleForTesting
    public void sortDescByPrice(@NonNull List<InternalAd> list) {
        Collections.sort(list, new Comparator() { // from class: if.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.lambda$sortDescByPrice$5((InternalAd) obj, (InternalAd) obj2);
            }
        });
    }

    public void storeAd(@NonNull final InternalAd internalAd) {
        synchronized (this.internalAdListLock) {
            if (this.internalAdList.contains(internalAd)) {
                return;
            }
            this.internalAdList.add(internalAd);
            sortDescByPrice(this.internalAdList);
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.e
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return this.f54134a.lambda$storeAd$0(internalAd);
                }
            });
        }
    }

    @Nullable
    public InternalAd storeOrSwapCheapestIdleAd(@NonNull InternalAd internalAd, int i10) {
        synchronized (this.internalAdListLock) {
            AdsFormat adsFormat = internalAd.getAdsFormat();
            InternalAd internalAd2 = null;
            if (getLoadedAdCount(adsFormat) >= i10) {
                final InternalAd internalAdFindCheapestIdleAd = findCheapestIdleAd(adsFormat);
                if (internalAdFindCheapestIdleAd != null && internalAdFindCheapestIdleAd.getPrice() <= internalAd.getPrice()) {
                    Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.f
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            return g.lambda$storeOrSwapCheapestIdleAd$1(internalAdFindCheapestIdleAd);
                        }
                    });
                    removeAdFromCaches(internalAdFindCheapestIdleAd);
                    internalAd2 = internalAdFindCheapestIdleAd;
                }
                return null;
            }
            storeAd(internalAd);
            return internalAd2;
        }
    }

    public g(@NonNull String str) {
        this.tag = new Tag(str + "AdManager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortDescByPrice$5(InternalAd internalAd, InternalAd internalAd2) {
        return -Double.compare(internalAd.getPrice(), internalAd2.getPrice());
    }

    public void unReserveAd(@NonNull final NetworkAdUnit networkAdUnit) {
        synchronized (this.reservedInternalAdMapLock) {
            final InternalAd internalAdRemove = this.reservedInternalAdMap.remove(networkAdUnit);
            if (internalAdRemove != null) {
                Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.c
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return this.f54128a.lambda$unReserveAd$4(networkAdUnit, internalAdRemove);
                    }
                });
            }
        }
    }
}
