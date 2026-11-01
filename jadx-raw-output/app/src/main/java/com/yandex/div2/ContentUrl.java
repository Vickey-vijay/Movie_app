package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: ContentUrl.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ContentUrl implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45927c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, ContentUrl> f45928d = new bk.p<ParsingEnvironment, JSONObject, ContentUrl>() { // from class: com.yandex.div2.ContentUrl$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ContentUrl mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ContentUrl.f45927c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Uri> f45929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f45930b;

    /* JADX INFO: compiled from: ContentUrl.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final ContentUrl a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().v().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(ContentUrl contentUrl, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (contentUrl == null) {
            return false;
        }
        return ck.p.e(this.f45929a.evaluate(expressionResolver), contentUrl.f45929a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f45930b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(ContentUrl.class).hashCode() + this.f45929a.hashCode();
        this.f45930b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public ContentUrl(Expression<Uri> expression) {
        this.f45929a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().v().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
