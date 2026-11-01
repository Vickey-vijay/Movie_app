package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: OptionKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class OptionKt {
    public static final OptionKt INSTANCE = new OptionKt();

    /* JADX INFO: compiled from: OptionKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Option.Builder _builder;

        /* JADX INFO: compiled from: OptionKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Option.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Option.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Option.Builder builder, ck.i iVar) {
            this(builder);
        }

        public final /* synthetic */ Option _build() {
            Option optionBuild = this._builder.build();
            ck.p.i(optionBuild, "_builder.build()");
            return optionBuild;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getName() {
            String name = this._builder.getName();
            ck.p.i(name, "_builder.getName()");
            return name;
        }

        public final Any getValue() {
            Any value = this._builder.getValue();
            ck.p.i(value, "_builder.getValue()");
            return value;
        }

        public final boolean hasValue() {
            return this._builder.hasValue();
        }

        public final void setName(String str) {
            ck.p.j(str, "value");
            this._builder.setName(str);
        }

        public final void setValue(Any any) {
            ck.p.j(any, "value");
            this._builder.setValue(any);
        }
    }

    private OptionKt() {
    }
}
