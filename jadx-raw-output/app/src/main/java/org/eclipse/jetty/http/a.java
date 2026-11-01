package org.eclipse.jetty.http;

import com.ironsource.C3426d4;
import com.ironsource.G5;
import io.bidmachine.ads.networks.nast.NastAdapter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import lm.i;
import org.eclipse.jetty.util.StringMap;
import xm.m;
import xm.o;

/* JADX INFO: compiled from: HttpFields.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zm.c f65541c = zm.b.a(a.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeZone f65542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mm.f f65543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f65544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f65545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<f> f65546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f65547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ThreadLocal<g> f65548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f65549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final mm.d f65550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f65551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static ConcurrentMap<String, mm.d> f65552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f65553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Float f65554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Float f65555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final StringMap f65556r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<h> f65557a = new ArrayList<>(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<mm.d, h> f65558b = new HashMap<>(32);

    /* JADX INFO: renamed from: org.eclipse.jetty.http.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpFields.java */
    public static class C0605a extends ThreadLocal<f> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f initialValue() {
            return new f(null);
        }
    }

    /* JADX INFO: compiled from: HttpFields.java */
    public static class b extends ThreadLocal<g> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g initialValue() {
            return new g(null);
        }
    }

    /* JADX INFO: compiled from: HttpFields.java */
    public class c implements Enumeration<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Enumeration f65559a;

        public c(Enumeration enumeration) {
            this.f65559a = enumeration;
        }

        @Override // java.util.Enumeration
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String nextElement() {
            return this.f65559a.nextElement().toString();
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f65559a.hasMoreElements();
        }
    }

    /* JADX INFO: compiled from: HttpFields.java */
    public class d implements Enumeration<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f65561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f65562b;

        public d(h hVar) {
            this.f65562b = hVar;
            this.f65561a = hVar;
        }

        @Override // java.util.Enumeration
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String nextElement() throws NoSuchElementException {
            h hVar = this.f65561a;
            if (hVar == null) {
                throw new NoSuchElementException();
            }
            this.f65561a = hVar.f65572c;
            return hVar.h();
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f65561a != null;
        }
    }

    /* JADX INFO: compiled from: HttpFields.java */
    public class e implements Enumeration<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f65564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f65565b;

        public e(h hVar) {
            this.f65565b = hVar;
            this.f65564a = hVar;
        }

        @Override // java.util.Enumeration
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String nextElement() throws NoSuchElementException {
            h hVar = this.f65564a;
            if (hVar == null) {
                throw new NoSuchElementException();
            }
            this.f65564a = hVar.f65572c;
            return hVar.h();
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f65564a != null;
        }
    }

    /* JADX INFO: compiled from: HttpFields.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StringBuilder f65567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GregorianCalendar f65568b;

        public f() {
            this.f65567a = new StringBuilder(32);
            this.f65568b = new GregorianCalendar(a.f65542d);
        }

        public void a(StringBuilder sb2, long j10) {
            this.f65568b.setTimeInMillis(j10);
            int i10 = this.f65568b.get(7);
            int i11 = this.f65568b.get(5);
            int i12 = this.f65568b.get(2);
            int i13 = this.f65568b.get(1) % 10000;
            int i14 = (int) ((j10 / 1000) % 86400);
            int i15 = i14 % 60;
            int i16 = i14 / 60;
            sb2.append(a.f65544f[i10]);
            sb2.append(',');
            sb2.append(' ');
            o.a(sb2, i11);
            sb2.append('-');
            sb2.append(a.f65545g[i12]);
            sb2.append('-');
            o.a(sb2, i13 / 100);
            o.a(sb2, i13 % 100);
            sb2.append(' ');
            o.a(sb2, i16 / 60);
            sb2.append(':');
            o.a(sb2, i16 % 60);
            sb2.append(':');
            o.a(sb2, i15);
            sb2.append(" GMT");
        }

        public String b(long j10) {
            this.f65567a.setLength(0);
            this.f65568b.setTimeInMillis(j10);
            int i10 = this.f65568b.get(7);
            int i11 = this.f65568b.get(5);
            int i12 = this.f65568b.get(2);
            int i13 = this.f65568b.get(1);
            int i14 = this.f65568b.get(11);
            int i15 = this.f65568b.get(12);
            int i16 = this.f65568b.get(13);
            this.f65567a.append(a.f65544f[i10]);
            this.f65567a.append(',');
            this.f65567a.append(' ');
            o.a(this.f65567a, i11);
            this.f65567a.append(' ');
            this.f65567a.append(a.f65545g[i12]);
            this.f65567a.append(' ');
            o.a(this.f65567a, i13 / 100);
            o.a(this.f65567a, i13 % 100);
            this.f65567a.append(' ');
            o.a(this.f65567a, i14);
            this.f65567a.append(':');
            o.a(this.f65567a, i15);
            this.f65567a.append(':');
            o.a(this.f65567a, i16);
            this.f65567a.append(" GMT");
            return this.f65567a.toString();
        }

        public /* synthetic */ f(C0605a c0605a) {
            this();
        }
    }

    /* JADX INFO: compiled from: HttpFields.java */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public mm.d f65570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public mm.d f65571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h f65572c;

        public /* synthetic */ h(mm.d dVar, mm.d dVar2, C0605a c0605a) {
            this(dVar, dVar2);
        }

        public h(mm.d dVar, mm.d dVar2) {
            this.f65570a = dVar;
            this.f65571b = dVar2;
            this.f65572c = null;
        }

        public long e() {
            return mm.g.i(this.f65571b);
        }

        public String f() {
            return mm.g.f(this.f65570a);
        }

        public int g() {
            return i.f63776d.f(this.f65570a);
        }

        public String h() {
            return mm.g.f(this.f65571b);
        }

        public mm.d i() {
            return this.f65571b;
        }

        public int j() {
            return lm.h.f63761d.f(this.f65571b);
        }

        public void k(mm.d dVar) throws IOException {
            mm.d dVar2 = this.f65570a;
            if ((dVar2 instanceof mm.e.a ? ((mm.e.a) dVar2).e() : -1) >= 0) {
                dVar.S(this.f65570a);
            } else {
                int index = this.f65570a.getIndex();
                int iT = this.f65570a.T();
                while (index < iT) {
                    int i10 = index + 1;
                    byte bQ = this.f65570a.Q(index);
                    if (bQ != 10 && bQ != 13 && bQ != 58) {
                        dVar.put(bQ);
                    }
                    index = i10;
                }
            }
            dVar.put((byte) 58);
            dVar.put((byte) 32);
            mm.d dVar3 = this.f65571b;
            if ((dVar3 instanceof mm.e.a ? ((mm.e.a) dVar3).e() : -1) >= 0) {
                dVar.S(this.f65571b);
            } else {
                int index2 = this.f65571b.getIndex();
                int iT2 = this.f65571b.T();
                while (index2 < iT2) {
                    int i11 = index2 + 1;
                    byte bQ2 = this.f65571b.Q(index2);
                    if (bQ2 != 10 && bQ2 != 13) {
                        dVar.put(bQ2);
                    }
                    index2 = i11;
                }
            }
            mm.g.c(dVar);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C3426d4.j.f28586d);
            sb2.append(f());
            sb2.append("=");
            sb2.append(this.f65571b);
            sb2.append(this.f65572c == null ? "" : "->");
            sb2.append(C3426d4.j.f28588e);
            return sb2.toString();
        }
    }

    public static String L(String str, Map<String, String> map) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            return str;
        }
        if (map == null) {
            return str.substring(0, iIndexOf).trim();
        }
        m mVar = new m(str.substring(iIndexOf), ";", false, true);
        while (mVar.hasMoreTokens()) {
            m mVar2 = new m(mVar.nextToken(), "= ");
            if (mVar2.hasMoreTokens()) {
                map.put(mVar2.nextToken(), mVar2.hasMoreTokens() ? mVar2.nextToken() : null);
            }
        }
        return str.substring(0, iIndexOf).trim();
    }

    /* JADX INFO: compiled from: HttpFields.java */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SimpleDateFormat[] f65569a;

        public g() {
            this.f65569a = new SimpleDateFormat[a.f65547i.length];
        }

        public long a(String str) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                SimpleDateFormat[] simpleDateFormatArr = this.f65569a;
                if (i11 < simpleDateFormatArr.length) {
                    if (simpleDateFormatArr[i11] == null) {
                        simpleDateFormatArr[i11] = new SimpleDateFormat(a.f65547i[i11], Locale.US);
                        this.f65569a[i11].setTimeZone(a.f65542d);
                    }
                    try {
                        continue;
                        return ((Date) this.f65569a[i11].parseObject(str)).getTime();
                    } catch (Exception unused) {
                        i11++;
                    }
                } else {
                    if (!str.endsWith(" GMT")) {
                        return -1L;
                    }
                    String strSubstring = str.substring(i10, str.length() - 4);
                    while (true) {
                        SimpleDateFormat[] simpleDateFormatArr2 = this.f65569a;
                        if (i10 >= simpleDateFormatArr2.length) {
                            return -1L;
                        }
                        try {
                            return ((Date) simpleDateFormatArr2[i10].parseObject(strSubstring)).getTime();
                        } catch (Exception unused2) {
                            i10++;
                        }
                    }
                }
            }
        }

        public /* synthetic */ g(C0605a c0605a) {
            this();
        }
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        f65542d = timeZone;
        mm.f fVar = new mm.f("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        f65543e = fVar;
        timeZone.setID("GMT");
        fVar.e(timeZone);
        f65544f = new String[]{"Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        f65545g = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jan"};
        f65546h = new C0605a();
        f65547i = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss", "EEE MMM dd HH:mm:ss yyyy", "EEE, dd MMM yyyy HH:mm:ss", "EEE dd MMM yyyy HH:mm:ss zzz", "EEE dd MMM yyyy HH:mm:ss", "EEE MMM dd yyyy HH:mm:ss zzz", "EEE MMM dd yyyy HH:mm:ss", "EEE MMM-dd-yyyy HH:mm:ss zzz", "EEE MMM-dd-yyyy HH:mm:ss", "dd MMM yyyy HH:mm:ss zzz", "dd MMM yyyy HH:mm:ss", "dd-MMM-yy HH:mm:ss zzz", "dd-MMM-yy HH:mm:ss", "MMM dd HH:mm:ss yyyy zzz", "MMM dd HH:mm:ss yyyy", "EEE MMM dd HH:mm:ss yyyy zzz", "EEE, MMM dd HH:mm:ss yyyy zzz", "EEE, MMM dd HH:mm:ss yyyy", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE dd-MMM-yy HH:mm:ss zzz", "EEE dd-MMM-yy HH:mm:ss"};
        f65548j = new b();
        String strN = n(0L);
        f65549k = strN;
        f65550l = new mm.h(strN);
        f65551m = l(0L).trim();
        f65552n = new ConcurrentHashMap();
        f65553o = Integer.getInteger("org.eclipse.jetty.http.HttpFields.CACHE", 2000).intValue();
        Float f10 = new Float(NastAdapter.ADAPTER_SDK_VERSION_NAME);
        f65554p = f10;
        Float f11 = new Float("0.0");
        f65555q = f11;
        StringMap stringMap = new StringMap();
        f65556r = stringMap;
        stringMap.put((String) null, (Object) f10);
        stringMap.put(NastAdapter.ADAPTER_SDK_VERSION_NAME, (Object) f10);
        stringMap.put("1", (Object) f10);
        stringMap.put("0.9", (Object) new Float("0.9"));
        stringMap.put("0.8", (Object) new Float("0.8"));
        stringMap.put("0.7", (Object) new Float("0.7"));
        stringMap.put("0.66", (Object) new Float("0.66"));
        stringMap.put("0.6", (Object) new Float("0.6"));
        stringMap.put("0.5", (Object) new Float("0.5"));
        stringMap.put("0.4", (Object) new Float("0.4"));
        stringMap.put("0.33", (Object) new Float("0.33"));
        stringMap.put("0.3", (Object) new Float("0.3"));
        stringMap.put("0.2", (Object) new Float("0.2"));
        stringMap.put("0.1", (Object) new Float("0.1"));
        stringMap.put("0", (Object) f11);
        stringMap.put("0.0", (Object) f11);
    }

    public static String l(long j10) {
        StringBuilder sb2 = new StringBuilder(28);
        m(sb2, j10);
        return sb2.toString();
    }

    public static void m(StringBuilder sb2, long j10) {
        f65546h.get().a(sb2, j10);
    }

    public static String n(long j10) {
        return f65546h.get().b(j10);
    }

    public void B(String str, String str2) {
        if (str2 == null) {
            I(str);
        } else {
            D(i.f63776d.g(str), k(str2));
        }
    }

    public void C(mm.d dVar, String str) {
        D(i.f63776d.h(dVar), k(str));
    }

    public void E(String str, long j10) {
        F(i.f63776d.g(str), j10);
    }

    public void G(String str, long j10) {
        D(i.f63776d.g(str), mm.g.g(j10));
    }

    public void I(String str) {
        J(i.f63776d.g(str));
    }

    public void J(mm.d dVar) {
        if (!(dVar instanceof mm.e.a)) {
            dVar = i.f63776d.h(dVar);
        }
        for (h hVarRemove = this.f65558b.remove(dVar); hVarRemove != null; hVarRemove = hVarRemove.f65572c) {
            this.f65557a.remove(hVarRemove);
        }
    }

    public int K() {
        return this.f65557a.size();
    }

    public void d(String str, String str2) throws IllegalArgumentException {
        if (str2 == null) {
            return;
        }
        e(i.f63776d.g(str), k(str2));
    }

    public void e(mm.d dVar, mm.d dVar2) throws IllegalArgumentException {
        if (dVar2 == null) {
            throw new IllegalArgumentException("null value");
        }
        if (!(dVar instanceof mm.e.a)) {
            dVar = i.f63776d.h(dVar);
        }
        mm.d dVarK0 = dVar.k0();
        if (!(dVar2 instanceof mm.e.a) && lm.h.i(i.f63776d.f(dVarK0))) {
            dVar2 = lm.h.f63761d.h(dVar2);
        }
        mm.d dVarK1 = dVar2.k0();
        C0605a c0605a = null;
        h hVar = null;
        for (h hVar2 = this.f65558b.get(dVarK0); hVar2 != null; hVar2 = hVar2.f65572c) {
            hVar = hVar2;
        }
        h hVar3 = new h(dVarK0, dVarK1, c0605a);
        this.f65557a.add(hVar3);
        if (hVar != null) {
            hVar.f65572c = hVar3;
        } else {
            this.f65558b.put(dVarK0, hVar3);
        }
    }

    public void f(String str, String str2, String str3, String str4, long j10, String str5, boolean z10, boolean z11, int i10) {
        boolean z12;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Bad cookie name");
        }
        StringBuilder sb2 = new StringBuilder(128);
        m.d(sb2, str, "\"\\\n\r\t\f\b%+ ;=");
        sb2.append(G5.T);
        String string = sb2.toString();
        if (str2 != null && str2.length() > 0) {
            m.d(sb2, str2, "\"\\\n\r\t\f\b%+ ;=");
        }
        if (str5 != null && str5.length() > 0) {
            sb2.append(";Comment=");
            m.d(sb2, str5, "\"\\\n\r\t\f\b%+ ;=");
        }
        boolean z13 = true;
        if (str4 == null || str4.length() <= 0) {
            z12 = false;
        } else {
            sb2.append(";Path=");
            if (str4.trim().startsWith("\"")) {
                sb2.append(str4);
            } else {
                m.d(sb2, str4, "\"\\\n\r\t\f\b%+ ;=");
            }
            z12 = true;
        }
        if (str3 == null || str3.length() <= 0) {
            z13 = false;
        } else {
            sb2.append(";Domain=");
            m.d(sb2, str3.toLowerCase(Locale.ENGLISH), "\"\\\n\r\t\f\b%+ ;=");
        }
        if (j10 >= 0) {
            sb2.append(";Expires=");
            if (j10 == 0) {
                sb2.append(f65551m);
            } else {
                m(sb2, System.currentTimeMillis() + (1000 * j10));
            }
            if (i10 > 0) {
                sb2.append(";Max-Age=");
                sb2.append(j10);
            }
        }
        if (z10) {
            sb2.append(";Secure");
        }
        if (z11) {
            sb2.append(";HttpOnly");
        }
        String string2 = sb2.toString();
        h hVarR = r("Set-Cookie");
        h hVar = null;
        while (true) {
            if (hVarR != null) {
                String string3 = hVarR.f65571b == null ? null : hVarR.f65571b.toString();
                if (string3 != null && string3.startsWith(string)) {
                    if (z13 || string3.contains("Domain")) {
                        if (z13) {
                            if (!string3.contains("Domain=" + str3)) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    if (!z12 && !string3.contains("Path")) {
                        break;
                    }
                    if (z12) {
                        if (string3.contains("Path=" + str4)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                hVar = hVarR;
                hVarR = hVarR.f65572c;
            }
            e(i.f63787i0, new mm.h(string2));
            D(i.A, f65550l);
        }
        this.f65557a.remove(hVarR);
        if (hVar == null) {
            this.f65558b.put(i.f63787i0, hVarR.f65572c);
        } else {
            hVar.f65572c = hVarR.f65572c;
        }
        e(i.f63787i0, new mm.h(string2));
        D(i.A, f65550l);
    }

    public void h() {
        this.f65557a.clear();
        this.f65558b.clear();
    }

    public boolean i(String str) {
        return this.f65558b.containsKey(i.f63776d.g(str));
    }

    public boolean j(mm.d dVar) {
        return this.f65558b.containsKey(i.f63776d.h(dVar));
    }

    public final mm.d k(String str) {
        mm.d dVar = f65552n.get(str);
        if (dVar != null) {
            return dVar;
        }
        try {
            mm.h hVar = new mm.h(str, "ISO-8859-1");
            if (f65553o <= 0) {
                return hVar;
            }
            if (f65552n.size() > f65553o) {
                f65552n.clear();
            }
            mm.d dVarPutIfAbsent = f65552n.putIfAbsent(str, hVar);
            return dVarPutIfAbsent != null ? dVarPutIfAbsent : hVar;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public h q(int i10) {
        return this.f65557a.get(i10);
    }

    public final h r(String str) {
        return this.f65558b.get(i.f63776d.g(str));
    }

    public final h s(mm.d dVar) {
        return this.f65558b.get(i.f63776d.h(dVar));
    }

    public Enumeration<String> t() {
        return new c(Collections.enumeration(this.f65558b.keySet()));
    }

    public String toString() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = 0; i10 < this.f65557a.size(); i10++) {
                h hVar = this.f65557a.get(i10);
                if (hVar != null) {
                    String strF = hVar.f();
                    if (strF != null) {
                        stringBuffer.append(strF);
                    }
                    stringBuffer.append(": ");
                    String strH = hVar.h();
                    if (strH != null) {
                        stringBuffer.append(strH);
                    }
                    stringBuffer.append("\r\n");
                }
            }
            stringBuffer.append("\r\n");
            return stringBuffer.toString();
        } catch (Exception e10) {
            f65541c.e(e10);
            return e10.toString();
        }
    }

    public Collection<String> u() {
        ArrayList arrayList = new ArrayList(this.f65557a.size());
        for (h hVar : this.f65557a) {
            if (hVar != null) {
                arrayList.add(mm.g.f(hVar.f65570a));
            }
        }
        return arrayList;
    }

    public Collection<String> A(String str) {
        h hVarR = r(str);
        if (hVarR == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (hVarR != null) {
            arrayList.add(hVarR.h());
            hVarR = hVarR.f65572c;
        }
        return arrayList;
    }

    public void D(mm.d dVar, mm.d dVar2) {
        J(dVar);
        if (dVar2 == null) {
            return;
        }
        if (!(dVar instanceof mm.e.a)) {
            dVar = i.f63776d.h(dVar);
        }
        if (!(dVar2 instanceof mm.e.a)) {
            dVar2 = lm.h.f63761d.h(dVar2).k0();
        }
        h hVar = new h(dVar, dVar2, null);
        this.f65557a.add(hVar);
        this.f65558b.put(dVar, hVar);
    }

    public void F(mm.d dVar, long j10) {
        D(dVar, new mm.h(n(j10)));
    }

    public void H(mm.d dVar, long j10) {
        D(dVar, mm.g.g(j10));
    }

    public void g(lm.g gVar) {
        f(gVar.d(), gVar.f(), gVar.b(), gVar.e(), gVar.c(), gVar.a(), gVar.i(), gVar.h(), gVar.g());
    }

    public mm.d o(mm.d dVar) {
        h hVarS = s(dVar);
        if (hVarS != null) {
            return hVarS.f65571b;
        }
        return null;
    }

    public long p(String str) {
        String strL;
        h hVarR = r(str);
        if (hVarR == null || (strL = L(mm.g.f(hVarR.f65571b), null)) == null) {
            return -1L;
        }
        long jA = f65548j.get().a(strL);
        if (jA != -1) {
            return jA;
        }
        throw new IllegalArgumentException("Cannot convert date: " + strL);
    }

    public long v(mm.d dVar) throws NumberFormatException {
        h hVarS = s(dVar);
        if (hVarS == null) {
            return -1L;
        }
        return hVarS.e();
    }

    public String w(String str) {
        h hVarR = r(str);
        if (hVarR == null) {
            return null;
        }
        return hVarR.h();
    }

    public String x(mm.d dVar) {
        h hVarS = s(dVar);
        if (hVarS == null) {
            return null;
        }
        return hVarS.h();
    }

    public Enumeration<String> y(String str) {
        h hVarR = r(str);
        if (hVarR == null) {
            return Collections.enumeration(Collections.emptyList());
        }
        return new d(hVarR);
    }

    public Enumeration<String> z(mm.d dVar) {
        h hVarS = s(dVar);
        if (hVarS == null) {
            return Collections.enumeration(Collections.emptyList());
        }
        return new e(hVarS);
    }
}
