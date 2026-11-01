package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class Zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4335l2 f56298a;

    public final ArrayList a(Iterable iterable) {
        String hexString;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                String strA = this.f56298a.a(str);
                if (strA == null || (hexString = StringUtils.toHexString(MessageDigest.getInstance("SHA-256").digest(strA.getBytes(lk.c.f63591b)))) == null) {
                    PublicLogger.INSTANCE.getAnonymousInstance().info("Input " + str + " is not a valid data", new Object[0]);
                    hexString = null;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
            if (hexString != null) {
                arrayList.add(hexString);
            }
        }
        return arrayList;
    }

    public Zk(InterfaceC4335l2 interfaceC4335l2) {
        this.f56298a = interfaceC4335l2;
    }
}
