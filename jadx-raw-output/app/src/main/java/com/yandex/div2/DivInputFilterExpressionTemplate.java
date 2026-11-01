package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilterExpressionTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivInputFilterExpressionTemplate implements JSONSerializable, JsonTemplate<DivInputFilterExpression> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47865b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInputFilterExpressionTemplate> f47866c = new bk.p<ParsingEnvironment, JSONObject, DivInputFilterExpressionTemplate>() { // from class: com.yandex.div2.DivInputFilterExpressionTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputFilterExpressionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivInputFilterExpressionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Boolean>> f47867a;

    /* JADX INFO: compiled from: DivInputFilterExpressionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivInputFilterExpressionTemplate(Field<Expression<Boolean>> field) {
        this.f47867a = field;
    }

    public /* synthetic */ DivInputFilterExpressionTemplate(ParsingEnvironment parsingEnvironment, DivInputFilterExpressionTemplate divInputFilterExpressionTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divInputFilterExpressionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().k4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivInputFilterExpressionTemplate(ParsingEnvironment parsingEnvironment, DivInputFilterExpressionTemplate divInputFilterExpressionTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
