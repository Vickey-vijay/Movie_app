package com.unity3d.ads.adplayer.model;

import ck.p;
import java.util.List;

/* JADX INFO: compiled from: WebViewEvent.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class OnWebRequestComplete implements WebViewEvent {
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

    public OnWebRequestComplete(List<? extends Object> list) {
        p.j(list, "value");
        this.category = "REQUEST";
        this.name = "COMPLETE";
        this.parameters = list.toArray(new Object[0]);
    }
}
