package com.applovin.impl;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f7015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f7016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f7017c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f7018d = new AtomicInteger();

    public interface b {
        void a();

        boolean b();
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f7020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f7021c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f7019a;
            String str2 = ((c) obj).f7019a;
            if (str != null) {
                return str.equalsIgnoreCase(str2);
            }
            return str2 == null;
        }

        private c(String str, long j10, b bVar) {
            this.f7019a = str;
            this.f7021c = j10;
            this.f7020b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b a() {
            return this.f7020b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f7021c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.f7019a;
        }

        public int hashCode() {
            String str = this.f7019a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f7019a + "', countdownStepMillis=" + this.f7021c + '}';
        }
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7015a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f7017c.clear();
    }

    public void b() {
        HashSet<c> hashSet = new HashSet(this.f7017c);
        if (com.applovin.impl.sdk.o.a()) {
            this.f7015a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.f7018d.incrementAndGet();
        for (c cVar : hashSet) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7015a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + iIncrementAndGet + "...");
            }
            a(cVar, iIncrementAndGet);
        }
    }

    public b1(Handler handler, com.applovin.impl.sdk.k kVar) {
        if (handler != null) {
            if (kVar != null) {
                this.f7016b = handler;
                this.f7015a = kVar.O();
                return;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No handler specified.");
    }

    public void c() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7015a.a("CountdownManager", "Stopping countdowns...");
        }
        this.f7018d.incrementAndGet();
        this.f7016b.removeCallbacksAndMessages(null);
    }

    public void a(String str, long j10, b bVar) {
        if (j10 > 0) {
            if (this.f7016b != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7015a.a("CountdownManager", "Adding countdown: " + str);
                }
                this.f7017c.add(new c(str, j10, bVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar, int i10) {
        b bVarA = cVar.a();
        if (bVarA.b()) {
            if (this.f7018d.get() == i10) {
                try {
                    bVarA.a();
                    a(cVar, i10);
                    return;
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7015a.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th2);
                    }
                    a();
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f7015a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7015a.a("CountdownManager", "Ending countdown for " + cVar.c());
        }
    }

    private void a(final c cVar, final int i10) {
        this.f7016b.postDelayed(new Runnable() { // from class: com.applovin.impl.e9
            @Override // java.lang.Runnable
            public final void run() {
                this.f7442b.b(cVar, i10);
            }
        }, cVar.b());
    }
}
