package io.bidmachine.media3.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableMap;
import io.bidmachine.media3.common.text.HorizontalTextInVerticalContextSpan;
import io.bidmachine.media3.common.text.RubySpan;
import io.bidmachine.media3.common.text.TextEmphasisSpan;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public final class SpannedToHtmlConverter {
    private static final Pattern NEWLINE_PATTERN = Pattern.compile("(&#13;)?&#10;");

    public static class HtmlAndCss {
        public final Map<String, String> cssRuleSets;
        public final String html;

        private HtmlAndCss(String str, Map<String, String> map) {
            this.html = str;
            this.cssRuleSets = map;
        }
    }

    public static final class b {
        public final String closingTag;
        public final int end;
        public final String openingTag;
        public final int start;
        private static final Comparator<b> FOR_OPENING_TAGS = new Comparator() { // from class: io.bidmachine.media3.ui.j0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SpannedToHtmlConverter.b.lambda$static$0((SpannedToHtmlConverter.b) obj, (SpannedToHtmlConverter.b) obj2);
            }
        };
        private static final Comparator<b> FOR_CLOSING_TAGS = new Comparator() { // from class: io.bidmachine.media3.ui.k0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SpannedToHtmlConverter.b.lambda$static$1((SpannedToHtmlConverter.b) obj, (SpannedToHtmlConverter.b) obj2);
            }
        };

        private b(int i10, int i11, String str, String str2) {
            this.start = i10;
            this.end = i11;
            this.openingTag = str;
            this.closingTag = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(b bVar, b bVar2) {
            int iCompare = Integer.compare(bVar2.end, bVar.end);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = bVar.openingTag.compareTo(bVar2.openingTag);
            return iCompareTo != 0 ? iCompareTo : bVar.closingTag.compareTo(bVar2.closingTag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$1(b bVar, b bVar2) {
            int iCompare = Integer.compare(bVar2.start, bVar.start);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = bVar2.openingTag.compareTo(bVar.openingTag);
            return iCompareTo != 0 ? iCompareTo : bVar2.closingTag.compareTo(bVar.closingTag);
        }
    }

    public static final class c {
        private final List<b> spansAdded = new ArrayList();
        private final List<b> spansRemoved = new ArrayList();
    }

    private SpannedToHtmlConverter() {
    }

    public static HtmlAndCss convert(@Nullable CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new HtmlAndCss("", ImmutableMap.of());
        }
        if (!(charSequence instanceof Spanned)) {
            return new HtmlAndCss(escapeHtml(charSequence), ImmutableMap.of());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(io.bidmachine.media3.ui.c.cssAllClassDescendantsSelector("bg_" + iIntValue), Util.formatInvariant("background-color:%s;", io.bidmachine.media3.ui.c.toCssRgba(iIntValue)));
        }
        SparseArray<c> sparseArrayFindSpanTransitions = findSpanTransitions(spanned, f10);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < sparseArrayFindSpanTransitions.size()) {
            int iKeyAt = sparseArrayFindSpanTransitions.keyAt(i10);
            sb2.append(escapeHtml(spanned.subSequence(i11, iKeyAt)));
            c cVar = sparseArrayFindSpanTransitions.get(iKeyAt);
            Collections.sort(cVar.spansRemoved, b.FOR_CLOSING_TAGS);
            Iterator it2 = cVar.spansRemoved.iterator();
            while (it2.hasNext()) {
                sb2.append(((b) it2.next()).closingTag);
            }
            Collections.sort(cVar.spansAdded, b.FOR_OPENING_TAGS);
            Iterator it3 = cVar.spansAdded.iterator();
            while (it3.hasNext()) {
                sb2.append(((b) it3.next()).openingTag);
            }
            i10++;
            i11 = iKeyAt;
        }
        sb2.append(escapeHtml(spanned.subSequence(i11, spanned.length())));
        return new HtmlAndCss(sb2.toString(), map);
    }

    private static String getTextEmphasisPosition(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    private static SparseArray<c> findSpanTransitions(Spanned spanned, float f10) {
        SparseArray<c> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String openingTag = getOpeningTag(obj, f10);
            String closingTag = getClosingTag(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (openingTag != null) {
                Assertions.checkNotNull(closingTag);
                b bVar = new b(spanStart, spanEnd, openingTag, closingTag);
                getOrCreate(sparseArray, spanStart).spansAdded.add(bVar);
                getOrCreate(sparseArray, spanEnd).spansRemoved.add(bVar);
            }
        }
        return sparseArray;
    }

    @Nullable
    private static String getClosingTag(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof HorizontalTextInVerticalContextSpan) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof TextEmphasisSpan)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof RubySpan) {
                return "<rt>" + escapeHtml(((RubySpan) obj).rubyText) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    @Nullable
    private static String getOpeningTag(Object obj, float f10) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return Util.formatInvariant("<span style='color:%s;'>", io.bidmachine.media3.ui.c.toCssRgba(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return Util.formatInvariant("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof HorizontalTextInVerticalContextSpan) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            return Util.formatInvariant("<span style='font-size:%.2fpx;'>", Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / f10));
        }
        if (obj instanceof RelativeSizeSpan) {
            return Util.formatInvariant("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return Util.formatInvariant("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof RubySpan)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof TextEmphasisSpan)) {
                return null;
            }
            TextEmphasisSpan textEmphasisSpan = (TextEmphasisSpan) obj;
            return Util.formatInvariant("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", getTextEmphasisStyle(textEmphasisSpan.markShape, textEmphasisSpan.markFill), getTextEmphasisPosition(textEmphasisSpan.position));
        }
        int i10 = ((RubySpan) obj).position;
        if (i10 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i10 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i10 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static String getTextEmphasisStyle(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append("filled ");
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append("none");
        } else if (i10 == 1) {
            sb2.append("circle");
        } else if (i10 == 2) {
            sb2.append("dot");
        } else if (i10 != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }

    private static String escapeHtml(CharSequence charSequence) {
        return NEWLINE_PATTERN.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static c getOrCreate(SparseArray<c> sparseArray, int i10) {
        c cVar = sparseArray.get(i10);
        if (cVar == null) {
            c cVar2 = new c();
            sparseArray.put(i10, cVar2);
            return cVar2;
        }
        return cVar;
    }
}
