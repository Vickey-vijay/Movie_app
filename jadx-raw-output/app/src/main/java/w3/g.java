package w3;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import g5.t;

/* JADX INFO: compiled from: MetadataUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public static final String[] f73421a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static Format a(int i10, Format format, @Nullable Metadata metadata, @Nullable Metadata metadata2, q3.o oVar) {
        if (i10 == 1) {
            if (oVar.a()) {
                format = format.g(oVar.f66460a, oVar.f66461b);
            }
            return metadata != null ? format.k(metadata) : format;
        }
        if (i10 != 2 || metadata2 == null) {
            return format;
        }
        for (int i11 = 0; i11 < metadata2.d(); i11++) {
            Metadata.Entry entryC = metadata2.c(i11);
            if (entryC instanceof MdtaMetadataEntry) {
                MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entryC;
                if ("com.android.capture.fps".equals(mdtaMetadataEntry.f19190b)) {
                    format = format.k(new Metadata(mdtaMetadataEntry));
                }
            }
        }
        return format;
    }

    @Nullable
    public static Id3Frame f(t tVar, int i10) {
        int i11 = -1;
        int i12 = -1;
        String strT = null;
        String strT2 = null;
        while (tVar.c() < i10) {
            int iC = tVar.c();
            int iJ = tVar.j();
            int iJ2 = tVar.j();
            tVar.M(4);
            if (iJ2 == 1835360622) {
                strT = tVar.t(iJ - 12);
            } else if (iJ2 == 1851878757) {
                strT2 = tVar.t(iJ - 12);
            } else {
                if (iJ2 == 1684108385) {
                    i11 = iC;
                    i12 = iJ;
                }
                tVar.M(iJ - 12);
            }
        }
        if (strT == null || strT2 == null || i11 == -1) {
            return null;
        }
        tVar.L(i11);
        tVar.M(16);
        return new InternalFrame(strT, strT2, tVar.t(i12 - 16));
    }

    public static int k(t tVar) {
        tVar.M(4);
        if (tVar.j() == 1684108385) {
            tVar.M(8);
            return tVar.y();
        }
        g5.m.h("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    @Nullable
    public static CommentFrame b(int i10, t tVar) {
        int iJ = tVar.j();
        if (tVar.j() == 1684108385) {
            tVar.M(8);
            String strT = tVar.t(iJ - 16);
            return new CommentFrame("und", strT, strT);
        }
        g5.m.h("MetadataUtil", "Failed to parse comment attribute: " + a.a(i10));
        return null;
    }

    @Nullable
    public static ApicFrame c(t tVar) {
        String str;
        int iJ = tVar.j();
        if (tVar.j() == 1684108385) {
            int iB = a.b(tVar.j());
            if (iB == 13) {
                str = "image/jpeg";
            } else if (iB == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                g5.m.h("MetadataUtil", "Unrecognized cover art flags: " + iB);
                return null;
            }
            tVar.M(4);
            int i10 = iJ - 16;
            byte[] bArr = new byte[i10];
            tVar.h(bArr, 0, i10);
            return new ApicFrame(str, null, 3, bArr);
        }
        g5.m.h("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    @Nullable
    public static Metadata.Entry d(t tVar) {
        int iC = tVar.c() + tVar.j();
        int iJ = tVar.j();
        int i10 = (iJ >> 24) & 255;
        try {
            if (i10 != 169 && i10 != 253) {
                if (iJ == 1735291493) {
                    TextInformationFrame textInformationFrameH = h(tVar);
                    tVar.L(iC);
                    return textInformationFrameH;
                }
                if (iJ == 1684632427) {
                    TextInformationFrame textInformationFrameE = e(iJ, "TPOS", tVar);
                    tVar.L(iC);
                    return textInformationFrameE;
                }
                if (iJ == 1953655662) {
                    TextInformationFrame textInformationFrameE2 = e(iJ, "TRCK", tVar);
                    tVar.L(iC);
                    return textInformationFrameE2;
                }
                if (iJ == 1953329263) {
                    Id3Frame id3FrameJ = j(iJ, "TBPM", tVar, true, false);
                    tVar.L(iC);
                    return id3FrameJ;
                }
                if (iJ == 1668311404) {
                    Id3Frame id3FrameJ2 = j(iJ, "TCMP", tVar, true, true);
                    tVar.L(iC);
                    return id3FrameJ2;
                }
                if (iJ == 1668249202) {
                    ApicFrame apicFrameC = c(tVar);
                    tVar.L(iC);
                    return apicFrameC;
                }
                if (iJ == 1631670868) {
                    TextInformationFrame textInformationFrameI = i(iJ, "TPE2", tVar);
                    tVar.L(iC);
                    return textInformationFrameI;
                }
                if (iJ == 1936682605) {
                    TextInformationFrame textInformationFrameI2 = i(iJ, "TSOT", tVar);
                    tVar.L(iC);
                    return textInformationFrameI2;
                }
                if (iJ == 1936679276) {
                    TextInformationFrame textInformationFrameI3 = i(iJ, "TSO2", tVar);
                    tVar.L(iC);
                    return textInformationFrameI3;
                }
                if (iJ == 1936679282) {
                    TextInformationFrame textInformationFrameI4 = i(iJ, "TSOA", tVar);
                    tVar.L(iC);
                    return textInformationFrameI4;
                }
                if (iJ == 1936679265) {
                    TextInformationFrame textInformationFrameI5 = i(iJ, "TSOP", tVar);
                    tVar.L(iC);
                    return textInformationFrameI5;
                }
                if (iJ == 1936679791) {
                    TextInformationFrame textInformationFrameI6 = i(iJ, "TSOC", tVar);
                    tVar.L(iC);
                    return textInformationFrameI6;
                }
                if (iJ == 1920233063) {
                    Id3Frame id3FrameJ3 = j(iJ, "ITUNESADVISORY", tVar, false, false);
                    tVar.L(iC);
                    return id3FrameJ3;
                }
                if (iJ == 1885823344) {
                    Id3Frame id3FrameJ4 = j(iJ, "ITUNESGAPLESS", tVar, false, true);
                    tVar.L(iC);
                    return id3FrameJ4;
                }
                if (iJ == 1936683886) {
                    TextInformationFrame textInformationFrameI7 = i(iJ, "TVSHOWSORT", tVar);
                    tVar.L(iC);
                    return textInformationFrameI7;
                }
                if (iJ == 1953919848) {
                    TextInformationFrame textInformationFrameI8 = i(iJ, "TVSHOW", tVar);
                    tVar.L(iC);
                    return textInformationFrameI8;
                }
                if (iJ == 757935405) {
                    Id3Frame id3FrameF = f(tVar, iC);
                    tVar.L(iC);
                    return id3FrameF;
                }
            } else {
                int i11 = 16777215 & iJ;
                if (i11 == 6516084) {
                    CommentFrame commentFrameB = b(iJ, tVar);
                    tVar.L(iC);
                    return commentFrameB;
                }
                if (i11 != 7233901 && i11 != 7631467) {
                    if (i11 != 6516589 && i11 != 7828084) {
                        if (i11 == 6578553) {
                            TextInformationFrame textInformationFrameI9 = i(iJ, "TDRC", tVar);
                            tVar.L(iC);
                            return textInformationFrameI9;
                        }
                        if (i11 == 4280916) {
                            TextInformationFrame textInformationFrameI10 = i(iJ, "TPE1", tVar);
                            tVar.L(iC);
                            return textInformationFrameI10;
                        }
                        if (i11 == 7630703) {
                            TextInformationFrame textInformationFrameI11 = i(iJ, "TSSE", tVar);
                            tVar.L(iC);
                            return textInformationFrameI11;
                        }
                        if (i11 == 6384738) {
                            TextInformationFrame textInformationFrameI12 = i(iJ, "TALB", tVar);
                            tVar.L(iC);
                            return textInformationFrameI12;
                        }
                        if (i11 == 7108978) {
                            TextInformationFrame textInformationFrameI13 = i(iJ, "USLT", tVar);
                            tVar.L(iC);
                            return textInformationFrameI13;
                        }
                        if (i11 == 6776174) {
                            TextInformationFrame textInformationFrameI14 = i(iJ, "TCON", tVar);
                            tVar.L(iC);
                            return textInformationFrameI14;
                        }
                        if (i11 == 6779504) {
                            TextInformationFrame textInformationFrameI15 = i(iJ, "TIT1", tVar);
                            tVar.L(iC);
                            return textInformationFrameI15;
                        }
                    } else {
                        TextInformationFrame textInformationFrameI16 = i(iJ, "TCOM", tVar);
                        tVar.L(iC);
                        return textInformationFrameI16;
                    }
                } else {
                    TextInformationFrame textInformationFrameI17 = i(iJ, "TIT2", tVar);
                    tVar.L(iC);
                    return textInformationFrameI17;
                }
            }
            g5.m.b("MetadataUtil", "Skipped unknown metadata entry: " + a.a(iJ));
            tVar.L(iC);
            return null;
        } catch (Throwable th2) {
            tVar.L(iC);
            throw th2;
        }
    }

    @Nullable
    public static TextInformationFrame e(int i10, String str, t tVar) {
        int iJ = tVar.j();
        if (tVar.j() == 1684108385 && iJ >= 22) {
            tVar.M(10);
            int iE = tVar.E();
            if (iE > 0) {
                String str2 = "" + iE;
                int iE2 = tVar.E();
                if (iE2 > 0) {
                    str2 = str2 + "/" + iE2;
                }
                return new TextInformationFrame(str, null, str2);
            }
        }
        g5.m.h("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i10));
        return null;
    }

    @Nullable
    public static MdtaMetadataEntry g(t tVar, int i10, String str) {
        while (true) {
            int iC = tVar.c();
            if (iC < i10) {
                int iJ = tVar.j();
                if (tVar.j() == 1684108385) {
                    int iJ2 = tVar.j();
                    int iJ3 = tVar.j();
                    int i11 = iJ - 16;
                    byte[] bArr = new byte[i11];
                    tVar.h(bArr, 0, i11);
                    return new MdtaMetadataEntry(str, bArr, iJ3, iJ2);
                }
                tVar.L(iC + iJ);
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    @Nullable
    public static TextInformationFrame h(t tVar) {
        String str;
        int iK = k(tVar);
        if (iK > 0) {
            String[] strArr = f73421a;
            if (iK <= strArr.length) {
                str = strArr[iK - 1];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new TextInformationFrame("TCON", null, str);
        }
        g5.m.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    @Nullable
    public static TextInformationFrame i(int i10, String str, t tVar) {
        int iJ = tVar.j();
        if (tVar.j() == 1684108385) {
            tVar.M(8);
            return new TextInformationFrame(str, null, tVar.t(iJ - 16));
        }
        g5.m.h("MetadataUtil", "Failed to parse text attribute: " + a.a(i10));
        return null;
    }

    @Nullable
    public static Id3Frame j(int i10, String str, t tVar, boolean z10, boolean z11) {
        int iK = k(tVar);
        if (z11) {
            iK = Math.min(1, iK);
        }
        if (iK >= 0) {
            if (z10) {
                return new TextInformationFrame(str, null, Integer.toString(iK));
            }
            return new CommentFrame("und", str, Integer.toString(iK));
        }
        g5.m.h("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i10));
        return null;
    }
}
