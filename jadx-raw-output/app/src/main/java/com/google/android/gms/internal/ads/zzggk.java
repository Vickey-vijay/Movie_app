package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzggk extends zzghb {
    @Override // com.google.android.gms.internal.ads.zzghb
    public final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        synchronized (zzawgVar) {
            zzawgVar.zza(ExifInterface.LONGITUDE_EAST);
            zzawgVar.zzB(0L);
            zzawgVar.zzV("D");
        }
        Object[] objArr = (Object[]) method.invoke("", new Object[0]);
        objArr.getClass();
        synchronized (zzawgVar) {
            zzawgVar.zza((String) objArr[0]);
            zzawgVar.zzB(((Long) objArr[1]).longValue());
            zzawgVar.zzV((String) objArr[2]);
        }
    }

    public zzggk(zzawg zzawgVar, zzgfx zzgfxVar, zzgoe zzgoeVar) {
        super("0t12poYWosmBpngKvXFsIJ660Q+4XUg0b7zXGmPDXQpDG3a/Lo5YnElAjbhGuK/3", "2X8cf0JDVCgUXbkJnirLCT8PfoAeQLAghvQ5pw2PRcc=", zzawgVar, zzgfxVar, zzgoeVar.zza(114));
    }
}
