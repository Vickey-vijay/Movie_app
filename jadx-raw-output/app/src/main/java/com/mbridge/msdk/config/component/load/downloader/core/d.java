package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: DownloadRequest.java */
/* JADX INFO: loaded from: classes6.dex */
public class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f33262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.b<T> f33263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.c f33264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f33265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f33266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Future f33267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, List<String>> f33268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.h f33269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f33270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33271j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.e f33274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f33275n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f33277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f33278q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f33279r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f33272k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f33276o = 0;

    /* JADX INFO: compiled from: DownloadRequest.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f33280a;

        public a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f33280a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f33269h != null) {
                    d.this.f33269h.a(this.f33280a);
                }
                d.this.b();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: DownloadRequest.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f33282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.a f33283b;

        public b(com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
            this.f33282a = bVar;
            this.f33283b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f33272k >= d.this.f33271j) {
                    d.this.a(com.mbridge.msdk.config.component.load.downloader.e.FAILED);
                    if (d.this.f33269h != null) {
                        d.this.f33269h.a(this.f33282a, this.f33283b);
                    }
                    d.this.b();
                    return;
                }
                d.this.a(com.mbridge.msdk.config.component.load.downloader.e.RETRY);
                d.this.f33272k++;
                d.this.a(0L);
                d.this.b(0L);
                com.mbridge.msdk.config.component.load.downloader.core.f.a().b(d.this);
                com.mbridge.msdk.config.component.load.downloader.core.f.a().a(d.this);
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: DownloadRequest.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f33285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DownloadProgress f33286b;

        public c(com.mbridge.msdk.config.component.load.downloader.b bVar, DownloadProgress downloadProgress) {
            this.f33285a = bVar;
            this.f33286b = downloadProgress;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f33269h != null) {
                    d.this.f33269h.a(this.f33285a, this.f33286b);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DownloadRequest.java */
    public class RunnableC0309d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f33288a;

        public RunnableC0309d(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f33288a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f33269h != null) {
                    d.this.f33269h.c(this.f33288a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: DownloadRequest.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f33290a;

        public e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f33290a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f33269h != null) {
                    d.this.f33269h.b(this.f33290a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: DownloadRequest.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f33292a;

        public f(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f33292a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f33266e != null && !d.this.f33266e.isEmpty()) {
                    String str = (String) d.this.f33266e.get("responseHeaders");
                    if (!TextUtils.isEmpty(str)) {
                        this.f33292a.a("responseHeaders", str);
                    }
                }
                if (d.this.f33269h != null) {
                    d.this.f33269h.d(this.f33292a);
                }
                d.this.b();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    public void b(long j10) {
        this.f33276o = j10;
    }

    public long c() {
        return this.f33262a;
    }

    public com.mbridge.msdk.config.component.load.downloader.b<T> d() {
        return this.f33263b;
    }

    public com.mbridge.msdk.config.component.load.downloader.c e() {
        return this.f33264c;
    }

    public String f() {
        com.mbridge.msdk.config.component.load.downloader.b<T> bVar = this.f33263b;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public long g() {
        return this.f33265d;
    }

    public long h() {
        return this.f33270i;
    }

    public int i() {
        return this.f33273l;
    }

    public com.mbridge.msdk.config.component.load.downloader.e j() {
        return this.f33274m;
    }

    public long k() {
        return this.f33275n;
    }

    public long l() {
        return this.f33276o;
    }

    public long m() {
        return this.f33279r;
    }

    public d(com.mbridge.msdk.config.component.load.downloader.core.e<T> eVar) {
        this.f33268g = eVar.f33299f;
        this.f33264c = eVar.f33296c;
        this.f33270i = eVar.f33300g;
        this.f33262a = eVar.f33294a;
        this.f33277p = eVar.f33303j;
        this.f33263b = eVar.f33295b;
        this.f33279r = eVar.f33304k;
        this.f33269h = eVar.f33297d;
        this.f33271j = eVar.f33301h;
        this.f33275n = eVar.f33302i;
        this.f33266e = eVar.f33298e;
    }

    public static d a(com.mbridge.msdk.config.component.load.downloader.core.e eVar) {
        return new d(eVar);
    }

    public void b(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        i.b().a().getDownloadResultTasks().execute(new a(bVar));
    }

    public void c(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        if (this.f33274m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            i.b().a().getDownloadResultTasks().execute(new e(bVar));
        }
    }

    public void d(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        if (this.f33274m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            i.b().a().getDownloadResultTasks().execute(new RunnableC0309d(bVar));
        }
    }

    public void e(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        if (this.f33274m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            a(com.mbridge.msdk.config.component.load.downloader.e.COMPLETED);
            i.b().a().getDownloadResultTasks().execute(new f(bVar));
        }
    }

    public void n() {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        a();
        com.mbridge.msdk.config.component.load.downloader.core.f.a().b(this);
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        this.f33274m = com.mbridge.msdk.config.component.load.downloader.e.CANCELLED;
        Future future = this.f33267f;
        if (future != null) {
            future.cancel(false);
        }
    }

    public String a(String str, String str2) {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.f33266e) || !this.f33266e.containsKey(str) || TextUtils.isEmpty(str)) {
            return str2;
        }
        String str3 = this.f33266e.get(str);
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public void a(long j10) {
        this.f33265d = j10;
    }

    public void a(int i10) {
        this.f33273l = i10;
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.e eVar) {
        this.f33274m = eVar;
    }

    public void a(String str) {
        this.f33278q = str;
    }

    private void a() {
        this.f33269h = null;
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b<T> bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
        if (this.f33274m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            a(com.mbridge.msdk.config.component.load.downloader.e.FAILED);
            i.b().a().getDownloadResultTasks().execute(new b(bVar, aVar));
        }
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b<T> bVar, DownloadProgress downloadProgress) {
        if (this.f33274m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            i.b().a().getDownloadResultTasks().execute(new c(bVar, downloadProgress));
        }
    }

    public void a(Future future) {
        this.f33267f = future;
    }
}
