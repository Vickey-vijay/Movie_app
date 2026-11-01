package com.google.android.gms.internal.measurement;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzkk {
    public static final Charset zza = Charset.forName(C.ASCII_NAME);
    public static final Charset zzb = Charset.forName("UTF-8");
    public static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzjf zzf;

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int iZzd = zzd(length, bArr, 0, length);
        if (iZzd == 0) {
            return 1;
        }
        return iZzd;
    }

    public static int zzc(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int zzd(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, zzb);
    }

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i10 = zzjf.zza;
        zzjd zzjdVar = new zzjd(bArr, 0, 0, false, null);
        try {
            zzjdVar.zza(0);
            zzf = zzjdVar;
        } catch (zzkm e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static Object zzf(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static Object zzg(Object obj, Object obj2) {
        return ((zzlj) obj).zzbJ().zzay((zzlj) obj2).zzaG();
    }

    public static Object zze(Object obj) {
        obj.getClass();
        return obj;
    }

    public static boolean zzi(byte[] bArr) {
        return zzna.zze(bArr);
    }
}
