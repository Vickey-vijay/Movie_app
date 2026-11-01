package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: loaded from: classes2.dex */
class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f30820b = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v.s f30821a;

    public synchronized void a(String str, String str2) throws Exception {
        if (this.f30821a == null) {
            Logger.e(f30820b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = v.s.class.getDeclaredMethod(str, String.class);
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.f30821a, str2);
            return;
        }
        throw new AccessControlException("Trying to access a private function: " + str);
    }

    public void b(String str) {
        v.s sVar = this.f30821a;
        if (sVar != null) {
            sVar.d(str);
        }
    }

    public b(v.s sVar) {
        this.f30821a = sVar;
    }

    public void a(String str) {
        v.s sVar = this.f30821a;
        if (sVar != null) {
            sVar.c(str);
        }
    }
}
