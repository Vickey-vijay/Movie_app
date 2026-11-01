package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: FullscreenAdPlayer.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface FullscreenAdPlayer extends AdPlayer {

    /* JADX INFO: compiled from: FullscreenAdPlayer.kt */
    public static final class DefaultImpls {
        public static void show(FullscreenAdPlayer fullscreenAdPlayer, ShowOptions showOptions) {
            p.j(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(fullscreenAdPlayer, showOptions);
        }

        @CallSuper
        public static Object destroy(FullscreenAdPlayer fullscreenAdPlayer, rj.c<? super r> cVar) {
            Object objDestroy = AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer, cVar);
            if (objDestroy == sj.a.f()) {
                return objDestroy;
            }
            return r.f64562a;
        }
    }
}
