package y4;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import g5.m;
import g5.n;
import g5.t;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t4.c;
import t4.e;

/* JADX INFO: compiled from: SubripDecoder.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a extends c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f75266q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f75267r = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final StringBuilder f75268o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList<String> f75269p;

    public a() {
        super("SubripDecoder");
        this.f75268o = new StringBuilder();
        this.f75269p = new ArrayList<>();
    }

    public static float y(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long z(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (strGroup != null ? Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L) + (Long.parseLong(matcher.group(i10 + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i10 + 3)) * 1000);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    @Override // t4.c
    public e v(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        n nVar = new n();
        t tVar = new t(bArr, i10);
        while (true) {
            String strL = tVar.l();
            if (strL == null) {
                break;
            }
            if (strL.length() != 0) {
                try {
                    Integer.parseInt(strL);
                    String strL2 = tVar.l();
                    if (strL2 == null) {
                        m.h("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f75266q.matcher(strL2);
                    if (matcher.matches()) {
                        nVar.a(z(matcher, 1));
                        nVar.a(z(matcher, 6));
                        this.f75268o.setLength(0);
                        this.f75269p.clear();
                        for (String strL3 = tVar.l(); !TextUtils.isEmpty(strL3); strL3 = tVar.l()) {
                            if (this.f75268o.length() > 0) {
                                this.f75268o.append("<br>");
                            }
                            this.f75268o.append(A(strL3, this.f75269p));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f75268o.toString());
                        String str = null;
                        for (int i11 = 0; i11 < this.f75269p.size(); i11++) {
                            String str2 = this.f75269p.get(i11);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                str = str2;
                                break;
                            }
                        }
                        arrayList.add(x(spannedFromHtml, str));
                        arrayList.add(t4.b.f72219p);
                    } else {
                        m.h("SubripDecoder", "Skipping invalid timing: " + strL2);
                    }
                } catch (NumberFormatException unused) {
                    m.h("SubripDecoder", "Skipping invalid index: " + strL);
                }
            }
        }
        t4.b[] bVarArr = new t4.b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return new b(bVarArr, nVar.d());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    public final t4.b x(Spanned spanned, @Nullable String str) {
        byte b10;
        int i10;
        byte b11;
        int i11;
        if (str == null) {
            return new t4.b(spanned);
        }
        switch (str) {
            case "{\an1}":
                b10 = 0;
                break;
            case "{\an2}":
                b10 = 6;
                break;
            case "{\an3}":
                b10 = 3;
                break;
            case "{\an4}":
                b10 = 1;
                break;
            case "{\an5}":
                b10 = 7;
                break;
            case "{\an6}":
                b10 = 4;
                break;
            case "{\an7}":
                b10 = 2;
                break;
            case "{\an8}":
                b10 = 8;
                break;
            case "{\an9}":
                b10 = 5;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0 || b10 == 1 || b10 == 2) {
            i10 = 0;
        } else {
            i10 = (b10 == 3 || b10 == 4 || b10 == 5) ? 2 : 1;
        }
        switch (str) {
            case "{\an1}":
                b11 = 0;
                break;
            case "{\an2}":
                b11 = 1;
                break;
            case "{\an3}":
                b11 = 2;
                break;
            case "{\an4}":
                b11 = 6;
                break;
            case "{\an5}":
                b11 = 7;
                break;
            case "{\an6}":
                b11 = 8;
                break;
            case "{\an7}":
                b11 = 3;
                break;
            case "{\an8}":
                b11 = 4;
                break;
            case "{\an9}":
                b11 = 5;
                break;
            default:
                b11 = -1;
                break;
        }
        if (b11 == 0 || b11 == 1 || b11 == 2) {
            i11 = 2;
        } else {
            i11 = (b11 == 3 || b11 == 4 || b11 == 5) ? 0 : 1;
        }
        return new t4.b(spanned, null, y(i11), 0, i11, y(i10), i10, -3.4028235E38f);
    }

    public final String A(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f75267r.matcher(strTrim);
        int i10 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }
}
