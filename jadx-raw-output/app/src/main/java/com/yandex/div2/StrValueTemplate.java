package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: StrValueTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class StrValueTemplate implements JSONSerializable, JsonTemplate<StrValue> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50522b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, StrValueTemplate> f50523c = new bk.p<ParsingEnvironment, JSONObject, StrValueTemplate>() { // from class: com.yandex.div2.StrValueTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final StrValueTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new StrValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<String>> f50524a;

    /* JADX INFO: compiled from: StrValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public StrValueTemplate(Field<Expression<String>> field) {
        this.f50524a = field;
    }

    public /* synthetic */ StrValueTemplate(ParsingEnvironment parsingEnvironment, StrValueTemplate strValueTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : strValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().ea().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public StrValueTemplate(ParsingEnvironment parsingEnvironment, StrValueTemplate strValueTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
