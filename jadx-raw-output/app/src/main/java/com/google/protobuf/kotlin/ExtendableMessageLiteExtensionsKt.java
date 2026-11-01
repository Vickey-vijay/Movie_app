package com.google.protobuf.kotlin;

import ck.p;
import com.google.protobuf.ExtensionLite;
import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: ExtendableMessageLiteExtensions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ExtendableMessageLiteExtensionsKt {
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MorBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>> boolean contains(MorBT morbt, ExtensionLite<M, ?> extensionLite) {
        p.j(morbt, "<this>");
        p.j(extensionLite, "extension");
        return morbt.hasExtension(extensionLite);
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MOrBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>, T> T get(MOrBT morbt, ExtensionLite<M, T> extensionLite) {
        p.j(morbt, "<this>");
        p.j(extensionLite, "extension");
        T t10 = (T) morbt.getExtension(extensionLite);
        p.i(t10, "getExtension(extension)");
        return t10;
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, B>, B extends GeneratedMessageLite.ExtendableBuilder<M, B>, T> void set(B b10, ExtensionLite<M, T> extensionLite, T t10) {
        p.j(b10, "<this>");
        p.j(extensionLite, "extension");
        p.j(t10, "value");
        b10.setExtension(extensionLite, t10);
    }
}
