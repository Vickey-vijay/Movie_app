package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.LineBackgroundSpan;
import androidx.annotation.Px;
import androidx.core.util.Pools;
import ck.i;
import ek.b;
import java.util.LinkedList;
import java.util.Queue;
import jj.a;

/* JADX INFO: compiled from: VerticalAlignmentSpan.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class VerticalAlignmentSpan extends CharacterStyle implements LineBackgroundSpan {
    private static final Companion Companion = new Companion(null);
    private static final Pools.SimplePool<int[]> LINE_POOL = new Pools.SimplePool<>(16);
    private final TextVerticalAlignment alignment;
    private final int fontSize;
    private final a<Layout> layoutProvider;
    private boolean textDrawWasCalled;
    private final Paint.FontMetricsInt fontMetrics = new Paint.FontMetricsInt();
    private final Queue<int[]> lines = new LinkedList();

    /* JADX INFO: compiled from: VerticalAlignmentSpan.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: VerticalAlignmentSpan.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextVerticalAlignment.values().length];
            try {
                iArr[TextVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextVerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextVerticalAlignment.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextVerticalAlignment.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        this.textDrawWasCalled = true;
        if (this.lines.isEmpty()) {
            return;
        }
        int[] iArrRemove = this.lines.remove();
        int i10 = iArrRemove[0];
        int i11 = iArrRemove[1];
        LINE_POOL.release(iArrRemove);
        int i12 = this.fontSize;
        if (i12 > 0) {
            textPaint.setTextSize(i12);
        }
        textPaint.getFontMetricsInt(this.fontMetrics);
        int i13 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i13 == 1) {
            textPaint.baselineShift += i10 - this.fontMetrics.ascent;
            return;
        }
        if (i13 != 2) {
            if (i13 != 4) {
                return;
            }
            textPaint.baselineShift += i11 - this.fontMetrics.descent;
        } else {
            Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
            textPaint.baselineShift += ((i10 + i11) / 2) - ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2);
        }
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, int i17) {
        if (this.textDrawWasCalled) {
            this.lines.clear();
        }
        this.textDrawWasCalled = false;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        if (i15 > spanned.getSpanEnd(this) || spanStart > i16) {
            return;
        }
        Layout layout = this.layoutProvider.get();
        int iC = i17 == layout.getLineCount() - 1 ? 0 : b.c(layout.getSpacingAdd());
        int[] iArrAcquire = LINE_POOL.acquire();
        if (iArrAcquire == null) {
            iArrAcquire = new int[2];
        }
        iArrAcquire[0] = i12 - i13;
        iArrAcquire[1] = (i14 - i13) - iC;
        this.lines.add(iArrAcquire);
    }

    public VerticalAlignmentSpan(@Px int i10, TextVerticalAlignment textVerticalAlignment, a<Layout> aVar) {
        this.fontSize = i10;
        this.alignment = textVerticalAlignment;
        this.layoutProvider = aVar;
    }
}
