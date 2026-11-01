package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import android.util.Log;
import com.ironsource.C3450ea;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.TextInformationFrame;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes5.dex */
final class MetadataUtil {
    private static final String LANGUAGE_UNDEFINED = "und";
    private static final String TAG = "MetadataUtil";
    private static final int SHORT_TYPE_NAME_1 = Util.getIntegerCodeForString("nam");
    private static final int SHORT_TYPE_NAME_2 = Util.getIntegerCodeForString("trk");
    private static final int SHORT_TYPE_COMMENT = Util.getIntegerCodeForString("cmt");
    private static final int SHORT_TYPE_YEAR = Util.getIntegerCodeForString("day");
    private static final int SHORT_TYPE_ARTIST = Util.getIntegerCodeForString("ART");
    private static final int SHORT_TYPE_ENCODER = Util.getIntegerCodeForString("too");
    private static final int SHORT_TYPE_ALBUM = Util.getIntegerCodeForString("alb");
    private static final int SHORT_TYPE_COMPOSER_1 = Util.getIntegerCodeForString("com");
    private static final int SHORT_TYPE_COMPOSER_2 = Util.getIntegerCodeForString("wrt");
    private static final int SHORT_TYPE_LYRICS = Util.getIntegerCodeForString("lyr");
    private static final int SHORT_TYPE_GENRE = Util.getIntegerCodeForString(C3450ea.f28770n);
    private static final int TYPE_COVER_ART = Util.getIntegerCodeForString("covr");
    private static final int TYPE_GENRE = Util.getIntegerCodeForString("gnre");
    private static final int TYPE_GROUPING = Util.getIntegerCodeForString("grp");
    private static final int TYPE_DISK_NUMBER = Util.getIntegerCodeForString("disk");
    private static final int TYPE_TRACK_NUMBER = Util.getIntegerCodeForString("trkn");
    private static final int TYPE_TEMPO = Util.getIntegerCodeForString("tmpo");
    private static final int TYPE_COMPILATION = Util.getIntegerCodeForString("cpil");
    private static final int TYPE_ALBUM_ARTIST = Util.getIntegerCodeForString("aART");
    private static final int TYPE_SORT_TRACK_NAME = Util.getIntegerCodeForString("sonm");
    private static final int TYPE_SORT_ALBUM = Util.getIntegerCodeForString("soal");
    private static final int TYPE_SORT_ARTIST = Util.getIntegerCodeForString("soar");
    private static final int TYPE_SORT_ALBUM_ARTIST = Util.getIntegerCodeForString("soaa");
    private static final int TYPE_SORT_COMPOSER = Util.getIntegerCodeForString("soco");
    private static final int TYPE_RATING = Util.getIntegerCodeForString("rtng");
    private static final int TYPE_GAPLESS_ALBUM = Util.getIntegerCodeForString("pgap");
    private static final int TYPE_TV_SORT_SHOW = Util.getIntegerCodeForString("sosn");
    private static final int TYPE_TV_SHOW = Util.getIntegerCodeForString("tvsh");
    private static final int TYPE_INTERNAL = Util.getIntegerCodeForString("----");
    private static final String[] STANDARD_GENRES = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    private MetadataUtil() {
    }

    private static Id3Frame parseInternalAttribute(ParsableByteArray parsableByteArray, int i10) {
        int i11 = -1;
        int i12 = -1;
        String nullTerminatedString = null;
        String nullTerminatedString2 = null;
        while (parsableByteArray.getPosition() < i10) {
            int position = parsableByteArray.getPosition();
            int i13 = parsableByteArray.readInt();
            int i14 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            if (i14 == Atom.TYPE_mean) {
                nullTerminatedString = parsableByteArray.readNullTerminatedString(i13 - 12);
            } else if (i14 == Atom.TYPE_name) {
                nullTerminatedString2 = parsableByteArray.readNullTerminatedString(i13 - 12);
            } else {
                if (i14 == Atom.TYPE_data) {
                    i11 = position;
                    i12 = i13;
                }
                parsableByteArray.skipBytes(i13 - 12);
            }
        }
        if (nullTerminatedString == null || nullTerminatedString2 == null || i11 == -1) {
            return null;
        }
        parsableByteArray.setPosition(i11);
        parsableByteArray.skipBytes(16);
        return new InternalFrame(nullTerminatedString, nullTerminatedString2, parsableByteArray.readNullTerminatedString(i12 - 16));
    }

