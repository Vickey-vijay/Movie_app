package com.yandex.div.core.view2.spannable;

import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import ck.i;
import ck.p;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTextAlignmentVertical;
import org.json.JSONObject;

/* JADX INFO: compiled from: SpanData.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class SpanData implements Comparable<SpanData> {
    public static final Companion Companion = new Companion(null);
    private static final DivSizeUnit DEFAULT_FONT_SIZE_UNIT = DivSizeUnit.SP;
    private final DivTextAlignmentVertical alignmentVertical;
    private final int baselineOffset;
    private final int end;
    private final String fontFamily;
    private final String fontFeatureSettings;
    private final Integer fontSize;
    private final DivSizeUnit fontSizeUnit;
    private final JSONObject fontVariationSettings;
    private final DivFontWeight fontWeight;
    private final Integer fontWeightValue;
    private final Double letterSpacing;
    private final Integer lineHeight;
    private final MaskData mask;
    private final int start;
    private final DivLineStyle strike;
    private final Integer textColor;
    private final ShadowData textShadow;
    private final Integer topOffset;
    private final Integer topOffsetEnd;
    private final Integer topOffsetStart;
    private final DivLineStyle underline;

    /* JADX INFO: compiled from: SpanData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final SpanData empty$div_release(int i10, int i11) {
            return new SpanData(i10, i11, null, 0, null, null, null, SpanData.DEFAULT_FONT_SIZE_UNIT, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }

        public final SpanData lineHeight$div_release(int i10, int i11, int i12) {
            return new SpanData(i10, i11, null, 0, null, null, null, SpanData.DEFAULT_FONT_SIZE_UNIT, null, null, null, null, Integer.valueOf(i12), null, null, null, null, null, null, null, null);
        }
    }

    public SpanData(int i10, int i11, DivTextAlignmentVertical divTextAlignmentVertical, @Px int i12, String str, String str2, @Px Integer num, DivSizeUnit divSizeUnit, DivFontWeight divFontWeight, Integer num2, JSONObject jSONObject, Double d10, @Px Integer num3, MaskData maskData, DivLineStyle divLineStyle, @ColorInt Integer num4, ShadowData shadowData, @Px Integer num5, Integer num6, Integer num7, DivLineStyle divLineStyle2) {
        this.start = i10;
        this.end = i11;
        this.alignmentVertical = divTextAlignmentVertical;
        this.baselineOffset = i12;
        this.fontFamily = str;
        this.fontFeatureSettings = str2;
        this.fontSize = num;
        this.fontSizeUnit = divSizeUnit;
        this.fontWeight = divFontWeight;
        this.fontWeightValue = num2;
        this.fontVariationSettings = jSONObject;
        this.letterSpacing = d10;
        this.lineHeight = num3;
        this.mask = maskData;
        this.strike = divLineStyle;
        this.textColor = num4;
        this.textShadow = shadowData;
        this.topOffset = num5;
        this.topOffsetStart = num6;
        this.topOffsetEnd = num7;
        this.underline = divLineStyle2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanData)) {
            return false;
        }
        SpanData spanData = (SpanData) obj;
        return this.start == spanData.start && this.end == spanData.end && this.alignmentVertical == spanData.alignmentVertical && this.baselineOffset == spanData.baselineOffset && p.e(this.fontFamily, spanData.fontFamily) && p.e(this.fontFeatureSettings, spanData.fontFeatureSettings) && p.e(this.fontSize, spanData.fontSize) && this.fontSizeUnit == spanData.fontSizeUnit && this.fontWeight == spanData.fontWeight && p.e(this.fontWeightValue, spanData.fontWeightValue) && p.e(this.fontVariationSettings, spanData.fontVariationSettings) && p.e(this.letterSpacing, spanData.letterSpacing) && p.e(this.lineHeight, spanData.lineHeight) && p.e(this.mask, spanData.mask) && this.strike == spanData.strike && p.e(this.textColor, spanData.textColor) && p.e(this.textShadow, spanData.textShadow) && p.e(this.topOffset, spanData.topOffset) && p.e(this.topOffsetStart, spanData.topOffsetStart) && p.e(this.topOffsetEnd, spanData.topOffsetEnd) && this.underline == spanData.underline;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31;
        DivTextAlignmentVertical divTextAlignmentVertical = this.alignmentVertical;
        int iHashCode2 = (((iHashCode + (divTextAlignmentVertical == null ? 0 : divTextAlignmentVertical.hashCode())) * 31) + Integer.hashCode(this.baselineOffset)) * 31;
        String str = this.fontFamily;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fontFeatureSettings;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.fontSize;
        int iHashCode5 = (((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.fontSizeUnit.hashCode()) * 31;
        DivFontWeight divFontWeight = this.fontWeight;
        int iHashCode6 = (iHashCode5 + (divFontWeight == null ? 0 : divFontWeight.hashCode())) * 31;
        Integer num2 = this.fontWeightValue;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        JSONObject jSONObject = this.fontVariationSettings;
        int iHashCode8 = (iHashCode7 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        Double d10 = this.letterSpacing;
        int iHashCode9 = (iHashCode8 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num3 = this.lineHeight;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MaskData maskData = this.mask;
        int iHashCode11 = (iHashCode10 + (maskData == null ? 0 : maskData.hashCode())) * 31;
        DivLineStyle divLineStyle = this.strike;
        int iHashCode12 = (iHashCode11 + (divLineStyle == null ? 0 : divLineStyle.hashCode())) * 31;
        Integer num4 = this.textColor;
        int iHashCode13 = (iHashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        ShadowData shadowData = this.textShadow;
        int iHashCode14 = (iHashCode13 + (shadowData == null ? 0 : shadowData.hashCode())) * 31;
        Integer num5 = this.topOffset;
        int iHashCode15 = (iHashCode14 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.topOffsetStart;
        int iHashCode16 = (iHashCode15 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.topOffsetEnd;
        int iHashCode17 = (iHashCode16 + (num7 == null ? 0 : num7.hashCode())) * 31;
        DivLineStyle divLineStyle2 = this.underline;
        return iHashCode17 + (divLineStyle2 != null ? divLineStyle2.hashCode() : 0);
    }

    public String toString() {
        return "SpanData(start=" + this.start + ", end=" + this.end + ", alignmentVertical=" + this.alignmentVertical + ", baselineOffset=" + this.baselineOffset + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", fontSize=" + this.fontSize + ", fontSizeUnit=" + this.fontSizeUnit + ", fontWeight=" + this.fontWeight + ", fontWeightValue=" + this.fontWeightValue + ", fontVariationSettings=" + this.fontVariationSettings + ", letterSpacing=" + this.letterSpacing + ", lineHeight=" + this.lineHeight + ", mask=" + this.mask + ", strike=" + this.strike + ", textColor=" + this.textColor + ", textShadow=" + this.textShadow + ", topOffset=" + this.topOffset + ", topOffsetStart=" + this.topOffsetStart + ", topOffsetEnd=" + this.topOffsetEnd + ", underline=" + this.underline + ')';
    }

    @Override // java.lang.Comparable
    public int compareTo(SpanData spanData) {
        return this.start - spanData.start;
    }

    public final DivTextAlignmentVertical getAlignmentVertical() {
        return this.alignmentVertical;
    }

    public final int getBaselineOffset() {
        return this.baselineOffset;
    }

    public final int getEnd() {
        return this.end;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    public final Integer getFontSize() {
        return this.fontSize;
    }

    public final JSONObject getFontVariationSettings() {
        return this.fontVariationSettings;
    }

    public final DivFontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final Integer getFontWeightValue() {
        return this.fontWeightValue;
    }

    public final Double getLetterSpacing() {
        return this.letterSpacing;
    }

    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    public final MaskData getMask() {
        return this.mask;
    }

    public final int getStart() {
        return this.start;
    }

    public final DivLineStyle getStrike() {
        return this.strike;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public final ShadowData getTextShadow() {
        return this.textShadow;
    }

    public final Integer getTopOffset() {
        return this.topOffset;
    }

    public final Integer getTopOffsetEnd() {
        return this.topOffsetEnd;
    }

    public final Integer getTopOffsetStart() {
        return this.topOffsetStart;
    }

    public final DivLineStyle getUnderline() {
        return this.underline;
    }

    public final boolean isEmpty() {
        return this.alignmentVertical == null && this.baselineOffset == 0 && this.fontFamily == null && this.fontFeatureSettings == null && this.fontSize == null && this.fontSizeUnit == DEFAULT_FONT_SIZE_UNIT && this.fontWeight == null && this.fontWeightValue == null && this.letterSpacing == null && this.lineHeight == null && this.mask == null && this.strike == null && this.textColor == null && this.textShadow == null && this.topOffset == null && this.topOffsetStart == null && this.topOffsetEnd == null && this.underline == null;
    }

    public final SpanData mergeWith(SpanData spanData, int i10, int i11) {
        DivTextAlignmentVertical divTextAlignmentVertical = spanData.alignmentVertical;
        if (divTextAlignmentVertical == null) {
            divTextAlignmentVertical = this.alignmentVertical;
        }
        DivTextAlignmentVertical divTextAlignmentVertical2 = divTextAlignmentVertical;
        int i12 = spanData.baselineOffset;
        if (i12 == 0) {
            i12 = this.baselineOffset;
        }
        int i13 = i12;
        String str = spanData.fontFamily;
        if (str == null) {
            str = this.fontFamily;
        }
        String str2 = str;
        String str3 = spanData.fontFeatureSettings;
        if (str3 == null) {
            str3 = this.fontFeatureSettings;
        }
        String str4 = str3;
        Integer num = spanData.fontSize;
        if (num == null) {
            num = this.fontSize;
        }
        Integer num2 = num;
        DivSizeUnit divSizeUnit = spanData.fontSizeUnit;
        if (divSizeUnit == DEFAULT_FONT_SIZE_UNIT) {
            divSizeUnit = this.fontSizeUnit;
        }
        DivSizeUnit divSizeUnit2 = divSizeUnit;
        DivFontWeight divFontWeight = spanData.fontWeight;
        if (divFontWeight == null) {
            divFontWeight = this.fontWeight;
        }
        DivFontWeight divFontWeight2 = divFontWeight;
        Integer num3 = spanData.fontWeightValue;
        if (num3 == null) {
            num3 = this.fontWeightValue;
        }
        Integer num4 = num3;
        JSONObject jSONObject = spanData.fontVariationSettings;
        if (jSONObject == null) {
            jSONObject = this.fontVariationSettings;
        }
        JSONObject jSONObject2 = jSONObject;
        Double d10 = spanData.letterSpacing;
        if (d10 == null) {
            d10 = this.letterSpacing;
        }
        Double d11 = d10;
        Integer num5 = spanData.lineHeight;
        if (num5 == null) {
            num5 = this.lineHeight;
        }
        Integer num6 = num5;
        MaskData maskData = spanData.mask;
        if (maskData == null) {
            maskData = this.mask;
        }
        MaskData maskData2 = maskData;
        DivLineStyle divLineStyle = spanData.strike;
        if (divLineStyle == null) {
            divLineStyle = this.strike;
        }
        DivLineStyle divLineStyle2 = divLineStyle;
        Integer num7 = spanData.textColor;
        if (num7 == null) {
            num7 = this.textColor;
        }
        Integer num8 = num7;
        ShadowData shadowData = spanData.textShadow;
        if (shadowData == null) {
            shadowData = this.textShadow;
        }
        ShadowData shadowData2 = shadowData;
        Integer num9 = spanData.topOffset;
        Integer num10 = num9 == null ? this.topOffset : num9;
        Integer num11 = num9 != null ? spanData.topOffsetStart : this.topOffsetStart;
        Integer num12 = num9 != null ? spanData.topOffsetEnd : this.topOffsetEnd;
        DivLineStyle divLineStyle3 = spanData.underline;
        if (divLineStyle3 == null) {
            divLineStyle3 = this.underline;
        }
        return new SpanData(i10, i11, divTextAlignmentVertical2, i13, str2, str4, num2, divSizeUnit2, divFontWeight2, num4, jSONObject2, d11, num6, maskData2, divLineStyle2, num8, shadowData2, num10, num11, num12, divLineStyle3);
    }
}
