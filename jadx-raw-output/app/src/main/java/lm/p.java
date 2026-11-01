package lm;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.internal.AssetHelper;
import com.ironsource.G5;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* JADX INFO: compiled from: MimeTypes.java */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zm.c f63865a = zm.b.a(p.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f63866b = 15;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mm.e f63867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mm.e.a f63868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mm.e.a f63869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final mm.e.a f63870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mm.e.a f63871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mm.e.a f63872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final mm.e.a f63873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final mm.e.a f63874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final mm.e.a f63875k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final mm.e.a f63876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final mm.e.a f63877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final mm.e.a f63878n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final mm.e.a f63879o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final mm.e.a f63880p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final mm.e.a f63881q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final mm.e.a f63882r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final mm.e.a f63883s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final mm.e.a f63884t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final mm.e.a f63885u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final mm.e.a f63886v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final mm.e.a f63887w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final mm.e.a f63888x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Map f63889y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Map f63890z;

    static {
        mm.e eVar = new mm.e();
        f63867c = eVar;
        f63868d = eVar.a(ShareTarget.ENCODING_TYPE_URL_ENCODED, 1);
        f63869e = eVar.a("message/http", 2);
        f63870f = eVar.a("multipart/byteranges", 3);
        f63871g = eVar.a("text/html", 4);
        f63872h = eVar.a(AssetHelper.DEFAULT_MIME_TYPE, 5);
        f63873i = eVar.a("text/xml", 6);
        f63874j = eVar.a("text/json", 7);
        f63875k = eVar.a("text/html;charset=ISO-8859-1", 8);
        f63876l = eVar.a("text/plain;charset=ISO-8859-1", 9);
        f63877m = eVar.a("text/xml;charset=ISO-8859-1", 10);
        f63878n = eVar.a("text/html;charset=UTF-8", 11);
        f63879o = eVar.a("text/plain;charset=UTF-8", 12);
        f63880p = eVar.a("text/xml;charset=UTF-8", 13);
        f63881q = eVar.a("text/json;charset=UTF-8", 14);
        f63882r = eVar.a("text/html; charset=ISO-8859-1", 8);
        f63883s = eVar.a("text/plain; charset=ISO-8859-1", 9);
        f63884t = eVar.a("text/xml; charset=ISO-8859-1", 10);
        f63885u = eVar.a("text/html; charset=UTF-8", 11);
        f63886v = eVar.a("text/plain; charset=UTF-8", 12);
        f63887w = eVar.a("text/xml; charset=UTF-8", 13);
        f63888x = eVar.a("text/json; charset=UTF-8", 14);
        f63889y = new HashMap();
        f63890z = new HashMap();
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("org/eclipse/jetty/http/mime");
            Enumeration<String> keys = bundle.getKeys();
            while (keys.hasMoreElements()) {
                String strNextElement = keys.nextElement();
                f63889y.put(xm.o.b(strNextElement), b(bundle.getString(strNextElement)));
            }
        } catch (MissingResourceException e10) {
            zm.c cVar = f63865a;
            cVar.g(e10.toString(), new Object[0]);
            cVar.a(e10);
        }
        try {
            ResourceBundle bundle2 = ResourceBundle.getBundle("org/eclipse/jetty/http/encoding");
            Enumeration<String> keys2 = bundle2.getKeys();
            while (keys2.hasMoreElements()) {
                mm.d dVarB = b(keys2.nextElement());
                f63890z.put(dVarB, bundle2.getString(dVarB.toString()));
            }
        } catch (MissingResourceException e11) {
            zm.c cVar2 = f63865a;
            cVar2.g(e11.toString(), new Object[0]);
            cVar2.a(e11);
        }
        mm.e.a aVar = f63871g;
        mm.e.a aVar2 = f63875k;
        aVar.f("ISO-8859-1", aVar2);
        aVar.f("ISO_8859_1", aVar2);
        aVar.f("iso-8859-1", aVar2);
        mm.e.a aVar3 = f63872h;
        mm.e.a aVar4 = f63876l;
        aVar3.f("ISO-8859-1", aVar4);
        aVar3.f("ISO_8859_1", aVar4);
        aVar3.f("iso-8859-1", aVar4);
        mm.e.a aVar5 = f63873i;
        mm.e.a aVar6 = f63877m;
        aVar5.f("ISO-8859-1", aVar6);
        aVar5.f("ISO_8859_1", aVar6);
        aVar5.f("iso-8859-1", aVar6);
        mm.e.a aVar7 = f63878n;
        aVar.f("UTF-8", aVar7);
        aVar.f("UTF8", aVar7);
        aVar.f("utf8", aVar7);
        aVar.f(G5.N, aVar7);
        mm.e.a aVar8 = f63879o;
        aVar3.f("UTF-8", aVar8);
        aVar3.f("UTF8", aVar8);
        aVar3.f("utf8", aVar8);
        aVar3.f(G5.N, aVar8);
        mm.e.a aVar9 = f63880p;
        aVar5.f("UTF-8", aVar9);
        aVar5.f("UTF8", aVar9);
        aVar5.f("utf8", aVar9);
        aVar5.f(G5.N, aVar9);
        mm.e.a aVar10 = f63874j;
        mm.e.a aVar11 = f63881q;
        aVar10.f("UTF-8", aVar11);
        aVar10.f("UTF8", aVar11);
        aVar10.f("utf8", aVar11);
        aVar10.f(G5.N, aVar11);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    public static String a(mm.d dVar) {
        if (dVar instanceof mm.e.a) {
            switch (((mm.e.a) dVar).e()) {
                case 8:
                case 9:
                case 10:
                    return "ISO-8859-1";
                case 11:
                case 12:
                case 13:
                case 14:
                    return "UTF-8";
            }
        }
        int index = dVar.getIndex();
        int iT = dVar.T();
        char c10 = 0;
        boolean z10 = false;
        int i10 = 0;
        while (index < iT) {
            byte bQ = dVar.Q(index);
            if (!z10 || c10 == '\n') {
                switch (c10) {
                    case 0:
                        if (34 == bQ) {
                            z10 = true;
                        } else if (59 == bQ) {
                            c10 = 1;
                        }
                        break;
                    case 1:
                        if (99 == bQ) {
                            c10 = 2;
                        } else if (32 != bQ) {
                            c10 = 0;
                        }
                        break;
                    case 2:
                        if (104 != bQ) {
                            c10 = 0;
                        } else {
                            c10 = 3;
                        }
                        break;
                    case 3:
                        if (97 != bQ) {
                            c10 = 0;
                        } else {
                            c10 = 4;
                        }
                        break;
                    case 4:
                        if (114 != bQ) {
                            c10 = 0;
                        } else {
                            c10 = 5;
                        }
                        break;
                    case 5:
                        if (115 != bQ) {
                            c10 = 0;
                        } else {
                            c10 = 6;
                        }
                        break;
                    case 6:
                        if (101 != bQ) {
                            c10 = 0;
                        } else {
                            c10 = 7;
                        }
                        break;
                    case 7:
                        if (116 != bQ) {
                            c10 = 0;
                        } else {
                            c10 = '\b';
                        }
                        break;
                    case '\b':
                        if (61 == bQ) {
                            c10 = '\t';
                        } else if (32 != bQ) {
                            c10 = 0;
                        }
                        break;
                    case '\t':
                        if (32 != bQ) {
                            if (34 != bQ) {
                                i10 = index;
                                c10 = '\n';
                            } else {
                                i10 = index + 1;
                                c10 = '\n';
                                z10 = true;
                            }
                        }
                        break;
                    case '\n':
                        if ((!z10 && (59 == bQ || 32 == bQ)) || (z10 && 34 == bQ)) {
                            return f63867c.h(dVar.N(i10, index - i10)).toString("UTF-8");
                        }
                        break;
                        break;
                    default:
                        continue;
                }
            } else if (34 == bQ) {
                z10 = false;
            }
            index++;
        }
        return c10 == '\n' ? f63867c.h(dVar.N(i10, index - i10)).toString("UTF-8") : (String) f63890z.get(dVar);
    }

    public static synchronized mm.d b(String str) {
        mm.e.a aVarB;
        mm.e eVar = f63867c;
        aVarB = eVar.b(str);
        if (aVarB == null) {
            int i10 = f63866b;
            f63866b = i10 + 1;
            aVarB = eVar.a(str, i10);
        }
        return aVarB;
    }
}
