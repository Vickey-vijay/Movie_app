package com.luck.picture.lib.style;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class BottomNavBarStyle implements Parcelable {
    public static final Parcelable.Creator<BottomNavBarStyle> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f32342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f32344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f32346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f32347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f32348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f32349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f32350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f32351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f32352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f32353s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f32354t;

    public class a implements Parcelable.Creator<BottomNavBarStyle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BottomNavBarStyle createFromParcel(Parcel parcel) {
            return new BottomNavBarStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BottomNavBarStyle[] newArray(int i10) {
            return new BottomNavBarStyle[i10];
        }
    }

    public BottomNavBarStyle() {
        this.f32354t = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void A(boolean z10) {
        this.f32354t = z10;
    }

    public String c() {
        return this.f32344j;
    }

    public int d() {
        return this.f32346l;
    }

    public int e() {
        return this.f32345k;
    }

    public int f() {
        return this.f32336b;
    }

    public int g() {
        return this.f32338d;
    }

    public int h() {
        return this.f32347m;
    }

    public String i() {
        return this.f32348n;
    }

    public int j() {
        return this.f32350p;
    }

    public int k() {
        return this.f32349o;
    }

    public int l() {
        return this.f32337c;
    }

    public String m() {
        return this.f32339e;
    }

    public int n() {
        return this.f32341g;
    }

    public int o() {
        return this.f32340f;
    }

    public String p() {
        return this.f32342h;
    }

    public int q() {
        return this.f32343i;
    }

    public int r() {
        return this.f32351q;
    }

    public int s() {
        return this.f32353s;
    }

    public int t() {
        return this.f32352r;
    }

    public boolean u() {
        return this.f32354t;
    }

    public void v(int i10) {
        this.f32346l = i10;
    }

    public void w(int i10) {
        this.f32336b = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f32336b);
        parcel.writeInt(this.f32337c);
        parcel.writeInt(this.f32338d);
        parcel.writeString(this.f32339e);
        parcel.writeInt(this.f32340f);
        parcel.writeInt(this.f32341g);
        parcel.writeString(this.f32342h);
        parcel.writeInt(this.f32343i);
        parcel.writeString(this.f32344j);
        parcel.writeInt(this.f32345k);
        parcel.writeInt(this.f32346l);
        parcel.writeInt(this.f32347m);
        parcel.writeString(this.f32348n);
        parcel.writeInt(this.f32349o);
        parcel.writeInt(this.f32350p);
        parcel.writeInt(this.f32351q);
        parcel.writeInt(this.f32352r);
        parcel.writeInt(this.f32353s);
        parcel.writeByte(this.f32354t ? (byte) 1 : (byte) 0);
    }

    public void x(int i10) {
        this.f32350p = i10;
    }

    public void y(int i10) {
        this.f32341g = i10;
    }

    public void z(int i10) {
        this.f32343i = i10;
    }

    public BottomNavBarStyle(Parcel parcel) {
        this.f32354t = true;
        this.f32336b = parcel.readInt();
        this.f32337c = parcel.readInt();
        this.f32338d = parcel.readInt();
        this.f32339e = parcel.readString();
        this.f32340f = parcel.readInt();
        this.f32341g = parcel.readInt();
        this.f32342h = parcel.readString();
        this.f32343i = parcel.readInt();
        this.f32344j = parcel.readString();
        this.f32345k = parcel.readInt();
        this.f32346l = parcel.readInt();
        this.f32347m = parcel.readInt();
        this.f32348n = parcel.readString();
        this.f32349o = parcel.readInt();
        this.f32350p = parcel.readInt();
        this.f32351q = parcel.readInt();
        this.f32352r = parcel.readInt();
        this.f32353s = parcel.readInt();
        this.f32354t = parcel.readByte() != 0;
    }
}
