package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.widget.RadioButton;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends RadioButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f70249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Path f70250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RectF f70251c;

    public b(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f70249a = paint;
        paint.setColor(-1);
        this.f70249a.setStyle(Paint.Style.STROKE);
        this.f70249a.setAntiAlias(true);
        this.f70249a.setStrokeJoin(Paint.Join.ROUND);
        this.f70249a.setStrokeCap(Paint.Cap.ROUND);
        this.f70250b = new Path();
        this.f70251c = new RectF();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        this.f70251c.set(0.0f, 0.0f, width, height);
        float fA = e.a(getContext(), 4);
        this.f70250b.addRoundRect(this.f70251c, fA, fA, Path.Direction.CW);
        canvas.clipPath(this.f70250b);
        super.onDraw(canvas);
        if (isChecked()) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            this.f70249a.setColor(-16736769);
            this.f70249a.setStyle(Paint.Style.FILL);
            canvas.translate(width, height * 0.581f);
            canvas.rotate(51.0f);
            canvas.drawRect(this.f70251c, this.f70249a);
            int width2 = canvas.getWidth();
            int height2 = canvas.getHeight();
            this.f70249a.setStyle(Paint.Style.STROKE);
            this.f70249a.setStrokeWidth(e.a(getContext(), 1));
            this.f70249a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
            canvas.save();
            float f10 = height2;
            canvas.translate(width2 * 0.018f, 0.378f * f10);
            Path path = new Path();
            path.reset();
            path.moveTo(0.0f, 0.0f);
            path.lineTo((-0.094f) * f10, 0.0f);
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, f10 * (-0.188f));
            canvas.drawPath(path, this.f70249a);
            canvas.restore();
            this.f70249a.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        }
    }
}
