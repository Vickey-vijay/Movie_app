package x4;

import android.graphics.PointF;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import g5.k0;
import g5.m;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: SsaStyle.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f74350b;

    /* JADX INFO: compiled from: SsaStyle.java */
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Pattern f74354c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Pattern f74355d = Pattern.compile(k0.y("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Pattern f74356e = Pattern.compile(k0.y("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Pattern f74357f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f74358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final PointF f74359b;

        public static int a(String str) {
            Matcher matcher = f74357f.matcher(str);
            if (matcher.find()) {
                return c.d(matcher.group(1));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f74354c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                try {
                    PointF pointFC = c(strGroup);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(strGroup);
                    if (iA != -1) {
                        i10 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        @Nullable
        public static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f74355d.matcher(str);
            Matcher matcher2 = f74356e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    m.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) g5.a.e(strGroup)).trim()), Float.parseFloat(((String) g5.a.e(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f74354c.matcher(str).replaceAll("");
        }

        public b(int i10, @Nullable PointF pointF) {
            this.f74358a = i10;
            this.f74359b = pointF;
        }
    }

    public static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: compiled from: SsaStyle.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f74351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f74352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f74353c;

        @Nullable
        public static a a(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), StringUtils.COMMA);
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                String strK0 = k0.K0(strArrSplit[i12].trim());
                strK0.hashCode();
                if (strK0.equals("name")) {
                    i10 = i12;
                } else if (strK0.equals("alignment")) {
                    i11 = i12;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, strArrSplit.length);
            }
            return null;
        }

        public a(int i10, int i11, int i12) {
            this.f74351a = i10;
            this.f74352b = i11;
            this.f74353c = i12;
        }
    }

    @Nullable
    public static c b(String str, a aVar) {
        g5.a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), StringUtils.COMMA);
        int length = strArrSplit.length;
        int i10 = aVar.f74353c;
        if (length != i10) {
            m.h("SsaStyle", k0.y("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            return new c(strArrSplit[aVar.f74351a].trim(), d(strArrSplit[aVar.f74352b]));
        } catch (RuntimeException e10) {
            m.i("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    public c(String str, int i10) {
        this.f74349a = str;
        this.f74350b = i10;
    }

    public static int d(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (c(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        m.h("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }
}
