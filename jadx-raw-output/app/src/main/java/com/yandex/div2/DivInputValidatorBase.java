package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputValidatorBase.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivInputValidatorBase implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f47978e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression<Boolean> f47979f = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInputValidatorBase> f47980g = new bk.p<ParsingEnvironment, JSONObject, DivInputValidatorBase>() { // from class: com.yandex.div2.DivInputValidatorBase$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputValidatorBase mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivInputValidatorBase.f47978e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Boolean> f47981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<String> f47982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f47984d;

    public DivInputValidatorBase() {
        this(null, null, null, 7, null);
    }

    public DivInputValidatorBase(Expression<Boolean> expression, Expression<String> expression2, String str) {
        this.f47981a = expression;
        this.f47982b = expression2;
        this.f47983c = str;
    }

    /* JADX INFO: compiled from: DivInputValidatorBase.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivInputValidatorBase a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().B4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47984d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivInputValidatorBase.class).hashCode() + this.f47981a.hashCode();
        Expression<String> expression = this.f47982b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        String str = this.f47983c;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.f47984d = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().B4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivInputValidatorBase(Expression expression, Expression expression2, String str, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f47979f : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? null : str);
    }
}
