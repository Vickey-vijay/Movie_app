package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9, 16})
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzm();
    public static final Scope[] zza = new Scope[0];
    public static final Feature[] zzb = new Feature[0];

    @SafeParcelable.VersionField(id = 1)
    public final int zzc;

    @SafeParcelable.Field(id = 2)
    public final int zzd;

    @SafeParcelable.Field(id = 3)
    public final int zze;

    @SafeParcelable.Field(id = 4)
    public String zzf;

    @Nullable
    @SafeParcelable.Field(id = 5)
    public IBinder zzg;

    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", id = 6)
    public Scope[] zzh;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.Bundle()", id = 7)
    public Bundle zzi;

    @Nullable
    @SafeParcelable.Field(id = 8)
    public Account zzj;

    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 10)
    public Feature[] zzk;

    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 11)
    public Feature[] zzl;

    @SafeParcelable.Field(id = 12)
    public final boolean zzm;

    @SafeParcelable.Field(defaultValue = "0", id = 13)
    public final int zzn;

    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", id = 14)
    public boolean zzo;

    @Nullable
    @SafeParcelable.Field(getter = "getAttributionTag", id = 15)
    private final String zzp;

    @Nullable
    @KeepForSdk
    public String getAttributionTag() {
        return this.zzp;
    }

    @NonNull
    @KeepForSdk
    public String getCallingPackage() {
        return this.zzf;
    }

    @NonNull
    @KeepForSdk
    public Feature[] getClientApiFeatures() {
        return this.zzl;
    }

    @KeepForSdk
    public int getClientLibraryVersion() {
        return this.zze;
    }

    @NonNull
    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.zzi;
    }

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) String str, @Nullable @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @Nullable @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z10, @SafeParcelable.Param(id = 13) int i13, @SafeParcelable.Param(id = 14) boolean z11, @Nullable @SafeParcelable.Param(id = 15) String str2) {
        Account accountBinderSafe;
        scopeArr = scopeArr == null ? zza : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? zzb : featureArr;
        featureArr2 = featureArr2 == null ? zzb : featureArr2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        if ("com.google.android.gms".equals(str)) {
            this.zzf = "com.google.android.gms";
        } else {
            this.zzf = str;
        }
        if (i10 < 2) {
            if (iBinder != null) {
                accountBinderSafe = AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder));
            } else {
                accountBinderSafe = null;
            }
            this.zzj = accountBinderSafe;
        } else {
            this.zzg = iBinder;
            this.zzj = account;
        }
        this.zzh = scopeArr;
        this.zzi = bundle;
        this.zzk = featureArr;
        this.zzl = featureArr2;
        this.zzm = z10;
        this.zzn = i13;
        this.zzo = z11;
        this.zzp = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        zzm.zza(this, parcel, i10);
    }
}
