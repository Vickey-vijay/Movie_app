package com.unity3d.ads.adplayer.model;

import ck.p;
import com.unity3d.services.core.device.StorageEvent;
import com.unity3d.services.core.device.StorageManager;

/* JADX INFO: compiled from: WebViewEvent.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class OnStorageEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnStorageEvent(StorageEvent storageEvent, StorageManager.StorageType storageType, Object obj) {
        p.j(storageEvent, "eventType");
        p.j(storageType, "storageType");
        this.category = "STORAGE";
        this.name = storageEvent.name();
        this.parameters = new Object[]{storageType.name(), obj};
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public Object[] getParameters() {
        return this.parameters;
    }
}
