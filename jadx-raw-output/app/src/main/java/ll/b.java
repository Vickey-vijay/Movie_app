package ll;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import kl.m;

/* JADX INFO: compiled from: BaseCacheStuffer.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b {
    public abstract void a();

    public abstract void c(kl.c cVar, Canvas canvas, float f10, float f11, boolean z10, a.C0577a c0577a);

    public abstract void d(kl.c cVar, TextPaint textPaint, boolean z10);

    public void e(kl.c cVar, boolean z10) {
    }

    public void f(kl.c cVar) {
    }

    public boolean b(kl.c cVar, Canvas canvas, float f10, float f11, Paint paint, TextPaint textPaint) {
        g gVar;
        m<?> mVarE = cVar.e();
        if (mVarE != null && (gVar = (g) mVarE.get()) != null) {
            return gVar.b(canvas, f10, f11, paint);
        }
        return false;
    }
}
