package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.exoplayer2.upstream.g;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import g5.i0;
import g5.k0;
import g5.p;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k3.k;
import org.eclipse.jetty.util.security.Constraint;
import w3.j;

/* JADX INFO: compiled from: HlsPlaylistParser.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements g.a<q4.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f19687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f19662b = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f19663c = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f19664d = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f19665e = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f19666f = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f19667g = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f19668h = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f19669i = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f19670j = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f19671k = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f19672l = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f19673m = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f19674n = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f19675o = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f19676p = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f19677q = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f19678r = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f19679s = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f19680t = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f19681u = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f19682v = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f19683w = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f19684x = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f19685y = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f19686z = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern A = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern B = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern C = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern D = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern E = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern F = b("AUTOSELECT");
    public static final Pattern G = b("DEFAULT");
    public static final Pattern H = b("FORCED");
    public static final Pattern I = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern J = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern K = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: compiled from: HlsPlaylistParser.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BufferedReader f19688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Queue<String> f19689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f19690c;

        public boolean a() throws IOException {
            String strTrim;
            if (this.f19690c != null) {
                return true;
            }
            if (!this.f19689b.isEmpty()) {
                this.f19690c = (String) g5.a.e(this.f19689b.poll());
                return true;
            }
            do {
                String line = this.f19688a.readLine();
                this.f19690c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f19690c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f19689b = queue;
            this.f19688a = bufferedReader;
        }

        public String b() throws IOException {
            if (a()) {
                String str = this.f19690c;
                this.f19690c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public d() {
        this(b.f19616n);
    }

    @Nullable
    public static b.C0183b c(ArrayList<b.C0183b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b.C0183b c0183b = arrayList.get(i10);
            if (str.equals(c0183b.f19634d)) {
                return c0183b;
            }
        }
        return null;
    }

    @Nullable
    public static b.C0183b d(ArrayList<b.C0183b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b.C0183b c0183b = arrayList.get(i10);
            if (str.equals(c0183b.f19635e)) {
                return c0183b;
            }
        }
        return null;
    }

    @Nullable
    public static b.C0183b e(ArrayList<b.C0183b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b.C0183b c0183b = arrayList.get(i10);
            if (str.equals(c0183b.f19633c)) {
                return c0183b;
            }
        }
        return null;
    }

    @Nullable
    public static String q(String str, Pattern pattern, Map<String, String> map) {
        return p(str, pattern, null, map);
    }

    public static int v(BufferedReader bufferedReader, boolean z10, int i10) throws IOException {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !k0.g0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    public d(b bVar) {
        this.f19687a = bVar;
    }

    public static Pattern b(String str) {
        return Pattern.compile(str + "=(NO" + ImpressionLog.Q + "YES)");
    }

    @Nullable
    public static DrmInitData.SchemeData h(String str, String str2, Map<String, String> map) throws ParserException {
        String strP = p(str, f19683w, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strT = t(str, f19684x, map);
            return new DrmInitData.SchemeData(k.f62192d, "video/mp4", Base64.decode(strT.substring(strT.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(k.f62192d, "hls", k0.c0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strP)) {
            return null;
        }
        String strT2 = t(str, f19684x, map);
        byte[] bArrDecode = Base64.decode(strT2.substring(strT2.indexOf(44)), 0);
        UUID uuid = k.f62193e;
        return new DrmInitData.SchemeData(uuid, "video/mp4", j.a(uuid, bArrDecode));
    }

    public static String i(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:68:0x02a4  */
    public static b l(a aVar, String str) throws IOException {
        String strE;
        String str2;
        int i10;
        String str3;
        String str4;
        int i11;
        float f10;
        String str5;
        int i12;
        int i13;
        ArrayList arrayList;
        boolean z10;
        int i14;
        int i15;
        String str6 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            if (!aVar.a()) {
                ArrayList arrayList10 = arrayList6;
                ArrayList arrayList11 = arrayList9;
                ArrayList arrayList12 = arrayList8;
                boolean z13 = z11;
                ArrayList arrayList13 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i16 = 0;
                while (i16 < arrayList2.size()) {
                    b.C0183b c0183b = (b.C0183b) arrayList2.get(i16);
                    if (hashSet.add(c0183b.f19631a)) {
                        g5.a.f(c0183b.f19632b.f18968h == null);
                        arrayList13.add(c0183b.a(c0183b.f19632b.k(new Metadata(new HlsTrackMetadataEntry(null, null, (List) g5.a.e((ArrayList) map.get(c0183b.f19631a)))))));
                    }
                    i16++;
                    hashSet = hashSet;
                    map = map;
                }
                List listEmptyList = null;
                Format format = null;
                int i17 = 0;
                while (i17 < arrayList7.size()) {
                    String str7 = (String) arrayList7.get(i17);
                    String strT = t(str7, C, map2);
                    String strT2 = t(str7, B, map2);
                    String strQ = q(str7, f19684x, map2);
                    Uri uriD = strQ == null ? null : i0.d(str6, strQ);
                    String strQ2 = q(str7, A, map2);
                    int iS = s(str7);
                    int iR = r(str7, map2);
                    ArrayList arrayList14 = arrayList7;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strT);
                    Format format2 = format;
                    sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    sb2.append(strT2);
                    String string = sb2.toString();
                    ArrayList arrayList15 = arrayList13;
                    boolean z14 = z12;
                    Metadata metadata = new Metadata(new HlsTrackMetadataEntry(strT, strT2, Collections.emptyList()));
                    String strT3 = t(str7, f19686z, map2);
                    strT3.hashCode();
                    switch (strT3) {
                        case "SUBTITLES":
                            b.C0183b c0183bD = d(arrayList2, strT);
                            if (c0183bD != null) {
                                String strD = k0.D(c0183bD.f19632b.f18967g, 3);
                                strE = p.e(strD);
                                str2 = strD;
                            } else {
                                strE = null;
                                str2 = null;
                            }
                            arrayList5.add(new b.a(uriD, Format.u(string, strT2, "application/x-mpegURL", strE == null ? "text/vtt" : strE, str2, -1, iS, iR, strQ2).k(metadata), strT, strT2));
                            format = format2;
                            break;
                        case "CLOSED-CAPTIONS":
                            String strT4 = t(str7, E, map2);
                            if (strT4.startsWith("CC")) {
                                i10 = Integer.parseInt(strT4.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                i10 = Integer.parseInt(strT4.substring(7));
                                str3 = "application/cea-708";
                            }
                            int i18 = i10;
                            String str8 = str3;
                            if (listEmptyList == null) {
                                listEmptyList = new ArrayList();
                            }
                            listEmptyList.add(Format.v(string, strT2, null, str8, null, -1, iS, iR, strQ2, i18));
                            format = format2;
                            break;
                        case "AUDIO":
                            b.C0183b c0183bC = c(arrayList2, strT);
                            String strD2 = c0183bC != null ? k0.D(c0183bC.f19632b.f18967g, 1) : null;
                            String strE2 = strD2 != null ? p.e(strD2) : null;
                            String strQ3 = q(str7, f19668h, map2);
                            if (strQ3 != null) {
                                int i19 = Integer.parseInt(k0.E0(strQ3, "/")[0]);
                                if ("audio/eac3".equals(strE2) && strQ3.endsWith("/JOC")) {
                                    strE2 = "audio/eac3-joc";
                                }
                                str4 = strE2;
                                i11 = i19;
                            } else {
                                str4 = strE2;
                                i11 = -1;
                            }
                            Format formatM = Format.m(string, strT2, "application/x-mpegURL", str4, strD2, null, -1, i11, -1, null, iS, iR, strQ2);
                            if (uriD != null) {
                                arrayList4.add(new b.a(uriD, formatM.k(metadata), strT, strT2));
                                format = format2;
                                break;
                            } else {
                                format = formatM;
                                break;
                            }
                            break;
                        case "VIDEO":
                            b.C0183b c0183bE = e(arrayList2, strT);
                            if (c0183bE != null) {
                                Format format3 = c0183bE.f19632b;
                                String strD3 = k0.D(format3.f18967g, 2);
                                int i20 = format3.f18975o;
                                int i21 = format3.f18976p;
                                f10 = format3.f18977q;
                                str5 = strD3;
                                i12 = i20;
                                i13 = i21;
                            } else {
                                f10 = -1.0f;
                                str5 = null;
                                i12 = -1;
                                i13 = -1;
                            }
                            Format formatK = Format.A(string, strT2, "application/x-mpegURL", str5 != null ? p.e(str5) : null, str5, null, -1, i12, i13, f10, null, iS, iR).k(metadata);
                            if (uriD != null) {
                                arrayList3.add(new b.a(uriD, formatK, strT, strT2));
                                break;
                            }
                        default:
                            format = format2;
                            break;
                    }
                    i17++;
                    str6 = str;
                    arrayList7 = arrayList14;
                    arrayList13 = arrayList15;
                    z12 = z14;
                }
                ArrayList arrayList16 = arrayList13;
                Format format4 = format;
                if (z12) {
                    listEmptyList = Collections.emptyList();
                }
                return new b(str, arrayList11, arrayList16, arrayList3, arrayList4, arrayList5, arrayList10, format4, listEmptyList, z13, map2, arrayList12);
            }
            String strB = aVar.b();
            if (strB.startsWith("#EXT")) {
                arrayList9.add(strB);
            }
            if (strB.startsWith("#EXT-X-DEFINE")) {
                map2.put(t(strB, B, map2), t(strB, I, map2));
            } else if (strB.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                z11 = true;
            } else {
                if (strB.startsWith("#EXT-X-MEDIA")) {
                    arrayList7.add(strB);
                } else if (strB.startsWith("#EXT-X-SESSION-KEY")) {
                    DrmInitData.SchemeData schemeDataH = h(strB, p(strB, f19682v, "identity", map2), map2);
                    if (schemeDataH != null) {
                        arrayList = arrayList6;
                        z10 = z11;
                        arrayList8.add(new DrmInitData(i(t(strB, f19681u, map2)), schemeDataH));
                    } else {
                        arrayList = arrayList6;
                        z10 = z11;
                    }
                } else {
                    arrayList = arrayList6;
                    z10 = z11;
                    if (strB.startsWith("#EXT-X-STREAM-INF")) {
                        boolean zContains = z12 | strB.contains("CLOSED-CAPTIONS=NONE");
                        int iJ = j(strB, f19667g);
                        o(strB, f19662b, -1);
                        String strQ4 = q(strB, f19669i, map2);
                        String strQ5 = q(strB, f19670j, map2);
                        if (strQ5 != null) {
                            String[] strArrSplit = strQ5.split(VastAttributes.HORIZONTAL_POSITION);
                            int i22 = Integer.parseInt(strArrSplit[0]);
                            int i23 = Integer.parseInt(strArrSplit[1]);
                            if (i22 <= 0 || i23 <= 0) {
                                i23 = -1;
                                i22 = -1;
                            }
                            i15 = i23;
                            i14 = i22;
                        } else {
                            i14 = -1;
                            i15 = -1;
                        }
                        String strQ6 = q(strB, f19671k, map2);
                        float f11 = strQ6 != null ? Float.parseFloat(strQ6) : -1.0f;
                        String strQ7 = q(strB, f19663c, map2);
                        String strQ8 = q(strB, f19664d, map2);
                        String strQ9 = q(strB, f19665e, map2);
                        String strQ10 = q(strB, f19666f, map2);
                        if (!aVar.a()) {
                            throw new ParserException("#EXT-X-STREAM-INF tag must be followed by another line");
                        }
                        Uri uriD2 = i0.d(str6, u(aVar.b(), map2));
                        arrayList2.add(new b.C0183b(uriD2, Format.A(Integer.toString(arrayList2.size()), null, "application/x-mpegURL", null, strQ4, null, iJ, i14, i15, f11, null, 0, 0), strQ7, strQ8, strQ9, strQ10));
                        ArrayList arrayList17 = (ArrayList) map.get(uriD2);
                        if (arrayList17 == null) {
                            arrayList17 = new ArrayList();
                            map.put(uriD2, arrayList17);
                        }
                        arrayList17.add(new HlsTrackMetadataEntry.VariantInfo(iJ, strQ7, strQ8, strQ9, strQ10));
                        z12 = zContains;
                    }
                }
                z11 = z10;
                arrayList6 = arrayList;
                arrayList8 = arrayList8;
                arrayList9 = arrayList9;
            }
            arrayList = arrayList6;
            z10 = z11;
            z11 = z10;
            arrayList6 = arrayList;
            arrayList8 = arrayList8;
            arrayList9 = arrayList9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01bf A[PHI: r12
  0x01bf: PHI (r12v8 java.lang.String) = (r12v6 java.lang.String), (r12v2 java.lang.String) binds: [B:71:0x01cf, B:65:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v15 */
    /* JADX WARN: Type inference failed for: r26v16 */
    /* JADX WARN: Type inference failed for: r26v17 */
    /* JADX WARN: Type inference failed for: r26v18 */
    /* JADX WARN: Type inference failed for: r26v19 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v20 */
    /* JADX WARN: Type inference failed for: r26v21 */
    /* JADX WARN: Type inference failed for: r26v22 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r45v0 */
    /* JADX WARN: Type inference failed for: r45v1 */
    /* JADX WARN: Type inference failed for: r45v10 */
    /* JADX WARN: Type inference failed for: r45v11 */
    /* JADX WARN: Type inference failed for: r45v12 */
    /* JADX WARN: Type inference failed for: r45v13 */
    /* JADX WARN: Type inference failed for: r45v14 */
    /* JADX WARN: Type inference failed for: r45v15 */
    /* JADX WARN: Type inference failed for: r45v16 */
    /* JADX WARN: Type inference failed for: r45v17 */
    /* JADX WARN: Type inference failed for: r45v18 */
    /* JADX WARN: Type inference failed for: r45v19 */
    /* JADX WARN: Type inference failed for: r45v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r45v20 */
    /* JADX WARN: Type inference failed for: r45v21 */
    /* JADX WARN: Type inference failed for: r45v3 */
    /* JADX WARN: Type inference failed for: r45v4 */
    /* JADX WARN: Type inference failed for: r45v5 */
    /* JADX WARN: Type inference failed for: r45v6 */
    /* JADX WARN: Type inference failed for: r45v7 */
    /* JADX WARN: Type inference failed for: r45v8 */
    /* JADX WARN: Type inference failed for: r45v9 */
    public static c m(b bVar, a aVar, String str) throws IOException {
        String strB;
        long j10;
        long j11;
        TreeMap treeMap;
        DrmInitData drmInitData;
        b bVar2 = bVar;
        boolean z10 = bVar2.f66519c;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TreeMap treeMap2 = new TreeMap();
        String str2 = "";
        char c10 = 0;
        int i10 = 1;
        ?? r26 = z10;
        long jG = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        String strP = "";
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        ?? r45 = 0;
        int i15 = 0;
        int iJ = 1;
        String strT = null;
        String strI = null;
        long jA = 0;
        long j13 = 0;
        DrmInitData drmInitData2 = null;
        long j14 = 0;
        long jK = 0;
        DrmInitData drmInitData3 = null;
        String str3 = null;
        long j15 = -1;
        long j16 = 0;
        c.a aVar2 = null;
        while (true) {
            long j17 = 0;
            while (true) {
                if (!aVar.a()) {
                    return new c(i12, str, arrayList2, jG, jA, i11, i13, j13, iJ, j12, r26 == true ? 1 : 0, i14, jA != 0, drmInitData2, arrayList);
                }
                strB = aVar.b();
                if (strB.startsWith("#EXT")) {
                    arrayList2.add(strB);
                }
                if (strB.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String strT2 = t(strB, f19674n, map);
                    if ("VOD".equals(strT2)) {
                        i12 = i10;
                    } else if ("EVENT".equals(strT2)) {
                        i12 = 2;
                    }
                } else if (strB.startsWith("#EXT-X-START")) {
                    jG = (long) (g(strB, f19678r) * 1000000.0d);
                } else if (strB.startsWith("#EXT-X-MAP")) {
                    String strT3 = t(strB, f19684x, map);
                    String strQ = q(strB, f19680t, map);
                    if (strQ != null) {
                        String[] strArrSplit = strQ.split("@");
                        long j18 = Long.parseLong(strArrSplit[c10]);
                        if (strArrSplit.length > i10) {
                            j14 = Long.parseLong(strArrSplit[i10]);
                        }
                        j11 = j18;
                        j10 = j14;
                    } else {
                        j10 = j14;
                        j11 = j15;
                    }
                    if (strT != null && str3 == null) {
                        throw new ParserException("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                    }
                    aVar2 = new c.a(strT3, j10, j11, strT, str3);
                    c10 = 0;
                    j14 = 0;
                    j15 = -1;
                } else {
                    if (strB.startsWith("#EXT-X-TARGETDURATION")) {
                        j12 = ((long) j(strB, f19672l)) * 1000000;
                        r26 = r26;
                        r45 = r45;
                    } else if (strB.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        jK = k(strB, f19675o);
                        j13 = jK;
                        r26 = r26;
                        r45 = r45;
                    } else if (strB.startsWith("#EXT-X-VERSION")) {
                        iJ = j(strB, f19673m);
                        r26 = r26;
                        r45 = r45;
                    } else {
                        if (strB.startsWith("#EXT-X-DEFINE")) {
                            String strQ2 = q(strB, J, map);
                            if (strQ2 != null) {
                                String str4 = bVar2.f19625l.get(strQ2);
                                if (str4 != null) {
                                    map.put(strQ2, str4);
                                }
                            } else {
                                map.put(t(strB, B, map), t(strB, I, map));
                            }
                        } else if (strB.startsWith("#EXTINF")) {
                            long jG2 = (long) (g(strB, f19676p) * 1000000.0d);
                            strP = p(strB, f19677q, str2, map);
                            j17 = jG2;
                            r26 = r26;
                            r45 = r45;
                        } else if (strB.startsWith("#EXT-X-KEY")) {
                            String strT4 = t(strB, f19681u, map);
                            String strP2 = p(strB, f19682v, "identity", map);
                            if (Constraint.NONE.equals(strT4)) {
                                treeMap2.clear();
                                strT = null;
                                drmInitData3 = null;
                                str3 = null;
                                r26 = r26;
                                r45 = r45;
                            } else {
                                String strQ3 = q(strB, f19685y, map);
                                if (!"identity".equals(strP2)) {
                                    if (strI == null) {
                                        strI = i(strT4);
                                    }
                                    DrmInitData.SchemeData schemeDataH = h(strB, strP2, map);
                                    if (schemeDataH != null) {
                                        treeMap2.put(strP2, schemeDataH);
                                        str3 = strQ3;
                                        strT = null;
                                        drmInitData3 = null;
                                        r26 = r26;
                                        r45 = r45;
                                    } else {
                                        str3 = strQ3;
                                        strT = null;
                                        r26 = r26;
                                        r45 = r45;
                                    }
                                } else if ("AES-128".equals(strT4)) {
                                    strT = t(strB, f19684x, map);
                                    str3 = strQ3;
                                    r26 = r26;
                                    r45 = r45;
                                } else {
                                    str3 = strQ3;
                                    strT = null;
                                    r26 = r26;
                                    r45 = r45;
                                }
                            }
                        } else if (strB.startsWith("#EXT-X-BYTERANGE")) {
                            String[] strArrSplit2 = t(strB, f19679s, map).split("@");
                            j15 = Long.parseLong(strArrSplit2[0]);
                            r26 = r26;
                            r45 = r45;
                            if (strArrSplit2.length > i10) {
                                j14 = Long.parseLong(strArrSplit2[i10]);
                                r26 = r26;
                                r45 = r45;
                            }
                        } else if (strB.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                            i13 = Integer.parseInt(strB.substring(strB.indexOf(58) + i10));
                            i11 = i10;
                            r26 = r26;
                            r45 = r45;
                        } else if (strB.equals("#EXT-X-DISCONTINUITY")) {
                            i15++;
                            r26 = r26;
                            r45 = r45;
                        } else if (!strB.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                            if (strB.equals("#EXT-X-GAP")) {
                                r45 = i10;
                                r26 = r26;
                            } else if (strB.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                r26 = i10;
                                r45 = r45;
                            } else if (strB.equals("#EXT-X-ENDLIST")) {
                                i14 = i10;
                                r26 = r26;
                                r45 = r45;
                            } else if (!strB.startsWith("#")) {
                                break;
                            }
                        } else if (jA == 0) {
                            jA = k.a(k0.s0(strB.substring(strB.indexOf(58) + i10))) - j16;
                            r26 = r26;
                            r45 = r45;
                        }
                        bVar2 = bVar;
                        treeMap2 = treeMap2;
                        str2 = str2;
                        c10 = 0;
                        i10 = 1;
                    }
                    c10 = 0;
                }
            }
            String hexString = strT == null ? null : str3 != null ? str3 : Long.toHexString(jK);
            long j19 = jK + 1;
            long j20 = j15 == -1 ? 0L : j14;
            if (drmInitData3 != null || treeMap2.isEmpty()) {
                treeMap = treeMap2;
                drmInitData = drmInitData3;
            } else {
                treeMap = treeMap2;
                DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap2.values().toArray(new DrmInitData.SchemeData[0]);
                drmInitData = new DrmInitData(strI, schemeDataArr);
                if (drmInitData2 == null) {
                    DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
                    for (int i16 = 0; i16 < schemeDataArr.length; i16++) {
                        schemeDataArr2[i16] = schemeDataArr[i16].c(null);
                    }
                    drmInitData2 = new DrmInitData(strI, schemeDataArr2);
                }
            }
            arrayList.add(new c.a(u(strB, map), aVar2, strP, j17, i15, j16, drmInitData, strT, hexString, j20, j15, r45));
            j16 += j17;
            if (j15 != -1) {
                j20 += j15;
            }
            j14 = j20;
            bVar2 = bVar;
            drmInitData3 = drmInitData;
            j15 = -1;
            treeMap2 = treeMap;
            str2 = str2;
            strP = str2;
            jK = j19;
            c10 = 0;
            i10 = 1;
            r45 = 0;
            r26 = r26;
        }
    }

    public static int r(String str, Map<String, String> map) {
        String strQ = q(str, D, map);
        if (TextUtils.isEmpty(strQ)) {
            return 0;
        }
        String[] strArrD0 = k0.D0(strQ, StringUtils.COMMA);
        int i10 = k0.s(strArrD0, "public.accessibility.describes-video") ? 512 : 0;
        if (k0.s(strArrD0, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (k0.s(strArrD0, "public.accessibility.describes-music-and-sound")) {
            i10 |= 1024;
        }
        return k0.s(strArrD0, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static int s(String str) {
        boolean zN = n(str, G, false);
        ?? r10 = zN;
        if (n(str, H, false)) {
            r10 = (zN ? 1 : 0) | 2;
        }
        return n(str, F, false) ? r10 | 4 : r10;
    }

    public static String u(String str, Map<String, String> map) {
        Matcher matcher = K.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // com.google.android.exoplayer2.upstream.g.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public q4.d parse(Uri uri, InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!a(bufferedReader)) {
                throw new UnrecognizedInputFormatException("Input does not start with the #EXTM3U header.", uri);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    k0.n(bufferedReader);
                    throw new ParserException("Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        b bVarL = l(new a(arrayDeque, bufferedReader), uri.toString());
                        k0.n(bufferedReader);
                        return bVarL;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    c cVarM = m(this.f19687a, new a(arrayDeque, bufferedReader), uri.toString());
                    k0.n(bufferedReader);
                    return cVarM;
                }
            }
        } catch (Throwable th2) {
            k0.n(bufferedReader);
            throw th2;
        }
    }

    public static boolean a(BufferedReader bufferedReader) throws IOException {
        int i10 = bufferedReader.read();
        if (i10 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i10 = bufferedReader.read();
        }
        int iV = v(bufferedReader, true, i10);
        for (int i11 = 0; i11 < 7; i11++) {
            if (iV != "#EXTM3U".charAt(i11)) {
                return false;
            }
            iV = bufferedReader.read();
        }
        return k0.g0(v(bufferedReader, false, iV));
    }

    public static double g(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(t(str, pattern, Collections.emptyMap()));
    }

    public static int j(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(t(str, pattern, Collections.emptyMap()));
    }

    public static long k(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(t(str, pattern, Collections.emptyMap()));
    }

    public static boolean n(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1).equals("YES");
        }
        return z10;
    }

    public static int o(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return i10;
    }

    public static String p(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        if (!map.isEmpty() && str2 != null) {
            return u(str2, map);
        }
        return str2;
    }

    public static String t(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String strQ = q(str, pattern, map);
        if (strQ != null) {
            return strQ;
        }
        throw new ParserException("Couldn't match " + pattern.pattern() + " in " + str);
    }
}
