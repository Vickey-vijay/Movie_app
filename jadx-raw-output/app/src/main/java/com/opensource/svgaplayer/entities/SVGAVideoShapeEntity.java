package com.opensource.svgaplayer.entities;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.graphics.drawable.IconCompat;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.opensource.svgaplayer.proto.ShapeEntity;
import com.opensource.svgaplayer.proto.Transform;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import lk.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sb.b;
import sb.d;
import sb.e;

/* JADX INFO: compiled from: SVGAVideoShapeEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002\u00033B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b0\u00101B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0007¢\u0006\u0004\b0\u00102J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0007H\u0002R$\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R@\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00152\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR(\u0010 \u001a\u0004\u0018\u00010\u001c2\b\u0010\u0010\u001a\u0004\u0018\u00010\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR(\u0010%\u001a\u0004\u0018\u00010!2\b\u0010\u0010\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R$\u0010,\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b\u0017\u0010)\"\u0004\b*\u0010+R\u0011\u0010/\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b'\u0010.¨\u00064"}, d2 = {"Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity;", "", "Lmj/r;", "a", "Lorg/json/JSONObject;", IconCompat.EXTRA_OBJ, InneractiveMediationDefs.GENDER_MALE, "Lcom/opensource/svgaplayer/proto/ShapeEntity;", "l", "g", InneractiveMediationDefs.GENDER_FEMALE, "i", "h", CampaignEx.JSON_KEY_AD_K, "j", "Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;", "<set-?>", "Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;", "getType", "()Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;", "type", "", "", "b", "Ljava/util/Map;", "getArgs", "()Ljava/util/Map;", "args", "Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$a;", "c", "Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$a;", "()Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$a;", "styles", "Landroid/graphics/Matrix;", "d", "Landroid/graphics/Matrix;", "()Landroid/graphics/Matrix;", "transform", "Landroid/graphics/Path;", "e", "Landroid/graphics/Path;", "()Landroid/graphics/Path;", "setShapePath", "(Landroid/graphics/Path;)V", "shapePath", "", "()Z", "isKeep", "<init>", "(Lorg/json/JSONObject;)V", "(Lcom/opensource/svgaplayer/proto/ShapeEntity;)V", "Type", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class SVGAVideoShapeEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Type type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Map<String, ? extends Object> args;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public a styles;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Matrix transform;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Path shapePath;

    /* JADX INFO: compiled from: SVGAVideoShapeEntity.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;", "", "(Ljava/lang/String;I)V", "shape", "rect", "ellipse", "keep", "com.opensource.svgaplayer"}, k = 1, mv = {1, 1, 15})
    public enum Type {
        shape,
        rect,
        ellipse,
        keep
    }

    /* JADX INFO: compiled from: SVGAVideoShapeEntity.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)R*\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR*\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00168\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\n\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00168\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001e\u0010\u001bR*\u0010!\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b \u0010\bR*\u0010'\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\"8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010#\u001a\u0004\b\u000f\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$a;", "", "", "<set-?>", "a", "I", "()I", "h", "(I)V", VastAttributes.FILL_COLOR, "b", InneractiveMediationDefs.GENDER_FEMALE, InneractiveMediationDefs.GENDER_MALE, VastAttributes.STROKE_COLOR, "", "c", "F", "g", "()F", "n", "(F)V", "strokeWidth", "", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "i", "(Ljava/lang/String;)V", "lineCap", "e", CampaignEx.JSON_KEY_AD_K, "lineJoin", "l", "miterLimit", "", "[F", "()[F", "j", "([F)V", "lineDash", "<init>", "()V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public int fill;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public int stroke;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public float strokeWidth;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public int miterLimit;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public String lineCap = "butt";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public String lineJoin = "miter";

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public float[] lineDash = new float[0];

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getFill() {
            return this.fill;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLineCap() {
            return this.lineCap;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float[] getLineDash() {
            return this.lineDash;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLineJoin() {
            return this.lineJoin;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getMiterLimit() {
            return this.miterLimit;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getStroke() {
            return this.stroke;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final float getStrokeWidth() {
            return this.strokeWidth;
        }

        public final void h(int i10) {
            this.fill = i10;
        }

        public final void i(String str) {
            p.k(str, "<set-?>");
            this.lineCap = str;
        }

        public final void j(float[] fArr) {
            p.k(fArr, "<set-?>");
            this.lineDash = fArr;
        }

        public final void k(String str) {
            p.k(str, "<set-?>");
            this.lineJoin = str;
        }

        public final void l(int i10) {
            this.miterLimit = i10;
        }

        public final void m(int i10) {
            this.stroke = i10;
        }

        public final void n(float f10) {
            this.strokeWidth = f10;
        }
    }

    public SVGAVideoShapeEntity(JSONObject jSONObject) throws JSONException {
        p.k(jSONObject, IconCompat.EXTRA_OBJ);
        this.type = Type.shape;
        m(jSONObject);
        g(jSONObject);
        i(jSONObject);
        k(jSONObject);
    }

    public final void a() {
        if (this.shapePath != null) {
            return;
        }
        e.a().reset();
        Type type = this.type;
        if (type == Type.shape) {
            Map<String, ? extends Object> map = this.args;
            Object obj = map != null ? map.get("d") : null;
            String str = (String) (obj instanceof String ? obj : null);
            if (str != null) {
                new b(str).a(e.a());
            }
        } else if (type == Type.ellipse) {
            Map<String, ? extends Object> map2 = this.args;
            Object obj2 = map2 != null ? map2.get(VastAttributes.HORIZONTAL_POSITION) : null;
            if (!(obj2 instanceof Number)) {
                obj2 = null;
            }
            Number number = (Number) obj2;
            if (number == null) {
                return;
            }
            Map<String, ? extends Object> map3 = this.args;
            Object obj3 = map3 != null ? map3.get(VastAttributes.VERTICAL_POSITION) : null;
            if (!(obj3 instanceof Number)) {
                obj3 = null;
            }
            Number number2 = (Number) obj3;
            if (number2 == null) {
                return;
            }
            Map<String, ? extends Object> map4 = this.args;
            Object obj4 = map4 != null ? map4.get("radiusX") : null;
            if (!(obj4 instanceof Number)) {
                obj4 = null;
            }
            Number number3 = (Number) obj4;
            if (number3 == null) {
                return;
            }
            Map<String, ? extends Object> map5 = this.args;
            Object obj5 = map5 != null ? map5.get("radiusY") : null;
            Number number4 = (Number) (obj5 instanceof Number ? obj5 : null);
            if (number4 == null) {
                return;
            }
            float fFloatValue = number.floatValue();
            float fFloatValue2 = number2.floatValue();
            float fFloatValue3 = number3.floatValue();
            float fFloatValue4 = number4.floatValue();
            e.a().addOval(new RectF(fFloatValue - fFloatValue3, fFloatValue2 - fFloatValue4, fFloatValue + fFloatValue3, fFloatValue2 + fFloatValue4), Path.Direction.CW);
        } else if (type == Type.rect) {
            Map<String, ? extends Object> map6 = this.args;
            Object obj6 = map6 != null ? map6.get(VastAttributes.HORIZONTAL_POSITION) : null;
            if (!(obj6 instanceof Number)) {
                obj6 = null;
            }
            Number number5 = (Number) obj6;
            if (number5 == null) {
                return;
            }
            Map<String, ? extends Object> map7 = this.args;
            Object obj7 = map7 != null ? map7.get(VastAttributes.VERTICAL_POSITION) : null;
            if (!(obj7 instanceof Number)) {
                obj7 = null;
            }
            Number number6 = (Number) obj7;
            if (number6 == null) {
                return;
            }
            Map<String, ? extends Object> map8 = this.args;
            Object obj8 = map8 != null ? map8.get("width") : null;
            if (!(obj8 instanceof Number)) {
                obj8 = null;
            }
            Number number7 = (Number) obj8;
            if (number7 == null) {
                return;
            }
            Map<String, ? extends Object> map9 = this.args;
            Object obj9 = map9 != null ? map9.get("height") : null;
            if (!(obj9 instanceof Number)) {
                obj9 = null;
            }
            Number number8 = (Number) obj9;
            if (number8 == null) {
                return;
            }
            Map<String, ? extends Object> map10 = this.args;
            Object obj10 = map10 != null ? map10.get("cornerRadius") : null;
            Number number9 = (Number) (obj10 instanceof Number ? obj10 : null);
            if (number9 == null) {
                return;
            }
            float fFloatValue5 = number5.floatValue();
            float fFloatValue6 = number6.floatValue();
            float fFloatValue7 = number7.floatValue();
            float fFloatValue8 = number8.floatValue();
            float fFloatValue9 = number9.floatValue();
            e.a().addRoundRect(new RectF(fFloatValue5, fFloatValue6, fFloatValue7 + fFloatValue5, fFloatValue8 + fFloatValue6), fFloatValue9, fFloatValue9, Path.Direction.CW);
        }
        Path path = new Path();
        this.shapePath = path;
        path.set(e.a());
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Path getShapePath() {
        return this.shapePath;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getStyles() {
        return this.styles;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Matrix getTransform() {
        return this.transform;
    }

    public final boolean e() {
        return this.type == Type.keep;
    }

    public final void f(ShapeEntity shapeEntity) {
        String str;
        HashMap map = new HashMap();
        ShapeEntity.ShapeArgs shapeArgs = shapeEntity.shape;
        if (shapeArgs != null && (str = shapeArgs.f43134d) != null) {
            map.put("d", str);
        }
        ShapeEntity.EllipseArgs ellipseArgs = shapeEntity.ellipse;
        if (ellipseArgs != null) {
            Float fValueOf = ellipseArgs.f43121x;
            if (fValueOf == null) {
                fValueOf = Float.valueOf(0.0f);
            }
            map.put(VastAttributes.HORIZONTAL_POSITION, fValueOf);
            Float fValueOf2 = ellipseArgs.f43122y;
            if (fValueOf2 == null) {
                fValueOf2 = Float.valueOf(0.0f);
            }
            map.put(VastAttributes.VERTICAL_POSITION, fValueOf2);
            Float fValueOf3 = ellipseArgs.radiusX;
            if (fValueOf3 == null) {
                fValueOf3 = Float.valueOf(0.0f);
            }
            map.put("radiusX", fValueOf3);
            Float fValueOf4 = ellipseArgs.radiusY;
            if (fValueOf4 == null) {
                fValueOf4 = Float.valueOf(0.0f);
            }
            map.put("radiusY", fValueOf4);
        }
        ShapeEntity.RectArgs rectArgs = shapeEntity.rect;
        if (rectArgs != null) {
            Float fValueOf5 = rectArgs.f43127x;
            if (fValueOf5 == null) {
                fValueOf5 = Float.valueOf(0.0f);
            }
            map.put(VastAttributes.HORIZONTAL_POSITION, fValueOf5);
            Float fValueOf6 = rectArgs.f43128y;
            if (fValueOf6 == null) {
                fValueOf6 = Float.valueOf(0.0f);
            }
            map.put(VastAttributes.VERTICAL_POSITION, fValueOf6);
            Float fValueOf7 = rectArgs.width;
            if (fValueOf7 == null) {
                fValueOf7 = Float.valueOf(0.0f);
            }
            map.put("width", fValueOf7);
            Float fValueOf8 = rectArgs.height;
            if (fValueOf8 == null) {
                fValueOf8 = Float.valueOf(0.0f);
            }
            map.put("height", fValueOf8);
            Float fValueOf9 = rectArgs.cornerRadius;
            if (fValueOf9 == null) {
                fValueOf9 = Float.valueOf(0.0f);
            }
            map.put("cornerRadius", fValueOf9);
        }
        this.args = map;
    }

    public final void g(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("args");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            p.f(itKeys, "values.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectOptJSONObject.get(next);
                if (obj != null) {
                    map.put(next, obj);
                }
            }
            this.args = map;
        }
    }

    public final Type getType() {
        return this.type;
    }

    public final void h(ShapeEntity shapeEntity) {
        ShapeEntity.ShapeStyle shapeStyle = shapeEntity.styles;
        if (shapeStyle != null) {
            a aVar = new a();
            ShapeEntity.ShapeStyle.RGBAColor rGBAColor = shapeStyle.fill;
            if (rGBAColor != null) {
                Float f10 = rGBAColor.f43138a;
                float f11 = 255;
                int iFloatValue = (int) ((f10 != null ? f10.floatValue() : 0.0f) * f11);
                Float f12 = rGBAColor.f43141r;
                int iFloatValue2 = (int) ((f12 != null ? f12.floatValue() : 0.0f) * f11);
                Float f13 = rGBAColor.f43140g;
                int iFloatValue3 = (int) ((f13 != null ? f13.floatValue() : 0.0f) * f11);
                Float f14 = rGBAColor.f43139b;
                aVar.h(Color.argb(iFloatValue, iFloatValue2, iFloatValue3, (int) ((f14 != null ? f14.floatValue() : 0.0f) * f11)));
            }
            ShapeEntity.ShapeStyle.RGBAColor rGBAColor2 = shapeStyle.stroke;
            if (rGBAColor2 != null) {
                Float f15 = rGBAColor2.f43138a;
                float f16 = 255;
                int iFloatValue4 = (int) ((f15 != null ? f15.floatValue() : 0.0f) * f16);
                Float f17 = rGBAColor2.f43141r;
                int iFloatValue5 = (int) ((f17 != null ? f17.floatValue() : 0.0f) * f16);
                Float f18 = rGBAColor2.f43140g;
                int iFloatValue6 = (int) ((f18 != null ? f18.floatValue() : 0.0f) * f16);
                Float f19 = rGBAColor2.f43139b;
                aVar.m(Color.argb(iFloatValue4, iFloatValue5, iFloatValue6, (int) ((f19 != null ? f19.floatValue() : 0.0f) * f16)));
            }
            Float f20 = shapeStyle.strokeWidth;
            aVar.n(f20 != null ? f20.floatValue() : 0.0f);
            ShapeEntity.ShapeStyle.LineCap lineCap = shapeStyle.lineCap;
            if (lineCap != null) {
                int i10 = d.$EnumSwitchMapping$1[lineCap.ordinal()];
                if (i10 == 1) {
                    aVar.i("butt");
                } else if (i10 == 2) {
                    aVar.i("round");
                } else if (i10 == 3) {
                    aVar.i("square");
                }
            }
            ShapeEntity.ShapeStyle.LineJoin lineJoin = shapeStyle.lineJoin;
            if (lineJoin != null) {
                int i11 = d.$EnumSwitchMapping$2[lineJoin.ordinal()];
                if (i11 == 1) {
                    aVar.k("bevel");
                } else if (i11 == 2) {
                    aVar.k("miter");
                } else if (i11 == 3) {
                    aVar.k("round");
                }
            }
            Float f21 = shapeStyle.miterLimit;
            aVar.l((int) (f21 != null ? f21.floatValue() : 0.0f));
            aVar.j(new float[3]);
            Float f22 = shapeStyle.lineDashI;
            if (f22 != null) {
                aVar.getLineDash()[0] = f22.floatValue();
            }
            Float f23 = shapeStyle.lineDashII;
            if (f23 != null) {
                aVar.getLineDash()[1] = f23.floatValue();
            }
            Float f24 = shapeStyle.lineDashIII;
            if (f24 != null) {
                aVar.getLineDash()[2] = f24.floatValue();
            }
            this.styles = aVar;
        }
    }

    public final void i(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("styles");
        if (jSONObjectOptJSONObject != null) {
            a aVar = new a();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(VastAttributes.FILL_COLOR);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() == 4) {
                double d10 = 255;
                aVar.h(Color.argb((int) (jSONArrayOptJSONArray.optDouble(3) * d10), (int) (jSONArrayOptJSONArray.optDouble(0) * d10), (int) (jSONArrayOptJSONArray.optDouble(1) * d10), (int) (jSONArrayOptJSONArray.optDouble(2) * d10)));
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(VastAttributes.STROKE_COLOR);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() == 4) {
                double d11 = 255;
                aVar.m(Color.argb((int) (jSONArrayOptJSONArray2.optDouble(3) * d11), (int) (jSONArrayOptJSONArray2.optDouble(0) * d11), (int) (jSONArrayOptJSONArray2.optDouble(1) * d11), (int) (jSONArrayOptJSONArray2.optDouble(2) * d11)));
            }
            aVar.n((float) jSONObjectOptJSONObject.optDouble("strokeWidth", 0.0d));
            String strOptString = jSONObjectOptJSONObject.optString("lineCap", "butt");
            p.f(strOptString, "it.optString(\"lineCap\", \"butt\")");
            aVar.i(strOptString);
            String strOptString2 = jSONObjectOptJSONObject.optString("lineJoin", "miter");
            p.f(strOptString2, "it.optString(\"lineJoin\", \"miter\")");
            aVar.k(strOptString2);
            aVar.l(jSONObjectOptJSONObject.optInt("miterLimit", 0));
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("lineDash");
            if (jSONArrayOptJSONArray3 != null) {
                aVar.j(new float[jSONArrayOptJSONArray3.length()]);
                int length = jSONArrayOptJSONArray3.length();
                for (int i10 = 0; i10 < length; i10++) {
                    aVar.getLineDash()[i10] = (float) jSONArrayOptJSONArray3.optDouble(i10, 0.0d);
                }
            }
            this.styles = aVar;
        }
    }

    public final void j(ShapeEntity shapeEntity) {
        Transform transform = shapeEntity.transform;
        if (transform != null) {
            Matrix matrix = new Matrix();
            float[] fArr = new float[9];
            Float f10 = transform.f43165a;
            float fFloatValue = f10 != null ? f10.floatValue() : 1.0f;
            Float f11 = transform.f43166b;
            float fFloatValue2 = f11 != null ? f11.floatValue() : 0.0f;
            Float f12 = transform.f43167c;
            float fFloatValue3 = f12 != null ? f12.floatValue() : 0.0f;
            Float f13 = transform.f43168d;
            float fFloatValue4 = f13 != null ? f13.floatValue() : 1.0f;
            Float f14 = transform.tx;
            float fFloatValue5 = f14 != null ? f14.floatValue() : 0.0f;
            Float f15 = transform.ty;
            float fFloatValue6 = f15 != null ? f15.floatValue() : 0.0f;
            fArr[0] = fFloatValue;
            fArr[1] = fFloatValue3;
            fArr[2] = fFloatValue5;
            fArr[3] = fFloatValue2;
            fArr[4] = fFloatValue4;
            fArr[5] = fFloatValue6;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            fArr[8] = 1.0f;
            matrix.setValues(fArr);
            this.transform = matrix;
        }
    }

    public final void l(ShapeEntity shapeEntity) {
        Type type;
        ShapeEntity.ShapeType shapeType = shapeEntity.type;
        if (shapeType != null) {
            int i10 = d.$EnumSwitchMapping$0[shapeType.ordinal()];
            if (i10 == 1) {
                type = Type.shape;
            } else if (i10 == 2) {
                type = Type.rect;
            } else if (i10 == 3) {
                type = Type.ellipse;
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                type = Type.keep;
            }
            this.type = type;
        }
    }

    public final void k(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("transform");
        if (jSONObjectOptJSONObject != null) {
            Matrix matrix = new Matrix();
            double dOptDouble = jSONObjectOptJSONObject.optDouble("a", 1.0d);
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("b", 0.0d);
            float f10 = (float) 0.0d;
            matrix.setValues(new float[]{(float) dOptDouble, (float) jSONObjectOptJSONObject.optDouble("c", 0.0d), (float) jSONObjectOptJSONObject.optDouble("tx", 0.0d), (float) dOptDouble2, (float) jSONObjectOptJSONObject.optDouble("d", 1.0d), (float) jSONObjectOptJSONObject.optDouble("ty", 0.0d), f10, f10, (float) 1.0d});
            this.transform = matrix;
        }
    }

    public final void m(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("type");
        if (strOptString != null) {
            if (x.E(strOptString, "shape", true)) {
                this.type = Type.shape;
                return;
            }
            if (x.E(strOptString, "rect", true)) {
                this.type = Type.rect;
            } else if (x.E(strOptString, "ellipse", true)) {
                this.type = Type.ellipse;
            } else if (x.E(strOptString, "keep", true)) {
                this.type = Type.keep;
            }
        }
    }

    public SVGAVideoShapeEntity(ShapeEntity shapeEntity) {
        p.k(shapeEntity, IconCompat.EXTRA_OBJ);
        this.type = Type.shape;
        l(shapeEntity);
        f(shapeEntity);
        h(shapeEntity);
        j(shapeEntity);
    }
}
