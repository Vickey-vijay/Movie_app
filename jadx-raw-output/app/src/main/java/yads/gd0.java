package yads;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class gd0 implements sk0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f77741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mn0 f77742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w11 f77743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f77744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f77745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f77746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f77747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ed0 f77748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ae0 f77749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final fd0 f77750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f77751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f77752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f77753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set f77754o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f77755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public on0 f77756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public zc0 f77757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zc0 f77758s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Looper f77759t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Handler f77760u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f77761v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f77762w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ye2 f77763x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile bd0 f77764y;

    public final mk0 a(Looper looper, ok0 ok0Var, mx0 mx0Var, boolean z10) {
        ArrayList arrayListA;
        if (this.f77764y == null) {
            this.f77764y = new bd0(this, looper);
        }
        kk0 kk0Var = mx0Var.f80432p;
        zc0 zc0VarA = null;
        if (kk0Var == null) {
            int iD = ht1.d(mx0Var.f80429m);
            on0 on0Var = this.f77756q;
            on0Var.getClass();
            if (on0Var.b() == 2 && ux0.f83681d) {
                return null;
            }
            int[] iArr = this.f77746g;
            for (int i10 = 0; i10 < iArr.length; i10++) {
                if (iArr[i10] == iD) {
                    if (i10 == -1 || on0Var.b() == 1) {
                        return null;
                    }
                    zc0 zc0Var = this.f77757r;
                    if (zc0Var == null) {
                        m51 m51Var = p51.f81258c;
                        zc0 zc0VarA2 = a(sm2.f82697f, true, (ok0) null, z10);
                        this.f77752m.add(zc0VarA2);
                        this.f77757r = zc0VarA2;
                    } else {
                        zc0Var.b(null);
                    }
                    return this.f77757r;
                }
            }
            return null;
        }
        if (this.f77762w == null) {
            arrayListA = a(kk0Var, this.f77741b, false);
            if (arrayListA.isEmpty()) {
                cd0 cd0Var = new cd0(this.f77741b);
                ih1.b("DefaultDrmSessionMgr", ih1.a("DRM error", cd0Var));
                if (ok0Var != null) {
                    ok0Var.a(cd0Var);
                }
                return new sm0(new lk0(cd0Var, 6003));
            }
        } else {
            arrayListA = null;
        }
        if (this.f77745f) {
            for (zc0 zc0Var2 : this.f77752m) {
                if (ib3.a(zc0Var2.f85315a, arrayListA)) {
                    zc0VarA = zc0Var2;
                    break;
                }
            }
        } else {
            zc0VarA = this.f77758s;
        }
        if (zc0VarA == null) {
            zc0VarA = a((List) arrayListA, false, ok0Var, z10);
            if (!this.f77745f) {
                this.f77758s = zc0VarA;
            }
            this.f77752m.add(zc0VarA);
        } else {
            zc0VarA.b(ok0Var);
        }
        return zc0VarA;
    }

    @Override // yads.sk0
    public final mk0 b(ok0 ok0Var, mx0 mx0Var) {
        if (this.f77755p <= 0) {
            throw new IllegalStateException();
        }
        Looper looper = this.f77759t;
        if (looper != null) {
            return a(looper, ok0Var, mx0Var, true);
        }
        throw new IllegalStateException();
    }

    @Override // yads.sk0
    public final void prepare() {
        int i10 = this.f77755p;
        this.f77755p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f77756q == null) {
            on0 on0VarA = this.f77742c.a(this.f77741b);
            this.f77756q = on0VarA;
            on0VarA.a(new ad0(this));
        } else if (this.f77751l != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f77752m.size(); i11++) {
                ((zc0) this.f77752m.get(i11)).b(null);
            }
        }
    }

    @Override // yads.sk0
    public final void release() {
        int i10 = this.f77755p - 1;
        this.f77755p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f77751l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f77752m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((zc0) arrayList.get(i11)).a((ok0) null);
            }
        }
        ja3 it = u51.a(this.f77753n).iterator();
        while (it.hasNext()) {
            ((dd0) it.next()).release();
        }
        if (this.f77756q != null && this.f77755p == 0 && this.f77752m.isEmpty() && this.f77753n.isEmpty()) {
            on0 on0Var = this.f77756q;
            on0Var.getClass();
            on0Var.release();
            this.f77756q = null;
        }
    }

    public gd0(UUID uuid, mn0 mn0Var, w11 w11Var, HashMap map, boolean z10, int[] iArr, boolean z11, ae0 ae0Var, long j10) {
        ni.a(uuid);
        ni.a("Use C.CLEARKEY_UUID instead", !jr.f79150b.equals(uuid));
        this.f77741b = uuid;
        this.f77742c = mn0Var;
        this.f77743d = w11Var;
        this.f77744e = map;
        this.f77745f = z10;
        this.f77746g = iArr;
        this.f77747h = z11;
        this.f77749j = ae0Var;
        this.f77748i = new ed0();
        this.f77750k = new fd0(this);
        this.f77761v = 0;
        this.f77752m = new ArrayList();
        this.f77753n = ly2.a();
        this.f77754o = ly2.a();
        this.f77751l = j10;
    }

    public final zc0 a(List list, boolean z10, ok0 ok0Var) {
        this.f77756q.getClass();
        boolean z11 = this.f77747h | z10;
        UUID uuid = this.f77741b;
        on0 on0Var = this.f77756q;
        ed0 ed0Var = this.f77748i;
        fd0 fd0Var = this.f77750k;
        int i10 = this.f77761v;
        byte[] bArr = this.f77762w;
        HashMap map = this.f77744e;
        w11 w11Var = this.f77743d;
        Looper looper = this.f77759t;
        looper.getClass();
        ae0 ae0Var = this.f77749j;
        ye2 ye2Var = this.f77763x;
        ye2Var.getClass();
        zc0 zc0Var = new zc0(uuid, on0Var, ed0Var, fd0Var, list, i10, z11, z10, bArr, map, w11Var, looper, ae0Var, ye2Var);
        zc0Var.b(ok0Var);
        if (this.f77751l != -9223372036854775807L) {
            zc0Var.b(null);
        }
        return zc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x003c A[LOOP:0: B:11:0x0036->B:13:0x003c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public final zc0 a(List list, boolean z10, ok0 ok0Var, boolean z11) {
        ja3 it;
        zc0 zc0VarA = a(list, z10, ok0Var);
        if (zc0VarA.f85329o == 1) {
            if (ib3.f78556a >= 19) {
                lk0 lk0VarC = zc0VarA.c();
                lk0VarC.getClass();
                if (lk0VarC.getCause() instanceof ResourceBusyException) {
                    if (!this.f77754o.isEmpty()) {
                        it = u51.a(this.f77754o).iterator();
                        while (it.hasNext()) {
                            ((mk0) it.next()).a((ok0) null);
                        }
                        zc0VarA.a(ok0Var);
                        if (this.f77751l != -9223372036854775807L) {
                            zc0VarA.a((ok0) null);
                        }
                        zc0VarA = a(list, z10, ok0Var);
                    }
                }
            } else if (!this.f77754o.isEmpty()) {
                it = u51.a(this.f77754o).iterator();
                while (it.hasNext()) {
                    ((mk0) it.next()).a((ok0) null);
                }
                zc0VarA.a(ok0Var);
                if (this.f77751l != -9223372036854775807L) {
                    zc0VarA.a((ok0) null);
                }
                zc0VarA = a(list, z10, ok0Var);
            }
        }
        if (zc0VarA.f85329o != 1) {
            return zc0VarA;
        }
        if (ib3.f78556a >= 19) {
            lk0 lk0VarC2 = zc0VarA.c();
            lk0VarC2.getClass();
            if (!(lk0VarC2.getCause() instanceof ResourceBusyException)) {
                return zc0VarA;
            }
        }
        if (!z11 || this.f77753n.isEmpty()) {
            return zc0VarA;
        }
        ja3 it2 = u51.a(this.f77753n).iterator();
        while (it2.hasNext()) {
            ((dd0) it2.next()).release();
        }
        if (!this.f77754o.isEmpty()) {
            ja3 it3 = u51.a(this.f77754o).iterator();
            while (it3.hasNext()) {
                ((mk0) it3.next()).a((ok0) null);
            }
        }
        zc0VarA.a(ok0Var);
        if (this.f77751l != -9223372036854775807L) {
            zc0VarA.a((ok0) null);
        }
        return a(list, z10, ok0Var);
    }

    @Override // yads.sk0
    public final int a(mx0 mx0Var) {
        String str;
        on0 on0Var = this.f77756q;
        on0Var.getClass();
        int iB = on0Var.b();
        kk0 kk0Var = mx0Var.f80432p;
        if (kk0Var == null) {
            int iD = ht1.d(mx0Var.f80429m);
            int[] iArr = this.f77746g;
            for (int i10 = 0; i10 < iArr.length; i10++) {
                if (iArr[i10] == iD) {
                    if (i10 == -1) {
                        break;
                    }
                    return iB;
                }
            }
            return 0;
        }
        if (this.f77762w != null) {
            return iB;
        }
        if (a(kk0Var, this.f77741b, true).isEmpty()) {
            if (kk0Var.f79438e == 1 && kk0Var.f79435b[0].a(jr.f79150b)) {
                ih1.d("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f77741b);
                str = kk0Var.f79437d;
                return str == null ? iB : iB;
            }
        } else {
            str = kk0Var.f79437d;
            if (str == null && !"cenc".equals(str)) {
                if ("cbcs".equals(str)) {
                    if (ib3.f78556a >= 25) {
                        return iB;
                    }
                } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                    return iB;
                }
            }
        }
        return 1;
    }

    @Override // yads.sk0
    public final rk0 a(ok0 ok0Var, mx0 mx0Var) {
        if (this.f77755p > 0) {
            if (this.f77759t != null) {
                dd0 dd0Var = new dd0(this, ok0Var);
                dd0Var.a(mx0Var);
                return dd0Var;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // yads.sk0
    public final void a(Looper looper, ye2 ye2Var) {
        synchronized (this) {
            Looper looper2 = this.f77759t;
            if (looper2 == null) {
                this.f77759t = looper;
                this.f77760u = new Handler(looper);
            } else if (looper2 == looper) {
                this.f77760u.getClass();
            } else {
                throw new IllegalStateException();
            }
        }
        this.f77763x = ye2Var;
    }

    public static ArrayList a(kk0 kk0Var, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(kk0Var.f79438e);
        for (int i10 = 0; i10 < kk0Var.f79438e; i10++) {
            jk0 jk0Var = kk0Var.f79435b[i10];
            if ((jk0Var.a(uuid) || (jr.f79151c.equals(uuid) && jk0Var.a(jr.f79150b))) && (jk0Var.f79080f != null || z10)) {
                arrayList.add(jk0Var);
            }
        }
        return arrayList;
    }
}
