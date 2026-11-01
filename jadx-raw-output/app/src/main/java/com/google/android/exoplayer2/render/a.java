package com.google.android.exoplayer2.render;

import android.view.View;
import k3.u0;

/* JADX INFO: compiled from: IRender.java */
/* JADX INFO: loaded from: classes8.dex */
public interface a {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.render.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IRender.java */
    public interface InterfaceC0179a {
        void a(b bVar, int i10, int i11);

        void b(b bVar, int i10, int i11, int i12);

        void c(b bVar);
    }

    /* JADX INFO: compiled from: IRender.java */
    public interface b {
        void a(u0 u0Var);
    }

    void a(int i10, int i11);

    void b(int i10, int i11);

    void c(int i10);

    void d(int i10);

    View getRenderView();

    int getResizeMode();

    void setPixelWidthHeightRatio(float f10);

    void setRenderCallback(InterfaceC0179a interfaceC0179a);
}
