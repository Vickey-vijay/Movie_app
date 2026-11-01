package com.unity3d.ads.adplayer.model;

import ck.p;

/* JADX INFO: compiled from: WebViewEvent.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class OnUserConsentChangeEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

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

    public OnUserConsentChangeEvent(String str) {
        p.j(str, "value");
        this.category = "ADVIEWER";
        this.name = "ON_USER_CONSENT_CHANGE";
        this.parameters = new Object[]{str};
    }
}
