package sb;

import androidx.core.graphics.drawable.IconCompat;
import ck.p;
import com.opensource.svgaplayer.entities.SVGAVideoShapeEntity;
import com.opensource.svgaplayer.proto.FrameEntity;
import com.opensource.svgaplayer.proto.SpriteEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import nj.b0;
import nj.s;
import nj.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: SVGAVideoSpriteEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0003\u0010\r¨\u0006\u0015"}, d2 = {"Lsb/f;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "imageKey", "c", "matteKey", "", "Lsb/g;", "Ljava/util/List;", "()Ljava/util/List;", com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS, "Lorg/json/JSONObject;", IconCompat.EXTRA_OBJ, "<init>", "(Lorg/json/JSONObject;)V", "Lcom/opensource/svgaplayer/proto/SpriteEntity;", "(Lcom/opensource/svgaplayer/proto/SpriteEntity;)V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String imageKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String matteKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final List<g> frames;

    public f(JSONObject jSONObject) {
        p.k(jSONObject, IconCompat.EXTRA_OBJ);
        this.imageKey = jSONObject.optString("imageKey");
        this.matteKey = jSONObject.optString("matteKey");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    g gVar = new g(jSONObjectOptJSONObject);
                    if ((!gVar.d().isEmpty()) && ((SVGAVideoShapeEntity) b0.f0(gVar.d())).e() && arrayList.size() > 0) {
                        gVar.f(((g) b0.r0(arrayList)).d());
                    }
                    arrayList.add(gVar);
                }
            }
        }
        this.frames = b0.O0(arrayList);
    }

    public final List<g> a() {
        return this.frames;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImageKey() {
        return this.imageKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMatteKey() {
        return this.matteKey;
    }

    public f(SpriteEntity spriteEntity) {
        List<g> listK;
        p.k(spriteEntity, IconCompat.EXTRA_OBJ);
        this.imageKey = spriteEntity.imageKey;
        this.matteKey = spriteEntity.matteKey;
        List<FrameEntity> list = spriteEntity.frames;
        if (list != null) {
            listK = new ArrayList<>(t.v(list, 10));
            g gVar = null;
            for (FrameEntity frameEntity : list) {
                p.f(frameEntity, "it");
                g gVar2 = new g(frameEntity);
                if ((!gVar2.d().isEmpty()) && ((SVGAVideoShapeEntity) b0.f0(gVar2.d())).e() && gVar != null) {
                    gVar2.f(gVar.d());
                }
                listK.add(gVar2);
                gVar = gVar2;
            }
        } else {
            listK = s.k();
        }
        this.frames = listK;
    }
}
