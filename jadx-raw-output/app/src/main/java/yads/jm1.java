package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import yads.jm1;
import yads.xq;

/* JADX INFO: loaded from: classes9.dex */
public final class jm1 implements xq {
    public static final jm1 H = new jm1(new im1());
    public static final wq I = new wq() { // from class: cp.r3
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return jm1.a(bundle);
        }
    };
    public final CharSequence A;
    public final Integer B;
    public final Integer C;
    public final CharSequence D;
    public final CharSequence E;
    public final CharSequence F;
    public final Bundle G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f79103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f79104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f79105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f79106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f79107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f79108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f79109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ql2 f79110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ql2 f79111j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f79112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f79113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f79114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f79115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f79116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f79117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f79118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f79119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f79120s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Integer f79121t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Integer f79122u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Integer f79123v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f79124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Integer f79125x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f79126y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CharSequence f79127z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jm1.class != obj.getClass()) {
            return false;
        }
        jm1 jm1Var = (jm1) obj;
        return ib3.a(this.f79103b, jm1Var.f79103b) && ib3.a(this.f79104c, jm1Var.f79104c) && ib3.a(this.f79105d, jm1Var.f79105d) && ib3.a(this.f79106e, jm1Var.f79106e) && ib3.a(this.f79107f, jm1Var.f79107f) && ib3.a(this.f79108g, jm1Var.f79108g) && ib3.a(this.f79109h, jm1Var.f79109h) && ib3.a(this.f79110i, jm1Var.f79110i) && ib3.a(this.f79111j, jm1Var.f79111j) && Arrays.equals(this.f79112k, jm1Var.f79112k) && ib3.a(this.f79113l, jm1Var.f79113l) && ib3.a(this.f79114m, jm1Var.f79114m) && ib3.a(this.f79115n, jm1Var.f79115n) && ib3.a(this.f79116o, jm1Var.f79116o) && ib3.a(this.f79117p, jm1Var.f79117p) && ib3.a(this.f79118q, jm1Var.f79118q) && ib3.a(this.f79120s, jm1Var.f79120s) && ib3.a(this.f79121t, jm1Var.f79121t) && ib3.a(this.f79122u, jm1Var.f79122u) && ib3.a(this.f79123v, jm1Var.f79123v) && ib3.a(this.f79124w, jm1Var.f79124w) && ib3.a(this.f79125x, jm1Var.f79125x) && ib3.a(this.f79126y, jm1Var.f79126y) && ib3.a(this.f79127z, jm1Var.f79127z) && ib3.a(this.A, jm1Var.A) && ib3.a(this.B, jm1Var.B) && ib3.a(this.C, jm1Var.C) && ib3.a(this.D, jm1Var.D) && ib3.a(this.E, jm1Var.E) && ib3.a(this.F, jm1Var.F);
    }

    public static jm1 a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        im1 im1Var = new im1();
        im1Var.f78698a = bundle.getCharSequence(Integer.toString(0, 36));
        im1Var.f78699b = bundle.getCharSequence(Integer.toString(1, 36));
        im1Var.f78700c = bundle.getCharSequence(Integer.toString(2, 36));
        im1Var.f78701d = bundle.getCharSequence(Integer.toString(3, 36));
        im1Var.f78702e = bundle.getCharSequence(Integer.toString(4, 36));
        im1Var.f78703f = bundle.getCharSequence(Integer.toString(5, 36));
        im1Var.f78704g = bundle.getCharSequence(Integer.toString(6, 36));
        byte[] byteArray = bundle.getByteArray(Integer.toString(10, 36));
        Integer numValueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
        im1Var.f78707j = byteArray != null ? (byte[]) byteArray.clone() : null;
        im1Var.f78708k = numValueOf;
        im1Var.f78709l = (Uri) bundle.getParcelable(Integer.toString(11, 36));
        im1Var.f78720w = bundle.getCharSequence(Integer.toString(22, 36));
        im1Var.f78721x = bundle.getCharSequence(Integer.toString(23, 36));
        im1Var.f78722y = bundle.getCharSequence(Integer.toString(24, 36));
        im1Var.B = bundle.getCharSequence(Integer.toString(27, 36));
        im1Var.C = bundle.getCharSequence(Integer.toString(28, 36));
        im1Var.D = bundle.getCharSequence(Integer.toString(30, 36));
        im1Var.E = bundle.getBundle(Integer.toString(1000, 36));
        if (bundle.containsKey(Integer.toString(8, 36)) && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
            im1Var.f78705h = (ql2) ql2.f81880b.fromBundle(bundle3);
        }
        if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
            im1Var.f78706i = (ql2) ql2.f81880b.fromBundle(bundle2);
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            im1Var.f78710m = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            im1Var.f78711n = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
        }
        if (bundle.containsKey(Integer.toString(14, 36))) {
            im1Var.f78712o = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            im1Var.f78713p = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            im1Var.f78714q = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
        }
        if (bundle.containsKey(Integer.toString(17, 36))) {
            im1Var.f78715r = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
        }
        if (bundle.containsKey(Integer.toString(18, 36))) {
            im1Var.f78716s = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
        }
        if (bundle.containsKey(Integer.toString(19, 36))) {
            im1Var.f78717t = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
        }
        if (bundle.containsKey(Integer.toString(20, 36))) {
            im1Var.f78718u = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
        }
        if (bundle.containsKey(Integer.toString(21, 36))) {
            im1Var.f78719v = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
        }
        if (bundle.containsKey(Integer.toString(25, 36))) {
            im1Var.f78723z = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
        }
        if (bundle.containsKey(Integer.toString(26, 36))) {
            im1Var.A = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
        }
        return new jm1(im1Var);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79103b, this.f79104c, this.f79105d, this.f79106e, this.f79107f, this.f79108g, this.f79109h, this.f79110i, this.f79111j, Integer.valueOf(Arrays.hashCode(this.f79112k)), this.f79113l, this.f79114m, this.f79115n, this.f79116o, this.f79117p, this.f79118q, this.f79120s, this.f79121t, this.f79122u, this.f79123v, this.f79124w, this.f79125x, this.f79126y, this.f79127z, this.A, this.B, this.C, this.D, this.E, this.F});
    }

    public jm1(im1 im1Var) {
        this.f79103b = im1Var.f78698a;
        this.f79104c = im1Var.f78699b;
        this.f79105d = im1Var.f78700c;
        this.f79106e = im1Var.f78701d;
        this.f79107f = im1Var.f78702e;
        this.f79108g = im1Var.f78703f;
        this.f79109h = im1Var.f78704g;
        this.f79110i = im1Var.f78705h;
        this.f79111j = im1Var.f78706i;
        this.f79112k = im1Var.f78707j;
        this.f79113l = im1Var.f78708k;
        this.f79114m = im1Var.f78709l;
        this.f79115n = im1Var.f78710m;
        this.f79116o = im1Var.f78711n;
        this.f79117p = im1Var.f78712o;
        this.f79118q = im1Var.f78713p;
        Integer num = im1Var.f78714q;
        this.f79119r = num;
        this.f79120s = num;
        this.f79121t = im1Var.f78715r;
        this.f79122u = im1Var.f78716s;
        this.f79123v = im1Var.f78717t;
        this.f79124w = im1Var.f78718u;
        this.f79125x = im1Var.f78719v;
        this.f79126y = im1Var.f78720w;
        this.f79127z = im1Var.f78721x;
        this.A = im1Var.f78722y;
        this.B = im1Var.f78723z;
        this.C = im1Var.A;
        this.D = im1Var.B;
        this.E = im1Var.C;
        this.F = im1Var.D;
        this.G = im1Var.E;
    }
}
