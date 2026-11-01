package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f18147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z1 f18148b;

    static {
        z1 z1Var = null;
        try {
            z1Var = (z1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f18147a = z1Var;
        f18148b = new z1();
    }
}
