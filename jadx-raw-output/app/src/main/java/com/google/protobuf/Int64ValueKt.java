package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: Int64ValueKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class Int64ValueKt {
    public static final Int64ValueKt INSTANCE = new Int64ValueKt();

    /* JADX INFO: compiled from: Int64ValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Int64Value.Builder _builder;

        /* JADX INFO: compiled from: Int64ValueKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Int64Value.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Int64Value.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Int64Value.Builder builder, ck.i iVar) {
            this(builder);
        }

        public final /* synthetic */ Int64Value _build() {
            Int64Value int64ValueBuild = this._builder.build();
            ck.p.i(int64ValueBuild, "_builder.build()");
            return int64ValueBuild;
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

    private Int64ValueKt() {
    }
}
