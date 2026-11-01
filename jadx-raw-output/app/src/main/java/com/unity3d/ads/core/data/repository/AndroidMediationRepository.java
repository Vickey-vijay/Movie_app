package com.unity3d.ads.core.data.repository;

import ck.p;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import gatewayprotocol.v1.ClientInfoOuterClass;
import lk.x;

/* JADX INFO: compiled from: AndroidMediationRepository.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AndroidMediationRepository implements MediationRepository {
    private final MediationDataSource mediationDataSource;

    public AndroidMediationRepository(MediationDataSource mediationDataSource) {
        p.j(mediationDataSource, "mediationDataSource");
        this.mediationDataSource = mediationDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public bk.a<ClientInfoOuterClass.MediationProvider> getMediationProvider() {
        return new bk.a<ClientInfoOuterClass.MediationProvider>() { // from class: com.unity3d.ads.core.data.repository.AndroidMediationRepository$mediationProvider$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ClientInfoOuterClass.MediationProvider invoke() {
                ClientInfoOuterClass.MediationProvider mediationProvider;
                String name = this.this$0.getName();
                if (name != null) {
                    if (x.R(name, "AppLovinSdk_", false, 2, null)) {
                        mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
                    } else if (x.E(name, "AdMob", true)) {
                        mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_ADMOB;
                    } else if (x.E(name, "MAX", true)) {
                        mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
                    } else {
                        mediationProvider = x.E(name, "ironSource", true) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_LEVELPLAY : ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM;
                    }
                    if (mediationProvider != null) {
                        return mediationProvider;
                    }
                }
                return ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
            }
        };
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getName() {
        return this.mediationDataSource.getName();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }
}
