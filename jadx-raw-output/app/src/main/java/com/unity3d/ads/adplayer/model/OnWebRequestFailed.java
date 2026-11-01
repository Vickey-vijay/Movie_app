package com.unity3d.ads.adplayer.model;

import ck.p;
import java.util.List;

/* JADX INFO: compiled from: WebViewEvent.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class OnWebRequestFailed implements WebViewEvent {
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

    public OnWebRequestFailed(List<? extends Object> list) {
        p.j(list, "value");
        this.category = "REQUEST";
        this.name = "FAILED";
        this.parameters = list.toArray(new Object[0]);
    }
}
