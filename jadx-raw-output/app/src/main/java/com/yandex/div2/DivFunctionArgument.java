package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFunctionArgument.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivFunctionArgument implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f47240d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFunctionArgument> f47241e = new bk.p<ParsingEnvironment, JSONObject, DivFunctionArgument>() { // from class: com.yandex.div2.DivFunctionArgument$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFunctionArgument mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivFunctionArgument.f47240d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivEvaluableType f47243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f47244c;

    public final boolean a(DivFunctionArgument divFunctionArgument, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divFunctionArgument != null && ck.p.e(this.f47242a, divFunctionArgument.f47242a) && this.f47243b == divFunctionArgument.f47243b;
    }

    /* JADX INFO: compiled from: DivFunctionArgument.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivFunctionArgument a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().F3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47244c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivFunctionArgument.class).hashCode() + this.f47242a.hashCode() + this.f47243b.hashCode();
        this.f47244c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivFunctionArgument(String str, DivEvaluableType divEvaluableType) {
        this.f47242a = str;
        this.f47243b = divEvaluableType;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().F3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
