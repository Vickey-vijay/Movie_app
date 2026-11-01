package b5;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import g5.k0;
import g5.m;
import g5.t;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: WebvttCueParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f4792b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f4793c = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f4794a = new StringBuilder();

    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String[] f4795e = new String[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f4798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String[] f4799d;

        public static a b() {
            return new a("", 0, "", new String[0]);
        }

        public a(String str, int i10, String str2, String[] strArr) {
            this.f4797b = i10;
            this.f4796a = str;
            this.f4798c = str2;
            this.f4799d = strArr;
        }

        public static a a(String str, int i10) {
            String str2;
            String[] strArr;
            String strTrim = str.trim();
            g5.a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(Z7.f27998r);
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrD0 = k0.D0(strTrim, "\\.");
            String str3 = strArrD0[0];
            if (strArrD0.length > 1) {
                strArr = (String[]) k0.r0(strArrD0, 1, strArrD0.length);
            } else {
                strArr = f4795e;
            }
            return new a(str3, i10, str2, strArr);
        }
    }

    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f4801c;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NonNull b bVar) {
            return this.f4800b - bVar.f4800b;
        }

        public b(int i10, d dVar) {
            this.f4800b = i10;
            this.f4801c = dVar;
        }
    }

    public static boolean i(@Nullable String str, Matcher matcher, t tVar, e.b bVar, StringBuilder sb2, List<d> list) {
        try {
            bVar.n(h.d(matcher.group(1))).h(h.d(matcher.group(2)));
            j(matcher.group(3), bVar);
            sb2.setLength(0);
            String strL = tVar.l();
            while (!TextUtils.isEmpty(strL)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strL.trim());
                strL = tVar.l();
            }
            k(str, sb2.toString(), bVar, list);
            return true;
        } catch (NumberFormatException unused) {
            m.h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return false;
        }
    }

    public static void b(@Nullable String str, a aVar, SpannableStringBuilder spannableStringBuilder, List<d> list, List<b> list2) {
        int i10 = aVar.f4797b;
        int length = spannableStringBuilder.length();
        String str2 = aVar.f4796a;
        str2.hashCode();
        switch (str2) {
            case "":
            case "c":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            default:
                return;
        }
        list2.clear();
        e(list, str, aVar, list2);
        int size = list2.size();
        for (int i11 = 0; i11 < size; i11++) {
            c(spannableStringBuilder, list2.get(i11).f4801c, i10, length);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, d dVar, int i10, int i11) {
        if (dVar == null) {
            return;
        }
        if (dVar.g() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(dVar.g()), i10, i11, 33);
        }
        if (dVar.k()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (dVar.l()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (dVar.j()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(dVar.b()), i10, i11, 33);
        }
        if (dVar.i()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(dVar.a()), i10, i11, 33);
        }
        if (dVar.c() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(dVar.c()), i10, i11, 33);
        }
        Layout.Alignment alignmentH = dVar.h();
        if (alignmentH != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(alignmentH), i10, i11, 33);
        }
        int iE = dVar.e();
        if (iE == 1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) dVar.d(), true), i10, i11, 33);
        } else if (iE == 2) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(dVar.d()), i10, i11, 33);
        } else {
            if (iE != 3) {
                return;
            }
            spannableStringBuilder.setSpan(new RelativeSizeSpan(dVar.d() / 100.0f), i10, i11, 33);
        }
    }

    public static int d(String str, int i10) {
        int iIndexOf = str.indexOf(62, i10);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    public static void j(String str, e.b bVar) {
        Matcher matcher = f4793c.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            try {
                if ("line".equals(strGroup)) {
                    l(strGroup2, bVar);
                } else if ("align".equals(strGroup)) {
                    bVar.p(o(strGroup2));
                } else if (C3426d4.i.L.equals(strGroup)) {
                    n(strGroup2, bVar);
                } else if ("size".equals(strGroup)) {
                    bVar.q(h.c(strGroup2));
                } else {
                    m.h("WebvttCueParser", "Unknown cue setting " + strGroup + StringUtils.PROCESS_POSTFIX_DELIMITER + strGroup2);
                }
            } catch (NumberFormatException unused) {
                m.h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static void k(@Nullable String str, String str2, e.b bVar, List<d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    a(str2.substring(i10, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) Z7.f27998r);
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int iD = i10 + 1;
                if (iD < str2.length()) {
                    boolean z10 = str2.charAt(iD) == '/';
                    iD = d(str2, iD);
                    int i11 = iD - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = iD - 1;
                    }
                    String strSubstring = str2.substring(i12, i11);
                    if (!strSubstring.trim().isEmpty()) {
                        String strF = f(strSubstring);
                        if (g(strF)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    a aVar = (a) arrayDeque.pop();
                                    b(str, aVar, spannableStringBuilder, list, arrayList);
                                    if (aVar.f4796a.equals(strF)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(a.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = iD;
            }
        }
        while (!arrayDeque.isEmpty()) {
            b(str, (a) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        b(str, a.b(), spannableStringBuilder, list, arrayList);
        bVar.o(spannableStringBuilder);
    }

    public static void l(String str, e.b bVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            bVar.j(m(str.substring(iIndexOf + 1)));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            bVar.i(h.c(str)).k(0);
            return;
        }
        int i10 = Integer.parseInt(str);
        if (i10 < 0) {
            i10--;
        }
        bVar.i(i10).k(1);
    }

    public static void n(String str, e.b bVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            bVar.m(m(str.substring(iIndexOf + 1)));
            str = str.substring(0, iIndexOf);
        }
        bVar.l(h.c(str));
    }

    public static void a(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                m.h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    public static void e(List<d> list, @Nullable String str, a aVar, List<b> list2) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = list.get(i10);
            int iF = dVar.f(str, aVar.f4796a, aVar.f4799d, aVar.f4798c);
            if (iF > 0) {
                list2.add(new b(iF, dVar));
            }
        }
        Collections.sort(list2);
    }

    public static String f(String str) {
        String strTrim = str.trim();
        g5.a.a(!strTrim.isEmpty());
        return k0.E0(strTrim, "[ \\.]")[0];
    }

    public static boolean g(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "lang":
                return true;
            default:
                return false;
        }
    }

    public static int m(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                m.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static int o(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                m.h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    public boolean h(t tVar, e.b bVar, List<d> list) {
        String strL = tVar.l();
        if (strL == null) {
            return false;
        }
        Pattern pattern = f4792b;
        Matcher matcher = pattern.matcher(strL);
        if (matcher.matches()) {
            return i(null, matcher, tVar, bVar, this.f4794a, list);
        }
        String strL2 = tVar.l();
        if (strL2 == null) {
            return false;
        }
        Matcher matcher2 = pattern.matcher(strL2);
        if (!matcher2.matches()) {
            return false;
        }
        return i(strL.trim(), matcher2, tVar, bVar, this.f4794a, list);
    }
}
