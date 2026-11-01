package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class p2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p2 f18255c = new p2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f18257b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f18256a = new x1();

    public final t2 a(Class cls) {
        i2 i2VarA;
        t2 t2Var;
        j2 j2Var;
        Class cls2;
        Charset charset = l1.f18232a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        t2 t2Var2 = (t2) this.f18257b.get(cls);
        if (t2Var2 != null) {
            return t2Var2;
        }
        x1 x1Var = this.f18256a;
        x1Var.getClass();
        Class cls3 = u2.f18301a;
        if (!z0.class.isAssignableFrom(cls) && (cls2 = u2.f18301a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        r2 r2VarB = x1Var.f18336a.b(cls);
        if ((r2VarB.f18272d & 2) == 2) {
            if (z0.class.isAssignableFrom(cls)) {
                j2Var = new j2(u2.f18304d, k0.f18226a, r2VarB.f18269a);
            } else {
                o3 o3Var = u2.f18302b;
                j0 j0Var = k0.f18227b;
                if (j0Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                j2Var = new j2(o3Var, j0Var, r2VarB.f18269a);
            }
            t2Var = j2Var;
        } else {
            if (z0.class.isAssignableFrom(cls)) {
                i2VarA = ((r2VarB.f18272d & 1) == 1 ? o2.PROTO2 : o2.PROTO3) == o2.PROTO2 ? i2.a(r2VarB, l2.f18235b, t1.f18289b, u2.f18304d, k0.f18226a, a2.f18148b) : i2.a(r2VarB, l2.f18235b, t1.f18289b, u2.f18304d, (j0) null, a2.f18148b);
            } else {
                if (((r2VarB.f18272d & 1) == 1 ? o2.PROTO2 : o2.PROTO3) == o2.PROTO2) {
                    k2 k2Var = l2.f18234a;
                    r1 r1Var = t1.f18288a;
                    o3 o3Var2 = u2.f18302b;
                    j0 j0Var2 = k0.f18227b;
                    if (j0Var2 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    i2VarA = i2.a(r2VarB, k2Var, r1Var, o3Var2, j0Var2, a2.f18147a);
                } else {
                    i2VarA = i2.a(r2VarB, l2.f18234a, t1.f18288a, u2.f18303c, (j0) null, a2.f18147a);
                }
            }
            t2Var = i2VarA;
        }
        t2 t2Var3 = (t2) this.f18257b.putIfAbsent(cls, t2Var);
        return t2Var3 != null ? t2Var3 : t2Var;
    }
}
