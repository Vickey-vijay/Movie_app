package sb;

import android.graphics.Path;
import androidx.exifinterface.media.ExifInterface;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.StringTokenizer;
import kotlin.Metadata;
import lk.a0;
import lk.x;

/* JADX INFO: compiled from: SVGAPathEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002R\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0013"}, d2 = {"Lsb/b;", "", "Landroid/graphics/Path;", "toPath", "Lmj/r;", "a", "finalPath", "", "method", "Ljava/util/StringTokenizer;", "args", "b", "Ljava/lang/String;", "replacedValue", "Landroid/graphics/Path;", "cachedPath", "originValue", "<init>", "(Ljava/lang/String;)V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String replacedValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Path cachedPath;

    public b(String str) {
        p.k(str, "originValue");
        this.replacedValue = a0.X(str, StringUtils.COMMA, false, 2, null) ? x.N(str, StringUtils.COMMA, Z7.f27998r, false, 4, null) : str;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:62:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x0110  */
    /* JADX WARN: Code duplicated, block: B:67:0x011b  */
    /* JADX WARN: Code duplicated, block: B:68:0x011f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public final void b(Path path, String str, StringTokenizer stringTokenizer) {
        tb.a aVar;
        int i10 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                String strNextToken = stringTokenizer.nextToken();
                p.f(strNextToken, "s");
                if (!(strNextToken.length() == 0)) {
                    if (i10 == 0) {
                        f10 = Float.parseFloat(strNextToken);
                    }
                    if (i10 == 1) {
                        f11 = Float.parseFloat(strNextToken);
                    }
                    if (i10 == 2) {
                        f12 = Float.parseFloat(strNextToken);
                    }
                    if (i10 == 3) {
                        f13 = Float.parseFloat(strNextToken);
                    }
                    if (i10 == 4) {
                        f14 = Float.parseFloat(strNextToken);
                    }
                    if (i10 == 5) {
                        f15 = Float.parseFloat(strNextToken);
                    }
                    i10++;
                }
            } catch (Exception unused) {
            }
        }
        float f16 = f10;
        float f17 = f11;
        float f18 = f12;
        float f19 = f13;
        tb.a aVar2 = new tb.a(0.0f, 0.0f, 0.0f);
        if (!p.e(str, "M")) {
            if (p.e(str, InneractiveMediationDefs.GENDER_MALE)) {
                path.rMoveTo(f16, f17);
                aVar = new tb.a(aVar2.getIo.bidmachine.iab.vast.tags.VastAttributes.HORIZONTAL_POSITION java.lang.String() + f16, aVar2.getIo.bidmachine.iab.vast.tags.VastAttributes.VERTICAL_POSITION java.lang.String() + f17, 0.0f);
            }
            if (p.e(str, "L")) {
                path.lineTo(f16, f17);
            } else if (p.e(str, "l")) {
                path.rLineTo(f16, f17);
            }
            if (p.e(str, "C")) {
                path.cubicTo(f16, f17, f18, f19, f14, f15);
            } else if (p.e(str, "c")) {
                path.rCubicTo(f16, f17, f18, f19, f14, f15);
            }
            if (p.e(str, "Q")) {
                path.quadTo(f16, f17, f18, f19);
            } else if (p.e(str, "q")) {
                path.rQuadTo(f16, f17, f18, f19);
            }
            if (p.e(str, "H")) {
                path.lineTo(f16, aVar.getIo.bidmachine.iab.vast.tags.VastAttributes.VERTICAL_POSITION java.lang.String());
            } else if (p.e(str, "h")) {
                path.rLineTo(f16, 0.0f);
            }
            if (p.e(str, ExifInterface.GPS_MEASUREMENT_INTERRUPTED)) {
                path.lineTo(aVar.getIo.bidmachine.iab.vast.tags.VastAttributes.HORIZONTAL_POSITION java.lang.String(), f16);
            } else if (p.e(str, "v")) {
                path.rLineTo(0.0f, f16);
            }
            if (p.e(str, "Z")) {
                path.close();
            } else if (p.e(str, "z")) {
                path.close();
            }
        }
        path.moveTo(f16, f17);
        aVar2 = new tb.a(f16, f17, 0.0f);
        aVar = aVar2;
        if (p.e(str, "L")) {
            path.lineTo(f16, f17);
        } else if (p.e(str, "l")) {
            path.rLineTo(f16, f17);
        }
        if (p.e(str, "C")) {
            path.cubicTo(f16, f17, f18, f19, f14, f15);
        } else if (p.e(str, "c")) {
            path.rCubicTo(f16, f17, f18, f19, f14, f15);
        }
        if (p.e(str, "Q")) {
            path.quadTo(f16, f17, f18, f19);
        } else if (p.e(str, "q")) {
            path.rQuadTo(f16, f17, f18, f19);
        }
        if (p.e(str, "H")) {
            path.lineTo(f16, aVar.getIo.bidmachine.iab.vast.tags.VastAttributes.VERTICAL_POSITION java.lang.String());
        } else if (p.e(str, "h")) {
            path.rLineTo(f16, 0.0f);
        }
        if (p.e(str, ExifInterface.GPS_MEASUREMENT_INTERRUPTED)) {
            path.lineTo(aVar.getIo.bidmachine.iab.vast.tags.VastAttributes.HORIZONTAL_POSITION java.lang.String(), f16);
        } else if (p.e(str, "v")) {
            path.rLineTo(0.0f, f16);
        }
        if (p.e(str, "Z")) {
            path.close();
        } else if (p.e(str, "z")) {
            path.close();
        }
    }

    public final void a(Path path) {
        boolean z10;
        p.k(path, "toPath");
        Path path2 = this.cachedPath;
        if (path2 != null) {
            path.set(path2);
            return;
        }
        Path path3 = new Path();
        StringTokenizer stringTokenizer = new StringTokenizer(this.replacedValue, "MLHVCSQRAZmlhvcsqraz", true);
        String str = "";
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            p.f(strNextToken, "segment");
            if (strNextToken.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (c.f67199a.contains(strNextToken)) {
                    if (p.e(strNextToken, "Z") || p.e(strNextToken, "z")) {
                        b(path3, strNextToken, new StringTokenizer("", ""));
                    }
                    str = strNextToken;
                } else {
                    b(path3, str, new StringTokenizer(strNextToken, Z7.f27998r));
                }
            }
        }
        this.cachedPath = path3;
        path.set(path3);
    }
}
