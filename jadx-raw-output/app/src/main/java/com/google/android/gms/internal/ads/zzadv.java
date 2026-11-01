package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadv {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b10 = bArr[4];
            return zzf((b10 & 192) >> 6, b10 & 63);
        }
        int i10 = bArr[2] & 7;
        int i11 = ((bArr[3] & 255) | (i10 << 8)) + 1;
        return i11 + i11;
    }

    private static int zzf(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = zzc[i10];
        if (i13 == 44100) {
            int i14 = zzg[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = zzf[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }

    public static zzv zza(zzer zzerVar, String str, @Nullable String str2, @Nullable zzq zzqVar) {
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzerVar);
        int i10 = zzc[zzeqVar.zzj(2)];
        zzeqVar.zzh(8);
        int i11 = zze[zzeqVar.zzj(3)];
        if (zzeqVar.zzj(1) != 0) {
            i11++;
        }
        int i12 = zzf[zzeqVar.zzj(5)] * 1000;
        zzeqVar.zzm();
        zzerVar.zzh(zzeqVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzm("audio/ac3");
        zztVar.zzE(i11);
        zztVar.zzF(i10);
        zztVar.zzq(zzqVar);
        zztVar.zze(str2);
        zztVar.zzh(i12);
        zztVar.zzi(i12);
        return zztVar.zzM();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static zzv zzb(zzer zzerVar, String str, @Nullable String str2, @Nullable zzq zzqVar) {
        String str3;
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzerVar);
        int iZzj = zzeqVar.zzj(13) * 1000;
        zzeqVar.zzh(3);
        int i10 = zzc[zzeqVar.zzj(2)];
        zzeqVar.zzh(10);
        int i11 = zze[zzeqVar.zzj(3)];
        if (zzeqVar.zzj(1) != 0) {
            i11++;
        }
        zzeqVar.zzh(3);
        int iZzj2 = zzeqVar.zzj(4);
        zzeqVar.zzh(1);
        if (iZzj2 > 0) {
            zzeqVar.zzh(6);
            if (zzeqVar.zzj(1) != 0) {
                i11 += 2;
            }
            zzeqVar.zzh(1);
        }
        if (zzeqVar.zzc() > 7) {
            zzeqVar.zzh(7);
            if (zzeqVar.zzj(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        zzeqVar.zzm();
        zzerVar.zzh(zzeqVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzm(str3);
        zztVar.zzE(i11);
        zztVar.zzF(i10);
        zztVar.zzq(zzqVar);
        zztVar.zze(str2);
        zztVar.zzi(iZzj);
        return zztVar.zzM();
    }

    public static zzadu zzc(zzeq zzeqVar) {
        int i10;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iZzd = zzeqVar.zzd();
        zzeqVar.zzh(40);
        int iZzj = zzeqVar.zzj(5);
        zzeqVar.zzf(iZzd);
        int i21 = -1;
        if (iZzj > 10) {
            zzeqVar.zzh(16);
            int iZzj2 = zzeqVar.zzj(2);
            if (iZzj2 == 0) {
                i21 = 0;
            } else if (iZzj2 == 1) {
                i21 = 1;
            } else if (iZzj2 == 2) {
                i21 = 2;
            }
            zzeqVar.zzh(3);
            int iZzj3 = zzeqVar.zzj(11) + 1;
            int iZzj4 = zzeqVar.zzj(2);
            if (iZzj4 == 3) {
                i17 = zzd[zzeqVar.zzj(2)];
                i18 = 6;
                i16 = 3;
            } else {
                int iZzj5 = zzeqVar.zzj(2);
                int i22 = zzb[iZzj5];
                i16 = iZzj5;
                i17 = zzc[iZzj4];
                i18 = i22;
            }
            int i23 = iZzj3 + iZzj3;
            int i24 = (i23 * i17) / (i18 * 32);
            int iZzj6 = zzeqVar.zzj(3);
            boolean zZzi = zzeqVar.zzi();
            i10 = zze[iZzj6] + (zZzi ? 1 : 0);
            zzeqVar.zzh(10);
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(8);
            }
            if (iZzj6 == 0) {
                zzeqVar.zzh(5);
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(8);
                }
                i19 = 0;
                iZzj6 = 0;
            } else {
                i19 = iZzj6;
            }
            if (i21 == 1) {
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(16);
                }
                i20 = 1;
            } else {
                i20 = i21;
            }
            if (zzeqVar.zzi()) {
                if (i19 > 2) {
                    zzeqVar.zzh(2);
                }
                if ((i19 & 1) != 0 && i19 > 2) {
                    zzeqVar.zzh(6);
                }
                if ((i19 & 4) != 0) {
                    zzeqVar.zzh(6);
                }
                if (zZzi && zzeqVar.zzi()) {
                    zzeqVar.zzh(5);
                }
                if (i20 == 0) {
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(6);
                    }
                    if (i19 == 0 && zzeqVar.zzi()) {
                        zzeqVar.zzh(6);
                    }
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(6);
                    }
                    int iZzj7 = zzeqVar.zzj(2);
                    if (iZzj7 == 1) {
                        zzeqVar.zzh(5);
                    } else if (iZzj7 == 2) {
                        zzeqVar.zzh(12);
                    } else if (iZzj7 == 3) {
                        int iZzj8 = zzeqVar.zzj(5);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(5);
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(4);
                                }
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(4);
                                }
                            }
                        }
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(5);
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(7);
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(8);
                                }
                            }
                        }
                        zzeqVar.zzh((iZzj8 + 2) * 8);
                        zzeqVar.zzm();
                    }
                    if (i19 < 2) {
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(14);
                        }
                        if (iZzj6 == 0 && zzeqVar.zzi()) {
                            zzeqVar.zzh(14);
                        }
                    }
                    if (!zzeqVar.zzi()) {
                        i20 = 0;
                    } else if (i16 == 0) {
                        zzeqVar.zzh(5);
                        i20 = 0;
                        i16 = 0;
                    } else {
                        for (int i25 = 0; i25 < i18; i25++) {
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(5);
                            }
                        }
                        i20 = 0;
                    }
                }
            }
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(5);
                if (i19 == 2) {
                    zzeqVar.zzh(4);
                    i19 = 2;
                }
                if (i19 >= 6) {
                    zzeqVar.zzh(2);
                }
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(8);
                }
                if (i19 == 0 && zzeqVar.zzi()) {
                    zzeqVar.zzh(8);
                }
                if (iZzj4 < 3) {
                    zzeqVar.zzg();
                }
            }
            if (i20 == 0 && i16 != 3) {
                zzeqVar.zzg();
            }
            if (i20 == 2 && (i16 == 3 || zzeqVar.zzi())) {
                zzeqVar.zzh(6);
            }
            str = (zzeqVar.zzi() && zzeqVar.zzj(6) == 1 && zzeqVar.zzj(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i11 = i21;
            i13 = i23;
            i14 = i17;
            i15 = i18 * 256;
            i12 = i24;
        } else {
            zzeqVar.zzh(32);
            int iZzj9 = zzeqVar.zzj(2);
            String str2 = iZzj9 == 3 ? null : "audio/ac3";
            int iZzj10 = zzeqVar.zzj(6);
            int i26 = zzf[iZzj10 / 2] * 1000;
            int iZzf = zzf(iZzj9, iZzj10);
            zzeqVar.zzh(8);
            int iZzj11 = zzeqVar.zzj(3);
            if ((iZzj11 & 1) != 0 && iZzj11 != 1) {
                zzeqVar.zzh(2);
            }
            if ((iZzj11 & 4) != 0) {
                zzeqVar.zzh(2);
            }
            if (iZzj11 == 2) {
                zzeqVar.zzh(2);
            }
            int i27 = iZzj9 < 3 ? zzc[iZzj9] : -1;
            i10 = zze[iZzj11] + (zzeqVar.zzi() ? 1 : 0);
            str = str2;
            i11 = -1;
            i12 = i26;
            i13 = iZzf;
            i14 = i27;
            i15 = 1536;
        }
        return new zzadu(str, i11, i10, i14, i13, i15, i12, null);
    }

    public static int zze(ByteBuffer byteBuffer) {
        int i10 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
            }
            return zzb[i10] * 256;
        }
        return 1536;
    }
}
