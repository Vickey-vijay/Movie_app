package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.ClientInfoOuterClass;

/* JADX INFO: compiled from: MediationRepository.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface MediationRepository {
    bk.a<ClientInfoOuterClass.MediationProvider> getMediationProvider();

    String getName();

    String getVersion();
}
