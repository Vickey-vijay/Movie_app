package com.liulishuo.filedownloader.download;

import android.os.Process;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadHttpException;
import com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.liulishuo.filedownloader.exception.FileDownloadSecurityException;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import m7.z;
import w7.e;
import w7.f;

/* JADX INFO: loaded from: classes10.dex */
public class DownloadLaunchRunnable implements Runnable, p7.c {
    public static final ThreadPoolExecutor C = w7.b.c("ConnectionBlock");
    public long A;
    public long B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7.b f31779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FileDownloadModel f31781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FileDownloadHeader f31782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f31783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f31784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o7.a f31785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z f31786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f31787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f31789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f31790m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList<c> f31791n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f31792o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f31793p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f31794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f31795r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f31796s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f31797t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f31798u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile boolean f31799v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile Exception f31800w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f31801x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f31802y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f31803z;

    public class DiscardSafely extends Throwable {
        public DiscardSafely() {
        }
    }

    public class RetryDirectly extends Throwable {
        public RetryDirectly() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FileDownloadModel f31804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FileDownloadHeader f31805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public z f31806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f31807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f31808e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Boolean f31809f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Boolean f31810g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f31811h;

        public DownloadLaunchRunnable a() {
            if (this.f31804a == null || this.f31806c == null || this.f31807d == null || this.f31808e == null || this.f31809f == null || this.f31810g == null || this.f31811h == null) {
                throw new IllegalArgumentException();
            }
            return new DownloadLaunchRunnable(this.f31804a, this.f31805b, this.f31806c, this.f31807d.intValue(), this.f31808e.intValue(), this.f31809f.booleanValue(), this.f31810g.booleanValue(), this.f31811h.intValue());
        }

        public b b(Integer num) {
            this.f31808e = num;
            return this;
        }

        public b c(Boolean bool) {
            this.f31809f = bool;
            return this;
        }

        public b d(FileDownloadHeader fileDownloadHeader) {
            this.f31805b = fileDownloadHeader;
            return this;
        }

        public b e(Integer num) {
            this.f31811h = num;
            return this;
        }

        public b f(Integer num) {
            this.f31807d = num;
            return this;
        }

        public b g(FileDownloadModel fileDownloadModel) {
            this.f31804a = fileDownloadModel;
            return this;
        }

        public b h(z zVar) {
            this.f31806c = zVar;
            return this;
        }

        public b i(Boolean bool) {
            this.f31810g = bool;
            return this;
        }
    }

    @Override // p7.c
    public void onError(Exception exc) {
        this.f31799v = true;
        this.f31800w = exc;
        if (this.f31798u) {
            if (w7.d.f73535a) {
                w7.d.a(this, "the task[%d] has already been paused, so pass the error callback", Integer.valueOf(this.f31781d.g()));
            }
        } else {
            for (c cVar : (ArrayList) this.f31791n.clone()) {
                if (cVar != null) {
                    cVar.a();
                }
            }
        }
    }

    public void r() {
        this.f31798u = true;
        c cVar = this.f31792o;
        if (cVar != null) {
            cVar.d();
        }
        for (c cVar2 : (ArrayList) this.f31791n.clone()) {
            if (cVar2 != null) {
                cVar2.d();
            }
        }
    }

    public final void u(long j10, int i10) throws InterruptedException {
        long j11 = j10 / ((long) i10);
        int iG = this.f31781d.g();
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        int i11 = 0;
        while (i11 < i10) {
            long j13 = i11 == i10 + (-1) ? -1L : (j12 + j11) - 1;
            t7.a aVar = new t7.a();
            aVar.i(iG);
            aVar.j(i11);
            aVar.k(j12);
            aVar.g(j12);
            aVar.h(j13);
            arrayList.add(aVar);
            this.f31785h.e(aVar);
            j12 += j11;
            i11++;
        }
        this.f31781d.t(i10);
        this.f31785h.o(iG, i10);
        j(arrayList, j10);
    }

    public final void v(int i10, List<t7.a> list) throws InterruptedException {
        if (i10 <= 1 || list.size() != i10) {
            throw new IllegalArgumentException();
        }
        j(list, this.f31781d.m());
    }

