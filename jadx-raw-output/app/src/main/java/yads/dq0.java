package yads;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class dq0 implements de1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f76777c;

    @Override // yads.de1
    public final String a() {
        String str;
        ck.w wVar = ck.w.f6066a;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f76776b);
        RectF rectF = this.f76777c;
        if (rectF != null) {
            str = String.format("{x:%s,y:%s,width:%s,height:%s}", Arrays.copyOf(new Object[]{Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())}, 4));
            ck.p.i(str, "format(...)");
        } else {
            str = null;
        }
        objArr[1] = str;
        String str2 = String.format("exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", Arrays.copyOf(objArr, 2));
        ck.p.i(str2, "format(...)");
        return str2;
    }

    public dq0(int i10, RectF rectF) {
        this.f76776b = i10;
        this.f76777c = rectF;
    }
}
