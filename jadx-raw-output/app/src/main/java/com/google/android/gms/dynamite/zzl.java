package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzl implements DynamiteModule.VersionPolicy {
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.localVersion = iVersions.zzb(context, str);
        int i10 = 1;
        int iZza = iVersions.zza(context, str, true);
        selectionResult.remoteVersion = iZza;
        int i11 = selectionResult.localVersion;
        if (i11 != 0) {
            if (iZza < i11) {
                i10 = -1;
            }
        } else if (iZza == 0) {
            i10 = 0;
        } else {
            i11 = 0;
            if (iZza < i11) {
                i10 = -1;
            }
        }
        selectionResult.selection = i10;
        return selectionResult;
    }
}
