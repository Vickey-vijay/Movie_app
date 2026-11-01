package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class SubscriberMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f34371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadMode f34372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f34373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34374d;

    private synchronized void a() {
        if (this.f34374d == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f34371a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f34371a.getName());
            sb2.append('(');
            sb2.append(this.f34373c.getName());
            this.f34374d = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        a();
        return this.f34374d.equals(((SubscriberMethod) obj).f34374d);
    }

    public int hashCode() {
        return this.f34371a.hashCode();
    }

    public SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f34371a = method;
        this.f34372b = threadMode;
        this.f34373c = cls;
    }
}
