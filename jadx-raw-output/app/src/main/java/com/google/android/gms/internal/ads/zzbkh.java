package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "NativeAdOptionsParcelCreator")
public final class zzbkh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkh> CREATOR = new zzbki();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final boolean zzb;

    @SafeParcelable.Field(id = 3)
    public final int zzc;

    @SafeParcelable.Field(id = 4)
    public final boolean zzd;

    @SafeParcelable.Field(id = 5)
    public final int zze;

    @Nullable
    @SafeParcelable.Field(id = 6)
    public final com.google.android.gms.ads.internal.client.zzga zzf;

    @SafeParcelable.Field(id = 7)
    public final boolean zzg;

    @SafeParcelable.Field(id = 8)
    public final int zzh;

    @SafeParcelable.Field(id = 9)
    public final int zzi;

    @SafeParcelable.Field(id = 10)
    public final boolean zzj;

    @SafeParcelable.Field(id = 11)
    public final int zzk;

    @SafeParcelable.Constructor
    public zzbkh(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) boolean z10, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) boolean z11, @SafeParcelable.Param(id = 5) int i12, @SafeParcelable.Param(id = 6) com.google.android.gms.ads.internal.client.zzga zzgaVar, @SafeParcelable.Param(id = 7) boolean z12, @SafeParcelable.Param(id = 8) int i13, @SafeParcelable.Param(id = 9) int i14, @SafeParcelable.Param(id = 10) boolean z13, @SafeParcelable.Param(id = 11) int i15) {
        this.zza = i10;
        this.zzb = z10;
        this.zzc = i11;
        this.zzd = z11;
        this.zze = i12;
        this.zzf = zzgaVar;
        this.zzg = z12;
        this.zzh = i13;
        this.zzj = z13;
        this.zzi = i14;
        this.zzk = i15;
    }

    @Deprecated
    public zzbkh(@NonNull NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzga(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false, 0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @NonNull
    public static com.google.android.gms.ads.nativead.NativeAdOptions zza(@Nullable zzbkh zzbkhVar) {
        com.google.android.gms.ads.nativead.NativeAdOptions.Builder builder = new com.google.android.gms.ads.nativead.NativeAdOptions.Builder();
        if (zzbkhVar == null) {
            return builder.build();
        }
        int i10 = zzbkhVar.zza;
        int i11 = 2;
        if (i10 == 2) {
            builder.setAdChoicesPlacement(zzbkhVar.zze);
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    builder.setRequestCustomMuteThisAd(zzbkhVar.zzg);
                    builder.setMediaAspectRatio(zzbkhVar.zzh);
                    builder.enableCustomClickGestureDirection(zzbkhVar.zzi, zzbkhVar.zzj);
                    int i12 = zzbkhVar.zzk;
                    if (i12 == 0) {
                        i11 = 1;
                    } else if (i12 == 2) {
                        i11 = 3;
                    } else if (i12 != 1) {
                        i11 = 1;
                    }
                    builder.zzi(i11);
                }
            }
            com.google.android.gms.ads.internal.client.zzga zzgaVar = zzbkhVar.zzf;
            if (zzgaVar != null) {
                builder.setVideoOptions(new VideoOptions(zzgaVar));
            }
            builder.setAdChoicesPlacement(zzbkhVar.zze);
        }
        builder.setReturnUrlsForImageAssets(zzbkhVar.zzb);
        builder.setRequestMultipleImages(zzbkhVar.zzd);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i10, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
