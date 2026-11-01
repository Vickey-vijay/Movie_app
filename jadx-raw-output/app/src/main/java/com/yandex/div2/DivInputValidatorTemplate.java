package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputValidatorTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivInputValidatorTemplate implements JSONSerializable, JsonTemplate<DivInputValidator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48021a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInputValidatorTemplate> f48022b = new bk.p<ParsingEnvironment, JSONObject, DivInputValidatorTemplate>() { // from class: com.yandex.div2.DivInputValidatorTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputValidatorTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivInputValidatorTemplate.a.b(DivInputValidatorTemplate.f48021a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivInputValidatorTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivInputValidatorTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivInputValidatorTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().H4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorTemplate.kt */
    public static final class b extends DivInputValidatorTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivInputValidatorExpressionTemplate f48023c;

        public b(DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate) {
            super(null);
            this.f48023c = divInputValidatorExpressionTemplate;
        }

        public final DivInputValidatorExpressionTemplate b() {
            return this.f48023c;
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorTemplate.kt */
    public static final class c extends DivInputValidatorTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivInputValidatorRegexTemplate f48024c;

        public c(DivInputValidatorRegexTemplate divInputValidatorRegexTemplate) {
            super(null);
            this.f48024c = divInputValidatorRegexTemplate;
        }

        public final DivInputValidatorRegexTemplate b() {
            return this.f48024c;
        }
    }

    public DivInputValidatorTemplate() {
    }

    public /* synthetic */ DivInputValidatorTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof c) {
            return "regex";
        }
        if (this instanceof b) {
            return "expression";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().H4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
