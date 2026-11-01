package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaim {
    public static final zzaij zza = new zzaij() { // from class: com.google.android.gms.internal.ads.zzaik
    };

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15501. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @androidx.annotation.Nullable
    private static com.google.android.gms.internal.ads.zzain zzc(int r35, com.google.android.gms.internal.ads.zzer r36, boolean r37, int r38, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzaij r39) {
        /*
            Method dump skipped, instruction units count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaim.zzc(int, com.google.android.gms.internal.ads.zzer, boolean, int, com.google.android.gms.internal.ads.zzaij):com.google.android.gms.internal.ads.zzain");
    }

    private static zzguf zzd(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return zzguf.zzj("");
        }
        int i12 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        int iZzh = zzh(bArr, i11, i10);
        while (i11 < iZzh) {
            zzgucVar.zzf(new String(bArr, i11, iZzh - i11, zzf(i10)));
            i11 = zzj(i10) + iZzh;
            iZzh = zzh(bArr, i11, i10);
        }
        zzguf zzgufVarZzi = zzgucVar.zzi();
        return zzgufVarZzi.isEmpty() ? zzguf.zzj("") : zzgufVarZzi;
    }

    private static Charset zzf(int i10) {
        if (i10 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i10 != 2) {
            return i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    private static String zzg(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int zzi(byte[] bArr, int i10) {
        while (true) {
            int length = bArr.length;
            if (i10 >= length) {
                return length;
            }
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
    }

    private static int zzj(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static String zzl(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:52:0x011c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116 A[SYNTHETIC] */
    @Nullable
    public static final zzap zza(byte[] bArr, int i10, zzaij zzaijVar, zzahw zzahwVar) {
        boolean z10;
        zzail zzailVar;
        int i11;
        boolean zZzb;
        int iZzc;
        zzain zzainVarZzc;
        ArrayList arrayList = new ArrayList();
        zzer zzerVar = new zzer(bArr, i10);
        boolean z11 = false;
        if (zzerVar.zzd() < 10) {
            zzee.zzc("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iZzx = zzerVar.zzx();
            if (iZzx == 4801587) {
                int iZzs = zzerVar.zzs();
                zzerVar.zzk(1);
                int iZzs2 = zzerVar.zzs();
                int iZzG = zzerVar.zzG();
                if (iZzs != 2) {
                    if (iZzs == 3) {
                        if ((iZzs2 & 64) != 0) {
                            int iZzB = zzerVar.zzB();
                            zzerVar.zzk(iZzB);
                            iZzG -= iZzB + 4;
                        }
                    } else if (iZzs == 4) {
                        if ((iZzs2 & 64) != 0) {
                            int iZzG2 = zzerVar.zzG();
                            zzerVar.zzk(iZzG2 - 4);
                            iZzG -= iZzG2;
                        }
                        if ((iZzs2 & 16) != 0) {
                            iZzG -= 10;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzs).length() + 46);
                        sb2.append("Skipped ID3 tag with unsupported majorVersion=");
                        sb2.append(iZzs);
                        zzee.zzc("Id3Decoder", sb2.toString());
                    }
                    if (iZzs < 4) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    zzailVar = new zzail(iZzs, z10, iZzG);
                } else if ((iZzs2 & 64) != 0) {
                    zzee.zzc("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iZzs < 4 || (iZzs2 & 128) == 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zzailVar = new zzail(iZzs, z10, iZzG);
                }
                if (zzailVar == null) {
                    return null;
                }
                int iZzg = zzerVar.zzg();
                i11 = zzailVar.zza() == 2 ? 6 : 10;
                zZzb = zzailVar.zzb();
                iZzc = zzailVar.zzc();
                if (zZzb) {
                    iZzc = zze(zzerVar, zzailVar.zzc());
                }
                zzerVar.zzf(iZzg + iZzc);
                if (!zzb(zzerVar, zzailVar.zza(), i11, false)) {
                    if (zzailVar.zza() == 4 || !zzb(zzerVar, 4, i11, true)) {
                        int iZza = zzailVar.zza();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iZza).length() + 45);
                        sb3.append("Failed to validate ID3 tag with majorVersion=");
                        sb3.append(iZza);
                        zzee.zzc("Id3Decoder", sb3.toString());
                        return null;
                    }
                    z11 = true;
                }
                while (zzerVar.zzd() >= i11) {
                    zzainVarZzc = zzc(zzailVar.zza(), zzerVar, z11, i11, zzaijVar);
                    if (zzainVarZzc != null) {
                        arrayList.add(zzainVarZzc);
                    }
                }
                return new zzap(arrayList);
            }
            zzee.zzc("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", Integer.valueOf(iZzx)))));
        }
        zzailVar = null;
        if (zzailVar == null) {
            return null;
        }
        int iZzg2 = zzerVar.zzg();
        if (zzailVar.zza() == 2) {
        }
        zZzb = zzailVar.zzb();
        iZzc = zzailVar.zzc();
        if (zZzb) {
            iZzc = zze(zzerVar, zzailVar.zzc());
        }
        zzerVar.zzf(iZzg2 + iZzc);
        if (!zzb(zzerVar, zzailVar.zza(), i11, false)) {
            if (zzailVar.zza() == 4) {
            }
            int iZza2 = zzailVar.zza();
            StringBuilder sb4 = new StringBuilder(String.valueOf(iZza2).length() + 45);
            sb4.append("Failed to validate ID3 tag with majorVersion=");
            sb4.append(iZza2);
            zzee.zzc("Id3Decoder", sb4.toString());
            return null;
        }
        while (zzerVar.zzd() >= i11) {
            zzainVarZzc = zzc(zzailVar.zza(), zzerVar, z11, i11, zzaijVar);
            if (zzainVarZzc != null) {
                arrayList.add(zzainVarZzc);
            }
        }
        return new zzap(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0008, B:7:0x0015, B:18:0x003d, B:21:0x0048, B:23:0x006a, B:27:0x0070, B:39:0x008c, B:40:0x008e, B:43:0x0094, B:46:0x009e, B:29:0x007a, B:33:0x0081, B:8:0x0022), top: B:53:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x007a A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0008, B:7:0x0015, B:18:0x003d, B:21:0x0048, B:23:0x006a, B:27:0x0070, B:39:0x008c, B:40:0x008e, B:43:0x0094, B:46:0x009e, B:29:0x007a, B:33:0x0081, B:8:0x0022), top: B:53:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0008, B:7:0x0015, B:18:0x003d, B:21:0x0048, B:23:0x006a, B:27:0x0070, B:39:0x008c, B:40:0x008e, B:43:0x0094, B:46:0x009e, B:29:0x007a, B:33:0x0081, B:8:0x0022), top: B:53:0x0008 }] */
    private static boolean zzb(zzer zzerVar, int i10, int i11, boolean z10) {
        boolean z11;
        int iZzx;
        long jZzx;
        int iZzt;
        int i12;
        int iZzg = zzerVar.zzg();
        while (true) {
            try {
                z11 = true;
                z11 = true;
                int i13 = 1;
                int i14 = 1;
                if (zzerVar.zzd() >= i11) {
                    if (i10 >= 3) {
                        iZzx = zzerVar.zzB();
                        jZzx = zzerVar.zzz();
                        iZzt = zzerVar.zzt();
                    } else {
                        iZzx = zzerVar.zzx();
                        jZzx = zzerVar.zzx();
                        iZzt = 0;
                    }
                    if (iZzx != 0 || jZzx != 0 || iZzt != 0) {
                        if (i10 != 4 || z10) {
                            if (i10 == 4) {
                                if ((iZzt & 64) != 0) {
                                    i13 = 0;
                                }
                                int i15 = i13;
                                i14 = iZzt & 1;
                                i12 = i15;
                            } else if (i10 == 3) {
                                if ((iZzt & 32) != 0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if ((iZzt & 128) != 0) {
                                    i14 = 0;
                                }
                            } else {
                                i12 = 0;
                                i14 = 0;
                            }
                            if (i14 != 0) {
                                i12 += 4;
                            }
                            if (jZzx >= i12 && zzerVar.zzd() >= jZzx) {
                                zzerVar.zzk((int) jZzx);
                            }
                        } else if ((8421504 & jZzx) == 0) {
                            long j10 = ((jZzx >> 16) & 255) << 14;
                            jZzx = ((jZzx >> 24) << 21) | j10 | (jZzx & 255) | (((jZzx >> 8) & 255) << 7);
                            if (i10 == 4) {
                                if ((iZzt & 64) != 0) {
                                    i13 = 0;
                                }
                                int i16 = i13;
                                i14 = iZzt & 1;
                                i12 = i16;
                            } else if (i10 == 3) {
                                if ((iZzt & 32) != 0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if ((iZzt & 128) != 0) {
                                    i14 = 0;
                                }
                            } else {
                                i12 = 0;
                                i14 = 0;
                            }
                            if (i14 != 0) {
                                i12 += 4;
                            }
                            if (jZzx >= i12) {
                                zzerVar.zzk((int) jZzx);
                            }
                        }
                        z11 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (Throwable th2) {
                zzerVar.zzh(iZzg);
                throw th2;
            }
        }
        zzerVar.zzh(iZzg);
        return z11;
    }

    private static byte[] zzk(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? zzfj.zzb : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static int zze(zzer zzerVar, int i10) {
        byte[] bArrZzi = zzerVar.zzi();
        int iZzg = zzerVar.zzg();
        int i11 = iZzg;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < iZzg + i10) {
                if ((bArrZzi[i11] & 255) == 255 && bArrZzi[i12] == 0) {
                    System.arraycopy(bArrZzi, i11 + 2, bArrZzi, i12, (i10 - (i11 - iZzg)) - 2);
                    i10--;
                }
                i11 = i12;
            } else {
                return i10;
            }
        }
    }

    private static int zzh(byte[] bArr, int i10, int i11) {
        int iZzi = zzi(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iZzi;
        }
        while (true) {
            int length = bArr.length;
            if (iZzi < length - 1) {
                int i12 = iZzi + 1;
                if ((iZzi - i10) % 2 == 0 && bArr[i12] == 0) {
                    return iZzi;
                }
                iZzi = zzi(bArr, i12);
            } else {
                return length;
            }
        }
    }
}
