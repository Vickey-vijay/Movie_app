package io.bidmachine.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.media3.common.text.Cue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.a {
    private float bottomPaddingFraction;
    private List<Cue> cues;
    private final List<l0> painters;
    private CaptionStyleCompat style;
    private float textSize;
    private int textSizeType;

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public CanvasSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.painters = new ArrayList();
        this.cues = Collections.emptyList();
        this.textSizeType = 0;
        this.textSize = 0.0533f;
        this.style = CaptionStyleCompat.DEFAULT;
        this.bottomPaddingFraction = 0.08f;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<Cue> list = this.cues;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float fResolveTextSize = o0.resolveTextSize(this.textSizeType, this.textSize, height, i10);
        if (fResolveTextSize <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            Cue cueRepositionVerticalCue = list.get(i11);
            if (cueRepositionVerticalCue.verticalType != Integer.MIN_VALUE) {
                cueRepositionVerticalCue = repositionVerticalCue(cueRepositionVerticalCue);
            }
            Cue cue = cueRepositionVerticalCue;
            int i12 = paddingBottom;
            this.painters.get(i11).draw(cue, this.style, fResolveTextSize, o0.resolveTextSize(cue.textSizeType, cue.textSize, height, i10), this.bottomPaddingFraction, canvas, paddingLeft, paddingTop, width, i12);
            i11++;
            size = size;
            i10 = i10;
            paddingBottom = i12;
            width = width;
        }
    }

    @Override // io.bidmachine.media3.ui.SubtitleView.a
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f10, int i10, float f11) {
        this.cues = list;
        this.style = captionStyleCompat;
        this.textSize = f10;
        this.textSizeType = i10;
        this.bottomPaddingFraction = f11;
        while (this.painters.size() < list.size()) {
            this.painters.add(new l0(getContext()));
        }
        invalidate();
    }

    private static Cue repositionVerticalCue(Cue cue) {
        Cue.Builder textAlignment = cue.buildUpon().setPosition(-3.4028235E38f).setPositionAnchor(Integer.MIN_VALUE).setTextAlignment(null);
        if (cue.lineType == 0) {
            textAlignment.setLine(1.0f - cue.line, 0);
        } else {
            textAlignment.setLine((-cue.line) - 1.0f, 1);
        }
        int i10 = cue.lineAnchor;
        if (i10 != 0) {
            if (i10 == 2) {
                textAlignment.setLineAnchor(0);
            }
        } else {
            textAlignment.setLineAnchor(2);
        }
        return textAlignment.build();
    }
}
