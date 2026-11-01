package com.google.zxing.aztec.decoder;

import androidx.exifinterface.media.ExifInterface;
import c6.b;
import c6.d;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.badge.BadgeDrawable;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.ironsource.C3426d4;
import com.ironsource.Gc;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import e6.c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class Decoder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f20854b = {"CTRL_PS", Z7.f27998r, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f20855c = {"CTRL_PS", Z7.f27998r, "a", "b", "c", "d", "e", InneractiveMediationDefs.GENDER_FEMALE, "g", "h", "i", "j", CampaignEx.JSON_KEY_AD_K, "l", InneractiveMediationDefs.GENDER_MALE, "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f20856d = {"CTRL_PS", Z7.f27998r, "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", ImpressionLog.Q, "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f20857e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", C3426d4.j.f28584c, "'", "(", ")", "*", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, StringUtils.COMMA, "-", ".", "/", StringUtils.PROCESS_POSTFIX_DELIMITER, ";", "<", "=", ">", "?", C3426d4.j.f28586d, C3426d4.j.f28588e, h.f44171d, h.f44172e, "CTRL_UL"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f20858f = {"CTRL_PS", Z7.f27998r, "0", "1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", CampaignEx.CLICKMODE_ON, "6", Gc.f26641e, "8", "9", StringUtils.COMMA, ".", "CTRL_UL", "CTRL_US"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z5.a f20859a;

    public enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = h(zArr, i10 << 3);
        }
        return bArr;
    }

    public static String f(boolean[] zArr) {
        int length = zArr.length;
        Table table = Table.UPPER;
        StringBuilder sb2 = new StringBuilder(20);
        Table tableG = table;
        int i10 = 0;
        while (i10 < length) {
            if (table != Table.BINARY) {
                int i11 = table == Table.DIGIT ? 4 : 5;
                if (length - i10 < i11) {
                    break;
                }
                int i12 = i(zArr, i10, i11);
                i10 += i11;
                String strE = e(table, i12);
                if (strE.startsWith("CTRL_")) {
                    tableG = g(strE.charAt(5));
                    if (strE.charAt(6) != 'L') {
                        tableG = table;
                        table = tableG;
                    }
                } else {
                    sb2.append(strE);
                }
                table = tableG;
            } else {
                if (length - i10 < 5) {
                    break;
                }
                int i13 = i(zArr, i10, 5);
                i10 += 5;
                if (i13 == 0) {
                    if (length - i10 < 11) {
                        break;
                    }
                    i13 = i(zArr, i10, 11) + 31;
                    i10 += 11;
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    if (length - i10 < 8) {
                        i10 = length;
                        break;
                    }
                    sb2.append((char) i(zArr, i10, 8));
                    i10 += 8;
                }
                table = tableG;
            }
        }
        return sb2.toString();
    }

    public static byte h(boolean[] zArr, int i10) {
        int length = zArr.length - i10;
        return (byte) (length >= 8 ? i(zArr, i10, 8) : i(zArr, i10, length) << (8 - length));
    }

    public static int i(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    public static int j(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 << 4)) * i10;
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20861a;

        static {
            int[] iArr = new int[Table.values().length];
            f20861a = iArr;
            try {
                iArr[Table.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20861a[Table.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20861a[Table.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20861a[Table.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20861a[Table.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static String e(Table table, int i10) {
        int i11 = a.f20861a[table.ordinal()];
        if (i11 == 1) {
            return f20854b[i10];
        }
        if (i11 == 2) {
            return f20855c[i10];
        }
        if (i11 == 3) {
            return f20856d[i10];
        }
        if (i11 == 4) {
            return f20857e[i10];
        }
        if (i11 == 5) {
            return f20858f[i10];
        }
        throw new IllegalStateException("Bad table");
    }

    public static Table g(char c10) {
        if (c10 == 'B') {
            return Table.BINARY;
        }
        if (c10 == 'D') {
            return Table.DIGIT;
        }
        if (c10 == 'P') {
            return Table.PUNCT;
        }
        if (c10 != 'L') {
            return c10 != 'M' ? Table.UPPER : Table.MIXED;
        }
        return Table.LOWER;
    }

    public final boolean[] b(boolean[] zArr) throws FormatException {
        e6.a aVar;
        int i10 = 8;
        if (this.f20859a.d() <= 2) {
            i10 = 6;
            aVar = e6.a.f52435j;
        } else if (this.f20859a.d() <= 8) {
            aVar = e6.a.f52439n;
        } else if (this.f20859a.d() <= 22) {
            i10 = 10;
            aVar = e6.a.f52434i;
        } else {
            i10 = 12;
            aVar = e6.a.f52433h;
        }
        int iC = this.f20859a.c();
        int length = zArr.length / i10;
        if (length < iC) {
            throw FormatException.getFormatInstance();
        }
        int length2 = zArr.length % i10;
        int[] iArr = new int[length];
        int i11 = 0;
        while (i11 < length) {
            iArr[i11] = i(zArr, length2, i10);
            i11++;
            length2 += i10;
        }
        try {
            new c(aVar).a(iArr, length - iC);
            int i12 = (1 << i10) - 1;
            int i13 = 0;
            for (int i14 = 0; i14 < iC; i14++) {
                int i15 = iArr[i14];
                if (i15 == 0 || i15 == i12) {
                    throw FormatException.getFormatInstance();
                }
                if (i15 == 1 || i15 == i12 - 1) {
                    i13++;
                }
            }
            boolean[] zArr2 = new boolean[(iC * i10) - i13];
            int i16 = 0;
            for (int i17 = 0; i17 < iC; i17++) {
                int i18 = iArr[i17];
                if (i18 == 1 || i18 == i12 - 1) {
                    Arrays.fill(zArr2, i16, (i16 + i10) - 1, i18 > 1);
                    i16 += i10 - 1;
                } else {
                    int i19 = i10 - 1;
                    while (i19 >= 0) {
                        int i20 = i16 + 1;
                        zArr2[i16] = ((1 << i19) & i18) != 0;
                        i19--;
                        i16 = i20;
                    }
                }
            }
            return zArr2;
        } catch (ReedSolomonException e10) {
            throw FormatException.getFormatInstance(e10);
        }
    }

    public d c(z5.a aVar) throws FormatException {
        this.f20859a = aVar;
        boolean[] zArrB = b(d(aVar.a()));
        d dVar = new d(a(zArrB), f(zArrB), null, null);
        dVar.l(zArrB.length);
        return dVar;
    }

    public final boolean[] d(b bVar) {
        boolean zE = this.f20859a.e();
        int iD = this.f20859a.d();
        int i10 = (zE ? 11 : 14) + (iD << 2);
        int[] iArr = new int[i10];
        boolean[] zArr = new boolean[j(iD, zE)];
        int i11 = 2;
        if (zE) {
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = i12;
            }
        } else {
            int i13 = i10 / 2;
            int i14 = ((i10 + 1) + (((i13 - 1) / 15) * 2)) / 2;
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = (i15 / 15) + i15;
                iArr[(i13 - i15) - 1] = (i14 - i16) - 1;
                iArr[i13 + i15] = i16 + i14 + 1;
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < iD) {
            int i19 = ((iD - i17) << i11) + (zE ? 9 : 12);
            int i20 = i17 << 1;
            int i21 = (i10 - 1) - i20;
            int i22 = 0;
            while (i22 < i19) {
                int i23 = i22 << 1;
                int i24 = 0;
                while (i24 < i11) {
                    int i25 = i20 + i24;
                    int i26 = i20 + i22;
                    zArr[i18 + i23 + i24] = bVar.d(iArr[i25], iArr[i26]);
                    int i27 = iArr[i26];
                    int i28 = i21 - i24;
                    zArr[(i19 * 2) + i18 + i23 + i24] = bVar.d(i27, iArr[i28]);
                    int i29 = i21 - i22;
                    zArr[(i19 * 4) + i18 + i23 + i24] = bVar.d(iArr[i28], iArr[i29]);
                    zArr[(i19 * 6) + i18 + i23 + i24] = bVar.d(iArr[i29], iArr[i25]);
                    i24++;
                    iD = iD;
                    zE = zE;
                    i11 = 2;
                }
                i22++;
                i11 = 2;
            }
            i18 += i19 << 3;
            i17++;
            i11 = 2;
        }
        return zArr;
    }
}
