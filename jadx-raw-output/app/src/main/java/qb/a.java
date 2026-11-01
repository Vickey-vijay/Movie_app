package qb;

import android.graphics.BitmapFactory;
import ck.p;
import kotlin.Metadata;
import kotlin.Pair;
import mj.h;

/* JADX INFO: compiled from: BitmapSampleSizeCalculator.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lqb/a;", "", "Landroid/graphics/BitmapFactory$Options;", "options", "", "reqWidth", "reqHeight", "a", "<init>", "()V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f66561a = new a();

    public final int a(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        p.k(options, "options");
        Pair pairA = h.a(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pairA.component1()).intValue();
        int iIntValue2 = ((Number) pairA.component2()).intValue();
        int i10 = 1;
        if (reqHeight > 0 && reqWidth > 0 && (iIntValue > reqHeight || iIntValue2 > reqWidth)) {
            int i11 = iIntValue / 2;
            int i12 = iIntValue2 / 2;
            while (i11 / i10 >= reqHeight && i12 / i10 >= reqWidth) {
                i10 *= 2;
            }
        }
        return i10;
    }
}
