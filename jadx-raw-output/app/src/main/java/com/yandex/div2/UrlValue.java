package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: UrlValue.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class UrlValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50534c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, UrlValue> f50535d = new bk.p<ParsingEnvironment, JSONObject, UrlValue>() { // from class: com.yandex.div2.UrlValue$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final UrlValue mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return UrlValue.f50534c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Uri> f50536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f50537b;

    /* JADX INFO: compiled from: UrlValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final UrlValue a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().ja().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(UrlValue urlValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (urlValue == null) {
            return false;
        }
        return ck.p.e(this.f50536a.evaluate(expressionResolver), urlValue.f50536a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50537b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(UrlValue.class).hashCode() + this.f50536a.hashCode();
        this.f50537b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public UrlValue(Expression<Uri> expression) {
        this.f50536a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().ja().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
