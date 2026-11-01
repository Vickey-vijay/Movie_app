package com.liulishuo.filedownloader.download;

import android.os.Process;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.IOException;
import java.net.SocketException;
import w7.f;

/* JADX INFO: compiled from: DownloadRunnable.java */
/* JADX INFO: loaded from: classes10.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.liulishuo.filedownloader.download.a f31830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p7.c f31831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f31832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f31833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f31834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f31835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f31836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f31837i;

    /* JADX INFO: compiled from: DownloadRunnable.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.liulishuo.filedownloader.download.a.b f31838a = new com.liulishuo.filedownloader.download.a.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p7.c f31839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f31840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f31841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f31842e;

        public c a() {
            if (this.f31839b == null || this.f31840c == null || this.f31841d == null || this.f31842e == null) {
                throw new IllegalArgumentException(f.o("%s %s %B", this.f31839b, this.f31840c, this.f31841d));
            }
            com.liulishuo.filedownloader.download.a aVarA = this.f31838a.a();
            return new c(aVarA.f31812a, this.f31842e.intValue(), aVarA, this.f31839b, this.f31841d.booleanValue(), this.f31840c);
        }

        public b b(p7.c cVar) {
            this.f31839b = cVar;
            return this;
        }

        public b c(Integer num) {
            this.f31842e = num;
            return this;
        }

        public b d(com.liulishuo.filedownloader.download.b bVar) {
            this.f31838a.b(bVar);
            return this;
        }

        public b e(String str) {
            this.f31838a.d(str);
            return this;
        }

        public b f(FileDownloadHeader fileDownloadHeader) {
            this.f31838a.e(fileDownloadHeader);
            return this;
        }

        public b g(int i10) {
            this.f31838a.c(i10);
            return this;
        }

        public b h(String str) {
            this.f31840c = str;
            return this;
        }

        public b i(String str) {
            this.f31838a.f(str);
            return this;
        }

        public b j(boolean z10) {
            this.f31841d = Boolean.valueOf(z10);
            return this;
        }
    }

    public void d() {
        this.f31835g = true;
        d dVar = this.f31834f;
        if (dVar != null) {
            dVar.b();
        }
    }

    public c(int i10, int i11, com.liulishuo.filedownloader.download.a aVar, p7.c cVar, boolean z10, String str) {
        this.f31836h = i10;
        this.f31837i = i11;
        this.f31835g = false;
        this.f31831c = cVar;
        this.f31832d = str;
        this.f31830b = aVar;
        this.f31833e = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z10;
        Exception e10;
        Process.setThreadPriority(10);
        long j10 = this.f31830b.f().f31825b;
        n7.b bVarC = null;
        boolean z11 = false;
        while (!this.f31835g) {
            try {
                try {
                    bVarC = this.f31830b.c();
                    int responseCode = bVarC.getResponseCode();
                    if (w7.d.f73535a) {
                        w7.d.a(this, "the connection[%d] for %d, is connected %s with code[%d]", Integer.valueOf(this.f31837i), Integer.valueOf(this.f31836h), this.f31830b.f(), Integer.valueOf(responseCode));
                    }
                    if (responseCode != 206 && responseCode != 200) {
                        throw new SocketException(f.o("Connection failed with request[%s] response[%s] http-state[%d] on task[%d-%d], which is changed after verify connection, so please try again.", this.f31830b.g(), bVarC.e(), Integer.valueOf(responseCode), Integer.valueOf(this.f31836h), Integer.valueOf(this.f31837i)));
                    }
                    try {
                        d.b bVar = new d.b();
                        if (this.f31835g) {
                            bVarC.a();
                            return;
                        }
                        d dVarA = bVar.f(this.f31836h).d(this.f31837i).b(this.f31831c).g(this).i(this.f31833e).c(bVarC).e(this.f31830b.f()).h(this.f31832d).a();
                        this.f31834f = dVarA;
                        dVarA.c();
                        if (this.f31835g) {
                            this.f31834f.b();
                        }
                    } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e11) {
                        e10 = e11;
                        z10 = true;
                        try {
                            if (!this.f31831c.a(e10)) {
                                this.f31831c.onError(e10);
                                if (bVarC == null) {
                                    return;
                                }
                            } else if (z10 && this.f31834f == null) {
                                w7.d.i(this, "it is valid to retry and connection is valid but create fetch-data-task failed, so give up directly with %s", e10);
                                this.f31831c.onError(e10);
                                if (bVarC == null) {
                                    return;
                                }
                            } else {
                                if (this.f31834f != null) {
                                    long jC = c();
                                    if (jC > 0) {
                                        this.f31830b.i(jC);
                                    }
                                }
                                this.f31831c.d(e10);
                                if (bVarC != null) {
                                    bVarC.a();
                                }
                                z11 = z10;
                            }
                        } catch (Throwable th2) {
                            if (bVarC != null) {
                                bVarC.a();
                            }
                            throw th2;
                        }
                    }
                } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e12) {
                    e10 = e12;
                    z10 = false;
                }
            } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e13) {
                z10 = z11;
                e10 = e13;
            }
            bVarC.a();
            return;
        }
        if (bVarC != null) {
            bVarC.a();
        }
    }

    public void a() {
        d();
    }

    public final long c() {
        o7.a aVarF = p7.a.j().f();
        if (this.f31837i >= 0) {
            for (t7.a aVar : aVarF.m(this.f31836h)) {
                if (aVar.d() == this.f31837i) {
                    return aVar.a();
                }
            }
            return 0L;
        }
        FileDownloadModel fileDownloadModelN = aVarF.n(this.f31836h);
        if (fileDownloadModelN != null) {
            return fileDownloadModelN.i();
        }
        return 0L;
    }
}
