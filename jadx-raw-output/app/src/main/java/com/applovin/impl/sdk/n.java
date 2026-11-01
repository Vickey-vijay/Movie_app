package com.applovin.impl.sdk;

import android.app.ActivityManager;
import androidx.appcompat.widget.ActivityChooserModel;
import com.applovin.impl.n7;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f9383l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f9384a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f9386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f9387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f9388e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Object f9392i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f9385b = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f9389f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f9390g = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f9393j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f9394k = new Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f9395a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9396b;

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public long b() {
            return this.f9395a;
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        public static /* synthetic */ int a(a aVar) {
            int i10 = aVar.f9396b;
            aVar.f9396b = i10 + 1;
            return i10;
        }

        public int hashCode() {
            long jB = b();
            return ((((int) (jB ^ (jB >>> 32))) + 59) * 59) + a();
        }

        public int a() {
            return this.f9396b;
        }
    }

    public void a(boolean z10) {
        synchronized (this.f9389f) {
            this.f9390g.set(z10);
            if (z10) {
                this.f9391h = System.currentTimeMillis();
                this.f9384a.O();
                if (o.a()) {
                    this.f9384a.O().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f9391h);
                }
                ActivityManager.MemoryInfo memoryInfoA = n7.a((ActivityManager) k.o().getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY));
                if (memoryInfoA != null) {
                    this.f9388e = memoryInfoA.availMem;
                }
                final Long l10 = (Long) this.f9384a.a(x4.J1);
                if (l10.longValue() >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.e1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9230b.a(l10);
                        }
                    }, l10.longValue());
                }
            } else {
                this.f9391h = 0L;
                this.f9384a.O();
                if (o.a()) {
                    this.f9384a.O().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    public long b() {
        return this.f9386c;
    }

    public Long c() {
        return this.f9387d;
    }

    public void b(Object obj) {
        if (!w3.a(obj) && this.f9385b.compareAndSet(true, false)) {
            this.f9392i = null;
            this.f9384a.O();
            if (o.a()) {
                this.f9384a.O().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public void c(String str) {
        synchronized (this.f9394k) {
            a aVar = (a) this.f9393j.get(str);
            if (aVar == null) {
                aVar = new a();
                this.f9393j.put(str, aVar);
            }
            aVar.f9395a = System.currentTimeMillis();
            a.a(aVar);
        }
    }

    public boolean d() {
        return this.f9385b.get();
    }

    public boolean e() {
        return this.f9390g.get();
    }

    public n(k kVar) {
        this.f9384a = kVar;
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f9394k) {
            aVar = (a) this.f9393j.get(str);
            if (aVar == null) {
                aVar = f9383l;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        if (e() && System.currentTimeMillis() - this.f9391h >= l10.longValue()) {
            this.f9384a.O();
            if (o.a()) {
                this.f9384a.O().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f9390g.set(false);
        }
    }

    public Object a() {
        return this.f9392i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0068  */
    public void a(final Object obj) {
        if (!w3.a(obj) && this.f9385b.compareAndSet(false, true)) {
            this.f9392i = obj;
            this.f9386c = System.currentTimeMillis();
            this.f9384a.O();
            if (o.a()) {
                this.f9384a.O().a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f9386c);
            }
            ActivityManager.MemoryInfo memoryInfoA = n7.a((ActivityManager) k.o().getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY));
            if (memoryInfoA != null) {
                long j10 = this.f9388e;
                if (j10 > 0) {
                    this.f9387d = Long.valueOf(j10 - memoryInfoA.availMem);
                    this.f9388e = 0L;
                } else {
                    this.f9387d = null;
                }
            } else {
                this.f9387d = null;
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final Long l10 = (Long) this.f9384a.a(x4.K1);
            if (l10.longValue() >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9218b.a(l10, obj);
                    }
                }, l10.longValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10, Object obj) {
        if (this.f9385b.get() && System.currentTimeMillis() - this.f9386c >= l10.longValue()) {
            this.f9384a.O();
            if (o.a()) {
                this.f9384a.O().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.f9394k) {
            this.f9393j.remove(str);
        }
    }
}
