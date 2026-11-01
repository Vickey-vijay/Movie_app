package o4;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import g5.i0;
import g5.k0;
import g5.l0;
import g5.p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: DashManifestParser.java */
/* JADX INFO: loaded from: classes7.dex */
public class c extends DefaultHandler implements com.google.android.exoplayer2.upstream.g.a<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f65006b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f65007c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f65008d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f65009a;

    public static int A(List<d> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-608:2015".equals(dVar.f65017a) && (str = dVar.f65018b) != null) {
                Matcher matcher = f65007c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                g5.m.h("MpdParser", "Unable to parse CEA-608 channel number from: " + dVar.f65018b);
            }
        }
        return -1;
    }

    public static int B(List<d> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-708:2015".equals(dVar.f65017a) && (str = dVar.f65018b) != null) {
                Matcher matcher = f65008d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                g5.m.h("MpdParser", "Unable to parse CEA-708 service block number from: " + dVar.f65018b);
            }
        }
        return -1;
    }

    public static long F(XmlPullParser xmlPullParser, String str, long j10) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : k0.s0(attributeValue);
    }

    public static int H(XmlPullParser xmlPullParser) {
        String strK0 = k0.K0(xmlPullParser.getAttributeValue(null, "value"));
        if (strK0 == null) {
            return -1;
        }
        switch (strK0) {
            case "4000":
                return 1;
            case "a000":
                return 2;
            case "f801":
                return 6;
            case "fa01":
                return 8;
            default:
                return -1;
        }
    }

    public static long I(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : k0.t0(attributeValue);
    }

    public static String J(List<d> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            String str = dVar.f65017a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(dVar.f65018b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(dVar.f65018b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float N(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f10;
        }
        Matcher matcher = f65006b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f10;
        }
        int i10 = Integer.parseInt(matcher.group(1));
        String strGroup = matcher.group(2);
        return !TextUtils.isEmpty(strGroup) ? i10 / Integer.parseInt(strGroup) : i10;
    }

    public static int P(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    public static long R(List<d> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            if ("http://dashif.org/guidelines/last-segment-number".equalsIgnoreCase(dVar.f65017a)) {
                return Long.parseLong(dVar.f65018b);
            }
        }
        return -1L;
    }

    public static long S(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    public static String h0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static int o(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        g5.a.f(i10 == i11);
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ea  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8 */
    public Pair<String, DrmInitData.SchemeData> C(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? attributeValue2;
        ?? B;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue3 != null) {
            String strK0 = k0.K0(attributeValue3);
            strK0.hashCode();
            switch (strK0) {
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = k3.k.f62193e;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    B = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = k3.k.f62192d;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    B = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    String strB = l0.b(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(strB) && !"00000000-0000-0000-0000-000000000000".equals(strB)) {
                        String[] strArrSplit = strB.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                            uuidArr[i10] = UUID.fromString(strArrSplit[i10]);
                        }
                        uuid = k3.k.f62190b;
                        attributeValue2 = 0;
                        B = w3.j.b(uuid, uuidArr, null);
                        break;
                    } else {
                        uuid = null;
                        uuid2 = uuid;
                        attributeValue2 = uuid2;
                        B = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    attributeValue2 = uuid2;
                    B = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            attributeValue2 = uuid2;
            B = uuid2;
        }
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "ms:laurl")) {
                B = B;
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (B == 0 && l0.g(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                UUID uuidD = w3.j.d(bArrDecode);
                if (uuidD == null) {
                    g5.m.h("MpdParser", "Skipping malformed cenc:pssh data");
                    uuid = uuidD;
                    B = 0;
                    attributeValue2 = attributeValue2;
                } else {
                    B = bArrDecode;
                    uuid = uuidD;
                    attributeValue2 = attributeValue2;
                }
            } else if (B == 0) {
                UUID uuid3 = k3.k.f62193e;
                if (uuid3.equals(uuid) && l0.f(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    B = w3.j.a(uuid3, Base64.decode(xmlPullParser.getText(), 0));
                    attributeValue2 = attributeValue2;
                } else {
                    t(xmlPullParser);
                    B = B;
                    attributeValue2 = attributeValue2;
                }
            } else {
                t(xmlPullParser);
                B = B;
                attributeValue2 = attributeValue2;
            }
        } while (!l0.d(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new DrmInitData.SchemeData(uuid, attributeValue2, "video/mp4", B) : null);
    }

    public int D(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    public int E(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return 256;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    public h W(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
            }
            return h(attributeValue, j10, j11);
        }
        j10 = 0;
        j11 = -1;
        return h(attributeValue, j10, j11);
    }

    public a X(XmlPullParser xmlPullParser, String str, @Nullable String str2, @Nullable String str3, int i10, int i11, float f10, int i12, int i13, @Nullable String str4, List<d> list, List<d> list2, List<d> list3, List<d> list4, @Nullable j jVar, long j10) throws XmlPullParserException, IOException {
        String str5;
        j jVarD0;
        String str6;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int iP = P(xmlPullParser, "bandwidth", -1);
        String strH0 = h0(xmlPullParser, "mimeType", str2);
        String strH1 = h0(xmlPullParser, "codecs", str3);
        int iP2 = P(xmlPullParser, "width", i10);
        int iP3 = P(xmlPullParser, "height", i11);
        float fN = N(xmlPullParser, f10);
        int iP4 = P(xmlPullParser, "audioSamplingRate", i13);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list3);
        ArrayList arrayList4 = new ArrayList(list4);
        j jVarB0 = jVar;
        String str7 = null;
        boolean z10 = false;
        String strZ = str;
        int iY = i12;
        while (true) {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "BaseURL")) {
                if (z10) {
                    str5 = strZ;
                    iP4 = iP4;
                    iP = iP;
                    iY = iY;
                    str6 = str5;
                } else {
                    strZ = z(xmlPullParser, strZ);
                    z10 = true;
                    str6 = strZ;
                }
            } else if (l0.f(xmlPullParser, "AudioChannelConfiguration")) {
                iY = y(xmlPullParser);
                str6 = strZ;
                iP4 = iP4;
                iP = iP;
            } else {
                if (l0.f(xmlPullParser, "SegmentBase")) {
                    jVarB0 = b0(xmlPullParser, (j.e) jVarB0);
                } else {
                    if (l0.f(xmlPullParser, "SegmentList")) {
                        iP4 = iP4;
                        iP = iP;
                        jVarD0 = c0(xmlPullParser, (j.b) jVarB0, j10);
                    } else {
                        iP4 = iP4;
                        iP = iP;
                        if (l0.f(xmlPullParser, "SegmentTemplate")) {
                            jVarD0 = d0(xmlPullParser, (j.c) jVarB0, list4, j10);
                        } else {
                            if (l0.f(xmlPullParser, "ContentProtection")) {
                                Pair<String, DrmInitData.SchemeData> pairC = C(xmlPullParser);
                                str5 = strZ;
                                Object obj = pairC.first;
                                if (obj != null) {
                                    str7 = (String) obj;
                                }
                                Object obj2 = pairC.second;
                                if (obj2 != null) {
                                    arrayList.add((DrmInitData.SchemeData) obj2);
                                }
                            } else {
                                str5 = strZ;
                                if (l0.f(xmlPullParser, "InbandEventStream")) {
                                    arrayList2.add(G(xmlPullParser, "InbandEventStream"));
                                } else if (l0.f(xmlPullParser, "EssentialProperty")) {
                                    arrayList3.add(G(xmlPullParser, "EssentialProperty"));
                                } else if (l0.f(xmlPullParser, "SupplementalProperty")) {
                                    arrayList4.add(G(xmlPullParser, "SupplementalProperty"));
                                } else {
                                    t(xmlPullParser);
                                }
                            }
                            iY = iY;
                            str6 = str5;
                        }
                    }
                    jVarB0 = jVarD0;
                }
                str6 = strZ;
            }
            if (l0.d(xmlPullParser, "Representation")) {
                break;
            }
            iP4 = iP4;
            strZ = str6;
            iP = iP;
            iY = iY;
        }
        return new a(e(attributeValue, strH0, iP2, iP3, fN, iY, iP4, iP, str4, list, list2, strH1, arrayList3, arrayList4), str6, jVarB0 != null ? jVarB0 : new j.e(), str7, arrayList, arrayList2, -1L);
    }

    public int Y(List<d> list) {
        int iJ0;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar = list.get(i11);
            if ("urn:mpeg:dash:role:2011".equalsIgnoreCase(dVar.f65017a)) {
                iJ0 = E(dVar.f65018b);
            } else {
                if ("urn:tva:metadata:cs:AudioPurposeCS:2007".equalsIgnoreCase(dVar.f65017a)) {
                    iJ0 = j0(dVar.f65018b);
                }
            }
            i10 |= iJ0;
        }
        return i10;
    }

    public int Z(List<d> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if ("http://dashif.org/guidelines/trickmode".equalsIgnoreCase(list.get(i11).f65017a)) {
                i10 |= 16384;
            }
        }
        return i10;
    }

    public int a0(List<d> list) {
        int iE = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            if ("urn:mpeg:dash:role:2011".equalsIgnoreCase(dVar.f65017a)) {
                iE |= E(dVar.f65018b);
            }
        }
        return iE;
    }

    public Format e(@Nullable String str, @Nullable String str2, int i10, int i11, float f10, int i12, int i13, int i14, @Nullable String str3, List<d> list, List<d> list2, @Nullable String str4, List<d> list3, List<d> list4) {
        String str5;
        int iB;
        String strS = s(str2, str4);
        int iG0 = g0(list);
        int iA0 = a0(list) | Y(list2) | Z(list3) | Z(list4);
        if (strS != null) {
            String strJ = "audio/eac3".equals(strS) ? J(list4) : strS;
            if (p.n(strJ)) {
                return Format.A(str, null, str2, strJ, str4, null, i14, i10, i11, f10, null, iG0, iA0);
            }
            if (p.l(strJ)) {
                return Format.m(str, null, str2, strJ, str4, null, i14, i12, i13, null, iG0, iA0, str3);
            }
            if (u(strJ)) {
                if ("application/cea-608".equals(strJ)) {
                    iB = A(list2);
                } else {
                    iB = "application/cea-708".equals(strJ) ? B(list2) : -1;
                }
                return Format.v(str, null, str2, strJ, str4, i14, iG0, iA0, str3, iB);
            }
            str5 = strJ;
        } else {
            str5 = strS;
        }
        return Format.q(str, null, str2, str5, str4, i14, iG0, iA0, str3);
    }

    public int g0(List<d> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            if ("urn:mpeg:dash:role:2011".equalsIgnoreCase(dVar.f65017a) && C3426d4.i.Z.equals(dVar.f65018b)) {
                return 1;
            }
        }
        return 0;
    }

    public int j0(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    b10 = 0;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b10 = 1;
                }
                break;
            case 51:
                if (str.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                    b10 = 2;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b10 = 3;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    b10 = 4;
                }
                break;
        }
        switch (b10) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    @Nullable
    public l k0(XmlPullParser xmlPullParser, String str, @Nullable l lVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? l.b(attributeValue) : lVar;
    }

    public m l0(XmlPullParser xmlPullParser) {
        return n(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    /* JADX INFO: compiled from: DashManifestParser.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Format f65010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j f65012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f65013d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList<DrmInitData.SchemeData> f65014e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList<d> f65015f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f65016g;

        public a(Format format, String str, j jVar, @Nullable String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<d> arrayList2, long j10) {
            this.f65010a = format;
            this.f65011b = str;
            this.f65012c = jVar;
            this.f65013d = str2;
            this.f65014e = arrayList;
            this.f65015f = arrayList2;
            this.f65016g = j10;
        }
    }

    public static d G(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strH0 = h0(xmlPullParser, "schemeIdUri", "");
        String strH1 = h0(xmlPullParser, "value", null);
        String strH2 = h0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!l0.d(xmlPullParser, str));
        return new d(strH0, strH1, strH2);
    }

    public static String i0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                t(xmlPullParser);
            }
        } while (!l0.d(xmlPullParser, str));
        return text;
    }

    @Nullable
    public static String p(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        g5.a.f(str.equals(str2));
        return str;
    }

    public Pair<Long, EventMessage> K(XmlPullParser xmlPullParser, String str, String str2, long j10, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long jS = S(xmlPullParser, "id", 0L);
        long jS2 = S(xmlPullParser, "duration", -9223372036854775807L);
        long jS3 = S(xmlPullParser, "presentationTime", 0L);
        long jY0 = k0.y0(jS2, 1000L, j10);
        long jY1 = k0.y0(jS3, 1000000L, j10);
        String strH0 = h0(xmlPullParser, "messageData", null);
        byte[] bArrL = L(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jY1);
        if (strH0 != null) {
            bArrL = k0.c0(strH0);
        }
        return Pair.create(lValueOf, c(str, str2, jS, jY0, bArrL));
    }

    public e M(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strH0 = h0(xmlPullParser, "schemeIdUri", "");
        String strH1 = h0(xmlPullParser, "value", "");
        long jS = S(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "Event")) {
                arrayList.add(K(xmlPullParser, strH0, strH1, jS, byteArrayOutputStream));
            } else {
                t(xmlPullParser);
            }
        } while (!l0.d(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            eventMessageArr[i10] = (EventMessage) pair.second;
        }
        return d(strH0, strH1, jS, jArr, eventMessageArr);
    }

    public h O(XmlPullParser xmlPullParser) {
        return W(xmlPullParser, "sourceURL", "range");
    }

    public String Q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return i0(xmlPullParser, "Label");
    }

    public b T(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        long jF = F(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long jI = I(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long jI2 = I(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long jI3 = zEquals ? I(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long jI4 = zEquals ? I(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long jI5 = zEquals ? I(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long jF2 = F(xmlPullParser, "publishTime", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        long j10 = zEquals ? -9223372036854775807L : 0L;
        boolean z10 = false;
        boolean z11 = false;
        g gVarV = null;
        m mVarL0 = null;
        Uri uri = null;
        String strZ = str;
        while (true) {
            xmlPullParser.next();
            long j11 = jI4;
            if (l0.f(xmlPullParser, "BaseURL")) {
                if (z10) {
                    strZ = strZ;
                    j10 = j10;
                } else {
                    strZ = z(xmlPullParser, strZ);
                    z10 = true;
                }
            } else if (l0.f(xmlPullParser, "ProgramInformation")) {
                gVarV = V(xmlPullParser);
            } else if (l0.f(xmlPullParser, "UTCTiming")) {
                mVarL0 = l0(xmlPullParser);
            } else if (l0.f(xmlPullParser, "Location")) {
                uri = Uri.parse(xmlPullParser.nextText());
            } else if (!l0.f(xmlPullParser, "Period") || z11) {
                t(xmlPullParser);
                strZ = strZ;
                j10 = j10;
            } else {
                Pair<f, Long> pairU = U(xmlPullParser, strZ, j10);
                String str2 = strZ;
                f fVar = (f) pairU.first;
                long j12 = j10;
                if (fVar.f65026b != -9223372036854775807L) {
                    long jLongValue = ((Long) pairU.second).longValue();
                    j10 = jLongValue == -9223372036854775807L ? -9223372036854775807L : fVar.f65026b + jLongValue;
                    arrayList.add(fVar);
                } else {
                    if (!zEquals) {
                        throw new ParserException("Unable to determine start of period " + arrayList.size());
                    }
                    z11 = true;
                    j10 = j12;
                }
                strZ = str2;
            }
            if (l0.d(xmlPullParser, "MPD")) {
                if (jI == -9223372036854775807L) {
                    if (j10 != -9223372036854775807L) {
                        jI = j10;
                    } else if (!zEquals) {
                        throw new ParserException("Unable to determine duration of static manifest.");
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new ParserException("No periods found.");
                }
                return f(jF, jI, jI2, zEquals, jI3, j11, jI5, jF2, gVarV, mVarL0, uri, arrayList);
            }
            jI4 = j11;
        }
    }

    public Pair<f, Long> U(XmlPullParser xmlPullParser, String str, long j10) throws XmlPullParserException, IOException {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        long jI = I(xmlPullParser, "start", j10);
        long jI2 = I(xmlPullParser, "duration", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strZ = str;
        boolean z10 = false;
        j jVarD0 = null;
        d dVarG = null;
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "BaseURL")) {
                if (z10) {
                    str2 = strZ;
                } else {
                    strZ = z(xmlPullParser, strZ);
                    z10 = true;
                }
            } else if (l0.f(xmlPullParser, "AdaptationSet")) {
                str2 = strZ;
                arrayList.add(w(xmlPullParser, strZ, jVarD0, jI2));
            } else {
                str2 = strZ;
                if (l0.f(xmlPullParser, "EventStream")) {
                    arrayList2.add(M(xmlPullParser));
                } else if (l0.f(xmlPullParser, "SegmentBase")) {
                    jVarD0 = b0(xmlPullParser, null);
                } else if (l0.f(xmlPullParser, "SegmentList")) {
                    jVarD0 = c0(xmlPullParser, null, jI2);
                } else if (l0.f(xmlPullParser, "SegmentTemplate")) {
                    jVarD0 = d0(xmlPullParser, null, Collections.emptyList(), jI2);
                } else if (l0.f(xmlPullParser, "AssetIdentifier")) {
                    dVarG = G(xmlPullParser, "AssetIdentifier");
                } else {
                    t(xmlPullParser);
                }
            }
            strZ = str2;
        } while (!l0.d(xmlPullParser, "Period"));
        return Pair.create(g(attributeValue, jI, arrayList, arrayList2, dVarG), Long.valueOf(jI2));
    }

    public g V(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strH0 = h0(xmlPullParser, "moreInformationURL", null);
        String strH1 = h0(xmlPullParser, Q6.f27460q, null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (l0.f(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (l0.f(xmlPullParser, ExifInterface.TAG_COPYRIGHT)) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                t(xmlPullParser);
            }
            String str = strNextText3;
            if (l0.d(xmlPullParser, "ProgramInformation")) {
                return new g(strNextText, strNextText2, str, strH0, strH1);
            }
            strNextText3 = str;
        }
    }

    public final long a(List<j.d> list, long j10, long j11, int i10, long j12) {
        int iL = i10 >= 0 ? i10 + 1 : (int) k0.l(j12 - j10, j11);
        for (int i11 = 0; i11 < iL; i11++) {
            list.add(l(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    public o4.a b(int i10, int i11, List<i> list, List<d> list2, List<d> list3, List<d> list4) {
        return new o4.a(i10, i11, list, list2, list3, list4);
    }

    public j.e b0(XmlPullParser xmlPullParser, @Nullable j.e eVar) throws XmlPullParserException, IOException {
        long j10;
        long j11;
        long jS = S(xmlPullParser, "timescale", eVar != null ? eVar.f65052b : 1L);
        long jS2 = S(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f65053c : 0L);
        long j12 = eVar != null ? eVar.f65063d : 0L;
        long j13 = eVar != null ? eVar.f65064e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            long j14 = Long.parseLong(strArrSplit[0]);
            j10 = (Long.parseLong(strArrSplit[1]) - j14) + 1;
            j11 = j14;
        } else {
            j10 = j13;
            j11 = j12;
        }
        h hVarO = eVar != null ? eVar.f65051a : null;
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "Initialization")) {
                hVarO = O(xmlPullParser);
            } else {
                t(xmlPullParser);
            }
        } while (!l0.d(xmlPullParser, "SegmentBase"));
        return m(hVarO, jS, jS2, j11, j10);
    }

    public EventMessage c(String str, String str2, long j10, long j11, byte[] bArr) {
        return new EventMessage(str, str2, j11, j10, bArr);
    }

    public j.b c0(XmlPullParser xmlPullParser, @Nullable j.b bVar, long j10) throws XmlPullParserException, IOException {
        long jS = S(xmlPullParser, "timescale", bVar != null ? bVar.f65052b : 1L);
        long jS2 = S(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f65053c : 0L);
        long jS3 = S(xmlPullParser, "duration", bVar != null ? bVar.f65055e : -9223372036854775807L);
        long jS4 = S(xmlPullParser, "startNumber", bVar != null ? bVar.f65054d : 1L);
        List<j.d> listE0 = null;
        List<h> arrayList = null;
        h hVarO = null;
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "Initialization")) {
                hVarO = O(xmlPullParser);
            } else if (l0.f(xmlPullParser, "SegmentTimeline")) {
                listE0 = e0(xmlPullParser, jS, j10);
            } else if (l0.f(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(f0(xmlPullParser));
            } else {
                t(xmlPullParser);
            }
        } while (!l0.d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (hVarO == null) {
                hVarO = bVar.f65051a;
            }
            if (listE0 == null) {
                listE0 = bVar.f65056f;
            }
            if (arrayList == null) {
                arrayList = bVar.f65057g;
            }
        }
        return j(hVarO, jS, jS2, jS4, jS3, listE0, arrayList);
    }

    public e d(String str, String str2, long j10, long[] jArr, EventMessage[] eventMessageArr) {
        return new e(str, str2, j10, jArr, eventMessageArr);
    }

    public j.c d0(XmlPullParser xmlPullParser, @Nullable j.c cVar, List<d> list, long j10) throws XmlPullParserException, IOException {
        long jS = S(xmlPullParser, "timescale", cVar != null ? cVar.f65052b : 1L);
        long jS2 = S(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f65053c : 0L);
        long jS3 = S(xmlPullParser, "duration", cVar != null ? cVar.f65055e : -9223372036854775807L);
        long jS4 = S(xmlPullParser, "startNumber", cVar != null ? cVar.f65054d : 1L);
        long jR = R(list);
        List<j.d> listE0 = null;
        l lVarK0 = k0(xmlPullParser, C3426d4.i.I0, cVar != null ? cVar.f65059h : null);
        l lVarK1 = k0(xmlPullParser, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, cVar != null ? cVar.f65058g : null);
        h hVarO = null;
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "Initialization")) {
                hVarO = O(xmlPullParser);
            } else if (l0.f(xmlPullParser, "SegmentTimeline")) {
                listE0 = e0(xmlPullParser, jS, j10);
            } else {
                t(xmlPullParser);
            }
        } while (!l0.d(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (hVarO == null) {
                hVarO = cVar.f65051a;
            }
            if (listE0 == null) {
                listE0 = cVar.f65056f;
            }
        }
        return k(hVarO, jS, jS2, jS4, jR, jS3, listE0, lVarK1, lVarK0);
    }

    public List<j.d> e0(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        boolean z10 = false;
        int iP = 0;
        long jS = -9223372036854775807L;
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, ExifInterface.LATITUDE_SOUTH)) {
                long jS2 = S(xmlPullParser, "t", -9223372036854775807L);
                if (z10) {
                    jA = a(arrayList, jA, jS, iP, jS2);
                }
                if (jS2 == -9223372036854775807L) {
                    jS2 = jA;
                }
                jS = S(xmlPullParser, "d", -9223372036854775807L);
                iP = P(xmlPullParser, "r", 0);
                z10 = true;
                jA = jS2;
            } else {
                t(xmlPullParser);
            }
        } while (!l0.d(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            a(arrayList, jA, jS, iP, k0.y0(j11, j10, 1000L));
        }
        return arrayList;
    }

    public b f(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, @Nullable g gVar, @Nullable m mVar, @Nullable Uri uri, List<f> list) {
        return new b(j10, j11, j12, z10, j13, j14, j15, j16, gVar, mVar, uri, list);
    }

    public h f0(XmlPullParser xmlPullParser) {
        return W(xmlPullParser, C3426d4.i.I0, "mediaRange");
    }

    public f g(@Nullable String str, long j10, List<o4.a> list, List<e> list2, @Nullable d dVar) {
        return new f(str, j10, list, list2, dVar);
    }

    public h h(String str, long j10, long j11) {
        return new h(str, j10, j11);
    }

    public i i(a aVar, @Nullable String str, @Nullable String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<d> arrayList2) {
        Format formatD = aVar.f65010a;
        if (str != null) {
            formatD = formatD.h(str);
        }
        String str3 = aVar.f65013d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = aVar.f65014e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            q(arrayList3);
            formatD = formatD.d(new DrmInitData(str2, arrayList3));
        }
        ArrayList<d> arrayList4 = aVar.f65015f;
        arrayList4.addAll(arrayList2);
        return i.e(aVar.f65016g, formatD, aVar.f65011b, aVar.f65012c, arrayList4);
    }

    public j.b j(h hVar, long j10, long j11, long j12, long j13, @Nullable List<j.d> list, @Nullable List<h> list2) {
        return new j.b(hVar, j10, j11, j12, j13, list, list2);
    }

    public j.c k(h hVar, long j10, long j11, long j12, long j13, long j14, List<j.d> list, @Nullable l lVar, @Nullable l lVar2) {
        return new j.c(hVar, j10, j11, j12, j13, j14, list, lVar, lVar2);
    }

    public j.d l(long j10, long j11) {
        return new j.d(j10, j11);
    }

    public j.e m(h hVar, long j10, long j11, long j12, long j13) {
        return new j.e(hVar, j10, j11, j12, j13);
    }

    public m n(String str, String str2) {
        return new m(str, str2);
    }

    public int r(Format format) {
        String str = format.f18970j;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (p.n(str)) {
            return 2;
        }
        if (p.l(str)) {
            return 1;
        }
        return u(str) ? 3 : -1;
    }

    @Override // com.google.android.exoplayer2.upstream.g.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public b parse(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f65009a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return T(xmlPullParserNewPullParser, uri.toString());
            }
            throw new ParserException("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e10) {
            throw new ParserException(e10);
        }
    }

    public o4.a w(XmlPullParser xmlPullParser, String str, @Nullable j jVar, long j10) throws XmlPullParserException, IOException {
        String str2;
        String str3;
        ArrayList<d> arrayList;
        int iO;
        ArrayList arrayList2;
        ArrayList<d> arrayList3;
        j jVarD0;
        c cVar = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int iP = P(xmlPullParser2, "id", -1);
        int iD = D(xmlPullParser);
        String str4 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int iP2 = P(xmlPullParser2, "width", -1);
        int iP3 = P(xmlPullParser2, "height", -1);
        float fN = N(xmlPullParser2, -1.0f);
        int iP4 = P(xmlPullParser2, "audioSamplingRate", -1);
        String str5 = Q6.f27460q;
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, Q6.f27460q);
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "label");
        ArrayList<DrmInitData.SchemeData> arrayList4 = new ArrayList<>();
        ArrayList<d> arrayList5 = new ArrayList<>();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        String strZ = str;
        j jVar2 = jVar;
        int iY = -1;
        String strQ = attributeValue4;
        String str6 = null;
        boolean z10 = false;
        int i10 = iD;
        while (true) {
            xmlPullParser.next();
            if (l0.f(xmlPullParser2, "BaseURL")) {
                if (!z10) {
                    z10 = true;
                    strZ = cVar.z(xmlPullParser2, strZ);
                    iO = i10;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList5;
                }
                str2 = attributeValue3;
                str3 = strZ;
                arrayList9 = arrayList9;
                arrayList8 = arrayList8;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList4 = arrayList4;
                str5 = str5;
                str4 = str4;
                xmlPullParser2 = xmlPullParser2;
                cVar = cVar;
                iO = i10;
                arrayList2 = arrayList10;
                arrayList3 = arrayList5;
                attributeValue3 = str2;
                strZ = str3;
            } else {
                if (l0.f(xmlPullParser2, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> pairC = C(xmlPullParser);
                    Object obj = pairC.first;
                    if (obj != null) {
                        str6 = (String) obj;
                    }
                    Object obj2 = pairC.second;
                    if (obj2 != null) {
                        arrayList4.add((DrmInitData.SchemeData) obj2);
                    }
                } else if (l0.f(xmlPullParser2, "ContentComponent")) {
                    attributeValue3 = p(attributeValue3, xmlPullParser2.getAttributeValue(str4, str5));
                    iO = o(i10, D(xmlPullParser));
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList5;
                } else {
                    if (l0.f(xmlPullParser2, "Role")) {
                        arrayList7.add(G(xmlPullParser2, "Role"));
                    } else if (l0.f(xmlPullParser2, "AudioChannelConfiguration")) {
                        iY = y(xmlPullParser);
                    } else if (l0.f(xmlPullParser2, "Accessibility")) {
                        arrayList6.add(G(xmlPullParser2, "Accessibility"));
                    } else if (l0.f(xmlPullParser2, "EssentialProperty")) {
                        arrayList8.add(G(xmlPullParser2, "EssentialProperty"));
                    } else if (l0.f(xmlPullParser2, "SupplementalProperty")) {
                        arrayList9.add(G(xmlPullParser2, "SupplementalProperty"));
                    } else {
                        if (l0.f(xmlPullParser2, "Representation")) {
                            str2 = attributeValue3;
                            str3 = strZ;
                            arrayList9 = arrayList9;
                            arrayList8 = arrayList8;
                            arrayList7 = arrayList7;
                            arrayList6 = arrayList6;
                            arrayList = arrayList5;
                            arrayList4 = arrayList4;
                            str5 = str5;
                            str4 = str4;
                            a aVarX = X(xmlPullParser, strZ, attributeValue, attributeValue2, iP2, iP3, fN, iY, iP4, str2, arrayList7, arrayList6, arrayList8, arrayList9, jVar2, j10);
                            cVar = this;
                            int iO2 = o(i10, cVar.r(aVarX.f65010a));
                            arrayList2 = arrayList10;
                            arrayList2.add(aVarX);
                            xmlPullParser2 = xmlPullParser;
                            iO = iO2;
                        } else {
                            str2 = attributeValue3;
                            str3 = strZ;
                            arrayList9 = arrayList9;
                            arrayList8 = arrayList8;
                            arrayList7 = arrayList7;
                            arrayList6 = arrayList6;
                            arrayList = arrayList5;
                            arrayList4 = arrayList4;
                            str5 = str5;
                            str4 = str4;
                            cVar = cVar;
                            iO = i10;
                            arrayList2 = arrayList10;
                            xmlPullParser2 = xmlPullParser;
                            if (l0.f(xmlPullParser2, "SegmentBase")) {
                                jVarD0 = cVar.b0(xmlPullParser2, (j.e) jVar2);
                            } else if (l0.f(xmlPullParser2, "SegmentList")) {
                                jVarD0 = cVar.c0(xmlPullParser2, (j.b) jVar2, j10);
                            } else if (l0.f(xmlPullParser2, "SegmentTemplate")) {
                                jVarD0 = d0(xmlPullParser, (j.c) jVar2, arrayList9, j10);
                            } else {
                                if (l0.f(xmlPullParser2, "InbandEventStream")) {
                                    arrayList3 = arrayList;
                                    arrayList3.add(G(xmlPullParser2, "InbandEventStream"));
                                } else {
                                    arrayList3 = arrayList;
                                    if (l0.f(xmlPullParser2, "Label")) {
                                        strQ = Q(xmlPullParser);
                                    } else if (l0.e(xmlPullParser)) {
                                        x(xmlPullParser);
                                    }
                                }
                                attributeValue3 = str2;
                                strZ = str3;
                            }
                            jVar2 = jVarD0;
                        }
                        attributeValue3 = str2;
                        strZ = str3;
                        arrayList3 = arrayList;
                    }
                    str2 = attributeValue3;
                    str3 = strZ;
                    arrayList9 = arrayList9;
                    arrayList8 = arrayList8;
                    arrayList7 = arrayList7;
                    arrayList6 = arrayList6;
                    arrayList4 = arrayList4;
                    str5 = str5;
                    str4 = str4;
                    xmlPullParser2 = xmlPullParser2;
                    cVar = cVar;
                    iO = i10;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList5;
                    attributeValue3 = str2;
                    strZ = str3;
                }
                iO = i10;
                arrayList2 = arrayList10;
                arrayList3 = arrayList5;
            }
            if (l0.d(xmlPullParser2, "AdaptationSet")) {
                break;
            }
            i10 = iO;
            cVar = cVar;
            arrayList10 = arrayList2;
            xmlPullParser2 = xmlPullParser2;
            arrayList5 = arrayList3;
            arrayList9 = arrayList9;
            arrayList8 = arrayList8;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList4 = arrayList4;
            str5 = str5;
            str4 = str4;
        }
        ArrayList arrayList11 = new ArrayList(arrayList2.size());
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            arrayList11.add(i((a) arrayList2.get(i11), strQ, str6, arrayList4, arrayList3));
        }
        return b(iP, iO, arrayList11, arrayList6, arrayList8, arrayList9);
    }

    public int y(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strH0 = h0(xmlPullParser, "schemeIdUri", null);
        int iH = -1;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(strH0)) {
            iH = P(xmlPullParser, "value", -1);
        } else if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(strH0) || "urn:dolby:dash:audio_channel_configuration:2011".equals(strH0)) {
            iH = H(xmlPullParser);
        }
        do {
            xmlPullParser.next();
        } while (!l0.d(xmlPullParser, "AudioChannelConfiguration"));
        return iH;
    }

    public String z(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return i0.c(str, i0(xmlPullParser, "BaseURL"));
    }

    public c() {
        try {
            this.f65009a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static void q(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.d()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (arrayList.get(i10).b(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                }
            }
        }
    }

    @Nullable
    public static String s(@Nullable String str, @Nullable String str2) {
        if (p.l(str)) {
            return p.b(str2);
        }
        if (p.n(str)) {
            return p.k(str2);
        }
        if (u(str)) {
            return str;
        }
        if ("application/mp4".equals(str)) {
            if (str2 != null) {
                if (str2.startsWith("stpp")) {
                    return "application/ttml+xml";
                }
                if (str2.startsWith("wvtt")) {
                    return "application/x-mp4-vtt";
                }
            }
        } else if ("application/x-rawcc".equals(str) && str2 != null) {
            if (str2.contains("cea708")) {
                return "application/cea-708";
            }
            if (str2.contains("eia608") || str2.contains("cea608")) {
                return "application/cea-608";
            }
        }
        return null;
    }

    public static void t(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (!l0.e(xmlPullParser)) {
            return;
        }
        int i10 = 1;
        while (i10 != 0) {
            xmlPullParser.next();
            if (l0.e(xmlPullParser)) {
                i10++;
            } else if (l0.c(xmlPullParser)) {
                i10--;
            }
        }
    }

    public static boolean u(@Nullable String str) {
        if (!p.m(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/cea-708".equals(str) && !"application/cea-608".equals(str)) {
            return false;
        }
        return true;
    }

    public byte[] L(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, "UTF-8");
        xmlPullParser.nextToken();
        while (!l0.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public void x(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        t(xmlPullParser);
    }
}
