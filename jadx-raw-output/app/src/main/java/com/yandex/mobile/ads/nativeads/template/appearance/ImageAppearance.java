package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import ck.i;
import ck.p;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import yads.d52;
import yads.g31;

/* JADX INFO: loaded from: classes9.dex */
public final class ImageAppearance implements Parcelable, d52 {
    public static final Parcelable.Creator<ImageAppearance> CREATOR = new g31();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SizeConstraint f51105b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SizeConstraint f51106a;

        public final ImageAppearance build() {
            return new ImageAppearance(this.f51106a, null);
        }

        public final Builder setWidthConstraint(SizeConstraint sizeConstraint) {
            this.f51106a = sizeConstraint;
            return this;
        }
    }

    public /* synthetic */ ImageAppearance(SizeConstraint sizeConstraint, i iVar) {
        this(sizeConstraint);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        SizeConstraint sizeConstraint = this.f51105b;
        if (sizeConstraint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sizeConstraint.writeToParcel(parcel, i10);
        }
    }

    private ImageAppearance(SizeConstraint sizeConstraint) {
        this.f51105b = sizeConstraint;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(ImageAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance");
        return p.e(getWidthConstraint(), ((ImageAppearance) obj).getWidthConstraint());
    }

    @Override // yads.d52
    public SizeConstraint getWidthConstraint() {
        return this.f51105b;
    }

    public int hashCode() {
        SizeConstraint widthConstraint = getWidthConstraint();
        if (widthConstraint != null) {
            return widthConstraint.hashCode();
        }
        return 0;
    }
}
