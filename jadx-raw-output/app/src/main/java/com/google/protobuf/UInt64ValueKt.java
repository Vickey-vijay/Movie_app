package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: UInt64ValueKt.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class UInt64ValueKt {
    public static final UInt64ValueKt INSTANCE = new UInt64ValueKt();

    /* JADX INFO: compiled from: UInt64ValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UInt64Value.Builder _builder;

        /* JADX INFO: compiled from: UInt64ValueKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UInt64Value.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(UInt64Value.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(UInt64Value.Builder builder, ck.i iVar) {
            this(builder);
        }

        public final /* synthetic */ UInt64Value _build() {
            UInt64Value uInt64ValueBuild = this._builder.build();
            ck.p.i(uInt64ValueBuild, "_builder.build()");
            return uInt64ValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final long getValue() {
            return this._builder.getValue();
        }

        public final void setValue(long j10) {
            this._builder.setValue(j10);
        }
    }

    private UInt64ValueKt() {
    }
}
