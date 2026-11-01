package com.inmobi.signals.adinfo;

import android.os.Bundle;
import ck.p;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.inmobi.media.Ui;
import com.inmobi.media.Vi;
import java.util.List;
import java.util.Objects;
import mj.r;

/* JADX INFO: loaded from: classes6.dex */
public final class SignalCollector {
    public static final Ui Companion = new Ui();
    private static final String TAG = "SignalCollector";
    private final AppLovinCommunicator communicator;
    private AppLovinCommunicatorSubscriber communicatorSubscriber;
    private final List<String> listOfTopics;

    public SignalCollector(List<String> list) {
        p.j(list, "listOfTopics");
        this.listOfTopics = list;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance();
        p.i(appLovinCommunicator, "getInstance(...)");
        this.communicator = appLovinCommunicator;
    }

    private final AppLovinCommunicatorSubscriber createSubscriber(bk.p<? super Bundle, ? super String, r> pVar) {
        return new Vi(pVar);
    }

    public final List<String> getListOfTopics() {
        return this.listOfTopics;
    }

    public final void setupAppLovinCommunicator(bk.p<? super Bundle, ? super String, r> pVar) {
        p.j(pVar, "onEvent");
        try {
            AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriberCreateSubscriber = createSubscriber(pVar);
            this.communicatorSubscriber = appLovinCommunicatorSubscriberCreateSubscriber;
            this.communicator.subscribe(appLovinCommunicatorSubscriberCreateSubscriber, this.listOfTopics);
            Objects.toString(this.listOfTopics);
        } catch (Error | Exception unused) {
        }
    }
}
