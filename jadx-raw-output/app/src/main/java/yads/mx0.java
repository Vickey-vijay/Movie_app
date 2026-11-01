package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import yads.mx0;
import yads.xq;

/* JADX INFO: loaded from: classes6.dex */
public final class mx0 implements xq {
    public static final mx0 H = new mx0(new lx0());
    public static final wq I = new wq() { // from class: cp.r6
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return mx0.a(bundle);
        }
    };
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public int G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f80420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f80421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f80422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f80423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f80424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f80425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f80426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ts1 f80427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f80428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f80429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f80430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f80431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kk0 f80432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f80433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f80434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f80435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f80436t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f80437u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f80438v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f80439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f80440x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final mx f80441y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f80442z;

    public final int a() {
        int i10;
        int i11 = this.f80434r;
        if (i11 == -1 || (i10 = this.f80435s) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || mx0.class != obj.getClass()) {
            return false;
        }
        mx0 mx0Var = (mx0) obj;
        int i11 = this.G;
        if (i11 == 0 || (i10 = mx0Var.G) == 0 || i11 == i10) {
            return this.f80421e == mx0Var.f80421e && this.f80422f == mx0Var.f80422f && this.f80423g == mx0Var.f80423g && this.f80424h == mx0Var.f80424h && this.f80430n == mx0Var.f80430n && this.f80433q == mx0Var.f80433q && this.f80434r == mx0Var.f80434r && this.f80435s == mx0Var.f80435s && this.f80437u == mx0Var.f80437u && this.f80440x == mx0Var.f80440x && this.f80442z == mx0Var.f80442z && this.A == mx0Var.A && this.B == mx0Var.B && this.C == mx0Var.C && this.D == mx0Var.D && this.E == mx0Var.E && this.F == mx0Var.F && Float.compare(this.f80436t, mx0Var.f80436t) == 0 && Float.compare(this.f80438v, mx0Var.f80438v) == 0 && ib3.a(this.f80418b, mx0Var.f80418b) && ib3.a(this.f80419c, mx0Var.f80419c) && ib3.a(this.f80426j, mx0Var.f80426j) && ib3.a(this.f80428l, mx0Var.f80428l) && ib3.a(this.f80429m, mx0Var.f80429m) && ib3.a(this.f80420d, mx0Var.f80420d) && Arrays.equals(this.f80439w, mx0Var.f80439w) && ib3.a(this.f80427k, mx0Var.f80427k) && ib3.a(this.f80441y, mx0Var.f80441y) && ib3.a(this.f80432p, mx0Var.f80432p) && a(mx0Var);
        }
        return false;
    }

    public final boolean a(mx0 mx0Var) {
        if (this.f80431o.size() != mx0Var.f80431o.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f80431o.size(); i10++) {
            if (!Arrays.equals((byte[]) this.f80431o.get(i10), (byte[]) mx0Var.f80431o.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (this.G == 0) {
            String str = this.f80418b;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f80419c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f80420d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f80421e) * 31) + this.f80422f) * 31) + this.f80423g) * 31) + this.f80424h) * 31;
            String str4 = this.f80426j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ts1 ts1Var = this.f80427k;
            int iHashCode5 = (iHashCode4 + (ts1Var == null ? 0 : Arrays.hashCode(ts1Var.f83163b))) * 31;
            String str5 = this.f80428l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f80429m;
            this.G = ((((((((((((((((Float.floatToIntBits(this.f80438v) + ((((Float.floatToIntBits(this.f80436t) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f80430n) * 31) + ((int) this.f80433q)) * 31) + this.f80434r) * 31) + this.f80435s) * 31)) * 31) + this.f80437u) * 31)) * 31) + this.f80440x) * 31) + this.f80442z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F;
        }
        return this.G;
    }

    public final String toString() {
        return "Format(" + this.f80418b + ", " + this.f80419c + ", " + this.f80428l + ", " + this.f80429m + ", " + this.f80426j + ", " + this.f80425i + ", " + this.f80420d + ", [" + this.f80434r + ", " + this.f80435s + ", " + this.f80436t + "], [" + this.f80442z + ", " + this.A + "])";
    }

    public mx0(lx0 lx0Var) {
        this.f80418b = lx0Var.f79957a;
        this.f80419c = lx0Var.f79958b;
        this.f80420d = ib3.e(lx0Var.f79959c);
        this.f80421e = lx0Var.f79960d;
        this.f80422f = lx0Var.f79961e;
        int i10 = lx0Var.f79962f;
        this.f80423g = i10;
        int i11 = lx0Var.f79963g;
        this.f80424h = i11;
        this.f80425i = i11 != -1 ? i11 : i10;
        this.f80426j = lx0Var.f79964h;
        this.f80427k = lx0Var.f79965i;
        this.f80428l = lx0Var.f79966j;
        this.f80429m = lx0Var.f79967k;
        this.f80430n = lx0Var.f79968l;
        List list = lx0Var.f79969m;
        this.f80431o = list == null ? Collections.emptyList() : list;
        kk0 kk0Var = lx0Var.f79970n;
        this.f80432p = kk0Var;
        this.f80433q = lx0Var.f79971o;
        this.f80434r = lx0Var.f79972p;
        this.f80435s = lx0Var.f79973q;
        this.f80436t = lx0Var.f79974r;
        int i12 = lx0Var.f79975s;
        this.f80437u = i12 == -1 ? 0 : i12;
        float f10 = lx0Var.f79976t;
        this.f80438v = f10 == -1.0f ? 1.0f : f10;
        this.f80439w = lx0Var.f79977u;
        this.f80440x = lx0Var.f79978v;
        this.f80441y = lx0Var.f79979w;
        this.f80442z = lx0Var.f79980x;
        this.A = lx0Var.f79981y;
        this.B = lx0Var.f79982z;
        int i13 = lx0Var.A;
        this.C = i13 == -1 ? 0 : i13;
        int i14 = lx0Var.B;
        this.D = i14 != -1 ? i14 : 0;
        this.E = lx0Var.C;
        int i15 = lx0Var.D;
        if (i15 == 0 && kk0Var != null) {
            this.F = 1;
        } else {
            this.F = i15;
        }
    }

    public static mx0 a(Bundle bundle) {
        lx0 lx0Var = new lx0();
        if (bundle != null) {
            ClassLoader classLoader = yq.class.getClassLoader();
            int i10 = ib3.f78556a;
            bundle.setClassLoader(classLoader);
        }
        int i11 = 0;
        String string = bundle.getString(Integer.toString(0, 36));
        mx0 mx0Var = H;
        String str = mx0Var.f80418b;
        if (string == null) {
            string = str;
        }
        lx0Var.f79957a = string;
        String string2 = bundle.getString(Integer.toString(1, 36));
        String str2 = mx0Var.f80419c;
        if (string2 == null) {
            string2 = str2;
        }
        lx0Var.f79958b = string2;
        String string3 = bundle.getString(Integer.toString(2, 36));
        String str3 = mx0Var.f80420d;
        if (string3 == null) {
            string3 = str3;
        }
        lx0Var.f79959c = string3;
        lx0Var.f79960d = bundle.getInt(Integer.toString(3, 36), mx0Var.f80421e);
        lx0Var.f79961e = bundle.getInt(Integer.toString(4, 36), mx0Var.f80422f);
        lx0Var.f79962f = bundle.getInt(Integer.toString(5, 36), mx0Var.f80423g);
        lx0Var.f79963g = bundle.getInt(Integer.toString(6, 36), mx0Var.f80424h);
        String string4 = bundle.getString(Integer.toString(7, 36));
        String str4 = mx0Var.f80426j;
        if (string4 == null) {
            string4 = str4;
        }
        lx0Var.f79964h = string4;
        ts1 ts1Var = (ts1) bundle.getParcelable(Integer.toString(8, 36));
        ts1 ts1Var2 = mx0Var.f80427k;
        if (ts1Var == null) {
            ts1Var = ts1Var2;
        }
        lx0Var.f79965i = ts1Var;
        String string5 = bundle.getString(Integer.toString(9, 36));
        String str5 = mx0Var.f80428l;
        if (string5 == null) {
            string5 = str5;
        }
        lx0Var.f79966j = string5;
        String string6 = bundle.getString(Integer.toString(10, 36));
        String str6 = mx0Var.f80429m;
        if (string6 == null) {
            string6 = str6;
        }
        lx0Var.f79967k = string6;
        lx0Var.f79968l = bundle.getInt(Integer.toString(11, 36), mx0Var.f80430n);
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + "_" + Integer.toString(i11, 36));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i11++;
        }
        lx0Var.f79969m = arrayList;
        lx0Var.f79970n = (kk0) bundle.getParcelable(Integer.toString(13, 36));
        String string7 = Integer.toString(14, 36);
        mx0 mx0Var2 = H;
        lx0Var.f79971o = bundle.getLong(string7, mx0Var2.f80433q);
        lx0Var.f79972p = bundle.getInt(Integer.toString(15, 36), mx0Var2.f80434r);
        lx0Var.f79973q = bundle.getInt(Integer.toString(16, 36), mx0Var2.f80435s);
        lx0Var.f79974r = bundle.getFloat(Integer.toString(17, 36), mx0Var2.f80436t);
        lx0Var.f79975s = bundle.getInt(Integer.toString(18, 36), mx0Var2.f80437u);
        lx0Var.f79976t = bundle.getFloat(Integer.toString(19, 36), mx0Var2.f80438v);
        lx0Var.f79977u = bundle.getByteArray(Integer.toString(20, 36));
        lx0Var.f79978v = bundle.getInt(Integer.toString(21, 36), mx0Var2.f80440x);
        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
        if (bundle2 != null) {
            lx0Var.f79979w = (mx) mx.f80412g.fromBundle(bundle2);
        }
        lx0Var.f79980x = bundle.getInt(Integer.toString(23, 36), mx0Var2.f80442z);
        lx0Var.f79981y = bundle.getInt(Integer.toString(24, 36), mx0Var2.A);
        lx0Var.f79982z = bundle.getInt(Integer.toString(25, 36), mx0Var2.B);
        lx0Var.A = bundle.getInt(Integer.toString(26, 36), mx0Var2.C);
        lx0Var.B = bundle.getInt(Integer.toString(27, 36), mx0Var2.D);
        lx0Var.C = bundle.getInt(Integer.toString(28, 36), mx0Var2.E);
        lx0Var.D = bundle.getInt(Integer.toString(29, 36), mx0Var2.F);
        return new mx0(lx0Var);
    }
}
