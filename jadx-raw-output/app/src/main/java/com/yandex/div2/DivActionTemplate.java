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

/* JADX INFO: compiled from: DivActionTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivActionTemplate implements JSONSerializable, JsonTemplate<DivAction> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f46320l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression<Boolean> f46321m = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionTemplate> f46322n = new bk.p<ParsingEnvironment, JSONObject, DivActionTemplate>() { // from class: com.yandex.div2.DivActionTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivDownloadCallbacksTemplate> f46323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Boolean>> f46324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<String>> f46325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Uri>> f46326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<List<MenuItemTemplate>> f46327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<JSONObject> f46328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<Uri>> f46329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<String> f46330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<Expression<DivAction.Target>> f46331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<DivActionTypedTemplate> f46332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<Expression<Uri>> f46333k;

    /* JADX INFO: compiled from: DivActionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionTemplate(Field<DivDownloadCallbacksTemplate> field, Field<Expression<Boolean>> field2, Field<Expression<String>> field3, Field<Expression<Uri>> field4, Field<List<MenuItemTemplate>> field5, Field<JSONObject> field6, Field<Expression<Uri>> field7, Field<String> field8, Field<Expression<DivAction.Target>> field9, Field<DivActionTypedTemplate> field10, Field<Expression<Uri>> field11) {
        this.f46323a = field;
        this.f46324b = field2;
        this.f46325c = field3;
        this.f46326d = field4;
        this.f46327e = field5;
        this.f46328f = field6;
        this.f46329g = field7;
        this.f46330h = field8;
        this.f46331i = field9;
        this.f46332j = field10;
        this.f46333k = field11;
    }

    /* JADX INFO: compiled from: DivActionTemplate.kt */
    public static final class MenuItemTemplate implements JSONSerializable, JsonTemplate<DivAction.MenuItem> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f46334d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, MenuItemTemplate> f46335e = new bk.p<ParsingEnvironment, JSONObject, MenuItemTemplate>() { // from class: com.yandex.div2.DivActionTemplate$MenuItemTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivActionTemplate.MenuItemTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivActionTemplate.MenuItemTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<DivActionTemplate> f46336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<List<DivActionTemplate>> f46337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field<Expression<String>> f46338c;

        /* JADX INFO: compiled from: DivActionTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public MenuItemTemplate(Field<DivActionTemplate> field, Field<List<DivActionTemplate>> field2, Field<Expression<String>> field3) {
            this.f46336a = field;
            this.f46337b = field2;
            this.f46338c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().y0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ MenuItemTemplate(ParsingEnvironment parsingEnvironment, MenuItemTemplate menuItemTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : menuItemTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public MenuItemTemplate(ParsingEnvironment parsingEnvironment, MenuItemTemplate menuItemTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().v0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivActionTemplate(ParsingEnvironment parsingEnvironment, DivActionTemplate divActionTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionTemplate(ParsingEnvironment parsingEnvironment, DivActionTemplate divActionTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
