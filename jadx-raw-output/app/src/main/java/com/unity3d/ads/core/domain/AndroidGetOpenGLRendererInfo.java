package com.unity3d.ads.core.domain;

import android.opengl.GLES20;
import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gl.EglCore;
import com.unity3d.ads.gl.OffscreenSurface;
import lk.c;

/* JADX INFO: compiled from: AndroidGetOpenGLRendererInfo.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AndroidGetOpenGLRendererInfo implements GetOpenGLRendererInfo {
    private final SessionRepository sessionRepository;

    public AndroidGetOpenGLRendererInfo(SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetOpenGLRendererInfo
    public ByteString invoke() {
        if (!this.sessionRepository.getFeatureFlags().getOpenglGpuEnabled()) {
            ByteString byteStringEmpty = ByteString.empty();
            p.i(byteStringEmpty, "{\n            ByteString.empty()\n        }");
            return byteStringEmpty;
        }
        EglCore eglCore = new EglCore(null, 2);
        OffscreenSurface offscreenSurface = new OffscreenSurface(eglCore, 1, 1);
        offscreenSurface.makeCurrent();
        String strGlGetString = GLES20.glGetString(7937);
        p.i(strGlGetString, "renderer");
        byte[] bytes = strGlGetString.getBytes(c.f63591b);
        p.i(bytes, "this as java.lang.String).getBytes(charset)");
        ByteString byteStringCopyFrom = ByteString.copyFrom(bytes);
        offscreenSurface.release();
        eglCore.release();
        p.i(byteStringCopyFrom, "{\n            // We need…dererByteString\n        }");
        return byteStringCopyFrom;
    }
}
