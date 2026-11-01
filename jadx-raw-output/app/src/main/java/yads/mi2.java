package yads;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class mi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xr f80182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f80183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f80184c;

    public /* synthetic */ mi2(Context context) {
        this(new xr(context, 0));
    }

    public final Bitmap a(u41 u41Var) {
        Bitmap bitmap;
        String str = u41Var.f83368c;
        Bitmap bitmap2 = (Bitmap) this.f80183b.get(str);
        if (bitmap2 != null) {
            return bitmap2;
        }
        pa3 pa3Var = w82.f84125d.a(this.f80182a.f84676a).f84129c;
        String str2 = u41Var.f83368c;
        Bitmap bitmapA = pa3Var.a(str2);
        if (bitmapA != null && bitmapA.getWidth() == 1 && bitmapA.getHeight() == 1) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, u41Var.f83366a, u41Var.f83367b, false);
            pa3Var.a(str2, bitmapCreateScaledBitmap);
            bitmap = bitmapCreateScaledBitmap;
        } else {
            bitmap = bitmapA;
        }
        if (bitmap == null) {
            return null;
        }
        this.f80183b.put(str, bitmap);
        return bitmap;
    }

    public mi2(xr xrVar) {
        this.f80182a = xrVar;
        this.f80183b = new LinkedHashMap();
        this.f80184c = new LinkedHashMap();
    }
}
