package com.unity3d.ads.core.data.datasource;

import android.database.ContentObserver;
import android.provider.Settings;
import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$DoubleRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.channels.ProduceKt;
import mj.r;
import pk.j;
import pk.n;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidDynamicDeviceInfoDataSource.kt */
/* JADX INFO: loaded from: classes4.dex */
@d(c = "com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1", f = "AndroidDynamicDeviceInfoDataSource.kt", l = {610}, m = "invokeSuspend")
public final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 extends SuspendLambda implements p<n<? super VolumeSettingsChange>, c<? super r>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, c<? super AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1> cVar) {
        super(2, cVar);
        this.this$0 = androidDynamicDeviceInfoDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this.this$0, cVar);
        androidDynamicDeviceInfoDataSource$volumeSettingsChange$1.L$0 = obj;
        return androidDynamicDeviceInfoDataSource$volumeSettingsChange$1;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(n<? super VolumeSettingsChange> nVar, c<? super r> cVar) {
        return ((AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1) create(nVar, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.database.ContentObserver, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z10;
        Object objF = sj.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            final n nVar = (n) this.L$0;
            final Ref$DoubleRef ref$DoubleRef = new Ref$DoubleRef();
            double streamVolume = this.this$0.getStreamVolume(3);
            ref$DoubleRef.element = streamVolume;
            j.b(nVar, new VolumeSettingsChange.VolumeChange(streamVolume));
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            int ringerMode = this.this$0.getRingerMode();
            ref$IntRef.element = ringerMode;
            if (ringerMode == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j.b(nVar, new VolumeSettingsChange.MuteChange(z10));
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource = this.this$0;
            final ?? r10 = new ContentObserver() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(null);
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean z11) {
                    boolean z12;
                    super.onChange(z11);
                    double streamVolume2 = androidDynamicDeviceInfoDataSource.getStreamVolume(3);
                    Ref$DoubleRef ref$DoubleRef2 = ref$DoubleRef;
                    boolean z13 = true;
                    if (streamVolume2 == ref$DoubleRef2.element) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        ref$DoubleRef2.element = streamVolume2;
                        j.b(nVar, new VolumeSettingsChange.VolumeChange(streamVolume2));
                    }
                    int ringerMode2 = androidDynamicDeviceInfoDataSource.getRingerMode();
                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                    if (ringerMode2 != ref$IntRef2.element) {
                        ref$IntRef2.element = ringerMode2;
                        n<VolumeSettingsChange> nVar2 = nVar;
                        if (ringerMode2 != 0) {
                            z13 = false;
                        }
                        j.b(nVar2, new VolumeSettingsChange.MuteChange(z13));
                    }
                }
            };
            this.this$0.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, r10);
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource2 = this.this$0;
            bk.a<r> aVar = new bk.a<r>() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidDynamicDeviceInfoDataSource2.getContext().getContentResolver().unregisterContentObserver(r10);
                }
            };
            this.label = 1;
            if (ProduceKt.b(nVar, aVar, this) == objF) {
                return objF;
            }
        }
        return r.f64562a;
    }
}
