package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.preference.PreferenceManager;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class m13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i13 f80026a = new i13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f80027b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f80028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f80029d;

    public final void a(ImageView imageView, Bitmap bitmap, g13 g13Var) {
        float fFloatValue;
        Float fValueOf;
        float width = imageView.getWidth();
        float height = imageView.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float fFloatValue2 = 0.0f;
        Float fValueOf2 = Float.valueOf(0.0f);
        if (height == 0.0f || height2 == 0.0f) {
            return;
        }
        boolean z10 = width / height > width2 / height2;
        float f10 = z10 ? width / width2 : height / height2;
        float f11 = width2 * f10;
        float f12 = height2 * f10;
        if (z10) {
            fFloatValue = 0.0f;
        } else {
            fFloatValue = (width / 2) - (((g13Var.f77588c / 2) + g13Var.f77586a) * f10);
            if (fFloatValue > 0.0f) {
                fValueOf = fValueOf2;
            } else {
                fValueOf = fFloatValue + f11 < width ? Float.valueOf(width - f11) : null;
            }
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            }
        }
        if (z10) {
            float f13 = (height / 2) - (((g13Var.f77589d / 2) + g13Var.f77587b) * f10);
            if (f13 <= 0.0f) {
                fValueOf2 = f13 + f12 < height ? Float.valueOf(height - f12) : null;
            }
            fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : f13;
        }
        this.f80027b.setScale(f10, f10);
        this.f80027b.postTranslate(fFloatValue, fFloatValue2);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(this.f80027b);
        i13 i13Var = this.f80026a;
        Context context = imageView.getContext();
        i13Var.getClass();
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(bitmapCopy);
            Rect rect = this.f80029d;
            int i10 = g13Var.f77586a;
            int i11 = g13Var.f77587b;
            rect.set(i10, i11, g13Var.f77588c + i10, g13Var.f77589d + i11);
            canvas.drawRect(rect, this.f80028c);
            imageView.setImageBitmap(bitmapCopy);
        }
    }

    public m13() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        this.f80028c = paint;
        this.f80029d = new Rect();
    }
}
