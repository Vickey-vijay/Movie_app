package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: UrlVariable.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class UrlVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f50541d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, UrlVariable> f50542e = new bk.p<ParsingEnvironment, JSONObject, UrlVariable>() { // from class: com.yandex.div2.UrlVariable$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final UrlVariable mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return UrlVariable.f50541d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Uri> f50544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f50545c;

    public final boolean a(UrlVariable urlVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return urlVariable != null && ck.p.e(this.f50543a, urlVariable.f50543a) && ck.p.e(this.f50544b.evaluate(expressionResolver), urlVariable.f50544b.evaluate(expressionResolver2));
    }

    /* JADX INFO: compiled from: UrlVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final UrlVariable a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().ma().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50545c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(UrlVariable.class).hashCode() + this.f50543a.hashCode() + this.f50544b.hashCode();
        this.f50545c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public UrlVariable(String str, Expression<Uri> expression) {
        this.f50543a = str;
        this.f50544b = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().ma().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