    public final void x() throws IllegalAccessException, FileDownloadSecurityException, IOException, RetryDirectly {
        n7.b bVarC = null;
        try {
            com.liulishuo.filedownloader.download.a aVarA = new com.liulishuo.filedownloader.download.a.b().c(this.f31781d.g()).f(this.f31781d.n()).d(this.f31781d.d()).e(this.f31782e).b(this.f31789l ? com.liulishuo.filedownloader.download.b.C0294b.e() : com.liulishuo.filedownloader.download.b.C0294b.d()).a();
            bVarC = aVarA.c();
            n(aVarA.g(), aVarA, bVarC);
        } finally {
            if (bVarC != null) {
                bVarC.a();
            }
        }
    }

    public DownloadLaunchRunnable(FileDownloadModel fileDownloadModel, FileDownloadHeader fileDownloadHeader, z zVar, int i10, int i11, boolean z10, boolean z11, int i12) {
        this.f31780c = 5;
        this.f31789l = false;
        this.f31791n = new ArrayList<>(5);
        this.f31802y = 0L;
        this.f31803z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.f31797t = new AtomicBoolean(true);
        this.f31798u = false;
        this.f31787j = false;
        this.f31781d = fileDownloadModel;
        this.f31782e = fileDownloadHeader;
        this.f31783f = z10;
        this.f31784g = z11;
        this.f31785h = p7.a.j().f();
        this.f31790m = p7.a.j().m();
        this.f31786i = zVar;
        this.f31788k = i12;
        this.f31779b = new p7.b(fileDownloadModel, i12, i10, i11);
    }

    @Override // p7.c
    public boolean a(Exception exc) {
        if (exc instanceof FileDownloadHttpException) {
            int code = ((FileDownloadHttpException) exc).getCode();
            if (this.f31793p && code == 416 && !this.f31787j) {
                f.f(this.f31781d.k(), this.f31781d.l());
                this.f31787j = true;
                return true;
            }
        }
        return this.f31788k > 0 && !(exc instanceof FileDownloadGiveUpRetryException);
    }

    @Override // p7.c
    public void c(c cVar, long j10, long j11) {
        if (this.f31798u) {
            if (w7.d.f73535a) {
                w7.d.a(this, "the task[%d] has already been paused, so pass the completed callback", Integer.valueOf(this.f31781d.g()));
                return;
            }
            return;
        }
        int i10 = cVar.f31837i;
        if (w7.d.f73535a) {
            w7.d.a(this, "the connection has been completed(%d): [%d, %d)  %d", Integer.valueOf(i10), Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(this.f31781d.m()));
        }
        if (!this.f31793p) {
            synchronized (this.f31791n) {
                this.f31791n.remove(cVar);
            }
        } else {
            if (j10 == 0 || j11 == this.f31781d.m()) {
                return;
            }
            w7.d.b(this, "the single task not completed corrected(%d, %d != %d) for task(%d)", Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(this.f31781d.m()), Integer.valueOf(this.f31781d.g()));
        }
    }

    @Override // p7.c
    public void d(Exception exc) {
        if (this.f31798u) {
            if (w7.d.f73535a) {
                w7.d.a(this, "the task[%d] has already been paused, so pass the retry callback", Integer.valueOf(this.f31781d.g()));
            }
        } else {
            int i10 = this.f31788k;
            int i11 = i10 - 1;
            this.f31788k = i11;
            if (i10 < 0) {
                w7.d.b(this, "valid retry times is less than 0(%d) for download task(%d)", Integer.valueOf(i11), Integer.valueOf(this.f31781d.g()));
            }
            this.f31779b.t(exc, this.f31788k);
        }
    }

    @Override // p7.c
    public void e(long j10) {
        if (this.f31798u) {
            return;
        }
        this.f31779b.s(j10);
    }

    @Override // p7.c
    public void f() {
        this.f31785h.k(this.f31781d.g(), this.f31781d.i());
    }

