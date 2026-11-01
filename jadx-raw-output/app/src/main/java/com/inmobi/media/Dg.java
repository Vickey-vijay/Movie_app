package com.inmobi.media;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Dg {
    public static final void a(Ag ag2, bk.l lVar) {
        ck.p.j(ag2, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        ck.p.j(lVar, "block");
        int iOrdinal = ag2.ordinal();
        if (iOrdinal == 0) {
            nk.j.d(A9.f22352d, null, null, new Bg(lVar, null), 3, null);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            nk.j.d(A9.f22351c, null, null, new Cg(lVar, null), 3, null);
        }
    }
}
