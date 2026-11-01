package com.unity3d.ads.adplayer.model;

import ck.p;
import com.unity3d.services.ads.offerwall.OfferwallEvent;

/* JADX INFO: compiled from: WebViewEvent.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class OnOfferwallEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnOfferwallEvent(OfferwallEvent offerwallEvent) {
        p.j(offerwallEvent, "offerwallEvent");
        this.category = "OFFERWALL";
        this.name = offerwallEvent.name();
        this.parameters = new Object[0];
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
