package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import ck.i;
import ck.p;
import yads.b52;
import yads.dr;

/* JADX INFO: loaded from: classes6.dex */
public final class ButtonAppearance implements Parcelable, b52 {
    public static final Parcelable.Creator<ButtonAppearance> CREATOR = new dr();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextAppearance f51095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f51097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f51098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f51099f;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f51100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f51101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f51103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private TextAppearance f51104e;

        public final ButtonAppearance build() {
            return new ButtonAppearance(this.f51104e, this.f51100a, this.f51101b, this.f51102c, this.f51103d, null);
        }

        public final Builder setBorderColor(int i10) {
            this.f51100a = i10;
            return this;
        }

        public final Builder setBorderWidth(float f10) {
            this.f51101b = f10;
            return this;
        }

        public final Builder setNormalColor(int i10) {
            this.f51102c = i10;
            return this;
        }

        public final Builder setPressedColor(int i10) {
            this.f51103d = i10;
            return this;
        }

        public final Builder setTextAppearance(TextAppearance textAppearance) {
            this.f51104e = textAppearance;
            return this;
        }
    }

    public /* synthetic */ ButtonAppearance(TextAppearance textAppearance, int i10, float f10, int i11, int i12, i iVar) {
        this(textAppearance, i10, f10, i11, i12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(ButtonAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance");
        ButtonAppearance buttonAppearance = (ButtonAppearance) obj;
        return p.e(getTextAppearance(), buttonAppearance.getTextAppearance()) && getBorderColor() == buttonAppearance.getBorderColor() && getBorderWidth() == buttonAppearance.getBorderWidth() && getNormalColor() == buttonAppearance.getNormalColor() && getPressedColor() == buttonAppearance.getPressedColor();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        TextAppearance textAppearance = this.f51095b;
        if (textAppearance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textAppearance.writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f51096c);
        parcel.writeFloat(this.f51097d);
        parcel.writeInt(this.f51098e);
        parcel.writeInt(this.f51099f);
    }

    private ButtonAppearance(TextAppearance textAppearance, int i10, float f10, int i11, int i12) {
        this.f51095b = textAppearance;
        this.f51096c = i10;
        this.f51097d = f10;
        this.f51098e = i11;
        this.f51099f = i12;
    }

    @Override // yads.b52
    public int getBorderColor() {
        return this.f51096c;
    }

    @Override // yads.b52
    public float getBorderWidth() {
        return this.f51097d;
    }

    @Override // yads.b52
    public int getNormalColor() {
        return this.f51098e;
    }

    @Override // yads.b52
    public int getPressedColor() {
        return this.f51099f;
    }

    @Override // yads.b52
    public TextAppearance getTextAppearance() {
        return this.f51095b;
    }

    public int hashCode() {
        int iHashCode;
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            iHashCode = textAppearance.hashCode();
        } else {
            iHashCode = 0;
        }
        return getPressedColor() + ((getNormalColor() + ((Float.hashCode(getBorderWidth()) + ((getBorderColor() + (iHashCode * 31)) * 31)) * 31)) * 31);
    }
}
