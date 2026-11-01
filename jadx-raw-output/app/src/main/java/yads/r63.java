package yads;

import android.net.Uri;
import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import yads.r63;
import yads.xq;

/* JADX INFO: loaded from: classes10.dex */
public final class r63 implements xq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f82114s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f82115t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final fm1 f82116u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final wq f82117v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f82119c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f82121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f82122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f82123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f82124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f82125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f82126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f82127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public yl1 f82128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f82129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f82130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f82131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f82132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f82133q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f82134r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f82118b = f82114s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fm1 f82120d = f82116u;

    public static r63 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        fm1 fm1Var = bundle2 != null ? (fm1) fm1.f77442h.fromBundle(bundle2) : null;
        long j10 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
        long j11 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
        long j12 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
        boolean z10 = bundle.getBoolean(Integer.toString(5, 36), false);
        boolean z11 = bundle.getBoolean(Integer.toString(6, 36), false);
        Bundle bundle3 = bundle.getBundle(Integer.toString(7, 36));
        yl1 yl1Var = bundle3 != null ? (yl1) yl1.f85038h.fromBundle(bundle3) : null;
        boolean z12 = bundle.getBoolean(Integer.toString(8, 36), false);
        long j13 = bundle.getLong(Integer.toString(9, 36), 0L);
        long j14 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
        int i10 = bundle.getInt(Integer.toString(11, 36), 0);
        int i11 = bundle.getInt(Integer.toString(12, 36), 0);
        long j15 = bundle.getLong(Integer.toString(13, 36), 0L);
        r63 r63Var = new r63();
        r63Var.a(f82115t, fm1Var, null, j10, j11, j12, z10, z11, yl1Var, j13, j14, i10, i11, j15);
        r63Var.f82129m = z12;
        return r63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !r63.class.equals(obj.getClass())) {
            return false;
        }
        r63 r63Var = (r63) obj;
        return ib3.a(this.f82118b, r63Var.f82118b) && ib3.a(this.f82120d, r63Var.f82120d) && ib3.a(this.f82121e, r63Var.f82121e) && ib3.a(this.f82128l, r63Var.f82128l) && this.f82122f == r63Var.f82122f && this.f82123g == r63Var.f82123g && this.f82124h == r63Var.f82124h && this.f82125i == r63Var.f82125i && this.f82126j == r63Var.f82126j && this.f82129m == r63Var.f82129m && this.f82130n == r63Var.f82130n && this.f82131o == r63Var.f82131o && this.f82132p == r63Var.f82132p && this.f82133q == r63Var.f82133q && this.f82134r == r63Var.f82134r;
    }

    static {
        am1 am1Var;
        sl1 sl1Var = new sl1();
        vl1 vl1Var = new vl1();
        List listEmptyList = Collections.emptyList();
        sm2 sm2Var = sm2.f82697f;
        cm1 cm1Var = cm1.f76322d;
        Uri uri = Uri.EMPTY;
        if (vl1Var.f83946b != null && vl1Var.f83945a == null) {
            throw new IllegalStateException();
        }
        if (uri != null) {
            am1Var = new am1(uri, null, vl1Var.f83945a != null ? new wl1(vl1Var) : null, listEmptyList, null, sm2Var, null);
        } else {
            am1Var = null;
        }
        f82116u = new fm1("com.monetization.ads.exoplayer2.Timeline", new ul1(sl1Var), am1Var, new yl1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), jm1.H, cm1Var);
        f82117v = new wq() { // from class: cp.d9
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return r63.a(bundle);
            }
        };
    }

    public final int hashCode() {
        int iHashCode = (this.f82120d.hashCode() + ((this.f82118b.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 31;
        Object obj = this.f82121e;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        yl1 yl1Var = this.f82128l;
        int iHashCode3 = (iHashCode2 + (yl1Var != null ? yl1Var.hashCode() : 0)) * 31;
        long j10 = this.f82122f;
        int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f82123g;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f82124h;
        int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f82125i ? 1 : 0)) * 31) + (this.f82126j ? 1 : 0)) * 31) + (this.f82129m ? 1 : 0)) * 31;
        long j13 = this.f82130n;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f82131o;
        int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f82132p) * 31) + this.f82133q) * 31;
        long j15 = this.f82134r;
        return i14 + ((int) (j15 ^ (j15 >>> 32)));
    }

    public final boolean a() {
        boolean z10 = this.f82127k;
        yl1 yl1Var = this.f82128l;
        if (z10 == (yl1Var != null)) {
            return yl1Var != null;
        }
        throw new IllegalStateException();
    }

    public final r63 a(Object obj, fm1 fm1Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, yl1 yl1Var, long j13, long j14, int i10, int i11, long j15) {
        am1 am1Var;
        this.f82118b = obj;
        this.f82120d = fm1Var != null ? fm1Var : f82116u;
        this.f82119c = (fm1Var == null || (am1Var = fm1Var.f77444c) == null) ? null : am1Var.f85478g;
        this.f82121e = obj2;
        this.f82122f = j10;
        this.f82123g = j11;
        this.f82124h = j12;
        this.f82125i = z10;
        this.f82126j = z11;
        this.f82127k = yl1Var != null;
        this.f82128l = yl1Var;
        this.f82130n = j13;
        this.f82131o = j14;
        this.f82132p = i10;
        this.f82133q = i11;
        this.f82134r = j15;
        this.f82129m = false;
        return this;
    }
}
