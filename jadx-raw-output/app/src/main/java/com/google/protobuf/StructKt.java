package com.google.protobuf;

import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.C3426d4;
import java.util.Map;

/* JADX INFO: compiled from: StructKt.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class StructKt {
    public static final StructKt INSTANCE = new StructKt();

    /* JADX INFO: compiled from: StructKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Struct.Builder _builder;

        /* JADX INFO: compiled from: StructKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Struct.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Struct.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Struct.Builder builder, ck.i iVar) {
            this(builder);
        }

        /* JADX INFO: compiled from: StructKt.kt */
        public static final class FieldsProxy extends DslProxy {
            private FieldsProxy() {
            }
        }

        public final /* synthetic */ Struct _build() {
            Struct structBuild = this._builder.build();
            ck.p.i(structBuild, "_builder.build()");
            return structBuild;
        }

        public final /* synthetic */ void clearFields(DslMap dslMap) {
            ck.p.j(dslMap, "<this>");
            this._builder.clearFields();
        }

        public final /* synthetic */ DslMap getFieldsMap() {
            Map<String, Value> fieldsMap = this._builder.getFieldsMap();
            ck.p.i(fieldsMap, "_builder.getFieldsMap()");
            return new DslMap(fieldsMap);
        }

        public final /* synthetic */ void putAllFields(DslMap dslMap, Map map) {
            ck.p.j(dslMap, "<this>");
            ck.p.j(map, "map");
            this._builder.putAllFields(map);
        }

        public final void putFields(DslMap<String, Value, FieldsProxy> dslMap, String str, Value value) {
            ck.p.j(dslMap, "<this>");
            ck.p.j(str, C3426d4.i.W);
            ck.p.j(value, "value");
            this._builder.putFields(str, value);
        }

        public final /* synthetic */ void removeFields(DslMap dslMap, String str) {
            ck.p.j(dslMap, "<this>");
            ck.p.j(str, C3426d4.i.W);
            this._builder.removeFields(str);
        }

        public final /* synthetic */ void setFields(DslMap<String, Value, FieldsProxy> dslMap, String str, Value value) {
            ck.p.j(dslMap, "<this>");
            ck.p.j(str, C3426d4.i.W);
            ck.p.j(value, "value");
            putFields(dslMap, str, value);
        }
    }

    private StructKt() {
    }
}
