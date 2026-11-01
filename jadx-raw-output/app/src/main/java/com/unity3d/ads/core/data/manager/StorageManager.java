package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.core.device.Storage;

/* JADX INFO: compiled from: StorageManager.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface StorageManager {
    void addStorageLocation(com.unity3d.services.core.device.StorageManager.StorageType storageType, String str);

    Storage getStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType);

    void hasInitialized();

    boolean hasStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType);

    boolean init(Context context);

    void initStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType);

    void removeStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType);
}
