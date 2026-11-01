package com.unity3d.ads.core.domain;

import ck.p;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;

/* JADX INFO: compiled from: CommonGetAdObject.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CommonGetAdObject implements GetAdObject {
    private final AdRepository adRepository;

    public CommonGetAdObject(AdRepository adRepository) {
        p.j(adRepository, "adRepository");
        this.adRepository = adRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetAdObject
    public AdObject invoke(String str) {
        p.j(str, "opportunityId");
        return this.adRepository.getAd(ByteStringsKt.toByteStringUtf8(str));
    }
}
