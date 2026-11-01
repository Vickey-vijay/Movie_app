package com.yk.e.pl;

import android.content.Context;
import f0.f;
import f0.p;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyVideoCacheManager {
    private static f sharedProxy;

    public static f getProxy(Context context) {
        f fVar = sharedProxy;
        if (fVar != null) {
            return fVar;
        }
        f fVarNewProxy = newProxy(context);
        sharedProxy = fVarNewProxy;
        return fVarNewProxy;
    }

    private static f newProxy(Context context) {
        return new f.b(context).c(536870912L).a();
    }

    private ProxyVideoCacheManager() {
    }

    public static boolean clearAllCache(Context context) {
        getProxy(context);
        return p.b(sharedProxy.h());
    }

    public static boolean clearDefaultCache(Context context, String str) {
        getProxy(context);
        File fileM = sharedProxy.m(str);
        File fileG = sharedProxy.g(str);
        if (p.a(fileM.getAbsolutePath()) && p.a(fileG.getAbsolutePath())) {
            return true;
        }
        return false;
    }
}
