package com.google.android.gms.internal.ads;

import com.google.android.material.badge.BadgeDrawable;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzian implements Iterable<Byte>, Serializable {
    public static final zzian zza = new zzial(zzice.zzb);
    private int zzb = 0;

    private static zzian zzk(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (zzian) it.next();
        }
        int i11 = i10 >>> 1;
        zzian zzianVarZzk = zzk(it, i11);
        zzian zzianVarZzk2 = zzk(it, i10 - i11);
        if (Integer.MAX_VALUE - zzianVarZzk.zzc() >= zzianVarZzk2.zzc()) {
            return zzidt.zzk(zzianVarZzk, zzianVarZzk2);
        }
        int iZzc = zzianVarZzk.zzc();
        int iZzc2 = zzianVarZzk2.zzc();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc).length() + 31 + String.valueOf(iZzc2).length());
        sb2.append("ByteString would be too long: ");
        sb2.append(iZzc);
        sb2.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        sb2.append(iZzc2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static zzian zzs(byte[] bArr, int i10, int i11) {
        try {
            return zzt(bArr, i10, i11, false);
        } catch (zzicg e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzian)) {
            return false;
        }
        zzian zzianVar = (zzian) obj;
        int iZzc = zzc();
        if (iZzc != zzianVar.zzc()) {
            return false;
        }
        if (iZzc == 0) {
            return true;
        }
        int i10 = this.zzb;
        int i11 = zzianVar.zzb;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return zzj(zzianVar);
        }
        return false;
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzc();

    public abstract zzian zzd(int i10, int i11);

    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    public abstract ByteBuffer zzf();

    public abstract void zzg(zziae zziaeVar) throws IOException;

    public abstract String zzh(Charset charset);

    public abstract boolean zzi();

    public abstract boolean zzj(zzian zzianVar);

    public abstract int zzl(int i10, int i11, int i12);

    public abstract zziaq zzm();

    public abstract int zzp();

    public abstract boolean zzq();

    static {
        int i10 = zziaa.zza;
    }

    public static zziam zzA() {
        return new zziam(128);
    }

    public static void zzB(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 11);
                sb2.append("Index < 0: ");
                sb2.append(i10);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length());
            sb3.append("Index > length: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
    }

    public static int zzC(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length());
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public static /* synthetic */ boolean zzD(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = i10 + i12;
        zzC(i10, i13, bArr.length);
        zzC(i11, i12 + i11, bArr2.length);
        while (i10 < i13) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static zzian zzt(byte[] bArr, int i10, int i11, boolean z10) throws zzicg {
        zzC(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzial(bArr2);
    }

    public static zzian zzu(byte[] bArr) {
        try {
            return new zzial(bArr);
        } catch (zzicg e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    public static zzian zzv(String str) {
        return new zzial(str.getBytes(zzice.zza));
    }

    public static zzian zzw(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zza : zzk(iterable.iterator(), size);
    }

    public final int hashCode() {
        int iZzl = this.zzb;
        if (iZzl == 0) {
            int iZzc = zzc();
            iZzl = zzl(iZzc, 0, iZzc);
            if (iZzl == 0) {
                iZzl = 1;
            }
            this.zzb = iZzl;
        }
        return iZzl;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzc());
        objArr[2] = zzc() <= 50 ? zzied.zza(this) : zzied.zza(zzd(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public zziai iterator() {
        return new zziaf(this);
    }

    public final String zzz() {
        return zzc() == 0 ? "" : zzh(zzice.zza);
    }

    @Deprecated
    public final void zzx(byte[] bArr, int i10, int i11, int i12) {
        zzC(0, i12, zzc());
        zzC(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }

    public final byte[] zzy() {
        int iZzc = zzc();
        if (iZzc == 0) {
            return zzice.zzb;
        }
        byte[] bArr = new byte[iZzc];
        zze(bArr, 0, 0, iZzc);
        return bArr;
    }
}
