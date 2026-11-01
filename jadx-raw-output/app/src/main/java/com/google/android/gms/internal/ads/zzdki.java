package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdki extends zzdhd {
    private boolean zzb;

    public final synchronized void zzc() {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdke
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoStart();
            }
        });
        this.zzb = true;
    }

    public final synchronized void zzd() {
        if (!this.zzb) {
            zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdkg
                @Override // com.google.android.gms.internal.ads.zzdhc
                public final /* synthetic */ void zza(Object obj) {
                    ((VideoController.VideoLifecycleCallbacks) obj).onVideoStart();
                }
            });
            this.zzb = true;
        }
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdkf
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
            }
        });
    }

    public final void zza() {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdkh
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final void zzb() {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdkd
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public zzdki(Set set) {
        super(set);
    }
}
