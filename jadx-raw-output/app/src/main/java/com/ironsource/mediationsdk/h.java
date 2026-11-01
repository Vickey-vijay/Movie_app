package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.model.NetworkSettings;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f29805c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f29806d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, ArrayList<a>> f29807a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29808b;

    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public void a(ConcurrentHashMap<String, a> concurrentHashMap) {
        if (this.f29808b == 0) {
            return;
        }
        for (String str : this.f29807a.keySet()) {
            a aVar = a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                aVar = concurrentHashMap.get(str);
            }
            ArrayList<a> arrayList = this.f29807a.get(str);
            if (this.f29808b != -1 && arrayList.size() == this.f29808b) {
                arrayList.remove(0);
            }
            arrayList.add(aVar);
        }
    }

    public h(List<NetworkSettings> list, int i10) {
        this.f29808b = i10;
        for (NetworkSettings networkSettings : list) {
            this.f29807a.put(networkSettings.getProviderName(), new ArrayList<>());
        }
    }

    public String a(String str) {
        ArrayList<a> arrayList = this.f29807a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<a> it = arrayList.iterator();
            str2 = "" + it.next().ordinal();
            while (it.hasNext()) {
                str2 = (str2 + StringUtils.COMMA) + it.next().ordinal();
            }
        }
        return str2;
    }
}
