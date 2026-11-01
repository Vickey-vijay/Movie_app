package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;

/* JADX INFO: compiled from: Picture.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PictureKt {
    public static final Picture record(Picture picture, int i10, int i11, bk.l<? super Canvas, mj.r> lVar) {
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        try {
            lVar.invoke(canvasBeginRecording);
            return picture;
        } finally {
            ck.n.b(1);
            picture.endRecording();
            ck.n.a(1);
        }
    }
}
