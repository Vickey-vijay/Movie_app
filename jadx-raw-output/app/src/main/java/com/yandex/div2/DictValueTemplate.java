package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DictValueTemplate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DictValueTemplate implements JSONSerializable, JsonTemplate<DictValue> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f45938b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DictValueTemplate> f45939c = new bk.p<ParsingEnvironment, JSONObject, DictValueTemplate>() { // from class: com.yandex.div2.DictValueTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DictValueTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DictValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<JSONObject>> f45940a;

    /* JADX INFO: compiled from: DictValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DictValueTemplate(Field<Expression<JSONObject>> field) {
        this.f45940a = field;
    }

    public /* synthetic */ DictValueTemplate(ParsingEnvironment parsingEnvironment, DictValueTemplate dictValueTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : dictValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().z().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DictValueTemplate(ParsingEnvironment parsingEnvironment, DictValueTemplate dictValueTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
