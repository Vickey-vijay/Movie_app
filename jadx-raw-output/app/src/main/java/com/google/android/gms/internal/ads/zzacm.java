package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzacm implements zzbs {
    private final zzbq zza = new zzacl(false);

    @Override // com.google.android.gms.internal.ads.zzbs
    public final zzbu zza(Context context, zzi zziVar, zzl zzlVar, zzbt zzbtVar, Executor executor, long j10, boolean z10) {
        try {
            Constructor<?> constructor = Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(zzbq.class);
            Object[] objArr = new Object[1];
            try {
                objArr[0] = this.zza;
                return ((zzbs) constructor.newInstance(objArr)).zza(context, zziVar, zzlVar, zzbtVar, executor, 0L, false);
            } catch (Exception e10) {
                e = e10;
                throw new IllegalStateException(e);
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public zzacm(boolean z10) {
    }
}
