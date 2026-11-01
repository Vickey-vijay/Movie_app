package com.yandex.div.internal.widget.slider;

import android.graphics.Typeface;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import ck.p;

/* JADX INFO: compiled from: SliderTextStyle.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SliderTextStyle {
    private final float fontSize;
    private final String fontVariations;
    private final Typeface fontWeight;
    private final float offsetX;
    private final float offsetY;
    private final float spacing;
    private final int textColor;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderTextStyle)) {
            return false;
        }
        SliderTextStyle sliderTextStyle = (SliderTextStyle) obj;
        return Float.compare(this.fontSize, sliderTextStyle.fontSize) == 0 && Float.compare(this.spacing, sliderTextStyle.spacing) == 0 && p.e(this.fontWeight, sliderTextStyle.fontWeight) && Float.compare(this.offsetX, sliderTextStyle.offsetX) == 0 && Float.compare(this.offsetY, sliderTextStyle.offsetY) == 0 && this.textColor == sliderTextStyle.textColor && p.e(this.fontVariations, sliderTextStyle.fontVariations);
    }

    public int hashCode() {
        int iHashCode = ((((((((((Float.hashCode(this.fontSize) * 31) + Float.hashCode(this.spacing)) * 31) + this.fontWeight.hashCode()) * 31) + Float.hashCode(this.offsetX)) * 31) + Float.hashCode(this.offsetY)) * 31) + Integer.hashCode(this.textColor)) * 31;
        String str = this.fontVariations;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SliderTextStyle(fontSize=" + this.fontSize + ", spacing=" + this.spacing + ", fontWeight=" + this.fontWeight + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", textColor=" + this.textColor + ", fontVariations=" + this.fontVariations + ')';
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final String getFontVariations() {
        return this.fontVariations;
    }

    public final Typeface getFontWeight() {
        return this.fontWeight;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getSpacing() {
        return this.spacing;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public SliderTextStyle(@Px float f10, float f11, Typeface typeface, @Px float f12, @Px float f13, @ColorInt int i10, String str) {
        this.fontSize = f10;
        this.spacing = f11;
        this.fontWeight = typeface;
        this.offsetX = f12;
        this.offsetY = f13;
        this.textColor = i10;
        this.fontVariations = str;
    }
}
