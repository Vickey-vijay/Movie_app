package yads;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import yads.ok0;

/* JADX INFO: loaded from: classes2.dex */
public final class zc0 implements mk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f85315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final on0 f85316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tc0 f85317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc0 f85318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f85319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f85320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f85321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f85322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a00 f85323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ae0 f85324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ye2 f85325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w11 f85326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UUID f85327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xc0 f85328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f85329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f85330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HandlerThread f85331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public vc0 f85332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k20 f85333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public lk0 f85334t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f85335u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f85336v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public kn0 f85337w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public nn0 f85338x;

    public zc0(UUID uuid, on0 on0Var, ed0 ed0Var, fd0 fd0Var, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap map, w11 w11Var, Looper looper, ae0 ae0Var, ye2 ye2Var) {
        if (i10 == 1 || i10 == 3) {
            ni.a(bArr);
        }
        this.f85327m = uuid;
        this.f85317c = ed0Var;
        this.f85318d = fd0Var;
        this.f85316b = on0Var;
        this.f85319e = i10;
        this.f85320f = z10;
        this.f85321g = z11;
        if (bArr != null) {
            this.f85336v = bArr;
            this.f85315a = null;
        } else {
            this.f85315a = Collections.unmodifiableList((List) ni.a(list));
        }
        this.f85322h = map;
        this.f85326l = w11Var;
        this.f85323i = new a00();
        this.f85324j = ae0Var;
        this.f85325k = ye2Var;
        this.f85329o = 2;
        this.f85328n = new xc0(this, looper);
    }

    public final void a(iz izVar) {
        Set set;
        a00 a00Var = this.f85323i;
        synchronized (a00Var.f75346b) {
            set = a00Var.f75348d;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            izVar.accept((ok0) it.next());
        }
    }

    @Override // yads.mk0
    public final void b(ok0 ok0Var) {
        if (this.f85330p < 0) {
            ih1.b("DefaultDrmSession", "Session reference count less than zero: " + this.f85330p);
            this.f85330p = 0;
        }
        if (ok0Var != null) {
            a00 a00Var = this.f85323i;
            synchronized (a00Var.f75346b) {
                ArrayList arrayList = new ArrayList(a00Var.f75349e);
                arrayList.add(ok0Var);
                a00Var.f75349e = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) a00Var.f75347c.get(ok0Var);
                if (num == null) {
                    HashSet hashSet = new HashSet(a00Var.f75348d);
                    hashSet.add(ok0Var);
                    a00Var.f75348d = Collections.unmodifiableSet(hashSet);
                }
                a00Var.f75347c.put(ok0Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i10 = this.f85330p + 1;
        this.f85330p = i10;
        if (i10 == 1) {
            if (this.f85329o != 2) {
                throw new IllegalStateException();
            }
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f85331q = handlerThread;
            handlerThread.start();
            this.f85332r = new vc0(this, this.f85331q.getLooper());
            if (f()) {
                a(true);
            }
        } else if (ok0Var != null && e() && this.f85323i.a(ok0Var) == 1) {
            ok0Var.a(this.f85329o);
        }
        fd0 fd0Var = (fd0) this.f85318d;
        gd0 gd0Var = fd0Var.f77354a;
        if (gd0Var.f77751l != -9223372036854775807L) {
            gd0Var.f77754o.remove(this);
            Handler handler = fd0Var.f77354a.f77760u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // yads.mk0
    public final lk0 c() {
        if (this.f85329o == 1) {
            return this.f85334t;
        }
        return null;
    }

    @Override // yads.mk0
    public final k20 d() {
        return this.f85333s;
    }

    public final boolean e() {
        int i10 = this.f85329o;
        return i10 == 3 || i10 == 4;
    }

    public final Map g() {
        byte[] bArr = this.f85335u;
        if (bArr == null) {
            return null;
        }
        return this.f85316b.a(bArr);
    }

    @Override // yads.mk0
    public final int getState() {
        return this.f85329o;
    }

    public final boolean f() {
        if (e()) {
            return true;
        }
        try {
            byte[] bArrC = this.f85316b.c();
            this.f85335u = bArrC;
            this.f85316b.a(bArrC, this.f85325k);
            this.f85333s = this.f85316b.d(this.f85335u);
            final int i10 = 3;
            this.f85329o = 3;
            a(new iz() { // from class: cp.ad
                @Override // yads.iz
                public final void accept(Object obj) {
                    ((ok0) obj).a(i10);
                }
            });
            this.f85335u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            ed0 ed0Var = (ed0) this.f85317c;
            ed0Var.f77031a.add(this);
            if (ed0Var.f77032b == null) {
                ed0Var.f77032b = this;
                nn0 nn0VarA = this.f85316b.a();
                this.f85338x = nn0VarA;
                vc0 vc0Var = this.f85332r;
                int i11 = ib3.f78556a;
                nn0VarA.getClass();
                vc0Var.getClass();
                vc0Var.obtainMessage(0, new wc0(vf1.f83897a.getAndIncrement(), true, SystemClock.elapsedRealtime(), nn0VarA)).sendToTarget();
            }
            return false;
        } catch (Exception e10) {
            a(1, e10);
            return false;
        }
    }

    public final void a(boolean z10) {
        long j10;
        Pair pair;
        long jMin;
        if (this.f85321g) {
            return;
        }
        byte[] bArr = this.f85335u;
        int i10 = ib3.f78556a;
        int i11 = this.f85319e;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f85336v.getClass();
                this.f85335u.getClass();
                a(this.f85336v, 3, z10);
                return;
            }
            byte[] bArr2 = this.f85336v;
            if (bArr2 != null) {
                try {
                    this.f85316b.a(bArr, bArr2);
                } catch (Exception e10) {
                    a(1, e10);
                    return;
                }
            }
            a(bArr, 2, z10);
            return;
        }
        byte[] bArr3 = this.f85336v;
        if (bArr3 == null) {
            a(bArr, 1, z10);
            return;
        }
        if (this.f85329o != 4) {
            try {
                this.f85316b.a(bArr, bArr3);
            } catch (Exception e11) {
                a(1, e11);
                return;
            }
        }
        if (jr.f79152d.equals(this.f85327m)) {
            Map mapG = g();
            if (mapG == null) {
                pair = null;
            } else {
                long j11 = -9223372036854775807L;
                try {
                    String str = (String) mapG.get("LicenseDurationRemaining");
                    j10 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                } catch (NumberFormatException unused) {
                }
                Long lValueOf = Long.valueOf(j10);
                try {
                    String str2 = (String) mapG.get("PlaybackDurationRemaining");
                    if (str2 != null) {
                        j11 = Long.parseLong(str2);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j11));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (this.f85319e == 0 && jMin <= 60) {
            ih1.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            a(bArr, 2, z10);
            return;
        }
        if (jMin <= 0) {
            a(2, new le1());
        } else {
            this.f85329o = 4;
            a(new iz() { // from class: cp.bd
                @Override // yads.iz
                public final void accept(Object obj) {
                    ((ok0) obj).c();
                }
            });
        }
    }

    @Override // yads.mk0
    public final UUID b() {
        return this.f85327m;
    }

    public final void a(Object obj, Object obj2) {
        if (obj == this.f85337w && e()) {
            this.f85337w = null;
            if (obj2 instanceof Exception) {
                Exception exc = (Exception) obj2;
                if (exc instanceof NotProvisionedException) {
                    ed0 ed0Var = (ed0) this.f85317c;
                    ed0Var.f77031a.add(this);
                    if (ed0Var.f77032b != null) {
                        return;
                    }
                    ed0Var.f77032b = this;
                    nn0 nn0VarA = this.f85316b.a();
                    this.f85338x = nn0VarA;
                    vc0 vc0Var = this.f85332r;
                    int i10 = ib3.f78556a;
                    nn0VarA.getClass();
                    vc0Var.getClass();
                    vc0Var.obtainMessage(0, new wc0(vf1.f83897a.getAndIncrement(), true, SystemClock.elapsedRealtime(), nn0VarA)).sendToTarget();
                    return;
                }
                a(2, exc);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f85319e == 3) {
                    on0 on0Var = this.f85316b;
                    byte[] bArr2 = this.f85336v;
                    int i11 = ib3.f78556a;
                    on0Var.b(bArr2, bArr);
                    a(new iz() { // from class: cp.yc
                        @Override // yads.iz
                        public final void accept(Object obj3) {
                            ((ok0) obj3).b();
                        }
                    });
                    return;
                }
                byte[] bArrB = this.f85316b.b(this.f85335u, bArr);
                int i12 = this.f85319e;
                if ((i12 == 2 || (i12 == 0 && this.f85336v != null)) && bArrB != null && bArrB.length != 0) {
                    this.f85336v = bArrB;
                }
                this.f85329o = 4;
                a(new iz() { // from class: cp.zc
                    @Override // yads.iz
                    public final void accept(Object obj3) {
                        ((ok0) obj3).a();
                    }
                });
            } catch (Exception e10) {
                if (e10 instanceof NotProvisionedException) {
                    ed0 ed0Var2 = (ed0) this.f85317c;
                    ed0Var2.f77031a.add(this);
                    if (ed0Var2.f77032b != null) {
                        return;
                    }
                    ed0Var2.f77032b = this;
                    nn0 nn0VarA2 = this.f85316b.a();
                    this.f85338x = nn0VarA2;
                    vc0 vc0Var2 = this.f85332r;
                    int i13 = ib3.f78556a;
                    nn0VarA2.getClass();
                    vc0Var2.getClass();
                    vc0Var2.obtainMessage(0, new wc0(vf1.f83897a.getAndIncrement(), true, SystemClock.elapsedRealtime(), nn0VarA2)).sendToTarget();
                    return;
                }
                a(1, e10);
            }
        }
    }

    @Override // yads.mk0
    public final boolean a() {
        return this.f85320f;
    }

    public final void a(byte[] bArr, int i10, boolean z10) {
        try {
            kn0 kn0VarA = this.f85316b.a(bArr, this.f85315a, i10, this.f85322h);
            this.f85337w = kn0VarA;
            vc0 vc0Var = this.f85332r;
            int i11 = ib3.f78556a;
            kn0VarA.getClass();
            vc0Var.getClass();
            vc0Var.obtainMessage(1, new wc0(vf1.f83897a.getAndIncrement(), z10, SystemClock.elapsedRealtime(), kn0VarA)).sendToTarget();
        } catch (Exception e10) {
            if (e10 instanceof NotProvisionedException) {
                ed0 ed0Var = (ed0) this.f85317c;
                ed0Var.f77031a.add(this);
                if (ed0Var.f77032b != null) {
                    return;
                }
                ed0Var.f77032b = this;
                nn0 nn0VarA = this.f85316b.a();
                this.f85338x = nn0VarA;
                vc0 vc0Var2 = this.f85332r;
                int i12 = ib3.f78556a;
                nn0VarA.getClass();
                vc0Var2.getClass();
                vc0Var2.obtainMessage(0, new wc0(vf1.f83897a.getAndIncrement(), true, SystemClock.elapsedRealtime(), nn0VarA)).sendToTarget();
                return;
            }
            a(1, e10);
        }
    }

    @Override // yads.mk0
    public final void a(ok0 ok0Var) {
        int i10 = this.f85330p;
        if (i10 <= 0) {
            ih1.b("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f85330p = i11;
        if (i11 == 0) {
            this.f85329o = 0;
            xc0 xc0Var = this.f85328n;
            int i12 = ib3.f78556a;
            xc0Var.removeCallbacksAndMessages(null);
            vc0 vc0Var = this.f85332r;
            synchronized (vc0Var) {
                vc0Var.removeCallbacksAndMessages(null);
                vc0Var.f83876a = true;
            }
            this.f85332r = null;
            this.f85331q.quit();
            this.f85331q = null;
            this.f85333s = null;
            this.f85334t = null;
            this.f85337w = null;
            this.f85338x = null;
            byte[] bArr = this.f85335u;
            if (bArr != null) {
                this.f85316b.b(bArr);
                this.f85335u = null;
            }
        }
        if (ok0Var != null) {
            this.f85323i.b(ok0Var);
            if (this.f85323i.a(ok0Var) == 0) {
                ok0Var.d();
            }
        }
        ((fd0) this.f85318d).a(this, this.f85330p);
    }

    @Override // yads.mk0
    public final boolean a(String str) {
        on0 on0Var = this.f85316b;
        byte[] bArr = this.f85335u;
        if (bArr != null) {
            return on0Var.a(str, bArr);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004c  */
    public final void a(int i10, final Exception exc) {
        int iB;
        int i11 = ib3.f78556a;
        if (i11 >= 21 && uk0.a(exc)) {
            iB = uk0.b(exc);
        } else if (i11 >= 23 && vk0.a(exc)) {
            iB = 6006;
        } else if (i11 >= 18 && tk0.b(exc)) {
            iB = 6002;
        } else if (i11 >= 18 && tk0.a(exc)) {
            iB = 6007;
        } else if (exc instanceof la3) {
            iB = 6001;
        } else if (exc instanceof cd0) {
            iB = 6003;
        } else if (exc instanceof le1) {
            iB = 6008;
        } else if (i10 == 1) {
            iB = 6006;
        } else if (i10 == 2) {
            iB = 6004;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException();
            }
            iB = 6002;
        }
        this.f85334t = new lk0(exc, iB);
        ih1.b("DefaultDrmSession", ih1.a("DRM session error", exc));
        a(new iz() { // from class: cp.cd
            @Override // yads.iz
            public final void accept(Object obj) {
                ((ok0) obj).a(exc);
            }
        });
        if (this.f85329o != 4) {
            this.f85329o = 1;
        }
    }
}
