package com.google.android.exoplayer2.offline;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.exoplayer2.scheduler.Requirements;
import g5.k0;
import g5.m;
import g5.r;
import j4.d;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class DownloadService extends Service {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap<Class<? extends DownloadService>, b> f19378l = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final c f19379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f19380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @StringRes
    public final int f19381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @StringRes
    public final int f19382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.android.exoplayer2.offline.a f19383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19388k;

    public static final class b implements com.google.android.exoplayer2.offline.a.InterfaceC0178a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f19389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.offline.a f19390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final d f19392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Class<? extends DownloadService> f19393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public DownloadService f19394f;

        public b(Context context, com.google.android.exoplayer2.offline.a aVar, boolean z10, @Nullable d dVar, Class<? extends DownloadService> cls) {
            this.f19389a = context;
            this.f19390b = aVar;
            this.f19391c = z10;
            this.f19392d = dVar;
            this.f19393e = cls;
            aVar.b(this);
            j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(DownloadService downloadService) {
            downloadService.k(this.f19390b.c());
        }

        @Override // com.google.android.exoplayer2.offline.a.InterfaceC0178a
        public void b(com.google.android.exoplayer2.offline.a aVar, boolean z10) {
            if (!z10 && !aVar.d() && i()) {
                List<h4.a> listC = aVar.c();
                for (int i10 = 0; i10 < listC.size(); i10++) {
                    if (listC.get(i10).f53697a == 0) {
                        h();
                        break;
                    }
                }
            }
            j();
        }

        public void e(final DownloadService downloadService) {
            g5.a.f(this.f19394f == null);
            this.f19394f = downloadService;
            if (this.f19390b.g()) {
                new Handler().postAtFrontOfQueue(new Runnable() { // from class: h4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53698b.g(downloadService);
                    }
                });
            }
        }

        public void f(DownloadService downloadService) {
            g5.a.f(this.f19394f == downloadService);
            this.f19394f = null;
            if (this.f19392d == null || this.f19390b.h()) {
                return;
            }
            this.f19392d.cancel();
        }

        public final void h() {
            if (this.f19391c) {
                k0.G0(this.f19389a, DownloadService.g(this.f19389a, this.f19393e, "com.google.android.exoplayer.downloadService.action.RESTART"));
            } else {
                try {
                    this.f19389a.startService(DownloadService.g(this.f19389a, this.f19393e, com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.ACTION_INIT));
                } catch (IllegalStateException unused) {
                    m.h("DownloadService", "Failed to restart DownloadService (process is idle).");
                }
            }
        }

        public final boolean i() {
            DownloadService downloadService = this.f19394f;
            return downloadService == null || downloadService.i();
        }

        public final void j() {
            if (this.f19392d == null) {
                return;
            }
            if (!this.f19390b.h()) {
                this.f19392d.cancel();
                return;
            }
            String packageName = this.f19389a.getPackageName();
            if (this.f19392d.a(this.f19390b.e(), packageName, "com.google.android.exoplayer.downloadService.action.RESTART")) {
                return;
            }
            m.c("DownloadService", "Scheduling downloads failed.");
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f19397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f19398d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f19399e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ DownloadService f19400f;

        public void c() {
            this.f19398d = true;
            update();
        }

        public void d() {
            this.f19398d = false;
            this.f19397c.removeCallbacksAndMessages(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void update() {
            List<h4.a> listC = ((com.google.android.exoplayer2.offline.a) g5.a.e(this.f19400f.f19383f)).c();
            DownloadService downloadService = this.f19400f;
            downloadService.startForeground(this.f19395a, downloadService.f(listC));
            this.f19399e = true;
            if (this.f19398d) {
                this.f19397c.removeCallbacksAndMessages(null);
                this.f19397c.postDelayed(new Runnable() { // from class: h4.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53700b.update();
                    }
                }, this.f19396b);
            }
        }

        public void b() {
            if (this.f19399e) {
                return;
            }
            update();
        }
    }

    public static boolean j(int i10) {
        return i10 == 2 || i10 == 5 || i10 == 7;
    }

    public abstract com.google.android.exoplayer2.offline.a e();

    public abstract Notification f(List<h4.a> list);

    @Nullable
    public abstract d h();

    @Override // android.app.Service
    public void onDestroy() {
        this.f19388k = true;
        ((b) g5.a.e(f19378l.get(getClass()))).f(this);
        c cVar = this.f19379b;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.f19386i = true;
    }

    public static Intent g(Context context, Class<? extends DownloadService> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    private static void startService(Context context, Intent intent, boolean z10) {
        if (z10) {
            k0.G0(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public final boolean i() {
        return this.f19387j;
    }

    public final void k(List<h4.a> list) {
        if (this.f19379b != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (j(list.get(i10).f53697a)) {
                    this.f19379b.c();
                    return;
                }
            }
        }
    }

    public final void l() {
        c cVar = this.f19379b;
        if (cVar != null) {
            cVar.d();
        }
        if (k0.f53108a >= 28 || !this.f19386i) {
            this.f19387j |= stopSelfResult(this.f19384g);
        } else {
            stopSelf();
            this.f19387j = true;
        }
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = this.f19380c;
        if (str != null) {
            r.a(this, str, this.f19381d, this.f19382e, 2);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends DownloadService>, b> map = f19378l;
        b bVar = map.get(cls);
        if (bVar == null) {
            boolean z10 = this.f19379b != null;
            d dVarH = z10 ? h() : null;
            com.google.android.exoplayer2.offline.a aVarE = e();
            this.f19383f = aVarE;
            aVarE.n();
            bVar = new b(getApplicationContext(), this.f19383f, z10, dVarH, cls);
            map.put((Class<? extends DownloadService>) cls, bVar);
        } else {
            this.f19383f = bVar.f19390b;
        }
        bVar.e(this);
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        String stringExtra;
        c cVar;
        this.f19384g = i11;
        this.f19386i = false;
        String action = null;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.f19385h |= intent.getBooleanExtra("foreground", false) || "com.google.android.exoplayer.downloadService.action.RESTART".equals(action);
        } else {
            stringExtra = null;
        }
        if (action == null) {
            action = com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.ACTION_INIT;
        }
        com.google.android.exoplayer2.offline.a aVar = (com.google.android.exoplayer2.offline.a) g5.a.e(this.f19383f);
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                DownloadRequest downloadRequest = (DownloadRequest) ((Intent) g5.a.e(intent)).getParcelableExtra("download_request");
                if (downloadRequest != null) {
                    aVar.a(downloadRequest, intent.getIntExtra("stop_reason", 0));
                    break;
                } else {
                    m.c("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                aVar.n();
                break;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                aVar.l();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                Requirements requirements = (Requirements) ((Intent) g5.a.e(intent)).getParcelableExtra("requirements");
                if (requirements != null) {
                    aVar.p(requirements);
                    break;
                } else {
                    m.c("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                aVar.k();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) g5.a.e(intent)).hasExtra("stop_reason")) {
                    m.c("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    aVar.q(stringExtra, intent.getIntExtra("stop_reason", 0));
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    aVar.m(stringExtra);
                    break;
                } else {
                    m.c("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
                break;
            default:
                m.c("DownloadService", "Ignored unrecognized action: " + action);
                break;
        }
        if (k0.f53108a >= 26 && this.f19385h && (cVar = this.f19379b) != null) {
            cVar.b();
        }
        this.f19387j = false;
        if (aVar.f()) {
            l();
        }
        return 1;
    }
}
