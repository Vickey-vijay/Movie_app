package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.ironsource.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C3818za {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f31708i = "WaterfallLifeCycleHolder";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.ironsource.mediationsdk.t f31712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f31713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f31714f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap<String, CopyOnWriteArrayList<com.ironsource.mediationsdk.t>> f31709a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31710b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31711c = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Timer f31715g = new Timer();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ConcurrentHashMap<String, AdInfo> f31716h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.ironsource.za$a */
    public class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31717a;

        public a(String str) {
            this.f31717a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f31717a + " from memory");
                C3818za.this.f31709a.remove(this.f31717a);
                ironLog.verbose("waterfall size is currently " + C3818za.this.f31709a.size());
                ironLog.verbose("removing adInfo with id " + this.f31717a + " from memory");
                C3818za.this.f31716h.remove(this.f31717a);
                ironLog.verbose("adInfo size is currently " + C3818za.this.f31716h.size());
            } finally {
                cancel();
            }
        }
    }

    public synchronized void a(com.ironsource.mediationsdk.t tVar) {
        IronLog.INTERNAL.verbose();
        com.ironsource.mediationsdk.t tVar2 = this.f31712d;
        if (tVar2 != null && !tVar2.equals(tVar)) {
            this.f31712d.q();
        }
        this.f31712d = tVar;
    }

    public synchronized boolean b(com.ironsource.mediationsdk.t tVar) {
        boolean z10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        z10 = false;
        if (tVar == null || tVar.o() || (this.f31712d != null && ((tVar.w() == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK && this.f31712d.c().equals(tVar.c())) || ((tVar.w() == LoadWhileShowSupportState.NONE || this.f31713e.contains(tVar.j())) && this.f31712d.j().equals(tVar.j()))))) {
            z10 = true;
        }
        if (z10 && tVar != null) {
            ironLog.verbose(tVar.c() + " will not be added to the auction request");
        }
        return !z10;
    }

    public synchronized boolean g() {
        com.ironsource.mediationsdk.t tVar;
        tVar = this.f31712d;
        return tVar != null && tVar.u().equals(this.f31711c);
    }

    public CopyOnWriteArrayList<com.ironsource.mediationsdk.t> c() {
        CopyOnWriteArrayList<com.ironsource.mediationsdk.t> copyOnWriteArrayList = this.f31709a.get(this.f31710b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public String d() {
        return this.f31710b;
    }

    public int e() {
        return this.f31709a.size();
    }

    public com.ironsource.mediationsdk.t f() {
        return this.f31712d;
    }

    public C3818za(List<String> list, int i10) {
        this.f31713e = list;
        this.f31714f = i10;
    }

    public void a(CopyOnWriteArrayList<com.ironsource.mediationsdk.t> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        b();
        this.f31709a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f31711c)) {
            if (g()) {
                ironLog.verbose("ad from previous waterfall " + this.f31711c + " is still showing - the current waterfall " + this.f31710b + " will be deleted instead");
                String str2 = this.f31710b;
                this.f31710b = this.f31711c;
                this.f31711c = str2;
            }
            this.f31715g.schedule(new a(this.f31711c), this.f31714f);
        }
        this.f31711c = this.f31710b;
        this.f31710b = str;
    }

    private void b() {
        for (com.ironsource.mediationsdk.t tVar : c()) {
            if (!tVar.equals(this.f31712d)) {
                tVar.q();
            }
        }
    }

    public boolean a() {
        return this.f31709a.size() > 5;
    }

    public void a(String str, Z8 z10, Bb bb2) {
        if (TextUtils.isEmpty(str) || z10 == null) {
            return;
        }
        this.f31716h.put(str, new AdInfo(z10, bb2));
    }

    public AdInfo a(String str) {
        if (this.f31716h.containsKey(str)) {
            return this.f31716h.get(str);
        }
        return null;
    }
}
