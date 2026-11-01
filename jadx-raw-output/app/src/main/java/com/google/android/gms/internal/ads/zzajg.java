package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzajg {
    public byte[] zzO;
    public zzagi zzU;
    public boolean zzW;
    public zzagh zzY;
    public zzv zzZ;
    public boolean zza;
    public int zzaa;
    private int zzab;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzagg zzj;
    public byte[] zzk;
    public zzq zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public boolean zzy = false;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = 1000;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = 8000;
    public long zzS = 0;
    public long zzT = 0;
    public boolean zzV = false;
    public boolean zzX = true;
    private String zzac = "eng";

    public final /* synthetic */ int zzc() {
        return this.zzab;
    }

    public final /* synthetic */ void zzd(int i10) {
        this.zzab = i10;
    }

    public final /* synthetic */ void zze(String str) {
        this.zzac = str;
    }

    private static Pair zzf(zzer zzerVar) throws zzat {
        try {
            zzerVar.zzk(16);
            long jZzA = zzerVar.zzA();
            if (jZzA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzA == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzA != 826496599) {
                zzee.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzg = zzerVar.zzg() + 20;
            byte[] bArrZzi = zzerVar.zzi();
            while (true) {
                int length = bArrZzi.length;
                if (iZzg >= length - 4) {
                    throw zzat.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i10 = iZzg + 1;
                if (bArrZzi[iZzg] == 0 && bArrZzi[i10] == 0 && bArrZzi[iZzg + 2] == 1 && bArrZzi[iZzg + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzi, iZzg, length)));
                }
                iZzg = i10;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzat {
        int i10;
        int i11;
        try {
            if (bArr[0] != 2) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i12 = 0;
            int i13 = 1;
            while (true) {
                int i14 = bArr[i13];
                i13++;
                i10 = i14 & 255;
                if (i10 != 255) {
                    break;
                }
                i12 += 255;
            }
            int i15 = i12 + i10;
            int i16 = 0;
            while (true) {
                int i17 = bArr[i13];
                i13++;
                i11 = i17 & 255;
                if (i11 != 255) {
                    break;
                }
                i16 += 255;
            }
            int i18 = i16 + i11;
            if (bArr[i13] != 1) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i15];
            System.arraycopy(bArr, i13, bArr2, 0, i15);
            int i19 = i13 + i15;
            if (bArr[i19] != 3) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i20 = i19 + i18;
            if (bArr[i20] != 5) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i20;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i20, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing vorbis codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzat {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzat.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x019c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0283 A[PHI: r7
  0x0283: PHI (r7v7 int) = (r7v2 int), (r7v3 int), (r7v0 int), (r7v4 int), (r7v5 int), (r7v6 int), (r7v8 int) binds: [B:139:0x02a1, B:133:0x025d, B:123:0x0220, B:130:0x022f, B:128:0x022a, B:126:0x0225, B:120:0x01f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:190:0x0417  */
    /* JADX WARN: Code duplicated, block: B:191:0x041a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0429  */
    /* JADX WARN: Code duplicated, block: B:195:0x0438  */
    /* JADX WARN: Code duplicated, block: B:197:0x043e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0442  */
    /* JADX WARN: Code duplicated, block: B:201:0x0447  */
    /* JADX WARN: Code duplicated, block: B:204:0x044f  */
    /* JADX WARN: Code duplicated, block: B:206:0x0454  */
    /* JADX WARN: Code duplicated, block: B:209:0x045b  */
    /* JADX WARN: Code duplicated, block: B:212:0x0469  */
    /* JADX WARN: Code duplicated, block: B:215:0x046e  */
    /* JADX WARN: Code duplicated, block: B:217:0x0474  */
    /* JADX WARN: Code duplicated, block: B:240:0x054e  */
    /* JADX WARN: Code duplicated, block: B:245:0x056d  */
    /* JADX WARN: Code duplicated, block: B:264:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:266:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:268:0x05de  */
    /* JADX WARN: Code duplicated, block: B:283:0x0610  */
    /* JADX WARN: Code duplicated, block: B:288:0x0628  */
    /* JADX WARN: Code duplicated, block: B:289:0x062b  */
    public final void zza(int i10) throws zzat {
        byte b10;
        List listZzj;
        List list;
        String str;
        int i11;
        String str2;
        String str3;
        int i12;
        zzt zztVar;
        int iIntValue;
        int i13;
        float f10;
        String str4;
        int i14;
        int i15;
        int i16;
        String str5;
        String str6;
        zzfr zzfrVarZza;
        String str7 = this.zzc;
        int iZzz = 3;
        int i17 = 0;
        switch (str7) {
            case "V_MPEG4/ISO/AP":
                b10 = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b10 = 4;
                break;
            case "A_MS/ACM":
                b10 = 23;
                break;
            case "A_TRUEHD":
                b10 = 18;
                break;
            case "A_VORBIS":
                b10 = 11;
                break;
            case "A_MPEG/L2":
                b10 = 14;
                break;
            case "A_MPEG/L3":
                b10 = 15;
                break;
            case "V_MS/VFW/FOURCC":
                b10 = 9;
                break;
            case "S_DVBSUB":
                b10 = 33;
                break;
            case "V_MPEG4/ISO/ASP":
                b10 = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b10 = 7;
                break;
            case "S_VOBSUB":
                b10 = 31;
                break;
            case "A_DTS/LOSSLESS":
                b10 = 21;
                break;
            case "A_AAC":
                b10 = 13;
                break;
            case "A_AC3":
                b10 = 16;
                break;
            case "A_DTS":
                b10 = 19;
                break;
            case "V_AV1":
                b10 = 2;
                break;
            case "V_VP8":
                b10 = 0;
                break;
            case "V_VP9":
                b10 = 1;
                break;
            case "S_HDMV/PGS":
                b10 = 32;
                break;
            case "V_THEORA":
                b10 = 10;
                break;
            case "A_DTS/EXPRESS":
                b10 = 20;
                break;
            case "A_PCM/FLOAT/IEEE":
                b10 = 26;
                break;
            case "A_PCM/INT/BIG":
                b10 = 25;
                break;
            case "A_PCM/INT/LIT":
                b10 = 24;
                break;
            case "S_TEXT/ASS":
                b10 = 28;
                break;
            case "S_TEXT/SSA":
                b10 = 29;
                break;
            case "V_MPEGH/ISO/HEVC":
                b10 = 8;
                break;
            case "S_TEXT/WEBVTT":
                b10 = 30;
                break;
            case "S_TEXT/UTF8":
                b10 = 27;
                break;
            case "V_MPEG2":
                b10 = 3;
                break;
            case "A_EAC3":
                b10 = 17;
                break;
            case "A_FLAC":
                b10 = 22;
                break;
            case "A_OPUS":
                b10 = 12;
                break;
            default:
                b10 = -1;
                break;
        }
        int i18 = 4096;
        String str8 = "audio/raw";
        zzi zziVarZzg = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        byte[] bArr = null;
        switch (b10) {
            case 0:
                str8 = "video/x-vnd.on2.vp8";
                listZzj = null;
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null && (zzfrVarZza = zzfr.zza(new zzer(this.zzO))) != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z10 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i19 = (z10 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue || (i14 = this.zzq) == iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = (this.zzn * i13) / (this.zzm * i14);
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f && this.zzM != -1.0f && this.zzN != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder.putShort((short) this.zzC);
                            byteBufferOrder.putShort((short) this.zzD);
                        }
                        zzh zzhVar = new zzh();
                        zzhVar.zza(this.zzz);
                        zzhVar.zzb(this.zzB);
                        zzhVar.zzc(this.zzA);
                        zzhVar.zzd(bArr);
                        zzhVar.zze(this.zzo);
                        zzhVar.zzf(this.zzo);
                        zziVarZzg = zzhVar.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null && zzajh.zzg.containsKey(str4)) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0 || Float.compare(this.zzt, 0.0f) != 0 || Float.compare(this.zzu, 0.0f) != 0) {
                        i17 = iIntValue;
                    } else if (Float.compare(this.zzv, 0.0f) != 0) {
                        if (Float.compare(this.zzv, 90.0f) == 0) {
                            i17 = 90;
                        } else if (Float.compare(this.zzv, -180.0f) == 0 || Float.compare(this.zzv, 180.0f) == 0) {
                            i17 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                        } else if (Float.compare(this.zzv, -90.0f) == 0) {
                            i17 = 270;
                        } else {
                            i17 = iIntValue;
                        }
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null && !zzajh.zzg.containsKey(str5)) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i19);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 1:
                byte[] bArr2 = this.zzk;
                listZzj = bArr2 == null ? null : zzguf.zzj(bArr2);
                str8 = "video/x-vnd.on2.vp9";
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z11 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i110 = (z11 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder2.put((byte) 0);
                            byteBufferOrder2.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder2.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder2.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder2.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder2.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder2.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder2.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder2.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder2.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder2.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder2.putShort((short) this.zzC);
                            byteBufferOrder2.putShort((short) this.zzD);
                        }
                        zzh zzhVar2 = new zzh();
                        zzhVar2.zza(this.zzz);
                        zzhVar2.zzb(this.zzB);
                        zzhVar2.zzc(this.zzA);
                        zzhVar2.zzd(bArr);
                        zzhVar2.zze(this.zzo);
                        zzhVar2.zzf(this.zzo);
                        zziVarZzg = zzhVar2.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i110);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 2:
                byte[] bArr3 = this.zzk;
                listZzj = bArr3 == null ? null : zzguf.zzj(bArr3);
                str8 = "video/av01";
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z12 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i111 = (z12 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder3 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder3.put((byte) 0);
                            byteBufferOrder3.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder3.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder3.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder3.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder3.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder3.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder3.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder3.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder3.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder3.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder3.putShort((short) this.zzC);
                            byteBufferOrder3.putShort((short) this.zzD);
                        }
                        zzh zzhVar3 = new zzh();
                        zzhVar3.zza(this.zzz);
                        zzhVar3.zzb(this.zzB);
                        zzhVar3.zzc(this.zzA);
                        zzhVar3.zzd(bArr);
                        zzhVar3.zze(this.zzo);
                        zzhVar3.zzf(this.zzo);
                        zziVarZzg = zzhVar3.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i111);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 3:
                str8 = "video/mpeg2";
                listZzj = null;
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z13 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i112 = (z13 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder4 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder4.put((byte) 0);
                            byteBufferOrder4.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder4.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder4.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder4.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder4.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder4.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder4.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder4.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder4.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder4.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder4.putShort((short) this.zzC);
                            byteBufferOrder4.putShort((short) this.zzD);
                        }
                        zzh zzhVar4 = new zzh();
                        zzhVar4.zza(this.zzz);
                        zzhVar4.zzb(this.zzB);
                        zzhVar4.zzc(this.zzA);
                        zzhVar4.zzd(bArr);
                        zzhVar4.zze(this.zzo);
                        zzhVar4.zzf(this.zzo);
                        zziVarZzg = zzhVar4.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i112);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr4 = this.zzk;
                listZzj = bArr4 == null ? null : Collections.singletonList(bArr4);
                str8 = "video/mp4v-es";
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z14 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i113 = (z14 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder5 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder5.put((byte) 0);
                            byteBufferOrder5.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder5.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder5.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder5.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder5.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder5.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder5.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder5.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder5.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder5.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder5.putShort((short) this.zzC);
                            byteBufferOrder5.putShort((short) this.zzD);
                        }
                        zzh zzhVar5 = new zzh();
                        zzhVar5.zza(this.zzz);
                        zzhVar5.zzb(this.zzB);
                        zzhVar5.zzc(this.zzA);
                        zzhVar5.zzd(bArr);
                        zzhVar5.zze(this.zzo);
                        zzhVar5.zzf(this.zzo);
                        zziVarZzg = zzhVar5.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i113);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 7:
                zzadz zzadzVarZza = zzadz.zza(new zzer(zzi(this.zzc)));
                list = zzadzVarZza.zza;
                this.zzaa = zzadzVarZza.zzb;
                str = zzadzVarZza.zzl;
                str8 = "video/avc";
                i11 = -1;
                iZzz = -1;
                List list2 = list;
                str2 = str;
                listZzj = list2;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z15 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i114 = (z15 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder6 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder6.put((byte) 0);
                            byteBufferOrder6.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder6.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder6.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder6.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder6.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder6.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder6.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder6.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder6.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder6.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder6.putShort((short) this.zzC);
                            byteBufferOrder6.putShort((short) this.zzD);
                        }
                        zzh zzhVar6 = new zzh();
                        zzhVar6.zza(this.zzz);
                        zzhVar6.zzb(this.zzB);
                        zzhVar6.zzc(this.zzA);
                        zzhVar6.zzd(bArr);
                        zzhVar6.zze(this.zzo);
                        zzhVar6.zzf(this.zzo);
                        zziVarZzg = zzhVar6.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i114);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 8:
                zzafo zzafoVarZza = zzafo.zza(new zzer(zzi(this.zzc)));
                list = zzafoVarZza.zza;
                this.zzaa = zzafoVarZza.zzb;
                str = zzafoVarZza.zzn;
                str8 = "video/hevc";
                i11 = -1;
                iZzz = -1;
                List list3 = list;
                str2 = str;
                listZzj = list3;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z16 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i115 = (z16 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder7 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder7.put((byte) 0);
                            byteBufferOrder7.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder7.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder7.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder7.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder7.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder7.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder7.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder7.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder7.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder7.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder7.putShort((short) this.zzC);
                            byteBufferOrder7.putShort((short) this.zzD);
                        }
                        zzh zzhVar7 = new zzh();
                        zzhVar7.zza(this.zzz);
                        zzhVar7.zzb(this.zzB);
                        zzhVar7.zzc(this.zzA);
                        zzhVar7.zzd(bArr);
                        zzhVar7.zze(this.zzo);
                        zzhVar7.zzf(this.zzo);
                        zziVarZzg = zzhVar7.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i115);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 9:
                Pair pairZzf = zzf(new zzer(zzi(this.zzc)));
                str8 = (String) pairZzf.first;
                listZzj = (List) pairZzf.second;
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z17 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i116 = (z17 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder8 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder8.put((byte) 0);
                            byteBufferOrder8.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder8.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder8.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder8.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder8.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder8.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder8.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder8.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder8.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder8.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder8.putShort((short) this.zzC);
                            byteBufferOrder8.putShort((short) this.zzD);
                        }
                        zzh zzhVar8 = new zzh();
                        zzhVar8.zza(this.zzz);
                        zzhVar8.zzb(this.zzB);
                        zzhVar8.zzc(this.zzA);
                        zzhVar8.zzd(bArr);
                        zzhVar8.zze(this.zzo);
                        zzhVar8.zzf(this.zzo);
                        zziVarZzg = zzhVar8.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i116);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 10:
                str8 = "video/x-unknown";
                listZzj = null;
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z18 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i117 = (z18 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder9 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder9.put((byte) 0);
                            byteBufferOrder9.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder9.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder9.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder9.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder9.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder9.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder9.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder9.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder9.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder9.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder9.putShort((short) this.zzC);
                            byteBufferOrder9.putShort((short) this.zzD);
                        }
                        zzh zzhVar9 = new zzh();
                        zzhVar9.zza(this.zzz);
                        zzhVar9.zzb(this.zzB);
                        zzhVar9.zzc(this.zzA);
                        zzhVar9.zzd(bArr);
                        zzhVar9.zze(this.zzo);
                        zzhVar9.zzf(this.zzo);
                        zziVarZzg = zzhVar9.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i117);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 11:
                i18 = 8192;
                listZzj = zzg(zzi(str7));
                str8 = "audio/vorbis";
                str2 = null;
                i11 = i18;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z19 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i118 = (z19 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder10 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder10.put((byte) 0);
                            byteBufferOrder10.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder10.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder10.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder10.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder10.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder10.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder10.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder10.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder10.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder10.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder10.putShort((short) this.zzC);
                            byteBufferOrder10.putShort((short) this.zzD);
                        }
                        zzh zzhVar10 = new zzh();
                        zzhVar10.zza(this.zzz);
                        zzhVar10.zzb(this.zzB);
                        zzhVar10.zzc(this.zzA);
                        zzhVar10.zzd(bArr);
                        zzhVar10.zze(this.zzo);
                        zzhVar10.zzf(this.zzo);
                        zziVarZzg = zzhVar10.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i118);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 12:
                i18 = 5760;
                listZzj = new ArrayList(3);
                listZzj.add(zzi(this.zzc));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                listZzj.add(byteBufferAllocate.order(byteOrder).putLong(this.zzS).array());
                listZzj.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzT).array());
                str8 = "audio/opus";
                str2 = null;
                i11 = i18;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z110 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i119 = (z110 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder11 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder11.put((byte) 0);
                            byteBufferOrder11.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder11.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder11.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder11.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder11.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder11.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder11.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder11.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder11.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder11.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder11.putShort((short) this.zzC);
                            byteBufferOrder11.putShort((short) this.zzD);
                        }
                        zzh zzhVar11 = new zzh();
                        zzhVar11.zza(this.zzz);
                        zzhVar11.zzb(this.zzB);
                        zzhVar11.zzc(this.zzA);
                        zzhVar11.zzd(bArr);
                        zzhVar11.zze(this.zzo);
                        zzhVar11.zzf(this.zzo);
                        zziVarZzg = zzhVar11.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i119);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 13:
                listZzj = Collections.singletonList(zzi(str7));
                zzads zzadsVarZza = zzadt.zza(this.zzk);
                this.zzR = zzadsVarZza.zza;
                this.zzP = zzadsVarZza.zzb;
                str2 = zzadsVarZza.zzc;
                str8 = "audio/mp4a-latm";
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z111 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1110 = (z111 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder12 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder12.put((byte) 0);
                            byteBufferOrder12.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder12.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder12.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder12.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder12.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder12.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder12.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder12.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder12.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder12.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder12.putShort((short) this.zzC);
                            byteBufferOrder12.putShort((short) this.zzD);
                        }
                        zzh zzhVar12 = new zzh();
                        zzhVar12.zza(this.zzz);
                        zzhVar12.zzb(this.zzB);
                        zzhVar12.zzc(this.zzA);
                        zzhVar12.zzd(bArr);
                        zzhVar12.zze(this.zzo);
                        zzhVar12.zzf(this.zzo);
                        zziVarZzg = zzhVar12.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1110);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 14:
                str8 = "audio/mpeg-L2";
                listZzj = null;
                str2 = null;
                i11 = i18;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z112 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1111 = (z112 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder13 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder13.put((byte) 0);
                            byteBufferOrder13.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder13.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder13.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder13.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder13.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder13.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder13.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder13.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder13.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder13.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder13.putShort((short) this.zzC);
                            byteBufferOrder13.putShort((short) this.zzD);
                        }
                        zzh zzhVar13 = new zzh();
                        zzhVar13.zza(this.zzz);
                        zzhVar13.zzb(this.zzB);
                        zzhVar13.zzc(this.zzA);
                        zzhVar13.zzd(bArr);
                        zzhVar13.zze(this.zzo);
                        zzhVar13.zzf(this.zzo);
                        zziVarZzg = zzhVar13.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1111);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 15:
                str8 = "audio/mpeg";
                listZzj = null;
                str2 = null;
                i11 = i18;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z113 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1112 = (z113 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder14 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder14.put((byte) 0);
                            byteBufferOrder14.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder14.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder14.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder14.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder14.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder14.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder14.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder14.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder14.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder14.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder14.putShort((short) this.zzC);
                            byteBufferOrder14.putShort((short) this.zzD);
                        }
                        zzh zzhVar14 = new zzh();
                        zzhVar14.zza(this.zzz);
                        zzhVar14.zzb(this.zzB);
                        zzhVar14.zzc(this.zzA);
                        zzhVar14.zzd(bArr);
                        zzhVar14.zze(this.zzo);
                        zzhVar14.zzf(this.zzo);
                        zziVarZzg = zzhVar14.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1112);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 16:
                str8 = "audio/ac3";
                listZzj = null;
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z114 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1113 = (z114 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder15 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder15.put((byte) 0);
                            byteBufferOrder15.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder15.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder15.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder15.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder15.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder15.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder15.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder15.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder15.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder15.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder15.putShort((short) this.zzC);
                            byteBufferOrder15.putShort((short) this.zzD);
                        }
                        zzh zzhVar15 = new zzh();
                        zzhVar15.zza(this.zzz);
                        zzhVar15.zzb(this.zzB);
                        zzhVar15.zzc(this.zzA);
                        zzhVar15.zzd(bArr);
                        zzhVar15.zze(this.zzo);
                        zzhVar15.zzf(this.zzo);
                        zziVarZzg = zzhVar15.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1113);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 17:
                str8 = "audio/eac3";
                listZzj = null;
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z115 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1114 = (z115 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder16 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder16.put((byte) 0);
                            byteBufferOrder16.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder16.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder16.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder16.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder16.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder16.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder16.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder16.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder16.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder16.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder16.putShort((short) this.zzC);
                            byteBufferOrder16.putShort((short) this.zzD);
                        }
                        zzh zzhVar16 = new zzh();
                        zzhVar16.zza(this.zzz);
                        zzhVar16.zzb(this.zzB);
                        zzhVar16.zzc(this.zzA);
                        zzhVar16.zzd(bArr);
                        zzhVar16.zze(this.zzo);
                        zzhVar16.zzf(this.zzo);
                        zziVarZzg = zzhVar16.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1114);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 18:
                this.zzU = new zzagi();
                str8 = "audio/true-hd";
                listZzj = null;
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z116 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1115 = (z116 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder17 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder17.put((byte) 0);
                            byteBufferOrder17.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder17.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder17.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder17.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder17.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder17.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder17.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder17.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder17.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder17.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder17.putShort((short) this.zzC);
                            byteBufferOrder17.putShort((short) this.zzD);
                        }
                        zzh zzhVar17 = new zzh();
                        zzhVar17.zza(this.zzz);
                        zzhVar17.zzb(this.zzB);
                        zzhVar17.zzc(this.zzA);
                        zzhVar17.zzd(bArr);
                        zzhVar17.zze(this.zzo);
                        zzhVar17.zzf(this.zzo);
                        zziVarZzg = zzhVar17.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1115);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 19:
            case 20:
                this.zzV = true;
                str8 = "audio/vnd.dts";
                listZzj = null;
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z117 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1116 = (z117 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder18 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder18.put((byte) 0);
                            byteBufferOrder18.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder18.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder18.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder18.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder18.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder18.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder18.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder18.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder18.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder18.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder18.putShort((short) this.zzC);
                            byteBufferOrder18.putShort((short) this.zzD);
                        }
                        zzh zzhVar18 = new zzh();
                        zzhVar18.zza(this.zzz);
                        zzhVar18.zzb(this.zzB);
                        zzhVar18.zzc(this.zzA);
                        zzhVar18.zzd(bArr);
                        zzhVar18.zze(this.zzo);
                        zzhVar18.zzf(this.zzo);
                        zziVarZzg = zzhVar18.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1116);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 21:
                str8 = "audio/vnd.dts.hd";
                listZzj = null;
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z118 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1117 = (z118 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder19 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder19.put((byte) 0);
                            byteBufferOrder19.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder19.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder19.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder19.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder19.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder19.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder19.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder19.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder19.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder19.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder19.putShort((short) this.zzC);
                            byteBufferOrder19.putShort((short) this.zzD);
                        }
                        zzh zzhVar19 = new zzh();
                        zzhVar19.zza(this.zzz);
                        zzhVar19.zzb(this.zzB);
                        zzhVar19.zzc(this.zzA);
                        zzhVar19.zzd(bArr);
                        zzhVar19.zze(this.zzo);
                        zzhVar19.zzf(this.zzo);
                        zziVarZzg = zzhVar19.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1117);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 22:
                listZzj = Collections.singletonList(zzi(str7));
                str8 = "audio/flac";
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z119 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1118 = (z119 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder110.put((byte) 0);
                            byteBufferOrder110.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder110.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder110.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder110.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder110.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder110.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder110.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder110.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder110.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder110.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder110.putShort((short) this.zzC);
                            byteBufferOrder110.putShort((short) this.zzD);
                        }
                        zzh zzhVar110 = new zzh();
                        zzhVar110.zza(this.zzz);
                        zzhVar110.zzb(this.zzB);
                        zzhVar110.zzc(this.zzA);
                        zzhVar110.zzd(bArr);
                        zzhVar110.zze(this.zzo);
                        zzhVar110.zzf(this.zzo);
                        zziVarZzg = zzhVar110.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1118);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 23:
                if (zzh(new zzer(zzi(this.zzc)))) {
                    iZzz = zzfj.zzz(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                    if (iZzz == 0) {
                        int i20 = this.zzQ;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i20).length() + 64);
                        sb2.append("Unsupported PCM bit depth: ");
                        sb2.append(i20);
                        sb2.append(". Setting mimeType to audio/x-unknown");
                        zzee.zzc("MatroskaExtractor", sb2.toString());
                    } else {
                        listZzj = null;
                        str2 = null;
                        i11 = -1;
                    }
                    if (this.zzO != null) {
                        str2 = zzfrVarZza.zza;
                        str8 = "video/dolby-vision";
                    }
                    str3 = str8;
                    boolean z1110 = this.zzX;
                    if (true != this.zzW) {
                        i12 = 0;
                    } else {
                        i12 = 2;
                    }
                    int i1119 = (z1110 ? 1 : 0) | i12;
                    zztVar = new zzt();
                    if (zzas.zza(str3)) {
                        zztVar.zzE(this.zzP);
                        zztVar.zzF(this.zzR);
                        zztVar.zzG(iZzz);
                    } else if (zzas.zzb(str3)) {
                        if (this.zzr == 0) {
                            i15 = this.zzp;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.zzm;
                            }
                            this.zzp = i15;
                            i16 = this.zzq;
                            if (i16 == -1) {
                                i16 = this.zzn;
                            }
                            this.zzq = i16;
                        } else {
                            iIntValue = -1;
                        }
                        i13 = this.zzp;
                        if (i13 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder111.put((byte) 0);
                                byteBufferOrder111.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder111.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder111.putShort((short) this.zzC);
                                byteBufferOrder111.putShort((short) this.zzD);
                            }
                            zzh zzhVar111 = new zzh();
                            zzhVar111.zza(this.zzz);
                            zzhVar111.zzb(this.zzB);
                            zzhVar111.zzc(this.zzA);
                            zzhVar111.zzd(bArr);
                            zzhVar111.zze(this.zzo);
                            zzhVar111.zzf(this.zzo);
                            zziVarZzg = zzhVar111.zzg();
                        }
                        str4 = this.zzb;
                        if (str4 != null) {
                            iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i17 = iIntValue;
                        } else {
                            i17 = iIntValue;
                        }
                        zztVar.zzt(this.zzm);
                        zztVar.zzu(this.zzn);
                        zztVar.zzz(f10);
                        zztVar.zzy(i17);
                        zztVar.zzA(this.zzw);
                        zztVar.zzB(this.zzx);
                        zztVar.zzC(zziVarZzg);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw zzat.zzb("Unexpected MIME type.", null);
                    }
                    str5 = this.zzb;
                    if (str5 != null) {
                        zztVar.zzc(this.zzb);
                    }
                    zztVar.zzb(i10);
                    if (true != this.zza) {
                        str6 = "video/x-matroska";
                    } else {
                        str6 = "video/webm";
                    }
                    zztVar.zzl(str6);
                    zztVar.zzm(str3);
                    zztVar.zzn(i11);
                    zztVar.zze(this.zzac);
                    zztVar.zzf(i1119);
                    zztVar.zzp(listZzj);
                    zztVar.zzj(str2);
                    zztVar.zzq(this.zzl);
                    this.zzZ = zztVar.zzM();
                    return;
                }
                zzee.zzc("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                listZzj = null;
                str2 = null;
                str8 = "audio/x-unknown";
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1111 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11110 = (z1111 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder112.put((byte) 0);
                            byteBufferOrder112.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder112.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder112.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder112.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder112.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder112.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder112.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder112.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder112.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder112.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder112.putShort((short) this.zzC);
                            byteBufferOrder112.putShort((short) this.zzD);
                        }
                        zzh zzhVar112 = new zzh();
                        zzhVar112.zza(this.zzz);
                        zzhVar112.zzb(this.zzB);
                        zzhVar112.zzc(this.zzA);
                        zzhVar112.zzd(bArr);
                        zzhVar112.zze(this.zzo);
                        zzhVar112.zzf(this.zzo);
                        zziVarZzg = zzhVar112.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i11110);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 24:
                iZzz = zzfj.zzz(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                if (iZzz == 0) {
                    int i21 = this.zzQ;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i21).length() + 78);
                    sb3.append("Unsupported little endian PCM bit depth: ");
                    sb3.append(i21);
                    sb3.append(". Setting mimeType to audio/x-unknown");
                    zzee.zzc("MatroskaExtractor", sb3.toString());
                    listZzj = null;
                    str2 = null;
                    str8 = "audio/x-unknown";
                    i11 = -1;
                    iZzz = -1;
                } else {
                    listZzj = null;
                    str2 = null;
                    i11 = -1;
                }
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1112 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11111 = (z1112 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder113 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder113.put((byte) 0);
                            byteBufferOrder113.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder113.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder113.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder113.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder113.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder113.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder113.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder113.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder113.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder113.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder113.putShort((short) this.zzC);
                            byteBufferOrder113.putShort((short) this.zzD);
                        }
                        zzh zzhVar113 = new zzh();
                        zzhVar113.zza(this.zzz);
                        zzhVar113.zzb(this.zzB);
                        zzhVar113.zzc(this.zzA);
                        zzhVar113.zzd(bArr);
                        zzhVar113.zze(this.zzo);
                        zzhVar113.zzf(this.zzo);
                        zziVarZzg = zzhVar113.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i11111);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 25:
                int i22 = this.zzQ;
                if (i22 != 8) {
                    if (i22 == 16) {
                        iZzz = 268435456;
                    } else if (i22 == 24) {
                        iZzz = 1342177280;
                    } else {
                        if (i22 != 32) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(i22).length() + 75);
                            sb4.append("Unsupported big endian PCM bit depth: ");
                            sb4.append(i22);
                            sb4.append(". Setting mimeType to audio/x-unknown");
                            zzee.zzc("MatroskaExtractor", sb4.toString());
                            listZzj = null;
                            str2 = null;
                            str8 = "audio/x-unknown";
                            i11 = -1;
                            iZzz = -1;
                            if (this.zzO != null) {
                                str2 = zzfrVarZza.zza;
                                str8 = "video/dolby-vision";
                            }
                            str3 = str8;
                            boolean z1113 = this.zzX;
                            if (true != this.zzW) {
                                i12 = 0;
                            } else {
                                i12 = 2;
                            }
                            int i11112 = (z1113 ? 1 : 0) | i12;
                            zztVar = new zzt();
                            if (zzas.zza(str3)) {
                                zztVar.zzE(this.zzP);
                                zztVar.zzF(this.zzR);
                                zztVar.zzG(iZzz);
                            } else if (zzas.zzb(str3)) {
                                if (this.zzr == 0) {
                                    i15 = this.zzp;
                                    iIntValue = -1;
                                    if (i15 == -1) {
                                        i15 = this.zzm;
                                    }
                                    this.zzp = i15;
                                    i16 = this.zzq;
                                    if (i16 == -1) {
                                        i16 = this.zzn;
                                    }
                                    this.zzq = i16;
                                } else {
                                    iIntValue = -1;
                                }
                                i13 = this.zzp;
                                if (i13 != iIntValue) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.zzy) {
                                    if (this.zzE != -1.0f) {
                                        bArr = new byte[25];
                                        ByteBuffer byteBufferOrder114 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                        byteBufferOrder114.put((byte) 0);
                                        byteBufferOrder114.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) (this.zzM + 0.5f));
                                        byteBufferOrder114.putShort((short) (this.zzN + 0.5f));
                                        byteBufferOrder114.putShort((short) this.zzC);
                                        byteBufferOrder114.putShort((short) this.zzD);
                                    }
                                    zzh zzhVar114 = new zzh();
                                    zzhVar114.zza(this.zzz);
                                    zzhVar114.zzb(this.zzB);
                                    zzhVar114.zzc(this.zzA);
                                    zzhVar114.zzd(bArr);
                                    zzhVar114.zze(this.zzo);
                                    zzhVar114.zzf(this.zzo);
                                    zziVarZzg = zzhVar114.zzg();
                                }
                                str4 = this.zzb;
                                if (str4 != null) {
                                    iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                                }
                                if (this.zzs == 0) {
                                    i17 = iIntValue;
                                } else {
                                    i17 = iIntValue;
                                }
                                zztVar.zzt(this.zzm);
                                zztVar.zzu(this.zzn);
                                zztVar.zzz(f10);
                                zztVar.zzy(i17);
                                zztVar.zzA(this.zzw);
                                zztVar.zzB(this.zzx);
                                zztVar.zzC(zziVarZzg);
                            } else if (!"application/x-subrip".equals(str3)) {
                                throw zzat.zzb("Unexpected MIME type.", null);
                            }
                            str5 = this.zzb;
                            if (str5 != null) {
                                zztVar.zzc(this.zzb);
                            }
                            zztVar.zzb(i10);
                            if (true != this.zza) {
                                str6 = "video/x-matroska";
                            } else {
                                str6 = "video/webm";
                            }
                            zztVar.zzl(str6);
                            zztVar.zzm(str3);
                            zztVar.zzn(i11);
                            zztVar.zze(this.zzac);
                            zztVar.zzf(i11112);
                            zztVar.zzp(listZzj);
                            zztVar.zzj(str2);
                            zztVar.zzq(this.zzl);
                            this.zzZ = zztVar.zzM();
                            return;
                        }
                        iZzz = 1610612736;
                    }
                }
                listZzj = null;
                str2 = null;
                i11 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1114 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11113 = (z1114 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder115 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder115.put((byte) 0);
                            byteBufferOrder115.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder115.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder115.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder115.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder115.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder115.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder115.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder115.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder115.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder115.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder115.putShort((short) this.zzC);
                            byteBufferOrder115.putShort((short) this.zzD);
                        }
                        zzh zzhVar115 = new zzh();
                        zzhVar115.zza(this.zzz);
                        zzhVar115.zzb(this.zzB);
                        zzhVar115.zzc(this.zzA);
                        zzhVar115.zzd(bArr);
                        zzhVar115.zze(this.zzo);
                        zzhVar115.zzf(this.zzo);
                        zziVarZzg = zzhVar115.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i11113);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 26:
                int i23 = this.zzQ;
                if (i23 == 32) {
                    iZzz = 4;
                    listZzj = null;
                    str2 = null;
                    i11 = -1;
                    if (this.zzO != null) {
                        str2 = zzfrVarZza.zza;
                        str8 = "video/dolby-vision";
                    }
                    str3 = str8;
                    boolean z1115 = this.zzX;
                    if (true != this.zzW) {
                        i12 = 0;
                    } else {
                        i12 = 2;
                    }
                    int i11114 = (z1115 ? 1 : 0) | i12;
                    zztVar = new zzt();
                    if (zzas.zza(str3)) {
                        zztVar.zzE(this.zzP);
                        zztVar.zzF(this.zzR);
                        zztVar.zzG(iZzz);
                    } else if (zzas.zzb(str3)) {
                        if (this.zzr == 0) {
                            i15 = this.zzp;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.zzm;
                            }
                            this.zzp = i15;
                            i16 = this.zzq;
                            if (i16 == -1) {
                                i16 = this.zzn;
                            }
                            this.zzq = i16;
                        } else {
                            iIntValue = -1;
                        }
                        i13 = this.zzp;
                        if (i13 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder116 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder116.put((byte) 0);
                                byteBufferOrder116.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder116.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder116.putShort((short) this.zzC);
                                byteBufferOrder116.putShort((short) this.zzD);
                            }
                            zzh zzhVar116 = new zzh();
                            zzhVar116.zza(this.zzz);
                            zzhVar116.zzb(this.zzB);
                            zzhVar116.zzc(this.zzA);
                            zzhVar116.zzd(bArr);
                            zzhVar116.zze(this.zzo);
                            zzhVar116.zzf(this.zzo);
                            zziVarZzg = zzhVar116.zzg();
                        }
                        str4 = this.zzb;
                        if (str4 != null) {
                            iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i17 = iIntValue;
                        } else {
                            i17 = iIntValue;
                        }
                        zztVar.zzt(this.zzm);
                        zztVar.zzu(this.zzn);
                        zztVar.zzz(f10);
                        zztVar.zzy(i17);
                        zztVar.zzA(this.zzw);
                        zztVar.zzB(this.zzx);
                        zztVar.zzC(zziVarZzg);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw zzat.zzb("Unexpected MIME type.", null);
                    }
                    str5 = this.zzb;
                    if (str5 != null) {
                        zztVar.zzc(this.zzb);
                    }
                    zztVar.zzb(i10);
                    if (true != this.zza) {
                        str6 = "video/x-matroska";
                    } else {
                        str6 = "video/webm";
                    }
                    zztVar.zzl(str6);
                    zztVar.zzm(str3);
                    zztVar.zzn(i11);
                    zztVar.zze(this.zzac);
                    zztVar.zzf(i11114);
                    zztVar.zzp(listZzj);
                    zztVar.zzj(str2);
                    zztVar.zzq(this.zzl);
                    this.zzZ = zztVar.zzM();
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(i23).length() + 79);
                sb5.append("Unsupported floating point PCM bit depth: ");
                sb5.append(i23);
                sb5.append(". Setting mimeType to audio/x-unknown");
                zzee.zzc("MatroskaExtractor", sb5.toString());
                listZzj = null;
                str2 = null;
                str8 = "audio/x-unknown";
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1116 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11115 = (z1116 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder117 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder117.put((byte) 0);
                            byteBufferOrder117.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder117.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder117.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder117.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder117.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder117.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder117.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder117.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder117.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder117.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder117.putShort((short) this.zzC);
                            byteBufferOrder117.putShort((short) this.zzD);
                        }
                        zzh zzhVar117 = new zzh();
                        zzhVar117.zza(this.zzz);
                        zzhVar117.zzb(this.zzB);
                        zzhVar117.zzc(this.zzA);
                        zzhVar117.zzd(bArr);
                        zzhVar117.zze(this.zzo);
                        zzhVar117.zzf(this.zzo);
                        zziVarZzg = zzhVar117.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i11115);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 27:
                str8 = "application/x-subrip";
                listZzj = null;
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1117 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11116 = (z1117 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder118 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder118.put((byte) 0);
                            byteBufferOrder118.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder118.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder118.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder118.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder118.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder118.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder118.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder118.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder118.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder118.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder118.putShort((short) this.zzC);
                            byteBufferOrder118.putShort((short) this.zzD);
                        }
                        zzh zzhVar118 = new zzh();
                        zzhVar118.zza(this.zzz);
                        zzhVar118.zzb(this.zzB);
                        zzhVar118.zzc(this.zzA);
                        zzhVar118.zzd(bArr);
                        zzhVar118.zze(this.zzo);
                        zzhVar118.zzf(this.zzo);
                        zziVarZzg = zzhVar118.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i11116);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 28:
            case 29:
                int i24 = zzajh.zza;
                listZzj = zzguf.zzk(zzajh.zzc, zzi(this.zzc));
                str2 = null;
                str8 = "text/x-ssa";
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1118 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11117 = (z1118 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder119 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder119.put((byte) 0);
                            byteBufferOrder119.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder119.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder119.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder119.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder119.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder119.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder119.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder119.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder119.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder119.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder119.putShort((short) this.zzC);
                            byteBufferOrder119.putShort((short) this.zzD);
                        }
                        zzh zzhVar119 = new zzh();
                        zzhVar119.zza(this.zzz);
                        zzhVar119.zzb(this.zzB);
                        zzhVar119.zzc(this.zzA);
                        zzhVar119.zzd(bArr);
                        zzhVar119.zze(this.zzo);
                        zzhVar119.zzf(this.zzo);
                        zziVarZzg = zzhVar119.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i11117);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 30:
                str8 = "text/vtt";
                listZzj = null;
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1119 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11118 = (z1119 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder1110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder1110.put((byte) 0);
                            byteBufferOrder1110.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder1110.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder1110.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder1110.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder1110.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder1110.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder1110.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder1110.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder1110.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder1110.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder1110.putShort((short) this.zzC);
                            byteBufferOrder1110.putShort((short) this.zzD);
                        }
                        zzh zzhVar1110 = new zzh();
                        zzhVar1110.zza(this.zzz);
                        zzhVar1110.zzb(this.zzB);
                        zzhVar1110.zzc(this.zzA);
                        zzhVar1110.zzd(bArr);
                        zzhVar1110.zze(this.zzo);
                        zzhVar1110.zzf(this.zzo);
                        zziVarZzg = zzhVar1110.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i11118);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 31:
                listZzj = zzguf.zzj(zzi(str7));
                str8 = "application/vobsub";
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z11110 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11119 = (z11110 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder1111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder1111.put((byte) 0);
                            byteBufferOrder1111.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder1111.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder1111.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder1111.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder1111.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder1111.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder1111.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder1111.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder1111.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder1111.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder1111.putShort((short) this.zzC);
                            byteBufferOrder1111.putShort((short) this.zzD);
                        }
                        zzh zzhVar1111 = new zzh();
                        zzhVar1111.zza(this.zzz);
                        zzhVar1111.zzb(this.zzB);
                        zzhVar1111.zzc(this.zzA);
                        zzhVar1111.zzd(bArr);
                        zzhVar1111.zze(this.zzo);
                        zzhVar1111.zzf(this.zzo);
                        zziVarZzg = zzhVar1111.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i11119);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 32:
                str8 = "application/pgs";
                listZzj = null;
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z11111 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i111110 = (z11111 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder1112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder1112.put((byte) 0);
                            byteBufferOrder1112.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder1112.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder1112.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder1112.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder1112.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder1112.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder1112.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder1112.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder1112.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder1112.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder1112.putShort((short) this.zzC);
                            byteBufferOrder1112.putShort((short) this.zzD);
                        }
                        zzh zzhVar1112 = new zzh();
                        zzhVar1112.zza(this.zzz);
                        zzhVar1112.zzb(this.zzB);
                        zzhVar1112.zzc(this.zzA);
                        zzhVar1112.zzd(bArr);
                        zzhVar1112.zze(this.zzo);
                        zzhVar1112.zzf(this.zzo);
                        zziVarZzg = zzhVar1112.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i111110);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 33:
                byte[] bArr5 = new byte[4];
                System.arraycopy(zzi(str7), 0, bArr5, 0, 4);
                listZzj = zzguf.zzj(bArr5);
                str8 = "application/dvbsubs";
                str2 = null;
                i11 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z11112 = this.zzX;
                if (true != this.zzW) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i111111 = (z11112 ? 1 : 0) | i12;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(iZzz);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i15 = this.zzp;
                        iIntValue = -1;
                        if (i15 == -1) {
                            i15 = this.zzm;
                        }
                        this.zzp = i15;
                        i16 = this.zzq;
                        if (i16 == -1) {
                            i16 = this.zzn;
                        }
                        this.zzq = i16;
                    } else {
                        iIntValue = -1;
                    }
                    i13 = this.zzp;
                    if (i13 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder1113 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder1113.put((byte) 0);
                            byteBufferOrder1113.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder1113.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder1113.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder1113.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder1113.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder1113.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder1113.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder1113.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder1113.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder1113.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder1113.putShort((short) this.zzC);
                            byteBufferOrder1113.putShort((short) this.zzD);
                        }
                        zzh zzhVar1113 = new zzh();
                        zzhVar1113.zza(this.zzz);
                        zzhVar1113.zzb(this.zzB);
                        zzhVar1113.zzc(this.zzA);
                        zzhVar1113.zzd(bArr);
                        zzhVar1113.zze(this.zzo);
                        zzhVar1113.zzf(this.zzo);
                        zziVarZzg = zzhVar1113.zzg();
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i17 = iIntValue;
                    } else {
                        i17 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f10);
                    zztVar.zzy(i17);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i11);
                zztVar.zze(this.zzac);
                zztVar.zzf(i111111);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            default:
                throw zzat.zzb("Unrecognized codec identifier.", null);
        }
    }

    public final /* synthetic */ void zzb() {
        this.zzY.getClass();
    }

    private static boolean zzh(zzer zzerVar) throws zzat {
        try {
            int iZzu = zzerVar.zzu();
            if (iZzu == 1) {
                return true;
            }
            if (iZzu == 65534) {
                zzerVar.zzh(24);
                if (zzerVar.zzD() == zzajh.zzf.getMostSignificantBits() && zzerVar.zzD() == zzajh.zzf.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing MS/ACM codec private", null);
        }
    }
}
