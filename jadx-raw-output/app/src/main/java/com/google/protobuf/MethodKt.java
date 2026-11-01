package com.google.protobuf;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* JADX INFO: compiled from: MethodKt.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MethodKt {
    public static final MethodKt INSTANCE = new MethodKt();

    /* JADX INFO: compiled from: MethodKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Method.Builder _builder;

        /* JADX INFO: compiled from: MethodKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Method.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Method.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Method.Builder builder, ck.i iVar) {
            this(builder);
        }

        /* JADX INFO: compiled from: MethodKt.kt */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public final /* synthetic */ Method _build() {
            Method methodBuild = this._builder.build();
            ck.p.i(methodBuild, "_builder.build()");
            return methodBuild;
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            ck.p.j(dslList, "<this>");
            ck.p.j(iterable, "values");
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            ck.p.j(dslList, "<this>");
            ck.p.j(option, "value");
            this._builder.addOptions(option);
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            ck.p.j(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearRequestStreaming() {
            this._builder.clearRequestStreaming();
        }

        public final void clearRequestTypeUrl() {
            this._builder.clearRequestTypeUrl();
        }

        public final void clearResponseStreaming() {
            this._builder.clearResponseStreaming();
        }

        public final void clearResponseTypeUrl() {
            this._builder.clearResponseTypeUrl();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        public final String getName() {
            String name = this._builder.getName();
            ck.p.i(name, "_builder.getName()");
            return name;
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            ck.p.i(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final boolean getRequestStreaming() {
            return this._builder.getRequestStreaming();
        }

        public final String getRequestTypeUrl() {
            String requestTypeUrl = this._builder.getRequestTypeUrl();
            ck.p.i(requestTypeUrl, "_builder.getRequestTypeUrl()");
            return requestTypeUrl;
        }

        public final boolean getResponseStreaming() {
            return this._builder.getResponseStreaming();
        }

        public final String getResponseTypeUrl() {
            String responseTypeUrl = this._builder.getResponseTypeUrl();
            ck.p.i(responseTypeUrl, "_builder.getResponseTypeUrl()");
            return responseTypeUrl;
        }

        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            ck.p.i(syntax, "_builder.getSyntax()");
            return syntax;
        }

        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> iterable) {
            ck.p.j(dslList, "<this>");
            ck.p.j(iterable, "values");
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option option) {
            ck.p.j(dslList, "<this>");
            ck.p.j(option, "value");
            addOptions(dslList, option);
        }

        public final void setName(String str) {
            ck.p.j(str, "value");
            this._builder.setName(str);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i10, Option option) {
            ck.p.j(dslList, "<this>");
            ck.p.j(option, "value");
            this._builder.setOptions(i10, option);
        }

        public final void setRequestStreaming(boolean z10) {
            this._builder.setRequestStreaming(z10);
        }

        public final void setRequestTypeUrl(String str) {
            ck.p.j(str, "value");
            this._builder.setRequestTypeUrl(str);
        }

        public final void setResponseStreaming(boolean z10) {
            this._builder.setResponseStreaming(z10);
        }

        public final void setResponseTypeUrl(String str) {
            ck.p.j(str, "value");
            this._builder.setResponseTypeUrl(str);
        }

        public final void setSyntax(Syntax syntax) {
            ck.p.j(syntax, "value");
            this._builder.setSyntax(syntax);
        }

        public final void setSyntaxValue(int i10) {
            this._builder.setSyntaxValue(i10);
        }
    }

    private MethodKt() {
    }
}
