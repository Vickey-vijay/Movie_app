package io.bidmachine.rendering.internal.animation;

import io.bidmachine.rendering.model.AnimationEventType;

/* JADX INFO: loaded from: classes10.dex */
public interface b {

    public static final class a {
        public static /* synthetic */ void a(b bVar, io.bidmachine.rendering.internal.c cVar, AnimationEventType animationEventType, Runnable runnable, Runnable runnable2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
            }
            if ((i10 & 4) != 0) {
                runnable = null;
            }
            if ((i10 & 8) != 0) {
                runnable2 = null;
            }
            bVar.a(cVar, animationEventType, runnable, runnable2);
        }
    }

    void a();

    void a(io.bidmachine.rendering.internal.c cVar);

    void a(io.bidmachine.rendering.internal.c cVar, AnimationEventType animationEventType);

    void a(io.bidmachine.rendering.internal.c cVar, AnimationEventType animationEventType, Runnable runnable, Runnable runnable2);

    void a(io.bidmachine.rendering.internal.c cVar, boolean z10);

    void a(io.bidmachine.rendering.internal.d dVar);

    void a(io.bidmachine.rendering.internal.d dVar, AnimationEventType animationEventType);

    void a(io.bidmachine.rendering.internal.d dVar, AnimationEventType animationEventType, Runnable runnable, Runnable runnable2);

    boolean a(int i10);

    void b(io.bidmachine.rendering.internal.d dVar);
}
