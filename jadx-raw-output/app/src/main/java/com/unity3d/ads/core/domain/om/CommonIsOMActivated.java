package com.unity3d.ads.core.domain.om;

import ck.p;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;

/* JADX INFO: compiled from: CommonIsOMActivated.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CommonIsOMActivated implements IsOMActivated {
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonIsOMActivated(OpenMeasurementRepository openMeasurementRepository) {
        p.j(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.om.IsOMActivated
    public boolean invoke() {
        return this.openMeasurementRepository.isOMActive();
    }
}
