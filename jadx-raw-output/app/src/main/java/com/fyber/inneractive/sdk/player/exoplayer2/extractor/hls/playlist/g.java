package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.c0;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f16657a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f16658b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f16659c = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f16660d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f16661e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f16662f = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f16663g = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f16664h = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f16665i = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f16666j = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f16667k = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f16668l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f16669m = Pattern.compile("METHOD=(NONE|AES-128)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f16670n = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f16671o = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f16672p = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f16673q = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f16674r = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f16675s = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f16676t = Pattern.compile("AUTOSELECT".concat("=(NO|YES)"));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f16677u = Pattern.compile("DEFAULT".concat("=(NO|YES)"));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f16678v = Pattern.compile("FORCED".concat("=(NO|YES)"));

    /* JADX WARN: Multi-variable type inference failed */
    public static d b(f fVar, String str) throws r {
        String str2;
        int i10;
        String hexString;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 2;
        String str3 = null;
        long j10 = 0;
        int i12 = 0;
        int i13 = 1;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        c cVar = null;
        String strA = null;
        String strB = null;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z10 = false;
        int i18 = 0;
        int i19 = 0;
        boolean zEquals = false;
        int i20 = 1;
        while (true) {
            long j17 = -1;
            while (true) {
                if (!fVar.a()) {
                    return new d(i14, str, j11, j13, i15, i16, i17, i20, j12, z10, j13 != 0, cVar, arrayList, arrayList2);
                }
                if (fVar.a()) {
                    str2 = fVar.f16656c;
                    fVar.f16656c = str3;
                } else {
                    str2 = str3;
                }
                if (str2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String strB2 = b(str2, f16663g);
                    if ("VOD".equals(strB2)) {
                        i14 = i13;
                    } else if ("EVENT".equals(strB2)) {
                        i14 = i11;
                    } else {
                        i11 = 2;
                        str3 = null;
                        j10 = 0;
                        i12 = 0;
                        i13 = 1;
                    }
                } else if (str2.startsWith("#EXT-X-START")) {
                    j11 = (long) (Double.parseDouble(b(str2, f16666j)) * 1000000.0d);
                } else {
                    if (str2.startsWith("#EXT-X-MAP")) {
                        break;
                    }
                    if (str2.startsWith("#EXT-X-TARGETDURATION")) {
                        j12 = 1000000 * ((long) Integer.parseInt(b(str2, f16661e)));
                    } else if (str2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        i18 = Integer.parseInt(b(str2, f16664h));
                        i17 = i18;
                    } else if (str2.startsWith("#EXT-X-VERSION")) {
                        i20 = Integer.parseInt(b(str2, f16662f));
                    } else if (str2.startsWith("#EXTINF")) {
                        j16 = (long) (Double.parseDouble(b(str2, f16665i)) * 1000000.0d);
                    } else if (str2.startsWith("#EXT-X-KEY")) {
                        zEquals = "AES-128".equals(b(str2, f16669m));
                        if (zEquals) {
                            strB = b(str2, f16670n);
                            strA = a(str2, f16671o);
                        } else {
                            str3 = null;
                            strA = null;
                            strB = null;
                        }
                    } else if (str2.startsWith("#EXT-X-BYTERANGE")) {
                        String[] strArrSplit = b(str2, f16667k).split("@");
                        j17 = Long.parseLong(strArrSplit[i12]);
                        if (strArrSplit.length > i13) {
                            j14 = Long.parseLong(strArrSplit[i13]);
                        }
                    } else if (str2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                        i16 = Integer.parseInt(str2.substring(str2.indexOf(58) + i13));
                        i15 = i13;
                    } else if (str2.equals("#EXT-X-DISCONTINUITY")) {
                        i19++;
                    } else if (str2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                        if (j13 == j10) {
                            String strSubstring = str2.substring(str2.indexOf(58) + i13);
                            Matcher matcher = z.f17878f.matcher(strSubstring);
                            if (!matcher.matches()) {
                                throw new r("Invalid date/time format: " + strSubstring);
                            }
                            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                i10 = i12;
                            } else {
                                i10 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                                if (matcher.group(11).equals("-")) {
                                    i10 *= -1;
                                }
                            }
                            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                            gregorianCalendar.clear();
                            gregorianCalendar.set(Integer.parseInt(matcher.group(i13)), Integer.parseInt(matcher.group(i11)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                            if (!TextUtils.isEmpty(matcher.group(8))) {
                                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                            }
                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                            if (i10 != 0) {
                                timeInMillis -= (long) (i10 * 60000);
                            }
                            int i21 = com.fyber.inneractive.sdk.player.exoplayer2.b.f16414a;
                            j13 = (timeInMillis == -9223372036854775807L ? -9223372036854775807L : timeInMillis * 1000) - j15;
                        }
                        i11 = 2;
                        str3 = null;
                        j10 = 0;
                        i12 = 0;
                        i13 = 1;
                    } else if (str2.startsWith("#EXT-X-DATERANGE")) {
                        arrayList2.add(str2);
                        i11 = 2;
                        str3 = null;
                        j10 = 0;
                        i12 = 0;
                        i13 = 1;
                    } else if (!str2.startsWith("#")) {
                        if (zEquals) {
                            hexString = strA != null ? strA : Integer.toHexString(i18);
                        } else {
                            hexString = null;
                        }
                        int i22 = i18 + 1;
                        if (j17 == -1) {
                            j14 = 0;
                        }
                        arrayList.add(new c(str2, j16, i19, j15, zEquals, strB, hexString, j14, j17));
                        j15 += j16;
                        if (j17 != -1) {
                            j14 += j17;
                        }
                        i18 = i22;
                        j17 = -1;
                        i11 = 2;
                        str3 = null;
                        j10 = 0;
                        i12 = 0;
                        i13 = 1;
                        j16 = 0;
                    } else if (str2.equals("#EXT-X-ENDLIST")) {
                        i11 = 2;
                        str3 = null;
                        j10 = 0;
                        i12 = 0;
                        i13 = 1;
                        z10 = true;
                    } else {
                        i11 = 2;
                        str3 = null;
                        j10 = 0;
                        i12 = 0;
                        i13 = 1;
                    }
                    str3 = null;
                }
            }
            String strB3 = b(str2, f16670n);
            String strA2 = a(str2, f16668l);
            if (strA2 != null) {
                String[] strArrSplit2 = strA2.split("@");
                j17 = Long.parseLong(strArrSplit2[i12]);
                if (strArrSplit2.length > i13) {
                    j14 = Long.parseLong(strArrSplit2[i13]);
                }
            }
            cVar = new c(strB3, 0L, -1, -9223372036854775807L, false, null, null, j14, j17);
            j14 = j10;
            str3 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x001f, B:9:0x0027, B:33:0x006b, B:34:0x0072, B:12:0x002e, B:14:0x0034, B:17:0x003d, B:19:0x0045, B:22:0x0052, B:24:0x0058, B:28:0x005f, B:29:0x0064, B:35:0x0073, B:37:0x0079, B:40:0x0084, B:42:0x008c, B:43:0x009d, B:45:0x00a5, B:47:0x00ad, B:49:0x00b5, B:51:0x00bd, B:53:0x00c5, B:55:0x00cd, B:57:0x00d5, B:60:0x00de, B:61:0x00e2), top: B:69:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0045 A[Catch: all -> 0x0101, LOOP:1: B:16:0x003b->B:19:0x0045, LOOP_END, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x001f, B:9:0x0027, B:33:0x006b, B:34:0x0072, B:12:0x002e, B:14:0x0034, B:17:0x003d, B:19:0x0045, B:22:0x0052, B:24:0x0058, B:28:0x005f, B:29:0x0064, B:35:0x0073, B:37:0x0079, B:40:0x0084, B:42:0x008c, B:43:0x009d, B:45:0x00a5, B:47:0x00ad, B:49:0x00b5, B:51:0x00bd, B:53:0x00c5, B:55:0x00cd, B:57:0x00d5, B:60:0x00de, B:61:0x00e2), top: B:69:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:74:0x006b A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:21:0x0050
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e a(android.net.Uri r7, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g.a(android.net.Uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:72:0x0217  */
    /* JADX WARN: Multi-variable type inference failed */
    public static b a(f fVar, String str) throws r {
        String str2;
        int i10;
        String str3;
        int i11;
        int i12;
        String str4;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        o oVar = null;
        ArrayList arrayList4 = null;
        boolean zContains = false;
        while (fVar.a()) {
            if (fVar.a()) {
                str2 = fVar.f16656c;
                fVar.f16656c = null;
            } else {
                str2 = null;
            }
            if (str2.startsWith("#EXT-X-MEDIA")) {
                Matcher matcher = f16677u.matcher(str2);
                boolean zEquals = matcher.find() ? matcher.group(1).equals("YES") : 0;
                Matcher matcher2 = f16678v.matcher(str2);
                int i13 = zEquals | (matcher2.find() ? matcher2.group(1).equals("YES") : false ? 2 : 0);
                Matcher matcher3 = f16676t.matcher(str2);
                int i14 = i13 | (matcher3.find() ? matcher3.group(1).equals("YES") : false ? 4 : 0);
                String strA = a(str2, f16670n);
                String strB = b(str2, f16674r);
                String strA2 = a(str2, f16673q);
                String strB2 = b(str2, f16672p);
                strB2.getClass();
                switch (strB2) {
                    case "SUBTITLES":
                        arrayList3.add(new a(strA, new o(strB, "application/x-mpegURL", "text/vtt", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i14, strA2, -1, Long.MAX_VALUE, null, null, null)));
                        break;
                    case "CLOSED-CAPTIONS":
                        String strB3 = b(str2, f16675s);
                        if (strB3.startsWith("CC")) {
                            i10 = Integer.parseInt(strB3.substring(2));
                            str3 = "application/cea-608";
                        } else {
                            i10 = Integer.parseInt(strB3.substring(7));
                            str3 = "application/cea-708";
                        }
                        int i15 = i10;
                        String str5 = str3;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(new o(strB, null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i14, strA2, i15, Long.MAX_VALUE, null, null, null));
                        break;
                    case "AUDIO":
                        o oVar2 = new o(strB, "application/x-mpegURL", null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i14, strA2, -1, Long.MAX_VALUE, null, null, null);
                        if (strA != null) {
                            arrayList2.add(new a(strA, oVar2));
                            break;
                        } else {
                            oVar = oVar2;
                            break;
                        }
                        break;
                }
            } else if (str2.startsWith("#EXT-X-STREAM-INF")) {
                int i16 = Integer.parseInt(b(str2, f16658b));
                String strA3 = a(str2, f16657a);
                if (strA3 != null) {
                    i16 = Integer.parseInt(strA3);
                }
                int i17 = i16;
                String strA4 = a(str2, f16659c);
                String strA5 = a(str2, f16660d);
                zContains |= str2.contains("CLOSED-CAPTIONS=NONE");
                if (strA5 != null) {
                    String[] strArrSplit = strA5.split(VastAttributes.HORIZONTAL_POSITION);
                    int i18 = Integer.parseInt(strArrSplit[0]);
                    int i19 = Integer.parseInt(strArrSplit[1]);
                    if (i18 <= 0 || i19 <= 0) {
                        i11 = -1;
                        i12 = -1;
                    } else {
                        i12 = i19;
                        i11 = i18;
                    }
                } else {
                    i11 = -1;
                    i12 = -1;
                }
                if (fVar.a()) {
                    str4 = fVar.f16656c;
                    fVar.f16656c = null;
                } else {
                    str4 = null;
                }
                if (hashSet.add(str4)) {
                    arrayList.add(new a(str4, new o(Integer.toString(arrayList.size()), "application/x-mpegURL", null, strA4, i17, -1, i11, i12, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null)));
                }
            }
        }
        return new b(str, arrayList, arrayList2, arrayList3, oVar, zContains ? Collections.emptyList() : arrayList4);
    }

    public static String b(String str, Pattern pattern) throws r {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new r("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
