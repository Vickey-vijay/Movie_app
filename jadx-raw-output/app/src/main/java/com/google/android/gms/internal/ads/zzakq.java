package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzakq {
    public static void zza(int i10, @Nullable zzap zzapVar, zzt zztVar, @Nullable zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(-9223372036854775807L, new zzao[0]);
        }
        if (zzapVar != null) {
            zzguf zzgufVarZzd = zzapVar.zzd(zzfs.class);
            int size = zzgufVarZzd.size();
            for (int i11 = 0; i11 < size; i11++) {
                zzfs zzfsVar = (zzfs) zzgufVarZzd.get(i11);
                if (!zzfsVar.zza.equals("com.android.capture.fps") || i10 == 2) {
                    zzapVar2 = zzapVar2.zzg(zzfsVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzk(zzapVar2);
        }
    }

    public static void zzb(int i10, zzafn zzafnVar, zzt zztVar) {
        if (i10 == 1 && zzafnVar.zzb()) {
            zztVar.zzH(zzafnVar.zza);
            zztVar.zzI(zzafnVar.zzb);
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0286 A[Catch: all -> 0x01fe, TryCatch #0 {all -> 0x01fe, blocks: (B:9:0x0030, B:11:0x003b, B:13:0x0047, B:16:0x0053, B:19:0x0060, B:22:0x006d, B:25:0x007a, B:28:0x0087, B:30:0x0093, B:37:0x00ac, B:38:0x00ca, B:39:0x00dd, B:42:0x00e9, B:45:0x00f6, B:48:0x0103, B:51:0x0110, B:54:0x011d, B:57:0x012a, B:60:0x0137, B:63:0x0144, B:66:0x0151, B:69:0x0161, B:73:0x0175, B:75:0x017b, B:77:0x0190, B:78:0x0197, B:80:0x019e, B:85:0x01a9, B:90:0x01b5, B:136:0x0286, B:91:0x01ca, B:93:0x01d1, B:95:0x01dd, B:96:0x01f1, B:111:0x021e, B:114:0x022b, B:117:0x0238, B:120:0x0245, B:123:0x0251, B:126:0x025d, B:129:0x0267, B:132:0x0273, B:135:0x027f, B:137:0x02a3, B:138:0x02aa), top: B:143:0x0022 }] */
    @Nullable
    public static zzao zzc(zzer zzerVar) {
        String str;
        zzao zzaidVar;
        int iZzg = zzerVar.zzg() + zzerVar.zzB();
        int iZzB = zzerVar.zzB();
        int i10 = (iZzB >> 24) & 255;
        zzao zzaoVarZzd = null;
        try {
            if (i10 != 169 && i10 != 253) {
                if (iZzB == 1735291493) {
                    String strZza = zzaio.zza(zzf(zzerVar) - 1);
                    if (strZza != null) {
                        zzaidVar = new zzais("TCON", null, zzguf.zzj(strZza));
                        zzaoVarZzd = zzaidVar;
                    } else {
                        zzee.zzc("MetadataUtil", "Failed to parse standard genre code");
                    }
                } else if (iZzB == 1684632427) {
                    zzaoVarZzd = zzg(1684632427, "TPOS", zzerVar);
                } else if (iZzB == 1953655662) {
                    zzaoVarZzd = zzg(1953655662, "TRCK", zzerVar);
                } else if (iZzB == 1953329263) {
                    zzaoVarZzd = zze(1953329263, "TBPM", zzerVar, true, false);
                } else if (iZzB == 1668311404) {
                    zzaoVarZzd = zze(1668311404, "TCMP", zzerVar, true, true);
                } else if (iZzB == 1668249202) {
                    int iZzB2 = zzerVar.zzB();
                    if (zzerVar.zzB() == 1684108385) {
                        int iZzB3 = zzerVar.zzB();
                        int i11 = zzakh.zza;
                        int i12 = iZzB3 & ViewCompat.MEASURED_SIZE_MASK;
                        if (i12 == 13) {
                            str = "image/jpeg";
                        } else if (i12 == 14) {
                            str = "image/png";
                            i12 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 30);
                            sb2.append("Unrecognized cover art flags: ");
                            sb2.append(i12);
                            zzee.zzc("MetadataUtil", sb2.toString());
                        } else {
                            zzerVar.zzk(4);
                            int i13 = iZzB2 - 16;
                            byte[] bArr = new byte[i13];
                            zzerVar.zzm(bArr, 0, i13);
                            zzaidVar = new zzaid(str, null, 3, bArr);
                            zzaoVarZzd = zzaidVar;
                        }
                    } else {
                        zzee.zzc("MetadataUtil", "Failed to parse cover art attribute");
                    }
                } else if (iZzB == 1631670868) {
                    zzaoVarZzd = zzd(1631670868, "TPE2", zzerVar);
                } else if (iZzB == 1936682605) {
                    zzaoVarZzd = zzd(1936682605, "TSOT", zzerVar);
                } else if (iZzB == 1936679276) {
                    zzaoVarZzd = zzd(1936679276, "TSOA", zzerVar);
                } else if (iZzB == 1936679282) {
                    zzaoVarZzd = zzd(1936679282, "TSOP", zzerVar);
                } else if (iZzB == 1936679265) {
                    zzaoVarZzd = zzd(1936679265, "TSO2", zzerVar);
                } else if (iZzB == 1936679791) {
                    zzaoVarZzd = zzd(1936679791, "TSOC", zzerVar);
                } else if (iZzB == 1920233063) {
                    zzaoVarZzd = zze(1920233063, "ITUNESADVISORY", zzerVar, false, false);
                } else if (iZzB == 1885823344) {
                    zzaoVarZzd = zze(1885823344, "ITUNESGAPLESS", zzerVar, false, true);
                } else if (iZzB == 1936683886) {
                    zzaoVarZzd = zzd(1936683886, "TVSHOWSORT", zzerVar);
                } else if (iZzB == 1953919848) {
                    zzaoVarZzd = zzd(1953919848, "TVSHOW", zzerVar);
                } else if (iZzB == 757935405) {
                    String strZzL = null;
                    String strZzL2 = null;
                    int i14 = -1;
                    int i15 = -1;
                    while (zzerVar.zzg() < iZzg) {
                        int iZzg2 = zzerVar.zzg();
                        int iZzB4 = zzerVar.zzB();
                        int iZzB5 = zzerVar.zzB();
                        zzerVar.zzk(4);
                        if (iZzB5 == 1835360622) {
                            strZzL = zzerVar.zzL(iZzB4 - 12);
                        } else {
                            int i16 = iZzB4 - 12;
                            if (iZzB5 == 1851878757) {
                                strZzL2 = zzerVar.zzL(i16);
                            } else {
                                if (iZzB5 == 1684108385) {
                                    i15 = iZzB4;
                                }
                                if (iZzB5 == 1684108385) {
                                    i14 = iZzg2;
                                }
                                zzerVar.zzk(i16);
                            }
                        }
                    }
                    if (strZzL != null && strZzL2 != null && i14 != -1) {
                        zzerVar.zzh(i14);
                        zzerVar.zzk(16);
                        zzaoVarZzd = new zzaip(strZzL, strZzL2, zzerVar.zzL(i15 - 16));
                    }
                } else {
                    String strZze = zzfw.zze(iZzB);
                    StringBuilder sb3 = new StringBuilder(strZze.length() + 32);
                    sb3.append("Skipped unknown metadata entry: ");
                    sb3.append(strZze);
                    zzee.zza("MetadataUtil", sb3.toString());
                }
            } else {
                int i17 = iZzB & ViewCompat.MEASURED_SIZE_MASK;
                if (i17 == 6516084) {
                    int iZzB6 = zzerVar.zzB();
                    if (zzerVar.zzB() == 1684108385) {
                        zzerVar.zzk(8);
                        String strZzL3 = zzerVar.zzL(iZzB6 - 16);
                        zzaoVarZzd = new zzaih("und", strZzL3, strZzL3);
                    } else {
                        zzee.zzc("MetadataUtil", "Failed to parse comment attribute: ".concat(zzfw.zze(iZzB)));
                    }
                } else if (i17 != 7233901 && i17 != 7631467) {
                    if (i17 != 6516589 && i17 != 7828084) {
                        if (i17 == 6578553) {
                            zzaoVarZzd = zzd(iZzB, "TDRC", zzerVar);
                        } else if (i17 == 4280916) {
                            zzaoVarZzd = zzd(iZzB, "TPE1", zzerVar);
                        } else if (i17 == 7630703) {
                            zzaoVarZzd = zzd(iZzB, "TSSE", zzerVar);
                        } else if (i17 == 6384738) {
                            zzaoVarZzd = zzd(iZzB, "TALB", zzerVar);
                        } else if (i17 == 7108978) {
                            zzaoVarZzd = zzd(iZzB, "USLT", zzerVar);
                        } else if (i17 == 6776174) {
                            zzaoVarZzd = zzd(iZzB, "TCON", zzerVar);
                        } else if (i17 == 6779504) {
                            zzaoVarZzd = zzd(iZzB, "TIT1", zzerVar);
                        } else if (i17 == 7173742) {
                            zzaoVarZzd = zzd(iZzB, "MVNM", zzerVar);
                        } else if (i17 == 7173737) {
                            zzaoVarZzd = zze(iZzB, "MVIN", zzerVar, true, false);
                        } else {
                            String strZze2 = zzfw.zze(iZzB);
                            StringBuilder sb4 = new StringBuilder(strZze2.length() + 32);
                            sb4.append("Skipped unknown metadata entry: ");
                            sb4.append(strZze2);
                            zzee.zza("MetadataUtil", sb4.toString());
                        }
                    } else {
                        zzaoVarZzd = zzd(iZzB, "TCOM", zzerVar);
                    }
                } else {
                    zzaoVarZzd = zzd(iZzB, "TIT2", zzerVar);
                }
            }
            zzerVar.zzh(iZzg);
            return zzaoVarZzd;
        } catch (Throwable th2) {
            zzerVar.zzh(iZzg);
            throw th2;
        }
    }

    @Nullable
    private static zzais zzd(int i10, String str, zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            return new zzais(str, null, zzguf.zzj(zzerVar.zzL(iZzB - 16)));
        }
        zzee.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzfw.zze(i10)));
        return null;
    }

    @Nullable
    private static zzain zze(int i10, String str, zzer zzerVar, boolean z10, boolean z11) {
        int iZzf = zzf(zzerVar);
        if (z11) {
            iZzf = Math.min(1, iZzf);
        }
        if (iZzf >= 0) {
            if (z10) {
                return new zzais(str, null, zzguf.zzj(Integer.toString(iZzf)));
            }
            return new zzaih("und", str, Integer.toString(iZzf));
        }
        zzee.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzfw.zze(i10)));
        return null;
    }

    private static int zzf(zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            int i10 = iZzB - 16;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 && (zzerVar.zzn() & 128) == 0) {
                            return zzerVar.zzH();
                        }
                    } else {
                        return zzerVar.zzx();
                    }
                } else {
                    return zzerVar.zzt();
                }
            } else {
                return zzerVar.zzs();
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    @Nullable
    private static zzais zzg(int i10, String str, zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385 && iZzB >= 22) {
            zzerVar.zzk(10);
            int iZzt = zzerVar.zzt();
            if (iZzt > 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzt).length());
                sb2.append(iZzt);
                String string = sb2.toString();
                int iZzt2 = zzerVar.zzt();
                if (iZzt2 > 0) {
                    StringBuilder sb3 = new StringBuilder(string.length() + 1 + String.valueOf(iZzt2).length());
                    sb3.append(string);
                    sb3.append("/");
                    sb3.append(iZzt2);
                    string = sb3.toString();
                }
                return new zzais(str, null, zzguf.zzj(string));
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzfw.zze(i10)));
        return null;
    }
}
