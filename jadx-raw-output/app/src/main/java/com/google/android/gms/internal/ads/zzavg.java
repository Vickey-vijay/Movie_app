package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzavg {
    public int zza = 1;
    private Object zzb;
    private long zzc;
    private double zzd;
    private zzauk zze;
    private List zzf;
    private zzauy zzg;

    private zzavg() {
    }

    public static zzavg zza(Object obj) {
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        zzavg zzavgVar = new zzavg();
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        zzavgVar.zzr();
        zzavgVar.zza = (i17 % 1937477084) ^ i18;
        zzavgVar.zzb = obj;
        return zzavgVar;
    }

    public static zzavg zzb(long j10) {
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        zzavg zzavgVar = new zzavg();
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        zzavgVar.zzr();
        zzavgVar.zza = (i17 % 327254586) ^ i18;
        zzavgVar.zzc = j10;
        return zzavgVar;
    }

    public static zzavg zzc(double d10) {
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        zzavg zzavgVar = new zzavg();
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        zzavgVar.zzr();
        zzavgVar.zza = (i17 % 1605908235) ^ i18;
        zzavgVar.zzd = d10;
        return zzavgVar;
    }

    public static zzavg zzd(zzauk zzaukVar) {
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        zzavg zzavgVar = new zzavg();
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        zzavgVar.zzr();
        zzavgVar.zza = (i17 % 1402586708) ^ i18;
        zzavgVar.zze = zzaukVar;
        return zzavgVar;
    }

    public static zzavg zze(List list) {
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        zzavg zzavgVar = new zzavg();
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        zzavgVar.zzr();
        zzavgVar.zza = (i17 % 324763920) ^ i18;
        zzavgVar.zzf = list;
        return zzavgVar;
    }

    public static zzavg zzf(zzauy zzauyVar) {
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        zzavg zzavgVar = new zzavg();
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        zzavgVar.zzr();
        zzavgVar.zza = (i17 % 474613996) ^ i18;
        zzavgVar.zzg = zzauyVar;
        return zzavgVar;
    }

    public static zzavg zzg(Object obj) {
        if (obj instanceof Long) {
            return zzb(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return zzb(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return zzb(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return zzc(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return zzc(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return zzb(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return zzb(((Byte) obj).byteValue());
        }
        if (obj instanceof zzauk) {
            return zzd((zzauk) obj);
        }
        if (obj instanceof String) {
            return zzd(zzauk.zzf((String) obj));
        }
        if (!(obj instanceof ArrayList)) {
            return zza(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(zzg(arrayList2.get(i10)));
        }
        return zze(arrayList);
    }

    public static zzavg zzj(zzavg zzavgVar) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        int i19 = i17 % 552812661;
        try {
            int i20 = zzavgVar.zza;
            int i21 = (i19 ^ i18) + i20;
            if (i20 == 0) {
                throw null;
            }
            switch (i21) {
                case 0:
                    return new zzavg();
                case 1:
                    return zza(zzavgVar.zzl());
                case 2:
                    return zzb(zzavgVar.zzm());
                case 3:
                    return zzd(zzavgVar.zzn());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = zzavgVar.zzo().iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzj((zzavg) it.next()));
                    }
                    return zze(arrayList);
                case 5:
                    return zzf(zzavgVar.zzp());
                case 6:
                    return zzc(zzavgVar.zzq());
                default:
                    throw new AssertionError(zzaui.zza("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (zzavd e10) {
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e10);
        }
    }

    private final void zzr() {
        this.zza = 1;
        this.zzc = 0L;
        this.zzb = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
    }

    private final void zzs(int i10) throws zzavd {
        if (i10 != this.zza) {
            throw new zzavd();
        }
    }

    public final Object zzh() throws zzavd {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        int i19 = this.zza;
        int i20 = ((i17 % 473891334) ^ i18) + i19;
        if (i19 == 0) {
            throw null;
        }
        switch (i20) {
            case 0:
            case 5:
                throw new zzavd();
            case 1:
                return zzl();
            case 2:
                return Long.valueOf(zzm());
            case 3:
                return zzn().zza();
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = zzo().iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzavg) it.next()).zzh());
                }
                return arrayList;
            case 6:
                return Double.valueOf(zzq());
            default:
                throw new AssertionError(zzaui.zza("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x02a1, code lost:
    
        if (r29.equals(java.lang.Object.class) != false) goto L149;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzi(java.lang.Class r29) throws com.google.android.gms.internal.ads.zzavd {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavg.zzi(java.lang.Class):java.lang.Object");
    }

    public final Object zzl() throws zzavd {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        zzs((iArr[7] % 235745791) ^ (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)));
        return this.zzb;
    }

    public final long zzm() throws zzavd {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        zzs((iArr[7] % 733327814) ^ (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)));
        return this.zzc;
    }

    public final zzauk zzn() throws zzavd {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        zzs((iArr[7] % 1140384172) ^ (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)));
        return this.zze;
    }

    public final List zzo() throws zzavd {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        zzs((iArr[7] % 1250801052) ^ (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)));
        return this.zzf;
    }

    public final zzauy zzp() throws zzavd {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        zzs((iArr[7] % 395191309) ^ (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)));
        return this.zzg;
    }

    public final double zzq() throws zzavd {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        zzs((iArr[7] % 846930886) ^ (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)));
        return this.zzd;
    }

    public final void zzk(OutputStream outputStream) throws zzavd, IOException {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        int[] iArr = {1959970879, 1489831444, 1998984087, -1446423480, -182037905, -2025383063, 91654737, 1544048623, 665228399};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = j16 + ((((j11 & (~j10)) | j12) + ((j10 & j13) | j14)) - j15);
        long j19 = j17 % 297598514;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        iArr[0] = 136416008;
        iArr[1] = 1315652152;
        iArr[2] = 568681609;
        iArr[3] = 1310591536;
        iArr[4] = 838183178;
        iArr[5] = -759809803;
        iArr[6] = 894617267;
        iArr[7] = 1414460396;
        iArr[8] = 78756298;
        int i18 = 894617267 + (((((~136416008) & 1315652152) | 568681609) + ((136416008 & 1310591536) | 838183178)) - (-759809803));
        int i19 = 1414460396 % 78756298;
        iArr[0] = 1202640845;
        iArr[1] = 472047875;
        iArr[2] = 1135942642;
        iArr[3] = 1006822481;
        iArr[4] = 585369424;
        iArr[5] = -1988224507;
        iArr[6] = 353828929;
        iArr[7] = 1225708428;
        iArr[8] = 987359759;
        int i20 = 353828929 + (((((~1202640845) & 472047875) | 1135942642) + ((1202640845 & 1006822481) | 585369424)) - (-1988224507));
        int i21 = 1225708428 % 987359759;
        int i22 = this.zza;
        int i23 = ((i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)) ^ (i17 % 665228399)) + i22;
        if (i22 == 0) {
            throw null;
        }
        switch (i23) {
            case 0:
            case 1:
            case 5:
                throw new zzavd();
            case 2:
                zzaug.zzb(zzm(), new zzavf(outputStream, 1), true);
                return;
            case 3:
                byte[] bArr = zzn().zza;
                zzaug.zzb(((long) bArr.length) * (j18 ^ j19), new zzavf(outputStream, 0), true);
                outputStream.write(bArr);
                return;
            case 4:
                List listZzo = zzo();
                zzaug.zzb(listZzo.size(), new zzavf(outputStream, i20 ^ i21), true);
                Iterator it = listZzo.iterator();
                while (it.hasNext()) {
                    ((zzavg) it.next()).zzk(outputStream);
                }
                return;
            case 6:
                double dZzq = zzq();
                zzavf zzavfVar = new zzavf(outputStream, i18 ^ i19);
                iArr[0] = 1470558289;
                iArr[1] = 1721781326;
                iArr[2] = 2037102441;
                iArr[3] = 109139991;
                iArr[4] = 560281113;
                iArr[5] = -1312141122;
                iArr[6] = 663091009;
                iArr[7] = 1043353969;
                iArr[8] = 656635246;
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(dZzq);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate((663091009 + (((((~1470558289) & 1721781326) | 2037102441) + ((1470558289 & 109139991) | 560281113)) - (-1312141122))) ^ (1043353969 % 656635246));
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.putLong(jDoubleToRawLongBits);
                for (byte b10 : byteBufferAllocate.array()) {
                    zzavfVar.zza(b10);
                }
                int length = byteBufferAllocate.array().length;
                return;
            default:
                return;
        }
    }
}
