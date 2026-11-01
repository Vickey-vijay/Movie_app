package com.liulishuo.filedownloader.download;

import android.os.SystemClock;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException;
import java.io.IOException;
import java.io.InputStream;
import w7.f;

/* JADX INFO: compiled from: FetchDataTask.java */
/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.c f31843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f31846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n7.b f31847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f31848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f31849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f31850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f31851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f31852j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f31853k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v7.a f31854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f31855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o7.a f31856n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile long f31857o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f31858p;

    /* JADX INFO: compiled from: FetchDataTask.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f31859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n7.b f31860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.liulishuo.filedownloader.download.b f31861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p7.c f31862d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f31863e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Boolean f31864f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f31865g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f31866h;

        public d a() throws IllegalArgumentException {
            n7.b bVar;
            com.liulishuo.filedownloader.download.b bVar2;
            Integer num;
            if (this.f31864f == null || (bVar = this.f31860b) == null || (bVar2 = this.f31861c) == null || this.f31862d == null || this.f31863e == null || (num = this.f31866h) == null || this.f31865g == null) {
                throw new IllegalArgumentException();
            }
            return new d(bVar, bVar2, this.f31859a, num.intValue(), this.f31865g.intValue(), this.f31864f.booleanValue(), this.f31862d, this.f31863e);
        }

        public b b(p7.c cVar) {
            this.f31862d = cVar;
            return this;
        }

        public b c(n7.b bVar) {
            this.f31860b = bVar;
            return this;
        }

        public b e(com.liulishuo.filedownloader.download.b bVar) {
            this.f31861c = bVar;
            return this;
        }

        public b g(c cVar) {
            this.f31859a = cVar;
            return this;
        }

        public b h(String str) {
            this.f31863e = str;
            return this;
        }

        public b d(int i10) {
            this.f31865g = Integer.valueOf(i10);
            return this;
        }

        public b f(int i10) {
            this.f31866h = Integer.valueOf(i10);
            return this;
        }

        public b i(boolean z10) {
            this.f31864f = Boolean.valueOf(z10);
            return this;
        }
    }

    public void b() {
        this.f31855m = true;
    }

    public d(n7.b bVar, com.liulishuo.filedownloader.download.b bVar2, c cVar, int i10, int i11, boolean z10, p7.c cVar2, String str) {
        this.f31857o = 0L;
        this.f31858p = 0L;
        this.f31843a = cVar2;
        this.f31852j = str;
        this.f31847e = bVar;
        this.f31848f = z10;
        this.f31846d = cVar;
        this.f31845c = i11;
        this.f31844b = i10;
        this.f31856n = p7.a.j().f();
        this.f31849g = bVar2.f31824a;
        this.f31850h = bVar2.f31826c;
        this.f31853k = bVar2.f31825b;
        this.f31851i = bVar2.f31827d;
    }

    public void c() throws Throwable {
        Throwable th2;
        v7.a aVarC;
        if (this.f31855m) {
            return;
        }
        long jH = f.h(this.f31845c, this.f31847e);
        if (jH == -1) {
            jH = f.i(this.f31847e);
        }
        char c10 = 1;
        int i10 = 0;
        if (jH == 0) {
            throw new FileDownloadGiveUpRetryException(f.o("there isn't any content need to download on %d-%d with the content-length is 0", Integer.valueOf(this.f31844b), Integer.valueOf(this.f31845c)));
        }
        long j10 = this.f31851i;
        if (j10 > 0 && jH != j10) {
            throw new FileDownloadGiveUpRetryException(f.o("require %s with contentLength(%d), but the backend response contentLength is %d on downloadId[%d]-connectionIndex[%d], please ask your backend dev to fix such problem.", this.f31850h == -1 ? f.o("range[%d-)", Long.valueOf(this.f31853k)) : f.o("range[%d-%d)", Long.valueOf(this.f31853k), Long.valueOf(this.f31850h)), Long.valueOf(this.f31851i), Long.valueOf(jH), Integer.valueOf(this.f31844b), Integer.valueOf(this.f31845c)));
        }
        long j11 = this.f31853k;
        InputStream inputStreamB = null;
        try {
            boolean zM = p7.a.j().m();
            if (this.f31846d != null && !zM) {
                throw new IllegalAccessException("can't using multi-download when the output stream can't support seek");
            }
            aVarC = f.c(this.f31852j);
            try {
                this.f31854l = aVarC;
                if (zM) {
                    aVarC.seek(this.f31853k);
                }
                if (w7.d.f73535a) {
                    w7.d.a(this, "start fetch(%d): range [%d, %d), seek to[%d]", Integer.valueOf(this.f31845c), Long.valueOf(this.f31849g), Long.valueOf(this.f31850h), Long.valueOf(this.f31853k));
                }
                inputStreamB = this.f31847e.b();
                byte[] bArr = new byte[4096];
                if (this.f31855m) {
                    if (inputStreamB != null) {
                        try {
                            inputStreamB.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    if (aVarC != null) {
                        try {
                            d();
                        } catch (Throwable th3) {
                            try {
                                aVarC.close();
                                throw th3;
                            } catch (IOException e11) {
                                e11.printStackTrace();
                                throw th3;
                            }
                        }
                    }
                    if (aVarC != null) {
                        try {
                            aVarC.close();
                            return;
                        } catch (IOException e12) {
                            e12.printStackTrace();
                            return;
                        }
                    }
                    return;
                }
                while (true) {
                    int i11 = inputStreamB.read(bArr);
                    if (i11 == -1) {
                        try {
                            inputStreamB.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                        if (aVarC != null) {
                            try {
                                d();
                            } catch (Throwable th4) {
                                try {
                                    aVarC.close();
                                    throw th4;
                                } catch (IOException e14) {
                                    e14.printStackTrace();
                                    throw th4;
                                }
                            }
                        }
                        if (aVarC != null) {
                            try {
                                aVarC.close();
                            } catch (IOException e15) {
                                e15.printStackTrace();
                            }
                        }
                        long j12 = this.f31853k - j11;
                        if (jH == -1 || jH == j12) {
                            this.f31843a.c(this.f31846d, this.f31849g, this.f31850h);
                            return;
                        }
                        Object[] objArr = new Object[6];
                        objArr[i10] = Long.valueOf(j12);
                        objArr[c10] = Long.valueOf(jH);
                        objArr[2] = Long.valueOf(this.f31849g);
                        objArr[3] = Long.valueOf(this.f31850h);
                        objArr[4] = Long.valueOf(this.f31853k);
                        objArr[5] = Long.valueOf(j11);
                        throw new FileDownloadGiveUpRetryException(f.o("fetched length[%d] != content length[%d], range[%d, %d) offset[%d] fetch begin offset[%d]", objArr));
                    }
                    aVarC.write(bArr, i10, i11);
                    long j13 = i11;
                    this.f31853k += j13;
                    this.f31843a.e(j13);
                    a();
                    if (this.f31855m) {
                        try {
                            inputStreamB.close();
                        } catch (IOException e16) {
                            e16.printStackTrace();
                        }
                        try {
                            d();
                            try {
                                return;
                            } catch (IOException e17) {
                                return;
                            }
                        } finally {
                            try {
                                aVarC.close();
                            } catch (IOException e18) {
                                e18.printStackTrace();
                            }
                        }
                    }
                    if (this.f31848f && f.M()) {
                        throw new FileDownloadNetworkPolicyException();
                    }
                    c10 = 1;
                    i10 = 0;
                }
            } catch (Throwable th5) {
                th2 = th5;
                if (inputStreamB != null) {
                    try {
                        inputStreamB.close();
                    } catch (IOException e19) {
                        e19.printStackTrace();
                    }
                }
                if (aVarC != null) {
                    try {
                        d();
                    } catch (Throwable th6) {
                        try {
                            aVarC.close();
                            throw th6;
                        } catch (IOException e20) {
                            e20.printStackTrace();
                            throw th6;
                        }
                    }
                }
                if (aVarC == null) {
                    throw th2;
                }
                try {
                    aVarC.close();
                    throw th2;
                } catch (IOException e21) {
                    e21.printStackTrace();
                    throw th2;
                }
            }
        } catch (Throwable th7) {
            th2 = th7;
            aVarC = null;
        }
    }

    public final void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (f.L(this.f31853k - this.f31857o, jElapsedRealtime - this.f31858p)) {
            d();
            this.f31857o = this.f31853k;
            this.f31858p = jElapsedRealtime;
        }
    }

    public final void d() {
        boolean z10;
        boolean z11;
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            this.f31854l.flushAndSync();
            z10 = true;
        } catch (IOException e10) {
            if (w7.d.f73535a) {
                w7.d.a(this, "Because of the system cannot guarantee that all the buffers have been synchronized with physical media, or write to filefailed, we just not flushAndSync process to database too %s", e10);
            }
            z10 = false;
        }
        if (z10) {
            int i10 = this.f31845c;
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.f31856n.c(this.f31844b, i10, this.f31853k);
            } else {
                this.f31843a.f();
            }
            if (w7.d.f73535a) {
                w7.d.a(this, "require flushAndSync id[%d] index[%d] offset[%d], consume[%d]", Integer.valueOf(this.f31844b), Integer.valueOf(this.f31845c), Long.valueOf(this.f31853k), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            }
        }
    }
}
