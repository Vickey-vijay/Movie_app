package com.mbridge.msdk.config.dynamic;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.view.GravityCompat;
import com.mbridge.msdk.dycreator.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.impl.A2;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: compiled from: ComponentResource.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile c f33872d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SoftReference<HashMap<String, com.mbridge.msdk.config.dynamic.utils.c>> f33873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f33874b = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> f33875c;

    public static c a() {
        if (f33872d == null) {
            synchronized (c.class) {
                if (f33872d == null) {
                    f33872d = new c();
                }
            }
        }
        return f33872d;
    }

    public HashMap b() {
        SoftReference<HashMap<String, com.mbridge.msdk.config.dynamic.utils.c>> softReference = this.f33873a;
        if (softReference == null || softReference.get() == null) {
            HashMap map = new HashMap(45);
            map.put("layout_width", com.mbridge.msdk.config.dynamic.utils.c.layout_width);
            map.put("layout_height", com.mbridge.msdk.config.dynamic.utils.c.layout_height);
            map.put("orientation", com.mbridge.msdk.config.dynamic.utils.c.orientation);
            map.put("layout_centerHorizontal", com.mbridge.msdk.config.dynamic.utils.c.layout_centerHorizontal);
            map.put("layout_centerVertical", com.mbridge.msdk.config.dynamic.utils.c.layout_centerVertical);
            map.put("layout_marginLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_marginLeft);
            map.put("layout_marginRight", com.mbridge.msdk.config.dynamic.utils.c.layout_marginRight);
            map.put("layout_margin", com.mbridge.msdk.config.dynamic.utils.c.layout_margin);
            map.put("layout_gravity", com.mbridge.msdk.config.dynamic.utils.c.layout_gravity);
            map.put("layout_alignParentRight", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentRight);
            map.put("layout_weight", com.mbridge.msdk.config.dynamic.utils.c.layout_weight);
            map.put("contentDescription", com.mbridge.msdk.config.dynamic.utils.c.contentDescription);
            map.put("gravity", com.mbridge.msdk.config.dynamic.utils.c.gravity);
            map.put("id", com.mbridge.msdk.config.dynamic.utils.c.id);
            map.put("layout_below", com.mbridge.msdk.config.dynamic.utils.c.layout_below);
            map.put("layout_above", com.mbridge.msdk.config.dynamic.utils.c.layout_above);
            map.put("layout_toLeftOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toLeftOf);
            map.put("layout_toRightOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toRightOf);
            map.put("layout_toEndOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toEndOf);
            map.put(A2.f54950g, com.mbridge.msdk.config.dynamic.utils.c.background);
            map.put("layout_marginTop", com.mbridge.msdk.config.dynamic.utils.c.layout_marginTop);
            map.put("layout_marginBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_marginBottom);
            map.put("layout_marginStart", com.mbridge.msdk.config.dynamic.utils.c.layout_marginStart);
            map.put("layout_marginEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_marginEnd);
            map.put("layout_alignParentBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentBottom);
            map.put("layout_alignParentTop", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentTop);
            map.put("layout_alignParentLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentLeft);
            map.put("layout_alignWithParentIfMissing", com.mbridge.msdk.config.dynamic.utils.c.layout_alignWithParentIfMissing);
            map.put("layout_alignTop", com.mbridge.msdk.config.dynamic.utils.c.layout_alignTop);
            map.put("layout_alignBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_alignBottom);
            map.put("layout_alignLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_alignLeft);
            map.put("layout_alignRight", com.mbridge.msdk.config.dynamic.utils.c.layout_alignRight);
            map.put("layout_centerInParent", com.mbridge.msdk.config.dynamic.utils.c.layout_centerInParent);
            map.put("layout_alignParentEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentEnd);
            this.f33873a = new SoftReference<>(map);
        }
        return this.f33873a.get();
    }

    public HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> c() {
        return this.f33875c;
    }

    public int d(String str) {
        if (this.f33874b != null) {
            String strI = com.mbridge.msdk.foundation.controller.c.n().i();
            if (TextUtils.isEmpty(strI)) {
                strI = this.f33874b.getPackageName();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strI);
            sb2.append(".R$");
            String[] strArrSplit = str.split("\\.");
            sb2.append(strArrSplit[1]);
            try {
                Class<?> cls = Class.forName(sb2.toString());
                Object objNewInstance = cls.newInstance();
                Field declaredField = cls.getDeclaredField(strArrSplit[2]);
                declaredField.setAccessible(true);
                return ((Integer) declaredField.get(objNewInstance)).intValue();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return 0;
    }

    public int e(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith("#")) {
                return Color.parseColor(str);
            }
            return 0;
        } catch (Exception e10) {
            q0.b("ComponentResource", e10.getMessage());
            return 0;
        }
    }

    public int c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            int i10 = 0;
            for (String str2 : str.split("\\|")) {
                int i11 = 7;
                switch (str2.toLowerCase()) {
                    case "top":
                        i11 = 48;
                        break;
                    case "bottom":
                        i11 = 80;
                        break;
                    case "left":
                        i11 = 3;
                        break;
                    case "right":
                        i11 = 5;
                        break;
                    case "center":
                        i11 = 17;
                        break;
                    case "center_horizontal":
                        i11 = 1;
                        break;
                    case "center_vertical":
                        i11 = 16;
                        break;
                    case "start":
                        i11 = GravityCompat.START;
                        break;
                    case "end":
                        i11 = GravityCompat.END;
                        break;
                    case "fill":
                        i11 = 119;
                        break;
                    case "fill_horizontal":
                        break;
                    case "fill_vertical":
                        i11 = 112;
                        break;
                    default:
                        continue;
                        break;
                }
                i10 |= i11;
            }
            return i10;
        } catch (Exception e10) {
            q0.b("ComponentResource", e10.getMessage());
            return 0;
        }
    }

    private c() {
        d();
    }

    public int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            int iIndexOf = str.indexOf("d");
            int iIndexOf2 = str.indexOf("s");
            if (iIndexOf == -1) {
                iIndexOf = iIndexOf2;
            }
            int i10 = Integer.parseInt(str.substring(0, iIndexOf));
            if (str.contains("d")) {
                return e.a(this.f33874b, i10);
            }
            str.contains("s");
            return i10;
        }
    }

    public int a(String str, String str2) {
        if (this.f33874b != null) {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                String strI = com.mbridge.msdk.foundation.controller.c.n().i();
                if (TextUtils.isEmpty(strI)) {
                    strI = this.f33874b.getPackageName();
                }
                return contextD.getResources().getIdentifier(str2, str, strI);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return 0;
    }

    private void d() {
        HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> map = new HashMap<>();
        this.f33875c = map;
        map.put("id", com.mbridge.msdk.config.dynamic.utils.c.id);
        this.f33875c.put(A2.f54950g, com.mbridge.msdk.config.dynamic.utils.c.background);
        this.f33875c.put("visibility", com.mbridge.msdk.config.dynamic.utils.c.visibility);
        this.f33875c.put("contentDescription", com.mbridge.msdk.config.dynamic.utils.c.contentDescription);
        this.f33875c.put(VastAttributes.PADDING, com.mbridge.msdk.config.dynamic.utils.c.padding);
        this.f33875c.put("paddingTop", com.mbridge.msdk.config.dynamic.utils.c.paddingTop);
        this.f33875c.put("paddingBottom", com.mbridge.msdk.config.dynamic.utils.c.paddingBottom);
        this.f33875c.put("paddingLeft", com.mbridge.msdk.config.dynamic.utils.c.paddingLeft);
        this.f33875c.put("paddingRight", com.mbridge.msdk.config.dynamic.utils.c.paddingRight);
        this.f33875c.put("paddingStart", com.mbridge.msdk.config.dynamic.utils.c.paddingStart);
        this.f33875c.put("paddingEnd", com.mbridge.msdk.config.dynamic.utils.c.paddingEnd);
        this.f33875c.put("layout_margin", com.mbridge.msdk.config.dynamic.utils.c.layout_margin);
        this.f33875c.put("layout_marginTop", com.mbridge.msdk.config.dynamic.utils.c.layout_marginTop);
        this.f33875c.put("layout_marginBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_marginBottom);
        this.f33875c.put("layout_marginLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_marginLeft);
        this.f33875c.put("layout_marginRight", com.mbridge.msdk.config.dynamic.utils.c.layout_marginRight);
        this.f33875c.put("layout_marginStart", com.mbridge.msdk.config.dynamic.utils.c.layout_marginStart);
        this.f33875c.put("layout_marginEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_marginEnd);
        this.f33875c.put("alpha", com.mbridge.msdk.config.dynamic.utils.c.alpha);
        this.f33875c.put(Key.ROTATION, com.mbridge.msdk.config.dynamic.utils.c.rotation);
        this.f33875c.put("scaleX", com.mbridge.msdk.config.dynamic.utils.c.scaleX);
        this.f33875c.put("scaleY", com.mbridge.msdk.config.dynamic.utils.c.scaleY);
        this.f33875c.put("translationX", com.mbridge.msdk.config.dynamic.utils.c.translationX);
        this.f33875c.put("translationY", com.mbridge.msdk.config.dynamic.utils.c.translationY);
        this.f33875c.put("tag", com.mbridge.msdk.config.dynamic.utils.c.tag);
        this.f33875c.put("text", com.mbridge.msdk.config.dynamic.utils.c.text);
        this.f33875c.put("textColor", com.mbridge.msdk.config.dynamic.utils.c.textColor);
        this.f33875c.put("textSize", com.mbridge.msdk.config.dynamic.utils.c.textSize);
        this.f33875c.put("textStyle", com.mbridge.msdk.config.dynamic.utils.c.textStyle);
        this.f33875c.put("maxLines", com.mbridge.msdk.config.dynamic.utils.c.maxLines);
        this.f33875c.put("minLines", com.mbridge.msdk.config.dynamic.utils.c.minLines);
        this.f33875c.put(com.safedk.android.analytics.reporters.b.f44683d, com.mbridge.msdk.config.dynamic.utils.c.lines);
        this.f33875c.put("ellipsize", com.mbridge.msdk.config.dynamic.utils.c.ellipsize);
        this.f33875c.put("gravity", com.mbridge.msdk.config.dynamic.utils.c.gravity);
        this.f33875c.put("drawablePadding", com.mbridge.msdk.config.dynamic.utils.c.drawablePadding);
        this.f33875c.put("drawableStart", com.mbridge.msdk.config.dynamic.utils.c.drawableStart);
        this.f33875c.put("drawableEnd", com.mbridge.msdk.config.dynamic.utils.c.drawableEnd);
        this.f33875c.put("drawableTop", com.mbridge.msdk.config.dynamic.utils.c.drawableTop);
        this.f33875c.put("drawableBottom", com.mbridge.msdk.config.dynamic.utils.c.drawableBottom);
        this.f33875c.put("singleLine", com.mbridge.msdk.config.dynamic.utils.c.singleLine);
        this.f33875c.put("marqueeRepeatLimit", com.mbridge.msdk.config.dynamic.utils.c.marqueeRepeatLimit);
        this.f33875c.put("includeFontPadding", com.mbridge.msdk.config.dynamic.utils.c.includeFontPadding);
        this.f33875c.put("lineSpacingExtra", com.mbridge.msdk.config.dynamic.utils.c.lineSpacingExtra);
        this.f33875c.put("lineSpacingMultiplier", com.mbridge.msdk.config.dynamic.utils.c.lineSpacingMultiplier);
        this.f33875c.put("hint", com.mbridge.msdk.config.dynamic.utils.c.hint);
        this.f33875c.put("inputType", com.mbridge.msdk.config.dynamic.utils.c.inputType);
        this.f33875c.put("maxLength", com.mbridge.msdk.config.dynamic.utils.c.maxLength);
        this.f33875c.put("textIsSelectable", com.mbridge.msdk.config.dynamic.utils.c.textIsSelectable);
        this.f33875c.put("cursorVisible", com.mbridge.msdk.config.dynamic.utils.c.cursorVisible);
        this.f33875c.put("backgroundTint", com.mbridge.msdk.config.dynamic.utils.c.backgroundTint);
        this.f33875c.put("allCaps", com.mbridge.msdk.config.dynamic.utils.c.allCaps);
        this.f33875c.put("src", com.mbridge.msdk.config.dynamic.utils.c.src);
        this.f33875c.put("scaleType", com.mbridge.msdk.config.dynamic.utils.c.scaleType);
        this.f33875c.put("adjustViewBounds", com.mbridge.msdk.config.dynamic.utils.c.adjustViewBounds);
        this.f33875c.put("maxWidth", com.mbridge.msdk.config.dynamic.utils.c.maxWidth);
        this.f33875c.put("maxHeight", com.mbridge.msdk.config.dynamic.utils.c.maxHeight);
        this.f33875c.put("tint", com.mbridge.msdk.config.dynamic.utils.c.tint);
        this.f33875c.put("divider", com.mbridge.msdk.config.dynamic.utils.c.divider);
        this.f33875c.put("dividerHeight", com.mbridge.msdk.config.dynamic.utils.c.dividerHeight);
        this.f33875c.put("scrollbars", com.mbridge.msdk.config.dynamic.utils.c.scrollbars);
        this.f33875c.put("listSelector", com.mbridge.msdk.config.dynamic.utils.c.listSelector);
        this.f33875c.put("stackFromBottom", com.mbridge.msdk.config.dynamic.utils.c.stackFromBottom);
        this.f33875c.put("transcriptMode", com.mbridge.msdk.config.dynamic.utils.c.transcriptMode);
        this.f33875c.put("numColumns", com.mbridge.msdk.config.dynamic.utils.c.numColumns);
        this.f33875c.put("verticalSpacing", com.mbridge.msdk.config.dynamic.utils.c.verticalSpacing);
        this.f33875c.put("horizontalSpacing", com.mbridge.msdk.config.dynamic.utils.c.horizontalSpacing);
        this.f33875c.put("stretchMode", com.mbridge.msdk.config.dynamic.utils.c.stretchMode);
        this.f33875c.put("columnWidth", com.mbridge.msdk.config.dynamic.utils.c.columnWidth);
        this.f33875c.put("fillViewport", com.mbridge.msdk.config.dynamic.utils.c.fillViewport);
        this.f33875c.put("scrollbarStyle", com.mbridge.msdk.config.dynamic.utils.c.scrollbarStyle);
        this.f33875c.put("orientation", com.mbridge.msdk.config.dynamic.utils.c.orientation);
        this.f33875c.put("weightSum", com.mbridge.msdk.config.dynamic.utils.c.weightSum);
        this.f33875c.put("baselineAligned", com.mbridge.msdk.config.dynamic.utils.c.baselineAligned);
        this.f33875c.put("measureWithLargestChild", com.mbridge.msdk.config.dynamic.utils.c.measureWithLargestChild);
        this.f33875c.put("ignoreGravity", com.mbridge.msdk.config.dynamic.utils.c.ignoreGravity);
        this.f33875c.put("foreground", com.mbridge.msdk.config.dynamic.utils.c.foreground);
        this.f33875c.put("foregroundGravity", com.mbridge.msdk.config.dynamic.utils.c.foregroundGravity);
        this.f33875c.put("measureAllChildren", com.mbridge.msdk.config.dynamic.utils.c.measureAllChildren);
        this.f33875c.put("style", com.mbridge.msdk.config.dynamic.utils.c.style);
        this.f33875c.put("progress", com.mbridge.msdk.config.dynamic.utils.c.progress);
        this.f33875c.put("max", com.mbridge.msdk.config.dynamic.utils.c.max);
        this.f33875c.put("progressDrawable", com.mbridge.msdk.config.dynamic.utils.c.progressDrawable);
    }

    public View a(String str, ViewGroup viewGroup, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (this.f33874b != null) {
            try {
                return new b(this.f33874b, aVar).a(str, viewGroup);
            } catch (Exception e10) {
                q0.b("ComponentResource", e10.getMessage());
            }
        }
        return null;
    }

    public int b(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("@color/")) {
            return 0;
        }
        return this.f33874b.getResources().getColor(a("color", str.substring(7)));
    }
}
