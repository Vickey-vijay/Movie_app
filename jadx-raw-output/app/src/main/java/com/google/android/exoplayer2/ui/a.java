package com.google.android.exoplayer2.ui;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: TimeBar.java */
/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TimeBar.java */
    public interface InterfaceC0187a {
        void d(a aVar, long j10, boolean z10);

        void e(a aVar, long j10);

        void f(a aVar, long j10);
    }

    boolean a();

    void b(InterfaceC0187a interfaceC0187a);

    void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i10);

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
