package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionHideTooltip.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionHideTooltip implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46166c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionHideTooltip> f46167d = new bk.p<ParsingEnvironment, JSONObject, DivActionHideTooltip>() { // from class: com.yandex.div2.DivActionHideTooltip$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionHideTooltip mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionHideTooltip.f46166c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<String> f46168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f46169b;

    /* JADX INFO: compiled from: DivActionHideTooltip.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionHideTooltip a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().r0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivActionHideTooltip divActionHideTooltip, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionHideTooltip == null) {
            return false;
        }
        return ck.p.e(this.f46168a.evaluate(expressionResolver), divActionHideTooltip.f46168a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46169b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionHideTooltip.class).hashCode() + this.f46168a.hashCode();
        this.f46169b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivActionHideTooltip(Expression<String> expression) {
        this.f46168a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().r0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
