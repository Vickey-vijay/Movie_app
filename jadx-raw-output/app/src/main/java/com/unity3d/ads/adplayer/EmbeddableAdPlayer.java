package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: EmbeddableAdPlayer.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface EmbeddableAdPlayer extends AdPlayer {

    /* JADX INFO: compiled from: EmbeddableAdPlayer.kt */
    public static final class DefaultImpls {
        public static void show(EmbeddableAdPlayer embeddableAdPlayer, ShowOptions showOptions) {
            p.j(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(embeddableAdPlayer, showOptions);
        }

        @CallSuper
        public static Object destroy(EmbeddableAdPlayer embeddableAdPlayer, rj.c<? super r> cVar) {
            Object objDestroy = AdPlayer.DefaultImpls.destroy(embeddableAdPlayer, cVar);
            if (objDestroy == sj.a.f()) {
                return objDestroy;
            }
            return r.f64562a;
        }
    }
}
