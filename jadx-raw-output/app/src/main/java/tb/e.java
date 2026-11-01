package tb;

import android.widget.ImageView;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;

/* JADX INFO: compiled from: SVGAScaleInfo.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000b\u001a\u00020\tH\u0002R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\"\u0010$\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b\f\u0010!\"\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Ltb/e;", "", "", "canvasWidth", "canvasHeight", "videoWidth", "videoHeight", "Landroid/widget/ImageView$ScaleType;", "scaleType", "Lmj/r;", InneractiveMediationDefs.GENDER_FEMALE, "g", "a", "F", "d", "()F", "setTranFx", "(F)V", "tranFx", "b", "e", "setTranFy", "tranFy", "c", "setScaleFx", "scaleFx", "setScaleFy", "scaleFy", "getRatio", "setRatio", "ratio", "", "Z", "()Z", "setRatioX", "(Z)V", "ratioX", "<init>", "()V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public float tranFx;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public float tranFy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float scaleFx = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float scaleFy = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float ratio = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean ratioX;

    public final void g() {
        this.tranFx = 0.0f;
        this.tranFy = 0.0f;
        this.scaleFx = 1.0f;
        this.scaleFy = 1.0f;
        this.ratio = 1.0f;
        this.ratioX = false;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getRatioX() {
        return this.ratioX;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getScaleFx() {
        return this.scaleFx;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getScaleFy() {
        return this.scaleFy;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getTranFx() {
        return this.tranFx;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getTranFy() {
        return this.tranFy;
    }

    public final void f(float f10, float f11, float f12, float f13, ImageView.ScaleType scaleType) {
        p.k(scaleType, "scaleType");
        if (f10 == 0.0f || f11 == 0.0f || f12 == 0.0f || f13 == 0.0f) {
            return;
        }
        g();
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f11 - f13) / 2.0f;
        float f16 = f12 / f13;
        float f17 = f10 / f11;
        float f18 = f11 / f13;
        float f19 = f10 / f12;
        switch (d.$EnumSwitchMapping$0[scaleType.ordinal()]) {
            case 1:
                this.tranFx = f14;
                this.tranFy = f15;
                break;
            case 2:
                if (f16 <= f17) {
                    this.ratio = f19;
                    this.ratioX = true;
                    this.scaleFx = f19;
                    this.scaleFy = f19;
                    this.tranFy = (f11 - (f13 * f19)) / 2.0f;
                } else {
                    this.ratio = f18;
                    this.ratioX = false;
                    this.scaleFx = f18;
                    this.scaleFy = f18;
                    this.tranFx = (f10 - (f12 * f18)) / 2.0f;
                }
                break;
            case 3:
                if (f12 < f10 && f13 < f11) {
                    this.tranFx = f14;
                    this.tranFy = f15;
                } else if (f16 <= f17) {
                    this.ratio = f18;
                    this.ratioX = false;
                    this.scaleFx = f18;
                    this.scaleFy = f18;
                    this.tranFx = (f10 - (f12 * f18)) / 2.0f;
                } else {
                    this.ratio = f19;
                    this.ratioX = true;
                    this.scaleFx = f19;
                    this.scaleFy = f19;
                    this.tranFy = (f11 - (f13 * f19)) / 2.0f;
                }
                break;
            case 4:
                if (f16 <= f17) {
                    this.ratio = f18;
                    this.ratioX = false;
                    this.scaleFx = f18;
                    this.scaleFy = f18;
                    this.tranFx = (f10 - (f12 * f18)) / 2.0f;
                } else {
                    this.ratio = f19;
                    this.ratioX = true;
                    this.scaleFx = f19;
                    this.scaleFy = f19;
                    this.tranFy = (f11 - (f13 * f19)) / 2.0f;
                }
                break;
            case 5:
                if (f16 <= f17) {
                    this.ratio = f18;
                    this.ratioX = false;
                    this.scaleFx = f18;
                    this.scaleFy = f18;
                } else {
                    this.ratio = f19;
                    this.ratioX = true;
                    this.scaleFx = f19;
                    this.scaleFy = f19;
                }
                break;
            case 6:
                if (f16 <= f17) {
                    this.ratio = f18;
                    this.ratioX = false;
                    this.scaleFx = f18;
                    this.scaleFy = f18;
                    this.tranFx = f10 - (f12 * f18);
                } else {
                    this.ratio = f19;
                    this.ratioX = true;
                    this.scaleFx = f19;
                    this.scaleFy = f19;
                    this.tranFy = f11 - (f13 * f19);
                }
                break;
            case 7:
                this.ratio = Math.max(f19, f18);
                this.ratioX = f19 > f18;
                this.scaleFx = f19;
                this.scaleFy = f18;
                break;
            default:
                this.ratio = f19;
                this.ratioX = true;
                this.scaleFx = f19;
                this.scaleFy = f19;
                break;
        }
    }
}
