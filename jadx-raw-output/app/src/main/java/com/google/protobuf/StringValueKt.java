package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: StringValueKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class StringValueKt {
    public static final StringValueKt INSTANCE = new StringValueKt();

    /* JADX INFO: compiled from: StringValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final StringValue.Builder _builder;

        /* JADX INFO: compiled from: StringValueKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(StringValue.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(StringValue.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(StringValue.Builder builder, ck.i iVar) {
            this(builder);
        }

        public final /* synthetic */ StringValue _build() {
            StringValue stringValueBuild = this._builder.build();
            ck.p.i(stringValueBuild, "_builder.build()");
            return stringValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getValue() {
            String value = this._builder.getValue();
            ck.p.i(value, "_builder.getValue()");
            return value;
        }

        public final void setValue(String str) {
            ck.p.j(str, "value");
            this._builder.setValue(str);
        }
    }

    private StringValueKt() {
    }
}
