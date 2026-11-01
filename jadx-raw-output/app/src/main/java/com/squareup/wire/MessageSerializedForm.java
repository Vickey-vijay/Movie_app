package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.a;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes9.dex */
final class MessageSerializedForm<M extends Message<M, B>, B extends Message.a<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final byte[] bytes;
    private final Class<M> messageClass;

    public Object readResolve() throws ObjectStreamException {
        try {
            return ProtoAdapter.n(this.messageClass).f(this.bytes);
        } catch (IOException e10) {
            throw new StreamCorruptedException(e10.getMessage());
        }
    }

    public MessageSerializedForm(byte[] bArr, Class<M> cls) {
        this.bytes = bArr;
        this.messageClass = cls;
    }
}
