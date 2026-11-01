package com.yandex.div.svg;

import android.graphics.RectF;
import android.graphics.drawable.PictureDrawable;
import ck.i;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;
import java.io.InputStream;

/* JADX INFO: compiled from: SvgDecoder.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SvgDecoder {
    private final boolean useViewBoundsAsIntrinsicSize;

    public SvgDecoder(boolean z10) {
        this.useViewBoundsAsIntrinsicSize = z10;
    }

    public /* synthetic */ SvgDecoder(boolean z10, int i10, i iVar) {
        this((i10 & 1) != 0 ? true : z10);
    }

    public final PictureDrawable decode(InputStream inputStream) {
        float fH;
        float f10;
        try {
            SVG svgL = SVG.l(inputStream);
            RectF rectFG = svgL.g();
            if (this.useViewBoundsAsIntrinsicSize && rectFG != null) {
                fH = rectFG.width();
                f10 = rectFG.height();
            } else {
                fH = svgL.h();
                f10 = svgL.f();
            }
            if (rectFG == null && fH > 0.0f && f10 > 0.0f) {
                svgL.w(0.0f, 0.0f, fH, f10);
            }
            return new PictureDrawable(svgL.r());
        } catch (SVGParseException unused) {
            return null;
        }
    }
}
