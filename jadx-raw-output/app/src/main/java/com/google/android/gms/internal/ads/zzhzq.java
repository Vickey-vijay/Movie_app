package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhzq implements Closeable {
    private final Reader zzb;
    private long zzi;
    private int zzj;
    private int[] zzk;
    private String[] zzm;
    private int[] zzn;
    private zzhyq zzc = zzhyq.LEGACY_STRICT;
    private final char[] zzd = new char[1024];
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    private int zzh = 0;
    public int zza = 0;
    private int zzl = 1;

    static {
        zzhyt.zza = new zzhzp();
    }

    private final String zzo(char c10) throws IOException {
        char[] cArr;
        int i10;
        StringBuilder sb2 = null;
        do {
            int i11 = this.zze;
            int i12 = this.zzf;
            int i13 = i11;
            while (true) {
                cArr = this.zzd;
                if (i11 < i12) {
                    int i14 = i11 + 1;
                    char c11 = cArr[i11];
                    zzhyq zzhyqVar = this.zzc;
                    zzhyq zzhyqVar2 = zzhyq.STRICT;
                    if (zzhyqVar == zzhyqVar2 && c11 < ' ') {
                        throw zzv("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                    }
                    if (c11 == c10) {
                        int i15 = (i14 - i13) - 1;
                        this.zze = i14;
                        if (sb2 == null) {
                            return new String(cArr, i13, i15);
                        }
                        sb2.append(cArr, i13, i15);
                        return sb2.toString();
                    }
                    char c12 = '\n';
                    if (c11 == '\\') {
                        int i16 = (i14 - i13) - 1;
                        this.zze = i14;
                        if (sb2 == null) {
                            int i17 = i16 + 1;
                            sb2 = new StringBuilder(Math.max(i17 + i17, 16));
                        }
                        sb2.append(cArr, i13, i16);
                        if (this.zze == this.zzf && !zzr(1)) {
                            throw zzv("Unterminated escape sequence");
                        }
                        int i18 = this.zze;
                        int i19 = i18 + 1;
                        this.zze = i19;
                        char c13 = cArr[i18];
                        if (c13 != '\n') {
                            if (c13 == '\"') {
                                c12 = c13;
                            } else {
                                if (c13 != '\'') {
                                    if (c13 != '/' && c13 != '\\') {
                                        if (c13 == 'b') {
                                            c12 = '\b';
                                        } else if (c13 == 'f') {
                                            c12 = '\f';
                                        } else if (c13 != 'n') {
                                            if (c13 == 'r') {
                                                c12 = '\r';
                                            } else if (c13 == 't') {
                                                c12 = '\t';
                                            } else {
                                                if (c13 != 'u') {
                                                    throw zzv("Invalid escape sequence");
                                                }
                                                if (i19 + 4 > this.zzf && !zzr(4)) {
                                                    throw zzv("Unterminated escape sequence");
                                                }
                                                int i20 = this.zze;
                                                int i21 = i20 + 4;
                                                int i22 = 0;
                                                while (i20 < i21) {
                                                    int i23 = i22 << 4;
                                                    char c14 = cArr[i20];
                                                    if (c14 >= '0' && c14 <= '9') {
                                                        i10 = c14 - '0';
                                                    } else if (c14 >= 'a' && c14 <= 'f') {
                                                        i10 = c14 - 'W';
                                                    } else {
                                                        if (c14 < 'A' || c14 > 'F') {
                                                            throw zzv("Malformed Unicode escape \\u".concat(new String(cArr, this.zze, 4)));
                                                        }
                                                        i10 = c14 - '7';
                                                    }
                                                    i22 = i23 + i10;
                                                    i20++;
                                                }
                                                this.zze += 4;
                                                c12 = (char) i22;
                                            }
                                        }
                                    }
                                }
                                c12 = c13;
                            }
                            sb2.append(c12);
                            i13 = this.zze;
                            i12 = this.zzf;
                            i11 = i13;
                        } else {
                            if (this.zzc == zzhyqVar2) {
                                throw zzv("Cannot escape a newline character in strict mode");
                            }
                            this.zzg++;
                            this.zzh = i19;
                        }
                        if (this.zzc == zzhyqVar2) {
                            throw zzv("Invalid escaped character \"'\" in strict mode");
                        }
                        c12 = c13;
                        sb2.append(c12);
                        i13 = this.zze;
                        i12 = this.zzf;
                        i11 = i13;
                    } else {
                        if (c11 == '\n') {
                            this.zzg++;
                            this.zzh = i14;
                        }
                        i11 = i14;
                    }
                }
            }
            int i24 = i11 - i13;
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max(i24 + i24, 16));
            }
            sb2.append(cArr, i13, i24);
            this.zze = i11;
        } while (zzr(1));
        throw zzv("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    private final String zzp() throws IOException {
        String string;
        int i10 = 0;
        StringBuilder sb2 = null;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.zze + i11;
                if (i12 < this.zzf) {
                    char c10 = this.zzd[i12];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        zzt();
                    }
                    i10 = i11;
                } else if (i11 >= 1024) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(this.zzd, this.zze, i11);
                    this.zze += i11;
                    if (!zzr(1)) {
                    }
                } else if (!zzr(i11 + 1)) {
                    i10 = i11;
                }
                if (sb2 == null) {
                    string = new String(this.zzd, this.zze, i10);
                } else {
                    sb2.append(this.zzd, this.zze, i10);
                    string = sb2.toString();
                }
                this.zze += i10;
                return string;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza = 0;
        this.zzk[0] = 8;
        this.zzl = 1;
        this.zzb.close();
    }

    private final boolean zzn(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        zzt();
        return false;
    }

    private final void zzq(int i10) throws zzhzt {
        int i11 = this.zzl;
        if (i11 - 1 >= 1280) {
            String strZzl = zzl();
            StringBuilder sb2 = new StringBuilder(strZzl.length() + 26);
            sb2.append("Nesting limit 1280 reached");
            sb2.append(strZzl);
            throw new zzhzt(sb2.toString());
        }
        int[] iArr = this.zzk;
        if (i11 == iArr.length) {
            int i12 = i11 + i11;
            this.zzk = Arrays.copyOf(iArr, i12);
            this.zzn = Arrays.copyOf(this.zzn, i12);
            this.zzm = (String[]) Arrays.copyOf(this.zzm, i12);
        }
        int[] iArr2 = this.zzk;
        int i13 = this.zzl;
        this.zzl = i13 + 1;
        iArr2[i13] = i10;
    }

    private final boolean zzr(int i10) throws IOException {
        int i11;
        int i12 = this.zzh;
        int i13 = this.zze;
        this.zzh = i12 - i13;
        char[] cArr = this.zzd;
        int i14 = this.zzf;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.zzf = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.zzf = 0;
        }
        this.zze = 0;
        do {
            Reader reader = this.zzb;
            int i16 = this.zzf;
            int i17 = reader.read(cArr, i16, 1024 - i16);
            if (i17 == -1) {
                return false;
            }
            i11 = this.zzf + i17;
            this.zzf = i11;
            if (this.zzg == 0 && this.zzh == 0 && i11 > 0 && cArr[0] == 65279) {
                this.zze++;
                this.zzh = 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private final int zzs(boolean z10) throws IOException {
        int i10 = this.zze;
        int i11 = this.zzf;
        while (true) {
            if (i10 == i11) {
                this.zze = i10;
                if (!zzr(1)) {
                    if (z10) {
                        throw new EOFException("End of input".concat(zzl()));
                    }
                    return -1;
                }
                i10 = this.zze;
                i11 = this.zzf;
            }
            char[] cArr = this.zzd;
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.zzg++;
                this.zzh = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.zze = i12;
                    if (i12 == i11) {
                        this.zze = i12 - 1;
                        boolean zZzr = zzr(2);
                        this.zze++;
                        if (!zZzr) {
                            return 47;
                        }
                    }
                    zzt();
                    int i13 = this.zze;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.zze = i13 + 1;
                        while (true) {
                            if (this.zze + 2 > this.zzf && !zzr(2)) {
                                throw zzv("Unterminated comment");
                            }
                            int i14 = this.zze;
                            if (cArr[i14] != '\n') {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 2) {
                                        i10 = 2 + this.zze;
                                        i11 = this.zzf;
                                        break;
                                    }
                                    if (cArr[this.zze + i15] != "*/".charAt(i15)) {
                                        break;
                                    }
                                    i15++;
                                }
                            } else {
                                this.zzg++;
                                this.zzh = i14 + 1;
                            }
                            this.zze++;
                        }
                    } else {
                        if (c11 != '/') {
                            return 47;
                        }
                        this.zze = i13 + 1;
                        zzu();
                        i10 = this.zze;
                        i11 = this.zzf;
                    }
                } else {
                    if (c10 != '#') {
                        this.zze = i12;
                        return c10;
                    }
                    this.zze = i12;
                    zzt();
                    zzu();
                    i10 = this.zze;
                    i11 = this.zzf;
                }
            }
            i10 = i12;
        }
    }

    private final void zzt() throws zzhzt {
        if (this.zzc != zzhyq.LENIENT) {
            throw zzv("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void zzu() throws IOException {
        char c10;
        do {
            if (this.zze >= this.zzf && !zzr(1)) {
                return;
            }
            char[] cArr = this.zzd;
            int i10 = this.zze;
            int i11 = i10 + 1;
            this.zze = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.zzg++;
                this.zzh = i11;
                return;
            }
        } while (c10 != '\r');
    }

    private final zzhzt zzv(String str) throws zzhzt {
        String strZzl = zzl();
        StringBuilder sb2 = new StringBuilder(str.length() + strZzl.length() + 79);
        sb2.append(str);
        sb2.append(strZzl);
        sb2.append("\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        throw new zzhzt(sb2.toString());
    }

    public final String toString() {
        return zzhzq.class.getSimpleName().concat(zzl());
    }

    public final void zzb() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 3) {
            throw zzw("BEGIN_ARRAY");
        }
        zzq(1);
        this.zzn[this.zzl - 1] = 0;
        this.zza = 0;
    }

    public final void zzc() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 4) {
            throw zzw("END_ARRAY");
        }
        int i10 = this.zzl - 1;
        this.zzl = i10;
        int[] iArr = this.zzn;
        int i11 = i10 - 1;
        iArr[i11] = iArr[i11] + 1;
        this.zza = 0;
    }

    public final void zzd() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 1) {
            throw zzw("BEGIN_OBJECT");
        }
        zzq(3);
        this.zza = 0;
    }

    public final void zze() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 2) {
            throw zzw("END_OBJECT");
        }
        int i10 = this.zzl - 1;
        this.zzl = i10;
        this.zzm[i10] = null;
        int[] iArr = this.zzn;
        int i11 = i10 - 1;
        iArr[i11] = iArr[i11] + 1;
        this.zza = 0;
    }

    public final boolean zzf() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        return (iZzg == 2 || iZzg == 4 || iZzg == 17) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0164  */
    /* JADX WARN: Code duplicated, block: B:106:0x016c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0182  */
    /* JADX WARN: Code duplicated, block: B:114:0x0192  */
    /* JADX WARN: Code duplicated, block: B:117:0x0199  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:121:0x01aa A[PHI: r2 r4
  0x01aa: PHI (r2v38 int) = (r2v37 int), (r2v40 int) binds: [B:113:0x0190, B:120:0x01a4] A[DONT_GENERATE, DONT_INLINE]
  0x01aa: PHI (r4v10 int) = (r4v9 int), (r4v11 int) binds: [B:113:0x0190, B:120:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:165:0x0217  */
    /* JADX WARN: Code duplicated, block: B:166:0x0219  */
    /* JADX WARN: Code duplicated, block: B:168:0x021f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x0222  */
    /* JADX WARN: Code duplicated, block: B:173:0x022a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x022d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x0241 A[DONT_INVERT, PHI: r1 r9
  0x0241: PHI (r1v60 int) = (r1v59 int), (r1v64 int) binds: [B:164:0x0215, B:179:0x023f] A[DONT_GENERATE, DONT_INLINE]
  0x0241: PHI (r9v16 int) = (r9v6 int), (r9v17 int) binds: [B:164:0x0215, B:179:0x023f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:181:0x0243  */
    /* JADX WARN: Code duplicated, block: B:194:0x0266  */
    /* JADX WARN: Code duplicated, block: B:196:0x026c  */
    /* JADX WARN: Code duplicated, block: B:199:0x0271  */
    /* JADX WARN: Code duplicated, block: B:204:0x0281 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:205:0x0282  */
    /* JADX WARN: Code duplicated, block: B:207:0x028c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0294  */
    /* JADX WARN: Code duplicated, block: B:211:0x029b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:212:0x029c  */
    /* JADX WARN: Code duplicated, block: B:213:0x029f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:223:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:225:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:241:0x02f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:242:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:244:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:246:0x0309  */
    /* JADX WARN: Code duplicated, block: B:247:0x030c  */
    /* JADX WARN: Code duplicated, block: B:249:0x0311 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x0314  */
    /* JADX WARN: Code duplicated, block: B:253:0x0319  */
    /* JADX WARN: Code duplicated, block: B:255:0x0321  */
    /* JADX WARN: Code duplicated, block: B:264:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x0127  */
    /* JADX WARN: Code duplicated, block: B:91:0x0137  */
    /* JADX WARN: Code duplicated, block: B:93:0x013e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0147  */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x022a, code lost:
    
        if (r14 == 0) goto L177;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzg() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhzq.zzg():int");
    }

    public final String zzh() throws IOException {
        String strZzo;
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg == 14) {
            strZzo = zzp();
        } else if (iZzg == 12) {
            strZzo = zzo('\'');
        } else {
            if (iZzg != 13) {
                throw zzw("a name");
            }
            strZzo = zzo('\"');
        }
        this.zza = 0;
        this.zzm[this.zzl - 1] = strZzo;
        return strZzo;
    }

    public final String zzi() throws IOException {
        String string;
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg == 10) {
            string = zzp();
        } else if (iZzg == 8) {
            string = zzo('\'');
        } else if (iZzg == 9) {
            string = zzo('\"');
        } else if (iZzg == 11) {
            string = null;
        } else if (iZzg == 15) {
            string = Long.toString(this.zzi);
        } else {
            if (iZzg != 16) {
                throw zzw("a string");
            }
            String str = new String(this.zzd, this.zze, this.zzj);
            this.zze += this.zzj;
            string = str;
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i10 = this.zzl - 1;
        iArr[i10] = iArr[i10] + 1;
        return string;
    }

    public final boolean zzj() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg == 5) {
            this.zza = 0;
            int[] iArr = this.zzn;
            int i10 = this.zzl - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iZzg != 6) {
            throw zzw("a boolean");
        }
        this.zza = 0;
        int[] iArr2 = this.zzn;
        int i11 = this.zzl - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public final void zzk() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 7) {
            throw zzw("null");
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i10 = this.zzl - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final String zzl() {
        int i10 = this.zzg + 1;
        int i11 = this.zze - this.zzh;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        for (int i12 = 0; i12 < this.zzl; i12++) {
            int i13 = this.zzk[i12];
            switch (i13) {
                case 1:
                case 2:
                    int i14 = this.zzn[i12];
                    sb2.append('[');
                    sb2.append(i14);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.zzm[i12];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 21);
                    sb3.append("Unknown scope value: ");
                    sb3.append(i13);
                    throw new AssertionError(sb3.toString());
            }
        }
        int i15 = i11 + 1;
        String string = sb2.toString();
        StringBuilder sb4 = new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i15).length() + 6 + string.length());
        sb4.append(" at line ");
        sb4.append(i10);
        sb4.append(" column ");
        sb4.append(i15);
        sb4.append(" path ");
        sb4.append(string);
        return sb4.toString();
    }

    public final int zzm() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        switch (iZzg) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public zzhzq(Reader reader) {
        int[] iArr = new int[32];
        this.zzk = iArr;
        iArr[0] = 6;
        this.zzm = new String[32];
        this.zzn = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.zzb = reader;
    }

    private final IllegalStateException zzw(String str) throws IOException {
        String str2;
        int iZzm = zzm();
        String strZza = zzhzr.zza(zzm());
        String strZzl = zzl();
        int length = str.length() + 18 + strZza.length() + strZzl.length();
        if (iZzm == 9) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        String strConcat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2);
        StringBuilder sb2 = new StringBuilder(length + 5 + strConcat.length());
        sb2.append("Expected ");
        sb2.append(str);
        sb2.append(" but was ");
        sb2.append(strZza);
        sb2.append(strZzl);
        sb2.append("\nSee ");
        sb2.append(strConcat);
        return new IllegalStateException(sb2.toString());
    }

    public final void zza(zzhyq zzhyqVar) {
        Objects.requireNonNull(zzhyqVar);
        this.zzc = zzhyqVar;
    }
}
