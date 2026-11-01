package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends Lambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f54843a = new p();

    public p() {
        super(1);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i10 = t.f54847a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof u)) ? new s(iBinder) : (u) iInterfaceQueryLocalInterface;
    }
}
