package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: UInt32ValueKt.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class UInt32ValueKt {
    public static final UInt32ValueKt INSTANCE = new UInt32ValueKt();

    /* JADX INFO: compiled from: UInt32ValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UInt32Value.Builder _builder;

        /* JADX INFO: compiled from: UInt32ValueKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UInt32Value.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(UInt32Value.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(UInt32Value.Builder builder, ck.i iVar) {
            this(builder);
        }

        public final /* synthetic */ UInt32Value _build() {
            UInt32Value uInt32ValueBuild = this._builder.build();
            ck.p.i(uInt32ValueBuild, "_builder.build()");
            return uInt32ValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final int getValue() {
            return this._builder.getValue();
        }

        public final void setValue(int i10) {
            this._builder.setValue(i10);
        }
    }

    private UInt32ValueKt() {
    }
}
