package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class a33 extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f75380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f75381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f75383d;

    public a33(Context context) {
        super(context);
        this.f75380a = new Rect();
        this.f75381b = new Paint();
        this.f75382c = kl3.a(getContext(), 1.0f);
        this.f75383d = kl3.a(getContext(), 4.0f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int iA = kl3.a(getCurrentTextColor(), 85.0f);
        Paint paint = this.f75381b;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f75382c);
        paint.setColor(iA);
        int lineCount = getLineCount();
        Layout layout = getLayout();
        for (int i10 = 0; i10 < lineCount; i10++) {
            int lineBounds = getLineBounds(i10, this.f75380a);
            int lineStart = layout.getLineStart(i10);
            int lineEnd = layout.getLineEnd(i10);
            float primaryHorizontal = layout.getPrimaryHorizontal(lineStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(lineEnd - 1) + (layout.getPrimaryHorizontal(lineStart + 1) - primaryHorizontal);
            float f10 = lineBounds + this.f75383d;
            canvas.drawLine(primaryHorizontal, f10, primaryHorizontal2, f10, paint);
        }
        super.onDraw(canvas);
    }
}
