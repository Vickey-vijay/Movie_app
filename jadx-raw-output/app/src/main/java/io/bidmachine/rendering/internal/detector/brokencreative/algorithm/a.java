package io.bidmachine.rendering.internal.detector.brokencreative.algorithm;

import android.graphics.Bitmap;
import android.graphics.Color;
import ck.p;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import io.bidmachine.util.Utils;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BrokenCreativeAlgorithmParams f60383a;

    public a(BrokenCreativeAlgorithmParams brokenCreativeAlgorithmParams) {
        p.j(brokenCreativeAlgorithmParams, "algorithmParams");
        this.f60383a = brokenCreativeAlgorithmParams;
    }

    public final BrokenCreativeAlgorithmParams a() {
        return this.f60383a;
    }

    public abstract Boolean a(Bitmap bitmap);

    public final Boolean b(Bitmap bitmap) {
        p.j(bitmap, "image");
        try {
            return a(bitmap);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final float a(int i10) {
        return (Utils.redToRatio(i10) * 0.299f) + (Utils.greenToRatio(i10) * 0.587f) + (Utils.blueToRatio(i10) * 0.114f);
    }

    public final int b(int i10) {
        return (int) ((Color.red(i10) * 0.299f) + (Color.green(i10) * 0.587f) + (Color.blue(i10) * 0.114f));
    }

    public final int a(Bitmap bitmap, int i10, int i11) {
        p.j(bitmap, "<this>");
        return b(bitmap.getPixel(i10, i11));
    }

    public final void a(Float f10, Boolean bool) {
        if (o.b()) {
            o.b("BrokenCreativeDetector", this.f60383a.getType().name() + " result - " + f10 + " (isBroken - " + bool + ')', new Object[0]);
        }
    }
}
