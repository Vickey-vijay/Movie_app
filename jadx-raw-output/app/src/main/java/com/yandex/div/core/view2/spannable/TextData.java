package com.yandex.div.core.view2.spannable;

import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import ck.p;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;

/* JADX INFO: compiled from: TextData.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TextData {
    private final String fontFamily;
    private final int fontSize;
    private final DivSizeUnit fontSizeUnit;
    private final int fontSizeValue;
    private final DivFontWeight fontWeight;
    private final Integer fontWeightValue;
    private final Integer lineHeight;
    private final String text;
    private final int textColor;
    private final int textLength;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextData)) {
            return false;
        }
        TextData textData = (TextData) obj;
        return p.e(this.text, textData.text) && this.fontSize == textData.fontSize && this.fontSizeValue == textData.fontSizeValue && this.fontSizeUnit == textData.fontSizeUnit && p.e(this.fontFamily, textData.fontFamily) && this.fontWeight == textData.fontWeight && p.e(this.fontWeightValue, textData.fontWeightValue) && p.e(this.lineHeight, textData.lineHeight) && this.textColor == textData.textColor;
    }

    public int hashCode() {
        int iHashCode = ((((((this.text.hashCode() * 31) + Integer.hashCode(this.fontSize)) * 31) + Integer.hashCode(this.fontSizeValue)) * 31) + this.fontSizeUnit.hashCode()) * 31;
        String str = this.fontFamily;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DivFontWeight divFontWeight = this.fontWeight;
        int iHashCode3 = (iHashCode2 + (divFontWeight == null ? 0 : divFontWeight.hashCode())) * 31;
        Integer num = this.fontWeightValue;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lineHeight;
        return ((iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31) + Integer.hashCode(this.textColor);
    }

    public String toString() {
        return "TextData(text=" + this.text + ", fontSize=" + this.fontSize + ", fontSizeValue=" + this.fontSizeValue + ", fontSizeUnit=" + this.fontSizeUnit + ", fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontWeightValue=" + this.fontWeightValue + ", lineHeight=" + this.lineHeight + ", textColor=" + this.textColor + ')';
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final int getFontSizeValue() {
        return this.fontSizeValue;
    }

    public final DivFontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final Integer getFontWeightValue() {
        return this.fontWeightValue;
    }

    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextLength() {
        return this.textLength;
    }

    public TextData(String str, @Px int i10, int i11, DivSizeUnit divSizeUnit, String str2, DivFontWeight divFontWeight, Integer num, @Px Integer num2, @ColorInt int i12) {
        this.text = str;
        this.fontSize = i10;
        this.fontSizeValue = i11;
        this.fontSizeUnit = divSizeUnit;
        this.fontFamily = str2;
        this.fontWeight = divFontWeight;
        this.fontWeightValue = num;
        this.lineHeight = num2;
        this.textColor = i12;
        this.textLength = str.length();
    }
}
