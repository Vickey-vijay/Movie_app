package com.google.protobuf;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* JADX INFO: compiled from: TypeKt.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class TypeKt {
    public static final TypeKt INSTANCE = new TypeKt();

    /* JADX INFO: compiled from: TypeKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Type.Builder _builder;

        /* JADX INFO: compiled from: TypeKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Type.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Type.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Type.Builder builder, ck.i iVar) {
            this(builder);
        }

        /* JADX INFO: compiled from: TypeKt.kt */
        public static final class FieldsProxy extends DslProxy {
            private FieldsProxy() {
            }
        }

        /* JADX INFO: compiled from: TypeKt.kt */
        public static final class OneofsProxy extends DslProxy {
            private OneofsProxy() {
            }
        }

        /* JADX INFO: compiled from: TypeKt.kt */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public final /* synthetic */ Type _build() {
            Type typeBuild = this._builder.build();
            ck.p.i(typeBuild, "_builder.build()");
            return typeBuild;
        }

        public final /* synthetic */ void addAllFields(DslList dslList, Iterable iterable) {
            ck.p.j(dslList, "<this>");
            ck.p.j(iterable, "values");
            this._builder.addAllFields(iterable);
        }

        public final /* synthetic */ void addAllOneofs(DslList dslList, Iterable iterable) {
            ck.p.j(dslList, "<this>");
            ck.p.j(iterable, "values");
            this._builder.addAllOneofs(iterable);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            ck.p.j(dslList, "<this>");
            ck.p.j(iterable, "values");
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addFields(DslList dslList, Field field) {
            ck.p.j(dslList, "<this>");
            ck.p.j(field, "value");
            this._builder.addFields(field);
        }

        public final /* synthetic */ void addOneofs(DslList dslList, String str) {
            ck.p.j(dslList, "<this>");
            ck.p.j(str, "value");
            this._builder.addOneofs(str);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            ck.p.j(dslList, "<this>");
            ck.p.j(option, "value");
            this._builder.addOptions(option);
        }

        public final void clearEdition() {
            this._builder.clearEdition();
        }

        public final /* synthetic */ void clearFields(DslList dslList) {
            ck.p.j(dslList, "<this>");
            this._builder.clearFields();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOneofs(DslList dslList) {
            ck.p.j(dslList, "<this>");
            this._builder.clearOneofs();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            ck.p.j(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        public final String getEdition() {
            String edition = this._builder.getEdition();
            ck.p.i(edition, "_builder.getEdition()");
            return edition;
        }

        public final /* synthetic */ DslList getFields() {
            List<Field> fieldsList = this._builder.getFieldsList();
            ck.p.i(fieldsList, "_builder.getFieldsList()");
            return new DslList(fieldsList);
        }

        public final String getName() {
            String name = this._builder.getName();
            ck.p.i(name, "_builder.getName()");
            return name;
        }

        public final DslList<String, OneofsProxy> getOneofs() {
            List<String> oneofsList = this._builder.getOneofsList();
            ck.p.i(oneofsList, "_builder.getOneofsList()");
            return new DslList<>(oneofsList);
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            ck.p.i(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final SourceContext getSourceContext() {
            SourceContext sourceContext = this._builder.getSourceContext();
            ck.p.i(sourceContext, "_builder.getSourceContext()");
            return sourceContext;
        }

        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            ck.p.i(syntax, "_builder.getSyntax()");
            return syntax;
        }

        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final /* synthetic */ void plusAssignAllFields(DslList<Field, FieldsProxy> dslList, Iterable<Field> iterable) {
            ck.p.j(dslList, "<this>");
            ck.p.j(iterable, "values");
            addAllFields(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOneofs(DslList<String, OneofsProxy> dslList, Iterable<String> iterable) {
            ck.p.j(dslList, "<this>");
            ck.p.j(iterable, "values");
            addAllOneofs(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> iterable) {
            ck.p.j(dslList, "<this>");
            ck.p.j(iterable, "values");
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignFields(DslList<Field, FieldsProxy> dslList, Field field) {
            ck.p.j(dslList, "<this>");
            ck.p.j(field, "value");
            addFields(dslList, field);
        }

        public final /* synthetic */ void plusAssignOneofs(DslList<String, OneofsProxy> dslList, String str) {
            ck.p.j(dslList, "<this>");
            ck.p.j(str, "value");
            addOneofs(dslList, str);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option option) {
            ck.p.j(dslList, "<this>");
            ck.p.j(option, "value");
            addOptions(dslList, option);
        }

        public final void setEdition(String str) {
            ck.p.j(str, "value");
            this._builder.setEdition(str);
        }

        public final /* synthetic */ void setFields(DslList dslList, int i10, Field field) {
            ck.p.j(dslList, "<this>");
            ck.p.j(field, "value");
            this._builder.setFields(i10, field);
        }

        public final void setName(String str) {
            ck.p.j(str, "value");
            this._builder.setName(str);
        }

        public final /* synthetic */ void setOneofs(DslList dslList, int i10, String str) {
            ck.p.j(dslList, "<this>");
            ck.p.j(str, "value");
            this._builder.setOneofs(i10, str);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i10, Option option) {
            ck.p.j(dslList, "<this>");
            ck.p.j(option, "value");
            this._builder.setOptions(i10, option);
        }

        public final void setSourceContext(SourceContext sourceContext) {
            ck.p.j(sourceContext, "value");
            this._builder.setSourceContext(sourceContext);
        }

        public final void setSyntax(Syntax syntax) {
            ck.p.j(syntax, "value");
            this._builder.setSyntax(syntax);
        }

        public final void setSyntaxValue(int i10) {
            this._builder.setSyntaxValue(i10);
        }
    }

    private TypeKt() {
    }
}
