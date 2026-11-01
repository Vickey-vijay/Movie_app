package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.upstream.g;
import com.ironsource.C3426d4;
import g5.k0;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import w3.j;
import w3.m;

/* JADX INFO: loaded from: classes7.dex */
public class SsManifestParser implements g.a<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f19745a;

    public static class MissingFieldException extends ParserException {
        public MissingFieldException(String str) {
            super("Missing required field: " + str);
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f19747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final a f19748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<Pair<String, Object>> f19749d = new LinkedList();

        public void a(Object obj) {
        }

        public abstract Object b();

        @Nullable
        public final Object c(String str) {
            for (int i10 = 0; i10 < this.f19749d.size(); i10++) {
                Pair<String, Object> pair = this.f19749d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f19748c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        public boolean d(String str) {
            return false;
        }

        public final Object f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f19747b.equals(name)) {
                        n(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a aVarE = e(this, name, this.f19746a);
                            if (aVarE == null) {
                                i10 = 1;
                            } else {
                                a(aVarE.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        public final boolean g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z10;
        }

        public void h(XmlPullParser xmlPullParser) {
        }

        public final int i(XmlPullParser xmlPullParser, String str, int i10) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i10;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw new ParserException(e10);
            }
        }

        public final long j(XmlPullParser xmlPullParser, String str, long j10) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j10;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw new ParserException(e10);
            }
        }

        public final int k(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw new ParserException(e10);
            }
        }

        public final long l(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw new ParserException(e10);
            }
        }

        public final String m(XmlPullParser xmlPullParser, String str) throws MissingFieldException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new MissingFieldException(str);
        }

        public abstract void n(XmlPullParser xmlPullParser) throws ParserException;

        public void o(XmlPullParser xmlPullParser) {
        }

        public final a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new c(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new b(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new e(aVar, str2);
            }
            return null;
        }

        public final void p(String str, @Nullable Object obj) {
            this.f19749d.add(Pair.create(str, obj));
        }

        public a(@Nullable a aVar, String str, String str2) {
            this.f19748c = aVar;
            this.f19746a = str;
            this.f19747b = str2;
        }
    }

    public static class b extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f19750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public UUID f19751f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f19752g;

        public static m[] q(byte[] bArr) {
            return new m[]{new m(true, null, 8, r(bArr), 0, 0, null)};
        }

        public static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        public b(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        public static byte[] r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String string = sb2.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            t(bArrDecode, 0, 3);
            t(bArrDecode, 1, 2);
            t(bArrDecode, 4, 5);
            t(bArrDecode, 6, 7);
            return bArrDecode;
        }

        public static void t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            UUID uuid = this.f19751f;
            return new com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0185a(uuid, j.a(uuid, this.f19752g), q(this.f19752g));
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f19750e) {
                this.f19752g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f19750e = false;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f19750e = true;
                this.f19751f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }
    }

    public static class c extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Format f19753e;

        public c(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        public static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrC = k0.C(str);
                byte[][] bArrM = g5.d.m(bArrC);
                if (bArrM == null) {
                    arrayList.add(bArrC);
                } else {
                    Collections.addAll(arrayList, bArrM);
                }
            }
            return arrayList;
        }

        public static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            return this.f19753e;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            int i10;
            int i11;
            int iIntValue = ((Integer) c("Type")).intValue();
            String attributeValue = xmlPullParser.getAttributeValue(null, "Index");
            String str = (String) c("Name");
            int iK = k(xmlPullParser, "Bitrate");
            String strR = r(m(xmlPullParser, "FourCC"));
            if (iIntValue == 2) {
                this.f19753e = Format.A(attributeValue, str, "video/mp4", strR, null, null, iK, k(xmlPullParser, "MaxWidth"), k(xmlPullParser, "MaxHeight"), -1.0f, q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")), 0, 0);
                return;
            }
            if (iIntValue == 1) {
                if (strR == null) {
                    strR = "audio/mp4a-latm";
                }
                int iK2 = k(xmlPullParser, "Channels");
                int iK3 = k(xmlPullParser, "SamplingRate");
                List<byte[]> listQ = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (listQ.isEmpty() && "audio/mp4a-latm".equals(strR)) {
                    listQ = Collections.singletonList(g5.d.b(iK3, iK2));
                }
                this.f19753e = Format.m(attributeValue, str, "audio/mp4", strR, null, null, iK, iK2, iK3, listQ, 0, 0, (String) c("Language"));
                return;
            }
            if (iIntValue != 3) {
                this.f19753e = Format.q(attributeValue, str, "application/mp4", strR, null, iK, 0, 0, null);
                return;
            }
            String str2 = (String) c("Subtype");
            str2.hashCode();
            if (!str2.equals("CAPT")) {
                if (str2.equals("DESC")) {
                    i10 = 1024;
                } else {
                    i11 = 0;
                }
                this.f19753e = Format.u(attributeValue, str, "application/mp4", strR, null, iK, 0, i11, (String) c("Language"));
            }
            i10 = 64;
            i11 = i10;
            this.f19753e = Format.u(attributeValue, str, "application/mp4", strR, null, iK, 0, i11, (String) c("Language"));
        }
    }

    public static class d extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b> f19754e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19755f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19756g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f19757h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f19758i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f19759j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f19760k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f19761l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0185a f19762m;

        public d(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f19760k = -1;
            this.f19762m = null;
            this.f19754e = new LinkedList();
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object obj) {
            if (obj instanceof com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b) {
                this.f19754e.add((com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b) obj);
            } else if (obj instanceof com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0185a) {
                g5.a.f(this.f19762m == null);
                this.f19762m = (com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0185a) obj;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            int size = this.f19754e.size();
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[] bVarArr = new com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[size];
            this.f19754e.toArray(bVarArr);
            if (this.f19762m != null) {
                com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0185a c0185a = this.f19762m;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(c0185a.f19785a, "video/mp4", c0185a.f19786b));
                for (int i10 = 0; i10 < size; i10++) {
                    com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = bVarArr[i10];
                    int i11 = bVar.f19788a;
                    if (i11 == 2 || i11 == 1) {
                        Format[] formatArr = bVar.f19797j;
                        for (int i12 = 0; i12 < formatArr.length; i12++) {
                            formatArr[i12] = formatArr[i12].d(drmInitData);
                        }
                    }
                }
            }
            return new com.google.android.exoplayer2.source.smoothstreaming.manifest.a(this.f19755f, this.f19756g, this.f19757h, this.f19758i, this.f19759j, this.f19760k, this.f19761l, this.f19762m, bVarArr);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            this.f19755f = k(xmlPullParser, "MajorVersion");
            this.f19756g = k(xmlPullParser, "MinorVersion");
            this.f19757h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f19758i = l(xmlPullParser, VastTagName.DURATION);
            this.f19759j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f19760k = i(xmlPullParser, "LookaheadCount", -1);
            this.f19761l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f19757h));
        }
    }

    public static class e extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f19763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<Format> f19764f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19765g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f19766h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f19767i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f19768j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f19769k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f19770l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f19771m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f19772n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f19773o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f19774p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public ArrayList<Long> f19775q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f19776r;

        public final int s(XmlPullParser xmlPullParser) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new MissingFieldException("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw new ParserException("Invalid key value[" + attributeValue + C3426d4.j.f28588e);
        }

        public e(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f19763e = str;
            this.f19764f = new LinkedList();
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object obj) {
            if (obj instanceof Format) {
                this.f19764f.add((Format) obj);
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            Format[] formatArr = new Format[this.f19764f.size()];
            this.f19764f.toArray(formatArr);
            return new com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b(this.f19763e, this.f19769k, this.f19765g, this.f19766h, this.f19767i, this.f19768j, this.f19770l, this.f19771m, this.f19772n, this.f19773o, this.f19774p, formatArr, this.f19775q, this.f19776r);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        public final void r(XmlPullParser xmlPullParser) throws ParserException {
            int size = this.f19775q.size();
            long j10 = j(xmlPullParser, "t", -9223372036854775807L);
            int i10 = 1;
            if (j10 == -9223372036854775807L) {
                if (size == 0) {
                    j10 = 0;
                } else {
                    if (this.f19776r == -1) {
                        throw new ParserException("Unable to infer start time");
                    }
                    j10 = this.f19776r + this.f19775q.get(size - 1).longValue();
                }
            }
            this.f19775q.add(Long.valueOf(j10));
            this.f19776r = j(xmlPullParser, "d", -9223372036854775807L);
            long j11 = j(xmlPullParser, "r", 1L);
            if (j11 > 1 && this.f19776r == -9223372036854775807L) {
                throw new ParserException("Repeated chunk with unspecified duration");
            }
            while (true) {
                long j12 = i10;
                if (j12 >= j11) {
                    return;
                }
                this.f19775q.add(Long.valueOf((this.f19776r * j12) + j10));
                i10++;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }

        public final void q(XmlPullParser xmlPullParser) throws ParserException {
            int iS = s(xmlPullParser);
            this.f19765g = iS;
            p("Type", Integer.valueOf(iS));
            if (this.f19765g == 3) {
                this.f19766h = m(xmlPullParser, "Subtype");
            } else {
                this.f19766h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            p("Subtype", this.f19766h);
            this.f19768j = xmlPullParser.getAttributeValue(null, "Name");
            this.f19769k = m(xmlPullParser, "Url");
            this.f19770l = i(xmlPullParser, "MaxWidth", -1);
            this.f19771m = i(xmlPullParser, "MaxHeight", -1);
            this.f19772n = i(xmlPullParser, "DisplayWidth", -1);
            this.f19773o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Language");
            this.f19774p = attributeValue;
            p("Language", attributeValue);
            long jI = i(xmlPullParser, "TimeScale", -1);
            this.f19767i = jI;
            if (jI == -1) {
                this.f19767i = ((Long) c("TimeScale")).longValue();
            }
            this.f19775q = new ArrayList<>();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.g.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.google.android.exoplayer2.source.smoothstreaming.manifest.a parse(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f19745a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (com.google.android.exoplayer2.source.smoothstreaming.manifest.a) new d(null, uri.toString()).f(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e10) {
            throw new ParserException(e10);
        }
    }

    public SsManifestParser() {
        try {
            this.f19745a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }
}