    private static int parseUint8AttributeValue(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() == Atom.TYPE_data) {
            parsableByteArray.skipBytes(8);
            return parsableByteArray.readUnsignedByte();
        }
        Log.w(TAG, "Failed to parse uint8 attribute value");
        return -1;
    }

    private static CommentFrame parseCommentAttribute(int i10, ParsableByteArray parsableByteArray) {
        int i11 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == Atom.TYPE_data) {
            parsableByteArray.skipBytes(8);
            String nullTerminatedString = parsableByteArray.readNullTerminatedString(i11 - 16);
            return new CommentFrame("und", nullTerminatedString, nullTerminatedString);
        }
        Log.w(TAG, "Failed to parse comment attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }

    private static ApicFrame parseCoverArt(ParsableByteArray parsableByteArray) {
        String str;
        int i10 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == Atom.TYPE_data) {
            int fullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
            if (fullAtomFlags == 13) {
                str = "image/jpeg";
            } else if (fullAtomFlags == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                Log.w(TAG, "Unrecognized cover art flags: " + fullAtomFlags);
                return null;
            }
            parsableByteArray.skipBytes(4);
            int i11 = i10 - 16;
            byte[] bArr = new byte[i11];
            parsableByteArray.readBytes(bArr, 0, i11);
            return new ApicFrame(str, null, 3, bArr);
        }
        Log.w(TAG, "Failed to parse cover art attribute");
        return null;
    }

    public static Metadata.Entry parseIlstElement(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition() + parsableByteArray.readInt();
        int i10 = parsableByteArray.readInt();
        int i11 = (i10 >> 24) & 255;
        try {
            if (i11 != 169 && i11 != 65533) {
                if (i10 == TYPE_GENRE) {
                    TextInformationFrame standardGenreAttribute = parseStandardGenreAttribute(parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return standardGenreAttribute;
                }
                if (i10 == TYPE_DISK_NUMBER) {
                    TextInformationFrame indexAndCountAttribute = parseIndexAndCountAttribute(i10, "TPOS", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return indexAndCountAttribute;
                }
                if (i10 == TYPE_TRACK_NUMBER) {
                    TextInformationFrame indexAndCountAttribute2 = parseIndexAndCountAttribute(i10, "TRCK", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return indexAndCountAttribute2;
                }
                if (i10 == TYPE_TEMPO) {
                    Id3Frame uint8Attribute = parseUint8Attribute(i10, "TBPM", parsableByteArray, true, false);
                    parsableByteArray.setPosition(position);
                    return uint8Attribute;
                }
                if (i10 == TYPE_COMPILATION) {
                    Id3Frame uint8Attribute2 = parseUint8Attribute(i10, "TCMP", parsableByteArray, true, true);
                    parsableByteArray.setPosition(position);
                    return uint8Attribute2;
                }
                if (i10 == TYPE_COVER_ART) {
                    ApicFrame coverArt = parseCoverArt(parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return coverArt;
                }
                if (i10 == TYPE_ALBUM_ARTIST) {
                    TextInformationFrame textAttribute = parseTextAttribute(i10, "TPE2", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute;
                }
                if (i10 == TYPE_SORT_TRACK_NAME) {
                    TextInformationFrame textAttribute2 = parseTextAttribute(i10, "TSOT", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute2;
                }
                if (i10 == TYPE_SORT_ALBUM) {
                    TextInformationFrame textAttribute3 = parseTextAttribute(i10, "TSO2", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute3;
                }
                if (i10 == TYPE_SORT_ARTIST) {
                    TextInformationFrame textAttribute4 = parseTextAttribute(i10, "TSOA", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute4;
                }
                if (i10 == TYPE_SORT_ALBUM_ARTIST) {
                    TextInformationFrame textAttribute5 = parseTextAttribute(i10, "TSOP", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute5;
                }
                if (i10 == TYPE_SORT_COMPOSER) {
                    TextInformationFrame textAttribute6 = parseTextAttribute(i10, "TSOC", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute6;
                }
                if (i10 == TYPE_RATING) {
                    Id3Frame uint8Attribute3 = parseUint8Attribute(i10, "ITUNESADVISORY", parsableByteArray, false, false);
                    parsableByteArray.setPosition(position);
                    return uint8Attribute3;
                }
                if (i10 == TYPE_GAPLESS_ALBUM) {
                    Id3Frame uint8Attribute4 = parseUint8Attribute(i10, "ITUNESGAPLESS", parsableByteArray, false, true);
                    parsableByteArray.setPosition(position);
                    return uint8Attribute4;
                }
                if (i10 == TYPE_TV_SORT_SHOW) {
                    TextInformationFrame textAttribute7 = parseTextAttribute(i10, "TVSHOWSORT", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute7;
                }
                if (i10 == TYPE_TV_SHOW) {
                    TextInformationFrame textAttribute8 = parseTextAttribute(i10, "TVSHOW", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute8;
                }
                if (i10 == TYPE_INTERNAL) {
                    Id3Frame internalAttribute = parseInternalAttribute(parsableByteArray, position);
                    parsableByteArray.setPosition(position);
                    return internalAttribute;
                }
            } else {
                int i12 = 16777215 & i10;
                if (i12 == SHORT_TYPE_COMMENT) {
                    CommentFrame commentAttribute = parseCommentAttribute(i10, parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return commentAttribute;
                }
                if (i12 != SHORT_TYPE_NAME_1 && i12 != SHORT_TYPE_NAME_2) {
                    if (i12 != SHORT_TYPE_COMPOSER_1 && i12 != SHORT_TYPE_COMPOSER_2) {
                        if (i12 == SHORT_TYPE_YEAR) {
                            TextInformationFrame textAttribute9 = parseTextAttribute(i10, "TDRC", parsableByteArray);
                            parsableByteArray.setPosition(position);
                            return textAttribute9;
                        }
                        if (i12 == SHORT_TYPE_ARTIST) {
                            TextInformationFrame textAttribute10 = parseTextAttribute(i10, "TPE1", parsableByteArray);
                            parsableByteArray.setPosition(position);
                            return textAttribute10;
                        }
                        if (i12 == SHORT_TYPE_ENCODER) {
                            TextInformationFrame textAttribute11 = parseTextAttribute(i10, "TSSE", parsableByteArray);
                            parsableByteArray.setPosition(position);
                            return textAttribute11;
                        }
                        if (i12 == SHORT_TYPE_ALBUM) {
                            TextInformationFrame textAttribute12 = parseTextAttribute(i10, "TALB", parsableByteArray);
                            parsableByteArray.setPosition(position);
                            return textAttribute12;
                        }
                        if (i12 == SHORT_TYPE_LYRICS) {
                            TextInformationFrame textAttribute13 = parseTextAttribute(i10, "USLT", parsableByteArray);
                            parsableByteArray.setPosition(position);
                            return textAttribute13;
                        }
                        if (i12 == SHORT_TYPE_GENRE) {
                            TextInformationFrame textAttribute14 = parseTextAttribute(i10, "TCON", parsableByteArray);
                            parsableByteArray.setPosition(position);
                            return textAttribute14;
                        }
                        if (i12 == TYPE_GROUPING) {
                            TextInformationFrame textAttribute15 = parseTextAttribute(i10, "TIT1", parsableByteArray);
                            parsableByteArray.setPosition(position);
                            return textAttribute15;
                        }
                    }
                    TextInformationFrame textAttribute16 = parseTextAttribute(i10, "TCOM", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute16;
                }
                TextInformationFrame textAttribute17 = parseTextAttribute(i10, "TIT2", parsableByteArray);
                parsableByteArray.setPosition(position);
                return textAttribute17;
            }
            Log.d(TAG, "Skipped unknown metadata entry: " + Atom.getAtomTypeString(i10));
            parsableByteArray.setPosition(position);
            return null;
        } catch (Throwable th2) {
            parsableByteArray.setPosition(position);
            throw th2;
        }
    }

    private static TextInformationFrame parseIndexAndCountAttribute(int i10, String str, ParsableByteArray parsableByteArray) {
        int i11 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == Atom.TYPE_data && i11 >= 22) {
            parsableByteArray.skipBytes(10);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            if (unsignedShort > 0) {
                String str2 = "" + unsignedShort;
                int unsignedShort2 = parsableByteArray.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    str2 = str2 + "/" + unsignedShort2;
                }
                return new TextInformationFrame(str, null, str2);
            }
        }
        Log.w(TAG, "Failed to parse index/count attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    private static TextInformationFrame parseStandardGenreAttribute(ParsableByteArray parsableByteArray) {
        String str;
        int uint8AttributeValue = parseUint8AttributeValue(parsableByteArray);
        if (uint8AttributeValue > 0) {
            String[] strArr = STANDARD_GENRES;
            if (uint8AttributeValue <= strArr.length) {
                str = strArr[uint8AttributeValue - 1];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new TextInformationFrame("TCON", null, str);
        }
        Log.w(TAG, "Failed to parse standard genre code");
        return null;
    }

    private static TextInformationFrame parseTextAttribute(int i10, String str, ParsableByteArray parsableByteArray) {
        int i11 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == Atom.TYPE_data) {
            parsableByteArray.skipBytes(8);
            return new TextInformationFrame(str, null, parsableByteArray.readNullTerminatedString(i11 - 16));
        }
        Log.w(TAG, "Failed to parse text attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }

    private static Id3Frame parseUint8Attribute(int i10, String str, ParsableByteArray parsableByteArray, boolean z10, boolean z11) {
        int uint8AttributeValue = parseUint8AttributeValue(parsableByteArray);
        if (z11) {
            uint8AttributeValue = Math.min(1, uint8AttributeValue);
        }
        if (uint8AttributeValue >= 0) {
            if (z10) {
                return new TextInformationFrame(str, null, Integer.toString(uint8AttributeValue));
            }
            return new CommentFrame("und", str, Integer.toString(uint8AttributeValue));
        }
        Log.w(TAG, "Failed to parse uint8 attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }
}
