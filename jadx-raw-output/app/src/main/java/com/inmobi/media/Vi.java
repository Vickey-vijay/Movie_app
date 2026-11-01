package com.inmobi.media;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class Vi implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bk.p f23710a;

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public final String getCommunicatorId() {
        return "AdInfoInterceptor";
    }

    public Vi(bk.p pVar) {
        this.f23710a = pVar;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public final void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        ck.p.j(appLovinCommunicatorMessage, "message");
        Uri data = appLovinCommunicatorMessage.getData();
        appLovinCommunicatorMessage.getTopic();
        Objects.toString(data);
        bk.p pVar = this.f23710a;
        Bundle messageData = appLovinCommunicatorMessage.getMessageData();
        String topic = appLovinCommunicatorMessage.getTopic();
        ck.p.i(topic, "getTopic(...)");
        pVar.mo1invoke(messageData, topic);
    }
}
