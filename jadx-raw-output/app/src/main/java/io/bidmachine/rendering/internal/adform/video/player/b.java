package io.bidmachine.rendering.internal.adform.video.player;

import android.net.Uri;
import android.view.View;
import io.bidmachine.rendering.internal.q;
import io.bidmachine.rendering.internal.t;
import io.bidmachine.rendering.internal.w;

/* JADX INFO: loaded from: classes9.dex */
public interface b extends q, t, w {
    void a();

    void a(Uri uri);

    void a(d dVar);

    /* synthetic */ void e();

    long g();

    float getVolume();

    @Override // io.bidmachine.rendering.internal.q
    /* synthetic */ void i();

    @Override // io.bidmachine.rendering.internal.q
    /* synthetic */ void l();

    /* synthetic */ void m();

    View p();

    void pause();

    void play();

    void prepare();
}
