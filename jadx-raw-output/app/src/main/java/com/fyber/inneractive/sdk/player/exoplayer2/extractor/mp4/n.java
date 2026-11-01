package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import androidx.core.view.ViewCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C3450ea;

/* JADX INFO: loaded from: classes11.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f16923a = z.a("nam");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16924b = z.a("trk");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16925c = z.a("cmt");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16926d = z.a("day");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16927e = z.a("ART");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16928f = z.a("too");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16929g = z.a("alb");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f16930h = z.a("com");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f16931i = z.a("wrt");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f16932j = z.a("lyr");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f16933k = z.a(C3450ea.f28770n);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f16934l = z.a("covr");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f16935m = z.a("gnre");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f16936n = z.a("grp");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f16937o = z.a("disk");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f16938p = z.a("trkn");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f16939q = z.a("tmpo");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f16940r = z.a("cpil");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f16941s = z.a("aART");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f16942t = z.a("sonm");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f16943u = z.a("soal");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f16944v = z.a("soar");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f16945w = z.a("soaa");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f16946x = z.a("soco");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f16947y = z.a("rtng");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f16948z = z.a("pgap");
    public static final int A = z.a("sosn");
    public static final int B = z.a("tvsh");
    public static final int C = z.a("----");
    public static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o a(int i10, String str, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z10, boolean z11) {
        int iMin;
        nVar.e(nVar.f17846b + 4);
        if (nVar.b() == c.F0) {
            nVar.e(nVar.f17846b + 8);
            iMin = nVar.j();
        } else {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
            iMin = -1;
        }
        if (z11) {
            iMin = Math.min(1, iMin);
        }
        if (iMin >= 0) {
            return z10 ? new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s(str, null, Integer.toString(iMin)) : new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j("und", str, Integer.toString(iMin));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + c.a(i10));
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j b(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i11 = -1;
        int i12 = -1;
        String strA = null;
        String strA2 = null;
        while (true) {
            int i13 = nVar.f17846b;
            if (i13 >= i10) {
                break;
            }
            int iB = nVar.b();
            int iB2 = nVar.b();
            nVar.e(nVar.f17846b + 4);
            if (iB2 == c.D0) {
                strA = nVar.a(iB - 12);
            } else if (iB2 == c.E0) {
                strA2 = nVar.a(iB - 12);
            } else {
                if (iB2 == c.F0) {
                    i11 = i13;
                    i12 = iB;
                }
                nVar.e(nVar.f17846b + (iB - 12));
            }
        }
        if (!"com.apple.iTunes".equals(strA) || !"iTunSMPB".equals(strA2) || i11 == -1) {
            return null;
        }
        nVar.e(i11);
        nVar.e(nVar.f17846b + 16);
        return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j("und", strA2, nVar.a(i12 - 16));
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iB = nVar.b();
        if (nVar.b() == c.F0) {
            nVar.e(nVar.f17846b + 8);
            String strA = nVar.a(iB - 16);
            return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j("und", strA, strA);
        }
        Log.w("MetadataUtil", "Failed to parse comment attribute: " + c.a(i10));
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s b(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        int iB = nVar.b();
        if (nVar.b() == c.F0) {
            nVar.e(nVar.f17846b + 8);
            return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s(str, null, nVar.a(iB - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + c.a(i10));
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        int iB = nVar.b();
        if (nVar.b() == c.F0 && iB >= 22) {
            nVar.e(nVar.f17846b + 10);
            int iO = nVar.o();
            if (iO > 0) {
                String strA = com.fyber.inneractive.sdk.player.exoplayer2.m.a("", iO);
                int iO2 = nVar.o();
                if (iO2 > 0) {
                    strA = strA + "/" + iO2;
                }
                return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s(str, null, strA);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + c.a(i10));
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        String str;
        int iB = nVar.b();
        if (nVar.b() == c.F0) {
            int iB2 = nVar.b() & ViewCompat.MEASURED_SIZE_MASK;
            if (iB2 == 13) {
                str = "image/jpeg";
            } else {
                str = iB2 == 14 ? "image/png" : null;
            }
            if (str == null) {
                Log.w("MetadataUtil", "Unrecognized cover art flags: " + iB2);
                return null;
            }
            nVar.e(nVar.f17846b + 4);
            int i10 = iB - 16;
            byte[] bArr = new byte[i10];
            nVar.a(bArr, 0, i10);
            return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b(str, null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }
}
