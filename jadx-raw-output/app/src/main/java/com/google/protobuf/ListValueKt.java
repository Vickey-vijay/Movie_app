package com.google.protobuf;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* JADX INFO: compiled from: ListValueKt.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ListValueKt {
    public static final ListValueKt INSTANCE = new ListValueKt();

    /* JADX INFO: compiled from: ListValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ListValue.Builder _builder;

        /* JADX INFO: compiled from: ListValueKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ListValue.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(ListValue.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(ListValue.Builder builder, ck.i iVar) {
            this(builder);
        }

        /* JADX INFO: compiled from: ListValueKt.kt */
        public static final class ValuesProxy extends DslProxy {
            private ValuesProxy() {
            }
        }

        public final /* synthetic */ ListValue _build() {
            ListValue listValueBuild = this._builder.build();
            ck.p.i(listValueBuild, "_builder.build()");
            return listValueBuild;
        }

        public final /* synthetic */ void addAllValues(DslList dslList, Iterable iterable) {
            ck.p.j(dslList, "<this>");
            ck.p.j(iterable, "values");
            this._builder.addAllValues(iterable);
        }

        public final /* synthetic */ void addValues(DslList dslList, Value value) {
            ck.p.j(dslList, "<this>");
            ck.p.j(value, "value");
            this._builder.addValues(value);
        }

        public final /* synthetic */ void clearValues(DslList dslList) {
            ck.p.j(dslList, "<this>");
            this._builder.clearValues();
        }

        public final /* synthetic */ DslList getValues() {
            List<Value> valuesList = this._builder.getValuesList();
            ck.p.i(valuesList, "_builder.getValuesList()");
            return new DslList(valuesList);
        }

        public final /* synthetic */ void plusAssignAllValues(DslList<Value, ValuesProxy> dslList, Iterable<Value> iterable) {
            ck.p.j(dslList, "<this>");
            ck.p.j(iterable, "values");
            addAllValues(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignValues(DslList<Value, ValuesProxy> dslList, Value value) {
            ck.p.j(dslList, "<this>");
            ck.p.j(value, "value");
            addValues(dslList, value);
        }

        public final /* synthetic */ void setValues(DslList dslList, int i10, Value value) {
            ck.p.j(dslList, "<this>");
            ck.p.j(value, "value");
            this._builder.setValues(i10, value);
        }
    }

    private ListValueKt() {
    }
}
