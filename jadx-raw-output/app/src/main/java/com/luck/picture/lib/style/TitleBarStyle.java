package com.luck.picture.lib.style;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class TitleBarStyle implements Parcelable {
    public static final Parcelable.Creator<TitleBarStyle> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f32392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f32394l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f32395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f32396n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f32397o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f32398p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f32399q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f32400r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f32401s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f32402t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f32403u;

    public class a implements Parcelable.Creator<TitleBarStyle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TitleBarStyle createFromParcel(Parcel parcel) {
            return new TitleBarStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TitleBarStyle[] newArray(int i10) {
            return new TitleBarStyle[i10];
        }
    }

    public TitleBarStyle() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TitleBarStyle(Parcel parcel) {
        this.f32384b = parcel.readByte() != 0;
        this.f32385c = parcel.readInt();
        this.f32386d = parcel.readInt();
        this.f32387e = parcel.readString();
        this.f32388f = parcel.readInt();
        this.f32389g = parcel.readInt();
        this.f32390h = parcel.readInt();
        this.f32391i = parcel.readInt();
        this.f32392j = parcel.readInt();
        this.f32393k = parcel.readInt();
        this.f32394l = parcel.readByte() != 0;
        this.f32395m = parcel.readInt();
        this.f32396n = parcel.readInt();
        this.f32397o = parcel.readByte() != 0;
        this.f32398p = parcel.readInt();
        this.f32399q = parcel.readString();
        this.f32400r = parcel.readInt();
        this.f32401s = parcel.readInt();
        this.f32402t = parcel.readInt();
        this.f32403u = parcel.readByte() != 0;
    }

    public void A(int i10) {
        this.f32385c = i10;
    }

    public void B(int i10) {
        this.f32389g = i10;
    }

    public int c() {
        return this.f32398p;
    }

    public int d() {
        return this.f32391i;
    }

    public int e() {
        return this.f32386d;
    }

    public int f() {
        return this.f32393k;
    }

    public int g() {
        return this.f32390h;
    }

    public int h() {
        return this.f32392j;
    }

    public int i() {
        return this.f32402t;
    }

    public int j() {
        return this.f32396n;
    }

    public String k() {
        return this.f32399q;
    }

    public int l() {
        return this.f32401s;
    }

    public int m() {
        return this.f32400r;
    }

    public String n() {
        return this.f32387e;
    }

    public int o() {
        return this.f32395m;
    }

    public int p() {
        return this.f32385c;
    }

    public int q() {
        return this.f32389g;
    }

    public int r() {
        return this.f32388f;
    }

    public boolean s() {
        return this.f32403u;
    }

    public boolean t() {
        return this.f32397o;
    }

    public boolean u() {
        return this.f32384b;
    }

    public void v(boolean z10) {
        this.f32403u = z10;
    }

    public void w(boolean z10) {
        this.f32397o = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f32384b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f32385c);
        parcel.writeInt(this.f32386d);
        parcel.writeString(this.f32387e);
        parcel.writeInt(this.f32388f);
        parcel.writeInt(this.f32389g);
        parcel.writeInt(this.f32390h);
        parcel.writeInt(this.f32391i);
        parcel.writeInt(this.f32392j);
        parcel.writeInt(this.f32393k);
        parcel.writeByte(this.f32394l ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f32395m);
        parcel.writeInt(this.f32396n);
        parcel.writeByte(this.f32397o ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f32398p);
        parcel.writeString(this.f32399q);
        parcel.writeInt(this.f32400r);
        parcel.writeInt(this.f32401s);
        parcel.writeInt(this.f32402t);
        parcel.writeByte(this.f32403u ? (byte) 1 : (byte) 0);
    }

    public void x(int i10) {
        this.f32390h = i10;
    }

    public void y(int i10) {
        this.f32401s = i10;
    }

    public void z(int i10) {
        this.f32395m = i10;
    }
}
