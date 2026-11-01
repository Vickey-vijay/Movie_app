package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public class zzhq extends zzhc {
    public final int zzb;

    public zzhq(zzhf zzhfVar, int i10, int i11) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    private static int zzb(int i10, int i11) {
        if (i10 == 2000) {
            return i11 != 1 ? 2000 : 2001;
        }
        return i10;
    }

    public zzhq(IOException iOException, zzhf zzhfVar, int i10, int i11) {
        super(iOException, zzb(i10, i11));
        this.zzb = i11;
    }

    public zzhq(String str, zzhf zzhfVar, int i10, int i11) {
        super(str, zzb(i10, i11));
        this.zzb = i11;
    }

    public static zzhq zza(IOException iOException, zzhf zzhfVar, int i10) {
        String message = iOException.getMessage();
        int i11 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && zzgql.zza(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        }
        if (i11 == 2007) {
            return new zzhp(iOException, zzhfVar);
        }
        return new zzhq(iOException, zzhfVar, i11, i10);
    }

    public zzhq(String str, @Nullable IOException iOException, zzhf zzhfVar, int i10, int i11) {
        super(str, iOException, zzb(i10, i11));
        this.zzb = i11;
    }
}
