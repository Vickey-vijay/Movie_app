package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.a;
import ic.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: loaded from: classes11.dex */
public abstract class Message<M extends Message<M, B>, B extends a<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient ProtoAdapter<M> f45175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient ByteString f45176f;
    public transient int cachedSerializedSize = 0;
    public transient int hashCode = 0;

    public static abstract class a<M extends Message<M, B>, B extends a<M, B>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient ByteString f45177a = ByteString.EMPTY;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient Buffer f45178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient c f45179c;

        public abstract M c();

        public final ByteString d() {
            Buffer buffer = this.f45178b;
            if (buffer != null) {
                this.f45177a = buffer.readByteString();
                this.f45178b = null;
                this.f45179c = null;
            }
            return this.f45177a;
        }

        public final a<M, B> e() throws EOFException {
            this.f45177a = ByteString.EMPTY;
            Buffer buffer = this.f45178b;
            if (buffer != null) {
                buffer.clear();
                this.f45178b = null;
            }
            this.f45179c = null;
            return this;
        }

        public final void f() {
            if (this.f45178b == null) {
                Buffer buffer = new Buffer();
                this.f45178b = buffer;
                c cVar = new c(buffer);
                this.f45179c = cVar;
                try {
                    cVar.k(this.f45177a);
                    this.f45177a = ByteString.EMPTY;
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
        }

        public final a<M, B> a(int i10, FieldEncoding fieldEncoding, Object obj) {
            f();
            try {
                fieldEncoding.rawProtoAdapter().k(this.f45179c, i10, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }

        public final a<M, B> b(ByteString byteString) {
            if (byteString.size() > 0) {
                f();
                try {
                    this.f45179c.k(byteString);
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
            return this;
        }
    }

    public final void encode(BufferedSink bufferedSink) throws IOException {
        this.f45175e.i(bufferedSink, this);
    }

    public abstract a<M, B> newBuilder();

    public final ProtoAdapter<M> adapter() {
        return this.f45175e;
    }

    public final byte[] encode() {
        return this.f45175e.j(this);
    }

    public String toString() {
        return this.f45175e.q(this);
    }

    public final ByteString unknownFields() {
        ByteString byteString = this.f45176f;
        return byteString != null ? byteString : ByteString.EMPTY;
    }

    public final Object writeReplace() throws ObjectStreamException {
        return new MessageSerializedForm(encode(), getClass());
    }

    public Message(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        if (protoAdapter != null) {
            if (byteString != null) {
                this.f45175e = protoAdapter;
                this.f45176f = byteString;
                return;
            }
            throw new NullPointerException("unknownFields == null");
        }
        throw new NullPointerException("adapter == null");
    }

    public final void encode(OutputStream outputStream) throws IOException {
        this.f45175e.h(outputStream, this);
    }

    public final M withoutUnknownFields() {
        return (M) newBuilder().e().c();
    }
}
