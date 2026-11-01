package jl;

import kl.k;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;

/* JADX INFO: compiled from: IDanmakuView.java */
/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: compiled from: IDanmakuView.java */
    public interface a {
        boolean a(k kVar);

        boolean b(f fVar);

        boolean c(k kVar);
    }

    void a(kl.c cVar);

    boolean c();

    void f(Long l10);

    void g(nl.a aVar, DanmakuContext danmakuContext);

    k getCurrentVisibleDanmakus();

    a getOnDanmakuClickListener();

    float getXOff();

    float getYOff();

    void h(boolean z10);

    void hide();

    boolean isPaused();

    void pause();

    void release();

    void resume();

    void setCallback(c.d dVar);

    void show();

    void start();

    void toggle();
}
