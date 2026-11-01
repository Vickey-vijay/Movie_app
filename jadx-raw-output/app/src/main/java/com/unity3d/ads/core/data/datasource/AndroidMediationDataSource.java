package com.unity3d.ads.core.data.datasource;

import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.unity3d.services.core.misc.JsonStorage;

/* JADX INFO: compiled from: AndroidMediationDataSource.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidMediationDataSource implements MediationDataSource {
    public static final Companion Companion = new Companion(null);
    private static final String MEDIATION_NAME = "name";
    public static final String MEDIATION_NAME_KEY = "mediation.name.value";
    private static final String MEDIATION_STORAGE_NAME = "mediation";
    private static final String MEDIATION_VALUE = "value";
    private static final String MEDIATION_VERSION = "version";
    public static final String MEDIATION_VERSION_KEY = "mediation.version.value";
    private final JsonStorage storage;

    /* JADX INFO: compiled from: AndroidMediationDataSource.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public AndroidMediationDataSource(JsonStorage jsonStorage) {
        p.j(jsonStorage, C3426d4.a.f28418k);
        this.storage = jsonStorage;
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    public String getName() {
        return (String) this.storage.get(MEDIATION_NAME_KEY);
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    public String getVersion() {
        return (String) this.storage.get(MEDIATION_VERSION_KEY);
    }
}
