package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.Map;

/* JADX INFO: compiled from: AdRepository.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface AdRepository {
    void addAd(ByteString byteString, AdObject adObject);

    void enqueueOpportunityForPlacement(String str, ByteString byteString);

    AdObject getAd(ByteString byteString);

    Map<ByteString, AdObject> getAllAds();

    boolean hasOpportunityId(ByteString byteString);

    ByteString pollOpportunityIdForPlacement(String str);

    void removeAd(ByteString byteString);
}
