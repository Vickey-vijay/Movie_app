package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzagx implements zzagq {
    public final zzguf zza;
    private final int zzb;

    private zzagx(int i10, zzguf zzgufVar) {
        this.zzb = i10;
        this.zza = zzgufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagq
    public final int zza() {
        return this.zzb;
    }

    public static zzagx zzb(int i10, zzer zzerVar) {
        String str;
        String str2;
        zzguc zzgucVar = new zzguc();
        int iZze = zzerVar.zze();
        int iZzc = -2;
        while (zzerVar.zzd() > 8) {
            int iZzC = zzerVar.zzC();
            int iZzg = zzerVar.zzg() + zzerVar.zzC();
            zzerVar.zzf(iZzg);
            zzagq zzagyVar = null;
            if (iZzC != 1414744396) {
                switch (iZzC) {
                    case 1718776947:
                        if (iZzc == 2) {
                            zzerVar.zzk(4);
                            int iZzC2 = zzerVar.zzC();
                            int iZzC3 = zzerVar.zzC();
                            zzerVar.zzk(4);
                            int iZzC4 = zzerVar.zzC();
                            switch (iZzC4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                zzt zztVar = new zzt();
                                zztVar.zzt(iZzC2);
                                zztVar.zzu(iZzC3);
                                zztVar.zzm(str2);
                                zzagyVar = new zzagy(zztVar.zzM());
                            } else {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzC4).length() + 44);
                                sb2.append("Ignoring track with unsupported compression ");
                                sb2.append(iZzC4);
                                zzee.zzc("StreamFormatChunk", sb2.toString());
                            }
                        } else if (iZzc != 1) {
                            zzee.zzc("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfj.zzP(iZzc)));
                        } else {
                            int iZzu = zzerVar.zzu();
                            if (iZzu == 1) {
                                str = "audio/raw";
                            } else if (iZzu == 85) {
                                str = "audio/mpeg";
                            } else if (iZzu == 255) {
                                str = "audio/mp4a-latm";
                            } else if (iZzu != 8192) {
                                str = iZzu != 8193 ? null : "audio/vnd.dts";
                            } else {
                                str = "audio/ac3";
                            }
                            if (str != null) {
                                int iZzu2 = zzerVar.zzu();
                                int iZzC5 = zzerVar.zzC();
                                zzerVar.zzk(6);
                                int iZzz = zzfj.zzz(zzerVar.zzu(), ByteOrder.LITTLE_ENDIAN);
                                int iZzu3 = zzerVar.zzd() > 0 ? zzerVar.zzu() : 0;
                                zzt zztVar2 = new zzt();
                                zztVar2.zzm(str);
                                zztVar2.zzE(iZzu2);
                                zztVar2.zzF(iZzC5);
                                if (str.equals("audio/raw") && iZzz != 0) {
                                    zztVar2.zzG(iZzz);
                                }
                                if (str.equals("audio/mp4a-latm") && iZzu3 > 0) {
                                    byte[] bArr = new byte[iZzu3];
                                    zzerVar.zzm(bArr, 0, iZzu3);
                                    zztVar2.zzp(zzguf.zzj(bArr));
                                }
                                zzagyVar = new zzagy(zztVar2.zzM());
                            } else {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(iZzu).length() + 43);
                                sb3.append("Ignoring track with unsupported format tag ");
                                sb3.append(iZzu);
                                zzee.zzc("StreamFormatChunk", sb3.toString());
                            }
                        }
                        break;
                    case 1751742049:
                        zzagyVar = zzagu.zzb(zzerVar);
                        break;
                    case 1752331379:
                        zzagyVar = zzagv.zzb(zzerVar);
                        break;
                    case 1852994675:
                        zzagyVar = zzagz.zzb(zzerVar);
                        break;
                }
            } else {
                zzagyVar = zzb(zzerVar.zzC(), zzerVar);
            }
            if (zzagyVar != null) {
                if (zzagyVar.zza() == 1752331379) {
                    iZzc = ((zzagv) zzagyVar).zzc();
                }
                zzgucVar.zzf(zzagyVar);
            }
            zzerVar.zzh(iZzg);
            zzerVar.zzf(iZze);
        }
        return new zzagx(i10, zzgucVar.zzi());
    }

    @Nullable
    public final zzagq zzc(Class cls) {
        zzguf zzgufVar = this.zza;
        int size = zzgufVar.size();
        int i10 = 0;
        while (i10 < size) {
            zzagq zzagqVar = (zzagq) zzgufVar.get(i10);
            i10++;
            if (zzagqVar.getClass() == cls) {
                return zzagqVar;
            }
        }
        return null;
    }
}
