package io.bidmachine.rendering.internal.repository;

import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.MediaSource;

/* JADX INFO: loaded from: classes9.dex */
public interface a {

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.repository.a$a, reason: collision with other inner class name */
    public interface InterfaceC0533a {
        void onError(Error error);

        void onSuccess(Object obj);
    }

    void a(MediaSource mediaSource, InterfaceC0533a interfaceC0533a);

    void b(MediaSource mediaSource, InterfaceC0533a interfaceC0533a);

    void c(MediaSource mediaSource, InterfaceC0533a interfaceC0533a);
}
