package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSubmitTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivActionSubmitTemplate implements JSONSerializable, JsonTemplate<DivActionSubmit> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46304e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionSubmitTemplate> f46305f = new bk.p<ParsingEnvironment, JSONObject, DivActionSubmitTemplate>() { // from class: com.yandex.div2.DivActionSubmitTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionSubmitTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionSubmitTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<String>> f46306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f46307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f46308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<RequestTemplate> f46309d;

    /* JADX INFO: compiled from: DivActionSubmitTemplate.kt */
    public static final class RequestTemplate implements JSONSerializable, JsonTemplate<DivActionSubmit.Request> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f46310d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Expression<DivActionSubmit.Request.Method> f46311e = Expression.Companion.constant$default(Expression.Companion, DivActionSubmit.Request.Method.POST, null, 2, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, RequestTemplate> f46312f = new bk.p<ParsingEnvironment, JSONObject, RequestTemplate>() { // from class: com.yandex.div2.DivActionSubmitTemplate$RequestTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivActionSubmitTemplate.RequestTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivActionSubmitTemplate.RequestTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<List<HeaderTemplate>> f46313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<DivActionSubmit.Request.Method>> f46314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field<Expression<Uri>> f46315c;

        /* JADX INFO: compiled from: DivActionSubmitTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public RequestTemplate(Field<List<HeaderTemplate>> field, Field<Expression<DivActionSubmit.Request.Method>> field2, Field<Expression<Uri>> field3) {
            this.f46313a = field;
            this.f46314b = field2;
            this.f46315c = field3;
        }

        /* JADX INFO: compiled from: DivActionSubmitTemplate.kt */
        public static final class HeaderTemplate implements JSONSerializable, JsonTemplate<DivActionSubmit.Request.Header> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f46316c = new a(null);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final bk.p<ParsingEnvironment, JSONObject, HeaderTemplate> f46317d = new bk.p<ParsingEnvironment, JSONObject, HeaderTemplate>() { // from class: com.yandex.div2.DivActionSubmitTemplate$RequestTemplate$HeaderTemplate$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivActionSubmitTemplate.RequestTemplate.HeaderTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return new DivActionSubmitTemplate.RequestTemplate.HeaderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Field<Expression<String>> f46318a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Field<Expression<String>> f46319b;

            /* JADX INFO: compiled from: DivActionSubmitTemplate.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(ck.i iVar) {
                    this();
                }
            }

            public HeaderTemplate(Field<Expression<String>> field, Field<Expression<String>> field2) {
                this.f46318a = field;
                this.f46319b = field2;
            }

            @Override // com.yandex.div.json.JSONSerializable
            public JSONObject writeToJSON() {
                return BuiltInParserKt.getBuiltInParserComponent().Z0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }

            public /* synthetic */ HeaderTemplate(ParsingEnvironment parsingEnvironment, HeaderTemplate headerTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
                this(parsingEnvironment, (i10 & 2) != 0 ? null : headerTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public HeaderTemplate(ParsingEnvironment parsingEnvironment, HeaderTemplate headerTemplate, boolean z10, JSONObject jSONObject) {
                Field.Companion companion = Field.Companion;
                this(companion.nullField(false), companion.nullField(false));
                throw new UnsupportedOperationException("Do not use this constructor directly.");
            }
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().c1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ RequestTemplate(ParsingEnvironment parsingEnvironment, RequestTemplate requestTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : requestTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RequestTemplate(ParsingEnvironment parsingEnvironment, RequestTemplate requestTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    /* JADX INFO: compiled from: DivActionSubmitTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionSubmitTemplate(Field<Expression<String>> field, Field<List<DivActionTemplate>> field2, Field<List<DivActionTemplate>> field3, Field<RequestTemplate> field4) {
        this.f46306a = field;
        this.f46307b = field2;
        this.f46308c = field3;
        this.f46309d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().W0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivActionSubmitTemplate(ParsingEnvironment parsingEnvironment, DivActionSubmitTemplate divActionSubmitTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionSubmitTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionSubmitTemplate(ParsingEnvironment parsingEnvironment, DivActionSubmitTemplate divActionSubmitTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<String>>) companion.nullField(false), (Field<List<DivActionTemplate>>) companion.nullField(false), (Field<List<DivActionTemplate>>) companion.nullField(false), (Field<RequestTemplate>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
