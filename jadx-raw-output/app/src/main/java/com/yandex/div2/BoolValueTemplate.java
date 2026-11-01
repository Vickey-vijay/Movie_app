package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: BoolValueTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class BoolValueTemplate implements JSONSerializable, JsonTemplate<BoolValue> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f45892b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, BoolValueTemplate> f45893c = new bk.p<ParsingEnvironment, JSONObject, BoolValueTemplate>() { // from class: com.yandex.div2.BoolValueTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final BoolValueTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new BoolValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Boolean>> f45894a;

    /* JADX INFO: compiled from: BoolValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public BoolValueTemplate(Field<Expression<Boolean>> field) {
        this.f45894a = field;
    }

    public /* synthetic */ BoolValueTemplate(ParsingEnvironment parsingEnvironment, BoolValueTemplate boolValueTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : boolValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().h().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public BoolValueTemplate(ParsingEnvironment parsingEnvironment, BoolValueTemplate boolValueTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
