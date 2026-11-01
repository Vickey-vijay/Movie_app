package x4;

import android.graphics.PointF;
import android.text.Layout;
import androidx.annotation.Nullable;
import g5.k0;
import g5.m;
import g5.t;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t4.e;

/* JADX INFO: compiled from: SsaDecoder.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a extends t4.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f74338t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f74339o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final b f74340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Map<String, c> f74341q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f74342r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f74343s;

    @Nullable
    public static Layout.Alignment I(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                m.h("SsaDecoder", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    public static float y(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public a(@Nullable List<byte[]> list) {
        super("SsaDecoder");
        this.f74342r = -3.4028235E38f;
        this.f74343s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f74339o = false;
            this.f74340p = null;
            return;
        }
        this.f74339o = true;
        String strZ = k0.z(list.get(0));
        g5.a.a(strZ.startsWith("Format:"));
        this.f74340p = (b) g5.a.e(b.a(strZ));
        C(new t(list.get(1)));
    }

    public static Map<String, c> E(t tVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strL = tVar.l();
            if (strL == null || (tVar.a() != 0 && tVar.f() == 91)) {
                break;
            }
            if (strL.startsWith("Format:")) {
                aVarA = c.a.a(strL);
            } else if (strL.startsWith("Style:")) {
                if (aVarA == null) {
                    m.h("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + strL);
                } else {
                    c cVarB = c.b(strL, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f74349a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static long F(String str) {
        Matcher matcher = f74338t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) k0.i(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) k0.i(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) k0.i(matcher.group(3))) * 1000000) + (Long.parseLong((String) k0.i(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    public static int G(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                m.h("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    public static int H(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                m.h("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    public static t4.b z(String str, @Nullable c cVar, c.b bVar, float f10, float f11) {
        float fY;
        float fY2;
        int i10 = bVar.f74358a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f74350b : -1;
        }
        int iH = H(i10);
        int iG = G(i10);
        PointF pointF = bVar.f74359b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            fY = y(iH);
            fY2 = y(iG);
        } else {
            float f12 = pointF.x / f10;
            fY2 = pointF.y / f11;
            fY = f12;
        }
        return new t4.b(str, I(i10), fY2, 0, iG, fY, iH, -3.4028235E38f);
    }

    public final void A(String str, b bVar, List<List<t4.b>> list, List<Long> list2) {
        int i10;
        g5.a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(StringUtils.COMMA, bVar.f74348e);
        if (strArrSplit.length != bVar.f74348e) {
            m.h("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jF = F(strArrSplit[bVar.f74344a]);
        if (jF == -9223372036854775807L) {
            m.h("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        long jF2 = F(strArrSplit[bVar.f74345b]);
        if (jF2 == -9223372036854775807L) {
            m.h("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, c> map = this.f74341q;
        c cVar = (map == null || (i10 = bVar.f74346c) == -1) ? null : map.get(strArrSplit[i10].trim());
        String str2 = strArrSplit[bVar.f74347d];
        t4.b bVarZ = z(c.b.d(str2).replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n"), cVar, c.b.b(str2), this.f74342r, this.f74343s);
        int iX = x(jF2, list2, list);
        for (int iX2 = x(jF, list2, list); iX2 < iX; iX2++) {
            list.get(iX2).add(bVarZ);
        }
    }

    public final void B(t tVar, List<List<t4.b>> list, List<Long> list2) {
        b bVarA = this.f74339o ? this.f74340p : null;
        while (true) {
            String strL = tVar.l();
            if (strL == null) {
                return;
            }
            if (strL.startsWith("Format:")) {
                bVarA = b.a(strL);
            } else if (strL.startsWith("Dialogue:")) {
                if (bVarA == null) {
                    m.h("SsaDecoder", "Skipping dialogue line before complete format: " + strL);
                } else {
                    A(strL, bVarA, list, list2);
                }
            }
        }
    }

    @Override // t4.c
    public e v(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        t tVar = new t(bArr, i10);
        if (!this.f74339o) {
            C(tVar);
        }
        B(tVar, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }

    public static int x(long j10, List<Long> list, List<List<t4.b>> list2) {
        int i10;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size >= 0) {
                if (list.get(size).longValue() == j10) {
                    return size;
                }
                if (list.get(size).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            } else {
                i10 = 0;
                break;
            }
        }
        list.add(i10, Long.valueOf(j10));
        if (i10 == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(list2.get(i10 - 1));
        }
        list2.add(i10, arrayList);
        return i10;
    }

    public final void C(t tVar) {
        while (true) {
            String strL = tVar.l();
            if (strL != null) {
                if ("[Script Info]".equalsIgnoreCase(strL)) {
                    D(tVar);
                } else if ("[V4+ Styles]".equalsIgnoreCase(strL)) {
                    this.f74341q = E(tVar);
                } else if ("[V4 Styles]".equalsIgnoreCase(strL)) {
                    m.f("SsaDecoder", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(strL)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void D(t tVar) {
        while (true) {
            String strL = tVar.l();
            if (strL != null) {
                if (tVar.a() == 0 || tVar.f() != 91) {
                    String[] strArrSplit = strL.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    if (strArrSplit.length == 2) {
                        String strK0 = k0.K0(strArrSplit[0].trim());
                        strK0.hashCode();
                        if (!strK0.equals("playresx")) {
                            if (strK0.equals("playresy")) {
                                try {
                                    this.f74343s = Float.parseFloat(strArrSplit[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        } else {
                            this.f74342r = Float.parseFloat(strArrSplit[1].trim());
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
