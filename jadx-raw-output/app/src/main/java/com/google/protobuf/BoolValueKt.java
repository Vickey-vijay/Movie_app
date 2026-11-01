package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: BoolValueKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class BoolValueKt {
    public static final BoolValueKt INSTANCE = new BoolValueKt();

    /* JADX INFO: compiled from: BoolValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final BoolValue.Builder _builder;

        /* JADX INFO: compiled from: BoolValueKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(BoolValue.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(BoolValue.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(BoolValue.Builder builder, ck.i iVar) {
            this(builder);
        }

        public final /* synthetic */ BoolValue _build() {
            BoolValue boolValueBuild = this._builder.build();
            ck.p.i(boolValueBuild, "_builder.build()");
            return boolValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final boolean getValue() {
            return this._builder.getValue();
        }

        public final void setValue(boolean z10) {
            this._builder.setValue(z10);
        }
    }

    private BoolValueKt() {
    }
}
