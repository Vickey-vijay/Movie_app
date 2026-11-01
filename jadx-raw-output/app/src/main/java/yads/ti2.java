package yads;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ti2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ap f83062a;

    public /* synthetic */ ti2() {
        this(new ap());
    }

    public ti2(ap apVar) {
        this.f83062a = apVar;
    }

    public final Bitmap a(Bitmap bitmap, u41 u41Var) {
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && u41Var.f83366a != 0 && u41Var.f83367b != 0) {
            if (bitmap.getWidth() * u41Var.f83367b == bitmap.getHeight() * u41Var.f83366a) {
                return bitmap;
            }
            this.f83062a.getClass();
            yz2 yz2Var = new yz2(bitmap.getWidth(), bitmap.getHeight());
            double d10 = 1.0d;
            if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && u41Var.f83366a != 0 && u41Var.f83367b != 0) {
                Iterator<Integer> it = new ik.i(bitmap.getWidth(), Math.max(bitmap.getWidth(), Math.min(100, (u41Var.f83366a * 100) / u41Var.f83367b))).iterator();
                while (it.hasNext()) {
                    int iNextInt = ((nj.g0) it).nextInt();
                    int i10 = u41Var.f83367b * iNextInt;
                    int i11 = u41Var.f83366a;
                    if (i10 % i11 == 0) {
                        yz2Var = new yz2(iNextInt, i10 / i11);
                        break;
                    }
                    double d11 = ((double) i10) / ((double) i11);
                    int iB = ek.b.b(d11);
                    double dAbs = Math.abs(((double) iB) - d11) / d11;
                    if (dAbs < d10) {
                        yz2Var = new yz2(iNextInt, iB);
                        d10 = dAbs;
                    }
                }
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i12 = yz2Var.f85156b;
            yz2 yz2Var2 = new yz2(i12, (i12 * height) / width);
            int i13 = yz2Var.f85157c;
            yz2 yz2Var3 = (yz2) qj.c.h(yz2Var2, new yz2((width * i13) / height, i13));
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, yz2Var3.f85156b, yz2Var3.f85157c, false);
            int width2 = (bitmapCreateScaledBitmap.getWidth() - yz2Var.f85156b) / 2;
            int height2 = bitmapCreateScaledBitmap.getHeight();
            int i14 = yz2Var.f85157c;
            return Bitmap.createBitmap(bitmapCreateScaledBitmap, width2, (height2 - i14) / 2, yz2Var.f85156b, i14, (Matrix) null, false);
        }
        return bitmap;
    }
}
