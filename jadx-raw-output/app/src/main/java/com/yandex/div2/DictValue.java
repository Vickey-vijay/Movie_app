package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DictValue.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DictValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45934c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DictValue> f45935d = new bk.p<ParsingEnvironment, JSONObject, DictValue>() { // from class: com.yandex.div2.DictValue$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DictValue mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DictValue.f45934c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<JSONObject> f45936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f45937b;

    /* JADX INFO: compiled from: DictValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DictValue a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().y().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DictValue dictValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (dictValue == null) {
            return false;
        }
        return ck.p.e(this.f45936a.evaluate(expressionResolver), dictValue.f45936a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f45937b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DictValue.class).hashCode() + this.f45936a.hashCode();
        this.f45937b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DictValue(Expression<JSONObject> expression) {
        this.f45936a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().y().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
