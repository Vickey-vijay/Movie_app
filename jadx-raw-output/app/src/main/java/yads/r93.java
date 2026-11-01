package yads;

import android.text.Layout;
import com.ironsource.Z7;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class r93 extends fz2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f82153n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f82154o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f82155p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f82156q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f82157r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f82158s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f82159t = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p93 f82160u = new p93(30.0f, 1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final o93 f82161v = new o93(15);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final XmlPullParserFactory f82162m;

    public static v93 a(v93 v93Var) {
        return v93Var == null ? new v93() : v93Var;
    }

    public static Layout.Alignment b(String str) {
        String strA = ki.a(str);
        strA.getClass();
        switch (strA) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    @Override // yads.fz2
    public final r43 a(byte[] bArr, int i10, boolean z10) throws t43 {
        p93 p93Var;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f82162m.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new t93("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            q93 q93VarB = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            p93 p93VarA = f82160u;
            o93 o93VarA = f82161v;
            int i11 = 0;
            w93 w93Var = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                s93 s93Var = (s93) arrayDeque.peek();
                if (i11 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            p93VarA = a(xmlPullParserNewPullParser);
                            o93VarA = a(xmlPullParserNewPullParser, f82161v);
                            q93VarB = b(xmlPullParserNewPullParser);
                        }
                        q93 q93Var = q93VarB;
                        p93 p93Var2 = p93VarA;
                        o93 o93Var = o93VarA;
                        if (a(name)) {
                            if ("head".equals(name)) {
                                p93Var = p93Var2;
                                a(xmlPullParserNewPullParser, map, o93Var, q93Var, map2, map3);
                            } else {
                                p93Var = p93Var2;
                                try {
                                    s93 s93VarA = a(xmlPullParserNewPullParser, s93Var, map2, p93Var);
                                    arrayDeque.push(s93VarA);
                                    if (s93Var != null) {
                                        if (s93Var.f82566m == null) {
                                            s93Var.f82566m = new ArrayList();
                                        }
                                        s93Var.f82566m.add(s93VarA);
                                    }
                                } catch (t43 e10) {
                                    ih1.d("TtmlDecoder", ih1.a("Suppressing parser error", e10));
                                    p93VarA = p93Var;
                                    q93VarB = q93Var;
                                    o93VarA = o93Var;
                                    i11++;
                                }
                            }
                            p93VarA = p93Var;
                            q93VarB = q93Var;
                            o93VarA = o93Var;
                        } else {
                            ih1.c("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            p93Var = p93Var2;
                        }
                        p93VarA = p93Var;
                        q93VarB = q93Var;
                        o93VarA = o93Var;
                        i11++;
                    } else if (eventType == 4) {
                        s93Var.getClass();
                        s93 s93VarA2 = s93.a(xmlPullParserNewPullParser.getText());
                        if (s93Var.f82566m == null) {
                            s93Var.f82566m = new ArrayList();
                        }
                        s93Var.f82566m.add(s93VarA2);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            s93 s93Var2 = (s93) arrayDeque.peek();
                            s93Var2.getClass();
                            w93Var = new w93(s93Var2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (w93Var != null) {
                return w93Var;
            }
            throw new t43("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new t43("Unable to decode source", e12);
        }
    }

    public r93() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f82162m = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static q93 b(XmlPullParser xmlPullParser) {
        String strA = sp3.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f82158s.matcher(strA);
        if (!matcher.matches()) {
            ih1.d("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(strA));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new q93(i10, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            ih1.d("TtmlDecoder", "Ignoring malformed tts extent: ".concat(strA));
            return null;
        }
    }

    public static boolean a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static o93 a(XmlPullParser xmlPullParser, o93 o93Var) throws t43 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return o93Var;
        }
        Matcher matcher = f82159t.matcher(attributeValue);
        if (!matcher.matches()) {
            ih1.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return o93Var;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i11 = Integer.parseInt(strGroup2);
            if (i10 != 0 && i11 != 0) {
                return new o93(i11);
            }
            throw new t43("Invalid cell resolution " + i10 + Z7.f27998r + i11);
        } catch (NumberFormatException unused) {
            ih1.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return o93Var;
        }
    }

    public static void a(String str, v93 v93Var) throws t43 {
        Matcher matcher;
        int i10 = ib3.f78556a;
        String[] strArrSplit = str.split("\\s+", -1);
        if (strArrSplit.length == 1) {
            matcher = f82155p.matcher(str);
        } else if (strArrSplit.length == 2) {
            matcher = f82155p.matcher(strArrSplit[1]);
            ih1.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new t43("Invalid number of entries for fontSize: " + strArrSplit.length + ".");
        }
        if (matcher.matches()) {
            String strGroup = matcher.group(3);
            strGroup.getClass();
            switch (strGroup) {
                case "%":
                    v93Var.f83845j = 3;
                    break;
                case "em":
                    v93Var.f83845j = 2;
                    break;
                case "px":
                    v93Var.f83845j = 1;
                    break;
                default:
                    throw new t43("Invalid unit for fontSize: '" + strGroup + "'.");
            }
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            v93Var.f83846k = Float.parseFloat(strGroup2);
            return;
        }
        throw new t43("Invalid expression for fontSize: '" + str + "'.");
    }

    public static p93 a(XmlPullParser xmlPullParser) throws t43 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = ib3.f78556a;
            String[] strArrSplit = attributeValue2.split(Z7.f27998r, -1);
            if (strArrSplit.length == 2) {
                f10 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
            } else {
                throw new t43("frameRateMultiplier doesn't have 2 parts");
            }
        }
        p93 p93Var = f82160u;
        int i12 = p93Var.f81317b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        int i13 = p93Var.f81318c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i13 = Integer.parseInt(attributeValue4);
        }
        return new p93(i10 * f10, i12, i13);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:43:0x0120  */
    /* JADX WARN: Code duplicated, block: B:45:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0128  */
    /* JADX WARN: Code duplicated, block: B:51:0x015b  */
    /* JADX WARN: Code duplicated, block: B:53:0x016a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0173  */
    /* JADX WARN: Code duplicated, block: B:57:0x0178  */
    /* JADX WARN: Code duplicated, block: B:58:0x0182  */
    /* JADX WARN: Code duplicated, block: B:61:0x0196  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f7  */
    public static void a(XmlPullParser xmlPullParser, HashMap map, o93 o93Var, q93 q93Var, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strA;
        float f10;
        float f11;
        String strA2;
        Matcher matcher;
        Matcher matcher2;
        float f12;
        float f13;
        String strA3;
        int i10;
        String strA4;
        int i11;
        t93 t93Var;
        String strA5;
        String strA6;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (sp3.c(xmlPullParser, "style")) {
                String strA7 = sp3.a(xmlPullParser, "style");
                v93 v93VarA = a(xmlPullParser, new v93());
                if (strA7 != null) {
                    String strTrim = strA7.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        int i12 = ib3.f78556a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str : strArrSplit) {
                        v93VarA.a((v93) map.get(str));
                    }
                }
                String str2 = v93VarA.f83847l;
                if (str2 != null) {
                    map.put(str2, v93VarA);
                }
            } else if (sp3.c(xmlPullParser, "region")) {
                String strA8 = sp3.a(xmlPullParser, "id");
                if (strA8 != null) {
                    String strA9 = sp3.a(xmlPullParser, "origin");
                    if (strA9 != null) {
                        Pattern pattern = f82157r;
                        Matcher matcher3 = pattern.matcher(strA9);
                        Pattern pattern2 = f82158s;
                        Matcher matcher4 = pattern2.matcher(strA9);
                        if (matcher3.matches()) {
                            try {
                                String strGroup = matcher3.group(1);
                                strGroup.getClass();
                                float f14 = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher3.group(2);
                                strGroup2.getClass();
                                f10 = Float.parseFloat(strGroup2) / 100.0f;
                                f11 = f14;
                                strA2 = sp3.a(xmlPullParser, "extent");
                                if (strA2 != null) {
                                    matcher = pattern.matcher(strA2);
                                    matcher2 = pattern2.matcher(strA2);
                                    if (matcher.matches()) {
                                        try {
                                            String strGroup3 = matcher.group(1);
                                            strGroup3.getClass();
                                            float f15 = Float.parseFloat(strGroup3) / 100.0f;
                                            String strGroup4 = matcher.group(2);
                                            strGroup4.getClass();
                                            f12 = Float.parseFloat(strGroup4) / 100.0f;
                                            f13 = f15;
                                        } catch (NumberFormatException unused) {
                                            ih1.d("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strA9));
                                            t93Var = null;
                                        }
                                    } else if (matcher2.matches()) {
                                        ih1.d("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(strA9));
                                    } else if (q93Var == null) {
                                        ih1.d("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strA9));
                                    } else {
                                        try {
                                            String strGroup5 = matcher2.group(1);
                                            strGroup5.getClass();
                                            int i13 = Integer.parseInt(strGroup5);
                                            String strGroup6 = matcher2.group(2);
                                            strGroup6.getClass();
                                            float f16 = Integer.parseInt(strGroup6);
                                            f13 = i13 / q93Var.f81778a;
                                            f12 = f16 / q93Var.f81779b;
                                        } catch (NumberFormatException unused2) {
                                            ih1.d("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strA9));
                                            t93Var = null;
                                        }
                                    }
                                    strA3 = sp3.a(xmlPullParser, "displayAlign");
                                    if (strA3 != null) {
                                        strA6 = ki.a(strA3);
                                        strA6.getClass();
                                        if (!strA6.equals("center")) {
                                            f10 = (f12 / 2.0f) + f10;
                                            i10 = 1;
                                        } else if (strA6.equals("after")) {
                                            f10 += f12;
                                            i10 = 2;
                                        } else {
                                            i10 = 0;
                                        }
                                    } else {
                                        i10 = 0;
                                    }
                                    float f17 = 1.0f / o93Var.f80983a;
                                    strA4 = sp3.a(xmlPullParser, "writingMode");
                                    if (strA4 != null) {
                                        strA5 = ki.a(strA4);
                                        strA5.getClass();
                                        switch (strA5) {
                                            case "tb":
                                            case "tblr":
                                                i11 = 2;
                                                break;
                                            case "tbrl":
                                                i11 = 1;
                                                break;
                                            default:
                                                i11 = Integer.MIN_VALUE;
                                                break;
                                        }
                                    } else {
                                        i11 = Integer.MIN_VALUE;
                                    }
                                    t93Var = new t93(strA8, f11, f10, 0, i10, f13, f12, 1, f17, i11);
                                } else {
                                    ih1.d("TtmlDecoder", "Ignoring region without an extent");
                                }
                            } catch (NumberFormatException unused3) {
                                ih1.d("TtmlDecoder", "Ignoring region with malformed origin: ".concat(strA9));
                            }
                        } else if (!matcher4.matches()) {
                            ih1.d("TtmlDecoder", "Ignoring region with unsupported origin: ".concat(strA9));
                        } else if (q93Var == null) {
                            ih1.d("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strA9));
                        } else {
                            try {
                                String strGroup7 = matcher4.group(1);
                                strGroup7.getClass();
                                int i14 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                strGroup8.getClass();
                                int i15 = Integer.parseInt(strGroup8);
                                f11 = i14 / q93Var.f81778a;
                                f10 = i15 / q93Var.f81779b;
                                strA2 = sp3.a(xmlPullParser, "extent");
                                if (strA2 != null) {
                                    matcher = pattern.matcher(strA2);
                                    matcher2 = pattern2.matcher(strA2);
                                    if (matcher.matches()) {
                                        String strGroup9 = matcher.group(1);
                                        strGroup9.getClass();
                                        float f18 = Float.parseFloat(strGroup9) / 100.0f;
                                        String strGroup10 = matcher.group(2);
                                        strGroup10.getClass();
                                        f12 = Float.parseFloat(strGroup10) / 100.0f;
                                        f13 = f18;
                                    } else if (matcher2.matches()) {
                                        ih1.d("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(strA9));
                                    } else if (q93Var == null) {
                                        ih1.d("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strA9));
                                    } else {
                                        String strGroup11 = matcher2.group(1);
                                        strGroup11.getClass();
                                        int i16 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher2.group(2);
                                        strGroup12.getClass();
                                        float f19 = Integer.parseInt(strGroup12);
                                        f13 = i16 / q93Var.f81778a;
                                        f12 = f19 / q93Var.f81779b;
                                    }
                                    strA3 = sp3.a(xmlPullParser, "displayAlign");
                                    if (strA3 != null) {
                                        strA6 = ki.a(strA3);
                                        strA6.getClass();
                                        if (!strA6.equals("center")) {
                                            f10 = (f12 / 2.0f) + f10;
                                            i10 = 1;
                                        } else if (strA6.equals("after")) {
                                            i10 = 0;
                                        } else {
                                            f10 += f12;
                                            i10 = 2;
                                        }
                                    } else {
                                        i10 = 0;
                                    }
                                    float f110 = 1.0f / o93Var.f80983a;
                                    strA4 = sp3.a(xmlPullParser, "writingMode");
                                    if (strA4 != null) {
                                        strA5 = ki.a(strA4);
                                        strA5.getClass();
                                        switch (strA5) {
                                            case 3694:
                                                if (!strA5.equals("tb")) {
                                                }
                                                break;
                                            case 3553396:
                                                if (!strA5.equals("tblr")) {
                                                }
                                                break;
                                            case 3553576:
                                                if (!strA5.equals("tbrl")) {
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                        /*  JADX ERROR: Method code generation error
                                            java.lang.NullPointerException: Switch insn not found in header
                                            	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:216)
                                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                            */
                                        /*
                                            Method dump skipped, instruction units count: 628
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: yads.r93.a(org.xmlpull.v1.XmlPullParser, java.util.HashMap, yads.o93, yads.q93, java.util.HashMap, java.util.HashMap):void");
                                    }

                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                    /* JADX WARN: Code duplicated, block: B:6:0x0038  */
                                    /* JADX WARN: Code duplicated, block: B:70:0x00fc  */
                                    public static s93 a(XmlPullParser xmlPullParser, s93 s93Var, HashMap map, p93 p93Var) throws t43 {
                                        long j10;
                                        long j11;
                                        String[] strArrSplit;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        v93 v93VarA = a(xmlPullParser, (v93) null);
                                        String strSubstring = null;
                                        String str = "";
                                        long jA = -9223372036854775807L;
                                        long jA2 = -9223372036854775807L;
                                        long jA3 = -9223372036854775807L;
                                        String[] strArr = null;
                                        for (int i10 = 0; i10 < attributeCount; i10++) {
                                            String attributeName = xmlPullParser.getAttributeName(i10);
                                            String attributeValue = xmlPullParser.getAttributeValue(i10);
                                            attributeName.getClass();
                                            switch (attributeName) {
                                                case "region":
                                                    if (map.containsKey(attributeValue)) {
                                                        str = attributeValue;
                                                        continue;
                                                    }
                                                    break;
                                                case "dur":
                                                    jA3 = a(attributeValue, p93Var);
                                                    break;
                                                case "end":
                                                    jA2 = a(attributeValue, p93Var);
                                                    break;
                                                case "begin":
                                                    jA = a(attributeValue, p93Var);
                                                    break;
                                                case "style":
                                                    String strTrim = attributeValue.trim();
                                                    if (strTrim.isEmpty()) {
                                                        strArrSplit = new String[0];
                                                    } else {
                                                        int i11 = ib3.f78556a;
                                                        strArrSplit = strTrim.split("\\s+", -1);
                                                    }
                                                    if (strArrSplit.length > 0) {
                                                        strArr = strArrSplit;
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
                                        if (s93Var != null) {
                                            long j12 = s93Var.f82557d;
                                            j10 = -9223372036854775807L;
                                            if (j12 != -9223372036854775807L) {
                                                if (jA != -9223372036854775807L) {
                                                    jA += j12;
                                                }
                                                if (jA2 != -9223372036854775807L) {
                                                    jA2 += j12;
                                                }
                                            }
                                        } else {
                                            j10 = -9223372036854775807L;
                                        }
                                        if (jA2 != j10) {
                                            j11 = jA2;
                                        } else if (jA3 != j10) {
                                            j11 = jA + jA3;
                                        } else if (s93Var != null) {
                                            long j13 = s93Var.f82558e;
                                            if (j13 != j10) {
                                                j11 = j13;
                                            } else {
                                                j11 = jA2;
                                            }
                                        } else {
                                            j11 = jA2;
                                        }
                                        return new s93(xmlPullParser.getName(), null, jA, j11, v93VarA, strArr, str, strSubstring, s93Var);
                                    }

                                    public static v93 a(XmlPullParser xmlPullParser, v93 v93Var) {
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        for (int i10 = 0; i10 < attributeCount; i10++) {
                                            String attributeValue = xmlPullParser.getAttributeValue(i10);
                                            String attributeName = xmlPullParser.getAttributeName(i10);
                                            attributeName.getClass();
                                            switch (attributeName) {
                                                case "fontStyle":
                                                    v93Var = a(v93Var);
                                                    v93Var.f83844i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case "fontFamily":
                                                    v93Var = a(v93Var);
                                                    v93Var.f83836a = attributeValue;
                                                    break;
                                                case "textAlign":
                                                    v93Var = a(v93Var);
                                                    v93Var.f83850o = b(attributeValue);
                                                    break;
                                                case "textDecoration":
                                                    String strA = ki.a(attributeValue);
                                                    strA.getClass();
                                                    switch (strA) {
                                                        case "nounderline":
                                                            v93Var = a(v93Var);
                                                            v93Var.f83842g = 0;
                                                            break;
                                                        case "underline":
                                                            v93Var = a(v93Var);
                                                            v93Var.f83842g = 1;
                                                            break;
                                                        case "nolinethrough":
                                                            v93Var = a(v93Var);
                                                            v93Var.f83841f = 0;
                                                            break;
                                                        case "linethrough":
                                                            v93Var = a(v93Var);
                                                            v93Var.f83841f = 1;
                                                            break;
                                                    }
                                                    break;
                                                case "fontWeight":
                                                    v93Var = a(v93Var);
                                                    v93Var.f83843h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case "id":
                                                    if (!"style".equals(xmlPullParser.getName())) {
                                                        break;
                                                    } else {
                                                        v93Var = a(v93Var);
                                                        v93Var.f83847l = attributeValue;
                                                        break;
                                                    }
                                                    break;
                                                case "ruby":
                                                    String strA2 = ki.a(attributeValue);
                                                    strA2.getClass();
                                                    switch (strA2) {
                                                        case "baseContainer":
                                                        case "base":
                                                            v93Var = a(v93Var);
                                                            v93Var.f83848m = 2;
                                                            break;
                                                        case "container":
                                                            v93Var = a(v93Var);
                                                            v93Var.f83848m = 1;
                                                            break;
                                                        case "delimiter":
                                                            v93Var = a(v93Var);
                                                            v93Var.f83848m = 4;
                                                            break;
                                                        case "textContainer":
                                                        case "text":
                                                            v93Var = a(v93Var);
                                                            v93Var.f83848m = 3;
                                                            break;
                                                    }
                                                    break;
                                                case "color":
                                                    v93Var = a(v93Var);
                                                    try {
                                                        v93Var.f83837b = nx.a(attributeValue, false);
                                                        v93Var.f83838c = true;
                                                        break;
                                                    } catch (IllegalArgumentException unused) {
                                                        pk1.a("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                                                        break;
                                                    }
                                                    break;
                                                case "shear":
                                                    v93Var = a(v93Var);
                                                    Matcher matcher = f82156q.matcher(attributeValue);
                                                    float fMin = Float.MAX_VALUE;
                                                    if (!matcher.matches()) {
                                                        pk1.a("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                                                    } else {
                                                        try {
                                                            String strGroup = matcher.group(1);
                                                            strGroup.getClass();
                                                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                                                        } catch (NumberFormatException e10) {
                                                            ih1.d("TtmlDecoder", ih1.a("Failed to parse shear: " + attributeValue, e10));
                                                        }
                                                        break;
                                                    }
                                                    v93Var.f83854s = fMin;
                                                    break;
                                                case "textCombine":
                                                    String strA3 = ki.a(attributeValue);
                                                    strA3.getClass();
                                                    if (!strA3.equals("all")) {
                                                        if (strA3.equals("none")) {
                                                            v93Var = a(v93Var);
                                                            v93Var.f83852q = 0;
                                                        }
                                                        break;
                                                    } else {
                                                        v93Var = a(v93Var);
                                                        v93Var.f83852q = 1;
                                                        break;
                                                    }
                                                    break;
                                                case "fontSize":
                                                    try {
                                                        v93Var = a(v93Var);
                                                        a(attributeValue, v93Var);
                                                        break;
                                                    } catch (t43 unused2) {
                                                        pk1.a("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                                                        break;
                                                    }
                                                    break;
                                                case "textEmphasis":
                                                    v93Var = a(v93Var);
                                                    v93Var.f83853r = v53.a(attributeValue);
                                                    break;
                                                case "rubyPosition":
                                                    String strA4 = ki.a(attributeValue);
                                                    strA4.getClass();
                                                    if (!strA4.equals("before")) {
                                                        if (strA4.equals("after")) {
                                                            v93Var = a(v93Var);
                                                            v93Var.f83849n = 2;
                                                        }
                                                        break;
                                                    } else {
                                                        v93Var = a(v93Var);
                                                        v93Var.f83849n = 1;
                                                        break;
                                                    }
                                                    break;
                                                case "backgroundColor":
                                                    v93Var = a(v93Var);
                                                    try {
                                                        v93Var.f83839d = nx.a(attributeValue, false);
                                                        v93Var.f83840e = true;
                                                        break;
                                                    } catch (IllegalArgumentException unused3) {
                                                        pk1.a("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                                                        break;
                                                    }
                                                    break;
                                                case "multiRowAlign":
                                                    v93Var = a(v93Var);
                                                    v93Var.f83851p = b(attributeValue);
                                                    break;
                                            }
                                        }
                                        return v93Var;
                                    }

                                    public static long a(String str, p93 p93Var) throws t43 {
                                        double d10;
                                        double d11;
                                        Matcher matcher = f82153n.matcher(str);
                                        if (matcher.matches()) {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            double d12 = Long.parseLong(strGroup) * 3600;
                                            String strGroup2 = matcher.group(2);
                                            strGroup2.getClass();
                                            double d13 = d12 + (Long.parseLong(strGroup2) * 60);
                                            String strGroup3 = matcher.group(3);
                                            strGroup3.getClass();
                                            double d14 = d13 + Long.parseLong(strGroup3);
                                            String strGroup4 = matcher.group(4);
                                            double d15 = d14 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
                                            String strGroup5 = matcher.group(5);
                                            double d16 = d15 + (strGroup5 != null ? Long.parseLong(strGroup5) / p93Var.f81316a : 0.0d);
                                            String strGroup6 = matcher.group(6);
                                            return (long) ((d16 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) p93Var.f81317b)) / ((double) p93Var.f81316a) : 0.0d)) * 1000000.0d);
                                        }
                                        Matcher matcher2 = f82154o.matcher(str);
                                        if (matcher2.matches()) {
                                            String strGroup7 = matcher2.group(1);
                                            strGroup7.getClass();
                                            double d17 = Double.parseDouble(strGroup7);
                                            String strGroup8 = matcher2.group(2);
                                            strGroup8.getClass();
                                            switch (strGroup8) {
                                                case "f":
                                                    d10 = p93Var.f81316a;
                                                    d17 /= d10;
                                                    return (long) (d17 * 1000000.0d);
                                                case "h":
                                                    d11 = 3600.0d;
                                                    break;
                                                case "m":
                                                    d11 = 60.0d;
                                                    break;
                                                case "t":
                                                    d10 = p93Var.f81318c;
                                                    d17 /= d10;
                                                    return (long) (d17 * 1000000.0d);
                                                case "ms":
                                                    d10 = 1000.0d;
                                                    d17 /= d10;
                                                    return (long) (d17 * 1000000.0d);
                                                default:
                                                    return (long) (d17 * 1000000.0d);
                                            }
                                            d17 *= d11;
                                            return (long) (d17 * 1000000.0d);
                                        }
                                        throw new t43("Malformed time expression: " + str);
                                    }
                                }
