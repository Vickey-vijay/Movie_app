package pb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.widget.ImageView;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.opensource.svgaplayer.SVGAVideoEntity;
import kotlin.Metadata;

/* JADX INFO: compiled from: SVGADrawable.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,¢\u0006\u0004\b0\u00101J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0006\u0010\r\u001a\u00020\u0004R*\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0017\u0010+\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b%\u0010*R\u0017\u0010/\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\b\u001d\u0010.¨\u00062"}, d2 = {"Lpb/d;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Canvas;", "canvas", "Lmj/r;", "draw", "", "alpha", "setAlpha", "getOpacity", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "a", "", "value", "Z", "getCleared", "()Z", "e", "(Z)V", "cleared", "b", "I", "()I", InneractiveMediationDefs.GENDER_FEMALE, "(I)V", "currentFrame", "Landroid/widget/ImageView$ScaleType;", "c", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "g", "(Landroid/widget/ImageView$ScaleType;)V", "scaleType", "Lrb/b;", "d", "Lrb/b;", "drawer", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "()Lcom/opensource/svgaplayer/SVGAVideoEntity;", "videoItem", "Lpb/e;", "Lpb/e;", "()Lpb/e;", "dynamicItem", "<init>", "(Lcom/opensource/svgaplayer/SVGAVideoEntity;Lpb/e;)V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean cleared;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int currentFrame;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ImageView.ScaleType scaleType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final rb.b drawer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final SVGAVideoEntity videoItem;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final e dynamicItem;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void a() {
        for (sb.a aVar : this.videoItem.k()) {
            Integer playID = aVar.getPlayID();
            if (playID != null) {
                int iIntValue = playID.intValue();
                SoundPool soundPool = this.videoItem.getSoundPool();
                if (soundPool != null) {
                    soundPool.stop(iIntValue);
                }
            }
            aVar.e(null);
        }
        this.videoItem.a();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCurrentFrame() {
        return this.currentFrame;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getDynamicItem() {
        return this.dynamicItem;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SVGAVideoEntity getVideoItem() {
        return this.videoItem;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.cleared || canvas == null) {
            return;
        }
        this.drawer.a(canvas, this.currentFrame, this.scaleType);
    }

    public final void e(boolean z10) {
        if (this.cleared == z10) {
            return;
        }
        this.cleared = z10;
        invalidateSelf();
    }

    public final void f(int i10) {
        if (this.currentFrame == i10) {
            return;
        }
        this.currentFrame = i10;
        invalidateSelf();
    }

    public final void g(ImageView.ScaleType scaleType) {
        p.k(scaleType, "<set-?>");
        this.scaleType = scaleType;
    }

    public d(SVGAVideoEntity sVGAVideoEntity, e eVar) {
        p.k(sVGAVideoEntity, "videoItem");
        p.k(eVar, "dynamicItem");
        this.videoItem = sVGAVideoEntity;
        this.dynamicItem = eVar;
        this.cleared = true;
        this.scaleType = ImageView.ScaleType.MATRIX;
        this.drawer = new rb.b(sVGAVideoEntity, eVar);
    }
}
