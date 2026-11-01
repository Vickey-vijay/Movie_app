package com.luck.picture.lib.magical;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class ViewParams implements Parcelable {
    public static final Parcelable.Creator<ViewParams> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32327e;

    public class a implements Parcelable.Creator<ViewParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ViewParams createFromParcel(Parcel parcel) {
            return new ViewParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ViewParams[] newArray(int i10) {
            return new ViewParams[i10];
        }
    }

    public ViewParams() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ViewParams(Parcel parcel) {
        this.f32324b = parcel.readInt();
        this.f32325c = parcel.readInt();
        this.f32326d = parcel.readInt();
        this.f32327e = parcel.readInt();
    }

    public void a(int i10) {
        this.f32327e = i10;
    }

    public void b(int i10) {
        this.f32324b = i10;
    }

    public void c(int i10) {
        this.f32325c = i10;
    }

    public void d(int i10) {
        this.f32326d = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f32324b);
        parcel.writeInt(this.f32325c);
        parcel.writeInt(this.f32326d);
        parcel.writeInt(this.f32327e);
    }
}
