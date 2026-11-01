package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: ContentText.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ContentText implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45920c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, ContentText> f45921d = new bk.p<ParsingEnvironment, JSONObject, ContentText>() { // from class: com.yandex.div2.ContentText$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ContentText mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ContentText.f45920c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<String> f45922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f45923b;

    /* JADX INFO: compiled from: ContentText.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final ContentText a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().s().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(ContentText contentText, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (contentText == null) {
            return false;
        }
        return ck.p.e(this.f45922a.evaluate(expressionResolver), contentText.f45922a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f45923b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(ContentText.class).hashCode() + this.f45922a.hashCode();
        this.f45923b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public ContentText(Expression<String> expression) {
        this.f45922a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().s().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
