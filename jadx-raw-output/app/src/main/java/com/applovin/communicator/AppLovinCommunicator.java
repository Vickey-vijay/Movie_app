package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.f5;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class AppLovinCommunicator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static AppLovinCommunicator f6797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f6798f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f6799g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f6800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f6801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f5 f6802c = new f5();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MessagingServiceImpl f6803d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance() {
        return getInstance(k.o());
    }

    public void a(k kVar) {
        this.f6800a = kVar;
        this.f6801b = kVar.O();
        a("Attached SDK instance: " + kVar + "...");
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    @Deprecated
    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f6798f) {
            if (f6797e == null) {
                f6797e = new AppLovinCommunicator();
            }
        }
        return f6797e;
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f6803d;
    }

    public boolean hasSubscriber(String str) {
        return this.f6802c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f6800a.t().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f6802c.a(appLovinCommunicatorSubscriber, str)) {
                this.f6803d.maybeSendStickyMessages(str);
            } else {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f6800a + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f6802c.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(String str) {
        if (this.f6801b == null || !o.a()) {
            return;
        }
        this.f6801b.a("AppLovinCommunicator", str);
    }
}
