package rb;

import android.graphics.Canvas;
import android.widget.ImageView;
import ck.p;
import com.opensource.svgaplayer.SVGAVideoEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import lk.x;
import sb.f;
import sb.g;
import tb.e;

/* JADX INFO: compiled from: SGVADrawer.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00000\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lrb/a;", "", "", "frameIndex", "", "Lrb/a$a;", "d", "(I)Ljava/util/List;", "Landroid/graphics/Canvas;", "canvas", "Landroid/widget/ImageView$ScaleType;", "scaleType", "Lmj/r;", "a", "Ltb/e;", "Ltb/e;", "b", "()Ltb/e;", "scaleInfo", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "c", "()Lcom/opensource/svgaplayer/SVGAVideoEntity;", "videoItem", "<init>", "(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final e scaleInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final SVGAVideoEntity videoItem;

    /* JADX INFO: renamed from: rb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SGVADrawer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0003\u0010\f¨\u0006\u0010"}, d2 = {"Lrb/a$a;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "matteKey", "b", "imageKey", "Lsb/g;", "Lsb/g;", "()Lsb/g;", "frameEntity", "<init>", "(Lrb/a;Ljava/lang/String;Ljava/lang/String;Lsb/g;)V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
    public final class C0626a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String matteKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String imageKey;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final g frameEntity;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f66726d;

        public C0626a(a aVar, String str, String str2, g gVar) {
            p.k(gVar, "frameEntity");
            this.f66726d = aVar;
            this.matteKey = str;
            this.imageKey = str2;
            this.frameEntity = gVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final g getFrameEntity() {
            return this.frameEntity;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getImageKey() {
            return this.imageKey;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMatteKey() {
            return this.matteKey;
        }
    }

    public void a(Canvas canvas, int i10, ImageView.ScaleType scaleType) {
        p.k(canvas, "canvas");
        p.k(scaleType, "scaleType");
        this.scaleInfo.f(canvas.getWidth(), canvas.getHeight(), (float) this.videoItem.getVideoSize().getWidth(), (float) this.videoItem.getVideoSize().getHeight(), scaleType);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getScaleInfo() {
        return this.scaleInfo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SVGAVideoEntity getVideoItem() {
        return this.videoItem;
    }

    public final List<C0626a> d(int frameIndex) {
        String strB;
        List<f> listP = this.videoItem.p();
        ArrayList arrayList = new ArrayList();
        for (f fVar : listP) {
            C0626a c0626a = null;
            if (frameIndex >= 0 && frameIndex < fVar.a().size() && (strB = fVar.getImageKey()) != null && (x.D(strB, ".matte", false, 2, null) || fVar.a().get(frameIndex).getAlpha() > 0.0d)) {
                c0626a = new C0626a(this, fVar.getMatteKey(), fVar.getImageKey(), fVar.a().get(frameIndex));
            }
            if (c0626a != null) {
                arrayList.add(c0626a);
            }
        }
        return arrayList;
    }

    public a(SVGAVideoEntity sVGAVideoEntity) {
        p.k(sVGAVideoEntity, "videoItem");
        this.videoItem = sVGAVideoEntity;
        this.scaleInfo = new e();
    }
}
