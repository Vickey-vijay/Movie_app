package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionFocusElement.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivActionFocusElement implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46159c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionFocusElement> f46160d = new bk.p<ParsingEnvironment, JSONObject, DivActionFocusElement>() { // from class: com.yandex.div2.DivActionFocusElement$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionFocusElement mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionFocusElement.f46159c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<String> f46161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f46162b;

    /* JADX INFO: compiled from: DivActionFocusElement.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionFocusElement a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().o0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivActionFocusElement divActionFocusElement, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionFocusElement == null) {
            return false;
        }
        return ck.p.e(this.f46161a.evaluate(expressionResolver), divActionFocusElement.f46161a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46162b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionFocusElement.class).hashCode() + this.f46161a.hashCode();
        this.f46162b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivActionFocusElement(Expression<String> expression) {
        this.f46161a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().o0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
