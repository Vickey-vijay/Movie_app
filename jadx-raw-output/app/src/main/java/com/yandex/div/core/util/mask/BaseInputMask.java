package com.yandex.div.core.util.mask;

import bk.a;
import ck.i;
import ck.p;
import ik.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.Regex;
import lk.c0;
import nj.b0;

/* JADX INFO: compiled from: BaseInputMask.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseInputMask {
    private int cursorPosition;
    public List<? extends MaskChar> destructedValue;
    private final Map<Character, Regex> filters = new LinkedHashMap();
    private MaskData maskData;

    /* JADX INFO: compiled from: BaseInputMask.kt */
    public static abstract class MaskChar {

        /* JADX INFO: compiled from: BaseInputMask.kt */
        public static final class Dynamic extends MaskChar {

            /* JADX INFO: renamed from: char, reason: not valid java name */
            private Character f3260char;
            private final Regex filter;
            private final char placeholder;

            public Dynamic(Character ch2, Regex regex, char c10) {
                super(null);
                this.f3260char = ch2;
                this.filter = regex;
                this.placeholder = c10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Dynamic)) {
                    return false;
                }
                Dynamic dynamic = (Dynamic) obj;
                return p.e(this.f3260char, dynamic.f3260char) && p.e(this.filter, dynamic.filter) && this.placeholder == dynamic.placeholder;
            }

            public int hashCode() {
                Character ch2 = this.f3260char;
                int iHashCode = (ch2 == null ? 0 : ch2.hashCode()) * 31;
                Regex regex = this.filter;
                return ((iHashCode + (regex != null ? regex.hashCode() : 0)) * 31) + Character.hashCode(this.placeholder);
            }

            public String toString() {
                return "Dynamic(char=" + this.f3260char + ", filter=" + this.filter + ", placeholder=" + this.placeholder + ')';
            }

            public final Character getChar() {
                return this.f3260char;
            }

            public final Regex getFilter() {
                return this.filter;
            }

            public final char getPlaceholder() {
                return this.placeholder;
            }

            public final void setChar(Character ch2) {
                this.f3260char = ch2;
            }
        }

        /* JADX INFO: compiled from: BaseInputMask.kt */
        public static final class Static extends MaskChar {

            /* JADX INFO: renamed from: char, reason: not valid java name */
            private final char f3261char;

            public Static(char c10) {
                super(null);
                this.f3261char = c10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Static) && this.f3261char == ((Static) obj).f3261char;
            }

            public int hashCode() {
                return Character.hashCode(this.f3261char);
            }

            public String toString() {
                return "Static(char=" + this.f3261char + ')';
            }

            public final char getChar() {
                return this.f3261char;
            }
        }

        private MaskChar() {
        }

        public /* synthetic */ MaskChar(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: BaseInputMask.kt */
    public static final class MaskData {
        private final boolean alwaysVisible;
        private final List<MaskKey> decoding;
        private final String pattern;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MaskData)) {
                return false;
            }
            MaskData maskData = (MaskData) obj;
            return p.e(this.pattern, maskData.pattern) && p.e(this.decoding, maskData.decoding) && this.alwaysVisible == maskData.alwaysVisible;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        public int hashCode() {
            int iHashCode = ((this.pattern.hashCode() * 31) + this.decoding.hashCode()) * 31;
            boolean z10 = this.alwaysVisible;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public String toString() {
            return "MaskData(pattern=" + this.pattern + ", decoding=" + this.decoding + ", alwaysVisible=" + this.alwaysVisible + ')';
        }

        public final boolean getAlwaysVisible() {
            return this.alwaysVisible;
        }

        public final List<MaskKey> getDecoding() {
            return this.decoding;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public MaskData(String str, List<MaskKey> list, boolean z10) {
            this.pattern = str;
            this.decoding = list;
            this.alwaysVisible = z10;
        }
    }

    /* JADX INFO: compiled from: BaseInputMask.kt */
    public static final class MaskKey {
        private final String filter;
        private final char key;
        private final char placeholder;

        public final String getFilter() {
            return this.filter;
        }

        public final char getKey() {
            return this.key;
        }

        public final char getPlaceholder() {
            return this.placeholder;
        }

        public MaskKey(char c10, String str, char c11) {
            this.key = c10;
            this.filter = str;
            this.placeholder = c11;
        }
    }

    public abstract void onException(Exception exc);

    public static /* synthetic */ void applyChangeFrom$default(BaseInputMask baseInputMask, String str, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyChangeFrom");
        }
        if ((i10 & 2) != 0) {
            num = null;
        }
        baseInputMask.applyChangeFrom(str, num);
    }

    private final int calculateMaxShift(String str, int i10) {
        int length;
        if (this.filters.size() <= 1) {
            int i11 = 0;
            while (i10 < getDestructedValue().size()) {
                if (getDestructedValue().get(i10) instanceof MaskChar.Dynamic) {
                    i11++;
                }
                i10++;
            }
            length = i11 - str.length();
        } else {
            String strCalculateInsertableSubstring = calculateInsertableSubstring(str, i10);
            int i12 = 0;
            while (i12 < getDestructedValue().size() && p.e(strCalculateInsertableSubstring, calculateInsertableSubstring(str, i10 + i12))) {
                i12++;
            }
            length = i12 - 1;
        }
        return k.d(length, 0);
    }

    public static /* synthetic */ void replaceChars$default(BaseInputMask baseInputMask, String str, int i10, Integer num, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceChars");
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        baseInputMask.replaceChars(str, i10, num);
    }

    public static /* synthetic */ void updateMaskData$default(BaseInputMask baseInputMask, MaskData maskData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMaskData");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        baseInputMask.updateMaskData(maskData, z10);
    }

    public void applyChangeFrom(String str, Integer num) {
        TextDiff textDiffBuild = TextDiff.Companion.build(getValue(), str);
        if (num != null) {
            textDiffBuild = new TextDiff(k.d(num.intValue() - textDiffBuild.getAdded(), 0), textDiffBuild.getAdded(), textDiffBuild.getRemoved());
        }
        calculateCursorPosition(textDiffBuild, replaceBodyTail(textDiffBuild, str));
    }

    public final String calculateInsertableSubstring(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i10;
        a<Regex> aVar = new a<Regex>() { // from class: com.yandex.div.core.util.mask.BaseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public final Regex invoke() {
                while (ref$IntRef.element < this.getDestructedValue().size() && !(this.getDestructedValue().get(ref$IntRef.element) instanceof BaseInputMask.MaskChar.Dynamic)) {
                    ref$IntRef.element++;
                }
                Object objI0 = b0.i0(this.getDestructedValue(), ref$IntRef.element);
                BaseInputMask.MaskChar.Dynamic dynamic = objI0 instanceof BaseInputMask.MaskChar.Dynamic ? (BaseInputMask.MaskChar.Dynamic) objI0 : null;
                if (dynamic != null) {
                    return dynamic.getFilter();
                }
                return null;
            }
        };
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            Regex regexInvoke = aVar.invoke();
            if (regexInvoke != null && regexInvoke.matches(String.valueOf(cCharAt))) {
                sb2.append(cCharAt);
                ref$IntRef.element++;
            }
        }
        return sb2.toString();
    }

    public final void clearRange(int i10, int i11) {
        while (i10 < i11 && i10 < getDestructedValue().size()) {
            MaskChar maskChar = getDestructedValue().get(i10);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).setChar(null);
            }
            i10++;
        }
    }

    public final String collectValueRange(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        while (i10 <= i11) {
            MaskChar maskChar = getDestructedValue().get(i10);
            if (maskChar instanceof MaskChar.Dynamic) {
                MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                if (dynamic.getChar() != null) {
                    sb2.append(dynamic.getChar());
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    public final int getCursorPosition() {
        return this.cursorPosition;
    }

    public final List<MaskChar> getDestructedValue() {
        List list = this.destructedValue;
        if (list != null) {
            return list;
        }
        p.B("destructedValue");
        return null;
    }

    public final MaskData getMaskData() {
        return this.maskData;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    public final String getValue() {
        StringBuilder sb2 = new StringBuilder();
        List<MaskChar> destructedValue = getDestructedValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : destructedValue) {
            MaskChar maskChar = (MaskChar) obj;
            boolean z10 = true;
            if (maskChar instanceof MaskChar.Static) {
                sb2.append(((MaskChar.Static) maskChar).getChar());
            } else if (maskChar instanceof MaskChar.Dynamic) {
                MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                if (dynamic.getChar() != null) {
                    sb2.append(dynamic.getChar());
                } else if (this.maskData.getAlwaysVisible()) {
                    p.h(maskChar, "null cannot be cast to non-null type com.yandex.div.core.util.mask.BaseInputMask.MaskChar.Dynamic");
                    sb2.append(((MaskChar.Dynamic) maskChar).getPlaceholder());
                } else {
                    z10 = false;
                }
            } else if (this.maskData.getAlwaysVisible()) {
                p.h(maskChar, "null cannot be cast to non-null type com.yandex.div.core.util.mask.BaseInputMask.MaskChar.Dynamic");
                sb2.append(((MaskChar.Dynamic) maskChar).getPlaceholder());
            } else {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            arrayList.add(obj);
        }
        return sb2.toString();
    }

    public final void setCursorPosition(int i10) {
        this.cursorPosition = i10;
    }

    public final void setDestructedValue(List<? extends MaskChar> list) {
        this.destructedValue = list;
    }

    public void updateMaskData(MaskData maskData, boolean z10) {
        Object next;
        String rawValue = (p.e(this.maskData, maskData) || !z10) ? null : getRawValue();
        this.maskData = maskData;
        this.filters.clear();
        for (MaskKey maskKey : this.maskData.getDecoding()) {
            try {
                String filter = maskKey.getFilter();
                if (filter != null) {
                    this.filters.put(Character.valueOf(maskKey.getKey()), new Regex(filter));
                }
            } catch (PatternSyntaxException e10) {
                onException(e10);
            }
        }
        String pattern = this.maskData.getPattern();
        ArrayList arrayList = new ArrayList(pattern.length());
        for (int i10 = 0; i10 < pattern.length(); i10++) {
            char cCharAt = pattern.charAt(i10);
            Iterator<T> it = this.maskData.getDecoding().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((MaskKey) next).getKey() == cCharAt));
            MaskKey maskKey2 = (MaskKey) next;
            arrayList.add(maskKey2 != null ? new MaskChar.Dynamic(null, this.filters.get(Character.valueOf(maskKey2.getKey())), maskKey2.getPlaceholder()) : new MaskChar.Static(cCharAt));
        }
        setDestructedValue(arrayList);
        if (rawValue != null) {
            overrideRawValue(rawValue);
        }
    }

    public BaseInputMask(MaskData maskData) {
        this.maskData = maskData;
        updateMaskData$default(this, maskData, false, 2, null);
    }

    private final String buildBodySubstring(TextDiff textDiff, String str) {
        String strSubstring = str.substring(textDiff.getStart(), textDiff.getStart() + textDiff.getAdded());
        p.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    private final String buildTailSubstring(TextDiff textDiff) {
        return collectValueRange(textDiff.getStart() + textDiff.getRemoved(), getDestructedValue().size() - 1);
    }

    public final void calculateCursorPosition(TextDiff textDiff, int i10) {
        int firstEmptyHolderIndex = getFirstEmptyHolderIndex();
        if (textDiff.getStart() < firstEmptyHolderIndex) {
            firstEmptyHolderIndex = Math.min(firstHolderAfter(i10), getValue().length());
        }
        this.cursorPosition = firstEmptyHolderIndex;
    }

    public final void cleanup(TextDiff textDiff) {
        if (textDiff.getAdded() == 0 && textDiff.getRemoved() == 1) {
            for (int start = textDiff.getStart(); start >= 0; start--) {
                MaskChar maskChar = getDestructedValue().get(start);
                if (maskChar instanceof MaskChar.Dynamic) {
                    MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                    if (dynamic.getChar() != null) {
                        dynamic.setChar(null);
                        break;
                    }
                }
            }
        }
        clearRange(textDiff.getStart(), getDestructedValue().size());
    }

    public final int firstHolderAfter(int i10) {
        while (i10 < getDestructedValue().size() && !(getDestructedValue().get(i10) instanceof MaskChar.Dynamic)) {
            i10++;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public final int getFirstEmptyHolderIndex() {
        boolean z10;
        int i10 = 0;
        for (MaskChar maskChar : getDestructedValue()) {
            if ((maskChar instanceof MaskChar.Dynamic) && ((MaskChar.Dynamic) maskChar).getChar() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                i10++;
            } else {
                if (i10 != -1) {
                    return getDestructedValue().size();
                }
                return i10;
            }
        }
        i10 = -1;
        if (i10 != -1) {
            return getDestructedValue().size();
        }
        return i10;
    }

    public final String getRawValue() {
        return collectValueRange(0, getDestructedValue().size() - 1);
    }

    public void overrideRawValue(String str) {
        clearRange(0, getDestructedValue().size());
        replaceChars$default(this, str, 0, null, 4, null);
        this.cursorPosition = Math.min(this.cursorPosition, getValue().length());
    }

    public final int replaceBodyTail(TextDiff textDiff, String str) {
        boolean z10;
        Integer numValueOf;
        String strBuildBodySubstring = buildBodySubstring(textDiff, str);
        String strBuildTailSubstring = buildTailSubstring(textDiff);
        cleanup(textDiff);
        int firstEmptyHolderIndex = getFirstEmptyHolderIndex();
        if (strBuildTailSubstring.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(calculateMaxShift(strBuildTailSubstring, firstEmptyHolderIndex));
        }
        replaceChars(strBuildBodySubstring, firstEmptyHolderIndex, numValueOf);
        int firstEmptyHolderIndex2 = getFirstEmptyHolderIndex();
        replaceChars$default(this, strBuildTailSubstring, firstEmptyHolderIndex2, null, 4, null);
        return firstEmptyHolderIndex2;
    }

    public final void replaceChars(String str, int i10, Integer num) {
        String strCalculateInsertableSubstring = calculateInsertableSubstring(str, i10);
        if (num != null) {
            strCalculateInsertableSubstring = c0.x1(strCalculateInsertableSubstring, num.intValue());
        }
        int i11 = 0;
        while (i10 < getDestructedValue().size() && i11 < strCalculateInsertableSubstring.length()) {
            MaskChar maskChar = getDestructedValue().get(i10);
            char cCharAt = strCalculateInsertableSubstring.charAt(i11);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).setChar(Character.valueOf(cCharAt));
                i11++;
            }
            i10++;
        }
    }
}
