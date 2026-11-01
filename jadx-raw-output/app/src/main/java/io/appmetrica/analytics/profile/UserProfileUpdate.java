package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.InterfaceC4202fo;

/* JADX INFO: loaded from: classes2.dex */
public class UserProfileUpdate<T extends InterfaceC4202fo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4202fo f58345a;

    @NonNull
    public T getUserProfileUpdatePatcher() {
        return (T) this.f58345a;
    }

    public UserProfileUpdate(InterfaceC4202fo interfaceC4202fo) {
        this.f58345a = interfaceC4202fo;
    }
}
