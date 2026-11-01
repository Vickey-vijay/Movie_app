package com.unity3d.ads.core.data.repository;

import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nj.x;

/* JADX INFO: compiled from: AndroidAdRepository.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class AndroidAdRepository implements AdRepository {
    private final ConcurrentHashMap<ByteString, AdObject> loadedAds = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, List<ByteString>> placementsLoadedAds = new ConcurrentHashMap<>();

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void addAd(ByteString byteString, AdObject adObject) {
        p.j(byteString, "opportunityId");
        p.j(adObject, "adObject");
        this.loadedAds.put(byteString, adObject);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void enqueueOpportunityForPlacement(String str, ByteString byteString) {
        List<ByteString> listPutIfAbsent;
        p.j(str, "placementId");
        p.j(byteString, "opportunityId");
        ConcurrentHashMap<String, List<ByteString>> concurrentHashMap = this.placementsLoadedAds;
        List<ByteString> arrayList = concurrentHashMap.get(str);
        if (arrayList == null && (listPutIfAbsent = concurrentHashMap.putIfAbsent(str, (arrayList = new ArrayList<>()))) != null) {
            arrayList = listPutIfAbsent;
        }
        arrayList.add(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public AdObject getAd(ByteString byteString) {
        p.j(byteString, "opportunityId");
        return this.loadedAds.get(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Map<ByteString, AdObject> getAllAds() {
        return kotlin.collections.a.x(this.loadedAds);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public boolean hasOpportunityId(ByteString byteString) {
        p.j(byteString, "opportunityId");
        return this.loadedAds.containsKey(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public ByteString pollOpportunityIdForPlacement(String str) {
        p.j(str, "placementId");
        List<ByteString> list = this.placementsLoadedAds.get(str);
        if (list != null) {
            return (ByteString) x.J(list);
        }
        return null;
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void removeAd(ByteString byteString) {
        p.j(byteString, "opportunityId");
        this.loadedAds.remove(byteString);
    }
}
