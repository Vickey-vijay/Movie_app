package p7;

import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import u7.i;
import w7.d;
import w7.f;

/* JADX INFO: compiled from: CustomComponentHolder.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u7.c f66023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w7.c.a f66024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w7.c.b f66025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w7.c.e f66026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o7.a f66027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w7.c.d f66028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f66029g;

    /* JADX INFO: renamed from: p7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CustomComponentHolder.java */
    public static final class C0613a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f66030a = new a();
    }

    public void o(u7.c.a aVar) {
        synchronized (this) {
            this.f66023a = new u7.c(aVar);
            this.f66025c = null;
            this.f66026d = null;
            this.f66027e = null;
            this.f66028f = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:9:0x0034, B:11:0x003b, B:13:0x0042, B:15:0x0049, B:18:0x0056, B:21:0x0065, B:23:0x0070, B:17:0x0053), top: B:83:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x019c  */
    public static void n(o7.a.InterfaceC0597a interfaceC0597a) throws Throwable {
        long j10;
        boolean z10;
        String str = "refreshed data count: %d , delete data count: %d, reset id count: %d. consume %d";
        Iterator<FileDownloadModel> it = interfaceC0597a.iterator();
        w7.c.d dVarI = j().i();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (it.hasNext()) {
            try {
                FileDownloadModel next = it.next();
                String str2 = str;
                if (next.j() != 3) {
                    try {
                        if (next.j() == 2 || next.j() == -1 || (next.j() == 1 && next.i() > 0)) {
                            next.A((byte) -2);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j10 = jCurrentTimeMillis;
                        j11 = j11;
                        str = str2;
                        f.N(w7.c.a());
                        interfaceC0597a.k();
                        if (d.f73535a) {
                            d.a(o7.a.class, str, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(System.currentTimeMillis() - j10));
                        }
                        throw th;
                    }
                } else {
                    next.A((byte) -2);
                }
                String strK = next.k();
                if (strK == null) {
                    j10 = jCurrentTimeMillis;
                    j11 = j11;
                    z10 = true;
                } else {
                    File file = new File(strK);
                    if (next.j() == -2) {
                        j10 = jCurrentTimeMillis;
                        try {
                            if (f.I(next.g(), next, next.h(), null)) {
                                File file2 = new File(next.l());
                                if (!file2.exists() && file.exists()) {
                                    boolean zRenameTo = file.renameTo(file2);
                                    if (d.f73535a) {
                                        d.a(o7.a.class, "resume from the old no-temp-file architecture [%B], [%s]->[%s]", Boolean.valueOf(zRenameTo), file.getPath(), file2.getPath());
                                    }
                                }
                            }
                            if (next.j() == 1 || next.i() > 0) {
                                z10 = f.G(next.g(), next) || file.exists();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j11 = j11;
                            str = str2;
                            f.N(w7.c.a());
                            interfaceC0597a.k();
                            if (d.f73535a) {
                                d.a(o7.a.class, str, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(System.currentTimeMillis() - j10));
                            }
                            throw th;
                        }
                    } else {
                        j10 = jCurrentTimeMillis;
                    }
                    if (next.j() == 1) {
                    }
                    if (f.G(next.g(), next)) {
                    }
                }
                if (z10) {
                    try {
                        it.remove();
                        interfaceC0597a.b(next);
                        j12++;
                        j11 = j11;
                    } catch (Throwable th4) {
                        th = th4;
                        str = str2;
                        f.N(w7.c.a());
                        interfaceC0597a.k();
                        if (d.f73535a) {
                            d.a(o7.a.class, str, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(System.currentTimeMillis() - j10));
                        }
                        throw th;
                    }
                } else {
                    int iG = next.g();
                    int iB = dVarI.b(iG, next.n(), next.h(), next.r());
                    if (iB != iG) {
                        if (d.f73535a) {
                            d.a(o7.a.class, "the id is changed on restoring from db: old[%d] -> new[%d]", Integer.valueOf(iG), Integer.valueOf(iB));
                        }
                        next.x(iB);
                        interfaceC0597a.d(iG, next);
                        j13++;
                    }
                    interfaceC0597a.a(next);
                    j11++;
                }
                str = str2;
                jCurrentTimeMillis = j10;
            } catch (Throwable th5) {
                th = th5;
                j10 = jCurrentTimeMillis;
                j11 = j11;
            }
        }
        String str3 = str;
        long j14 = jCurrentTimeMillis;
        long j15 = j11;
        f.N(w7.c.a());
        interfaceC0597a.k();
        if (d.f73535a) {
            d.a(o7.a.class, str3, Long.valueOf(j15), Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(System.currentTimeMillis() - j14));
        }
    }

    public final w7.c.a d() {
        w7.c.a aVar = this.f66024b;
        if (aVar != null) {
            return aVar;
        }
        synchronized (this) {
            if (this.f66024b == null) {
                this.f66024b = g().a();
            }
        }
        return this.f66024b;
    }

    public final w7.c.b e() {
        w7.c.b bVar = this.f66025c;
        if (bVar != null) {
            return bVar;
        }
        synchronized (this) {
            if (this.f66025c == null) {
                this.f66025c = g().b();
            }
        }
        return this.f66025c;
    }

    public o7.a f() {
        o7.a aVar = this.f66027e;
        if (aVar != null) {
            return aVar;
        }
        synchronized (this) {
            if (this.f66027e == null) {
                o7.a aVarC = g().c();
                this.f66027e = aVarC;
                n(aVarC.g());
            }
        }
        return this.f66027e;
    }

    public final u7.c g() {
        u7.c cVar = this.f66023a;
        if (cVar != null) {
            return cVar;
        }
        synchronized (this) {
            if (this.f66023a == null) {
                this.f66023a = new u7.c();
            }
        }
        return this.f66023a;
    }

    public i h() {
        i iVar = this.f66029g;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (this.f66029g == null) {
                this.f66029g = g().j();
            }
        }
        return this.f66029g;
    }

    public w7.c.d i() {
        w7.c.d dVar = this.f66028f;
        if (dVar != null) {
            return dVar;
        }
        synchronized (this) {
            if (this.f66028f == null) {
                this.f66028f = g().k();
            }
        }
        return this.f66028f;
    }

    public final w7.c.e l() {
        w7.c.e eVar = this.f66026d;
        if (eVar != null) {
            return eVar;
        }
        synchronized (this) {
            if (this.f66026d == null) {
                this.f66026d = g().l();
            }
        }
        return this.f66026d;
    }

    public static a j() {
        return C0613a.f66030a;
    }

    public n7.b a(String str) throws IOException {
        return e().create(str);
    }

    public v7.a b(File file) throws IOException {
        return l().b(file);
    }

    public int c(int i10, String str, String str2, long j10) {
        return d().a(i10, str, str2, j10);
    }

    public int k() {
        return g().n();
    }

    public boolean m() {
        return l().a();
    }
}
