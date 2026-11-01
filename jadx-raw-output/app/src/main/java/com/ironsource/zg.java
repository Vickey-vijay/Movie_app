package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC3659q3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class zg<Smash extends AbstractC3659q3<?>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC3659q3<?> f31756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f31757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f31758f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Ag f31760h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f31753a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31754b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31755c = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Timer f31759g = new Timer();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f31761i = 5;

    public class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31762a;

        public a(String str) {
            this.f31762a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f31762a + " from memory");
                zg.this.f31753a.remove(this.f31762a);
                ironLog.verbose("waterfall size is currently " + zg.this.f31753a.size());
            } finally {
                cancel();
            }
        }
    }

    private synchronized boolean e() {
        AbstractC3659q3<?> abstractC3659q3;
        abstractC3659q3 = this.f31756d;
        return abstractC3659q3 != null && abstractC3659q3.C() && this.f31756d.h().equals(this.f31755c);
    }

    public synchronized void a(AbstractC3659q3<?> abstractC3659q3) {
        IronLog.INTERNAL.verbose();
        AbstractC3659q3<?> abstractC3659q4 = this.f31756d;
        if (abstractC3659q4 != null && !abstractC3659q4.equals(abstractC3659q3)) {
            this.f31756d.M();
        }
    }

    public synchronized void b(AbstractC3659q3<?> abstractC3659q3) {
        IronLog.INTERNAL.verbose();
        this.f31756d = abstractC3659q3;
    }

    public String c() {
        return this.f31754b;
    }

    public AbstractC3659q3<?> d() {
        return this.f31756d;
    }

    public zg(List<String> list, int i10, Ag ag2) {
        this.f31757e = list;
        this.f31758f = i10;
        this.f31760h = ag2;
    }

    public List<Smash> b() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f31753a.get(this.f31754b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    public synchronized boolean a(O0.a aVar, String str, String str2, LoadWhileShowSupportState loadWhileShowSupportState, AdapterBaseInterface adapterBaseInterface, IronSource.a aVar2) {
        boolean z10;
        AbstractC3659q3<?> abstractC3659q3;
        boolean zA = a(adapterBaseInterface, aVar2, str);
        z10 = true;
        if (zA || ((aVar == O0.a.AUTOMATIC_LOAD_WHILE_SHOW || aVar == O0.a.MANUAL_WITH_LOAD_ON_SHOW) && (abstractC3659q3 = this.f31756d) != null && abstractC3659q3.C() && ((loadWhileShowSupportState == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK && this.f31756d.c().equals(str)) || ((loadWhileShowSupportState == LoadWhileShowSupportState.NONE || this.f31757e.contains(str2)) && this.f31756d.n().equals(str2))))) {
            z10 = false;
        }
        if (!z10) {
            IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
        }
        return z10;
    }

    public boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(C3772wf.a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public void a(O0.a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        a();
        if (aVar != O0.a.AUTOMATIC_LOAD_WHILE_SHOW && aVar != O0.a.MANUAL_WITH_LOAD_ON_SHOW) {
            this.f31753a.clear();
            this.f31753a.put(str, copyOnWriteArrayList);
        } else {
            this.f31753a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f31755c)) {
                if (e()) {
                    ironLog.verbose("ad from previous waterfall " + this.f31755c + " is still showing - the current waterfall " + this.f31754b + " will be deleted instead");
                    String str2 = this.f31754b;
                    this.f31754b = this.f31755c;
                    this.f31755c = str2;
                }
                this.f31759g.schedule(new a(this.f31755c), this.f31758f);
            }
        }
        this.f31755c = this.f31754b;
        this.f31754b = str;
        if (this.f31753a.size() > 5) {
            this.f31760h.a(this.f31753a.size());
        }
    }

    private void a() {
        for (Smash smash : b()) {
            if (!smash.equals(this.f31756d)) {
                smash.M();
            }
        }
    }
}
