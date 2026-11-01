package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import io.appmetrica.analytics.BuildConfig;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class j implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f7746b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f7747c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f7748d = Collections.synchronizedSet(new HashSet());

    public class a extends LinkedHashMap {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 16) {
                return true;
            }
            return false;
        }
    }

    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f7746b) {
            bundle = (Bundle) this.f7747c.get(str);
        }
        this.f7745a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7745a.O().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    public void b(b bVar) {
        this.f7748d.remove(bVar);
    }

    public void c(String str) {
        this.f7745a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7745a.O().a("AdReviewManager", "Removing ad info for serve id: " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f7746b) {
            this.f7747c.remove(str);
        }
    }

    public static String b() {
        return b("getVersion");
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return j.class.getSimpleName();
    }

    public j(com.applovin.impl.sdk.k kVar) {
        this.f7745a = kVar;
        if (c()) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).subscribe(this, "safedk_ad_info");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:96)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private static java.lang.String b(java.lang.String r2) {
        /*
            java.lang.Class<com.applovin.quality.AppLovinQualityService> r0 = com.applovin.quality.AppLovinQualityService.class
            goto L9
        L3:
            java.lang.String r0 = "com.safedk.android.SafeDK"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L15
        L9:
            r1 = 0
            java.lang.reflect.Method r2 = r0.getMethod(r2, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.invoke(r1, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L15
            return r2
        L15:
            java.lang.String r2 = ""
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j.b(java.lang.String):java.lang.String");
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle(BuildConfig.SDK_BUILD_FLAVOR);
            if (bundle == null) {
                this.f7745a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7745a.O().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f7745a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7745a.O().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f7745a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7745a.O().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            final String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.f7745a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7745a.O().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f7746b) {
                this.f7745a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7745a.O().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                }
                this.f7747c.put(string, bundle);
            }
            final String string2 = bundle.getString("ad_review_creative_id");
            this.f7745a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7745a.O().a("AdReviewManager", "Received SafeDK ad info with Ad Review creative id: " + string2);
            }
            if (StringUtils.isValidString(string2) && !this.f7748d.isEmpty()) {
                HashSet<b> hashSet = new HashSet(this.f7748d);
                this.f7745a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7745a.O().a("AdReviewManager", "Notifying listeners: " + this.f7748d);
                }
                for (final b bVar : hashSet) {
                    this.f7745a.q0().a((i5) new r6(this.f7745a, "creativeIdGenerated", new Runnable() { // from class: com.applovin.impl.cb
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7146b.a(bVar, string, string2);
                        }
                    }), d6.b.OTHER);
                }
            }
        }
    }

    public static boolean c() {
        return StringUtils.isValidString(b());
    }

    public void a(b bVar) {
        this.f7748d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f7745a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7745a.O().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }
}
