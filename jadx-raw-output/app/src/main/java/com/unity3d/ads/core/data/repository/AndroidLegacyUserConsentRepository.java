package com.unity3d.ads.core.data.repository;

import ck.p;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;

/* JADX INFO: compiled from: AndroidLegacyUserConsentRepository.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidLegacyUserConsentRepository implements LegacyUserConsentRepository {
    private final LegacyUserConsentDataSource legacyUserConsentDataSource;

    public AndroidLegacyUserConsentRepository(LegacyUserConsentDataSource legacyUserConsentDataSource) {
        p.j(legacyUserConsentDataSource, "legacyUserConsentDataSource");
        this.legacyUserConsentDataSource = legacyUserConsentDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.LegacyUserConsentRepository
    public String getLegacyFlowUserConsent() {
        return this.legacyUserConsentDataSource.getPrivacyData();
    }
}
