package com.yandex.div.core.util.mask;

import bk.l;
import ck.p;
import ik.k;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import lk.a0;
import lk.c0;
import lk.x;
import mj.r;
import nj.s;

/* JADX INFO: compiled from: CurrencyInputMask.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class CurrencyInputMask extends BaseInputMask {
    private NumberFormat currencyFormatter;
    private final char currencyKey;
    private final l<Exception, r> onError;
    private final List<Character> separators;

    /* JADX WARN: Multi-variable type inference failed */
    public CurrencyInputMask(Locale locale, l<? super Exception, r> lVar) {
        super(new BaseInputMask.MaskData("", s.k(), false));
        this.onError = lVar;
        this.currencyKey = (char) 164;
        this.separators = s.n('.', ',');
        this.currencyFormatter = clearFormatter(NumberFormat.getCurrencyInstance(locale));
    }

    private final NumberFormat clearFormatter(NumberFormat numberFormat) throws IOException {
        DecimalFormat decimalFormat = numberFormat instanceof DecimalFormat ? (DecimalFormat) numberFormat : null;
        if (decimalFormat != null) {
            String pattern = decimalFormat.toPattern();
            StringBuilder sb2 = new StringBuilder();
            int length = pattern.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = pattern.charAt(i10);
                if (cCharAt != this.currencyKey) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            p.i(string, "toString(...)");
            decimalFormat.applyPattern(a0.k1(string).toString());
        }
        return numberFormat;
    }

    private final String formatPattern(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isDigit(cCharAt)) {
                sb2.append('#');
            } else {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        p.i(string, "toString(...)");
        return string;
    }

    private final DecimalFormatSymbols getDecimalFormatSymbols() {
        NumberFormat numberFormat = this.currencyFormatter;
        p.h(numberFormat, "null cannot be cast to non-null type java.text.DecimalFormat");
        return ((DecimalFormat) numberFormat).getDecimalFormatSymbols();
    }

    private final String getWithNbsp(String str) {
        return x.M(str, ' ', (char) 160, false, 4, null);
    }

    private final void invalidateMaskDataForFormatted(Number number) {
        String pattern = formatPattern(this.currencyFormatter.format(number));
        char decimalSeparator = getDecimalFormatSymbols().getDecimalSeparator();
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(getDecimalFormatSymbols().getDecimalSeparator());
        sb2.append(']');
        updateMaskData(new BaseInputMask.MaskData(pattern, s.n(new BaseInputMask.MaskKey('#', "\\d", '0'), new BaseInputMask.MaskKey(decimalSeparator, sb2.toString(), getDecimalFormatSymbols().getDecimalSeparator())), getMaskData().getAlwaysVisible()), false);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    private final String toValidFormat(String str, TextDiff textDiff) {
        int i10;
        int start;
        int i11;
        char decimalSeparator = getDecimalFormatSymbols().getDecimalSeparator();
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 >= str.length()) {
                i12 = -1;
                break;
            }
            if (str.charAt(i12) == decimalSeparator && !inDiff(textDiff, i12)) {
                break;
            }
            i12++;
        }
        if (textDiff.getAdded() != 1 || textDiff.getRemoved() != 0) {
            start = -1;
        } else if (this.separators.contains(Character.valueOf(str.charAt(textDiff.getStart())))) {
            start = textDiff.getStart();
        } else {
            start = -1;
        }
        int maximumFractionDigits = this.currencyFormatter.getMaximumFractionDigits();
        if (i12 != -1) {
            i11 = maximumFractionDigits;
            for (int i13 = i12; i13 < str.length(); i13++) {
                if (Character.isDigit(str.charAt(i13)) && !inDiff(textDiff, i13)) {
                    i11--;
                }
            }
        } else {
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            i11 = maximumFractionDigits;
            while (i14 < str.length()) {
                char cCharAt = str.charAt(i14);
                int i16 = i15 + 1;
                boolean zInDiff = inDiff(textDiff, i15);
                if (cCharAt == decimalSeparator) {
                    z10 = true;
                } else if (!zInDiff && z10 && Character.isDigit(cCharAt)) {
                    i11--;
                }
                i14++;
                i15 = i16;
            }
        }
        boolean z11 = a0.W(str, decimalSeparator, false, 2, null) || start != -1;
        StringBuilder sb2 = new StringBuilder();
        boolean z12 = false;
        for (int length = str.length() - 1; length >= 0; length--) {
            char cCharAt2 = str.charAt(length);
            boolean z13 = sb2.length() <= maximumFractionDigits;
            if (Character.isDigit(cCharAt2)) {
                if (!inDiff(textDiff, length) || z12 || !z11) {
                    sb2.append(cCharAt2);
                } else if (i11 > 0) {
                    sb2.append(cCharAt2);
                    i11--;
                }
            } else if (z13 && i12 == -1 && length == start) {
                sb2.append(decimalSeparator);
                z12 = true;
            } else if (z13 && cCharAt2 == decimalSeparator && (i12 == length || i12 == -1)) {
                sb2.append(decimalSeparator);
                z12 = true;
                i12 = length;
            }
        }
        String string = sb2.toString();
        p.i(string, "toString(...)");
        String string2 = c0.v1(string).toString();
        int length2 = string2.length();
        for (int i17 = 0; i17 < length2; i17++) {
            if (string2.charAt(i17) != getDecimalFormatSymbols().getZeroDigit()) {
                i10 = i17;
                break;
            }
        }
        if (i10 <= 0) {
            return string2;
        }
        return string2.charAt(i10) == getDecimalFormatSymbols().getDecimalSeparator() ? c0.p1(string2, i10 - 1) : c0.p1(string2, i10);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void applyChangeFrom(String str, Integer num) throws ParseException {
        String strValueOf;
        int iAbs;
        TextDiff textDiffBuild = TextDiff.Companion.build(getValue(), getWithNbsp(str));
        char decimalSeparator = getDecimalFormatSymbols().getDecimalSeparator();
        String value = getValue();
        int length = value.length() - 1;
        boolean z10 = true;
        if (length < 0) {
            length = -1;
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (value.charAt(length) == decimalSeparator) {
                break;
            }
            if (i10 < 0) {
                length = -1;
                break;
            }
            length = i10;
        }
        int length2 = str.length() - 1;
        if (length2 < 0) {
            length2 = -1;
            break;
        }
        while (true) {
            int i11 = length2 - 1;
            if (str.charAt(length2) == decimalSeparator) {
                break;
            }
            if (i11 < 0) {
                length2 = -1;
                break;
            }
            length2 = i11;
        }
        if (length == length2 && (length != -1 || length2 != -1)) {
            z10 = false;
        }
        String validFormat = toValidFormat(str, textDiffBuild);
        NumberFormat numberFormat = this.currencyFormatter;
        if (a0.Q0(validFormat, decimalSeparator, false, 2, null)) {
            strValueOf = getDecimalFormatSymbols().getZeroDigit() + validFormat;
        } else {
            strValueOf = a0.n0(validFormat) ? String.valueOf(getDecimalFormatSymbols().getZeroDigit()) : validFormat;
        }
        Number number = numberFormat.parse(strValueOf);
        if (number == null) {
            number = 0;
        }
        cleanup(textDiffBuild);
        if (z10) {
            invalidateMaskDataForFormatted(number);
        }
        BaseInputMask.replaceChars$default(this, validFormat, 0, null, 4, null);
        if (getValue().length() <= textDiffBuild.getStart() || getValue().charAt(textDiffBuild.getStart()) != getDecimalFormatSymbols().getGroupingSeparator()) {
            iAbs = Math.abs(getValue().length() - (str.length() - (num != null ? num.intValue() : getCursorPosition())));
        } else {
            iAbs = num != null ? num.intValue() : getCursorPosition();
        }
        setCursorPosition(k.g(iAbs, getValue().length()));
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(Exception exc) {
        this.onError.invoke(exc);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void overrideRawValue(String str) throws ParseException {
        Number number = this.currencyFormatter.parse(str);
        if (number == null) {
            number = 0;
        }
        invalidateMaskDataForFormatted(number);
        super.overrideRawValue(str);
    }

    private final boolean inDiff(TextDiff textDiff, int i10) {
        if (textDiff.getStart() <= i10 && i10 < textDiff.getStart() + textDiff.getAdded()) {
            return true;
        }
        return false;
    }

    public final void updateCurrencyParams(Locale locale) {
        String strM = x.M(getRawValue(), getDecimalFormatSymbols().getDecimalSeparator(), '.', false, 4, null);
        this.currencyFormatter = clearFormatter(NumberFormat.getCurrencyInstance(locale));
        BaseInputMask.applyChangeFrom$default(this, x.M(strM, '.', getDecimalFormatSymbols().getDecimalSeparator(), false, 4, null), null, 2, null);
    }
}
