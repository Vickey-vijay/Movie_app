package com.fyber.inneractive.sdk.player.controller;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f16223a;

    public i(q qVar) {
        this.f16223a = qVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        q qVar = this.f16223a;
        qVar.getClass();
        IAlog.a("%s onSurfaceTextureAvailable", IAlog.a(qVar));
        q.a(this.f16223a, surfaceTexture);
        x xVar = this.f16223a.f16236d;
        if (xVar != null) {
            z zVar = xVar.f16255a;
            zVar.getClass();
            IAlog.a("%s onTextureViewAvailable", IAlog.a(zVar));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        q qVar = this.f16223a;
        qVar.getClass();
        IAlog.a("%s onSurfaceTextureDestroyed", IAlog.a(qVar));
        this.f16223a.i();
        this.f16223a.a((Surface) null);
        q qVar2 = this.f16223a;
        qVar2.f16247o = true;
        com.fyber.inneractive.sdk.player.enums.b bVar = qVar2.f16237e;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Error || bVar == com.fyber.inneractive.sdk.player.enums.b.Idle) {
            IAlog.a("%sReleasing surface texture", IAlog.a(qVar2));
            this.f16223a.f16243k = null;
            return true;
        }
        IAlog.a("%s caching surface texture", IAlog.a(qVar2));
        q qVar3 = this.f16223a;
        qVar3.f16243k = surfaceTexture;
        qVar3.f16241i.post(new h(this));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        q qVar = this.f16223a;
        if (qVar.f16237e == com.fyber.inneractive.sdk.player.enums.b.Paused) {
            int iB = qVar.b();
            int iC = qVar.c();
            if (iB <= 0 || iB > iC) {
                return;
            }
            qVar.a(iB - 1, false);
            qVar.a(iB, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Surface surface;
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        x xVar = this.f16223a.f16236d;
        if (xVar != null && (fVar = xVar.f16255a.f16258a) != null && (qVar = fVar.f17963a) != null) {
            qVar.f16241i.post(new n(qVar));
        }
        q qVar2 = this.f16223a;
        if (!qVar2.f16247o || (surface = qVar2.f16244l) == null) {
            return;
        }
        qVar2.a(surface);
        this.f16223a.f16247o = false;
    }
}
