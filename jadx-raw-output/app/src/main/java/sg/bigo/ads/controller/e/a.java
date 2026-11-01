package sg.bigo.ads.controller.e;

import android.content.ContentValues;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.t;
import sg.bigo.ads.controller.g.j;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, l>, sg.bigo.ads.controller.f.a.InterfaceC0726a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f70747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.controller.b.d f70748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.controller.b.h f70749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.b f70750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final d f70751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final e f70752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public f f70753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedList<C0725a<? extends sg.bigo.ads.api.b>> f70754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseArray<C0725a<sg.bigo.ads.controller.g.i>> f70755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f70756j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final b f70758l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f70760n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final sg.bigo.ads.controller.b f70761o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f70759m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f70757k = true;

    /* JADX INFO: renamed from: sg.bigo.ads.controller.e.a$a, reason: collision with other inner class name */
    public static class C0725a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final T f70790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final sg.bigo.ads.controller.c f70791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f70792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f70793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f70794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f70795f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p f70796g;

        private C0725a(@NonNull T t10, @NonNull sg.bigo.ads.controller.c cVar) {
            this.f70794e = 1;
            this.f70795f = 0;
            this.f70790a = t10;
            this.f70791b = cVar;
        }

        public /* synthetic */ C0725a(Object obj, sg.bigo.ads.controller.c cVar, byte b10) {
            this(obj, cVar);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile int f70798b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f70799c = true;

        public b() {
        }

        public static /* synthetic */ void a(b bVar) {
            if (bVar.f70798b == 2) {
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Task resumed.");
                bVar.a();
            }
        }

        public final void a() {
            if (this.f70798b == 0 || this.f70798b == 2) {
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Task set.");
                sg.bigo.ads.common.n.d.a(3, this, 5000L);
                this.f70798b = 1;
            }
        }

        public final void b() {
            if (this.f70798b == 1 || this.f70798b == 2) {
                if (this.f70798b == 1) {
                    sg.bigo.ads.common.n.d.a(this);
                }
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Task canceled.");
                this.f70798b = 3;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!sg.bigo.ads.common.f.b.e()) {
                b();
                return;
            }
            if (!this.f70799c || a.this.f70757k) {
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Start to execute task.");
                this.f70798b = 4;
                a.this.f70752f.a(new e.a() { // from class: sg.bigo.ads.controller.e.a.b.1
                    @Override // sg.bigo.ads.controller.e.e.a
                    public final void a(int i10) {
                        a.a(a.this, 1, (Map) null);
                    }

                    @Override // sg.bigo.ads.controller.e.e.a
                    public final void a(int i10, int i11, String str) {
                    }
                }, 0);
            } else {
                this.f70799c = false;
                sg.bigo.ads.common.t.a.b("PrefetchConfigTask", "The network is unavailable now. Task paused.");
                this.f70798b = 2;
            }
        }
    }

    public a(@NonNull Context context, @NonNull AdConfig adConfig) {
        sg.bigo.ads.controller.b bVar = new sg.bigo.ads.controller.b() { // from class: sg.bigo.ads.controller.e.a.1
            @Override // sg.bigo.ads.controller.e
            public final void a(int i10, int i11, int i12, @NonNull String str, @Nullable Object obj) {
                sg.bigo.ads.common.t.a.a(0, "AdController", "sdk config fetch error, seq=" + i10 + ", code=" + i11 + ", subCode=" + i12 + ", message=" + str);
            }

            @Override // sg.bigo.ads.controller.b
            public final void a(int i10, @NonNull String str) {
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "sdk config fetch success, seqId=" + i10 + ", data=" + str);
            }
        };
        this.f70761o = bVar;
        this.f70747a = context;
        sg.bigo.ads.controller.b.d dVar = new sg.bigo.ads.controller.b.d(context);
        this.f70748b = dVar;
        sg.bigo.ads.api.a.i.f69318a = dVar;
        sg.bigo.ads.controller.b.h hVar = new sg.bigo.ads.controller.b.h(context);
        this.f70749c = hVar;
        d dVar2 = new d(context, adConfig, dVar);
        this.f70751e = dVar2;
        sg.bigo.ads.controller.a.b bVar2 = new sg.bigo.ads.controller.a.b(context, dVar2, dVar);
        this.f70750d = bVar2;
        bVar2.f70413g = bVar;
        sg.bigo.ads.common.u.a.e.a(bVar2.f70407a.f70340m);
        sg.bigo.ads.common.u.g.f69974a = new sg.bigo.ads.common.u.a.a(dVar2);
        this.f70752f = new e(context, dVar, hVar, dVar2, bVar2);
        sg.bigo.ads.api.a.h hVar2 = sg.bigo.ads.api.a.i.f69318a;
        if (hVar2 != null) {
            sg.bigo.ads.api.a.b bVarQ = hVar2.q();
            if (bVarQ instanceof sg.bigo.ads.controller.b.b) {
                ((sg.bigo.ads.controller.b.b) bVarQ).f70515a = hVar;
            }
        }
        this.f70754h = new LinkedList<>();
        this.f70755i = new SparseArray<>();
        this.f70758l = new b();
    }

    public static /* synthetic */ void a(a aVar, int i10, Map map) {
        if (q.a((CharSequence) aVar.f70751e.f70806c.F()) || aVar.f70759m.getAndSet(true)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jI = sg.bigo.ads.common.x.a.i();
        long jElapsedRealtime = aVar.f70756j == 0 ? -1L : SystemClock.elapsedRealtime() - aVar.f70756j;
        if (jCurrentTimeMillis - jI >= 300000) {
            sg.bigo.ads.core.d.b.a(jElapsedRealtime, i10, sg.bigo.ads.common.x.a.r(), sg.bigo.ads.common.m.b.e(), (Map<String, String>) map);
            sg.bigo.ads.common.x.a.c(jCurrentTimeMillis);
            sg.bigo.ads.core.d.b.a();
            sg.bigo.ads.core.d.b.a(aVar.f70751e);
        }
    }

    public static /* synthetic */ void a(a aVar, final C0725a c0725a) {
        if (aVar.f70748b.H()) {
            sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.10
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Ad adA;
                    sg.bigo.ads.api.b bVar = (sg.bigo.ads.api.b) c0725a.f70790a;
                    l lVarA = a.this.f70749c.a(bVar);
                    if ((lVarA != null ? lVarA.w() : false) || bVar.g()) {
                        a.this.f70754h.addFirst(c0725a);
                    } else {
                        if (lVarA != null && (adA = sg.bigo.ads.ad.b.a.f67352a.a(lVarA)) != null) {
                            sg.bigo.ads.controller.c cVar = c0725a.f70791b;
                            if ((cVar instanceof sg.bigo.ads.controller.a) && (((sg.bigo.ads.controller.a) cVar).f70330a instanceof sg.bigo.ads.controller.d)) {
                                sg.bigo.ads.controller.c cVar2 = ((sg.bigo.ads.controller.a) cVar).f70330a;
                                if (cVar2 instanceof sg.bigo.ads.controller.d) {
                                    ((sg.bigo.ads.controller.d) cVar2).a(lVarA, adA);
                                }
                            }
                        }
                        a.this.f70754h.offer(c0725a);
                    }
                    a.this.a();
                }
            });
        } else {
            aVar.a(c0725a, 1005, 10004, "The country where the ad request comes from is not supported, please change your country to RU or US and have a try. Besides, check your COPPA setup on bigo's console. The app will fail to send an ad request if it's targeted children under 13.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final void a() {
        C0725a<? extends sg.bigo.ads.api.b> c0725aPoll;
        int i10;
        int i11;
        String str;
        sg.bigo.ads.controller.g.i cVar;
        boolean z10;
        sg.bigo.ads.api.core.b bVarA;
        sg.bigo.ads.api.a.h hVar;
        int i12;
        sg.bigo.ads.api.a.h hVar2;
        while (this.f70755i.size() < this.f70748b.D() && (c0725aPoll = this.f70754h.poll()) != null) {
            l lVarA = this.f70749c.a((sg.bigo.ads.api.b) c0725aPoll.f70790a);
            String str2 = ((sg.bigo.ads.api.b) c0725aPoll.f70790a).f69320b;
            byte b10 = 0;
            if (lVarA == null) {
                sg.bigo.ads.common.t.a.a(0, "AdController", "scheduleRequest error, slot is empty, slot id=" + ((sg.bigo.ads.api.b) c0725aPoll.f70790a).f69319a);
                i10 = 1014;
                i11 = 10006;
                str = "The slot id is inactive or invalid, please make sure the id is aligned with app id. If ids are correct, please wait for at least 30 minutes then try again";
            } else if (!lVarA.m()) {
                sg.bigo.ads.common.t.a.a(0, "AdController", "schedule next request, slot is disable, slot id=" + ((sg.bigo.ads.api.b) c0725aPoll.f70790a).f69319a);
                i10 = 1015;
                i11 = 10005;
                str = "The switch of the slot is turned off. Please check slot setup.";
            } else if (((sg.bigo.ads.api.b) c0725aPoll.f70790a).a(lVarA.b())) {
                sg.bigo.ads.common.t.a.a(0, "AdController", "schedule next request, this slot id is ad type " + lVarA.b() + ", request as type " + ((sg.bigo.ads.api.b) c0725aPoll.f70790a).c());
                i10 = 1016;
                i11 = 10007;
                str = "The ad type of this slot isn't consistent with the method to querying an ad.";
            } else {
                boolean zW = lVarA.w();
                if (!zW && !TextUtils.isEmpty(str2)) {
                    sg.bigo.ads.common.t.a.a(0, "AdController", "requsting an ordinary ad with server bidding payload.");
                }
                if (c0725aPoll.f70792c && (hVar2 = sg.bigo.ads.api.a.i.f69318a) != null && hVar2.q().f(lVarA.l()) > 1) {
                    sg.bigo.ads.common.t.a.a(0, "AdController", "schedule next request, slot is timeout, slot id=" + ((sg.bigo.ads.api.b) c0725aPoll.f70790a).f69319a);
                    i12 = 10207;
                } else {
                    if (!c0725aPoll.f70793d || (hVar = sg.bigo.ads.api.a.i.f69318a) == null || hVar.q().g(lVarA.l()) <= 1) {
                        if (sg.bigo.ads.api.core.a.d(lVarA.b())) {
                            sg.bigo.ads.common.x.a.j(lVarA.l());
                            int iA = lVarA.q().a("splash_impression_limit");
                            if (iA <= 0) {
                                z10 = true;
                            } else {
                                z10 = sg.bigo.ads.common.x.a.i(lVarA.l()) < iA;
                                if (!z10) {
                                    sg.bigo.ads.common.t.a.b("AdController", "The maximum number of ad impressions for the day (" + iA + ") has been reached.");
                                }
                            }
                            if (!z10) {
                                i10 = 1017;
                                i11 = 10008;
                                str = "The impressions of the ad has reached the limit. You can change this setup on bigo's console";
                            } else if (!zW && (bVarA = sg.bigo.ads.controller.c.a.a(lVarA, ((sg.bigo.ads.api.b) c0725aPoll.f70790a).f69326h)) != null) {
                                if (bVarA.J()) {
                                    sg.bigo.ads.controller.c.a.a(lVarA.l());
                                } else {
                                    sg.bigo.ads.common.t.a.a("AdController", "Succeed to load splash ads from local db.");
                                    sg.bigo.ads.api.core.f.a aVar = new sg.bigo.ads.api.core.f.a(bVarA, lVarA, (sg.bigo.ads.api.b) c0725aPoll.f70790a, this.f70747a, b());
                                    aVar.f69382a = this.f70751e;
                                    c0725aPoll.f70791b.a(-1, c0725aPoll.f70790a, aVar.a());
                                }
                            }
                        }
                        sg.bigo.ads.api.a.h hVar3 = sg.bigo.ads.api.a.i.f69318a;
                        if (hVar3 != null && hVar3.t() && !this.f70757k) {
                            a(c0725aPoll, 1003, 3006, "no network connection");
                            return;
                        }
                        sg.bigo.ads.controller.b.d dVar = this.f70748b;
                        d dVar2 = this.f70751e;
                        sg.bigo.ads.controller.a.b bVar = this.f70750d;
                        sg.bigo.ads.api.b bVar2 = (sg.bigo.ads.api.b) c0725aPoll.f70790a;
                        if (bVar2.e()) {
                            cVar = new j(dVar, dVar2, bVar, bVar2, lVarA, this);
                        } else {
                            cVar = lVarA.w() ? new sg.bigo.ads.controller.g.c(dVar, dVar2, bVar2, lVarA, this) : new sg.bigo.ads.controller.g.b(dVar, dVar2, bVar, bVar2, lVarA, this);
                        }
                        this.f70755i.put(cVar.a(), new C0725a<>(cVar, c0725aPoll.f70791b, b10));
                        sg.bigo.ads.api.b.a aVar2 = ((sg.bigo.ads.api.b) c0725aPoll.f70790a).f69326h;
                        if (aVar2.f69337k == 0) {
                            aVar2.f69337k = System.currentTimeMillis();
                        }
                        c0725aPoll.f70794e = 2;
                        if (cVar instanceof sg.bigo.ads.controller.g.b) {
                            c0725aPoll.f70796g = ((sg.bigo.ads.controller.g.b) cVar).f70900h;
                        }
                        cVar.b();
                        Map<String, Object> mapA = sg.bigo.ads.core.b.a.a("load", lVarA, (sg.bigo.ads.api.b) c0725aPoll.f70790a, null, Integer.valueOf(lVarA.v()));
                        mapA.put("is_server_request", 1);
                        sg.bigo.ads.core.b.b.a().a("load", mapA);
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, "AdController", "schedule next request, slot is loaded with cache, slot id=" + ((sg.bigo.ads.api.b) c0725aPoll.f70790a).f69319a);
                    i12 = 10208;
                }
                a(c0725aPoll, 1011, i12, "no fill");
            }
            a(c0725aPoll, i10, i11, str);
        }
    }

    @Override // sg.bigo.ads.controller.e
    public final /* synthetic */ void a(final int i10, final int i11, final int i12, @NonNull final String str, @Nullable l lVar) {
        final l lVar2 = lVar;
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.3
            @Override // java.lang.Runnable
            public final void run() {
                C0725a<sg.bigo.ads.controller.g.i> c0725a = a.this.f70755i.get(i10);
                if (c0725a != null) {
                    sg.bigo.ads.api.b bVarK = c0725a.f70790a.k();
                    a.this.f70755i.remove(i10);
                    int i13 = i11;
                    String str2 = str;
                    if (i13 == 1005) {
                        if (i12 == -6) {
                            i13 = 1004;
                            str2 = "The sdk integration and ad request are successful, but no ad wins at this time.";
                        } else {
                            str2 = "Error from server: " + str;
                        }
                    }
                    c0725a.f70791b.a(i10, i13, i12, str2, Pair.create(bVarK, lVar2));
                }
                a.this.a();
            }
        });
    }

    @Override // sg.bigo.ads.controller.e
    public final /* synthetic */ void a(final int i10, @NonNull sg.bigo.ads.api.b bVar, @NonNull sg.bigo.ads.api.core.b[] bVarArr) {
        final sg.bigo.ads.api.b bVar2 = bVar;
        final sg.bigo.ads.api.core.b[] bVarArr2 = bVarArr;
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.2
            @Override // java.lang.Runnable
            public final void run() {
                C0725a<sg.bigo.ads.controller.g.i> c0725a = a.this.f70755i.get(i10);
                if (c0725a != null) {
                    a.this.f70755i.remove(i10);
                    if (!k.a(bVarArr2)) {
                        sg.bigo.ads.api.core.f[] fVarArr = new sg.bigo.ads.api.core.f[bVarArr2.length];
                        int i11 = 0;
                        while (true) {
                            sg.bigo.ads.api.core.b[] bVarArr3 = bVarArr2;
                            if (i11 >= bVarArr3.length) {
                                break;
                            }
                            sg.bigo.ads.api.core.b bVar3 = bVarArr3[i11];
                            l lVarL = c0725a.f70790a.l();
                            sg.bigo.ads.api.b bVar4 = bVar2;
                            a aVar = a.this;
                            sg.bigo.ads.api.core.f.a aVar2 = new sg.bigo.ads.api.core.f.a(bVar3, lVarL, bVar4, aVar.f70747a, aVar.b());
                            aVar2.f69382a = a.this.f70751e;
                            fVarArr[i11] = aVar2.a();
                            if (sg.bigo.ads.api.core.a.d(bVar3.x())) {
                                t.a();
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("slot", bVar3.b());
                                contentValues.put("log_id", Long.valueOf(bVar3.Z()));
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                contentValues.put("start_time", Long.valueOf(jCurrentTimeMillis));
                                contentValues.put("end_time", Long.valueOf((bVar3.L() * 1000) + jCurrentTimeMillis));
                                JSONObject jSONObjectAf = bVar3.af();
                                contentValues.put("ad_data", jSONObjectAf == null ? "" : jSONObjectAf.toString());
                                contentValues.put("mtime", Long.valueOf(jCurrentTimeMillis));
                                sg.bigo.ads.common.g.a.a.b("tb_addata", contentValues);
                            }
                            i11++;
                        }
                        c0725a.f70791b.a(i10, bVar2, fVarArr);
                    }
                }
                a.this.a();
            }
        });
    }

    public final void a(String str, String str2) {
        this.f70750d.a(str, str2);
    }

    public final void a(@NonNull final C0725a<? extends sg.bigo.ads.api.b> c0725a, final int i10, final int i11, final String str) {
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.controller.e.a.11
            @Override // java.lang.Runnable
            public final void run() {
                c0725a.f70791b.a(0, i10, i11, str, new Pair(c0725a.f70790a, null));
            }
        });
    }

    @Override // sg.bigo.ads.controller.f.a.InterfaceC0726a
    public final void a(boolean z10) {
        this.f70757k = z10;
        if (z10) {
            sg.bigo.ads.common.aa.b.a();
            b.a(this.f70758l);
        }
    }

    public final Context b() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                return this.f70747a;
            }
            Context context = this.f70760n;
            if (context != null) {
                return context;
            }
            Context contextCreateWindowContext = this.f70747a.createDisplayContext(((DisplayManager) this.f70747a.getSystemService(DisplayManager.class)).getDisplay(0)).createWindowContext(1001, null);
            this.f70760n = contextCreateWindowContext;
            return contextCreateWindowContext;
        } catch (Throwable unused) {
            return this.f70747a;
        }
    }
}
