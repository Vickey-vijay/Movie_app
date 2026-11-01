package z4;

import android.text.Layout;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.ironsource.Z7;
import g5.k0;
import g5.l0;
import g5.m;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: TtmlDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends t4.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f86256p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f86257q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f86258r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f86259s = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f86260t = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f86261u = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f86262v = new b(30.0f, 1, 1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0807a f86263w = new C0807a(32, 15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final XmlPullParserFactory f86264o;

    /* JADX INFO: renamed from: z4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TtmlDecoder.java */
    public static final class C0807a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f86266b;

        public C0807a(int i10, int i11) {
            this.f86265a = i10;
            this.f86266b = i11;
        }
    }

    /* JADX INFO: compiled from: TtmlDecoder.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f86267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f86268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f86269c;

        public b(float f10, int i10, int i11) {
            this.f86267a = f10;
            this.f86268b = i10;
            this.f86269c = i11;
        }
    }

    /* JADX INFO: compiled from: TtmlDecoder.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f86271b;

        public c(int i10, int i11) {
            this.f86270a = i10;
            this.f86271b = i11;
        }
    }

    public a() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f86264o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static void A(String str, e eVar) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrD0 = k0.D0(str, "\\s+");
        if (strArrD0.length == 1) {
            matcher = f86258r.matcher(str);
        } else {
            if (strArrD0.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrD0.length + ".");
            }
            matcher = f86258r.matcher(strArrD0[1]);
            m.h("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        String strGroup = matcher.group(3);
        strGroup.hashCode();
        switch (strGroup) {
            case "%":
                eVar.t(3);
                break;
            case "em":
                eVar.t(2);
                break;
            case "px":
                eVar.t(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + strGroup + "'.");
        }
        eVar.s(Float.valueOf(matcher.group(1)).floatValue());
    }

    public static long I(String str, b bVar) throws SubtitleDecoderException {
        double d10;
        double d11;
        Matcher matcher = f86256p.matcher(str);
        if (matcher.matches()) {
            double d12 = (Long.parseLong(matcher.group(1)) * 3600) + (Long.parseLong(matcher.group(2)) * 60) + Long.parseLong(matcher.group(3));
            String strGroup = matcher.group(4);
            double d13 = d12 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d14 = d13 + (strGroup2 != null ? Long.parseLong(strGroup2) / bVar.f86267a : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d14 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) bVar.f86268b)) / ((double) bVar.f86267a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f86257q.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: " + str);
        }
        double d15 = Double.parseDouble(matcher2.group(1));
        String strGroup4 = matcher2.group(2);
        strGroup4.hashCode();
        switch (strGroup4) {
            case "f":
                d10 = bVar.f86267a;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            case "h":
                d11 = 3600.0d;
                break;
            case "m":
                d11 = 60.0d;
                break;
            case "t":
                d10 = bVar.f86269c;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            case "ms":
                d10 = 1000.0d;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            default:
                return (long) (d15 * 1000000.0d);
        }
        d15 *= d11;
        return (long) (d15 * 1000000.0d);
    }

    public static boolean y(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public final b B(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrD0 = k0.D0(attributeValue2, Z7.f27998r);
            if (strArrD0.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(strArrD0[0]) / Integer.parseInt(strArrD0[1]);
        }
        b bVar = f86262v;
        int i11 = bVar.f86268b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = bVar.f86269c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new b(i10 * f10, i11, i12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:6:0x003a  */
    public final z4.b E(XmlPullParser xmlPullParser, z4.b bVar, Map<String, z4.c> map, b bVar2) throws SubtitleDecoderException {
        long j10;
        long j11;
        int attributeCount = xmlPullParser.getAttributeCount();
        e eVarG = G(xmlPullParser, null);
        String[] strArr = null;
        String strSubstring = null;
        String str = "";
        long jI = -9223372036854775807L;
        long jI2 = -9223372036854775807L;
        long jI3 = -9223372036854775807L;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.hashCode();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jI3 = I(attributeValue, bVar2);
                    break;
                case "end":
                    jI2 = I(attributeValue, bVar2);
                    break;
                case "begin":
                    jI = I(attributeValue, bVar2);
                    break;
                case "style":
                    String[] strArrH = H(attributeValue);
                    if (strArrH.length > 0) {
                        strArr = strArrH;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (bVar != null) {
            long j12 = bVar.f86275d;
            j10 = -9223372036854775807L;
            if (j12 != -9223372036854775807L) {
                if (jI != -9223372036854775807L) {
                    jI += j12;
                }
                if (jI2 != -9223372036854775807L) {
                    jI2 += j12;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        long j13 = jI;
        if (jI2 != j10) {
            j11 = jI2;
        } else if (jI3 != j10) {
            j11 = j13 + jI3;
        } else if (bVar != null) {
            long j14 = bVar.f86276e;
            if (j14 != j10) {
                j11 = j14;
            } else {
                j11 = jI2;
            }
        } else {
            j11 = jI2;
        }
        return z4.b.c(xmlPullParser.getName(), j13, j11, eVarG, strArr, str, strSubstring);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0135  */
    public final z4.c F(XmlPullParser xmlPullParser, C0807a c0807a, c cVar) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        float f14;
        String strA = l0.a(xmlPullParser, "id");
        if (strA == null) {
            return null;
        }
        String strA2 = l0.a(xmlPullParser, "origin");
        if (strA2 == null) {
            m.h("TtmlDecoder", "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = f86259s;
        Matcher matcher = pattern.matcher(strA2);
        Pattern pattern2 = f86260t;
        Matcher matcher2 = pattern2.matcher(strA2);
        if (matcher.matches()) {
            try {
                float f15 = Float.parseFloat(matcher.group(1)) / 100.0f;
                f10 = Float.parseFloat(matcher.group(2)) / 100.0f;
                f11 = f15;
            } catch (NumberFormatException unused) {
                m.h("TtmlDecoder", "Ignoring region with malformed origin: " + strA2);
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                m.h("TtmlDecoder", "Ignoring region with unsupported origin: " + strA2);
                return null;
            }
            if (cVar == null) {
                m.h("TtmlDecoder", "Ignoring region with missing tts:extent: " + strA2);
                return null;
            }
            try {
                int i11 = Integer.parseInt(matcher2.group(1));
                int i12 = Integer.parseInt(matcher2.group(2));
                f11 = i11 / cVar.f86270a;
                f10 = i12 / cVar.f86271b;
            } catch (NumberFormatException unused2) {
                m.h("TtmlDecoder", "Ignoring region with malformed origin: " + strA2);
                return null;
            }
        }
        String strA3 = l0.a(xmlPullParser, "extent");
        if (strA3 == null) {
            m.h("TtmlDecoder", "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(strA3);
        Matcher matcher4 = pattern2.matcher(strA3);
        if (matcher3.matches()) {
            try {
                f12 = Float.parseFloat(matcher3.group(1)) / 100.0f;
                f13 = Float.parseFloat(matcher3.group(2)) / 100.0f;
            } catch (NumberFormatException unused3) {
                m.h("TtmlDecoder", "Ignoring region with malformed extent: " + strA2);
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                m.h("TtmlDecoder", "Ignoring region with unsupported extent: " + strA2);
                return null;
            }
            if (cVar == null) {
                m.h("TtmlDecoder", "Ignoring region with missing tts:extent: " + strA2);
                return null;
            }
            try {
                int i13 = Integer.parseInt(matcher4.group(1));
                int i14 = Integer.parseInt(matcher4.group(2));
                f12 = i13 / cVar.f86270a;
                f13 = i14 / cVar.f86271b;
            } catch (NumberFormatException unused4) {
                m.h("TtmlDecoder", "Ignoring region with malformed extent: " + strA2);
                return null;
            }
        }
        String strA4 = l0.a(xmlPullParser, "displayAlign");
        if (strA4 != null) {
            String strK0 = k0.K0(strA4);
            strK0.hashCode();
            if (strK0.equals("center")) {
                f14 = f10 + (f13 / 2.0f);
                i10 = 1;
            } else if (strK0.equals("after")) {
                f14 = f10 + f13;
                i10 = 2;
            } else {
                i10 = 0;
                f14 = f10;
            }
        } else {
            i10 = 0;
            f14 = f10;
        }
        return new z4.c(strA, f11, f14, 0, i10, f12, f13, 1, 1.0f / c0807a.f86266b);
    }

    public final c J(XmlPullParser xmlPullParser) {
        String strA = l0.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f86260t.matcher(strA);
        if (!matcher.matches()) {
            m.h("TtmlDecoder", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new c(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        } catch (NumberFormatException unused) {
            m.h("TtmlDecoder", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    @Override // t4.c
    public t4.e v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        f fVar;
        b bVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f86264o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            c cVarJ = null;
            map2.put("", new z4.c(null));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarB = f86262v;
            C0807a c0807aZ = f86263w;
            int i11 = 0;
            f fVar2 = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                z4.b bVar2 = (z4.b) arrayDeque.peek();
                if (i11 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarB = B(xmlPullParserNewPullParser);
                            c0807aZ = z(xmlPullParserNewPullParser, f86263w);
                            cVarJ = J(xmlPullParserNewPullParser);
                        }
                        c cVar = cVarJ;
                        b bVar3 = bVarB;
                        C0807a c0807a = c0807aZ;
                        if (y(name)) {
                            if ("head".equals(name)) {
                                fVar = fVar2;
                                bVar = bVar3;
                                C(xmlPullParserNewPullParser, map, c0807a, cVar, map2, map3);
                            } else {
                                fVar = fVar2;
                                bVar = bVar3;
                                try {
                                    z4.b bVarE = E(xmlPullParserNewPullParser, bVar2, map2, bVar);
                                    arrayDeque.push(bVarE);
                                    if (bVar2 != null) {
                                        bVar2.a(bVarE);
                                    }
                                } catch (SubtitleDecoderException e10) {
                                    m.i("TtmlDecoder", "Suppressing parser error", e10);
                                    i11++;
                                }
                            }
                            bVarB = bVar;
                            cVarJ = cVar;
                            c0807aZ = c0807a;
                        } else {
                            m.f("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i11++;
                            bVarB = bVar3;
                            cVarJ = cVar;
                            c0807aZ = c0807a;
                        }
                    } else {
                        fVar = fVar2;
                        if (eventType == 4) {
                            bVar2.a(z4.b.d(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            fVar2 = xmlPullParserNewPullParser.getName().equals("tt") ? new f((z4.b) arrayDeque.peek(), map, map2, map3) : fVar;
                            arrayDeque.pop();
                        }
                    }
                    xmlPullParserNewPullParser.next();
                } else {
                    fVar = fVar2;
                    if (eventType == 2) {
                        i11++;
                    } else if (eventType == 3) {
                        i11--;
                    }
                }
                fVar2 = fVar;
                xmlPullParserNewPullParser.next();
            }
            return fVar2;
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new SubtitleDecoderException("Unable to decode source", e12);
        }
    }

    public final e x(e eVar) {
        return eVar == null ? new e() : eVar;
    }

    public final C0807a z(XmlPullParser xmlPullParser, C0807a c0807a) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return c0807a;
        }
        Matcher matcher = f86261u.matcher(attributeValue);
        if (!matcher.matches()) {
            m.h("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return c0807a;
        }
        try {
            int i10 = Integer.parseInt(matcher.group(1));
            int i11 = Integer.parseInt(matcher.group(2));
            if (i10 != 0 && i11 != 0) {
                return new C0807a(i10, i11);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + i10 + Z7.f27998r + i11);
        } catch (NumberFormatException unused) {
            m.h("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return c0807a;
        }
    }

    public final Map<String, e> C(XmlPullParser xmlPullParser, Map<String, e> map, C0807a c0807a, c cVar, Map<String, z4.c> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "style")) {
                String strA = l0.a(xmlPullParser, "style");
                e eVarG = G(xmlPullParser, new e());
                if (strA != null) {
                    for (String str : H(strA)) {
                        eVarG.a(map.get(str));
                    }
                }
                if (eVarG.g() != null) {
                    map.put(eVarG.g(), eVarG);
                }
            } else if (l0.f(xmlPullParser, "region")) {
                z4.c cVarF = F(xmlPullParser, c0807a, cVar);
                if (cVarF != null) {
                    map2.put(cVarF.f86284a, cVarF);
                }
            } else if (l0.f(xmlPullParser, "metadata")) {
                D(xmlPullParser, map3);
            }
        } while (!l0.d(xmlPullParser, "head"));
        return map;
    }

    public final void D(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "image") && (strA = l0.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!l0.d(xmlPullParser, "metadata"));
    }

    public final e G(XmlPullParser xmlPullParser, e eVar) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            attributeName.hashCode();
            switch (attributeName) {
                case "fontStyle":
                    eVar = x(eVar).v("italic".equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    eVar = x(eVar).r(attributeValue);
                    break;
                case "textAlign":
                    String strK0 = k0.K0(attributeValue);
                    strK0.hashCode();
                    switch (strK0) {
                        case "center":
                            eVar = x(eVar).x(Layout.Alignment.ALIGN_CENTER);
                            break;
                        case "end":
                            eVar = x(eVar).x(Layout.Alignment.ALIGN_OPPOSITE);
                            break;
                        case "left":
                            eVar = x(eVar).x(Layout.Alignment.ALIGN_NORMAL);
                            break;
                        case "right":
                            eVar = x(eVar).x(Layout.Alignment.ALIGN_OPPOSITE);
                            break;
                        case "start":
                            eVar = x(eVar).x(Layout.Alignment.ALIGN_NORMAL);
                            break;
                    }
                    break;
                case "textDecoration":
                    String strK1 = k0.K0(attributeValue);
                    strK1.hashCode();
                    switch (strK1) {
                        case "nounderline":
                            eVar = x(eVar).y(false);
                            break;
                        case "underline":
                            eVar = x(eVar).y(true);
                            break;
                        case "nolinethrough":
                            eVar = x(eVar).w(false);
                            break;
                        case "linethrough":
                            eVar = x(eVar).w(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    eVar = x(eVar).p("bold".equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if ("style".equals(xmlPullParser.getName())) {
                        eVar = x(eVar).u(attributeValue);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "color":
                    eVar = x(eVar);
                    try {
                        eVar.q(g5.e.d(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        m.h("TtmlDecoder", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        eVar = x(eVar);
                        A(attributeValue, eVar);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        m.h("TtmlDecoder", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "backgroundColor":
                    eVar = x(eVar);
                    try {
                        eVar.o(g5.e.d(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        m.h("TtmlDecoder", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
            }
        }
        return eVar;
    }

    public final String[] H(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        return k0.D0(strTrim, "\\s+");
    }
}
