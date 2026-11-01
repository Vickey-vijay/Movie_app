package com.safedk.android.analytics.brandsafety;

import com.ironsource.Z7;
import com.safedk.android.analytics.events.MaxEvent;
import com.safedk.android.analytics.events.MaxEvents;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44548a = 50;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44549b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44550c = 30000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f44551d = "MaxEventsManager";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f44552e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static p f44553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxEvents f44554g = new MaxEvents(50);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxEvents f44555h = new MaxEvents(5);

    private p() {
    }

    public static p a() {
        p pVar;
        synchronized (f44552e) {
            if (f44553f == null) {
                f44553f = new p();
            }
            pVar = f44553f;
        }
        return pVar;
    }

    public synchronized void a(MaxEvent maxEvent) {
        this.f44554g.add(maxEvent);
    }

    public void b(MaxEvent maxEvent) {
        Logger.d(f44551d, "Adding MAX Will display event. #event is " + this.f44555h.size() + ",  maxEvent=" + maxEvent.toString());
        this.f44555h.add(maxEvent);
    }

    public MaxEvents b() {
        MaxEvents maxEventsD = d();
        return maxEventsD.size() >= 10 ? maxEventsD : a(10);
    }

    private synchronized MaxEvents d() {
        MaxEvents maxEvents;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.d(f44551d, "");
        maxEvents = new MaxEvents(50);
        for (MaxEvent maxEvent : this.f44554g) {
            if (jCurrentTimeMillis - (maxEvent.c() * 1000) < 30000) {
                Logger.d(f44551d, "getEventFromLastInterval Adding max event ts = " + jCurrentTimeMillis + ", " + maxEvent.toString());
                maxEvents.add(maxEvent);
            }
        }
        return maxEvents;
    }

    public synchronized MaxEvents a(int i10) {
        MaxEvents maxEvents;
        maxEvents = new MaxEvents(i10);
        for (int size = this.f44554g.size() < 10 ? 0 : this.f44554g.size() - 10; size < this.f44554g.size(); size++) {
            Logger.d(f44551d, "getLastXEvents adding max event index " + size + Z7.f27998r + this.f44554g.get(size).toString());
            maxEvents.add(new MaxEvent(this.f44554g.get(size).b(), this.f44554g.get(size).c(), this.f44554g.get(size).d(), this.f44554g.get(size).e(), this.f44554g.get(size).a(), this.f44554g.get(size).f()));
        }
        return maxEvents;
    }

    public MaxEvents c() {
        return this.f44555h;
    }
}
