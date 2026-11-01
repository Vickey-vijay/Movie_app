package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zziaq {
    public static final /* synthetic */ int zze = 0;
    private static volatile int zzf = 100;
    public int zza;
    public int zzb;
    public final int zzc = zzf;
    public Object zzd;

    private zziaq() {
    }

    public /* synthetic */ zziaq(byte[] bArr) {
    }

    public static int zzK(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long zzL(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public abstract void zzA(int i10);

    public abstract boolean zzB() throws IOException;

    public abstract int zzC();

    public abstract int zza() throws IOException;

    public abstract void zzb(int i10) throws zzicg;

    public abstract boolean zzc(int i10) throws IOException;

    public abstract double zzd() throws IOException;

    public abstract float zze() throws IOException;

    public abstract long zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract long zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract boolean zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract String zzm() throws IOException;

    public abstract zzian zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract int zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract long zzr() throws IOException;

    public abstract int zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract int zzz(int i10) throws zzicg;

    public static zziaq zzF(InputStream inputStream, int i10) {
        if (inputStream != null) {
            return new zziap(inputStream, 4096, null);
        }
        byte[] bArr = zzice.zzb;
        int length = bArr.length;
        return zzG(bArr, 0, 0, false);
    }

    public static zziaq zzG(byte[] bArr, int i10, int i11, boolean z10) {
        zziao zziaoVar = new zziao(bArr, i10, i11, z10, null);
        try {
            zziaoVar.zzz(i11);
            return zziaoVar;
        } catch (zzicg e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zzM(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw new zzicg("CodedInputStream encountered a malformed varint.");
    }

    public final void zzH() throws zzicg {
        if (this.zza + this.zzb >= this.zzc) {
            throw new zzicg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzI() throws zzicg {
        if (this.zzb == 0) {
            zzb(0);
        }
    }

    public final void zzJ() throws IOException {
        boolean zZzc;
        do {
            int iZza = zza();
            if (iZza != 0) {
                zzH();
                this.zzb++;
                zZzc = zzc(iZza);
                this.zzb--;
            } else {
                return;
            }
        } while (zZzc);
    }
}
