package im;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.concurrent.atomic.AtomicInteger;
import lm.l;
import lm.n;
import mm.j;
import mm.k;
import org.eclipse.jetty.client.HttpDestination;

/* JADX INFO: compiled from: HttpExchange.java */
/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final zm.c f54264x = zm.b.a(i.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f54267c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public im.b f54269e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mm.d f54271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InputStream f54272h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile im.a f54277m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile en.e.a f54280p;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f54285u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f54286v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f54287w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f54265a = "GET";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mm.d f54266b = l.f63842a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54268d = 11;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final org.eclipse.jetty.http.a f54270f = new org.eclipse.jetty.http.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AtomicInteger f54273i = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f54274j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f54275k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f54276l = new b(this, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public im.b f54278n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f54279o = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f54281q = System.currentTimeMillis();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f54282r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f54283s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f54284t = -1;

    /* JADX INFO: compiled from: HttpExchange.java */
    public class a extends en.e.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ HttpDestination f54288h;

        public a(HttpDestination httpDestination) {
            this.f54288h = httpDestination;
        }

        @Override // en.e.a
        public void f() {
            i.this.i(this.f54288h);
        }
    }

    /* JADX INFO: compiled from: HttpExchange.java */
    public class b implements g {
        public b() {
        }

        @Override // im.g
        public void j() throws IOException {
            try {
                i.this.D();
                synchronized (i.this) {
                    i iVar = i.this;
                    iVar.f54286v = true;
                    boolean z10 = iVar.f54287w | iVar.f54285u;
                    iVar.f54287w = z10;
                    if (z10) {
                        iVar.g();
                    }
                    i.this.notifyAll();
                }
            } catch (Throwable th2) {
                synchronized (i.this) {
                    i iVar2 = i.this;
                    iVar2.f54286v = true;
                    boolean z11 = iVar2.f54287w | iVar2.f54285u;
                    iVar2.f54287w = z11;
                    if (z11) {
                        iVar2.g();
                    }
                    i.this.notifyAll();
                    throw th2;
                }
            }
        }

        @Override // im.g
        public void onRequestComplete() throws IOException {
            try {
                i.this.C();
                synchronized (i.this) {
                    i iVar = i.this;
                    iVar.f54285u = true;
                    boolean z10 = iVar.f54287w | iVar.f54286v;
                    iVar.f54287w = z10;
                    if (z10) {
                        iVar.g();
                    }
                    i.this.notifyAll();
                }
            } catch (Throwable th2) {
                synchronized (i.this) {
                    i iVar2 = i.this;
                    iVar2.f54285u = true;
                    boolean z11 = iVar2.f54287w | iVar2.f54286v;
                    iVar2.f54287w = z11;
                    if (z11) {
                        iVar2.g();
                    }
                    i.this.notifyAll();
                    throw th2;
                }
            }
        }

        public /* synthetic */ b(i iVar, a aVar) {
            this();
        }

        @Override // im.g
        public void a(Throwable th2) {
            try {
                i.this.y(th2);
            } finally {
                i.this.h();
            }
        }

        @Override // im.g
        public void b() {
            i.this.V(true);
            try {
                i.this.I();
            } catch (IOException e10) {
                i.f54264x.a(e10);
            }
        }

        @Override // im.g
        public void c() throws IOException {
            i.this.G();
        }

        @Override // im.g
        public void d(mm.d dVar, int i10, mm.d dVar2) throws IOException {
            i.this.H(dVar, i10, dVar2);
        }

        @Override // im.g
        public void e(mm.d dVar, mm.d dVar2) throws IOException {
            i.this.F(dVar, dVar2);
        }

        @Override // im.g
        public void f(Throwable th2) {
            try {
                i.this.z(th2);
            } finally {
                i.this.h();
            }
        }

        @Override // im.g
        public void g(mm.d dVar) throws IOException {
            i.this.E(dVar);
        }

        @Override // im.g
        public void h() {
            try {
                i.this.A();
            } finally {
                i.this.h();
            }
        }

        @Override // im.g
        public void i() throws IOException {
            i.this.B();
        }
    }

    public static String c0(int i10) {
        switch (i10) {
            case 0:
                return "START";
            case 1:
                return "CONNECTING";
            case 2:
                return "CONNECTED";
            case 3:
                return "SENDING";
            case 4:
                return "WAITING";
            case 5:
                return "HEADERS";
            case 6:
                return "CONTENT";
            case 7:
                return "COMPLETED";
            case 8:
                return "EXPIRED";
            case 9:
                return "EXCEPTED";
            case 10:
                return "CANCELLING";
            case 11:
                return "CANCELLED";
            case 12:
                return "SENDING+HEADERS";
            case 13:
                return "SENDING+CONTENT";
            case 14:
                return "SENDING+COMPLETED";
            default:
                return "UNKNOWN";
        }
    }

    public void B() throws IOException {
    }

    public void C() throws IOException {
    }

    public void D() throws IOException {
    }

    public void E(mm.d dVar) throws IOException {
    }

    public void F(mm.d dVar, mm.d dVar2) throws IOException {
    }

    public void G() throws IOException {
    }

    public void H(mm.d dVar, int i10, mm.d dVar2) throws IOException {
    }

    public j J(k kVar) throws IOException {
        return null;
    }

    public void K() {
        synchronized (this) {
            this.f54280p = null;
            this.f54285u = false;
            this.f54286v = false;
            this.f54287w = false;
            Y(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01ab A[Catch: IOException -> 0x022b, TryCatch #1 {IOException -> 0x022b, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x001b, B:10:0x0028, B:129:0x0215, B:130:0x022a, B:12:0x002e, B:14:0x0032, B:15:0x003a, B:16:0x0040, B:23:0x0057, B:24:0x005f, B:25:0x0065, B:29:0x0078, B:37:0x0094, B:38:0x009c, B:39:0x00a2, B:43:0x00b5, B:52:0x00cf, B:59:0x00e4, B:60:0x00e8, B:63:0x00f4, B:65:0x00f8, B:67:0x00fe, B:68:0x0106, B:69:0x010e, B:70:0x0116, B:72:0x011b, B:73:0x0123, B:74:0x0129, B:80:0x013f, B:81:0x0147, B:82:0x014d, B:89:0x0165, B:90:0x016b, B:93:0x0177, B:95:0x017b, B:96:0x0182, B:97:0x0187, B:98:0x0190, B:105:0x01a6, B:106:0x01ab, B:108:0x01b4, B:110:0x01b8, B:111:0x01bd, B:115:0x01ca, B:117:0x01cf, B:118:0x01d4), top: B:135:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01bd A[Catch: IOException -> 0x022b, TryCatch #1 {IOException -> 0x022b, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x001b, B:10:0x0028, B:129:0x0215, B:130:0x022a, B:12:0x002e, B:14:0x0032, B:15:0x003a, B:16:0x0040, B:23:0x0057, B:24:0x005f, B:25:0x0065, B:29:0x0078, B:37:0x0094, B:38:0x009c, B:39:0x00a2, B:43:0x00b5, B:52:0x00cf, B:59:0x00e4, B:60:0x00e8, B:63:0x00f4, B:65:0x00f8, B:67:0x00fe, B:68:0x0106, B:69:0x010e, B:70:0x0116, B:72:0x011b, B:73:0x0123, B:74:0x0129, B:80:0x013f, B:81:0x0147, B:82:0x014d, B:89:0x0165, B:90:0x016b, B:93:0x0177, B:95:0x017b, B:96:0x0182, B:97:0x0187, B:98:0x0190, B:105:0x01a6, B:106:0x01ab, B:108:0x01b4, B:110:0x01b8, B:111:0x01bd, B:115:0x01ca, B:117:0x01cf, B:118:0x01d4), top: B:135:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d4 A[Catch: IOException -> 0x022b, TRY_LEAVE, TryCatch #1 {IOException -> 0x022b, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x001b, B:10:0x0028, B:129:0x0215, B:130:0x022a, B:12:0x002e, B:14:0x0032, B:15:0x003a, B:16:0x0040, B:23:0x0057, B:24:0x005f, B:25:0x0065, B:29:0x0078, B:37:0x0094, B:38:0x009c, B:39:0x00a2, B:43:0x00b5, B:52:0x00cf, B:59:0x00e4, B:60:0x00e8, B:63:0x00f4, B:65:0x00f8, B:67:0x00fe, B:68:0x0106, B:69:0x010e, B:70:0x0116, B:72:0x011b, B:73:0x0123, B:74:0x0129, B:80:0x013f, B:81:0x0147, B:82:0x014d, B:89:0x0165, B:90:0x016b, B:93:0x0177, B:95:0x017b, B:96:0x0182, B:97:0x0187, B:98:0x0190, B:105:0x01a6, B:106:0x01ab, B:108:0x01b4, B:110:0x01b8, B:111:0x01bd, B:115:0x01ca, B:117:0x01cf, B:118:0x01d4), top: B:135:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:90:0x016b A[Catch: IOException -> 0x022b, TryCatch #1 {IOException -> 0x022b, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x001b, B:10:0x0028, B:129:0x0215, B:130:0x022a, B:12:0x002e, B:14:0x0032, B:15:0x003a, B:16:0x0040, B:23:0x0057, B:24:0x005f, B:25:0x0065, B:29:0x0078, B:37:0x0094, B:38:0x009c, B:39:0x00a2, B:43:0x00b5, B:52:0x00cf, B:59:0x00e4, B:60:0x00e8, B:63:0x00f4, B:65:0x00f8, B:67:0x00fe, B:68:0x0106, B:69:0x010e, B:70:0x0116, B:72:0x011b, B:73:0x0123, B:74:0x0129, B:80:0x013f, B:81:0x0147, B:82:0x014d, B:89:0x0165, B:90:0x016b, B:93:0x0177, B:95:0x017b, B:96:0x0182, B:97:0x0187, B:98:0x0190, B:105:0x01a6, B:106:0x01ab, B:108:0x01b4, B:110:0x01b8, B:111:0x01bd, B:115:0x01ca, B:117:0x01cf, B:118:0x01d4), top: B:135:0x0001 }] */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean Y(int i10) {
        boolean zCompareAndSet;
        boolean z10;
        char c10 = 0;
        try {
            int i11 = this.f54273i.get();
            if (i11 != i10) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f54284t = (int) (jCurrentTimeMillis - this.f54281q);
                this.f54283s = i11;
                this.f54281q = jCurrentTimeMillis;
                if (i10 == 3) {
                    this.f54282r = jCurrentTimeMillis;
                }
            }
            try {
                switch (i11) {
                    case 0:
                        if (i10 != 0 && i10 != 1 && i10 != 2) {
                            switch (i10) {
                                case 8:
                                    zCompareAndSet = Z(i10, i11);
                                    break;
                                case 9:
                                case 10:
                                    zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                                    break;
                                default:
                                    zCompareAndSet = false;
                                    break;
                            }
                        } else {
                            zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                        }
                        z10 = false;
                        if (!zCompareAndSet || z10) {
                            f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                            return zCompareAndSet;
                        }
                        throw new IllegalStateException(c0(i11) + " => " + c0(i10));
                    case 1:
                        if (i10 != 2) {
                            switch (i10) {
                                case 8:
                                    zCompareAndSet = Z(i10, i11);
                                    break;
                                case 9:
                                case 10:
                                    zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                                    break;
                                default:
                                    zCompareAndSet = false;
                                    break;
                            }
                        } else {
                            zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                        }
                        z10 = false;
                        if (zCompareAndSet) {
                        }
                        f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                        return zCompareAndSet;
                    case 2:
                        if (i10 != 3) {
                            switch (i10) {
                                case 8:
                                    zCompareAndSet = Z(i10, i11);
                                    break;
                                case 9:
                                case 10:
                                    zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                                    break;
                                default:
                                    zCompareAndSet = false;
                                    break;
                            }
                        } else {
                            zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                        }
                        z10 = false;
                        if (zCompareAndSet) {
                        }
                        f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                        return zCompareAndSet;
                    case 3:
                        if (i10 == 4) {
                            zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                            if (zCompareAndSet) {
                                k().i();
                            }
                        } else if (i10 != 5) {
                            switch (i10) {
                                case 8:
                                    zCompareAndSet = Z(i10, i11);
                                    break;
                                case 9:
                                case 10:
                                    zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                                    break;
                                default:
                                    zCompareAndSet = false;
                                    break;
                            }
                        } else {
                            zCompareAndSet = this.f54273i.compareAndSet(i11, 12);
                        }
                        z10 = false;
                        if (zCompareAndSet) {
                        }
                        f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                        return zCompareAndSet;
                    case 4:
                        if (i10 != 5) {
                            switch (i10) {
                                case 8:
                                    zCompareAndSet = Z(i10, i11);
                                    break;
                                case 9:
                                case 10:
                                    zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                                    break;
                                default:
                                    zCompareAndSet = false;
                                    break;
                            }
                        } else {
                            zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                        }
                        z10 = false;
                        if (zCompareAndSet) {
                        }
                        f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                        return zCompareAndSet;
                    case 5:
                        switch (i10) {
                            case 6:
                                zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                                if (zCompareAndSet) {
                                    k().c();
                                }
                                break;
                            case 7:
                            default:
                                zCompareAndSet = false;
                                break;
                            case 8:
                                zCompareAndSet = Z(i10, i11);
                                break;
                            case 9:
                            case 10:
                                zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                                break;
                        }
                        z10 = false;
                        if (zCompareAndSet) {
                        }
                        f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                        return zCompareAndSet;
                    case 6:
                        switch (i10) {
                            case 7:
                                zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                                if (zCompareAndSet) {
                                    k().j();
                                }
                                break;
                            case 8:
                                zCompareAndSet = Z(i10, i11);
                                break;
                            case 9:
                            case 10:
                                zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                                break;
                            default:
                                zCompareAndSet = false;
                                break;
                        }
                        z10 = false;
                        if (zCompareAndSet) {
                        }
                        f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                        return zCompareAndSet;
                    case 7:
                        if (i10 != 0) {
                            if (i10 != 4) {
                                switch (i10) {
                                    case 8:
                                    case 9:
                                    case 10:
                                        break;
                                    default:
                                        zCompareAndSet = false;
                                        z10 = false;
                                        break;
                                }
                                if (zCompareAndSet) {
                                }
                                f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                                return zCompareAndSet;
                            }
                            if (x()) {
                                k().i();
                            } else {
                                zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                            }
                            zCompareAndSet = false;
                            z10 = true;
                            if (zCompareAndSet) {
                            }
                            f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                            return zCompareAndSet;
                        }
                        zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                        z10 = false;
                        if (zCompareAndSet) {
                        }
                        f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                        return zCompareAndSet;
                    case 8:
                    case 9:
                    case 11:
                        if (i10 == 0) {
                            zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                            z10 = false;
                            if (zCompareAndSet) {
                            }
                            f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                            return zCompareAndSet;
                        }
                        if (i10 == 7) {
                            h();
                        }
                        zCompareAndSet = false;
                        z10 = true;
                        if (zCompareAndSet) {
                        }
                        f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                        return zCompareAndSet;
                    case 10:
                        if (i10 == 9 || i10 == 11) {
                            zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                            if (zCompareAndSet) {
                                h();
                            }
                            z10 = false;
                        } else {
                            zCompareAndSet = false;
                            z10 = true;
                        }
                        if (zCompareAndSet) {
                        }
                        f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                        return zCompareAndSet;
                    case 12:
                        if (i10 == 4) {
                            zCompareAndSet = this.f54273i.compareAndSet(i11, 5);
                            if (zCompareAndSet) {
                                k().i();
                            }
                        } else {
                            if (i10 != 6) {
                                switch (i10) {
                                    case 8:
                                        zCompareAndSet = Z(i10, i11);
                                        break;
                                    case 9:
                                    case 10:
                                        zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                                        break;
                                    default:
                                        zCompareAndSet = false;
                                        z10 = false;
                                        break;
                                }
                                if (zCompareAndSet) {
                                }
                                f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                                return zCompareAndSet;
                            }
                            zCompareAndSet = this.f54273i.compareAndSet(i11, 13);
                            if (zCompareAndSet) {
                                k().c();
                            }
                        }
                        z10 = false;
                        if (zCompareAndSet) {
                        }
                        f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                        return zCompareAndSet;
                    case 13:
                        if (i10 != 4) {
                            switch (i10) {
                                case 7:
                                    zCompareAndSet = this.f54273i.compareAndSet(i11, 14);
                                    if (zCompareAndSet) {
                                        k().j();
                                    }
                                    break;
                                case 8:
                                    zCompareAndSet = Z(i10, i11);
                                    break;
                                case 9:
                                case 10:
                                    zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                                    break;
                                default:
                                    zCompareAndSet = false;
                                    z10 = false;
                                    break;
                            }
                            if (zCompareAndSet) {
                            }
                            f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                            return zCompareAndSet;
                        }
                        zCompareAndSet = this.f54273i.compareAndSet(i11, 6);
                        if (zCompareAndSet) {
                            k().i();
                        }
                        z10 = false;
                        if (zCompareAndSet) {
                        }
                        f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                        return zCompareAndSet;
                    case 14:
                        if (i10 != 4) {
                            switch (i10) {
                                case 8:
                                    zCompareAndSet = Z(i10, i11);
                                    break;
                                case 9:
                                case 10:
                                    zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
                                    break;
                                default:
                                    zCompareAndSet = false;
                                    z10 = false;
                                    break;
                            }
                            if (zCompareAndSet) {
                            }
                            f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                            return zCompareAndSet;
                        }
                        zCompareAndSet = this.f54273i.compareAndSet(i11, 7);
                        if (zCompareAndSet) {
                            k().i();
                        }
                        z10 = false;
                        if (zCompareAndSet) {
                        }
                        f54264x.i("setStatus {} {}", Integer.valueOf(i10), this);
                        return zCompareAndSet;
                    default:
                        throw new AssertionError(i11 + " => " + i10);
                }
            } catch (IOException e10) {
                e = e10;
                c10 = 3;
                f54264x.e(e);
                return c10;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public int d0() throws InterruptedException {
        int i10;
        synchronized (this) {
            while (!w()) {
                wait();
            }
            i10 = this.f54273i.get();
        }
        return i10;
    }

    public final void h() {
        synchronized (this) {
            g();
            this.f54287w = true;
            notifyAll();
        }
    }

    public mm.d n(mm.d dVar) throws IOException {
        synchronized (this) {
            if (this.f54272h != null) {
                if (dVar == null) {
                    dVar = new mm.h(8192);
                }
                int i10 = this.f54272h.read(dVar.V(), dVar.T(), dVar.L());
                if (i10 >= 0) {
                    dVar.W(dVar.T() + i10);
                    return dVar;
                }
            }
            return null;
        }
    }

    public boolean w() {
        boolean z10;
        synchronized (this) {
            z10 = this.f54287w;
        }
        return z10;
    }

    public final boolean x() {
        boolean z10;
        synchronized (this) {
            z10 = this.f54286v;
        }
        return z10;
    }

    public void A() {
        f54264x.g("EXPIRED " + this, new Object[0]);
    }

    public void I() throws IOException {
        InputStream inputStream = this.f54272h;
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                throw new IOException("Unsupported retry attempt");
            }
            this.f54271g = null;
            this.f54272h.reset();
        }
    }

    public void L(HttpDestination httpDestination) {
        this.f54280p = new a(httpDestination);
        org.eclipse.jetty.client.a aVarH = httpDestination.h();
        long jT = t();
        if (jT > 0) {
            aVarH.R0(this.f54280p, jT);
        } else {
            aVarH.Q0(this.f54280p);
        }
    }

    public void M(im.b bVar) {
        this.f54269e = bVar;
    }

    public void N(g gVar) {
        this.f54276l = gVar;
    }

    public void O(String str) {
        this.f54265a = str;
    }

    public void P(mm.d dVar) {
        this.f54271g = dVar;
    }

    public void Q(InputStream inputStream) {
        this.f54272h = inputStream;
        if (inputStream == null || !inputStream.markSupported()) {
            return;
        }
        this.f54272h.mark(Integer.MAX_VALUE);
    }

    public void U(String str) {
        this.f54267c = str;
    }

    public void V(boolean z10) {
        this.f54274j = z10;
    }

    public void W(String str) {
        if (str != null) {
            if ("http".equalsIgnoreCase(str)) {
                X(l.f63842a);
            } else if ("https".equalsIgnoreCase(str)) {
                X(l.f63843b);
            } else {
                X(new mm.h(str));
            }
        }
    }

    public void X(mm.d dVar) {
        this.f54266b = dVar;
    }

    public final boolean Z(int i10, int i11) {
        boolean zCompareAndSet = this.f54273i.compareAndSet(i11, i10);
        if (zCompareAndSet) {
            k().h();
        }
        return zCompareAndSet;
    }

    public final void a() {
        im.a aVar = this.f54277m;
        try {
            if (aVar != null) {
                try {
                    aVar.l();
                } catch (IOException e10) {
                    f54264x.a(e10);
                }
            }
        } finally {
            g();
        }
    }

    public void e() {
        Y(10);
        a();
    }

    public void f(org.eclipse.jetty.client.a aVar) {
        en.e.a aVar2 = this.f54280p;
        if (aVar2 != null) {
            aVar.z0(aVar2);
        }
        this.f54280p = null;
    }

    public im.a g() {
        im.a aVar = this.f54277m;
        this.f54277m = null;
        if (s() == 10) {
            Y(11);
        }
        return aVar;
    }

    public void i(HttpDestination httpDestination) {
        im.a aVar = this.f54277m;
        int iS = s();
        if (iS < 7 || iS == 12 || iS == 13 || iS == 14) {
            Y(8);
        }
        httpDestination.e(this);
        if (aVar != null) {
            aVar.n(this);
        }
    }

    public im.b j() {
        return this.f54269e;
    }

    public g k() {
        return this.f54276l;
    }

    public String l() {
        return this.f54265a;
    }

    public mm.d m() {
        return this.f54271g;
    }

    public InputStream o() {
        return this.f54272h;
    }

    public org.eclipse.jetty.http.a p() {
        return this.f54270f;
    }

    public String q() {
        return this.f54267c;
    }

    public mm.d r() {
        return this.f54266b;
    }

    public int s() {
        return this.f54273i.get();
    }

    public long t() {
        return this.f54279o;
    }

    public int v() {
        return this.f54268d;
    }

    public void y(Throwable th2) {
        f54264x.c("CONNECTION FAILED " + this, th2);
    }

    public void z(Throwable th2) {
        f54264x.c("EXCEPTION " + this, th2);
    }

    public void R(String str) {
        p().C(lm.i.f63808z, str);
    }

    public void S(String str, String str2) {
        p().B(str, str2);
    }

    public void T(mm.d dVar, mm.d dVar2) {
        p().D(dVar, dVar2);
    }

    public void a0(URI uri) {
        if (uri.isAbsolute()) {
            if (!uri.isOpaque()) {
                zm.c cVar = f54264x;
                if (cVar.f()) {
                    cVar.i("URI = {}", uri.toASCIIString());
                }
                String scheme = uri.getScheme();
                int port = uri.getPort();
                if (port <= 0) {
                    if ("https".equalsIgnoreCase(scheme)) {
                        port = 443;
                    } else {
                        port = 80;
                    }
                }
                W(scheme);
                M(new im.b(uri.getHost(), port));
                String strD = new n(uri).d();
                if (strD == null) {
                    strD = "/";
                }
                U(strD);
                return;
            }
            throw new IllegalArgumentException("Opaque URI: " + uri);
        }
        throw new IllegalArgumentException("!Absolute URI: " + uri);
    }

    public void b0(String str) {
        a0(URI.create(str));
    }

    public void c(String str, String str2) {
        p().d(str, str2);
    }

    public void d(im.a aVar) {
        if (aVar.f().g() != null) {
            this.f54278n = new im.b(aVar.f().g(), aVar.f().c());
        }
        this.f54277m = aVar;
        if (s() == 10) {
            a();
        }
    }

    public String toString() {
        String str;
        String strC0 = c0(s());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f54281q;
        if (this.f54283s >= 0) {
            str = String.format("%s@%x=%s//%s%s#%s(%dms)->%s(%dms)", getClass().getSimpleName(), Integer.valueOf(hashCode()), this.f54265a, this.f54269e, this.f54267c, c0(this.f54283s), Integer.valueOf(this.f54284t), strC0, Long.valueOf(j10));
        } else {
            str = String.format("%s@%x=%s//%s%s#%s(%dms)", getClass().getSimpleName(), Integer.valueOf(hashCode()), this.f54265a, this.f54269e, this.f54267c, strC0, Long.valueOf(j10));
        }
        if (s() >= 3 && this.f54282r > 0) {
            return str + "sent=" + (jCurrentTimeMillis - this.f54282r) + "ms";
        }
        return str;
    }

    @Deprecated
    public String u() {
        return q();
    }
}
