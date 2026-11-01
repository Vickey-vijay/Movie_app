package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import ck.i;
import ck.p;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import yads.a52;
import yads.qm;

/* JADX INFO: loaded from: classes9.dex */
public final class BannerAppearance implements Parcelable, a52 {
    public static final Parcelable.Creator<BannerAppearance> CREATOR = new qm();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HorizontalOffset f51085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HorizontalOffset f51086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f51087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f51088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f51089f;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f51090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f51091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f51092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private HorizontalOffset f51093d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private HorizontalOffset f51094e;

        public final BannerAppearance build() {
            return new BannerAppearance(this.f51093d, this.f51094e, this.f51090a, this.f51091b, this.f51092c, null);
        }

        public final Builder setBackgroundColor(int i10) {
            this.f51090a = i10;
            return this;
        }

        public final Builder setBorderColor(int i10) {
            this.f51091b = i10;
            return this;
        }

        public final Builder setBorderWidth(float f10) {
            this.f51092c = f10;
            return this;
        }

        public final Builder setContentPadding(HorizontalOffset horizontalOffset) {
            this.f51093d = horizontalOffset;
            return this;
        }

        public final Builder setImageMargins(HorizontalOffset horizontalOffset) {
            this.f51094e = horizontalOffset;
            return this;
        }
    }

    public /* synthetic */ BannerAppearance(HorizontalOffset horizontalOffset, HorizontalOffset horizontalOffset2, int i10, int i11, float f10, i iVar) {
        this(horizontalOffset, horizontalOffset2, i10, i11, f10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(BannerAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance");
        BannerAppearance bannerAppearance = (BannerAppearance) obj;
        return p.e(getContentPadding(), bannerAppearance.getContentPadding()) && p.e(getImageMargins(), bannerAppearance.getImageMargins()) && getBackgroundColor() == bannerAppearance.getBackgroundColor() && getBorderColor() == bannerAppearance.getBorderColor() && getBorderWidth() == bannerAppearance.getBorderWidth();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        HorizontalOffset horizontalOffset = this.f51085b;
        if (horizontalOffset == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            horizontalOffset.writeToParcel(parcel, i10);
        }
        HorizontalOffset horizontalOffset2 = this.f51086c;
        if (horizontalOffset2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            horizontalOffset2.writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f51087d);
        parcel.writeInt(this.f51088e);
        parcel.writeFloat(this.f51089f);
    }

    private BannerAppearance(HorizontalOffset horizontalOffset, HorizontalOffset horizontalOffset2, int i10, int i11, float f10) {
        this.f51085b = horizontalOffset;
        this.f51086c = horizontalOffset2;
        this.f51087d = i10;
        this.f51088e = i11;
        this.f51089f = f10;
    }

    @Override // yads.a52
    public int getBackgroundColor() {
        return this.f51087d;
    }

    @Override // yads.a52
    public int getBorderColor() {
        return this.f51088e;
    }

    @Override // yads.a52
    public float getBorderWidth() {
        return this.f51089f;
    }

    @Override // yads.a52
    public HorizontalOffset getContentPadding() {
        return this.f51085b;
    }

    @Override // yads.a52
    public HorizontalOffset getImageMargins() {
        return this.f51086c;
    }

    public int hashCode() {
        int iHashCode;
        HorizontalOffset contentPadding = getContentPadding();
        int iHashCode2 = 0;
        if (contentPadding != null) {
            iHashCode = contentPadding.hashCode();
        } else {
            iHashCode = 0;
        }
        int i10 = iHashCode * 31;
        HorizontalOffset imageMargins = getImageMargins();
        if (imageMargins != null) {
            iHashCode2 = imageMargins.hashCode();
        }
        return Float.hashCode(getBorderWidth()) + ((getBorderColor() + ((getBackgroundColor() + ((i10 + iHashCode2) * 31)) * 31)) * 31);
    }
}
