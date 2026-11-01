package sg.bigo.ads.controller.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.g.l;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a f70407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.common.g f70408b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.controller.b f70413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sg.bigo.ads.api.a.h f70414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f70415i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f70409c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f70410d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f70411e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f70412f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g f70417k = new g() { // from class: sg.bigo.ads.controller.a.b.1
        @Override // sg.bigo.ads.controller.a.g
        public final void a(String str) {
            b.this.f70407a.a(0L);
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], reSave config, fromUrlPath=".concat(String.valueOf(str)));
        }

        @Override // sg.bigo.ads.controller.a.g
        public final void a(String str, boolean z10) {
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "fetchConfig, country=" + str + ", fromSDKConfigUrl=" + z10);
            if (!z10) {
                b.a(b.this, (l.a) null);
            }
            b.a(b.this, str, true);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f70418l = new Runnable() { // from class: sg.bigo.ads.controller.a.b.2
        @Override // java.lang.Runnable
        public final void run() {
            if (b.a(b.this, new l.a() { // from class: sg.bigo.ads.controller.a.b.2.1
                @Override // sg.bigo.ads.controller.g.l.a
                public final void a(String str, int i10, int i11, int i12, @NonNull String str2, @Nullable Map<String, Object> map) {
                    b bVar = b.this;
                    b.a(bVar, bVar.f70408b.v(), false);
                }

                @Override // sg.bigo.ads.controller.g.l.a
                public final void a(String str, int i10, String str2, @Nullable Map<String, Object> map) {
                }
            })) {
                return;
            }
            b bVar = b.this;
            b.a(bVar, bVar.f70408b.v(), false);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, String> f70416j = new ConcurrentHashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f70445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f70446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f70447c;

        private a(k kVar, String str, long j10) {
            this.f70445a = kVar;
            this.f70446b = str;
            this.f70447c = j10;
        }

        public /* synthetic */ a(k kVar, String str, long j10, byte b10) {
            this(kVar, str, j10);
        }
    }

    public b(@NonNull Context context, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.api.a.h hVar) {
        this.f70415i = context;
        this.f70407a = new sg.bigo.ads.controller.a.a(context, hVar);
        this.f70408b = gVar;
        this.f70414h = hVar;
    }

    public static /* synthetic */ boolean a(b bVar, final String str, boolean z10) {
        bVar.f70411e.compareAndSet(false, z10);
        if (!bVar.f70410d.compareAndSet(false, true)) {
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] fetch pay svr config return because is fetching, fetch free svr config after fail -> ".concat(String.valueOf(z10)));
            return false;
        }
        sg.bigo.ads.controller.a.a.f fVar = bVar.f70407a.f70337j;
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] fetch pay svr config, canFetch=" + fVar.a() + ", fetch free svr config after fail -> " + z10);
        final ValueCallback<a> valueCallback = new ValueCallback<a>() { // from class: sg.bigo.ads.controller.a.b.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(a aVar) {
                k kVar;
                a aVar2 = aVar;
                b.this.f70410d.set(false);
                b.this.f70411e.set(false);
                b.this.f70412f.set(false);
                if (aVar2 == null || (kVar = aVar2.f70445a) == null) {
                    return;
                }
                b.this.a(aVar2.f70446b, kVar.f70505a, aVar2.f70447c, true);
            }
        };
        final ValueCallback<String> valueCallback2 = new ValueCallback<String>() { // from class: sg.bigo.ads.controller.a.b.6
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(String str2) {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] all svr urls are fail");
                b.this.f70411e.set(false);
                b.this.f70412f.set(false);
            }
        };
        if (fVar.a()) {
            fVar.b();
            bVar.a(str, fVar, valueCallback, new ValueCallback<String>() { // from class: sg.bigo.ads.controller.a.b.7
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    b.this.f70410d.set(false);
                    if (b.this.f70411e.compareAndSet(true, false) && b.this.f70412f.compareAndSet(false, true)) {
                        b.this.a(str, valueCallback, valueCallback2);
                    } else {
                        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] all pay svr urls are fail");
                    }
                }
            });
            return true;
        }
        if (bVar.f70411e.compareAndSet(true, false) && bVar.f70412f.compareAndSet(false, true)) {
            bVar.a(str, valueCallback, valueCallback2);
        }
        bVar.f70410d.set(false);
        return false;
    }

    public static /* synthetic */ boolean a(b bVar, final l.a aVar) {
        final sg.bigo.ads.controller.a.a.c cVar = bVar.f70407a.f70334g;
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[sdk config] fetch sdk config, canFetch=" + cVar.b() + ", ignoreFetchInterval=false");
        if (!bVar.f70409c.compareAndSet(false, true)) {
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[sdk config] fetch sdk config return because it is fetching.");
            return false;
        }
        if (!cVar.b()) {
            bVar.f70409c.set(false);
            return false;
        }
        cVar.f70369g = System.currentTimeMillis();
        bVar.f70407a.a(0L);
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], fetch sdk config");
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        new l(bVar.f70408b, bVar, new l.a() { // from class: sg.bigo.ads.controller.a.b.4
            @Override // sg.bigo.ads.controller.g.l.a
            public final void a(String str, int i10, int i11, int i12, @NonNull String str2, @Nullable Map<String, Object> map) {
                b.this.f70409c.set(false);
                if (TextUtils.isEmpty(sg.bigo.ads.common.utils.l.a(map, "host_cfg"))) {
                    sg.bigo.ads.core.d.b.a(jElapsedRealtime > 0 ? SystemClock.elapsedRealtime() - jElapsedRealtime : 0L, false, str, 4001, "code=" + i11 + ",subCode=" + i12 + ",message=" + str2);
                }
                l.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str, i10, i11, i12, str2, map);
                }
                sg.bigo.ads.controller.b bVar2 = b.this.f70413g;
                if (bVar2 != null) {
                    bVar2.a(i10, i11, i12, str2, map);
                }
            }

            @Override // sg.bigo.ads.controller.g.l.a
            public final void a(String str, int i10, String str2, @Nullable Map<String, Object> map) {
                b.this.f70409c.set(false);
                cVar.f70370h = System.currentTimeMillis();
                b.this.f70407a.a(0L);
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], fetch sdk config, on sdk config fetch success");
                if (TextUtils.isEmpty(sg.bigo.ads.common.utils.l.a(map, "host_cfg"))) {
                    sg.bigo.ads.core.d.b.a(jElapsedRealtime > 0 ? SystemClock.elapsedRealtime() - jElapsedRealtime : 0L, false, str, 4002, "host_cfg is empty.");
                }
                l.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str, i10, str2, map);
                }
                sg.bigo.ads.controller.b bVar2 = b.this.f70413g;
                if (bVar2 != null) {
                    bVar2.a(i10, str2);
                }
            }
        }).b();
        return true;
    }

    @NonNull
    public final h a(String str, String str2, long j10, boolean z10) {
        h hVarA = this.f70407a.a(str, str2, this.f70416j, this.f70408b.v(), this.f70414h.s());
        long jElapsedRealtime = j10 <= 0 ? 0L : SystemClock.elapsedRealtime() - j10;
        if (hVarA.f70497b) {
            this.f70407a.a(0L);
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], update host config, configSource=" + str2 + ", result=" + hVarA);
            if (z10) {
                sg.bigo.ads.core.d.b.a(jElapsedRealtime, hVarA.f70498c, str2, true);
            }
        } else {
            int i10 = hVarA.f70499d;
            if (i10 == 0) {
                if (z10) {
                    sg.bigo.ads.core.d.b.a(jElapsedRealtime, hVarA.f70498c, str2, false);
                }
            } else if (z10) {
                sg.bigo.ads.core.d.b.a(jElapsedRealtime, hVarA.f70498c, str2, i10, hVarA.f70500e);
            }
        }
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "updateHostConfig, configSource=" + str2 + ", update result=" + hVarA);
        return hVarA;
    }

    public final void a(long j10, String str) {
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "fetchAntiBanConfig, delayMillis=" + j10 + ", from=" + str);
        sg.bigo.ads.common.n.d.a(this.f70418l);
        sg.bigo.ads.common.n.d.a(1, this.f70418l, Math.max(j10, 0L));
    }

    public final void a(String str, String str2) {
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "addExtraHost, country=" + str + ", host=" + str2);
        if (d.a(str2)) {
            if (q.a((CharSequence) str)) {
                str = "all";
            }
            this.f70416j.put(str, str2);
            if (this.f70407a.a(str, str2)) {
                this.f70407a.a(10L);
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "saveAsync, addExtraHost, delayMillis=10");
            }
        }
    }

    public final void a(@NonNull final String str, @NonNull final sg.bigo.ads.controller.a.a.g gVar, @Nullable final ValueCallback<a> valueCallback, @Nullable final ValueCallback<String> valueCallback2) {
        final k kVarA = gVar.a(str);
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] [saveAsync] fetch svr config, country=" + str + ", url=" + kVarA);
        this.f70407a.a(0L);
        if (kVarA == null) {
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue("not available url.");
            }
        } else {
            sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(new sg.bigo.ads.common.u.b.d(kVarA.f70505a), this.f70415i);
            aVar.f69951l = sg.bigo.ads.common.u.a.e.b();
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            sg.bigo.ads.common.u.g.a(aVar, new sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.a, sg.bigo.ads.common.u.c.d>() { // from class: sg.bigo.ads.controller.a.b.9
                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ sg.bigo.ads.common.u.c.c a(@NonNull sg.bigo.ads.common.u.c.a aVar2) {
                    return new sg.bigo.ads.common.u.c.d(aVar2);
                }

                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.c.c cVar2) {
                    sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] succeed to fetch net disk url: " + kVarA.f70505a);
                    String strA = ((sg.bigo.ads.common.u.c.d) cVar2).a();
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue(new a(kVarA, strA, jElapsedRealtime, (byte) 0));
                    }
                }

                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.h hVar) {
                    sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] try another net disk url due to failed to fetch net disk url: " + kVarA.f70505a);
                    sg.bigo.ads.core.d.b.a(jElapsedRealtime > 0 ? SystemClock.elapsedRealtime() - jElapsedRealtime : 0L, false, kVarA.f70505a, 4000, "NetError:" + hVar.f69975a + ", " + hVar.getMessage());
                    b.this.a(str, gVar, valueCallback, valueCallback2);
                }
            });
        }
    }

    public final boolean a(String str, final ValueCallback<a> valueCallback, ValueCallback<String> valueCallback2) {
        final sg.bigo.ads.controller.a.a.e eVar = this.f70407a.f70338k;
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] fetch free svr config, canFetch=" + eVar.a());
        if (!eVar.a()) {
            this.f70412f.set(false);
            return false;
        }
        eVar.b();
        a(str, eVar, new ValueCallback<a>() { // from class: sg.bigo.ads.controller.a.b.8
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(a aVar) {
                eVar.a(true);
                b.this.f70407a.a(0L);
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] [saveAsync], fetch third free svr config, onSuccess");
                valueCallback.onReceiveValue(aVar);
            }
        }, valueCallback2);
        return true;
    }

    public final f b(@NonNull String str, String str2) {
        f.a aVar = new f.a(this.f70407a, this.f70408b, this.f70414h, str, str2);
        aVar.a(this.f70417k);
        return aVar;
    }
}
