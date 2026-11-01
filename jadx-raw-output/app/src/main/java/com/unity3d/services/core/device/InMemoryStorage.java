package com.unity3d.services.core.device;

/* JADX INFO: compiled from: InMemoryStorage.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class InMemoryStorage extends Storage {
    @Override // com.unity3d.services.core.device.Storage
    public synchronized boolean clearStorage() {
        clearData();
        return true;
    }

    @Override // com.unity3d.services.core.device.Storage
    public synchronized boolean readStorage() {
        return true;
    }

    @Override // com.unity3d.services.core.device.Storage
    public synchronized boolean writeStorage() {
        return true;
    }

    public InMemoryStorage() {
        super("", StorageManager.StorageType.MEMORY);
    }
}
