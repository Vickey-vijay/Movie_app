package com.yalantis.ucrop.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class AspectRatio implements Parcelable {
    public static final Parcelable.Creator<AspectRatio> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f45664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f45665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f45666d;

    public class a implements Parcelable.Creator<AspectRatio> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AspectRatio createFromParcel(Parcel parcel) {
            return new AspectRatio(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AspectRatio[] newArray(int i10) {
            return new AspectRatio[i10];
        }
    }

    public AspectRatio(@Nullable String str, float f10, float f11) {
        this.f45664b = str;
        this.f45665c = f10;
        this.f45666d = f11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public String c() {
        return this.f45664b;
    }

    public float d() {
        return this.f45665c;
    }

    public float e() {
        return this.f45666d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45664b);
        parcel.writeFloat(this.f45665c);
        parcel.writeFloat(this.f45666d);
    }

    public AspectRatio(Parcel parcel) {
        this.f45664b = parcel.readString();
        this.f45665c = parcel.readFloat();
        this.f45666d = parcel.readFloat();
    }
}
