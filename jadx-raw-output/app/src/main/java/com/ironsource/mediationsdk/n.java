package com.ironsource.mediationsdk;

import com.ironsource.C3502h8;
import com.ironsource.C3725u2;
import com.ironsource.Dd;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final n f29913f = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f29914a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Boolean> f29915b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29918e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSource.a f29919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f29920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29921c;

        public a(IronSource.a aVar, IronSourceError ironSourceError, String str) {
            this.f29919a = aVar;
            this.f29920b = ironSourceError;
            this.f29921c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            n.this.a(this.f29919a, this.f29920b);
            n.this.f29915b.put(this.f29921c, Boolean.FALSE);
        }
    }

    public static synchronized n a() {
        return f29913f;
    }

    public synchronized void b(IronSource.a aVar, IronSourceError ironSourceError) {
        if (b(aVar)) {
            return;
        }
        String string = aVar.toString();
        if (!this.f29914a.containsKey(string)) {
            a(aVar, ironSourceError);
            return;
        }
        long jA = ((long) a(aVar)) * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f29914a.get(string).longValue();
        if (jCurrentTimeMillis > jA) {
            a(aVar, ironSourceError);
            return;
        }
        this.f29915b.put(string, Boolean.TRUE);
        long j10 = jA - jCurrentTimeMillis;
        IronLog.INTERNAL.verbose("delaying callback by " + j10);
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(aVar, ironSourceError, string), j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSource.a aVar, IronSourceError ironSourceError) {
        this.f29914a.put(aVar.toString(), Long.valueOf(System.currentTimeMillis()));
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            Dd.a().a(ironSourceError);
            return;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            C3502h8.a().a(ironSourceError);
            return;
        }
        if (aVar == IronSource.a.BANNER) {
            C3725u2.a().a(ironSourceError);
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
    }

    private n() {
    }

    public void a(IronSource.a aVar, int i10) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            this.f29917d = i10;
            return;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            this.f29916c = i10;
            return;
        }
        if (aVar == IronSource.a.BANNER) {
            this.f29918e = i10;
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
    }

    public synchronized boolean b(IronSource.a aVar) {
        if (!this.f29915b.containsKey(aVar.toString())) {
            return false;
        }
        return this.f29915b.get(aVar.toString()).booleanValue();
    }

    private int a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return this.f29917d;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return this.f29916c;
        }
        if (aVar == IronSource.a.BANNER) {
            return this.f29918e;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 0;
    }
}
