package com.unity3d.ads.adplayer.model;

import ck.p;

/* JADX INFO: compiled from: WebViewEvent.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class OnBroadcastEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnBroadcastEvent(String str, String str2) {
        p.j(str, "name");
        this.name = str;
        this.category = "ADVIEWER";
        this.parameters = new Object[]{str2};
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
