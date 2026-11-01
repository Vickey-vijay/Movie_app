package yads;

import com.ironsource.G5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Result;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public abstract class t01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f82847a = lk.c.f63596g;

    public static final boolean a(Map map, u11 u11Var) {
        String strC = c(map, u11Var);
        if (strC == null) {
            return true;
        }
        return Boolean.parseBoolean(strC);
    }

    public static final String c(Map map, u11 u11Var) {
        if (map != null) {
            return (String) map.get(u11Var.f83324b);
        }
        return null;
    }

    public static final ArrayList e(Map map, u11 u11Var) {
        List listK;
        ArrayList arrayList = new ArrayList();
        String strC = c(map, u11Var);
        if (strC != null && strC.length() != 0) {
            List<String> listSplit = new Regex(StringUtils.COMMA).split(strC, 0);
            if (listSplit.isEmpty()) {
                listK = nj.s.k();
                break;
            }
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listK = nj.s.k();
                    break;
                }
                if (listIterator.previous().length() != 0) {
                    listK = nj.b0.I0(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
            for (String str : (String[]) listK.toArray(new String[0])) {
                try {
                    Result.a aVar = Result.Companion;
                    int length = str.length() - 1;
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 <= length) {
                        boolean z11 = ck.p.l(str.charAt(!z10 ? i10 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i10++;
                        } else {
                            z10 = true;
                        }
                    }
                    String strDecode = URLDecoder.decode(str.subSequence(i10, length + 1).toString(), "UTF-8");
                    if (strDecode != null) {
                        arrayList.add(strDecode);
                    } else {
                        strDecode = null;
                    }
                    Result.m3458constructorimpl(strDecode);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    Result.m3458constructorimpl(kotlin.c.a(th2));
                }
            }
        }
        return arrayList;
    }

    public static final Charset a(Map map) {
        List listK;
        List listK2;
        if (map == null) {
            return f82847a;
        }
        String str = (String) map.get("Content-Type");
        if (str != null) {
            List<String> listSplit = new Regex(";").split(str, 0);
            if (!listSplit.isEmpty()) {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            listK = nj.b0.I0(listSplit, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        listK = nj.s.k();
                        break;
                    }
                }
            } else {
                listK = nj.s.k();
                break;
            }
            String[] strArr = (String[]) listK.toArray(new String[0]);
            int length = strArr.length;
            for (int i10 = 1; i10 < length; i10++) {
                String str2 = strArr[i10];
                int length2 = str2.length() - 1;
                int i11 = 0;
                boolean z10 = false;
                while (i11 <= length2) {
                    boolean z11 = ck.p.l(str2.charAt(!z10 ? i11 : length2), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length2--;
                    } else if (z11) {
                        i11++;
                    } else {
                        z10 = true;
                    }
                }
                List<String> listSplit2 = new Regex("=").split(str2.subSequence(i11, length2 + 1).toString(), 0);
                if (!listSplit2.isEmpty()) {
                    ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            if (listIterator2.previous().length() != 0) {
                                listK2 = nj.b0.I0(listSplit2, listIterator2.nextIndex() + 1);
                                break;
                            }
                        } else {
                            listK2 = nj.s.k();
                            break;
                        }
                    }
                } else {
                    listK2 = nj.s.k();
                    break;
                }
                String[] strArr2 = (String[]) listK2.toArray(new String[0]);
                if (strArr2.length == 2 && ck.p.e(strArr2[0], G5.M)) {
                    return Charset.forName(strArr2[1]);
                }
            }
        }
        return f82847a;
    }

    public static boolean b(Map map, u11 u11Var) {
        String strC = c(map, u11Var);
        if (strC == null) {
            return false;
        }
        return Boolean.parseBoolean(strC);
    }

    public static int d(Map map, u11 u11Var) {
        String strC = c(map, u11Var);
        int i10 = tb.f82950b;
        if (strC != null) {
            try {
                return Integer.parseInt(strC);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }
}
