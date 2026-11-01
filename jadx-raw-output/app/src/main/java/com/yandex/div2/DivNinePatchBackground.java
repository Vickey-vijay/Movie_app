package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNinePatchBackground.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivNinePatchBackground implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48075d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivNinePatchBackground> f48076e = new bk.p<ParsingEnvironment, JSONObject, DivNinePatchBackground>() { // from class: com.yandex.div2.DivNinePatchBackground$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivNinePatchBackground mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivNinePatchBackground.f48075d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Uri> f48077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivAbsoluteEdgeInsets f48078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f48079c;

    public final boolean a(DivNinePatchBackground divNinePatchBackground, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divNinePatchBackground != null && ck.p.e(this.f48077a.evaluate(expressionResolver), divNinePatchBackground.f48077a.evaluate(expressionResolver2)) && this.f48078b.a(divNinePatchBackground.f48078b, expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivNinePatchBackground.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivNinePatchBackground a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().e5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48079c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivNinePatchBackground.class).hashCode() + this.f48077a.hashCode() + this.f48078b.hash();
        this.f48079c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivNinePatchBackground(Expression<Uri> expression, DivAbsoluteEdgeInsets divAbsoluteEdgeInsets) {
        this.f48077a = expression;
        this.f48078b = divAbsoluteEdgeInsets;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
