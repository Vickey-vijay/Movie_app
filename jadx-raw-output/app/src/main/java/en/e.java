package en;

/* JADX INFO: compiled from: Timeout.java */
/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zm.c f52716e = zm.b.a(e.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f52717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f52718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f52719c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f52720d;

    /* JADX INFO: compiled from: Timeout.java */
    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e f52723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f52724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f52725f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f52726g = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f52722c = this;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f52721b = this;

        public void e() {
        }

        public void f() {
        }

        public void d() {
            e eVar = this.f52723d;
            if (eVar != null) {
                synchronized (eVar.f52717a) {
                    h();
                    this.f52725f = 0L;
                }
            }
        }

        public final void g(a aVar) {
            a aVar2 = this.f52721b;
            aVar2.f52722c = aVar;
            this.f52721b = aVar;
            aVar.f52721b = aVar2;
            this.f52721b.f52722c = this;
        }

        public final void h() {
            a aVar = this.f52721b;
            aVar.f52722c = this.f52722c;
            this.f52722c.f52721b = aVar;
            this.f52722c = this;
            this.f52721b = this;
            this.f52726g = false;
        }
    }

    public e() {
        a aVar = new a();
        this.f52720d = aVar;
        this.f52717a = new Object();
        aVar.f52723d = this;
    }

    public void b() {
        synchronized (this.f52717a) {
            a aVar = this.f52720d;
            aVar.f52722c = aVar;
            aVar.f52721b = aVar;
        }
    }

    public a c() {
        synchronized (this.f52717a) {
            long j10 = this.f52719c - this.f52718b;
            a aVar = this.f52720d;
            a aVar2 = aVar.f52721b;
            if (aVar2 == aVar) {
                return null;
            }
            if (aVar2.f52725f > j10) {
                return null;
            }
            aVar2.h();
            aVar2.f52726g = true;
            return aVar2;
        }
    }

    public long d() {
        return this.f52718b;
    }

    public long e() {
        return this.f52719c;
    }

    public long f() {
        synchronized (this.f52717a) {
            a aVar = this.f52720d;
            a aVar2 = aVar.f52721b;
            if (aVar2 == aVar) {
                return -1L;
            }
            long j10 = (this.f52718b + aVar2.f52725f) - this.f52719c;
            if (j10 < 0) {
                j10 = 0;
            }
            return j10;
        }
    }

    public void g(a aVar) {
        h(aVar, 0L);
    }

    public void h(a aVar, long j10) {
        synchronized (this.f52717a) {
            if (aVar.f52725f != 0) {
                aVar.h();
                aVar.f52725f = 0L;
            }
            aVar.f52723d = this;
            aVar.f52726g = false;
            aVar.f52724e = j10;
            aVar.f52725f = this.f52719c + j10;
            a aVar2 = this.f52720d.f52722c;
            while (aVar2 != this.f52720d && aVar2.f52725f > aVar.f52725f) {
                aVar2 = aVar2.f52722c;
            }
            aVar2.g(aVar);
        }
    }

    public void i(long j10) {
        this.f52718b = j10;
    }

    public void k(long j10) {
        this.f52719c = j10;
    }

    public void l() {
        a aVar;
        long j10 = this.f52719c - this.f52718b;
        while (true) {
            try {
                synchronized (this.f52717a) {
                    try {
                        a aVar2 = this.f52720d;
                        aVar = aVar2.f52721b;
                        if (aVar != aVar2 && aVar.f52725f <= j10) {
                            aVar.h();
                            aVar.f52726g = true;
                            aVar.e();
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                aVar.f();
            } catch (Throwable th3) {
                f52716e.c("EXCEPTION ", th3);
            }
        }
    }

    public void m(long j10) {
        this.f52719c = j10;
        l();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        for (a aVar = this.f52720d.f52721b; aVar != this.f52720d; aVar = aVar.f52721b) {
            stringBuffer.append("-->");
            stringBuffer.append(aVar);
        }
        return stringBuffer.toString();
    }

    public long j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f52719c = jCurrentTimeMillis;
        return jCurrentTimeMillis;
    }

    public e(Object obj) {
        a aVar = new a();
        this.f52720d = aVar;
        this.f52717a = obj;
        aVar.f52723d = this;
    }
}
