package com.luck.picture.lib.style;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.AnimRes;
import com.luck.picture.lib.R$anim;

/* JADX INFO: loaded from: classes10.dex */
public class PictureWindowAnimationStyle implements Parcelable {
    public static final Parcelable.Creator<PictureWindowAnimationStyle> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @AnimRes
    public int f32355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @AnimRes
    public int f32356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @AnimRes
    public int f32357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @AnimRes
    public int f32358e;

    public class a implements Parcelable.Creator<PictureWindowAnimationStyle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PictureWindowAnimationStyle createFromParcel(Parcel parcel) {
            return new PictureWindowAnimationStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PictureWindowAnimationStyle[] newArray(int i10) {
            return new PictureWindowAnimationStyle[i10];
        }
    }

    public PictureWindowAnimationStyle() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PictureWindowAnimationStyle(@AnimRes int i10, @AnimRes int i11) {
        this.f32355b = i10;
        this.f32356c = i11;
        this.f32357d = i10;
        this.f32358e = i11;
    }

    public static PictureWindowAnimationStyle c() {
        return new PictureWindowAnimationStyle(R$anim.ps_anim_enter, R$anim.ps_anim_exit);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f32355b);
        parcel.writeInt(this.f32356c);
        parcel.writeInt(this.f32357d);
        parcel.writeInt(this.f32358e);
    }

    public PictureWindowAnimationStyle(Parcel parcel) {
        this.f32355b = parcel.readInt();
        this.f32356c = parcel.readInt();
        this.f32357d = parcel.readInt();
        this.f32358e = parcel.readInt();
    }
}
