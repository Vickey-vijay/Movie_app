package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: AnyKt.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class AnyKt {
    public static final AnyKt INSTANCE = new AnyKt();

    /* JADX INFO: compiled from: AnyKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Any.Builder _builder;

        /* JADX INFO: compiled from: AnyKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Any.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Any.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Any.Builder builder, ck.i iVar) {
            this(builder);
        }

        public final /* synthetic */ Any _build() {
            Any anyBuild = this._builder.build();
            ck.p.i(anyBuild, "_builder.build()");
            return anyBuild;
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getTypeUrl() {
            String typeUrl = this._builder.getTypeUrl();
            ck.p.i(typeUrl, "_builder.getTypeUrl()");
            return typeUrl;
        }

        public final ByteString getValue() {
            ByteString value = this._builder.getValue();
            ck.p.i(value, "_builder.getValue()");
            return value;
        }

        public final void setTypeUrl(String str) {
            ck.p.j(str, "value");
            this._builder.setTypeUrl(str);
        }

        public final void setValue(ByteString byteString) {
            ck.p.j(byteString, "value");
            this._builder.setValue(byteString);
        }
    }

    private AnyKt() {
    }
}
