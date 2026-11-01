package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import ck.p;
import yads.b11;
import yads.c52;

/* JADX INFO: loaded from: classes11.dex */
public final class HorizontalOffset implements c52, Parcelable {
    public static final Parcelable.Creator<HorizontalOffset> CREATOR = new b11();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f51079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f51080c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(HorizontalOffset.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.HorizontalOffset");
        HorizontalOffset horizontalOffset = (HorizontalOffset) obj;
        return getLeft() == horizontalOffset.getLeft() && getRight() == horizontalOffset.getRight();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f51079b);
        parcel.writeFloat(this.f51080c);
    }

    @Override // yads.c52
    public float getLeft() {
        return this.f51079b;
    }

    @Override // yads.c52
    public float getRight() {
        return this.f51080c;
    }

    public HorizontalOffset(float f10, float f11) {
        this.f51079b = f10;
        this.f51080c = f11;
    }

    public int hashCode() {
        return Float.hashCode(getRight()) + (Float.hashCode(getLeft()) * 31);
    }

    public String toString() {
        return getLeft() + ", " + getRight();
    }
}
