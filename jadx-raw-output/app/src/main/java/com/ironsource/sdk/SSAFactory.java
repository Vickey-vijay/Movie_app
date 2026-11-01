package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.InterfaceC3508he;
import com.ironsource.S9;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class SSAFactory {
    public static InterfaceC3508he getPublisherInstance(Activity activity) throws Exception {
        return S9.b((Context) activity);
    }

    public static InterfaceC3508he getPublisherTestInstance(Activity activity, int i10) throws Exception {
        return S9.a(activity, i10);
    }
}
