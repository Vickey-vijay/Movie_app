package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes10.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f18226a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f18227b;

    static {
        j0 j0Var = null;
        try {
            j0Var = (j0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f18227b = j0Var;
    }
}
