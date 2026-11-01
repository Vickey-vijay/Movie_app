package com.safedk.android.analytics;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class StatsReporter implements AppLovinCommunicatorPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f43485a = "StatsReporter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static StatsReporter f43486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ExecutorService f43487c = Executors.newSingleThreadExecutor();

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.f43423a;
    }

    public static synchronized void a() {
        f43486b = new StatsReporter();
    }

    public static synchronized StatsReporter b() {
        return f43486b;
    }

    public void a(final ArrayList<Bundle> arrayList) {
        try {
            f43487c.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsReporter.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (arrayList.size() > 0) {
                            Logger.d(StatsReporter.f43485a, "Starting report stats events!, isOnUiThread = " + k.c());
                            AppLovinBridge.a((ArrayList<Bundle>) arrayList, StatsReporter.this);
                        }
                    } catch (Throwable th2) {
                        Logger.e(StatsReporter.f43485a, "Caught exception while creating json data", th2);
                    }
                }
            });
        } catch (Throwable th2) {
            Logger.e(f43485a, "failed during report events: " + arrayList, th2);
            new CrashReporter().caughtException(th2);
        }
    }

    public ArrayList<Bundle> a(Set<StatsEvent> set) {
        Logger.d(f43485a, "filters reports and bundle started, events to send : " + (set == null ? "null" : Integer.valueOf(set.size())) + ", isOnUiThread = " + k.c());
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            for (StatsEvent statsEvent : set) {
                boolean z10 = false;
                if (SafeDK.b() && (statsEvent.b().equals(StatsCollector.EventType.BrandSafety) || statsEvent.b().equals(StatsCollector.EventType.redirect))) {
                    z10 = true;
                }
                Logger.d(f43485a, "filters reports and bundle Event type = " + statsEvent.b() + "; should report = " + z10);
                Bundle bundleE = statsEvent.e();
                k.b(f43485a, "filters reports and bundle " + statsEvent.b() + " event:" + k.a(bundleE));
                if (z10) {
                    Set<String> setF = statsEvent.f();
                    if (setF != null) {
                        HashSet hashSet = new HashSet();
                        for (String str : setF) {
                            if (!bundleE.containsKey(str)) {
                                hashSet.add(str);
                            }
                        }
                        if (hashSet.size() > 0) {
                            Logger.d(f43485a, "filters reports and bundle *** missing fields: " + hashSet);
                        }
                    }
                    arrayList.add(bundleE);
                    k.b(f43485a, "filters reports and bundle event to be reported : " + bundleE.toString());
                }
            }
        } catch (Exception e10) {
            Logger.e(f43485a, "Exception filtering events for report", e10);
        }
        return arrayList;
    }

    public synchronized boolean a(CreativeInfo creativeInfo, c cVar) {
        boolean z10;
        Bundle bundle = cVar.A;
        Logger.d(f43485a, "notify Max started , CI = " + creativeInfo + ", applovin data = " + bundle + ", isOnUiThread = " + k.c());
        if (creativeInfo != null && creativeInfo.aa() != null && bundle != null) {
            String strZ = com.safedk.android.analytics.brandsafety.b.a(cVar, creativeInfo) ? cVar.z() : creativeInfo.aa();
            Logger.d(f43485a, "Will notify Max about match, creative id = " + strZ);
            AppLovinBridge.reportMaxCreativeId(bundle, strZ, b());
            z10 = true;
        } else {
            Logger.d(f43485a, "Cannot notify Max about match");
            z10 = false;
        }
        return z10;
    }
}
