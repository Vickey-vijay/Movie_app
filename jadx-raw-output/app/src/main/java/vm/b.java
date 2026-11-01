package vm;

import java.security.SecureRandom;
import java.util.Random;
import rm.s;

/* JADX INFO: compiled from: AbstractSessionIdManager.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends ym.a implements s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final zm.c f73208o = zm.b.a(b.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Random f73209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f73210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f73211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f73212n = 100000;

    @Override // ym.a
    public void e0() throws Exception {
    }

    @Override // rm.s
    public String n(lj.a aVar, long j10) {
        synchronized (this) {
            if (aVar != null) {
                try {
                    String strN = aVar.n();
                    if (strN != null) {
                        String strC0 = c0(strN);
                        if (M(strC0)) {
                            return strC0;
                        }
                    }
                    String str = (String) aVar.getAttribute("org.eclipse.jetty.server.newSessionId");
                    if (str != null && M(str)) {
                        return str;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            String str2 = null;
            while (true) {
                if (str2 != null && str2.length() != 0 && !M(str2)) {
                    aVar.a("org.eclipse.jetty.server.newSessionId", str2);
                    return str2;
                }
                long jHashCode = this.f73210l ? ((((long) hashCode()) ^ Runtime.getRuntime().freeMemory()) ^ ((long) this.f73209k.nextInt())) ^ (((long) aVar.hashCode()) << 32) : this.f73209k.nextLong();
                if (jHashCode < 0) {
                    jHashCode = -jHashCode;
                }
                long j11 = this.f73212n;
                if (j11 > 0 && jHashCode % j11 == 1) {
                    f73208o.i("Reseeding {}", this);
                    Random random = this.f73209k;
                    if (random instanceof SecureRandom) {
                        SecureRandom secureRandom = (SecureRandom) random;
                        secureRandom.setSeed(secureRandom.generateSeed(8));
                    } else {
                        random.setSeed(((random.nextLong() ^ System.currentTimeMillis()) ^ ((long) aVar.hashCode())) ^ Runtime.getRuntime().freeMemory());
                    }
                }
                long jHashCode2 = this.f73210l ? (((long) aVar.hashCode()) << 32) ^ ((((long) hashCode()) ^ Runtime.getRuntime().freeMemory()) ^ ((long) this.f73209k.nextInt())) : this.f73209k.nextLong();
                if (jHashCode2 < 0) {
                    jHashCode2 = -jHashCode2;
                }
                str2 = Long.toString(jHashCode, 36) + Long.toString(jHashCode2, 36);
                if (this.f73211m != null) {
                    str2 = this.f73211m + str2;
                }
            }
        }
    }

    public void m0() {
        Random random = this.f73209k;
        if (random != null) {
            random.setSeed(((random.nextLong() ^ System.currentTimeMillis()) ^ ((long) hashCode())) ^ Runtime.getRuntime().freeMemory());
            return;
        }
        try {
            this.f73209k = new SecureRandom();
        } catch (Exception e10) {
            f73208o.c("Could not generate SecureRandom for session-id randomness", e10);
            this.f73209k = new Random();
            this.f73210l = true;
        }
    }

    @Override // ym.a
    public void d0() throws Exception {
        m0();
    }
}
