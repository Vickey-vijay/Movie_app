package com.unity3d.ads.core.domain.om;

import ck.p;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import rj.c;

/* JADX INFO: compiled from: CommonGetOmData.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class CommonGetOmData implements GetOmData {
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonGetOmData(OpenMeasurementRepository openMeasurementRepository) {
        p.j(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.om.GetOmData
    public Object invoke(c<? super OMData> cVar) {
        return this.openMeasurementRepository.getOmData();
    }
}
