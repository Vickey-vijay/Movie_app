package com.unity3d.services.core.device;

/* JADX INFO: compiled from: VolumeChange.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface VolumeChange {
    void clearAllListeners();

    void registerListener(VolumeChangeListener volumeChangeListener);

    void startObserving();

    void stopObserving();

    void unregisterListener(VolumeChangeListener volumeChangeListener);
}
