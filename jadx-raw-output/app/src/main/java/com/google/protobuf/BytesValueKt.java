package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: BytesValueKt.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class BytesValueKt {
    public static final BytesValueKt INSTANCE = new BytesValueKt();

    /* JADX INFO: compiled from: BytesValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final BytesValue.Builder _builder;

        /* JADX INFO: compiled from: BytesValueKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(BytesValue.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(BytesValue.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(BytesValue.Builder builder, ck.i iVar) {
            this(builder);
        }

        public final /* synthetic */ BytesValue _build() {
            BytesValue bytesValueBuild = this._builder.build();
            ck.p.i(bytesValueBuild, "_builder.build()");
            return bytesValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final ByteString getValue() {
            ByteString value = this._builder.getValue();
            ck.p.i(value, "_builder.getValue()");
            return value;
        }

        public final void setValue(ByteString byteString) {
            ck.p.j(byteString, "value");
            this._builder.setValue(byteString);
        }
    }

    private BytesValueKt() {
    }
}
