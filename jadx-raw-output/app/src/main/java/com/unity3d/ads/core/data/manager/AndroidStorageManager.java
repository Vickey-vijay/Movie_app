package com.unity3d.ads.core.data.manager;

import android.content.Context;
import ck.i;
import ck.p;
import com.ironsource.Y5;
import com.unity3d.services.core.device.Storage;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: AndroidStorageManager.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AndroidStorageManager implements StorageManager {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_INITIALIZED = "configuration.hasInitialized";

    /* JADX INFO: compiled from: AndroidStorageManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void hasInitialized() {
        Storage storage = getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE);
        storage.set(KEY_INITIALIZED, Boolean.TRUE);
        storage.writeStorage();
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean init(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return com.unity3d.services.core.device.StorageManager.init(context);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void addStorageLocation(com.unity3d.services.core.device.StorageManager.StorageType storageType, String str) {
        p.j(storageType, "type");
        p.j(str, Y5.c.f27928b);
        com.unity3d.services.core.device.StorageManager.addStorageLocation(storageType, str);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public Storage getStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType) {
        p.j(storageType, "type");
        Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(storageType);
        p.i(storage, "getStorage(type)");
        return storage;
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean hasStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType) {
        p.j(storageType, "type");
        return com.unity3d.services.core.device.StorageManager.hasStorage(storageType);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void initStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType) {
        p.j(storageType, "type");
        com.unity3d.services.core.device.StorageManager.initStorage(storageType);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void removeStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType) {
        p.j(storageType, "type");
        com.unity3d.services.core.device.StorageManager.removeStorage(storageType);
    }
}
