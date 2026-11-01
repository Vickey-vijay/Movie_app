package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFocusTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivFocusTemplate implements JSONSerializable, JsonTemplate<DivFocus> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f47218f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFocusTemplate> f47219g = new bk.p<ParsingEnvironment, JSONObject, DivFocusTemplate>() { // from class: com.yandex.div2.DivFocusTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFocusTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivFocusTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f47220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivBorderTemplate> f47221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<NextFocusIdsTemplate> f47222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47224e;

    /* JADX INFO: compiled from: DivFocusTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivFocusTemplate(Field<List<DivBackgroundTemplate>> field, Field<DivBorderTemplate> field2, Field<NextFocusIdsTemplate> field3, Field<List<DivActionTemplate>> field4, Field<List<DivActionTemplate>> field5) {
        this.f47220a = field;
        this.f47221b = field2;
        this.f47222c = field3;
        this.f47223d = field4;
        this.f47224e = field5;
    }

    /* JADX INFO: compiled from: DivFocusTemplate.kt */
    public static final class NextFocusIdsTemplate implements JSONSerializable, JsonTemplate<DivFocus.NextFocusIds> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f47225f = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, NextFocusIdsTemplate> f47226g = new bk.p<ParsingEnvironment, JSONObject, NextFocusIdsTemplate>() { // from class: com.yandex.div2.DivFocusTemplate$NextFocusIdsTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivFocusTemplate.NextFocusIdsTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivFocusTemplate.NextFocusIdsTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<Expression<String>> f47227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<String>> f47228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field<Expression<String>> f47229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Field<Expression<String>> f47230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Field<Expression<String>> f47231e;

        /* JADX INFO: compiled from: DivFocusTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public NextFocusIdsTemplate(Field<Expression<String>> field, Field<Expression<String>> field2, Field<Expression<String>> field3, Field<Expression<String>> field4, Field<Expression<String>> field5) {
            this.f47227a = field;
            this.f47228b = field2;
            this.f47229c = field3;
            this.f47230d = field4;
            this.f47231e = field5;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().D3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ NextFocusIdsTemplate(ParsingEnvironment parsingEnvironment, NextFocusIdsTemplate nextFocusIdsTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : nextFocusIdsTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public NextFocusIdsTemplate(ParsingEnvironment parsingEnvironment, NextFocusIdsTemplate nextFocusIdsTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().A3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivFocusTemplate(ParsingEnvironment parsingEnvironment, DivFocusTemplate divFocusTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divFocusTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivFocusTemplate(ParsingEnvironment parsingEnvironment, DivFocusTemplate divFocusTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