    public final void h() throws DiscardSafely, RetryDirectly {
        int iG = this.f31781d.g();
        if (this.f31781d.r()) {
            String strK = this.f31781d.k();
            int iR = f.r(this.f31781d.n(), strK);
            if (w7.c.d(iG, strK, this.f31783f, false)) {
                this.f31785h.remove(iG);
                this.f31785h.d(iG);
                throw new DiscardSafely();
            }
            FileDownloadModel fileDownloadModelN = this.f31785h.n(iR);
            if (fileDownloadModelN != null) {
                if (w7.c.e(iG, fileDownloadModelN, this.f31786i, false)) {
                    this.f31785h.remove(iG);
                    this.f31785h.d(iG);
                    throw new DiscardSafely();
                }
                List<t7.a> listM = this.f31785h.m(iR);
                this.f31785h.remove(iR);
                this.f31785h.d(iR);
                f.e(this.f31781d.k());
                if (f.G(iR, fileDownloadModelN)) {
                    this.f31781d.z(fileDownloadModelN.i());
                    this.f31781d.B(fileDownloadModelN.m());
                    this.f31781d.u(fileDownloadModelN.d());
                    this.f31781d.t(fileDownloadModelN.c());
                    this.f31785h.update(this.f31781d);
                    if (listM != null) {
                        for (t7.a aVar : listM) {
                            aVar.i(iG);
                            this.f31785h.e(aVar);
                        }
                    }
                    throw new RetryDirectly();
                }
            }
            if (w7.c.c(iG, this.f31781d.i(), this.f31781d.l(), strK, this.f31786i)) {
                this.f31785h.remove(iG);
                this.f31785h.d(iG);
                throw new DiscardSafely();
            }
        }
    }

    public final void i() throws FileDownloadGiveUpRetryException {
        if (this.f31784g && !f.a("android.permission.ACCESS_NETWORK_STATE")) {
            throw new FileDownloadGiveUpRetryException(f.o("Task[%d] can't start the download runnable, because this task require wifi, but user application nor current process has %s, so we can't check whether the network type connection.", Integer.valueOf(this.f31781d.g()), "android.permission.ACCESS_NETWORK_STATE"));
        }
        if (this.f31784g && f.M()) {
            throw new FileDownloadNetworkPolicyException();
        }
    }

    public final void j(List<t7.a> list, long j10) throws InterruptedException {
        int iG = this.f31781d.g();
        String strD = this.f31781d.d();
        String strN = this.f31801x;
        if (strN == null) {
            strN = this.f31781d.n();
        }
        String strL = this.f31781d.l();
        if (w7.d.f73535a) {
            w7.d.a(this, "fetch data with multiple connection(count: [%d]) for task[%d] totalLength[%d]", Integer.valueOf(list.size()), Integer.valueOf(iG), Long.valueOf(j10));
        }
        boolean z10 = this.f31794q;
        long j11 = 0;
        long jA = 0;
        for (t7.a aVar : list) {
            long jA2 = aVar.b() == -1 ? j10 - aVar.a() : (aVar.b() - aVar.a()) + 1;
            jA += aVar.a() - aVar.e();
            if (jA2 != j11) {
                c cVarA = new c.b().g(iG).c(Integer.valueOf(aVar.d())).b(this).i(strN).e(z10 ? strD : null).f(this.f31782e).j(this.f31784g).d(com.liulishuo.filedownloader.download.b.C0294b.b(aVar.e(), aVar.a(), aVar.b(), jA2)).h(strL).a();
                if (w7.d.f73535a) {
                    w7.d.a(this, "enable multiple connection: %s", aVar);
                }
                if (cVarA == null) {
                    throw new IllegalArgumentException("the download runnable must not be null!");
                }
                this.f31791n.add(cVarA);
            } else if (w7.d.f73535a) {
                w7.d.a(this, "pass connection[%d-%d], because it has been completed", Integer.valueOf(aVar.c()), Integer.valueOf(aVar.d()));
            }
            j11 = 0;
        }
        if (jA != this.f31781d.i()) {
            w7.d.i(this, "correct the sofar[%d] from connection table[%d]", Long.valueOf(this.f31781d.i()), Long.valueOf(jA));
            this.f31781d.z(jA);
        }
        ArrayList arrayList = new ArrayList(this.f31791n.size());
        for (c cVar : this.f31791n) {
            if (this.f31798u) {
                cVar.d();
            } else {
                arrayList.add(Executors.callable(cVar));
            }
        }
        if (this.f31798u) {
            this.f31781d.A((byte) -2);
            return;
        }
        List<Future> listInvokeAll = C.invokeAll(arrayList);
        if (w7.d.f73535a) {
            for (Future future : listInvokeAll) {
                w7.d.a(this, "finish sub-task for [%d] %B %B", Integer.valueOf(iG), Boolean.valueOf(future.isDone()), Boolean.valueOf(future.isCancelled()));
            }
        }
    }

