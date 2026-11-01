package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilterTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivInputFilterTemplate implements JSONSerializable, JsonTemplate<DivInputFilter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47875a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInputFilterTemplate> f47876b = new bk.p<ParsingEnvironment, JSONObject, DivInputFilterTemplate>() { // from class: com.yandex.div2.DivInputFilterTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputFilterTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivInputFilterTemplate.a.b(DivInputFilterTemplate.f47875a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivInputFilterTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivInputFilterTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivInputFilterTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().n4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivInputFilterTemplate.kt */
    public static final class b extends DivInputFilterTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivInputFilterExpressionTemplate f47877c;

        public b(DivInputFilterExpressionTemplate divInputFilterExpressionTemplate) {
            super(null);
            this.f47877c = divInputFilterExpressionTemplate;
        }

        public final DivInputFilterExpressionTemplate b() {
            return this.f47877c;
        }
    }

    /* JADX INFO: compiled from: DivInputFilterTemplate.kt */
    public static final class c extends DivInputFilterTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivInputFilterRegexTemplate f47878c;

        public c(DivInputFilterRegexTemplate divInputFilterRegexTemplate) {
            super(null);
            this.f47878c = divInputFilterRegexTemplate;
        }

        public final DivInputFilterRegexTemplate b() {
            return this.f47878c;
        }
    }

    public DivInputFilterTemplate() {
    }

    public /* synthetic */ DivInputFilterTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof c) {
            return "regex";
        }
        if (this instanceof b) {
            return "expression";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().n4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
