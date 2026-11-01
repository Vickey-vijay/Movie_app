package com.google.protobuf;

/* JADX INFO: compiled from: ExtensionSchemas.java */
/* JADX INFO: loaded from: classes2.dex */
public final class l {
    private static final j<?> LITE_SCHEMA = new k();
    private static final j<?> FULL_SCHEMA = loadSchemaForFullRuntime();

    public static j<?> full() {
        j<?> jVar = FULL_SCHEMA;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static j<?> lite() {
        return LITE_SCHEMA;
    }

    private static j<?> loadSchemaForFullRuntime() {
        try {
            return (j) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
