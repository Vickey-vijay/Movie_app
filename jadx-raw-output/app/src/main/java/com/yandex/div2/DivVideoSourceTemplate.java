package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVideoSourceTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivVideoSourceTemplate implements JSONSerializable, JsonTemplate<DivVideoSource> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f50045e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivVideoSourceTemplate> f50046f = new bk.p<ParsingEnvironment, JSONObject, DivVideoSourceTemplate>() { // from class: com.yandex.div2.DivVideoSourceTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivVideoSourceTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivVideoSourceTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f50047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<String>> f50048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<ResolutionTemplate> f50049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Uri>> f50050d;

    /* JADX INFO: compiled from: DivVideoSourceTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivVideoSourceTemplate(Field<Expression<Long>> field, Field<Expression<String>> field2, Field<ResolutionTemplate> field3, Field<Expression<Uri>> field4) {
        this.f50047a = field;
        this.f50048b = field2;
        this.f50049c = field3;
        this.f50050d = field4;
    }

    /* JADX INFO: compiled from: DivVideoSourceTemplate.kt */
    public static final class ResolutionTemplate implements JSONSerializable, JsonTemplate<DivVideoSource.Resolution> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f50051c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, ResolutionTemplate> f50052d = new bk.p<ParsingEnvironment, JSONObject, ResolutionTemplate>() { // from class: com.yandex.div2.DivVideoSourceTemplate$ResolutionTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivVideoSourceTemplate.ResolutionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivVideoSourceTemplate.ResolutionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<Expression<Long>> f50053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<Long>> f50054b;

        /* JADX INFO: compiled from: DivVideoSourceTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public ResolutionTemplate(Field<Expression<Long>> field, Field<Expression<Long>> field2) {
            this.f50053a = field;
            this.f50054b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().u9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ ResolutionTemplate(ParsingEnvironment parsingEnvironment, ResolutionTemplate resolutionTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : resolutionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ResolutionTemplate(ParsingEnvironment parsingEnvironment, ResolutionTemplate resolutionTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().r9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivVideoSourceTemplate(ParsingEnvironment parsingEnvironment, DivVideoSourceTemplate divVideoSourceTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divVideoSourceTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivVideoSourceTemplate(ParsingEnvironment parsingEnvironment, DivVideoSourceTemplate divVideoSourceTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Long>>) companion.nullField(false), (Field<Expression<String>>) companion.nullField(false), (Field<ResolutionTemplate>) companion.nullField(false), (Field<Expression<Uri>>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
