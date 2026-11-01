package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzayg {
    public static boolean zza;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    public static final CountDownLatch zzb = new CountDownLatch(1);

    public static Vector zzd(byte[] bArr, int i10) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i11 = length + 254;
        Vector vector = new Vector();
        for (int i12 = 0; i12 < i11 / 255; i12++) {
            int i13 = i12 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i13 > 255) {
                    length2 = i13 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i13, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z10) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArrArray;
        int length = bArr.length;
        int i10 = true != z10 ? 255 : 239;
        if (length > i10) {
            bArr = zzg(4096).zzaN();
        }
        int i11 = i10 + 1;
        int length2 = bArr.length;
        byte b10 = (byte) length2;
        if (length2 < i10) {
            byte[] bArr2 = new byte[i10 - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i11).put(b10).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i11).put(b10).put(bArr).array();
        }
        if (z10) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzayh[] zzayhVarArr = new zzayu().zzcK;
        int length3 = zzayhVarArr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            zzayhVarArr[i12].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzaxy(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }

    public static void zza() {
        synchronized (zzf) {
            if (!zza) {
                zza = true;
                new Thread(new zzayf(null)).start();
            }
        }
    }

    public static zzaxw zzc(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Vector vectorZzd = zzd(bArr, 255);
        if (vectorZzd == null || vectorZzd.isEmpty()) {
            return null;
        }
        zzaxw zzaxwVarZza = zzaxx.zza();
        int size = vectorZzd.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzaxwVarZza.zza(zzian.zzs(zzh((byte[]) vectorZzd.get(i10), str, false), 0, 256));
        }
        byte[] bArrZze = zze(bArr);
        zzian zzianVar = zzian.zza;
        zzaxwVarZza.zzb(zzian.zzs(bArrZze, 0, bArrZze.length));
        return zzaxwVarZza;
    }

    public static byte[] zze(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (zze) {
            zza();
            MessageDigest messageDigest2 = null;
            try {
                if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest2 == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            messageDigest2.reset();
            messageDigest2.update(bArr);
            bArrDigest = zzd.digest();
        }
        return bArrDigest;
    }

    public static String zzb(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArrZzaN;
        zzaxw zzaxwVarZzc = zzc(bArr, str);
        if (zzaxwVarZzc == null) {
            bArrZzaN = zzh(zzg(4096).zzaN(), str, true);
        } else {
            bArrZzaN = ((zzaxx) zzaxwVarZzc.zzbu()).zzaN();
        }
        return zzaya.zza(bArrZzaN, true);
    }

    public static zzaxg zzg(int i10) {
        zzawg zzawgVarZzj = zzaxg.zzj();
        zzawgVarZzj.zzl(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return (zzaxg) zzawgVarZzj.zzbu();
    }
}
