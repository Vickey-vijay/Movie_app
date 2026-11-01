package com.luck.picture.lib.entity;

import a8.d;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.File;
import k8.b;
import o8.j;
import o8.k;

/* JADX INFO: loaded from: classes8.dex */
public class LocalMedia implements Parcelable {
    public static final Parcelable.Creator<LocalMedia> CREATOR = new a();
    public static b<LocalMedia> K;
    public boolean A;
    public String B;
    public String C;
    public long D;
    public long E;
    public String F;
    public boolean G;
    public boolean H;
    public boolean I;
    public LocalMedia J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f32260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f32261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f32262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f32264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f32265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f32266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f32267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f32268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f32269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f32270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f32271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f32272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f32273o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f32274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f32275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f32276r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f32277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f32278t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f32279u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f32280v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f32281w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f32282x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f32283y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f32284z;

    public class a implements Parcelable.Creator<LocalMedia> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocalMedia createFromParcel(Parcel parcel) {
            return new LocalMedia(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LocalMedia[] newArray(int i10) {
            return new LocalMedia[i10];
        }
    }

    public LocalMedia() {
        this.D = -1L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMedia)) {
            return false;
        }
        LocalMedia localMedia = (LocalMedia) obj;
        if (!TextUtils.equals(w(), localMedia.w()) && !TextUtils.equals(y(), localMedia.y()) && r() != localMedia.r()) {
            z10 = false;
        }
        if (!z10) {
            localMedia = null;
        }
        this.J = localMedia;
        return z10;
    }

    public static LocalMedia N() {
        if (K == null) {
            K = new b<>();
        }
        LocalMedia localMediaA = K.a();
        return localMediaA == null ? c() : localMediaA;
    }

    public static LocalMedia c() {
        return new LocalMedia();
    }

    public static void d() {
        b<LocalMedia> bVar = K;
        if (bVar != null) {
            bVar.b();
            K = null;
        }
    }

    public long A() {
        return this.f32284z;
    }

    public String B() {
        return this.f32267i;
    }

    public String C() {
        return this.f32266h;
    }

    public int D() {
        return this.f32277s;
    }

    public boolean E() {
        return this.f32270l;
    }

    public boolean F() {
        return this.f32276r && !TextUtils.isEmpty(i());
    }

    public boolean G() {
        return this.f32271m && !TextUtils.isEmpty(m());
    }

    public boolean H() {
        return this.I && !TextUtils.isEmpty(m());
    }

    public boolean I() {
        return this.H;
    }

    public boolean J() {
        return this.G;
    }

    public boolean K() {
        return this.A && !TextUtils.isEmpty(u());
    }

    public void O() {
        b<LocalMedia> bVar = K;
        if (bVar != null) {
            bVar.d(this);
        }
    }

    public void P(long j10) {
        this.D = j10;
    }

    public void Q(boolean z10) {
        this.f32270l = z10;
    }

    public void R(int i10) {
        this.f32275q = i10;
    }

    public void S(String str) {
        this.f32264f = str;
    }

    public void T(boolean z10) {
        this.f32276r = z10;
    }

    public void U(int i10) {
        this.f32280v = i10;
    }

    public void V(int i10) {
        this.f32279u = i10;
    }

    public void W(int i10) {
        this.f32281w = i10;
    }

    public void X(int i10) {
        this.f32282x = i10;
    }

    public void Y(float f10) {
        this.f32283y = f10;
    }

    public void Z(String str) {
        this.F = str;
    }

    public void a0(boolean z10) {
        this.f32271m = z10;
    }

    public void b0(String str) {
        this.f32265g = str;
    }

    public void c0(long j10) {
        this.E = j10;
    }

    public void d0(long j10) {
        this.f32269k = j10;
    }

    public void e0(boolean z10) {
        this.I = z10;
    }

    public void f0(String str) {
        this.B = str;
    }

    public long g() {
        return this.D;
    }

    public void g0(boolean z10) {
        this.H = z10;
    }

    public LocalMedia h() {
        return this.J;
    }

    public void h0(int i10) {
        this.f32278t = i10;
    }

    public String i() {
        return this.f32264f;
    }

    public void i0(long j10) {
        this.f32260b = j10;
    }

    public int j() {
        return this.f32280v;
    }

    public void j0(boolean z10) {
        this.G = z10;
    }

    public int k() {
        return this.f32279u;
    }

    public void k0(String str) {
        this.f32274p = str;
    }

    public String l() {
        return this.F;
    }

    public void l0(int i10) {
        this.f32273o = i10;
    }

    public String m() {
        return this.f32265g;
    }

    public void m0(boolean z10) {
        this.A = z10;
    }

    public long n() {
        return this.E;
    }

    public void n0(String str) {
        this.f32263e = str;
    }

    public long o() {
        return this.f32269k;
    }

    public void o0(String str) {
        this.C = str;
    }

    public String p() {
        return this.B;
    }

    public void p0(String str) {
        this.f32261c = str;
    }

    public int q() {
        return this.f32278t;
    }

    public void q0(int i10) {
        this.f32272n = i10;
    }

    public long r() {
        return this.f32260b;
    }

    public void r0(String str) {
        this.f32262d = str;
    }

    public String s() {
        return this.f32274p;
    }

    public void s0(String str) {
        this.f32268j = str;
    }

    public int t() {
        return this.f32273o;
    }

    public void t0(long j10) {
        this.f32284z = j10;
    }

    public String u() {
        return this.f32263e;
    }

    public void u0(String str) {
        this.f32267i = str;
    }

    public String v() {
        return this.C;
    }

    public void v0(String str) {
        this.f32266h = str;
    }

    public String w() {
        return this.f32261c;
    }

    public void w0(int i10) {
        this.f32277s = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f32260b);
        parcel.writeString(this.f32261c);
        parcel.writeString(this.f32262d);
        parcel.writeString(this.f32263e);
        parcel.writeString(this.f32264f);
        parcel.writeString(this.f32265g);
        parcel.writeString(this.f32266h);
        parcel.writeString(this.f32267i);
        parcel.writeString(this.f32268j);
        parcel.writeLong(this.f32269k);
        parcel.writeByte(this.f32270l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f32271m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f32272n);
        parcel.writeInt(this.f32273o);
        parcel.writeString(this.f32274p);
        parcel.writeInt(this.f32275q);
        parcel.writeByte(this.f32276r ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f32277s);
        parcel.writeInt(this.f32278t);
        parcel.writeInt(this.f32279u);
        parcel.writeInt(this.f32280v);
        parcel.writeInt(this.f32281w);
        parcel.writeInt(this.f32282x);
        parcel.writeFloat(this.f32283y);
        parcel.writeLong(this.f32284z);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeString(this.F);
        parcel.writeByte(this.G ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.H ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.I ? (byte) 1 : (byte) 0);
    }

    public int x() {
        return this.f32272n;
    }

    public String y() {
        return this.f32262d;
    }

    public String z() {
        return this.f32268j;
    }

    public LocalMedia(Parcel parcel) {
        this.D = -1L;
        this.f32260b = parcel.readLong();
        this.f32261c = parcel.readString();
        this.f32262d = parcel.readString();
        this.f32263e = parcel.readString();
        this.f32264f = parcel.readString();
        this.f32265g = parcel.readString();
        this.f32266h = parcel.readString();
        this.f32267i = parcel.readString();
        this.f32268j = parcel.readString();
        this.f32269k = parcel.readLong();
        this.f32270l = parcel.readByte() != 0;
        this.f32271m = parcel.readByte() != 0;
        this.f32272n = parcel.readInt();
        this.f32273o = parcel.readInt();
        this.f32274p = parcel.readString();
        this.f32275q = parcel.readInt();
        this.f32276r = parcel.readByte() != 0;
        this.f32277s = parcel.readInt();
        this.f32278t = parcel.readInt();
        this.f32279u = parcel.readInt();
        this.f32280v = parcel.readInt();
        this.f32281w = parcel.readInt();
        this.f32282x = parcel.readInt();
        this.f32283y = parcel.readFloat();
        this.f32284z = parcel.readLong();
        this.A = parcel.readByte() != 0;
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readLong();
        this.E = parcel.readLong();
        this.F = parcel.readString();
        this.G = parcel.readByte() != 0;
        this.H = parcel.readByte() != 0;
        this.I = parcel.readByte() != 0;
    }

    public static LocalMedia e(Context context, String str) {
        File file;
        long jLongValue;
        LocalMedia localMediaC = c();
        if (d.c(str)) {
            file = new File(k.h(context, Uri.parse(str)));
        } else {
            file = new File(str);
        }
        localMediaC.p0(str);
        localMediaC.r0(file.getAbsolutePath());
        localMediaC.f0(file.getName());
        localMediaC.o0(j.c(file.getAbsolutePath()));
        localMediaC.k0(j.i(file.getAbsolutePath()));
        localMediaC.t0(file.length());
        localMediaC.c0(file.lastModified() / 1000);
        String absolutePath = file.getAbsolutePath();
        long jHashCode = 0;
        if (!absolutePath.contains("Android/data/") && !absolutePath.contains("data/user/")) {
            Long[] lArrJ = j.j(context, localMediaC.y());
            if (lArrJ[0].longValue() == 0) {
                jLongValue = System.currentTimeMillis();
            } else {
                jLongValue = lArrJ[0].longValue();
            }
            localMediaC.i0(jLongValue);
            localMediaC.P(lArrJ[1].longValue());
        } else {
            localMediaC.i0(System.currentTimeMillis());
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                jHashCode = parentFile.getName().hashCode();
            }
            localMediaC.P(jHashCode);
        }
        if (d.i(localMediaC.s())) {
            d8.b bVarL = j.l(context, str);
            localMediaC.w0(bVarL.c());
            localMediaC.h0(bVarL.b());
            localMediaC.d0(bVarL.a());
        } else if (d.d(localMediaC.s())) {
            localMediaC.d0(j.d(context, str).a());
        } else {
            d8.b bVarF = j.f(context, str);
            localMediaC.w0(bVarF.c());
            localMediaC.h0(bVarF.b());
        }
        return localMediaC;
    }

    public boolean L() {
        return !TextUtils.isEmpty(z());
    }

    public boolean M() {
        return !TextUtils.isEmpty(C());
    }

    public String f() {
        String strW = w();
        if (G()) {
            strW = m();
        }
        if (F()) {
            strW = i();
        }
        if (L()) {
            strW = z();
        }
        if (K()) {
            strW = u();
        }
        if (M()) {
            return C();
        }
        return strW;
    }
}
