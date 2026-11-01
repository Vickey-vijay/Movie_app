package yads;

import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zs1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f85578a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static px a(int i10, jb2 jb2Var) {
        int iB = jb2Var.b();
        if (jb2Var.b() == 1684108385) {
            jb2Var.e(jb2Var.f78967b + 8);
            String strB = jb2Var.b(iB - 16);
            return new px("und", strB, strB);
        }
        ih1.d("MetadataUtil", "Failed to parse comment attribute: " + xj.a(i10));
        return null;
    }

    public static zc1 b(int i10, jb2 jb2Var) {
        int i11 = -1;
        int i12 = -1;
        String strB = null;
        String strB2 = null;
        while (true) {
            int i13 = jb2Var.f78967b;
            if (i13 >= i10) {
                break;
            }
            int iB = jb2Var.b();
            int iB2 = jb2Var.b();
            jb2Var.e(jb2Var.f78967b + 4);
            if (iB2 == 1835360622) {
                strB = jb2Var.b(iB - 12);
            } else if (iB2 == 1851878757) {
                strB2 = jb2Var.b(iB - 12);
            } else {
                if (iB2 == 1684108385) {
                    i11 = i13;
                    i12 = iB;
                }
                jb2Var.e(jb2Var.f78967b + (iB - 12));
            }
        }
        if (strB == null || strB2 == null || i11 == -1) {
            return null;
        }
        jb2Var.e(i11);
        jb2Var.e(jb2Var.f78967b + 16);
        return new zc1(strB, strB2, jb2Var.b(i12 - 16));
    }

    public static ag a(jb2 jb2Var) {
        String str;
        int iB = jb2Var.b();
        if (jb2Var.b() == 1684108385) {
            int iB2 = jb2Var.b() & ViewCompat.MEASURED_SIZE_MASK;
            if (iB2 == 13) {
                str = "image/jpeg";
            } else {
                str = iB2 == 14 ? "image/png" : null;
            }
            if (str == null) {
                kf1.a("Unrecognized cover art flags: ", iB2, "MetadataUtil");
                return null;
            }
            jb2Var.e(jb2Var.f78967b + 4);
            int i10 = iB - 16;
            byte[] bArr = new byte[i10];
            jb2Var.a(bArr, 0, i10);
            return new ag(str, null, 3, bArr);
        }
        ih1.d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static y53 b(int i10, jb2 jb2Var, String str) {
        int iB = jb2Var.b();
        if (jb2Var.b() == 1684108385) {
            jb2Var.e(jb2Var.f78967b + 8);
            return new y53(str, null, jb2Var.b(iB - 16));
        }
        ih1.d("MetadataUtil", "Failed to parse text attribute: " + xj.a(i10));
        return null;
    }

    public static y53 a(int i10, jb2 jb2Var, String str) {
        int iB = jb2Var.b();
        if (jb2Var.b() == 1684108385 && iB >= 22) {
            jb2Var.e(jb2Var.f78967b + 10);
            int iR = jb2Var.r();
            if (iR > 0) {
                String strA = mg2.a("", iR);
                int iR2 = jb2Var.r();
                if (iR2 > 0) {
                    strA = strA + "/" + iR2;
                }
                return new y53(str, null, strA);
            }
        }
        ih1.d("MetadataUtil", "Failed to parse index/count attribute: " + xj.a(i10));
        return null;
    }

    public static v21 a(int i10, String str, jb2 jb2Var, boolean z10, boolean z11) {
        int iMin;
        jb2Var.e(jb2Var.f78967b + 4);
        if (jb2Var.b() == 1684108385) {
            jb2Var.e(jb2Var.f78967b + 8);
            iMin = jb2Var.m();
        } else {
            ih1.d("MetadataUtil", "Failed to parse uint8 attribute value");
            iMin = -1;
        }
        if (z11) {
            iMin = Math.min(1, iMin);
        }
        if (iMin >= 0) {
            if (z10) {
                return new y53(str, null, Integer.toString(iMin));
            }
            return new px("und", str, Integer.toString(iMin));
        }
        ih1.d("MetadataUtil", "Failed to parse uint8 attribute: " + xj.a(i10));
        return null;
    }
}
