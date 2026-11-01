package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import ck.i;
import ck.p;
import yads.i52;
import yads.r53;

/* JADX INFO: loaded from: classes10.dex */
public final class TextAppearance implements Parcelable, i52 {
    public static final Parcelable.Creator<TextAppearance> CREATOR = new r53();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f51140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f51141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f51142e;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f51143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f51144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f51146d;

        public final TextAppearance build() {
            return new TextAppearance(this.f51143a, this.f51144b, this.f51145c, this.f51146d, null);
        }

        public final Builder setFontFamilyName(String str) {
            this.f51146d = str;
            return this;
        }

        public final Builder setFontStyle(int i10) {
            this.f51145c = i10;
            return this;
        }

        public final Builder setTextColor(int i10) {
            this.f51143a = i10;
            return this;
        }

        public final Builder setTextSize(float f10) {
            this.f51144b = f10;
            return this;
        }
    }

    public /* synthetic */ TextAppearance(int i10, float f10, int i11, String str, i iVar) {
        this(i10, f10, i11, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f51139b);
        parcel.writeFloat(this.f51140c);
        parcel.writeInt(this.f51141d);
        parcel.writeString(this.f51142e);
    }

    private TextAppearance(int i10, float f10, int i11, String str) {
        this.f51139b = i10;
        this.f51140c = f10;
        this.f51141d = i11;
        this.f51142e = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(TextAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance");
        TextAppearance textAppearance = (TextAppearance) obj;
        if (getTextColor() == textAppearance.getTextColor() && getTextSize() == textAppearance.getTextSize() && getFontStyle() == textAppearance.getFontStyle()) {
            return p.e(getFontFamilyName(), textAppearance.getFontFamilyName());
        }
        return false;
    }

    @Override // yads.i52
    public String getFontFamilyName() {
        return this.f51142e;
    }

    @Override // yads.i52
    public int getFontStyle() {
        return this.f51141d;
    }

    @Override // yads.i52
    public int getTextColor() {
        return this.f51139b;
    }

    @Override // yads.i52
    public float getTextSize() {
        return this.f51140c;
    }

    public int hashCode() {
        int iHashCode;
        int fontStyle = (getFontStyle() + ((Float.hashCode(getTextSize()) + (getTextColor() * 31)) * 31)) * 31;
        String fontFamilyName = getFontFamilyName();
        if (fontFamilyName != null) {
            iHashCode = fontFamilyName.hashCode();
        } else {
            iHashCode = 0;
        }
        return fontStyle + iHashCode;
    }
}
