package te;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: CameraConfigurationManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f72352d = "b";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f72353e = Pattern.compile(StringUtils.COMMA);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f72354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Point f72355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Point f72356c;

    public static int a(CharSequence charSequence, int i10) {
        Log.i("CameraManager", "findBestMotZoomValue");
        int i11 = 0;
        for (String str : f72353e.split(charSequence)) {
            try {
                double d10 = Double.parseDouble(str.trim());
                int i12 = (int) (10.0d * d10);
                if (Math.abs(((double) i10) - d10) < Math.abs(i10 - i11)) {
                    i11 = i12;
                }
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        Log.i("findBestMotZoomValue", i11 + "");
        return i11;
    }

    public static Point b(CharSequence charSequence, Point point) {
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        int i12 = 0;
        for (String str : f72353e.split(charSequence)) {
            String strTrim = str.trim();
            int iIndexOf = strTrim.indexOf(120);
            if (iIndexOf < 0) {
                Log.w(f72352d, "Bad preview-size: " + strTrim);
            } else {
                try {
                    int i13 = Integer.parseInt(strTrim.substring(0, iIndexOf));
                    int i14 = Integer.parseInt(strTrim.substring(iIndexOf + 1));
                    int iAbs = Math.abs(i13 - point.x) + Math.abs(i14 - point.y);
                    if (iAbs == 0) {
                        i12 = i14;
                        i11 = i13;
                        break;
                    }
                    if (iAbs < i10) {
                        i12 = i14;
                        i10 = iAbs;
                        i11 = i13;
                    }
                } catch (NumberFormatException unused) {
                    Log.w(f72352d, "Bad preview-size: " + strTrim);
                }
            }
        }
        if (i11 <= 0 || i12 <= 0) {
            return null;
        }
        return new Point(i11, i12);
    }

    public static Point d(Camera.Parameters parameters, Point point) {
        String str = parameters.get("preview-size-values");
        if (str == null) {
            str = parameters.get("preview-size-value");
        }
        Point pointB = null;
        if (str != null) {
            Log.d(f72352d, "preview-size-values parameter: " + str);
            pointB = b(str, point);
        }
        return pointB == null ? new Point((point.x >> 3) << 3, (point.y >> 3) << 3) : pointB;
    }

    public Point c() {
        return this.f72356c;
    }

    public Point e() {
        return this.f72355b;
    }

    public final void h(Camera.Parameters parameters) {
        Log.i("CameraManager", "setZoom");
        String str = parameters.get("zoom-supported");
        if (str == null || Boolean.parseBoolean(str)) {
            int iA = 5;
            String str2 = parameters.get("max-zoom");
            if (str2 != null) {
                try {
                    int i10 = (int) (Double.parseDouble(str2) * 10.0d);
                    if (5 > i10) {
                        iA = i10;
                    }
                } catch (NumberFormatException unused) {
                    Log.w(f72352d, "Bad max-zoom: " + str2);
                }
            }
            String str3 = parameters.get("taking-picture-zoom-max");
            if (str3 != null) {
                try {
                    int i11 = Integer.parseInt(str3);
                    if (iA > i11) {
                        iA = i11;
                    }
                } catch (NumberFormatException unused2) {
                    Log.w(f72352d, "Bad taking-picture-zoom-max: " + str3);
                }
            }
            String str4 = parameters.get("mot-zoom-values");
            if (str4 != null) {
                iA = a(str4, iA);
            }
            String str5 = parameters.get("mot-zoom-step");
            if (str5 != null) {
                try {
                    int i12 = (int) (Double.parseDouble(str5.trim()) * 10.0d);
                    if (i12 > 1) {
                        iA -= iA % i12;
                    }
                } catch (NumberFormatException unused3) {
                }
            }
            if (str2 != null || str4 != null) {
                parameters.set("zoom", String.valueOf(((double) iA) / 10.0d));
            }
            if (str3 != null) {
                parameters.set("taking-picture-zoom", iA);
            }
        }
    }

    public b(Context context) {
        this.f72354a = context;
    }

    public void f(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Display defaultDisplay = ((WindowManager) this.f72354a.getSystemService("window")).getDefaultDisplay();
        this.f72355b = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        Log.d(f72352d, "Screen resolution: " + this.f72355b);
        Point point = new Point();
        Point point2 = this.f72355b;
        point.x = point2.x;
        point.y = point2.y;
        int i10 = point2.x;
        int i11 = point2.y;
        if (i10 < i11) {
            point.x = i11;
            point.y = point2.x;
        }
        this.f72356c = d(parameters, point);
    }

    public void g(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Log.d(f72352d, "Setting preview size: " + this.f72356c);
        Point point = this.f72356c;
        parameters.setPreviewSize(point.x, point.y);
        h(parameters);
        camera.setDisplayOrientation(90);
        camera.setParameters(parameters);
    }
}
