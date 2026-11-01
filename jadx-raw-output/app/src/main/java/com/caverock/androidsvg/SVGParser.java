package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.ironsource.C3426d4;
import com.ironsource.G5;
import com.safedk.android.utils.SdksMapping;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class SVGParser {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13905d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SVG f13902a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SVG.h0 f13903b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13904c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13906e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SVGElem f13907f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public StringBuilder f13908g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13909h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public StringBuilder f13910i = null;

    public enum SVGAttr {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Map<String, SVGAttr> f13911b = new HashMap();

        static {
            for (SVGAttr sVGAttr : values()) {
                if (sVGAttr == CLASS) {
                    f13911b.put(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, sVGAttr);
                } else {
                    if (sVGAttr != UNSUPPORTED) {
                        f13911b.put(sVGAttr.name().replace('_', '-'), sVGAttr);
                    }
                }
            }
        }

        public static SVGAttr fromString(String str) {
            SVGAttr sVGAttr = f13911b.get(str);
            return sVGAttr != null ? sVGAttr : UNSUPPORTED;
        }
    }

    public enum SVGElem {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Map<String, SVGElem> f13922b = new HashMap();

        static {
            for (SVGElem sVGElem : values()) {
                if (sVGElem == SWITCH) {
                    f13922b.put("switch", sVGElem);
                } else if (sVGElem != UNSUPPORTED) {
                    f13922b.put(sVGElem.name(), sVGElem);
                }
            }
        }

        public static SVGElem fromString(String str) {
            SVGElem sVGElem = f13922b.get(str);
            return sVGElem != null ? sVGElem : UNSUPPORTED;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, PreserveAspectRatio.Alignment> f13927a;

        static {
            HashMap map = new HashMap(10);
            f13927a = map;
            map.put("none", PreserveAspectRatio.Alignment.none);
            map.put("xMinYMin", PreserveAspectRatio.Alignment.xMinYMin);
            map.put("xMidYMin", PreserveAspectRatio.Alignment.xMidYMin);
            map.put("xMaxYMin", PreserveAspectRatio.Alignment.xMaxYMin);
            map.put("xMinYMid", PreserveAspectRatio.Alignment.xMinYMid);
            map.put("xMidYMid", PreserveAspectRatio.Alignment.xMidYMid);
            map.put("xMaxYMid", PreserveAspectRatio.Alignment.xMaxYMid);
            map.put("xMinYMax", PreserveAspectRatio.Alignment.xMinYMax);
            map.put("xMidYMax", PreserveAspectRatio.Alignment.xMidYMax);
            map.put("xMaxYMax", PreserveAspectRatio.Alignment.xMaxYMax);
        }

        public static PreserveAspectRatio.Alignment a(String str) {
            return f13927a.get(str);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, Integer> f13928a;

        static {
            HashMap map = new HashMap(47);
            f13928a = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
            map.put("blanchedalmond", -5171);
            map.put("blue", -16776961);
            map.put("blueviolet", -7722014);
            map.put("brown", -5952982);
            map.put("burlywood", -2180985);
            map.put("cadetblue", -10510688);
            map.put("chartreuse", -8388864);
            map.put("chocolate", -2987746);
            map.put("coral", -32944);
            map.put("cornflowerblue", -10185235);
            map.put("cornsilk", -1828);
            map.put("crimson", -2354116);
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            map.put("darkcyan", -16741493);
            map.put("darkgoldenrod", -4684277);
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            map.put("darkmagenta", -7667573);
            map.put("darkolivegreen", -11179217);
            map.put("darkorange", -29696);
            map.put("darkorchid", -6737204);
            map.put("darkred", -7667712);
            map.put("darksalmon", -1468806);
            map.put("darkseagreen", -7357297);
            map.put("darkslateblue", -12042869);
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            map.put("deeppink", -60269);
            map.put("deepskyblue", -16728065);
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            map.put("floralwhite", -1296);
            map.put("forestgreen", -14513374);
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            map.put("ghostwhite", -460545);
            map.put("gold", -10496);
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            map.put("green", -16744448);
            map.put("greenyellow", -5374161);
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            map.put("hotpink", -38476);
            map.put("indianred", -3318692);
            map.put("indigo", -11861886);
            map.put("ivory", -16);
            map.put("khaki", -989556);
            map.put("lavender", -1644806);
            map.put("lavenderblush", -3851);
            map.put("lawngreen", -8586240);
            map.put("lemonchiffon", -1331);
            map.put("lightblue", -5383962);
            map.put("lightcoral", -1015680);
            map.put("lightcyan", -2031617);
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            map.put("lightpink", -18751);
            map.put("lightsalmon", -24454);
            map.put("lightseagreen", -14634326);
            map.put("lightskyblue", -7876870);
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            map.put("lime", -16711936);
            map.put("limegreen", -13447886);
            map.put("linen", -331546);
            map.put("magenta", -65281);
            map.put("maroon", -8388608);
            map.put("mediumaquamarine", -10039894);
            map.put("mediumblue", -16777011);
            map.put("mediumorchid", -4565549);
            map.put("mediumpurple", -7114533);
            map.put("mediumseagreen", -12799119);
            map.put("mediumslateblue", -8689426);
            map.put("mediumspringgreen", -16713062);
            map.put("mediumturquoise", -12004916);
            map.put("mediumvioletred", -3730043);
            map.put("midnightblue", -15132304);
            map.put("mintcream", -655366);
            map.put("mistyrose", -6943);
            map.put("moccasin", -6987);
            map.put("navajowhite", -8531);
            map.put("navy", -16777088);
            map.put("oldlace", -133658);
            map.put("olive", -8355840);
            map.put("olivedrab", -9728477);
            map.put("orange", -23296);
            map.put("orangered", -47872);
            map.put("orchid", -2461482);
            map.put("palegoldenrod", -1120086);
            map.put("palegreen", -6751336);
            map.put("paleturquoise", -5247250);
            map.put("palevioletred", -2396013);
            map.put("papayawhip", -4139);
            map.put("peachpuff", -9543);
            map.put("peru", -3308225);
            map.put("pink", -16181);
            map.put("plum", -2252579);
            map.put("powderblue", -5185306);
            map.put("purple", -8388480);
            map.put("rebeccapurple", -10079335);
            map.put("red", Integer.valueOf(SupportMenu.CATEGORY_MASK));
            map.put("rosybrown", -4419697);
            map.put("royalblue", -12490271);
            map.put("saddlebrown", -7650029);
            map.put("salmon", -360334);
            map.put("sandybrown", -744352);
            map.put("seagreen", -13726889);
            map.put("seashell", -2578);
            map.put("sienna", -6270419);
            map.put("silver", -4144960);
            map.put("skyblue", -7876885);
            map.put("slateblue", -9807155);
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            map.put("steelblue", -12156236);
            map.put("tan", -2968436);
            map.put("teal", -16744320);
            map.put("thistle", -2572328);
            map.put("tomato", -40121);
            map.put("turquoise", -12525360);
            map.put("violet", -1146130);
            map.put("wheat", -663885);
            map.put("white", -1);
            map.put("whitesmoke", -657931);
            map.put("yellow", Integer.valueOf(InputDeviceCompat.SOURCE_ANY));
            map.put("yellowgreen", -6632142);
            map.put(C3426d4.i.T, 0);
        }

        public static Integer a(String str) {
            return f13928a.get(str);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, SVG.o> f13929a;

        static {
            HashMap map = new HashMap(9);
            f13929a = map;
            SVG.Unit unit = SVG.Unit.pt;
            map.put("xx-small", new SVG.o(0.694f, unit));
            map.put("x-small", new SVG.o(0.833f, unit));
            map.put("small", new SVG.o(10.0f, unit));
            map.put("medium", new SVG.o(12.0f, unit));
            map.put("large", new SVG.o(14.4f, unit));
            map.put("x-large", new SVG.o(17.3f, unit));
            map.put("xx-large", new SVG.o(20.7f, unit));
            SVG.Unit unit2 = SVG.Unit.percent;
            map.put("smaller", new SVG.o(83.33f, unit2));
            map.put("larger", new SVG.o(120.0f, unit2));
        }

        public static SVG.o a(String str) {
            return f13929a.get(str);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, Integer> f13930a;

        static {
            HashMap map = new HashMap(13);
            f13930a = map;
            map.put("normal", 400);
            map.put("bold", 700);
            map.put("bolder", 1);
            map.put("lighter", -1);
            map.put(StatisticData.ERROR_CODE_NOT_FOUND, 100);
            map.put("200", 200);
            map.put("300", Integer.valueOf(com.safedk.android.internal.d.f44769a));
            map.put("400", 400);
            map.put("500", 500);
            map.put("600", 600);
            map.put("700", 700);
            map.put("800", 800);
            map.put("900", Integer.valueOf(TypedValues.Custom.TYPE_INT));
        }

        public static Integer a(String str) {
            return f13930a.get(str);
        }
    }

    public class f extends DefaultHandler2 {
        public f() {
        }

        public /* synthetic */ f(SVGParser sVGParser, a aVar) {
            this();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) throws SAXException {
            SVGParser.this.c1(new String(cArr, i10, i11));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() throws SAXException {
            SVGParser.this.o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            SVGParser.this.p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) throws SAXException {
            SVGParser.this.r(str, SVGParser.this.x0(new g(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() throws SAXException {
            SVGParser.this.W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            SVGParser.this.X0(str, str2, str3, attributes);
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f13932a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13934c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13933b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e0.b f13935d = new e0.b();

        public boolean j(int i10) {
            return i10 == 10 || i10 == 13;
        }

        public boolean k(int i10) {
            return i10 == 32 || i10 == 10 || i10 == 13 || i10 == 9;
        }

        public String s(char c10) {
            return t(c10, false);
        }

        public String u(char c10) {
            return t(c10, true);
        }

        public void A() {
            while (true) {
                int i10 = this.f13933b;
                if (i10 >= this.f13934c || !k(this.f13932a.charAt(i10))) {
                    return;
                } else {
                    this.f13933b++;
                }
            }
        }

        public int a() {
            int i10 = this.f13933b;
            int i11 = this.f13934c;
            if (i10 == i11) {
                return -1;
            }
            int i12 = i10 + 1;
            this.f13933b = i12;
            if (i12 < i11) {
                return this.f13932a.charAt(i12);
            }
            return -1;
        }

        public String b() {
            int i10 = this.f13933b;
            while (!h() && !k(this.f13932a.charAt(this.f13933b))) {
                this.f13933b++;
            }
            String strSubstring = this.f13932a.substring(i10, this.f13933b);
            this.f13933b = i10;
            return strSubstring;
        }

        public Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        public float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        public boolean f(char c10) {
            int i10 = this.f13933b;
            boolean z10 = i10 < this.f13934c && this.f13932a.charAt(i10) == c10;
            if (z10) {
                this.f13933b++;
            }
            return z10;
        }

        public boolean h() {
            return this.f13933b == this.f13934c;
        }

        public boolean i() {
            int i10 = this.f13933b;
            if (i10 == this.f13934c) {
                return false;
            }
            char cCharAt = this.f13932a.charAt(i10);
            return (cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z');
        }

        public Integer l() {
            int i10 = this.f13933b;
            if (i10 == this.f13934c) {
                return null;
            }
            String str = this.f13932a;
            this.f13933b = i10 + 1;
            return Integer.valueOf(str.charAt(i10));
        }

        public Boolean m() {
            int i10 = this.f13933b;
            if (i10 == this.f13934c) {
                return null;
            }
            char cCharAt = this.f13932a.charAt(i10);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f13933b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        public float n() {
            float fB = this.f13935d.b(this.f13932a, this.f13933b, this.f13934c);
            if (!Float.isNaN(fB)) {
                this.f13933b = this.f13935d.a();
            }
            return fB;
        }

        public String r() {
            return t(' ', false);
        }

        public g(String str) {
            this.f13934c = 0;
            String strTrim = str.trim();
            this.f13932a = strTrim;
            this.f13934c = strTrim.length();
        }

        public float d(float f10) {
            if (Float.isNaN(f10)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        public boolean g(String str) {
            boolean z10;
            int length = str.length();
            int i10 = this.f13933b;
            if (i10 <= this.f13934c - length && this.f13932a.substring(i10, i10 + length).equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f13933b += length;
            }
            return z10;
        }

        public String o() {
            if (h()) {
                return null;
            }
            int i10 = this.f13933b;
            int iCharAt = this.f13932a.charAt(i10);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = a();
            }
            int i11 = this.f13933b;
            while (k(iCharAt)) {
                iCharAt = a();
            }
            if (iCharAt == 40) {
                this.f13933b++;
                return this.f13932a.substring(i10, i11);
            }
            this.f13933b = i10;
            return null;
        }

        public SVG.o p() {
            float fN = n();
            if (Float.isNaN(fN)) {
                return null;
            }
            SVG.Unit unitV = v();
            if (unitV == null) {
                return new SVG.o(fN, SVG.Unit.px);
            }
            return new SVG.o(fN, unitV);
        }

        public String q() {
            if (h()) {
                return null;
            }
            int i10 = this.f13933b;
            char cCharAt = this.f13932a.charAt(i10);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.f13933b = i10;
                return null;
            }
            int i11 = this.f13933b + 1;
            this.f13933b = i11;
            return this.f13932a.substring(i10 + 1, i11 - 1);
        }

        public String t(char c10, boolean z10) {
            if (h()) {
                return null;
            }
            char cCharAt = this.f13932a.charAt(this.f13933b);
            if ((!z10 && k(cCharAt)) || cCharAt == c10) {
                return null;
            }
            int i10 = this.f13933b;
            int iA = a();
            while (iA != -1 && iA != c10 && (z10 || !k(iA))) {
                iA = a();
            }
            return this.f13932a.substring(i10, this.f13933b);
        }

        public SVG.Unit v() {
            if (h()) {
                return null;
            }
            if (this.f13932a.charAt(this.f13933b) == '%') {
                this.f13933b++;
                return SVG.Unit.percent;
            }
            int i10 = this.f13933b;
            if (i10 > this.f13934c - 2) {
                return null;
            }
            try {
                SVG.Unit unitValueOf = SVG.Unit.valueOf(this.f13932a.substring(i10, i10 + 2).toLowerCase(Locale.US));
                this.f13933b += 2;
                return unitValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public String w() {
            if (h()) {
                return null;
            }
            int i10 = this.f13933b;
            char cCharAt = this.f13932a.charAt(i10);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int iA = a();
                while (true) {
                    if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                        break;
                    }
                    iA = a();
                }
                return this.f13932a.substring(i10, this.f13933b);
            }
            this.f13933b = i10;
            return null;
        }

        public float x() {
            z();
            float fB = this.f13935d.b(this.f13932a, this.f13933b, this.f13934c);
            if (!Float.isNaN(fB)) {
                this.f13933b = this.f13935d.a();
            }
            return fB;
        }

        public String y() {
            if (h()) {
                return null;
            }
            int i10 = this.f13933b;
            this.f13933b = this.f13934c;
            return this.f13932a.substring(i10);
        }

        public boolean z() {
            A();
            int i10 = this.f13933b;
            if (i10 == this.f13934c || this.f13932a.charAt(i10) != ',') {
                return false;
            }
            this.f13933b++;
            A();
            return true;
        }
    }

    public class h implements Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public XmlPullParser f13936a;

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i10) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        public h(XmlPullParser xmlPullParser) {
            this.f13936a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f13936a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i10) {
            return this.f13936a.getAttributeName(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i10) {
            String attributeName = this.f13936a.getAttributeName(i10);
            if (this.f13936a.getAttributePrefix(i10) == null) {
                return attributeName;
            }
            return this.f13936a.getAttributePrefix(i10) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i10) {
            return this.f13936a.getAttributeNamespace(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i10) {
            return this.f13936a.getAttributeValue(i10);
        }
    }

    public static SVG.f b0(String str) throws SVGParseException {
        if (str.charAt(0) == '#') {
            e0.a aVarB = e0.a.b(str, 1, str.length());
            if (aVarB == null) {
                throw new SVGParseException("Bad hex colour value: " + str);
            }
            int iA = aVarB.a();
            if (iA == 4) {
                int iD = aVarB.d();
                int i10 = iD & 3840;
                int i11 = iD & 240;
                int i12 = iD & 15;
                return new SVG.f(i12 | (i10 << 8) | (-16777216) | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4));
            }
            if (iA == 5) {
                int iD2 = aVarB.d();
                int i13 = 61440 & iD2;
                int i14 = iD2 & 3840;
                int i15 = iD2 & 240;
                int i16 = iD2 & 15;
                return new SVG.f((i16 << 24) | (i16 << 28) | (i13 << 8) | (i13 << 4) | (i14 << 4) | i14 | i15 | (i15 >> 4));
            }
            if (iA == 7) {
                return new SVG.f(aVarB.d() | ViewCompat.MEASURED_STATE_MASK);
            }
            if (iA == 9) {
                return new SVG.f((aVarB.d() >>> 8) | (aVarB.d() << 24));
            }
            throw new SVGParseException("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return c0(lowerCase);
            }
            g gVar = new g(str.substring(zStartsWith2 ? 5 : 4));
            gVar.A();
            float fN = gVar.n();
            float fD = gVar.d(fN);
            if (!Float.isNaN(fD)) {
                gVar.f('%');
            }
            float fD2 = gVar.d(fD);
            if (!Float.isNaN(fD2)) {
                gVar.f('%');
            }
            if (!zStartsWith2) {
                gVar.A();
                if (!Float.isNaN(fD2) && gVar.f(')')) {
                    return new SVG.f(s(fN, fD, fD2) | ViewCompat.MEASURED_STATE_MASK);
                }
                throw new SVGParseException("Bad hsl() colour value: " + str);
            }
            float fD3 = gVar.d(fD2);
            gVar.A();
            if (!Float.isNaN(fD3) && gVar.f(')')) {
                return new SVG.f((j(fD3 * 256.0f) << 24) | s(fN, fD, fD2));
            }
            throw new SVGParseException("Bad hsla() colour value: " + str);
        }
        g gVar2 = new g(str.substring(zStartsWith ? 5 : 4));
        gVar2.A();
        float fN2 = gVar2.n();
        if (!Float.isNaN(fN2) && gVar2.f('%')) {
            fN2 = (fN2 * 256.0f) / 100.0f;
        }
        float fD4 = gVar2.d(fN2);
        if (!Float.isNaN(fD4) && gVar2.f('%')) {
            fD4 = (fD4 * 256.0f) / 100.0f;
        }
        float fD5 = gVar2.d(fD4);
        if (!Float.isNaN(fD5) && gVar2.f('%')) {
            fD5 = (fD5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            gVar2.A();
            if (!Float.isNaN(fD5) && gVar2.f(')')) {
                return new SVG.f((j(fN2) << 16) | ViewCompat.MEASURED_STATE_MASK | (j(fD4) << 8) | j(fD5));
            }
            throw new SVGParseException("Bad rgb() colour value: " + str);
        }
        float fD6 = gVar2.d(fD5);
        gVar2.A();
        if (!Float.isNaN(fD6) && gVar2.f(')')) {
            return new SVG.f((j(fD6 * 256.0f) << 24) | (j(fN2) << 16) | (j(fD4) << 8) | j(fD5));
        }
        throw new SVGParseException("Bad rgba() colour value: " + str);
    }

    public static int j(float f10) {
        if (f10 < 0.0f) {
            return 0;
        }
        if (f10 > 255.0f) {
            return 255;
        }
        return Math.round(f10);
    }

    public static int s(float f10, float f11, float f12) {
        float f13 = 0.0f;
        float f14 = f10 % 360.0f;
        if (f10 < 0.0f) {
            f14 += 360.0f;
        }
        float f15 = f14 / 60.0f;
        float f16 = f11 / 100.0f;
        float f17 = f12 / 100.0f;
        if (f16 < 0.0f) {
            f16 = 0.0f;
        } else if (f16 > 1.0f) {
            f16 = 1.0f;
        }
        if (f17 >= 0.0f) {
            f13 = f17 > 1.0f ? 1.0f : f17;
        }
        float f18 = f13 <= 0.5f ? (f16 + 1.0f) * f13 : (f13 + f16) - (f16 * f13);
        float f19 = (f13 * 2.0f) - f18;
        return j(t(f19, f18, f15 - 2.0f) * 256.0f) | (j(t(f19, f18, f15 + 2.0f) * 256.0f) << 16) | (j(t(f19, f18, f15) * 256.0f) << 8);
    }

    public static float t(float f10, float f11, float f12) {
        float f13;
        if (f12 < 0.0f) {
            f12 += 6.0f;
        }
        if (f12 >= 6.0f) {
            f12 -= 6.0f;
        }
        if (f12 < 1.0f) {
            f13 = (f11 - f10) * f12;
        } else {
            if (f12 < 3.0f) {
                return f11;
            }
            if (f12 >= 4.0f) {
                return f10;
            }
            f13 = (f11 - f10) * (4.0f - f12);
        }
        return f13 + f10;
    }

    public final void A(SVG.d dVar, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 12:
                    dVar.f13789o = o0(strTrim);
                    break;
                case 13:
                    dVar.f13790p = o0(strTrim);
                    break;
                case 14:
                    SVG.o oVarO0 = o0(strTrim);
                    dVar.f13791q = oVarO0;
                    if (oVarO0.g()) {
                        throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    public final void B(SVG.e eVar, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    eVar.f13797p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute clipPathUnits");
                    }
                    eVar.f13797p = Boolean.TRUE;
                }
            }
        }
    }

    public final void C(SVG.e0 e0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 21:
                    e0Var.g(z0(strTrim));
                    break;
                case 22:
                    e0Var.i(strTrim);
                    break;
                case 23:
                    e0Var.d(F0(strTrim));
                    break;
                case 24:
                    e0Var.h(A0(strTrim));
                    break;
                case 25:
                    List<String> listI0 = i0(strTrim);
                    e0Var.b(listI0 != null ? new HashSet(listI0) : new HashSet(0));
                    break;
            }
        }
    }

    public final void D(SVG.j0 j0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals("id") || qName.equals("xml:id")) {
                j0Var.f13823c = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i10).trim();
                if ("default".equals(strTrim)) {
                    j0Var.f13824d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        j0Var.f13824d = Boolean.TRUE;
                        return;
                    }
                    throw new SVGParseException("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    public final void E(SVG.i iVar, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 10:
                    SVG.o oVarO0 = o0(strTrim);
                    iVar.f13815q = oVarO0;
                    if (oVarO0.g()) {
                        throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    SVG.o oVarO1 = o0(strTrim);
                    iVar.f13816r = oVarO1;
                    if (oVarO1.g()) {
                        throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case 12:
                    iVar.f13813o = o0(strTrim);
                    break;
                case 13:
                    iVar.f13814p = o0(strTrim);
                    break;
            }
        }
    }

    public final void F(SVG.j jVar, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                switch (i11) {
                    case 32:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new SVGParseException("Invalid value for attribute gradientUnits");
                            }
                            jVar.f13819i = Boolean.TRUE;
                        } else {
                            jVar.f13819i = Boolean.FALSE;
                        }
                        break;
                    case 33:
                        jVar.f13820j = J0(strTrim);
                        break;
                    case 34:
                        try {
                            jVar.f13821k = SVG.GradientSpread.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new SVGParseException("Invalid spreadMethod attribute. \"" + strTrim + "\" is not a valid value.");
                        }
                        break;
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                jVar.f13822l = strTrim;
            }
        }
    }

    public final void G(SVG.n nVar, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                nVar.f13837q = o0(strTrim);
            } else if (i11 == 2) {
                nVar.f13838r = o0(strTrim);
            } else if (i11 == 3) {
                SVG.o oVarO0 = o0(strTrim);
                nVar.f13839s = oVarO0;
                if (oVarO0.g()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                SVG.o oVarO1 = o0(strTrim);
                nVar.f13840t = oVarO1;
                if (oVarO1.g()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                if (i11 == 7) {
                    w0(nVar, strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                nVar.f13836p = strTrim;
            }
        }
    }

    public final void H(SVG.p pVar, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    pVar.f13850o = o0(strTrim);
                    break;
                case 16:
                    pVar.f13851p = o0(strTrim);
                    break;
                case 17:
                    pVar.f13852q = o0(strTrim);
                    break;
                case 18:
                    pVar.f13853r = o0(strTrim);
                    break;
            }
        }
    }

    public final void I(SVG.k0 k0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    k0Var.f13829m = o0(strTrim);
                    break;
                case 16:
                    k0Var.f13830n = o0(strTrim);
                    break;
                case 17:
                    k0Var.f13831o = o0(strTrim);
                    break;
                case 18:
                    k0Var.f13832p = o0(strTrim);
                    break;
            }
        }
    }

    public final void J(SVG.q qVar, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 26:
                    qVar.f13856r = o0(strTrim);
                    break;
                case 27:
                    qVar.f13857s = o0(strTrim);
                    break;
                case 28:
                    SVG.o oVarO0 = o0(strTrim);
                    qVar.f13858t = oVarO0;
                    if (oVarO0.g()) {
                        throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    SVG.o oVarO1 = o0(strTrim);
                    qVar.f13859u = oVarO1;
                    if (oVarO1.g()) {
                        throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new SVGParseException("Invalid value for attribute markerUnits");
                        }
                        qVar.f13855q = true;
                    } else {
                        qVar.f13855q = false;
                    }
                    break;
                case 31:
                    if ("auto".equals(strTrim)) {
                        qVar.f13860v = Float.valueOf(Float.NaN);
                    } else {
                        qVar.f13860v = Float.valueOf(f0(strTrim));
                    }
                    break;
            }
        }
    }

    public final void K(SVG.r rVar, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                rVar.f13863q = o0(strTrim);
            } else if (i11 == 2) {
                rVar.f13864r = o0(strTrim);
            } else if (i11 == 3) {
                SVG.o oVarO0 = o0(strTrim);
                rVar.f13865s = oVarO0;
                if (oVarO0.g()) {
                    throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                SVG.o oVarO1 = o0(strTrim);
                rVar.f13866t = oVarO1;
                if (oVarO1.g()) {
                    throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                }
            } else if (i11 != 43) {
                if (i11 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    rVar.f13862p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute maskContentUnits");
                    }
                    rVar.f13862p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                rVar.f13861o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new SVGParseException("Invalid value for attribute maskUnits");
                }
                rVar.f13861o = Boolean.TRUE;
            }
        }
    }

    public final void L(SVG.u uVar, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 8) {
                uVar.f13872o = u0(strTrim);
            } else if (i11 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(f0(strTrim));
                uVar.f13873p = fValueOf;
                if (fValueOf.floatValue() < 0.0f) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    public final void M(SVG.x xVar, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                xVar.f13882t = o0(strTrim);
            } else if (i11 == 2) {
                xVar.f13883u = o0(strTrim);
            } else if (i11 == 3) {
                SVG.o oVarO0 = o0(strTrim);
                xVar.f13884v = oVarO0;
                if (oVarO0.g()) {
                    throw new SVGParseException("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                SVG.o oVarO1 = o0(strTrim);
                xVar.f13885w = oVarO1;
                if (oVarO1.g()) {
                    throw new SVGParseException("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                switch (i11) {
                    case 40:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new SVGParseException("Invalid value for attribute patternUnits");
                            }
                            xVar.f13879q = Boolean.TRUE;
                        } else {
                            xVar.f13879q = Boolean.FALSE;
                        }
                        break;
                    case 41:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new SVGParseException("Invalid value for attribute patternContentUnits");
                            }
                            xVar.f13880r = Boolean.TRUE;
                        } else {
                            xVar.f13880r = Boolean.FALSE;
                        }
                        break;
                    case 42:
                        xVar.f13881s = J0(strTrim);
                        break;
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                xVar.f13886x = strTrim;
            }
        }
    }

    public final void N(SVG.y yVar, Attributes attributes, String str) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (SVGAttr.fromString(attributes.getLocalName(i10)) == SVGAttr.points) {
                g gVar = new g(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                gVar.A();
                while (!gVar.h()) {
                    float fN = gVar.n();
                    if (Float.isNaN(fN)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    gVar.z();
                    float fN2 = gVar.n();
                    if (Float.isNaN(fN2)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    gVar.z();
                    arrayList.add(Float.valueOf(fN));
                    arrayList.add(Float.valueOf(fN2));
                }
                yVar.f13890o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    yVar.f13890o[i11] = ((Float) it.next()).floatValue();
                    i11++;
                }
            }
        }
    }

    public final void O(SVG.o0 o0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 35) {
                o0Var.f13848p = o0(strTrim);
            } else if (i11 != 36) {
                switch (i11) {
                    case 12:
                        o0Var.f13845m = o0(strTrim);
                        break;
                    case 13:
                        o0Var.f13846n = o0(strTrim);
                        break;
                    case 14:
                        SVG.o oVarO0 = o0(strTrim);
                        o0Var.f13847o = oVarO0;
                        if (oVarO0.g()) {
                            throw new SVGParseException("Invalid <radialGradient> element. r cannot be negative");
                        }
                        break;
                        break;
                }
            } else {
                o0Var.f13849q = o0(strTrim);
            }
        }
    }

    public final void O0(Attributes attributes) throws SVGParseException {
        l("<path>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.u uVar = new SVG.u();
        uVar.f13834a = this.f13902a;
        uVar.f13835b = this.f13903b;
        D(uVar, attributes);
        S(uVar, attributes);
        W(uVar, attributes);
        C(uVar, attributes);
        L(uVar, attributes);
        this.f13903b.l(uVar);
    }

    public final void P(SVG.a0 a0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                a0Var.f13767o = o0(strTrim);
            } else if (i11 == 2) {
                a0Var.f13768p = o0(strTrim);
            } else if (i11 == 3) {
                SVG.o oVarO0 = o0(strTrim);
                a0Var.f13769q = oVarO0;
                if (oVarO0.g()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                SVG.o oVarO1 = o0(strTrim);
                a0Var.f13770r = oVarO1;
                if (oVarO1.g()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            } else if (i11 == 10) {
                SVG.o oVarO2 = o0(strTrim);
                a0Var.f13771s = oVarO2;
                if (oVarO2.g()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i11 != 11) {
                continue;
            } else {
                SVG.o oVarO3 = o0(strTrim);
                a0Var.f13772t = oVarO3;
                if (oVarO3.g()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    public final void P0(Attributes attributes) throws SVGParseException {
        l("<pattern>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.x xVar = new SVG.x();
        xVar.f13834a = this.f13902a;
        xVar.f13835b = this.f13903b;
        D(xVar, attributes);
        S(xVar, attributes);
        C(xVar, attributes);
        Y(xVar, attributes);
        M(xVar, attributes);
        this.f13903b.l(xVar);
        this.f13903b = xVar;
    }

    public final void Q(SVG.d0 d0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                d0Var.f13792q = o0(strTrim);
            } else if (i11 == 2) {
                d0Var.f13793r = o0(strTrim);
            } else if (i11 == 3) {
                SVG.o oVarO0 = o0(strTrim);
                d0Var.f13794s = oVarO0;
                if (oVarO0.g()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                SVG.o oVarO1 = o0(strTrim);
                d0Var.f13795t = oVarO1;
                if (oVarO1.g()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (i11 == 5) {
                d0Var.f13796u = strTrim;
            }
        }
    }

    public final void Q0(Attributes attributes) throws SVGParseException {
        l("<polygon>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.y zVar = new SVG.z();
        zVar.f13834a = this.f13902a;
        zVar.f13835b = this.f13903b;
        D(zVar, attributes);
        S(zVar, attributes);
        W(zVar, attributes);
        C(zVar, attributes);
        N(zVar, attributes, "polygon");
        this.f13903b.l(zVar);
    }

    public final void R(SVG.c0 c0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()] == 37) {
                c0Var.f13788h = n0(strTrim);
            }
        }
    }

    public final void R0(Attributes attributes) throws SVGParseException {
        l("<polyline>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.y yVar = new SVG.y();
        yVar.f13834a = this.f13902a;
        yVar.f13835b = this.f13903b;
        D(yVar, attributes);
        S(yVar, attributes);
        W(yVar, attributes);
        C(yVar, attributes);
        N(yVar, attributes, "polyline");
        this.f13903b.l(yVar);
    }

    public final void S(SVG.j0 j0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (strTrim.length() != 0) {
                int i11 = a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
                if (i11 == 45) {
                    E0(j0Var, strTrim);
                } else if (i11 != 46) {
                    if (j0Var.f13825e == null) {
                        j0Var.f13825e = new SVG.Style();
                    }
                    S0(j0Var.f13825e, attributes.getLocalName(i10), attributes.getValue(i10).trim());
                } else {
                    j0Var.f13827g = CSSParser.f(strTrim);
                }
            }
        }
    }

    public final void T(SVG.s0 s0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()] == 6 && ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                s0Var.f13867o = strTrim;
            }
        }
    }

    public final void T0(Attributes attributes) throws SVGParseException {
        l("<radialGradient>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.o0 o0Var = new SVG.o0();
        o0Var.f13834a = this.f13902a;
        o0Var.f13835b = this.f13903b;
        D(o0Var, attributes);
        S(o0Var, attributes);
        F(o0Var, attributes);
        O(o0Var, attributes);
        this.f13903b.l(o0Var);
        this.f13903b = o0Var;
    }

    public final void U(SVG.x0 x0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                if (i11 == 39) {
                    x0Var.f13888p = o0(strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                x0Var.f13887o = strTrim;
            }
        }
    }

    public final void U0(Attributes attributes) throws SVGParseException {
        l("<rect>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.a0 a0Var = new SVG.a0();
        a0Var.f13834a = this.f13902a;
        a0Var.f13835b = this.f13903b;
        D(a0Var, attributes);
        S(a0Var, attributes);
        W(a0Var, attributes);
        C(a0Var, attributes);
        P(a0Var, attributes);
        this.f13903b.l(a0Var);
    }

    public final void V(SVG.y0 y0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                y0Var.f13891o = p0(strTrim);
            } else if (i11 == 2) {
                y0Var.f13892p = p0(strTrim);
            } else if (i11 == 19) {
                y0Var.f13893q = p0(strTrim);
            } else if (i11 == 20) {
                y0Var.f13894r = p0(strTrim);
            }
        }
    }

    public final void V0(Attributes attributes) throws SVGParseException {
        l("<solidColor>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.b0 b0Var = new SVG.b0();
        b0Var.f13834a = this.f13902a;
        b0Var.f13835b = this.f13903b;
        D(b0Var, attributes);
        S(b0Var, attributes);
        this.f13903b.l(b0Var);
        this.f13903b = b0Var;
    }

    public final void W(SVG.m mVar, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (SVGAttr.fromString(attributes.getLocalName(i10)) == SVGAttr.transform) {
                mVar.j(J0(attributes.getValue(i10)));
            }
        }
    }

    public final void X(SVG.b1 b1Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                b1Var.f13780q = o0(strTrim);
            } else if (i11 == 2) {
                b1Var.f13781r = o0(strTrim);
            } else if (i11 == 3) {
                SVG.o oVarO0 = o0(strTrim);
                b1Var.f13782s = oVarO0;
                if (oVarO0.g()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                SVG.o oVarO1 = o0(strTrim);
                b1Var.f13783t = oVarO1;
                if (oVarO1.g()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 == 6 && ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                b1Var.f13779p = strTrim;
            }
        }
    }

    public final void Y(SVG.p0 p0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 7) {
                w0(p0Var, strTrim);
            } else if (i11 == 87) {
                p0Var.f13854p = N0(strTrim);
            }
        }
    }

    public final void Y0(Attributes attributes) throws SVGParseException {
        l("<stop>", new Object[0]);
        SVG.h0 h0Var = this.f13903b;
        if (h0Var == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(h0Var instanceof SVG.j)) {
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        SVG.c0 c0Var = new SVG.c0();
        c0Var.f13834a = this.f13902a;
        c0Var.f13835b = this.f13903b;
        D(c0Var, attributes);
        S(c0Var, attributes);
        R(c0Var, attributes);
        this.f13903b.l(c0Var);
        this.f13903b = c0Var;
    }

    public final void Z0(Attributes attributes) throws SVGParseException {
        l("<style>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f13926b[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i11 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && CSSParser.b(str, CSSParser.MediaType.screen)) {
            this.f13909h = true;
        } else {
            this.f13904c = true;
            this.f13905d = 1;
        }
    }

    public final void a1(Attributes attributes) throws SVGParseException {
        l("<svg>", new Object[0]);
        SVG.d0 d0Var = new SVG.d0();
        d0Var.f13834a = this.f13902a;
        d0Var.f13835b = this.f13903b;
        D(d0Var, attributes);
        S(d0Var, attributes);
        C(d0Var, attributes);
        Y(d0Var, attributes);
        Q(d0Var, attributes);
        SVG.h0 h0Var = this.f13903b;
        if (h0Var == null) {
            this.f13902a.x(d0Var);
        } else {
            h0Var.l(d0Var);
        }
        this.f13903b = d0Var;
    }

    public final void b1(Attributes attributes) throws SVGParseException {
        l("<symbol>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.p0 r0Var = new SVG.r0();
        r0Var.f13834a = this.f13902a;
        r0Var.f13835b = this.f13903b;
        D(r0Var, attributes);
        S(r0Var, attributes);
        C(r0Var, attributes);
        Y(r0Var, attributes);
        this.f13903b.l(r0Var);
        this.f13903b = r0Var;
    }

    public final void d1(Attributes attributes) throws SVGParseException {
        l("<text>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.u0 u0Var = new SVG.u0();
        u0Var.f13834a = this.f13902a;
        u0Var.f13835b = this.f13903b;
        D(u0Var, attributes);
        S(u0Var, attributes);
        W(u0Var, attributes);
        C(u0Var, attributes);
        V(u0Var, attributes);
        this.f13903b.l(u0Var);
        this.f13903b = u0Var;
    }

    public final void f1(Attributes attributes) throws SVGParseException {
        l("<textPath>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.x0 x0Var = new SVG.x0();
        x0Var.f13834a = this.f13902a;
        x0Var.f13835b = this.f13903b;
        D(x0Var, attributes);
        S(x0Var, attributes);
        C(x0Var, attributes);
        U(x0Var, attributes);
        this.f13903b.l(x0Var);
        this.f13903b = x0Var;
        SVG.h0 h0Var = x0Var.f13835b;
        if (h0Var instanceof SVG.z0) {
            x0Var.o((SVG.z0) h0Var);
        } else {
            x0Var.o(((SVG.v0) h0Var).c());
        }
    }

    public final void g1(Attributes attributes) throws SVGParseException {
        l("<tref>", new Object[0]);
        SVG.h0 h0Var = this.f13903b;
        if (h0Var == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(h0Var instanceof SVG.w0)) {
            throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        SVG.s0 s0Var = new SVG.s0();
        s0Var.f13834a = this.f13902a;
        s0Var.f13835b = this.f13903b;
        D(s0Var, attributes);
        S(s0Var, attributes);
        C(s0Var, attributes);
        T(s0Var, attributes);
        this.f13903b.l(s0Var);
        SVG.h0 h0Var2 = s0Var.f13835b;
        if (h0Var2 instanceof SVG.z0) {
            s0Var.o((SVG.z0) h0Var2);
        } else {
            s0Var.o(((SVG.v0) h0Var2).c());
        }
    }

    public final void h1(Attributes attributes) throws SVGParseException {
        l("<tspan>", new Object[0]);
        SVG.h0 h0Var = this.f13903b;
        if (h0Var == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(h0Var instanceof SVG.w0)) {
            throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        SVG.t0 t0Var = new SVG.t0();
        t0Var.f13834a = this.f13902a;
        t0Var.f13835b = this.f13903b;
        D(t0Var, attributes);
        S(t0Var, attributes);
        C(t0Var, attributes);
        V(t0Var, attributes);
        this.f13903b.l(t0Var);
        this.f13903b = t0Var;
        SVG.h0 h0Var2 = t0Var.f13835b;
        if (h0Var2 instanceof SVG.z0) {
            t0Var.o((SVG.z0) h0Var2);
        } else {
            t0Var.o(((SVG.v0) h0Var2).c());
        }
    }

    public final void i(Attributes attributes) throws SVGParseException {
        l("<circle>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.d dVar = new SVG.d();
        dVar.f13834a = this.f13902a;
        dVar.f13835b = this.f13903b;
        D(dVar, attributes);
        S(dVar, attributes);
        W(dVar, attributes);
        C(dVar, attributes);
        A(dVar, attributes);
        this.f13903b.l(dVar);
    }

    public final void i1(Attributes attributes) throws SVGParseException {
        l("<use>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.b1 b1Var = new SVG.b1();
        b1Var.f13834a = this.f13902a;
        b1Var.f13835b = this.f13903b;
        D(b1Var, attributes);
        S(b1Var, attributes);
        W(b1Var, attributes);
        C(b1Var, attributes);
        X(b1Var, attributes);
        this.f13903b.l(b1Var);
        this.f13903b = b1Var;
    }

    public final void j1(Attributes attributes) throws SVGParseException {
        l("<view>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.p0 c1Var = new SVG.c1();
        c1Var.f13834a = this.f13902a;
        c1Var.f13835b = this.f13903b;
        D(c1Var, attributes);
        C(c1Var, attributes);
        Y(c1Var, attributes);
        this.f13903b.l(c1Var);
        this.f13903b = c1Var;
    }

    public final void k(Attributes attributes) throws SVGParseException {
        l("<clipPath>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.e eVar = new SVG.e();
        eVar.f13834a = this.f13902a;
        eVar.f13835b = this.f13903b;
        D(eVar, attributes);
        S(eVar, attributes);
        W(eVar, attributes);
        C(eVar, attributes);
        B(eVar, attributes);
        this.f13903b.l(eVar);
        this.f13903b = eVar;
    }

    public final void k1(Attributes attributes) throws SVGParseException {
        l("<switch>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.q0 q0Var = new SVG.q0();
        q0Var.f13834a = this.f13902a;
        q0Var.f13835b = this.f13903b;
        D(q0Var, attributes);
        S(q0Var, attributes);
        W(q0Var, attributes);
        C(q0Var, attributes);
        this.f13903b.l(q0Var);
        this.f13903b = q0Var;
    }

    public final void l(String str, Object... objArr) {
    }

    public final void m(Attributes attributes) throws SVGParseException {
        l("<defs>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.h hVar = new SVG.h();
        hVar.f13834a = this.f13902a;
        hVar.f13835b = this.f13903b;
        D(hVar, attributes);
        S(hVar, attributes);
        W(hVar, attributes);
        this.f13903b.l(hVar);
        this.f13903b = hVar;
    }

    public final void n(Attributes attributes) throws SVGParseException {
        l("<ellipse>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.i iVar = new SVG.i();
        iVar.f13834a = this.f13902a;
        iVar.f13835b = this.f13903b;
        D(iVar, attributes);
        S(iVar, attributes);
        W(iVar, attributes);
        C(iVar, attributes);
        E(iVar, attributes);
        this.f13903b.l(iVar);
    }

    public final void o() {
    }

    public final void q(Attributes attributes) throws SVGParseException {
        l("<g>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.l lVar = new SVG.l();
        lVar.f13834a = this.f13902a;
        lVar.f13835b = this.f13903b;
        D(lVar, attributes);
        S(lVar, attributes);
        W(lVar, attributes);
        C(lVar, attributes);
        this.f13903b.l(lVar);
        this.f13903b = lVar;
    }

    public final void u(Attributes attributes) throws SVGParseException {
        l("<image>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.n nVar = new SVG.n();
        nVar.f13834a = this.f13902a;
        nVar.f13835b = this.f13903b;
        D(nVar, attributes);
        S(nVar, attributes);
        W(nVar, attributes);
        C(nVar, attributes);
        G(nVar, attributes);
        this.f13903b.l(nVar);
        this.f13903b = nVar;
    }

    public final void v(Attributes attributes) throws SVGParseException {
        l("<line>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.p pVar = new SVG.p();
        pVar.f13834a = this.f13902a;
        pVar.f13835b = this.f13903b;
        D(pVar, attributes);
        S(pVar, attributes);
        W(pVar, attributes);
        C(pVar, attributes);
        H(pVar, attributes);
        this.f13903b.l(pVar);
    }

    public final void w(Attributes attributes) throws SVGParseException {
        l("<linearGradient>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.k0 k0Var = new SVG.k0();
        k0Var.f13834a = this.f13902a;
        k0Var.f13835b = this.f13903b;
        D(k0Var, attributes);
        S(k0Var, attributes);
        F(k0Var, attributes);
        I(k0Var, attributes);
        this.f13903b.l(k0Var);
        this.f13903b = k0Var;
    }

    public final void x(Attributes attributes) throws SVGParseException {
        l("<marker>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.q qVar = new SVG.q();
        qVar.f13834a = this.f13902a;
        qVar.f13835b = this.f13903b;
        D(qVar, attributes);
        S(qVar, attributes);
        C(qVar, attributes);
        Y(qVar, attributes);
        J(qVar, attributes);
        this.f13903b.l(qVar);
        this.f13903b = qVar;
    }

    public final void y(Attributes attributes) throws SVGParseException {
        l("<mask>", new Object[0]);
        if (this.f13903b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.r rVar = new SVG.r();
        rVar.f13834a = this.f13902a;
        rVar.f13835b = this.f13903b;
        D(rVar, attributes);
        S(rVar, attributes);
        C(rVar, attributes);
        K(rVar, attributes);
        this.f13903b.l(rVar);
        this.f13903b = rVar;
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13926b;

        static {
            int[] iArr = new int[SVGAttr.values().length];
            f13926b = iArr;
            try {
                iArr[SVGAttr.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13926b[SVGAttr.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13926b[SVGAttr.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13926b[SVGAttr.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13926b[SVGAttr.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13926b[SVGAttr.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13926b[SVGAttr.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13926b[SVGAttr.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13926b[SVGAttr.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13926b[SVGAttr.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13926b[SVGAttr.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13926b[SVGAttr.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13926b[SVGAttr.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13926b[SVGAttr.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13926b[SVGAttr.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13926b[SVGAttr.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f13926b[SVGAttr.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f13926b[SVGAttr.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f13926b[SVGAttr.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f13926b[SVGAttr.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f13926b[SVGAttr.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f13926b[SVGAttr.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f13926b[SVGAttr.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f13926b[SVGAttr.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f13926b[SVGAttr.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f13926b[SVGAttr.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f13926b[SVGAttr.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f13926b[SVGAttr.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f13926b[SVGAttr.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f13926b[SVGAttr.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f13926b[SVGAttr.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f13926b[SVGAttr.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f13926b[SVGAttr.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f13926b[SVGAttr.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f13926b[SVGAttr.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f13926b[SVGAttr.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f13926b[SVGAttr.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f13926b[SVGAttr.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f13926b[SVGAttr.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f13926b[SVGAttr.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f13926b[SVGAttr.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f13926b[SVGAttr.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f13926b[SVGAttr.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f13926b[SVGAttr.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f13926b[SVGAttr.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f13926b[SVGAttr.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f13926b[SVGAttr.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f13926b[SVGAttr.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f13926b[SVGAttr.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f13926b[SVGAttr.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f13926b[SVGAttr.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f13926b[SVGAttr.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f13926b[SVGAttr.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f13926b[SVGAttr.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f13926b[SVGAttr.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f13926b[SVGAttr.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f13926b[SVGAttr.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f13926b[SVGAttr.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f13926b[SVGAttr.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f13926b[SVGAttr.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f13926b[SVGAttr.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f13926b[SVGAttr.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f13926b[SVGAttr.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f13926b[SVGAttr.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f13926b[SVGAttr.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f13926b[SVGAttr.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f13926b[SVGAttr.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f13926b[SVGAttr.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f13926b[SVGAttr.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f13926b[SVGAttr.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f13926b[SVGAttr.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f13926b[SVGAttr.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f13926b[SVGAttr.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f13926b[SVGAttr.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f13926b[SVGAttr.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f13926b[SVGAttr.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f13926b[SVGAttr.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f13926b[SVGAttr.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f13926b[SVGAttr.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f13926b[SVGAttr.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f13926b[SVGAttr.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f13926b[SVGAttr.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f13926b[SVGAttr.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f13926b[SVGAttr.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f13926b[SVGAttr.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f13926b[SVGAttr.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f13926b[SVGAttr.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f13926b[SVGAttr.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f13926b[SVGAttr.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[SVGElem.values().length];
            f13925a = iArr2;
            try {
                iArr2[SVGElem.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f13925a[SVGElem.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f13925a[SVGElem.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f13925a[SVGElem.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f13925a[SVGElem.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f13925a[SVGElem.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f13925a[SVGElem.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f13925a[SVGElem.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f13925a[SVGElem.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f13925a[SVGElem.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f13925a[SVGElem.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f13925a[SVGElem.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f13925a[SVGElem.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f13925a[SVGElem.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f13925a[SVGElem.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f13925a[SVGElem.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f13925a[SVGElem.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f13925a[SVGElem.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f13925a[SVGElem.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f13925a[SVGElem.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f13925a[SVGElem.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f13925a[SVGElem.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f13925a[SVGElem.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f13925a[SVGElem.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f13925a[SVGElem.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f13925a[SVGElem.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f13925a[SVGElem.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f13925a[SVGElem.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f13925a[SVGElem.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f13925a[SVGElem.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f13925a[SVGElem.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    public static Set<String> A0(String str) {
        g gVar = new g(str);
        HashSet hashSet = new HashSet();
        while (!gVar.h()) {
            hashSet.add(gVar.r());
            gVar.A();
        }
        return hashSet;
    }

    public static SVG.o[] B0(String str) {
        SVG.o oVarP;
        g gVar = new g(str);
        gVar.A();
        if (gVar.h() || (oVarP = gVar.p()) == null || oVarP.g()) {
            return null;
        }
        float fA = oVarP.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(oVarP);
        while (!gVar.h()) {
            gVar.z();
            SVG.o oVarP2 = gVar.p();
            if (oVarP2 == null || oVarP2.g()) {
                return null;
            }
            arrayList.add(oVarP2);
            fA += oVarP2.a();
        }
        if (fA == 0.0f) {
            return null;
        }
        return (SVG.o[]) arrayList.toArray(new SVG.o[arrayList.size()]);
    }

    public static SVG.Style.LineCap C0(String str) {
        if ("butt".equals(str)) {
            return SVG.Style.LineCap.Butt;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineCap.Round;
        }
        if ("square".equals(str)) {
            return SVG.Style.LineCap.Square;
        }
        return null;
    }

    public static SVG.Style.LineJoin D0(String str) {
        if ("miter".equals(str)) {
            return SVG.Style.LineJoin.Miter;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineJoin.Round;
        }
        if ("bevel".equals(str)) {
            return SVG.Style.LineJoin.Bevel;
        }
        return null;
    }

    public static void E0(SVG.j0 j0Var, String str) {
        g gVar = new g(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strS = gVar.s(':');
            gVar.A();
            if (!gVar.f(':')) {
                return;
            }
            gVar.A();
            String strU = gVar.u(';');
            if (strU == null) {
                return;
            }
            gVar.A();
            if (gVar.h() || gVar.f(';')) {
                if (j0Var.f13826f == null) {
                    j0Var.f13826f = new SVG.Style();
                }
                S0(j0Var.f13826f, strS, strU);
                gVar.A();
            }
        }
    }

    public static Set<String> F0(String str) {
        g gVar = new g(str);
        HashSet hashSet = new HashSet();
        while (!gVar.h()) {
            String strR = gVar.r();
            int iIndexOf = strR.indexOf(45);
            if (iIndexOf != -1) {
                strR = strR.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strR, "", "").getLanguage());
            gVar.A();
        }
        return hashSet;
    }

    public static SVG.b N0(String str) throws SVGParseException {
        g gVar = new g(str);
        gVar.A();
        float fN = gVar.n();
        gVar.z();
        float fN2 = gVar.n();
        gVar.z();
        float fN3 = gVar.n();
        gVar.z();
        float fN4 = gVar.n();
        if (Float.isNaN(fN) || Float.isNaN(fN2) || Float.isNaN(fN3) || Float.isNaN(fN4)) {
            throw new SVGParseException("Invalid viewBox definition - should have four numbers");
        }
        if (fN3 < 0.0f) {
            throw new SVGParseException("Invalid viewBox. width cannot be negative");
        }
        if (fN4 >= 0.0f) {
            return new SVG.b(fN, fN2, fN3, fN4);
        }
        throw new SVGParseException("Invalid viewBox. height cannot be negative");
    }

    public static SVG.c a0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        g gVar = new g(str.substring(5));
        gVar.A();
        SVG.o oVarQ0 = q0(gVar);
        gVar.z();
        SVG.o oVarQ1 = q0(gVar);
        gVar.z();
        SVG.o oVarQ2 = q0(gVar);
        gVar.z();
        SVG.o oVarQ3 = q0(gVar);
        gVar.A();
        if (gVar.f(')') || gVar.h()) {
            return new SVG.c(oVarQ0, oVarQ1, oVarQ2, oVarQ3);
        }
        return null;
    }

    public static SVG.Style.FillRule e0(String str) {
        if ("nonzero".equals(str)) {
            return SVG.Style.FillRule.NonZero;
        }
        if ("evenodd".equals(str)) {
            return SVG.Style.FillRule.EvenOdd;
        }
        return null;
    }

    public static float g0(String str, int i10, int i11) throws SVGParseException {
        float fB = new e0.b().b(str, i10, i11);
        if (!Float.isNaN(fB)) {
            return fB;
        }
        throw new SVGParseException("Invalid float value: " + str);
    }

    public static void h0(SVG.Style style, String str) {
        String strS;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            g gVar = new g(str);
            Integer numA = null;
            SVG.Style.FontStyle fontStyleK0 = null;
            String str2 = null;
            while (true) {
                strS = gVar.s('/');
                gVar.A();
                if (strS != null) {
                    if (numA != null && fontStyleK0 != null) {
                        break;
                    }
                    if (!strS.equals("normal") && (numA != null || (numA = e.a(strS)) == null)) {
                        if (fontStyleK0 != null || (fontStyleK0 = k0(strS)) == null) {
                            if (str2 != null || !strS.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strS;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            SVG.o oVarJ0 = j0(strS);
            if (gVar.f('/')) {
                gVar.A();
                String strR = gVar.r();
                if (strR != null) {
                    try {
                        o0(strR);
                    } catch (SVGParseException unused) {
                        return;
                    }
                }
                gVar.A();
            }
            style.f13740p = i0(gVar.y());
            style.f13741q = oVarJ0;
            style.f13742r = Integer.valueOf(numA == null ? 400 : numA.intValue());
            if (fontStyleK0 == null) {
                fontStyleK0 = SVG.Style.FontStyle.Normal;
            }
            style.f13743s = fontStyleK0;
            style.f13726b |= 122880;
        }
    }

    public static List<String> i0(String str) {
        g gVar = new g(str);
        ArrayList arrayList = null;
        do {
            String strQ = gVar.q();
            if (strQ == null) {
                strQ = gVar.u(',');
            }
            if (strQ == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strQ);
            gVar.z();
        } while (!gVar.h());
        return arrayList;
    }

    public static String m0(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static SVG.o q0(g gVar) {
        return gVar.g("auto") ? new SVG.o(0.0f) : gVar.p();
    }

    public static SVG.m0 t0(String str) {
        if (!str.startsWith("url(")) {
            return d0(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new SVG.t(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new SVG.t(strTrim, strTrim2.length() > 0 ? d0(strTrim2) : null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0282  */
    /* JADX WARN: Code duplicated, block: B:117:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x028a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x027c  */
    public static SVG.v u0(String str) {
        float fD;
        float fD2;
        float f10;
        float f11;
        g gVar = new g(str);
        SVG.v vVar = new SVG.v();
        if (gVar.h()) {
            return vVar;
        }
        int iIntValue = gVar.l().intValue();
        int i10 = 109;
        if (iIntValue != 77 && iIntValue != 109) {
            return vVar;
        }
        int iIntValue2 = iIntValue;
        float f12 = 0.0f;
        float fN = 0.0f;
        float f13 = 0.0f;
        float fD3 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (true) {
            gVar.A();
            switch (iIntValue2) {
                case 65:
                case 97:
                    float fN2 = gVar.n();
                    float fD4 = gVar.d(fN2);
                    float fD5 = gVar.d(fD4);
                    Boolean boolC = gVar.c(Float.valueOf(fD5));
                    Boolean boolC2 = gVar.c(boolC);
                    float fE = gVar.e(boolC2);
                    float fD6 = gVar.d(fE);
                    if (!Float.isNaN(fD6) && fN2 >= 0.0f && fD4 >= 0.0f) {
                        if (iIntValue2 == 97) {
                            fE += f12;
                            fD6 += f13;
                        }
                        vVar.e(fN2, fD4, fD5, boolC.booleanValue(), boolC2.booleanValue(), fE, fD6);
                        f12 = fE;
                        fN = f12;
                        f13 = fD6;
                        fD3 = f13;
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i10 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 67:
                case 99:
                    float fN3 = gVar.n();
                    float fD7 = gVar.d(fN3);
                    float fD8 = gVar.d(fD7);
                    float fD9 = gVar.d(fD8);
                    fD = gVar.d(fD9);
                    fD2 = gVar.d(fD);
                    if (!Float.isNaN(fD2)) {
                        if (iIntValue2 == 99) {
                            fD += f12;
                            fD2 += f13;
                            fN3 += f12;
                            fD7 += f13;
                            fD8 += f12;
                            fD9 += f13;
                        }
                        f10 = fD8;
                        f11 = fD9;
                        vVar.d(fN3, fD7, f10, f11, fD, fD2);
                        fN = f10;
                        f12 = fD;
                        fD3 = f11;
                        f13 = fD2;
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i10 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 72:
                case 104:
                    float fN4 = gVar.n();
                    if (!Float.isNaN(fN4)) {
                        if (iIntValue2 == 104) {
                            fN4 += f12;
                        }
                        f12 = fN4;
                        vVar.b(f12, f13);
                        fN = f12;
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i10 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 76:
                case 108:
                    float fN5 = gVar.n();
                    float fD10 = gVar.d(fN5);
                    if (!Float.isNaN(fD10)) {
                        if (iIntValue2 == 108) {
                            fN5 += f12;
                            fD10 += f13;
                        }
                        f12 = fN5;
                        f13 = fD10;
                        vVar.b(f12, f13);
                        fN = f12;
                        fD3 = f13;
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i10 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 77:
                case 109:
                    float fN6 = gVar.n();
                    float fD11 = gVar.d(fN6);
                    if (!Float.isNaN(fD11)) {
                        if (iIntValue2 == i10 && !vVar.i()) {
                            fN6 += f12;
                            fD11 += f13;
                        }
                        f12 = fN6;
                        f13 = fD11;
                        vVar.a(f12, f13);
                        fN = f12;
                        f14 = fN;
                        fD3 = f13;
                        f15 = fD3;
                        iIntValue2 = iIntValue2 != i10 ? 76 : 108;
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i10 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 81:
                case 113:
                    fN = gVar.n();
                    fD3 = gVar.d(fN);
                    float fD12 = gVar.d(fD3);
                    float fD13 = gVar.d(fD12);
                    if (!Float.isNaN(fD13)) {
                        if (iIntValue2 == 113) {
                            fD12 += f12;
                            fD13 += f13;
                            fN += f12;
                            fD3 += f13;
                        }
                        f12 = fD12;
                        f13 = fD13;
                        vVar.c(fN, fD3, f12, f13);
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i10 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 83:
                case 115:
                    float f16 = (f12 * 2.0f) - fN;
                    float f17 = (2.0f * f13) - fD3;
                    float fN7 = gVar.n();
                    float fD14 = gVar.d(fN7);
                    fD = gVar.d(fD14);
                    fD2 = gVar.d(fD);
                    if (!Float.isNaN(fD2)) {
                        if (iIntValue2 == 115) {
                            fD += f12;
                            fD2 += f13;
                            fN7 += f12;
                            fD14 += f13;
                        }
                        f10 = fN7;
                        f11 = fD14;
                        vVar.d(f16, f17, f10, f11, fD, fD2);
                        fN = f10;
                        f12 = fD;
                        fD3 = f11;
                        f13 = fD2;
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i10 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 84:
                case 116:
                    fN = (f12 * 2.0f) - fN;
                    fD3 = (2.0f * f13) - fD3;
                    float fN8 = gVar.n();
                    float fD15 = gVar.d(fN8);
                    if (!Float.isNaN(fD15)) {
                        if (iIntValue2 == 116) {
                            fN8 += f12;
                            fD15 += f13;
                        }
                        f12 = fN8;
                        f13 = fD15;
                        vVar.c(fN, fD3, f12, f13);
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i10 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 86:
                case 118:
                    float fN9 = gVar.n();
                    if (!Float.isNaN(fN9)) {
                        if (iIntValue2 == 118) {
                            fN9 += f13;
                        }
                        f13 = fN9;
                        vVar.b(f12, f13);
                        fD3 = f13;
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i10 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 90:
                case 122:
                    vVar.close();
                    f12 = f14;
                    fN = f12;
                    f13 = f15;
                    fD3 = f13;
                    gVar.z();
                    if (gVar.h()) {
                        if (gVar.i()) {
                            iIntValue2 = gVar.l().intValue();
                        }
                        i10 = 109;
                    }
                    break;
                default:
                    break;
            }
            return vVar;
        }
    }

    public static PreserveAspectRatio v0(String str) throws SVGParseException {
        g gVar = new g(str);
        gVar.A();
        String strR = gVar.r();
        if ("defer".equals(strR)) {
            gVar.A();
            strR = gVar.r();
        }
        PreserveAspectRatio.Alignment alignmentA = b.a(strR);
        PreserveAspectRatio.Scale scale = null;
        gVar.A();
        if (!gVar.h()) {
            String strR2 = gVar.r();
            strR2.hashCode();
            if (strR2.equals("meet")) {
                scale = PreserveAspectRatio.Scale.meet;
            } else {
                if (!strR2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: " + str);
                }
                scale = PreserveAspectRatio.Scale.slice;
            }
        }
        return new PreserveAspectRatio(alignmentA, scale);
    }

    public static Set<String> z0(String str) {
        g gVar = new g(str);
        HashSet hashSet = new HashSet();
        while (!gVar.h()) {
            String strR = gVar.r();
            if (strR.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strR.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            gVar.A();
        }
        return hashSet;
    }

    public final Matrix J0(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        g gVar = new g(str);
        gVar.A();
        while (!gVar.h()) {
            String strO = gVar.o();
            if (strO == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: " + str);
            }
            switch (strO) {
                case "matrix":
                    gVar.A();
                    float fN = gVar.n();
                    gVar.z();
                    float fN2 = gVar.n();
                    gVar.z();
                    float fN3 = gVar.n();
                    gVar.z();
                    float fN4 = gVar.n();
                    gVar.z();
                    float fN5 = gVar.n();
                    gVar.z();
                    float fN6 = gVar.n();
                    gVar.A();
                    if (Float.isNaN(fN6) || !gVar.f(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fN, fN3, fN5, fN2, fN4, fN6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    gVar.A();
                    float fN7 = gVar.n();
                    float fX = gVar.x();
                    float fX2 = gVar.x();
                    gVar.A();
                    if (Float.isNaN(fN7) || !gVar.f(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fX)) {
                        matrix.preRotate(fN7);
                    } else {
                        if (Float.isNaN(fX2)) {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fN7, fX, fX2);
                    }
                    break;
                    break;
                case "scale":
                    gVar.A();
                    float fN8 = gVar.n();
                    float fX3 = gVar.x();
                    gVar.A();
                    if (Float.isNaN(fN8) || !gVar.f(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX3)) {
                        matrix.preScale(fN8, fX3);
                    } else {
                        matrix.preScale(fN8, fN8);
                    }
                    break;
                    break;
                case "skewX":
                    gVar.A();
                    float fN9 = gVar.n();
                    gVar.A();
                    if (Float.isNaN(fN9) || !gVar.f(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fN9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    gVar.A();
                    float fN10 = gVar.n();
                    gVar.A();
                    if (Float.isNaN(fN10) || !gVar.f(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fN10)));
                    break;
                    break;
                case "translate":
                    gVar.A();
                    float fN11 = gVar.n();
                    float fX4 = gVar.x();
                    gVar.A();
                    if (Float.isNaN(fN11) || !gVar.f(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX4)) {
                        matrix.preTranslate(fN11, fX4);
                    } else {
                        matrix.preTranslate(fN11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new SVGParseException("Invalid transform list fn: " + strO + ")");
            }
            if (gVar.h()) {
                return matrix;
            }
            gVar.z();
        }
        return matrix;
    }

    public final void K0(InputStream inputStream) throws SVGParseException {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e10) {
            throw new SVGParseException("Stream error", e10);
        } catch (ParserConfigurationException e11) {
            throw new SVGParseException("XML parser problem", e11);
        } catch (SAXException e12) {
            throw new SVGParseException("SVG parse error", e12);
        }
    }

    public final void W0() {
        this.f13902a = new SVG();
    }

    public final void X0(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        if (this.f13904c) {
            this.f13905d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            SVGElem sVGElemFromString = SVGElem.fromString(str2);
            switch (a.f13925a[sVGElemFromString.ordinal()]) {
                case 1:
                    a1(attributes);
                    break;
                case 2:
                case 3:
                    q(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    i1(attributes);
                    break;
                case 6:
                    O0(attributes);
                    break;
                case 7:
                    U0(attributes);
                    break;
                case 8:
                    i(attributes);
                    break;
                case 9:
                    n(attributes);
                    break;
                case 10:
                    v(attributes);
                    break;
                case 11:
                    R0(attributes);
                    break;
                case 12:
                    Q0(attributes);
                    break;
                case 13:
                    d1(attributes);
                    break;
                case 14:
                    h1(attributes);
                    break;
                case 15:
                    g1(attributes);
                    break;
                case 16:
                    k1(attributes);
                    break;
                case 17:
                    b1(attributes);
                    break;
                case 18:
                    x(attributes);
                    break;
                case 19:
                    w(attributes);
                    break;
                case 20:
                    T0(attributes);
                    break;
                case 21:
                    Y0(attributes);
                    break;
                case 22:
                case 23:
                    this.f13906e = true;
                    this.f13907f = sVGElemFromString;
                    break;
                case 24:
                    k(attributes);
                    break;
                case 25:
                    f1(attributes);
                    break;
                case 26:
                    P0(attributes);
                    break;
                case 27:
                    u(attributes);
                    break;
                case 28:
                    j1(attributes);
                    break;
                case 29:
                    y(attributes);
                    break;
                case 30:
                    Z0(attributes);
                    break;
                case 31:
                    V0(attributes);
                    break;
                default:
                    this.f13904c = true;
                    this.f13905d = 1;
                    break;
            }
        }
    }

    public final void Z(String str) {
        this.f13902a.a(new CSSParser(CSSParser.MediaType.screen, CSSParser.Source.Document).d(str));
    }

    public final void c1(String str) throws SVGParseException {
        if (this.f13904c) {
            return;
        }
        if (this.f13906e) {
            if (this.f13908g == null) {
                this.f13908g = new StringBuilder(str.length());
            }
            this.f13908g.append(str);
        } else if (this.f13909h) {
            if (this.f13910i == null) {
                this.f13910i = new StringBuilder(str.length());
            }
            this.f13910i.append(str);
        } else if (this.f13903b instanceof SVG.w0) {
            h(str);
        }
    }

    public final void e1(char[] cArr, int i10, int i11) throws SVGParseException {
        if (this.f13904c) {
            return;
        }
        if (this.f13906e) {
            if (this.f13908g == null) {
                this.f13908g = new StringBuilder(i11);
            }
            this.f13908g.append(cArr, i10, i11);
        } else if (this.f13909h) {
            if (this.f13910i == null) {
                this.f13910i = new StringBuilder(i11);
            }
            this.f13910i.append(cArr, i10, i11);
        } else if (this.f13903b instanceof SVG.w0) {
            h(new String(cArr, i10, i11));
        }
    }

    public final void h(String str) throws SVGParseException {
        SVG.f0 f0Var = (SVG.f0) this.f13903b;
        int size = f0Var.f13801i.size();
        SVG.l0 l0Var = size == 0 ? null : f0Var.f13801i.get(size - 1);
        if (!(l0Var instanceof SVG.a1)) {
            this.f13903b.l(new SVG.a1(str));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        SVG.a1 a1Var = (SVG.a1) l0Var;
        sb2.append(a1Var.f13773c);
        sb2.append(str);
        a1Var.f13773c = sb2.toString();
    }

    public final void p(String str, String str2, String str3) throws SVGParseException {
        if (this.f13904c) {
            int i10 = this.f13905d - 1;
            this.f13905d = i10;
            if (i10 == 0) {
                this.f13904c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i11 = a.f13925a[SVGElem.fromString(str2).ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 4 && i11 != 5 && i11 != 13 && i11 != 14) {
                switch (i11) {
                    case 22:
                    case 23:
                        this.f13906e = false;
                        StringBuilder sb2 = this.f13908g;
                        if (sb2 != null) {
                            SVGElem sVGElem = this.f13907f;
                            if (sVGElem == SVGElem.title) {
                                this.f13902a.y(sb2.toString());
                            } else if (sVGElem == SVGElem.desc) {
                                this.f13902a.v(sb2.toString());
                            }
                            this.f13908g.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb3 = this.f13910i;
                        if (sb3 != null) {
                            this.f13909h = false;
                            Z(sb3.toString());
                            this.f13910i.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.f13903b = ((SVG.l0) this.f13903b).f13835b;
        }
    }

    public final void r(String str, Map<String, String> map) {
        if (str.equals("xml-stylesheet")) {
            SVG.k();
        }
    }

    public final Map<String, String> x0(g gVar) {
        HashMap map = new HashMap();
        gVar.A();
        String strS = gVar.s(G5.T);
        while (strS != null) {
            gVar.f(G5.T);
            map.put(strS, gVar.q());
            gVar.A();
            strS = gVar.s(G5.T);
        }
        return map;
    }

    public SVG z(InputStream inputStream, boolean z10) throws SVGParseException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i10 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i10 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            L0(inputStream, z10);
            return this.f13902a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    public static SVG.Style.TextAnchor G0(String str) {
        str.hashCode();
        switch (str) {
            case "middle":
                return SVG.Style.TextAnchor.Middle;
            case "end":
                return SVG.Style.TextAnchor.End;
            case "start":
                return SVG.Style.TextAnchor.Start;
            default:
                return null;
        }
    }

    public static SVG.Style.TextDecoration H0(String str) {
        str.hashCode();
        switch (str) {
            case "line-through":
                return SVG.Style.TextDecoration.LineThrough;
            case "underline":
                return SVG.Style.TextDecoration.Underline;
            case "none":
                return SVG.Style.TextDecoration.None;
            case "blink":
                return SVG.Style.TextDecoration.Blink;
            case "overline":
                return SVG.Style.TextDecoration.Overline;
            default:
                return null;
        }
    }

    public static SVG.Style.TextDirection I0(String str) {
        str.hashCode();
        if (!str.equals("ltr")) {
            if (!str.equals("rtl")) {
                return null;
            }
            return SVG.Style.TextDirection.RTL;
        }
        return SVG.Style.TextDirection.LTR;
    }

    public static SVG.Style.VectorEffect M0(String str) {
        str.hashCode();
        if (!str.equals("none")) {
            if (!str.equals("non-scaling-stroke")) {
                return null;
            }
            return SVG.Style.VectorEffect.NonScalingStroke;
        }
        return SVG.Style.VectorEffect.None;
    }

    public static void S0(SVG.Style style, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.f13926b[SVGAttr.fromString(str).ordinal()]) {
                case 47:
                    SVG.m0 m0VarT0 = t0(str2);
                    style.f13727c = m0VarT0;
                    if (m0VarT0 != null) {
                        style.f13726b |= 1;
                        return;
                    }
                    return;
                case 48:
                    SVG.Style.FillRule fillRuleE0 = e0(str2);
                    style.f13728d = fillRuleE0;
                    if (fillRuleE0 != null) {
                        style.f13726b |= 2;
                        return;
                    }
                    return;
                case 49:
                    Float fR0 = r0(str2);
                    style.f13729e = fR0;
                    if (fR0 != null) {
                        style.f13726b |= 4;
                        return;
                    }
                    return;
                case 50:
                    SVG.m0 m0VarT1 = t0(str2);
                    style.f13730f = m0VarT1;
                    if (m0VarT1 != null) {
                        style.f13726b |= 8;
                        return;
                    }
                    return;
                case 51:
                    Float fR1 = r0(str2);
                    style.f13731g = fR1;
                    if (fR1 != null) {
                        style.f13726b |= 16;
                        return;
                    }
                    return;
                case 52:
                    style.f13732h = o0(str2);
                    style.f13726b |= 32;
                    break;
                case 53:
                    SVG.Style.LineCap lineCapC0 = C0(str2);
                    style.f13733i = lineCapC0;
                    if (lineCapC0 != null) {
                        style.f13726b |= 64;
                        return;
                    }
                    return;
                case 54:
                    SVG.Style.LineJoin lineJoinD0 = D0(str2);
                    style.f13734j = lineJoinD0;
                    if (lineJoinD0 != null) {
                        style.f13726b |= 128;
                        return;
                    }
                    return;
                case 55:
                    style.f13735k = Float.valueOf(f0(str2));
                    style.f13726b |= 256;
                    break;
                case 56:
                    if ("none".equals(str2)) {
                        style.f13736l = null;
                        style.f13726b |= 512;
                        return;
                    }
                    SVG.o[] oVarArrB0 = B0(str2);
                    style.f13736l = oVarArrB0;
                    if (oVarArrB0 != null) {
                        style.f13726b |= 512;
                        return;
                    }
                    return;
                case 57:
                    style.f13737m = o0(str2);
                    style.f13726b |= 1024;
                    break;
                case 58:
                    style.f13738n = r0(str2);
                    style.f13726b |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                    return;
                case 59:
                    style.f13739o = b0(str2);
                    style.f13726b |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                    break;
                case 60:
                    h0(style, str2);
                    return;
                case 61:
                    List<String> listI0 = i0(str2);
                    style.f13740p = listI0;
                    if (listI0 != null) {
                        style.f13726b |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                        return;
                    }
                    return;
                case 62:
                    SVG.o oVarJ0 = j0(str2);
                    style.f13741q = oVarJ0;
                    if (oVarJ0 != null) {
                        style.f13726b |= 16384;
                        return;
                    }
                    return;
                case 63:
                    Integer numL0 = l0(str2);
                    style.f13742r = numL0;
                    if (numL0 != null) {
                        style.f13726b |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                        return;
                    }
                    return;
                case 64:
                    SVG.Style.FontStyle fontStyleK0 = k0(str2);
                    style.f13743s = fontStyleK0;
                    if (fontStyleK0 != null) {
                        style.f13726b |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                        return;
                    }
                    return;
                case 65:
                    SVG.Style.TextDecoration textDecorationH0 = H0(str2);
                    style.f13744t = textDecorationH0;
                    if (textDecorationH0 != null) {
                        style.f13726b |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                        return;
                    }
                    return;
                case 66:
                    SVG.Style.TextDirection textDirectionI0 = I0(str2);
                    style.f13745u = textDirectionI0;
                    if (textDirectionI0 != null) {
                        style.f13726b |= 68719476736L;
                        return;
                    }
                    return;
                case 67:
                    SVG.Style.TextAnchor textAnchorG0 = G0(str2);
                    style.f13746v = textAnchorG0;
                    if (textAnchorG0 != null) {
                        style.f13726b |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        return;
                    }
                    return;
                case 68:
                    Boolean boolS0 = s0(str2);
                    style.f13747w = boolS0;
                    if (boolS0 != null) {
                        style.f13726b |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                        return;
                    }
                    return;
                case 69:
                    String strM0 = m0(str2, str);
                    style.f13749y = strM0;
                    style.f13750z = strM0;
                    style.A = strM0;
                    style.f13726b |= 14680064;
                    return;
                case 70:
                    style.f13749y = m0(str2, str);
                    style.f13726b |= 2097152;
                    return;
                case 71:
                    style.f13750z = m0(str2, str);
                    style.f13726b |= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
                    return;
                case 72:
                    style.A = m0(str2, str);
                    style.f13726b |= 8388608;
                    return;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            style.B = Boolean.valueOf(!str2.equals("none"));
                            style.f13726b |= 16777216;
                            return;
                        }
                        return;
                    }
                    return;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            style.C = Boolean.valueOf(str2.equals(VastAttributes.VISIBLE));
                            style.f13726b |= 33554432;
                            return;
                        }
                        return;
                    }
                    return;
                case 75:
                    if (str2.equals("currentColor")) {
                        style.D = SVG.g.a();
                    } else {
                        try {
                            style.D = b0(str2);
                        } catch (SVGParseException e10) {
                            Log.w("SVGParser", e10.getMessage());
                            return;
                        }
                        break;
                    }
                    style.f13726b |= 67108864;
                    return;
                case 76:
                    style.E = r0(str2);
                    style.f13726b |= 134217728;
                    return;
                case 77:
                    SVG.c cVarA0 = a0(str2);
                    style.f13748x = cVarA0;
                    if (cVarA0 != null) {
                        style.f13726b |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                        return;
                    }
                    return;
                case 78:
                    style.F = m0(str2, str);
                    style.f13726b |= 268435456;
                    return;
                case 79:
                    style.G = e0(str2);
                    style.f13726b |= 536870912;
                    return;
                case 80:
                    style.H = m0(str2, str);
                    style.f13726b |= 1073741824;
                    return;
                case 81:
                    if (str2.equals("currentColor")) {
                        style.I = SVG.g.a();
                    } else {
                        try {
                            style.I = b0(str2);
                        } catch (SVGParseException e11) {
                            Log.w("SVGParser", e11.getMessage());
                            return;
                        }
                        break;
                    }
                    style.f13726b |= 2147483648L;
                    return;
                case 82:
                    style.J = r0(str2);
                    style.f13726b |= 4294967296L;
                    return;
                case 83:
                    if (str2.equals("currentColor")) {
                        style.K = SVG.g.a();
                    } else {
                        try {
                            style.K = b0(str2);
                        } catch (SVGParseException e12) {
                            Log.w("SVGParser", e12.getMessage());
                            return;
                        }
                        break;
                    }
                    style.f13726b |= 8589934592L;
                    return;
                case 84:
                    style.L = r0(str2);
                    style.f13726b |= 17179869184L;
                    return;
                case 85:
                    SVG.Style.VectorEffect vectorEffectM0 = M0(str2);
                    style.M = vectorEffectM0;
                    if (vectorEffectM0 != null) {
                        style.f13726b |= 34359738368L;
                        return;
                    }
                    return;
                case 86:
                    SVG.Style.RenderQuality renderQualityY0 = y0(str2);
                    style.N = renderQualityY0;
                    if (renderQualityY0 != null) {
                        style.f13726b |= 137438953472L;
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (SVGParseException unused) {
        }
    }

    public static SVG.f c0(String str) throws SVGParseException {
        Integer numA = c.a(str);
        if (numA != null) {
            return new SVG.f(numA.intValue());
        }
        throw new SVGParseException("Invalid colour keyword: " + str);
    }

    public static SVG.m0 d0(String str) {
        str.hashCode();
        if (!str.equals("none")) {
            if (!str.equals("currentColor")) {
                try {
                    return b0(str);
                } catch (SVGParseException unused) {
                    return null;
                }
            }
            return SVG.g.a();
        }
        return SVG.f.f13799d;
    }

    public static float f0(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return g0(str, 0, length);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    public static SVG.o j0(String str) {
        try {
            SVG.o oVarA = d.a(str);
            if (oVarA == null) {
                return o0(str);
            }
            return oVarA;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static SVG.Style.FontStyle k0(String str) {
        str.hashCode();
        switch (str) {
            case "oblique":
                return SVG.Style.FontStyle.Oblique;
            case "italic":
                return SVG.Style.FontStyle.Italic;
            case "normal":
                return SVG.Style.FontStyle.Normal;
            default:
                return null;
        }
    }

    public static Integer l0(String str) {
        return e.a(str);
    }

    public static SVG.o o0(String str) throws SVGParseException {
        if (str.length() != 0) {
            int length = str.length();
            SVG.Unit unitValueOf = SVG.Unit.px;
            char cCharAt = str.charAt(length - 1);
            if (cCharAt == '%') {
                length--;
                unitValueOf = SVG.Unit.percent;
            } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
                length -= 2;
                try {
                    unitValueOf = SVG.Unit.valueOf(str.substring(length).toLowerCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    throw new SVGParseException("Invalid length unit specifier: " + str);
                }
            }
            try {
                return new SVG.o(g0(str, 0, length), unitValueOf);
            } catch (NumberFormatException e10) {
                throw new SVGParseException("Invalid length value: " + str, e10);
            }
        }
        throw new SVGParseException("Invalid length value (empty string)");
    }

    public static List<SVG.o> p0(String str) throws SVGParseException {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            g gVar = new g(str);
            gVar.A();
            while (!gVar.h()) {
                float fN = gVar.n();
                if (!Float.isNaN(fN)) {
                    SVG.Unit unitV = gVar.v();
                    if (unitV == null) {
                        unitV = SVG.Unit.px;
                    }
                    arrayList.add(new SVG.o(fN, unitV));
                    gVar.z();
                } else {
                    throw new SVGParseException("Invalid length list value: " + gVar.b());
                }
            }
            return arrayList;
        }
        throw new SVGParseException("Invalid length list (empty string)");
    }

    public static Float r0(String str) {
        try {
            float fF0 = f0(str);
            if (fF0 < 0.0f) {
                fF0 = 0.0f;
            } else if (fF0 > 1.0f) {
                fF0 = 1.0f;
            }
            return Float.valueOf(fF0);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static Boolean s0(String str) {
        str.hashCode();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    public static void w0(SVG.n0 n0Var, String str) throws SVGParseException {
        n0Var.f13842o = v0(str);
    }

    public static SVG.Style.RenderQuality y0(String str) {
        str.hashCode();
        switch (str) {
            case "optimizeQuality":
                return SVG.Style.RenderQuality.optimizeQuality;
            case "auto":
                return SVG.Style.RenderQuality.auto;
            case "optimizeSpeed":
                return SVG.Style.RenderQuality.optimizeSpeed;
            default:
                return null;
        }
    }

    public final void L0(InputStream inputStream, boolean z10) throws SVGParseException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                h hVar = new h(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType != 0) {
                        if (eventType != 8) {
                            if (eventType != 10) {
                                if (eventType != 2) {
                                    if (eventType != 3) {
                                        if (eventType != 4) {
                                            if (eventType == 5) {
                                                c1(xmlPullParserNewPullParser.getText());
                                            }
                                        } else {
                                            int[] iArr = new int[2];
                                            e1(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                                        }
                                    } else {
                                        String name = xmlPullParserNewPullParser.getName();
                                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                                        }
                                        p(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name);
                                    }
                                } else {
                                    String name2 = xmlPullParserNewPullParser.getName();
                                    if (xmlPullParserNewPullParser.getPrefix() != null) {
                                        name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                                    }
                                    X0(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2, hVar);
                                }
                            } else if (z10 && this.f13902a.p() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                                try {
                                    Log.d("SVGParser", "Switching to SAX parser to process entities");
                                    inputStream.reset();
                                    K0(inputStream);
                                    return;
                                } catch (IOException unused) {
                                    Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                    return;
                                }
                            }
                        } else {
                            Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                            g gVar = new g(xmlPullParserNewPullParser.getText());
                            r(gVar.r(), x0(gVar));
                        }
                    } else {
                        W0();
                    }
                }
                o();
            } catch (IOException e10) {
                throw new SVGParseException("Stream error", e10);
            }
        } catch (XmlPullParserException e11) {
            throw new SVGParseException("XML parser problem", e11);
        }
    }

    public final Float n0(String str) throws SVGParseException {
        if (str.length() != 0) {
            int length = str.length();
            boolean z10 = true;
            if (str.charAt(str.length() - 1) == '%') {
                length--;
            } else {
                z10 = false;
            }
            try {
                float fG0 = g0(str, 0, length);
                float f10 = 100.0f;
                if (z10) {
                    fG0 /= 100.0f;
                }
                if (fG0 < 0.0f) {
                    f10 = 0.0f;
                } else if (fG0 <= 100.0f) {
                    f10 = fG0;
                }
                return Float.valueOf(f10);
            } catch (NumberFormatException e10) {
                throw new SVGParseException("Invalid offset value in <stop>: " + str, e10);
            }
        }
        throw new SVGParseException("Invalid offset value in <stop> (empty string)");
    }
}
