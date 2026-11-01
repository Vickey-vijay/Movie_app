package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes6.dex */
final class zae extends zag {
    public final /* synthetic */ Intent zaa;
    public final /* synthetic */ Fragment zab;
    public final /* synthetic */ int zac;

    public zae(Intent intent, Fragment fragment, int i10) {
        this.zaa = intent;
        this.zab = fragment;
        this.zac = i10;
    }

    public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        p10.startActivityForResult(p11, p12);
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(this.zab, intent, this.zac);
        }
    }
}
