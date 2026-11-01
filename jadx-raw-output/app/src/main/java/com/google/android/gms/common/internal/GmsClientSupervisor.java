package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes9.dex */
@KeepForSdk
public abstract class GmsClientSupervisor {

    @Nullable
    @VisibleForTesting
    public static HandlerThread zza = null;
    private static final Object zzb = new Object();
    private static int zzc = 9;

    @Nullable
    private static zzq zzd;

    @Nullable
    private static Executor zze;
    private static boolean zzf;

    @KeepForSdk
    public static int getDefaultBindFlags() {
        return 4225;
    }

    @NonNull
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzb) {
            HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", zzc);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    @KeepForSdk
    public boolean bindService(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str) {
        return zza(new zzn(componentName, 4225), serviceConnection, str, null).isSuccess();
    }

    @KeepForSdk
    public void unbindService(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str) {
        zzc(new zzn(componentName, 4225), serviceConnection, str);
    }

    public abstract ConnectionResult zza(zzn zznVar, ServiceConnection serviceConnection, String str, @Nullable Executor executor);

    public abstract void zzc(zzn zznVar, ServiceConnection serviceConnection, String str);

    @NonNull
    @KeepForSdk
    public static GmsClientSupervisor getInstance(@NonNull Context context) {
        synchronized (zzb) {
            if (zzd == null) {
                zzd = new zzq(context.getApplicationContext(), zzf ? getOrStartHandlerThread().getLooper() : context.getMainLooper(), zze);
            }
        }
        return zzd;
    }

    @KeepForSdk
    public static void setDefaultBindExecutor(@Nullable Executor executor) {
        synchronized (zzb) {
            zzq zzqVar = zzd;
            if (zzqVar != null) {
                zzqVar.zze(executor);
            }
            zze = executor;
        }
    }

    @KeepForSdk
    public static boolean setGamHandlerThreadPriorityIfNotInitialized(int i10) {
        synchronized (zzb) {
            if (zza != null) {
                return false;
            }
            zzc = i10;
            return true;
        }
    }

    @KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzb) {
            zzq zzqVar = zzd;
            if (zzqVar != null && !zzf) {
                zzqVar.zzd(getOrStartHandlerThread().getLooper());
            }
            zzf = true;
        }
    }

    public final void zzb(@NonNull String str, @NonNull String str2, int i10, @NonNull ServiceConnection serviceConnection, @NonNull String str3, boolean z10) {
        zzc(new zzn(str, str2, 4225, z10), serviceConnection, str3);
    }

    @KeepForSdk
    public void unbindService(@NonNull String str, @NonNull ServiceConnection serviceConnection, @NonNull String str2) {
        zzc(new zzn(str, 4225, false), serviceConnection, str2);
    }

    @KeepForSdk
    public boolean bindService(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str, @Nullable Executor executor) {
        return zza(new zzn(componentName, 4225), serviceConnection, str, executor).isSuccess();
    }

    @NonNull
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread(int i10) {
        synchronized (zzb) {
            HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", i10);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    @KeepForSdk
    public boolean bindService(@NonNull String str, @NonNull ServiceConnection serviceConnection, @NonNull String str2) {
        return zza(new zzn(str, 4225, false), serviceConnection, str2, null).isSuccess();
    }
}
