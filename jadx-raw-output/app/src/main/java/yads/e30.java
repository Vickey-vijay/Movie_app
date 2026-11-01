package yads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class e30 extends DefaultHandler implements pb2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f76892b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f76893c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f76894d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f76895e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f76896a;

    public static long a(ArrayList arrayList, long j10, long j11, int i10, long j12) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            int i12 = ib3.f78556a;
            i11 = (int) ((((j12 - j10) + j11) - 1) / j11);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            arrayList.add(new fx2(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    public static int b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int iBitCount = 6;
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                iBitCount = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (iBitCount <= 0 || iBitCount >= 33) {
                    iBitCount = -1;
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 == null) {
                    iBitCount = -1;
                    break;
                } else {
                    iBitCount = Integer.parseInt(attributeValue3);
                    break;
                }
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 == null) {
                    iBitCount = -1;
                    break;
                } else {
                    String strA = ki.a(attributeValue4);
                    strA.getClass();
                    switch (strA) {
                        case "4000":
                            iBitCount = 1;
                            break;
                        case "a000":
                            iBitCount = 2;
                            break;
                        case "f801":
                            break;
                        case "fa01":
                            iBitCount = 8;
                            break;
                        default:
                            iBitCount = -1;
                            break;
                    }
                }
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                int i10 = attributeValue5 == null ? -1 : Integer.parseInt(attributeValue5);
                if (i10 >= 0) {
                    int[] iArr = f76895e;
                    iBitCount = i10 >= iArr.length ? -1 : iArr[i10];
                    break;
                } else {
                    iBitCount = -1;
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue6 == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue6, 16))) == 0) {
                    iBitCount = -1;
                    break;
                }
                break;
            default:
                iBitCount = -1;
                break;
        }
        do {
            xmlPullParser.next();
        } while (!sp3.b(xmlPullParser, "AudioChannelConfiguration"));
        return iBitCount;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:79:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x012f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0152  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static Pair c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? attributeValue2;
        ?? A;
        UUID uuid3;
        String attributeValue3;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue4 != null) {
            String strA = ki.a(attributeValue4);
            strA.getClass();
            switch (strA) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = jr.f79151c;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    A = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = jr.f79153e;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    A = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = jr.f79152d;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    A = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= attributeCount) {
                            attributeValue3 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i10);
                            int iIndexOf = attributeName.indexOf(58);
                            if (iIndexOf != -1) {
                                attributeName = attributeName.substring(iIndexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                attributeValue3 = xmlPullParser.getAttributeValue(i10);
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(attributeValue3) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue3)) {
                        String[] strArrSplit = attributeValue3.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                            uuidArr[i11] = UUID.fromString(strArrSplit[i11]);
                        }
                        uuid = jr.f79150b;
                        attributeValue2 = 0;
                        A = el2.a(uuid, uuidArr, null);
                        break;
                    } else {
                        uuid = null;
                        uuid2 = uuid;
                        attributeValue2 = uuid2;
                        A = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    attributeValue2 = uuid2;
                    A = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            attributeValue2 = uuid2;
            A = uuid2;
        }
        do {
            xmlPullParser.next();
            if (sp3.c(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                A = A;
                attributeValue2 = xmlPullParser.getText();
            } else if (sp3.c(xmlPullParser, "ms:laurl")) {
                A = A;
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (A == 0 && xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                int iIndexOf2 = name.indexOf(58);
                if (iIndexOf2 != -1) {
                    name = name.substring(iIndexOf2 + 1);
                }
                if (name.equals("pssh") && xmlPullParser.next() == 4) {
                    byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                    dl2 dl2VarA = el2.a(bArrDecode);
                    UUID uuid4 = dl2VarA == null ? null : dl2VarA.f76721a;
                    if (uuid4 == null) {
                        ih1.d("MpdParser", "Skipping malformed cenc:pssh data");
                        uuid = uuid4;
                        A = 0;
                        attributeValue2 = attributeValue2;
                    } else {
                        UUID uuid5 = uuid4;
                        A = bArrDecode;
                        uuid = uuid5;
                        attributeValue2 = attributeValue2;
                    }
                } else if (A == 0) {
                    uuid3 = jr.f79153e;
                    if (!uuid3.equals(uuid)) {
                        a(xmlPullParser);
                        A = A;
                        attributeValue2 = attributeValue2;
                    } else {
                        a(xmlPullParser);
                        A = A;
                        attributeValue2 = attributeValue2;
                    }
                } else {
                    a(xmlPullParser);
                    A = A;
                    attributeValue2 = attributeValue2;
                }
            } else if (A == 0) {
                uuid3 = jr.f79153e;
                if (!uuid3.equals(uuid) && sp3.c(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    A = el2.a(uuid3, null, Base64.decode(xmlPullParser.getText(), 0));
                    attributeValue2 = attributeValue2;
                } else {
                    a(xmlPullParser);
                    A = A;
                    attributeValue2 = attributeValue2;
                }
            } else {
                a(xmlPullParser);
                A = A;
                attributeValue2 = attributeValue2;
            }
        } while (!sp3.b(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new jk0(uuid, attributeValue2, "video/mp4", A) : null);
    }

    public e30() {
        try {
            this.f76896a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i10++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i10--;
                }
            }
        }
    }

    @Override // yads.pb2
    public final Object a(Uri uri, r30 r30Var) throws ob2 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f76896a.newPullParser();
            xmlPullParserNewPullParser.setInput(r30Var, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return a(xmlPullParserNewPullParser, uri);
            }
            throw new ob2("inputStream does not contain a valid media presentation description", null, true, 4);
        } catch (XmlPullParserException e10) {
            throw new ob2(null, e10, true, 4);
        }
    }

    public static long a(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList a(XmlPullParser xmlPullParser, List list, boolean z10) throws XmlPullParserException, IOException {
        int i10;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = z10 ? 1 : Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                a(xmlPullParser);
            }
        } while (!sp3.b(xmlPullParser, "BaseURL"));
        if (text != null && oa3.a(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return qf1.a(new uo(i10, i11, text, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            uo uoVar = (uo) list.get(i12);
            String strA = oa3.a(uoVar.f83549a, text);
            String str = attributeValue3 == null ? strA : attributeValue3;
            if (z10) {
                i10 = uoVar.f83551c;
                i11 = uoVar.f83552d;
                str = uoVar.f83550b;
            }
            arrayList.add(new uo(i10, i11, strA, str));
        }
        return arrayList;
    }

    public static wf0 a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!sp3.b(xmlPullParser, str));
        return new wf0(attributeValue, attributeValue2, str2);
    }

    public static long a(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        Matcher matcher = ib3.f78563h.matcher(attributeValue);
        if (matcher.matches()) {
            boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
            String strGroup = matcher.group(3);
            double d10 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
            String strGroup2 = matcher.group(5);
            double d11 = d10 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
            String strGroup3 = matcher.group(7);
            double d12 = d11 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
            String strGroup4 = matcher.group(10);
            double d13 = d12 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
            String strGroup5 = matcher.group(12);
            double d14 = d13 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
            String strGroup6 = matcher.group(14);
            long j11 = (long) ((d14 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
            return zIsEmpty ? -j11 : j11;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static pl2 a(XmlPullParser xmlPullParser, String str, String str2) {
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
            return new pl2(attributeValue, j10, j11);
        }
        j10 = 0;
        j11 = -1;
        return new pl2(attributeValue, j10, j11);
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
            case "forced_subtitle":
            case "forced-subtitle":
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

    public static gx2 a(XmlPullParser xmlPullParser, gx2 gx2Var) throws XmlPullParserException, IOException {
        long j10 = gx2Var != null ? gx2Var.f78408b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j10 = Long.parseLong(attributeValue);
        }
        long j11 = j10;
        long j12 = gx2Var != null ? gx2Var.f78409c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j12 = Long.parseLong(attributeValue2);
        }
        long j13 = j12;
        long j14 = gx2Var != null ? gx2Var.f77967d : 0L;
        long j15 = gx2Var != null ? gx2Var.f77968e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j14 = Long.parseLong(strArrSplit[0]);
            j15 = (Long.parseLong(strArrSplit[1]) - j14) + 1;
        }
        long j16 = j15;
        long j17 = j14;
        pl2 pl2VarA = gx2Var != null ? gx2Var.f78407a : null;
        do {
            xmlPullParser.next();
            if (sp3.c(xmlPullParser, "Initialization")) {
                pl2VarA = a(xmlPullParser, "sourceURL", "range");
            } else {
                a(xmlPullParser);
            }
        } while (!sp3.b(xmlPullParser, "SegmentBase"));
        return new gx2(pl2VarA, j11, j13, j17, j16);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d8 A[PHI: r2 r3
  0x00d8: PHI (r2v9 yads.pl2) = (r2v8 yads.pl2), (r2v10 yads.pl2) binds: [B:56:0x00c1, B:63:0x00cd] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r3v4 java.util.List) = (r3v3 java.util.List), (r3v5 java.util.List) binds: [B:56:0x00c1, B:63:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    public static dx2 a(XmlPullParser xmlPullParser, dx2 dx2Var, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        pl2 pl2Var;
        List list;
        List list2;
        long j15 = dx2Var != null ? dx2Var.f78408b : 1L;
        ArrayList arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j16 = j15;
        long j17 = dx2Var != null ? dx2Var.f78409c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j17 = Long.parseLong(attributeValue2);
        }
        long j18 = j17;
        long j19 = dx2Var != null ? dx2Var.f76457e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j19 = Long.parseLong(attributeValue3);
        }
        long j20 = j19;
        long j21 = dx2Var != null ? dx2Var.f76456d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j21 = Long.parseLong(attributeValue4);
        }
        long j22 = j21;
        long j23 = j13 == -9223372036854775807L ? j12 : j13;
        long j24 = j23 == Long.MAX_VALUE ? -9223372036854775807L : j23;
        pl2 pl2VarA = null;
        List listA = null;
        do {
            xmlPullParser.next();
            if (sp3.c(xmlPullParser, "Initialization")) {
                pl2VarA = a(xmlPullParser, "sourceURL", "range");
            } else if (sp3.c(xmlPullParser, "SegmentTimeline")) {
                listA = a(xmlPullParser, j16, j11);
            } else if (sp3.c(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a(xmlPullParser, C3426d4.i.I0, "mediaRange"));
            } else {
                a(xmlPullParser);
            }
        } while (!sp3.b(xmlPullParser, "SegmentList"));
        if (dx2Var == null) {
            pl2Var = pl2VarA;
            list = listA;
            list2 = arrayList;
        } else {
            if (pl2VarA == null) {
                pl2VarA = dx2Var.f78407a;
            }
            if (listA == null) {
                listA = dx2Var.f76458f;
            }
            if (arrayList != null) {
                pl2Var = pl2VarA;
                list = listA;
                list2 = arrayList;
            } else {
                list2 = dx2Var.f76839j;
                pl2Var = pl2VarA;
                list = listA;
            }
        }
        return new dx2(pl2Var, j16, j18, j22, j20, list, j24, list2, ib3.a(j14), ib3.a(j10));
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00f4 A[PHI: r6
  0x00f4: PHI (r6v3 yads.pl2) = (r6v2 yads.pl2), (r6v5 yads.pl2) binds: [B:66:0x00e5, B:70:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    public static ex2 a(XmlPullParser xmlPullParser, ex2 ex2Var, List list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15;
        List list2;
        long j16 = ex2Var != null ? ex2Var.f78408b : 1L;
        pl2 pl2VarA = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j16 = Long.parseLong(attributeValue);
        }
        long j17 = j16;
        long j18 = ex2Var != null ? ex2Var.f78409c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j18 = Long.parseLong(attributeValue2);
        }
        long j19 = j18;
        long j20 = ex2Var != null ? ex2Var.f76457e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j20 = Long.parseLong(attributeValue3);
        }
        long j21 = j20;
        long j22 = ex2Var != null ? ex2Var.f76456d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j22 = Long.parseLong(attributeValue4);
        }
        long j23 = j22;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                j15 = -1;
                break;
            }
            wf0 wf0Var = (wf0) list.get(i10);
            if (ki.a("http://dashif.org/guidelines/last-segment-number", wf0Var.f84183a)) {
                j15 = Long.parseLong(wf0Var.f84184b);
                break;
            }
            i10++;
        }
        long j24 = j15;
        long j25 = j13 == -9223372036854775807L ? j12 : j13;
        long j26 = j25 == Long.MAX_VALUE ? -9223372036854775807L : j25;
        va3 va3VarA = a(xmlPullParser, C3426d4.i.I0, ex2Var != null ? ex2Var.f77220k : null);
        va3 va3VarA2 = a(xmlPullParser, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, ex2Var != null ? ex2Var.f77219j : null);
        ArrayList arrayListA = null;
        do {
            xmlPullParser.next();
            if (sp3.c(xmlPullParser, "Initialization")) {
                pl2VarA = a(xmlPullParser, "sourceURL", "range");
            } else if (sp3.c(xmlPullParser, "SegmentTimeline")) {
                arrayListA = a(xmlPullParser, j17, j11);
            } else {
                a(xmlPullParser);
            }
        } while (!sp3.b(xmlPullParser, "SegmentTemplate"));
        if (ex2Var == null) {
            list2 = arrayListA;
        } else {
            if (pl2VarA == null) {
                pl2VarA = ex2Var.f78407a;
            }
            if (arrayListA != null) {
                list2 = arrayListA;
            } else {
                list2 = ex2Var.f76458f;
            }
        }
        return new ex2(pl2VarA, j17, j19, j23, j24, j21, list2, j26, va3VarA2, va3VarA, ib3.a(j14), ib3.a(j10));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00c8. Please report as an issue. */
    public static va3 a(XmlPullParser xmlPullParser, String str, va3 va3Var) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return va3Var;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int length = 0;
        int i10 = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                strArr[i10] = strArr[i10] + attributeValue.substring(length);
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                strArr[i10] = strArr[i10] + attributeValue.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                strArr[i10] = strArr[i10] + "$";
                length += 2;
            } else {
                int i11 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i11);
                String strSubstring2 = attributeValue.substring(i11, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    iArr[i10] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith(VastAttributes.HORIZONTAL_POSITION) && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            iArr[i10] = 2;
                            break;
                        case "Time":
                            iArr[i10] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i10] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    strArr2[i10] = strSubstring;
                }
                i10++;
                strArr[i10] = "";
                length = iIndexOf2 + 1;
            }
        }
        return new va3(strArr, iArr, strArr2, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:153:0x033f  */
    /* JADX WARN: Code duplicated, block: B:171:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:215:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:278:0x0742  */
    /* JADX WARN: Code duplicated, block: B:328:0x09cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:330:0x09d4  */
    /* JADX WARN: Code duplicated, block: B:332:0x09dc  */
    /* JADX WARN: Code duplicated, block: B:333:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:336:0x09ef  */
    /* JADX WARN: Code duplicated, block: B:342:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:344:0x0a13 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:346:0x0a19  */
    /* JADX WARN: Code duplicated, block: B:348:0x0a21  */
    /* JADX WARN: Code duplicated, block: B:349:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:352:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:359:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:364:0x0a61  */
    /* JADX WARN: Code duplicated, block: B:367:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:369:0x0a7b  */
    /* JADX WARN: Code duplicated, block: B:373:0x0a87  */
    /* JADX WARN: Code duplicated, block: B:376:0x0a8e  */
    /* JADX WARN: Code duplicated, block: B:389:0x0aca  */
    /* JADX WARN: Code duplicated, block: B:393:0x0ad6  */
    /* JADX WARN: Code duplicated, block: B:395:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:402:0x0b03  */
    /* JADX WARN: Code duplicated, block: B:409:0x0b21  */
    /* JADX WARN: Code duplicated, block: B:411:0x0b33  */
    /* JADX WARN: Code duplicated, block: B:416:0x0b49  */
    /* JADX WARN: Code duplicated, block: B:418:0x0b5f  */
    /* JADX WARN: Code duplicated, block: B:420:0x0b69  */
    /* JADX WARN: Code duplicated, block: B:422:0x0b73  */
    /* JADX WARN: Code duplicated, block: B:425:0x0b78  */
    /* JADX WARN: Code duplicated, block: B:427:0x0b7f  */
    /* JADX WARN: Code duplicated, block: B:428:0x0b81  */
    /* JADX WARN: Code duplicated, block: B:431:0x0b8a  */
    /* JADX WARN: Code duplicated, block: B:432:0x0b8c  */
    /* JADX WARN: Code duplicated, block: B:435:0x0b95  */
    /* JADX WARN: Code duplicated, block: B:436:0x0b98  */
    /* JADX WARN: Code duplicated, block: B:439:0x0ba1  */
    /* JADX WARN: Code duplicated, block: B:440:0x0ba3  */
    /* JADX WARN: Code duplicated, block: B:443:0x0bac  */
    /* JADX WARN: Code duplicated, block: B:444:0x0bae  */
    /* JADX WARN: Code duplicated, block: B:447:0x0bb7  */
    /* JADX WARN: Code duplicated, block: B:449:0x0bbb  */
    /* JADX WARN: Code duplicated, block: B:450:0x0bbd  */
    /* JADX WARN: Code duplicated, block: B:451:0x0bbf  */
    /* JADX WARN: Code duplicated, block: B:452:0x0bc2  */
    /* JADX WARN: Code duplicated, block: B:453:0x0bc4  */
    /* JADX WARN: Code duplicated, block: B:454:0x0bc7  */
    /* JADX WARN: Code duplicated, block: B:459:0x0be0  */
    /* JADX WARN: Code duplicated, block: B:461:0x0bf0  */
    /* JADX WARN: Code duplicated, block: B:466:0x0bfe  */
    /* JADX WARN: Code duplicated, block: B:468:0x0c0e  */
    /* JADX WARN: Code duplicated, block: B:472:0x0c37  */
    /* JADX WARN: Code duplicated, block: B:474:0x0c47  */
    /* JADX WARN: Code duplicated, block: B:476:0x0c55  */
    /* JADX WARN: Code duplicated, block: B:477:0x0c5c  */
    /* JADX WARN: Code duplicated, block: B:479:0x0c62  */
    /* JADX WARN: Code duplicated, block: B:481:0x0c6a  */
    /* JADX WARN: Code duplicated, block: B:484:0x0c73  */
    /* JADX WARN: Code duplicated, block: B:493:0x0cb7  */
    /* JADX WARN: Code duplicated, block: B:495:0x0cc1  */
    /* JADX WARN: Code duplicated, block: B:498:0x0cc8  */
    /* JADX WARN: Code duplicated, block: B:507:0x0d0a A[PHI: r3
  0x0d0a: PHI (r3v70 java.util.ArrayList) = (r3v69 java.util.ArrayList), (r3v69 java.util.ArrayList), (r3v72 java.util.ArrayList) binds: [B:494:0x0cbf, B:798:0x0d0a, B:793:0x0d0a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:509:0x0d0e  */
    /* JADX WARN: Code duplicated, block: B:511:0x0d1c  */
    /* JADX WARN: Code duplicated, block: B:514:0x0d27  */
    /* JADX WARN: Code duplicated, block: B:515:0x0d2a  */
    /* JADX WARN: Code duplicated, block: B:518:0x0d45  */
    /* JADX WARN: Code duplicated, block: B:519:0x0d48  */
    /* JADX WARN: Code duplicated, block: B:523:0x0d67  */
    /* JADX WARN: Code duplicated, block: B:525:0x0d6a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:530:0x0d95 A[LOOP:11: B:284:0x078d->B:530:0x0d95, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:564:0x0f2b  */
    /* JADX WARN: Code duplicated, block: B:566:0x0f3f  */
    /* JADX WARN: Code duplicated, block: B:569:0x0f45  */
    /* JADX WARN: Code duplicated, block: B:572:0x0f54  */
    /* JADX WARN: Code duplicated, block: B:575:0x0f5b  */
    /* JADX WARN: Code duplicated, block: B:584:0x0f7e  */
    /* JADX WARN: Code duplicated, block: B:587:0x0f85  */
    /* JADX WARN: Code duplicated, block: B:592:0x0fac  */
    /* JADX WARN: Code duplicated, block: B:596:0x0fbd  */
    /* JADX WARN: Code duplicated, block: B:599:0x0fc8  */
    /* JADX WARN: Code duplicated, block: B:602:0x0fcf  */
    /* JADX WARN: Code duplicated, block: B:613:0x1001  */
    /* JADX WARN: Code duplicated, block: B:616:0x101a  */
    /* JADX WARN: Code duplicated, block: B:617:0x102e  */
    /* JADX WARN: Code duplicated, block: B:619:0x1032  */
    /* JADX WARN: Code duplicated, block: B:624:0x1078 A[LOOP:5: B:177:0x0413->B:624:0x1078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:727:0x13cb  */
    /* JADX WARN: Code duplicated, block: B:729:0x13cf  */
    /* JADX WARN: Code duplicated, block: B:730:0x13d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:732:0x13d5  */
    /* JADX WARN: Code duplicated, block: B:736:0x13e6  */
    /* JADX WARN: Code duplicated, block: B:738:0x13f8  */
    /* JADX WARN: Code duplicated, block: B:740:0x1403 A[LOOP:1: B:45:0x00d0->B:740:0x1403, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:746:0x1050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:0x13c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:0x0f1b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:0x0f76 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:0x0fed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:0x09c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:0x0ac0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:0x0b08 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:0x0b3a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:0x0bca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:0x0bf2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:0x0c10 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:0x0d0a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:0x0d0a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:0x09ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:0x0a15 A[SYNTHETIC] */
    public static c30 a(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        long j11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        String str;
        long j12;
        String str2;
        long j13;
        int i10;
        float f10;
        ArrayList arrayList6;
        byte b10;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        float f11;
        String str3;
        int i11;
        ArrayList arrayList11;
        String str4;
        ArrayList arrayList12;
        ArrayList arrayList13;
        String str5;
        int i12;
        int i13;
        float f12;
        ArrayList arrayList14;
        int i14;
        ArrayList arrayList15;
        String str6;
        ArrayList arrayList16;
        String str7;
        String str8;
        int i15;
        String str9;
        String str10;
        String str11;
        String str12;
        String strA;
        String str13;
        String[] strArrSplit;
        int length;
        int i16;
        String strA2;
        String strA3;
        int i17;
        int i18;
        ArrayList arrayList17;
        int i19;
        int iA;
        int i20;
        int i21;
        ArrayList arrayList18;
        int i22;
        int i23;
        int i24;
        int i25;
        lx0 lx0Var;
        int i26;
        int i27;
        ArrayList arrayList19;
        int i28;
        wf0 wf0Var;
        String str14;
        int i29;
        int i30;
        wf0 wf0Var2;
        String str15;
        hx2 gx2Var;
        ArrayList arrayList20;
        int i31;
        wf0 wf0Var3;
        String str16;
        int iA2;
        byte b11;
        wf0 wf0Var4;
        wf0 wf0Var5;
        String str17;
        int i32;
        int i33;
        String str18;
        String[] strArrSplit2;
        int length2;
        int i34;
        int i35;
        ArrayList arrayList21;
        int i36;
        ArrayList arrayList22;
        lx0 lx0Var2;
        String str19;
        ArrayList arrayList23;
        String str20;
        ArrayList arrayList24;
        long j14;
        mx0 mx0Var;
        p51 p51Var;
        hx2 hx2Var;
        lo2 jo2Var;
        int i37;
        String str21;
        int i38;
        jk0 jk0Var;
        int size;
        jk0 jk0Var2;
        int i39;
        jk0 jk0Var3;
        jk0 jk0Var4;
        long jA;
        String str22;
        String strNextText;
        String strNextText2;
        String strNextText3;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String[] strArrSplit3 = new String[0];
        String str23 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArrSplit3 = attributeValue.split(StringUtils.COMMA);
        }
        int length3 = strArrSplit3.length;
        int i40 = 0;
        while (true) {
            z10 = true;
            if (i40 >= length3) {
                z11 = false;
                break;
            }
            if (strArrSplit3[i40].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z11 = true;
                break;
            }
            i40++;
        }
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "availabilityStartTime");
        long j15 = -9223372036854775807L;
        long jF = attributeValue2 == null ? -9223372036854775807L : ib3.f(attributeValue2);
        long jA2 = a(xmlPullParser2, "mediaPresentationDuration", -9223372036854775807L);
        long jA3 = a(xmlPullParser2, "minBufferTime", -9223372036854775807L);
        boolean zEquals = "dynamic".equals(xmlPullParser2.getAttributeValue(null, "type"));
        long jA4 = zEquals ? a(xmlPullParser2, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long jA5 = zEquals ? a(xmlPullParser2, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long jA6 = zEquals ? a(xmlPullParser2, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "publishTime");
        long jF2 = attributeValue3 == null ? -9223372036854775807L : ib3.f(attributeValue3);
        long j16 = zEquals ? 0L : -9223372036854775807L;
        ArrayList arrayListA = qf1.a(new uo(z11 ? 1 : Integer.MIN_VALUE, 1, uri.toString(), uri.toString()));
        ArrayList arrayList25 = new ArrayList();
        ArrayList arrayList26 = new ArrayList();
        long j17 = zEquals ? -9223372036854775807L : 0L;
        long jA7 = j16;
        boolean z13 = false;
        boolean z14 = false;
        dj2 dj2Var = null;
        hb3 hb3Var = null;
        Uri uri2 = null;
        zx2 zx2Var = null;
        while (true) {
            xmlPullParser.next();
            String str24 = "BaseURL";
            if (sp3.c(xmlPullParser2, "BaseURL")) {
                if (!z13) {
                    jA7 = a(xmlPullParser2, jA7);
                    z13 = z10;
                }
                arrayList26.addAll(a(xmlPullParser2, arrayListA, z11));
            } else {
                boolean zC = sp3.c(xmlPullParser2, "ProgramInformation");
                String str25 = Q6.f27460q;
                if (zC) {
                    String attributeValue4 = xmlPullParser2.getAttributeValue(str23, "moreInformationURL");
                    String str26 = attributeValue4 == null ? str23 : attributeValue4;
                    String attributeValue5 = xmlPullParser2.getAttributeValue(str23, Q6.f27460q);
                    if (attributeValue5 == null) {
                        strNextText = str23;
                        strNextText2 = strNextText;
                        strNextText3 = strNextText2;
                        str22 = strNextText3;
                    } else {
                        str22 = attributeValue5;
                        strNextText = str23;
                        strNextText2 = strNextText;
                        strNextText3 = strNextText2;
                    }
                    do {
                        xmlPullParser.next();
                        if (sp3.c(xmlPullParser2, "Title")) {
                            strNextText = xmlPullParser.nextText();
                        } else if (sp3.c(xmlPullParser2, "Source")) {
                            strNextText2 = xmlPullParser.nextText();
                        } else if (sp3.c(xmlPullParser2, ExifInterface.TAG_COPYRIGHT)) {
                            strNextText3 = xmlPullParser.nextText();
                        } else {
                            a(xmlPullParser);
                        }
                    } while (!sp3.b(xmlPullParser2, "ProgramInformation"));
                    dj2Var = new dj2(strNextText, strNextText2, strNextText3, str26, str22);
                } else {
                    if (sp3.c(xmlPullParser2, "UTCTiming")) {
                        hb3Var = new hb3(xmlPullParser2.getAttributeValue(str23, "schemeIdUri"), xmlPullParser2.getAttributeValue(str23, "value"));
                    } else if (sp3.c(xmlPullParser2, "Location")) {
                        uri2 = Uri.parse(oa3.a(uri.toString(), xmlPullParser.nextText()));
                    } else if (sp3.c(xmlPullParser2, "ServiceDescription")) {
                        float f13 = -3.4028235E38f;
                        float f14 = -3.4028235E38f;
                        long j18 = j15;
                        long j19 = j18;
                        long j20 = j19;
                        while (true) {
                            xmlPullParser.next();
                            if (sp3.c(xmlPullParser2, "Latency")) {
                                String attributeValue6 = xmlPullParser2.getAttributeValue(str23, TypedValues.AttributesType.S_TARGET);
                                j20 = attributeValue6 == null ? j15 : Long.parseLong(attributeValue6);
                                String attributeValue7 = xmlPullParser2.getAttributeValue(str23, "min");
                                j18 = attributeValue7 == null ? j15 : Long.parseLong(attributeValue7);
                                String attributeValue8 = xmlPullParser2.getAttributeValue(str23, "max");
                                j19 = attributeValue8 == null ? j15 : Long.parseLong(attributeValue8);
                            } else if (sp3.c(xmlPullParser2, "PlaybackRate")) {
                                String attributeValue9 = xmlPullParser2.getAttributeValue(str23, "min");
                                f13 = attributeValue9 == null ? -3.4028235E38f : Float.parseFloat(attributeValue9);
                                String attributeValue10 = xmlPullParser2.getAttributeValue(str23, "max");
                                f14 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                            }
                            float f15 = f13;
                            float f16 = f14;
                            long j21 = j18;
                            long j22 = j19;
                            long j23 = j20;
                            if (sp3.b(xmlPullParser2, "ServiceDescription")) {
                                zx2Var = new zx2(j23, j21, j22, f15, f16);
                            } else {
                                j20 = j23;
                                j18 = j21;
                                j19 = j22;
                                f13 = f15;
                                f14 = f16;
                            }
                        }
                    } else {
                        if (sp3.c(xmlPullParser2, "Period") && !z14) {
                            ArrayList arrayList27 = !arrayList26.isEmpty() ? arrayList26 : arrayListA;
                            String str27 = "id";
                            String attributeValue11 = xmlPullParser2.getAttributeValue(str23, "id");
                            long jA8 = a(xmlPullParser2, "start", j17);
                            long j24 = jF != j15 ? jF + jA8 : j15;
                            long jA9 = a(xmlPullParser2, "duration", j15);
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = new ArrayList();
                            long j25 = j15;
                            hx2 hx2VarA = null;
                            boolean z15 = false;
                            long jA10 = jA7;
                            while (true) {
                                xmlPullParser.next();
                                if (sp3.c(xmlPullParser2, str24)) {
                                    if (!z15) {
                                        jA10 = a(xmlPullParser2, jA10);
                                        z15 = true;
                                    }
                                    arrayList30.addAll(a(xmlPullParser2, arrayList27, z11));
                                    str = str27;
                                    str24 = str24;
                                    j10 = jA7;
                                    arrayList2 = arrayList25;
                                    arrayList26 = arrayList26;
                                    z11 = z11;
                                    arrayListA = arrayListA;
                                    arrayList = arrayList27;
                                    str25 = str25;
                                    arrayList3 = arrayList30;
                                    arrayList5 = arrayList29;
                                    j11 = j17;
                                    z12 = false;
                                    j15 = -9223372036854775807L;
                                    xmlPullParser2 = xmlPullParser2;
                                    arrayList4 = arrayList28;
                                } else {
                                    j11 = j17;
                                    arrayList = arrayList27;
                                    arrayListA = arrayListA;
                                    if (sp3.c(xmlPullParser2, "AdaptationSet")) {
                                        String str28 = "SegmentTemplate";
                                        ArrayList arrayList31 = !arrayList30.isEmpty() ? arrayList30 : arrayList;
                                        String attributeValue12 = xmlPullParser2.getAttributeValue(null, str27);
                                        int i41 = attributeValue12 == null ? -1 : Integer.parseInt(attributeValue12);
                                        j10 = jA7;
                                        String attributeValue13 = xmlPullParser2.getAttributeValue(null, "contentType");
                                        String str29 = "video";
                                        arrayList3 = arrayList30;
                                        String str30 = "audio";
                                        jA10 = jA10;
                                        if (TextUtils.isEmpty(attributeValue13)) {
                                            i10 = -1;
                                        } else if ("audio".equals(attributeValue13)) {
                                            i10 = 1;
                                        } else if ("video".equals(attributeValue13)) {
                                            i10 = 2;
                                        } else if ("text".equals(attributeValue13)) {
                                            i10 = 3;
                                        } else {
                                            i10 = -1;
                                        }
                                        String attributeValue14 = xmlPullParser2.getAttributeValue(null, "mimeType");
                                        String attributeValue15 = xmlPullParser2.getAttributeValue(null, "codecs");
                                        String attributeValue16 = xmlPullParser2.getAttributeValue(null, "width");
                                        int i42 = attributeValue16 == null ? -1 : Integer.parseInt(attributeValue16);
                                        String attributeValue17 = xmlPullParser2.getAttributeValue(null, "height");
                                        int i43 = attributeValue17 == null ? -1 : Integer.parseInt(attributeValue17);
                                        String attributeValue18 = xmlPullParser2.getAttributeValue(null, "frameRate");
                                        if (attributeValue18 != null) {
                                            Matcher matcher = f76892b.matcher(attributeValue18);
                                            if (matcher.matches()) {
                                                int i44 = Integer.parseInt(matcher.group(1));
                                                String strGroup = matcher.group(2);
                                                f10 = !TextUtils.isEmpty(strGroup) ? i44 / Integer.parseInt(strGroup) : i44;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                        } else {
                                            f10 = -1.0f;
                                        }
                                        String attributeValue19 = xmlPullParser2.getAttributeValue(null, "audioSamplingRate");
                                        int i45 = attributeValue19 == null ? -1 : Integer.parseInt(attributeValue19);
                                        String attributeValue20 = xmlPullParser2.getAttributeValue(null, str25);
                                        String attributeValue21 = xmlPullParser2.getAttributeValue(null, "label");
                                        ArrayList arrayList32 = new ArrayList();
                                        ArrayList arrayList33 = new ArrayList();
                                        ArrayList arrayList34 = new ArrayList();
                                        arrayList2 = arrayList25;
                                        ArrayList arrayList35 = new ArrayList();
                                        arrayList26 = arrayList26;
                                        ArrayList arrayList36 = new ArrayList();
                                        ArrayList arrayList37 = new ArrayList();
                                        int i46 = i10;
                                        ArrayList arrayList38 = new ArrayList();
                                        ArrayList arrayList39 = new ArrayList();
                                        ArrayList arrayList40 = arrayList36;
                                        ArrayList arrayList41 = arrayList34;
                                        String str31 = "SegmentList";
                                        hx2 hx2VarA2 = hx2VarA;
                                        long jA11 = j25;
                                        long j26 = jA10;
                                        int iD = i46;
                                        boolean z16 = false;
                                        String str32 = null;
                                        int iB = -1;
                                        String str33 = "SegmentBase";
                                        String str34 = attributeValue20;
                                        String text = attributeValue21;
                                        while (true) {
                                            xmlPullParser.next();
                                            if (sp3.c(xmlPullParser2, str24)) {
                                                if (z16) {
                                                    jA = j26;
                                                } else {
                                                    jA = a(xmlPullParser2, j26);
                                                    z16 = true;
                                                }
                                                arrayList39.addAll(a(xmlPullParser2, arrayList31, z11));
                                                j26 = jA;
                                                arrayList6 = arrayList31;
                                            } else {
                                                arrayList6 = arrayList31;
                                                if (sp3.c(xmlPullParser2, "ContentProtection")) {
                                                    Pair pairC = c(xmlPullParser);
                                                    long j27 = j26;
                                                    Object obj = pairC.first;
                                                    if (obj != null) {
                                                        str32 = (String) obj;
                                                    }
                                                    Object obj2 = pairC.second;
                                                    if (obj2 != null) {
                                                        arrayList32.add((jk0) obj2);
                                                    }
                                                    arrayList6 = arrayList6;
                                                    j26 = j27;
                                                } else {
                                                    j26 = j26;
                                                    if (sp3.c(xmlPullParser2, "ContentComponent")) {
                                                        String attributeValue22 = xmlPullParser2.getAttributeValue(null, str25);
                                                        if (str34 == null) {
                                                            str34 = attributeValue22;
                                                        } else if (attributeValue22 != null && !str34.equals(attributeValue22)) {
                                                            throw new IllegalStateException();
                                                        }
                                                        String attributeValue23 = xmlPullParser2.getAttributeValue(null, "contentType");
                                                        if (TextUtils.isEmpty(attributeValue23)) {
                                                            i35 = -1;
                                                        } else if (str30.equals(attributeValue23)) {
                                                            i35 = 1;
                                                        } else if (str29.equals(attributeValue23)) {
                                                            i35 = 2;
                                                        } else if ("text".equals(attributeValue23)) {
                                                            i35 = 3;
                                                        } else {
                                                            i35 = -1;
                                                        }
                                                        b10 = -1;
                                                        if (iD == -1) {
                                                            iD = i35;
                                                        } else if (i35 != -1 && iD != i35) {
                                                            throw new IllegalStateException();
                                                        }
                                                    } else {
                                                        b10 = -1;
                                                        if (sp3.c(xmlPullParser2, "Role")) {
                                                            arrayList35.add(a(xmlPullParser2, "Role"));
                                                            str27 = str27;
                                                            str24 = str24;
                                                            arrayList32 = arrayList32;
                                                            str34 = str34;
                                                            iD = iD;
                                                            str30 = str30;
                                                            j11 = j11;
                                                            arrayListA = arrayListA;
                                                            str28 = str28;
                                                            j10 = j10;
                                                            jA10 = jA10;
                                                            str33 = str33;
                                                            arrayList2 = arrayList2;
                                                            arrayList26 = arrayList26;
                                                            arrayList38 = arrayList38;
                                                            arrayList41 = arrayList41;
                                                            arrayList40 = arrayList40;
                                                            jA11 = jA11;
                                                            arrayList6 = arrayList6;
                                                            arrayList39 = arrayList39;
                                                            arrayList37 = arrayList37;
                                                            str29 = str29;
                                                            z11 = z11;
                                                            str25 = str25;
                                                            arrayList = arrayList;
                                                            arrayList33 = arrayList33;
                                                            arrayList7 = arrayList35;
                                                            xmlPullParser2 = xmlPullParser2;
                                                            str31 = str31;
                                                        } else if (sp3.c(xmlPullParser2, "AudioChannelConfiguration")) {
                                                            iB = b(xmlPullParser);
                                                        } else {
                                                            if (sp3.c(xmlPullParser2, "Accessibility")) {
                                                                ArrayList arrayList42 = arrayList41;
                                                                arrayList42.add(a(xmlPullParser2, "Accessibility"));
                                                                str25 = str25;
                                                                arrayList40 = arrayList40;
                                                                arrayList41 = arrayList42;
                                                            } else {
                                                                ArrayList arrayList43 = arrayList41;
                                                                if (sp3.c(xmlPullParser2, "EssentialProperty")) {
                                                                    ArrayList arrayList44 = arrayList40;
                                                                    arrayList44.add(a(xmlPullParser2, "EssentialProperty"));
                                                                    str25 = str25;
                                                                    arrayList40 = arrayList44;
                                                                    arrayList41 = arrayList43;
                                                                } else {
                                                                    str25 = str25;
                                                                    ArrayList arrayList45 = arrayList40;
                                                                    String str35 = "SupplementalProperty";
                                                                    if (sp3.c(xmlPullParser2, "SupplementalProperty")) {
                                                                        arrayList37.add(a(xmlPullParser2, "SupplementalProperty"));
                                                                        arrayList40 = arrayList45;
                                                                        arrayList41 = arrayList43;
                                                                    } else {
                                                                        String str36 = "EssentialProperty";
                                                                        String str37 = str30;
                                                                        String str38 = "InbandEventStream";
                                                                        if (sp3.c(xmlPullParser2, "Representation")) {
                                                                            if (arrayList39.isEmpty()) {
                                                                                arrayList8 = arrayList39;
                                                                                arrayList9 = arrayList6;
                                                                            } else {
                                                                                arrayList9 = arrayList39;
                                                                                arrayList8 = arrayList9;
                                                                            }
                                                                            String attributeValue24 = xmlPullParser2.getAttributeValue(null, str27);
                                                                            String str39 = str27;
                                                                            String attributeValue25 = xmlPullParser2.getAttributeValue(null, "bandwidth");
                                                                            int i47 = attributeValue25 == null ? -1 : Integer.parseInt(attributeValue25);
                                                                            String attributeValue26 = xmlPullParser2.getAttributeValue(null, "mimeType");
                                                                            String str40 = attributeValue26 == null ? attributeValue14 : attributeValue26;
                                                                            String attributeValue27 = xmlPullParser2.getAttributeValue(null, "codecs");
                                                                            String str41 = attributeValue27 == null ? attributeValue15 : attributeValue27;
                                                                            String attributeValue28 = xmlPullParser2.getAttributeValue(null, "width");
                                                                            int i48 = attributeValue28 == null ? i42 : Integer.parseInt(attributeValue28);
                                                                            String attributeValue29 = xmlPullParser2.getAttributeValue(null, "height");
                                                                            int i49 = attributeValue29 == null ? i43 : Integer.parseInt(attributeValue29);
                                                                            String attributeValue30 = xmlPullParser2.getAttributeValue(null, "frameRate");
                                                                            if (attributeValue30 != null) {
                                                                                Matcher matcher2 = f76892b.matcher(attributeValue30);
                                                                                if (matcher2.matches()) {
                                                                                    int i50 = Integer.parseInt(matcher2.group(1));
                                                                                    arrayList10 = arrayList43;
                                                                                    String strGroup2 = matcher2.group(2);
                                                                                    f11 = !TextUtils.isEmpty(strGroup2) ? i50 / Integer.parseInt(strGroup2) : i50;
                                                                                } else {
                                                                                    arrayList10 = arrayList43;
                                                                                    f11 = f10;
                                                                                }
                                                                            } else {
                                                                                arrayList10 = arrayList43;
                                                                                f11 = f10;
                                                                            }
                                                                            String attributeValue31 = xmlPullParser2.getAttributeValue(null, "audioSamplingRate");
                                                                            int i51 = attributeValue31 == null ? i45 : Integer.parseInt(attributeValue31);
                                                                            ArrayList arrayList46 = new ArrayList();
                                                                            ArrayList arrayList47 = new ArrayList();
                                                                            ArrayList arrayList48 = new ArrayList(arrayList45);
                                                                            ArrayList arrayList49 = new ArrayList(arrayList37);
                                                                            ArrayList arrayList50 = new ArrayList();
                                                                            float f17 = f11;
                                                                            ArrayList arrayList51 = arrayList37;
                                                                            String str42 = str34;
                                                                            int i52 = iD;
                                                                            hx2 hx2VarA3 = hx2VarA2;
                                                                            long j28 = jA11;
                                                                            int iB2 = iB;
                                                                            long jA12 = j26;
                                                                            boolean z17 = false;
                                                                            String str43 = null;
                                                                            while (true) {
                                                                                xmlPullParser.next();
                                                                                if (sp3.c(xmlPullParser2, str24)) {
                                                                                    if (!z17) {
                                                                                        jA12 = a(xmlPullParser2, jA12);
                                                                                        z17 = true;
                                                                                    }
                                                                                    arrayList50.addAll(a(xmlPullParser2, arrayList9, z11));
                                                                                } else {
                                                                                    arrayList46 = arrayList46;
                                                                                    if (sp3.c(xmlPullParser2, "AudioChannelConfiguration")) {
                                                                                        iB2 = b(xmlPullParser);
                                                                                    } else {
                                                                                        String str44 = str33;
                                                                                        if (sp3.c(xmlPullParser2, str44)) {
                                                                                            str33 = str44;
                                                                                            hx2VarA3 = a(xmlPullParser2, (gx2) hx2VarA3);
                                                                                        } else {
                                                                                            String str45 = str31;
                                                                                            if (sp3.c(xmlPullParser2, str45)) {
                                                                                                long jA13 = a(xmlPullParser2, j28);
                                                                                                arrayList11 = arrayList50;
                                                                                                str27 = str39;
                                                                                                i12 = i48;
                                                                                                i13 = i49;
                                                                                                str5 = str40;
                                                                                                str24 = str24;
                                                                                                j11 = j11;
                                                                                                arrayList13 = arrayList38;
                                                                                                String str46 = str36;
                                                                                                arrayList39 = arrayList8;
                                                                                                f12 = f17;
                                                                                                i14 = i47;
                                                                                                String str47 = str28;
                                                                                                arrayList6 = arrayList6;
                                                                                                arrayList14 = arrayList9;
                                                                                                str3 = str29;
                                                                                                arrayList37 = arrayList51;
                                                                                                j10 = j10;
                                                                                                String str48 = str38;
                                                                                                arrayList16 = arrayList46;
                                                                                                arrayList15 = arrayList35;
                                                                                                arrayList2 = arrayList2;
                                                                                                arrayList26 = arrayList26;
                                                                                                arrayList40 = arrayList45;
                                                                                                i11 = i51;
                                                                                                arrayList32 = arrayList32;
                                                                                                jA10 = jA10;
                                                                                                arrayList12 = arrayList33;
                                                                                                arrayListA = arrayListA;
                                                                                                str4 = str44;
                                                                                                z11 = z11;
                                                                                                hx2VarA3 = a(xmlPullParser, (dx2) hx2VarA3, j24, jA9, jA12, jA13, jA5);
                                                                                                str7 = str47;
                                                                                                arrayList = arrayList;
                                                                                                str6 = str48;
                                                                                                str35 = str35;
                                                                                                str8 = str45;
                                                                                                str11 = str43;
                                                                                                i15 = i52;
                                                                                                arrayList47 = arrayList47;
                                                                                                arrayList48 = arrayList48;
                                                                                                arrayList49 = arrayList49;
                                                                                                iB2 = iB2;
                                                                                                j28 = jA13;
                                                                                                str10 = str46;
                                                                                                str9 = str42;
                                                                                                jA12 = jA12;
                                                                                            } else {
                                                                                                str3 = str29;
                                                                                                i11 = i51;
                                                                                                arrayList32 = arrayList32;
                                                                                                arrayList11 = arrayList50;
                                                                                                arrayListA = arrayListA;
                                                                                                String str49 = str28;
                                                                                                jA10 = jA10;
                                                                                                str4 = str44;
                                                                                                arrayList12 = arrayList33;
                                                                                                arrayList13 = arrayList38;
                                                                                                String str50 = str36;
                                                                                                arrayList6 = arrayList6;
                                                                                                str27 = str39;
                                                                                                str5 = str40;
                                                                                                i12 = i48;
                                                                                                i13 = i49;
                                                                                                arrayList37 = arrayList51;
                                                                                                f12 = f17;
                                                                                                str24 = str24;
                                                                                                arrayList14 = arrayList9;
                                                                                                z11 = z11;
                                                                                                jA12 = jA12;
                                                                                                j11 = j11;
                                                                                                j10 = j10;
                                                                                                arrayList39 = arrayList8;
                                                                                                i14 = i47;
                                                                                                String str51 = str42;
                                                                                                arrayList15 = arrayList35;
                                                                                                str6 = str38;
                                                                                                arrayList2 = arrayList2;
                                                                                                arrayList26 = arrayList26;
                                                                                                arrayList16 = arrayList46;
                                                                                                arrayList40 = arrayList45;
                                                                                                if (sp3.c(xmlPullParser2, str49)) {
                                                                                                    long jA14 = a(xmlPullParser2, j28);
                                                                                                    str7 = str49;
                                                                                                    arrayList = arrayList;
                                                                                                    str8 = str45;
                                                                                                    i15 = i52;
                                                                                                    str9 = str51;
                                                                                                    hx2VarA3 = a(xmlPullParser, (ex2) hx2VarA3, arrayList37, j24, jA9, jA12, jA14, jA5);
                                                                                                    str11 = str43;
                                                                                                    j28 = jA14;
                                                                                                } else {
                                                                                                    str7 = str49;
                                                                                                    arrayList = arrayList;
                                                                                                    str8 = str45;
                                                                                                    i15 = i52;
                                                                                                    str9 = str51;
                                                                                                    if (sp3.c(xmlPullParser2, "ContentProtection")) {
                                                                                                        Pair pairC2 = c(xmlPullParser);
                                                                                                        Object obj3 = pairC2.first;
                                                                                                        if (obj3 != null) {
                                                                                                            str43 = (String) obj3;
                                                                                                        }
                                                                                                        Object obj4 = pairC2.second;
                                                                                                        if (obj4 != null) {
                                                                                                            arrayList16.add((jk0) obj4);
                                                                                                        }
                                                                                                        str11 = str43;
                                                                                                    } else {
                                                                                                        str6 = str6;
                                                                                                        if (sp3.c(xmlPullParser2, str6)) {
                                                                                                            arrayList47 = arrayList47;
                                                                                                            arrayList47.add(a(xmlPullParser2, str6));
                                                                                                            str35 = str35;
                                                                                                            arrayList48 = arrayList48;
                                                                                                            arrayList49 = arrayList49;
                                                                                                            str10 = str50;
                                                                                                        } else {
                                                                                                            arrayList47 = arrayList47;
                                                                                                            str10 = str50;
                                                                                                            if (sp3.c(xmlPullParser2, str10)) {
                                                                                                                arrayList48 = arrayList48;
                                                                                                                arrayList48.add(a(xmlPullParser2, str10));
                                                                                                                str35 = str35;
                                                                                                                arrayList49 = arrayList49;
                                                                                                            } else {
                                                                                                                str35 = str35;
                                                                                                                arrayList48 = arrayList48;
                                                                                                                if (sp3.c(xmlPullParser2, str35)) {
                                                                                                                    arrayList49 = arrayList49;
                                                                                                                    arrayList49.add(a(xmlPullParser2, str35));
                                                                                                                } else {
                                                                                                                    arrayList49 = arrayList49;
                                                                                                                    a(xmlPullParser);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        jA12 = jA12;
                                                                                                        str11 = str43;
                                                                                                        iB2 = iB2;
                                                                                                    }
                                                                                                }
                                                                                                str10 = str50;
                                                                                            }
                                                                                        }
                                                                                        if (sp3.b(xmlPullParser2, "Representation")) {
                                                                                            if (str37.equals(ht1.c(str5))) {
                                                                                                if (str41 != null) {
                                                                                                    int i53 = ib3.f78556a;
                                                                                                    if (TextUtils.isEmpty(str41)) {
                                                                                                        strArrSplit2 = new String[0];
                                                                                                    } else {
                                                                                                        strArrSplit2 = str41.trim().split("(\\s*,\\s*)", -1);
                                                                                                    }
                                                                                                    length2 = strArrSplit2.length;
                                                                                                    i34 = 0;
                                                                                                    while (true) {
                                                                                                        if (i34 >= length2) {
                                                                                                            strA3 = ht1.a(strArrSplit2[i34]);
                                                                                                            if (strA3 == null && str37.equals(ht1.c(strA3))) {
                                                                                                                str12 = str3;
                                                                                                                strA = strA3;
                                                                                                                str13 = str5;
                                                                                                            } else {
                                                                                                                i34++;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                str13 = str5;
                                                                                                str12 = str3;
                                                                                                strA = null;
                                                                                            } else {
                                                                                                str12 = str3;
                                                                                                if (str12.equals(ht1.c(str5))) {
                                                                                                    if (str41 != null) {
                                                                                                        int i54 = ib3.f78556a;
                                                                                                        if (TextUtils.isEmpty(str41)) {
                                                                                                            strArrSplit = new String[0];
                                                                                                        } else {
                                                                                                            strArrSplit = str41.trim().split("(\\s*,\\s*)", -1);
                                                                                                        }
                                                                                                        length = strArrSplit.length;
                                                                                                        i16 = 0;
                                                                                                        while (true) {
                                                                                                            if (i16 >= length) {
                                                                                                                strA2 = ht1.a(strArrSplit[i16]);
                                                                                                                if (strA2 == null && str12.equals(ht1.c(strA2))) {
                                                                                                                    strA3 = strA2;
                                                                                                                    strA = strA3;
                                                                                                                    str13 = str5;
                                                                                                                } else {
                                                                                                                    i16++;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    str13 = str5;
                                                                                                } else if (ht1.e(str5) && !"image".equals(ht1.c(str5))) {
                                                                                                    str13 = str5;
                                                                                                    if ("application/mp4".equals(str13)) {
                                                                                                        strA = ht1.a(str41);
                                                                                                        if ("text/vtt".equals(strA)) {
                                                                                                            strA = "application/x-mp4-vtt";
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    strA = str5;
                                                                                                    str13 = strA;
                                                                                                }
                                                                                                strA = null;
                                                                                            }
                                                                                            if ("audio/eac3".equals(strA)) {
                                                                                                i33 = 0;
                                                                                                while (true) {
                                                                                                    if (i33 < arrayList49.size()) {
                                                                                                        wf0 wf0Var6 = (wf0) arrayList49.get(i33);
                                                                                                        str18 = wf0Var6.f84183a;
                                                                                                        if ((!"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str18) && "JOC".equals(wf0Var6.f84184b)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str18) && "ec+3".equals(wf0Var6.f84184b))) {
                                                                                                            strA = "audio/eac3-joc";
                                                                                                        }
                                                                                                    } else {
                                                                                                        strA = "audio/eac3";
                                                                                                    }
                                                                                                }
                                                                                                if ("audio/eac3-joc".equals(strA)) {
                                                                                                    str41 = "ec+3";
                                                                                                }
                                                                                            }
                                                                                            String str52 = str41;
                                                                                            i17 = 0;
                                                                                            i18 = 0;
                                                                                            while (i17 < arrayList15.size()) {
                                                                                                ArrayList arrayList52 = arrayList15;
                                                                                                wf0Var5 = (wf0) arrayList52.get(i17);
                                                                                                ArrayList arrayList53 = arrayList47;
                                                                                                ArrayList arrayList54 = arrayList16;
                                                                                                if (!ki.a("urn:mpeg:dash:role:2011", wf0Var5.f84183a)) {
                                                                                                    str17 = wf0Var5.f84184b;
                                                                                                    if (str17 == null && (str17.equals("forced_subtitle") || str17.equals("forced-subtitle"))) {
                                                                                                        i32 = 2;
                                                                                                    } else {
                                                                                                        i32 = 0;
                                                                                                    }
                                                                                                    i18 = i32 | i18;
                                                                                                }
                                                                                                i17++;
                                                                                                arrayList15 = arrayList52;
                                                                                                arrayList47 = arrayList53;
                                                                                                arrayList16 = arrayList54;
                                                                                            }
                                                                                            ArrayList arrayList55 = arrayList47;
                                                                                            ArrayList arrayList56 = arrayList16;
                                                                                            arrayList17 = arrayList15;
                                                                                            i19 = 0;
                                                                                            iA = 0;
                                                                                            while (i19 < arrayList17.size()) {
                                                                                                wf0Var4 = (wf0) arrayList17.get(i19);
                                                                                                ArrayList arrayList57 = arrayList17;
                                                                                                if (ki.a("urn:mpeg:dash:role:2011", wf0Var4.f84183a)) {
                                                                                                    iA |= a(wf0Var4.f84184b);
                                                                                                }
                                                                                                i19++;
                                                                                                arrayList17 = arrayList57;
                                                                                            }
                                                                                            ArrayList arrayList58 = arrayList17;
                                                                                            i20 = 0;
                                                                                            i21 = 0;
                                                                                            while (i20 < arrayList10.size()) {
                                                                                                ArrayList arrayList59 = arrayList10;
                                                                                                wf0Var3 = (wf0) arrayList59.get(i20);
                                                                                                String str53 = str11;
                                                                                                if (ki.a("urn:mpeg:dash:role:2011", wf0Var3.f84183a)) {
                                                                                                    iA2 = a(wf0Var3.f84184b);
                                                                                                } else {
                                                                                                    if (!ki.a("urn:tva:metadata:cs:AudioPurposeCS:2007", wf0Var3.f84183a)) {
                                                                                                        str16 = wf0Var3.f84184b;
                                                                                                        if (str16 == null) {
                                                                                                            switch (str16.hashCode()) {
                                                                                                                case 49:
                                                                                                                    if (str16.equals("1")) {
                                                                                                                        b11 = 0;
                                                                                                                    } else {
                                                                                                                        b11 = -1;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 50:
                                                                                                                    if (str16.equals("2")) {
                                                                                                                        b11 = 1;
                                                                                                                    } else {
                                                                                                                        b11 = -1;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 51:
                                                                                                                    if (str16.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                                                                                                                        b11 = 2;
                                                                                                                    } else {
                                                                                                                        b11 = -1;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 52:
                                                                                                                    if (str16.equals("4")) {
                                                                                                                        b11 = 3;
                                                                                                                    } else {
                                                                                                                        b11 = -1;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 53:
                                                                                                                default:
                                                                                                                    b11 = -1;
                                                                                                                    break;
                                                                                                                case 54:
                                                                                                                    if (str16.equals("6")) {
                                                                                                                        b11 = 4;
                                                                                                                    } else {
                                                                                                                        b11 = -1;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            switch (b11) {
                                                                                                                case 0:
                                                                                                                    iA2 = 512;
                                                                                                                    break;
                                                                                                                case 1:
                                                                                                                    iA2 = 2048;
                                                                                                                    break;
                                                                                                                case 2:
                                                                                                                    iA2 = 4;
                                                                                                                    break;
                                                                                                                case 3:
                                                                                                                    iA2 = 8;
                                                                                                                    break;
                                                                                                                case 4:
                                                                                                                    iA2 = 1;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    iA2 = 0;
                                                                                                                    break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            iA2 = 0;
                                                                                                        }
                                                                                                    }
                                                                                                    i20++;
                                                                                                    str11 = str53;
                                                                                                    arrayList10 = arrayList59;
                                                                                                }
                                                                                                i21 = iA2 | i21;
                                                                                                i20++;
                                                                                                str11 = str53;
                                                                                                arrayList10 = arrayList59;
                                                                                            }
                                                                                            arrayList18 = arrayList10;
                                                                                            String str54 = str11;
                                                                                            int i55 = iA | i21;
                                                                                            i23 = 0;
                                                                                            for (i22 = 0; i22 < arrayList48.size(); i22++) {
                                                                                                if (ki.a("http://dashif.org/guidelines/trickmode", ((wf0) arrayList48.get(i22)).f84183a)) {
                                                                                                    i23 = 16384;
                                                                                                }
                                                                                            }
                                                                                            int i56 = i55 | i23;
                                                                                            i25 = 0;
                                                                                            for (i24 = 0; i24 < arrayList49.size(); i24++) {
                                                                                                if (ki.a("http://dashif.org/guidelines/trickmode", ((wf0) arrayList49.get(i24)).f84183a)) {
                                                                                                    i25 = 16384;
                                                                                                }
                                                                                            }
                                                                                            lx0Var = new lx0();
                                                                                            lx0Var.f79957a = attributeValue24;
                                                                                            lx0Var.f79966j = str13;
                                                                                            lx0Var.f79967k = strA;
                                                                                            lx0Var.f79964h = str52;
                                                                                            lx0Var.f79963g = i14;
                                                                                            lx0Var.f79960d = i18;
                                                                                            lx0Var.f79961e = i56 | i25;
                                                                                            lx0Var.f79959c = str9;
                                                                                            if (str12.equals(ht1.c(strA))) {
                                                                                                lx0Var.f79972p = i12;
                                                                                                lx0Var.f79973q = i13;
                                                                                                lx0Var.f79974r = f12;
                                                                                            } else {
                                                                                                i26 = i12;
                                                                                                i27 = i13;
                                                                                                if (str37.equals(ht1.c(strA))) {
                                                                                                    lx0Var.f79980x = iB2;
                                                                                                    lx0Var.f79981y = i11;
                                                                                                } else if (ht1.e(strA)) {
                                                                                                    if ("application/cea-608".equals(strA)) {
                                                                                                        i30 = 0;
                                                                                                        while (true) {
                                                                                                            arrayList19 = arrayList18;
                                                                                                            if (i30 < arrayList18.size()) {
                                                                                                                wf0Var2 = (wf0) arrayList19.get(i30);
                                                                                                                if (!"urn:scte:dash:cc:cea-608:2015".equals(wf0Var2.f84183a) && (str15 = wf0Var2.f84184b) != null) {
                                                                                                                    Matcher matcher3 = f76893c.matcher(str15);
                                                                                                                    if (matcher3.matches()) {
                                                                                                                        i29 = Integer.parseInt(matcher3.group(1));
                                                                                                                    } else {
                                                                                                                        ih1.d("MpdParser", "Unable to parse CEA-608 channel number from: " + wf0Var2.f84184b);
                                                                                                                    }
                                                                                                                }
                                                                                                                i30++;
                                                                                                                arrayList18 = arrayList19;
                                                                                                            } else {
                                                                                                                i29 = -1;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        arrayList19 = arrayList18;
                                                                                                        if ("application/cea-708".equals(strA)) {
                                                                                                            i28 = 0;
                                                                                                            while (true) {
                                                                                                                if (i28 < arrayList19.size()) {
                                                                                                                    wf0Var = (wf0) arrayList19.get(i28);
                                                                                                                    if (!"urn:scte:dash:cc:cea-708:2015".equals(wf0Var.f84183a) && (str14 = wf0Var.f84184b) != null) {
                                                                                                                        Matcher matcher4 = f76894d.matcher(str14);
                                                                                                                        if (matcher4.matches()) {
                                                                                                                            i29 = Integer.parseInt(matcher4.group(1));
                                                                                                                        } else {
                                                                                                                            ih1.d("MpdParser", "Unable to parse CEA-708 service block number from: " + wf0Var.f84184b);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i28++;
                                                                                                                } else {
                                                                                                                    i29 = -1;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            i29 = -1;
                                                                                                        }
                                                                                                    }
                                                                                                    lx0Var.C = i29;
                                                                                                } else {
                                                                                                    arrayList19 = arrayList18;
                                                                                                    if ("image".equals(ht1.c(strA))) {
                                                                                                        lx0Var.f79972p = i26;
                                                                                                        lx0Var.f79973q = i27;
                                                                                                    }
                                                                                                }
                                                                                                mx0 mx0Var2 = new mx0(lx0Var);
                                                                                                if (hx2VarA3 != null) {
                                                                                                    gx2Var = hx2VarA3;
                                                                                                } else {
                                                                                                    gx2Var = new gx2(null, 1L, 0L, 0L, 0L);
                                                                                                }
                                                                                                if (arrayList11.isEmpty()) {
                                                                                                    arrayList20 = arrayList14;
                                                                                                } else {
                                                                                                    arrayList20 = arrayList11;
                                                                                                }
                                                                                                d30 d30Var = new d30(mx0Var2, arrayList20, gx2Var, str54, arrayList56, arrayList55, arrayList48, arrayList49);
                                                                                                iD = ht1.d(mx0Var2.f80429m);
                                                                                                i31 = i15;
                                                                                                if (i31 != -1) {
                                                                                                    if (iD != -1 && i31 != iD) {
                                                                                                        throw new IllegalStateException();
                                                                                                    }
                                                                                                    iD = i31;
                                                                                                }
                                                                                                ArrayList arrayList60 = arrayList13;
                                                                                                arrayList60.add(d30Var);
                                                                                                arrayList38 = arrayList60;
                                                                                                str29 = str12;
                                                                                                arrayList41 = arrayList19;
                                                                                                str30 = str37;
                                                                                                str34 = str9;
                                                                                                arrayList7 = arrayList58;
                                                                                                str28 = str7;
                                                                                                text = text;
                                                                                                j26 = j26;
                                                                                                arrayList33 = arrayList12;
                                                                                                str33 = str4;
                                                                                                str31 = str8;
                                                                                                xmlPullParser2 = xmlPullParser;
                                                                                            }
                                                                                            arrayList19 = arrayList18;
                                                                                            mx0 mx0Var3 = new mx0(lx0Var);
                                                                                            if (hx2VarA3 != null) {
                                                                                                gx2Var = hx2VarA3;
                                                                                            } else {
                                                                                                gx2Var = new gx2(null, 1L, 0L, 0L, 0L);
                                                                                            }
                                                                                            if (arrayList11.isEmpty()) {
                                                                                                arrayList20 = arrayList11;
                                                                                            } else {
                                                                                                arrayList20 = arrayList14;
                                                                                            }
                                                                                            d30 d30Var2 = new d30(mx0Var3, arrayList20, gx2Var, str54, arrayList56, arrayList55, arrayList48, arrayList49);
                                                                                            iD = ht1.d(mx0Var3.f80429m);
                                                                                            i31 = i15;
                                                                                            if (i31 != -1) {
                                                                                                if (iD != -1) {
                                                                                                    throw new IllegalStateException();
                                                                                                }
                                                                                                iD = i31;
                                                                                            }
                                                                                            ArrayList arrayList61 = arrayList13;
                                                                                            arrayList61.add(d30Var2);
                                                                                            arrayList38 = arrayList61;
                                                                                            str29 = str12;
                                                                                            arrayList41 = arrayList19;
                                                                                            str30 = str37;
                                                                                            str34 = str9;
                                                                                            arrayList7 = arrayList58;
                                                                                            str28 = str7;
                                                                                            text = text;
                                                                                            j26 = j26;
                                                                                            arrayList33 = arrayList12;
                                                                                            str33 = str4;
                                                                                            str31 = str8;
                                                                                            xmlPullParser2 = xmlPullParser;
                                                                                        } else {
                                                                                            arrayList47 = arrayList47;
                                                                                            ArrayList arrayList62 = arrayList16;
                                                                                            String str55 = str5;
                                                                                            str38 = str6;
                                                                                            str35 = str35;
                                                                                            arrayList48 = arrayList48;
                                                                                            arrayList49 = arrayList49;
                                                                                            iB2 = iB2;
                                                                                            i47 = i14;
                                                                                            str42 = str9;
                                                                                            str43 = str11;
                                                                                            jA10 = jA10;
                                                                                            arrayList10 = arrayList10;
                                                                                            z11 = z11;
                                                                                            i52 = i15;
                                                                                            arrayList35 = arrayList15;
                                                                                            arrayListA = arrayListA;
                                                                                            arrayList45 = arrayList40;
                                                                                            arrayList = arrayList;
                                                                                            arrayList50 = arrayList11;
                                                                                            arrayList9 = arrayList14;
                                                                                            arrayList46 = arrayList62;
                                                                                            str39 = str27;
                                                                                            arrayList38 = arrayList13;
                                                                                            str29 = str3;
                                                                                            arrayList32 = arrayList32;
                                                                                            i51 = i11;
                                                                                            str33 = str4;
                                                                                            str31 = str8;
                                                                                            xmlPullParser2 = xmlPullParser;
                                                                                            arrayList6 = arrayList6;
                                                                                            str28 = str7;
                                                                                            arrayList26 = arrayList26;
                                                                                            arrayList2 = arrayList2;
                                                                                            arrayList33 = arrayList12;
                                                                                            arrayList8 = arrayList39;
                                                                                            j11 = j11;
                                                                                            i48 = i12;
                                                                                            i49 = i13;
                                                                                            ArrayList arrayList63 = arrayList37;
                                                                                            str36 = str10;
                                                                                            str24 = str24;
                                                                                            str40 = str55;
                                                                                            j10 = j10;
                                                                                            f17 = f12;
                                                                                            arrayList51 = arrayList63;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str3 = str29;
                                                                                i11 = i51;
                                                                                arrayList32 = arrayList32;
                                                                                str6 = str38;
                                                                                arrayListA = arrayListA;
                                                                                jA10 = jA10;
                                                                                str4 = str33;
                                                                                arrayList12 = arrayList33;
                                                                                arrayList13 = arrayList38;
                                                                                str8 = str31;
                                                                                str35 = str35;
                                                                                str27 = str39;
                                                                                str5 = str40;
                                                                                i12 = i48;
                                                                                i13 = i49;
                                                                                arrayList49 = arrayList49;
                                                                                f12 = f17;
                                                                                iB2 = iB2;
                                                                                arrayList16 = arrayList46;
                                                                                str24 = str24;
                                                                                z11 = z11;
                                                                                arrayList11 = arrayList50;
                                                                                j11 = j11;
                                                                                arrayList = arrayList;
                                                                                str7 = str28;
                                                                                str10 = str36;
                                                                                arrayList6 = arrayList6;
                                                                                arrayList39 = arrayList8;
                                                                                i14 = i47;
                                                                                str9 = str42;
                                                                                i15 = i52;
                                                                                arrayList37 = arrayList51;
                                                                                arrayList14 = arrayList9;
                                                                                j10 = j10;
                                                                                arrayList2 = arrayList2;
                                                                                arrayList26 = arrayList26;
                                                                                arrayList47 = arrayList47;
                                                                                arrayList15 = arrayList35;
                                                                                arrayList40 = arrayList45;
                                                                                str11 = str43;
                                                                                arrayList48 = arrayList48;
                                                                                if (sp3.b(xmlPullParser2, "Representation")) {
                                                                                    if (str37.equals(ht1.c(str5))) {
                                                                                        if (str41 != null) {
                                                                                            int i57 = ib3.f78556a;
                                                                                            if (TextUtils.isEmpty(str41)) {
                                                                                                strArrSplit2 = new String[0];
                                                                                            } else {
                                                                                                strArrSplit2 = str41.trim().split("(\\s*,\\s*)", -1);
                                                                                            }
                                                                                            length2 = strArrSplit2.length;
                                                                                            i34 = 0;
                                                                                            while (true) {
                                                                                                if (i34 >= length2) {
                                                                                                    strA3 = ht1.a(strArrSplit2[i34]);
                                                                                                    if (strA3 == null) {
                                                                                                    }
                                                                                                    i34++;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        str13 = str5;
                                                                                        str12 = str3;
                                                                                        strA = null;
                                                                                    } else {
                                                                                        str12 = str3;
                                                                                        if (str12.equals(ht1.c(str5))) {
                                                                                            if (str41 != null) {
                                                                                                int i58 = ib3.f78556a;
                                                                                                if (TextUtils.isEmpty(str41)) {
                                                                                                    strArrSplit = new String[0];
                                                                                                } else {
                                                                                                    strArrSplit = str41.trim().split("(\\s*,\\s*)", -1);
                                                                                                }
                                                                                                length = strArrSplit.length;
                                                                                                i16 = 0;
                                                                                                while (true) {
                                                                                                    if (i16 >= length) {
                                                                                                        strA2 = ht1.a(strArrSplit[i16]);
                                                                                                        if (strA2 == null) {
                                                                                                        }
                                                                                                        i16++;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            str13 = str5;
                                                                                        } else if (ht1.e(str5)) {
                                                                                            strA = str5;
                                                                                            str13 = strA;
                                                                                        } else {
                                                                                            str13 = str5;
                                                                                            if ("application/mp4".equals(str13)) {
                                                                                                strA = ht1.a(str41);
                                                                                                if ("text/vtt".equals(strA)) {
                                                                                                    strA = "application/x-mp4-vtt";
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        strA = null;
                                                                                    }
                                                                                    if ("audio/eac3".equals(strA)) {
                                                                                        i33 = 0;
                                                                                        while (true) {
                                                                                            if (i33 < arrayList49.size()) {
                                                                                                wf0 wf0Var7 = (wf0) arrayList49.get(i33);
                                                                                                str18 = wf0Var7.f84183a;
                                                                                                i33 = !"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str18) ? i33 + 1 : i33 + 1;
                                                                                                strA = "audio/eac3-joc";
                                                                                            } else {
                                                                                                strA = "audio/eac3";
                                                                                            }
                                                                                        }
                                                                                        if ("audio/eac3-joc".equals(strA)) {
                                                                                            str41 = "ec+3";
                                                                                        }
                                                                                    }
                                                                                    String str56 = str41;
                                                                                    i17 = 0;
                                                                                    i18 = 0;
                                                                                    while (i17 < arrayList15.size()) {
                                                                                        ArrayList arrayList510 = arrayList15;
                                                                                        wf0Var5 = (wf0) arrayList510.get(i17);
                                                                                        ArrayList arrayList511 = arrayList47;
                                                                                        ArrayList arrayList512 = arrayList16;
                                                                                        if (!ki.a("urn:mpeg:dash:role:2011", wf0Var5.f84183a)) {
                                                                                            str17 = wf0Var5.f84184b;
                                                                                            if (str17 == null) {
                                                                                                i32 = 0;
                                                                                            } else {
                                                                                                i32 = 2;
                                                                                            }
                                                                                            i18 = i32 | i18;
                                                                                        }
                                                                                        i17++;
                                                                                        arrayList15 = arrayList510;
                                                                                        arrayList47 = arrayList511;
                                                                                        arrayList16 = arrayList512;
                                                                                    }
                                                                                    ArrayList arrayList513 = arrayList47;
                                                                                    ArrayList arrayList514 = arrayList16;
                                                                                    arrayList17 = arrayList15;
                                                                                    i19 = 0;
                                                                                    iA = 0;
                                                                                    while (i19 < arrayList17.size()) {
                                                                                        wf0Var4 = (wf0) arrayList17.get(i19);
                                                                                        ArrayList arrayList515 = arrayList17;
                                                                                        if (ki.a("urn:mpeg:dash:role:2011", wf0Var4.f84183a)) {
                                                                                            iA |= a(wf0Var4.f84184b);
                                                                                        }
                                                                                        i19++;
                                                                                        arrayList17 = arrayList515;
                                                                                    }
                                                                                    ArrayList arrayList516 = arrayList17;
                                                                                    i20 = 0;
                                                                                    i21 = 0;
                                                                                    while (i20 < arrayList10.size()) {
                                                                                        ArrayList arrayList517 = arrayList10;
                                                                                        wf0Var3 = (wf0) arrayList517.get(i20);
                                                                                        String str57 = str11;
                                                                                        if (ki.a("urn:mpeg:dash:role:2011", wf0Var3.f84183a)) {
                                                                                            iA2 = a(wf0Var3.f84184b);
                                                                                        } else {
                                                                                            if (!ki.a("urn:tva:metadata:cs:AudioPurposeCS:2007", wf0Var3.f84183a)) {
                                                                                                str16 = wf0Var3.f84184b;
                                                                                                if (str16 == null) {
                                                                                                    switch (str16.hashCode()) {
                                                                                                        case 49:
                                                                                                            if (str16.equals("1")) {
                                                                                                                b11 = -1;
                                                                                                            } else {
                                                                                                                b11 = 0;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 50:
                                                                                                            if (str16.equals("2")) {
                                                                                                                b11 = -1;
                                                                                                            } else {
                                                                                                                b11 = 1;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 51:
                                                                                                            if (str16.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                                                                                                                b11 = -1;
                                                                                                            } else {
                                                                                                                b11 = 2;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 52:
                                                                                                            if (str16.equals("4")) {
                                                                                                                b11 = -1;
                                                                                                            } else {
                                                                                                                b11 = 3;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 53:
                                                                                                        default:
                                                                                                            b11 = -1;
                                                                                                            break;
                                                                                                        case 54:
                                                                                                            if (str16.equals("6")) {
                                                                                                                b11 = -1;
                                                                                                            } else {
                                                                                                                b11 = 4;
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                    switch (b11) {
                                                                                                        case 0:
                                                                                                            iA2 = 512;
                                                                                                            break;
                                                                                                        case 1:
                                                                                                            iA2 = 2048;
                                                                                                            break;
                                                                                                        case 2:
                                                                                                            iA2 = 4;
                                                                                                            break;
                                                                                                        case 3:
                                                                                                            iA2 = 8;
                                                                                                            break;
                                                                                                        case 4:
                                                                                                            iA2 = 1;
                                                                                                            break;
                                                                                                        default:
                                                                                                            iA2 = 0;
                                                                                                            break;
                                                                                                    }
                                                                                                } else {
                                                                                                    iA2 = 0;
                                                                                                }
                                                                                            }
                                                                                            i20++;
                                                                                            str11 = str57;
                                                                                            arrayList10 = arrayList517;
                                                                                        }
                                                                                        i21 = iA2 | i21;
                                                                                        i20++;
                                                                                        str11 = str57;
                                                                                        arrayList10 = arrayList517;
                                                                                    }
                                                                                    arrayList18 = arrayList10;
                                                                                    String str58 = str11;
                                                                                    int i59 = iA | i21;
                                                                                    i23 = 0;
                                                                                    while (i22 < arrayList48.size()) {
                                                                                        if (ki.a("http://dashif.org/guidelines/trickmode", ((wf0) arrayList48.get(i22)).f84183a)) {
                                                                                            i23 = 16384;
                                                                                        }
                                                                                    }
                                                                                    int i510 = i59 | i23;
                                                                                    i25 = 0;
                                                                                    while (i24 < arrayList49.size()) {
                                                                                        if (ki.a("http://dashif.org/guidelines/trickmode", ((wf0) arrayList49.get(i24)).f84183a)) {
                                                                                            i25 = 16384;
                                                                                        }
                                                                                    }
                                                                                    lx0Var = new lx0();
                                                                                    lx0Var.f79957a = attributeValue24;
                                                                                    lx0Var.f79966j = str13;
                                                                                    lx0Var.f79967k = strA;
                                                                                    lx0Var.f79964h = str56;
                                                                                    lx0Var.f79963g = i14;
                                                                                    lx0Var.f79960d = i18;
                                                                                    lx0Var.f79961e = i510 | i25;
                                                                                    lx0Var.f79959c = str9;
                                                                                    if (str12.equals(ht1.c(strA))) {
                                                                                        lx0Var.f79972p = i12;
                                                                                        lx0Var.f79973q = i13;
                                                                                        lx0Var.f79974r = f12;
                                                                                    } else {
                                                                                        i26 = i12;
                                                                                        i27 = i13;
                                                                                        if (str37.equals(ht1.c(strA))) {
                                                                                            lx0Var.f79980x = iB2;
                                                                                            lx0Var.f79981y = i11;
                                                                                        } else if (ht1.e(strA)) {
                                                                                            if ("application/cea-608".equals(strA)) {
                                                                                                i30 = 0;
                                                                                                while (true) {
                                                                                                    arrayList19 = arrayList18;
                                                                                                    if (i30 < arrayList18.size()) {
                                                                                                        wf0Var2 = (wf0) arrayList19.get(i30);
                                                                                                        if (!"urn:scte:dash:cc:cea-608:2015".equals(wf0Var2.f84183a)) {
                                                                                                        }
                                                                                                        i30++;
                                                                                                        arrayList18 = arrayList19;
                                                                                                    } else {
                                                                                                        i29 = -1;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                arrayList19 = arrayList18;
                                                                                                if ("application/cea-708".equals(strA)) {
                                                                                                    i28 = 0;
                                                                                                    while (true) {
                                                                                                        if (i28 < arrayList19.size()) {
                                                                                                            wf0Var = (wf0) arrayList19.get(i28);
                                                                                                            if (!"urn:scte:dash:cc:cea-708:2015".equals(wf0Var.f84183a)) {
                                                                                                            }
                                                                                                            i28++;
                                                                                                        } else {
                                                                                                            i29 = -1;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    i29 = -1;
                                                                                                }
                                                                                            }
                                                                                            lx0Var.C = i29;
                                                                                        } else {
                                                                                            arrayList19 = arrayList18;
                                                                                            if ("image".equals(ht1.c(strA))) {
                                                                                                lx0Var.f79972p = i26;
                                                                                                lx0Var.f79973q = i27;
                                                                                            }
                                                                                        }
                                                                                        mx0 mx0Var4 = new mx0(lx0Var);
                                                                                        if (hx2VarA3 != null) {
                                                                                            gx2Var = hx2VarA3;
                                                                                        } else {
                                                                                            gx2Var = new gx2(null, 1L, 0L, 0L, 0L);
                                                                                        }
                                                                                        if (arrayList11.isEmpty()) {
                                                                                            arrayList20 = arrayList11;
                                                                                        } else {
                                                                                            arrayList20 = arrayList14;
                                                                                        }
                                                                                        d30 d30Var3 = new d30(mx0Var4, arrayList20, gx2Var, str58, arrayList514, arrayList513, arrayList48, arrayList49);
                                                                                        iD = ht1.d(mx0Var4.f80429m);
                                                                                        i31 = i15;
                                                                                        if (i31 != -1) {
                                                                                            if (iD != -1) {
                                                                                                throw new IllegalStateException();
                                                                                            }
                                                                                            iD = i31;
                                                                                        }
                                                                                        ArrayList arrayList64 = arrayList13;
                                                                                        arrayList64.add(d30Var3);
                                                                                        arrayList38 = arrayList64;
                                                                                        str29 = str12;
                                                                                        arrayList41 = arrayList19;
                                                                                        str30 = str37;
                                                                                        str34 = str9;
                                                                                        arrayList7 = arrayList516;
                                                                                        str28 = str7;
                                                                                        text = text;
                                                                                        j26 = j26;
                                                                                        arrayList33 = arrayList12;
                                                                                        str33 = str4;
                                                                                        str31 = str8;
                                                                                        xmlPullParser2 = xmlPullParser;
                                                                                    }
                                                                                    arrayList19 = arrayList18;
                                                                                    mx0 mx0Var5 = new mx0(lx0Var);
                                                                                    if (hx2VarA3 != null) {
                                                                                        gx2Var = hx2VarA3;
                                                                                    } else {
                                                                                        gx2Var = new gx2(null, 1L, 0L, 0L, 0L);
                                                                                    }
                                                                                    if (arrayList11.isEmpty()) {
                                                                                        arrayList20 = arrayList11;
                                                                                    } else {
                                                                                        arrayList20 = arrayList14;
                                                                                    }
                                                                                    d30 d30Var4 = new d30(mx0Var5, arrayList20, gx2Var, str58, arrayList514, arrayList513, arrayList48, arrayList49);
                                                                                    iD = ht1.d(mx0Var5.f80429m);
                                                                                    i31 = i15;
                                                                                    if (i31 != -1) {
                                                                                        if (iD != -1) {
                                                                                            throw new IllegalStateException();
                                                                                        }
                                                                                        iD = i31;
                                                                                    }
                                                                                    ArrayList arrayList65 = arrayList13;
                                                                                    arrayList65.add(d30Var4);
                                                                                    arrayList38 = arrayList65;
                                                                                    str29 = str12;
                                                                                    arrayList41 = arrayList19;
                                                                                    str30 = str37;
                                                                                    str34 = str9;
                                                                                    arrayList7 = arrayList516;
                                                                                    str28 = str7;
                                                                                    text = text;
                                                                                    j26 = j26;
                                                                                    arrayList33 = arrayList12;
                                                                                    str33 = str4;
                                                                                    str31 = str8;
                                                                                    xmlPullParser2 = xmlPullParser;
                                                                                } else {
                                                                                    arrayList47 = arrayList47;
                                                                                    ArrayList arrayList66 = arrayList16;
                                                                                    String str59 = str5;
                                                                                    str38 = str6;
                                                                                    str35 = str35;
                                                                                    arrayList48 = arrayList48;
                                                                                    arrayList49 = arrayList49;
                                                                                    iB2 = iB2;
                                                                                    i47 = i14;
                                                                                    str42 = str9;
                                                                                    str43 = str11;
                                                                                    jA10 = jA10;
                                                                                    arrayList10 = arrayList10;
                                                                                    z11 = z11;
                                                                                    i52 = i15;
                                                                                    arrayList35 = arrayList15;
                                                                                    arrayListA = arrayListA;
                                                                                    arrayList45 = arrayList40;
                                                                                    arrayList = arrayList;
                                                                                    arrayList50 = arrayList11;
                                                                                    arrayList9 = arrayList14;
                                                                                    arrayList46 = arrayList66;
                                                                                    str39 = str27;
                                                                                    arrayList38 = arrayList13;
                                                                                    str29 = str3;
                                                                                    arrayList32 = arrayList32;
                                                                                    i51 = i11;
                                                                                    str33 = str4;
                                                                                    str31 = str8;
                                                                                    xmlPullParser2 = xmlPullParser;
                                                                                    arrayList6 = arrayList6;
                                                                                    str28 = str7;
                                                                                    arrayList26 = arrayList26;
                                                                                    arrayList2 = arrayList2;
                                                                                    arrayList33 = arrayList12;
                                                                                    arrayList8 = arrayList39;
                                                                                    j11 = j11;
                                                                                    i48 = i12;
                                                                                    i49 = i13;
                                                                                    ArrayList arrayList67 = arrayList37;
                                                                                    str36 = str10;
                                                                                    str24 = str24;
                                                                                    str40 = str59;
                                                                                    j10 = j10;
                                                                                    f17 = f12;
                                                                                    arrayList51 = arrayList67;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str27 = str27;
                                                                            str24 = str24;
                                                                            arrayList37 = arrayList37;
                                                                            arrayList32 = arrayList32;
                                                                            str34 = str34;
                                                                            iD = iD;
                                                                            XmlPullParser xmlPullParser3 = xmlPullParser2;
                                                                            j11 = j11;
                                                                            arrayListA = arrayListA;
                                                                            j10 = j10;
                                                                            jA10 = jA10;
                                                                            str33 = str33;
                                                                            arrayList33 = arrayList33;
                                                                            arrayList2 = arrayList2;
                                                                            arrayList26 = arrayList26;
                                                                            arrayList38 = arrayList38;
                                                                            String str60 = str31;
                                                                            arrayList39 = arrayList39;
                                                                            str29 = str29;
                                                                            arrayList40 = arrayList45;
                                                                            arrayList41 = arrayList43;
                                                                            z11 = z11;
                                                                            arrayList = arrayList;
                                                                            str28 = str28;
                                                                            arrayList6 = arrayList6;
                                                                            str30 = str37;
                                                                            arrayList7 = arrayList35;
                                                                            if (sp3.c(xmlPullParser3, str33)) {
                                                                                hx2VarA2 = a(xmlPullParser3, (gx2) hx2VarA2);
                                                                                str31 = str60;
                                                                            } else {
                                                                                str31 = str60;
                                                                                if (sp3.c(xmlPullParser3, str31)) {
                                                                                    jA11 = a(xmlPullParser3, jA11);
                                                                                    hx2VarA2 = a(xmlPullParser, (dx2) hx2VarA2, j24, jA9, j26, jA11, jA5);
                                                                                } else {
                                                                                    str30 = str30;
                                                                                    str33 = str33;
                                                                                    jA11 = jA11;
                                                                                    if (sp3.c(xmlPullParser3, str28)) {
                                                                                        jA11 = a(xmlPullParser3, jA11);
                                                                                        j26 = j26;
                                                                                        str28 = str28;
                                                                                        xmlPullParser2 = xmlPullParser3;
                                                                                        hx2VarA2 = a(xmlPullParser, (ex2) hx2VarA2, arrayList37, j24, jA9, j26, jA11, jA5);
                                                                                        text = text;
                                                                                        str34 = str34;
                                                                                        arrayList33 = arrayList33;
                                                                                    } else {
                                                                                        str28 = str28;
                                                                                        str34 = str34;
                                                                                        xmlPullParser2 = xmlPullParser3;
                                                                                        if (sp3.c(xmlPullParser2, "InbandEventStream")) {
                                                                                            arrayList33 = arrayList33;
                                                                                            arrayList33.add(a(xmlPullParser2, "InbandEventStream"));
                                                                                        } else {
                                                                                            arrayList33 = arrayList33;
                                                                                            if (sp3.c(xmlPullParser2, "Label")) {
                                                                                                text = "";
                                                                                                do {
                                                                                                    xmlPullParser.next();
                                                                                                    if (xmlPullParser.getEventType() == 4) {
                                                                                                        text = xmlPullParser.getText();
                                                                                                    } else {
                                                                                                        a(xmlPullParser);
                                                                                                    }
                                                                                                } while (!sp3.b(xmlPullParser2, "Label"));
                                                                                                jA11 = jA11;
                                                                                                j26 = j26;
                                                                                                str34 = str34;
                                                                                            } else if (xmlPullParser.getEventType() == 2) {
                                                                                                a(xmlPullParser);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            xmlPullParser2 = xmlPullParser3;
                                                                            iD = iD;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            arrayList7 = arrayList35;
                                                        }
                                                        jA11 = jA11;
                                                        iD = iD;
                                                        text = text;
                                                        j26 = j26;
                                                        str34 = str34;
                                                    }
                                                    arrayList32 = arrayList32;
                                                    str30 = str30;
                                                    j11 = j11;
                                                    arrayListA = arrayListA;
                                                    str28 = str28;
                                                    j10 = j10;
                                                    jA10 = jA10;
                                                    str33 = str33;
                                                    arrayList2 = arrayList2;
                                                    arrayList26 = arrayList26;
                                                    text = text;
                                                    arrayList38 = arrayList38;
                                                    arrayList41 = arrayList41;
                                                    arrayList40 = arrayList40;
                                                    arrayList6 = arrayList6;
                                                    j26 = j26;
                                                    arrayList7 = arrayList35;
                                                    xmlPullParser2 = xmlPullParser2;
                                                    str31 = str31;
                                                }
                                                if (sp3.b(xmlPullParser2, "AdaptationSet")) {
                                                    arrayList21 = new ArrayList(arrayList38.size());
                                                    i36 = 0;
                                                    while (i36 < arrayList38.size()) {
                                                        arrayList22 = arrayList38;
                                                        d30 d30Var5 = (d30) arrayList22.get(i36);
                                                        mx0 mx0Var6 = d30Var5.f76539a;
                                                        mx0Var6.getClass();
                                                        lx0Var2 = new lx0(mx0Var6);
                                                        if (text != null) {
                                                            lx0Var2.f79958b = text;
                                                        }
                                                        str19 = d30Var5.f76542d;
                                                        if (str19 == null) {
                                                            str19 = str32;
                                                        }
                                                        arrayList23 = d30Var5.f76543e;
                                                        ArrayList arrayList68 = arrayList32;
                                                        arrayList23.addAll(arrayList68);
                                                        if (arrayList23.isEmpty()) {
                                                            str20 = text;
                                                            arrayList38 = arrayList22;
                                                        } else {
                                                            i37 = 0;
                                                            while (true) {
                                                                if (i37 < arrayList23.size()) {
                                                                    jk0Var4 = (jk0) arrayList23.get(i37);
                                                                    if (jr.f79151c.equals(jk0Var4.f79077c) || (str21 = jk0Var4.f79078d) == null) {
                                                                        i37++;
                                                                    } else {
                                                                        arrayList23.remove(i37);
                                                                    }
                                                                } else {
                                                                    str21 = null;
                                                                }
                                                            }
                                                            if (str21 != null) {
                                                                i38 = 0;
                                                                while (i38 < arrayList23.size()) {
                                                                    jk0Var = (jk0) arrayList23.get(i38);
                                                                    String str61 = text;
                                                                    if (!jr.f79150b.equals(jk0Var.f79077c) && jk0Var.f79078d == null) {
                                                                        arrayList23.set(i38, new jk0(jr.f79151c, str21, jk0Var.f79079e, jk0Var.f79080f));
                                                                    }
                                                                    i38++;
                                                                    text = str61;
                                                                    arrayList22 = arrayList22;
                                                                }
                                                            }
                                                            str20 = text;
                                                            arrayList38 = arrayList22;
                                                            for (size = arrayList23.size() - 1; size >= 0; size--) {
                                                                jk0Var2 = (jk0) arrayList23.get(size);
                                                                if (jk0Var2.f79080f != null) {
                                                                    for (i39 = 0; i39 < arrayList23.size(); i39++) {
                                                                        jk0Var3 = (jk0) arrayList23.get(i39);
                                                                        if (jk0Var3.f79080f == null && jk0Var2.f79080f == null && jk0Var3.a(jk0Var2.f79077c)) {
                                                                            arrayList23.remove(size);
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            lx0Var2.f79970n = new kk0(str19, false, (jk0[]) arrayList23.toArray(new jk0[0]));
                                                        }
                                                        arrayList24 = d30Var5.f76544f;
                                                        arrayList24.addAll(arrayList33);
                                                        j14 = d30Var5.f76545g;
                                                        mx0Var = new mx0(lx0Var2);
                                                        p51Var = d30Var5.f76540b;
                                                        hx2Var = d30Var5.f76541c;
                                                        if (hx2Var instanceof gx2) {
                                                            jo2Var = new ko2(j14, mx0Var, p51Var, (gx2) hx2Var, arrayList24);
                                                        } else if (hx2Var instanceof cx2) {
                                                            jo2Var = new jo2(j14, mx0Var, p51Var, (cx2) hx2Var, arrayList24);
                                                        } else {
                                                            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                        }
                                                        arrayList21.add(jo2Var);
                                                        i36++;
                                                        arrayList32 = arrayList68;
                                                        text = str20;
                                                    }
                                                    ArrayList arrayList69 = arrayList28;
                                                    arrayList69.add(new zb(i41, iD, arrayList21, arrayList41, arrayList40, arrayList37));
                                                    arrayList4 = arrayList69;
                                                    z12 = false;
                                                    arrayList5 = arrayList29;
                                                    str = str27;
                                                } else {
                                                    arrayList33 = arrayList33;
                                                    str31 = str31;
                                                    xmlPullParser2 = xmlPullParser2;
                                                    str33 = str33;
                                                    str30 = str30;
                                                    arrayList39 = arrayList39;
                                                    arrayList35 = arrayList7;
                                                    z11 = z11;
                                                    arrayList31 = arrayList6;
                                                    text = text;
                                                    str29 = str29;
                                                    arrayListA = arrayListA;
                                                    arrayList = arrayList;
                                                    str25 = str25;
                                                    arrayList37 = arrayList37;
                                                    str24 = str24;
                                                    j10 = j10;
                                                    str27 = str27;
                                                    arrayList38 = arrayList38;
                                                    arrayList32 = arrayList32;
                                                    str28 = str28;
                                                    jA10 = jA10;
                                                    arrayList41 = arrayList41;
                                                    arrayList40 = arrayList40;
                                                    j11 = j11;
                                                    arrayList26 = arrayList26;
                                                    arrayList2 = arrayList2;
                                                }
                                            }
                                            arrayList7 = arrayList35;
                                            xmlPullParser2 = xmlPullParser2;
                                            str31 = str31;
                                            if (sp3.b(xmlPullParser2, "AdaptationSet")) {
                                                arrayList21 = new ArrayList(arrayList38.size());
                                                i36 = 0;
                                                while (i36 < arrayList38.size()) {
                                                    arrayList22 = arrayList38;
                                                    d30 d30Var6 = (d30) arrayList22.get(i36);
                                                    mx0 mx0Var7 = d30Var6.f76539a;
                                                    mx0Var7.getClass();
                                                    lx0Var2 = new lx0(mx0Var7);
                                                    if (text != null) {
                                                        lx0Var2.f79958b = text;
                                                    }
                                                    str19 = d30Var6.f76542d;
                                                    if (str19 == null) {
                                                        str19 = str32;
                                                    }
                                                    arrayList23 = d30Var6.f76543e;
                                                    ArrayList arrayList610 = arrayList32;
                                                    arrayList23.addAll(arrayList610);
                                                    if (arrayList23.isEmpty()) {
                                                        i37 = 0;
                                                        while (true) {
                                                            if (i37 < arrayList23.size()) {
                                                                jk0Var4 = (jk0) arrayList23.get(i37);
                                                                if (jr.f79151c.equals(jk0Var4.f79077c)) {
                                                                }
                                                                i37++;
                                                            } else {
                                                                str21 = null;
                                                            }
                                                        }
                                                        if (str21 != null) {
                                                            i38 = 0;
                                                            while (i38 < arrayList23.size()) {
                                                                jk0Var = (jk0) arrayList23.get(i38);
                                                                String str62 = text;
                                                                if (!jr.f79150b.equals(jk0Var.f79077c)) {
                                                                }
                                                                i38++;
                                                                text = str62;
                                                                arrayList22 = arrayList22;
                                                            }
                                                        }
                                                        str20 = text;
                                                        arrayList38 = arrayList22;
                                                        while (size >= 0) {
                                                            jk0Var2 = (jk0) arrayList23.get(size);
                                                            if (jk0Var2.f79080f != null) {
                                                                while (i39 < arrayList23.size()) {
                                                                    jk0Var3 = (jk0) arrayList23.get(i39);
                                                                    if (jk0Var3.f79080f == null) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        lx0Var2.f79970n = new kk0(str19, false, (jk0[]) arrayList23.toArray(new jk0[0]));
                                                    } else {
                                                        str20 = text;
                                                        arrayList38 = arrayList22;
                                                    }
                                                    arrayList24 = d30Var6.f76544f;
                                                    arrayList24.addAll(arrayList33);
                                                    j14 = d30Var6.f76545g;
                                                    mx0Var = new mx0(lx0Var2);
                                                    p51Var = d30Var6.f76540b;
                                                    hx2Var = d30Var6.f76541c;
                                                    if (hx2Var instanceof gx2) {
                                                        jo2Var = new ko2(j14, mx0Var, p51Var, (gx2) hx2Var, arrayList24);
                                                    } else if (hx2Var instanceof cx2) {
                                                        jo2Var = new jo2(j14, mx0Var, p51Var, (cx2) hx2Var, arrayList24);
                                                    } else {
                                                        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                    }
                                                    arrayList21.add(jo2Var);
                                                    i36++;
                                                    arrayList32 = arrayList610;
                                                    text = str20;
                                                }
                                                ArrayList arrayList611 = arrayList28;
                                                arrayList611.add(new zb(i41, iD, arrayList21, arrayList41, arrayList40, arrayList37));
                                                arrayList4 = arrayList611;
                                                z12 = false;
                                                arrayList5 = arrayList29;
                                                str = str27;
                                            } else {
                                                arrayList33 = arrayList33;
                                                str31 = str31;
                                                xmlPullParser2 = xmlPullParser2;
                                                str33 = str33;
                                                str30 = str30;
                                                arrayList39 = arrayList39;
                                                arrayList35 = arrayList7;
                                                z11 = z11;
                                                arrayList31 = arrayList6;
                                                text = text;
                                                str29 = str29;
                                                arrayListA = arrayListA;
                                                arrayList = arrayList;
                                                str25 = str25;
                                                arrayList37 = arrayList37;
                                                str24 = str24;
                                                j10 = j10;
                                                str27 = str27;
                                                arrayList38 = arrayList38;
                                                arrayList32 = arrayList32;
                                                str28 = str28;
                                                jA10 = jA10;
                                                arrayList41 = arrayList41;
                                                arrayList40 = arrayList40;
                                                j11 = j11;
                                                arrayList26 = arrayList26;
                                                arrayList2 = arrayList2;
                                            }
                                        }
                                    } else {
                                        String str63 = str27;
                                        str24 = str24;
                                        j10 = jA7;
                                        arrayList2 = arrayList25;
                                        arrayList26 = arrayList26;
                                        jA10 = jA10;
                                        str25 = str25;
                                        arrayList3 = arrayList30;
                                        arrayList4 = arrayList28;
                                        j11 = j11;
                                        arrayList = arrayList;
                                        arrayListA = arrayListA;
                                        z11 = z11;
                                        xmlPullParser2 = xmlPullParser2;
                                        int i60 = 0;
                                        if (sp3.c(xmlPullParser2, "EventStream")) {
                                            String attributeValue32 = xmlPullParser2.getAttributeValue(null, "schemeIdUri");
                                            if (attributeValue32 == null) {
                                                attributeValue32 = "";
                                            }
                                            String attributeValue33 = xmlPullParser2.getAttributeValue(null, "value");
                                            if (attributeValue33 == null) {
                                                attributeValue33 = "";
                                            }
                                            String attributeValue34 = xmlPullParser2.getAttributeValue(null, "timescale");
                                            long j29 = attributeValue34 != null ? Long.parseLong(attributeValue34) : 1L;
                                            ArrayList arrayList70 = new ArrayList();
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                                            while (true) {
                                                xmlPullParser.next();
                                                if (sp3.c(xmlPullParser2, "Event")) {
                                                    str2 = str63;
                                                    String attributeValue35 = xmlPullParser2.getAttributeValue(null, str2);
                                                    long j30 = attributeValue35 == null ? 0L : Long.parseLong(attributeValue35);
                                                    String attributeValue36 = xmlPullParser2.getAttributeValue(null, "duration");
                                                    long j31 = attributeValue36 == null ? -9223372036854775807L : Long.parseLong(attributeValue36);
                                                    String attributeValue37 = xmlPullParser2.getAttributeValue(null, "presentationTime");
                                                    long j32 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                    long j33 = j29;
                                                    long jA15 = ib3.a(j31, 1000L, j33);
                                                    long jA16 = ib3.a(j32, 1000000L, j33);
                                                    String attributeValue38 = xmlPullParser2.getAttributeValue(null, "messageData");
                                                    if (attributeValue38 == null) {
                                                        attributeValue38 = null;
                                                    }
                                                    byteArrayOutputStream.reset();
                                                    XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                                                    xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, bu.f75964c.name());
                                                    xmlPullParser.nextToken();
                                                    while (!sp3.b(xmlPullParser2, "Event")) {
                                                        switch (xmlPullParser.getEventType()) {
                                                            case 0:
                                                                j13 = j29;
                                                                xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                                                                break;
                                                            case 1:
                                                                j13 = j29;
                                                                xmlSerializerNewSerializer.endDocument();
                                                                break;
                                                            case 2:
                                                                xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                int i61 = i60;
                                                                while (i61 < xmlPullParser.getAttributeCount()) {
                                                                    xmlSerializerNewSerializer.attribute(xmlPullParser2.getAttributeNamespace(i61), xmlPullParser2.getAttributeName(i61), xmlPullParser2.getAttributeValue(i61));
                                                                    i61++;
                                                                    j29 = j29;
                                                                }
                                                                j13 = j29;
                                                                break;
                                                            case 3:
                                                                xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                j13 = j29;
                                                                break;
                                                            case 4:
                                                                xmlSerializerNewSerializer.text(xmlPullParser.getText());
                                                                j13 = j29;
                                                                break;
                                                            case 5:
                                                                xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                                                                j13 = j29;
                                                                break;
                                                            case 6:
                                                                xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                                                                j13 = j29;
                                                                break;
                                                            case 7:
                                                                xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                j13 = j29;
                                                                break;
                                                            case 8:
                                                                xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                                                                j13 = j29;
                                                                break;
                                                            case 9:
                                                                xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                                                                j13 = j29;
                                                                break;
                                                            case 10:
                                                                xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                                                                j13 = j29;
                                                                break;
                                                            default:
                                                                j13 = j29;
                                                                break;
                                                        }
                                                        xmlPullParser.nextToken();
                                                        j29 = j13;
                                                        i60 = 0;
                                                    }
                                                    j12 = j29;
                                                    xmlSerializerNewSerializer.flush();
                                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                    Long lValueOf = Long.valueOf(jA16);
                                                    if (attributeValue38 != null) {
                                                        byteArray = ib3.c(attributeValue38);
                                                    }
                                                    arrayList70.add(Pair.create(lValueOf, new wm0(attributeValue32, attributeValue33, jA15, j30, byteArray)));
                                                } else {
                                                    j12 = j29;
                                                    str2 = str63;
                                                    a(xmlPullParser);
                                                }
                                                if (sp3.b(xmlPullParser2, "EventStream")) {
                                                    long[] jArr = new long[arrayList70.size()];
                                                    wm0[] wm0VarArr = new wm0[arrayList70.size()];
                                                    for (int i62 = 0; i62 < arrayList70.size(); i62++) {
                                                        Pair pair = (Pair) arrayList70.get(i62);
                                                        jArr[i62] = ((Long) pair.first).longValue();
                                                        wm0VarArr[i62] = (wm0) pair.second;
                                                    }
                                                    ArrayList arrayList71 = arrayList29;
                                                    arrayList71.add(new an0(attributeValue32, attributeValue33, jArr, wm0VarArr));
                                                    arrayList4 = arrayList4;
                                                    arrayList5 = arrayList71;
                                                    str = str2;
                                                    z12 = false;
                                                } else {
                                                    str63 = str2;
                                                    j29 = j12;
                                                    i60 = 0;
                                                }
                                            }
                                        } else {
                                            arrayList5 = arrayList29;
                                            str = str63;
                                            if (sp3.c(xmlPullParser2, "SegmentBase")) {
                                                hx2VarA = a(xmlPullParser2, (gx2) null);
                                                z12 = false;
                                            } else if (sp3.c(xmlPullParser2, "SegmentList")) {
                                                long jA17 = a(xmlPullParser2, -9223372036854775807L);
                                                z12 = false;
                                                hx2VarA = a(xmlPullParser, null, j24, jA9, jA10, jA17, jA5);
                                                j25 = jA17;
                                            } else {
                                                arrayList4 = arrayList4;
                                                arrayList5 = arrayList5;
                                                z12 = false;
                                                if (sp3.c(xmlPullParser2, "SegmentTemplate")) {
                                                    long jA18 = a(xmlPullParser2, -9223372036854775807L);
                                                    m51 m51Var = p51.f81258c;
                                                    j15 = -9223372036854775807L;
                                                    str = str;
                                                    hx2VarA = a(xmlPullParser, null, sm2.f82697f, j24, jA9, jA10, jA18, jA5);
                                                    j25 = jA18;
                                                } else {
                                                    str = str;
                                                    j15 = -9223372036854775807L;
                                                    if (sp3.c(xmlPullParser2, "AssetIdentifier")) {
                                                        a(xmlPullParser2, "AssetIdentifier");
                                                    } else {
                                                        a(xmlPullParser);
                                                    }
                                                }
                                                jA10 = jA10;
                                            }
                                            j15 = -9223372036854775807L;
                                        }
                                    }
                                    j15 = -9223372036854775807L;
                                    jA10 = jA10;
                                }
                                if (sp3.b(xmlPullParser2, "Period")) {
                                    Pair pairCreate = Pair.create(new fc2(attributeValue11, jA8, arrayList4, arrayList5), Long.valueOf(jA9));
                                    fc2 fc2Var = (fc2) pairCreate.first;
                                    if (fc2Var.f77350b != j15) {
                                        long jLongValue = ((Long) pairCreate.second).longValue();
                                        long j34 = jLongValue == j15 ? j15 : fc2Var.f77350b + jLongValue;
                                        arrayList25 = arrayList2;
                                        arrayList25.add(fc2Var);
                                        j17 = j34;
                                    } else {
                                        if (!zEquals) {
                                            throw new ob2("Unable to determine start of period " + arrayList2.size(), null, true, 4);
                                        }
                                        arrayList25 = arrayList2;
                                        j17 = j11;
                                        jA7 = j10;
                                        z14 = true;
                                    }
                                } else {
                                    arrayList28 = arrayList4;
                                    xmlPullParser2 = xmlPullParser2;
                                    arrayList29 = arrayList5;
                                    str27 = str;
                                    z11 = z11;
                                    arrayList30 = arrayList3;
                                    arrayListA = arrayListA;
                                    arrayList26 = arrayList26;
                                    arrayList27 = arrayList;
                                    str25 = str25;
                                    arrayList25 = arrayList2;
                                    str24 = str24;
                                    j17 = j11;
                                    jA7 = j10;
                                }
                            }
                        } else {
                            j10 = jA7;
                            arrayList25 = arrayList25;
                            arrayList26 = arrayList26;
                            j15 = j15;
                            z11 = z11;
                            arrayListA = arrayListA;
                            xmlPullParser2 = xmlPullParser2;
                            z12 = false;
                            a(xmlPullParser);
                            j17 = j17;
                        }
                        jA7 = j10;
                    }
                    if (sp3.b(xmlPullParser2, "MPD")) {
                        if (jA2 == j15) {
                            if (j17 != j15) {
                                jA2 = j17;
                            } else if (!zEquals) {
                                throw new ob2("Unable to determine duration of static manifest.", null, true, 4);
                            }
                        }
                        if (!arrayList25.isEmpty()) {
                            return new c30(jF, jA2, jA3, zEquals, jA4, jA5, jA6, jF2, dj2Var, hb3Var, zx2Var, uri2, arrayList25);
                        }
                        throw new ob2("No periods found.", null, true, 4);
                    }
                    arrayList25 = arrayList25;
                    xmlPullParser2 = xmlPullParser2;
                    j15 = j15;
                    z11 = z11;
                    arrayListA = arrayListA;
                    arrayList26 = arrayList26;
                    z10 = true;
                    str23 = null;
                }
                xmlPullParser2 = xmlPullParser2;
                z12 = false;
                if (sp3.b(xmlPullParser2, "MPD")) {
                    if (jA2 == j15) {
                        if (j17 != j15) {
                            jA2 = j17;
                        } else if (!zEquals) {
                            throw new ob2("Unable to determine duration of static manifest.", null, true, 4);
                        }
                    }
                    if (!arrayList25.isEmpty()) {
                        return new c30(jF, jA2, jA3, zEquals, jA4, jA5, jA6, jF2, dj2Var, hb3Var, zx2Var, uri2, arrayList25);
                    }
                    throw new ob2("No periods found.", null, true, 4);
                }
                arrayList25 = arrayList25;
                xmlPullParser2 = xmlPullParser2;
                j15 = j15;
                z11 = z11;
                arrayListA = arrayListA;
                arrayList26 = arrayList26;
                z10 = true;
                str23 = null;
            }
            xmlPullParser2 = xmlPullParser2;
            z12 = false;
            if (sp3.b(xmlPullParser2, "MPD")) {
                if (jA2 == j15) {
                    if (j17 != j15) {
                        jA2 = j17;
                    } else if (!zEquals) {
                        throw new ob2("Unable to determine duration of static manifest.", null, true, 4);
                    }
                }
                if (!arrayList25.isEmpty()) {
                    return new c30(jF, jA2, jA3, zEquals, jA4, jA5, jA6, jF2, dj2Var, hb3Var, zx2Var, uri2, arrayList25);
                }
                throw new ob2("No periods found.", null, true, 4);
            }
            arrayList25 = arrayList25;
            xmlPullParser2 = xmlPullParser2;
            j15 = j15;
            z11 = z11;
            arrayListA = arrayListA;
            arrayList26 = arrayList26;
            z10 = true;
            str23 = null;
        }
    }

    public static ArrayList a(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        boolean z10 = false;
        int i10 = 0;
        long j12 = -9223372036854775807L;
        do {
            xmlPullParser.next();
            if (sp3.c(xmlPullParser, ExifInterface.LATITUDE_SOUTH)) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j13 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z10) {
                    jA = a(arrayList, jA, j12, i10, j13);
                }
                if (j13 == -9223372036854775807L) {
                    j13 = jA;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                long j14 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i10 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                long j15 = j14;
                z10 = true;
                j12 = j15;
                jA = j13;
            } else {
                a(xmlPullParser);
            }
        } while (!sp3.b(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            a(arrayList, jA, j12, i10, ib3.a(j11, j10, 1000L));
        }
        return arrayList;
    }
}
