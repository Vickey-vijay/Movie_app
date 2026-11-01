package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: ValueKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ValueKt {
    public static final ValueKt INSTANCE = new ValueKt();

    /* JADX INFO: compiled from: ValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Value.Builder _builder;

        /* JADX INFO: compiled from: ValueKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Value.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Value.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Value.Builder builder, ck.i iVar) {
            this(builder);
        }

        public final /* synthetic */ Value _build() {
            Value valueBuild = this._builder.build();
            ck.p.i(valueBuild, "_builder.build()");
            return valueBuild;
        }

        public final void clearBoolValue() {
            this._builder.clearBoolValue();
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final void clearListValue() {
            this._builder.clearListValue();
        }

        public final void clearNullValue() {
            this._builder.clearNullValue();
        }

        public final void clearNumberValue() {
            this._builder.clearNumberValue();
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        public final void clearStructValue() {
            this._builder.clearStructValue();
        }

        public final boolean getBoolValue() {
            return this._builder.getBoolValue();
        }

        public final Value.KindCase getKindCase() {
            Value.KindCase kindCase = this._builder.getKindCase();
            ck.p.i(kindCase, "_builder.getKindCase()");
            return kindCase;
        }

        public final ListValue getListValue() {
            ListValue listValue = this._builder.getListValue();
            ck.p.i(listValue, "_builder.getListValue()");
            return listValue;
        }

        public final NullValue getNullValue() {
            NullValue nullValue = this._builder.getNullValue();
            ck.p.i(nullValue, "_builder.getNullValue()");
            return nullValue;
        }

        public final int getNullValueValue() {
            return this._builder.getNullValueValue();
        }

        public final double getNumberValue() {
            return this._builder.getNumberValue();
        }

        public final String getStringValue() {
            String stringValue = this._builder.getStringValue();
            ck.p.i(stringValue, "_builder.getStringValue()");
            return stringValue;
        }

        public final Struct getStructValue() {
            Struct structValue = this._builder.getStructValue();
            ck.p.i(structValue, "_builder.getStructValue()");
            return structValue;
        }

        public final boolean hasBoolValue() {
            return this._builder.hasBoolValue();
        }

        public final boolean hasListValue() {
            return this._builder.hasListValue();
        }

        public final boolean hasNullValue() {
            return this._builder.hasNullValue();
        }

        public final boolean hasNumberValue() {
            return this._builder.hasNumberValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        public final boolean hasStructValue() {
            return this._builder.hasStructValue();
        }

        public final void setBoolValue(boolean z10) {
            this._builder.setBoolValue(z10);
        }

        public final void setListValue(ListValue listValue) {
            ck.p.j(listValue, "value");
            this._builder.setListValue(listValue);
        }

        public final void setNullValue(NullValue nullValue) {
            ck.p.j(nullValue, "value");
            this._builder.setNullValue(nullValue);
        }

        public final void setNullValueValue(int i10) {
            this._builder.setNullValueValue(i10);
        }

        public final void setNumberValue(double d10) {
            this._builder.setNumberValue(d10);
        }

        public final void setStringValue(String str) {
            ck.p.j(str, "value");
            this._builder.setStringValue(str);
        }

        public final void setStructValue(Struct struct) {
            ck.p.j(struct, "value");
            this._builder.setStructValue(struct);
        }
    }

    private ValueKt() {
    }
}
