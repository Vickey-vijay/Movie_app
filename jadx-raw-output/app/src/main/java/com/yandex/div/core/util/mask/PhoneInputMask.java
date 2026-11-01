package com.yandex.div.core.util.mask;

import bk.l;
import ck.p;
import ik.k;
import mj.r;
import org.json.JSONException;

/* JADX INFO: compiled from: PhoneInputMask.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class PhoneInputMask extends BaseInputMask {
    private final l<Exception, r> onError;

    private final void calculateCursorPositionBy(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < getDestructedValue().size() && i12 < i10) {
            int i13 = i11 + 1;
            if (getDestructedValue().get(i11) instanceof BaseInputMask.MaskChar.Dynamic) {
                i12++;
            }
            i11 = i13;
        }
        setCursorPosition(firstHolderAfter(i11));
    }

    private final void updateMaskDataWith(String str) {
        updateMaskData(new BaseInputMask.MaskData(str, PhoneInputMaskKt.getDEFAULT_DECODING_MASK_KEY(), getMaskData().getAlwaysVisible()), false);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void applyChangeFrom(String str, Integer num) throws JSONException {
        TextDiff.Companion companion = TextDiff.Companion;
        TextDiff textDiffBuild = companion.build(getValue(), str);
        if (num != null) {
            textDiffBuild = new TextDiff(k.d(num.intValue() - textDiffBuild.getAdded(), 0), textDiffBuild.getAdded(), textDiffBuild.getRemoved());
        }
        String rawValue = getRawValue();
        int iReplaceBodyTail = replaceBodyTail(textDiffBuild, str);
        String rawValue2 = getRawValue();
        String strNewMaskPatternFor = newMaskPatternFor(rawValue2);
        if (strNewMaskPatternFor == null) {
            calculateCursorPosition(textDiffBuild, iReplaceBodyTail);
            return;
        }
        updateMaskDataWith(strNewMaskPatternFor);
        BaseInputMask.replaceChars$default(this, rawValue2, 0, null, 4, null);
        TextDiff textDiffBuild2 = companion.build(rawValue, rawValue2);
        calculateCursorPositionBy(textDiffBuild2.getStart() + textDiffBuild2.getAdded());
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(Exception exc) {
        this.onError.invoke(exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneInputMask(l<? super Exception, r> lVar) {
        super(PhoneInputMaskKt.getDEFAULT_MASK_DATA());
        this.onError = lVar;
    }

    private final String newMaskPatternFor(String str) throws JSONException {
        String phoneMaskPattern = PhoneInputMaskKt.getPhoneMaskPattern(str);
        if (p.e(phoneMaskPattern, getMaskData().getPattern())) {
            return null;
        }
        return phoneMaskPattern;
    }

    private final r tryInvalidateMaskDataWith(String str) throws JSONException {
        String strNewMaskPatternFor = newMaskPatternFor(str);
        if (strNewMaskPatternFor != null) {
            updateMaskDataWith(strNewMaskPatternFor);
            return r.f64562a;
        }
        return null;
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void overrideRawValue(String str) throws JSONException {
        tryInvalidateMaskDataWith(str);
        super.overrideRawValue(str);
    }
}
