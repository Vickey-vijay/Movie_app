package d5;

import android.content.res.Resources;
import android.text.TextUtils;
import chuangyuan.ycj.videolibrary.R$string;
import com.google.android.exoplayer2.Format;
import g5.k0;
import g5.p;
import java.util.Locale;

/* JADX INFO: compiled from: DefaultTrackNameProvider.java */
/* JADX INFO: loaded from: classes9.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f51864a;

    public final String e(Format format) {
        String strJ = j(f(format), h(format));
        return TextUtils.isEmpty(strJ) ? d(format) : strJ;
    }

    public final String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f51864a.getString(R$string.exo_item_list, string, str);
            }
        }
        return string;
    }

    public static int i(Format format) {
        int iH = p.h(format.f18970j);
        if (iH != -1) {
            return iH;
        }
        if (p.k(format.f18967g) != null) {
            return 2;
        }
        if (p.b(format.f18967g) != null) {
            return 1;
        }
        if (format.f18975o == -1 && format.f18976p == -1) {
            return (format.f18983w == -1 && format.f18984x == -1) ? -1 : 1;
        }
        return 2;
    }

    public final String b(Format format) {
        int i10 = format.f18983w;
        if (i10 == -1 || i10 < 1) {
            return "";
        }
        if (i10 == 1) {
            return this.f51864a.getString(R$string.exo_track_mono);
        }
        if (i10 == 2) {
            return this.f51864a.getString(R$string.exo_track_stereo);
        }
        if (i10 == 6 || i10 == 7) {
            return this.f51864a.getString(R$string.exo_track_surround_5_point_1);
        }
        return i10 != 8 ? this.f51864a.getString(R$string.exo_track_surround) : this.f51864a.getString(R$string.exo_track_surround_7_point_1);
    }

    public final String c(Format format) {
        int i10 = format.f18966f;
        return i10 == -1 ? "" : this.f51864a.getString(R$string.exo_track_bitrate, Float.valueOf(i10 / 1000000.0f));
    }

    public final String d(Format format) {
        return TextUtils.isEmpty(format.f18963c) ? "" : format.f18963c;
    }

    public final String f(Format format) {
        String str = format.B;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        return (k0.f53108a >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayName();
    }

    public final String g(Format format) {
        int i10 = format.f18975o;
        int i11 = format.f18976p;
        return (i10 == -1 || i11 == -1) ? "" : this.f51864a.getString(R$string.exo_track_resolution, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public final String h(Format format) {
        String string = (format.f18965e & 2) != 0 ? this.f51864a.getString(R$string.exo_track_role_alternate) : "";
        if ((format.f18965e & 4) != 0) {
            string = j(string, this.f51864a.getString(R$string.exo_track_role_supplementary));
        }
        if ((format.f18965e & 8) != 0) {
            string = j(string, this.f51864a.getString(R$string.exo_track_role_commentary));
        }
        return (format.f18965e & 1088) != 0 ? j(string, this.f51864a.getString(R$string.exo_track_role_closed_captions)) : string;
    }

    public a(Resources resources) {
        this.f51864a = (Resources) g5.a.e(resources);
    }

    @Override // d5.d
    public String a(Format format) {
        String strE;
        int i10 = i(format);
        if (i10 == 2) {
            strE = j(h(format), g(format), c(format));
        } else if (i10 == 1) {
            strE = j(e(format), b(format), c(format));
        } else {
            strE = e(format);
        }
        if (strE.length() == 0) {
            return this.f51864a.getString(R$string.exo_track_unknown);
        }
        return strE;
    }
}
