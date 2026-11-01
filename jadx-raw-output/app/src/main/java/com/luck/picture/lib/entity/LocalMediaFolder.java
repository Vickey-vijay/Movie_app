package com.luck.picture.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class LocalMediaFolder implements Parcelable {
    public static final Parcelable.Creator<LocalMediaFolder> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f32285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f32286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f32287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f32290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<LocalMedia> f32291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f32293j;

    public class a implements Parcelable.Creator<LocalMediaFolder> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocalMediaFolder createFromParcel(Parcel parcel) {
            return new LocalMediaFolder(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LocalMediaFolder[] newArray(int i10) {
            return new LocalMediaFolder[i10];
        }
    }

    public LocalMediaFolder() {
        this.f32285b = -1L;
        this.f32291h = new ArrayList<>();
        this.f32292i = 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long c() {
        return this.f32285b;
    }

    public int d() {
        return this.f32292i;
    }

    public ArrayList<LocalMedia> e() {
        ArrayList<LocalMedia> arrayList = this.f32291h;
        return arrayList != null ? arrayList : new ArrayList<>();
    }

    public String f() {
        return this.f32287d;
    }

    public String g() {
        return this.f32288e;
    }

    public String h() {
        return TextUtils.isEmpty(this.f32286c) ? "unknown" : this.f32286c;
    }

    public int i() {
        return this.f32289f;
    }

    public boolean j() {
        return this.f32293j;
    }

    public boolean k() {
        return this.f32290g;
    }

    public void l(long j10) {
        this.f32285b = j10;
    }

    public void m(int i10) {
        this.f32292i = i10;
    }

    public void n(ArrayList<LocalMedia> arrayList) {
        this.f32291h = arrayList;
    }

    public void o(String str) {
        this.f32287d = str;
    }

    public void p(String str) {
        this.f32288e = str;
    }

    public void q(String str) {
        this.f32286c = str;
    }

    public void r(int i10) {
        this.f32289f = i10;
    }

    public void s(boolean z10) {
        this.f32293j = z10;
    }

    public void t(boolean z10) {
        this.f32290g = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f32285b);
        parcel.writeString(this.f32286c);
        parcel.writeString(this.f32287d);
        parcel.writeString(this.f32288e);
        parcel.writeInt(this.f32289f);
        parcel.writeByte(this.f32290g ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.f32291h);
        parcel.writeInt(this.f32292i);
        parcel.writeByte(this.f32293j ? (byte) 1 : (byte) 0);
    }

    public LocalMediaFolder(Parcel parcel) {
        this.f32285b = -1L;
        this.f32291h = new ArrayList<>();
        this.f32292i = 1;
        this.f32285b = parcel.readLong();
        this.f32286c = parcel.readString();
        this.f32287d = parcel.readString();
        this.f32288e = parcel.readString();
        this.f32289f = parcel.readInt();
        this.f32290g = parcel.readByte() != 0;
        this.f32291h = parcel.createTypedArrayList(LocalMedia.CREATOR);
        this.f32292i = parcel.readInt();
        this.f32293j = parcel.readByte() != 0;
    }
}
