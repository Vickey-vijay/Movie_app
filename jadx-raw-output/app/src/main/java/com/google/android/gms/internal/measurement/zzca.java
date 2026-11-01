package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzca extends zzbm implements zzcc {
    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initForTests(Map map) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void isDataCollectionEnabled(zzcf zzcfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setInstanceIdProvider(zzck zzckVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMinimumSessionDuration(long j10) throws RemoteException {
        throw null;
    }

    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void beginAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j10);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zze(parcelZza, bundle);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearMeasurementEnabled(long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j10);
        zzc(43, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void endAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j10);
        zzc(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void generateEventId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getAppInstanceId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCachedAppInstanceId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenClass(zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenName(zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getGmpAppId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getMaxUserProperties(String str, zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getTestFlag(zzcf zzcfVar, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzcfVar);
        parcelZza.writeInt(i10);
        zzc(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getUserProperties(String str, String str2, boolean z10, zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zzd(parcelZza, z10);
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initialize(IObjectWrapper iObjectWrapper, zzcl zzclVar, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, iObjectWrapper);
        zzbo.zze(parcelZza, zzclVar);
        parcelZza.writeLong(j10);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zze(parcelZza, bundle);
        zzbo.zzd(parcelZza, z10);
        zzbo.zzd(parcelZza, z11);
        parcelZza.writeLong(j10);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(5);
        parcelZza.writeString(str);
        zzbo.zzf(parcelZza, iObjectWrapper);
        zzbo.zzf(parcelZza, iObjectWrapper2);
        zzbo.zzf(parcelZza, iObjectWrapper3);
        zzc(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, iObjectWrapper);
        zzbo.zze(parcelZza, bundle);
        parcelZza.writeLong(j10);
        zzc(27, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeLong(j10);
        zzc(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeLong(j10);
        zzc(29, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeLong(j10);
        zzc(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcfVar, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, iObjectWrapper);
        zzbo.zzf(parcelZza, zzcfVar);
        parcelZza.writeLong(j10);
        zzc(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeLong(j10);
        zzc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeLong(j10);
        zzc(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void performAction(Bundle bundle, zzcf zzcfVar, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, bundle);
        zzbo.zzf(parcelZza, zzcfVar);
        parcelZza.writeLong(j10);
        zzc(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void registerOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzciVar);
        zzc(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void resetAnalyticsData(long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j10);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, bundle);
        parcelZza.writeLong(j10);
        zzc(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsent(Bundle bundle, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, bundle);
        parcelZza.writeLong(j10);
        zzc(44, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, bundle);
        parcelZza.writeLong(j10);
        zzc(45, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeLong(j10);
        zzc(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDataCollectionEnabled(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, z10);
        zzc(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, bundle);
        zzc(42, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setEventInterceptor(zzci zzciVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzciVar);
        zzc(34, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMeasurementEnabled(boolean z10, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, z10);
        parcelZza.writeLong(j10);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setSessionTimeoutDuration(long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j10);
        zzc(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserId(String str, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j10);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z10, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zzf(parcelZza, iObjectWrapper);
        zzbo.zzd(parcelZza, z10);
        parcelZza.writeLong(j10);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void unregisterOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzciVar);
        zzc(36, parcelZza);
    }
}
