package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import ck.i;
import ck.p;
import yads.e52;
import yads.sl2;

/* JADX INFO: loaded from: classes4.dex */
public final class RatingAppearance implements Parcelable, e52 {
    public static final Parcelable.Creator<RatingAppearance> CREATOR = new sl2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51136c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f51137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f51138b;

        public final RatingAppearance build() {
            return new RatingAppearance(this.f51137a, this.f51138b, null);
        }

        public final Builder setBackgroundStarColor(int i10) {
            this.f51137a = i10;
            return this;
        }

        public final Builder setProgressStarColor(int i10) {
            this.f51138b = i10;
            return this;
        }
    }

    public /* synthetic */ RatingAppearance(int i10, int i11, i iVar) {
        this(i10, i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(RatingAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance");
        RatingAppearance ratingAppearance = (RatingAppearance) obj;
        return getBackgroundStarColor() == ratingAppearance.getBackgroundStarColor() && getProgressStarColor() == ratingAppearance.getProgressStarColor();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f51135b);
        parcel.writeInt(this.f51136c);
    }

    private RatingAppearance(int i10, int i11) {
        this.f51135b = i10;
        this.f51136c = i11;
    }

    @Override // yads.e52
    public int getBackgroundStarColor() {
        return this.f51135b;
    }

    @Override // yads.e52
    public int getProgressStarColor() {
        return this.f51136c;
    }

    public int hashCode() {
        return getProgressStarColor() + (getBackgroundStarColor() * 31);
    }
}
