package nh;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.ironsource.Z7;
import io.bidmachine.media3.common.text.HorizontalTextInVerticalContextSpan;
import io.bidmachine.media3.common.text.RubySpan;
import io.bidmachine.media3.common.text.SpanUtil;
import io.bidmachine.media3.common.text.TextEmphasisSpan;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.text.ttml.TextEmphasis;
import io.bidmachine.media3.extractor.text.ttml.TtmlStyle;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: compiled from: TtmlRenderUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d {
    private static final String TAG = "TtmlRenderUtil";

    private d() {
    }

    @Nullable
    public static TtmlStyle resolveStyle(@Nullable TtmlStyle ttmlStyle, @Nullable String[] strArr, Map<String, TtmlStyle> map) {
        int i10 = 0;
        if (ttmlStyle == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                TtmlStyle ttmlStyle2 = new TtmlStyle();
                int length = strArr.length;
                while (i10 < length) {
                    ttmlStyle2.chain(map.get(strArr[i10]));
                    i10++;
                }
                return ttmlStyle2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return ttmlStyle.chain(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    ttmlStyle.chain(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return ttmlStyle;
    }

    public static String applyTextElementSpacePolicy(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", Z7.f27998r).replaceAll("[ \t\\x0B\f\r]+", Z7.f27998r);
    }

    @Nullable
    private static b findRubyContainerNode(@Nullable b bVar, Map<String, TtmlStyle> map) {
        while (bVar != null) {
            TtmlStyle ttmlStyleResolveStyle = resolveStyle(bVar.style, bVar.getStyleIds(), map);
            if (ttmlStyleResolveStyle != null && ttmlStyleResolveStyle.getRubyType() == 1) {
                return bVar;
            }
            bVar = bVar.parent;
        }
        return null;
    }

    @Nullable
    private static b findRubyTextNode(b bVar, Map<String, TtmlStyle> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(bVar);
        while (!arrayDeque.isEmpty()) {
            b bVar2 = (b) arrayDeque.pop();
            TtmlStyle ttmlStyleResolveStyle = resolveStyle(bVar2.style, bVar2.getStyleIds(), map);
            if (ttmlStyleResolveStyle != null && ttmlStyleResolveStyle.getRubyType() == 3) {
                return bVar2;
            }
            for (int childCount = bVar2.getChildCount() - 1; childCount >= 0; childCount--) {
                arrayDeque.push(bVar2.getChild(childCount));
            }
        }
        return null;
    }

    public static void applyStylesToSpan(Spannable spannable, int i10, int i11, TtmlStyle ttmlStyle, @Nullable b bVar, Map<String, TtmlStyle> map, int i12) {
        b bVarFindRubyTextNode;
        int rubyPosition;
        TtmlStyle ttmlStyleResolveStyle;
        int i13;
        if (ttmlStyle.getStyle() != -1) {
            spannable.setSpan(new StyleSpan(ttmlStyle.getStyle()), i10, i11, 33);
        }
        if (ttmlStyle.isLinethrough()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (ttmlStyle.isUnderline()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (ttmlStyle.hasFontColor()) {
            SpanUtil.addOrReplaceSpan(spannable, new ForegroundColorSpan(ttmlStyle.getFontColor()), i10, i11, 33);
        }
        if (ttmlStyle.hasBackgroundColor()) {
            SpanUtil.addOrReplaceSpan(spannable, new BackgroundColorSpan(ttmlStyle.getBackgroundColor()), i10, i11, 33);
        }
        if (ttmlStyle.getFontFamily() != null) {
            SpanUtil.addOrReplaceSpan(spannable, new TypefaceSpan(ttmlStyle.getFontFamily()), i10, i11, 33);
        }
        if (ttmlStyle.getTextEmphasis() != null) {
            TextEmphasis textEmphasis = (TextEmphasis) Assertions.checkNotNull(ttmlStyle.getTextEmphasis());
            int i14 = textEmphasis.markShape;
            if (i14 == -1) {
                if (i12 != 2 && i12 != 1) {
                    i14 = 1;
                } else {
                    i14 = 3;
                }
                i13 = 1;
            } else {
                i13 = textEmphasis.markFill;
            }
            int i15 = textEmphasis.position;
            if (i15 == -2) {
                i15 = 1;
            }
            SpanUtil.addOrReplaceSpan(spannable, new TextEmphasisSpan(i14, i13, i15), i10, i11, 33);
        }
        int rubyType = ttmlStyle.getRubyType();
        if (rubyType != 2) {
            if (rubyType == 3 || rubyType == 4) {
                spannable.setSpan(new a(), i10, i11, 33);
            }
        } else {
            b bVarFindRubyContainerNode = findRubyContainerNode(bVar, map);
            if (bVarFindRubyContainerNode != null && (bVarFindRubyTextNode = findRubyTextNode(bVarFindRubyContainerNode, map)) != null) {
                if (bVarFindRubyTextNode.getChildCount() == 1 && bVarFindRubyTextNode.getChild(0).text != null) {
                    String str = (String) Util.castNonNull(bVarFindRubyTextNode.getChild(0).text);
                    TtmlStyle ttmlStyleResolveStyle2 = resolveStyle(bVarFindRubyTextNode.style, bVarFindRubyTextNode.getStyleIds(), map);
                    if (ttmlStyleResolveStyle2 != null) {
                        rubyPosition = ttmlStyleResolveStyle2.getRubyPosition();
                    } else {
                        rubyPosition = -1;
                    }
                    if (rubyPosition == -1 && (ttmlStyleResolveStyle = resolveStyle(bVarFindRubyContainerNode.style, bVarFindRubyContainerNode.getStyleIds(), map)) != null) {
                        rubyPosition = ttmlStyleResolveStyle.getRubyPosition();
                    }
                    spannable.setSpan(new RubySpan(str, rubyPosition), i10, i11, 33);
                } else {
                    Log.i(TAG, "Skipping rubyText node without exactly one text child.");
                }
            }
        }
        if (ttmlStyle.getTextCombine()) {
            SpanUtil.addOrReplaceSpan(spannable, new HorizontalTextInVerticalContextSpan(), i10, i11, 33);
        }
        int fontSizeUnit = ttmlStyle.getFontSizeUnit();
        if (fontSizeUnit != 1) {
            if (fontSizeUnit != 2) {
                if (fontSizeUnit == 3) {
                    SpanUtil.addInheritedRelativeSizeSpan(spannable, ttmlStyle.getFontSize() / 100.0f, i10, i11, 33);
                    return;
                }
                return;
            }
            SpanUtil.addOrReplaceSpan(spannable, new RelativeSizeSpan(ttmlStyle.getFontSize()), i10, i11, 33);
            return;
        }
        SpanUtil.addOrReplaceSpan(spannable, new AbsoluteSizeSpan((int) ttmlStyle.getFontSize(), true), i10, i11, 33);
    }

    public static void endParagraph(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }
}