    public int k() {
        return this.f31781d.g();
    }

    public String l() {
        return this.f31781d.l();
    }

    public final void m(long j10, String str) throws IllegalAccessException, IOException {
        v7.a aVarC = null;
        if (j10 != -1) {
            try {
                aVarC = f.c(this.f31781d.l());
                long length = new File(str).length();
                long j11 = j10 - length;
                long jX = f.x(str);
                if (jX < j11) {
                    throw new FileDownloadOutOfSpaceException(jX, j11, length);
                }
                if (!e.a().f73541f) {
                    aVarC.setLength(j10);
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    aVarC.close();
                }
                throw th2;
            }
        }
        if (aVarC != null) {
            aVarC.close();
        }
    }

    public final void n(Map<String, List<String>> map, com.liulishuo.filedownloader.download.a aVar, n7.b bVar) throws FileDownloadSecurityException, IOException, IllegalArgumentException, RetryDirectly {
        boolean z10;
        int iG = this.f31781d.g();
        int responseCode = bVar.getResponseCode();
        this.f31795r = f.E(responseCode, bVar);
        boolean z11 = responseCode == 200 || responseCode == 201 || responseCode == 0;
        long jM = f.m(bVar);
        String strD = this.f31781d.d();
        String strJ = f.j(iG, bVar);
        if (responseCode != 412 && ((strD == null || strD.equals(strJ) || !(z11 || this.f31795r)) && !(responseCode == 201 && aVar.h()))) {
            if (responseCode == 416) {
                if (!this.f31795r || jM < 0) {
                    if (this.f31781d.i() > 0) {
                        w7.d.i(this, "get 416, precondition failed and just retry", new Object[0]);
                    } else if (!this.f31789l) {
                        this.f31789l = true;
                        w7.d.i(this, "get 416, precondition failed and need to retry with discarding range", new Object[0]);
                    }
                    z10 = true;
                } else {
                    w7.d.i(this, "get 416 but the Content-Range is returned, no need to retry", new Object[0]);
                }
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f31801x = aVar.e();
            if (!this.f31795r && !z11) {
                throw new FileDownloadHttpException(responseCode, map, bVar.e());
            }
            String strL = this.f31781d.r() ? f.l(bVar, this.f31781d.n()) : null;
            this.f31796s = jM == -1;
            this.f31779b.n(this.f31794q && this.f31795r, jM, strJ, strL);
            return;
        }
        if (this.f31794q) {
            w7.d.i(this, "there is precondition failed on this request[%d] with old etag[%s]、new etag[%s]、response code is %d", Integer.valueOf(iG), strD, strJ, Integer.valueOf(responseCode));
        }
        this.f31785h.d(this.f31781d.g());
        f.f(this.f31781d.k(), this.f31781d.l());
        this.f31794q = false;
        if (strD != null && strD.equals(strJ)) {
            w7.d.i(this, "the old etag[%s] is the same to the new etag[%s], but the response status code is %d not Partial(206), so wo have to start this task from very beginning for task[%d]!", strD, strJ, Integer.valueOf(responseCode), Integer.valueOf(iG));
            strJ = null;
        }
        this.f31781d.z(0L);
        this.f31781d.B(0L);
        this.f31781d.u(strJ);
        this.f31781d.s();
        this.f31785h.b(iG, this.f31781d.d(), this.f31781d.i(), this.f31781d.m(), this.f31781d.c());
        throw new RetryDirectly();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public void o(List<t7.a> list) {
        long jI;
        int iC = this.f31781d.c();
        String strL = this.f31781d.l();
        String strK = this.f31781d.k();
        boolean z10 = iC > 1;
        if (this.f31789l || ((z10 && !this.f31790m) || !f.G(this.f31781d.g(), this.f31781d))) {
            jI = 0;
        } else if (!this.f31790m) {
            jI = new File(strL).length();
        } else if (!z10) {
            jI = this.f31781d.i();
        } else if (iC != list.size()) {
            jI = 0;
        } else {
            jI = t7.a.f(list);
        }
        this.f31781d.z(jI);
        boolean z11 = jI > 0;
        this.f31794q = z11;
        if (z11) {
            return;
        }
        this.f31785h.d(this.f31781d.g());
        f.f(strK, strL);
    }

    public boolean p() {
        return this.f31797t.get() || this.f31779b.l();
    }

    public final boolean q() {
        return (!this.f31794q || this.f31781d.c() > 1) && this.f31795r && this.f31790m && !this.f31796s;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01c0 A[Catch: all -> 0x01f5, TryCatch #11 {all -> 0x01f5, blocks: (B:3:0x0003, B:6:0x0012, B:8:0x001a, B:10:0x001e, B:11:0x0030, B:24:0x008d, B:26:0x0091, B:27:0x0096, B:29:0x009a, B:31:0x009e, B:42:0x00c6, B:44:0x00e2, B:55:0x0100, B:69:0x0136, B:71:0x013a, B:85:0x015f, B:87:0x0163, B:88:0x0167, B:90:0x0170, B:91:0x0174, B:92:0x0178, B:93:0x018b, B:94:0x018c, B:117:0x01ba, B:119:0x01c0, B:120:0x01c5), top: B:156:0x0003, inners: #15, #12, #11 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    /* JADX WARN: Code duplicated, block: B:165:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0073  */
    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            Process.setThreadPriority(10);
            if (this.f31781d.j() != 1) {
                if (this.f31781d.j() != -2) {
                    onError(new RuntimeException(f.o("Task[%d] can't start the download runnable, because its status is %d not %d", Integer.valueOf(this.f31781d.g()), Byte.valueOf(this.f31781d.j()), (byte) 1)));
                } else if (w7.d.f73535a) {
                    w7.d.a(this, "High concurrent cause, start runnable but already paused %d", Integer.valueOf(this.f31781d.g()));
                }
                this.f31779b.b();
                if (this.f31798u) {
                    this.f31779b.q();
                } else if (this.f31799v) {
                    this.f31779b.o(this.f31800w);
                } else {
                    try {
                        this.f31779b.m();
                    } catch (IOException e10) {
                        e = e10;
                        this.f31779b.o(e);
                    }
                }
            } else {
                if (!this.f31798u) {
                    this.f31779b.u();
                }
                while (true) {
                    if (this.f31798u) {
                        if (w7.d.f73535a) {
                            w7.d.a(this, "High concurrent cause, start runnable but already paused %d", Integer.valueOf(this.f31781d.g()));
                        }
                        this.f31779b.b();
                        if (this.f31798u) {
                            this.f31779b.q();
                        } else if (this.f31799v) {
                            this.f31779b.o(this.f31800w);
                        } else {
                            try {
                                this.f31779b.m();
                            } catch (IOException e11) {
                                e = e11;
                                this.f31779b.o(e);
                            }
                        }
                    } else {
                        try {
                            i();
                            x();
                            h();
                            List<t7.a> listM = this.f31785h.m(this.f31781d.g());
                            o(listM);
                            if (this.f31798u) {
                                this.f31781d.A((byte) -2);
                                this.f31779b.b();
                                if (this.f31798u) {
                                    this.f31779b.q();
                                } else if (this.f31799v) {
                                    this.f31779b.o(this.f31800w);
                                } else {
                                    try {
                                        this.f31779b.m();
                                    } catch (IOException e12) {
                                        e = e12;
                                        this.f31779b.o(e);
                                    }
                                }
                            } else {
                                long jM = this.f31781d.m();
                                m(jM, this.f31781d.l());
                                int iG = g(jM);
                                if (iG <= 0) {
                                    throw new IllegalAccessException(f.o("invalid connection count %d, the connection count must be larger than 0", Integer.valueOf(iG)));
                                }
                                if (jM == 0) {
                                    this.f31779b.b();
                                    if (this.f31798u) {
                                        this.f31779b.q();
                                    } else if (this.f31799v) {
                                        this.f31779b.o(this.f31800w);
                                    } else {
                                        try {
                                            this.f31779b.m();
                                        } catch (IOException e13) {
                                            e = e13;
                                            this.f31779b.o(e);
                                        }
                                    }
                                } else {
                                    if (!this.f31798u) {
                                        boolean z10 = iG == 1;
                                        this.f31793p = z10;
                                        if (z10) {
                                            w(jM);
                                        } else {
                                            this.f31779b.p();
                                            if (this.f31794q) {
                                                v(iG, listM);
                                            } else {
                                                u(jM, iG);
                                            }
                                        }
                                        this.f31779b.b();
                                        if (this.f31798u) {
                                            this.f31779b.q();
                                        } else if (this.f31799v) {
                                            this.f31779b.o(this.f31800w);
                                        } else {
                                            try {
                                                this.f31779b.m();
                                            } catch (IOException e14) {
                                                this.f31779b.o(e14);
                                            }
                                        }
                                        this.f31797t.set(false);
                                        return;
                                    }
                                    this.f31781d.A((byte) -2);
                                    this.f31779b.b();
                                    if (this.f31798u) {
                                        this.f31779b.q();
                                    } else if (this.f31799v) {
                                        this.f31779b.o(this.f31800w);
                                    } else {
                                        try {
                                            this.f31779b.m();
                                        } catch (IOException e15) {
                                            e = e15;
                                            this.f31779b.o(e);
                                        }
                                    }
                                }
                            }
                        } catch (DiscardSafely unused) {
                            this.f31779b.b();
                            if (!this.f31798u) {
                                if (this.f31799v) {
                                    this.f31779b.o(this.f31800w);
                                } else {
                                    try {
                                        this.f31779b.m();
                                    } catch (IOException e16) {
                                        e = e16;
                                        this.f31779b.o(e);
                                    }
                                }
                            }
                        } catch (RetryDirectly unused2) {
                            this.f31781d.A((byte) 5);
                        } catch (FileDownloadGiveUpRetryException e17) {
                            e = e17;
                            if (a(e)) {
                                d(e);
                            } else {
                                onError(e);
                            }
                        } catch (FileDownloadSecurityException e18) {
                            e = e18;
                            if (a(e)) {
                                d(e);
                            } else {
                                onError(e);
                            }
                        } catch (IOException e19) {
                            e = e19;
                            if (a(e)) {
                                d(e);
                            } else {
                                onError(e);
                            }
                        } catch (IllegalAccessException e20) {
                            e = e20;
                            if (a(e)) {
                                d(e);
                            } else {
                                onError(e);
                            }
                        } catch (IllegalArgumentException e21) {
                            e = e21;
                            if (a(e)) {
                                d(e);
                            } else {
                                onError(e);
                            }
                        } catch (InterruptedException e22) {
                            e = e22;
                            if (a(e)) {
                                d(e);
                            } else {
                                onError(e);
                            }
                        }
                    }
                }
            }
            this.f31797t.set(false);
        } catch (Throwable th2) {
            this.f31779b.b();
            if (this.f31798u) {
                this.f31779b.q();
            } else if (this.f31799v) {
                this.f31779b.o(this.f31800w);
            } else {
                try {
                    this.f31779b.m();
                } catch (IOException e23) {
                    this.f31779b.o(e23);
                }
            }
            this.f31797t.set(false);
            throw th2;
        }
    }

    public void s() {
        o(this.f31785h.m(this.f31781d.g()));
        this.f31779b.r();
    }

    public final void w(long j10) throws IllegalAccessException, IOException {
        com.liulishuo.filedownloader.download.b bVarC;
        if (this.f31795r) {
            bVarC = com.liulishuo.filedownloader.download.b.C0294b.c(this.f31781d.i(), this.f31781d.i(), j10 - this.f31781d.i());
        } else {
            this.f31781d.z(0L);
            bVarC = com.liulishuo.filedownloader.download.b.C0294b.a(j10);
        }
        this.f31792o = new c.b().g(this.f31781d.g()).c(-1).b(this).i(this.f31781d.n()).e(this.f31781d.d()).f(this.f31782e).j(this.f31784g).d(bVarC).h(this.f31781d.l()).a();
        this.f31781d.t(1);
        this.f31785h.o(this.f31781d.g(), 1);
        if (!this.f31798u) {
            this.f31792o.run();
        } else {
            this.f31781d.A((byte) -2);
            this.f31792o.d();
        }
    }

    public final int g(long j10) {
        if (q()) {
            if (this.f31794q) {
                return this.f31781d.c();
            }
            return p7.a.j().c(this.f31781d.g(), this.f31781d.n(), this.f31781d.h(), j10);
        }
        return 1;
    }
}
