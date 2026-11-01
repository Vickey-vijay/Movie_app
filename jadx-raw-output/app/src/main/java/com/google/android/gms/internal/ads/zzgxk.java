package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgxk {
    public static final FileOutputStream zza(File file, zzgup zzgupVar, zzgxb zzgxbVar) throws IOException {
        return new FileOutputStream(file, zzgupVar.contains(zzgxj.APPEND));
    }
}
