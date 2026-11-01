package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class w41 {
    public static boolean a(u41 u41Var, Map map) {
        Bitmap bitmap = (Bitmap) map.get(u41Var.f83368c);
        return (bitmap != null && bitmap.getWidth() > 1 && bitmap.getHeight() > 1) || !u41Var.f83371f;
    }
}
