package io.bidmachine.media3.extractor.text.ttml;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.y1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;
import m5.a;

/* JADX INFO: loaded from: classes10.dex */
public final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final ImmutableSet<String> SINGLE_STYLE_VALUES = ImmutableSet.of("auto", "none");
    private static final ImmutableSet<String> MARK_SHAPE_VALUES = ImmutableSet.of("dot", "sesame", "circle");
    private static final ImmutableSet<String> MARK_FILL_VALUES = ImmutableSet.of("filled", "open");
    private static final ImmutableSet<String> POSITION_VALUES = ImmutableSet.of("after", "before", "outside");

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    @Nullable
    public static TextEmphasis parse(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String strE = a.e(str.trim());
        if (strE.isEmpty()) {
            return null;
        }
        return parseWords(ImmutableSet.copyOf(TextUtils.split(strE, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d6  */
    private static TextEmphasis parseWords(ImmutableSet<String> immutableSet) {
        byte b10;
        int i10;
        byte b11;
        String str = (String) y1.e(Sets.e(POSITION_VALUES, immutableSet), "outside");
        int iHashCode = str.hashCode();
        int i11 = 2;
        int i12 = -1;
        byte b12 = 1;
        if (iHashCode != -1392885889) {
            if (iHashCode != -1106037339) {
                if (iHashCode == 92734940 && str.equals("after")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("outside")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals("before")) {
            b10 = 2;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            i10 = b10 != 1 ? 1 : -2;
        } else {
            i10 = 2;
        }
        Sets.e eVarE = Sets.e(SINGLE_STYLE_VALUES, immutableSet);
        if (!eVarE.isEmpty()) {
            String str2 = (String) eVarE.iterator().next();
            int iHashCode2 = str2.hashCode();
            if (iHashCode2 != 3005871) {
                if (iHashCode2 == 3387192 && str2.equals("none")) {
                    b12 = 0;
                } else {
                    b12 = -1;
                }
            } else if (!str2.equals("auto")) {
                b12 = -1;
            }
            return new TextEmphasis(b12 == 0 ? 0 : -1, 0, i10);
        }
        Sets.e eVarE2 = Sets.e(MARK_FILL_VALUES, immutableSet);
        Sets.e eVarE3 = Sets.e(MARK_SHAPE_VALUES, immutableSet);
        if (eVarE2.isEmpty() && eVarE3.isEmpty()) {
            return new TextEmphasis(-1, 0, i10);
        }
        String str3 = (String) y1.e(eVarE2, "filled");
        int iHashCode3 = str3.hashCode();
        if (iHashCode3 != -1274499742) {
            if (iHashCode3 == 3417674 && str3.equals("open")) {
                b11 = 0;
            } else {
                b11 = -1;
            }
        } else if (str3.equals("filled")) {
            b11 = 1;
        } else {
            b11 = -1;
        }
        int i13 = b11 != 0 ? 1 : 2;
        String str4 = (String) y1.e(eVarE3, "circle");
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1360216880) {
            if (iHashCode4 != -905816648) {
                if (iHashCode4 == 99657 && str4.equals("dot")) {
                    i12 = 0;
                }
            } else if (str4.equals("sesame")) {
                i12 = 1;
            }
        } else if (str4.equals("circle")) {
            i12 = 2;
        }
        if (i12 != 0) {
            i11 = i12 != 1 ? 1 : 3;
        }
        return new TextEmphasis(i11, i13, i10);
    }

    private TextEmphasis(int i10, int i11, int i12) {
        this.markShape = i10;
        this.markFill = i11;
        this.position = i12;
    }
}
